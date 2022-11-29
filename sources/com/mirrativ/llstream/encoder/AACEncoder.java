package com.mirrativ.llstream.encoder;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.util.Log;
import android.view.Surface;
import com.google.android.exoplayer2.util.MimeTypes;
import com.mirrativ.llstream.NamedThreadFactory;
import com.mirrativ.llstream.decoder.IsochronousPackets;
import com.mirrativ.llstream.decoder.TimeSeriesPacket;
import java.nio.ByteBuffer;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import jo.h;
import jo.p;
import uo.d2;
import uo.l;
import uo.q0;
import uo.s1;
import uo.u1;

/* loaded from: classes4.dex */
public final class AACEncoder implements AudioEncoder {
    public static final Companion Companion = new Companion(null);
    public static final int MAX_INPUT_QUEUE_SIZE = 100;
    public static final int MAX_OUTPUT_QUEUE_SIZE = 100;
    public static final int SAMPLING_RATE = 44100;
    public static final String TAG = "AACEncoder";
    private MediaCodec codec;
    private final q0 coroutineScope;
    private d2 dequeueJob;
    private final s1 encodeDispatcher;
    private d2 encodeJob;
    private MediaFormat format;
    private IsochronousPackets inputQueue;
    private volatile boolean keepAlive;
    private AudioEncoderListener listener;
    private final s1 outputDispatcher;
    private d2 outputJob;
    private ConcurrentLinkedQueue<CompressedBuffer> outputQueue;
    private final AudioEncoderSetting setting;
    private long timestamp0;

    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(h hVar) {
            this();
        }

