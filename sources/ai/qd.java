package ai;

import android.media.AudioTrack;
import android.os.ConditionVariable;
import android.os.SystemClock;
import android.support.v4.media.session.PlaybackStateCompat;
import android.util.Log;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.google.android.gms.internal.ads.zzaoo;
import com.google.android.gms.internal.ads.zzaos;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.LinkedList;

/* loaded from: classes3.dex */
public final class qd {
    public Method A;
    public int B;
    public long C;
    public long D;
    public int E;
    public long F;
    public long G;
    public int H;
    public int I;
    public long J;
    public long K;
    public long L;
    public float M;
    public bd[] N;
    public ByteBuffer[] O;
    public ByteBuffer P;
    public ByteBuffer Q;
    public byte[] R;
    public int S;
    public int T;
    public boolean U;
    public boolean V;
    public int W;
    public boolean X;
    public long Y;

    /* renamed from: a  reason: collision with root package name */
    public final rd f8874a;

    /* renamed from: b  reason: collision with root package name */
    public final yd f8875b;

    /* renamed from: c  reason: collision with root package name */
    public final bd[] f8876c;

    /* renamed from: d  reason: collision with root package name */
    public final nd f8877d;

    /* renamed from: e  reason: collision with root package name */
    public final ConditionVariable f8878e = new ConditionVariable(true);

    /* renamed from: f  reason: collision with root package name */
    public final long[] f8879f;

    /* renamed from: g  reason: collision with root package name */
    public final ld f8880g;

    /* renamed from: h  reason: collision with root package name */
    public final LinkedList<pd> f8881h;

    /* renamed from: i  reason: collision with root package name */
    public AudioTrack f8882i;

    /* renamed from: j  reason: collision with root package name */
    public int f8883j;

    /* renamed from: k  reason: collision with root package name */
    public int f8884k;

    /* renamed from: l  reason: collision with root package name */
    public int f8885l;

    /* renamed from: m  reason: collision with root package name */
    public int f8886m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f8887n;

    /* renamed from: o  reason: collision with root package name */
    public int f8888o;

    /* renamed from: p  reason: collision with root package name */
    public long f8889p;

    /* renamed from: q  reason: collision with root package name */
    public qc f8890q;

    /* renamed from: r  reason: collision with root package name */
    public qc f8891r;

    /* renamed from: s  reason: collision with root package name */
    public long f8892s;

    /* renamed from: t  reason: collision with root package name */
    public long f8893t;

    /* renamed from: u  reason: collision with root package name */
    public int f8894u;

    /* renamed from: v  reason: collision with root package name */
    public int f8895v;

    /* renamed from: w  reason: collision with root package name */
    public long f8896w;

    /* renamed from: x  reason: collision with root package name */
    public long f8897x;

    /* renamed from: y  reason: collision with root package name */
    public boolean f8898y;

    /* renamed from: z  reason: collision with root package name */
    public long f8899z;

    public qd(zc zcVar, bd[] bdVarArr, nd ndVar) {
        this.f8877d = ndVar;
        if (vj.f11100a >= 18) {
            try {
                this.A = AudioTrack.class.getMethod("getLatency", null);
            } catch (NoSuchMethodException unused) {
            }
        }
        if (vj.f11100a >= 19) {
            this.f8880g = new md();
        } else {
            this.f8880g = new ld(null);
        }
        rd rdVar = new rd();
        this.f8874a = rdVar;
        yd ydVar = new yd();
        this.f8875b = ydVar;
        this.f8876c = r1;
        System.arraycopy(bdVarArr, 0, r1, 2, 0);
        bd[] bdVarArr2 = {new vd(), rdVar, ydVar};
        this.f8879f = new long[10];
        this.M = 1.0f;
        this.I = 0;
        this.W = 0;
        this.f8891r = qc.f8867d;
        this.T = -1;
        this.N = new bd[0];
        this.O = new ByteBuffer[0];
        this.f8881h = new LinkedList<>();
    }

