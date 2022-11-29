package ai;

import com.google.android.exoplayer2.C;

/* loaded from: classes3.dex */
public final class h5 {

    /* renamed from: f  reason: collision with root package name */
    public static final h5 f4745f = new h5(C.TIME_UNSET, C.TIME_UNSET, C.TIME_UNSET, -3.4028235E38f, -3.4028235E38f);

    /* renamed from: g  reason: collision with root package name */
    public static final x2<h5> f4746g = g5.f4343a;

    /* renamed from: a  reason: collision with root package name */
    public final long f4747a = C.TIME_UNSET;

    /* renamed from: b  reason: collision with root package name */
    public final long f4748b = C.TIME_UNSET;

    /* renamed from: c  reason: collision with root package name */
    public final long f4749c = C.TIME_UNSET;

    /* renamed from: d  reason: collision with root package name */
    public final float f4750d = -3.4028235E38f;

    /* renamed from: e  reason: collision with root package name */
    public final float f4751e = -3.4028235E38f;

    public h5(long j10, long j11, long j12, float f10, float f11) {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof h5) {
            long j10 = ((h5) obj).f4747a;
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10 = (int) (-9223372034707292159L);
        return (((((((i10 * 31) + i10) * 31) + i10) * 31) + Float.floatToIntBits(-3.4028235E38f)) * 31) + Float.floatToIntBits(-3.4028235E38f);
    }
}
