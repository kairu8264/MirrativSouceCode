package ai;

import com.google.android.gms.internal.ads.zzaeg;
import java.io.IOException;
import java.util.Objects;

/* loaded from: classes3.dex */
public abstract class w2 implements u6, v6 {
    public int A;
    public qq3 B;
    public v4[] C;
    public long D;
    public boolean F;
    public boolean G;

    /* renamed from: w  reason: collision with root package name */
    public final int f11461w;

    /* renamed from: y  reason: collision with root package name */
    public w6 f11463y;

    /* renamed from: z  reason: collision with root package name */
    public int f11464z;

    /* renamed from: x  reason: collision with root package name */
    public final w4 f11462x = new w4();
    public long E = Long.MIN_VALUE;

    public w2(int i10) {
        this.f11461w = i10;
    }

    public int I() throws zzaeg {
        return 0;
    }

    @Override // ai.u6
    public final void L() throws IOException {
        qq3 qq3Var = this.B;
        Objects.requireNonNull(qq3Var);
        qq3Var.b();
    }

    @Override // ai.u6
    public final void O() throws zzaeg {
        u9.d(this.A == 1);
        this.A = 2;
        n();
    }

    @Override // ai.u6
    public final boolean P() {
        return this.E == Long.MIN_VALUE;
    }

    @Override // ai.u6
    public final void S() {
        u9.d(this.A == 2);
        this.A = 1;
        o();
    }

    @Override // ai.u6
    public final boolean T() {
        return this.F;
    }

    @Override // ai.u6, ai.v6
    public final int U() {
        return this.f11461w;
    }

    @Override // ai.u6
    public final void V() {
        u9.d(this.A == 0);
        w4 w4Var = this.f11462x;
        w4Var.f11485b = null;
        w4Var.f11484a = null;
        q();
    }

    @Override // ai.u6
    public final void W(w6 w6Var, v4[] v4VarArr, qq3 qq3Var, long j10, boolean z10, boolean z11, long j11, long j12) throws zzaeg {
        u9.d(this.A == 0);
        this.f11463y = w6Var;
        this.A = 1;
        l(z10, z11);
        Y(v4VarArr, qq3Var, j11, j12);
        m(j10, z10);
    }

    @Override // ai.u6
    public final void X(int i10) {
        this.f11464z = i10;
    }

    @Override // ai.u6
    public final void Y(v4[] v4VarArr, qq3 qq3Var, long j10, long j11) throws zzaeg {
        u9.d(!this.F);
        this.B = qq3Var;
        if (this.E == Long.MIN_VALUE) {
            this.E = j10;
        }
        this.C = v4VarArr;
        this.D = j11;
        c(v4VarArr, j10, j11);
    }

    @Override // ai.u6
    public final int Z() {
        return this.A;
    }

    @Override // ai.q6
    public void a(int i10, Object obj) throws zzaeg {
    }

    @Override // ai.u6
    public final long b0() {
        return this.E;
    }

    public abstract void c(v4[] v4VarArr, long j10, long j11) throws zzaeg;

    @Override // ai.u6
    public final void c0() {
        this.F = true;
    }

    public final w4 d() {
        w4 w4Var = this.f11462x;
        w4Var.f11485b = null;
        w4Var.f11484a = null;
        return w4Var;
    }

    @Override // ai.u6
    public final qq3 d0() {
        return this.B;
    }

    public final v4[] e() {
        v4[] v4VarArr = this.C;
        Objects.requireNonNull(v4VarArr);
        return v4VarArr;
    }

    @Override // ai.u6
    public final v6 e0() {
        return this;
    }

    public final w6 f() {
        w6 w6Var = this.f11463y;
        Objects.requireNonNull(w6Var);
        return w6Var;
    }

    @Override // ai.u6
    public void f0(float f10, float f11) throws zzaeg {
    }

    public final zzaeg g(Throwable th2, v4 v4Var, boolean z10, int i10) {
        int i11 = 4;
        if (v4Var != null && !this.G) {
            this.G = true;
            try {
                i11 = K(v4Var) & 7;
            } catch (zzaeg unused) {
            } finally {
                this.G = false;
            }
        }
        return zzaeg.b(th2, b(), this.f11464z, v4Var, i11, z10, i10);
    }

    @Override // ai.u6
    public final void g0() {
        u9.d(this.A == 1);
        w4 w4Var = this.f11462x;
        w4Var.f11485b = null;
        w4Var.f11484a = null;
        this.A = 0;
        this.B = null;
        this.C = null;
        this.F = false;
        p();
    }

    @Override // ai.u6
    public qa h() {
        return null;
    }

    @Override // ai.u6
    public final void h0(long j10) throws zzaeg {
        this.F = false;
        this.E = j10;
        m(j10, false);
    }

    public final int i(w4 w4Var, a4 a4Var, int i10) {
        qq3 qq3Var = this.B;
        Objects.requireNonNull(qq3Var);
        int c10 = qq3Var.c(w4Var, a4Var, i10);
        if (c10 == -4) {
            if (a4Var.c()) {
                this.E = Long.MIN_VALUE;
                return this.F ? -4 : -3;
            }
            long j10 = a4Var.f1725e + this.D;
            a4Var.f1725e = j10;
            this.E = Math.max(this.E, j10);
        } else if (c10 == -5) {
            v4 v4Var = w4Var.f11484a;
            Objects.requireNonNull(v4Var);
            if (v4Var.f10964p != Long.MAX_VALUE) {
                t4 t4Var = new t4(v4Var, null);
                t4Var.r(v4Var.f10964p + this.D);
                w4Var.f11484a = new v4(t4Var);
                return -5;
            }
        }
        return c10;
    }

    public final int j(long j10) {
        qq3 qq3Var = this.B;
        Objects.requireNonNull(qq3Var);
        return qq3Var.a(j10 - this.D);
    }

    public final boolean k() {
        if (P()) {
            return this.F;
        }
        qq3 qq3Var = this.B;
        Objects.requireNonNull(qq3Var);
        return qq3Var.zzb();
    }

    public void l(boolean z10, boolean z11) throws zzaeg {
    }

    public abstract void m(long j10, boolean z10) throws zzaeg;

    public void n() throws zzaeg {
    }

    public void o() {
    }

    public abstract void p();

    public void q() {
    }
}
