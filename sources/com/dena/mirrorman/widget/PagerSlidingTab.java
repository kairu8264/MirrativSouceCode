package com.dena.mirrorman.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewpager.widget.ViewPager;
import com.dena.mirrorman.widget.PagerSlidingTab;
import jo.p;
import nd.b1;
import nd.h1;
import nd.y0;
import nd.z0;
import of.t;

/* loaded from: classes3.dex */
public final class PagerSlidingTab extends HorizontalScrollView {

    /* renamed from: h0  reason: collision with root package name */
    public static final a f26371h0 = new a(null);

    /* renamed from: i0  reason: collision with root package name */
    public static final int f26372i0 = 8;

    /* renamed from: j0  reason: collision with root package name */
    public static final int[] f26373j0 = {16842806, 16842965, 16842966, 16842968};
    public final e A;
    public c B;
    public d C;
    public ViewPager D;
    public int E;
    public int F;
    public float G;
    public final Paint H;
    public final Paint I;
    public int J;
    public int K;
    public int L;
    public int M;
    public int N;
    public int O;
    public int P;
    public int Q;
    public int R;
    public ColorStateList S;
    public int T;
    public int U;
    public boolean V;
    public boolean W;

    /* renamed from: a0  reason: collision with root package name */
    public boolean f26374a0;

    /* renamed from: b0  reason: collision with root package name */
    public boolean f26375b0;

    /* renamed from: c0  reason: collision with root package name */
    public Typeface f26376c0;

    /* renamed from: d0  reason: collision with root package name */
    public int f26377d0;

    /* renamed from: e0  reason: collision with root package name */
    public int f26378e0;

    /* renamed from: f0  reason: collision with root package name */
    public int f26379f0;

    /* renamed from: g0  reason: collision with root package name */
    public final ViewTreeObserver.OnGlobalLayoutListener f26380g0;

    /* renamed from: w  reason: collision with root package name */
    public ViewPager.j f26381w;

    /* renamed from: x  reason: collision with root package name */
    public LinearLayout f26382x;

    /* renamed from: y  reason: collision with root package name */
    public final LinearLayout.LayoutParams f26383y;

    /* renamed from: z  reason: collision with root package name */
    public final f f26384z;

    /* loaded from: classes3.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }
    }

    /* loaded from: classes3.dex */
    public interface b {
        View a(ViewGroup viewGroup, int i10);

        void b(View view);

        void c(View view);
    }

    /* loaded from: classes3.dex */
    public interface c {
        void a(int i10);
    }

    /* loaded from: classes3.dex */
    public interface d {
        void a(int i10);
    }

