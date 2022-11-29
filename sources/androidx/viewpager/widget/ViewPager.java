package androidx.viewpager.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.Scroller;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import o3.c0;
import o3.p0;
import o3.v;

/* loaded from: classes.dex */
public class ViewPager extends ViewGroup {
    public static final int[] D0 = {16842931};
    public static final Comparator<f> E0 = new a();
    public static final Interpolator F0 = new b();
    public static final o G0 = new o();
    public j5.a A;
    public ArrayList<View> A0;
    public int B;
    public final Runnable B0;
    public int C;
    public int C0;
    public Parcelable D;
    public ClassLoader E;
    public Scroller F;
    public boolean G;
    public l H;
    public int I;
    public Drawable J;
    public int K;
    public int L;
    public float M;
    public float N;
    public int O;
    public int P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public int T;
    public boolean U;
    public boolean V;
    public int W;

    /* renamed from: a0  reason: collision with root package name */
    public int f16459a0;

    /* renamed from: b0  reason: collision with root package name */
    public int f16460b0;

    /* renamed from: c0  reason: collision with root package name */
    public float f16461c0;

    /* renamed from: d0  reason: collision with root package name */
    public float f16462d0;

    /* renamed from: e0  reason: collision with root package name */
    public float f16463e0;

    /* renamed from: f0  reason: collision with root package name */
    public float f16464f0;

    /* renamed from: g0  reason: collision with root package name */
    public int f16465g0;

    /* renamed from: h0  reason: collision with root package name */
    public VelocityTracker f16466h0;

    /* renamed from: i0  reason: collision with root package name */
    public int f16467i0;

    /* renamed from: j0  reason: collision with root package name */
    public int f16468j0;

    /* renamed from: k0  reason: collision with root package name */
    public int f16469k0;

    /* renamed from: l0  reason: collision with root package name */
    public int f16470l0;

    /* renamed from: m0  reason: collision with root package name */
    public boolean f16471m0;

    /* renamed from: n0  reason: collision with root package name */
    public EdgeEffect f16472n0;

    /* renamed from: o0  reason: collision with root package name */
    public EdgeEffect f16473o0;

    /* renamed from: p0  reason: collision with root package name */
    public boolean f16474p0;

    /* renamed from: q0  reason: collision with root package name */
    public boolean f16475q0;

    /* renamed from: r0  reason: collision with root package name */
    public boolean f16476r0;

    /* renamed from: s0  reason: collision with root package name */
    public int f16477s0;

    /* renamed from: t0  reason: collision with root package name */
    public List<j> f16478t0;

    /* renamed from: u0  reason: collision with root package name */
    public j f16479u0;

    /* renamed from: v0  reason: collision with root package name */
    public j f16480v0;

    /* renamed from: w  reason: collision with root package name */
    public int f16481w;

    /* renamed from: w0  reason: collision with root package name */
    public List<i> f16482w0;

    /* renamed from: x  reason: collision with root package name */
    public final ArrayList<f> f16483x;

    /* renamed from: x0  reason: collision with root package name */
    public k f16484x0;

    /* renamed from: y  reason: collision with root package name */
    public final f f16485y;

    /* renamed from: y0  reason: collision with root package name */
    public int f16486y0;

    /* renamed from: z  reason: collision with root package name */
    public final Rect f16487z;

    /* renamed from: z0  reason: collision with root package name */
    public int f16488z0;

    /* loaded from: classes.dex */
    public static class a implements Comparator<f> {
        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(f fVar, f fVar2) {
            return fVar.f16493b - fVar2.f16493b;
        }
    }

