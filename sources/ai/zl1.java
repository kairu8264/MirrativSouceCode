package ai;

/* loaded from: classes3.dex */
public final class zl1 implements h40 {

    /* renamed from: w  reason: collision with root package name */
    public final d61 f13026w;

    /* renamed from: x  reason: collision with root package name */
    public final lf0 f13027x;

    /* renamed from: y  reason: collision with root package name */
    public final String f13028y;

    /* renamed from: z  reason: collision with root package name */
    public final String f13029z;

    public zl1(d61 d61Var, fl2 fl2Var) {
        this.f13026w = d61Var;
        this.f13027x = fl2Var.f4102m;
        this.f13028y = fl2Var.f4100k;
        this.f13029z = fl2Var.f4101l;
    }

    @Override // ai.h40
    public final void b() {
        this.f13026w.a();
    }

    @Override // ai.h40
    public final void p0(lf0 lf0Var) {
        int i10;
        String str;
        lf0 lf0Var2 = this.f13027x;
        if (lf0Var2 != null) {
            lf0Var = lf0Var2;
        }
        if (lf0Var != null) {
            str = lf0Var.f6553w;
            i10 = lf0Var.f6554x;
        } else {
            i10 = 1;
            str = "";
        }
        this.f13026w.S0(new ve0(str, i10), this.f13028y, this.f13029z);
    }

    @Override // ai.h40
    public final void zza() {
        this.f13026w.d();
    }
}
