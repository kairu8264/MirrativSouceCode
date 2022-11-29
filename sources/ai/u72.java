package ai;

import android.media.AudioTrack;
import android.os.ConditionVariable;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.gms.internal.ads.zzdd;
import com.google.android.gms.internal.ads.zzdr;
import com.google.android.gms.internal.ads.zzds;
import com.google.android.gms.internal.ads.zzdu;
import com.google.android.gms.internal.ads.zzdv;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class u72 implements hq1 {
    public ByteBuffer[] A;
    public ByteBuffer B;
    public ByteBuffer C;
    public byte[] D;
    public int E;
    public int F;
    public boolean G;
    public boolean H;
    public boolean I;
    public boolean J;
    public int K;
    public vo3 L;
    public long M;
    public boolean N;
    public boolean O;
    public final oz1 P;

    /* renamed from: a  reason: collision with root package name */
    public final mw1 f10619a;

    /* renamed from: b  reason: collision with root package name */
    public final dh2 f10620b;

    /* renamed from: c  reason: collision with root package name */
    public final u71[] f10621c;

    /* renamed from: d  reason: collision with root package name */
    public final u71[] f10622d;

    /* renamed from: e  reason: collision with root package name */
    public final ConditionVariable f10623e;

    /* renamed from: f  reason: collision with root package name */
    public final lu1 f10624f;

    /* renamed from: g  reason: collision with root package name */
    public final ArrayDeque<p02> f10625g;

    /* renamed from: h  reason: collision with root package name */
    public t62 f10626h;

    /* renamed from: i  reason: collision with root package name */
    public final p22<zzds> f10627i;

    /* renamed from: j  reason: collision with root package name */
    public final p22<zzdv> f10628j;

    /* renamed from: k  reason: collision with root package name */
    public gn1 f10629k;

    /* renamed from: l  reason: collision with root package name */
    public oy1 f10630l;

    /* renamed from: m  reason: collision with root package name */
    public oy1 f10631m;

    /* renamed from: n  reason: collision with root package name */
    public AudioTrack f10632n;

    /* renamed from: o  reason: collision with root package name */
    public lc3 f10633o;

    /* renamed from: p  reason: collision with root package name */
    public p02 f10634p;

    /* renamed from: q  reason: collision with root package name */
    public p02 f10635q;

    /* renamed from: r  reason: collision with root package name */
    public final e6 f10636r;

    /* renamed from: s  reason: collision with root package name */
    public long f10637s;

    /* renamed from: t  reason: collision with root package name */
    public long f10638t;

    /* renamed from: u  reason: collision with root package name */
    public long f10639u;

    /* renamed from: v  reason: collision with root package name */
    public boolean f10640v;

    /* renamed from: w  reason: collision with root package name */
    public boolean f10641w;

    /* renamed from: x  reason: collision with root package name */
    public long f10642x;

    /* renamed from: y  reason: collision with root package name */
    public float f10643y;

    /* renamed from: z  reason: collision with root package name */
    public u71[] f10644z;

    public u72(s41 s41Var, u71[] u71VarArr, boolean z10) {
        oz1 oz1Var = new oz1(u71VarArr);
        this.P = oz1Var;
        int i10 = sb.f9778a;
        this.f10623e = new ConditionVariable(true);
        this.f10624f = new lu1(new q32(this, null));
        mw1 mw1Var = new mw1();
        this.f10619a = mw1Var;
        dh2 dh2Var = new dh2();
        this.f10620b = dh2Var;
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, new zc2(), mw1Var, dh2Var);
        Collections.addAll(arrayList, oz1Var.a());
        this.f10621c = (u71[]) arrayList.toArray(new u71[0]);
        this.f10622d = new u71[]{new v82()};
        this.f10643y = 1.0f;
        this.f10633o = lc3.f6517c;
        this.K = 0;
        this.L = new vo3(0, 0.0f);
        e6 e6Var = e6.f3542d;
        this.f10635q = new p02(e6Var, false, 0L, 0L, null);
        this.f10636r = e6Var;
        this.F = -1;
        this.f10644z = new u71[0];
        this.A = new ByteBuffer[0];
        this.f10625g = new ArrayDeque<>();
        this.f10627i = new p22<>(100L);
        this.f10628j = new p22<>(100L);
    }

    public static boolean J(AudioTrack audioTrack) {
        return sb.f9778a >= 29 && audioTrack.isOffloadedPlayback();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0018  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0029 -> B:5:0x0009). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean A() throws com.google.android.gms.internal.ads.zzdv {
        /*
            r9 = this;
            int r0 = r9.F
            r1 = -1
            r2 = 1
            r3 = 0
            if (r0 != r1) goto Lb
            r9.F = r3
        L9:
            r0 = r2
            goto Lc
        Lb:
            r0 = r3
        Lc:
            int r4 = r9.F
            ai.u71[] r5 = r9.f10644z
            int r6 = r5.length
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r4 >= r6) goto L2f
            r4 = r5[r4]
            if (r0 == 0) goto L1f
            r4.d()
        L1f:
            r9.y(r7)
            boolean r0 = r4.a()
            if (r0 != 0) goto L29
            return r3
        L29:
            int r0 = r9.F
            int r0 = r0 + r2
            r9.F = r0
            goto L9
        L2f:
            java.nio.ByteBuffer r0 = r9.C
            if (r0 == 0) goto L3b
            r9.z(r0, r7)
            java.nio.ByteBuffer r0 = r9.C
            if (r0 == 0) goto L3b
            return r3
        L3b:
            r9.F = r1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.u72.A():boolean");
    }

    public final void B() {
        if (G()) {
            if (sb.f9778a >= 21) {
                this.f10632n.setVolume(this.f10643y);
                return;
            }
            AudioTrack audioTrack = this.f10632n;
            float f10 = this.f10643y;
            audioTrack.setStereoVolume(f10, f10);
        }
    }

    public final void C(e6 e6Var, boolean z10) {
        p02 D = D();
        if (e6Var.equals(D.f8200a) && z10 == D.f8201b) {
            return;
        }
        p02 p02Var = new p02(e6Var, z10, C.TIME_UNSET, C.TIME_UNSET, null);
        if (G()) {
            this.f10634p = p02Var;
        } else {
            this.f10635q = p02Var;
        }
    }

    public final p02 D() {
        p02 p02Var = this.f10634p;
        return p02Var != null ? p02Var : !this.f10625g.isEmpty() ? this.f10625g.getLast() : this.f10635q;
    }

    public final void E(long j10) {
        e6 e6Var;
        boolean z10;
        ej1 ej1Var;
        if (F()) {
            oz1 oz1Var = this.P;
            e6Var = D().f8200a;
            oz1Var.b(e6Var);
        } else {
            e6Var = e6.f3542d;
        }
        e6 e6Var2 = e6Var;
        if (F()) {
            oz1 oz1Var2 = this.P;
            boolean z11 = D().f8201b;
            oz1Var2.c(z11);
            z10 = z11;
        } else {
            z10 = false;
        }
        this.f10625g.add(new p02(e6Var2, z10, Math.max(0L, j10), this.f10631m.a(I()), null));
        u71[] u71VarArr = this.f10631m.f8166i;
        ArrayList arrayList = new ArrayList();
        for (u71 u71Var : u71VarArr) {
            if (u71Var.zzb()) {
                arrayList.add(u71Var);
            } else {
                u71Var.f();
            }
        }
        int size = arrayList.size();
        this.f10644z = (u71[]) arrayList.toArray(new u71[size]);
        this.A = new ByteBuffer[size];
        x();
        gn1 gn1Var = this.f10629k;
        if (gn1Var != null) {
            ej1Var = ((w92) gn1Var).f11523a.Y0;
            ej1Var.h(z10);
        }
    }

    public final boolean F() {
        if (MimeTypes.AUDIO_RAW.equals(this.f10631m.f8158a.f10960l)) {
            int i10 = this.f10631m.f8158a.A;
            return true;
        }
        return false;
    }

    public final boolean G() {
        return this.f10632n != null;
    }

    public final long H() {
        oy1 oy1Var = this.f10631m;
        int i10 = oy1Var.f8160c;
        return this.f10637s / oy1Var.f8159b;
    }

    public final long I() {
        oy1 oy1Var = this.f10631m;
        int i10 = oy1Var.f8160c;
        return this.f10638t / oy1Var.f8161d;
    }

    public final void K() {
        if (this.H) {
            return;
        }
        this.H = true;
        this.f10624f.i(I());
        this.f10632n.stop();
    }

    @Override // ai.hq1
    public final void a() {
        this.I = true;
        if (G()) {
            this.f10624f.c();
            this.f10632n.play();
        }
    }

    @Override // ai.hq1
    public final long b(boolean z10) {
        long j10;
        if (!G() || this.f10641w) {
            return Long.MIN_VALUE;
        }
        long min = Math.min(this.f10624f.b(z10), this.f10631m.a(I()));
        while (!this.f10625g.isEmpty() && min >= this.f10625g.getFirst().f8203d) {
            this.f10635q = this.f10625g.remove();
        }
        p02 p02Var = this.f10635q;
        long j11 = min - p02Var.f8203d;
        if (p02Var.f8200a.equals(e6.f3542d)) {
            j10 = this.f10635q.f8202c + j11;
        } else if (this.f10625g.isEmpty()) {
            j10 = this.P.d(j11) + this.f10635q.f8202c;
        } else {
            p02 first = this.f10625g.getFirst();
            j10 = first.f8202c - sb.j(first.f8203d - min, this.f10635q.f8200a.f3544a);
        }
        return j10 + this.f10631m.a(this.P.e());
    }

    @Override // ai.hq1
    public final void c(v4 v4Var, int i10, int[] iArr) throws zzdr {
        if (MimeTypes.AUDIO_RAW.equals(v4Var.f10960l)) {
            u9.a(sb.p(v4Var.A));
            int s10 = sb.s(v4Var.A, v4Var.f10973y);
            u71[] u71VarArr = this.f10621c;
            this.f10620b.n(v4Var.B, v4Var.C);
            if (sb.f9778a < 21 && v4Var.f10973y == 8 && iArr == null) {
                iArr = new int[6];
                for (int i11 = 0; i11 < 6; i11++) {
                    iArr[i11] = i11;
                }
            }
            this.f10619a.n(iArr);
            t51 t51Var = new t51(v4Var.f10974z, v4Var.f10973y, v4Var.A);
            for (u71 u71Var : u71VarArr) {
                try {
                    t51 b10 = u71Var.b(t51Var);
                    if (true == u71Var.zzb()) {
                        t51Var = b10;
                    }
                } catch (zzdd e10) {
                    throw new zzdr(e10, v4Var);
                }
            }
            int i12 = t51Var.f10150c;
            int i13 = t51Var.f10148a;
            int r10 = sb.r(t51Var.f10149b);
            int s11 = sb.s(i12, t51Var.f10149b);
            if (i12 == 0) {
                String valueOf = String.valueOf(v4Var);
                StringBuilder sb2 = new StringBuilder(valueOf.length() + 48);
                sb2.append("Invalid output encoding (mode=0) for: ");
                sb2.append(valueOf);
                throw new zzdr(sb2.toString(), v4Var);
            } else if (r10 != 0) {
                this.N = false;
                oy1 oy1Var = new oy1(v4Var, s10, 0, s11, i13, r10, i12, 0, false, u71VarArr);
                if (G()) {
                    this.f10630l = oy1Var;
                    return;
                } else {
                    this.f10631m = oy1Var;
                    return;
                }
            } else {
                String valueOf2 = String.valueOf(v4Var);
                StringBuilder sb3 = new StringBuilder(valueOf2.length() + 54);
                sb3.append("Invalid output channel config (mode=0) for: ");
                sb3.append(valueOf2);
                throw new zzdr(sb3.toString(), v4Var);
            }
        }
        int i14 = sb.f9778a;
        throw new zzdr("Unable to configure passthrough for: ".concat(String.valueOf(v4Var)), v4Var);
    }

    @Override // ai.hq1
    public final boolean d(v4 v4Var) {
        return e(v4Var) != 0;
    }

    @Override // ai.hq1
    public final int e(v4 v4Var) {
        if (MimeTypes.AUDIO_RAW.equals(v4Var.f10960l)) {
            if (sb.p(v4Var.A)) {
                return v4Var.A != 2 ? 1 : 2;
            }
            int i10 = v4Var.A;
            StringBuilder sb2 = new StringBuilder(33);
            sb2.append("Invalid PCM encoding: ");
            sb2.append(i10);
            Log.w("DefaultAudioSink", sb2.toString());
            return 0;
        }
        int i11 = sb.f9778a;
        return 0;
    }

    @Override // ai.hq1
    public final void f() {
        this.f10640v = true;
    }

    @Override // ai.hq1
    public final boolean g() {
        return !G() || (this.G && !i());
    }

    @Override // ai.hq1
    public final void h() throws zzdv {
        if (!this.G && G() && A()) {
            K();
            this.G = true;
        }
    }

    @Override // ai.hq1
    public final boolean i() {
        return G() && this.f10624f.j(I());
    }

    @Override // ai.hq1
    public final void j(gn1 gn1Var) {
        this.f10629k = gn1Var;
    }

    @Override // ai.hq1
    public final e6 k() {
        return D().f8200a;
    }

    @Override // ai.hq1
    public final boolean l(ByteBuffer byteBuffer, long j10, int i10) throws zzds, zzdv {
        ByteBuffer byteBuffer2 = this.B;
        u9.a(byteBuffer2 == null || byteBuffer == byteBuffer2);
        if (this.f10630l != null) {
            if (!A()) {
                return false;
            }
            oy1 oy1Var = this.f10630l;
            oy1 oy1Var2 = this.f10631m;
            int i11 = oy1Var2.f8160c;
            int i12 = oy1Var.f8160c;
            if (oy1Var2.f8164g == oy1Var.f8164g && oy1Var2.f8162e == oy1Var.f8162e && oy1Var2.f8163f == oy1Var.f8163f && oy1Var2.f8161d == oy1Var.f8161d) {
                this.f10631m = oy1Var;
                this.f10630l = null;
                if (J(this.f10632n)) {
                    this.f10632n.setOffloadEndOfStream();
                    AudioTrack audioTrack = this.f10632n;
                    v4 v4Var = this.f10631m.f8158a;
                    audioTrack.setOffloadDelayPadding(v4Var.B, v4Var.C);
                    this.O = true;
                }
            } else {
                K();
                if (i()) {
                    return false;
                }
                m();
            }
            E(j10);
        }
        if (!G()) {
            try {
                this.f10623e.block();
                try {
                    oy1 oy1Var3 = this.f10631m;
                    Objects.requireNonNull(oy1Var3);
                    AudioTrack c10 = oy1Var3.c(false, this.f10633o, this.K);
                    this.f10632n = c10;
                    if (J(c10)) {
                        AudioTrack audioTrack2 = this.f10632n;
                        if (this.f10626h == null) {
                            this.f10626h = new t62(this);
                        }
                        this.f10626h.a(audioTrack2);
                        AudioTrack audioTrack3 = this.f10632n;
                        v4 v4Var2 = this.f10631m.f8158a;
                        audioTrack3.setOffloadDelayPadding(v4Var2.B, v4Var2.C);
                    }
                    this.K = this.f10632n.getAudioSessionId();
                    lu1 lu1Var = this.f10624f;
                    AudioTrack audioTrack4 = this.f10632n;
                    oy1 oy1Var4 = this.f10631m;
                    int i13 = oy1Var4.f8160c;
                    lu1Var.a(audioTrack4, false, oy1Var4.f8164g, oy1Var4.f8161d, oy1Var4.f8165h);
                    B();
                    int i14 = this.L.f11146a;
                    this.f10641w = true;
                } catch (zzds e10) {
                    gn1 gn1Var = this.f10629k;
                    if (gn1Var != null) {
                        gn1Var.a(e10);
                    }
                    throw e10;
                }
            } catch (zzds e11) {
                this.f10627i.a(e11);
                return false;
            }
        }
        this.f10627i.b();
        if (this.f10641w) {
            this.f10642x = Math.max(0L, j10);
            this.f10640v = false;
            this.f10641w = false;
            E(j10);
            if (this.I) {
                a();
            }
        }
        if (this.f10624f.e(I())) {
            if (this.B == null) {
                u9.a(byteBuffer.order() == ByteOrder.LITTLE_ENDIAN);
                if (!byteBuffer.hasRemaining()) {
                    return true;
                }
                int i15 = this.f10631m.f8160c;
                if (this.f10634p != null) {
                    if (!A()) {
                        return false;
                    }
                    E(j10);
                    this.f10634p = null;
                }
                long H = this.f10642x + (((H() - this.f10620b.p()) * 1000000) / this.f10631m.f8158a.f10974z);
                if (!this.f10640v && Math.abs(H - j10) > 200000) {
                    this.f10629k.a(new zzdu(j10, H));
                    this.f10640v = true;
                }
                if (this.f10640v) {
                    if (!A()) {
                        return false;
                    }
                    long j11 = j10 - H;
                    this.f10642x += j11;
                    this.f10640v = false;
                    E(j10);
                    gn1 gn1Var2 = this.f10629k;
                    if (gn1Var2 != null && j11 != 0) {
                        ((w92) gn1Var2).f11523a.M0();
                    }
                }
                int i16 = this.f10631m.f8160c;
                this.f10637s += byteBuffer.remaining();
                this.B = byteBuffer;
            }
            y(j10);
            if (!this.B.hasRemaining()) {
                this.B = null;
                return true;
            } else if (this.f10624f.h(I())) {
                Log.w("DefaultAudioSink", "Resetting stalled audio track");
                m();
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    @Override // ai.hq1
    public final void l0(int i10) {
        if (this.K != i10) {
            this.K = i10;
            this.J = i10 != 0;
            m();
        }
    }

    @Override // ai.hq1
    public final void m() {
        if (G()) {
            this.f10637s = 0L;
            this.f10638t = 0L;
            this.f10639u = 0L;
            this.O = false;
            this.f10635q = new p02(D().f8200a, D().f8201b, 0L, 0L, null);
            this.f10642x = 0L;
            this.f10634p = null;
            this.f10625g.clear();
            this.B = null;
            this.C = null;
            this.H = false;
            this.G = false;
            this.F = -1;
            this.f10620b.o();
            x();
            if (this.f10624f.d()) {
                this.f10632n.pause();
            }
            if (J(this.f10632n)) {
                t62 t62Var = this.f10626h;
                Objects.requireNonNull(t62Var);
                t62Var.b(this.f10632n);
            }
            AudioTrack audioTrack = this.f10632n;
            this.f10632n = null;
            if (sb.f9778a < 21 && !this.J) {
                this.K = 0;
            }
            oy1 oy1Var = this.f10630l;
            if (oy1Var != null) {
                this.f10631m = oy1Var;
                this.f10630l = null;
            }
            this.f10624f.l();
            this.f10623e.close();
            new nx1(this, "ExoPlayer:AudioTrackReleaseThread", audioTrack).start();
        }
        this.f10628j.b();
        this.f10627i.b();
    }

    @Override // ai.hq1
    public final void n(boolean z10) {
        C(D().f8200a, z10);
    }

    @Override // ai.hq1
    public final void o(e6 e6Var) {
        C(new e6(sb.e0(e6Var.f3544a, 0.1f, 8.0f), sb.e0(e6Var.f3545b, 0.1f, 8.0f)), D().f8201b);
    }

    @Override // ai.hq1
    public final void p(float f10) {
        if (this.f10643y != f10) {
            this.f10643y = f10;
            B();
        }
    }

    @Override // ai.hq1
    public final void q() {
        this.I = false;
        if (G() && this.f10624f.k()) {
            this.f10632n.pause();
        }
    }

    @Override // ai.hq1
    public final void r() {
        m();
        for (u71 u71Var : this.f10621c) {
            u71Var.e();
        }
        u71[] u71VarArr = this.f10622d;
        int length = u71VarArr.length;
        for (int i10 = 0; i10 <= 0; i10++) {
            u71VarArr[i10].e();
        }
        this.I = false;
        this.N = false;
    }

    @Override // ai.hq1
    public final void s(lc3 lc3Var) {
        if (this.f10633o.equals(lc3Var)) {
            return;
        }
        this.f10633o = lc3Var;
        m();
    }

    @Override // ai.hq1
    public final void t(vo3 vo3Var) {
        if (this.L.equals(vo3Var)) {
            return;
        }
        int i10 = vo3Var.f11146a;
        if (this.f10632n != null) {
            int i11 = this.L.f11146a;
        }
        this.L = vo3Var;
    }

    public final void x() {
        int i10 = 0;
        while (true) {
            u71[] u71VarArr = this.f10644z;
            if (i10 >= u71VarArr.length) {
                return;
            }
            u71 u71Var = u71VarArr[i10];
            u71Var.f();
            this.A[i10] = u71Var.c();
            i10++;
        }
    }

    public final void y(long j10) throws zzdv {
        ByteBuffer byteBuffer;
        int length = this.f10644z.length;
        int i10 = length;
        while (i10 >= 0) {
            if (i10 > 0) {
                byteBuffer = this.A[i10 - 1];
            } else {
                byteBuffer = this.B;
                if (byteBuffer == null) {
                    byteBuffer = u71.f10618a;
                }
            }
            if (i10 == length) {
                z(byteBuffer, j10);
            } else {
                u71 u71Var = this.f10644z[i10];
                if (i10 > this.F) {
                    u71Var.g(byteBuffer);
                }
                ByteBuffer c10 = u71Var.c();
                this.A[i10] = c10;
                if (c10.hasRemaining()) {
                    i10++;
                }
            }
            if (byteBuffer.hasRemaining()) {
                return;
            }
            i10--;
        }
    }

    public final void z(ByteBuffer byteBuffer, long j10) throws zzdv {
        int write;
        t6 t6Var;
        t6 t6Var2;
        if (byteBuffer.hasRemaining()) {
            ByteBuffer byteBuffer2 = this.C;
            boolean z10 = true;
            if (byteBuffer2 != null) {
                u9.a(byteBuffer2 == byteBuffer);
            } else {
                this.C = byteBuffer;
                if (sb.f9778a < 21) {
                    int remaining = byteBuffer.remaining();
                    byte[] bArr = this.D;
                    if (bArr == null || bArr.length < remaining) {
                        this.D = new byte[remaining];
                    }
                    int position = byteBuffer.position();
                    byteBuffer.get(this.D, 0, remaining);
                    byteBuffer.position(position);
                    this.E = 0;
                }
            }
            int remaining2 = byteBuffer.remaining();
            int i10 = sb.f9778a;
            if (i10 < 21) {
                int f10 = this.f10624f.f(this.f10638t);
                if (f10 > 0) {
                    write = this.f10632n.write(this.D, this.E, Math.min(remaining2, f10));
                    if (write > 0) {
                        this.E += write;
                        byteBuffer.position(byteBuffer.position() + write);
                    }
                } else {
                    write = 0;
                }
            } else {
                write = this.f10632n.write(byteBuffer, remaining2, 1);
            }
            this.M = SystemClock.elapsedRealtime();
            if (write < 0) {
                if ((i10 < 24 || write != -6) && write != -32) {
                    z10 = false;
                }
                zzdv zzdvVar = new zzdv(write, this.f10631m.f8158a, z10);
                gn1 gn1Var = this.f10629k;
                if (gn1Var != null) {
                    gn1Var.a(zzdvVar);
                }
                if (!zzdvVar.f27273w) {
                    this.f10628j.a(zzdvVar);
                    return;
                }
                throw zzdvVar;
            }
            this.f10628j.b();
            if (J(this.f10632n) && this.I && this.f10629k != null && write < remaining2 && !this.O) {
                long g10 = this.f10624f.g(0L);
                w92 w92Var = (w92) this.f10629k;
                t6Var = w92Var.f11523a.f12526h1;
                if (t6Var != null) {
                    t6Var2 = w92Var.f11523a.f12526h1;
                    t6Var2.a(g10);
                }
            }
            int i11 = this.f10631m.f8160c;
            this.f10638t += write;
            if (write == remaining2) {
                this.C = null;
            }
        }
    }
}