    public final long b(boolean z10) {
        long e10;
        long j10;
        long j11;
        long j12;
        long j13;
        qc qcVar;
        long j14;
        long j15;
        Method method;
        if (!u() || this.I == 0) {
            return Long.MIN_VALUE;
        }
        if (this.f8882i.getPlayState() == 3) {
            long e11 = this.f8880g.e();
            if (e11 != 0) {
                long nanoTime = System.nanoTime() / 1000;
                if (nanoTime - this.f8897x >= 30000) {
                    long[] jArr = this.f8879f;
                    int i10 = this.f8894u;
                    jArr[i10] = e11 - nanoTime;
                    this.f8894u = (i10 + 1) % 10;
                    int i11 = this.f8895v;
                    if (i11 < 10) {
                        this.f8895v = i11 + 1;
                    }
                    this.f8897x = nanoTime;
                    this.f8896w = 0L;
                    int i12 = 0;
                    while (true) {
                        int i13 = this.f8895v;
                        if (i12 >= i13) {
                            break;
                        }
                        this.f8896w += this.f8879f[i12] / i13;
                        i12++;
                    }
                }
                if (!z() && nanoTime - this.f8899z >= 500000) {
                    boolean f10 = this.f8880g.f();
                    this.f8898y = f10;
                    if (f10) {
                        long g10 = this.f8880g.g() / 1000;
                        long h10 = this.f8880g.h();
                        if (g10 < this.K) {
                            this.f8898y = false;
                        } else if (Math.abs(g10 - nanoTime) > 5000000) {
                            StringBuilder sb2 = new StringBuilder(136);
                            sb2.append("Spurious audio timestamp (system clock mismatch): ");
                            sb2.append(h10);
                            sb2.append(", ");
                            sb2.append(g10);
                            sb2.append(", ");
                            sb2.append(nanoTime);
                            sb2.append(", ");
                            sb2.append(e11);
                            Log.w("AudioTrack", sb2.toString());
                            this.f8898y = false;
                        } else if (Math.abs(v(h10) - e11) > 5000000) {
                            StringBuilder sb3 = new StringBuilder((int) TsExtractor.TS_STREAM_TYPE_DTS);
                            sb3.append("Spurious audio timestamp (frame position mismatch): ");
                            sb3.append(h10);
                            sb3.append(", ");
                            sb3.append(g10);
                            sb3.append(", ");
                            sb3.append(nanoTime);
                            sb3.append(", ");
                            sb3.append(e11);
                            Log.w("AudioTrack", sb3.toString());
                            this.f8898y = false;
                        }
                    }
                    if (this.A != null && !this.f8887n) {
                        try {
                            long intValue = (((Integer) method.invoke(this.f8882i, null)).intValue() * 1000) - this.f8889p;
                            this.L = intValue;
                            long max = Math.max(intValue, 0L);
                            this.L = max;
                            if (max > 5000000) {
                                StringBuilder sb4 = new StringBuilder(61);
                                sb4.append("Ignoring impossibly large audio latency: ");
                                sb4.append(max);
                                Log.w("AudioTrack", sb4.toString());
                                this.L = 0L;
                            }
                        } catch (Exception unused) {
                            this.A = null;
                        }
                    }
                    this.f8899z = nanoTime;
                }
            }
        }
        long nanoTime2 = System.nanoTime() / 1000;
        if (this.f8898y) {
            e10 = v(this.f8880g.h() + w(nanoTime2 - (this.f8880g.g() / 1000)));
        } else {
            e10 = this.f8895v == 0 ? this.f8880g.e() : nanoTime2 + this.f8896w;
            if (!z10) {
                e10 -= this.L;
            }
        }
        long j16 = this.J;
        while (!this.f8881h.isEmpty()) {
            j13 = this.f8881h.getFirst().f8376c;
            if (e10 < j13) {
                break;
            }
            pd remove = this.f8881h.remove();
            qcVar = remove.f8374a;
            this.f8891r = qcVar;
            j14 = remove.f8376c;
            this.f8893t = j14;
            j15 = remove.f8375b;
            this.f8892s = j15 - this.J;
        }
        if (this.f8891r.f8868a == 1.0f) {
            j12 = (e10 + this.f8892s) - this.f8893t;
        } else {
            if (this.f8881h.isEmpty() && this.f8875b.m() >= PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID) {
                j10 = this.f8892s;
                j11 = vj.j(e10 - this.f8893t, this.f8875b.l(), this.f8875b.m());
            } else {
                j10 = this.f8892s;
                j11 = (long) (this.f8891r.f8868a * (e10 - this.f8893t));
            }
            j12 = j11 + j10;
        }
        return j16 + j12;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00f6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(java.lang.String r7, int r8, int r9, int r10, int r11, int[] r12) throws com.google.android.gms.internal.ads.zzaon {
        /*
            Method dump skipped, instructions count: 288
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.qd.c(java.lang.String, int, int, int, int, int[]):void");
    }

    public final void d() {
        this.V = true;
        if (u()) {
            this.K = System.nanoTime() / 1000;
            this.f8882i.play();
        }
    }

    public final void e() {
        if (this.I == 1) {
            this.I = 2;
        }
    }

    public final boolean f(ByteBuffer byteBuffer, long j10) throws zzaoo, zzaos {
        int i10;
        id idVar;
        id idVar2;
        ByteBuffer byteBuffer2 = this.P;
        fj.a(byteBuffer2 == null || byteBuffer == byteBuffer2);
        if (!u()) {
            this.f8878e.block();
            int i11 = this.W;
            if (i11 == 0) {
                this.f8882i = new AudioTrack(3, this.f8883j, this.f8884k, this.f8886m, this.f8888o, 1);
            } else {
                this.f8882i = new AudioTrack(3, this.f8883j, this.f8884k, this.f8886m, this.f8888o, 1, i11);
            }
            int state = this.f8882i.getState();
            if (state == 1) {
                int audioSessionId = this.f8882i.getAudioSessionId();
                if (this.W != audioSessionId) {
                    this.W = audioSessionId;
                    idVar2 = ((sd) this.f8877d).f9800a.Q;
                    idVar2.g(audioSessionId);
                }
                this.f8880g.a(this.f8882i, z());
                t();
                this.X = false;
                if (this.V) {
                    d();
                }
            } else {
                try {
                    this.f8882i.release();
                } catch (Exception unused) {
                } finally {
                    this.f8882i = null;
                }
                throw new zzaoo(state, this.f8883j, this.f8884k, this.f8888o);
            }
        }
        if (z()) {
            if (this.f8882i.getPlayState() == 2) {
                this.X = false;
                return false;
            } else if (this.f8882i.getPlayState() == 1 && this.f8880g.d() != 0) {
                return false;
            }
        }
        boolean z10 = this.X;
        boolean i12 = i();
        this.X = i12;
        if (z10 && !i12 && this.f8882i.getPlayState() != 1) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j11 = this.Y;
            nd ndVar = this.f8877d;
            int i13 = this.f8888o;
            long a10 = zb.a(this.f8889p);
            idVar = ((sd) ndVar).f9800a.Q;
            idVar.e(i13, a10, elapsedRealtime - j11);
        }
        if (this.P == null) {
            if (!byteBuffer.hasRemaining()) {
                return true;
            }
            if (this.f8887n && this.H == 0) {
                int i14 = this.f8886m;
                if (i14 == 7 || i14 == 8) {
                    int position = byteBuffer.position();
                    i10 = ((((byteBuffer.get(position + 5) & 252) >> 2) | ((byteBuffer.get(position + 4) & 1) << 6)) + 1) * 32;
                } else if (i14 == 5) {
                    int i15 = yc.f12530d;
                    i10 = 1536;
                } else if (i14 == 6) {
                    i10 = yc.c(byteBuffer);
                } else {
                    StringBuilder sb2 = new StringBuilder(38);
                    sb2.append("Unexpected audio encoding: ");
                    sb2.append(i14);
                    throw new IllegalStateException(sb2.toString());
                }
                this.H = i10;
            }
            if (this.f8890q != null) {
                if (!s()) {
                    return false;
                }
                this.f8881h.add(new pd(this.f8890q, Math.max(0L, j10), v(x()), null));
                this.f8890q = null;
                p();
            }
            if (this.I == 0) {
                this.J = Math.max(0L, j10);
                this.I = 1;
            } else {
                long v10 = this.J + v(this.f8887n ? this.D : this.C / this.B);
                if (this.I == 1 && Math.abs(v10 - j10) > 200000) {
                    StringBuilder sb3 = new StringBuilder(80);
                    sb3.append("Discontinuity detected [expected ");
                    sb3.append(v10);
                    sb3.append(", got ");
                    sb3.append(j10);
                    sb3.append("]");
                    Log.e("AudioTrack", sb3.toString());
                    this.I = 2;
                }
                if (this.I == 2) {
                    this.J += j10 - v10;
                    this.I = 1;
                    ((sd) this.f8877d).f9800a.W = true;
                }
            }
            if (this.f8887n) {
                this.D += this.H;
            } else {
                this.C += byteBuffer.remaining();
            }
            this.P = byteBuffer;
        }
        if (this.f8887n) {
            r(this.P, j10);
        } else {
            q(j10);
        }
        if (this.P.hasRemaining()) {
            return false;
        }
        this.P = null;
        return true;
    }

    public final void g() throws zzaos {
        if (!this.U && u() && s()) {
            this.f8880g.b(x());
            this.U = true;
        }
    }

    public final boolean h() {
        return !u() || (this.U && !i());
    }

    public final boolean i() {
        if (u()) {
            if (x() > this.f8880g.d()) {
                return true;
            }
            if (z() && this.f8882i.getPlayState() == 2 && this.f8882i.getPlaybackHeadPosition() == 0) {
                return true;
            }
        }
        return false;
    }

    public final qc j(qc qcVar) {
        if (this.f8887n) {
            qc qcVar2 = qc.f8867d;
            this.f8891r = qcVar2;
            return qcVar2;
        }
        float j10 = this.f8875b.j(qcVar.f8868a);
        this.f8875b.k(1.0f);
        qc qcVar3 = new qc(j10, 1.0f);
        qc qcVar4 = this.f8890q;
        if (qcVar4 == null) {
            if (!this.f8881h.isEmpty()) {
                qcVar4 = this.f8881h.getLast().f8374a;
            } else {
                qcVar4 = this.f8891r;
            }
        }
        if (!qcVar3.equals(qcVar4)) {
            if (u()) {
                this.f8890q = qcVar3;
            } else {
                this.f8891r = qcVar3;
            }
        }
        return this.f8891r;
    }

    public final qc k() {
        return this.f8891r;
    }

    public final void l(float f10) {
        if (this.M != f10) {
            this.M = f10;
            t();
        }
    }

    public final void m() {
        this.V = false;
        if (u()) {
            y();
            this.f8880g.c();
        }
    }

    public final void n() {
        qc qcVar;
        if (u()) {
            this.C = 0L;
            this.D = 0L;
            this.F = 0L;
            this.G = 0L;
            this.H = 0;
            qc qcVar2 = this.f8890q;
            if (qcVar2 != null) {
                this.f8891r = qcVar2;
                this.f8890q = null;
            } else if (!this.f8881h.isEmpty()) {
                qcVar = this.f8881h.getLast().f8374a;
                this.f8891r = qcVar;
            }
            this.f8881h.clear();
            this.f8892s = 0L;
            this.f8893t = 0L;
            this.P = null;
            this.Q = null;
            int i10 = 0;
            while (true) {
                bd[] bdVarArr = this.N;
                if (i10 >= bdVarArr.length) {
                    break;
                }
                bd bdVar = bdVarArr[i10];
                bdVar.h();
                this.O[i10] = bdVar.f();
                i10++;
            }
            this.U = false;
            this.T = -1;
            this.I = 0;
            this.L = 0L;
            y();
            if (this.f8882i.getPlayState() == 3) {
                this.f8882i.pause();
            }
            AudioTrack audioTrack = this.f8882i;
            this.f8882i = null;
            this.f8880g.a(null, false);
            this.f8878e.close();
            new kd(this, audioTrack).start();
        }
    }

    public final void o() {
        n();
        bd[] bdVarArr = this.f8876c;
        for (int i10 = 0; i10 < 3; i10++) {
            bdVarArr[i10].g();
        }
        this.W = 0;
        this.V = false;
    }

    public final void p() {
        ArrayList arrayList = new ArrayList();
        bd[] bdVarArr = this.f8876c;
        for (int i10 = 0; i10 < 3; i10++) {
            bd bdVar = bdVarArr[i10];
            if (bdVar.zzb()) {
                arrayList.add(bdVar);
            } else {
                bdVar.h();
            }
        }
        int size = arrayList.size();
        this.N = (bd[]) arrayList.toArray(new bd[size]);
        this.O = new ByteBuffer[size];
        for (int i11 = 0; i11 < size; i11++) {
            bd bdVar2 = this.N[i11];
            bdVar2.h();
            this.O[i11] = bdVar2.f();
        }
    }

    public final void q(long j10) throws zzaos {
        ByteBuffer byteBuffer;
        int length = this.N.length;
        int i10 = length;
        while (i10 >= 0) {
            if (i10 > 0) {
                byteBuffer = this.O[i10 - 1];
            } else {
                byteBuffer = this.P;
                if (byteBuffer == null) {
                    byteBuffer = bd.f2291a;
                }
            }
            if (i10 == length) {
                r(byteBuffer, j10);
            } else {
                bd bdVar = this.N[i10];
                bdVar.c(byteBuffer);
                ByteBuffer f10 = bdVar.f();
                this.O[i10] = f10;
                if (f10.hasRemaining()) {
                    i10++;
                }
            }
            if (byteBuffer.hasRemaining()) {
                return;
            }
            i10--;
        }
    }

    public final boolean r(ByteBuffer byteBuffer, long j10) throws zzaos {
        int write;
        if (byteBuffer.hasRemaining()) {
            ByteBuffer byteBuffer2 = this.Q;
            if (byteBuffer2 != null) {
                fj.a(byteBuffer2 == byteBuffer);
            } else {
                this.Q = byteBuffer;
                if (vj.f11100a < 21) {
                    int remaining = byteBuffer.remaining();
                    byte[] bArr = this.R;
                    if (bArr == null || bArr.length < remaining) {
                        this.R = new byte[remaining];
                    }
                    int position = byteBuffer.position();
                    byteBuffer.get(this.R, 0, remaining);
                    byteBuffer.position(position);
                    this.S = 0;
                }
            }
            int remaining2 = byteBuffer.remaining();
            if (vj.f11100a < 21) {
                int d10 = this.f8888o - ((int) (this.F - (this.f8880g.d() * this.E)));
                if (d10 > 0) {
                    write = this.f8882i.write(this.R, this.S, Math.min(remaining2, d10));
                    if (write > 0) {
                        this.S += write;
                        byteBuffer.position(byteBuffer.position() + write);
                    }
                } else {
                    write = 0;
                }
            } else {
                write = this.f8882i.write(byteBuffer, remaining2, 1);
            }
            this.Y = SystemClock.elapsedRealtime();
            if (write >= 0) {
                boolean z10 = this.f8887n;
                if (!z10) {
                    this.F += write;
                }
                if (write == remaining2) {
                    if (z10) {
                        this.G += this.H;
                    }
                    this.Q = null;
                    return true;
                }
                return false;
            }
            throw new zzaos(write);
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0038  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0032 -> B:9:0x0012). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean s() throws com.google.android.gms.internal.ads.zzaos {
        /*
            r9 = this;
            int r0 = r9.T
            r1 = -1
            r2 = 1
            r3 = 0
            if (r0 != r1) goto L14
            boolean r0 = r9.f8887n
            if (r0 == 0) goto Lf
            ai.bd[] r0 = r9.N
            int r0 = r0.length
            goto L10
        Lf:
            r0 = r3
        L10:
            r9.T = r0
        L12:
            r0 = r2
            goto L15
        L14:
            r0 = r3
        L15:
            int r4 = r9.T
            ai.bd[] r5 = r9.N
            int r6 = r5.length
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r4 >= r6) goto L38
            r4 = r5[r4]
            if (r0 == 0) goto L28
            r4.a()
        L28:
            r9.q(r7)
            boolean r0 = r4.e()
            if (r0 != 0) goto L32
            return r3
        L32:
            int r0 = r9.T
            int r0 = r0 + r2
            r9.T = r0
            goto L12
        L38:
            java.nio.ByteBuffer r0 = r9.Q
            if (r0 == 0) goto L44
            r9.r(r0, r7)
            java.nio.ByteBuffer r0 = r9.Q
            if (r0 == 0) goto L44
            return r3
        L44:
            r9.T = r1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.qd.s():boolean");
    }

    public final void t() {
        if (u()) {
            if (vj.f11100a >= 21) {
                this.f8882i.setVolume(this.M);
                return;
            }
            AudioTrack audioTrack = this.f8882i;
            float f10 = this.M;
            audioTrack.setStereoVolume(f10, f10);
        }
    }

    public final boolean u() {
        return this.f8882i != null;
    }

    public final long v(long j10) {
        return (j10 * 1000000) / this.f8883j;
    }

    public final long w(long j10) {
        return (j10 * this.f8883j) / 1000000;
    }

    public final long x() {
        return this.f8887n ? this.G : this.F / this.E;
    }

    public final void y() {
        this.f8896w = 0L;
        this.f8895v = 0;
        this.f8894u = 0;
        this.f8897x = 0L;
        this.f8898y = false;
        this.f8899z = 0L;
    }

    public final boolean z() {
        int i10;
        return vj.f11100a < 23 && ((i10 = this.f8886m) == 5 || i10 == 6);
    }
}
