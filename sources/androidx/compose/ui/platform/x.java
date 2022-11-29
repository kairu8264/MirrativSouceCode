package androidx.compose.ui.platform;

import android.view.View;

/* loaded from: classes.dex */
public final class x {

    /* renamed from: a  reason: collision with root package name */
    public static final x f14679a = new x();

    public final void a(View view, int i10, boolean z10) {
        jo.p.h(view, "view");
        view.setFocusable(i10);
        view.setDefaultFocusHighlightEnabled(z10);
    }
}
