package com.google.android.material.tabs;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.text.Layout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.TooltipCompat;
import androidx.viewpager.widget.ViewPager;
import com.google.android.exoplayer2.analytics.AnalyticsListener;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import nj.l;
import o3.c0;
import o3.z;
import p3.c;
import wi.k;

@ViewPager.e
/* loaded from: classes3.dex */
public class TabLayout extends HorizontalScrollView {

    /* renamed from: p0  reason: collision with root package name */
    public static final int f27687p0 = k.f58915l;

    /* renamed from: q0  reason: collision with root package name */
    public static final n3.e<g> f27688q0 = new n3.g(16);
    public int A;
    public int B;
    public int C;
    public int D;
    public ColorStateList E;
    public ColorStateList F;
    public ColorStateList G;
    public Drawable H;
    public int I;
    public PorterDuff.Mode J;
    public float K;
    public float L;
    public final int M;
    public int N;
    public final int O;
    public final int P;
    public final int Q;
    public int R;
    public int S;
    public int T;
    public int U;
    public int V;
    public boolean W;

    /* renamed from: a0  reason: collision with root package name */
    public boolean f27689a0;

    /* renamed from: b0  reason: collision with root package name */
    public int f27690b0;

    /* renamed from: c0  reason: collision with root package name */
    public boolean f27691c0;

    /* renamed from: d0  reason: collision with root package name */
    public com.google.android.material.tabs.a f27692d0;

    /* renamed from: e0  reason: collision with root package name */
    public c f27693e0;

    /* renamed from: f0  reason: collision with root package name */
    public final ArrayList<c> f27694f0;

    /* renamed from: g0  reason: collision with root package name */
    public c f27695g0;

    /* renamed from: h0  reason: collision with root package name */
    public ValueAnimator f27696h0;

    /* renamed from: i0  reason: collision with root package name */
    public ViewPager f27697i0;

    /* renamed from: j0  reason: collision with root package name */
    public j5.a f27698j0;

    /* renamed from: k0  reason: collision with root package name */
    public DataSetObserver f27699k0;

    /* renamed from: l0  reason: collision with root package name */
    public h f27700l0;

    /* renamed from: m0  reason: collision with root package name */
    public b f27701m0;

    /* renamed from: n0  reason: collision with root package name */
    public boolean f27702n0;

    /* renamed from: o0  reason: collision with root package name */
    public final n3.e<i> f27703o0;

    /* renamed from: w  reason: collision with root package name */
    public final ArrayList<g> f27704w;

    /* renamed from: x  reason: collision with root package name */
    public g f27705x;

    /* renamed from: y  reason: collision with root package name */
    public final f f27706y;

    /* renamed from: z  reason: collision with root package name */
    public int f27707z;

