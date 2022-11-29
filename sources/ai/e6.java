package ai;

/* loaded from: classes3.dex */
public final class e6 {

    /* renamed from: d  reason: collision with root package name */
    public static final e6 f3542d = new e6(1.0f, 1.0f);

    /* renamed from: e  reason: collision with root package name */
    public static final x2<e6> f3543e = d6.f3158a;

    /* renamed from: a  reason: collision with root package name */
    public final float f3544a;

    /* renamed from: b  reason: collision with root package name */
    public final float f3545b;

    /* renamed from: c  reason: collision with root package name */
    public final int f3546c;

    public e6(float f10, float f11) {
        u9.a(f10 > 0.0f);
        u9.a(f11 > 0.0f);
        this.f3544a = f10;
        this.f3545b = f11;
        this.f3546c = Math.round(f10 * 1000.0f);
    }

    public final long a(long j10) {
        return j10 * this.f3546c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && e6.class == obj.getClass()) {
            e6 e6Var = (e6) obj;
            if (this.f3544a == e6Var.f3544a && this.f3545b == e6Var.f3545b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Float.floatToRawIntBits(this.f3544a) + 527) * 31) + Float.floatToRawIntBits(this.f3545b);
    }

    public final String toString() {
        return sb.a0("PlaybackParameters(speed=%.2f, pitch=%.2f)", Float.valueOf(this.f3544a), Float.valueOf(this.f3545b));
    }
}