    /* loaded from: classes.dex */
    public static class b implements Interpolator {
        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f10) {
            float f11 = f10 - 1.0f;
            return (f11 * f11 * f11 * f11 * f11) + 1.0f;
        }
    }

    /* loaded from: classes.dex */
    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ViewPager.this.setScrollState(0);
            ViewPager.this.E();
        }
    }

    /* loaded from: classes.dex */
    public class d implements v {

        /* renamed from: w  reason: collision with root package name */
        public final Rect f16490w = new Rect();

        public d() {
        }

        @Override // o3.v
        public p0 a(View view, p0 p0Var) {
            p0 d02 = c0.d0(view, p0Var);
            if (d02.p()) {
                return d02;
            }
            Rect rect = this.f16490w;
            rect.left = d02.k();
            rect.top = d02.m();
            rect.right = d02.l();
            rect.bottom = d02.j();
            int childCount = ViewPager.this.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                p0 i11 = c0.i(ViewPager.this.getChildAt(i10), d02);
                rect.left = Math.min(i11.k(), rect.left);
                rect.top = Math.min(i11.m(), rect.top);
                rect.right = Math.min(i11.l(), rect.right);
                rect.bottom = Math.min(i11.j(), rect.bottom);
            }
            return d02.r(rect.left, rect.top, rect.right, rect.bottom);
        }
    }

    @Target({ElementType.TYPE})
    @Inherited
    @Retention(RetentionPolicy.RUNTIME)
    /* loaded from: classes.dex */
    public @interface e {
    }

    /* loaded from: classes.dex */
    public static class f {

        /* renamed from: a  reason: collision with root package name */
        public Object f16492a;

        /* renamed from: b  reason: collision with root package name */
        public int f16493b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f16494c;

        /* renamed from: d  reason: collision with root package name */
        public float f16495d;

        /* renamed from: e  reason: collision with root package name */
        public float f16496e;
    }

    /* loaded from: classes.dex */
    public class h extends o3.a {
        public h() {
        }

        @Override // o3.a
        public void f(View view, AccessibilityEvent accessibilityEvent) {
            j5.a aVar;
            super.f(view, accessibilityEvent);
            accessibilityEvent.setClassName(ViewPager.class.getName());
            accessibilityEvent.setScrollable(n());
            if (accessibilityEvent.getEventType() != 4096 || (aVar = ViewPager.this.A) == null) {
                return;
            }
            accessibilityEvent.setItemCount(aVar.c());
            accessibilityEvent.setFromIndex(ViewPager.this.B);
            accessibilityEvent.setToIndex(ViewPager.this.B);
        }

        @Override // o3.a
        public void g(View view, p3.c cVar) {
            super.g(view, cVar);
            cVar.b0(ViewPager.class.getName());
            cVar.B0(n());
            if (ViewPager.this.canScrollHorizontally(1)) {
                cVar.a(4096);
            }
            if (ViewPager.this.canScrollHorizontally(-1)) {
                cVar.a(8192);
            }
        }

        @Override // o3.a
        public boolean j(View view, int i10, Bundle bundle) {
            if (super.j(view, i10, bundle)) {
                return true;
            }
            if (i10 != 4096) {
                if (i10 == 8192 && ViewPager.this.canScrollHorizontally(-1)) {
                    ViewPager viewPager = ViewPager.this;
                    viewPager.setCurrentItem(viewPager.B - 1);
                    return true;
                }
                return false;
            } else if (ViewPager.this.canScrollHorizontally(1)) {
                ViewPager viewPager2 = ViewPager.this;
                viewPager2.setCurrentItem(viewPager2.B + 1);
                return true;
            } else {
                return false;
            }
        }

        public final boolean n() {
            j5.a aVar = ViewPager.this.A;
            return aVar != null && aVar.c() > 1;
        }
    }

    /* loaded from: classes.dex */
    public interface i {
        void a(ViewPager viewPager, j5.a aVar, j5.a aVar2);
    }

    /* loaded from: classes.dex */
    public interface j {
        void a(int i10, float f10, int i11);

        void b(int i10);

        void c(int i10);
    }

    /* loaded from: classes.dex */
    public interface k {
        void a(View view, float f10);
    }

    /* loaded from: classes.dex */
    public class l extends DataSetObserver {
        public l() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            ViewPager.this.h();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            ViewPager.this.h();
        }
    }

    /* loaded from: classes.dex */
    public static class m extends v3.a {
        public static final Parcelable.Creator<m> CREATOR = new a();

        /* renamed from: w  reason: collision with root package name */
        public int f16505w;

        /* renamed from: x  reason: collision with root package name */
        public Parcelable f16506x;

        /* renamed from: y  reason: collision with root package name */
        public ClassLoader f16507y;

        /* loaded from: classes.dex */
        public static class a implements Parcelable.ClassLoaderCreator<m> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public m createFromParcel(Parcel parcel) {
                return new m(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b */
            public m createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new m(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c */
            public m[] newArray(int i10) {
                return new m[i10];
            }
        }

        public m(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "FragmentPager.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " position=" + this.f16505w + "}";
        }

        @Override // v3.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f16505w);
            parcel.writeParcelable(this.f16506x, i10);
        }

        public m(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            classLoader = classLoader == null ? getClass().getClassLoader() : classLoader;
            this.f16505w = parcel.readInt();
            this.f16506x = parcel.readParcelable(classLoader);
            this.f16507y = classLoader;
        }
    }

    /* loaded from: classes.dex */
    public static class n implements j {
        @Override // androidx.viewpager.widget.ViewPager.j
        public void a(int i10, float f10, int i11) {
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public void b(int i10) {
        }
    }

    /* loaded from: classes.dex */
    public static class o implements Comparator<View> {
        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(View view, View view2) {
            g gVar = (g) view.getLayoutParams();
            g gVar2 = (g) view2.getLayoutParams();
            boolean z10 = gVar.f16497a;
            if (z10 != gVar2.f16497a) {
                return z10 ? 1 : -1;
            }
            return gVar.f16501e - gVar2.f16501e;
        }
    }

    public ViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f16483x = new ArrayList<>();
        this.f16485y = new f();
        this.f16487z = new Rect();
        this.C = -1;
        this.D = null;
        this.E = null;
        this.M = -3.4028235E38f;
        this.N = Float.MAX_VALUE;
        this.T = 1;
        this.f16465g0 = -1;
        this.f16474p0 = true;
        this.f16475q0 = false;
        this.B0 = new c();
        this.C0 = 0;
        v();
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    private void setScrollingCacheEnabled(boolean z10) {
        if (this.R != z10) {
            this.R = z10;
        }
    }

    public static boolean w(View view) {
        return view.getClass().getAnnotation(e.class) != null;
    }

    public boolean A() {
        int i10 = this.B;
        if (i10 > 0) {
            N(i10 - 1, true);
            return true;
        }
        return false;
    }

    public boolean B() {
        j5.a aVar = this.A;
        if (aVar == null || this.B >= aVar.c() - 1) {
            return false;
        }
        N(this.B + 1, true);
        return true;
    }

    public final boolean C(int i10) {
        if (this.f16483x.size() == 0) {
            if (this.f16474p0) {
                return false;
            }
            this.f16476r0 = false;
            y(0, 0.0f, 0);
            if (this.f16476r0) {
                return false;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
        f t10 = t();
        int clientWidth = getClientWidth();
        int i11 = this.I;
        int i12 = clientWidth + i11;
        float f10 = clientWidth;
        int i13 = t10.f16493b;
        float f11 = ((i10 / f10) - t10.f16496e) / (t10.f16495d + (i11 / f10));
        this.f16476r0 = false;
        y(i13, f11, (int) (i12 * f11));
        if (this.f16476r0) {
            return true;
        }
        throw new IllegalStateException("onPageScrolled did not call superclass implementation");
    }

    public final boolean D(float f10) {
        boolean z10;
        boolean z11;
        float f11 = this.f16461c0 - f10;
        this.f16461c0 = f10;
        float scrollX = getScrollX() + f11;
        float clientWidth = getClientWidth();
        float f12 = this.M * clientWidth;
        float f13 = this.N * clientWidth;
        boolean z12 = false;
        f fVar = this.f16483x.get(0);
        ArrayList<f> arrayList = this.f16483x;
        f fVar2 = arrayList.get(arrayList.size() - 1);
        if (fVar.f16493b != 0) {
            f12 = fVar.f16496e * clientWidth;
            z10 = false;
        } else {
            z10 = true;
        }
        if (fVar2.f16493b != this.A.c() - 1) {
            f13 = fVar2.f16496e * clientWidth;
            z11 = false;
        } else {
            z11 = true;
        }
        if (scrollX < f12) {
            if (z10) {
                this.f16472n0.onPull(Math.abs(f12 - scrollX) / clientWidth);
                z12 = true;
            }
            scrollX = f12;
        } else if (scrollX > f13) {
            if (z11) {
                this.f16473o0.onPull(Math.abs(scrollX - f13) / clientWidth);
                z12 = true;
            }
            scrollX = f13;
        }
        int i10 = (int) scrollX;
        this.f16461c0 += scrollX - i10;
        scrollTo(i10, getScrollY());
        C(i10);
        return z12;
    }

    public void E() {
        F(this.B);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0060, code lost:
        if (r9 == r10) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0066, code lost:
        r8 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void F(int r18) {
        /*
            Method dump skipped, instructions count: 614
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.F(int):void");
    }

    public final void G(int i10, int i11, int i12, int i13) {
        if (i11 > 0 && !this.f16483x.isEmpty()) {
            if (!this.F.isFinished()) {
                this.F.setFinalX(getCurrentItem() * getClientWidth());
                return;
            } else {
                scrollTo((int) ((getScrollX() / (((i11 - getPaddingLeft()) - getPaddingRight()) + i13)) * (((i10 - getPaddingLeft()) - getPaddingRight()) + i12)), getScrollY());
                return;
            }
        }
        f u10 = u(this.B);
        int min = (int) ((u10 != null ? Math.min(u10.f16496e, this.N) : 0.0f) * ((i10 - getPaddingLeft()) - getPaddingRight()));
        if (min != getScrollX()) {
            g(false);
            scrollTo(min, getScrollY());
        }
    }

    public final void H() {
        int i10 = 0;
        while (i10 < getChildCount()) {
            if (!((g) getChildAt(i10).getLayoutParams()).f16497a) {
                removeViewAt(i10);
                i10--;
            }
            i10++;
        }
    }

    public void I(i iVar) {
        List<i> list = this.f16482w0;
        if (list != null) {
            list.remove(iVar);
        }
    }

    public void J(j jVar) {
        List<j> list = this.f16478t0;
        if (list != null) {
            list.remove(jVar);
        }
    }

    public final void K(boolean z10) {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(z10);
        }
    }

    public final boolean L() {
        this.f16465g0 = -1;
        o();
        this.f16472n0.onRelease();
        this.f16473o0.onRelease();
        return this.f16472n0.isFinished() || this.f16473o0.isFinished();
    }

    public final void M(int i10, boolean z10, int i11, boolean z11) {
        f u10 = u(i10);
        int clientWidth = u10 != null ? (int) (getClientWidth() * Math.max(this.M, Math.min(u10.f16496e, this.N))) : 0;
        if (z10) {
            Q(clientWidth, 0, i11);
            if (z11) {
                k(i10);
                return;
            }
            return;
        }
        if (z11) {
            k(i10);
        }
        g(false);
        scrollTo(clientWidth, 0);
        C(clientWidth);
    }

    public void N(int i10, boolean z10) {
        this.S = false;
        O(i10, z10, false);
    }

    public void O(int i10, boolean z10, boolean z11) {
        P(i10, z10, z11, 0);
    }

    public void P(int i10, boolean z10, boolean z11, int i11) {
        j5.a aVar = this.A;
        if (aVar != null && aVar.c() > 0) {
            if (!z11 && this.B == i10 && this.f16483x.size() != 0) {
                setScrollingCacheEnabled(false);
                return;
            }
            if (i10 < 0) {
                i10 = 0;
            } else if (i10 >= this.A.c()) {
                i10 = this.A.c() - 1;
            }
            int i12 = this.T;
            int i13 = this.B;
            if (i10 > i13 + i12 || i10 < i13 - i12) {
                for (int i14 = 0; i14 < this.f16483x.size(); i14++) {
                    this.f16483x.get(i14).f16494c = true;
                }
            }
            boolean z12 = this.B != i10;
            if (this.f16474p0) {
                this.B = i10;
                if (z12) {
                    k(i10);
                }
                requestLayout();
                return;
            }
            F(i10);
            M(i10, z10, i11, z12);
            return;
        }
        setScrollingCacheEnabled(false);
    }

    public void Q(int i10, int i11, int i12) {
        int scrollX;
        int abs;
        if (getChildCount() == 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        Scroller scroller = this.F;
        if ((scroller == null || scroller.isFinished()) ? false : true) {
            scrollX = this.G ? this.F.getCurrX() : this.F.getStartX();
            this.F.abortAnimation();
            setScrollingCacheEnabled(false);
        } else {
            scrollX = getScrollX();
        }
        int i13 = scrollX;
        int scrollY = getScrollY();
        int i14 = i10 - i13;
        int i15 = i11 - scrollY;
        if (i14 == 0 && i15 == 0) {
            g(false);
            E();
            setScrollState(0);
            return;
        }
        setScrollingCacheEnabled(true);
        setScrollState(2);
        int clientWidth = getClientWidth();
        int i16 = clientWidth / 2;
        float f10 = clientWidth;
        float f11 = i16;
        float m10 = f11 + (m(Math.min(1.0f, (Math.abs(i14) * 1.0f) / f10)) * f11);
        int abs2 = Math.abs(i12);
        if (abs2 > 0) {
            abs = Math.round(Math.abs(m10 / abs2) * 1000.0f) * 4;
        } else {
            abs = (int) (((Math.abs(i14) / ((f10 * this.A.f(this.B)) + this.I)) + 1.0f) * 100.0f);
        }
        int min = Math.min(abs, 600);
        this.G = false;
        this.F.startScroll(i13, scrollY, i14, i15, min);
        c0.i0(this);
    }

    public final void R() {
        if (this.f16488z0 != 0) {
            ArrayList<View> arrayList = this.A0;
            if (arrayList == null) {
                this.A0 = new ArrayList<>();
            } else {
                arrayList.clear();
            }
            int childCount = getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                this.A0.add(getChildAt(i10));
            }
            Collections.sort(this.A0, G0);
        }
    }

    public f a(int i10, int i11) {
        f fVar = new f();
        fVar.f16493b = i10;
        fVar.f16492a = this.A.g(this, i10);
        fVar.f16495d = this.A.f(i10);
        if (i11 >= 0 && i11 < this.f16483x.size()) {
            this.f16483x.add(i11, fVar);
        } else {
            this.f16483x.add(fVar);
        }
        return fVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i10, int i11) {
        f s10;
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i12 = 0; i12 < getChildCount(); i12++) {
                View childAt = getChildAt(i12);
                if (childAt.getVisibility() == 0 && (s10 = s(childAt)) != null && s10.f16493b == this.B) {
                    childAt.addFocusables(arrayList, i10, i11);
                }
            }
        }
        if ((descendantFocusability != 262144 || size == arrayList.size()) && isFocusable()) {
            if ((i11 & 1) == 1 && isInTouchMode() && !isFocusableInTouchMode()) {
                return;
            }
            arrayList.add(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addTouchables(ArrayList<View> arrayList) {
        f s10;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() == 0 && (s10 = s(childAt)) != null && s10.f16493b == this.B) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateLayoutParams(layoutParams);
        }
        g gVar = (g) layoutParams;
        boolean w10 = gVar.f16497a | w(view);
        gVar.f16497a = w10;
        if (!this.Q) {
            super.addView(view, i10, layoutParams);
        } else if (!w10) {
            gVar.f16500d = true;
            addViewInLayout(view, i10, layoutParams);
        } else {
            throw new IllegalStateException("Cannot add pager decor view during layout");
        }
    }

    public void b(i iVar) {
        if (this.f16482w0 == null) {
            this.f16482w0 = new ArrayList();
        }
        this.f16482w0.add(iVar);
    }

    public void c(j jVar) {
        if (this.f16478t0 == null) {
            this.f16478t0 = new ArrayList();
        }
        this.f16478t0.add(jVar);
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i10) {
        if (this.A == null) {
            return false;
        }
        int clientWidth = getClientWidth();
        int scrollX = getScrollX();
        return i10 < 0 ? scrollX > ((int) (((float) clientWidth) * this.M)) : i10 > 0 && scrollX < ((int) (((float) clientWidth) * this.N));
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof g) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public void computeScroll() {
        this.G = true;
        if (!this.F.isFinished() && this.F.computeScrollOffset()) {
            int scrollX = getScrollX();
            int scrollY = getScrollY();
            int currX = this.F.getCurrX();
            int currY = this.F.getCurrY();
            if (scrollX != currX || scrollY != currY) {
                scrollTo(currX, currY);
                if (!C(currX)) {
                    this.F.abortAnimation();
                    scrollTo(0, currY);
                }
            }
            c0.i0(this);
            return;
        }
        g(true);
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00cf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean d(int r7) {
        /*
            r6 = this;
            android.view.View r0 = r6.findFocus()
            r1 = 1
            r2 = 0
            r3 = 0
            if (r0 != r6) goto Lb
        L9:
            r0 = r3
            goto L69
        Lb:
            if (r0 == 0) goto L69
            android.view.ViewParent r4 = r0.getParent()
        L11:
            boolean r5 = r4 instanceof android.view.ViewGroup
            if (r5 == 0) goto L1e
            if (r4 != r6) goto L19
            r4 = r1
            goto L1f
        L19:
            android.view.ViewParent r4 = r4.getParent()
            goto L11
        L1e:
            r4 = r2
        L1f:
            if (r4 != 0) goto L69
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.Class r5 = r0.getClass()
            java.lang.String r5 = r5.getSimpleName()
            r4.append(r5)
            android.view.ViewParent r0 = r0.getParent()
        L35:
            boolean r5 = r0 instanceof android.view.ViewGroup
            if (r5 == 0) goto L4e
            java.lang.String r5 = " => "
            r4.append(r5)
            java.lang.Class r5 = r0.getClass()
            java.lang.String r5 = r5.getSimpleName()
            r4.append(r5)
            android.view.ViewParent r0 = r0.getParent()
            goto L35
        L4e:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r5 = "arrowScroll tried to find focus based on non-child current focused view "
            r0.append(r5)
            java.lang.String r4 = r4.toString()
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            java.lang.String r4 = "ViewPager"
            android.util.Log.e(r4, r0)
            goto L9
        L69:
            android.view.FocusFinder r3 = android.view.FocusFinder.getInstance()
            android.view.View r3 = r3.findNextFocus(r6, r0, r7)
            r4 = 66
            r5 = 17
            if (r3 == 0) goto Lba
            if (r3 == r0) goto Lba
            if (r7 != r5) goto L9a
            android.graphics.Rect r1 = r6.f16487z
            android.graphics.Rect r1 = r6.q(r1, r3)
            int r1 = r1.left
            android.graphics.Rect r2 = r6.f16487z
            android.graphics.Rect r2 = r6.q(r2, r0)
            int r2 = r2.left
            if (r0 == 0) goto L94
            if (r1 < r2) goto L94
            boolean r0 = r6.A()
            goto L98
        L94:
            boolean r0 = r3.requestFocus()
        L98:
            r2 = r0
            goto Lcd
        L9a:
            if (r7 != r4) goto Lcd
            android.graphics.Rect r1 = r6.f16487z
            android.graphics.Rect r1 = r6.q(r1, r3)
            int r1 = r1.left
            android.graphics.Rect r2 = r6.f16487z
            android.graphics.Rect r2 = r6.q(r2, r0)
            int r2 = r2.left
            if (r0 == 0) goto Lb5
            if (r1 > r2) goto Lb5
            boolean r0 = r6.B()
            goto L98
        Lb5:
            boolean r0 = r3.requestFocus()
            goto L98
        Lba:
            if (r7 == r5) goto Lc9
            if (r7 != r1) goto Lbf
            goto Lc9
        Lbf:
            if (r7 == r4) goto Lc4
            r0 = 2
            if (r7 != r0) goto Lcd
        Lc4:
            boolean r2 = r6.B()
            goto Lcd
        Lc9:
            boolean r2 = r6.A()
        Lcd:
            if (r2 == 0) goto Ld6
            int r7 = android.view.SoundEffectConstants.getContantForFocusDirection(r7)
            r6.playSoundEffect(r7)
        Ld6:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.d(int):boolean");
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || p(keyEvent);
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        f s10;
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() == 0 && (s10 = s(childAt)) != null && s10.f16493b == this.B && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        j5.a aVar;
        super.draw(canvas);
        int overScrollMode = getOverScrollMode();
        boolean z10 = false;
        if (overScrollMode != 0 && (overScrollMode != 1 || (aVar = this.A) == null || aVar.c() <= 1)) {
            this.f16472n0.finish();
            this.f16473o0.finish();
        } else {
            if (!this.f16472n0.isFinished()) {
                int save = canvas.save();
                int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int width = getWidth();
                canvas.rotate(270.0f);
                canvas.translate((-height) + getPaddingTop(), this.M * width);
                this.f16472n0.setSize(height, width);
                z10 = false | this.f16472n0.draw(canvas);
                canvas.restoreToCount(save);
            }
            if (!this.f16473o0.isFinished()) {
                int save2 = canvas.save();
                int width2 = getWidth();
                int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                canvas.rotate(90.0f);
                canvas.translate(-getPaddingTop(), (-(this.N + 1.0f)) * width2);
                this.f16473o0.setSize(height2, width2);
                z10 |= this.f16473o0.draw(canvas);
                canvas.restoreToCount(save2);
            }
        }
        if (z10) {
            c0.i0(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.J;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        drawable.setState(getDrawableState());
    }

    public final void e(f fVar, int i10, f fVar2) {
        int i11;
        int i12;
        f fVar3;
        f fVar4;
        int c10 = this.A.c();
        int clientWidth = getClientWidth();
        float f10 = clientWidth > 0 ? this.I / clientWidth : 0.0f;
        if (fVar2 != null) {
            int i13 = fVar2.f16493b;
            int i14 = fVar.f16493b;
            if (i13 < i14) {
                float f11 = fVar2.f16496e + fVar2.f16495d + f10;
                int i15 = i13 + 1;
                int i16 = 0;
                while (i15 <= fVar.f16493b && i16 < this.f16483x.size()) {
                    f fVar5 = this.f16483x.get(i16);
                    while (true) {
                        fVar4 = fVar5;
                        if (i15 <= fVar4.f16493b || i16 >= this.f16483x.size() - 1) {
                            break;
                        }
                        i16++;
                        fVar5 = this.f16483x.get(i16);
                    }
                    while (i15 < fVar4.f16493b) {
                        f11 += this.A.f(i15) + f10;
                        i15++;
                    }
                    fVar4.f16496e = f11;
                    f11 += fVar4.f16495d + f10;
                    i15++;
                }
            } else if (i13 > i14) {
                int size = this.f16483x.size() - 1;
                float f12 = fVar2.f16496e;
                while (true) {
                    i13--;
                    if (i13 < fVar.f16493b || size < 0) {
                        break;
                    }
                    f fVar6 = this.f16483x.get(size);
                    while (true) {
                        fVar3 = fVar6;
                        if (i13 >= fVar3.f16493b || size <= 0) {
                            break;
                        }
                        size--;
                        fVar6 = this.f16483x.get(size);
                    }
                    while (i13 > fVar3.f16493b) {
                        f12 -= this.A.f(i13) + f10;
                        i13--;
                    }
                    f12 -= fVar3.f16495d + f10;
                    fVar3.f16496e = f12;
                }
            }
        }
        int size2 = this.f16483x.size();
        float f13 = fVar.f16496e;
        int i17 = fVar.f16493b;
        int i18 = i17 - 1;
        this.M = i17 == 0 ? f13 : -3.4028235E38f;
        int i19 = c10 - 1;
        this.N = i17 == i19 ? (fVar.f16495d + f13) - 1.0f : Float.MAX_VALUE;
        int i20 = i10 - 1;
        while (i20 >= 0) {
            f fVar7 = this.f16483x.get(i20);
            while (true) {
                i12 = fVar7.f16493b;
                if (i18 <= i12) {
                    break;
                }
                f13 -= this.A.f(i18) + f10;
                i18--;
            }
            f13 -= fVar7.f16495d + f10;
            fVar7.f16496e = f13;
            if (i12 == 0) {
                this.M = f13;
            }
            i20--;
            i18--;
        }
        float f14 = fVar.f16496e + fVar.f16495d + f10;
        int i21 = fVar.f16493b + 1;
        int i22 = i10 + 1;
        while (i22 < size2) {
            f fVar8 = this.f16483x.get(i22);
            while (true) {
                i11 = fVar8.f16493b;
                if (i21 >= i11) {
                    break;
                }
                f14 += this.A.f(i21) + f10;
                i21++;
            }
            if (i11 == i19) {
                this.N = (fVar8.f16495d + f14) - 1.0f;
            }
            fVar8.f16496e = f14;
            f14 += fVar8.f16495d + f10;
            i22++;
            i21++;
        }
        this.f16475q0 = false;
    }

    public boolean f(View view, boolean z10, int i10, int i11, int i12) {
        int i13;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i14 = i11 + scrollX;
                if (i14 >= childAt.getLeft() && i14 < childAt.getRight() && (i13 = i12 + scrollY) >= childAt.getTop() && i13 < childAt.getBottom() && f(childAt, true, i10, i14 - childAt.getLeft(), i13 - childAt.getTop())) {
                    return true;
                }
            }
        }
        return z10 && view.canScrollHorizontally(-i10);
    }

    public final void g(boolean z10) {
        boolean z11 = this.C0 == 2;
        if (z11) {
            setScrollingCacheEnabled(false);
            if (!this.F.isFinished()) {
                this.F.abortAnimation();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = this.F.getCurrX();
                int currY = this.F.getCurrY();
                if (scrollX != currX || scrollY != currY) {
                    scrollTo(currX, currY);
                    if (currX != scrollX) {
                        C(currX);
                    }
                }
            }
        }
        this.S = false;
        for (int i10 = 0; i10 < this.f16483x.size(); i10++) {
            f fVar = this.f16483x.get(i10);
            if (fVar.f16494c) {
                fVar.f16494c = false;
                z11 = true;
            }
        }
        if (z11) {
            if (z10) {
                c0.j0(this, this.B0);
            } else {
                this.B0.run();
            }
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new g();
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    public j5.a getAdapter() {
        return this.A;
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i10, int i11) {
        if (this.f16488z0 == 2) {
            i11 = (i10 - 1) - i11;
        }
        return ((g) this.A0.get(i11).getLayoutParams()).f16502f;
    }

    public int getCurrentItem() {
        return this.B;
    }

    public int getOffscreenPageLimit() {
        return this.T;
    }

    public int getPageMargin() {
        return this.I;
    }

    public void h() {
        int c10 = this.A.c();
        this.f16481w = c10;
        boolean z10 = this.f16483x.size() < (this.T * 2) + 1 && this.f16483x.size() < c10;
        int i10 = this.B;
        int i11 = 0;
        boolean z11 = false;
        while (i11 < this.f16483x.size()) {
            f fVar = this.f16483x.get(i11);
            int d10 = this.A.d(fVar.f16492a);
            if (d10 != -1) {
                if (d10 == -2) {
                    this.f16483x.remove(i11);
                    i11--;
                    if (!z11) {
                        this.A.o(this);
                        z11 = true;
                    }
                    this.A.a(this, fVar.f16493b, fVar.f16492a);
                    int i12 = this.B;
                    if (i12 == fVar.f16493b) {
                        i10 = Math.max(0, Math.min(i12, c10 - 1));
                    }
                } else {
                    int i13 = fVar.f16493b;
                    if (i13 != d10) {
                        if (i13 == this.B) {
                            i10 = d10;
                        }
                        fVar.f16493b = d10;
                    }
                }
                z10 = true;
            }
            i11++;
        }
        if (z11) {
            this.A.b(this);
        }
        Collections.sort(this.f16483x, E0);
        if (z10) {
            int childCount = getChildCount();
            for (int i14 = 0; i14 < childCount; i14++) {
                g gVar = (g) getChildAt(i14).getLayoutParams();
                if (!gVar.f16497a) {
                    gVar.f16499c = 0.0f;
                }
            }
            O(i10, false, true);
            requestLayout();
        }
    }

    public final int i(int i10, float f10, int i11, int i12) {
        if (Math.abs(i12) <= this.f16469k0 || Math.abs(i11) <= this.f16467i0) {
            i10 += (int) (f10 + (i10 >= this.B ? 0.4f : 0.6f));
        } else if (i11 <= 0) {
            i10++;
        }
        if (this.f16483x.size() > 0) {
            ArrayList<f> arrayList = this.f16483x;
            return Math.max(this.f16483x.get(0).f16493b, Math.min(i10, arrayList.get(arrayList.size() - 1).f16493b));
        }
        return i10;
    }

    public final void j(int i10, float f10, int i11) {
        j jVar = this.f16479u0;
        if (jVar != null) {
            jVar.a(i10, f10, i11);
        }
        List<j> list = this.f16478t0;
        if (list != null) {
            int size = list.size();
            for (int i12 = 0; i12 < size; i12++) {
                j jVar2 = this.f16478t0.get(i12);
                if (jVar2 != null) {
                    jVar2.a(i10, f10, i11);
                }
            }
        }
        j jVar3 = this.f16480v0;
        if (jVar3 != null) {
            jVar3.a(i10, f10, i11);
        }
    }

    public final void k(int i10) {
        j jVar = this.f16479u0;
        if (jVar != null) {
            jVar.c(i10);
        }
        List<j> list = this.f16478t0;
        if (list != null) {
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                j jVar2 = this.f16478t0.get(i11);
                if (jVar2 != null) {
                    jVar2.c(i10);
                }
            }
        }
        j jVar3 = this.f16480v0;
        if (jVar3 != null) {
            jVar3.c(i10);
        }
    }

    public final void l(int i10) {
        j jVar = this.f16479u0;
        if (jVar != null) {
            jVar.b(i10);
        }
        List<j> list = this.f16478t0;
        if (list != null) {
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                j jVar2 = this.f16478t0.get(i11);
                if (jVar2 != null) {
                    jVar2.b(i10);
                }
            }
        }
        j jVar3 = this.f16480v0;
        if (jVar3 != null) {
            jVar3.b(i10);
        }
    }

    public float m(float f10) {
        return (float) Math.sin((f10 - 0.5f) * 0.47123894f);
    }

    public final void n(boolean z10) {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            getChildAt(i10).setLayerType(z10 ? this.f16486y0 : 0, null);
        }
    }

    public final void o() {
        this.U = false;
        this.V = false;
        VelocityTracker velocityTracker = this.f16466h0;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f16466h0 = null;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f16474p0 = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        removeCallbacks(this.B0);
        Scroller scroller = this.F;
        if (scroller != null && !scroller.isFinished()) {
            this.F.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int width;
        int i10;
        float f10;
        float f11;
        super.onDraw(canvas);
        if (this.I <= 0 || this.J == null || this.f16483x.size() <= 0 || this.A == null) {
            return;
        }
        int scrollX = getScrollX();
        float width2 = getWidth();
        float f12 = this.I / width2;
        int i11 = 0;
        f fVar = this.f16483x.get(0);
        float f13 = fVar.f16496e;
        int size = this.f16483x.size();
        int i12 = fVar.f16493b;
        int i13 = this.f16483x.get(size - 1).f16493b;
        while (i12 < i13) {
            while (true) {
                i10 = fVar.f16493b;
                if (i12 <= i10 || i11 >= size) {
                    break;
                }
                i11++;
                fVar = this.f16483x.get(i11);
            }
            if (i12 == i10) {
                float f14 = fVar.f16496e;
                float f15 = fVar.f16495d;
                f10 = (f14 + f15) * width2;
                f13 = f14 + f15 + f12;
            } else {
                float f16 = this.A.f(i12);
                f10 = (f13 + f16) * width2;
                f13 += f16 + f12;
            }
            if (this.I + f10 > scrollX) {
                f11 = f12;
                this.J.setBounds(Math.round(f10), this.K, Math.round(this.I + f10), this.L);
                this.J.draw(canvas);
            } else {
                f11 = f12;
            }
            if (f10 > scrollX + width) {
                return;
            }
            i12++;
            f12 = f11;
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction() & 255;
        if (action != 3 && action != 1) {
            if (action != 0) {
                if (this.U) {
                    return true;
                }
                if (this.V) {
                    return false;
                }
            }
            if (action == 0) {
                float x10 = motionEvent.getX();
                this.f16463e0 = x10;
                this.f16461c0 = x10;
                float y10 = motionEvent.getY();
                this.f16464f0 = y10;
                this.f16462d0 = y10;
                this.f16465g0 = motionEvent.getPointerId(0);
                this.V = false;
                this.G = true;
                this.F.computeScrollOffset();
                if (this.C0 == 2 && Math.abs(this.F.getFinalX() - this.F.getCurrX()) > this.f16470l0) {
                    this.F.abortAnimation();
                    this.S = false;
                    E();
                    this.U = true;
                    K(true);
                    setScrollState(1);
                } else {
                    g(false);
                    this.U = false;
                }
            } else if (action == 2) {
                int i10 = this.f16465g0;
                if (i10 != -1) {
                    int findPointerIndex = motionEvent.findPointerIndex(i10);
                    float x11 = motionEvent.getX(findPointerIndex);
                    float f10 = x11 - this.f16461c0;
                    float abs = Math.abs(f10);
                    float y11 = motionEvent.getY(findPointerIndex);
                    float abs2 = Math.abs(y11 - this.f16464f0);
                    int i11 = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
                    if (i11 != 0 && !x(this.f16461c0, f10) && f(this, false, (int) f10, (int) x11, (int) y11)) {
                        this.f16461c0 = x11;
                        this.f16462d0 = y11;
                        this.V = true;
                        return false;
                    }
                    int i12 = this.f16460b0;
                    if (abs > i12 && abs * 0.5f > abs2) {
                        this.U = true;
                        K(true);
                        setScrollState(1);
                        float f11 = this.f16463e0;
                        float f12 = this.f16460b0;
                        this.f16461c0 = i11 > 0 ? f11 + f12 : f11 - f12;
                        this.f16462d0 = y11;
                        setScrollingCacheEnabled(true);
                    } else if (abs2 > i12) {
                        this.V = true;
                    }
                    if (this.U && D(x11)) {
                        c0.i0(this);
                    }
                }
            } else if (action == 6) {
                z(motionEvent);
            }
            if (this.f16466h0 == null) {
                this.f16466h0 = VelocityTracker.obtain();
            }
            this.f16466h0.addMovement(motionEvent);
            return this.U;
        }
        L();
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008e  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onLayout(boolean r19, int r20, int r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 284
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        g gVar;
        g gVar2;
        int i12;
        setMeasuredDimension(ViewGroup.getDefaultSize(0, i10), ViewGroup.getDefaultSize(0, i11));
        int measuredWidth = getMeasuredWidth();
        this.f16459a0 = Math.min(measuredWidth / 10, this.W);
        int paddingLeft = (measuredWidth - getPaddingLeft()) - getPaddingRight();
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        int childCount = getChildCount();
        int i13 = 0;
        while (true) {
            boolean z10 = true;
            int i14 = 1073741824;
            if (i13 >= childCount) {
                break;
            }
            View childAt = getChildAt(i13);
            if (childAt.getVisibility() != 8 && (gVar2 = (g) childAt.getLayoutParams()) != null && gVar2.f16497a) {
                int i15 = gVar2.f16498b;
                int i16 = i15 & 7;
                int i17 = i15 & 112;
                boolean z11 = i17 == 48 || i17 == 80;
                if (i16 != 3 && i16 != 5) {
                    z10 = false;
                }
                int i18 = Integer.MIN_VALUE;
                if (z11) {
                    i12 = Integer.MIN_VALUE;
                    i18 = 1073741824;
                } else {
                    i12 = z10 ? 1073741824 : Integer.MIN_VALUE;
                }
                int i19 = ((ViewGroup.LayoutParams) gVar2).width;
                if (i19 != -2) {
                    if (i19 == -1) {
                        i19 = paddingLeft;
                    }
                    i18 = 1073741824;
                } else {
                    i19 = paddingLeft;
                }
                int i20 = ((ViewGroup.LayoutParams) gVar2).height;
                if (i20 == -2) {
                    i20 = measuredHeight;
                    i14 = i12;
                } else if (i20 == -1) {
                    i20 = measuredHeight;
                }
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i19, i18), View.MeasureSpec.makeMeasureSpec(i20, i14));
                if (z11) {
                    measuredHeight -= childAt.getMeasuredHeight();
                } else if (z10) {
                    paddingLeft -= childAt.getMeasuredWidth();
                }
            }
            i13++;
        }
        this.O = View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824);
        this.P = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
        this.Q = true;
        E();
        this.Q = false;
        int childCount2 = getChildCount();
        for (int i21 = 0; i21 < childCount2; i21++) {
            View childAt2 = getChildAt(i21);
            if (childAt2.getVisibility() != 8 && ((gVar = (g) childAt2.getLayoutParams()) == null || !gVar.f16497a)) {
                childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (paddingLeft * gVar.f16499c), 1073741824), this.P);
            }
        }
    }

    @Override // android.view.ViewGroup
    public boolean onRequestFocusInDescendants(int i10, Rect rect) {
        int i11;
        int i12;
        f s10;
        int childCount = getChildCount();
        int i13 = -1;
        if ((i10 & 2) != 0) {
            i13 = childCount;
            i11 = 0;
            i12 = 1;
        } else {
            i11 = childCount - 1;
            i12 = -1;
        }
        while (i11 != i13) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() == 0 && (s10 = s(childAt)) != null && s10.f16493b == this.B && childAt.requestFocus(i10, rect)) {
                return true;
            }
            i11 += i12;
        }
        return false;
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof m)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        m mVar = (m) parcelable;
        super.onRestoreInstanceState(mVar.getSuperState());
        j5.a aVar = this.A;
        if (aVar != null) {
            aVar.k(mVar.f16506x, mVar.f16507y);
            O(mVar.f16505w, false, true);
            return;
        }
        this.C = mVar.f16505w;
        this.D = mVar.f16506x;
        this.E = mVar.f16507y;
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        m mVar = new m(super.onSaveInstanceState());
        mVar.f16505w = this.B;
        j5.a aVar = this.A;
        if (aVar != null) {
            mVar.f16506x = aVar.l();
        }
        return mVar;
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (i10 != i12) {
            int i14 = this.I;
            G(i10, i12, i14, i14);
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        j5.a aVar;
        if (this.f16471m0) {
            return true;
        }
        boolean z10 = false;
        if ((motionEvent.getAction() == 0 && motionEvent.getEdgeFlags() != 0) || (aVar = this.A) == null || aVar.c() == 0) {
            return false;
        }
        if (this.f16466h0 == null) {
            this.f16466h0 = VelocityTracker.obtain();
        }
        this.f16466h0.addMovement(motionEvent);
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            this.F.abortAnimation();
            this.S = false;
            E();
            float x10 = motionEvent.getX();
            this.f16463e0 = x10;
            this.f16461c0 = x10;
            float y10 = motionEvent.getY();
            this.f16464f0 = y10;
            this.f16462d0 = y10;
            this.f16465g0 = motionEvent.getPointerId(0);
        } else if (action != 1) {
            if (action == 2) {
                if (!this.U) {
                    int findPointerIndex = motionEvent.findPointerIndex(this.f16465g0);
                    if (findPointerIndex == -1) {
                        z10 = L();
                    } else {
                        float x11 = motionEvent.getX(findPointerIndex);
                        float abs = Math.abs(x11 - this.f16461c0);
                        float y11 = motionEvent.getY(findPointerIndex);
                        float abs2 = Math.abs(y11 - this.f16462d0);
                        if (abs > this.f16460b0 && abs > abs2) {
                            this.U = true;
                            K(true);
                            float f10 = this.f16463e0;
                            this.f16461c0 = x11 - f10 > 0.0f ? f10 + this.f16460b0 : f10 - this.f16460b0;
                            this.f16462d0 = y11;
                            setScrollState(1);
                            setScrollingCacheEnabled(true);
                            ViewParent parent = getParent();
                            if (parent != null) {
                                parent.requestDisallowInterceptTouchEvent(true);
                            }
                        }
                    }
                }
                if (this.U) {
                    z10 = false | D(motionEvent.getX(motionEvent.findPointerIndex(this.f16465g0)));
                }
            } else if (action != 3) {
                if (action == 5) {
                    int actionIndex = motionEvent.getActionIndex();
                    this.f16461c0 = motionEvent.getX(actionIndex);
                    this.f16465g0 = motionEvent.getPointerId(actionIndex);
                } else if (action == 6) {
                    z(motionEvent);
                    this.f16461c0 = motionEvent.getX(motionEvent.findPointerIndex(this.f16465g0));
                }
            } else if (this.U) {
                M(this.B, true, 0, false);
                z10 = L();
            }
        } else if (this.U) {
            VelocityTracker velocityTracker = this.f16466h0;
            velocityTracker.computeCurrentVelocity(1000, this.f16468j0);
            int xVelocity = (int) velocityTracker.getXVelocity(this.f16465g0);
            this.S = true;
            int clientWidth = getClientWidth();
            int scrollX = getScrollX();
            f t10 = t();
            float f11 = clientWidth;
            P(i(t10.f16493b, ((scrollX / f11) - t10.f16496e) / (t10.f16495d + (this.I / f11)), xVelocity, (int) (motionEvent.getX(motionEvent.findPointerIndex(this.f16465g0)) - this.f16463e0)), true, true, xVelocity);
            z10 = L();
        }
        if (z10) {
            c0.i0(this);
        }
        return true;
    }

    public boolean p(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode == 21) {
                if (keyEvent.hasModifiers(2)) {
                    return A();
                }
                return d(17);
            } else if (keyCode == 22) {
                if (keyEvent.hasModifiers(2)) {
                    return B();
                }
                return d(66);
            } else if (keyCode == 61) {
                if (keyEvent.hasNoModifiers()) {
                    return d(2);
                }
                if (keyEvent.hasModifiers(1)) {
                    return d(1);
                }
            }
        }
        return false;
    }

    public final Rect q(Rect rect, View view) {
        if (rect == null) {
            rect = new Rect();
        }
        if (view == null) {
            rect.set(0, 0, 0, 0);
            return rect;
        }
        rect.left = view.getLeft();
        rect.right = view.getRight();
        rect.top = view.getTop();
        rect.bottom = view.getBottom();
        ViewParent parent = view.getParent();
        while ((parent instanceof ViewGroup) && parent != this) {
            ViewGroup viewGroup = (ViewGroup) parent;
            rect.left += viewGroup.getLeft();
            rect.right += viewGroup.getRight();
            rect.top += viewGroup.getTop();
            rect.bottom += viewGroup.getBottom();
            parent = viewGroup.getParent();
        }
        return rect;
    }

    public f r(View view) {
        while (true) {
            ViewParent parent = view.getParent();
            if (parent != this) {
                if (parent == null || !(parent instanceof View)) {
                    return null;
                }
                view = (View) parent;
            } else {
                return s(view);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        if (this.Q) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    public f s(View view) {
        for (int i10 = 0; i10 < this.f16483x.size(); i10++) {
            f fVar = this.f16483x.get(i10);
            if (this.A.h(view, fVar.f16492a)) {
                return fVar;
            }
        }
        return null;
    }

    public void setAdapter(j5.a aVar) {
        j5.a aVar2 = this.A;
        if (aVar2 != null) {
            aVar2.n(null);
            this.A.o(this);
            for (int i10 = 0; i10 < this.f16483x.size(); i10++) {
                f fVar = this.f16483x.get(i10);
                this.A.a(this, fVar.f16493b, fVar.f16492a);
            }
            this.A.b(this);
            this.f16483x.clear();
            H();
            this.B = 0;
            scrollTo(0, 0);
        }
        j5.a aVar3 = this.A;
        this.A = aVar;
        this.f16481w = 0;
        if (aVar != null) {
            if (this.H == null) {
                this.H = new l();
            }
            this.A.n(this.H);
            this.S = false;
            boolean z10 = this.f16474p0;
            this.f16474p0 = true;
            this.f16481w = this.A.c();
            if (this.C >= 0) {
                this.A.k(this.D, this.E);
                O(this.C, false, true);
                this.C = -1;
                this.D = null;
                this.E = null;
            } else if (!z10) {
                E();
            } else {
                requestLayout();
            }
        }
        List<i> list = this.f16482w0;
        if (list == null || list.isEmpty()) {
            return;
        }
        int size = this.f16482w0.size();
        for (int i11 = 0; i11 < size; i11++) {
            this.f16482w0.get(i11).a(this, aVar3, aVar);
        }
    }

    public void setCurrentItem(int i10) {
        this.S = false;
        O(i10, !this.f16474p0, false);
    }

    public void setOffscreenPageLimit(int i10) {
        if (i10 < 1) {
            Log.w("ViewPager", "Requested offscreen page limit " + i10 + " too small; defaulting to 1");
            i10 = 1;
        }
        if (i10 != this.T) {
            this.T = i10;
            E();
        }
    }

    @Deprecated
    public void setOnPageChangeListener(j jVar) {
        this.f16479u0 = jVar;
    }

    public void setPageMargin(int i10) {
        int i11 = this.I;
        this.I = i10;
        int width = getWidth();
        G(width, width, i10, i11);
        requestLayout();
    }

    public void setPageMarginDrawable(Drawable drawable) {
        this.J = drawable;
        if (drawable != null) {
            refreshDrawableState();
        }
        setWillNotDraw(drawable == null);
        invalidate();
    }

    public void setScrollState(int i10) {
        if (this.C0 == i10) {
            return;
        }
        this.C0 = i10;
        if (this.f16484x0 != null) {
            n(i10 != 0);
        }
        l(i10);
    }

    public final f t() {
        int i10;
        int clientWidth = getClientWidth();
        float f10 = 0.0f;
        float scrollX = clientWidth > 0 ? getScrollX() / clientWidth : 0.0f;
        float f11 = clientWidth > 0 ? this.I / clientWidth : 0.0f;
        f fVar = null;
        int i11 = 0;
        int i12 = -1;
        boolean z10 = true;
        float f12 = 0.0f;
        while (i11 < this.f16483x.size()) {
            f fVar2 = this.f16483x.get(i11);
            if (!z10 && fVar2.f16493b != (i10 = i12 + 1)) {
                fVar2 = this.f16485y;
                fVar2.f16496e = f10 + f12 + f11;
                fVar2.f16493b = i10;
                fVar2.f16495d = this.A.f(i10);
                i11--;
            }
            f10 = fVar2.f16496e;
            float f13 = fVar2.f16495d + f10 + f11;
            if (!z10 && scrollX < f10) {
                return fVar;
            }
            if (scrollX < f13 || i11 == this.f16483x.size() - 1) {
                return fVar2;
            }
            i12 = fVar2.f16493b;
            f12 = fVar2.f16495d;
            i11++;
            z10 = false;
            fVar = fVar2;
        }
        return fVar;
    }

    public f u(int i10) {
        for (int i11 = 0; i11 < this.f16483x.size(); i11++) {
            f fVar = this.f16483x.get(i11);
            if (fVar.f16493b == i10) {
                return fVar;
            }
        }
        return null;
    }

    public void v() {
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context = getContext();
        this.F = new Scroller(context, F0);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        float f10 = context.getResources().getDisplayMetrics().density;
        this.f16460b0 = viewConfiguration.getScaledPagingTouchSlop();
        this.f16467i0 = (int) (400.0f * f10);
        this.f16468j0 = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f16472n0 = new EdgeEffect(context);
        this.f16473o0 = new EdgeEffect(context);
        this.f16469k0 = (int) (25.0f * f10);
        this.f16470l0 = (int) (2.0f * f10);
        this.W = (int) (f10 * 16.0f);
        c0.r0(this, new h());
        if (c0.C(this) == 0) {
            c0.C0(this, 1);
        }
        c0.F0(this, new d());
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.J;
    }

    public final boolean x(float f10, float f11) {
        return (f10 < ((float) this.f16459a0) && f11 > 0.0f) || (f10 > ((float) (getWidth() - this.f16459a0)) && f11 < 0.0f);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void y(int r13, float r14, int r15) {
        /*
            r12 = this;
            int r0 = r12.f16477s0
            r1 = 0
            r2 = 1
            if (r0 <= 0) goto L6b
            int r0 = r12.getScrollX()
            int r3 = r12.getPaddingLeft()
            int r4 = r12.getPaddingRight()
            int r5 = r12.getWidth()
            int r6 = r12.getChildCount()
            r7 = r1
        L1b:
            if (r7 >= r6) goto L6b
            android.view.View r8 = r12.getChildAt(r7)
            android.view.ViewGroup$LayoutParams r9 = r8.getLayoutParams()
            androidx.viewpager.widget.ViewPager$g r9 = (androidx.viewpager.widget.ViewPager.g) r9
            boolean r10 = r9.f16497a
            if (r10 != 0) goto L2c
            goto L68
        L2c:
            int r9 = r9.f16498b
            r9 = r9 & 7
            if (r9 == r2) goto L4d
            r10 = 3
            if (r9 == r10) goto L47
            r10 = 5
            if (r9 == r10) goto L3a
            r9 = r3
            goto L5c
        L3a:
            int r9 = r5 - r4
            int r10 = r8.getMeasuredWidth()
            int r9 = r9 - r10
            int r10 = r8.getMeasuredWidth()
            int r4 = r4 + r10
            goto L59
        L47:
            int r9 = r8.getWidth()
            int r9 = r9 + r3
            goto L5c
        L4d:
            int r9 = r8.getMeasuredWidth()
            int r9 = r5 - r9
            int r9 = r9 / 2
            int r9 = java.lang.Math.max(r9, r3)
        L59:
            r11 = r9
            r9 = r3
            r3 = r11
        L5c:
            int r3 = r3 + r0
            int r10 = r8.getLeft()
            int r3 = r3 - r10
            if (r3 == 0) goto L67
            r8.offsetLeftAndRight(r3)
        L67:
            r3 = r9
        L68:
            int r7 = r7 + 1
            goto L1b
        L6b:
            r12.j(r13, r14, r15)
            androidx.viewpager.widget.ViewPager$k r13 = r12.f16484x0
            if (r13 == 0) goto L9f
            int r13 = r12.getScrollX()
            int r14 = r12.getChildCount()
        L7a:
            if (r1 >= r14) goto L9f
            android.view.View r15 = r12.getChildAt(r1)
            android.view.ViewGroup$LayoutParams r0 = r15.getLayoutParams()
            androidx.viewpager.widget.ViewPager$g r0 = (androidx.viewpager.widget.ViewPager.g) r0
            boolean r0 = r0.f16497a
            if (r0 == 0) goto L8b
            goto L9c
        L8b:
            int r0 = r15.getLeft()
            int r0 = r0 - r13
            float r0 = (float) r0
            int r3 = r12.getClientWidth()
            float r3 = (float) r3
            float r0 = r0 / r3
            androidx.viewpager.widget.ViewPager$k r3 = r12.f16484x0
            r3.a(r15, r0)
        L9c:
            int r1 = r1 + 1
            goto L7a
        L9f:
            r12.f16476r0 = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.y(int, float, int):void");
    }

    public final void z(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f16465g0) {
            int i10 = actionIndex == 0 ? 1 : 0;
            this.f16461c0 = motionEvent.getX(i10);
            this.f16465g0 = motionEvent.getPointerId(i10);
            VelocityTracker velocityTracker = this.f16466h0;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    /* loaded from: classes.dex */
    public static class g extends ViewGroup.LayoutParams {

        /* renamed from: a  reason: collision with root package name */
        public boolean f16497a;

        /* renamed from: b  reason: collision with root package name */
        public int f16498b;

        /* renamed from: c  reason: collision with root package name */
        public float f16499c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f16500d;

        /* renamed from: e  reason: collision with root package name */
        public int f16501e;

        /* renamed from: f  reason: collision with root package name */
        public int f16502f;

        public g() {
            super(-1, -1);
            this.f16499c = 0.0f;
        }

        public g(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f16499c = 0.0f;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ViewPager.D0);
            this.f16498b = obtainStyledAttributes.getInteger(0, 48);
            obtainStyledAttributes.recycle();
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new g(getContext(), attributeSet);
    }

    public void setPageMarginDrawable(int i10) {
        setPageMarginDrawable(c3.a.f(getContext(), i10));
    }
}
