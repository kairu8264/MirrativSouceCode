package ai;

import android.os.Looper;
import android.os.SystemClock;
import android.util.SparseArray;
import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.gms.internal.ads.zzaeg;
import com.google.android.gms.internal.ads.zzahc;
import java.io.IOException;
import java.util.List;
import java.util.Objects;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* loaded from: classes3.dex */
public final class o11 implements k6, fk1, lu3, lp3, cs3, gm2 {
    public final SparseArray<p21> A;
    public na<r31> B;
    public o6 C;
    public ha D;
    public boolean E;

    /* renamed from: w  reason: collision with root package name */
    public final v9 f7601w;

    /* renamed from: x  reason: collision with root package name */
    public final n7 f7602x;

    /* renamed from: y  reason: collision with root package name */
    public final p7 f7603y;

    /* renamed from: z  reason: collision with root package name */
    public final n01 f7604z;

    public o11(v9 v9Var) {
        this.f7601w = v9Var;
        this.B = new na<>(sb.P(), v9Var, rp.f9530a);
        n7 n7Var = new n7();
        this.f7602x = n7Var;
        this.f7603y = new p7();
        this.f7604z = new n01(n7Var);
        this.A = new SparseArray<>();
    }

    @Override // ai.fk1
    public final void A(final v4 v4Var, final qo qoVar) {
        final p21 M = M();
        E(M, AnalyticsListener.EVENT_AUDIO_INPUT_FORMAT_CHANGED, new ka(M, v4Var, qoVar) { // from class: ai.kx0

            /* renamed from: a  reason: collision with root package name */
            public final p21 f6390a;

            /* renamed from: b  reason: collision with root package name */
            public final v4 f6391b;

            /* renamed from: c  reason: collision with root package name */
            public final qo f6392c;

            {
                this.f6390a = M;
                this.f6391b = v4Var;
                this.f6392c = qoVar;
            }

            @Override // ai.ka
            public final void a(Object obj) {
                ((r31) obj).l(this.f6390a, this.f6391b, this.f6392c);
            }
        });
    }

    @Override // ai.i6
    public final void A0(final boolean z10, final int i10) {
        final p21 F = F();
        E(F, -1, new ka(F, z10, i10) { // from class: ai.aj0

            /* renamed from: a  reason: collision with root package name */
            public final p21 f1881a;

            {
                this.f1881a = F;
            }

            @Override // ai.ka
            public final void a(Object obj) {
                r31 r31Var = (r31) obj;
            }
        });
    }

    @Override // ai.fk1
    public final void B(final Exception exc) {
        final p21 M = M();
        E(M, 1037, new ka(M, exc) { // from class: ai.nu

            /* renamed from: a  reason: collision with root package name */
            public final p21 f7526a;

            /* renamed from: b  reason: collision with root package name */
            public final Exception f7527b;

            {
                this.f7526a = M;
                this.f7527b = exc;
            }

            @Override // ai.ka
            public final void a(Object obj) {
                r31 r31Var = (r31) obj;
            }
        });
    }

    @Override // ai.i6
    public final void B0(final int i10) {
        final p21 F = F();
        E(F, 4, new ka(F, i10) { // from class: ai.ak0

            /* renamed from: a  reason: collision with root package name */
            public final p21 f1887a;

            /* renamed from: b  reason: collision with root package name */
            public final int f1888b;

            {
                this.f1887a = F;
                this.f1888b = i10;
            }

            @Override // ai.ka
            public final void a(Object obj) {
                ((r31) obj).h(this.f1887a, this.f1888b);
            }
        });
    }

    @Override // ai.fk1
    public final void C(final Exception exc) {
        final p21 M = M();
        E(M, AnalyticsListener.EVENT_AUDIO_SINK_ERROR, new ka(M, exc) { // from class: ai.mt

            /* renamed from: a  reason: collision with root package name */
            public final p21 f7039a;

            /* renamed from: b  reason: collision with root package name */
            public final Exception f7040b;

            {
                this.f7039a = M;
                this.f7040b = exc;
            }

            @Override // ai.ka
            public final void a(Object obj) {
                r31 r31Var = (r31) obj;
            }
        });
    }

