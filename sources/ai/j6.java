package ai;

/* loaded from: classes3.dex */
public final class j6 {

    /* renamed from: a  reason: collision with root package name */
    public final fa f5629a;

    public j6(fa faVar) {
        this.f5629a = faVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof j6) {
            return this.f5629a.equals(((j6) obj).f5629a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f5629a.hashCode();
    }
}
