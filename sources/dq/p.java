package dq;

/* loaded from: classes4.dex */
public final class p {

    /* renamed from: a  reason: collision with root package name */
    public final Object f29860a;

    /* renamed from: b  reason: collision with root package name */
    public final n f29861b;

    /* renamed from: c  reason: collision with root package name */
    public volatile boolean f29862c = true;

    public p(Object obj, n nVar) {
        this.f29860a = obj;
        this.f29861b = nVar;
    }

    public boolean equals(Object obj) {
        if (obj instanceof p) {
            p pVar = (p) obj;
            return this.f29860a == pVar.f29860a && this.f29861b.equals(pVar.f29861b);
        }
        return false;
    }

    public int hashCode() {
        return this.f29860a.hashCode() + this.f29861b.f29846f.hashCode();
    }
}