    @Override // ai.lu3
    public final void C0(final String str) {
        final p21 M = M();
        E(M, 1024, new ka(M, str) { // from class: ai.b10

            /* renamed from: a  reason: collision with root package name */
            public final p21 f2187a;

            /* renamed from: b  reason: collision with root package name */
            public final String f2188b;

            {
                this.f2187a = M;
                this.f2188b = str;
            }

            @Override // ai.ka
            public final void a(Object obj) {
                r31 r31Var = (r31) obj;
            }
        });
    }

    @Override // ai.cs3
    public final void D(final int i10, final long j10, final long j11) {
        final p21 K = K(this.f7604z.e());
        E(K, AnalyticsListener.EVENT_BANDWIDTH_ESTIMATE, new ka(K, i10, j10, j11) { // from class: ai.hu0

            /* renamed from: a  reason: collision with root package name */
            public final p21 f4999a;

            {
                this.f4999a = K;
            }

            @Override // ai.ka
            public final void a(Object obj) {
                r31 r31Var = (r31) obj;
            }
        });
    }

    public final void E(p21 p21Var, int i10, ka<r31> kaVar) {
        this.A.put(i10, p21Var);
        na<r31> naVar = this.B;
        naVar.d(i10, kaVar);
        naVar.e();
    }

    public final p21 F() {
        return K(this.f7604z.b());
    }

    @RequiresNonNull({"player"})
    public final p21 G(q7 q7Var, int i10, bp3 bp3Var) {
        boolean z10 = true;
        bp3 bp3Var2 = true == q7Var.k() ? null : bp3Var;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (!q7Var.equals(this.C.D()) || i10 != this.C.C()) {
            z10 = false;
        }
        long j10 = 0;
        if (bp3Var2 == null || !bp3Var2.b()) {
            if (z10) {
                j10 = this.C.K();
            } else if (!q7Var.k()) {
                long j11 = q7Var.f(i10, this.f7603y, 0L).f8336k;
                j10 = y2.a(0L);
            }
        } else if (z10 && this.C.O() == bp3Var2.f9604b && this.C.x() == bp3Var2.f9605c) {
            j10 = this.C.N();
        }
        return new p21(elapsedRealtime, q7Var, i10, bp3Var2, j10, this.C.D(), this.C.C(), this.f7604z.b(), this.C.N(), this.C.u());
    }

    public final void H(r31 r31Var) {
        this.B.b(r31Var);
    }

    public final /* synthetic */ void I() {
        this.B.f();
    }

    public final /* synthetic */ void J(o6 o6Var, r31 r31Var, fa faVar) {
        SparseArray<p21> sparseArray = this.A;
        SparseArray sparseArray2 = new SparseArray(faVar.a());
        for (int i10 = 0; i10 < faVar.a(); i10++) {
            int b10 = faVar.b(i10);
            p21 p21Var = sparseArray.get(b10);
            Objects.requireNonNull(p21Var);
            sparseArray2.append(b10, p21Var);
        }
    }

    public final p21 K(bp3 bp3Var) {
        Objects.requireNonNull(this.C);
        q7 f10 = bp3Var == null ? null : this.f7604z.f(bp3Var);
        if (bp3Var != null && f10 != null) {
            return G(f10, f10.o(bp3Var.f9603a, this.f7602x).f7216c, bp3Var);
        }
        int C = this.C.C();
        q7 D = this.C.D();
        if (C >= D.a()) {
            D = q7.f8842a;
        }
        return G(D, C, null);
    }

    public final p21 L() {
        return K(this.f7604z.c());
    }

    public final p21 M() {
        return K(this.f7604z.d());
    }

    public final p21 N(int i10, bp3 bp3Var) {
        o6 o6Var = this.C;
        Objects.requireNonNull(o6Var);
        if (bp3Var != null) {
            if (this.f7604z.f(bp3Var) != null) {
                return K(bp3Var);
            }
            return G(q7.f8842a, i10, bp3Var);
        }
        q7 D = o6Var.D();
        if (i10 >= D.a()) {
            D = q7.f8842a;
        }
        return G(D, i10, null);
    }

    public final void O(r31 r31Var) {
        this.B.c(r31Var);
    }

