package com.mirrativ.llstream.decoder;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.util.Log;
import android.view.Choreographer;
import android.view.Surface;
import ao.g;
import com.mirrativ.llstream.NamedThreadFactory;
import com.mirrativ.llstream.protocol.v1.topic.Extend;
import io.l;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import jo.h;
import jo.p;
import po.n;
import uo.d2;
import uo.g1;
import uo.p0;
import uo.q0;
import uo.r0;
import uo.s1;
import uo.u1;
import wn.r;
import wn.v;

/* loaded from: classes4.dex */
public final class AVCDecoder implements Choreographer.FrameCallback {
    public static final Companion Companion = new Companion(null);
    private static final byte SPS_PROFILE_LEVEL3_0 = 30;
    private static final byte SPS_PROFILE_LEVEL3_1 = 31;
    private static final String TAG = "AVCDecoder";
    private long bufferRecoveryCount;
    private AVCDecoderCallback callback;
    private Choreographer choreographer;
    private final JitterCoordinator coordinator;
    private final q0 coroutineScope;
    private final g decodeContext;
    private final s1 decodeDispatcher;
    private d2 decodeJob;
    private final PriorityBlockingQueue<AVCPacket> decodeQueue;
    private final AtomicBoolean decoding;
    private final l<AVCPacket, Boolean> filterIDR;
    private final l<AVCPacket, Boolean> filterNAPacket;
    private final AtomicLong fps;
    private final AtomicLong frameIndex;
    private boolean initIDR;
    private boolean initialized;
    private MediaCodec mediaCodec;
    private MediaFormat outputFormat;
    private final VideoDecodeParams params;
    private byte[] pps;
    private final AtomicLong previousRender;
    private final AtomicLong previousTimestamp;
    private final PriorityBlockingQueue<AVCPacket> queue;
    private final g renderContext;
    private final s1 renderDispatcher;
    private final LinkedBlockingQueue<RenderTiming> renderQueue;
    private boolean scheduleResetBuffer;
    private byte[] sps;
    private final Surface surface;
    private LinkedBlockingQueue<Long> timestamps;

    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(h hVar) {
            this();
        }

