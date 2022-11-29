package hi;

/* loaded from: classes3.dex */
public final class t3 {

    /* renamed from: a  reason: collision with root package name */
    public final y f35994a;

    /* renamed from: b  reason: collision with root package name */
    public final u4 f35995b;

    /* renamed from: c  reason: collision with root package name */
    public final u4 f35996c;

    /* renamed from: d  reason: collision with root package name */
    public final x7 f35997d;

    public t3() {
        y yVar = new y();
        this.f35994a = yVar;
        u4 u4Var = new u4(null, yVar);
        this.f35996c = u4Var;
        this.f35995b = u4Var.a();
        x7 x7Var = new x7();
        this.f35997d = x7Var;
        u4Var.g("require", new ff(x7Var));
        x7Var.a("internal.platform", s2.f35984a);
        u4Var.g("runtime.counter", new i(Double.valueOf(0.0d)));
    }

    public final q a(u4 u4Var, o5... o5VarArr) {
        q qVar = q.f35921f;
        for (o5 o5Var : o5VarArr) {
            qVar = w6.a(o5Var);
            v5.c(this.f35996c);
            if ((qVar instanceof r) || (qVar instanceof p)) {
                qVar = this.f35994a.a(u4Var, qVar);
            }
        }
        return qVar;
    }
}