    public final void P(final o6 o6Var, Looper looper) {
        zz2 zz2Var;
        boolean z10 = true;
        if (this.C != null) {
            zz2Var = this.f7604z.f7134b;
            if (!zz2Var.isEmpty()) {
                z10 = false;
            }
        }
        u9.d(z10);
        this.C = o6Var;
        this.D = this.f7601w.a(looper, null);
        this.B = this.B.a(looper, new la(this, o6Var) { // from class: ai.dy

            /* renamed from: a  reason: collision with root package name */
            public final o11 f3450a;

            /* renamed from: b  reason: collision with root package name */
            public final o6 f3451b;

            {
                this.f3450a = this;
                this.f3451b = o6Var;
            }

            @Override // ai.la
            public final void a(Object obj, fa faVar) {
                this.f3450a.J(this.f3451b, (r31) obj, faVar);
            }
        });
    }

    public final void Q() {
        final p21 F = F();
        this.A.put(AnalyticsListener.EVENT_PLAYER_RELEASED, F);
        E(F, AnalyticsListener.EVENT_PLAYER_RELEASED, new ka(F) { // from class: ai.s80

            /* renamed from: a  reason: collision with root package name */
            public final p21 f9755a;

            {
                this.f9755a = F;
            }

            @Override // ai.ka
            public final void a(Object obj) {
                r31 r31Var = (r31) obj;
            }
        });
        ha haVar = this.D;
        u9.e(haVar);
        haVar.i0(new Runnable(this) { // from class: ai.zh0

            /* renamed from: w  reason: collision with root package name */
            public final o11 f12989w;

            {
                this.f12989w = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f12989w.I();
            }
        });
    }

    public final void R(List<bp3> list, bp3 bp3Var) {
        n01 n01Var = this.f7604z;
        o6 o6Var = this.C;
        Objects.requireNonNull(o6Var);
        n01Var.i(list, bp3Var, o6Var);
    }

    public final void S() {
        if (this.E) {
            return;
        }
        final p21 F = F();
        this.E = true;
        E(F, -1, new ka(F) { // from class: ai.gr0

            /* renamed from: a  reason: collision with root package name */
            public final p21 f4549a;

            {
                this.f4549a = F;
            }

            @Override // ai.ka
            public final void a(Object obj) {
                r31 r31Var = (r31) obj;
            }
        });
    }

    @Override // ai.lp3
    public final void a(int i10, bp3 bp3Var, final so3 so3Var, final yo3 yo3Var) {
        final p21 N = N(i10, bp3Var);
        E(N, 1000, new ka(N, so3Var, yo3Var) { // from class: ai.r70

            /* renamed from: a  reason: collision with root package name */
            public final p21 f9362a;

            /* renamed from: b  reason: collision with root package name */
            public final so3 f9363b;

            /* renamed from: c  reason: collision with root package name */
            public final yo3 f9364c;

            {
                this.f9362a = N;
                this.f9363b = so3Var;
                this.f9364c = yo3Var;
            }

            @Override // ai.ka
            public final void a(Object obj) {
                r31 r31Var = (r31) obj;
            }
        });
    }

    @Override // ai.lp3
    public final void b(int i10, bp3 bp3Var, final so3 so3Var, final yo3 yo3Var) {
        final p21 N = N(i10, bp3Var);
        E(N, AnalyticsListener.EVENT_LOAD_CANCELED, new ka(N, so3Var, yo3Var) { // from class: ai.ka0

            /* renamed from: a  reason: collision with root package name */
            public final p21 f6130a;

            /* renamed from: b  reason: collision with root package name */
            public final so3 f6131b;

            /* renamed from: c  reason: collision with root package name */
            public final yo3 f6132c;

            {
                this.f6130a = N;
                this.f6131b = so3Var;
                this.f6132c = yo3Var;
            }

            @Override // ai.ka
            public final void a(Object obj) {
                r31 r31Var = (r31) obj;
            }
        });
    }

