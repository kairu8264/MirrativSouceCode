package ai;

/* loaded from: classes3.dex */
public final class qc {

    /* renamed from: d  reason: collision with root package name */
    public static final qc f8867d = new qc(1.0f, 1.0f);

    /* renamed from: a  reason: collision with root package name */
    public final float f8868a;

    /* renamed from: b  reason: collision with root package name */
    public final float f8869b = 1.0f;

    /* renamed from: c  reason: collision with root package name */
    public final int f8870c;

    public qc(float f10, float f11) {
        this.f8868a = f10;
        this.f8870c = Math.round(f10 * 1000.0f);
    }

    public final long a(long j10) {
        return j10 * this.f8870c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && qc.class == obj.getClass() && this.f8868a == ((qc) obj).f8868a;
    }

    public final int hashCode() {
        return ((Float.floatToRawIntBits(this.f8868a) + 527) * 31) + Float.floatToRawIntBits(1.0f);
    }
}
