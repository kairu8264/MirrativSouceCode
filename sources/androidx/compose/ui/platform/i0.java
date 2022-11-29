package androidx.compose.ui.platform;

import android.view.accessibility.AccessibilityManager;

/* loaded from: classes.dex */
public final class i0 {

    /* renamed from: a  reason: collision with root package name */
    public static final i0 f14471a = new i0();

    public final int a(AccessibilityManager accessibilityManager, int i10, int i11) {
        jo.p.h(accessibilityManager, "accessibilityManager");
        return accessibilityManager.getRecommendedTimeoutMillis(i10, i11);
    }
}
