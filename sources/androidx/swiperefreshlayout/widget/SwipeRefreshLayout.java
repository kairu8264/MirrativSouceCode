package androidx.swiperefreshlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Transformation;
import android.widget.AbsListView;
import android.widget.ListView;
import o3.c0;
import o3.p;
import o3.q;
import o3.r;
import o3.s;
import o3.t;
import o3.u;

/* loaded from: classes.dex */
public class SwipeRefreshLayout extends ViewGroup implements s, r, p, t {

    /* renamed from: p0  reason: collision with root package name */
    public static final String f16414p0 = SwipeRefreshLayout.class.getSimpleName();

    /* renamed from: q0  reason: collision with root package name */
    public static final int[] f16415q0 = {16842766};
    public float A;
    public float B;
    public final u C;
    public final q D;
    public final int[] E;
    public final int[] F;
    public final int[] G;
    public boolean H;
    public int I;
    public int J;
    public float K;
    public float L;
    public boolean M;
    public int N;
    public boolean O;
    public boolean P;
    public final DecelerateInterpolator Q;
    public d5.a R;
    public int S;
    public int T;
    public float U;
    public int V;
    public int W;

    /* renamed from: a0  reason: collision with root package name */
    public int f16416a0;

    /* renamed from: b0  reason: collision with root package name */
    public d5.b f16417b0;

    /* renamed from: c0  reason: collision with root package name */
    public Animation f16418c0;

    /* renamed from: d0  reason: collision with root package name */
    public Animation f16419d0;

    /* renamed from: e0  reason: collision with root package name */
    public Animation f16420e0;

    /* renamed from: f0  reason: collision with root package name */
    public Animation f16421f0;

    /* renamed from: g0  reason: collision with root package name */
    public Animation f16422g0;

    /* renamed from: h0  reason: collision with root package name */
    public boolean f16423h0;

    /* renamed from: i0  reason: collision with root package name */
    public int f16424i0;

    /* renamed from: j0  reason: collision with root package name */
    public boolean f16425j0;

    /* renamed from: k0  reason: collision with root package name */
    public i f16426k0;

    /* renamed from: l0  reason: collision with root package name */
    public boolean f16427l0;

    /* renamed from: m0  reason: collision with root package name */
    public Animation.AnimationListener f16428m0;

    /* renamed from: n0  reason: collision with root package name */
    public final Animation f16429n0;

    /* renamed from: o0  reason: collision with root package name */
    public final Animation f16430o0;

    /* renamed from: w  reason: collision with root package name */
    public View f16431w;

    /* renamed from: x  reason: collision with root package name */
    public j f16432x;

    /* renamed from: y  reason: collision with root package name */
    public boolean f16433y;

    /* renamed from: z  reason: collision with root package name */
    public int f16434z;

    /* loaded from: classes.dex */
    public class a implements Animation.AnimationListener {
        public a() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            j jVar;
            SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
            if (swipeRefreshLayout.f16433y) {
                swipeRefreshLayout.f16417b0.setAlpha(255);
                SwipeRefreshLayout.this.f16417b0.start();
                SwipeRefreshLayout swipeRefreshLayout2 = SwipeRefreshLayout.this;
                if (swipeRefreshLayout2.f16423h0 && (jVar = swipeRefreshLayout2.f16432x) != null) {
                    jVar.a();
                }
                SwipeRefreshLayout swipeRefreshLayout3 = SwipeRefreshLayout.this;
                swipeRefreshLayout3.J = swipeRefreshLayout3.R.getTop();
                return;
            }
            swipeRefreshLayout.l();
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    /* loaded from: classes.dex */
    public class b extends Animation {
        public b() {
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f10, Transformation transformation) {
            SwipeRefreshLayout.this.setAnimationProgress(f10);
        }
    }

    /* loaded from: classes.dex */
    public class c extends Animation {
        public c() {
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f10, Transformation transformation) {
            SwipeRefreshLayout.this.setAnimationProgress(1.0f - f10);
        }
    }

