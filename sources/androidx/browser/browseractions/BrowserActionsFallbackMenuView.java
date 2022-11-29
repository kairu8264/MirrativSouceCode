package androidx.browser.browseractions;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import o.a;

@Deprecated
/* loaded from: classes.dex */
public class BrowserActionsFallbackMenuView extends LinearLayout {

    /* renamed from: w  reason: collision with root package name */
    public final int f14281w;

    /* renamed from: x  reason: collision with root package name */
    public final int f14282x;

    public BrowserActionsFallbackMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f14281w = getResources().getDimensionPixelOffset(a.f43773b);
        this.f14282x = getResources().getDimensionPixelOffset(a.f43772a);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(getResources().getDisplayMetrics().widthPixels - (this.f14281w * 2), this.f14282x), 1073741824), i11);
    }
}
