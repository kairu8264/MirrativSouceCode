package e2;

/* loaded from: classes.dex */
public final class f0 {

    /* renamed from: a  reason: collision with root package name */
    public final c0 f30094a;

    /* renamed from: b  reason: collision with root package name */
    public final v f30095b;

    public f0(c0 c0Var, v vVar) {
        jo.p.h(c0Var, "textInputService");
        jo.p.h(vVar, "platformTextInputService");
        this.f30094a = c0Var;
        this.f30095b = vVar;
    }

    public final void a() {
        this.f30094a.d(this);
    }

    public final boolean b() {
        return jo.p.c(this.f30094a.a(), this);
    }

    public final boolean c() {
        boolean b10 = b();
        if (b10) {
            this.f30095b.d();
        }
        return b10;
    }

    public final boolean d(a0 a0Var, a0 a0Var2) {
        jo.p.h(a0Var2, "newValue");
        boolean b10 = b();
        if (b10) {
            this.f30095b.e(a0Var, a0Var2);
        }
        return b10;
    }
}
