package ai;

/* loaded from: classes3.dex */
public final class jw3 {

    /* renamed from: a  reason: collision with root package name */
    public final mw3 f5944a;

    /* renamed from: b  reason: collision with root package name */
    public final mw3 f5945b;

    public jw3(mw3 mw3Var, mw3 mw3Var2) {
        this.f5944a = mw3Var;
        this.f5945b = mw3Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && jw3.class == obj.getClass()) {
            jw3 jw3Var = (jw3) obj;
            if (this.f5944a.equals(jw3Var.f5944a) && this.f5945b.equals(jw3Var.f5945b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f5944a.hashCode() * 31) + this.f5945b.hashCode();
    }

    public final String toString() {
        String obj = this.f5944a.toString();
        String concat = this.f5944a.equals(this.f5945b) ? "" : ", ".concat(this.f5945b.toString());
        StringBuilder sb2 = new StringBuilder(obj.length() + 2 + concat.length());
        sb2.append("[");
        sb2.append(obj);
        sb2.append(concat);
        sb2.append("]");
        return sb2.toString();
    }
}