        public final void avccToAnnexB(ByteBuffer byteBuffer) {
            p.h(byteBuffer, "buf");
            try {
                byteBuffer.position(0);
                int capacity = byteBuffer.capacity();
                while (capacity > 0) {
                    int position = byteBuffer.position();
                    if ((byteBuffer.capacity() - 1) - byteBuffer.position() < 4) {
                        break;
                    }
                    int i10 = byteBuffer.getInt(byteBuffer.position());
                    byteBuffer.put(new byte[]{0, 0, 0, 1});
                    if (byteBuffer.position() + i10 < byteBuffer.capacity()) {
                        byteBuffer.position(byteBuffer.position() + i10);
                        capacity -= byteBuffer.position() - position;
                    } else {
                        capacity = 0;
                    }
                }
                byteBuffer.position(byteBuffer.capacity() - 1);
            } catch (IllegalArgumentException e10) {
                StringBuilder a10 = a.a("Failed to convert AVCC to AnnexB. ");
                a10.append(e10.getLocalizedMessage());
                Log.e(AVCDecoder.TAG, a10.toString());
            }
        }
    }

    /* loaded from: classes4.dex */
    public static final class RenderTiming {
        private long delay;
        private final int index;
        private final long pts;

        public RenderTiming(long j10, int i10, long j11) {
            this.pts = j10;
            this.index = i10;
            this.delay = j11;
        }

        public static /* synthetic */ RenderTiming copy$default(RenderTiming renderTiming, long j10, int i10, long j11, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                j10 = renderTiming.pts;
            }
            long j12 = j10;
            if ((i11 & 2) != 0) {
                i10 = renderTiming.index;
            }
            int i12 = i10;
            if ((i11 & 4) != 0) {
                j11 = renderTiming.delay;
            }
            return renderTiming.copy(j12, i12, j11);
        }

        public final long component1() {
            return this.pts;
        }

        public final int component2() {
            return this.index;
        }

        public final long component3() {
            return this.delay;
        }

        public final RenderTiming copy(long j10, int i10, long j11) {
            return new RenderTiming(j10, i10, j11);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof RenderTiming) {
                RenderTiming renderTiming = (RenderTiming) obj;
                return this.pts == renderTiming.pts && this.index == renderTiming.index && this.delay == renderTiming.delay;
            }
            return false;
        }

        public final long getDelay() {
            return this.delay;
        }

        public final int getIndex() {
            return this.index;
        }

        public final long getPts() {
            return this.pts;
        }

        public int hashCode() {
            int hashCode = Integer.hashCode(this.index);
            return Long.hashCode(this.delay) + ((hashCode + (Long.hashCode(this.pts) * 31)) * 31);
        }

        public final void setDelay(long j10) {
            this.delay = j10;
        }

        public String toString() {
            StringBuilder a10 = a.a("RenderTiming(pts=");
            a10.append(this.pts);
            a10.append(", index=");
            a10.append(this.index);
            a10.append(", delay=");
            a10.append(this.delay);
            a10.append(')');
            return a10.toString();
        }
    }

    /* loaded from: classes4.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Extend.values().length];
            iArr[Extend.AVC_IDR.ordinal()] = 1;
            iArr[Extend.AVC_NDR.ordinal()] = 2;
            iArr[Extend.AVC_SPS.ordinal()] = 3;
            iArr[Extend.AVC_PPS.ordinal()] = 4;
            iArr[Extend.AVC_SEI.ordinal()] = 5;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public AVCDecoder(JitterCoordinator jitterCoordinator, Surface surface, VideoDecodeParams videoDecodeParams, q0 q0Var) {
        p.h(jitterCoordinator, "coordinator");
        p.h(surface, "surface");
        p.h(videoDecodeParams, "params");
        p.h(q0Var, "coroutineScope");
        this.coordinator = jitterCoordinator;
        this.surface = surface;
        this.params = videoDecodeParams;
        this.coroutineScope = q0Var;
        this.sps = new byte[0];
        this.pps = new byte[0];
        this.fps = new AtomicLong(30L);
        this.previousTimestamp = new AtomicLong(0L);
        this.previousRender = new AtomicLong(0L);
        this.queue = new PriorityBlockingQueue<>();
        this.decodeQueue = new PriorityBlockingQueue<>();
        this.renderQueue = new LinkedBlockingQueue<>();
        this.timestamps = new LinkedBlockingQueue<>();
        this.decoding = new AtomicBoolean(false);
        this.frameIndex = new AtomicLong(0L);
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(new NamedThreadFactory("AVCDecoderDecode"));
        p.g(newSingleThreadExecutor, "newSingleThreadExecutor(…tory(\"AVCDecoderDecode\"))");
        s1 a10 = u1.a(newSingleThreadExecutor);
        this.decodeDispatcher = a10;
        ExecutorService newSingleThreadExecutor2 = Executors.newSingleThreadExecutor(new NamedThreadFactory("AVCDecoderRender"));
        p.g(newSingleThreadExecutor2, "newSingleThreadExecutor(…tory(\"AVCDecoderRender\"))");
        s1 a11 = u1.a(newSingleThreadExecutor2);
        this.renderDispatcher = a11;
        this.decodeContext = a10.plus(new p0("llstream.video.decode"));
        this.renderContext = a11.plus(new p0("llstream.video.render"));
        this.filterNAPacket = new AVCDecoder$filterNAPacket$1(this);
        this.filterIDR = new AVCDecoder$filterIDR$1(this);
    }

    private final long calcPreferredFPSFromActualPacketRate(List<AVCPacket> list) {
        for (AVCPacket aVCPacket : list) {
            this.timestamps.add(Long.valueOf(aVCPacket.getTimestamp()));
        }
        while (this.timestamps.size() > this.params.getMaxTimestampSizeForCalcFPS()) {
            this.timestamps.poll();
        }
        if (this.timestamps.size() < this.params.getMinTimestampSizeForCalcFPS()) {
            return this.params.getDefaultFPS();
        }
        ArrayList<Number> arrayList = new ArrayList();
        Iterator<Long> it = this.timestamps.iterator();
        long j10 = 0;
        long j11 = 0;
        while (true) {
            boolean z10 = true;
            if (!it.hasNext()) {
                break;
            }
            Long next = it.next();
            if (j11 > 0) {
                long longValue = next.longValue() - j11;
                if ((0 > longValue || longValue > ((long) (this.frameIndex.get() < ((long) this.params.getMaxTimestampSizeForCalcFPS()) ? 200000000 : 2000000000))) ? false : false) {
                    arrayList.add(Long.valueOf(longValue));
                }
            }
            p.g(next, "timestamp");
            j11 = next.longValue();
        }
        for (Number number : arrayList) {
            j10 += number.longValue();
        }
        if (j10 >= 1 && arrayList.size() >= 1) {
            double size = 1 / ((((j10 / 1000.0d) / 1000.0d) / 1000.0d) / arrayList.size());
            return size < 1.0d ? this.params.getDefaultFPS() : (long) size;
        }
        return this.params.getDefaultFPS();
    }

    private final void changeSkipGap() {
        if (this.decodeQueue.size() > 3) {
            this.coordinator.getConfig().decrementAVRenderingSkipGap();
        }
        if (this.decodeQueue.size() == 0) {
            this.coordinator.getConfig().incrementAVRenderingSkipGap();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean checkRenderTiming() {
        RenderTiming peek = this.renderQueue.peek();
        if (peek == null) {
            return false;
        }
        if (peek.getPts() < this.coordinator.getVideoPacketLastTimestamp().get()) {
            if (Log.isLoggable(TAG, 3)) {
                Log.d(TAG, "avc packets are out of order");
            }
            long abs = Math.abs(peek.getPts() - this.coordinator.getVideoPacketLastTimestamp().get()) / 1000;
            if (this.coordinator.getConfig().getInitialBufferQueueTime().get() < abs) {
                this.coordinator.getConfig().setBufferQueueTime(abs);
            }
        }
        this.coordinator.getVideoPacketLastTimestamp().set(peek.getPts());
        boolean isReadyForRender = isReadyForRender(peek);
        if (isReadyForRender) {
            peek.setDelay(this.coordinator.getAudioPacketLastPlayedPTS().get() - peek.getPts());
            this.coordinator.getConfig().getAvRenderingGapPTS().set(peek.getDelay());
        }
        return isReadyForRender;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007c A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object decode(ao.d<? super wn.v> r13) {
        /*
            r12 = this;
            boolean r0 = r13 instanceof com.mirrativ.llstream.decoder.AVCDecoder$decode$1
            if (r0 == 0) goto L13
            r0 = r13
            com.mirrativ.llstream.decoder.AVCDecoder$decode$1 r0 = (com.mirrativ.llstream.decoder.AVCDecoder$decode$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.mirrativ.llstream.decoder.AVCDecoder$decode$1 r0 = new com.mirrativ.llstream.decoder.AVCDecoder$decode$1
            r0.<init>(r12, r13)
        L18:
            java.lang.Object r13 = r0.result
            java.lang.Object r1 = bo.c.c()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L3d
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            wn.m.b(r13)
            goto L7d
        L2d:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L35:
            java.lang.Object r2 = r0.L$0
            uo.d2 r2 = (uo.d2) r2
            wn.m.b(r13)
            goto L72
        L3d:
            wn.m.b(r13)
            android.media.MediaCodec r13 = r12.mediaCodec
            if (r13 == 0) goto L87
            java.lang.String r2 = "null cannot be cast to non-null type android.media.MediaCodec"
            jo.p.f(r13, r2)
            uo.q0 r6 = r12.coroutineScope
            ao.g r7 = r12.decodeContext
            com.mirrativ.llstream.decoder.AVCDecoder$decode$enqueueInputBufferJob$1 r9 = new com.mirrativ.llstream.decoder.AVCDecoder$decode$enqueueInputBufferJob$1
            r9.<init>(r12, r13, r5)
            r8 = 0
            r10 = 2
            r11 = 0
            uo.d2 r2 = uo.j.d(r6, r7, r8, r9, r10, r11)
            uo.q0 r6 = r12.coroutineScope
            ao.g r7 = r12.decodeContext
            com.mirrativ.llstream.decoder.AVCDecoder$decode$dequeueOutputBufferJob$1 r9 = new com.mirrativ.llstream.decoder.AVCDecoder$decode$dequeueOutputBufferJob$1
            r9.<init>(r12, r13, r5)
            uo.d2 r13 = uo.j.d(r6, r7, r8, r9, r10, r11)
            r0.L$0 = r13
            r0.label = r4
            java.lang.Object r2 = r2.E(r0)
            if (r2 != r1) goto L71
            return r1
        L71:
            r2 = r13
        L72:
            r0.L$0 = r5
            r0.label = r3
            java.lang.Object r13 = r2.E(r0)
            if (r13 != r1) goto L7d
            return r1
        L7d:
            java.lang.String r13 = "AVCDecoder"
            java.lang.String r0 = "video decode loop finished"
            android.util.Log.i(r13, r0)
            wn.v r13 = wn.v.f59242a
            return r13
        L87:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "media codec is null"
            r13.<init>(r0)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mirrativ.llstream.decoder.AVCDecoder.decode(ao.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(6:1|(2:3|(4:5|6|7|(8:(1:(2:11|12)(2:64|65))(2:66|67)|13|14|15|(7:18|(1:20)|21|(6:36|37|38|39|40|(1:42)(1:43))(2:23|(3:25|(2:27|28)(1:30)|29)(3:31|32|(1:34)))|14|15|(1:16))|62|60|61)(6:68|15|(1:16)|62|60|61)))|71|6|7|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0109, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x010a, code lost:
        r17 = r7;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0063 A[Catch: IllegalStateException -> 0x0109, TryCatch #1 {IllegalStateException -> 0x0109, blocks: (B:13:0x0038, B:21:0x005b, B:23:0x0063, B:25:0x0069, B:26:0x009d, B:28:0x00b0, B:18:0x004c), top: B:65:0x002a }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x00d3 -> B:45:0x0104). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x0101 -> B:45:0x0104). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object dequeueOutputBuffer(android.media.MediaCodec r21, ao.d<? super wn.v> r22) {
        /*
            Method dump skipped, instructions count: 323
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mirrativ.llstream.decoder.AVCDecoder.dequeueOutputBuffer(android.media.MediaCodec, ao.d):java.lang.Object");
    }

    private final void dropDelayedPackets() {
        AtomicLong audioPacketLastPlayedPTS = this.coordinator.getAudioPacketLastPlayedPTS();
        RenderTiming peek = this.renderQueue.peek();
        if (peek != null) {
            long aVGapAdjustmentTimeMs = this.coordinator.getConfig().getAVGapAdjustmentTimeMs();
            long pts = (audioPacketLastPlayedPTS.get() - peek.getPts()) / 1000;
            l lVar = pts > this.coordinator.getConfig().getNotAcceptableVideoDelayFromAudioMs() ? this.filterNAPacket : null;
            if (pts > this.coordinator.getConfig().getNotAcceptableVideoDelayFromAudioMs() + aVGapAdjustmentTimeMs) {
                lVar = this.filterIDR;
                this.coordinator.getConfig().incrementBufferQueueTime();
            }
            if (this.renderQueue.size() + this.decodeQueue.size() + this.queue.size() > this.params.getMaxDecodeQueueLength()) {
                if (Log.isLoggable(TAG, 3)) {
                    Log.d(TAG, "queue overflow");
                }
                lVar = this.filterIDR;
            }
            if (lVar != null) {
                PriorityBlockingQueue<AVCPacket> priorityBlockingQueue = this.decodeQueue;
                ArrayList arrayList = new ArrayList();
                for (Object obj : priorityBlockingQueue) {
                    if (((Boolean) lVar.invoke(obj)).booleanValue()) {
                        arrayList.add(obj);
                    }
                }
                this.decodeQueue.clear();
                this.decodeQueue.addAll(arrayList);
                PriorityBlockingQueue<AVCPacket> priorityBlockingQueue2 = this.queue;
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : priorityBlockingQueue2) {
                    if (((Boolean) lVar.invoke(obj2)).booleanValue()) {
                        arrayList2.add(obj2);
                    }
                }
                this.queue.clear();
                this.queue.addAll(arrayList2);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void dropPackets() {
        PriorityBlockingQueue<AVCPacket> priorityBlockingQueue = this.decodeQueue;
        l<AVCPacket, Boolean> lVar = this.filterIDR;
        ArrayList arrayList = new ArrayList();
        for (Object obj : priorityBlockingQueue) {
            if (((Boolean) lVar.invoke(obj)).booleanValue()) {
                arrayList.add(obj);
            }
        }
        this.decodeQueue.clear();
        this.decodeQueue.addAll(arrayList);
        PriorityBlockingQueue<AVCPacket> priorityBlockingQueue2 = this.queue;
        l<AVCPacket, Boolean> lVar2 = this.filterIDR;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : priorityBlockingQueue2) {
            if (((Boolean) lVar2.invoke(obj2)).booleanValue()) {
                arrayList2.add(obj2);
            }
        }
        this.queue.clear();
        this.queue.addAll(arrayList2);
    }

    private final void dropPacketsAfterStarting() {
        int i10;
        PriorityBlockingQueue<AVCPacket> priorityBlockingQueue = this.queue;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = priorityBlockingQueue.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            i10 = this.coordinator.getVideoPacketLastIDRTimestamp().get() <= ((AVCPacket) next).getTimestamp() ? 1 : 0;
            if (i10 == 0 && Log.isLoggable(TAG, 3)) {
                Log.d(TAG, "drop packets after starting");
            }
            if (i10 != 0) {
                arrayList.add(next);
            }
        }
        this.queue.clear();
        this.queue.addAll(arrayList);
        int size = this.queue.size();
        if (size > 0) {
            ArrayList arrayList2 = new ArrayList();
            while (i10 < size) {
                AVCPacket poll = this.queue.poll();
                if (poll != null) {
                    arrayList2.add(poll);
                }
                i10++;
            }
            long calcPreferredFPSFromActualPacketRate = calcPreferredFPSFromActualPacketRate(arrayList2);
            if (this.fps.get() != calcPreferredFPSFromActualPacketRate) {
                this.fps.set(calcPreferredFPSFromActualPacketRate);
            }
            this.decodeQueue.addAll(arrayList2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(11:1|(2:3|(9:5|6|7|(1:(1:(2:11|12)(2:51|52))(2:53|54))(1:55)|13|(4:16|(3:41|42|(2:44|45)(1:46))(5:18|19|(4:21|(1:23)|24|(1:26)(4:(1:28)|29|(1:31)(1:33)|32))|34|(2:36|37)(1:39))|40|14)|47|48|49))|70|6|7|(0)(0)|13|(1:14)|47|48|49) */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00dd, code lost:
        r13 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00e4, code lost:
        if (r2.decoding.get() != false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00ed, code lost:
        if (android.util.Log.isLoggable(com.mirrativ.llstream.decoder.AVCDecoder.TAG, 3) != false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00ef, code lost:
        android.util.Log.d(com.mirrativ.llstream.decoder.AVCDecoder.TAG, "failed to enqueue output buffer for avc on decoding");
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00f4, code lost:
        r14 = r2.callback;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00f6, code lost:
        if (r14 != null) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00f8, code lost:
        r14.onMediaCodecError(r13, new com.mirrativ.llstream.subscribe.DecodeErrorInfo(r2.getSpsByteList(), r2.getPpsByteList()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x010a, code lost:
        return wn.v.f59242a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x010b, code lost:
        r14 = r2.callback;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x010d, code lost:
        if (r14 != null) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x010f, code lost:
        r14.onError(r13);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0054 A[Catch: IllegalStateException -> 0x00dd, TryCatch #0 {IllegalStateException -> 0x00dd, blocks: (B:13:0x0030, B:21:0x004c, B:23:0x0054, B:25:0x005f, B:28:0x006e, B:30:0x007a, B:32:0x0080, B:33:0x0083, B:35:0x008d, B:37:0x0099, B:38:0x00a0, B:42:0x00b2, B:43:0x00ce, B:18:0x0044), top: B:62:0x0022 }] */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v4, types: [com.mirrativ.llstream.decoder.AVCDecoder, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object enqueueInputBuffer(android.media.MediaCodec r13, ao.d<? super wn.v> r14) {
        /*
            Method dump skipped, instructions count: 277
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mirrativ.llstream.decoder.AVCDecoder.enqueueInputBuffer(android.media.MediaCodec, ao.d):java.lang.Object");
    }

    private final double getFrameDurationMs() {
        return 1000.0d / this.fps.get();
    }

    private final List<r> getPpsByteList() {
        ArrayList arrayList = new ArrayList();
        for (byte b10 : this.pps) {
            arrayList.add(r.a(r.c(b10)));
        }
        return arrayList;
    }

    private final long getSmoothQueueLength() {
        long j10 = this.fps.get();
        long j11 = 1000;
        if (j10 < 1) {
            j10 = 1;
        }
        long j12 = j11 / j10;
        if (j12 < 1) {
            return this.params.getMinSmoothQueueLength();
        }
        return n.e(this.coordinator.getConfig().getBufferQueueTime().get() / j12, this.params.getMinSmoothQueueLength());
    }

    private final List<r> getSpsByteList() {
        ArrayList arrayList = new ArrayList();
        for (byte b10 : this.sps) {
            arrayList.add(r.a(r.c(b10)));
        }
        return arrayList;
    }

    private final boolean getVideoBufferUnderrun() {
        return this.renderQueue.isEmpty();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object initDecompress(ao.d<? super java.lang.Boolean> r14) {
        /*
            Method dump skipped, instructions count: 473
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mirrativ.llstream.decoder.AVCDecoder.initDecompress(ao.d):java.lang.Object");
    }

    private final boolean isReadyForRender(RenderTiming renderTiming) {
        double g10 = n.g(getFrameDurationMs(), 1000.0d);
        long j10 = (long) (1000 * g10);
        long j11 = this.coordinator.getAudioPacketLastPlayedPTS().get();
        if (j11 >= 1 && !this.coordinator.getConfig().getAudioBufferUnderrun()) {
            return ((((renderTiming.getPts() - j10) - (this.coordinator.getConfig().getAVGapAdjustmentTimeMs() * ((long) 1000))) > j11 ? 1 : (((renderTiming.getPts() - j10) - (this.coordinator.getConfig().getAVGapAdjustmentTimeMs() * ((long) 1000))) == j11 ? 0 : -1)) <= 0) && ((((double) (System.currentTimeMillis() - this.previousRender.get())) > n.g(this.params.getMaxRenderingPeriodOfFrameMs(), this.params.getFactorOfEnoughPeriod() * g10) ? 1 : (((double) (System.currentTimeMillis() - this.previousRender.get())) == n.g(this.params.getMaxRenderingPeriodOfFrameMs(), this.params.getFactorOfEnoughPeriod() * g10) ? 0 : -1)) > 0);
        }
        boolean z10 = this.renderQueue.size() + this.decodeQueue.size() > 10;
        double factorOfDefaultPeriod = this.params.getFactorOfDefaultPeriod();
        if (z10) {
            factorOfDefaultPeriod = this.params.getFactorOfBufferFullPeriod();
        }
        return ((double) (System.currentTimeMillis() - this.previousRender.get())) > g10 * factorOfDefaultPeriod;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void render() {
        AVCDecoderCallback aVCDecoderCallback;
        RenderTiming poll = this.renderQueue.poll();
        if (poll != null && this.decoding.get()) {
            try {
                MediaCodec mediaCodec = this.mediaCodec;
                if (mediaCodec != null) {
                    mediaCodec.releaseOutputBuffer(poll.getIndex(), poll.getPts() * 1000);
                }
                if (this.coordinator.getVideoPacketLastRenderedPTS().get() == -1 && (aVCDecoderCallback = this.callback) != null) {
                    aVCDecoderCallback.onLoadingEnd();
                }
                this.previousRender.set(System.currentTimeMillis());
                this.coordinator.getVideoPacketLastRenderedPTS().set(poll.getPts());
                AVCDecoderCallback aVCDecoderCallback2 = this.callback;
                if (aVCDecoderCallback2 != null) {
                    aVCDecoderCallback2.onVideoRendered((int) this.frameIndex.getAndIncrement());
                }
            } catch (MediaCodec.CodecException e10) {
                if (Log.isLoggable(TAG, 3)) {
                    Log.d(TAG, "failed to release output buffer for avc on render");
                }
                AVCDecoderCallback aVCDecoderCallback3 = this.callback;
                if (aVCDecoderCallback3 != null) {
                    aVCDecoderCallback3.onError(e10);
                }
            } catch (IllegalStateException e11) {
                if (Log.isLoggable(TAG, 3)) {
                    Log.d(TAG, "failed to release output buffer for avc on render");
                }
                AVCDecoderCallback aVCDecoderCallback4 = this.callback;
                if (aVCDecoderCallback4 != null) {
                    aVCDecoderCallback4.onError(e11);
                }
            }
        }
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long j10) {
        uo.l.d(this.coroutineScope, this.renderContext, null, new AVCDecoder$doFrame$1(this, null), 2, null);
    }

    public final AVCDecoderCallback getCallback() {
        return this.callback;
    }

    public final JitterCoordinator getCoordinator() {
        return this.coordinator;
    }

    public final q0 getCoroutineScope() {
        return this.coroutineScope;
    }

    public final VideoDecodeParams getParams() {
        return this.params;
    }

    public final Surface getSurface() {
        return this.surface;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object putData(java.nio.ByteBuffer r15, long r16, com.mirrativ.llstream.protocol.v1.topic.Extend r18, ao.d<? super wn.v> r19) {
        /*
            Method dump skipped, instructions count: 393
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mirrativ.llstream.decoder.AVCDecoder.putData(java.nio.ByteBuffer, long, com.mirrativ.llstream.protocol.v1.topic.Extend, ao.d):java.lang.Object");
    }

    public final void release() {
        synchronized (this) {
            if (this.decoding.get()) {
                this.decoding.set(false);
                d2 d2Var = this.decodeJob;
                if (d2Var != null) {
                    d2.a.a(d2Var, null, 1, null);
                }
                this.queue.clear();
                this.decodeQueue.clear();
                this.renderQueue.clear();
                this.coordinator.getConfig().resetBufferQueueTime();
                this.sps = new byte[0];
                this.pps = new byte[0];
                this.initialized = false;
                this.initIDR = false;
                this.bufferRecoveryCount = 0L;
                this.frameIndex.set(0L);
                try {
                    MediaCodec mediaCodec = this.mediaCodec;
                    if (mediaCodec != null) {
                        mediaCodec.flush();
                    }
                    MediaCodec mediaCodec2 = this.mediaCodec;
                    if (mediaCodec2 != null) {
                        mediaCodec2.stop();
                    }
                    MediaCodec mediaCodec3 = this.mediaCodec;
                    if (mediaCodec3 != null) {
                        mediaCodec3.release();
                    }
                } catch (IllegalStateException e10) {
                    AVCDecoderCallback aVCDecoderCallback = this.callback;
                    if (aVCDecoderCallback != null) {
                        aVCDecoderCallback.onError(e10);
                    }
                }
                this.mediaCodec = null;
                this.decodeDispatcher.close();
                this.renderDispatcher.close();
                v vVar = v.f59242a;
            }
        }
    }

    public final void setCallback(AVCDecoderCallback aVCDecoderCallback) {
        this.callback = aVCDecoderCallback;
    }

    public final void tick() {
        if (this.initialized && this.coordinator.getVideoPacketLastIDRTimestamp().get() != -1) {
            if (this.coordinator.getVideoPacketSecondaryIDRTimestamp().get() == -1) {
                dropPacketsAfterStarting();
                return;
            }
            int size = this.queue.size();
            long smoothQueueLength = getSmoothQueueLength();
            if (getVideoBufferUnderrun() || size >= smoothQueueLength) {
                if (this.coordinator.getConfig().resetRequestDisplayBuffer()) {
                    dropPackets();
                }
                if (this.scheduleResetBuffer) {
                    this.coordinator.getConfig().resetBufferQueueTime();
                    this.scheduleResetBuffer = false;
                }
                dropDelayedPackets();
                long size2 = getVideoBufferUnderrun() ? this.queue.size() : smoothQueueLength;
                ArrayList arrayList = new ArrayList();
                for (long j10 = 0; j10 < size2; j10++) {
                    AVCPacket poll = this.queue.poll();
                    if (poll != null) {
                        arrayList.add(poll);
                    }
                }
                long calcPreferredFPSFromActualPacketRate = calcPreferredFPSFromActualPacketRate(arrayList);
                long j11 = this.fps.get();
                this.fps.set(calcPreferredFPSFromActualPacketRate);
                if (Log.isLoggable(TAG, 2)) {
                    StringBuilder a10 = a.a("fps = ");
                    a10.append(this.fps.get());
                    Log.v(TAG, a10.toString());
                }
                if (calcPreferredFPSFromActualPacketRate - j11 >= this.params.getThresholdForRapidChangeOfFPS()) {
                    this.scheduleResetBuffer = true;
                }
                if (smoothQueueLength <= this.renderQueue.size() + this.decodeQueue.size() + arrayList.size()) {
                    this.bufferRecoveryCount++;
                    if (this.params.getThresholdOfBufferRecoveryCount() < this.bufferRecoveryCount) {
                        this.coordinator.getConfig().decrementBufferQueueTime();
                    }
                    if (this.coordinator.getConfig().getBufferQueueTime().get() <= this.coordinator.getConfig().getInitialBufferQueueTime().get()) {
                        this.bufferRecoveryCount = 0L;
                    }
                }
                this.decodeQueue.addAll(arrayList);
            }
        }
    }

    public /* synthetic */ AVCDecoder(JitterCoordinator jitterCoordinator, Surface surface, VideoDecodeParams videoDecodeParams, q0 q0Var, int i10, h hVar) {
        AVCDecoder aVCDecoder;
        JitterCoordinator jitterCoordinator2;
        Surface surface2;
        q0 q0Var2;
        VideoDecodeParams videoDecodeParams2 = (i10 & 4) != 0 ? new VideoDecodeParams(0, 0, 0L, 0.0d, 0.0d, 0.0d, 0.0d, 0, 0, 0L, 0, 0L, 0L, 0L, 0L, 0L, null, 131071, null) : videoDecodeParams;
        if ((i10 & 8) != 0) {
            q0Var2 = r0.a(g1.a());
            aVCDecoder = this;
            jitterCoordinator2 = jitterCoordinator;
            surface2 = surface;
        } else {
            aVCDecoder = this;
            jitterCoordinator2 = jitterCoordinator;
            surface2 = surface;
            q0Var2 = q0Var;
        }
        new AVCDecoder(jitterCoordinator2, surface2, videoDecodeParams2, q0Var2);
    }
}