    /* loaded from: classes.dex */
    public class d extends Animation {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ int f16438w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ int f16439x;

        public d(int i10, int i11) {
            this.f16438w = i10;
            this.f16439x = i11;
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f10, Transformation transformation) {
            d5.b bVar = SwipeRefreshLayout.this.f16417b0;
            int i10 = this.f16438w;
            bVar.setAlpha((int) (i10 + ((this.f16439x - i10) * f10)));
        }
    }

    /* loaded from: classes.dex */
    public class e implements Animation.AnimationListener {
        public e() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
            if (swipeRefreshLayout.O) {
                return;
            }
            swipeRefreshLayout.r(null);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    /* loaded from: classes.dex */
    public class f extends Animation {
        public f() {
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f10, Transformation transformation) {
            int i10;
            SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
            if (!swipeRefreshLayout.f16425j0) {
                i10 = swipeRefreshLayout.W - Math.abs(swipeRefreshLayout.V);
            } else {
                i10 = swipeRefreshLayout.W;
            }
            SwipeRefreshLayout swipeRefreshLayout2 = SwipeRefreshLayout.this;
            int i11 = swipeRefreshLayout2.T;
            SwipeRefreshLayout.this.setTargetOffsetTopAndBottom((i11 + ((int) ((i10 - i11) * f10))) - swipeRefreshLayout2.R.getTop());
            SwipeRefreshLayout.this.f16417b0.e(1.0f - f10);
        }
    }

    /* loaded from: classes.dex */
    public class g extends Animation {
        public g() {
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f10, Transformation transformation) {
            SwipeRefreshLayout.this.j(f10);
        }
    }

    /* loaded from: classes.dex */
    public class h extends Animation {
        public h() {
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f10, Transformation transformation) {
            SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
            float f11 = swipeRefreshLayout.U;
            swipeRefreshLayout.setAnimationProgress(f11 + ((-f11) * f10));
            SwipeRefreshLayout.this.j(f10);
        }
    }

    /* loaded from: classes.dex */
    public interface i {
        boolean a(SwipeRefreshLayout swipeRefreshLayout, View view);
    }

    /* loaded from: classes.dex */
    public interface j {
        void a();
    }

    public SwipeRefreshLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f16433y = false;
        this.A = -1.0f;
        this.E = new int[2];
        this.F = new int[2];
        this.G = new int[2];
        this.N = -1;
        this.S = -1;
        this.f16428m0 = new a();
        this.f16429n0 = new f();
        this.f16430o0 = new g();
        this.f16434z = ViewConfiguration.get(context).getScaledTouchSlop();
        this.I = getResources().getInteger(17694721);
        setWillNotDraw(false);
        this.Q = new DecelerateInterpolator(2.0f);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.f16424i0 = (int) (displayMetrics.density * 40.0f);
        d();
        setChildrenDrawingOrderEnabled(true);
        int i10 = (int) (displayMetrics.density * 64.0f);
        this.W = i10;
        this.A = i10;
        this.C = new u(this);
        this.D = new q(this);
        setNestedScrollingEnabled(true);
        int i11 = -this.f16424i0;
        this.J = i11;
        this.V = i11;
        j(1.0f);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f16415q0);
        setEnabled(obtainStyledAttributes.getBoolean(0, true));
        obtainStyledAttributes.recycle();
    }

    private void setColorViewAlpha(int i10) {
        this.R.getBackground().setAlpha(i10);
        this.f16417b0.setAlpha(i10);
    }

    public final void a(int i10, Animation.AnimationListener animationListener) {
        this.T = i10;
        this.f16429n0.reset();
        this.f16429n0.setDuration(200L);
        this.f16429n0.setInterpolator(this.Q);
        if (animationListener != null) {
            this.R.b(animationListener);
        }
        this.R.clearAnimation();
        this.R.startAnimation(this.f16429n0);
    }

