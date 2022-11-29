package p6;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class y0 {

    /* renamed from: a  reason: collision with root package name */
    public Map<String, String> f46170a;

    /* renamed from: b  reason: collision with root package name */
    public Map<String, String> f46171b;

    public y0 a() {
        y0 y0Var = new y0();
        if (this.f46170a != null) {
            y0Var.f46170a = new HashMap(this.f46170a);
        }
        if (this.f46171b != null) {
            y0Var.f46171b = new HashMap(this.f46171b);
        }
        return y0Var;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            y0 y0Var = (y0) obj;
            return c1.h(this.f46170a, y0Var.f46170a) && c1.h(this.f46171b, y0Var.f46171b);
        }
        return false;
    }

    public int hashCode() {
        return ((629 + c1.K(this.f46170a)) * 37) + c1.K(this.f46171b);
    }
}
