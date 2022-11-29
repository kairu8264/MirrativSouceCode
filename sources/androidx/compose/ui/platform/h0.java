package androidx.compose.ui.platform;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.HashMap;
import java.util.Set;

/* loaded from: classes.dex */
public final class h0 extends ViewGroup {

    /* renamed from: w  reason: collision with root package name */
    public final HashMap<o2.a, s1.k> f14460w;

    /* renamed from: x  reason: collision with root package name */
    public final HashMap<s1.k, o2.a> f14461x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(Context context) {
        super(context);
        jo.p.h(context, "context");
        setClipChildren(false);
        this.f14460w = new HashMap<>();
        this.f14461x = new HashMap<>();
    }

    public final void a(o2.a aVar, Canvas canvas) {
        jo.p.h(aVar, "view");
        jo.p.h(canvas, "canvas");
        aVar.draw(canvas);
    }

    public Void b(int[] iArr, Rect rect) {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    public final HashMap<o2.a, s1.k> getHolderToLayoutNode() {
        return this.f14460w;
    }

    public final HashMap<s1.k, o2.a> getLayoutNodeToHolder() {
        return this.f14461x;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public /* bridge */ /* synthetic */ ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        return (ViewParent) b(iArr, rect);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    @SuppressLint({"MissingSuperCall"})
    public void onDescendantInvalidated(View view, View view2) {
        jo.p.h(view, "child");
        jo.p.h(view2, "target");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        Set<o2.a> keySet = this.f14460w.keySet();
        jo.p.g(keySet, "holderToLayoutNode.keys");
        for (o2.a aVar : keySet) {
            aVar.layout(aVar.getLeft(), aVar.getTop(), aVar.getRight(), aVar.getBottom());
        }
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        if (View.MeasureSpec.getMode(i10) == 1073741824) {
            if (View.MeasureSpec.getMode(i11) == 1073741824) {
                setMeasuredDimension(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11));
                Set<o2.a> keySet = this.f14460w.keySet();
                jo.p.g(keySet, "holderToLayoutNode.keys");
                for (o2.a aVar : keySet) {
                    aVar.h();
                }
                return;
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    @Override // android.view.View, android.view.ViewParent
    @SuppressLint({"MissingSuperCall"})
    public void requestLayout() {
        cleanupLayoutState(this);
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            s1.k kVar = this.f14460w.get(childAt);
            if (childAt.isLayoutRequested() && kVar != null) {
                s1.k.k1(kVar, false, 1, null);
            }
        }
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }
}