        public final MediaFormat createFormat(int i10, int i11, int i12) {
            MediaFormat createAudioFormat = MediaFormat.createAudioFormat(MimeTypes.AUDIO_AAC, i10, i11);
            p.g(createAudioFormat, "createAudioFormat(\n     …hannelCount\n            )");
            createAudioFormat.setInteger("aac-profile", 2);
            createAudioFormat.setInteger("bitrate", i12);
            return createAudioFormat;
        }
    }

    public AACEncoder(q0 q0Var) {
        p.h(q0Var, "coroutineScope");
        this.coroutineScope = q0Var;
        this.setting = new AudioEncoderSetting(0, 0, 0, 7, null);
        this.keepAlive = true;
        this.inputQueue = new IsochronousPackets(0, 0, 3, null);
        this.outputQueue = new ConcurrentLinkedQueue<>();
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(new NamedThreadFactory(TAG));
        p.g(newSingleThreadExecutor, "newSingleThreadExecutor(…eadFactory(\"AACEncoder\"))");
        this.encodeDispatcher = u1.a(newSingleThreadExecutor);
        ExecutorService newSingleThreadExecutor2 = Executors.newSingleThreadExecutor(new NamedThreadFactory("AACEncoder-Output"));
        p.g(newSingleThreadExecutor2, "newSingleThreadExecutor(…ory(\"AACEncoder-Output\"))");
        this.outputDispatcher = u1.a(newSingleThreadExecutor2);
        this.timestamp0 = -1L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0062, code lost:
        r2.keepAlive = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00c1, code lost:
        return wn.v.f59242a;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0057 A[Catch: Exception -> 0x0048, TRY_ENTER, TryCatch #0 {Exception -> 0x0048, blocks: (B:25:0x0057, B:27:0x005b, B:28:0x005e, B:30:0x0062, B:31:0x0066, B:33:0x0073, B:36:0x007e, B:38:0x008c, B:41:0x0099, B:18:0x0044), top: B:52:0x0044 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00bf A[EDGE_INSN: B:56:0x00bf->B:50:0x00bf ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x00bc -> B:23:0x0053). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object encodeInputLoop(ao.d<? super wn.v> r12) {
        /*
            r11 = this;
            boolean r0 = r12 instanceof com.mirrativ.llstream.encoder.AACEncoder$encodeInputLoop$1
            if (r0 == 0) goto L13
            r0 = r12
            com.mirrativ.llstream.encoder.AACEncoder$encodeInputLoop$1 r0 = (com.mirrativ.llstream.encoder.AACEncoder$encodeInputLoop$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.mirrativ.llstream.encoder.AACEncoder$encodeInputLoop$1 r0 = new com.mirrativ.llstream.encoder.AACEncoder$encodeInputLoop$1
            r0.<init>(r11, r12)
        L18:
            java.lang.Object r12 = r0.result
            java.lang.Object r1 = bo.c.c()
            int r2 = r0.label
            r3 = 4
            r4 = 2
            r5 = 1
            r7 = 3
            r8 = 1
            if (r2 == 0) goto L4a
            if (r2 == r8) goto L40
            if (r2 == r4) goto L40
            if (r2 == r7) goto L40
            if (r2 != r3) goto L38
            java.lang.Object r2 = r0.L$0
            com.mirrativ.llstream.encoder.AACEncoder r2 = (com.mirrativ.llstream.encoder.AACEncoder) r2
            wn.m.b(r12)
            goto L53
        L38:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L40:
            java.lang.Object r2 = r0.L$0
            com.mirrativ.llstream.encoder.AACEncoder r2 = (com.mirrativ.llstream.encoder.AACEncoder) r2
            wn.m.b(r12)     // Catch: java.lang.Exception -> L48
            goto L53
        L48:
            r12 = move-exception
            goto La7
        L4a:
            wn.m.b(r12)
            r12 = -19
            android.os.Process.setThreadPriority(r12)
            r2 = r11
        L53:
            boolean r12 = r2.keepAlive
            if (r12 == 0) goto Lbf
            uo.d2 r12 = r2.encodeJob     // Catch: java.lang.Exception -> L48
            if (r12 == 0) goto L5e
            uo.g2.k(r12)     // Catch: java.lang.Exception -> L48
        L5e:
            android.media.MediaCodec r12 = r2.codec     // Catch: java.lang.Exception -> L48
            if (r12 != 0) goto L66
            r12 = 0
            r2.keepAlive = r12     // Catch: java.lang.Exception -> L48
            goto Lbf
        L66:
            java.lang.String r9 = "null cannot be cast to non-null type android.media.MediaCodec"
            jo.p.f(r12, r9)     // Catch: java.lang.Exception -> L48
            com.mirrativ.llstream.decoder.IsochronousPackets r9 = r2.inputQueue     // Catch: java.lang.Exception -> L48
            int r9 = r9.size()     // Catch: java.lang.Exception -> L48
            if (r9 >= r8) goto L7e
            r0.L$0 = r2     // Catch: java.lang.Exception -> L48
            r0.label = r8     // Catch: java.lang.Exception -> L48
            java.lang.Object r12 = uo.b1.a(r5, r0)     // Catch: java.lang.Exception -> L48
            if (r12 != r1) goto L53
            return r1
        L7e:
            com.mirrativ.llstream.decoder.IsochronousPackets r9 = r2.inputQueue     // Catch: java.lang.Exception -> L48
            r9.adjustTimestamps()     // Catch: java.lang.Exception -> L48
            r9 = 1000(0x3e8, double:4.94E-321)
            int r9 = r12.dequeueInputBuffer(r9)     // Catch: java.lang.Exception -> L48
            r10 = -1
            if (r9 != r10) goto L99
            r9 = 5
            r0.L$0 = r2     // Catch: java.lang.Exception -> L48
            r0.label = r4     // Catch: java.lang.Exception -> L48
            java.lang.Object r12 = uo.b1.a(r9, r0)     // Catch: java.lang.Exception -> L48
            if (r12 != r1) goto L53
            return r1
        L99:
            r2.onInputBufferAvailable(r12, r9)     // Catch: java.lang.Exception -> L48
            r0.L$0 = r2     // Catch: java.lang.Exception -> L48
            r0.label = r7     // Catch: java.lang.Exception -> L48
            java.lang.Object r12 = uo.b1.a(r5, r0)     // Catch: java.lang.Exception -> L48
            if (r12 != r1) goto L53
            return r1
        La7:
            java.lang.String r9 = "AACEncoder"
            boolean r10 = android.util.Log.isLoggable(r9, r7)
            if (r10 == 0) goto Lb4
            java.lang.String r10 = "dequeueInputBuffer error"
            android.util.Log.d(r9, r10, r12)
        Lb4:
            r0.L$0 = r2
            r0.label = r3
            java.lang.Object r12 = uo.b1.a(r5, r0)
            if (r12 != r1) goto L53
            return r1
        Lbf:
            wn.v r12 = wn.v.f59242a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mirrativ.llstream.encoder.AACEncoder.encodeInputLoop(ao.d):java.lang.Object");
    }

    private final void onInputBufferAvailable(MediaCodec mediaCodec, int i10) {
        ByteBuffer inputBuffer = mediaCodec.getInputBuffer(i10);
        if (inputBuffer == null) {
            return;
        }
        TimeSeriesPacket poll = this.inputQueue.poll();
        if (poll == null) {
            if (Log.isLoggable(TAG, 2)) {
                Log.v(TAG, "inputQueue is empty");
                return;
            }
            return;
        }
        int length = poll.getPayload().length;
        inputBuffer.put(poll.getPayload(), 0, length);
        mediaCodec.queueInputBuffer(i10, 0, length, poll.getTimestamp(), 0);
    }

    private final void onOutputBufferAvailable(MediaCodec mediaCodec, int i10, MediaCodec.BufferInfo bufferInfo) {
        try {
            if (this.timestamp0 == -1) {
                long j10 = bufferInfo.presentationTimeUs;
                if (j10 != 0) {
                    this.timestamp0 = j10 / 1000;
                }
            }
            ByteBuffer outputBuffer = mediaCodec.getOutputBuffer(i10);
            if (outputBuffer == null) {
                return;
            }
            ByteBuffer allocate = ByteBuffer.allocate(bufferInfo.size);
            allocate.put(outputBuffer);
            ConcurrentLinkedQueue<CompressedBuffer> concurrentLinkedQueue = this.outputQueue;
            p.g(allocate, "outBuffer");
            concurrentLinkedQueue.offer(new CompressedBuffer(bufferInfo, allocate));
            if (this.outputQueue.size() > 100) {
                Log.e(TAG, "output queue is full");
                this.outputQueue.clear();
            }
        } catch (Exception e10) {
            Log.e(TAG, "get output buffer error", e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x0090 -> B:21:0x0046). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object proceedOutgoings(ao.d<? super wn.v> r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof com.mirrativ.llstream.encoder.AACEncoder$proceedOutgoings$1
            if (r0 == 0) goto L13
            r0 = r9
            com.mirrativ.llstream.encoder.AACEncoder$proceedOutgoings$1 r0 = (com.mirrativ.llstream.encoder.AACEncoder$proceedOutgoings$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.mirrativ.llstream.encoder.AACEncoder$proceedOutgoings$1 r0 = new com.mirrativ.llstream.encoder.AACEncoder$proceedOutgoings$1
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = bo.c.c()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L42
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            java.lang.Object r2 = r0.L$0
            com.mirrativ.llstream.encoder.AACEncoder r2 = (com.mirrativ.llstream.encoder.AACEncoder) r2
            wn.m.b(r9)
            goto L46
        L30:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L38:
            java.lang.Object r2 = r0.L$0
            com.mirrativ.llstream.encoder.AACEncoder r2 = (com.mirrativ.llstream.encoder.AACEncoder) r2
            wn.m.b(r9)     // Catch: java.lang.Exception -> L40
            goto L46
        L40:
            r9 = move-exception
            goto L78
        L42:
            wn.m.b(r9)
            r2 = r8
        L46:
            boolean r9 = r2.keepAlive
            if (r9 == 0) goto L93
            uo.d2 r9 = r2.dequeueJob
            if (r9 == 0) goto L51
            uo.g2.k(r9)
        L51:
            android.media.MediaCodec r9 = r2.codec     // Catch: java.lang.Exception -> L40
            if (r9 != 0) goto L56
            goto L46
        L56:
            android.media.MediaCodec$BufferInfo r5 = new android.media.MediaCodec$BufferInfo     // Catch: java.lang.Exception -> L40
            r5.<init>()     // Catch: java.lang.Exception -> L40
            r6 = 1000(0x3e8, double:4.94E-321)
            int r6 = r9.dequeueOutputBuffer(r5, r6)     // Catch: java.lang.Exception -> L40
            if (r6 >= 0) goto L70
            r5 = 5
            r0.L$0 = r2     // Catch: java.lang.Exception -> L40
            r0.label = r4     // Catch: java.lang.Exception -> L40
            java.lang.Object r9 = uo.b1.a(r5, r0)     // Catch: java.lang.Exception -> L40
            if (r9 != r1) goto L46
            return r1
        L70:
            r2.onOutputBufferAvailable(r9, r6, r5)     // Catch: java.lang.Exception -> L40
            r5 = 0
            r9.releaseOutputBuffer(r6, r5)     // Catch: java.lang.Exception -> L40
            goto L86
        L78:
            r5 = 3
            java.lang.String r6 = "AACEncoder"
            boolean r5 = android.util.Log.isLoggable(r6, r5)
            if (r5 == 0) goto L86
            java.lang.String r5 = "dequeueOutputBuffer error"
            android.util.Log.d(r6, r5, r9)
        L86:
            r0.L$0 = r2
            r0.label = r3
            r5 = 1
            java.lang.Object r9 = uo.b1.a(r5, r0)
            if (r9 != r1) goto L46
            return r1
        L93:
            wn.v r9 = wn.v.f59242a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mirrativ.llstream.encoder.AACEncoder.proceedOutgoings(ao.d):java.lang.Object");
    }

    private final long timestamp(int i10) {
        return (i10 / 44100.0f) * 1000000.0f;
    }

    @Override // com.mirrativ.llstream.encoder.AudioEncoder
    public void enqueueSampleBuffer(byte[] bArr) {
        p.h(bArr, "data");
        long currentTimeMillis = System.currentTimeMillis() * 1000;
        this.inputQueue.offer((TimeSeriesPacket) new PCMPacket(bArr, currentTimeMillis, currentTimeMillis));
        if (this.inputQueue.size() > 100) {
            Log.e(TAG, "input queue is full");
            this.inputQueue.clear();
        }
    }

    public final MediaCodec getCodec() {
        return this.codec;
    }

    public final q0 getCoroutineScope() {
        return this.coroutineScope;
    }

    public final MediaFormat getFormat() {
        return this.format;
    }

    @Override // com.mirrativ.llstream.encoder.AudioEncoder
    public AudioEncoderListener getListener() {
        return this.listener;
    }

    @Override // com.mirrativ.llstream.encoder.AudioEncoder
    public AudioEncoderSetting getSetting() {
        return this.setting;
    }

    @Override // com.mirrativ.llstream.encoder.AudioEncoder
    public void prepare() {
        try {
            this.format = Companion.createFormat(getSetting().getSamplingRate(), getSetting().getChannelCount(), getSetting().getBitrate());
            MediaCodec createEncoderByType = MediaCodec.createEncoderByType(MimeTypes.AUDIO_AAC);
            this.codec = createEncoderByType;
            if (createEncoderByType != null) {
                createEncoderByType.configure(this.format, (Surface) null, (MediaCrypto) null, 1);
            }
        } catch (Exception e10) {
            Log.e(TAG, "Failed to prepare", e10);
            AudioEncoderListener listener = getListener();
            if (listener != null) {
                listener.onAudioEncoderError(e10);
            }
        }
    }

    public final void release() {
        stopRunning();
        this.inputQueue.clear();
        MediaCodec mediaCodec = this.codec;
        if (mediaCodec != null) {
            mediaCodec.release();
        }
        this.codec = null;
        this.format = null;
        this.encodeDispatcher.close();
        this.outputDispatcher.close();
    }

    public final void setCodec(MediaCodec mediaCodec) {
        this.codec = mediaCodec;
    }

    public final void setFormat(MediaFormat mediaFormat) {
        this.format = mediaFormat;
    }

    @Override // com.mirrativ.llstream.encoder.AudioEncoder
    public void setListener(AudioEncoderListener audioEncoderListener) {
        this.listener = audioEncoderListener;
    }

    @Override // com.mirrativ.llstream.encoder.AudioEncoder
    public void startRunning() {
        d2 d10;
        d2 d11;
        d2 d12;
        try {
            MediaCodec mediaCodec = this.codec;
            if (mediaCodec != null) {
                mediaCodec.start();
            }
            this.keepAlive = true;
            d10 = l.d(this.coroutineScope, this.encodeDispatcher, null, new AACEncoder$startRunning$1(this, null), 2, null);
            this.encodeJob = d10;
            d11 = l.d(this.coroutineScope, this.encodeDispatcher, null, new AACEncoder$startRunning$2(this, null), 2, null);
            this.dequeueJob = d11;
            d12 = l.d(this.coroutineScope, this.outputDispatcher, null, new AACEncoder$startRunning$3(this, null), 2, null);
            this.outputJob = d12;
        } catch (Exception e10) {
            Log.e(TAG, "MediaCodec start error", e10);
            AudioEncoderListener listener = getListener();
            if (listener != null) {
                listener.onAudioEncoderError(e10);
            }
        }
    }

    @Override // com.mirrativ.llstream.encoder.AudioEncoder
    public void stopRunning() {
        this.keepAlive = false;
        try {
            MediaCodec mediaCodec = this.codec;
            if (mediaCodec != null) {
                mediaCodec.stop();
            }
        } catch (Exception e10) {
            if (Log.isLoggable(TAG, 3)) {
                Log.d(TAG, "Failed to stop MediaCodec", e10);
            }
        }
        d2 d2Var = this.encodeJob;
        if (d2Var != null) {
            d2.a.a(d2Var, null, 1, null);
        }
        this.encodeJob = null;
        d2 d2Var2 = this.dequeueJob;
        if (d2Var2 != null) {
            d2.a.a(d2Var2, null, 1, null);
        }
        this.dequeueJob = null;
        d2 d2Var3 = this.outputJob;
        if (d2Var3 != null) {
            d2.a.a(d2Var3, null, 1, null);
        }
        this.outputJob = null;
    }
}
