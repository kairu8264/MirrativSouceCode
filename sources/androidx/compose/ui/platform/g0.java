package androidx.compose.ui.platform;

import android.view.ViewConfiguration;

/* loaded from: classes.dex */
public final class g0 implements g2 {

    /* renamed from: a  reason: collision with root package name */
    public final ViewConfiguration f14447a;

    public g0(ViewConfiguration viewConfiguration) {
        jo.p.h(viewConfiguration, "viewConfiguration");
        this.f14447a = viewConfiguration;
    }

    @Override // androidx.compose.ui.platform.g2
    public long a() {
        return ViewConfiguration.getDoubleTapTimeout();
    }

    @Override // androidx.compose.ui.platform.g2
    public long b() {
        return 40L;
    }

    @Override // androidx.compose.ui.platform.g2
    public long c() {
        return ViewConfiguration.getLongPressTimeout();
    }

    @Override // androidx.compose.ui.platform.g2
    public float e() {
        return this.f14447a.getScaledTouchSlop();
    }
}
