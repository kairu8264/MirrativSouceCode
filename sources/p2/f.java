package p2;

import android.graphics.Rect;
import android.view.View;
import jo.p;
import xn.s;

/* loaded from: classes.dex */
public final class f extends g {
    @Override // p2.g, p2.e
    public void c(View view, int i10, int i11) {
        p.h(view, "composeView");
        view.setSystemGestureExclusionRects(s.p(new Rect(0, 0, i10, i11)));
    }
}