    public final void b(int i10, Animation.AnimationListener animationListener) {
        if (this.O) {
            s(i10, animationListener);
            return;
        }
        this.T = i10;
        this.f16430o0.reset();
        this.f16430o0.setDuration(200L);
        this.f16430o0.setInterpolator(this.Q);
        if (animationListener != null) {
            this.R.b(animationListener);
        }
        this.R.clearAnimation();
        this.R.startAnimation(this.f16430o0);
    }

    public boolean c() {
        i iVar = this.f16426k0;
        if (iVar != null) {
            return iVar.a(this, this.f16431w);
        }
        View view = this.f16431w;
        if (view instanceof ListView) {
            return s3.h.a((ListView) view, -1);
        }
        return view.canScrollVertically(-1);
    }

    public final void d() {
        this.R = new d5.a(getContext());
        d5.b bVar = new d5.b(getContext());
        this.f16417b0 = bVar;
        bVar.l(1);
        this.R.setImageDrawable(this.f16417b0);
        this.R.setVisibility(8);
        addView(this.R);
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f10, float f11, boolean z10) {
        return this.D.a(f10, f11, z10);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f10, float f11) {
        return this.D.b(f10, f11);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i10, int i11, int[] iArr, int[] iArr2) {
        return this.D.c(i10, i11, iArr, iArr2);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i10, int i11, int i12, int i13, int[] iArr) {
        return this.D.f(i10, i11, i12, i13, iArr);
    }

    public void e(int i10, int i11, int i12, int i13, int[] iArr, int i14, int[] iArr2) {
        if (i14 == 0) {
            this.D.e(i10, i11, i12, i13, iArr, i14, iArr2);
        }
    }

    public final void f() {
        if (this.f16431w == null) {
            for (int i10 = 0; i10 < getChildCount(); i10++) {
                View childAt = getChildAt(i10);
                if (!childAt.equals(this.R)) {
                    this.f16431w = childAt;
                    return;
                }
            }
        }
    }

    public final void g(float f10) {
        if (f10 > this.A) {
            m(true, true);
            return;
        }
        this.f16433y = false;
        this.f16417b0.j(0.0f, 0.0f);
        b(this.J, this.O ? null : new e());
        this.f16417b0.d(false);
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i10, int i11) {
        int i12 = this.S;
        return i12 < 0 ? i11 : i11 == i10 + (-1) ? i12 : i11 >= i12 ? i11 + 1 : i11;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.C.a();
    }

    public int getProgressCircleDiameter() {
        return this.f16424i0;
    }

    public int getProgressViewEndOffset() {
        return this.W;
    }

    public int getProgressViewStartOffset() {
        return this.V;
    }

    public final boolean h(Animation animation) {
        return (animation == null || !animation.hasStarted() || animation.hasEnded()) ? false : true;
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return this.D.j();
    }

    public final void i(float f10) {
        this.f16417b0.d(true);
        float min = Math.min(1.0f, Math.abs(f10 / this.A));
        float max = (((float) Math.max(min - 0.4d, 0.0d)) * 5.0f) / 3.0f;
        float abs = Math.abs(f10) - this.A;
        int i10 = this.f16416a0;
        if (i10 <= 0) {
            if (this.f16425j0) {
                i10 = this.W - this.V;
            } else {
                i10 = this.W;
            }
        }
        float f11 = i10;
        double max2 = Math.max(0.0f, Math.min(abs, f11 * 2.0f) / f11) / 4.0f;
        float pow = ((float) (max2 - Math.pow(max2, 2.0d))) * 2.0f;
        int i11 = this.V + ((int) ((f11 * min) + (f11 * pow * 2.0f)));
        if (this.R.getVisibility() != 0) {
            this.R.setVisibility(0);
        }
        if (!this.O) {
            this.R.setScaleX(1.0f);
            this.R.setScaleY(1.0f);
        }
        if (this.O) {
            setAnimationProgress(Math.min(1.0f, f10 / this.A));
        }
        if (f10 < this.A) {
            if (this.f16417b0.getAlpha() > 76 && !h(this.f16420e0)) {
                q();
            }
        } else if (this.f16417b0.getAlpha() < 255 && !h(this.f16421f0)) {
            p();
        }
        this.f16417b0.j(0.0f, Math.min(0.8f, max * 0.8f));
        this.f16417b0.e(Math.min(1.0f, max));
        this.f16417b0.g((((max * 0.4f) - 0.25f) + (pow * 2.0f)) * 0.5f);
        setTargetOffsetTopAndBottom(i11 - this.J);
    }