    /* loaded from: classes3.dex */
    public class a implements ValueAnimator.AnimatorUpdateListener {
        public a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            TabLayout.this.scrollTo(((Integer) valueAnimator.getAnimatedValue()).intValue(), 0);
        }
    }

    /* loaded from: classes3.dex */
    public class b implements ViewPager.i {

        /* renamed from: a  reason: collision with root package name */
        public boolean f27709a;

        public b() {
        }

        @Override // androidx.viewpager.widget.ViewPager.i
        public void a(ViewPager viewPager, j5.a aVar, j5.a aVar2) {
            TabLayout tabLayout = TabLayout.this;
            if (tabLayout.f27697i0 == viewPager) {
                tabLayout.H(aVar2, this.f27709a);
            }
        }

        public void b(boolean z10) {
            this.f27709a = z10;
        }
    }

    @Deprecated
    /* loaded from: classes3.dex */
    public interface c<T extends g> {
        void a(T t10);

        void b(T t10);

        void c(T t10);
    }

    /* loaded from: classes3.dex */
    public interface d extends c<g> {
    }

    /* loaded from: classes3.dex */
    public class e extends DataSetObserver {
        public e() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            TabLayout.this.A();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            TabLayout.this.A();
        }
    }

    /* loaded from: classes3.dex */
    public class f extends LinearLayout {

        /* renamed from: w  reason: collision with root package name */
        public ValueAnimator f27712w;

        /* renamed from: x  reason: collision with root package name */
        public int f27713x;

        /* renamed from: y  reason: collision with root package name */
        public float f27714y;

        /* renamed from: z  reason: collision with root package name */
        public int f27715z;

        /* loaded from: classes3.dex */
        public class a implements ValueAnimator.AnimatorUpdateListener {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ View f27716a;

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ View f27717b;

            public a(View view, View view2) {
                this.f27716a = view;
                this.f27717b = view2;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                f.this.g(this.f27716a, this.f27717b, valueAnimator.getAnimatedFraction());
            }
        }

        /* loaded from: classes3.dex */
        public class b extends AnimatorListenerAdapter {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ int f27719a;

            public b(int i10) {
                this.f27719a = i10;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                f.this.f27713x = this.f27719a;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                f.this.f27713x = this.f27719a;
            }
        }

        public f(Context context) {
            super(context);
            this.f27713x = -1;
            this.f27715z = -1;
            setWillNotDraw(false);
        }

        public void b(int i10, int i11) {
            ValueAnimator valueAnimator = this.f27712w;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.f27712w.cancel();
            }
            h(true, i10, i11);
        }

        public boolean c() {
            int childCount = getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                if (getChildAt(i10).getWidth() <= 0) {
                    return true;
                }
            }
            return false;
        }

        public final void d() {
            View childAt = getChildAt(this.f27713x);
            com.google.android.material.tabs.a aVar = TabLayout.this.f27692d0;
            TabLayout tabLayout = TabLayout.this;
            aVar.d(tabLayout, childAt, tabLayout.H);
        }

        @Override // android.view.View
        public void draw(Canvas canvas) {
            int height = TabLayout.this.H.getBounds().height();
            if (height < 0) {
                height = TabLayout.this.H.getIntrinsicHeight();
            }
            int i10 = TabLayout.this.U;
            int i11 = 0;
            if (i10 == 0) {
                i11 = getHeight() - height;
                height = getHeight();
            } else if (i10 == 1) {
                i11 = (getHeight() - height) / 2;
                height = (getHeight() + height) / 2;
            } else if (i10 != 2) {
                height = i10 != 3 ? 0 : getHeight();
            }
            if (TabLayout.this.H.getBounds().width() > 0) {
                Rect bounds = TabLayout.this.H.getBounds();
                TabLayout.this.H.setBounds(bounds.left, i11, bounds.right, height);
                TabLayout tabLayout = TabLayout.this;
                Drawable drawable = tabLayout.H;
                if (tabLayout.I != 0) {
                    drawable = g3.a.r(drawable);
                    if (Build.VERSION.SDK_INT == 21) {
                        drawable.setColorFilter(TabLayout.this.I, PorterDuff.Mode.SRC_IN);
                    } else {
                        g3.a.n(drawable, TabLayout.this.I);
                    }
                }
                drawable.draw(canvas);
            }
            super.draw(canvas);
        }

        public void e(int i10, float f10) {
            ValueAnimator valueAnimator = this.f27712w;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.f27712w.cancel();
            }
            this.f27713x = i10;
            this.f27714y = f10;
            g(getChildAt(i10), getChildAt(this.f27713x + 1), this.f27714y);
        }

        public void f(int i10) {
            Rect bounds = TabLayout.this.H.getBounds();
            TabLayout.this.H.setBounds(bounds.left, 0, bounds.right, i10);
            requestLayout();
        }

        public final void g(View view, View view2, float f10) {
            if (view != null && view.getWidth() > 0) {
                com.google.android.material.tabs.a aVar = TabLayout.this.f27692d0;
                TabLayout tabLayout = TabLayout.this;
                aVar.c(tabLayout, view, view2, f10, tabLayout.H);
            } else {
                Drawable drawable = TabLayout.this.H;
                drawable.setBounds(-1, drawable.getBounds().top, -1, TabLayout.this.H.getBounds().bottom);
            }
            c0.i0(this);
        }

        public final void h(boolean z10, int i10, int i11) {
            View childAt = getChildAt(this.f27713x);
            View childAt2 = getChildAt(i10);
            if (childAt2 == null) {
                d();
                return;
            }
            a aVar = new a(childAt, childAt2);
            if (z10) {
                ValueAnimator valueAnimator = new ValueAnimator();
                this.f27712w = valueAnimator;
                valueAnimator.setInterpolator(xi.a.f60298b);
                valueAnimator.setDuration(i11);
                valueAnimator.setFloatValues(0.0f, 1.0f);
                valueAnimator.addUpdateListener(aVar);
                valueAnimator.addListener(new b(i10));
                valueAnimator.start();
                return;
            }
            this.f27712w.removeAllUpdateListeners();
            this.f27712w.addUpdateListener(aVar);
        }

        @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
        public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
            super.onLayout(z10, i10, i11, i12, i13);
            ValueAnimator valueAnimator = this.f27712w;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                h(false, this.f27713x, -1);
            } else {
                d();
            }
        }

        @Override // android.widget.LinearLayout, android.view.View
        public void onMeasure(int i10, int i11) {
            super.onMeasure(i10, i11);
            if (View.MeasureSpec.getMode(i10) != 1073741824) {
                return;
            }
            TabLayout tabLayout = TabLayout.this;
            boolean z10 = true;
            if (tabLayout.S == 1 || tabLayout.V == 2) {
                int childCount = getChildCount();
                int i12 = 0;
                for (int i13 = 0; i13 < childCount; i13++) {
                    View childAt = getChildAt(i13);
                    if (childAt.getVisibility() == 0) {
                        i12 = Math.max(i12, childAt.getMeasuredWidth());
                    }
                }
                if (i12 <= 0) {
                    return;
                }
                if (i12 * childCount <= getMeasuredWidth() - (((int) l.b(getContext(), 16)) * 2)) {
                    boolean z11 = false;
                    for (int i14 = 0; i14 < childCount; i14++) {
                        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) getChildAt(i14).getLayoutParams();
                        if (layoutParams.width != i12 || layoutParams.weight != 0.0f) {
                            layoutParams.width = i12;
                            layoutParams.weight = 0.0f;
                            z11 = true;
                        }
                    }
                    z10 = z11;
                } else {
                    TabLayout tabLayout2 = TabLayout.this;
                    tabLayout2.S = 0;
                    tabLayout2.O(false);
                }
                if (z10) {
                    super.onMeasure(i10, i11);
                }
            }
        }

        @Override // android.widget.LinearLayout, android.view.View
        public void onRtlPropertiesChanged(int i10) {
            super.onRtlPropertiesChanged(i10);
            if (Build.VERSION.SDK_INT >= 23 || this.f27715z == i10) {
                return;
            }
            requestLayout();
            this.f27715z = i10;
        }
    }

    /* loaded from: classes3.dex */
    public static class g {

        /* renamed from: a  reason: collision with root package name */
        public Object f27721a;

        /* renamed from: b  reason: collision with root package name */
        public Drawable f27722b;

        /* renamed from: c  reason: collision with root package name */
        public CharSequence f27723c;

        /* renamed from: d  reason: collision with root package name */
        public CharSequence f27724d;

        /* renamed from: f  reason: collision with root package name */
        public View f27726f;

        /* renamed from: h  reason: collision with root package name */
        public TabLayout f27728h;

        /* renamed from: i  reason: collision with root package name */
        public i f27729i;

        /* renamed from: e  reason: collision with root package name */
        public int f27725e = -1;

        /* renamed from: g  reason: collision with root package name */
        public int f27727g = 1;

        /* renamed from: j  reason: collision with root package name */
        public int f27730j = -1;

        public View e() {
            return this.f27726f;
        }

        public Drawable f() {
            return this.f27722b;
        }

        public int g() {
            return this.f27725e;
        }

        public int h() {
            return this.f27727g;
        }

        public Object i() {
            return this.f27721a;
        }

        public CharSequence j() {
            return this.f27723c;
        }

        public boolean k() {
            TabLayout tabLayout = this.f27728h;
            if (tabLayout != null) {
                return tabLayout.getSelectedTabPosition() == this.f27725e;
            }
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }

        public void l() {
            this.f27728h = null;
            this.f27729i = null;
            this.f27721a = null;
            this.f27722b = null;
            this.f27730j = -1;
            this.f27723c = null;
            this.f27724d = null;
            this.f27725e = -1;
            this.f27726f = null;
        }

        public void m() {
            TabLayout tabLayout = this.f27728h;
            if (tabLayout != null) {
                tabLayout.F(this);
                return;
            }
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }

        public g n(CharSequence charSequence) {
            this.f27724d = charSequence;
            u();
            return this;
        }

        public g o(int i10) {
            return p(LayoutInflater.from(this.f27729i.getContext()).inflate(i10, (ViewGroup) this.f27729i, false));
        }

        public g p(View view) {
            this.f27726f = view;
            u();
            return this;
        }

        public g q(Drawable drawable) {
            this.f27722b = drawable;
            TabLayout tabLayout = this.f27728h;
            if (tabLayout.S == 1 || tabLayout.V == 2) {
                tabLayout.O(true);
            }
            u();
            if (zi.b.f63201a && this.f27729i.l() && this.f27729i.A.isVisible()) {
                this.f27729i.invalidate();
            }
            return this;
        }

        public void r(int i10) {
            this.f27725e = i10;
        }

        public g s(Object obj) {
            this.f27721a = obj;
            return this;
        }

        public g t(CharSequence charSequence) {
            if (TextUtils.isEmpty(this.f27724d) && !TextUtils.isEmpty(charSequence)) {
                this.f27729i.setContentDescription(charSequence);
            }
            this.f27723c = charSequence;
            u();
            return this;
        }

        public void u() {
            i iVar = this.f27729i;
            if (iVar != null) {
                iVar.t();
            }
        }
    }

    /* loaded from: classes3.dex */
    public static class h implements ViewPager.j {

        /* renamed from: a  reason: collision with root package name */
        public final WeakReference<TabLayout> f27731a;

        /* renamed from: b  reason: collision with root package name */
        public int f27732b;

        /* renamed from: c  reason: collision with root package name */
        public int f27733c;

        public h(TabLayout tabLayout) {
            this.f27731a = new WeakReference<>(tabLayout);
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public void a(int i10, float f10, int i11) {
            TabLayout tabLayout = this.f27731a.get();
            if (tabLayout != null) {
                int i12 = this.f27733c;
                boolean z10 = false;
                boolean z11 = i12 != 2 || this.f27732b == 1;
                if (i12 != 2 || this.f27732b != 0) {
                    z10 = true;
                }
                tabLayout.J(i10, f10, z11, z10);
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public void b(int i10) {
            this.f27732b = this.f27733c;
            this.f27733c = i10;
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public void c(int i10) {
            TabLayout tabLayout = this.f27731a.get();
            if (tabLayout == null || tabLayout.getSelectedTabPosition() == i10 || i10 >= tabLayout.getTabCount()) {
                return;
            }
            int i11 = this.f27733c;
            tabLayout.G(tabLayout.x(i10), i11 == 0 || (i11 == 2 && this.f27732b == 0));
        }

        public void d() {
            this.f27733c = 0;
            this.f27732b = 0;
        }
    }

    /* loaded from: classes3.dex */
    public final class i extends LinearLayout {
        public zi.a A;
        public View B;
        public TextView C;
        public ImageView D;
        public Drawable E;
        public int F;

        /* renamed from: w  reason: collision with root package name */
        public g f27734w;

        /* renamed from: x  reason: collision with root package name */
        public TextView f27735x;

        /* renamed from: y  reason: collision with root package name */
        public ImageView f27736y;

        /* renamed from: z  reason: collision with root package name */
        public View f27737z;

        /* loaded from: classes3.dex */
        public class a implements View.OnLayoutChangeListener {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ View f27738w;

            public a(View view) {
                this.f27738w = view;
            }

            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
                if (this.f27738w.getVisibility() == 0) {
                    i.this.s(this.f27738w);
                }
            }
        }

        public i(Context context) {
            super(context);
            this.F = 2;
            u(context);
            c0.G0(this, TabLayout.this.f27707z, TabLayout.this.A, TabLayout.this.B, TabLayout.this.C);
            setGravity(17);
            setOrientation(!TabLayout.this.W ? 1 : 0);
            setClickable(true);
            c0.H0(this, z.b(getContext(), AnalyticsListener.EVENT_LOAD_CANCELED));
        }

        private zi.a getBadge() {
            return this.A;
        }

        private zi.a getOrCreateBadge() {
            if (this.A == null) {
                this.A = zi.a.c(getContext());
            }
            r();
            zi.a aVar = this.A;
            if (aVar != null) {
                return aVar;
            }
            throw new IllegalStateException("Unable to create badge");
        }

        @Override // android.view.ViewGroup, android.view.View
        public void drawableStateChanged() {
            super.drawableStateChanged();
            int[] drawableState = getDrawableState();
            Drawable drawable = this.E;
            boolean z10 = false;
            if (drawable != null && drawable.isStateful()) {
                z10 = false | this.E.setState(drawableState);
            }
            if (z10) {
                invalidate();
                TabLayout.this.invalidate();
            }
        }

        public final void f(View view) {
            if (view == null) {
                return;
            }
            view.addOnLayoutChangeListener(new a(view));
        }

        public final float g(Layout layout, int i10, float f10) {
            return layout.getLineWidth(i10) * (f10 / layout.getPaint().getTextSize());
        }

        public int getContentHeight() {
            View[] viewArr = {this.f27735x, this.f27736y, this.B};
            int i10 = 0;
            int i11 = 0;
            boolean z10 = false;
            for (int i12 = 0; i12 < 3; i12++) {
                View view = viewArr[i12];
                if (view != null && view.getVisibility() == 0) {
                    i11 = z10 ? Math.min(i11, view.getTop()) : view.getTop();
                    i10 = z10 ? Math.max(i10, view.getBottom()) : view.getBottom();
                    z10 = true;
                }
            }
            return i10 - i11;
        }

        public int getContentWidth() {
            View[] viewArr = {this.f27735x, this.f27736y, this.B};
            int i10 = 0;
            int i11 = 0;
            boolean z10 = false;
            for (int i12 = 0; i12 < 3; i12++) {
                View view = viewArr[i12];
                if (view != null && view.getVisibility() == 0) {
                    i11 = z10 ? Math.min(i11, view.getLeft()) : view.getLeft();
                    i10 = z10 ? Math.max(i10, view.getRight()) : view.getRight();
                    z10 = true;
                }
            }
            return i10 - i11;
        }

        public g getTab() {
            return this.f27734w;
        }

        public final void h(boolean z10) {
            setClipChildren(z10);
            setClipToPadding(z10);
            ViewGroup viewGroup = (ViewGroup) getParent();
            if (viewGroup != null) {
                viewGroup.setClipChildren(z10);
                viewGroup.setClipToPadding(z10);
            }
        }

        public final FrameLayout i() {
            FrameLayout frameLayout = new FrameLayout(getContext());
            frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
            return frameLayout;
        }

        public final void j(Canvas canvas) {
            Drawable drawable = this.E;
            if (drawable != null) {
                drawable.setBounds(getLeft(), getTop(), getRight(), getBottom());
                this.E.draw(canvas);
            }
        }

        public final FrameLayout k(View view) {
            if ((view == this.f27736y || view == this.f27735x) && zi.b.f63201a) {
                return (FrameLayout) view.getParent();
            }
            return null;
        }

        public final boolean l() {
            return this.A != null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void m() {
            FrameLayout frameLayout;
            if (zi.b.f63201a) {
                frameLayout = i();
                addView(frameLayout, 0);
            } else {
                frameLayout = this;
            }
            ImageView imageView = (ImageView) LayoutInflater.from(getContext()).inflate(wi.h.f58864b, (ViewGroup) frameLayout, false);
            this.f27736y = imageView;
            frameLayout.addView(imageView, 0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void n() {
            FrameLayout frameLayout;
            if (zi.b.f63201a) {
                frameLayout = i();
                addView(frameLayout);
            } else {
                frameLayout = this;
            }
            TextView textView = (TextView) LayoutInflater.from(getContext()).inflate(wi.h.f58865c, (ViewGroup) frameLayout, false);
            this.f27735x = textView;
            frameLayout.addView(textView);
        }

        public void o() {
            setTab(null);
            setSelected(false);
        }

        @Override // android.view.View
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            zi.a aVar = this.A;
            if (aVar != null && aVar.isVisible()) {
                CharSequence contentDescription = getContentDescription();
                accessibilityNodeInfo.setContentDescription(((Object) contentDescription) + ", " + ((Object) this.A.g()));
            }
            p3.c M0 = p3.c.M0(accessibilityNodeInfo);
            M0.e0(c.C0699c.a(0, 1, this.f27734w.g(), 1, false, isSelected()));
            if (isSelected()) {
                M0.c0(false);
                M0.S(c.a.f45749i);
            }
            M0.z0(getResources().getString(wi.j.f58891h));
        }

        @Override // android.widget.LinearLayout, android.view.View
        public void onMeasure(int i10, int i11) {
            Layout layout;
            int size = View.MeasureSpec.getSize(i10);
            int mode = View.MeasureSpec.getMode(i10);
            int tabMaxWidth = TabLayout.this.getTabMaxWidth();
            if (tabMaxWidth > 0 && (mode == 0 || size > tabMaxWidth)) {
                i10 = View.MeasureSpec.makeMeasureSpec(TabLayout.this.N, Integer.MIN_VALUE);
            }
            super.onMeasure(i10, i11);
            if (this.f27735x != null) {
                float f10 = TabLayout.this.K;
                int i12 = this.F;
                ImageView imageView = this.f27736y;
                boolean z10 = true;
                if (imageView == null || imageView.getVisibility() != 0) {
                    TextView textView = this.f27735x;
                    if (textView != null && textView.getLineCount() > 1) {
                        f10 = TabLayout.this.L;
                    }
                } else {
                    i12 = 1;
                }
                float textSize = this.f27735x.getTextSize();
                int lineCount = this.f27735x.getLineCount();
                int d10 = s3.j.d(this.f27735x);
                int i13 = (f10 > textSize ? 1 : (f10 == textSize ? 0 : -1));
                if (i13 != 0 || (d10 >= 0 && i12 != d10)) {
                    if (TabLayout.this.V == 1 && i13 > 0 && lineCount == 1 && ((layout = this.f27735x.getLayout()) == null || g(layout, 0, f10) > (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight())) {
                        z10 = false;
                    }
                    if (z10) {
                        this.f27735x.setTextSize(0, f10);
                        this.f27735x.setMaxLines(i12);
                        super.onMeasure(i10, i11);
                    }
                }
            }
        }

        public final void p(View view) {
            if (l() && view != null) {
                h(false);
                zi.b.a(this.A, view, k(view));
                this.f27737z = view;
            }
        }

        @Override // android.view.View
        public boolean performClick() {
            boolean performClick = super.performClick();
            if (this.f27734w != null) {
                if (!performClick) {
                    playSoundEffect(0);
                }
                this.f27734w.m();
                return true;
            }
            return performClick;
        }

        public final void q() {
            if (l()) {
                h(true);
                View view = this.f27737z;
                if (view != null) {
                    zi.b.b(this.A, view);
                    this.f27737z = null;
                }
            }
        }

        public final void r() {
            g gVar;
            g gVar2;
            if (l()) {
                if (this.B != null) {
                    q();
                } else if (this.f27736y != null && (gVar2 = this.f27734w) != null && gVar2.f() != null) {
                    View view = this.f27737z;
                    ImageView imageView = this.f27736y;
                    if (view != imageView) {
                        q();
                        p(this.f27736y);
                        return;
                    }
                    s(imageView);
                } else if (this.f27735x != null && (gVar = this.f27734w) != null && gVar.h() == 1) {
                    View view2 = this.f27737z;
                    TextView textView = this.f27735x;
                    if (view2 != textView) {
                        q();
                        p(this.f27735x);
                        return;
                    }
                    s(textView);
                } else {
                    q();
                }
            }
        }

        public final void s(View view) {
            if (l() && view == this.f27737z) {
                zi.b.c(this.A, view, k(view));
            }
        }

        @Override // android.view.View
        public void setSelected(boolean z10) {
            boolean z11 = isSelected() != z10;
            super.setSelected(z10);
            if (z11 && z10 && Build.VERSION.SDK_INT < 16) {
                sendAccessibilityEvent(4);
            }
            TextView textView = this.f27735x;
            if (textView != null) {
                textView.setSelected(z10);
            }
            ImageView imageView = this.f27736y;
            if (imageView != null) {
                imageView.setSelected(z10);
            }
            View view = this.B;
            if (view != null) {
                view.setSelected(z10);
            }
        }

        public void setTab(g gVar) {
            if (gVar != this.f27734w) {
                this.f27734w = gVar;
                t();
            }
        }

        public final void t() {
            g gVar = this.f27734w;
            Drawable drawable = null;
            View e10 = gVar != null ? gVar.e() : null;
            if (e10 != null) {
                ViewParent parent = e10.getParent();
                if (parent != this) {
                    if (parent != null) {
                        ((ViewGroup) parent).removeView(e10);
                    }
                    addView(e10);
                }
                this.B = e10;
                TextView textView = this.f27735x;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                ImageView imageView = this.f27736y;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    this.f27736y.setImageDrawable(null);
                }
                TextView textView2 = (TextView) e10.findViewById(16908308);
                this.C = textView2;
                if (textView2 != null) {
                    this.F = s3.j.d(textView2);
                }
                this.D = (ImageView) e10.findViewById(16908294);
            } else {
                View view = this.B;
                if (view != null) {
                    removeView(view);
                    this.B = null;
                }
                this.C = null;
                this.D = null;
            }
            if (this.B == null) {
                if (this.f27736y == null) {
                    m();
                }
                if (gVar != null && gVar.f() != null) {
                    drawable = g3.a.r(gVar.f()).mutate();
                }
                if (drawable != null) {
                    g3.a.o(drawable, TabLayout.this.F);
                    PorterDuff.Mode mode = TabLayout.this.J;
                    if (mode != null) {
                        g3.a.p(drawable, mode);
                    }
                }
                if (this.f27735x == null) {
                    n();
                    this.F = s3.j.d(this.f27735x);
                }
                s3.j.q(this.f27735x, TabLayout.this.D);
                ColorStateList colorStateList = TabLayout.this.E;
                if (colorStateList != null) {
                    this.f27735x.setTextColor(colorStateList);
                }
                w(this.f27735x, this.f27736y);
                r();
                f(this.f27736y);
                f(this.f27735x);
            } else {
                TextView textView3 = this.C;
                if (textView3 != null || this.D != null) {
                    w(textView3, this.D);
                }
            }
            if (gVar != null && !TextUtils.isEmpty(gVar.f27724d)) {
                setContentDescription(gVar.f27724d);
            }
            setSelected(gVar != null && gVar.k());
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v3, types: [android.graphics.drawable.RippleDrawable] */
        /* JADX WARN: Type inference failed for: r2v3, types: [android.graphics.drawable.LayerDrawable] */
        public final void u(Context context) {
            int i10 = TabLayout.this.M;
            if (i10 != 0) {
                Drawable b10 = f.a.b(context, i10);
                this.E = b10;
                if (b10 != null && b10.isStateful()) {
                    this.E.setState(getDrawableState());
                }
            } else {
                this.E = null;
            }
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColor(0);
            if (TabLayout.this.G != null) {
                GradientDrawable gradientDrawable2 = new GradientDrawable();
                gradientDrawable2.setCornerRadius(1.0E-5f);
                gradientDrawable2.setColor(-1);
                ColorStateList a10 = rj.b.a(TabLayout.this.G);
                if (Build.VERSION.SDK_INT >= 21) {
                    boolean z10 = TabLayout.this.f27691c0;
                    if (z10) {
                        gradientDrawable = null;
                    }
                    gradientDrawable = new RippleDrawable(a10, gradientDrawable, z10 ? null : gradientDrawable2);
                } else {
                    Drawable r10 = g3.a.r(gradientDrawable2);
                    g3.a.o(r10, a10);
                    gradientDrawable = new LayerDrawable(new Drawable[]{gradientDrawable, r10});
                }
            }
            c0.v0(this, gradientDrawable);
            TabLayout.this.invalidate();
        }

        public final void v() {
            setOrientation(!TabLayout.this.W ? 1 : 0);
            TextView textView = this.C;
            if (textView == null && this.D == null) {
                w(this.f27735x, this.f27736y);
            } else {
                w(textView, this.D);
            }
        }

        public final void w(TextView textView, ImageView imageView) {
            g gVar = this.f27734w;
            Drawable mutate = (gVar == null || gVar.f() == null) ? null : g3.a.r(this.f27734w.f()).mutate();
            g gVar2 = this.f27734w;
            CharSequence j10 = gVar2 != null ? gVar2.j() : null;
            if (imageView != null) {
                if (mutate != null) {
                    imageView.setImageDrawable(mutate);
                    imageView.setVisibility(0);
                    setVisibility(0);
                } else {
                    imageView.setVisibility(8);
                    imageView.setImageDrawable(null);
                }
            }
            boolean z10 = !TextUtils.isEmpty(j10);
            if (textView != null) {
                if (z10) {
                    textView.setText(j10);
                    if (this.f27734w.f27727g == 1) {
                        textView.setVisibility(0);
                    } else {
                        textView.setVisibility(8);
                    }
                    setVisibility(0);
                } else {
                    textView.setVisibility(8);
                    textView.setText((CharSequence) null);
                }
            }
            if (imageView != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) imageView.getLayoutParams();
                int b10 = (z10 && imageView.getVisibility() == 0) ? (int) l.b(getContext(), 8) : 0;
                if (TabLayout.this.W) {
                    if (b10 != o3.i.a(marginLayoutParams)) {
                        o3.i.c(marginLayoutParams, b10);
                        marginLayoutParams.bottomMargin = 0;
                        imageView.setLayoutParams(marginLayoutParams);
                        imageView.requestLayout();
                    }
                } else if (b10 != marginLayoutParams.bottomMargin) {
                    marginLayoutParams.bottomMargin = b10;
                    o3.i.c(marginLayoutParams, 0);
                    imageView.setLayoutParams(marginLayoutParams);
                    imageView.requestLayout();
                }
            }
            g gVar3 = this.f27734w;
            CharSequence charSequence = gVar3 != null ? gVar3.f27724d : null;
            int i10 = Build.VERSION.SDK_INT;
            if (i10 < 21 || i10 > 23) {
                if (!z10) {
                    j10 = charSequence;
                }
                TooltipCompat.setTooltipText(this, j10);
            }
        }
    }

    /* loaded from: classes3.dex */
    public static class j implements d {

        /* renamed from: a  reason: collision with root package name */
        public final ViewPager f27740a;

        public j(ViewPager viewPager) {
            this.f27740a = viewPager;
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void a(g gVar) {
            this.f27740a.setCurrentItem(gVar.g());
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void b(g gVar) {
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void c(g gVar) {
        }
    }

    public TabLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, wi.b.I);
    }

    private int getDefaultHeight() {
        int size = this.f27704w.size();
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            if (i10 < size) {
                g gVar = this.f27704w.get(i10);
                if (gVar != null && gVar.f() != null && !TextUtils.isEmpty(gVar.j())) {
                    z10 = true;
                    break;
                }
                i10++;
            } else {
                break;
            }
        }
        return (!z10 || this.W) ? 48 : 72;
    }

    private int getTabMinWidth() {
        int i10 = this.O;
        if (i10 != -1) {
            return i10;
        }
        int i11 = this.V;
        if (i11 == 0 || i11 == 2) {
            return this.Q;
        }
        return 0;
    }

    private int getTabScrollRange() {
        return Math.max(0, ((this.f27706y.getWidth() - getWidth()) - getPaddingLeft()) - getPaddingRight());
    }

    public static ColorStateList p(int i10, int i11) {
        return new ColorStateList(new int[][]{HorizontalScrollView.SELECTED_STATE_SET, HorizontalScrollView.EMPTY_STATE_SET}, new int[]{i11, i10});
    }

    private void setSelectedTabView(int i10) {
        int childCount = this.f27706y.getChildCount();
        if (i10 < childCount) {
            int i11 = 0;
            while (i11 < childCount) {
                View childAt = this.f27706y.getChildAt(i11);
                boolean z10 = true;
                childAt.setSelected(i11 == i10);
                if (i11 != i10) {
                    z10 = false;
                }
                childAt.setActivated(z10);
                i11++;
            }
        }
    }

    public void A() {
        int currentItem;
        C();
        j5.a aVar = this.f27698j0;
        if (aVar != null) {
            int c10 = aVar.c();
            for (int i10 = 0; i10 < c10; i10++) {
                g(z().t(this.f27698j0.e(i10)), false);
            }
            ViewPager viewPager = this.f27697i0;
            if (viewPager == null || c10 <= 0 || (currentItem = viewPager.getCurrentItem()) == getSelectedTabPosition() || currentItem >= getTabCount()) {
                return;
            }
            F(x(currentItem));
        }
    }

    public boolean B(g gVar) {
        return f27688q0.a(gVar);
    }

    public void C() {
        for (int childCount = this.f27706y.getChildCount() - 1; childCount >= 0; childCount--) {
            E(childCount);
        }
        Iterator<g> it = this.f27704w.iterator();
        while (it.hasNext()) {
            g next = it.next();
            it.remove();
            next.l();
            B(next);
        }
        this.f27705x = null;
    }

    @Deprecated
    public void D(c cVar) {
        this.f27694f0.remove(cVar);
    }

    public final void E(int i10) {
        i iVar = (i) this.f27706y.getChildAt(i10);
        this.f27706y.removeViewAt(i10);
        if (iVar != null) {
            iVar.o();
            this.f27703o0.a(iVar);
        }
        requestLayout();
    }

    public void F(g gVar) {
        G(gVar, true);
    }

    public void G(g gVar, boolean z10) {
        g gVar2 = this.f27705x;
        if (gVar2 == gVar) {
            if (gVar2 != null) {
                t(gVar);
                k(gVar.g());
                return;
            }
            return;
        }
        int g10 = gVar != null ? gVar.g() : -1;
        if (z10) {
            if ((gVar2 == null || gVar2.g() == -1) && g10 != -1) {
                I(g10, 0.0f, true);
            } else {
                k(g10);
            }
            if (g10 != -1) {
                setSelectedTabView(g10);
            }
        }
        this.f27705x = gVar;
        if (gVar2 != null) {
            v(gVar2);
        }
        if (gVar != null) {
            u(gVar);
        }
    }

    public void H(j5.a aVar, boolean z10) {
        DataSetObserver dataSetObserver;
        j5.a aVar2 = this.f27698j0;
        if (aVar2 != null && (dataSetObserver = this.f27699k0) != null) {
            aVar2.p(dataSetObserver);
        }
        this.f27698j0 = aVar;
        if (z10 && aVar != null) {
            if (this.f27699k0 == null) {
                this.f27699k0 = new e();
            }
            aVar.j(this.f27699k0);
        }
        A();
    }

    public void I(int i10, float f10, boolean z10) {
        J(i10, f10, z10, true);
    }

    public void J(int i10, float f10, boolean z10, boolean z11) {
        int round = Math.round(i10 + f10);
        if (round < 0 || round >= this.f27706y.getChildCount()) {
            return;
        }
        if (z11) {
            this.f27706y.e(i10, f10);
        }
        ValueAnimator valueAnimator = this.f27696h0;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f27696h0.cancel();
        }
        scrollTo(n(i10, f10), 0);
        if (z10) {
            setSelectedTabView(round);
        }
    }

    public void K(ViewPager viewPager, boolean z10) {
        L(viewPager, z10, false);
    }

    public final void L(ViewPager viewPager, boolean z10, boolean z11) {
        ViewPager viewPager2 = this.f27697i0;
        if (viewPager2 != null) {
            h hVar = this.f27700l0;
            if (hVar != null) {
                viewPager2.J(hVar);
            }
            b bVar = this.f27701m0;
            if (bVar != null) {
                this.f27697i0.I(bVar);
            }
        }
        c cVar = this.f27695g0;
        if (cVar != null) {
            D(cVar);
            this.f27695g0 = null;
        }
        if (viewPager != null) {
            this.f27697i0 = viewPager;
            if (this.f27700l0 == null) {
                this.f27700l0 = new h(this);
            }
            this.f27700l0.d();
            viewPager.c(this.f27700l0);
            j jVar = new j(viewPager);
            this.f27695g0 = jVar;
            c(jVar);
            j5.a adapter = viewPager.getAdapter();
            if (adapter != null) {
                H(adapter, z10);
            }
            if (this.f27701m0 == null) {
                this.f27701m0 = new b();
            }
            this.f27701m0.b(z10);
            viewPager.b(this.f27701m0);
            I(viewPager.getCurrentItem(), 0.0f, true);
        } else {
            this.f27697i0 = null;
            H(null, false);
        }
        this.f27702n0 = z11;
    }

    public final void M() {
        int size = this.f27704w.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f27704w.get(i10).u();
        }
    }

    public final void N(LinearLayout.LayoutParams layoutParams) {
        if (this.V == 1 && this.S == 0) {
            layoutParams.width = 0;
            layoutParams.weight = 1.0f;
            return;
        }
        layoutParams.width = -2;
        layoutParams.weight = 0.0f;
    }

    public void O(boolean z10) {
        for (int i10 = 0; i10 < this.f27706y.getChildCount(); i10++) {
            View childAt = this.f27706y.getChildAt(i10);
            childAt.setMinimumWidth(getTabMinWidth());
            N((LinearLayout.LayoutParams) childAt.getLayoutParams());
            if (z10) {
                childAt.requestLayout();
            }
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view) {
        j(view);
    }

    @Deprecated
    public void c(c cVar) {
        if (this.f27694f0.contains(cVar)) {
            return;
        }
        this.f27694f0.add(cVar);
    }

    public void d(d dVar) {
        c(dVar);
    }

    public void e(g gVar) {
        g(gVar, this.f27704w.isEmpty());
    }

    public void f(g gVar, int i10, boolean z10) {
        if (gVar.f27728h == this) {
            o(gVar, i10);
            i(gVar);
            if (z10) {
                gVar.m();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Tab belongs to a different TabLayout.");
    }

    public void g(g gVar, boolean z10) {
        f(gVar, this.f27704w.size(), z10);
    }

    public int getSelectedTabPosition() {
        g gVar = this.f27705x;
        if (gVar != null) {
            return gVar.g();
        }
        return -1;
    }

    public int getTabCount() {
        return this.f27704w.size();
    }

    public int getTabGravity() {
        return this.S;
    }

    public ColorStateList getTabIconTint() {
        return this.F;
    }

    public int getTabIndicatorAnimationMode() {
        return this.f27690b0;
    }

    public int getTabIndicatorGravity() {
        return this.U;
    }

    public int getTabMaxWidth() {
        return this.N;
    }

    public int getTabMode() {
        return this.V;
    }

    public ColorStateList getTabRippleColor() {
        return this.G;
    }

    public Drawable getTabSelectedIndicator() {
        return this.H;
    }

    public ColorStateList getTabTextColors() {
        return this.E;
    }

    public final void h(wj.b bVar) {
        g z10 = z();
        CharSequence charSequence = bVar.f59164w;
        if (charSequence != null) {
            z10.t(charSequence);
        }
        Drawable drawable = bVar.f59165x;
        if (drawable != null) {
            z10.q(drawable);
        }
        int i10 = bVar.f59166y;
        if (i10 != 0) {
            z10.o(i10);
        }
        if (!TextUtils.isEmpty(bVar.getContentDescription())) {
            z10.n(bVar.getContentDescription());
        }
        e(z10);
    }

    public final void i(g gVar) {
        i iVar = gVar.f27729i;
        iVar.setSelected(false);
        iVar.setActivated(false);
        this.f27706y.addView(iVar, gVar.g(), q());
    }

    public final void j(View view) {
        if (view instanceof wj.b) {
            h((wj.b) view);
            return;
        }
        throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
    }

    public final void k(int i10) {
        if (i10 == -1) {
            return;
        }
        if (getWindowToken() != null && c0.V(this) && !this.f27706y.c()) {
            int scrollX = getScrollX();
            int n10 = n(i10, 0.0f);
            if (scrollX != n10) {
                w();
                this.f27696h0.setIntValues(scrollX, n10);
                this.f27696h0.start();
            }
            this.f27706y.b(i10, this.T);
            return;
        }
        I(i10, 0.0f, true);
    }

    public final void l(int i10) {
        if (i10 == 0) {
            Log.w("TabLayout", "MODE_SCROLLABLE + GRAVITY_FILL is not supported, GRAVITY_START will be used instead");
        } else if (i10 == 1) {
            this.f27706y.setGravity(1);
            return;
        } else if (i10 != 2) {
            return;
        }
        this.f27706y.setGravity(8388611);
    }

    public final void m() {
        int i10 = this.V;
        c0.G0(this.f27706y, (i10 == 0 || i10 == 2) ? Math.max(0, this.R - this.f27707z) : 0, 0, 0, 0);
        int i11 = this.V;
        if (i11 == 0) {
            l(this.S);
        } else if (i11 == 1 || i11 == 2) {
            if (this.S == 2) {
                Log.w("TabLayout", "GRAVITY_START is not supported with the current tab mode, GRAVITY_CENTER will be used instead");
            }
            this.f27706y.setGravity(1);
        }
        O(true);
    }

    public final int n(int i10, float f10) {
        int i11 = this.V;
        if (i11 == 0 || i11 == 2) {
            View childAt = this.f27706y.getChildAt(i10);
            int i12 = i10 + 1;
            View childAt2 = i12 < this.f27706y.getChildCount() ? this.f27706y.getChildAt(i12) : null;
            int width = childAt != null ? childAt.getWidth() : 0;
            int width2 = childAt2 != null ? childAt2.getWidth() : 0;
            int left = (childAt.getLeft() + (width / 2)) - (getWidth() / 2);
            int i13 = (int) ((width + width2) * 0.5f * f10);
            return c0.E(this) == 0 ? left + i13 : left - i13;
        }
        return 0;
    }

    public final void o(g gVar, int i10) {
        gVar.r(i10);
        this.f27704w.add(i10, gVar);
        int size = this.f27704w.size();
        while (true) {
            i10++;
            if (i10 >= size) {
                return;
            }
            this.f27704w.get(i10).r(i10);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        tj.h.e(this);
        if (this.f27697i0 == null) {
            ViewParent parent = getParent();
            if (parent instanceof ViewPager) {
                L((ViewPager) parent, true, true);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f27702n0) {
            setupWithViewPager(null);
            this.f27702n0 = false;
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        for (int i10 = 0; i10 < this.f27706y.getChildCount(); i10++) {
            View childAt = this.f27706y.getChildAt(i10);
            if (childAt instanceof i) {
                ((i) childAt).j(canvas);
            }
        }
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        p3.c.M0(accessibilityNodeInfo).d0(c.b.a(1, getTabCount(), false, 1));
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0073, code lost:
        if (r0 != 2) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x007e, code lost:
        if (r7.getMeasuredWidth() != getMeasuredWidth()) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0080, code lost:
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x008a, code lost:
        if (r7.getMeasuredWidth() < getMeasuredWidth()) goto L25;
     */
    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onMeasure(int r7, int r8) {
        /*
            r6 = this;
            android.content.Context r0 = r6.getContext()
            int r1 = r6.getDefaultHeight()
            float r0 = nj.l.b(r0, r1)
            int r0 = java.lang.Math.round(r0)
            int r1 = android.view.View.MeasureSpec.getMode(r8)
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = 1073741824(0x40000000, float:2.0)
            r4 = 0
            r5 = 1
            if (r1 == r2) goto L2e
            if (r1 == 0) goto L1f
            goto L41
        L1f:
            int r8 = r6.getPaddingTop()
            int r0 = r0 + r8
            int r8 = r6.getPaddingBottom()
            int r0 = r0 + r8
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r3)
            goto L41
        L2e:
            int r1 = r6.getChildCount()
            if (r1 != r5) goto L41
            int r1 = android.view.View.MeasureSpec.getSize(r8)
            if (r1 < r0) goto L41
            android.view.View r1 = r6.getChildAt(r4)
            r1.setMinimumHeight(r0)
        L41:
            int r0 = android.view.View.MeasureSpec.getSize(r7)
            int r1 = android.view.View.MeasureSpec.getMode(r7)
            if (r1 == 0) goto L5f
            int r1 = r6.P
            if (r1 <= 0) goto L50
            goto L5d
        L50:
            float r0 = (float) r0
            android.content.Context r1 = r6.getContext()
            r2 = 56
            float r1 = nj.l.b(r1, r2)
            float r0 = r0 - r1
            int r1 = (int) r0
        L5d:
            r6.N = r1
        L5f:
            super.onMeasure(r7, r8)
            int r7 = r6.getChildCount()
            if (r7 != r5) goto Lad
            android.view.View r7 = r6.getChildAt(r4)
            int r0 = r6.V
            if (r0 == 0) goto L82
            if (r0 == r5) goto L76
            r1 = 2
            if (r0 == r1) goto L82
            goto L8d
        L76:
            int r0 = r7.getMeasuredWidth()
            int r1 = r6.getMeasuredWidth()
            if (r0 == r1) goto L8d
        L80:
            r4 = r5
            goto L8d
        L82:
            int r0 = r7.getMeasuredWidth()
            int r1 = r6.getMeasuredWidth()
            if (r0 >= r1) goto L8d
            goto L80
        L8d:
            if (r4 == 0) goto Lad
            int r0 = r6.getPaddingTop()
            int r1 = r6.getPaddingBottom()
            int r0 = r0 + r1
            android.view.ViewGroup$LayoutParams r1 = r7.getLayoutParams()
            int r1 = r1.height
            int r8 = android.widget.HorizontalScrollView.getChildMeasureSpec(r8, r0, r1)
            int r0 = r6.getMeasuredWidth()
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r3)
            r7.measure(r0, r8)
        Lad:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.onMeasure(int, int):void");
    }

    public final LinearLayout.LayoutParams q() {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
        N(layoutParams);
        return layoutParams;
    }

    public g r() {
        g acquire = f27688q0.acquire();
        return acquire == null ? new g() : acquire;
    }

    public final i s(g gVar) {
        n3.e<i> eVar = this.f27703o0;
        i acquire = eVar != null ? eVar.acquire() : null;
        if (acquire == null) {
            acquire = new i(getContext());
        }
        acquire.setTab(gVar);
        acquire.setFocusable(true);
        acquire.setMinimumWidth(getTabMinWidth());
        if (TextUtils.isEmpty(gVar.f27724d)) {
            acquire.setContentDescription(gVar.f27723c);
        } else {
            acquire.setContentDescription(gVar.f27724d);
        }
        return acquire;
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        tj.h.d(this, f10);
    }

    public void setInlineLabel(boolean z10) {
        if (this.W != z10) {
            this.W = z10;
            for (int i10 = 0; i10 < this.f27706y.getChildCount(); i10++) {
                View childAt = this.f27706y.getChildAt(i10);
                if (childAt instanceof i) {
                    ((i) childAt).v();
                }
            }
            m();
        }
    }

    public void setInlineLabelResource(int i10) {
        setInlineLabel(getResources().getBoolean(i10));
    }

    @Deprecated
    public void setOnTabSelectedListener(d dVar) {
        setOnTabSelectedListener((c) dVar);
    }

    public void setScrollAnimatorListener(Animator.AnimatorListener animatorListener) {
        w();
        this.f27696h0.addListener(animatorListener);
    }

    public void setSelectedTabIndicator(Drawable drawable) {
        if (this.H != drawable) {
            if (drawable == null) {
                drawable = new GradientDrawable();
            }
            this.H = drawable;
        }
    }

    public void setSelectedTabIndicatorColor(int i10) {
        this.I = i10;
    }

    public void setSelectedTabIndicatorGravity(int i10) {
        if (this.U != i10) {
            this.U = i10;
            c0.i0(this.f27706y);
        }
    }

    @Deprecated
    public void setSelectedTabIndicatorHeight(int i10) {
        this.f27706y.f(i10);
    }

    public void setTabGravity(int i10) {
        if (this.S != i10) {
            this.S = i10;
            m();
        }
    }

    public void setTabIconTint(ColorStateList colorStateList) {
        if (this.F != colorStateList) {
            this.F = colorStateList;
            M();
        }
    }

    public void setTabIconTintResource(int i10) {
        setTabIconTint(f.a.a(getContext(), i10));
    }

    public void setTabIndicatorAnimationMode(int i10) {
        this.f27690b0 = i10;
        if (i10 == 0) {
            this.f27692d0 = new com.google.android.material.tabs.a();
        } else if (i10 == 1) {
            this.f27692d0 = new wj.a();
        } else {
            throw new IllegalArgumentException(i10 + " is not a valid TabIndicatorAnimationMode");
        }
    }

    public void setTabIndicatorFullWidth(boolean z10) {
        this.f27689a0 = z10;
        c0.i0(this.f27706y);
    }

    public void setTabMode(int i10) {
        if (i10 != this.V) {
            this.V = i10;
            m();
        }
    }

    public void setTabRippleColor(ColorStateList colorStateList) {
        if (this.G != colorStateList) {
            this.G = colorStateList;
            for (int i10 = 0; i10 < this.f27706y.getChildCount(); i10++) {
                View childAt = this.f27706y.getChildAt(i10);
                if (childAt instanceof i) {
                    ((i) childAt).u(getContext());
                }
            }
        }
    }

    public void setTabRippleColorResource(int i10) {
        setTabRippleColor(f.a.a(getContext(), i10));
    }

    public void setTabTextColors(ColorStateList colorStateList) {
        if (this.E != colorStateList) {
            this.E = colorStateList;
            M();
        }
    }

    @Deprecated
    public void setTabsFromPagerAdapter(j5.a aVar) {
        H(aVar, false);
    }

    public void setUnboundedRipple(boolean z10) {
        if (this.f27691c0 != z10) {
            this.f27691c0 = z10;
            for (int i10 = 0; i10 < this.f27706y.getChildCount(); i10++) {
                View childAt = this.f27706y.getChildAt(i10);
                if (childAt instanceof i) {
                    ((i) childAt).u(getContext());
                }
            }
        }
    }

    public void setUnboundedRippleResource(int i10) {
        setUnboundedRipple(getResources().getBoolean(i10));
    }

    public void setupWithViewPager(ViewPager viewPager) {
        K(viewPager, true);
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return getTabScrollRange() > 0;
    }

    public final void t(g gVar) {
        for (int size = this.f27694f0.size() - 1; size >= 0; size--) {
            this.f27694f0.get(size).c(gVar);
        }
    }

    public final void u(g gVar) {
        for (int size = this.f27694f0.size() - 1; size >= 0; size--) {
            this.f27694f0.get(size).a(gVar);
        }
    }

    public final void v(g gVar) {
        for (int size = this.f27694f0.size() - 1; size >= 0; size--) {
            this.f27694f0.get(size).b(gVar);
        }
    }

    public final void w() {
        if (this.f27696h0 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f27696h0 = valueAnimator;
            valueAnimator.setInterpolator(xi.a.f60298b);
            this.f27696h0.setDuration(this.T);
            this.f27696h0.addUpdateListener(new a());
        }
    }

    public g x(int i10) {
        if (i10 < 0 || i10 >= getTabCount()) {
            return null;
        }
        return this.f27704w.get(i10);
    }

    public boolean y() {
        return this.f27689a0;
    }

    public g z() {
        g r10 = r();
        r10.f27728h = this;
        r10.f27729i = s(r10);
        if (r10.f27730j != -1) {
            r10.f27729i.setId(r10.f27730j);
        }
        return r10;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public TabLayout(android.content.Context r12, android.util.AttributeSet r13, int r14) {
        /*
            Method dump skipped, instructions count: 444
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view, int i10) {
        j(view);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    @Deprecated
    public void setOnTabSelectedListener(c cVar) {
        c cVar2 = this.f27693e0;
        if (cVar2 != null) {
            D(cVar2);
        }
        this.f27693e0 = cVar;
        if (cVar != null) {
            c(cVar);
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        j(view);
    }

    public void setSelectedTabIndicator(int i10) {
        if (i10 != 0) {
            setSelectedTabIndicator(f.a.b(getContext(), i10));
        } else {
            setSelectedTabIndicator((Drawable) null);
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        j(view);
    }
}
