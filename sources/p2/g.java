package p2;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import jo.p;

/* loaded from: classes.dex */
public class g implements e {
    @Override // p2.e
    public void a(View view, Rect rect) {
        p.h(view, "composeView");
        p.h(rect, "outRect");
        view.getWindowVisibleDisplayFrame(rect);
    }

    @Override // p2.e
    public void b(WindowManager windowManager, View view, ViewGroup.LayoutParams layoutParams) {
        p.h(windowManager, "windowManager");
        p.h(view, "popupView");
        p.h(layoutParams, "params");
        windowManager.updateViewLayout(view, layoutParams);
    }

    @Override // p2.e
    public void c(View view, int i10, int i11) {
        p.h(view, "composeView");
    }
}
