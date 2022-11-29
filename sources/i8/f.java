package i8;

import android.annotation.TargetApi;
import android.os.Build;
import android.os.SystemClock;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static final double f36421a;

    static {
        f36421a = Build.VERSION.SDK_INT >= 17 ? 1.0d / Math.pow(10.0d, 6.0d) : 1.0d;
    }

    public static double a(long j10) {
        return (b() - j10) * f36421a;
    }

    @TargetApi(17)
    public static long b() {
        if (Build.VERSION.SDK_INT >= 17) {
            return SystemClock.elapsedRealtimeNanos();
        }
        return SystemClock.uptimeMillis();
    }
}
