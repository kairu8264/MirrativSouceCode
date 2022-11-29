package androidx.coordinatorlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import com.mirrativ.llstream.protocol.v1.topic.TopicConstant;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import o3.c0;
import o3.p0;
import o3.r;
import o3.s;
import o3.u;
import o3.v;

/* loaded from: classes.dex */
public class CoordinatorLayout extends ViewGroup implements r, s {
    public static final String Q;
    public static final Class<?>[] R;
    public static final ThreadLocal<Map<String, Constructor<c>>> S;
    public static final Comparator<View> T;
    public static final n3.e<Rect> U;
    public Paint A;
    public final int[] B;
    public final int[] C;
    public boolean D;
    public boolean E;
    public int[] F;
    public View G;
    public View H;
    public g I;
    public boolean J;
    public p0 K;
    public boolean L;
    public Drawable M;
    public ViewGroup.OnHierarchyChangeListener N;
    public v O;
    public final u P;

    /* renamed from: w  reason: collision with root package name */
    public final List<View> f14925w;

    /* renamed from: x  reason: collision with root package name */
    public final z2.a<View> f14926x;

    /* renamed from: y  reason: collision with root package name */
    public final List<View> f14927y;

    /* renamed from: z  reason: collision with root package name */
    public final List<View> f14928z;

    /* loaded from: classes.dex */
    public class a implements v {
        public a() {
        }

        @Override // o3.v
        public p0 a(View view, p0 p0Var) {
            return CoordinatorLayout.this.Q(p0Var);
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        c getBehavior();
    }

    /* loaded from: classes.dex */
    public static abstract class c<V extends View> {
        public c() {
        }

        public boolean A(CoordinatorLayout coordinatorLayout, V v10, View view, View view2, int i10, int i11) {
            if (i11 == 0) {
                return z(coordinatorLayout, v10, view, view2, i10);
            }
            return false;
        }

        @Deprecated
        public void B(CoordinatorLayout coordinatorLayout, V v10, View view) {
        }

        public void C(CoordinatorLayout coordinatorLayout, V v10, View view, int i10) {
            if (i10 == 0) {
                B(coordinatorLayout, v10, view);
            }
        }

        public boolean D(CoordinatorLayout coordinatorLayout, V v10, MotionEvent motionEvent) {
            return false;
        }

        public boolean a(CoordinatorLayout coordinatorLayout, V v10) {
            return d(coordinatorLayout, v10) > 0.0f;
        }

        public boolean b(CoordinatorLayout coordinatorLayout, V v10, Rect rect) {
            return false;
        }

        public int c(CoordinatorLayout coordinatorLayout, V v10) {
            return -16777216;
        }

        public float d(CoordinatorLayout coordinatorLayout, V v10) {
            return 0.0f;
        }

        public boolean e(CoordinatorLayout coordinatorLayout, V v10, View view) {
            return false;
        }

        public p0 f(CoordinatorLayout coordinatorLayout, V v10, p0 p0Var) {
            return p0Var;
        }

        public void g(f fVar) {
        }

        public boolean h(CoordinatorLayout coordinatorLayout, V v10, View view) {
            return false;
        }

        public void i(CoordinatorLayout coordinatorLayout, V v10, View view) {
        }

        public void j() {
        }

        public boolean k(CoordinatorLayout coordinatorLayout, V v10, MotionEvent motionEvent) {
            return false;
        }

        public boolean l(CoordinatorLayout coordinatorLayout, V v10, int i10) {
            return false;
        }

        public boolean m(CoordinatorLayout coordinatorLayout, V v10, int i10, int i11, int i12, int i13) {
            return false;
        }

        public boolean n(CoordinatorLayout coordinatorLayout, V v10, View view, float f10, float f11, boolean z10) {
            return false;
        }

        public boolean o(CoordinatorLayout coordinatorLayout, V v10, View view, float f10, float f11) {
            return false;
        }

        @Deprecated
        public void p(CoordinatorLayout coordinatorLayout, V v10, View view, int i10, int i11, int[] iArr) {
        }

        public void q(CoordinatorLayout coordinatorLayout, V v10, View view, int i10, int i11, int[] iArr, int i12) {
            if (i12 == 0) {
                p(coordinatorLayout, v10, view, i10, i11, iArr);
            }
        }

        @Deprecated
        public void r(CoordinatorLayout coordinatorLayout, V v10, View view, int i10, int i11, int i12, int i13) {
        }

        @Deprecated
        public void s(CoordinatorLayout coordinatorLayout, V v10, View view, int i10, int i11, int i12, int i13, int i14) {
            if (i14 == 0) {
                r(coordinatorLayout, v10, view, i10, i11, i12, i13);
            }
        }

        public void t(CoordinatorLayout coordinatorLayout, V v10, View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
            iArr[0] = iArr[0] + i12;
            iArr[1] = iArr[1] + i13;
            s(coordinatorLayout, v10, view, i10, i11, i12, i13, i14);
        }

        @Deprecated
        public void u(CoordinatorLayout coordinatorLayout, V v10, View view, View view2, int i10) {
        }

        public void v(CoordinatorLayout coordinatorLayout, V v10, View view, View view2, int i10, int i11) {
            if (i11 == 0) {
                u(coordinatorLayout, v10, view, view2, i10);
            }
        }

        public boolean w(CoordinatorLayout coordinatorLayout, V v10, Rect rect, boolean z10) {
            return false;
        }

        public void x(CoordinatorLayout coordinatorLayout, V v10, Parcelable parcelable) {
        }

        public Parcelable y(CoordinatorLayout coordinatorLayout, V v10) {
            return View.BaseSavedState.EMPTY_STATE;
        }

        @Deprecated
        public boolean z(CoordinatorLayout coordinatorLayout, V v10, View view, View view2, int i10) {
            return false;
        }

        public c(Context context, AttributeSet attributeSet) {
        }
    }

    @Retention(RetentionPolicy.RUNTIME)
    @Deprecated
    /* loaded from: classes.dex */
    public @interface d {
        Class<? extends c> value();
    }

