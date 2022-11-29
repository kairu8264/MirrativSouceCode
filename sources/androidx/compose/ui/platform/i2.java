package androidx.compose.ui.platform;

import android.content.Context;
import android.graphics.Canvas;

/* loaded from: classes.dex */
public final class i2 extends u0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i2(Context context) {
        super(context);
        jo.p.h(context, "context");
    }

    @Override // androidx.compose.ui.platform.u0, android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        jo.p.h(canvas, "canvas");
    }

    public final void dispatchGetDisplayList() {
    }
}
