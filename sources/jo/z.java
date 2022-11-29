package jo;

/* loaded from: classes4.dex */
public abstract class z extends d implements qo.h {
    public z() {
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof z) {
            z zVar = (z) obj;
            return f().equals(zVar.f()) && e().equals(zVar.e()) && h().equals(zVar.h()) && p.c(d(), zVar.d());
        } else if (obj instanceof qo.h) {
            return obj.equals(b());
        } else {
            return false;
        }
    }

    public int hashCode() {
        return (((f().hashCode() * 31) + e().hashCode()) * 31) + h().hashCode();
    }

    public qo.h i() {
        return (qo.h) super.g();
    }

    public String toString() {
        qo.a b10 = b();
        if (b10 != this) {
            return b10.toString();
        }
        return "property " + e() + " (Kotlin reflection is not available)";
    }

    public z(Object obj, Class cls, String str, String str2, int i10) {
        super(obj, cls, str, str2, (i10 & 1) == 1);
    }
}
