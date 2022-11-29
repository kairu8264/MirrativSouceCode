package com.dena.showroom.flvplayback.impl;

import android.annotation.TargetApi;
import android.media.AudioTrack;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Log;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.dena.showroom.flvplayback.FLVPlaybackConfig;
import com.dena.showroom.flvplayback.Sample;
import com.dena.showroom.flvplayback.SamplePlayer;
import com.dena.showroom.flvplayback.SamplePlayerDelegate;
import com.dena.showroom.flvplayback.Size;
import com.dena.showroom.flvplayback.impl.FLVPlaybackException;
import com.dena.showroom.flvplayback.impl.util.AACSpecificConfig;
import com.dena.showroom.flvplayback.impl.util.BitrateCounter;
import com.dena.showroom.flvplayback.impl.util.BlackList;
import com.dena.showroom.flvplayback.impl.util.MovingMedian;
import com.dena.showroom.flvplayback.impl.util.Ticker;
import com.dena.showroom.flvplayback.profile.AudioInfo;
import com.dena.showroom.flvplayback.profile.PlaybackProfile;
import com.dena.showroom.flvplayback.profile.TrackProfile;
import com.dena.showroom.flvplayback.profile.VideoInfo;
import com.google.android.exoplayer2.util.MimeTypes;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

@TargetApi(16)
/* loaded from: classes3.dex */
public class DefaultSamplePlayer implements SamplePlayer, SurfaceHolder.Callback {
    public j A;
    public SurfaceHolder B;
    public Surface C;
    public long D;
    public long E;
    public Ticker J;

    /* renamed from: w  reason: collision with root package name */
    public final f f26494w;

    /* renamed from: x  reason: collision with root package name */
    public SamplePlayerDelegate f26495x;

    /* renamed from: y  reason: collision with root package name */
    public boolean f26496y;

    /* renamed from: z  reason: collision with root package name */
    public j f26497z;
    public long F = -1;
    public long G = -1;
    public Size H = new Size(0, 0);
    public final ByteBuffer I = ByteBuffer.allocateDirect(256);
    public int K = 0;
    public long L = 0;

    /* loaded from: classes3.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            DefaultSamplePlayer.this.f26494w.a();
        }
    }

    /* loaded from: classes3.dex */
    public class b implements Runnable {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ SurfaceHolder f26499w;

