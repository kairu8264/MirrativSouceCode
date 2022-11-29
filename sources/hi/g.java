package hi;

import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class g implements q {

    /* renamed from: w  reason: collision with root package name */
    public final boolean f35778w;

    public g(Boolean bool) {
        this.f35778w = bool == null ? false : bool.booleanValue();
    }

    @Override // hi.q
    public final q d() {
        return new g(Boolean.valueOf(this.f35778w));
    }

    @Override // hi.q
    public final Double e() {
        return Double.valueOf(true != this.f35778w ? 0.0d : 1.0d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g) && this.f35778w == ((g) obj).f35778w;
    }

    @Override // hi.q
    public final Boolean f() {
        return Boolean.valueOf(this.f35778w);
    }

    @Override // hi.q
    public final String h() {
        return Boolean.toString(this.f35778w);
    }

    public final int hashCode() {
        return Boolean.valueOf(this.f35778w).hashCode();
    }

    @Override // hi.q
    public final Iterator<q> j() {
        return null;
    }

    @Override // hi.q
    public final q l(String str, u4 u4Var, List<q> list) {
        if ("toString".equals(str)) {
            return new u(Boolean.toString(this.f35778w));
        }
        throw new IllegalArgumentException(String.format("%s.%s is not a function.", Boolean.toString(this.f35778w), str));
    }

    public final String toString() {
        return String.valueOf(this.f35778w);
    }
}
