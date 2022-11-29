package ai;

import com.google.android.exoplayer2.analytics.AnalyticsListener;

/* loaded from: classes3.dex */
public final class ep {

    /* renamed from: a  reason: collision with root package name */
    public static final ui3<ep> f3734a = new cp();

    public static int a(int i10) {
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 1000) {
                    return 0;
                }
                return AnalyticsListener.EVENT_LOAD_COMPLETED;
            }
            return 2;
        }
        return 1;
    }
}
