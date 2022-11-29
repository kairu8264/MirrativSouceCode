package androidx.compose.ui.platform;

import android.view.View;

/* loaded from: classes.dex */
public final class j2 {

    /* renamed from: a  reason: collision with root package name */
    public static final j2 f14488a = new j2();

    public final void a(View view, int i10) {
        jo.p.h(view, "view");
        view.setOutlineAmbientShadowColor(i10);
    }

    public final void b(View view, int i10) {
        jo.p.h(view, "view");
        view.setOutlineSpotShadowColor(i10);
    }
}
