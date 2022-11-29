package ai;

import com.google.android.exoplayer2.C;
import java.io.IOException;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class to3 implements ap3, zo3 {
    public zo3 A;
    public long B = C.TIME_UNSET;
    public final is3 C;

    /* renamed from: w  reason: collision with root package name */
    public final bp3 f10360w;

    /* renamed from: x  reason: collision with root package name */
    public final long f10361x;

    /* renamed from: y  reason: collision with root package name */
    public dp3 f10362y;

    /* renamed from: z  reason: collision with root package name */
    public ap3 f10363z;

    public to3(bp3 bp3Var, is3 is3Var, long j10, byte[] bArr) {
        this.f10360w = bp3Var;
        this.C = is3Var;
        this.f10361x = j10;
    }

    @Override // ai.ap3, ai.sq3
    public final void a(long j10) {
        ap3 ap3Var = this.f10363z;
        int i10 = sb.f9778a;
        ap3Var.a(j10);
    }

    @Override // ai.ap3
    public final void b() throws IOException {
        try {
            ap3 ap3Var = this.f10363z;
            if (ap3Var != null) {
                ap3Var.b();
                return;
            }
            dp3 dp3Var = this.f10362y;
            if (dp3Var != null) {
                dp3Var.r();
            }
        } catch (IOException e10) {
            throw e10;
        }
    }

    @Override // ai.ap3, ai.sq3
    public final boolean c(long j10) {
        ap3 ap3Var = this.f10363z;
        return ap3Var != null && ap3Var.c(j10);
    }

    @Override // ai.ap3
    public final uz3 d() {
        ap3 ap3Var = this.f10363z;
        int i10 = sb.f9778a;
        return ap3Var.d();
    }

    @Override // ai.ap3, ai.sq3
    public final long e() {
        ap3 ap3Var = this.f10363z;
        int i10 = sb.f9778a;
        return ap3Var.e();
    }

    @Override // ai.ap3
    public final long f() {
        ap3 ap3Var = this.f10363z;
        int i10 = sb.f9778a;
        return ap3Var.f();
    }

    @Override // ai.zo3
    public final void g(ap3 ap3Var) {
        zo3 zo3Var = this.A;
        int i10 = sb.f9778a;
        zo3Var.g(this);
    }

    @Override // ai.rq3
    public final /* bridge */ /* synthetic */ void h(ap3 ap3Var) {
        zo3 zo3Var = this.A;
        int i10 = sb.f9778a;
        zo3Var.h(this);
    }

    @Override // ai.ap3, ai.sq3
    public final long i() {
        ap3 ap3Var = this.f10363z;
        int i10 = sb.f9778a;
        return ap3Var.i();
    }

    @Override // ai.ap3
    public final long j(long j10) {
        ap3 ap3Var = this.f10363z;
        int i10 = sb.f9778a;
        return ap3Var.j(j10);
    }

    @Override // ai.ap3, ai.sq3
    public final boolean k() {
        ap3 ap3Var = this.f10363z;
        return ap3Var != null && ap3Var.k();
    }

    @Override // ai.ap3
    public final void l(long j10, boolean z10) {
        ap3 ap3Var = this.f10363z;
        int i10 = sb.f9778a;
        ap3Var.l(j10, false);
    }

    public final long m() {
        return this.f10361x;
    }

    public final void n(long j10) {
        this.B = j10;
    }

    @Override // ai.ap3
    public final long o(long j10, y6 y6Var) {
        ap3 ap3Var = this.f10363z;
        int i10 = sb.f9778a;
        return ap3Var.o(j10, y6Var);
    }

    public final long p() {
        return this.B;
    }

    @Override // ai.ap3
    public final long q(br3[] br3VarArr, boolean[] zArr, qq3[] qq3VarArr, boolean[] zArr2, long j10) {
        long j11;
        long j12 = this.B;
        if (j12 == C.TIME_UNSET || j10 != this.f10361x) {
            j11 = j10;
        } else {
            this.B = C.TIME_UNSET;
            j11 = j12;
        }
        ap3 ap3Var = this.f10363z;
        int i10 = sb.f9778a;
        return ap3Var.q(br3VarArr, zArr, qq3VarArr, zArr2, j11);
    }

    @Override // ai.ap3
    public final void r(zo3 zo3Var, long j10) {
        this.A = zo3Var;
        ap3 ap3Var = this.f10363z;
        if (ap3Var != null) {
            ap3Var.r(this, v(this.f10361x));
        }
    }

    public final void s(dp3 dp3Var) {
        u9.d(this.f10362y == null);
        this.f10362y = dp3Var;
    }

    public final void t(bp3 bp3Var) {
        long v10 = v(this.f10361x);
        dp3 dp3Var = this.f10362y;
        Objects.requireNonNull(dp3Var);
        ap3 f10 = dp3Var.f(bp3Var, this.C, v10);
        this.f10363z = f10;
        if (this.A != null) {
            f10.r(this, v10);
        }
    }

    public final void u() {
        ap3 ap3Var = this.f10363z;
        if (ap3Var != null) {
            dp3 dp3Var = this.f10362y;
            Objects.requireNonNull(dp3Var);
            dp3Var.g(ap3Var);
        }
    }

    public final long v(long j10) {
        long j11 = this.B;
        return j11 != C.TIME_UNSET ? j11 : j10;
    }
}
