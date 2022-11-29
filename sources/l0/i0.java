package l0;

/* loaded from: classes.dex */
public final class i0 {

    /* renamed from: a  reason: collision with root package name */
    public final Object f39068a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f39069b;

    public i0(Object obj, Object obj2) {
        this.f39068a = obj;
        this.f39069b = obj2;
    }

    public final int a(Object obj) {
        if (obj instanceof Enum) {
            return ((Enum) obj).ordinal();
        }
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof i0) {
            i0 i0Var = (i0) obj;
            return jo.p.c(this.f39068a, i0Var.f39068a) && jo.p.c(this.f39069b, i0Var.f39069b);
        }
        return false;
    }

    public int hashCode() {
        return (a(this.f39068a) * 31) + a(this.f39069b);
    }

    public String toString() {
        return "JoinedKey(left=" + this.f39068a + ", right=" + this.f39069b + ')';
    }
}