    /* loaded from: classes.dex */
    public class e implements ViewGroup.OnHierarchyChangeListener {
        public e() {
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewAdded(View view, View view2) {
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.N;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewRemoved(View view, View view2) {
            CoordinatorLayout.this.B(2);
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.N;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }
    }

    /* loaded from: classes.dex */
    public class g implements ViewTreeObserver.OnPreDrawListener {
        public g() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            CoordinatorLayout.this.B(0);
            return true;
        }
    }

    /* loaded from: classes.dex */
    public static class i implements Comparator<View> {
        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(View view, View view2) {
            float P = c0.P(view);
            float P2 = c0.P(view2);
            if (P > P2) {
                return -1;
            }
            return P < P2 ? 1 : 0;
        }
    }

    static {
        Package r02 = CoordinatorLayout.class.getPackage();
        Q = r02 != null ? r02.getName() : null;
        if (Build.VERSION.SDK_INT >= 21) {
            T = new i();
        } else {
            T = null;
        }
        R = new Class[]{Context.class, AttributeSet.class};
        S = new ThreadLocal<>();
        U = new n3.g(12);
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, y2.a.f61210a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static c E(Context context, AttributeSet attributeSet, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.startsWith(TopicConstant.SEPARATOR)) {
            str = context.getPackageName() + str;
        } else if (str.indexOf(46) < 0) {
            String str2 = Q;
            if (!TextUtils.isEmpty(str2)) {
                str = str2 + '.' + str;
            }
        }
        try {
            ThreadLocal<Map<String, Constructor<c>>> threadLocal = S;
            Map<String, Constructor<c>> map = threadLocal.get();
            if (map == null) {
                map = new HashMap<>();
                threadLocal.set(map);
            }
            Constructor<c> constructor = map.get(str);
            if (constructor == null) {
                constructor = Class.forName(str, false, context.getClassLoader()).getConstructor(R);
                constructor.setAccessible(true);
                map.put(str, constructor);
            }
            return constructor.newInstance(context, attributeSet);
        } catch (Exception e10) {
            throw new RuntimeException("Could not inflate Behavior subclass " + str, e10);
        }
    }

    public static void I(Rect rect) {
        rect.setEmpty();
        U.a(rect);
    }

    public static int L(int i10) {
        if (i10 == 0) {
            return 17;
        }
        return i10;
    }

    public static int M(int i10) {
        if ((i10 & 7) == 0) {
            i10 |= 8388611;
        }
        return (i10 & 112) == 0 ? i10 | 48 : i10;
    }

    public static int N(int i10) {
        if (i10 == 0) {
            return 8388661;
        }
        return i10;
    }

    public static Rect a() {
        Rect acquire = U.acquire();
        return acquire == null ? new Rect() : acquire;
    }

    public static int c(int i10, int i11, int i12) {
        return i10 < i11 ? i11 : i10 > i12 ? i12 : i10;
    }

    public void A(View view, int i10) {
        c f10;
        f fVar = (f) view.getLayoutParams();
        if (fVar.f14941k != null) {
            Rect a10 = a();
            Rect a11 = a();
            Rect a12 = a();
            n(fVar.f14941k, a10);
            boolean z10 = false;
            k(view, false, a11);
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            p(view, i10, a10, a12, fVar, measuredWidth, measuredHeight);
            z10 = (a12.left == a11.left && a12.top == a11.top) ? true : true;
            d(fVar, a12, measuredWidth, measuredHeight);
            int i11 = a12.left - a11.left;
            int i12 = a12.top - a11.top;
            if (i11 != 0) {
                c0.b0(view, i11);
            }
            if (i12 != 0) {
                c0.c0(view, i12);
            }
            if (z10 && (f10 = fVar.f()) != null) {
                f10.h(this, view, fVar.f14941k);
            }
            I(a10);
            I(a11);
            I(a12);
        }
    }

    public final void B(int i10) {
        boolean z10;
        int E = c0.E(this);
        int size = this.f14925w.size();
        Rect a10 = a();
        Rect a11 = a();
        Rect a12 = a();
        for (int i11 = 0; i11 < size; i11++) {
            View view = this.f14925w.get(i11);
            f fVar = (f) view.getLayoutParams();
            if (i10 != 0 || view.getVisibility() != 8) {
                for (int i12 = 0; i12 < i11; i12++) {
                    if (fVar.f14942l == this.f14925w.get(i12)) {
                        A(view, E);
                    }
                }
                k(view, true, a11);
                if (fVar.f14937g != 0 && !a11.isEmpty()) {
                    int b10 = o3.f.b(fVar.f14937g, E);
                    int i13 = b10 & 112;
                    if (i13 == 48) {
                        a10.top = Math.max(a10.top, a11.bottom);
                    } else if (i13 == 80) {
                        a10.bottom = Math.max(a10.bottom, getHeight() - a11.top);
                    }
                    int i14 = b10 & 7;
                    if (i14 == 3) {
                        a10.left = Math.max(a10.left, a11.right);
                    } else if (i14 == 5) {
                        a10.right = Math.max(a10.right, getWidth() - a11.left);
                    }
                }
                if (fVar.f14938h != 0 && view.getVisibility() == 0) {
                    z(view, a10, E);
                }
                if (i10 != 2) {
                    r(view, a12);
                    if (!a12.equals(a11)) {
                        H(view, a11);
                    }
                }
                for (int i15 = i11 + 1; i15 < size; i15++) {
                    View view2 = this.f14925w.get(i15);
                    f fVar2 = (f) view2.getLayoutParams();
                    c f10 = fVar2.f();
                    if (f10 != null && f10.e(this, view2, view)) {
                        if (i10 == 0 && fVar2.g()) {
                            fVar2.k();
                        } else {
                            if (i10 != 2) {
                                z10 = f10.h(this, view2, view);
                            } else {
                                f10.i(this, view2, view);
                                z10 = true;
                            }
                            if (i10 == 1) {
                                fVar2.p(z10);
                            }
                        }
                    }
                }
            }
        }
        I(a10);
        I(a11);
        I(a12);
    }

    public void C(View view, int i10) {
        f fVar = (f) view.getLayoutParams();
        if (!fVar.a()) {
            View view2 = fVar.f14941k;
            if (view2 != null) {
                x(view, view2, i10);
                return;
            }
            int i11 = fVar.f14935e;
            if (i11 >= 0) {
                y(view, i11, i10);
                return;
            } else {
                w(view, i10);
                return;
            }
        }
        throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
    }