    /* loaded from: classes3.dex */
    public final class e implements ViewPager.j {
        public e() {
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public void a(int i10, float f10, int i11) {
            int i12;
            PagerSlidingTab.this.F = i10;
            PagerSlidingTab.this.G = f10;
            if (PagerSlidingTab.this.E > 0) {
                LinearLayout linearLayout = PagerSlidingTab.this.f26382x;
                if (linearLayout == null) {
                    p.v("mTabsContainer");
                    linearLayout = null;
                }
                i12 = (int) (linearLayout.getChildAt(i10).getWidth() * f10);
            } else {
                i12 = 0;
            }
            PagerSlidingTab.this.x(i10, i12);
            PagerSlidingTab.this.invalidate();
            if (PagerSlidingTab.this.getMDelegatePageListener() != null) {
                ViewPager.j mDelegatePageListener = PagerSlidingTab.this.getMDelegatePageListener();
                p.e(mDelegatePageListener);
                mDelegatePageListener.a(i10, f10, i11);
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public void b(int i10) {
            ViewPager viewPager;
            j5.a adapter;
            ViewPager viewPager2;
            if (i10 == 0) {
                PagerSlidingTab pagerSlidingTab = PagerSlidingTab.this;
                ViewPager viewPager3 = pagerSlidingTab.D;
                p.e(viewPager3);
                pagerSlidingTab.x(viewPager3.getCurrentItem(), 0);
            }
            LinearLayout linearLayout = PagerSlidingTab.this.f26382x;
            LinearLayout linearLayout2 = null;
            if (linearLayout == null) {
                p.v("mTabsContainer");
                linearLayout = null;
            }
            ViewPager viewPager4 = PagerSlidingTab.this.D;
            p.e(viewPager4);
            PagerSlidingTab.this.y(linearLayout.getChildAt(viewPager4.getCurrentItem()));
            p.e(PagerSlidingTab.this.D);
            if (viewPager.getCurrentItem() - 1 >= 0) {
                LinearLayout linearLayout3 = PagerSlidingTab.this.f26382x;
                if (linearLayout3 == null) {
                    p.v("mTabsContainer");
                    linearLayout3 = null;
                }
                p.e(PagerSlidingTab.this.D);
                PagerSlidingTab.this.C(linearLayout3.getChildAt(viewPager2.getCurrentItem() - 1));
            }
            ViewPager viewPager5 = PagerSlidingTab.this.D;
            p.e(viewPager5);
            int currentItem = viewPager5.getCurrentItem() + 1;
            ViewPager viewPager6 = PagerSlidingTab.this.D;
            p.e(viewPager6);
            p.e(viewPager6.getAdapter());
            if (currentItem <= adapter.c() - 1) {
                LinearLayout linearLayout4 = PagerSlidingTab.this.f26382x;
                if (linearLayout4 == null) {
                    p.v("mTabsContainer");
                } else {
                    linearLayout2 = linearLayout4;
                }
                ViewPager viewPager7 = PagerSlidingTab.this.D;
                p.e(viewPager7);
                PagerSlidingTab.this.C(linearLayout2.getChildAt(viewPager7.getCurrentItem() + 1));
            }
            if (PagerSlidingTab.this.getMDelegatePageListener() != null) {
                ViewPager.j mDelegatePageListener = PagerSlidingTab.this.getMDelegatePageListener();
                p.e(mDelegatePageListener);
                mDelegatePageListener.b(i10);
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public void c(int i10) {
            PagerSlidingTab.this.D(i10);
            if (PagerSlidingTab.this.getMDelegatePageListener() != null) {
                ViewPager.j mDelegatePageListener = PagerSlidingTab.this.getMDelegatePageListener();
                p.e(mDelegatePageListener);
                mDelegatePageListener.c(i10);
            }
        }
    }

    /* loaded from: classes3.dex */
    public final class f extends DataSetObserver {

        /* renamed from: a  reason: collision with root package name */
        public boolean f26386a;

        public f() {
        }

        public final boolean a() {
            return this.f26386a;
        }

        public final void b(boolean z10) {
            this.f26386a = z10;
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            PagerSlidingTab.this.w();
        }
    }

    /* loaded from: classes3.dex */
    public static final class g extends View.BaseSavedState {

        /* renamed from: w  reason: collision with root package name */
        public int f26389w;

        /* renamed from: x  reason: collision with root package name */
        public static final b f26388x = new b(null);
        public static final Parcelable.Creator<g> CREATOR = new a();

        /* loaded from: classes3.dex */
        public static final class a implements Parcelable.Creator<g> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public g createFromParcel(Parcel parcel) {
                p.h(parcel, "in");
                return new g(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public g[] newArray(int i10) {
                return new g[i10];
            }
        }

        /* loaded from: classes3.dex */
        public static final class b {
            public b() {
            }

            public /* synthetic */ b(jo.h hVar) {
                this();
            }
        }

        public /* synthetic */ g(Parcel parcel, jo.h hVar) {
            this(parcel);
        }

        public g(Parcelable parcelable) {
            super(parcelable);
        }

        public final int a() {
            return this.f26389w;
        }

        public final void b(int i10) {
            this.f26389w = i10;
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            p.h(parcel, "dest");
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f26389w);
        }

        public g(Parcel parcel) {
            super(parcel);
            this.f26389w = parcel.readInt();
        }
    }

    /* loaded from: classes3.dex */
    public static final class h implements ViewTreeObserver.OnGlobalLayoutListener {
        public h() {
        }

        public final void a() {
            PagerSlidingTab.this.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            LinearLayout linearLayout = PagerSlidingTab.this.f26382x;
            if (linearLayout == null) {
                p.v("mTabsContainer");
                linearLayout = null;
            }
            View childAt = linearLayout.getChildAt(0);
            a();
            if (PagerSlidingTab.this.f26374a0) {
                PagerSlidingTab pagerSlidingTab = PagerSlidingTab.this;
                pagerSlidingTab.U = (pagerSlidingTab.getWidth() / 2) - (childAt.getWidth() / 2);
                PagerSlidingTab pagerSlidingTab2 = PagerSlidingTab.this;
                pagerSlidingTab2.T = pagerSlidingTab2.U;
            }
            PagerSlidingTab pagerSlidingTab3 = PagerSlidingTab.this;
            pagerSlidingTab3.setPadding(pagerSlidingTab3.T, PagerSlidingTab.this.getPaddingTop(), PagerSlidingTab.this.U, PagerSlidingTab.this.getPaddingBottom());
            if (PagerSlidingTab.this.f26378e0 == 0) {
                PagerSlidingTab pagerSlidingTab4 = PagerSlidingTab.this;
                pagerSlidingTab4.f26378e0 = (pagerSlidingTab4.getWidth() / 2) - PagerSlidingTab.this.T;
            }
            PagerSlidingTab pagerSlidingTab5 = PagerSlidingTab.this;
            ViewPager viewPager = pagerSlidingTab5.D;
            p.e(viewPager);
            pagerSlidingTab5.F = viewPager.getCurrentItem();
            PagerSlidingTab.this.G = 0.0f;
            PagerSlidingTab pagerSlidingTab6 = PagerSlidingTab.this;
            pagerSlidingTab6.x(pagerSlidingTab6.F, 0);
            PagerSlidingTab pagerSlidingTab7 = PagerSlidingTab.this;
            pagerSlidingTab7.D(pagerSlidingTab7.F);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PagerSlidingTab(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        p.h(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PagerSlidingTab(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        p.h(context, "context");
        this.f26384z = new f();
        this.A = new e();
        this.K = 2;
        this.Q = 12;
        this.R = 14;
        this.f26375b0 = true;
        this.f26377d0 = 1;
        this.f26380g0 = new h();
        setFillViewport(true);
        setWillNotDraw(false);
        LinearLayout linearLayout = new LinearLayout(context);
        this.f26382x = linearLayout;
        linearLayout.setOrientation(0);
        LinearLayout linearLayout2 = this.f26382x;
        if (linearLayout2 == null) {
            p.v("mTabsContainer");
            linearLayout2 = null;
        }
        addView(linearLayout2);
        Paint paint = new Paint();
        this.H = paint;
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.f26378e0 = (int) TypedValue.applyDimension(1, this.f26378e0, displayMetrics);
        this.K = (int) TypedValue.applyDimension(1, this.K, displayMetrics);
        this.L = (int) TypedValue.applyDimension(1, this.L, displayMetrics);
        this.O = (int) TypedValue.applyDimension(1, this.O, displayMetrics);
        this.Q = (int) TypedValue.applyDimension(1, this.Q, displayMetrics);
        this.N = (int) TypedValue.applyDimension(1, this.N, displayMetrics);
        this.R = (int) TypedValue.applyDimension(2, this.R, displayMetrics);
        Paint paint2 = new Paint();
        this.I = paint2;
        paint2.setAntiAlias(true);
        paint2.setStrokeWidth(this.N);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f26373j0);
        p.g(obtainStyledAttributes, "context.obtainStyledAttr…tes(attrs, ANDROID_ATTRS)");
        int color = obtainStyledAttributes.getColor(0, getResources().getColor(17170444));
        this.M = color;
        this.P = color;
        this.J = color;
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.T = dimensionPixelSize > 0 ? dimensionPixelSize : obtainStyledAttributes.getDimensionPixelSize(2, 0);
        this.U = dimensionPixelSize <= 0 ? obtainStyledAttributes.getDimensionPixelSize(3, 0) : dimensionPixelSize;
        obtainStyledAttributes.recycle();
        this.f26377d0 = 0;
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, h1.G2);
        p.g(obtainStyledAttributes2, "context.obtainStyledAttr…ble.PagerSlidingTabStrip)");
        this.J = obtainStyledAttributes2.getColor(h1.K2, this.J);
        this.K = obtainStyledAttributes2.getDimensionPixelSize(h1.L2, this.K);
        this.M = obtainStyledAttributes2.getColor(h1.W2, this.M);
        this.L = obtainStyledAttributes2.getDimensionPixelSize(h1.X2, this.L);
        this.P = obtainStyledAttributes2.getColor(h1.H2, this.P);
        this.N = obtainStyledAttributes2.getDimensionPixelSize(h1.J2, this.N);
        this.O = obtainStyledAttributes2.getDimensionPixelSize(h1.I2, this.O);
        this.V = obtainStyledAttributes2.getBoolean(h1.O2, this.V);
        this.f26378e0 = obtainStyledAttributes2.getDimensionPixelSize(h1.N2, this.f26378e0);
        this.f26374a0 = obtainStyledAttributes2.getBoolean(h1.M2, this.f26374a0);
        this.Q = obtainStyledAttributes2.getDimensionPixelSize(h1.P2, this.Q);
        this.R = obtainStyledAttributes2.getDimensionPixelSize(h1.U2, this.R);
        int i11 = h1.S2;
        this.S = obtainStyledAttributes2.hasValue(i11) ? obtainStyledAttributes2.getColorStateList(i11) : null;
        this.f26377d0 = obtainStyledAttributes2.getInt(h1.V2, this.f26377d0);
        this.f26375b0 = obtainStyledAttributes2.getBoolean(h1.Q2, this.f26375b0);
        int i12 = obtainStyledAttributes2.getInt(h1.R2, 150);
        String string = obtainStyledAttributes2.getString(h1.T2);
        obtainStyledAttributes2.recycle();
        if (this.S == null) {
            this.S = v(color, color, Color.argb(i12, Color.red(color), Color.green(color), Color.blue(color)));
        }
        this.f26376c0 = Typeface.create(string == null ? "sans-serif-medium" : string, this.f26377d0);
        B();
        this.f26383y = this.V ? new LinearLayout.LayoutParams(0, -1, 1.0f) : new LinearLayout.LayoutParams(-2, -1);
    }

    private final n3.d<Float, Float> getIndicatorCoordinates() {
        LinearLayout linearLayout = this.f26382x;
        LinearLayout linearLayout2 = null;
        if (linearLayout == null) {
            p.v("mTabsContainer");
            linearLayout = null;
        }
        View childAt = linearLayout.getChildAt(this.F);
        float left = childAt.getLeft();
        float right = childAt.getRight();
        if (this.G > 0.0f && this.F < this.E - 1) {
            LinearLayout linearLayout3 = this.f26382x;
            if (linearLayout3 == null) {
                p.v("mTabsContainer");
            } else {
                linearLayout2 = linearLayout3;
            }
            View childAt2 = linearLayout2.getChildAt(this.F + 1);
            float f10 = this.G;
            left = (childAt2.getLeft() * f10) + ((1.0f - f10) * left);
            right = (childAt2.getRight() * f10) + ((1.0f - f10) * right);
        }
        return new n3.d<>(Float.valueOf(left), Float.valueOf(right));
    }

    public static final void t(PagerSlidingTab pagerSlidingTab, int i10, View view) {
        p.h(pagerSlidingTab, "this$0");
        ViewPager viewPager = pagerSlidingTab.D;
        p.e(viewPager);
        if (viewPager.getCurrentItem() != i10) {
            LinearLayout linearLayout = pagerSlidingTab.f26382x;
            if (linearLayout == null) {
                p.v("mTabsContainer");
                linearLayout = null;
            }
            ViewPager viewPager2 = pagerSlidingTab.D;
            p.e(viewPager2);
            pagerSlidingTab.C(linearLayout.getChildAt(viewPager2.getCurrentItem()));
            ViewPager viewPager3 = pagerSlidingTab.D;
            p.e(viewPager3);
            viewPager3.setCurrentItem(i10);
            d dVar = pagerSlidingTab.C;
            if (dVar != null) {
                p.e(dVar);
                dVar.a(i10);
                return;
            }
            return;
        }
        c cVar = pagerSlidingTab.B;
        if (cVar != null) {
            p.e(cVar);
            cVar.a(i10);
        }
    }

    public final void A(int i10, int i11) {
        LinearLayout linearLayout = this.f26382x;
        if (linearLayout == null) {
            p.v("mTabsContainer");
            linearLayout = null;
        }
        int childCount = linearLayout.getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            LinearLayout linearLayout2 = this.f26382x;
            if (linearLayout2 == null) {
                p.v("mTabsContainer");
                linearLayout2 = null;
            }
            TextView textView = (TextView) linearLayout2.getChildAt(i12).findViewById(z0.tab_title);
            ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
            Context context = getContext();
            p.g(context, "context");
            layoutParams.width = t.b(context, i10);
            ViewGroup.LayoutParams layoutParams2 = textView.getLayoutParams();
            Context context2 = getContext();
            p.g(context2, "context");
            layoutParams2.height = t.b(context2, i11);
            textView.setGravity(17);
        }
    }

    public final void B() {
        int i10 = this.K;
        int i11 = this.L;
        if (i10 < i11) {
            i10 = i11;
        }
        setPadding(getPaddingLeft(), getPaddingTop(), getPaddingRight(), getPaddingBottom() + i10);
    }

    public final void C(View view) {
        if (view != null) {
            TextView textView = (TextView) view.findViewById(z0.tab_title);
            if (textView != null) {
                textView.setSelected(false);
            }
            if (this.W) {
                ViewPager viewPager = this.D;
                p.e(viewPager);
                b bVar = (b) viewPager.getAdapter();
                p.e(bVar);
                bVar.b(view);
            }
        }
    }

    public final void D(int i10) {
        int i11 = this.E;
        int i12 = 0;
        while (i12 < i11) {
            LinearLayout linearLayout = this.f26382x;
            if (linearLayout == null) {
                p.v("mTabsContainer");
                linearLayout = null;
            }
            View childAt = linearLayout.getChildAt(i12);
            if (i12 == i10) {
                y(childAt);
            } else {
                C(childAt);
            }
            i12++;
        }
    }

    public final void E() {
        int i10 = this.E;
        for (int i11 = 0; i11 < i10; i11++) {
            LinearLayout linearLayout = this.f26382x;
            if (linearLayout == null) {
                p.v("mTabsContainer");
                linearLayout = null;
            }
            View childAt = linearLayout.getChildAt(i11);
            childAt.setBackgroundResource(y0.tab_background);
            childAt.setPadding(this.Q, childAt.getPaddingTop(), this.Q, childAt.getPaddingBottom());
            TextView textView = (TextView) childAt.findViewById(z0.tab_title);
            if (textView != null) {
                textView.setTextColor(this.S);
                textView.setTypeface(this.f26376c0, this.f26377d0);
                textView.setTextSize(0, this.R);
                if (this.f26375b0) {
                    textView.setAllCaps(true);
                }
            }
        }
    }

    public final ViewPager.j getMDelegatePageListener() {
        return this.f26381w;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.D == null || this.f26384z.a()) {
            return;
        }
        ViewPager viewPager = this.D;
        p.e(viewPager);
        j5.a adapter = viewPager.getAdapter();
        p.e(adapter);
        adapter.j(this.f26384z);
        this.f26384z.b(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.D == null || !this.f26384z.a()) {
            return;
        }
        ViewPager viewPager = this.D;
        p.e(viewPager);
        j5.a adapter = viewPager.getAdapter();
        p.e(adapter);
        adapter.p(this.f26384z);
        this.f26384z.b(false);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        p.h(canvas, "canvas");
        super.onDraw(canvas);
        if (isInEditMode() || this.E == 0) {
            return;
        }
        int height = getHeight();
        int i10 = this.N;
        LinearLayout linearLayout = null;
        if (i10 > 0) {
            this.I.setStrokeWidth(i10);
            this.I.setColor(this.P);
            int i11 = this.E - 1;
            for (int i12 = 0; i12 < i11; i12++) {
                LinearLayout linearLayout2 = this.f26382x;
                if (linearLayout2 == null) {
                    p.v("mTabsContainer");
                    linearLayout2 = null;
                }
                View childAt = linearLayout2.getChildAt(i12);
                canvas.drawLine(childAt.getRight(), this.O, childAt.getRight(), height - this.O, this.I);
            }
        }
        if (this.L > 0) {
            this.H.setColor(this.M);
            float f10 = this.T;
            float f11 = height - this.L;
            LinearLayout linearLayout3 = this.f26382x;
            if (linearLayout3 == null) {
                p.v("mTabsContainer");
            } else {
                linearLayout = linearLayout3;
            }
            canvas.drawRect(f10, f11, linearLayout.getWidth() + this.U, height, this.H);
        }
        if (this.K > 0) {
            this.H.setColor(this.J);
            n3.d<Float, Float> indicatorCoordinates = getIndicatorCoordinates();
            Float f12 = indicatorCoordinates.f41559a;
            p.e(f12);
            Float f13 = indicatorCoordinates.f41560b;
            p.e(f13);
            canvas.drawRect(f12.floatValue() + this.T, height - this.K, f13.floatValue() + this.T, height, this.H);
        }
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int width;
        boolean z11 = this.f26374a0;
        LinearLayout linearLayout = null;
        if (z11 || this.T > 0 || this.U > 0) {
            if (z11) {
                width = getWidth();
            } else {
                width = (getWidth() - this.T) - this.U;
            }
            LinearLayout linearLayout2 = this.f26382x;
            if (linearLayout2 == null) {
                p.v("mTabsContainer");
                linearLayout2 = null;
            }
            linearLayout2.setMinimumWidth(width);
            setClipToPadding(false);
        }
        LinearLayout linearLayout3 = this.f26382x;
        if (linearLayout3 == null) {
            p.v("mTabsContainer");
            linearLayout3 = null;
        }
        if (linearLayout3.getChildCount() > 0) {
            LinearLayout linearLayout4 = this.f26382x;
            if (linearLayout4 == null) {
                p.v("mTabsContainer");
            } else {
                linearLayout = linearLayout4;
            }
            linearLayout.getChildAt(0).getViewTreeObserver().addOnGlobalLayoutListener(this.f26380g0);
        }
        super.onLayout(z10, i10, i11, i12, i13);
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        p.h(parcelable, "state");
        g gVar = (g) parcelable;
        super.onRestoreInstanceState(gVar.getSuperState());
        int a10 = gVar.a();
        this.F = a10;
        if (a10 != 0) {
            LinearLayout linearLayout = this.f26382x;
            LinearLayout linearLayout2 = null;
            if (linearLayout == null) {
                p.v("mTabsContainer");
                linearLayout = null;
            }
            if (linearLayout.getChildCount() > 0) {
                LinearLayout linearLayout3 = this.f26382x;
                if (linearLayout3 == null) {
                    p.v("mTabsContainer");
                    linearLayout3 = null;
                }
                C(linearLayout3.getChildAt(0));
                LinearLayout linearLayout4 = this.f26382x;
                if (linearLayout4 == null) {
                    p.v("mTabsContainer");
                } else {
                    linearLayout2 = linearLayout4;
                }
                y(linearLayout2.getChildAt(this.F));
            }
        }
        requestLayout();
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public Parcelable onSaveInstanceState() {
        g gVar = new g(super.onSaveInstanceState());
        gVar.b(this.F);
        return gVar;
    }

    public final void s(final int i10, CharSequence charSequence, View view) {
        TextView textView = (TextView) view.findViewById(z0.tab_title);
        if (textView != null && charSequence != null) {
            textView.setText(charSequence);
        }
        view.setFocusable(true);
        view.setOnClickListener(new View.OnClickListener() { // from class: sf.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                PagerSlidingTab.t(PagerSlidingTab.this, i10, view2);
            }
        });
        ImageView imageView = (ImageView) view.findViewById(z0.newmark);
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        LinearLayout linearLayout = this.f26382x;
        if (linearLayout == null) {
            p.v("mTabsContainer");
            linearLayout = null;
        }
        linearLayout.addView(view, i10, this.f26383y);
    }

    public final void setAllCaps(boolean z10) {
        this.f26375b0 = z10;
    }

    public final void setIndicatorColorResource(int i10) {
        this.J = getResources().getColor(i10);
        invalidate();
    }

    public final void setIndicatorHeight(int i10) {
        this.K = i10;
        invalidate();
    }

    public final void setMDelegatePageListener(ViewPager.j jVar) {
        this.f26381w = jVar;
    }

    public final void setOnPageChangeListener(ViewPager.j jVar) {
        this.f26381w = jVar;
    }

    public final void setOnTabSelectedListener(d dVar) {
        p.h(dVar, "tabSelectedListener");
        this.C = dVar;
    }

    public final void setTabBackground(int i10) {
        LinearLayout linearLayout = this.f26382x;
        if (linearLayout == null) {
            p.v("mTabsContainer");
            linearLayout = null;
        }
        int childCount = linearLayout.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            LinearLayout linearLayout2 = this.f26382x;
            if (linearLayout2 == null) {
                p.v("mTabsContainer");
                linearLayout2 = null;
            }
            ((TextView) linearLayout2.getChildAt(i11).findViewById(z0.tab_title)).setBackground(getResources().getDrawable(i10, null));
        }
    }

    public final void setTabPaddingLeftRight(int i10) {
        this.Q = i10;
        E();
    }

    public final void setTextColor(int i10) {
        setTextColor(u(i10));
    }

    public final void setTextSize(int i10) {
        this.R = i10;
        E();
    }

    public final void setViewPager(ViewPager viewPager) {
        p.h(viewPager, "pager");
        this.D = viewPager;
        if (viewPager.getAdapter() != null) {
            this.W = viewPager.getAdapter() instanceof b;
            viewPager.c(this.A);
            j5.a adapter = viewPager.getAdapter();
            p.e(adapter);
            adapter.j(this.f26384z);
            this.f26384z.b(true);
            w();
            return;
        }
        throw new IllegalStateException("ViewPager does not have adapter instance.".toString());
    }

    public final ColorStateList u(int i10) {
        return new ColorStateList(new int[][]{new int[0]}, new int[]{i10});
    }

    public final ColorStateList v(int i10, int i11, int i12) {
        return new ColorStateList(new int[][]{new int[]{16842919}, new int[]{16842913}, new int[0]}, new int[]{i10, i11, i12});
    }

    public final void w() {
        View inflate;
        LinearLayout linearLayout = this.f26382x;
        if (linearLayout == null) {
            p.v("mTabsContainer");
            linearLayout = null;
        }
        linearLayout.removeAllViews();
        ViewPager viewPager = this.D;
        p.e(viewPager);
        j5.a adapter = viewPager.getAdapter();
        p.e(adapter);
        int c10 = adapter.c();
        this.E = c10;
        for (int i10 = 0; i10 < c10; i10++) {
            if (this.W) {
                ViewPager viewPager2 = this.D;
                p.e(viewPager2);
                b bVar = (b) viewPager2.getAdapter();
                p.e(bVar);
                inflate = bVar.a(this, i10);
            } else {
                inflate = LayoutInflater.from(getContext()).inflate(b1.tab, (ViewGroup) this, false);
                p.g(inflate, "{\n                Layout…his, false)\n            }");
            }
            ViewPager viewPager3 = this.D;
            p.e(viewPager3);
            j5.a adapter2 = viewPager3.getAdapter();
            p.e(adapter2);
            s(i10, adapter2.e(i10), inflate);
        }
        E();
    }

    public final void x(int i10, int i11) {
        if (this.E == 0) {
            return;
        }
        LinearLayout linearLayout = this.f26382x;
        if (linearLayout == null) {
            p.v("mTabsContainer");
            linearLayout = null;
        }
        int left = linearLayout.getChildAt(i10).getLeft() + i11;
        if (i10 > 0 || i11 > 0) {
            int i12 = left - this.f26378e0;
            n3.d<Float, Float> indicatorCoordinates = getIndicatorCoordinates();
            Float f10 = indicatorCoordinates.f41560b;
            p.e(f10);
            float floatValue = f10.floatValue();
            Float f11 = indicatorCoordinates.f41559a;
            p.e(f11);
            left = i12 + ((int) ((floatValue - f11.floatValue()) / 2));
        }
        if (left != this.f26379f0) {
            this.f26379f0 = left;
            scrollTo(left, 0);
        }
    }

    public final void y(View view) {
        if (view != null) {
            TextView textView = (TextView) view.findViewById(z0.tab_title);
            if (textView != null) {
                textView.setSelected(true);
            }
            if (this.W) {
                ViewPager viewPager = this.D;
                p.e(viewPager);
                b bVar = (b) viewPager.getAdapter();
                p.e(bVar);
                bVar.c(view);
            }
        }
    }

    public final void z(int i10, int i11, int i12, int i13) {
        LinearLayout linearLayout = this.f26382x;
        if (linearLayout == null) {
            p.v("mTabsContainer");
            linearLayout = null;
        }
        Context context = getContext();
        p.g(context, "context");
        int b10 = t.b(context, i10);
        Context context2 = getContext();
        p.g(context2, "context");
        int b11 = t.b(context2, i11);
        Context context3 = getContext();
        p.g(context3, "context");
        int b12 = t.b(context3, i12);
        Context context4 = getContext();
        p.g(context4, "context");
        linearLayout.setPadding(b10, b11, b12, t.b(context4, i13));
    }

    public final void setTextColor(ColorStateList colorStateList) {
        this.S = colorStateList;
        E();
    }

    public /* synthetic */ PagerSlidingTab(Context context, AttributeSet attributeSet, int i10, int i11, jo.h hVar) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }
}
