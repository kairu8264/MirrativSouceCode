package com.mirrativ.llstream.decoder;

import android.media.AudioFormat;
import android.media.AudioTrack;
import android.media.MediaFormat;
import android.util.Log;
import ao.g;
import com.google.android.exoplayer2.util.MimeTypes;
import com.mirrativ.llstream.NamedThreadFactory;
import com.mirrativ.llstream.encoder.AACEncoder;
import com.mirrativ.llstream.protocol.v1.topic.Extend;
import com.mirrativ.llstream.subscribe.PCMPlayer;
import com.mirrativ.llstream.subscribe.PCMPlayerCallback;
import io.l;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import jo.h;
import jo.p;
import kotlin.NoWhenBranchMatchedException;
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
import wo.b0;
import wo.i;

/* loaded from: classes4.dex */
public final class AACDecoder implements PCMPlayerCallback {
    public static final Companion Companion = new Companion(null);
    private static final String TAG = "AACDecoder";
    private byte[] ascBytes;
    private AudioSpecificConfig audioSpecificConfig;
    private final l<Float, Float> avoidUnderrun;
    private AACDecoderCallback callback;
    private final JitterCoordinator coordinator;
    private final q0 coroutineScope;
    private final g decodeContext;
    private final s1 decodeDispatcher;
    private d2 decodeJob;
    private final PriorityBlockingQueue<AACPacket> decodeQueue;
    private final AtomicBoolean decoding;
    private boolean initialized;
    private final IsochronousPackets isochronousPackets;
    private MediaFormat outputFormat;
    private final i<Integer> outputSampleRateChangedChannel;
    private final AudioDecodeParams params;
    private final g playContext;
    private final s1 playDispatcher;
    private d2 playJob;
    private PCMPlayer player;
    private final PriorityBlockingQueue<AACPacket> queue;
    private final LinkedBlockingQueue<PCMData> renderQueue;

    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(h hVar) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Extend.values().length];
            iArr[Extend.AAC_ASC.ordinal()] = 1;
            iArr[Extend.AAC_RAW.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public AACDecoder(JitterCoordinator jitterCoordinator, AudioDecodeParams audioDecodeParams, q0 q0Var) {
        p.h(jitterCoordinator, "coordinator");
        p.h(audioDecodeParams, "params");
        p.h(q0Var, "coroutineScope");
        this.coordinator = jitterCoordinator;
        this.params = audioDecodeParams;
        this.coroutineScope = q0Var;
        this.queue = new PriorityBlockingQueue<>();
        this.decodeQueue = new PriorityBlockingQueue<>();
        this.renderQueue = new LinkedBlockingQueue<>();
        this.decoding = new AtomicBoolean(false);
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(new NamedThreadFactory("AACDecoderDecode"));
        p.g(newSingleThreadExecutor, "newSingleThreadExecutor(…tory(\"AACDecoderDecode\"))");
        s1 a10 = u1.a(newSingleThreadExecutor);
        this.decodeDispatcher = a10;
        ExecutorService newSingleThreadExecutor2 = Executors.newSingleThreadExecutor(new NamedThreadFactory("AACDecoderPlay"));
        p.g(newSingleThreadExecutor2, "newSingleThreadExecutor(…actory(\"AACDecoderPlay\"))");
        s1 a11 = u1.a(newSingleThreadExecutor2);
        this.playDispatcher = a11;
        this.decodeContext = new p0("llstream.audio.decode").plus(a10);
        this.playContext = new p0("llstream.audio.play").plus(a11);
        this.ascBytes = new byte[0];
        this.audioSpecificConfig = new AudioSpecificConfig(2, 1, AACEncoder.SAMPLING_RATE, 1024);
        this.outputSampleRateChangedChannel = wo.l.b(0, null, null, 7, null);
        this.isochronousPackets = new IsochronousPackets(audioDecodeParams.getMaxLinearRegressionPoints(), 0, 2, null);
        this.avoidUnderrun = new AACDecoder$avoidUnderrun$1(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object createRenderDequeueLoop(com.mirrativ.llstream.subscribe.PCMPlayer r19, ao.d<? super wn.v> r20) {
        /*
            Method dump skipped, instructions count: 341
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mirrativ.llstream.decoder.AACDecoder.createRenderDequeueLoop(com.mirrativ.llstream.subscribe.PCMPlayer, ao.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object decode(android.media.MediaFormat r14, ao.d<? super wn.v> r15) {
        /*
            Method dump skipped, instructions count: 288
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mirrativ.llstream.decoder.AACDecoder.decode(android.media.MediaFormat, ao.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0060 A[Catch: IllegalStateException -> 0x0192, TryCatch #0 {IllegalStateException -> 0x0192, blocks: (B:16:0x004b, B:44:0x018a, B:19:0x0058, B:21:0x0060, B:23:0x0066, B:24:0x00f1, B:26:0x0102, B:28:0x0108, B:29:0x0128, B:34:0x013c, B:36:0x014c, B:38:0x015b, B:39:0x016f, B:41:0x017a), top: B:52:0x004b }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x0178 -> B:44:0x018a). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x0187 -> B:44:0x018a). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object dequeueOutputBuffer(android.media.MediaCodec r19, ao.d<? super wn.v> r20) {
        /*
            Method dump skipped, instructions count: 413
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mirrativ.llstream.decoder.AACDecoder.dequeueOutputBuffer(android.media.MediaCodec, ao.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(11:1|(2:3|(9:5|6|7|(1:(1:(2:11|12)(2:47|48))(2:49|50))(1:51)|13|(4:16|(3:37|38|(2:40|41)(1:42))(5:18|19|(4:21|(1:23)|24|(1:26)(2:(1:28)|29))|30|(2:32|33)(1:35))|36|14)|43|44|45))|56|6|7|(0)(0)|13|(1:14)|43|44|45) */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00bf, code lost:
        r14 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00c0, code lost:
        r15 = r2.callback;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00c2, code lost:
        if (r15 != null) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00c4, code lost:
        r15.onError(r14);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0054 A[Catch: IllegalStateException -> 0x00bf, TryCatch #0 {IllegalStateException -> 0x00bf, blocks: (B:13:0x0030, B:21:0x004c, B:23:0x0054, B:25:0x005c, B:28:0x006b, B:30:0x0077, B:32:0x007d, B:33:0x0080, B:35:0x008a, B:37:0x0096, B:38:0x009d, B:39:0x00b0, B:18:0x0044), top: B:48:0x0022 }] */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v3, types: [com.mirrativ.llstream.decoder.AACDecoder, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object enqueueInputBuffer(android.media.MediaCodec r14, ao.d<? super wn.v> r15) {
        /*
            r13 = this;
            boolean r0 = r15 instanceof com.mirrativ.llstream.decoder.AACDecoder$enqueueInputBuffer$1
            if (r0 == 0) goto L13
            r0 = r15
            com.mirrativ.llstream.decoder.AACDecoder$enqueueInputBuffer$1 r0 = (com.mirrativ.llstream.decoder.AACDecoder$enqueueInputBuffer$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.mirrativ.llstream.decoder.AACDecoder$enqueueInputBuffer$1 r0 = new com.mirrativ.llstream.decoder.AACDecoder$enqueueInputBuffer$1
            r0.<init>(r13, r15)
        L18:
            java.lang.Object r15 = r0.result
            java.lang.Object r1 = bo.c.c()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L48
            if (r2 == r4) goto L3c
            if (r2 != r3) goto L34
            java.lang.Object r14 = r0.L$1
            android.media.MediaCodec r14 = (android.media.MediaCodec) r14
            java.lang.Object r2 = r0.L$0
            com.mirrativ.llstream.decoder.AACDecoder r2 = (com.mirrativ.llstream.decoder.AACDecoder) r2
            wn.m.b(r15)     // Catch: java.lang.IllegalStateException -> Lbf
            goto L4c
        L34:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r15)
            throw r14
        L3c:
            java.lang.Object r14 = r0.L$1
            android.media.MediaCodec r14 = (android.media.MediaCodec) r14
            java.lang.Object r2 = r0.L$0
            com.mirrativ.llstream.decoder.AACDecoder r2 = (com.mirrativ.llstream.decoder.AACDecoder) r2
            wn.m.b(r15)     // Catch: java.lang.IllegalStateException -> Lbf
            goto L4c
        L48:
            wn.m.b(r15)
            r2 = r13
        L4c:
            java.util.concurrent.atomic.AtomicBoolean r15 = r2.decoding     // Catch: java.lang.IllegalStateException -> Lbf
            boolean r15 = r15.get()     // Catch: java.lang.IllegalStateException -> Lbf
            if (r15 == 0) goto Lc7
            java.util.concurrent.PriorityBlockingQueue<com.mirrativ.llstream.decoder.AACPacket> r15 = r2.decodeQueue     // Catch: java.lang.IllegalStateException -> Lbf
            boolean r15 = r15.isEmpty()     // Catch: java.lang.IllegalStateException -> Lbf
            if (r15 == 0) goto L6b
            r5 = 10
            r0.L$0 = r2     // Catch: java.lang.IllegalStateException -> Lbf
            r0.L$1 = r14     // Catch: java.lang.IllegalStateException -> Lbf
            r0.label = r4     // Catch: java.lang.IllegalStateException -> Lbf
            java.lang.Object r15 = uo.b1.a(r5, r0)     // Catch: java.lang.IllegalStateException -> Lbf
            if (r15 != r1) goto L4c
            return r1
        L6b:
            com.mirrativ.llstream.decoder.AudioDecodeParams r15 = r2.params     // Catch: java.lang.IllegalStateException -> Lbf
            long r5 = r15.getMaxWaitTimeOfInputBufferUs()     // Catch: java.lang.IllegalStateException -> Lbf
            int r6 = r14.dequeueInputBuffer(r5)     // Catch: java.lang.IllegalStateException -> Lbf
            if (r6 < 0) goto Lb0
            java.nio.ByteBuffer r15 = r14.getInputBuffer(r6)     // Catch: java.lang.IllegalStateException -> Lbf
            if (r15 == 0) goto L80
            r15.clear()     // Catch: java.lang.IllegalStateException -> Lbf
        L80:
            java.util.concurrent.PriorityBlockingQueue<com.mirrativ.llstream.decoder.AACPacket> r5 = r2.decodeQueue     // Catch: java.lang.IllegalStateException -> Lbf
            java.lang.Object r5 = r5.poll()     // Catch: java.lang.IllegalStateException -> Lbf
            com.mirrativ.llstream.decoder.AACPacket r5 = (com.mirrativ.llstream.decoder.AACPacket) r5     // Catch: java.lang.IllegalStateException -> Lbf
            if (r5 != 0) goto L94
            r7 = 0
            r8 = 0
            r9 = 0
            r11 = 0
            r5 = r14
            r5.queueInputBuffer(r6, r7, r8, r9, r11)     // Catch: java.lang.IllegalStateException -> Lbf
            goto Lb0
        L94:
            if (r15 == 0) goto L9d
            byte[] r7 = r5.getPayload()     // Catch: java.lang.IllegalStateException -> Lbf
            r15.put(r7)     // Catch: java.lang.IllegalStateException -> Lbf
        L9d:
            r7 = 0
            byte[] r15 = r5.getPayload()     // Catch: java.lang.IllegalStateException -> Lbf
            int r8 = r15.length     // Catch: java.lang.IllegalStateException -> Lbf
            long r9 = r5.getTimestamp()     // Catch: java.lang.IllegalStateException -> Lbf
            r15 = 1000(0x3e8, float:1.401E-42)
            long r11 = (long) r15     // Catch: java.lang.IllegalStateException -> Lbf
            long r9 = r9 / r11
            r11 = 0
            r5 = r14
            r5.queueInputBuffer(r6, r7, r8, r9, r11)     // Catch: java.lang.IllegalStateException -> Lbf
        Lb0:
            r5 = 5
            r0.L$0 = r2     // Catch: java.lang.IllegalStateException -> Lbf
            r0.L$1 = r14     // Catch: java.lang.IllegalStateException -> Lbf
            r0.label = r3     // Catch: java.lang.IllegalStateException -> Lbf
            java.lang.Object r15 = uo.b1.a(r5, r0)     // Catch: java.lang.IllegalStateException -> Lbf
            if (r15 != r1) goto L4c
            return r1
        Lbf:
            r14 = move-exception
            com.mirrativ.llstream.decoder.AACDecoderCallback r15 = r2.callback
            if (r15 == 0) goto Lc7
            r15.onError(r14)
        Lc7:
            wn.v r14 = wn.v.f59242a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mirrativ.llstream.decoder.AACDecoder.enqueueInputBuffer(android.media.MediaCodec, ao.d):java.lang.Object");
    }

    private final int getChannelCount() {
        int channelCount = this.audioSpecificConfig.getChannelCount();
        if (channelCount == 0) {
            return 1;
        }
        return channelCount;
    }

    private final int getFrameLength() {
        int frameLength = this.audioSpecificConfig.getFrameLength();
        if (frameLength == 0) {
            return 1024;
        }
        return frameLength;
    }

    private final double getSampleFrequency() {
        double samplingFrequency = this.audioSpecificConfig.getSamplingFrequency();
        if (samplingFrequency == 0.0d) {
            return 44100.0d;
        }
        return samplingFrequency;
    }

    private final double getSampleFrequencyPerSecond() {
        return (getFrameLength() / getSampleFrequency()) * 1000.0d;
    }

    private final long getSmoothQueueLength() {
        return ((long) (this.coordinator.getConfig().getBufferQueueTime().get() / getSampleFrequencyPerSecond())) * getChannelCount();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long getSmoothQueueLengthWithGap() {
        PacketJitterConfig config = this.coordinator.getConfig();
        return ((long) ((config.getAVGapAdjustmentTimeMs() + config.getBufferQueueTime().get()) / getSampleFrequencyPerSecond())) * getChannelCount();
    }

    private final boolean initDecompress() {
        d2 d10;
        d2 d11;
        if (this.decoding.get()) {
            return true;
        }
        this.decoding.set(true);
        AudioSpecificConfig parse = AudioSpecificConfig.Companion.parse(this.ascBytes);
        this.audioSpecificConfig = parse;
        MediaFormat createAudioFormat = MediaFormat.createAudioFormat(MimeTypes.AUDIO_AAC, parse.getSamplingFrequency(), parse.getChannelCount());
        p.g(createAudioFormat, "createAudioFormat(\n     …hannelCount\n            )");
        ArrayList arrayList = new ArrayList();
        for (byte b10 : this.ascBytes) {
            arrayList.add(r.a(r.c(b10)));
        }
        if (Log.isLoggable(TAG, 3)) {
            Log.d(TAG, "asc: " + parse);
        }
        int i10 = parse.getChannelCount() == 1 ? 4 : 12;
        AudioFormat build = new AudioFormat.Builder().setChannelMask(i10).setSampleRate(parse.getSamplingFrequency()).setEncoding(2).build();
        int minBufferSize = AudioTrack.getMinBufferSize(build.getSampleRate(), build.getChannelMask(), 2);
        createAudioFormat.setByteBuffer("csd-0", ByteBuffer.wrap(this.ascBytes));
        createAudioFormat.setInteger("max-input-size", minBufferSize * 4);
        d10 = uo.l.d(this.coroutineScope, this.playContext, null, new AACDecoder$initDecompress$2(this, i10, null), 2, null);
        this.playJob = d10;
        d11 = uo.l.d(this.coroutineScope, this.decodeContext, null, new AACDecoder$initDecompress$3(this, createAudioFormat, null), 2, null);
        this.decodeJob = d11;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object play(AudioFormat audioFormat, ao.d<? super v> dVar) {
        PCMPlayer pCMPlayer = this.player;
        if (pCMPlayer != null) {
            pCMPlayer.stop();
        }
        this.player = null;
        PCMPlayer pCMPlayer2 = new PCMPlayer(this.coroutineScope, audioFormat, this);
        pCMPlayer2.play();
        this.player = pCMPlayer2;
        uo.l.d(this.coroutineScope, this.playContext, null, new AACDecoder$play$2(this, pCMPlayer2, null), 2, null);
        return v.f59242a;
    }

    private final void resetScheduledBufferIfNeeded() {
        if (this.renderQueue.isEmpty()) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.coordinator.getAudioPacketLastStackingCheckTimestamp().get() < this.params.getDelayCheckIntervalMs()) {
            return;
        }
        this.coordinator.getAudioPacketLastStackingCheckTimestamp().set(currentTimeMillis);
        long smoothQueueLengthWithGap = getSmoothQueueLengthWithGap();
        if (this.params.getMaxRenderQueueLengthFactor() * ((double) smoothQueueLengthWithGap) >= ((double) (this.coordinator.getConfig().getRemainingScheduledBufferSize().get() + ((long) this.renderQueue.size()))) ? 3000000 <= this.coordinator.getConfig().getAvRenderingGapPTS().get() : true) {
            while (this.coordinator.getConfig().getRemainingScheduledBufferSize().get() + this.renderQueue.size() >= smoothQueueLengthWithGap) {
                if (Log.isLoggable(TAG, 3)) {
                    Log.d(TAG, "drop audio packet");
                }
                this.renderQueue.poll();
            }
            this.coordinator.getAudioPacketLastPlayedPTS().set(-1L);
            this.coordinator.getAudioPacketLastScheduledPTS().set(-1L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object selectFormatChanged(int i10, ao.d<? super v> dVar) {
        cp.b bVar = new cp.b(dVar);
        try {
            bVar.n(this.outputSampleRateChangedChannel.s(), new AACDecoder$selectFormatChanged$2$1(this, i10, null));
        } catch (Throwable th2) {
            bVar.Y(th2);
        }
        Object X = bVar.X();
        if (X == bo.c.c()) {
            co.h.c(dVar);
        }
        return X == bo.c.c() ? X : v.f59242a;
    }

    public final AACDecoderCallback getCallback() {
        return this.callback;
    }

    public final JitterCoordinator getCoordinator() {
        return this.coordinator;
    }

    public final q0 getCoroutineScope() {
        return this.coroutineScope;
    }

    public final AudioDecodeParams getParams() {
        return this.params;
    }

    @Override // com.mirrativ.llstream.subscribe.PCMPlayerCallback
    public void onPCMPlayerError(Throwable th2) {
        p.h(th2, "ex");
        AACDecoderCallback aACDecoderCallback = this.callback;
        if (aACDecoderCallback != null) {
            aACDecoderCallback.onError(th2);
        }
    }

    public final void putData(ByteBuffer byteBuffer, long j10, Extend extend) {
        p.h(byteBuffer, "buf");
        p.h(extend, "type");
        int i10 = WhenMappings.$EnumSwitchMapping$0[extend.ordinal()];
        if (i10 != 1) {
            if (i10 == 2 && this.initialized) {
                byte[] array = byteBuffer.array();
                PriorityBlockingQueue<AACPacket> priorityBlockingQueue = this.queue;
                p.g(array, "bytes");
                priorityBlockingQueue.add(new AACPacket(array, j10, j10, extend));
                return;
            }
            return;
        }
        byte[] array2 = byteBuffer.array();
        ArrayList arrayList = new ArrayList();
        int i11 = n.i(10, array2.length - 1);
        if (i11 >= 0) {
            int i12 = 0;
            while (true) {
                arrayList.add(r.a(r.c(array2[i12])));
                if (i12 == i11) {
                    break;
                }
                i12++;
            }
        }
        if (Log.isLoggable(TAG, 3)) {
            Log.d(TAG, "aac asc " + arrayList);
        }
        p.g(array2, "bytes");
        this.ascBytes = array2;
        if (!(array2.length == 0)) {
            if (!(array2.length == 0)) {
                this.initialized = initDecompress() ? true : this.initialized;
            }
        }
    }

    public final void release() {
        synchronized (this) {
            if (this.decoding.get()) {
                b0.a.a(this.outputSampleRateChangedChannel, null, 1, null);
                this.decoding.set(false);
                PCMPlayer pCMPlayer = this.player;
                if (pCMPlayer != null) {
                    pCMPlayer.stop();
                }
                PCMPlayer pCMPlayer2 = this.player;
                if (pCMPlayer2 != null) {
                    pCMPlayer2.release();
                }
                d2 d2Var = this.decodeJob;
                if (d2Var != null) {
                    d2.a.a(d2Var, null, 1, null);
                }
                d2 d2Var2 = this.playJob;
                if (d2Var2 != null) {
                    d2.a.a(d2Var2, null, 1, null);
                }
                this.initialized = false;
                this.queue.clear();
                this.decodeQueue.clear();
                this.renderQueue.clear();
                this.ascBytes = new byte[0];
                this.isochronousPackets.clear();
                this.coordinator.resetAudioTimestamps();
                this.coordinator.getConfig().getRemainingScheduledBufferSize().set(0L);
                this.decodeDispatcher.close();
                this.playDispatcher.close();
                v vVar = v.f59242a;
            }
        }
    }

    public final void setCallback(AACDecoderCallback aACDecoderCallback) {
        this.callback = aACDecoderCallback;
    }

    public final void tick() {
        int size = this.queue.size();
        long smoothQueueLength = getSmoothQueueLength();
        if (this.coordinator.getConfig().getAudioBufferUnderrun() || size >= smoothQueueLength) {
            boolean audioBufferUnderrun = this.coordinator.getConfig().getAudioBufferUnderrun();
            if (!audioBufferUnderrun) {
                if (audioBufferUnderrun) {
                    throw new NoWhenBranchMatchedException();
                }
                size = (int) (size - smoothQueueLength);
            }
            int i10 = 0;
            if (!this.params.getEnableAdjustmentOfTimestamps()) {
                while (i10 < size) {
                    AACPacket poll = this.queue.poll();
                    if (poll != null) {
                        this.decodeQueue.add(poll);
                    }
                    i10++;
                }
                return;
            }
            while (i10 < size) {
                AACPacket poll2 = this.queue.poll();
                if (poll2 != null) {
                    this.isochronousPackets.add((TimeSeriesPacket) poll2);
                }
                i10++;
            }
            this.isochronousPackets.adjustTimestamps();
            while (!this.isochronousPackets.isEmpty()) {
                TimeSeriesPacket poll3 = this.isochronousPackets.poll();
                if (poll3 != null) {
                    this.decodeQueue.add((AACPacket) poll3);
                }
            }
        }
    }

    public /* synthetic */ AACDecoder(JitterCoordinator jitterCoordinator, AudioDecodeParams audioDecodeParams, q0 q0Var, int i10, h hVar) {
        AACDecoder aACDecoder;
        JitterCoordinator jitterCoordinator2;
        q0 q0Var2;
        AudioDecodeParams audioDecodeParams2 = (i10 & 2) != 0 ? new AudioDecodeParams(0, 0.0d, false, 0, 0, 0L, 0L, 0L, 0L, 0.0f, 0.0f, 0.0f, 0L, 0L, 0L, 0L, 65535, null) : audioDecodeParams;
        if ((i10 & 4) != 0) {
            q0Var2 = r0.a(g1.a());
            aACDecoder = this;
            jitterCoordinator2 = jitterCoordinator;
        } else {
            aACDecoder = this;
            jitterCoordinator2 = jitterCoordinator;
            q0Var2 = q0Var;
        }
        new AACDecoder(jitterCoordinator2, audioDecodeParams2, q0Var2);
    }
}
