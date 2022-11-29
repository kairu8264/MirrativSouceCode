package ai;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.gms.internal.ads.zzaha;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* loaded from: classes3.dex */
public final class cq3 implements ap3, pv3, ss3, ys3, oq3 {

    /* renamed from: h0  reason: collision with root package name */
    public static final Map<String, String> f2898h0;

    /* renamed from: i0  reason: collision with root package name */
    public static final v4 f2899i0;
    public final hl2 A;
    public final yp3 B;
    public final long C;
    public final sp3 E;
    public zo3 J;
    public h8 K;
    public boolean N;
    public boolean O;
    public boolean P;
    public bq3 Q;
    public lw3 R;
    public boolean T;
    public boolean V;
    public boolean W;
    public int X;
    public long Z;

    /* renamed from: b0  reason: collision with root package name */
    public boolean f2901b0;

    /* renamed from: c0  reason: collision with root package name */
    public int f2902c0;

    /* renamed from: d0  reason: collision with root package name */
    public boolean f2903d0;

    /* renamed from: e0  reason: collision with root package name */
    public boolean f2904e0;

    /* renamed from: f0  reason: collision with root package name */
    public final os3 f2905f0;

    /* renamed from: g0  reason: collision with root package name */
    public final is3 f2906g0;

    /* renamed from: w  reason: collision with root package name */
    public final Uri f2907w;

    /* renamed from: x  reason: collision with root package name */
    public final a8 f2908x;

    /* renamed from: y  reason: collision with root package name */
    public final kq2 f2909y;

    /* renamed from: z  reason: collision with root package name */
    public final kp3 f2910z;
    public final at3 D = new at3("ProgressiveMediaPeriod");
    public final x9 F = new x9(v9.f11007a);
    public final Runnable G = new Runnable(this) { // from class: ai.tp3

        /* renamed from: w  reason: collision with root package name */
        public final cq3 f10375w;

        {
            this.f10375w = this;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f10375w.z();
        }
    };
    public final Runnable H = new Runnable(this) { // from class: ai.up3

        /* renamed from: w  reason: collision with root package name */
        public final cq3 f10793w;

        {
            this.f10793w = this;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f10793w.y();
        }
    };
    public final Handler I = sb.M(null);
    public aq3[] M = new aq3[0];
    public pq3[] L = new pq3[0];

    /* renamed from: a0  reason: collision with root package name */
    public long f2900a0 = C.TIME_UNSET;
    public long Y = -1;
    public long S = C.TIME_UNSET;
    public int U = 1;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put(IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_NAME, IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
        f2898h0 = Collections.unmodifiableMap(hashMap);
        t4 t4Var = new t4();
        t4Var.d("icy");
        t4Var.n(MimeTypes.APPLICATION_ICY);
        f2899i0 = t4Var.I();
    }

    public cq3(Uri uri, a8 a8Var, sp3 sp3Var, kq2 kq2Var, hl2 hl2Var, os3 os3Var, kp3 kp3Var, yp3 yp3Var, is3 is3Var, String str, int i10, byte[] bArr) {
        this.f2907w = uri;
        this.f2908x = a8Var;
        this.f2909y = kq2Var;
        this.A = hl2Var;
        this.f2905f0 = os3Var;
        this.f2910z = kp3Var;
        this.B = yp3Var;
        this.f2906g0 = is3Var;
        this.C = i10;
        this.E = sp3Var;
    }

    public final void A(int i10) {
        L();
        bq3 bq3Var = this.Q;
        boolean[] zArr = bq3Var.f2444d;
        if (zArr[i10]) {
            return;
        }
        v4 a10 = bq3Var.f2441a.a(i10).a(0);
        this.f2910z.l(ua.f(a10.f10960l), a10, 0, null, this.Z);
        zArr[i10] = true;
    }

    public final void B(int i10) {
        L();
        boolean[] zArr = this.Q.f2442b;
        if (this.f2901b0 && zArr[i10] && !this.L[i10].C(false)) {
            this.f2900a0 = 0L;
            this.f2901b0 = false;
            this.W = true;
            this.Z = 0L;
            this.f2902c0 = 0;
            for (pq3 pq3Var : this.L) {
                pq3Var.t(false);
            }
            zo3 zo3Var = this.J;
            Objects.requireNonNull(zo3Var);
            zo3Var.h(this);
        }
    }