    @Override // android.view.View, o3.p
    public boolean isNestedScrollingEnabled() {
        return this.D.l();
    }

    public void j(float f10) {
        int i10 = this.T;
        setTargetOffsetTopAndBottom((i10 + ((int) ((this.V - i10) * f10))) - this.R.getTop());
    }

    public final void k(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.N) {
            this.N = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
        }
    }

    public void l() {
        this.R.clearAnimation();
        this.f16417b0.stop();
        this.R.setVisibility(8);
        setColorViewAlpha(255);
        if (this.O) {
            setAnimationProgress(0.0f);
        } else {
            setTargetOffsetTopAndBottom(this.V - this.J);
        }
        this.J = this.R.getTop();
    }

    public final void m(boolean z10, boolean z11) {
        if (this.f16433y != z10) {
            this.f16423h0 = z11;
            f();
            this.f16433y = z10;
            if (z10) {
                a(this.J, this.f16428m0);
            } else {
                r(this.f16428m0);
            }
        }
    }

    public final Animation n(int i10, int i11) {
        d dVar = new d(i10, i11);
        dVar.setDuration(300L);
        this.R.b(null);
        this.R.clearAnimation();
        this.R.startAnimation(dVar);
        return dVar;
    }

    public final void o(float f10) {
        float f11 = this.L;
        int i10 = this.f16434z;
        if (f10 - f11 <= i10 || this.M) {
            return;
        }
        this.K = f11 + i10;
        this.M = true;
        this.f16417b0.setAlpha(76);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        l();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        f();
        int actionMasked = motionEvent.getActionMasked();
        if (this.P && actionMasked == 0) {
            this.P = false;
        }
        if (!isEnabled() || this.P || c() || this.f16433y || this.H) {
            return false;
        }
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    int i10 = this.N;
                    if (i10 == -1) {
                        Log.e(f16414p0, "Got ACTION_MOVE event but don't have an active pointer id.");
                        return false;
                    }
                    int findPointerIndex = motionEvent.findPointerIndex(i10);
                    if (findPointerIndex < 0) {
                        return false;
                    }
                    o(motionEvent.getY(findPointerIndex));
                } else if (actionMasked != 3) {
                    if (actionMasked == 6) {
                        k(motionEvent);
                    }
                }
            }
            this.M = false;
            this.N = -1;
        } else {
            setTargetOffsetTopAndBottom(this.V - this.R.getTop());
            int pointerId = motionEvent.getPointerId(0);
            this.N = pointerId;
            this.M = false;
            int findPointerIndex2 = motionEvent.findPointerIndex(pointerId);
            if (findPointerIndex2 < 0) {
                return false;
            }
            this.L = motionEvent.getY(findPointerIndex2);
        }
        return this.M;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (getChildCount() == 0) {
            return;
        }
        if (this.f16431w == null) {
            f();
        }
        View view = this.f16431w;
        if (view == null) {
            return;
        }
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        view.layout(paddingLeft, paddingTop, ((measuredWidth - getPaddingLeft()) - getPaddingRight()) + paddingLeft, ((measuredHeight - getPaddingTop()) - getPaddingBottom()) + paddingTop);
        int measuredWidth2 = this.R.getMeasuredWidth();
        int measuredHeight2 = this.R.getMeasuredHeight();
        int i14 = measuredWidth / 2;
        int i15 = measuredWidth2 / 2;
        int i16 = this.J;
        this.R.layout(i14 - i15, i16, i14 + i15, measuredHeight2 + i16);
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (this.f16431w == null) {
            f();
        }
        View view = this.f16431w;
        if (view == null) {
            return;
        }
        view.measure(View.MeasureSpec.makeMeasureSpec((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), 1073741824), View.MeasureSpec.makeMeasureSpec((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), 1073741824));
        this.R.measure(View.MeasureSpec.makeMeasureSpec(this.f16424i0, 1073741824), View.MeasureSpec.makeMeasureSpec(this.f16424i0, 1073741824));
        this.S = -1;
        for (int i12 = 0; i12 < getChildCount(); i12++) {
            if (getChildAt(i12) == this.R) {
                this.S = i12;
                return;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, o3.t
    public boolean onNestedFling(View view, float f10, float f11, boolean z10) {
        return dispatchNestedFling(f10, f11, z10);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, o3.t
    public boolean onNestedPreFling(View view, float f10, float f11) {
        return dispatchNestedPreFling(f10, f11);
    }

    @Override // o3.r
    public void onNestedPreScroll(View view, int i10, int i11, int[] iArr, int i12) {
        if (i12 == 0) {
            onNestedPreScroll(view, i10, i11, iArr);
        }
    }

    @Override // o3.s
    public void onNestedScroll(View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        if (i14 != 0) {
            return;
        }
        int i15 = iArr[1];
        e(i10, i11, i12, i13, this.F, i14, iArr);
        int i16 = i13 - (iArr[1] - i15);
        int i17 = i16 == 0 ? i13 + this.F[1] : i16;
        if (i17 >= 0 || c()) {
            return;
        }
        float abs = this.B + Math.abs(i17);
        this.B = abs;
        i(abs);
        iArr[1] = iArr[1] + i16;
    }

    @Override // o3.r
    public void onNestedScrollAccepted(View view, View view2, int i10, int i11) {
        if (i11 == 0) {
            onNestedScrollAccepted(view, view2, i10);
        }
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        k kVar = (k) parcelable;
        super.onRestoreInstanceState(kVar.getSuperState());
        setRefreshing(kVar.f16445w);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        return new k(super.onSaveInstanceState(), this.f16433y);
    }

    @Override // o3.r
    public boolean onStartNestedScroll(View view, View view2, int i10, int i11) {
        if (i11 == 0) {
            return onStartNestedScroll(view, view2, i10);
        }
        return false;
    }

    @Override // o3.r
    public void onStopNestedScroll(View view, int i10) {
        if (i10 == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (this.P && actionMasked == 0) {
            this.P = false;
        }
        if (!isEnabled() || this.P || c() || this.f16433y || this.H) {
            return false;
        }
        if (actionMasked == 0) {
            this.N = motionEvent.getPointerId(0);
            this.M = false;
        } else if (actionMasked == 1) {
            int findPointerIndex = motionEvent.findPointerIndex(this.N);
            if (findPointerIndex < 0) {
                Log.e(f16414p0, "Got ACTION_UP event but don't have an active pointer id.");
                return false;
            }
            if (this.M) {
                this.M = false;
                g((motionEvent.getY(findPointerIndex) - this.K) * 0.5f);
            }
            this.N = -1;
            return false;
        } else if (actionMasked == 2) {
            int findPointerIndex2 = motionEvent.findPointerIndex(this.N);
            if (findPointerIndex2 < 0) {
                Log.e(f16414p0, "Got ACTION_MOVE event but have an invalid active pointer id.");
                return false;
            }
            float y10 = motionEvent.getY(findPointerIndex2);
            o(y10);
            if (this.M) {
                float f10 = (y10 - this.K) * 0.5f;
                if (f10 <= 0.0f) {
                    return false;
                }
                getParent().requestDisallowInterceptTouchEvent(true);
                i(f10);
            }
        } else if (actionMasked == 3) {
            return false;
        } else {
            if (actionMasked == 5) {
                int actionIndex = motionEvent.getActionIndex();
                if (actionIndex < 0) {
                    Log.e(f16414p0, "Got ACTION_POINTER_DOWN event but have an invalid action index.");
                    return false;
                }
                this.N = motionEvent.getPointerId(actionIndex);
            } else if (actionMasked == 6) {
                k(motionEvent);
            }
        }
        return true;
    }

    public final void p() {
        this.f16421f0 = n(this.f16417b0.getAlpha(), 255);
    }

    public final void q() {
        this.f16420e0 = n(this.f16417b0.getAlpha(), 76);
    }

    public void r(Animation.AnimationListener animationListener) {
        c cVar = new c();
        this.f16419d0 = cVar;
        cVar.setDuration(150L);
        this.R.b(animationListener);
        this.R.clearAnimation();
        this.R.startAnimation(this.f16419d0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z10) {
        View view;
        ViewParent parent;
        if ((Build.VERSION.SDK_INT < 21 && (this.f16431w instanceof AbsListView)) || ((view = this.f16431w) != null && !c0.W(view))) {
            if (this.f16427l0 || (parent = getParent()) == null) {
                return;
            }
            parent.requestDisallowInterceptTouchEvent(z10);
            return;
        }
        super.requestDisallowInterceptTouchEvent(z10);
    }

    public final void s(int i10, Animation.AnimationListener animationListener) {
        this.T = i10;
        this.U = this.R.getScaleX();
        h hVar = new h();
        this.f16422g0 = hVar;
        hVar.setDuration(150L);
        if (animationListener != null) {
            this.R.b(animationListener);
        }
        this.R.clearAnimation();
        this.R.startAnimation(this.f16422g0);
    }

    public void setAnimationProgress(float f10) {
        this.R.setScaleX(f10);
        this.R.setScaleY(f10);
    }

    @Deprecated
    public void setColorScheme(int... iArr) {
        setColorSchemeResources(iArr);
    }

    public void setColorSchemeColors(int... iArr) {
        f();
        this.f16417b0.f(iArr);
    }

    public void setColorSchemeResources(int... iArr) {
        Context context = getContext();
        int[] iArr2 = new int[iArr.length];
        for (int i10 = 0; i10 < iArr.length; i10++) {
            iArr2[i10] = c3.a.d(context, iArr[i10]);
        }
        setColorSchemeColors(iArr2);
    }

    public void setDistanceToTriggerSync(int i10) {
        this.A = i10;
    }

    @Override // android.view.View
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        if (z10) {
            return;
        }
        l();
    }

    @Deprecated
    public void setLegacyRequestDisallowInterceptTouchEventEnabled(boolean z10) {
        this.f16427l0 = z10;
    }

    @Override // android.view.View, o3.p
    public void setNestedScrollingEnabled(boolean z10) {
        this.D.m(z10);
    }

    public void setOnChildScrollUpCallback(i iVar) {
        this.f16426k0 = iVar;
    }

    public void setOnRefreshListener(j jVar) {
        this.f16432x = jVar;
    }

    @Deprecated
    public void setProgressBackgroundColor(int i10) {
        setProgressBackgroundColorSchemeResource(i10);
    }

    public void setProgressBackgroundColorSchemeColor(int i10) {
        this.R.setBackgroundColor(i10);
    }

    public void setProgressBackgroundColorSchemeResource(int i10) {
        setProgressBackgroundColorSchemeColor(c3.a.d(getContext(), i10));
    }

    public void setRefreshing(boolean z10) {
        int i10;
        if (z10 && this.f16433y != z10) {
            this.f16433y = z10;
            if (!this.f16425j0) {
                i10 = this.W + this.V;
            } else {
                i10 = this.W;
            }
            setTargetOffsetTopAndBottom(i10 - this.J);
            this.f16423h0 = false;
            t(this.f16428m0);
            return;
        }
        m(z10, false);
    }

    public void setSize(int i10) {
        if (i10 == 0 || i10 == 1) {
            DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            if (i10 == 0) {
                this.f16424i0 = (int) (displayMetrics.density * 56.0f);
            } else {
                this.f16424i0 = (int) (displayMetrics.density * 40.0f);
            }
            this.R.setImageDrawable(null);
            this.f16417b0.l(i10);
            this.R.setImageDrawable(this.f16417b0);
        }
    }

    public void setSlingshotDistance(int i10) {
        this.f16416a0 = i10;
    }

    public void setTargetOffsetTopAndBottom(int i10) {
        this.R.bringToFront();
        c0.c0(this.R, i10);
        this.J = this.R.getTop();
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i10) {
        return this.D.o(i10);
    }

    @Override // android.view.View, o3.p
    public void stopNestedScroll() {
        this.D.q();
    }

    public final void t(Animation.AnimationListener animationListener) {
        this.R.setVisibility(0);
        this.f16417b0.setAlpha(255);
        b bVar = new b();
        this.f16418c0 = bVar;
        bVar.setDuration(this.I);
        if (animationListener != null) {
            this.R.b(animationListener);
        }
        this.R.clearAnimation();
        this.R.startAnimation(this.f16418c0);
    }

    /* loaded from: classes.dex */
    public static class k extends View.BaseSavedState {
        public static final Parcelable.Creator<k> CREATOR = new a();

        /* renamed from: w  reason: collision with root package name */
        public final boolean f16445w;

        /* loaded from: classes.dex */
        public class a implements Parcelable.Creator<k> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public k createFromParcel(Parcel parcel) {
                return new k(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public k[] newArray(int i10) {
                return new k[i10];
            }
        }

        public k(Parcelable parcelable, boolean z10) {
            super(parcelable);
            this.f16445w = z10;
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeByte(this.f16445w ? (byte) 1 : (byte) 0);
        }

        public k(Parcel parcel) {
            super(parcel);
            this.f16445w = parcel.readByte() != 0;
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, o3.t
    public void onNestedPreScroll(View view, int i10, int i11, int[] iArr) {
        if (i11 > 0) {
            float f10 = this.B;
            if (f10 > 0.0f) {
                float f11 = i11;
                if (f11 > f10) {
                    iArr[1] = (int) f10;
                    this.B = 0.0f;
                } else {
                    this.B = f10 - f11;
                    iArr[1] = i11;
                }
                i(this.B);
            }
        }
        if (this.f16425j0 && i11 > 0 && this.B == 0.0f && Math.abs(i11 - iArr[1]) > 0) {
            this.R.setVisibility(8);
        }
        int[] iArr2 = this.E;
        if (dispatchNestedPreScroll(i10 - iArr[0], i11 - iArr[1], iArr2, null)) {
            iArr[0] = iArr[0] + iArr2[0];
            iArr[1] = iArr[1] + iArr2[1];
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, o3.t
    public void onNestedScrollAccepted(View view, View view2, int i10) {
        this.C.b(view, view2, i10);
        startNestedScroll(i10 & 2);
        this.B = 0.0f;
        this.H = true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, o3.t
    public boolean onStartNestedScroll(View view, View view2, int i10) {
        return (!isEnabled() || this.P || this.f16433y || (i10 & 2) == 0) ? false : true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, o3.t
    public void onStopNestedScroll(View view) {
        this.C.d(view);
        this.H = false;
        float f10 = this.B;
        if (f10 > 0.0f) {
            g(f10);
            this.B = 0.0f;
        }
        stopNestedScroll();
    }

    @Override // o3.r
    public void onNestedScroll(View view, int i10, int i11, int i12, int i13, int i14) {
        onNestedScroll(view, i10, i11, i12, i13, i14, this.G);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, o3.t
    public void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        onNestedScroll(view, i10, i11, i12, i13, 0, this.G);
    }
}
