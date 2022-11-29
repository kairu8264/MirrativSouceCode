package ai;

/* loaded from: classes3.dex */
public final class mw3 {

    /* renamed from: c  reason: collision with root package name */
    public static final mw3 f7081c = new mw3(0, 0);

    /* renamed from: a  reason: collision with root package name */
    public final long f7082a;

    /* renamed from: b  reason: collision with root package name */
    public final long f7083b;

    public mw3(long j10, long j11) {
        this.f7082a = j10;
        this.f7083b = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && mw3.class == obj.getClass()) {
            mw3 mw3Var = (mw3) obj;
            if (this.f7082a == mw3Var.f7082a && this.f7083b == mw3Var.f7083b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f7082a) * 31) + ((int) this.f7083b);
    }

    public final String toString() {
        long j10 = this.f7082a;
        long j11 = this.f7083b;
        StringBuilder sb2 = new StringBuilder(60);
        sb2.append("[timeUs=");
        sb2.append(j10);
        sb2.append(", position=");
        sb2.append(j11);
        sb2.append("]");
        return sb2.toString();
    }
}
