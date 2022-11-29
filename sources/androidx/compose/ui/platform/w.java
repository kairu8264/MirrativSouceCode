package androidx.compose.ui.platform;

import android.view.PointerIcon;
import android.view.View;

/* loaded from: classes.dex */
public final class w {

    /* renamed from: a  reason: collision with root package name */
    public static final w f14671a = new w();

    public final void a(View view, n1.r rVar) {
        PointerIcon systemIcon;
        jo.p.h(view, "view");
        if (rVar instanceof n1.a) {
            systemIcon = ((n1.a) rVar).a();
        } else if (rVar instanceof n1.b) {
            systemIcon = PointerIcon.getSystemIcon(view.getContext(), ((n1.b) rVar).a());
        } else {
            systemIcon = PointerIcon.getSystemIcon(view.getContext(), 1000);
        }
        if (jo.p.c(view.getPointerIcon(), systemIcon)) {
            return;
        }
        view.setPointerIcon(systemIcon);
    }
}
