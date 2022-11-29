package t5;

/* loaded from: classes.dex */
public class g {

    /* renamed from: a  reason: collision with root package name */
    public final String f53169a;

    /* renamed from: b  reason: collision with root package name */
    public final int f53170b;

    public g(String str, int i10) {
        this.f53169a = str;
        this.f53170b = i10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof g) {
            g gVar = (g) obj;
            if (this.f53170b != gVar.f53170b) {
                return false;
            }
            return this.f53169a.equals(gVar.f53169a);
        }
        return false;
    }

    public int hashCode() {
        return (this.f53169a.hashCode() * 31) + this.f53170b;
    }
}
