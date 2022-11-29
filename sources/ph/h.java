package ph;

/* loaded from: classes3.dex */
public final class h<L> {

    /* renamed from: a  reason: collision with root package name */
    public final L f47499a;

    /* renamed from: b  reason: collision with root package name */
    public final String f47500b;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            return this.f47499a == hVar.f47499a && this.f47500b.equals(hVar.f47500b);
        }
        return false;
    }

    public int hashCode() {
        return (System.identityHashCode(this.f47499a) * 31) + this.f47500b.hashCode();
    }
}
