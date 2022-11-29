package ai;

/* loaded from: classes3.dex */
public abstract class v2 implements o6 {

    /* renamed from: a  reason: collision with root package name */
    public final p7 f10933a = new p7();

    public final boolean a() {
        q7 D = D();
        if (!D.k()) {
            int C = C();
            n();
            o();
            if (D.c(C, 0, false) != -1) {
                return true;
            }
        }
        return false;
    }

    public final boolean b() {
        q7 D = D();
        if (!D.k()) {
            int C = C();
            n();
            o();
            if (D.b(C, 0, false) != -1) {
                return true;
            }
        }
        return false;
    }

    public final boolean c() {
        q7 D = D();
        return !D.k() && D.f(C(), this.f10933a, 0L).b();
    }

    public final boolean d() {
        q7 D = D();
        return !D.k() && D.f(C(), this.f10933a, 0L).f8331f;
    }
}
