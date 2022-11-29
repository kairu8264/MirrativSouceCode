package jo;

/* loaded from: classes4.dex */
public class l extends d implements k, qo.d {
    public final int D;
    public final int E;

    public l(int i10, Object obj, Class cls, String str, String str2, int i11) {
        super(obj, cls, str, str2, (i11 & 1) == 1);
        this.D = i10;
        this.E = i11 >> 1;
    }

    @Override // jo.d
    public qo.a c() {
        return f0.a(this);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof l) {
            l lVar = (l) obj;
            return e().equals(lVar.e()) && h().equals(lVar.h()) && this.E == lVar.E && this.D == lVar.D && p.c(d(), lVar.d()) && p.c(f(), lVar.f());
        } else if (obj instanceof qo.d) {
            return obj.equals(b());
        } else {
            return false;
        }
    }

    @Override // jo.k
    public int getArity() {
        return this.D;
    }

    public int hashCode() {
        return (((f() == null ? 0 : f().hashCode() * 31) + e().hashCode()) * 31) + h().hashCode();
    }

    public String toString() {
        qo.a b10 = b();
        if (b10 != this) {
            return b10.toString();
        }
        if ("<init>".equals(e())) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + e() + " (Kotlin reflection is not available)";
    }
}