    @Override // ai.lu3
    public final void c(final on onVar) {
        final p21 L = L();
        E(L, AnalyticsListener.EVENT_VIDEO_DISABLED, new ka(L, onVar) { // from class: ai.c20

            /* renamed from: a  reason: collision with root package name */
            public final p21 f2669a;

            /* renamed from: b  reason: collision with root package name */
            public final on f2670b;

            {
                this.f2669a = L;
                this.f2670b = onVar;
            }

            @Override // ai.ka
            public final void a(Object obj) {
                r31 r31Var = (r31) obj;
            }
        });
    }

    @Override // ai.fk1
    public final void d(final String str) {
        final p21 M = M();
        E(M, AnalyticsListener.EVENT_AUDIO_DECODER_RELEASED, new ka(M, str) { // from class: ai.sq

            /* renamed from: a  reason: collision with root package name */
            public final p21 f9903a;

            /* renamed from: b  reason: collision with root package name */
            public final String f9904b;

            {
                this.f9903a = M;
                this.f9904b = str;
            }

            @Override // ai.ka
            public final void a(Object obj) {
                r31 r31Var = (r31) obj;
            }
        });
    }

    @Override // ai.fk1
    public final void e(final on onVar) {
        final p21 M = M();
        E(M, AnalyticsListener.EVENT_AUDIO_ENABLED, new ka(M, onVar) { // from class: ai.iv0

            /* renamed from: a  reason: collision with root package name */
            public final p21 f5421a;

            /* renamed from: b  reason: collision with root package name */
            public final on f5422b;

            {
                this.f5421a = M;
                this.f5422b = onVar;
            }

            @Override // ai.ka
            public final void a(Object obj) {
                r31 r31Var = (r31) obj;
            }
        });
    }

    @Override // ai.lp3
    public final void f(int i10, bp3 bp3Var, final so3 so3Var, final yo3 yo3Var) {
        final p21 N = N(i10, bp3Var);
        E(N, AnalyticsListener.EVENT_LOAD_COMPLETED, new ka(N, so3Var, yo3Var) { // from class: ai.s90

            /* renamed from: a  reason: collision with root package name */
            public final p21 f9768a;

            /* renamed from: b  reason: collision with root package name */
            public final so3 f9769b;

            /* renamed from: c  reason: collision with root package name */
            public final yo3 f9770c;

            {
                this.f9768a = N;
                this.f9769b = so3Var;
                this.f9770c = yo3Var;
            }

            @Override // ai.ka
            public final void a(Object obj) {
                r31 r31Var = (r31) obj;
            }
        });
    }

    @Override // ai.fk1
    public final void g(final int i10, final long j10, final long j11) {
        final p21 M = M();
        E(M, AnalyticsListener.EVENT_AUDIO_UNDERRUN, new ka(M, i10, j10, j11) { // from class: ai.mz0

            /* renamed from: a  reason: collision with root package name */
            public final p21 f7116a;

            {
                this.f7116a = M;
            }

            @Override // ai.ka
            public final void a(Object obj) {
                r31 r31Var = (r31) obj;
            }
        });
    }

    @Override // ai.lu3
    public final void h(final Object obj, final long j10) {
        final p21 M = M();
        E(M, AnalyticsListener.EVENT_RENDERED_FIRST_FRAME, new ka(M, obj, j10) { // from class: ai.a40

            /* renamed from: a  reason: collision with root package name */
            public final p21 f1728a;

            /* renamed from: b  reason: collision with root package name */
            public final Object f1729b;

            /* renamed from: c  reason: collision with root package name */
            public final long f1730c;

            {
                this.f1728a = M;
                this.f1729b = obj;
                this.f1730c = j10;
            }

            @Override // ai.ka
            public final void a(Object obj2) {
                ((r31) obj2).d(this.f1728a, this.f1729b, this.f1730c);
            }
        });
    }

    @Override // ai.lu3
    public final void i(final on onVar) {
        final p21 M = M();
        E(M, AnalyticsListener.EVENT_VIDEO_ENABLED, new ka(M, onVar) { // from class: ai.hw

            /* renamed from: a  reason: collision with root package name */
            public final p21 f5015a;

            /* renamed from: b  reason: collision with root package name */
            public final on f5016b;

            {
                this.f5015a = M;
                this.f5016b = onVar;
            }

            @Override // ai.ka
            public final void a(Object obj) {
                r31 r31Var = (r31) obj;
            }
        });
    }

