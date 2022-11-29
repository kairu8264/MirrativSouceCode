package androidx.compose.ui.platform;

import android.view.ViewParent;

/* loaded from: classes.dex */
public final class s2 {

    /* renamed from: a  reason: collision with root package name */
    public static final s2 f14605a = new s2();

    public final void a(AndroidComposeView androidComposeView) {
        jo.p.h(androidComposeView, "ownerView");
        ViewParent parent = androidComposeView.getParent();
        if (parent != null) {
            parent.onDescendantInvalidated(androidComposeView, androidComposeView);
        }
    }
}
