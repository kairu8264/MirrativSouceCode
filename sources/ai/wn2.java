package ai;

/* loaded from: classes3.dex */
public final class wn2 implements un2 {

    /* renamed from: a  reason: collision with root package name */
    public final String f11698a;

    public wn2(String str) {
        this.f11698a = str;
    }

    @Override // ai.un2
    public final boolean equals(Object obj) {
        if (obj instanceof wn2) {
            return this.f11698a.equals(((wn2) obj).f11698a);
        }
        return false;
    }

    @Override // ai.un2
    public final int hashCode() {
        return this.f11698a.hashCode();
    }

    public final String toString() {
        return this.f11698a;
    }
}