    @Override // ai.fk1
    public final void j(final String str, final long j10, final long j11) {
        final p21 M = M();
        E(M, AnalyticsListener.EVENT_AUDIO_DECODER_INITIALIZED, new ka(M, str, j11, j10) { // from class: ai.jw0

            /* renamed from: a  reason: collision with root package name */
            public final p21 f5941a;

            /* renamed from: b  reason: collision with root package name */
            public final String f5942b;

            {
                this.f5941a = M;
                this.f5942b = str;
            }

            @Override // ai.ka
            public final void a(Object obj) {
                r31 r31Var = (r31) obj;
            }
        });
    }

    @Override // ai.fk1
    public final void k(final long j10) {
        final p21 M = M();
        E(M, AnalyticsListener.EVENT_AUDIO_POSITION_ADVANCING, new ka(M, j10) { // from class: ai.ly0

            /* renamed from: a  reason: collision with root package name */
            public final p21 f6724a;

            {
                this.f6724a = M;
            }

            @Override // ai.ka
            public final void a(Object obj) {
                r31 r31Var = (r31) obj;
            }
        });
    }

    @Override // ai.lp3
    public final void l(int i10, bp3 bp3Var, final so3 so3Var, final yo3 yo3Var, final IOException iOException, final boolean z10) {
        final p21 N = N(i10, bp3Var);
        E(N, AnalyticsListener.EVENT_LOAD_ERROR, new ka(N, so3Var, yo3Var, iOException, z10) { // from class: ai.kb0

            /* renamed from: a  reason: collision with root package name */
            public final p21 f6150a;

            /* renamed from: b  reason: collision with root package name */
            public final so3 f6151b;

            /* renamed from: c  reason: collision with root package name */
            public final yo3 f6152c;

            /* renamed from: d  reason: collision with root package name */
            public final IOException f6153d;

            /* renamed from: e  reason: collision with root package name */
            public final boolean f6154e;

            {
                this.f6150a = N;
                this.f6151b = so3Var;
                this.f6152c = yo3Var;
                this.f6153d = iOException;
                this.f6154e = z10;
            }

            @Override // ai.ka
            public final void a(Object obj) {
                ((r31) obj).m(this.f6150a, this.f6151b, this.f6152c, this.f6153d, this.f6154e);
            }
        });
    }

    @Override // ai.lu3
    public final void m(final int i10, final long j10) {
        final p21 L = L();
        E(L, AnalyticsListener.EVENT_DROPPED_VIDEO_FRAMES, new ka(L, i10, j10) { // from class: ai.f00

            /* renamed from: a  reason: collision with root package name */
            public final p21 f3867a;

            /* renamed from: b  reason: collision with root package name */
            public final int f3868b;

            /* renamed from: c  reason: collision with root package name */
            public final long f3869c;

            {
                this.f3867a = L;
                this.f3868b = i10;
                this.f3869c = j10;
            }

            @Override // ai.ka
            public final void a(Object obj) {
                ((r31) obj).u(this.f3867a, this.f3868b, this.f3869c);
            }
        });
    }

    @Override // ai.k6, ai.fk1
    public final void n(final boolean z10) {
        final p21 M = M();
        E(M, AnalyticsListener.EVENT_SKIP_SILENCE_ENABLED_CHANGED, new ka(M, z10) { // from class: ai.us

            /* renamed from: a  reason: collision with root package name */
            public final p21 f10817a;

            {
                this.f10817a = M;
            }

            @Override // ai.ka
            public final void a(Object obj) {
                r31 r31Var = (r31) obj;
            }
        });
    }

    @Override // ai.i6
    public final void n0(final boolean z10) {
        final p21 F = F();
        E(F, 7, new ka(F, z10) { // from class: ai.dn0

            /* renamed from: a  reason: collision with root package name */
            public final p21 f3352a;

            {
                this.f3352a = F;
            }

            @Override // ai.ka
            public final void a(Object obj) {
                r31 r31Var = (r31) obj;
            }
        });
    }

