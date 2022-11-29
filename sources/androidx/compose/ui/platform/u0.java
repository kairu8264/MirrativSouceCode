package androidx.compose.ui.platform;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import java.util.Objects;

/* loaded from: classes.dex */
public class u0 extends ViewGroup {

    /* renamed from: w  reason: collision with root package name */
    public boolean f14664w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(Context context) {
        super(context);
        jo.p.h(context, "context");
        setClipChildren(false);
        setTag(x0.h.J, Boolean.TRUE);
    }

    public final void a(c1.w wVar, View view, long j10) {
        jo.p.h(wVar, "canvas");
        jo.p.h(view, "view");
        super.drawChild(c1.c.c(wVar), view, j10);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        boolean z10;
        jo.p.h(canvas, "canvas");
        int childCount = super.getChildCount();
        int i10 = 0;
        while (true) {
            if (i10 >= childCount) {
                z10 = false;
                break;
            }
            View childAt = getChildAt(i10);
            Objects.requireNonNull(childAt, "null cannot be cast to non-null type androidx.compose.ui.platform.ViewLayer");
            if (((h2) childAt).s()) {
                z10 = true;
                break;
            }
            i10++;
        }
        if (z10) {
            this.f14664w = true;
            try {
                super.dispatchDraw(canvas);
            } finally {
                this.f14664w = false;
            }
        }
    }

    @Override // android.view.ViewGroup
    public int getChildCount() {
        if (this.f14664w) {
            return super.getChildCount();
        }
        return 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        setMeasuredDimension(0, 0);
    }
}
