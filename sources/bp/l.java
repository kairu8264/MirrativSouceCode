package bp;

import com.google.android.exoplayer2.extractor.mp3.IndexSeeker;
import java.util.concurrent.TimeUnit;
import zo.l0;
import zo.n0;

/* loaded from: classes4.dex */
public final class l {

    /* renamed from: a  reason: collision with root package name */
    public static final long f18573a;

    /* renamed from: b  reason: collision with root package name */
    public static final int f18574b;

    /* renamed from: c  reason: collision with root package name */
    public static final int f18575c;

    /* renamed from: d  reason: collision with root package name */
    public static final long f18576d;

    /* renamed from: e  reason: collision with root package name */
    public static g f18577e;

    /* renamed from: f  reason: collision with root package name */
    public static final i f18578f;

    /* renamed from: g  reason: collision with root package name */
    public static final i f18579g;

    static {
        long e10;
        int d10;
        int d11;
        long e11;
        e10 = n0.e("kotlinx.coroutines.scheduler.resolution.ns", IndexSeeker.MIN_TIME_BETWEEN_POINTS_US, 0L, 0L, 12, null);
        f18573a = e10;
        d10 = n0.d("kotlinx.coroutines.scheduler.core.pool.size", po.n.d(l0.a(), 2), 1, 0, 8, null);
        f18574b = d10;
        d11 = n0.d("kotlinx.coroutines.scheduler.max.pool.size", 2097150, 0, 2097150, 4, null);
        f18575c = d11;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        e11 = n0.e("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 0L, 0L, 12, null);
        f18576d = timeUnit.toNanos(e11);
        f18577e = e.f18566a;
        f18578f = new j(0);
        f18579g = new j(1);
    }
}