    @Override // ai.ys3
    public final void C() {
        for (pq3 pq3Var : this.L) {
            pq3Var.s();
        }
        this.E.zzb();
    }

    public final boolean D() {
        return this.W || K();
    }

    public final pw3 E(aq3 aq3Var) {
        int length = this.L.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (aq3Var.equals(this.M[i10])) {
                return this.L[i10];
            }
        }
        is3 is3Var = this.f2906g0;
        Looper looper = this.I.getLooper();
        kq2 kq2Var = this.f2909y;
        hl2 hl2Var = this.A;
        Objects.requireNonNull(looper);
        Objects.requireNonNull(kq2Var);
        pq3 pq3Var = new pq3(is3Var, looper, kq2Var, hl2Var, null);
        pq3Var.J(this);
        int i11 = length + 1;
        aq3[] aq3VarArr = (aq3[]) Arrays.copyOf(this.M, i11);
        aq3VarArr[length] = aq3Var;
        this.M = (aq3[]) sb.J(aq3VarArr);
        pq3[] pq3VarArr = (pq3[]) Arrays.copyOf(this.L, i11);
        pq3VarArr[length] = pq3Var;
        this.L = (pq3[]) sb.J(pq3VarArr);
        return pq3Var;
    }

    /* renamed from: F */
    public final void z() {
        v7 d10;
        if (this.f2904e0 || this.O || !this.N || this.R == null) {
            return;
        }
        for (pq3 pq3Var : this.L) {
            if (pq3Var.z() == null) {
                return;
            }
        }
        this.F.b();
        int length = this.L.length;
        sx3[] sx3VarArr = new sx3[length];
        boolean[] zArr = new boolean[length];
        for (int i10 = 0; i10 < length; i10++) {
            v4 z10 = this.L[i10].z();
            Objects.requireNonNull(z10);
            String str = z10.f10960l;
            boolean a10 = ua.a(str);
            boolean z11 = a10 || ua.b(str);
            zArr[i10] = z11;
            this.P = z11 | this.P;
            h8 h8Var = this.K;
            if (h8Var != null) {
                if (a10 || this.M[i10].f1977b) {
                    v7 v7Var = z10.f10958j;
                    if (v7Var == null) {
                        d10 = new v7(h8Var);
                    } else {
                        d10 = v7Var.d(h8Var);
                    }
                    t4 a11 = z10.a();
                    a11.l(d10);
                    z10 = a11.I();
                }
                if (a10 && z10.f10954f == -1 && z10.f10955g == -1 && h8Var.f4772w != -1) {
                    t4 a12 = z10.a();
                    a12.i(h8Var.f4772w);
                    z10 = a12.I();
                }
            }
            sx3VarArr[i10] = new sx3(z10.b(this.f2909y.a(z10)));
        }
        this.Q = new bq3(new uz3(sx3VarArr), zArr);
        this.O = true;
        zo3 zo3Var = this.J;
        Objects.requireNonNull(zo3Var);
        zo3Var.g(this);
    }

    public final void G(xp3 xp3Var) {
        if (this.Y == -1) {
            this.Y = xp3.h(xp3Var);
        }
    }

    public final void H() {
        xp3 xp3Var = new xp3(this, this.f2907w, this.f2908x, this.E, this, this.F);
        if (this.O) {
            u9.d(K());
            long j10 = this.S;
            if (j10 != C.TIME_UNSET && this.f2900a0 > j10) {
                this.f2903d0 = true;
                this.f2900a0 = C.TIME_UNSET;
                return;
            }
            lw3 lw3Var = this.R;
            Objects.requireNonNull(lw3Var);
            xp3.i(xp3Var, lw3Var.a(this.f2900a0).f5944a.f7083b, this.f2900a0);
            for (pq3 pq3Var : this.L) {
                pq3Var.u(this.f2900a0);
            }
            this.f2900a0 = C.TIME_UNSET;
        }
        this.f2902c0 = I();
        long h10 = this.D.h(xp3Var, this, os3.a(this.U));
        bc g10 = xp3.g(xp3Var);
        this.f2910z.d(new so3(xp3.b(xp3Var), g10, g10.f2279a, Collections.emptyMap(), h10, 0L, 0L), 1, -1, null, 0, null, xp3.d(xp3Var), this.S);
    }

    public final int I() {
        int i10 = 0;
        for (pq3 pq3Var : this.L) {
            i10 += pq3Var.v();
        }
        return i10;
    }

    public final long J() {
        long j10 = Long.MIN_VALUE;
        for (pq3 pq3Var : this.L) {
            j10 = Math.max(j10, pq3Var.A());
        }
        return j10;
    }

    public final boolean K() {
        return this.f2900a0 != C.TIME_UNSET;
    }

    @EnsuresNonNull({"trackState", "seekMap"})
    public final void L() {
        u9.d(this.O);
        Objects.requireNonNull(this.Q);
        Objects.requireNonNull(this.R);
    }

    public final void T() {
        if (this.O) {
            for (pq3 pq3Var : this.L) {
                pq3Var.w();
            }
        }
        this.D.k(this);
        this.I.removeCallbacksAndMessages(null);
        this.J = null;
        this.f2904e0 = true;
    }

    public final boolean U(int i10) {
        return !D() && this.L[i10].C(this.f2903d0);
    }

    public final void V(int i10) throws IOException {
        this.L[i10].x();
        W();
    }

    public final void W() throws IOException {
        this.D.l(os3.a(this.U));
    }

    public final int X(int i10, w4 w4Var, a4 a4Var, int i11) {
        if (D()) {
            return -3;
        }
        A(i10);
        int D = this.L[i10].D(w4Var, a4Var, i11, this.f2903d0);
        if (D == -3) {
            B(i10);
        }
        return D;
    }

    @Override // ai.ap3, ai.sq3
    public final void a(long j10) {
    }

    @Override // ai.ap3
    public final void b() throws IOException {
        W();
        if (this.f2903d0 && !this.O) {
            throw zzaha.b("Loading finished before preparation is complete.", null);
        }
    }

    @Override // ai.ap3, ai.sq3
    public final boolean c(long j10) {
        if (this.f2903d0 || this.D.f() || this.f2901b0) {
            return false;
        }
        if (this.O && this.X == 0) {
            return false;
        }
        boolean a10 = this.F.a();
        if (this.D.i()) {
            return a10;
        }
        H();
        return true;
    }

    @Override // ai.ap3
    public final uz3 d() {
        L();
        return this.Q.f2441a;
    }

    @Override // ai.ap3, ai.sq3
    public final long e() {
        long j10;
        L();
        boolean[] zArr = this.Q.f2442b;
        if (this.f2903d0) {
            return Long.MIN_VALUE;
        }
        if (K()) {
            return this.f2900a0;
        }
        if (this.P) {
            int length = this.L.length;
            j10 = Long.MAX_VALUE;
            for (int i10 = 0; i10 < length; i10++) {
                if (zArr[i10] && !this.L[i10].B()) {
                    j10 = Math.min(j10, this.L[i10].A());
                }
            }
        } else {
            j10 = Long.MAX_VALUE;
        }
        if (j10 == Long.MAX_VALUE) {
            j10 = J();
        }
        return j10 == Long.MIN_VALUE ? this.Z : j10;
    }

    @Override // ai.ap3
    public final long f() {
        if (this.W) {
            if (this.f2903d0 || I() > this.f2902c0) {
                this.W = false;
                return this.Z;
            }
            return C.TIME_UNSET;
        }
        return C.TIME_UNSET;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0105  */
    @Override // ai.ss3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final /* bridge */ /* synthetic */ ai.us3 g(ai.ws3 r27, long r28, long r30, java.io.IOException r32, int r33) {
        /*
            Method dump skipped, instructions count: 265
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.cq3.g(ai.ws3, long, long, java.io.IOException, int):ai.us3");
    }

    @Override // ai.ss3
    public final /* bridge */ /* synthetic */ void h(ws3 ws3Var, long j10, long j11) {
        lw3 lw3Var;
        if (this.S == C.TIME_UNSET && (lw3Var = this.R) != null) {
            boolean c10 = lw3Var.c();
            long J = J();
            long j12 = J == Long.MIN_VALUE ? 0L : J + 10000;
            this.S = j12;
            this.B.c(j12, c10, this.T);
        }
        xp3 xp3Var = (xp3) ws3Var;
        ht3 c11 = xp3.c(xp3Var);
        so3 so3Var = new so3(xp3.b(xp3Var), xp3.g(xp3Var), c11.r(), c11.s(), j10, j11, c11.q());
        xp3.b(xp3Var);
        this.f2910z.f(so3Var, 1, -1, null, 0, null, xp3.d(xp3Var), this.S);
        G(xp3Var);
        this.f2903d0 = true;
        zo3 zo3Var = this.J;
        Objects.requireNonNull(zo3Var);
        zo3Var.h(this);
    }

    @Override // ai.ap3, ai.sq3
    public final long i() {
        if (this.X == 0) {
            return Long.MIN_VALUE;
        }
        return e();
    }

    @Override // ai.ap3
    public final long j(long j10) {
        int i10;
        L();
        boolean[] zArr = this.Q.f2442b;
        if (true != this.R.c()) {
            j10 = 0;
        }
        this.W = false;
        this.Z = j10;
        if (K()) {
            this.f2900a0 = j10;
            return j10;
        }
        if (this.U != 7) {
            int length = this.L.length;
            for (i10 = 0; i10 < length; i10 = i10 + 1) {
                i10 = (this.L[i10].E(j10, false) || (!zArr[i10] && this.P)) ? i10 + 1 : 0;
            }
            return j10;
        }
        this.f2901b0 = false;
        this.f2900a0 = j10;
        this.f2903d0 = false;
        if (this.D.i()) {
            for (pq3 pq3Var : this.L) {
                pq3Var.I();
            }
            this.D.j();
        } else {
            this.D.g();
            for (pq3 pq3Var2 : this.L) {
                pq3Var2.t(false);
            }
        }
        return j10;
    }

    @Override // ai.ap3, ai.sq3
    public final boolean k() {
        return this.D.i() && this.F.e();
    }

    @Override // ai.ap3
    public final void l(long j10, boolean z10) {
        L();
        if (K()) {
            return;
        }
        boolean[] zArr = this.Q.f2443c;
        int length = this.L.length;
        for (int i10 = 0; i10 < length; i10++) {
            this.L[i10].H(j10, false, zArr[i10]);
        }
    }

    @Override // ai.ss3
    public final /* bridge */ /* synthetic */ void m(ws3 ws3Var, long j10, long j11, boolean z10) {
        xp3 xp3Var = (xp3) ws3Var;
        ht3 c10 = xp3.c(xp3Var);
        so3 so3Var = new so3(xp3.b(xp3Var), xp3.g(xp3Var), c10.r(), c10.s(), j10, j11, c10.q());
        xp3.b(xp3Var);
        this.f2910z.h(so3Var, 1, -1, null, 0, null, xp3.d(xp3Var), this.S);
        if (z10) {
            return;
        }
        G(xp3Var);
        for (pq3 pq3Var : this.L) {
            pq3Var.t(false);
        }
        if (this.X > 0) {
            zo3 zo3Var = this.J;
            Objects.requireNonNull(zo3Var);
            zo3Var.h(this);
        }
    }

    @Override // ai.oq3
    public final void n(v4 v4Var) {
        this.I.post(this.G);
    }

    @Override // ai.ap3
    public final long o(long j10, y6 y6Var) {
        L();
        if (this.R.c()) {
            jw3 a10 = this.R.a(j10);
            long j11 = a10.f5944a.f7082a;
            long j12 = a10.f5945b.f7082a;
            long j13 = y6Var.f12463a;
            if (j13 == 0 && y6Var.f12464b == 0) {
                return j10;
            }
            long b10 = sb.b(j10, j13, Long.MIN_VALUE);
            long a11 = sb.a(j10, y6Var.f12464b, Long.MAX_VALUE);
            boolean z10 = true;
            boolean z11 = b10 <= j11 && j11 <= a11;
            if (b10 > j12 || j12 > a11) {
                z10 = false;
            }
            if (z11 && z10) {
                if (Math.abs(j11 - j10) > Math.abs(j12 - j10)) {
                    return j12;
                }
            } else if (!z11) {
                return z10 ? j12 : b10;
            }
            return j11;
        }
        return 0L;
    }

    @Override // ai.pv3
    public final pw3 p(int i10, int i11) {
        return E(new aq3(i10, false));
    }

    @Override // ai.ap3
    public final long q(br3[] br3VarArr, boolean[] zArr, qq3[] qq3VarArr, boolean[] zArr2, long j10) {
        br3 br3Var;
        int i10;
        L();
        bq3 bq3Var = this.Q;
        uz3 uz3Var = bq3Var.f2441a;
        boolean[] zArr3 = bq3Var.f2443c;
        int i11 = this.X;
        int i12 = 0;
        for (int i13 = 0; i13 < br3VarArr.length; i13++) {
            qq3 qq3Var = qq3VarArr[i13];
            if (qq3Var != null && (br3VarArr[i13] == null || !zArr[i13])) {
                i10 = ((zp3) qq3Var).f13071a;
                u9.d(zArr3[i10]);
                this.X--;
                zArr3[i10] = false;
                qq3VarArr[i13] = null;
            }
        }
        boolean z10 = !this.V ? j10 == 0 : i11 != 0;
        for (int i14 = 0; i14 < br3VarArr.length; i14++) {
            if (qq3VarArr[i14] == null && (br3Var = br3VarArr[i14]) != null) {
                u9.d(br3Var.b() == 1);
                u9.d(br3Var.d(0) == 0);
                int b10 = uz3Var.b(br3Var.a());
                u9.d(!zArr3[b10]);
                this.X++;
                zArr3[b10] = true;
                qq3VarArr[i14] = new zp3(this, b10);
                zArr2[i14] = true;
                if (!z10) {
                    pq3 pq3Var = this.L[b10];
                    z10 = (pq3Var.E(j10, true) || pq3Var.y() == 0) ? false : true;
                }
            }
        }
        if (this.X == 0) {
            this.f2901b0 = false;
            this.W = false;
            if (this.D.i()) {
                pq3[] pq3VarArr = this.L;
                int length = pq3VarArr.length;
                while (i12 < length) {
                    pq3VarArr[i12].I();
                    i12++;
                }
                this.D.j();
            } else {
                for (pq3 pq3Var2 : this.L) {
                    pq3Var2.t(false);
                }
            }
        } else if (z10) {
            j10 = j(j10);
            while (i12 < qq3VarArr.length) {
                if (qq3VarArr[i12] != null) {
                    zArr2[i12] = true;
                }
                i12++;
            }
        }
        this.V = true;
        return j10;
    }

    @Override // ai.ap3
    public final void r(zo3 zo3Var, long j10) {
        this.J = zo3Var;
        this.F.a();
        H();
    }

    @Override // ai.pv3
    public final void s(final lw3 lw3Var) {
        this.I.post(new Runnable(this, lw3Var) { // from class: ai.wp3

            /* renamed from: w  reason: collision with root package name */
            public final cq3 f11714w;

            /* renamed from: x  reason: collision with root package name */
            public final lw3 f11715x;

            {
                this.f11714w = this;
                this.f11715x = lw3Var;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f11714w.w(this.f11715x);
            }
        });
    }

    public final int t(int i10, long j10) {
        if (D()) {
            return 0;
        }
        A(i10);
        pq3 pq3Var = this.L[i10];
        int F = pq3Var.F(j10, this.f2903d0);
        pq3Var.G(F);
        if (F == 0) {
            B(i10);
            return 0;
        }
        return F;
    }

    public final pw3 u() {
        return E(new aq3(0, true));
    }

    public final /* synthetic */ void w(lw3 lw3Var) {
        this.R = this.K == null ? lw3Var : new kw3(C.TIME_UNSET, 0L);
        this.S = lw3Var.f();
        boolean z10 = false;
        if (this.Y == -1 && lw3Var.f() == C.TIME_UNSET) {
            z10 = true;
        }
        this.T = z10;
        this.U = true == z10 ? 7 : 1;
        this.B.c(this.S, lw3Var.c(), this.T);
        if (this.O) {
            return;
        }
        z();
    }

    @Override // ai.pv3
    public final void x() {
        this.N = true;
        this.I.post(this.G);
    }

    public final /* synthetic */ void y() {
        if (this.f2904e0) {
            return;
        }
        zo3 zo3Var = this.J;
        Objects.requireNonNull(zo3Var);
        zo3Var.h(this);
    }
}