        public b(SurfaceHolder surfaceHolder) {
            this.f26499w = surfaceHolder;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f26499w != DefaultSamplePlayer.this.B) {
                return;
            }
            DefaultSamplePlayer.this.f26497z.A();
        }
    }

    /* loaded from: classes3.dex */
    public class c implements Runnable {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ SurfaceHolder f26501w;

        public c(SurfaceHolder surfaceHolder) {
            this.f26501w = surfaceHolder;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f26501w == DefaultSamplePlayer.this.B) {
                DefaultSamplePlayer.this.f26497z.y();
            }
        }
    }

    /* loaded from: classes3.dex */
    public class d extends j {

        /* renamed from: q  reason: collision with root package name */
        public volatile AudioTrack f26503q;

        /* renamed from: r  reason: collision with root package name */
        public ByteBuffer[] f26504r;

        /* renamed from: s  reason: collision with root package name */
        public i f26505s;

        /* renamed from: t  reason: collision with root package name */
        public Boolean f26506t;

        /* renamed from: u  reason: collision with root package name */
        public ConcurrentLinkedQueue<g> f26507u;

        /* renamed from: v  reason: collision with root package name */
        public h f26508v;

        public d(Looper looper) {
            super(2, looper);
            this.f26506t = Boolean.FALSE;
            this.f26507u = new ConcurrentLinkedQueue<>();
            this.f26508v = new h(16);
        }

        public void C(Boolean bool) {
            i iVar = this.f26505s;
            if (iVar != null) {
                iVar.b(bool);
            }
            this.f26506t = bool;
        }

        @Override // com.dena.showroom.flvplayback.impl.DefaultSamplePlayer.j
        public void d(e eVar, boolean z10) {
            try {
                if (this.f26503q != null && z10) {
                    if (this.f26504r == null) {
                        this.f26504r = this.f26523a.getOutputBuffers();
                    }
                    ByteBuffer byteBuffer = this.f26504r[eVar.f26511b];
                    int position = byteBuffer.position();
                    int i10 = eVar.f26512c;
                    byteBuffer.duplicate().get(new byte[i10], 0, i10);
                    while (true) {
                        if (i10 <= 0) {
                            break;
                        }
                        g a10 = this.f26508v.a();
                        if (a10 == null) {
                            Log.w(Factory.TAG, "PCM buffer overflow");
                            break;
                        } else {
                            i10 -= a10.a(byteBuffer, i10);
                            this.f26507u.offer(a10);
                        }
                    }
                    byteBuffer.position(position);
                }
            } finally {
                this.f26523a.releaseOutputBuffer(eVar.f26511b, false);
            }
        }

        @Override // com.dena.showroom.flvplayback.impl.DefaultSamplePlayer.j
        public void i(ByteBuffer[] byteBufferArr) {
            this.f26504r = byteBufferArr;
        }

        @Override // com.dena.showroom.flvplayback.impl.DefaultSamplePlayer.j
        public boolean t(byte[] bArr) {
            try {
                AACSpecificConfig parse = AACSpecificConfig.parse(bArr);
                try {
                    MediaFormat createAudioFormat = MediaFormat.createAudioFormat(MimeTypes.AUDIO_AAC, parse.getSamplingFrequency(), parse.getChannelCount());
                    createAudioFormat.setInteger("max-input-size", 2048);
                    MediaCodec createDecoderByType = MediaCodec.createDecoderByType(MimeTypes.AUDIO_AAC);
                    this.f26523a = createDecoderByType;
                    createDecoderByType.configure(createAudioFormat, (Surface) null, (MediaCrypto) null, 0);
                    this.f26523a.start();
                    return true;
                } catch (Exception e10) {
                    DefaultSamplePlayer.this.o(new FLVPlaybackException(FLVPlaybackException.Event.FAILED_TO_SETUP_AUDIO, e10), true);
                    return false;
                }
            } catch (IllegalArgumentException unused) {
                Log.e(Factory.TAG, "Failed to parse AAC specific config!");
                return false;
            }
        }

        @Override // com.dena.showroom.flvplayback.impl.DefaultSamplePlayer.j
        public void v() {
            MediaFormat outputFormat = this.f26523a.getOutputFormat();
            int i10 = outputFormat.getInteger("channel-count") == 1 ? 4 : 12;
            int integer = outputFormat.getInteger("sample-rate");
            this.f26503q = new AudioTrack(3, integer, i10, 2, AudioTrack.getMinBufferSize(integer, i10, 2), 1);
            this.f26503q.play();
            i iVar = new i(this.f26507u, this.f26503q);
            this.f26505s = iVar;
            iVar.b(this.f26506t);
            this.f26505s.start();
        }

        @Override // com.dena.showroom.flvplayback.impl.DefaultSamplePlayer.j
        public boolean w(byte[] bArr) {
            return true;
        }

        @Override // com.dena.showroom.flvplayback.impl.DefaultSamplePlayer.j
        public void y() {
            i iVar = this.f26505s;
            if (iVar != null) {
                iVar.a();
                this.f26505s = null;
            }
            if (this.f26503q != null) {
                this.f26503q.release();
                this.f26503q = null;
            }
            this.f26508v.b();
            super.y();
        }
    }

    /* loaded from: classes3.dex */
    public static class e {

        /* renamed from: a  reason: collision with root package name */
        public final long f26510a;

        /* renamed from: b  reason: collision with root package name */
        public final int f26511b;

        /* renamed from: c  reason: collision with root package name */
        public final int f26512c;

        /* renamed from: d  reason: collision with root package name */
        public final boolean f26513d;

        public e(long j10, int i10, int i11, int i12, long j11, boolean z10) {
            this.f26510a = j10;
            this.f26511b = i10;
            this.f26512c = i11;
            this.f26513d = z10;
        }
    }

    /* loaded from: classes3.dex */
    public static class f extends Handler {

        /* renamed from: a  reason: collision with root package name */
        public WeakReference<DefaultSamplePlayer> f26514a;

        public f(DefaultSamplePlayer defaultSamplePlayer, Looper looper) {
            super(looper);
            this.f26514a = new WeakReference<>(defaultSamplePlayer);
        }

        public void a() {
            if (hasMessages(1000)) {
                return;
            }
            sendEmptyMessage(1000);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message != null && 1000 == message.what) {
                DefaultSamplePlayer defaultSamplePlayer = this.f26514a.get();
                if (defaultSamplePlayer != null) {
                    defaultSamplePlayer.I();
                    return;
                }
                return;
            }
            super.handleMessage(message);
        }
    }

    /* loaded from: classes3.dex */
    public static class h {

        /* renamed from: a  reason: collision with root package name */
        public ArrayList<g> f26518a;

        public h(int i10) {
            this.f26518a = new ArrayList<>(i10);
            for (int i11 = 0; i11 < i10; i11++) {
                this.f26518a.add(new g(null));
            }
        }

        public g a() {
            Iterator<g> it = this.f26518a.iterator();
            while (it.hasNext()) {
                g next = it.next();
                if (next.c()) {
                    return next;
                }
            }
            return null;
        }

        public void b() {
            Iterator<g> it = this.f26518a.iterator();
            while (it.hasNext()) {
                it.next().d();
            }
        }
    }

    /* loaded from: classes3.dex */
    public static class i extends Thread {
        public Boolean A;
        public byte[] B;

        /* renamed from: w  reason: collision with root package name */
        public Queue<g> f26519w;

        /* renamed from: x  reason: collision with root package name */
        public WeakReference<AudioTrack> f26520x;

        /* renamed from: y  reason: collision with root package name */
        public boolean f26521y;

        /* renamed from: z  reason: collision with root package name */
        public final Object f26522z;

        public i(Queue queue, AudioTrack audioTrack) {
            super("RenderThread");
            this.f26522z = new Object();
            this.A = Boolean.FALSE;
            this.f26519w = queue;
            this.f26520x = new WeakReference<>(audioTrack);
            byte[] bArr = new byte[4096];
            this.B = bArr;
            Arrays.fill(bArr, (byte) 0);
        }

        public void a() {
            synchronized (this.f26522z) {
                this.f26521y = true;
                this.f26522z.notifyAll();
            }
        }

        public void b(Boolean bool) {
            this.A = bool;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            while (!this.f26521y) {
                try {
                    if (!this.f26519w.isEmpty()) {
                        g poll = this.f26519w.poll();
                        AudioTrack audioTrack = this.f26520x.get();
                        if (audioTrack != null) {
                            if (this.A.booleanValue()) {
                                audioTrack.write(this.B, 0, poll.e());
                            } else {
                                audioTrack.write(poll.b(), 0, poll.e());
                            }
                        }
                        poll.d();
                    } else {
                        synchronized (this.f26522z) {
                            try {
                                this.f26522z.wait(10L);
                            } catch (InterruptedException unused) {
                            }
                        }
                    }
                } catch (RuntimeException e10) {
                    Log.e(Factory.TAG, "[player] error.", e10);
                }
            }
        }

        @Override // java.lang.Thread
        public synchronized void start() {
            this.f26521y = false;
            super.start();
        }
    }

    /* loaded from: classes3.dex */
    public abstract class j {

        /* renamed from: a  reason: collision with root package name */
        public MediaCodec f26523a;

        /* renamed from: b  reason: collision with root package name */
        public ByteBuffer[] f26524b;

        /* renamed from: c  reason: collision with root package name */
        public final int f26525c;

        /* renamed from: d  reason: collision with root package name */
        public Handler f26526d;

        /* renamed from: e  reason: collision with root package name */
        public byte[] f26527e;

        /* renamed from: i  reason: collision with root package name */
        public long f26531i;

        /* renamed from: m  reason: collision with root package name */
        public MovingMedian<Integer> f26535m;

        /* renamed from: n  reason: collision with root package name */
        public boolean f26536n;

        /* renamed from: f  reason: collision with root package name */
        public ArrayDeque<e> f26528f = new ArrayDeque<>();

        /* renamed from: g  reason: collision with root package name */
        public ArrayDeque<e> f26529g = new ArrayDeque<>();

        /* renamed from: h  reason: collision with root package name */
        public ArrayDeque<Long> f26530h = new ArrayDeque<>();

        /* renamed from: j  reason: collision with root package name */
        public int f26532j = 0;

        /* renamed from: k  reason: collision with root package name */
        public int f26533k = 0;

        /* renamed from: l  reason: collision with root package name */
        public BitrateCounter f26534l = new BitrateCounter();

        /* renamed from: o  reason: collision with root package name */
        public Runnable f26537o = new a();

        /* loaded from: classes3.dex */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    j.this.d((e) j.this.f26529g.removeFirst(), true);
                } catch (IllegalStateException e10) {
                    Log.w(Factory.TAG, "Failed to render", e10);
                }
            }
        }

        public j(int i10, Looper looper) {
            this.f26525c = i10;
            this.f26526d = new Handler(looper);
        }

        public boolean A() {
            if (this.f26527e == null) {
                return false;
            }
            y();
            if (t(this.f26527e)) {
                this.f26536n = true;
                return true;
            }
            return false;
        }

        public void B() {
            this.f26526d.removeCallbacksAndMessages(null);
            if (this.f26523a != null) {
                try {
                    Iterator<e> it = this.f26528f.iterator();
                    while (it.hasNext()) {
                        d(it.next(), false);
                    }
                    Iterator<e> it2 = this.f26529g.iterator();
                    while (it2.hasNext()) {
                        d(it2.next(), false);
                    }
                } catch (IllegalStateException e10) {
                    Log.w(Factory.TAG, "Failed to clear a rendering queue", e10);
                }
            }
            this.f26528f.clear();
            this.f26529g.clear();
        }

        public void b() {
            this.f26527e = null;
            y();
        }

        public void c(long j10) {
            if (this.f26523a == null) {
                if (DefaultSamplePlayer.this.f26495x != null) {
                    DefaultSamplePlayer.this.f26495x.dequeueSample(null, this.f26525c, null);
                    return;
                }
                return;
            }
            h(false, 0L);
            MediaCodec mediaCodec = this.f26523a;
            if (mediaCodec == null) {
                return;
            }
            if (j(mediaCodec, this.f26528f, this.f26530h, -DefaultSamplePlayer.this.F)) {
                v();
            }
            s(j10 - n());
            o(j10);
        }

        public abstract void d(e eVar, boolean z10);

        public final void f(Runnable runnable, long j10, long j11) {
            long j12 = j10 - j11;
            if (j12 > 0) {
                this.f26526d.postDelayed(runnable, j12);
            } else {
                this.f26526d.post(runnable);
            }
        }

        public final void g(ByteBuffer byteBuffer) {
            if (!this.f26536n) {
                if (DefaultSamplePlayer.this.f26495x != null) {
                    DefaultSamplePlayer.this.f26495x.dequeueSample(DefaultSamplePlayer.this, this.f26525c, byteBuffer);
                }
                this.f26534l.update(byteBuffer.position());
                return;
            }
            this.f26536n = false;
            byteBuffer.put(this.f26527e);
        }

        public final void h(boolean z10, long j10) {
            long j11 = -1;
            while (true) {
                Sample q10 = q();
                if (q10 == null) {
                    if (!z10 || j11 == -1) {
                        return;
                    }
                    DefaultSamplePlayer.this.L(j11);
                    return;
                }
                int dequeueInputBuffer = this.f26523a.dequeueInputBuffer(0L);
                if (dequeueInputBuffer == -1) {
                    return;
                }
                if (this.f26524b == null) {
                    this.f26524b = this.f26523a.getInputBuffers();
                }
                ByteBuffer byteBuffer = this.f26524b[dequeueInputBuffer];
                byteBuffer.position(0);
                g(byteBuffer);
                if (!q10.isConfig()) {
                    DefaultSamplePlayer defaultSamplePlayer = DefaultSamplePlayer.this;
                    long pts = q10.pts();
                    defaultSamplePlayer.z(pts);
                    this.f26530h.addLast(Long.valueOf(SystemClock.uptimeMillis()));
                    j11 = pts;
                }
                this.f26523a.queueInputBuffer(dequeueInputBuffer, 0, byteBuffer.position(), 1000 * (q10.pts() + j10), DefaultSamplePlayer.this.E(q10.getFlag()));
            }
        }

        public void i(ByteBuffer[] byteBufferArr) {
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0019, code lost:
            i(r18.getOutputBuffers());
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final boolean j(android.media.MediaCodec r18, java.util.ArrayDeque<com.dena.showroom.flvplayback.impl.DefaultSamplePlayer.e> r19, java.util.ArrayDeque<java.lang.Long> r20, long r21) {
            /*
                r17 = this;
                r1 = r17
                android.media.MediaCodec$BufferInfo r0 = new android.media.MediaCodec$BufferInfo
                r0.<init>()
            L7:
                r2 = 0
                r3 = 1
                r4 = r2
            La:
                r5 = 0
                r7 = r18
                int r5 = r7.dequeueOutputBuffer(r0, r5)     // Catch: java.util.NoSuchElementException -> L5e java.lang.IllegalStateException -> L65
                r6 = -1
                if (r5 != r6) goto L16
                goto L20
            L16:
                r6 = -3
                if (r5 != r6) goto L21
                java.nio.ByteBuffer[] r0 = r18.getOutputBuffers()     // Catch: java.util.NoSuchElementException -> L5e java.lang.IllegalStateException -> L65
                r1.i(r0)     // Catch: java.util.NoSuchElementException -> L5e java.lang.IllegalStateException -> L65
            L20:
                return r4
            L21:
                if (r5 < 0) goto L55
                long r8 = android.os.SystemClock.uptimeMillis()     // Catch: java.util.NoSuchElementException -> L5e java.lang.IllegalStateException -> L65
                java.lang.Object r6 = r20.removeFirst()     // Catch: java.util.NoSuchElementException -> L5e java.lang.IllegalStateException -> L65
                java.lang.Long r6 = (java.lang.Long) r6     // Catch: java.util.NoSuchElementException -> L5e java.lang.IllegalStateException -> L65
                long r10 = r6.longValue()     // Catch: java.util.NoSuchElementException -> L5e java.lang.IllegalStateException -> L65
                long r14 = r8 - r10
                com.dena.showroom.flvplayback.impl.DefaultSamplePlayer$e r6 = new com.dena.showroom.flvplayback.impl.DefaultSamplePlayer$e     // Catch: java.util.NoSuchElementException -> L5e java.lang.IllegalStateException -> L65
                long r8 = r0.presentationTimeUs     // Catch: java.util.NoSuchElementException -> L5e java.lang.IllegalStateException -> L65
                r10 = 1000(0x3e8, double:4.94E-321)
                long r8 = r8 / r10
                long r9 = r8 + r21
                int r12 = r0.size     // Catch: java.util.NoSuchElementException -> L5e java.lang.IllegalStateException -> L65
                int r13 = r0.offset     // Catch: java.util.NoSuchElementException -> L5e java.lang.IllegalStateException -> L65
                int r8 = r0.flags     // Catch: java.util.NoSuchElementException -> L5e java.lang.IllegalStateException -> L65
                r8 = r8 & r3
                if (r8 == 0) goto L48
                r16 = r3
                goto L4a
            L48:
                r16 = r2
            L4a:
                r8 = r6
                r11 = r5
                r8.<init>(r9, r11, r12, r13, r14, r16)     // Catch: java.util.NoSuchElementException -> L5e java.lang.IllegalStateException -> L65
                r8 = r19
                r8.addLast(r6)     // Catch: java.util.NoSuchElementException -> L5e java.lang.IllegalStateException -> L65
                goto L57
            L55:
                r8 = r19
            L57:
                if (r4 != 0) goto L5c
                r4 = -2
                if (r5 != r4) goto L7
            L5c:
                r4 = r3
                goto La
            L5e:
                r0 = move-exception
                com.dena.showroom.flvplayback.impl.DefaultSamplePlayer r4 = com.dena.showroom.flvplayback.impl.DefaultSamplePlayer.this
                com.dena.showroom.flvplayback.impl.DefaultSamplePlayer.j(r4, r0, r3)
                goto L6d
            L65:
                r0 = move-exception
                java.lang.String r3 = "flvplayback"
                java.lang.String r4 = "Maybe surface is invalid."
                android.util.Log.w(r3, r4, r0)
            L6d:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.dena.showroom.flvplayback.impl.DefaultSamplePlayer.j.j(android.media.MediaCodec, java.util.ArrayDeque, java.util.ArrayDeque, long):boolean");
        }

        public boolean k(byte[] bArr) {
            byte[] bArr2 = this.f26527e;
            return bArr2 == null || !Arrays.equals(bArr2, bArr);
        }

        public long n() {
            return DefaultSamplePlayer.this.E + DefaultSamplePlayer.this.D;
        }

        public void o(long j10) {
            while (!this.f26528f.isEmpty()) {
                this.f26529g.addLast(this.f26528f.removeFirst());
                f(this.f26537o, n() + this.f26529g.getLast().f26510a, j10);
                this.f26532j++;
            }
        }

        public boolean p(byte[] bArr) {
            this.f26527e = bArr;
            Log.i(Factory.TAG, "[player] " + this.f26525c + " - reset config");
            return !w(bArr) || A();
        }

        public final Sample q() {
            Sample lastSample;
            if (!this.f26536n) {
                if (DefaultSamplePlayer.this.f26495x != null) {
                    while (true) {
                        lastSample = DefaultSamplePlayer.this.f26495x.getLastSample(null, this.f26525c);
                        if (lastSample == null) {
                            break;
                        } else if (lastSample.isConfig()) {
                            DefaultSamplePlayer.this.I.clear();
                            DefaultSamplePlayer.this.f26495x.dequeueSample(null, this.f26525c, DefaultSamplePlayer.this.I);
                            byte[] bArr = new byte[DefaultSamplePlayer.this.I.position()];
                            DefaultSamplePlayer.this.I.flip();
                            DefaultSamplePlayer.this.I.get(bArr);
                            if (!k(bArr)) {
                                Log.i(Factory.TAG, "[player(track=" + this.f26525c + ")] A decoder config received, but ignored.");
                            } else if (!p(bArr)) {
                                return null;
                            }
                        } else if (this.f26523a != null) {
                            break;
                        } else {
                            DefaultSamplePlayer.this.f26495x.dequeueSample(null, this.f26525c, null);
                        }
                    }
                    return lastSample;
                }
                return null;
            }
            return new Sample(0L, 0L, 1L, this.f26527e.length);
        }

        public final void s(long j10) {
        }

        public abstract boolean t(byte[] bArr);

        public abstract void v();

        public boolean w(byte[] bArr) {
            return this.f26523a == null || !BlackList.canChangeVideoResolution();
        }

        public void y() {
            this.f26524b = null;
            MediaCodec mediaCodec = this.f26523a;
            if (mediaCodec != null) {
                mediaCodec.release();
                this.f26523a = null;
            }
            B();
        }
    }

    /* loaded from: classes3.dex */
    public class k extends j {

        /* renamed from: q  reason: collision with root package name */
        public boolean f26540q;

        /* renamed from: r  reason: collision with root package name */
        public boolean f26541r;

        public k(Looper looper, boolean z10) {
            super(1, looper);
            if (BlackList.decoderTellsSyncFrame()) {
                this.f26540q = z10;
            }
        }

        @Override // com.dena.showroom.flvplayback.impl.DefaultSamplePlayer.j
        public void d(e eVar, boolean z10) {
            boolean z11 = true;
            if (!this.f26541r && eVar.f26513d) {
                this.f26541r = true;
            }
            if (DefaultSamplePlayer.this.K < 5 && DefaultSamplePlayer.this.f26495x != null) {
                DefaultSamplePlayer.this.f26495x.onVideoRendered(DefaultSamplePlayer.X(DefaultSamplePlayer.this));
            }
            MediaCodec mediaCodec = this.f26523a;
            int i10 = eVar.f26511b;
            if (!z10 || (this.f26540q && !this.f26541r)) {
                z11 = false;
            }
            mediaCodec.releaseOutputBuffer(i10, z11);
        }

        @Override // com.dena.showroom.flvplayback.impl.DefaultSamplePlayer.j
        public boolean t(byte[] bArr) {
            Surface surface;
            if ((DefaultSamplePlayer.this.B == null || (surface = DefaultSamplePlayer.this.B.getSurface()) == null) && (surface = DefaultSamplePlayer.this.C) == null) {
                return false;
            }
            try {
                MediaFormat createVideoFormat = MediaFormat.createVideoFormat(MimeTypes.VIDEO_H264, 432, 768);
                createVideoFormat.setInteger("max-input-size", 0);
                MediaCodec createDecoderByType = MediaCodec.createDecoderByType(MimeTypes.VIDEO_H264);
                this.f26523a = createDecoderByType;
                createDecoderByType.configure(createVideoFormat, surface, (MediaCrypto) null, 0);
                this.f26523a.start();
                return true;
            } catch (Exception e10) {
                DefaultSamplePlayer.this.o(new FLVPlaybackException(FLVPlaybackException.Event.FAILED_TO_SETUP_VIDEO, e10), true);
                return false;
            }
        }

        @Override // com.dena.showroom.flvplayback.impl.DefaultSamplePlayer.j
        public void v() {
            MediaFormat outputFormat = this.f26523a.getOutputFormat();
            Size size = new Size(DefaultSamplePlayer.p(outputFormat, "crop-left", "crop-right", "width"), DefaultSamplePlayer.p(outputFormat, "crop-top", "crop-bottom", "height"));
            this.f26541r = false;
            if (DefaultSamplePlayer.this.H.equals(size)) {
                return;
            }
            DefaultSamplePlayer.this.H = size;
            if (DefaultSamplePlayer.this.f26495x != null) {
                DefaultSamplePlayer.this.f26495x.onVideoSizeChanged(DefaultSamplePlayer.this);
            }
        }
    }

    public DefaultSamplePlayer(Looper looper, FLVPlaybackConfig fLVPlaybackConfig) {
        this.f26494w = new f(this, looper);
        this.f26497z = new k(looper, fLVPlaybackConfig.playsAfterKeyframeCome());
        this.A = new d(looper);
        clear();
        Ticker ticker = new Ticker(15, new a());
        this.J = ticker;
        ticker.start();
    }

    public static /* synthetic */ int X(DefaultSamplePlayer defaultSamplePlayer) {
        int i10 = defaultSamplePlayer.K;
        defaultSamplePlayer.K = i10 + 1;
        return i10;
    }

    public static int p(MediaFormat mediaFormat, String str, String str2, String str3) {
        return (mediaFormat.containsKey(str2) && mediaFormat.containsKey(str)) ? (mediaFormat.getInteger(str2) - mediaFormat.getInteger(str)) + 1 : mediaFormat.getInteger(str3);
    }

    public final int E(long j10) {
        if ((1 & j10) != 0) {
            return 2;
        }
        return (j10 & 2) != 0 ? 1 : 0;
    }

    public final void I() {
        if (this.f26496y) {
            return;
        }
        long q10 = q() - this.L;
        if (q10 > 100) {
            Log.i(Factory.TAG, "[omg] ------- " + q10);
        }
        if (this.F != -1) {
            h(q());
        }
        this.L = q();
    }

    public final void L(long j10) {
        long q10 = q() - (j10 - this.F);
        if (this.D < q10) {
            this.D = q10 * 2;
            Log.i(Factory.TAG, "networkDelay updated - n/d=" + this.D + "/" + this.E);
        }
    }

    @Override // com.dena.showroom.flvplayback.SamplePlayer
    public void clear() {
        this.f26497z.b();
        this.A.b();
        e();
    }

    @Override // com.dena.showroom.flvplayback.Closeable, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f26496y = true;
        this.J.quit();
        clear();
        SurfaceHolder surfaceHolder = this.B;
        if (surfaceHolder != null) {
            surfaceHolder.removeCallback(this);
        }
        this.f26494w.removeCallbacksAndMessages(null);
    }

    public final void e() {
        this.f26497z.f26531i = -1L;
        this.A.f26531i = -1L;
        this.F = -1L;
        this.G = -1L;
        this.D = 0L;
        this.E = 500L;
        this.f26497z.B();
        this.A.B();
    }

    @Override // com.dena.showroom.flvplayback.impl.ThreadingPolicy.LooperAware
    public Looper getLooper() {
        return this.f26494w.getLooper();
    }

    @Override // com.dena.showroom.flvplayback.SamplePlayer
    public Size getResolution() {
        return this.H;
    }

    public final void h(long j10) {
        if (this.D > 15000) {
            n(FLVPlaybackException.Event.TOO_LONG_NETWORK_DELAY, true);
            return;
        }
        try {
            this.f26497z.c(j10);
            this.A.c(j10);
        } catch (IllegalStateException e10) {
            o(e10, true);
        }
    }

    public final void n(FLVPlaybackException.Event event, boolean z10) {
        o(new FLVPlaybackException(event, queryPlaybackProfile()), z10);
    }

    public final void o(Throwable th2, boolean z10) {
        Log.e(Factory.TAG, "[player] crashed.", th2);
        close();
        SamplePlayerDelegate samplePlayerDelegate = this.f26495x;
        if (samplePlayerDelegate != null) {
            samplePlayerDelegate.onCrash(this, th2);
        }
    }

    public final long q() {
        return SystemClock.uptimeMillis() - this.G;
    }

    @Override // com.dena.showroom.flvplayback.SamplePlayer
    public PlaybackProfile queryPlaybackProfile() {
        int intValue;
        ArrayList arrayList = new ArrayList();
        j jVar = this.f26497z;
        if (jVar.f26523a != null) {
            AACSpecificConfig parse = AACSpecificConfig.parse(jVar.f26527e);
            arrayList.add(new TrackProfile(this.A.f26533k, this.A.f26532j, (int) this.A.f26534l.bps(), new AudioInfo(parse.getSamplingFrequency(), parse.getChannelCount())));
        }
        j jVar2 = this.f26497z;
        if (jVar2.f26523a != null) {
            MovingMedian movingMedian = jVar2.f26535m;
            long j10 = this.f26497z.f26533k;
            long j11 = this.f26497z.f26532j;
            int bps = (int) this.f26497z.f26534l.bps();
            if (movingMedian == null) {
                intValue = 0;
            } else {
                intValue = 1000 / (((Integer) movingMedian.getOr(1)).intValue() > 0 ? ((Integer) movingMedian.getOr(1)).intValue() : 1);
            }
            arrayList.add(new TrackProfile(j10, j11, bps, new VideoInfo(intValue, this.H)));
        }
        return new PlaybackProfile(arrayList, this.D, this.E);
    }

    @Override // com.dena.showroom.flvplayback.SamplePlayer
    public void setDelegate(SamplePlayerDelegate samplePlayerDelegate) {
        this.f26495x = samplePlayerDelegate;
    }

    @Override // com.dena.showroom.flvplayback.SamplePlayer
    public void setDisplay(SurfaceHolder surfaceHolder) {
        if (this.f26496y) {
            Log.w(Factory.TAG, "`setDisplay` called after close");
            return;
        }
        SurfaceHolder surfaceHolder2 = this.B;
        if (surfaceHolder2 == surfaceHolder) {
            return;
        }
        if (surfaceHolder2 != null) {
            surfaceHolder2.removeCallback(this);
            this.f26497z.y();
        }
        this.B = surfaceHolder;
        if (surfaceHolder != null) {
            surfaceHolder.addCallback(this);
            this.f26497z.A();
        }
    }

    @Override // com.dena.showroom.flvplayback.SamplePlayer
    public void setMute(Boolean bool) {
        j jVar = this.A;
        if (jVar != null) {
            ((d) jVar).C(bool);
        }
    }

    @Override // com.dena.showroom.flvplayback.SamplePlayer
    public void setSurface(Surface surface) {
        if (this.f26496y) {
            Log.w(Factory.TAG, "`setSurface` called after close");
            return;
        }
        Surface surface2 = this.C;
        if (surface2 == surface) {
            return;
        }
        if (surface2 != null) {
            this.f26497z.y();
        }
        this.C = surface;
        if (surface != null) {
            this.f26497z.A();
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i10, int i11, int i12) {
        surfaceCreated(surfaceHolder);
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        this.f26494w.postAtFrontOfQueue(new b(surfaceHolder));
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        this.f26494w.postAtFrontOfQueue(new c(surfaceHolder));
    }

    @Override // com.dena.showroom.flvplayback.SamplePlayer
    public void triggerDecoderLoop() {
        try {
            this.f26497z.h(true, 0L);
            this.A.h(true, 0L);
        } catch (IllegalStateException e10) {
            o(e10, true);
        } catch (Exception e11) {
            o(e11, true);
        }
    }

    public final void z(long j10) {
        if (this.F == -1 || 15000 <= Math.abs(q() - (j10 - this.F))) {
            e();
            this.F = j10;
            this.G = SystemClock.uptimeMillis();
            Log.w(Factory.TAG, "[player] timestamp reset");
        }
    }

    /* loaded from: classes3.dex */
    public static class g {

        /* renamed from: a  reason: collision with root package name */
        public byte[] f26515a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f26516b;

        /* renamed from: c  reason: collision with root package name */
        public int f26517c;

        public g() {
            this.f26515a = new byte[4096];
            this.f26516b = false;
        }

        public synchronized int a(ByteBuffer byteBuffer, int i10) {
            int min = Math.min(i10, 4096);
            this.f26517c = min;
            byteBuffer.get(this.f26515a, 0, min);
            return this.f26517c;
        }

        public synchronized byte[] b() {
            return this.f26515a;
        }

        public synchronized boolean c() {
            if (this.f26516b) {
                return false;
            }
            this.f26516b = true;
            return true;
        }

        public synchronized void d() {
            this.f26516b = false;
        }

        public synchronized int e() {
            if (this.f26516b) {
                return this.f26517c;
            }
            return 0;
        }

        public /* synthetic */ g(a aVar) {
            this();
        }
    }
}
