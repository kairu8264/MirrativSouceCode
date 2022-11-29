package ai;

import com.google.android.exoplayer2.C;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class q31 {

    /* renamed from: c  reason: collision with root package name */
    public static final q31 f8799c = new q31(null, new ad0[0], 0, C.TIME_UNSET, 0);

    /* renamed from: d  reason: collision with root package name */
    public static final ad0 f8800d = new ad0(0).b(0);

    /* renamed from: e  reason: collision with root package name */
    public static final x2<q31> f8801e = a.f1651a;

    /* renamed from: a  reason: collision with root package name */
    public final long f8802a = 0;

    /* renamed from: b  reason: collision with root package name */
    public final ad0[] f8803b;

    public q31(Object obj, ad0[] ad0VarArr, long j10, long j11, int i10) {
        this.f8803b = ad0VarArr;
    }

    public final ad0 a(int i10) {
        return i10 < 0 ? f8800d : this.f8803b[i10];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && q31.class == obj.getClass()) {
            q31 q31Var = (q31) obj;
            if (sb.H(null, null) && Arrays.equals(this.f8803b, q31Var.f8803b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) C.TIME_UNSET) * 961) + Arrays.hashCode(this.f8803b);
    }

    public final String toString() {
        return "AdPlaybackState(adsId=" + ((Object) null) + ", adResumePositionUs=0, adGroups=[])";
    }
}
