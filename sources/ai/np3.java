package ai;

import com.google.android.exoplayer2.C;
import java.io.IOException;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class np3 implements ap3, zo3 {

    /* renamed from: w  reason: collision with root package name */
    public final ap3 f7433w;

    /* renamed from: x  reason: collision with root package name */
    public final long f7434x;

    /* renamed from: y  reason: collision with root package name */
    public zo3 f7435y;

    public np3(ap3 ap3Var, long j10) {
        this.f7433w = ap3Var;
        this.f7434x = j10;
    }

    @Override // ai.ap3, ai.sq3
    public final void a(long j10) {
        this.f7433w.a(j10 - this.f7434x);
    }

    @Override // ai.ap3
    public final void b() throws IOException {
        this.f7433w.b();
    }

    @Override // ai.ap3, ai.sq3
    public final boolean c(long j10) {
        return this.f7433w.c(j10 - this.f7434x);
    }

    @Override // ai.ap3
    public final uz3 d() {
        return this.f7433w.d();
    }

    @Override // ai.ap3, ai.sq3
    public final long e() {
        long e10 = this.f7433w.e();
        if (e10 == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return e10 + this.f7434x;
    }

    @Override // ai.ap3
    public final long f() {
        long f10 = this.f7433w.f();
        return f10 == C.TIME_UNSET ? C.TIME_UNSET : f10 + this.f7434x;
    }

    @Override // ai.zo3
    public final void g(ap3 ap3Var) {
        zo3 zo3Var = this.f7435y;
        Objects.requireNonNull(zo3Var);
        zo3Var.g(this);
    }

    @Override // ai.rq3
    public final /* bridge */ /* synthetic */ void h(ap3 ap3Var) {
        zo3 zo3Var = this.f7435y;
        Objects.requireNonNull(zo3Var);
        zo3Var.h(this);
    }

    @Override // ai.ap3, ai.sq3
    public final long i() {
        long i10 = this.f7433w.i();
        if (i10 == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return i10 + this.f7434x;
    }

    @Override // ai.ap3
    public final long j(long j10) {
        return this.f7433w.j(j10 - this.f7434x) + this.f7434x;
    }

    @Override // ai.ap3, ai.sq3
    public final boolean k() {
        return this.f7433w.k();
    }

    @Override // ai.ap3
    public final void l(long j10, boolean z10) {
        this.f7433w.l(j10 - this.f7434x, false);
    }

    @Override // ai.ap3
    public final long o(long j10, y6 y6Var) {
        return this.f7433w.o(j10 - this.f7434x, y6Var) + this.f7434x;
    }

    @Override // ai.ap3
    public final long q(br3[] br3VarArr, boolean[] zArr, qq3[] qq3VarArr, boolean[] zArr2, long j10) {
        qq3[] qq3VarArr2 = new qq3[qq3VarArr.length];
        int i10 = 0;
        while (true) {
            qq3 qq3Var = null;
            if (i10 >= qq3VarArr.length) {
                break;
            }
            op3 op3Var = (op3) qq3VarArr[i10];
            if (op3Var != null) {
                qq3Var = op3Var.d();
            }
            qq3VarArr2[i10] = qq3Var;
            i10++;
        }
        long q10 = this.f7433w.q(br3VarArr, zArr, qq3VarArr2, zArr2, j10 - this.f7434x);
        for (int i11 = 0; i11 < qq3VarArr.length; i11++) {
            qq3 qq3Var2 = qq3VarArr2[i11];
            if (qq3Var2 == null) {
                qq3VarArr[i11] = null;
            } else {
                qq3 qq3Var3 = qq3VarArr[i11];
                if (qq3Var3 == null || ((op3) qq3Var3).d() != qq3Var2) {
                    qq3VarArr[i11] = new op3(qq3Var2, this.f7434x);
                }
            }
        }
        return q10 + this.f7434x;
    }

    @Override // ai.ap3
    public final void r(zo3 zo3Var, long j10) {
        this.f7435y = zo3Var;
        this.f7433w.r(this, j10 - this.f7434x);
    }
}