    @Override // ai.k6, ai.lu3
    public final void o(final s54 s54Var) {
        final p21 M = M();
        E(M, AnalyticsListener.EVENT_VIDEO_SIZE_CHANGED, new ka(M, s54Var) { // from class: ai.z20

            /* renamed from: a  reason: collision with root package name */
            public final p21 f12834a;

            /* renamed from: b  reason: collision with root package name */
            public final s54 f12835b;

            {
                this.f12834a = M;
                this.f12835b = s54Var;
            }

            @Override // ai.ka
            public final void a(Object obj) {
                p21 p21Var = this.f12834a;
                s54 s54Var2 = this.f12835b;
                ((r31) obj).t(p21Var, s54Var2);
                int i10 = s54Var2.f9737a;
            }
        });
    }

    @Override // ai.i6
    public final void o0() {
        final p21 F = F();
        E(F, -1, new ka(F) { // from class: ai.gt0

            /* renamed from: a  reason: collision with root package name */
            public final p21 f4570a;

            {
                this.f4570a = F;
            }

            @Override // ai.ka
            public final void a(Object obj) {
                r31 r31Var = (r31) obj;
            }
        });
    }

    @Override // ai.k6
    public final void p(final int i10, final int i11) {
        final p21 M = M();
        E(M, AnalyticsListener.EVENT_SURFACE_SIZE_CHANGED, new ka(M, i10, i11) { // from class: ai.r60

            /* renamed from: a  reason: collision with root package name */
            public final p21 f9358a;

            {
                this.f9358a = M;
            }

            @Override // ai.ka
            public final void a(Object obj) {
                r31 r31Var = (r31) obj;
            }
        });
    }

    @Override // ai.i6
    public final void p0(final e6 e6Var) {
        final p21 F = F();
        E(F, 12, new ka(F, e6Var) { // from class: ai.fq0

            /* renamed from: a  reason: collision with root package name */
            public final p21 f4156a;

            /* renamed from: b  reason: collision with root package name */
            public final e6 f4157b;

            {
                this.f4156a = F;
                this.f4157b = e6Var;
            }

            @Override // ai.ka
            public final void a(Object obj) {
                r31 r31Var = (r31) obj;
            }
        });
    }

    @Override // ai.k6
    public final void q() {
    }

    @Override // ai.i6
    public final void q0(final boolean z10, final int i10) {
        final p21 F = F();
        E(F, 5, new ka(F, z10, i10) { // from class: ai.bl0

            /* renamed from: a  reason: collision with root package name */
            public final p21 f2392a;

            {
                this.f2392a = F;
            }

            @Override // ai.ka
            public final void a(Object obj) {
                r31 r31Var = (r31) obj;
            }
        });
    }

    @Override // ai.k6
    public final void r(f3 f3Var) {
    }

    @Override // ai.i6
    public final void r0(final k5 k5Var, final int i10) {
        final p21 F = F();
        E(F, 1, new ka(F, k5Var, i10) { // from class: ai.yd0

            /* renamed from: a  reason: collision with root package name */
            public final p21 f12544a;

            /* renamed from: b  reason: collision with root package name */
            public final k5 f12545b;

            {
                this.f12544a = F;
                this.f12545b = k5Var;
            }

            @Override // ai.ka
            public final void a(Object obj) {
                r31 r31Var = (r31) obj;
            }
        });
    }

    @Override // ai.k6
    public final void s(int i10, boolean z10) {
    }

    @Override // ai.i6
    public final void s0(final n6 n6Var, final n6 n6Var2, final int i10) {
        if (i10 == 1) {
            this.E = false;
            i10 = 1;
        }
        n01 n01Var = this.f7604z;
        o6 o6Var = this.C;
        Objects.requireNonNull(o6Var);
        n01Var.g(o6Var);
        final p21 F = F();
        E(F, 11, new ka(F, i10, n6Var, n6Var2) { // from class: ai.fp0

            /* renamed from: a  reason: collision with root package name */
            public final p21 f4146a;

            /* renamed from: b  reason: collision with root package name */
            public final n6 f4147b;

            /* renamed from: c  reason: collision with root package name */
            public final n6 f4148c;

            {
                this.f4146a = F;
                this.f4147b = n6Var;
                this.f4148c = n6Var2;
            }

            @Override // ai.ka
            public final void a(Object obj) {
                r31 r31Var = (r31) obj;
            }
        });
    }

