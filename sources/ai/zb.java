package ai;

import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.analytics.AnalyticsListener;
import java.util.UUID;

/* loaded from: classes3.dex */
public final class zb {

    /* renamed from: a  reason: collision with root package name */
    public static final int f12921a;

    /* renamed from: b  reason: collision with root package name */
    public static final UUID f12922b;

    /* renamed from: c  reason: collision with root package name */
    public static final UUID f12923c;

    /* renamed from: d  reason: collision with root package name */
    public static final UUID f12924d;

    /* renamed from: e  reason: collision with root package name */
    public static final UUID f12925e;

    static {
        f12921a = vj.f11100a < 23 ? AnalyticsListener.EVENT_VIDEO_ENABLED : 6396;
        f12922b = new UUID(0L, 0L);
        f12923c = new UUID(1186680826959645954L, -5988876978535335093L);
        f12924d = new UUID(-1301668207276963122L, -6645017420763422227L);
        f12925e = new UUID(-7348484286925749626L, -6083546864340672619L);
    }

    public static long a(long j10) {
        return j10 == C.TIME_UNSET ? C.TIME_UNSET : j10 / 1000;
    }

    public static long b(long j10) {
        return j10 == C.TIME_UNSET ? C.TIME_UNSET : j10 * 1000;
    }
}
