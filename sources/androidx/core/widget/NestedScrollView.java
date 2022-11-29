package androidx.core.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import android.widget.ScrollView;
import androidx.appcompat.widget.ListPopupWindow;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import java.util.ArrayList;
import o3.c0;
import o3.p;
import o3.q;
import o3.s;
import o3.u;
import p3.c;
import p3.e;

/* loaded from: classes.dex */
public class NestedScrollView extends FrameLayout implements s, p {
    public static final a W = new a();

    /* renamed from: a0  reason: collision with root package name */
    public static final int[] f14974a0 = {16843130};
    public EdgeEffect A;
    public int B;
    public boolean C;
    public boolean D;
    public View E;
    public boolean F;
    public VelocityTracker G;
    public boolean H;
    public boolean I;
    public int J;
    public int K;
    public int L;
    public int M;
    public final int[] N;
    public final int[] O;
    public int P;
    public int Q;
    public c R;
    public final u S;
    public final q T;
    public float U;
    public b V;

    /* renamed from: w  reason: collision with root package name */
    public long f14975w;

    /* renamed from: x  reason: collision with root package name */
    public final Rect f14976x;

    /* renamed from: y  reason: collision with root package name */
    public OverScroller f14977y;

    /* renamed from: z  reason: collision with root package name */
    public EdgeEffect f14978z;

    /* loaded from: classes.dex */
    public static class a extends o3.a {
        @Override // o3.a
        public void f(View view, AccessibilityEvent accessibilityEvent) {
            super.f(view, accessibilityEvent);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            accessibilityEvent.setClassName(ScrollView.class.getName());
            accessibilityEvent.setScrollable(nestedScrollView.getScrollRange() > 0);
            accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
            accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
            e.a(accessibilityEvent, nestedScrollView.getScrollX());
            e.b(accessibilityEvent, nestedScrollView.getScrollRange());
        }

        @Override // o3.a
        public void g(View view, p3.c cVar) {
            int scrollRange;
            super.g(view, cVar);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            cVar.b0(ScrollView.class.getName());
            if (!nestedScrollView.isEnabled() || (scrollRange = nestedScrollView.getScrollRange()) <= 0) {
                return;
            }
            cVar.B0(true);
            if (nestedScrollView.getScrollY() > 0) {
                cVar.b(c.a.f45758r);
                cVar.b(c.a.C);
            }
            if (nestedScrollView.getScrollY() < scrollRange) {
                cVar.b(c.a.f45757q);
                cVar.b(c.a.E);
            }
        }

        @Override // o3.a
        public boolean j(View view, int i10, Bundle bundle) {
            if (super.j(view, i10, bundle)) {
                return true;
            }
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            if (nestedScrollView.isEnabled()) {
                if (i10 != 4096) {
                    if (i10 == 8192 || i10 == 16908344) {
                        int max = Math.max(nestedScrollView.getScrollY() - ((nestedScrollView.getHeight() - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), 0);
                        if (max != nestedScrollView.getScrollY()) {
                            nestedScrollView.J(0, max, true);
                            return true;
                        }
                        return false;
                    } else if (i10 != 16908346) {
                        return false;
                    }
                }
                int min = Math.min(nestedScrollView.getScrollY() + ((nestedScrollView.getHeight() - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), nestedScrollView.getScrollRange());
                if (min != nestedScrollView.getScrollY()) {
                    nestedScrollView.J(0, min, true);
                    return true;
                }
                return false;
            }
            return false;
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        void a(NestedScrollView nestedScrollView, int i10, int i11, int i12, int i13);
    }

    /* loaded from: classes.dex */
    public static class c extends View.BaseSavedState {
        public static final Parcelable.Creator<c> CREATOR = new a();

        /* renamed from: w  reason: collision with root package name */
        public int f14979w;

        /* loaded from: classes.dex */
        public class a implements Parcelable.Creator<c> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public c createFromParcel(Parcel parcel) {
                return new c(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public c[] newArray(int i10) {
                return new c[i10];
            }
        }

        public c(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "HorizontalScrollView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " scrollPosition=" + this.f14979w + "}";
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f14979w);
        }

        public c(Parcel parcel) {
            super(parcel);
            this.f14979w = parcel.readInt();
        }
    }

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, a3.a.f369c);
    }