    @Override // ai.lu3
    public final void t(final long j10, final int i10) {
        final p21 L = L();
        E(L, AnalyticsListener.EVENT_VIDEO_FRAME_PROCESSING_OFFSET, new ka(L, j10, i10) { // from class: ai.r40

            /* renamed from: a  reason: collision with root package name */
            public final p21 f9336a;

            {
                this.f9336a = L;
            }

            @Override // ai.ka
            public final void a(Object obj) {
                r31 r31Var = (r31) obj;
            }
        });
    }

    @Override // ai.i6
    public final void t0(final boolean z10) {
        final p21 F = F();
        E(F, 3, new ka(F, z10) { // from class: ai.ag0

            /* renamed from: a  reason: collision with root package name */
            public final p21 f1845a;

            {
                this.f1845a = F;
            }

            @Override // ai.ka
            public final void a(Object obj) {
                r31 r31Var = (r31) obj;
            }
        });
    }

    @Override // ai.lu3
    public final void u(final Exception exc) {
        final p21 M = M();
        E(M, 1038, new ka(M, exc) { // from class: ai.q50

            /* renamed from: a  reason: collision with root package name */
            public final p21 f8834a;

            /* renamed from: b  reason: collision with root package name */
            public final Exception f8835b;

            {
                this.f8834a = M;
                this.f8835b = exc;
            }

            @Override // ai.ka
            public final void a(Object obj) {
                r31 r31Var = (r31) obj;
            }
        });
    }

    @Override // ai.i6
    public final void u0(q7 q7Var, final int i10) {
        n01 n01Var = this.f7604z;
        o6 o6Var = this.C;
        Objects.requireNonNull(o6Var);
        n01Var.h(o6Var);
        final p21 F = F();
        E(F, 0, new ka(F, i10) { // from class: ai.bd0

            /* renamed from: a  reason: collision with root package name */
            public final p21 f2292a;

            {
                this.f2292a = F;
            }

            @Override // ai.ka
            public final void a(Object obj) {
                r31 r31Var = (r31) obj;
            }
        });
    }

    @Override // ai.lp3
    public final void v(int i10, bp3 bp3Var, final yo3 yo3Var) {
        final p21 N = N(i10, bp3Var);
        E(N, AnalyticsListener.EVENT_DOWNSTREAM_FORMAT_CHANGED, new ka(N, yo3Var) { // from class: ai.bc0

            /* renamed from: a  reason: collision with root package name */
            public final p21 f2288a;

            /* renamed from: b  reason: collision with root package name */
            public final yo3 f2289b;

            {
                this.f2288a = N;
                this.f2289b = yo3Var;
            }

            @Override // ai.ka
            public final void a(Object obj) {
                r31 r31Var = (r31) obj;
            }
        });
    }

    @Override // ai.i6
    public final void v0(final uz3 uz3Var, final v04 v04Var) {
        final p21 F = F();
        E(F, 2, new ka(F, uz3Var, v04Var) { // from class: ai.ze0

            /* renamed from: a  reason: collision with root package name */
            public final p21 f12950a;

            /* renamed from: b  reason: collision with root package name */
            public final uz3 f12951b;

            /* renamed from: c  reason: collision with root package name */
            public final v04 f12952c;

            {
                this.f12950a = F;
                this.f12951b = uz3Var;
                this.f12952c = v04Var;
            }

            @Override // ai.ka
            public final void a(Object obj) {
                r31 r31Var = (r31) obj;
            }
        });
    }

    @Override // ai.fk1
    public final void w(final on onVar) {
        final p21 L = L();
        E(L, AnalyticsListener.EVENT_AUDIO_DISABLED, new ka(L, onVar) { // from class: ai.tr

            /* renamed from: a  reason: collision with root package name */
            public final p21 f10382a;

            /* renamed from: b  reason: collision with root package name */
            public final on f10383b;

            {
                this.f10382a = L;
                this.f10383b = onVar;
            }

            @Override // ai.ka
            public final void a(Object obj) {
                r31 r31Var = (r31) obj;
            }
        });
    }