    public void D(View view, int i10, int i11, int i12, int i13) {
        measureChildWithMargins(view, i10, i11, i12, i13);
    }

    public final boolean F(MotionEvent motionEvent, int i10) {
        int actionMasked = motionEvent.getActionMasked();
        List<View> list = this.f14927y;
        t(list);
        int size = list.size();
        MotionEvent motionEvent2 = null;
        boolean z10 = false;
        boolean z11 = false;
        for (int i11 = 0; i11 < size; i11++) {
            View view = list.get(i11);
            f fVar = (f) view.getLayoutParams();
            c f10 = fVar.f();
            if (!(z10 || z11) || actionMasked == 0) {
                if (!z10 && f10 != null) {
                    if (i10 == 0) {
                        z10 = f10.k(this, view, motionEvent);
                    } else if (i10 == 1) {
                        z10 = f10.D(this, view, motionEvent);
                    }
                    if (z10) {
                        this.G = view;
                    }
                }
                boolean c10 = fVar.c();
                boolean i12 = fVar.i(this, view);
                z11 = i12 && !c10;
                if (i12 && !z11) {
                    break;
                }
            } else if (f10 != null) {
                if (motionEvent2 == null) {
                    long uptimeMillis = SystemClock.uptimeMillis();
                    motionEvent2 = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                }
                if (i10 == 0) {
                    f10.k(this, view, motionEvent2);
                } else if (i10 == 1) {
                    f10.D(this, view, motionEvent2);
                }
            }
        }
        list.clear();
        return z10;
    }

    public final void G() {
        this.f14925w.clear();
        this.f14926x.c();
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            f s10 = s(childAt);
            s10.d(this, childAt);
            this.f14926x.b(childAt);
            for (int i11 = 0; i11 < childCount; i11++) {
                if (i11 != i10) {
                    View childAt2 = getChildAt(i11);
                    if (s10.b(this, childAt, childAt2)) {
                        if (!this.f14926x.d(childAt2)) {
                            this.f14926x.b(childAt2);
                        }
                        this.f14926x.a(childAt2, childAt);
                    }
                }
            }
        }
        this.f14925w.addAll(this.f14926x.i());
        Collections.reverse(this.f14925w);
    }

    public void H(View view, Rect rect) {
        ((f) view.getLayoutParams()).q(rect);
    }

    public void J() {
        if (this.E && this.I != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.I);
        }
        this.J = false;
    }

