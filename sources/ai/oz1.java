package ai;

/* loaded from: classes3.dex */
public final class oz1 {

    /* renamed from: a  reason: collision with root package name */
    public final u71[] f8178a;

    /* renamed from: b  reason: collision with root package name */
    public final ae2 f8179b;

    /* renamed from: c  reason: collision with root package name */
    public final cg2 f8180c;

    public oz1(u71... u71VarArr) {
        ae2 ae2Var = new ae2();
        cg2 cg2Var = new cg2();
        this.f8178a = r2;
        System.arraycopy(u71VarArr, 0, r2, 0, 0);
        this.f8179b = ae2Var;
        this.f8180c = cg2Var;
        u71[] u71VarArr2 = {ae2Var, cg2Var};
    }

    public final u71[] a() {
        return this.f8178a;
    }

    public final e6 b(e6 e6Var) {
        this.f8180c.h(e6Var.f3544a);
        this.f8180c.i(e6Var.f3545b);
        return e6Var;
    }

    public final boolean c(boolean z10) {
        this.f8179b.n(z10);
        return z10;
    }

    public final long d(long j10) {
        return this.f8180c.j(j10);
    }

    public final long e() {
        return this.f8179b.o();
    }
}