    public static int d(int i10, int i11, int i12) {
        if (i11 >= i12 || i10 < 0) {
            return 0;
        }
        return i11 + i10 > i12 ? i12 - i11 : i10;
    }

    private float getVerticalScrollFactorCompat() {
        if (this.U == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (context.getTheme().resolveAttribute(16842829, typedValue, true)) {
                this.U = typedValue.getDimension(context.getResources().getDisplayMetrics());
            } else {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
        }
        return this.U;
    }

    public static boolean u(View view, View view2) {
        if (view == view2) {
            return true;
        }
        ViewParent parent = view.getParent();
        return (parent instanceof ViewGroup) && u((View) parent, view2);
    }

    public final void A() {
        VelocityTracker velocityTracker = this.G;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.G = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int B(int r4, float r5) {
        /*
            r3 = this;
            int r0 = r3.getWidth()
            float r0 = (float) r0
            float r5 = r5 / r0
            float r4 = (float) r4
            int r0 = r3.getHeight()
            float r0 = (float) r0
            float r4 = r4 / r0
            android.widget.EdgeEffect r0 = r3.f14978z
            float r0 = s3.e.b(r0)
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L31
            android.widget.EdgeEffect r0 = r3.f14978z
            float r4 = -r4
            float r4 = s3.e.d(r0, r4, r5)
            float r4 = -r4
            android.widget.EdgeEffect r5 = r3.f14978z
            float r5 = s3.e.b(r5)
            int r5 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r5 != 0) goto L2f
            android.widget.EdgeEffect r5 = r3.f14978z
            r5.onRelease()
        L2f:
            r1 = r4
            goto L54
        L31:
            android.widget.EdgeEffect r0 = r3.A
            float r0 = s3.e.b(r0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L54
            android.widget.EdgeEffect r0 = r3.A
            r2 = 1065353216(0x3f800000, float:1.0)
            float r2 = r2 - r5
            float r4 = s3.e.d(r0, r4, r2)
            android.widget.EdgeEffect r5 = r3.A
            float r5 = s3.e.b(r5)
            int r5 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r5 != 0) goto L2f
            android.widget.EdgeEffect r5 = r3.A
            r5.onRelease()
            goto L2f
        L54:
            int r4 = r3.getHeight()
            float r4 = (float) r4
            float r1 = r1 * r4
            int r4 = java.lang.Math.round(r1)
            if (r4 == 0) goto L63
            r3.invalidate()
        L63:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.B(int, float):int");
    }

    public final void C(boolean z10) {
        if (z10) {
            K(2, 1);
        } else {
            M(1);
        }
        this.Q = getScrollY();
        c0.i0(this);
    }

    public final boolean D(int i10, int i11, int i12) {
        int height = getHeight();
        int scrollY = getScrollY();
        int i13 = height + scrollY;
        boolean z10 = false;
        boolean z11 = i10 == 33;
        View l10 = l(z11, i11, i12);
        if (l10 == null) {
            l10 = this;
        }
        if (i11 < scrollY || i12 > i13) {
            h(z11 ? i11 - scrollY : i12 - i13);
            z10 = true;
        }
        if (l10 != findFocus()) {
            l10.requestFocus(i10);
        }
        return z10;
    }

    public final void E(View view) {
        view.getDrawingRect(this.f14976x);
        offsetDescendantRectToMyCoords(view, this.f14976x);
        int e10 = e(this.f14976x);
        if (e10 != 0) {
            scrollBy(0, e10);
        }
    }

    public final boolean F(Rect rect, boolean z10) {
        int e10 = e(rect);
        boolean z11 = e10 != 0;
        if (z11) {
            if (z10) {
                scrollBy(0, e10);
            } else {
                G(0, e10);
            }
        }
        return z11;
    }

    public final void G(int i10, int i11) {
        H(i10, i11, ListPopupWindow.EXPAND_LIST_TIMEOUT, false);
    }

    public final void H(int i10, int i11, int i12, boolean z10) {
        if (getChildCount() == 0) {
            return;
        }
        if (AnimationUtils.currentAnimationTimeMillis() - this.f14975w > 250) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int scrollY = getScrollY();
            OverScroller overScroller = this.f14977y;
            int scrollX = getScrollX();
            overScroller.startScroll(scrollX, scrollY, 0, Math.max(0, Math.min(i11 + scrollY, Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom())))) - scrollY, i12);
            C(z10);
        } else {
            if (!this.f14977y.isFinished()) {
                a();
            }
            scrollBy(i10, i11);
        }
        this.f14975w = AnimationUtils.currentAnimationTimeMillis();
    }

    public void I(int i10, int i11, int i12, boolean z10) {
        H(i10 - getScrollX(), i11 - getScrollY(), i12, z10);
    }

    public void J(int i10, int i11, boolean z10) {
        I(i10, i11, ListPopupWindow.EXPAND_LIST_TIMEOUT, z10);
    }

    public boolean K(int i10, int i11) {
        return this.T.p(i10, i11);
    }

    public final boolean L(MotionEvent motionEvent) {
        boolean z10;
        if (s3.e.b(this.f14978z) != 0.0f) {
            s3.e.d(this.f14978z, 0.0f, motionEvent.getY() / getHeight());
            z10 = true;
        } else {
            z10 = false;
        }
        if (s3.e.b(this.A) != 0.0f) {
            s3.e.d(this.A, 0.0f, 1.0f - (motionEvent.getY() / getHeight()));
            return true;
        }
        return z10;
    }

    public void M(int i10) {
        this.T.r(i10);
    }

    public final void a() {
        this.f14977y.abortAnimation();
        M(1);
    }

    @Override // android.view.ViewGroup
    public void addView(View view) {
        if (getChildCount() <= 0) {
            super.addView(view);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public boolean b(int i10) {
        View findFocus = findFocus();
        if (findFocus == this) {
            findFocus = null;
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, i10);
        int maxScrollAmount = getMaxScrollAmount();
        if (findNextFocus != null && v(findNextFocus, maxScrollAmount, getHeight())) {
            findNextFocus.getDrawingRect(this.f14976x);
            offsetDescendantRectToMyCoords(findNextFocus, this.f14976x);
            h(e(this.f14976x));
            findNextFocus.requestFocus(i10);
        } else {
            if (i10 == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i10 == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getScrollY() + getHeight()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i10 != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            h(maxScrollAmount);
        }
        if (findFocus != null && findFocus.isFocused() && t(findFocus)) {
            int descendantFocusability = getDescendantFocusability();
            setDescendantFocusability(131072);
            requestFocus();
            setDescendantFocusability(descendantFocusability);
            return true;
        }
        return true;
    }

    public final boolean c() {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            return (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin > (getHeight() - getPaddingTop()) - getPaddingBottom();
        }
        return false;
    }

    @Override // android.view.View
    public int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    @Override // android.view.View
    public int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    @Override // android.view.View
    public int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    @Override // android.view.View
    public void computeScroll() {
        if (this.f14977y.isFinished()) {
            return;
        }
        this.f14977y.computeScrollOffset();
        int currY = this.f14977y.getCurrY();
        int i10 = currY - this.Q;
        this.Q = currY;
        int[] iArr = this.O;
        boolean z10 = false;
        iArr[1] = 0;
        f(0, i10, iArr, null, 1);
        int i11 = i10 - this.O[1];
        int scrollRange = getScrollRange();
        if (i11 != 0) {
            int scrollY = getScrollY();
            y(0, i11, getScrollX(), scrollY, 0, scrollRange, 0, 0, false);
            int scrollY2 = getScrollY() - scrollY;
            int i12 = i11 - scrollY2;
            int[] iArr2 = this.O;
            iArr2[1] = 0;
            g(0, scrollY2, 0, i12, this.N, 1, iArr2);
            i11 = i12 - this.O[1];
        }
        if (i11 != 0) {
            int overScrollMode = getOverScrollMode();
            if (overScrollMode == 0 || (overScrollMode == 1 && scrollRange > 0)) {
                z10 = true;
            }
            if (z10) {
                if (i11 < 0) {
                    if (this.f14978z.isFinished()) {
                        this.f14978z.onAbsorb((int) this.f14977y.getCurrVelocity());
                    }
                } else if (this.A.isFinished()) {
                    this.A.onAbsorb((int) this.f14977y.getCurrVelocity());
                }
            }
            a();
        }
        if (!this.f14977y.isFinished()) {
            c0.i0(this);
        } else {
            M(1);
        }
    }

    @Override // android.view.View
    public int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    @Override // android.view.View
    public int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    @Override // android.view.View
    public int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int max = Math.max(0, bottom - height);
        return scrollY < 0 ? bottom - scrollY : scrollY > max ? bottom + (scrollY - max) : bottom;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || k(keyEvent);
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f10, float f11, boolean z10) {
        return this.T.a(f10, f11, z10);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f10, float f11) {
        return this.T.b(f10, f11);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i10, int i11, int[] iArr, int[] iArr2) {
        return f(i10, i11, iArr, iArr2, 0);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i10, int i11, int i12, int i13, int[] iArr) {
        return this.T.f(i10, i11, i12, i13, iArr);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        int paddingLeft;
        super.draw(canvas);
        int scrollY = getScrollY();
        int i10 = 0;
        if (!this.f14978z.isFinished()) {
            int save = canvas.save();
            int width = getWidth();
            int height = getHeight();
            int min = Math.min(0, scrollY);
            int i11 = Build.VERSION.SDK_INT;
            if (i11 < 21 || getClipToPadding()) {
                width -= getPaddingLeft() + getPaddingRight();
                paddingLeft = getPaddingLeft() + 0;
            } else {
                paddingLeft = 0;
            }
            if (i11 >= 21 && getClipToPadding()) {
                height -= getPaddingTop() + getPaddingBottom();
                min += getPaddingTop();
            }
            canvas.translate(paddingLeft, min);
            this.f14978z.setSize(width, height);
            if (this.f14978z.draw(canvas)) {
                c0.i0(this);
            }
            canvas.restoreToCount(save);
        }
        if (this.A.isFinished()) {
            return;
        }
        int save2 = canvas.save();
        int width2 = getWidth();
        int height2 = getHeight();
        int max = Math.max(getScrollRange(), scrollY) + height2;
        int i12 = Build.VERSION.SDK_INT;
        if (i12 < 21 || getClipToPadding()) {
            width2 -= getPaddingLeft() + getPaddingRight();
            i10 = 0 + getPaddingLeft();
        }
        if (i12 >= 21 && getClipToPadding()) {
            height2 -= getPaddingTop() + getPaddingBottom();
            max -= getPaddingBottom();
        }
        canvas.translate(i10 - width2, max);
        canvas.rotate(180.0f, width2, 0.0f);
        this.A.setSize(width2, height2);
        if (this.A.draw(canvas)) {
            c0.i0(this);
        }
        canvas.restoreToCount(save2);
    }

    public int e(Rect rect) {
        int i10;
        int i11;
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i12 = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int i13 = rect.bottom < (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin ? i12 - verticalFadingEdgeLength : i12;
        int i14 = rect.bottom;
        if (i14 > i13 && rect.top > scrollY) {
            if (rect.height() > height) {
                i11 = rect.top - scrollY;
            } else {
                i11 = rect.bottom - i13;
            }
            return Math.min(i11 + 0, (childAt.getBottom() + layoutParams.bottomMargin) - i12);
        } else if (rect.top >= scrollY || i14 >= i13) {
            return 0;
        } else {
            if (rect.height() > height) {
                i10 = 0 - (i13 - rect.bottom);
            } else {
                i10 = 0 - (scrollY - rect.top);
            }
            return Math.max(i10, -getScrollY());
        }
    }

    public boolean f(int i10, int i11, int[] iArr, int[] iArr2, int i12) {
        return this.T.d(i10, i11, iArr, iArr2, i12);
    }

    public void g(int i10, int i11, int i12, int i13, int[] iArr, int i14, int[] iArr2) {
        this.T.e(i10, i11, i12, i13, iArr, i14, iArr2);
    }

    @Override // android.view.View
    public float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(0);
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return bottom / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (getHeight() * 0.5f);
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.S.a();
    }

    public int getScrollRange() {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
        }
        return 0;
    }

    @Override // android.view.View
    public float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return scrollY / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public final void h(int i10) {
        if (i10 != 0) {
            if (this.I) {
                G(0, i10);
            } else {
                scrollBy(0, i10);
            }
        }
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return o(0);
    }

    public final boolean i(int i10) {
        if (s3.e.b(this.f14978z) != 0.0f) {
            this.f14978z.onAbsorb(i10);
        } else if (s3.e.b(this.A) == 0.0f) {
            return false;
        } else {
            this.A.onAbsorb(-i10);
        }
        return true;
    }

    @Override // android.view.View, o3.p
    public boolean isNestedScrollingEnabled() {
        return this.T.l();
    }

    public final void j() {
        this.F = false;
        A();
        M(0);
        this.f14978z.onRelease();
        this.A.onRelease();
    }

    public boolean k(KeyEvent keyEvent) {
        this.f14976x.setEmpty();
        boolean c10 = c();
        int i10 = TsExtractor.TS_STREAM_TYPE_HDMV_DTS;
        if (!c10) {
            if (!isFocused() || keyEvent.getKeyCode() == 4) {
                return false;
            }
            View findFocus = findFocus();
            if (findFocus == this) {
                findFocus = null;
            }
            View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, TsExtractor.TS_STREAM_TYPE_HDMV_DTS);
            return (findNextFocus == null || findNextFocus == this || !findNextFocus.requestFocus(TsExtractor.TS_STREAM_TYPE_HDMV_DTS)) ? false : true;
        } else if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode == 19) {
                if (!keyEvent.isAltPressed()) {
                    return b(33);
                }
                return n(33);
            } else if (keyCode == 20) {
                if (!keyEvent.isAltPressed()) {
                    return b(TsExtractor.TS_STREAM_TYPE_HDMV_DTS);
                }
                return n(TsExtractor.TS_STREAM_TYPE_HDMV_DTS);
            } else if (keyCode != 62) {
                return false;
            } else {
                if (keyEvent.isShiftPressed()) {
                    i10 = 33;
                }
                z(i10);
                return false;
            }
        } else {
            return false;
        }
    }

    public final View l(boolean z10, int i10, int i11) {
        ArrayList focusables = getFocusables(2);
        int size = focusables.size();
        View view = null;
        boolean z11 = false;
        for (int i12 = 0; i12 < size; i12++) {
            View view2 = (View) focusables.get(i12);
            int top = view2.getTop();
            int bottom = view2.getBottom();
            if (i10 < bottom && top < i11) {
                boolean z12 = i10 < top && bottom < i11;
                if (view == null) {
                    view = view2;
                    z11 = z12;
                } else {
                    boolean z13 = (z10 && top < view.getTop()) || (!z10 && bottom > view.getBottom());
                    if (z11) {
                        if (z12) {
                            if (!z13) {
                            }
                            view = view2;
                        }
                    } else if (z12) {
                        view = view2;
                        z11 = true;
                    } else {
                        if (!z13) {
                        }
                        view = view2;
                    }
                }
            }
        }
        return view;
    }

    public void m(int i10) {
        if (getChildCount() > 0) {
            this.f14977y.fling(getScrollX(), getScrollY(), 0, i10, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            C(true);
        }
    }

    @Override // android.view.ViewGroup
    public void measureChild(View view, int i10, int i11) {
        view.measure(FrameLayout.getChildMeasureSpec(i10, getPaddingLeft() + getPaddingRight(), view.getLayoutParams().width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override // android.view.ViewGroup
    public void measureChildWithMargins(View view, int i10, int i11, int i12, int i13) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(FrameLayout.getChildMeasureSpec(i10, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i11, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    public boolean n(int i10) {
        int childCount;
        boolean z10 = i10 == 130;
        int height = getHeight();
        Rect rect = this.f14976x;
        rect.top = 0;
        rect.bottom = height;
        if (z10 && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            this.f14976x.bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin + getPaddingBottom();
            Rect rect2 = this.f14976x;
            rect2.top = rect2.bottom - height;
        }
        Rect rect3 = this.f14976x;
        return D(i10, rect3.top, rect3.bottom);
    }

    public boolean o(int i10) {
        return this.T.k(i10);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.D = false;
    }

    @Override // android.view.View
    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        if ((motionEvent.getSource() & 2) != 0 && motionEvent.getAction() == 8 && !this.F) {
            float axisValue = motionEvent.getAxisValue(9);
            if (axisValue != 0.0f) {
                int scrollRange = getScrollRange();
                int scrollY = getScrollY();
                int verticalScrollFactorCompat = scrollY - ((int) (axisValue * getVerticalScrollFactorCompat()));
                if (verticalScrollFactorCompat < 0) {
                    scrollRange = 0;
                } else if (verticalScrollFactorCompat <= scrollRange) {
                    scrollRange = verticalScrollFactorCompat;
                }
                if (scrollRange != scrollY) {
                    super.scrollTo(getScrollX(), scrollRange);
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        boolean z10 = true;
        if (action == 2 && this.F) {
            return true;
        }
        int i10 = action & 255;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    int i11 = this.M;
                    if (i11 != -1) {
                        int findPointerIndex = motionEvent.findPointerIndex(i11);
                        if (findPointerIndex == -1) {
                            Log.e("NestedScrollView", "Invalid pointerId=" + i11 + " in onInterceptTouchEvent");
                        } else {
                            int y10 = (int) motionEvent.getY(findPointerIndex);
                            if (Math.abs(y10 - this.B) > this.J && (2 & getNestedScrollAxes()) == 0) {
                                this.F = true;
                                this.B = y10;
                                s();
                                this.G.addMovement(motionEvent);
                                this.P = 0;
                                ViewParent parent = getParent();
                                if (parent != null) {
                                    parent.requestDisallowInterceptTouchEvent(true);
                                }
                            }
                        }
                    }
                } else if (i10 != 3) {
                    if (i10 == 6) {
                        x(motionEvent);
                    }
                }
            }
            this.F = false;
            this.M = -1;
            A();
            if (this.f14977y.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                c0.i0(this);
            }
            M(0);
        } else {
            int y11 = (int) motionEvent.getY();
            if (!p((int) motionEvent.getX(), y11)) {
                if (!L(motionEvent) && this.f14977y.isFinished()) {
                    z10 = false;
                }
                this.F = z10;
                A();
            } else {
                this.B = y11;
                this.M = motionEvent.getPointerId(0);
                q();
                this.G.addMovement(motionEvent);
                this.f14977y.computeScrollOffset();
                if (!L(motionEvent) && this.f14977y.isFinished()) {
                    z10 = false;
                }
                this.F = z10;
                K(2, 0);
            }
        }
        return this.F;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        int i14 = 0;
        this.C = false;
        View view = this.E;
        if (view != null && u(view, this)) {
            E(this.E);
        }
        this.E = null;
        if (!this.D) {
            if (this.R != null) {
                scrollTo(getScrollX(), this.R.f14979w);
                this.R = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                i14 = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            }
            int paddingTop = ((i13 - i11) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            int d10 = d(scrollY, paddingTop, i14);
            if (d10 != scrollY) {
                scrollTo(getScrollX(), d10);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.D = true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (this.H && View.MeasureSpec.getMode(i11) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(FrameLayout.getChildMeasureSpec(i10, getPaddingLeft() + getPaddingRight() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, o3.t
    public boolean onNestedFling(View view, float f10, float f11, boolean z10) {
        if (z10) {
            return false;
        }
        dispatchNestedFling(0.0f, f11, true);
        m((int) f11);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, o3.t
    public boolean onNestedPreFling(View view, float f10, float f11) {
        return dispatchNestedPreFling(f10, f11);
    }

    @Override // o3.r
    public void onNestedPreScroll(View view, int i10, int i11, int[] iArr, int i12) {
        f(i10, i11, iArr, null, i12);
    }

    @Override // o3.s
    public void onNestedScroll(View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        w(i13, i14, iArr);
    }

    @Override // o3.r
    public void onNestedScrollAccepted(View view, View view2, int i10, int i11) {
        this.S.c(view, view2, i10, i11);
        K(2, i11);
    }

    @Override // android.view.View
    public void onOverScrolled(int i10, int i11, boolean z10, boolean z11) {
        super.scrollTo(i10, i11);
    }

    @Override // android.view.ViewGroup
    public boolean onRequestFocusInDescendants(int i10, Rect rect) {
        View findNextFocusFromRect;
        if (i10 == 2) {
            i10 = TsExtractor.TS_STREAM_TYPE_HDMV_DTS;
        } else if (i10 == 1) {
            i10 = 33;
        }
        if (rect == null) {
            findNextFocusFromRect = FocusFinder.getInstance().findNextFocus(this, null, i10);
        } else {
            findNextFocusFromRect = FocusFinder.getInstance().findNextFocusFromRect(this, rect, i10);
        }
        if (findNextFocusFromRect == null || t(findNextFocusFromRect)) {
            return false;
        }
        return findNextFocusFromRect.requestFocus(i10, rect);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof c)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        c cVar = (c) parcelable;
        super.onRestoreInstanceState(cVar.getSuperState());
        this.R = cVar;
        requestLayout();
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        c cVar = new c(super.onSaveInstanceState());
        cVar.f14979w = getScrollY();
        return cVar;
    }

    @Override // android.view.View
    public void onScrollChanged(int i10, int i11, int i12, int i13) {
        super.onScrollChanged(i10, i11, i12, i13);
        b bVar = this.V;
        if (bVar != null) {
            bVar.a(this, i10, i11, i12, i13);
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        View findFocus = findFocus();
        if (findFocus == null || this == findFocus || !v(findFocus, 0, i13)) {
            return;
        }
        findFocus.getDrawingRect(this.f14976x);
        offsetDescendantRectToMyCoords(findFocus, this.f14976x);
        h(e(this.f14976x));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, o3.t
    public boolean onStartNestedScroll(View view, View view2, int i10) {
        return onStartNestedScroll(view, view2, i10, 0);
    }

    @Override // o3.r
    public boolean onStartNestedScroll(View view, View view2, int i10, int i11) {
        return (i10 & 2) != 0;
    }

    @Override // o3.r
    public void onStopNestedScroll(View view, int i10) {
        this.S.e(view, i10);
        M(i10);
    }

    /* JADX WARN: Removed duplicated region for block: B:78:0x01d8  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r24) {
        /*
            Method dump skipped, instructions count: 618
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final boolean p(int i10, int i11) {
        if (getChildCount() > 0) {
            int scrollY = getScrollY();
            View childAt = getChildAt(0);
            return i11 >= childAt.getTop() - scrollY && i11 < childAt.getBottom() - scrollY && i10 >= childAt.getLeft() && i10 < childAt.getRight();
        }
        return false;
    }

    public final void q() {
        VelocityTracker velocityTracker = this.G;
        if (velocityTracker == null) {
            this.G = VelocityTracker.obtain();
        } else {
            velocityTracker.clear();
        }
    }

    public final void r() {
        this.f14977y = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.J = viewConfiguration.getScaledTouchSlop();
        this.K = viewConfiguration.getScaledMinimumFlingVelocity();
        this.L = viewConfiguration.getScaledMaximumFlingVelocity();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        if (!this.C) {
            E(view2);
        } else {
            this.E = view2;
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z10) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        return F(rect, z10);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z10) {
        if (z10) {
            A();
        }
        super.requestDisallowInterceptTouchEvent(z10);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        this.C = true;
        super.requestLayout();
    }

    public final void s() {
        if (this.G == null) {
            this.G = VelocityTracker.obtain();
        }
    }

    @Override // android.view.View
    public void scrollTo(int i10, int i11) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int d10 = d(i10, (getWidth() - getPaddingLeft()) - getPaddingRight(), childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin);
            int d11 = d(i11, (getHeight() - getPaddingTop()) - getPaddingBottom(), childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin);
            if (d10 == getScrollX() && d11 == getScrollY()) {
                return;
            }
            super.scrollTo(d10, d11);
        }
    }

    public void setFillViewport(boolean z10) {
        if (z10 != this.H) {
            this.H = z10;
            requestLayout();
        }
    }

    @Override // android.view.View, o3.p
    public void setNestedScrollingEnabled(boolean z10) {
        this.T.m(z10);
    }

    public void setOnScrollChangeListener(b bVar) {
        this.V = bVar;
    }

    public void setSmoothScrollingEnabled(boolean z10) {
        this.I = z10;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i10) {
        return K(i10, 0);
    }

    @Override // android.view.View, o3.p
    public void stopNestedScroll() {
        M(0);
    }

    public final boolean t(View view) {
        return !v(view, 0, getHeight());
    }

    public final boolean v(View view, int i10, int i11) {
        view.getDrawingRect(this.f14976x);
        offsetDescendantRectToMyCoords(view, this.f14976x);
        return this.f14976x.bottom + i10 >= getScrollY() && this.f14976x.top - i10 <= getScrollY() + i11;
    }

    public final void w(int i10, int i11, int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i10);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.T.e(0, scrollY2, 0, i10 - scrollY2, null, i11, iArr);
    }

    public final void x(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.M) {
            int i10 = actionIndex == 0 ? 1 : 0;
            this.B = (int) motionEvent.getY(i10);
            this.M = motionEvent.getPointerId(i10);
            VelocityTracker velocityTracker = this.G;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    public boolean y(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, boolean z10) {
        boolean z11;
        boolean z12;
        int overScrollMode = getOverScrollMode();
        boolean z13 = computeHorizontalScrollRange() > computeHorizontalScrollExtent();
        boolean z14 = computeVerticalScrollRange() > computeVerticalScrollExtent();
        boolean z15 = overScrollMode == 0 || (overScrollMode == 1 && z13);
        boolean z16 = overScrollMode == 0 || (overScrollMode == 1 && z14);
        int i18 = i12 + i10;
        int i19 = !z15 ? 0 : i16;
        int i20 = i13 + i11;
        int i21 = !z16 ? 0 : i17;
        int i22 = -i19;
        int i23 = i19 + i14;
        int i24 = -i21;
        int i25 = i21 + i15;
        if (i18 > i23) {
            i18 = i23;
            z11 = true;
        } else if (i18 < i22) {
            z11 = true;
            i18 = i22;
        } else {
            z11 = false;
        }
        if (i20 > i25) {
            i20 = i25;
            z12 = true;
        } else if (i20 < i24) {
            z12 = true;
            i20 = i24;
        } else {
            z12 = false;
        }
        if (z12 && !o(1)) {
            this.f14977y.springBack(i18, i20, 0, 0, 0, getScrollRange());
        }
        onOverScrolled(i18, i20, z11, z12);
        return z11 || z12;
    }

    public boolean z(int i10) {
        boolean z10 = i10 == 130;
        int height = getHeight();
        if (z10) {
            this.f14976x.top = getScrollY() + height;
            int childCount = getChildCount();
            if (childCount > 0) {
                View childAt = getChildAt(childCount - 1);
                int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin + getPaddingBottom();
                Rect rect = this.f14976x;
                if (rect.top + height > bottom) {
                    rect.top = bottom - height;
                }
            }
        } else {
            this.f14976x.top = getScrollY() - height;
            Rect rect2 = this.f14976x;
            if (rect2.top < 0) {
                rect2.top = 0;
            }
        }
        Rect rect3 = this.f14976x;
        int i11 = rect3.top;
        int i12 = height + i11;
        rect3.bottom = i12;
        return D(i10, i11, i12);
    }

    public NestedScrollView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f14976x = new Rect();
        this.C = true;
        this.D = false;
        this.E = null;
        this.F = false;
        this.I = true;
        this.M = -1;
        this.N = new int[2];
        this.O = new int[2];
        this.f14978z = s3.e.a(context, attributeSet);
        this.A = s3.e.a(context, attributeSet);
        r();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f14974a0, i10, 0);
        setFillViewport(obtainStyledAttributes.getBoolean(0, false));
        obtainStyledAttributes.recycle();
        this.S = new u(this);
        this.T = new q(this);
        setNestedScrollingEnabled(true);
        c0.r0(this, W);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, o3.t
    public void onNestedPreScroll(View view, int i10, int i11, int[] iArr) {
        onNestedPreScroll(view, i10, i11, iArr, 0);
    }

    @Override // o3.r
    public void onNestedScroll(View view, int i10, int i11, int i12, int i13, int i14) {
        w(i13, i14, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, o3.t
    public void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        w(i13, 0, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, o3.t
    public void onNestedScrollAccepted(View view, View view2, int i10) {
        onNestedScrollAccepted(view, view2, i10, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, o3.t
    public void onStopNestedScroll(View view) {
        onStopNestedScroll(view, 0);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10) {
        if (getChildCount() <= 0) {
            super.addView(view, i10);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i10, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }
}