    public final void K(boolean z10) {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            c f10 = ((f) childAt.getLayoutParams()).f();
            if (f10 != null) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                if (z10) {
                    f10.k(this, childAt, obtain);
                } else {
                    f10.D(this, childAt, obtain);
                }
                obtain.recycle();
            }
        }
        for (int i11 = 0; i11 < childCount; i11++) {
            ((f) getChildAt(i11).getLayoutParams()).m();
        }
        this.G = null;
        this.D = false;
    }

    public final void O(View view, int i10) {
        f fVar = (f) view.getLayoutParams();
        int i11 = fVar.f14939i;
        if (i11 != i10) {
            c0.b0(view, i10 - i11);
            fVar.f14939i = i10;
        }
    }

    public final void P(View view, int i10) {
        f fVar = (f) view.getLayoutParams();
        int i11 = fVar.f14940j;
        if (i11 != i10) {
            c0.c0(view, i10 - i11);
            fVar.f14940j = i10;
        }
    }

    public final p0 Q(p0 p0Var) {
        if (n3.c.a(this.K, p0Var)) {
            return p0Var;
        }
        this.K = p0Var;
        boolean z10 = true;
        boolean z11 = p0Var != null && p0Var.m() > 0;
        this.L = z11;
        if (z11 || getBackground() != null) {
            z10 = false;
        }
        setWillNotDraw(z10);
        p0 e10 = e(p0Var);
        requestLayout();
        return e10;
    }

    public final void R() {
        if (Build.VERSION.SDK_INT < 21) {
            return;
        }
        if (c0.B(this)) {
            if (this.O == null) {
                this.O = new a();
            }
            c0.F0(this, this.O);
            setSystemUiVisibility(1280);
            return;
        }
        c0.F0(this, null);
    }

    public void b() {
        if (this.E) {
            if (this.I == null) {
                this.I = new g();
            }
            getViewTreeObserver().addOnPreDrawListener(this.I);
        }
        this.J = true;
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof f) && super.checkLayoutParams(layoutParams);
    }

    public final void d(f fVar, Rect rect, int i10, int i11) {
        int width = getWidth();
        int height = getHeight();
        int max = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) fVar).leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i10) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin));
        int max2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) fVar).topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i11) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin));
        rect.set(max, max2, i10 + max, i11 + max2);
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j10) {
        f fVar = (f) view.getLayoutParams();
        c cVar = fVar.f14931a;
        if (cVar != null) {
            float d10 = cVar.d(this, view);
            if (d10 > 0.0f) {
                if (this.A == null) {
                    this.A = new Paint();
                }
                this.A.setColor(fVar.f14931a.c(this, view));
                this.A.setAlpha(c(Math.round(d10 * 255.0f), 0, 255));
                int save = canvas.save();
                if (view.isOpaque()) {
                    canvas.clipRect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom(), Region.Op.DIFFERENCE);
                }
                canvas.drawRect(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom(), this.A);
                canvas.restoreToCount(save);
            }
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.M;
        boolean z10 = false;
        if (drawable != null && drawable.isStateful()) {
            z10 = false | drawable.setState(drawableState);
        }
        if (z10) {
            invalidate();
        }
    }

    public final p0 e(p0 p0Var) {
        c f10;
        if (p0Var.p()) {
            return p0Var;
        }
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (c0.B(childAt) && (f10 = ((f) childAt.getLayoutParams()).f()) != null) {
                p0Var = f10.f(this, childAt, p0Var);
                if (p0Var.p()) {
                    break;
                }
            }
        }
        return p0Var;
    }

    public void f(View view) {
        List g10 = this.f14926x.g(view);
        if (g10 == null || g10.isEmpty()) {
            return;
        }
        for (int i10 = 0; i10 < g10.size(); i10++) {
            View view2 = (View) g10.get(i10);
            c f10 = ((f) view2.getLayoutParams()).f();
            if (f10 != null) {
                f10.h(this, view2, view);
            }
        }
    }

    public void g() {
        int childCount = getChildCount();
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            if (i10 >= childCount) {
                break;
            } else if (u(getChildAt(i10))) {
                z10 = true;
                break;
            } else {
                i10++;
            }
        }
        if (z10 != this.J) {
            if (z10) {
                b();
            } else {
                J();
            }
        }
    }

    public final List<View> getDependencySortedChildren() {
        G();
        return Collections.unmodifiableList(this.f14925w);
    }

    public final p0 getLastWindowInsets() {
        return this.K;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.P.a();
    }

    public Drawable getStatusBarBackground() {
        return this.M;
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingTop() + getPaddingBottom());
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingLeft() + getPaddingRight());
    }

    @Override // android.view.ViewGroup
    /* renamed from: h */
    public f generateDefaultLayoutParams() {
        return new f(-2, -2);
    }

    @Override // android.view.ViewGroup
    /* renamed from: i */
    public f generateLayoutParams(AttributeSet attributeSet) {
        return new f(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    /* renamed from: j */
    public f generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof f) {
            return new f((f) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new f((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new f(layoutParams);
    }

    public void k(View view, boolean z10, Rect rect) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z10) {
            n(view, rect);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    public List<View> l(View view) {
        List<View> h10 = this.f14926x.h(view);
        this.f14928z.clear();
        if (h10 != null) {
            this.f14928z.addAll(h10);
        }
        return this.f14928z;
    }

    public List<View> m(View view) {
        List g10 = this.f14926x.g(view);
        this.f14928z.clear();
        if (g10 != null) {
            this.f14928z.addAll(g10);
        }
        return this.f14928z;
    }

    public void n(View view, Rect rect) {
        z2.b.a(this, view, rect);
    }

    public void o(View view, int i10, Rect rect, Rect rect2) {
        f fVar = (f) view.getLayoutParams();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        p(view, i10, rect, rect2, fVar, measuredWidth, measuredHeight);
        d(fVar, rect2, measuredWidth, measuredHeight);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        K(false);
        if (this.J) {
            if (this.I == null) {
                this.I = new g();
            }
            getViewTreeObserver().addOnPreDrawListener(this.I);
        }
        if (this.K == null && c0.B(this)) {
            c0.o0(this);
        }
        this.E = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        K(false);
        if (this.J && this.I != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.I);
        }
        View view = this.H;
        if (view != null) {
            onStopNestedScroll(view);
        }
        this.E = false;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.L || this.M == null) {
            return;
        }
        p0 p0Var = this.K;
        int m10 = p0Var != null ? p0Var.m() : 0;
        if (m10 > 0) {
            this.M.setBounds(0, 0, getWidth(), m10);
            this.M.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            K(true);
        }
        boolean F = F(motionEvent, 0);
        if (actionMasked == 1 || actionMasked == 3) {
            K(true);
        }
        return F;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        c f10;
        int E = c0.E(this);
        int size = this.f14925w.size();
        for (int i14 = 0; i14 < size; i14++) {
            View view = this.f14925w.get(i14);
            if (view.getVisibility() != 8 && ((f10 = ((f) view.getLayoutParams()).f()) == null || !f10.l(this, view, E))) {
                C(view, E);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x011a, code lost:
        if (r0.m(r30, r20, r11, r21, r23, 0) == false) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x011d  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onMeasure(int r31, int r32) {
        /*
            Method dump skipped, instructions count: 391
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, o3.t
    public boolean onNestedFling(View view, float f10, float f11, boolean z10) {
        c f12;
        int childCount = getChildCount();
        boolean z11 = false;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.j(0) && (f12 = fVar.f()) != null) {
                    z11 |= f12.n(this, childAt, view, f10, f11, z10);
                }
            }
        }
        if (z11) {
            B(1);
        }
        return z11;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, o3.t
    public boolean onNestedPreFling(View view, float f10, float f11) {
        c f12;
        int childCount = getChildCount();
        boolean z10 = false;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.j(0) && (f12 = fVar.f()) != null) {
                    z10 |= f12.o(this, childAt, view, f10, f11);
                }
            }
        }
        return z10;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, o3.t
    public void onNestedPreScroll(View view, int i10, int i11, int[] iArr) {
        onNestedPreScroll(view, i10, i11, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, o3.t
    public void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        onNestedScroll(view, i10, i11, i12, i13, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, o3.t
    public void onNestedScrollAccepted(View view, View view2, int i10) {
        onNestedScrollAccepted(view, view2, i10, 0);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof h)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        h hVar = (h) parcelable;
        super.onRestoreInstanceState(hVar.getSuperState());
        SparseArray<Parcelable> sparseArray = hVar.f14950w;
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            int id2 = childAt.getId();
            c f10 = s(childAt).f();
            if (id2 != -1 && f10 != null && (parcelable2 = sparseArray.get(id2)) != null) {
                f10.x(this, childAt, parcelable2);
            }
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        Parcelable y10;
        h hVar = new h(super.onSaveInstanceState());
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            int id2 = childAt.getId();
            c f10 = ((f) childAt.getLayoutParams()).f();
            if (id2 != -1 && f10 != null && (y10 = f10.y(this, childAt)) != null) {
                sparseArray.append(id2, y10);
            }
        }
        hVar.f14950w = sparseArray;
        return hVar;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, o3.t
    public boolean onStartNestedScroll(View view, View view2, int i10) {
        return onStartNestedScroll(view, view2, i10, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, o3.t
    public void onStopNestedScroll(View view) {
        onStopNestedScroll(view, 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0012, code lost:
        if (r3 != false) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004c  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            int r2 = r18.getActionMasked()
            android.view.View r3 = r0.G
            r4 = 1
            r5 = 0
            if (r3 != 0) goto L15
            boolean r3 = r0.F(r1, r4)
            if (r3 == 0) goto L2b
            goto L16
        L15:
            r3 = r5
        L16:
            android.view.View r6 = r0.G
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r6 = (androidx.coordinatorlayout.widget.CoordinatorLayout.f) r6
            androidx.coordinatorlayout.widget.CoordinatorLayout$c r6 = r6.f()
            if (r6 == 0) goto L2b
            android.view.View r7 = r0.G
            boolean r6 = r6.D(r0, r7, r1)
            goto L2c
        L2b:
            r6 = r5
        L2c:
            android.view.View r7 = r0.G
            r8 = 0
            if (r7 != 0) goto L37
            boolean r1 = super.onTouchEvent(r18)
            r6 = r6 | r1
            goto L4a
        L37:
            if (r3 == 0) goto L4a
            long r11 = android.os.SystemClock.uptimeMillis()
            r13 = 3
            r14 = 0
            r15 = 0
            r16 = 0
            r9 = r11
            android.view.MotionEvent r8 = android.view.MotionEvent.obtain(r9, r11, r13, r14, r15, r16)
            super.onTouchEvent(r8)
        L4a:
            if (r8 == 0) goto L4f
            r8.recycle()
        L4f:
            if (r2 == r4) goto L54
            r1 = 3
            if (r2 != r1) goto L57
        L54:
            r0.K(r5)
        L57:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void p(View view, int i10, Rect rect, Rect rect2, f fVar, int i11, int i12) {
        int width;
        int height;
        int b10 = o3.f.b(L(fVar.f14933c), i10);
        int b11 = o3.f.b(M(fVar.f14934d), i10);
        int i13 = b10 & 7;
        int i14 = b10 & 112;
        int i15 = b11 & 7;
        int i16 = b11 & 112;
        if (i15 == 1) {
            width = rect.left + (rect.width() / 2);
        } else if (i15 != 5) {
            width = rect.left;
        } else {
            width = rect.right;
        }
        if (i16 == 16) {
            height = rect.top + (rect.height() / 2);
        } else if (i16 != 80) {
            height = rect.top;
        } else {
            height = rect.bottom;
        }
        if (i13 == 1) {
            width -= i11 / 2;
        } else if (i13 != 5) {
            width -= i11;
        }
        if (i14 == 16) {
            height -= i12 / 2;
        } else if (i14 != 80) {
            height -= i12;
        }
        rect2.set(width, height, i11 + width, i12 + height);
    }

    public final int q(int i10) {
        int[] iArr = this.F;
        if (iArr == null) {
            Log.e("CoordinatorLayout", "No keylines defined for " + this + " - attempted index lookup " + i10);
            return 0;
        } else if (i10 >= 0 && i10 < iArr.length) {
            return iArr[i10];
        } else {
            Log.e("CoordinatorLayout", "Keyline index " + i10 + " out of range for " + this);
            return 0;
        }
    }

    public void r(View view, Rect rect) {
        rect.set(((f) view.getLayoutParams()).h());
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z10) {
        c f10 = ((f) view.getLayoutParams()).f();
        if (f10 == null || !f10.w(this, view, rect, z10)) {
            return super.requestChildRectangleOnScreen(view, rect, z10);
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z10) {
        super.requestDisallowInterceptTouchEvent(z10);
        if (!z10 || this.D) {
            return;
        }
        K(false);
        this.D = true;
    }

    public f s(View view) {
        f fVar = (f) view.getLayoutParams();
        if (!fVar.f14932b) {
            if (view instanceof b) {
                c behavior = ((b) view).getBehavior();
                if (behavior == null) {
                    Log.e("CoordinatorLayout", "Attached behavior class is null");
                }
                fVar.o(behavior);
                fVar.f14932b = true;
            } else {
                d dVar = null;
                for (Class<?> cls = view.getClass(); cls != null; cls = cls.getSuperclass()) {
                    dVar = (d) cls.getAnnotation(d.class);
                    if (dVar != null) {
                        break;
                    }
                }
                if (dVar != null) {
                    try {
                        fVar.o(dVar.value().getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                    } catch (Exception e10) {
                        Log.e("CoordinatorLayout", "Default behavior class " + dVar.value().getName() + " could not be instantiated. Did you forget a default constructor?", e10);
                    }
                }
                fVar.f14932b = true;
            }
        }
        return fVar;
    }

    @Override // android.view.View
    public void setFitsSystemWindows(boolean z10) {
        super.setFitsSystemWindows(z10);
        R();
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.N = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(Drawable drawable) {
        Drawable drawable2 = this.M;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable mutate = drawable != null ? drawable.mutate() : null;
            this.M = mutate;
            if (mutate != null) {
                if (mutate.isStateful()) {
                    this.M.setState(getDrawableState());
                }
                g3.a.m(this.M, c0.E(this));
                this.M.setVisible(getVisibility() == 0, false);
                this.M.setCallback(this);
            }
            c0.i0(this);
        }
    }

    public void setStatusBarBackgroundColor(int i10) {
        setStatusBarBackground(new ColorDrawable(i10));
    }

    public void setStatusBarBackgroundResource(int i10) {
        setStatusBarBackground(i10 != 0 ? c3.a.f(getContext(), i10) : null);
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        boolean z10 = i10 == 0;
        Drawable drawable = this.M;
        if (drawable == null || drawable.isVisible() == z10) {
            return;
        }
        this.M.setVisible(z10, false);
    }

    public final void t(List<View> list) {
        list.clear();
        boolean isChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i10 = childCount - 1; i10 >= 0; i10--) {
            list.add(getChildAt(isChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i10) : i10));
        }
        Comparator<View> comparator = T;
        if (comparator != null) {
            Collections.sort(list, comparator);
        }
    }

    public final boolean u(View view) {
        return this.f14926x.j(view);
    }

    public boolean v(View view, int i10, int i11) {
        Rect a10 = a();
        n(view, a10);
        try {
            return a10.contains(i10, i11);
        } finally {
            I(a10);
        }
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.M;
    }

    public final void w(View view, int i10) {
        f fVar = (f) view.getLayoutParams();
        Rect a10 = a();
        a10.set(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) fVar).leftMargin, getPaddingTop() + ((ViewGroup.MarginLayoutParams) fVar).topMargin, (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin, (getHeight() - getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin);
        if (this.K != null && c0.B(this) && !c0.B(view)) {
            a10.left += this.K.k();
            a10.top += this.K.m();
            a10.right -= this.K.l();
            a10.bottom -= this.K.j();
        }
        Rect a11 = a();
        o3.f.a(M(fVar.f14933c), view.getMeasuredWidth(), view.getMeasuredHeight(), a10, a11, i10);
        view.layout(a11.left, a11.top, a11.right, a11.bottom);
        I(a10);
        I(a11);
    }

    public final void x(View view, View view2, int i10) {
        Rect a10 = a();
        Rect a11 = a();
        try {
            n(view2, a10);
            o(view, i10, a10, a11);
            view.layout(a11.left, a11.top, a11.right, a11.bottom);
        } finally {
            I(a10);
            I(a11);
        }
    }

    public final void y(View view, int i10, int i11) {
        f fVar = (f) view.getLayoutParams();
        int b10 = o3.f.b(N(fVar.f14933c), i11);
        int i12 = b10 & 7;
        int i13 = b10 & 112;
        int width = getWidth();
        int height = getHeight();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        if (i11 == 1) {
            i10 = width - i10;
        }
        int q10 = q(i10) - measuredWidth;
        int i14 = 0;
        if (i12 == 1) {
            q10 += measuredWidth / 2;
        } else if (i12 == 5) {
            q10 += measuredWidth;
        }
        if (i13 == 16) {
            i14 = 0 + (measuredHeight / 2);
        } else if (i13 == 80) {
            i14 = measuredHeight + 0;
        }
        int max = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) fVar).leftMargin, Math.min(q10, ((width - getPaddingRight()) - measuredWidth) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin));
        int max2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) fVar).topMargin, Math.min(i14, ((height - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin));
        view.layout(max, max2, measuredWidth + max, measuredHeight + max2);
    }

    public final void z(View view, Rect rect, int i10) {
        boolean z10;
        boolean z11;
        int width;
        int i11;
        int i12;
        int i13;
        int height;
        int i14;
        int i15;
        int i16;
        if (c0.V(view) && view.getWidth() > 0 && view.getHeight() > 0) {
            f fVar = (f) view.getLayoutParams();
            c f10 = fVar.f();
            Rect a10 = a();
            Rect a11 = a();
            a11.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            if (f10 != null && f10.b(this, view, a10)) {
                if (!a11.contains(a10)) {
                    throw new IllegalArgumentException("Rect should be within the child's bounds. Rect:" + a10.toShortString() + " | Bounds:" + a11.toShortString());
                }
            } else {
                a10.set(a11);
            }
            I(a11);
            if (a10.isEmpty()) {
                I(a10);
                return;
            }
            int b10 = o3.f.b(fVar.f14938h, i10);
            boolean z12 = true;
            if ((b10 & 48) != 48 || (i15 = (a10.top - ((ViewGroup.MarginLayoutParams) fVar).topMargin) - fVar.f14940j) >= (i16 = rect.top)) {
                z10 = false;
            } else {
                P(view, i16 - i15);
                z10 = true;
            }
            if ((b10 & 80) == 80 && (height = ((getHeight() - a10.bottom) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin) + fVar.f14940j) < (i14 = rect.bottom)) {
                P(view, height - i14);
                z10 = true;
            }
            if (!z10) {
                P(view, 0);
            }
            if ((b10 & 3) != 3 || (i12 = (a10.left - ((ViewGroup.MarginLayoutParams) fVar).leftMargin) - fVar.f14939i) >= (i13 = rect.left)) {
                z11 = false;
            } else {
                O(view, i13 - i12);
                z11 = true;
            }
            if ((b10 & 5) != 5 || (width = ((getWidth() - a10.right) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin) + fVar.f14939i) >= (i11 = rect.right)) {
                z12 = z11;
            } else {
                O(view, width - i11);
            }
            if (!z12) {
                O(view, 0);
            }
            I(a10);
        }
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        TypedArray obtainStyledAttributes;
        this.f14925w = new ArrayList();
        this.f14926x = new z2.a<>();
        this.f14927y = new ArrayList();
        this.f14928z = new ArrayList();
        this.B = new int[2];
        this.C = new int[2];
        this.P = new u(this);
        if (i10 == 0) {
            obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, y2.c.f61213b, 0, y2.b.f61211a);
        } else {
            obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, y2.c.f61213b, i10, 0);
        }
        if (Build.VERSION.SDK_INT >= 29) {
            if (i10 == 0) {
                saveAttributeDataForStyleable(context, y2.c.f61213b, attributeSet, obtainStyledAttributes, 0, y2.b.f61211a);
            } else {
                saveAttributeDataForStyleable(context, y2.c.f61213b, attributeSet, obtainStyledAttributes, i10, 0);
            }
        }
        int resourceId = obtainStyledAttributes.getResourceId(y2.c.f61214c, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            this.F = resources.getIntArray(resourceId);
            float f10 = resources.getDisplayMetrics().density;
            int length = this.F.length;
            for (int i11 = 0; i11 < length; i11++) {
                int[] iArr = this.F;
                iArr[i11] = (int) (iArr[i11] * f10);
            }
        }
        this.M = obtainStyledAttributes.getDrawable(y2.c.f61215d);
        obtainStyledAttributes.recycle();
        R();
        super.setOnHierarchyChangeListener(new e());
        if (c0.C(this) == 0) {
            c0.C0(this, 1);
        }
    }

    @Override // o3.r
    public void onNestedPreScroll(View view, int i10, int i11, int[] iArr, int i12) {
        c f10;
        int childCount = getChildCount();
        boolean z10 = false;
        int i13 = 0;
        int i14 = 0;
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt = getChildAt(i15);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.j(i12) && (f10 = fVar.f()) != null) {
                    int[] iArr2 = this.B;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    f10.q(this, childAt, view, i10, i11, iArr2, i12);
                    int[] iArr3 = this.B;
                    i13 = i10 > 0 ? Math.max(i13, iArr3[0]) : Math.min(i13, iArr3[0]);
                    int[] iArr4 = this.B;
                    i14 = i11 > 0 ? Math.max(i14, iArr4[1]) : Math.min(i14, iArr4[1]);
                    z10 = true;
                }
            }
        }
        iArr[0] = i13;
        iArr[1] = i14;
        if (z10) {
            B(1);
        }
    }

    @Override // o3.r
    public void onNestedScroll(View view, int i10, int i11, int i12, int i13, int i14) {
        onNestedScroll(view, i10, i11, i12, i13, 0, this.C);
    }

    @Override // o3.r
    public void onNestedScrollAccepted(View view, View view2, int i10, int i11) {
        c f10;
        this.P.c(view, view2, i10, i11);
        this.H = view2;
        int childCount = getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            f fVar = (f) childAt.getLayoutParams();
            if (fVar.j(i11) && (f10 = fVar.f()) != null) {
                f10.v(this, childAt, view, view2, i10, i11);
            }
        }
    }

    @Override // o3.r
    public boolean onStartNestedScroll(View view, View view2, int i10, int i11) {
        int childCount = getChildCount();
        boolean z10 = false;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                c f10 = fVar.f();
                if (f10 != null) {
                    boolean A = f10.A(this, childAt, view, view2, i10, i11);
                    z10 |= A;
                    fVar.r(i11, A);
                } else {
                    fVar.r(i11, false);
                }
            }
        }
        return z10;
    }

    @Override // o3.r
    public void onStopNestedScroll(View view, int i10) {
        this.P.e(view, i10);
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            f fVar = (f) childAt.getLayoutParams();
            if (fVar.j(i10)) {
                c f10 = fVar.f();
                if (f10 != null) {
                    f10.C(this, childAt, view, i10);
                }
                fVar.l(i10);
                fVar.k();
            }
        }
        this.H = null;
    }

    @Override // o3.s
    public void onNestedScroll(View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        c f10;
        boolean z10;
        int min;
        int childCount = getChildCount();
        boolean z11 = false;
        int i15 = 0;
        int i16 = 0;
        for (int i17 = 0; i17 < childCount; i17++) {
            View childAt = getChildAt(i17);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.j(i14) && (f10 = fVar.f()) != null) {
                    int[] iArr2 = this.B;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    f10.t(this, childAt, view, i10, i11, i12, i13, i14, iArr2);
                    int[] iArr3 = this.B;
                    i15 = i12 > 0 ? Math.max(i15, iArr3[0]) : Math.min(i15, iArr3[0]);
                    if (i13 > 0) {
                        z10 = true;
                        min = Math.max(i16, this.B[1]);
                    } else {
                        z10 = true;
                        min = Math.min(i16, this.B[1]);
                    }
                    i16 = min;
                    z11 = z10;
                }
            }
        }
        iArr[0] = iArr[0] + i15;
        iArr[1] = iArr[1] + i16;
        if (z11) {
            B(1);
        }
    }

    /* loaded from: classes.dex */
    public static class h extends v3.a {
        public static final Parcelable.Creator<h> CREATOR = new a();

        /* renamed from: w  reason: collision with root package name */
        public SparseArray<Parcelable> f14950w;

        /* loaded from: classes.dex */
        public static class a implements Parcelable.ClassLoaderCreator<h> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public h createFromParcel(Parcel parcel) {
                return new h(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b */
            public h createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new h(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c */
            public h[] newArray(int i10) {
                return new h[i10];
            }
        }

        public h(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            int readInt = parcel.readInt();
            int[] iArr = new int[readInt];
            parcel.readIntArray(iArr);
            Parcelable[] readParcelableArray = parcel.readParcelableArray(classLoader);
            this.f14950w = new SparseArray<>(readInt);
            for (int i10 = 0; i10 < readInt; i10++) {
                this.f14950w.append(iArr[i10], readParcelableArray[i10]);
            }
        }

        @Override // v3.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            SparseArray<Parcelable> sparseArray = this.f14950w;
            int size = sparseArray != null ? sparseArray.size() : 0;
            parcel.writeInt(size);
            int[] iArr = new int[size];
            Parcelable[] parcelableArr = new Parcelable[size];
            for (int i11 = 0; i11 < size; i11++) {
                iArr[i11] = this.f14950w.keyAt(i11);
                parcelableArr[i11] = this.f14950w.valueAt(i11);
            }
            parcel.writeIntArray(iArr);
            parcel.writeParcelableArray(parcelableArr, i10);
        }

        public h(Parcelable parcelable) {
            super(parcelable);
        }
    }

    /* loaded from: classes.dex */
    public static class f extends ViewGroup.MarginLayoutParams {

        /* renamed from: a  reason: collision with root package name */
        public c f14931a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f14932b;

        /* renamed from: c  reason: collision with root package name */
        public int f14933c;

        /* renamed from: d  reason: collision with root package name */
        public int f14934d;

        /* renamed from: e  reason: collision with root package name */
        public int f14935e;

        /* renamed from: f  reason: collision with root package name */
        public int f14936f;

        /* renamed from: g  reason: collision with root package name */
        public int f14937g;

        /* renamed from: h  reason: collision with root package name */
        public int f14938h;

        /* renamed from: i  reason: collision with root package name */
        public int f14939i;

        /* renamed from: j  reason: collision with root package name */
        public int f14940j;

        /* renamed from: k  reason: collision with root package name */
        public View f14941k;

        /* renamed from: l  reason: collision with root package name */
        public View f14942l;

        /* renamed from: m  reason: collision with root package name */
        public boolean f14943m;

        /* renamed from: n  reason: collision with root package name */
        public boolean f14944n;

        /* renamed from: o  reason: collision with root package name */
        public boolean f14945o;

        /* renamed from: p  reason: collision with root package name */
        public boolean f14946p;

        /* renamed from: q  reason: collision with root package name */
        public final Rect f14947q;

        /* renamed from: r  reason: collision with root package name */
        public Object f14948r;

        public f(int i10, int i11) {
            super(i10, i11);
            this.f14932b = false;
            this.f14933c = 0;
            this.f14934d = 0;
            this.f14935e = -1;
            this.f14936f = -1;
            this.f14937g = 0;
            this.f14938h = 0;
            this.f14947q = new Rect();
        }

        public boolean a() {
            return this.f14941k == null && this.f14936f != -1;
        }

        public boolean b(CoordinatorLayout coordinatorLayout, View view, View view2) {
            c cVar;
            return view2 == this.f14942l || s(view2, c0.E(coordinatorLayout)) || ((cVar = this.f14931a) != null && cVar.e(coordinatorLayout, view, view2));
        }

        public boolean c() {
            if (this.f14931a == null) {
                this.f14943m = false;
            }
            return this.f14943m;
        }

        public View d(CoordinatorLayout coordinatorLayout, View view) {
            if (this.f14936f == -1) {
                this.f14942l = null;
                this.f14941k = null;
                return null;
            }
            if (this.f14941k == null || !t(view, coordinatorLayout)) {
                n(view, coordinatorLayout);
            }
            return this.f14941k;
        }

        public int e() {
            return this.f14936f;
        }

        public c f() {
            return this.f14931a;
        }

        public boolean g() {
            return this.f14946p;
        }

        public Rect h() {
            return this.f14947q;
        }

        public boolean i(CoordinatorLayout coordinatorLayout, View view) {
            boolean z10 = this.f14943m;
            if (z10) {
                return true;
            }
            c cVar = this.f14931a;
            boolean a10 = (cVar != null ? cVar.a(coordinatorLayout, view) : false) | z10;
            this.f14943m = a10;
            return a10;
        }

        public boolean j(int i10) {
            if (i10 != 0) {
                if (i10 != 1) {
                    return false;
                }
                return this.f14945o;
            }
            return this.f14944n;
        }

        public void k() {
            this.f14946p = false;
        }

        public void l(int i10) {
            r(i10, false);
        }

        public void m() {
            this.f14943m = false;
        }

        public final void n(View view, CoordinatorLayout coordinatorLayout) {
            View findViewById = coordinatorLayout.findViewById(this.f14936f);
            this.f14941k = findViewById;
            if (findViewById == null) {
                if (coordinatorLayout.isInEditMode()) {
                    this.f14942l = null;
                    this.f14941k = null;
                    return;
                }
                throw new IllegalStateException("Could not find CoordinatorLayout descendant view with id " + coordinatorLayout.getResources().getResourceName(this.f14936f) + " to anchor view " + view);
            } else if (findViewById == coordinatorLayout) {
                if (coordinatorLayout.isInEditMode()) {
                    this.f14942l = null;
                    this.f14941k = null;
                    return;
                }
                throw new IllegalStateException("View can not be anchored to the the parent CoordinatorLayout");
            } else {
                for (ViewParent parent = findViewById.getParent(); parent != coordinatorLayout && parent != null; parent = parent.getParent()) {
                    if (parent == view) {
                        if (coordinatorLayout.isInEditMode()) {
                            this.f14942l = null;
                            this.f14941k = null;
                            return;
                        }
                        throw new IllegalStateException("Anchor must not be a descendant of the anchored view");
                    }
                    if (parent instanceof View) {
                        findViewById = (View) parent;
                    }
                }
                this.f14942l = findViewById;
            }
        }

        public void o(c cVar) {
            c cVar2 = this.f14931a;
            if (cVar2 != cVar) {
                if (cVar2 != null) {
                    cVar2.j();
                }
                this.f14931a = cVar;
                this.f14948r = null;
                this.f14932b = true;
                if (cVar != null) {
                    cVar.g(this);
                }
            }
        }

        public void p(boolean z10) {
            this.f14946p = z10;
        }

        public void q(Rect rect) {
            this.f14947q.set(rect);
        }

        public void r(int i10, boolean z10) {
            if (i10 == 0) {
                this.f14944n = z10;
            } else if (i10 != 1) {
            } else {
                this.f14945o = z10;
            }
        }

        public final boolean s(View view, int i10) {
            int b10 = o3.f.b(((f) view.getLayoutParams()).f14937g, i10);
            return b10 != 0 && (o3.f.b(this.f14938h, i10) & b10) == b10;
        }

        public final boolean t(View view, CoordinatorLayout coordinatorLayout) {
            if (this.f14941k.getId() != this.f14936f) {
                return false;
            }
            View view2 = this.f14941k;
            for (ViewParent parent = view2.getParent(); parent != coordinatorLayout; parent = parent.getParent()) {
                if (parent != null && parent != view) {
                    if (parent instanceof View) {
                        view2 = (View) parent;
                    }
                } else {
                    this.f14942l = null;
                    this.f14941k = null;
                    return false;
                }
            }
            this.f14942l = view2;
            return true;
        }

        public f(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f14932b = false;
            this.f14933c = 0;
            this.f14934d = 0;
            this.f14935e = -1;
            this.f14936f = -1;
            this.f14937g = 0;
            this.f14938h = 0;
            this.f14947q = new Rect();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, y2.c.f61216e);
            this.f14933c = obtainStyledAttributes.getInteger(y2.c.f61217f, 0);
            this.f14936f = obtainStyledAttributes.getResourceId(y2.c.f61218g, -1);
            this.f14934d = obtainStyledAttributes.getInteger(y2.c.f61219h, 0);
            this.f14935e = obtainStyledAttributes.getInteger(y2.c.f61223l, -1);
            this.f14937g = obtainStyledAttributes.getInt(y2.c.f61222k, 0);
            this.f14938h = obtainStyledAttributes.getInt(y2.c.f61221j, 0);
            int i10 = y2.c.f61220i;
            boolean hasValue = obtainStyledAttributes.hasValue(i10);
            this.f14932b = hasValue;
            if (hasValue) {
                this.f14931a = CoordinatorLayout.E(context, attributeSet, obtainStyledAttributes.getString(i10));
            }
            obtainStyledAttributes.recycle();
            c cVar = this.f14931a;
            if (cVar != null) {
                cVar.g(this);
            }
        }

        public f(f fVar) {
            super((ViewGroup.MarginLayoutParams) fVar);
            this.f14932b = false;
            this.f14933c = 0;
            this.f14934d = 0;
            this.f14935e = -1;
            this.f14936f = -1;
            this.f14937g = 0;
            this.f14938h = 0;
            this.f14947q = new Rect();
        }

        public f(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f14932b = false;
            this.f14933c = 0;
            this.f14934d = 0;
            this.f14935e = -1;
            this.f14936f = -1;
            this.f14937g = 0;
            this.f14938h = 0;
            this.f14947q = new Rect();
        }

        public f(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f14932b = false;
            this.f14933c = 0;
            this.f14934d = 0;
            this.f14935e = -1;
            this.f14936f = -1;
            this.f14937g = 0;
            this.f14938h = 0;
            this.f14947q = new Rect();
        }
    }
}
