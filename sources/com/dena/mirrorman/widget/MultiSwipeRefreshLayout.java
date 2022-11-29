package com.dena.mirrorman.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import java.util.ArrayList;
import java.util.List;
import jo.p;

/* loaded from: classes3.dex */
public final class MultiSwipeRefreshLayout extends SwipeRefreshLayout {

    /* renamed from: r0  reason: collision with root package name */
    public final List<View> f26368r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultiSwipeRefreshLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        p.h(context, "context");
        this.f26368r0 = new ArrayList();
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout
    public boolean c() {
        if (!this.f26368r0.isEmpty()) {
            for (View view : this.f26368r0) {
                if (view.isShown() && !u(view)) {
                    return false;
                }
            }
        }
        return true;
    }

    public final void setSwipeableChildren(List<Integer> list) {
        p.h(list, "viewIds");
        for (Number number : list) {
            int intValue = number.intValue();
            List<View> list2 = this.f26368r0;
            View findViewById = findViewById(intValue);
            p.g(findViewById, "findViewById(viewId)");
            list2.add(findViewById);
        }
    }

    public final boolean u(View view) {
        return view.canScrollVertically(-1);
    }
}
