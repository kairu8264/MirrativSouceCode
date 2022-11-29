package androidx.compose.ui.platform;

import android.view.View;

/* loaded from: classes.dex */
public interface l2 {
    default a getSubCompositionView() {
        return null;
    }

    default View getViewRoot() {
        return null;
    }
}
