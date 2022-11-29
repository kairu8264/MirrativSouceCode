package zo;

import uo.v0;

/* loaded from: classes4.dex */
public abstract class d0 {
    public abstract d<?> a();

    public final boolean b(d0 d0Var) {
        d<?> a10;
        d<?> a11 = a();
        return (a11 == null || (a10 = d0Var.a()) == null || a11.g() >= a10.g()) ? false : true;
    }

    public abstract Object c(Object obj);

    public String toString() {
        return v0.a(this) + '@' + v0.b(this);
    }
}
