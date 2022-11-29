package ai;

/* loaded from: classes3.dex */
public final class u23 extends m23 {
    public /* synthetic */ u23(q23 q23Var) {
        super(null);
    }

    @Override // ai.m23
    public final void a(z23 z23Var, Thread thread) {
        z23Var.f12843a = thread;
    }

    @Override // ai.m23
    public final void b(z23 z23Var, z23 z23Var2) {
        z23Var.f12844b = z23Var2;
    }

    @Override // ai.m23
    public final boolean c(a33<?> a33Var, z23 z23Var, z23 z23Var2) {
        z23 z23Var3;
        synchronized (a33Var) {
            z23Var3 = a33Var.f1721y;
            if (z23Var3 == z23Var) {
                a33Var.f1721y = z23Var2;
                return true;
            }
            return false;
        }
    }

    @Override // ai.m23
    public final boolean d(a33<?> a33Var, p23 p23Var, p23 p23Var2) {
        p23 p23Var3;
        synchronized (a33Var) {
            p23Var3 = a33Var.f1720x;
            if (p23Var3 == p23Var) {
                a33Var.f1720x = p23Var2;
                return true;
            }
            return false;
        }
    }

    @Override // ai.m23
    public final boolean e(a33<?> a33Var, Object obj, Object obj2) {
        Object obj3;
        synchronized (a33Var) {
            obj3 = a33Var.f1719w;
            if (obj3 == obj) {
                a33Var.f1719w = obj2;
                return true;
            }
            return false;
        }
    }
}
