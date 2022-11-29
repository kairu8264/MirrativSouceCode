package p1;

/* loaded from: classes.dex */
public final class b implements k1.a {

    /* renamed from: a  reason: collision with root package name */
    public final float f45685a;

    /* renamed from: b  reason: collision with root package name */
    public final float f45686b;

    /* renamed from: c  reason: collision with root package name */
    public final long f45687c;

    public b(float f10, float f11, long j10) {
        this.f45685a = f10;
        this.f45686b = f11;
        this.f45687c = j10;
    }

    public boolean equals(Object obj) {
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (bVar.f45685a == this.f45685a) {
                if ((bVar.f45686b == this.f45686b) && bVar.f45687c == this.f45687c) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((0 + Float.hashCode(this.f45685a)) * 31) + Float.hashCode(this.f45686b)) * 31) + Long.hashCode(this.f45687c);
    }

    public String toString() {
        return "RotaryScrollEvent(verticalScrollPixels=" + this.f45685a + ",horizontalScrollPixels=" + this.f45686b + ",uptimeMillis=" + this.f45687c + ')';
    }
}
