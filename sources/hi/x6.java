package hi;

/* loaded from: classes3.dex */
public final class x6<T> extends v6<T> {

    /* renamed from: w  reason: collision with root package name */
    public final T f36067w;

    public x6(T t10) {
        this.f36067w = t10;
    }

    @Override // hi.v6
    public final T a() {
        return this.f36067w;
    }

    @Override // hi.v6
    public final boolean b() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof x6) {
            return this.f36067w.equals(((x6) obj).f36067w);
        }
        return false;
    }

    public final int hashCode() {
        return this.f36067w.hashCode() + 1502476572;
    }

    public final String toString() {
        String obj = this.f36067w.toString();
        StringBuilder sb2 = new StringBuilder(obj.length() + 13);
        sb2.append("Optional.of(");
        sb2.append(obj);
        sb2.append(")");
        return sb2.toString();
    }
}