    @Override // ai.i6
    public final void w0(final h6 h6Var) {
        final p21 F = F();
        E(F, 13, new ka(F, h6Var) { // from class: ai.yg0

            /* renamed from: a  reason: collision with root package name */
            public final p21 f12588a;

            /* renamed from: b  reason: collision with root package name */
            public final h6 f12589b;

            {
                this.f12588a = F;
                this.f12589b = h6Var;
            }

            @Override // ai.ka
            public final void a(Object obj) {
                r31 r31Var = (r31) obj;
            }
        });
    }

    @Override // ai.lu3
    public final void x(final v4 v4Var, final qo qoVar) {
        final p21 M = M();
        E(M, AnalyticsListener.EVENT_VIDEO_INPUT_FORMAT_CHANGED, new ka(M, v4Var, qoVar) { // from class: ai.ez

            /* renamed from: a  reason: collision with root package name */
            public final p21 f3824a;

            /* renamed from: b  reason: collision with root package name */
            public final v4 f3825b;

            /* renamed from: c  reason: collision with root package name */
            public final qo f3826c;

            {
                this.f3824a = M;
                this.f3825b = v4Var;
                this.f3826c = qoVar;
            }

            @Override // ai.ka
            public final void a(Object obj) {
                ((r31) obj).i(this.f3824a, this.f3825b, this.f3826c);
            }
        });
    }

    @Override // ai.i6
    public final void x0(final zzahc zzahcVar) {
        rv3 rv3Var;
        final p21 p21Var = null;
        if ((zzahcVar instanceof zzaeg) && (rv3Var = ((zzaeg) zzahcVar).E) != null) {
            p21Var = K(new bp3(rv3Var));
        }
        if (p21Var == null) {
            p21Var = F();
        }
        E(p21Var, 10, new ka(p21Var, zzahcVar) { // from class: ai.eo0

            /* renamed from: a  reason: collision with root package name */
            public final p21 f3731a;

            /* renamed from: b  reason: collision with root package name */
            public final zzahc f3732b;

            {
                this.f3731a = p21Var;
                this.f3732b = zzahcVar;
            }

            @Override // ai.ka
            public final void a(Object obj) {
                ((r31) obj).q(this.f3731a, this.f3732b);
            }
        });
    }

    @Override // ai.lu3
    public final void y(final String str, final long j10, final long j11) {
        final p21 M = M();
        E(M, AnalyticsListener.EVENT_VIDEO_DECODER_INITIALIZED, new ka(M, str, j11, j10) { // from class: ai.cx

            /* renamed from: a  reason: collision with root package name */
            public final p21 f3063a;

            /* renamed from: b  reason: collision with root package name */
            public final String f3064b;

            {
                this.f3063a = M;
                this.f3064b = str;
            }

            @Override // ai.ka
            public final void a(Object obj) {
                r31 r31Var = (r31) obj;
            }
        });
    }

    @Override // ai.i6
    public final void y0(final o5 o5Var) {
        final p21 F = F();
        E(F, 14, new ka(F, o5Var) { // from class: ai.fs0

            /* renamed from: a  reason: collision with root package name */
            public final p21 f4177a;

            /* renamed from: b  reason: collision with root package name */
            public final o5 f4178b;

            {
                this.f4177a = F;
                this.f4178b = o5Var;
            }

            @Override // ai.ka
            public final void a(Object obj) {
                r31 r31Var = (r31) obj;
            }
        });
    }

    @Override // ai.k6
    public final void z(final float f10) {
        final p21 M = M();
        E(M, AnalyticsListener.EVENT_VOLUME_CHANGED, new ka(M, f10) { // from class: ai.mv

            /* renamed from: a  reason: collision with root package name */
            public final p21 f7067a;

            {
                this.f7067a = M;
            }

            @Override // ai.ka
            public final void a(Object obj) {
                r31 r31Var = (r31) obj;
            }
        });
    }

    @Override // ai.i6
    public final void z0(final int i10) {
        final p21 F = F();
        E(F, 6, new ka(F, i10) { // from class: ai.cm0

            /* renamed from: a  reason: collision with root package name */
            public final p21 f2867a;

            {
                this.f2867a = F;
            }

            @Override // ai.ka
            public final void a(Object obj) {
                r31 r31Var = (r31) obj;
            }
        });
    }
}
