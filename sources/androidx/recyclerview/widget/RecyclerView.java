package androidx.recyclerview.widget;

import android.animation.LayoutTransition;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Observable;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.FocusFinder;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import androidx.recyclerview.widget.a;
import androidx.recyclerview.widget.e0;
import androidx.recyclerview.widget.f;
import androidx.recyclerview.widget.f0;
import androidx.recyclerview.widget.m;
import androidx.recyclerview.widget.z;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.mirrativ.llstream.protocol.v1.topic.TopicConstant;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p3.c;

/* loaded from: classes.dex */
public class RecyclerView extends ViewGroup implements o3.p {
    public static final int[] Y0 = {16843830};
    public static final boolean Z0;

    /* renamed from: a1  reason: collision with root package name */
    public static final boolean f15881a1;

    /* renamed from: b1  reason: collision with root package name */
    public static final boolean f15882b1;

    /* renamed from: c1  reason: collision with root package name */
    public static final boolean f15883c1;

    /* renamed from: d1  reason: collision with root package name */
    public static final boolean f15884d1;

    /* renamed from: e1  reason: collision with root package name */
    public static final boolean f15885e1;

    /* renamed from: f1  reason: collision with root package name */
    public static final Class<?>[] f15886f1;

    /* renamed from: g1  reason: collision with root package name */
    public static final Interpolator f15887g1;
    public androidx.recyclerview.widget.f A;
    public boolean A0;
    public final f0 B;
    public final d0 B0;
    public boolean C;
    public androidx.recyclerview.widget.m C0;
    public final Runnable D;
    public m.b D0;
    public final Rect E;
    public final b0 E0;
    public final Rect F;
    public u F0;
    public final RectF G;
    public List<u> G0;
    public h H;
    public boolean H0;
    public p I;
    public boolean I0;
    public x J;
    public m.b J0;
    public final List<x> K;
    public boolean K0;
    public final ArrayList<o> L;
    public androidx.recyclerview.widget.z L0;
    public final ArrayList<t> M;
    public k M0;
    public t N;
    public final int[] N0;
    public boolean O;
    public o3.q O0;
    public boolean P;
    public final int[] P0;
    public boolean Q;
    public final int[] Q0;
    public boolean R;
    public final int[] R0;
    public int S;
    public final List<e0> S0;
    public boolean T;
    public Runnable T0;
    public boolean U;
    public boolean U0;
    public boolean V;
    public int V0;
    public int W;
    public int W0;
    public final f0.b X0;

    /* renamed from: a0  reason: collision with root package name */
    public boolean f15888a0;

    /* renamed from: b0  reason: collision with root package name */
    public final AccessibilityManager f15889b0;

    /* renamed from: c0  reason: collision with root package name */
    public List<r> f15890c0;

    /* renamed from: d0  reason: collision with root package name */
    public boolean f15891d0;

    /* renamed from: e0  reason: collision with root package name */
    public boolean f15892e0;

    /* renamed from: f0  reason: collision with root package name */
    public int f15893f0;

    /* renamed from: g0  reason: collision with root package name */
    public int f15894g0;

    /* renamed from: h0  reason: collision with root package name */
    public l f15895h0;

    /* renamed from: i0  reason: collision with root package name */
    public EdgeEffect f15896i0;

    /* renamed from: j0  reason: collision with root package name */
    public EdgeEffect f15897j0;

    /* renamed from: k0  reason: collision with root package name */
    public EdgeEffect f15898k0;

    /* renamed from: l0  reason: collision with root package name */
    public EdgeEffect f15899l0;

    /* renamed from: m0  reason: collision with root package name */
    public m f15900m0;

    /* renamed from: n0  reason: collision with root package name */
    public int f15901n0;

    /* renamed from: o0  reason: collision with root package name */
    public int f15902o0;

    /* renamed from: p0  reason: collision with root package name */
    public VelocityTracker f15903p0;

    /* renamed from: q0  reason: collision with root package name */
    public int f15904q0;

    /* renamed from: r0  reason: collision with root package name */
    public int f15905r0;

    /* renamed from: s0  reason: collision with root package name */
    public int f15906s0;

    /* renamed from: t0  reason: collision with root package name */
    public int f15907t0;

    /* renamed from: u0  reason: collision with root package name */
    public int f15908u0;

    /* renamed from: v0  reason: collision with root package name */
    public s f15909v0;

    /* renamed from: w  reason: collision with root package name */
    public final y f15910w;

    /* renamed from: w0  reason: collision with root package name */
    public final int f15911w0;

    /* renamed from: x  reason: collision with root package name */
    public final w f15912x;

    /* renamed from: x0  reason: collision with root package name */
    public final int f15913x0;

    /* renamed from: y  reason: collision with root package name */
    public z f15914y;

    /* renamed from: y0  reason: collision with root package name */
    public float f15915y0;

    /* renamed from: z  reason: collision with root package name */
    public androidx.recyclerview.widget.a f15916z;

    /* renamed from: z0  reason: collision with root package name */
    public float f15917z0;

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            RecyclerView recyclerView = RecyclerView.this;
            if (!recyclerView.R || recyclerView.isLayoutRequested()) {
                return;
            }
            RecyclerView recyclerView2 = RecyclerView.this;
            if (!recyclerView2.O) {
                recyclerView2.requestLayout();
            } else if (recyclerView2.U) {
                recyclerView2.T = true;
            } else {
                recyclerView2.v();
            }
        }
    }

    /* loaded from: classes.dex */
    public static abstract class a0 {

        /* renamed from: b  reason: collision with root package name */
        public RecyclerView f15920b;

        /* renamed from: c  reason: collision with root package name */
        public p f15921c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f15922d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f15923e;

        /* renamed from: f  reason: collision with root package name */
        public View f15924f;

        /* renamed from: h  reason: collision with root package name */
        public boolean f15926h;

        /* renamed from: a  reason: collision with root package name */
        public int f15919a = -1;

        /* renamed from: g  reason: collision with root package name */
        public final a f15925g = new a(0, 0);

        /* loaded from: classes.dex */
        public static class a {

            /* renamed from: a  reason: collision with root package name */
            public int f15927a;

            /* renamed from: b  reason: collision with root package name */
            public int f15928b;

            /* renamed from: c  reason: collision with root package name */
            public int f15929c;

            /* renamed from: d  reason: collision with root package name */
            public int f15930d;

            /* renamed from: e  reason: collision with root package name */
            public Interpolator f15931e;

            /* renamed from: f  reason: collision with root package name */
            public boolean f15932f;

            /* renamed from: g  reason: collision with root package name */
            public int f15933g;

            public a(int i10, int i11) {
                this(i10, i11, Integer.MIN_VALUE, null);
            }

            public boolean a() {
                return this.f15930d >= 0;
            }

            public void b(int i10) {
                this.f15930d = i10;
            }

            public void c(RecyclerView recyclerView) {
                int i10 = this.f15930d;
                if (i10 >= 0) {
                    this.f15930d = -1;
                    recyclerView.B0(i10);
                    this.f15932f = false;
                } else if (this.f15932f) {
                    e();
                    recyclerView.B0.e(this.f15927a, this.f15928b, this.f15929c, this.f15931e);
                    int i11 = this.f15933g + 1;
                    this.f15933g = i11;
                    if (i11 > 10) {
                        Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
                    }
                    this.f15932f = false;
                } else {
                    this.f15933g = 0;
                }
            }

            public void d(int i10, int i11, int i12, Interpolator interpolator) {
                this.f15927a = i10;
                this.f15928b = i11;
                this.f15929c = i12;
                this.f15931e = interpolator;
                this.f15932f = true;
            }

            public final void e() {
                if (this.f15931e != null && this.f15929c < 1) {
                    throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
                }
                if (this.f15929c < 1) {
                    throw new IllegalStateException("Scroll duration must be a positive number");
                }
            }

            public a(int i10, int i11, int i12, Interpolator interpolator) {
                this.f15930d = -1;
                this.f15932f = false;
                this.f15933g = 0;
                this.f15927a = i10;
                this.f15928b = i11;
                this.f15929c = i12;
                this.f15931e = interpolator;
            }
        }

        /* loaded from: classes.dex */
        public interface b {
            PointF a(int i10);
        }

        public PointF a(int i10) {
            p e10 = e();
            if (e10 instanceof b) {
                return ((b) e10).a(i10);
            }
            Log.w("RecyclerView", "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + b.class.getCanonicalName());
            return null;
        }

        public View b(int i10) {
            return this.f15920b.I.N(i10);
        }

        public int c() {
            return this.f15920b.I.U();
        }

        public int d(View view) {
            return this.f15920b.g0(view);
        }

        public p e() {
            return this.f15921c;
        }

        public int f() {
            return this.f15919a;
        }

        public boolean g() {
            return this.f15922d;
        }

        public boolean h() {
            return this.f15923e;
        }

        public void i(PointF pointF) {
            float f10 = pointF.x;
            float f11 = pointF.y;
            float sqrt = (float) Math.sqrt((f10 * f10) + (f11 * f11));
            pointF.x /= sqrt;
            pointF.y /= sqrt;
        }

        public void j(int i10, int i11) {
            PointF a10;
            RecyclerView recyclerView = this.f15920b;
            if (this.f15919a == -1 || recyclerView == null) {
                r();
            }
            if (this.f15922d && this.f15924f == null && this.f15921c != null && (a10 = a(this.f15919a)) != null) {
                float f10 = a10.x;
                if (f10 != 0.0f || a10.y != 0.0f) {
                    recyclerView.o1((int) Math.signum(f10), (int) Math.signum(a10.y), null);
                }
            }
            this.f15922d = false;
            View view = this.f15924f;
            if (view != null) {
                if (d(view) == this.f15919a) {
                    o(this.f15924f, recyclerView.E0, this.f15925g);
                    this.f15925g.c(recyclerView);
                    r();
                } else {
                    Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                    this.f15924f = null;
                }
            }
            if (this.f15923e) {
                l(i10, i11, recyclerView.E0, this.f15925g);
                boolean a11 = this.f15925g.a();
                this.f15925g.c(recyclerView);
                if (a11 && this.f15923e) {
                    this.f15922d = true;
                    recyclerView.B0.d();
                }
            }
        }

        public void k(View view) {
            if (d(view) == f()) {
                this.f15924f = view;
            }
        }

        public abstract void l(int i10, int i11, b0 b0Var, a aVar);

        public abstract void m();

        public abstract void n();

        public abstract void o(View view, b0 b0Var, a aVar);

        public void p(int i10) {
            this.f15919a = i10;
        }

        public void q(RecyclerView recyclerView, p pVar) {
            recyclerView.B0.f();
            if (this.f15926h) {
                Log.w("RecyclerView", "An instance of " + getClass().getSimpleName() + " was started more than once. Each instance of" + getClass().getSimpleName() + " is intended to only be used once. You should create a new instance for each use.");
            }
            this.f15920b = recyclerView;
            this.f15921c = pVar;
            int i10 = this.f15919a;
            if (i10 != -1) {
                recyclerView.E0.f15935a = i10;
                this.f15923e = true;
                this.f15922d = true;
                this.f15924f = b(f());
                m();
                this.f15920b.B0.d();
                this.f15926h = true;
                return;
            }
            throw new IllegalArgumentException("Invalid target position");
        }

        public final void r() {
            if (this.f15923e) {
                this.f15923e = false;
                n();
                this.f15920b.E0.f15935a = -1;
                this.f15924f = null;
                this.f15919a = -1;
                this.f15922d = false;
                this.f15921c.n1(this);
                this.f15921c = null;
                this.f15920b = null;
            }
        }
    }

    /* loaded from: classes.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            m mVar = RecyclerView.this.f15900m0;
            if (mVar != null) {
                mVar.v();
            }
            RecyclerView.this.K0 = false;
        }
    }

    /* loaded from: classes.dex */
    public static class b0 {

        /* renamed from: b  reason: collision with root package name */
        public SparseArray<Object> f15936b;

        /* renamed from: m  reason: collision with root package name */
        public int f15947m;

        /* renamed from: n  reason: collision with root package name */
        public long f15948n;

        /* renamed from: o  reason: collision with root package name */
        public int f15949o;

        /* renamed from: p  reason: collision with root package name */
        public int f15950p;

        /* renamed from: q  reason: collision with root package name */
        public int f15951q;

        /* renamed from: a  reason: collision with root package name */
        public int f15935a = -1;

        /* renamed from: c  reason: collision with root package name */
        public int f15937c = 0;

        /* renamed from: d  reason: collision with root package name */
        public int f15938d = 0;

        /* renamed from: e  reason: collision with root package name */
        public int f15939e = 1;

        /* renamed from: f  reason: collision with root package name */
        public int f15940f = 0;

        /* renamed from: g  reason: collision with root package name */
        public boolean f15941g = false;

        /* renamed from: h  reason: collision with root package name */
        public boolean f15942h = false;

        /* renamed from: i  reason: collision with root package name */
        public boolean f15943i = false;

        /* renamed from: j  reason: collision with root package name */
        public boolean f15944j = false;

        /* renamed from: k  reason: collision with root package name */
        public boolean f15945k = false;

        /* renamed from: l  reason: collision with root package name */
        public boolean f15946l = false;

        public void a(int i10) {
            if ((this.f15939e & i10) != 0) {
                return;
            }
            throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i10) + " but it is " + Integer.toBinaryString(this.f15939e));
        }

        public int b() {
            if (this.f15942h) {
                return this.f15937c - this.f15938d;
            }
            return this.f15940f;
        }

        public int c() {
            return this.f15935a;
        }

        public boolean d() {
            return this.f15935a != -1;
        }

        public boolean e() {
            return this.f15942h;
        }

        public void f(h hVar) {
            this.f15939e = 1;
            this.f15940f = hVar.getItemCount();
            this.f15942h = false;
            this.f15943i = false;
            this.f15944j = false;
        }

        public boolean g() {
            return this.f15946l;
        }

        public String toString() {
            return "State{mTargetPosition=" + this.f15935a + ", mData=" + this.f15936b + ", mItemCount=" + this.f15940f + ", mIsMeasuring=" + this.f15944j + ", mPreviousLayoutItemCount=" + this.f15937c + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f15938d + ", mStructureChanged=" + this.f15941g + ", mInPreLayout=" + this.f15942h + ", mRunSimpleAnimations=" + this.f15945k + ", mRunPredictiveAnimations=" + this.f15946l + '}';
        }
    }

    /* loaded from: classes.dex */
    public class c implements Interpolator {
        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f10) {
            float f11 = f10 - 1.0f;
            return (f11 * f11 * f11 * f11 * f11) + 1.0f;
        }
    }

    /* loaded from: classes.dex */
    public static abstract class c0 {
    }

    /* loaded from: classes.dex */
    public class d implements f0.b {
        public d() {
        }

        @Override // androidx.recyclerview.widget.f0.b
        public void a(e0 e0Var, m.c cVar, m.c cVar2) {
            RecyclerView.this.l(e0Var, cVar, cVar2);
        }

        @Override // androidx.recyclerview.widget.f0.b
        public void b(e0 e0Var) {
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.I.v1(e0Var.itemView, recyclerView.f15912x);
        }

        @Override // androidx.recyclerview.widget.f0.b
        public void c(e0 e0Var, m.c cVar, m.c cVar2) {
            RecyclerView.this.f15912x.J(e0Var);
            RecyclerView.this.n(e0Var, cVar, cVar2);
        }

        @Override // androidx.recyclerview.widget.f0.b
        public void d(e0 e0Var, m.c cVar, m.c cVar2) {
            e0Var.setIsRecyclable(false);
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.f15891d0) {
                if (recyclerView.f15900m0.b(e0Var, e0Var, cVar, cVar2)) {
                    RecyclerView.this.S0();
                }
            } else if (recyclerView.f15900m0.d(e0Var, cVar, cVar2)) {
                RecyclerView.this.S0();
            }
        }
    }

    /* loaded from: classes.dex */
    public class d0 implements Runnable {
        public boolean A;
        public boolean B;

        /* renamed from: w  reason: collision with root package name */
        public int f15953w;

        /* renamed from: x  reason: collision with root package name */
        public int f15954x;

        /* renamed from: y  reason: collision with root package name */
        public OverScroller f15955y;

        /* renamed from: z  reason: collision with root package name */
        public Interpolator f15956z;

        public d0() {
            Interpolator interpolator = RecyclerView.f15887g1;
            this.f15956z = interpolator;
            this.A = false;
            this.B = false;
            this.f15955y = new OverScroller(RecyclerView.this.getContext(), interpolator);
        }

        public final int a(int i10, int i11) {
            int abs = Math.abs(i10);
            int abs2 = Math.abs(i11);
            boolean z10 = abs > abs2;
            RecyclerView recyclerView = RecyclerView.this;
            int width = z10 ? recyclerView.getWidth() : recyclerView.getHeight();
            if (!z10) {
                abs = abs2;
            }
            return Math.min((int) (((abs / width) + 1.0f) * 300.0f), 2000);
        }

        public void b(int i10, int i11) {
            RecyclerView.this.setScrollState(2);
            this.f15954x = 0;
            this.f15953w = 0;
            Interpolator interpolator = this.f15956z;
            Interpolator interpolator2 = RecyclerView.f15887g1;
            if (interpolator != interpolator2) {
                this.f15956z = interpolator2;
                this.f15955y = new OverScroller(RecyclerView.this.getContext(), interpolator2);
            }
            this.f15955y.fling(0, 0, i10, i11, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
            d();
        }

        public final void c() {
            RecyclerView.this.removeCallbacks(this);
            o3.c0.j0(RecyclerView.this, this);
        }

        public void d() {
            if (this.A) {
                this.B = true;
            } else {
                c();
            }
        }

        public void e(int i10, int i11, int i12, Interpolator interpolator) {
            if (i12 == Integer.MIN_VALUE) {
                i12 = a(i10, i11);
            }
            int i13 = i12;
            if (interpolator == null) {
                interpolator = RecyclerView.f15887g1;
            }
            if (this.f15956z != interpolator) {
                this.f15956z = interpolator;
                this.f15955y = new OverScroller(RecyclerView.this.getContext(), interpolator);
            }
            this.f15954x = 0;
            this.f15953w = 0;
            RecyclerView.this.setScrollState(2);
            this.f15955y.startScroll(0, 0, i10, i11, i13);
            if (Build.VERSION.SDK_INT < 23) {
                this.f15955y.computeScrollOffset();
            }
            d();
        }

        public void f() {
            RecyclerView.this.removeCallbacks(this);
            this.f15955y.abortAnimation();
        }

        @Override // java.lang.Runnable
        public void run() {
            int i10;
            int i11;
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.I == null) {
                f();
                return;
            }
            this.B = false;
            this.A = true;
            recyclerView.v();
            OverScroller overScroller = this.f15955y;
            if (overScroller.computeScrollOffset()) {
                int currX = overScroller.getCurrX();
                int currY = overScroller.getCurrY();
                int i12 = currX - this.f15953w;
                int i13 = currY - this.f15954x;
                this.f15953w = currX;
                this.f15954x = currY;
                RecyclerView recyclerView2 = RecyclerView.this;
                int[] iArr = recyclerView2.R0;
                iArr[0] = 0;
                iArr[1] = 0;
                if (recyclerView2.G(i12, i13, iArr, null, 1)) {
                    int[] iArr2 = RecyclerView.this.R0;
                    i12 -= iArr2[0];
                    i13 -= iArr2[1];
                }
                if (RecyclerView.this.getOverScrollMode() != 2) {
                    RecyclerView.this.u(i12, i13);
                }
                RecyclerView recyclerView3 = RecyclerView.this;
                if (recyclerView3.H != null) {
                    int[] iArr3 = recyclerView3.R0;
                    iArr3[0] = 0;
                    iArr3[1] = 0;
                    recyclerView3.o1(i12, i13, iArr3);
                    RecyclerView recyclerView4 = RecyclerView.this;
                    int[] iArr4 = recyclerView4.R0;
                    i11 = iArr4[0];
                    i10 = iArr4[1];
                    i12 -= i11;
                    i13 -= i10;
                    a0 a0Var = recyclerView4.I.C;
                    if (a0Var != null && !a0Var.g() && a0Var.h()) {
                        int b10 = RecyclerView.this.E0.b();
                        if (b10 == 0) {
                            a0Var.r();
                        } else if (a0Var.f() >= b10) {
                            a0Var.p(b10 - 1);
                            a0Var.j(i11, i10);
                        } else {
                            a0Var.j(i11, i10);
                        }
                    }
                } else {
                    i10 = 0;
                    i11 = 0;
                }
                if (!RecyclerView.this.L.isEmpty()) {
                    RecyclerView.this.invalidate();
                }
                RecyclerView recyclerView5 = RecyclerView.this;
                int[] iArr5 = recyclerView5.R0;
                iArr5[0] = 0;
                iArr5[1] = 0;
                recyclerView5.H(i11, i10, i12, i13, null, 1, iArr5);
                RecyclerView recyclerView6 = RecyclerView.this;
                int[] iArr6 = recyclerView6.R0;
                int i14 = i12 - iArr6[0];
                int i15 = i13 - iArr6[1];
                if (i11 != 0 || i10 != 0) {
                    recyclerView6.J(i11, i10);
                }
                if (!RecyclerView.this.awakenScrollBars()) {
                    RecyclerView.this.invalidate();
                }
                boolean z10 = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || i14 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || i15 != 0));
                a0 a0Var2 = RecyclerView.this.I.C;
                if (!(a0Var2 != null && a0Var2.g()) && z10) {
                    if (RecyclerView.this.getOverScrollMode() != 2) {
                        int currVelocity = (int) overScroller.getCurrVelocity();
                        int i16 = i14 < 0 ? -currVelocity : i14 > 0 ? currVelocity : 0;
                        if (i15 < 0) {
                            currVelocity = -currVelocity;
                        } else if (i15 <= 0) {
                            currVelocity = 0;
                        }
                        RecyclerView.this.a(i16, currVelocity);
                    }
                    if (RecyclerView.f15883c1) {
                        RecyclerView.this.D0.b();
                    }
                } else {
                    d();
                    RecyclerView recyclerView7 = RecyclerView.this;
                    androidx.recyclerview.widget.m mVar = recyclerView7.C0;
                    if (mVar != null) {
                        mVar.f(recyclerView7, i11, i10);
                    }
                }
            }
            a0 a0Var3 = RecyclerView.this.I.C;
            if (a0Var3 != null && a0Var3.g()) {
                a0Var3.j(0, 0);
            }
            this.A = false;
            if (this.B) {
                c();
                return;
            }
            RecyclerView.this.setScrollState(0);
            RecyclerView.this.B1(1);
        }
    }

    /* loaded from: classes.dex */
    public class e implements f.b {
        public e() {
        }

        @Override // androidx.recyclerview.widget.f.b
        public View a(int i10) {
            return RecyclerView.this.getChildAt(i10);
        }

        @Override // androidx.recyclerview.widget.f.b
        public void b(View view) {
            e0 i02 = RecyclerView.i0(view);
            if (i02 != null) {
                i02.onEnteredHiddenState(RecyclerView.this);
            }
        }

        @Override // androidx.recyclerview.widget.f.b
        public int c() {
            return RecyclerView.this.getChildCount();
        }

        @Override // androidx.recyclerview.widget.f.b
        public e0 d(View view) {
            return RecyclerView.i0(view);
        }

        @Override // androidx.recyclerview.widget.f.b
        public void e(int i10) {
            e0 i02;
            View a10 = a(i10);
            if (a10 != null && (i02 = RecyclerView.i0(a10)) != null) {
                if (i02.isTmpDetached() && !i02.shouldIgnore()) {
                    throw new IllegalArgumentException("called detach on an already detached child " + i02 + RecyclerView.this.Q());
                }
                i02.addFlags(256);
            }
            RecyclerView.this.detachViewFromParent(i10);
        }

        @Override // androidx.recyclerview.widget.f.b
        public void f(View view, int i10) {
            RecyclerView.this.addView(view, i10);
            RecyclerView.this.z(view);
        }

        @Override // androidx.recyclerview.widget.f.b
        public void g() {
            int c10 = c();
            for (int i10 = 0; i10 < c10; i10++) {
                View a10 = a(i10);
                RecyclerView.this.A(a10);
                a10.clearAnimation();
            }
            RecyclerView.this.removeAllViews();
        }

        @Override // androidx.recyclerview.widget.f.b
        public int h(View view) {
            return RecyclerView.this.indexOfChild(view);
        }

        @Override // androidx.recyclerview.widget.f.b
        public void i(View view) {
            e0 i02 = RecyclerView.i0(view);
            if (i02 != null) {
                i02.onLeftHiddenState(RecyclerView.this);
            }
        }

        @Override // androidx.recyclerview.widget.f.b
        public void j(int i10) {
            View childAt = RecyclerView.this.getChildAt(i10);
            if (childAt != null) {
                RecyclerView.this.A(childAt);
                childAt.clearAnimation();
            }
            RecyclerView.this.removeViewAt(i10);
        }

        @Override // androidx.recyclerview.widget.f.b
        public void k(View view, int i10, ViewGroup.LayoutParams layoutParams) {
            e0 i02 = RecyclerView.i0(view);
            if (i02 != null) {
                if (!i02.isTmpDetached() && !i02.shouldIgnore()) {
                    throw new IllegalArgumentException("Called attach on a child which is not detached: " + i02 + RecyclerView.this.Q());
                }
                i02.clearTmpDetachFlag();
            }
            RecyclerView.this.attachViewToParent(view, i10, layoutParams);
        }
    }

    /* loaded from: classes.dex */
    public static abstract class e0 {
        public static final int FLAG_ADAPTER_FULLUPDATE = 1024;
        public static final int FLAG_ADAPTER_POSITION_UNKNOWN = 512;
        public static final int FLAG_APPEARED_IN_PRE_LAYOUT = 4096;
        public static final int FLAG_BOUNCED_FROM_HIDDEN_LIST = 8192;
        public static final int FLAG_BOUND = 1;
        public static final int FLAG_IGNORE = 128;
        public static final int FLAG_INVALID = 4;
        public static final int FLAG_MOVED = 2048;
        public static final int FLAG_NOT_RECYCLABLE = 16;
        public static final int FLAG_REMOVED = 8;
        public static final int FLAG_RETURNED_FROM_SCRAP = 32;
        public static final int FLAG_TMP_DETACHED = 256;
        public static final int FLAG_UPDATE = 2;
        private static final List<Object> FULLUPDATE_PAYLOADS = Collections.emptyList();
        public static final int PENDING_ACCESSIBILITY_STATE_NOT_SET = -1;
        public final View itemView;
        public h<? extends e0> mBindingAdapter;
        public int mFlags;
        public WeakReference<RecyclerView> mNestedRecyclerView;
        public RecyclerView mOwnerRecyclerView;
        public int mPosition = -1;
        public int mOldPosition = -1;
        public long mItemId = -1;
        public int mItemViewType = -1;
        public int mPreLayoutPosition = -1;
        public e0 mShadowedHolder = null;
        public e0 mShadowingHolder = null;
        public List<Object> mPayloads = null;
        public List<Object> mUnmodifiedPayloads = null;
        private int mIsRecyclableCount = 0;
        public w mScrapContainer = null;
        public boolean mInChangeScrap = false;
        private int mWasImportantForAccessibilityBeforeHidden = 0;
        public int mPendingAccessibilityState = -1;

        public e0(View view) {
            if (view != null) {
                this.itemView = view;
                return;
            }
            throw new IllegalArgumentException("itemView may not be null");
        }

        private void createPayloadsIfNeeded() {
            if (this.mPayloads == null) {
                ArrayList arrayList = new ArrayList();
                this.mPayloads = arrayList;
                this.mUnmodifiedPayloads = Collections.unmodifiableList(arrayList);
            }
        }

        public void addChangePayload(Object obj) {
            if (obj == null) {
                addFlags(1024);
            } else if ((1024 & this.mFlags) == 0) {
                createPayloadsIfNeeded();
                this.mPayloads.add(obj);
            }
        }

        public void addFlags(int i10) {
            this.mFlags = i10 | this.mFlags;
        }

        public void clearOldPosition() {
            this.mOldPosition = -1;
            this.mPreLayoutPosition = -1;
        }

        public void clearPayload() {
            List<Object> list = this.mPayloads;
            if (list != null) {
                list.clear();
            }
            this.mFlags &= -1025;
        }

        public void clearReturnedFromScrapFlag() {
            this.mFlags &= -33;
        }

        public void clearTmpDetachFlag() {
            this.mFlags &= -257;
        }

        public boolean doesTransientStatePreventRecycling() {
            return (this.mFlags & 16) == 0 && o3.c0.S(this.itemView);
        }

        public void flagRemovedAndOffsetPosition(int i10, int i11, boolean z10) {
            addFlags(8);
            offsetPosition(i11, z10);
            this.mPosition = i10;
        }

        public final int getAbsoluteAdapterPosition() {
            RecyclerView recyclerView = this.mOwnerRecyclerView;
            if (recyclerView == null) {
                return -1;
            }
            return recyclerView.d0(this);
        }

        @Deprecated
        public final int getAdapterPosition() {
            return getBindingAdapterPosition();
        }

        public final h<? extends e0> getBindingAdapter() {
            return this.mBindingAdapter;
        }

        public final int getBindingAdapterPosition() {
            RecyclerView recyclerView;
            h adapter;
            int d02;
            if (this.mBindingAdapter == null || (recyclerView = this.mOwnerRecyclerView) == null || (adapter = recyclerView.getAdapter()) == null || (d02 = this.mOwnerRecyclerView.d0(this)) == -1) {
                return -1;
            }
            return adapter.findRelativeAdapterPositionIn(this.mBindingAdapter, this, d02);
        }

        public final long getItemId() {
            return this.mItemId;
        }

        public final int getItemViewType() {
            return this.mItemViewType;
        }

        public final int getLayoutPosition() {
            int i10 = this.mPreLayoutPosition;
            return i10 == -1 ? this.mPosition : i10;
        }

        public final int getOldPosition() {
            return this.mOldPosition;
        }

        @Deprecated
        public final int getPosition() {
            int i10 = this.mPreLayoutPosition;
            return i10 == -1 ? this.mPosition : i10;
        }

        public List<Object> getUnmodifiedPayloads() {
            if ((this.mFlags & 1024) == 0) {
                List<Object> list = this.mPayloads;
                if (list != null && list.size() != 0) {
                    return this.mUnmodifiedPayloads;
                }
                return FULLUPDATE_PAYLOADS;
            }
            return FULLUPDATE_PAYLOADS;
        }

        public boolean hasAnyOfTheFlags(int i10) {
            return (i10 & this.mFlags) != 0;
        }

        public boolean isAdapterPositionUnknown() {
            return (this.mFlags & 512) != 0 || isInvalid();
        }

        public boolean isAttachedToTransitionOverlay() {
            return (this.itemView.getParent() == null || this.itemView.getParent() == this.mOwnerRecyclerView) ? false : true;
        }

        public boolean isBound() {
            return (this.mFlags & 1) != 0;
        }

        public boolean isInvalid() {
            return (this.mFlags & 4) != 0;
        }

        public final boolean isRecyclable() {
            return (this.mFlags & 16) == 0 && !o3.c0.S(this.itemView);
        }

        public boolean isRemoved() {
            return (this.mFlags & 8) != 0;
        }

        public boolean isScrap() {
            return this.mScrapContainer != null;
        }

        public boolean isTmpDetached() {
            return (this.mFlags & 256) != 0;
        }

        public boolean isUpdated() {
            return (this.mFlags & 2) != 0;
        }

        public boolean needsUpdate() {
            return (this.mFlags & 2) != 0;
        }

        public void offsetPosition(int i10, boolean z10) {
            if (this.mOldPosition == -1) {
                this.mOldPosition = this.mPosition;
            }
            if (this.mPreLayoutPosition == -1) {
                this.mPreLayoutPosition = this.mPosition;
            }
            if (z10) {
                this.mPreLayoutPosition += i10;
            }
            this.mPosition += i10;
            if (this.itemView.getLayoutParams() != null) {
                ((q) this.itemView.getLayoutParams()).f15983y = true;
            }
        }

        public void onEnteredHiddenState(RecyclerView recyclerView) {
            int i10 = this.mPendingAccessibilityState;
            if (i10 != -1) {
                this.mWasImportantForAccessibilityBeforeHidden = i10;
            } else {
                this.mWasImportantForAccessibilityBeforeHidden = o3.c0.C(this.itemView);
            }
            recyclerView.r1(this, 4);
        }

        public void onLeftHiddenState(RecyclerView recyclerView) {
            recyclerView.r1(this, this.mWasImportantForAccessibilityBeforeHidden);
            this.mWasImportantForAccessibilityBeforeHidden = 0;
        }

        public void resetInternal() {
            this.mFlags = 0;
            this.mPosition = -1;
            this.mOldPosition = -1;
            this.mItemId = -1L;
            this.mPreLayoutPosition = -1;
            this.mIsRecyclableCount = 0;
            this.mShadowedHolder = null;
            this.mShadowingHolder = null;
            clearPayload();
            this.mWasImportantForAccessibilityBeforeHidden = 0;
            this.mPendingAccessibilityState = -1;
            RecyclerView.r(this);
        }

        public void saveOldPosition() {
            if (this.mOldPosition == -1) {
                this.mOldPosition = this.mPosition;
            }
        }

        public void setFlags(int i10, int i11) {
            this.mFlags = (i10 & i11) | (this.mFlags & (~i11));
        }

        public final void setIsRecyclable(boolean z10) {
            int i10 = this.mIsRecyclableCount;
            int i11 = z10 ? i10 - 1 : i10 + 1;
            this.mIsRecyclableCount = i11;
            if (i11 < 0) {
                this.mIsRecyclableCount = 0;
                Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
            } else if (!z10 && i11 == 1) {
                this.mFlags |= 16;
            } else if (z10 && i11 == 0) {
                this.mFlags &= -17;
            }
        }

        public void setScrapContainer(w wVar, boolean z10) {
            this.mScrapContainer = wVar;
            this.mInChangeScrap = z10;
        }

        public boolean shouldBeKeptAsChild() {
            return (this.mFlags & 16) != 0;
        }

        public boolean shouldIgnore() {
            return (this.mFlags & 128) != 0;
        }

        public void stopIgnoring() {
            this.mFlags &= -129;
        }

        public String toString() {
            String simpleName = getClass().isAnonymousClass() ? "ViewHolder" : getClass().getSimpleName();
            StringBuilder sb2 = new StringBuilder(simpleName + "{" + Integer.toHexString(hashCode()) + " position=" + this.mPosition + " id=" + this.mItemId + ", oldPos=" + this.mOldPosition + ", pLpos:" + this.mPreLayoutPosition);
            if (isScrap()) {
                sb2.append(" scrap ");
                sb2.append(this.mInChangeScrap ? "[changeScrap]" : "[attachedScrap]");
            }
            if (isInvalid()) {
                sb2.append(" invalid");
            }
            if (!isBound()) {
                sb2.append(" unbound");
            }
            if (needsUpdate()) {
                sb2.append(" update");
            }
            if (isRemoved()) {
                sb2.append(" removed");
            }
            if (shouldIgnore()) {
                sb2.append(" ignored");
            }
            if (isTmpDetached()) {
                sb2.append(" tmpDetached");
            }
            if (!isRecyclable()) {
                sb2.append(" not recyclable(" + this.mIsRecyclableCount + ")");
            }
            if (isAdapterPositionUnknown()) {
                sb2.append(" undefined adapter position");
            }
            if (this.itemView.getParent() == null) {
                sb2.append(" no parent");
            }
            sb2.append("}");
            return sb2.toString();
        }

        public void unScrap() {
            this.mScrapContainer.J(this);
        }

        public boolean wasReturnedFromScrap() {
            return (this.mFlags & 32) != 0;
        }
    }

    /* loaded from: classes.dex */
    public class f implements a.InterfaceC0071a {
        public f() {
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0071a
        public void a(int i10, int i11) {
            RecyclerView.this.I0(i10, i11);
            RecyclerView.this.H0 = true;
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0071a
        public void b(a.b bVar) {
            i(bVar);
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0071a
        public void c(a.b bVar) {
            i(bVar);
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0071a
        public void d(int i10, int i11) {
            RecyclerView.this.J0(i10, i11, false);
            RecyclerView.this.H0 = true;
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0071a
        public void e(int i10, int i11, Object obj) {
            RecyclerView.this.E1(i10, i11, obj);
            RecyclerView.this.I0 = true;
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0071a
        public e0 f(int i10) {
            e0 b02 = RecyclerView.this.b0(i10, true);
            if (b02 == null || RecyclerView.this.A.n(b02.itemView)) {
                return null;
            }
            return b02;
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0071a
        public void g(int i10, int i11) {
            RecyclerView.this.H0(i10, i11);
            RecyclerView.this.H0 = true;
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0071a
        public void h(int i10, int i11) {
            RecyclerView.this.J0(i10, i11, true);
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.H0 = true;
            recyclerView.E0.f15938d += i11;
        }

        public void i(a.b bVar) {
            int i10 = bVar.f16045a;
            if (i10 == 1) {
                RecyclerView recyclerView = RecyclerView.this;
                recyclerView.I.Z0(recyclerView, bVar.f16046b, bVar.f16048d);
            } else if (i10 == 2) {
                RecyclerView recyclerView2 = RecyclerView.this;
                recyclerView2.I.c1(recyclerView2, bVar.f16046b, bVar.f16048d);
            } else if (i10 == 4) {
                RecyclerView recyclerView3 = RecyclerView.this;
                recyclerView3.I.e1(recyclerView3, bVar.f16046b, bVar.f16048d, bVar.f16047c);
            } else if (i10 != 8) {
            } else {
                RecyclerView recyclerView4 = RecyclerView.this;
                recyclerView4.I.b1(recyclerView4, bVar.f16046b, bVar.f16048d, 1);
            }
        }
    }

    /* loaded from: classes.dex */
    public static /* synthetic */ class g {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f15959a;

        static {
            int[] iArr = new int[h.a.values().length];
            f15959a = iArr;
            try {
                iArr[h.a.PREVENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15959a[h.a.PREVENT_WHEN_EMPTY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* loaded from: classes.dex */
    public static abstract class h<VH extends e0> {
        private final i mObservable = new i();
        private boolean mHasStableIds = false;
        private a mStateRestorationPolicy = a.ALLOW;

        /* loaded from: classes.dex */
        public enum a {
            ALLOW,
            PREVENT_WHEN_EMPTY,
            PREVENT
        }

        public final void bindViewHolder(VH vh2, int i10) {
            boolean z10 = vh2.mBindingAdapter == null;
            if (z10) {
                vh2.mPosition = i10;
                if (hasStableIds()) {
                    vh2.mItemId = getItemId(i10);
                }
                vh2.setFlags(1, 519);
                k3.j.a("RV OnBindView");
            }
            vh2.mBindingAdapter = this;
            onBindViewHolder(vh2, i10, vh2.getUnmodifiedPayloads());
            if (z10) {
                vh2.clearPayload();
                ViewGroup.LayoutParams layoutParams = vh2.itemView.getLayoutParams();
                if (layoutParams instanceof q) {
                    ((q) layoutParams).f15983y = true;
                }
                k3.j.b();
            }
        }

        public boolean canRestoreState() {
            int i10 = g.f15959a[this.mStateRestorationPolicy.ordinal()];
            if (i10 != 1) {
                return i10 != 2 || getItemCount() > 0;
            }
            return false;
        }

        public final VH createViewHolder(ViewGroup viewGroup, int i10) {
            try {
                k3.j.a("RV CreateView");
                VH onCreateViewHolder = onCreateViewHolder(viewGroup, i10);
                if (onCreateViewHolder.itemView.getParent() == null) {
                    onCreateViewHolder.mItemViewType = i10;
                    return onCreateViewHolder;
                }
                throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
            } finally {
                k3.j.b();
            }
        }

        public int findRelativeAdapterPositionIn(h<? extends e0> hVar, e0 e0Var, int i10) {
            if (hVar == this) {
                return i10;
            }
            return -1;
        }

        public abstract int getItemCount();

        public long getItemId(int i10) {
            return -1L;
        }

        public int getItemViewType(int i10) {
            return 0;
        }

        public final a getStateRestorationPolicy() {
            return this.mStateRestorationPolicy;
        }

        public final boolean hasObservers() {
            return this.mObservable.a();
        }

        public final boolean hasStableIds() {
            return this.mHasStableIds;
        }

        public final void notifyDataSetChanged() {
            this.mObservable.b();
        }

        public final void notifyItemChanged(int i10) {
            this.mObservable.d(i10, 1);
        }

        public final void notifyItemInserted(int i10) {
            this.mObservable.f(i10, 1);
        }

        public final void notifyItemMoved(int i10, int i11) {
            this.mObservable.c(i10, i11);
        }

        public final void notifyItemRangeChanged(int i10, int i11) {
            this.mObservable.d(i10, i11);
        }

        public final void notifyItemRangeInserted(int i10, int i11) {
            this.mObservable.f(i10, i11);
        }

        public final void notifyItemRangeRemoved(int i10, int i11) {
            this.mObservable.g(i10, i11);
        }

        public final void notifyItemRemoved(int i10) {
            this.mObservable.g(i10, 1);
        }

        public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        }

        public abstract void onBindViewHolder(VH vh2, int i10);

        public void onBindViewHolder(VH vh2, int i10, List<Object> list) {
            onBindViewHolder(vh2, i10);
        }

        public abstract VH onCreateViewHolder(ViewGroup viewGroup, int i10);

        public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        }

        public boolean onFailedToRecycleView(VH vh2) {
            return false;
        }

        public void onViewAttachedToWindow(VH vh2) {
        }

        public void onViewDetachedFromWindow(VH vh2) {
        }

        public void onViewRecycled(VH vh2) {
        }

        public void registerAdapterDataObserver(j jVar) {
            this.mObservable.registerObserver(jVar);
        }

        public void setHasStableIds(boolean z10) {
            if (!hasObservers()) {
                this.mHasStableIds = z10;
                return;
            }
            throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
        }

        public void setStateRestorationPolicy(a aVar) {
            this.mStateRestorationPolicy = aVar;
            this.mObservable.h();
        }

        public void unregisterAdapterDataObserver(j jVar) {
            this.mObservable.unregisterObserver(jVar);
        }

        public final void notifyItemChanged(int i10, Object obj) {
            this.mObservable.e(i10, 1, obj);
        }

        public final void notifyItemRangeChanged(int i10, int i11, Object obj) {
            this.mObservable.e(i10, i11, obj);
        }
    }

    /* loaded from: classes.dex */
    public static class i extends Observable<j> {
        public boolean a() {
            return !((Observable) this).mObservers.isEmpty();
        }

        public void b() {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((j) ((Observable) this).mObservers.get(size)).a();
            }
        }

        public void c(int i10, int i11) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((j) ((Observable) this).mObservers.get(size)).e(i10, i11, 1);
            }
        }

        public void d(int i10, int i11) {
            e(i10, i11, null);
        }

        public void e(int i10, int i11, Object obj) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((j) ((Observable) this).mObservers.get(size)).c(i10, i11, obj);
            }
        }

        public void f(int i10, int i11) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((j) ((Observable) this).mObservers.get(size)).d(i10, i11);
            }
        }

        public void g(int i10, int i11) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((j) ((Observable) this).mObservers.get(size)).f(i10, i11);
            }
        }

        public void h() {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((j) ((Observable) this).mObservers.get(size)).g();
            }
        }
    }

    /* loaded from: classes.dex */
    public static abstract class j {
        public void a() {
        }

        public void b(int i10, int i11) {
        }

        public void c(int i10, int i11, Object obj) {
            b(i10, i11);
        }

        public void d(int i10, int i11) {
        }

        public void e(int i10, int i11, int i12) {
        }

        public void f(int i10, int i11) {
        }

        public void g() {
        }
    }

    /* loaded from: classes.dex */
    public interface k {
        int a(int i10, int i11);
    }

    /* loaded from: classes.dex */
    public static class l {
        public EdgeEffect a(RecyclerView recyclerView, int i10) {
            return new EdgeEffect(recyclerView.getContext());
        }
    }

    /* loaded from: classes.dex */
    public static abstract class m {

        /* renamed from: a  reason: collision with root package name */
        public b f15960a = null;

        /* renamed from: b  reason: collision with root package name */
        public ArrayList<a> f15961b = new ArrayList<>();

        /* renamed from: c  reason: collision with root package name */
        public long f15962c = 120;

        /* renamed from: d  reason: collision with root package name */
        public long f15963d = 120;

        /* renamed from: e  reason: collision with root package name */
        public long f15964e = 250;

        /* renamed from: f  reason: collision with root package name */
        public long f15965f = 250;

        /* loaded from: classes.dex */
        public interface a {
            void a();
        }

        /* loaded from: classes.dex */
        public interface b {
            void a(e0 e0Var);
        }

        /* loaded from: classes.dex */
        public static class c {

            /* renamed from: a  reason: collision with root package name */
            public int f15966a;

            /* renamed from: b  reason: collision with root package name */
            public int f15967b;

            /* renamed from: c  reason: collision with root package name */
            public int f15968c;

            /* renamed from: d  reason: collision with root package name */
            public int f15969d;

            public c a(e0 e0Var) {
                return b(e0Var, 0);
            }

            public c b(e0 e0Var, int i10) {
                View view = e0Var.itemView;
                this.f15966a = view.getLeft();
                this.f15967b = view.getTop();
                this.f15968c = view.getRight();
                this.f15969d = view.getBottom();
                return this;
            }
        }

        public static int e(e0 e0Var) {
            int i10 = e0Var.mFlags & 14;
            if (e0Var.isInvalid()) {
                return 4;
            }
            if ((i10 & 4) == 0) {
                int oldPosition = e0Var.getOldPosition();
                int absoluteAdapterPosition = e0Var.getAbsoluteAdapterPosition();
                return (oldPosition == -1 || absoluteAdapterPosition == -1 || oldPosition == absoluteAdapterPosition) ? i10 : i10 | 2048;
            }
            return i10;
        }

        public abstract boolean a(e0 e0Var, c cVar, c cVar2);

        public abstract boolean b(e0 e0Var, e0 e0Var2, c cVar, c cVar2);

        public abstract boolean c(e0 e0Var, c cVar, c cVar2);

        public abstract boolean d(e0 e0Var, c cVar, c cVar2);

        public abstract boolean f(e0 e0Var);

        public boolean g(e0 e0Var, List<Object> list) {
            return f(e0Var);
        }

        public final void h(e0 e0Var) {
            s(e0Var);
            b bVar = this.f15960a;
            if (bVar != null) {
                bVar.a(e0Var);
            }
        }

        public final void i() {
            int size = this.f15961b.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.f15961b.get(i10).a();
            }
            this.f15961b.clear();
        }

        public abstract void j(e0 e0Var);

        public abstract void k();

        public long l() {
            return this.f15962c;
        }

        public long m() {
            return this.f15965f;
        }

        public long n() {
            return this.f15964e;
        }

        public long o() {
            return this.f15963d;
        }

        public abstract boolean p();

        public final boolean q(a aVar) {
            boolean p10 = p();
            if (aVar != null) {
                if (!p10) {
                    aVar.a();
                } else {
                    this.f15961b.add(aVar);
                }
            }
            return p10;
        }

        public c r() {
            return new c();
        }

        public void s(e0 e0Var) {
        }

        public c t(b0 b0Var, e0 e0Var) {
            return r().a(e0Var);
        }

        public c u(b0 b0Var, e0 e0Var, int i10, List<Object> list) {
            return r().a(e0Var);
        }

        public abstract void v();

        public void w(long j10) {
            this.f15962c = j10;
        }

        public void x(b bVar) {
            this.f15960a = bVar;
        }
    }

    /* loaded from: classes.dex */
    public class n implements m.b {
        public n() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.m.b
        public void a(e0 e0Var) {
            e0Var.setIsRecyclable(true);
            if (e0Var.mShadowedHolder != null && e0Var.mShadowingHolder == null) {
                e0Var.mShadowedHolder = null;
            }
            e0Var.mShadowingHolder = null;
            if (e0Var.shouldBeKeptAsChild() || RecyclerView.this.b1(e0Var.itemView) || !e0Var.isTmpDetached()) {
                return;
            }
            RecyclerView.this.removeDetachedView(e0Var.itemView, false);
        }
    }

    /* loaded from: classes.dex */
    public static abstract class o {
        @Deprecated
        public void f(Rect rect, int i10, RecyclerView recyclerView) {
            rect.set(0, 0, 0, 0);
        }

        public void g(Rect rect, View view, RecyclerView recyclerView, b0 b0Var) {
            f(rect, ((q) view.getLayoutParams()).a(), recyclerView);
        }

        @Deprecated
        public void h(Canvas canvas, RecyclerView recyclerView) {
        }

        public void i(Canvas canvas, RecyclerView recyclerView, b0 b0Var) {
            h(canvas, recyclerView);
        }

        @Deprecated
        public void j(Canvas canvas, RecyclerView recyclerView) {
        }

        public void k(Canvas canvas, RecyclerView recyclerView, b0 b0Var) {
            j(canvas, recyclerView);
        }
    }

    /* loaded from: classes.dex */
    public static abstract class p {
        public androidx.recyclerview.widget.e0 A;
        public androidx.recyclerview.widget.e0 B;
        public a0 C;
        public boolean D;
        public boolean E;
        public boolean F;
        public boolean G;
        public boolean H;
        public int I;
        public boolean J;
        public int K;
        public int L;
        public int M;
        public int N;

        /* renamed from: w  reason: collision with root package name */
        public androidx.recyclerview.widget.f f15971w;

        /* renamed from: x  reason: collision with root package name */
        public RecyclerView f15972x;

        /* renamed from: y  reason: collision with root package name */
        public final e0.b f15973y;

        /* renamed from: z  reason: collision with root package name */
        public final e0.b f15974z;

        /* loaded from: classes.dex */
        public class a implements e0.b {
            public a() {
            }

            @Override // androidx.recyclerview.widget.e0.b
            public View a(int i10) {
                return p.this.T(i10);
            }

            @Override // androidx.recyclerview.widget.e0.b
            public int b(View view) {
                return p.this.b0(view) - ((ViewGroup.MarginLayoutParams) ((q) view.getLayoutParams())).leftMargin;
            }

            @Override // androidx.recyclerview.widget.e0.b
            public int c() {
                return p.this.getPaddingLeft();
            }

            @Override // androidx.recyclerview.widget.e0.b
            public int d() {
                return p.this.v0() - p.this.getPaddingRight();
            }

            @Override // androidx.recyclerview.widget.e0.b
            public int e(View view) {
                return p.this.e0(view) + ((ViewGroup.MarginLayoutParams) ((q) view.getLayoutParams())).rightMargin;
            }
        }

        /* loaded from: classes.dex */
        public class b implements e0.b {
            public b() {
            }

            @Override // androidx.recyclerview.widget.e0.b
            public View a(int i10) {
                return p.this.T(i10);
            }

            @Override // androidx.recyclerview.widget.e0.b
            public int b(View view) {
                return p.this.f0(view) - ((ViewGroup.MarginLayoutParams) ((q) view.getLayoutParams())).topMargin;
            }

            @Override // androidx.recyclerview.widget.e0.b
            public int c() {
                return p.this.getPaddingTop();
            }

            @Override // androidx.recyclerview.widget.e0.b
            public int d() {
                return p.this.h0() - p.this.getPaddingBottom();
            }

            @Override // androidx.recyclerview.widget.e0.b
            public int e(View view) {
                return p.this.Z(view) + ((ViewGroup.MarginLayoutParams) ((q) view.getLayoutParams())).bottomMargin;
            }
        }

        /* loaded from: classes.dex */
        public interface c {
            void a(int i10, int i11);
        }

        /* loaded from: classes.dex */
        public static class d {

            /* renamed from: a  reason: collision with root package name */
            public int f15977a;

            /* renamed from: b  reason: collision with root package name */
            public int f15978b;

            /* renamed from: c  reason: collision with root package name */
            public boolean f15979c;

            /* renamed from: d  reason: collision with root package name */
            public boolean f15980d;
        }

        public p() {
            a aVar = new a();
            this.f15973y = aVar;
            b bVar = new b();
            this.f15974z = bVar;
            this.A = new androidx.recyclerview.widget.e0(aVar);
            this.B = new androidx.recyclerview.widget.e0(bVar);
            this.D = false;
            this.E = false;
            this.F = false;
            this.G = true;
            this.H = true;
        }

        public static boolean E0(int i10, int i11, int i12) {
            int mode = View.MeasureSpec.getMode(i11);
            int size = View.MeasureSpec.getSize(i11);
            if (i12 <= 0 || i10 == i12) {
                if (mode == Integer.MIN_VALUE) {
                    return size >= i10;
                } else if (mode != 0) {
                    return mode == 1073741824 && size == i10;
                } else {
                    return true;
                }
            }
            return false;
        }

        /* JADX WARN: Code restructure failed: missing block: B:9:0x0017, code lost:
            if (r5 == 1073741824) goto L8;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static int V(int r4, int r5, int r6, int r7, boolean r8) {
            /*
                int r4 = r4 - r6
                r6 = 0
                int r4 = java.lang.Math.max(r6, r4)
                r0 = -2
                r1 = -1
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = 1073741824(0x40000000, float:2.0)
                if (r8 == 0) goto L1a
                if (r7 < 0) goto L11
                goto L1c
            L11:
                if (r7 != r1) goto L2f
                if (r5 == r2) goto L20
                if (r5 == 0) goto L2f
                if (r5 == r3) goto L20
                goto L2f
            L1a:
                if (r7 < 0) goto L1e
            L1c:
                r5 = r3
                goto L31
            L1e:
                if (r7 != r1) goto L22
            L20:
                r7 = r4
                goto L31
            L22:
                if (r7 != r0) goto L2f
                if (r5 == r2) goto L2c
                if (r5 != r3) goto L29
                goto L2c
            L29:
                r7 = r4
                r5 = r6
                goto L31
            L2c:
                r7 = r4
                r5 = r2
                goto L31
            L2f:
                r5 = r6
                r7 = r5
            L31:
                int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r5)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.p.V(int, int, int, int, boolean):int");
        }

        public static d p0(Context context, AttributeSet attributeSet, int i10, int i11) {
            d dVar = new d();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, u4.d.f54374f, i10, i11);
            dVar.f15977a = obtainStyledAttributes.getInt(u4.d.f54375g, 1);
            dVar.f15978b = obtainStyledAttributes.getInt(u4.d.f54385q, 1);
            dVar.f15979c = obtainStyledAttributes.getBoolean(u4.d.f54384p, false);
            dVar.f15980d = obtainStyledAttributes.getBoolean(u4.d.f54386r, false);
            obtainStyledAttributes.recycle();
            return dVar;
        }

        public static int y(int i10, int i11, int i12) {
            int mode = View.MeasureSpec.getMode(i10);
            int size = View.MeasureSpec.getSize(i10);
            if (mode != Integer.MIN_VALUE) {
                return mode != 1073741824 ? Math.max(i11, i12) : size;
            }
            return Math.min(size, Math.max(i11, i12));
        }

        public void A(int i10, c cVar) {
        }

        public final boolean A0(RecyclerView recyclerView, int i10, int i11) {
            View focusedChild = recyclerView.getFocusedChild();
            if (focusedChild == null) {
                return false;
            }
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            int v02 = v0() - getPaddingRight();
            int h02 = h0() - getPaddingBottom();
            Rect rect = this.f15972x.E;
            a0(focusedChild, rect);
            return rect.left - i10 < v02 && rect.right - i10 > paddingLeft && rect.top - i11 < h02 && rect.bottom - i11 > paddingTop;
        }

        public boolean A1(RecyclerView recyclerView, View view, Rect rect, boolean z10) {
            return B1(recyclerView, view, rect, z10, false);
        }

        public int B(b0 b0Var) {
            return 0;
        }

        public final boolean B0() {
            return this.H;
        }

        public boolean B1(RecyclerView recyclerView, View view, Rect rect, boolean z10, boolean z11) {
            int[] W = W(view, rect);
            int i10 = W[0];
            int i11 = W[1];
            if ((!z11 || A0(recyclerView, i10, i11)) && !(i10 == 0 && i11 == 0)) {
                if (z10) {
                    recyclerView.scrollBy(i10, i11);
                } else {
                    recyclerView.t1(i10, i11);
                }
                return true;
            }
            return false;
        }

        public int C(b0 b0Var) {
            return 0;
        }

        public boolean C0(w wVar, b0 b0Var) {
            return false;
        }

        public void C1() {
            RecyclerView recyclerView = this.f15972x;
            if (recyclerView != null) {
                recyclerView.requestLayout();
            }
        }

        public int D(b0 b0Var) {
            return 0;
        }

        public boolean D0() {
            return this.G;
        }

        public void D1() {
            this.D = true;
        }

        public int E(b0 b0Var) {
            return 0;
        }

        public final void E1(w wVar, int i10, View view) {
            e0 i02 = RecyclerView.i0(view);
            if (i02.shouldIgnore()) {
                return;
            }
            if (i02.isInvalid() && !i02.isRemoved() && !this.f15972x.H.hasStableIds()) {
                z1(i10);
                wVar.C(i02);
                return;
            }
            I(i10);
            wVar.D(view);
            this.f15972x.B.k(i02);
        }

        public int F(b0 b0Var) {
            return 0;
        }

        public boolean F0() {
            a0 a0Var = this.C;
            return a0Var != null && a0Var.h();
        }

        public int F1(int i10, w wVar, b0 b0Var) {
            return 0;
        }

        public int G(b0 b0Var) {
            return 0;
        }

        public boolean G0(View view, boolean z10, boolean z11) {
            boolean z12 = this.A.b(view, 24579) && this.B.b(view, 24579);
            return z10 ? z12 : !z12;
        }

        public void G1(int i10) {
        }

        public void H(w wVar) {
            for (int U = U() - 1; U >= 0; U--) {
                E1(wVar, U, T(U));
            }
        }

        public void H0(View view, int i10, int i11, int i12, int i13) {
            q qVar = (q) view.getLayoutParams();
            Rect rect = qVar.f15982x;
            view.layout(i10 + rect.left + ((ViewGroup.MarginLayoutParams) qVar).leftMargin, i11 + rect.top + ((ViewGroup.MarginLayoutParams) qVar).topMargin, (i12 - rect.right) - ((ViewGroup.MarginLayoutParams) qVar).rightMargin, (i13 - rect.bottom) - ((ViewGroup.MarginLayoutParams) qVar).bottomMargin);
        }

        public int H1(int i10, w wVar, b0 b0Var) {
            return 0;
        }

        public void I(int i10) {
            J(i10, T(i10));
        }

        public void I0(View view, int i10, int i11) {
            q qVar = (q) view.getLayoutParams();
            Rect n02 = this.f15972x.n0(view);
            int i12 = i10 + n02.left + n02.right;
            int i13 = i11 + n02.top + n02.bottom;
            int V = V(v0(), w0(), getPaddingLeft() + getPaddingRight() + ((ViewGroup.MarginLayoutParams) qVar).leftMargin + ((ViewGroup.MarginLayoutParams) qVar).rightMargin + i12, ((ViewGroup.MarginLayoutParams) qVar).width, v());
            int V2 = V(h0(), i0(), getPaddingTop() + getPaddingBottom() + ((ViewGroup.MarginLayoutParams) qVar).topMargin + ((ViewGroup.MarginLayoutParams) qVar).bottomMargin + i13, ((ViewGroup.MarginLayoutParams) qVar).height, w());
            if (O1(view, V, V2, qVar)) {
                view.measure(V, V2);
            }
        }

        public void I1(RecyclerView recyclerView) {
            J1(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
        }

        public final void J(int i10, View view) {
            this.f15971w.d(i10);
        }

        public void J0(int i10, int i11) {
            View T = T(i10);
            if (T != null) {
                I(i10);
                s(T, i11);
                return;
            }
            throw new IllegalArgumentException("Cannot move a child from non-existing index:" + i10 + this.f15972x.toString());
        }

        public void J1(int i10, int i11) {
            this.M = View.MeasureSpec.getSize(i10);
            int mode = View.MeasureSpec.getMode(i10);
            this.K = mode;
            if (mode == 0 && !RecyclerView.f15881a1) {
                this.M = 0;
            }
            this.N = View.MeasureSpec.getSize(i11);
            int mode2 = View.MeasureSpec.getMode(i11);
            this.L = mode2;
            if (mode2 != 0 || RecyclerView.f15881a1) {
                return;
            }
            this.N = 0;
        }

        public void K(RecyclerView recyclerView) {
            this.E = true;
            O0(recyclerView);
        }

        public void K0(int i10) {
            RecyclerView recyclerView = this.f15972x;
            if (recyclerView != null) {
                recyclerView.F0(i10);
            }
        }

        public void K1(int i10, int i11) {
            this.f15972x.setMeasuredDimension(i10, i11);
        }

        public void L(RecyclerView recyclerView, w wVar) {
            this.E = false;
            Q0(recyclerView, wVar);
        }

        public void L0(int i10) {
            RecyclerView recyclerView = this.f15972x;
            if (recyclerView != null) {
                recyclerView.G0(i10);
            }
        }

        public void L1(Rect rect, int i10, int i11) {
            K1(y(i10, rect.width() + getPaddingLeft() + getPaddingRight(), n0()), y(i11, rect.height() + getPaddingTop() + getPaddingBottom(), m0()));
        }

        public View M(View view) {
            View T;
            RecyclerView recyclerView = this.f15972x;
            if (recyclerView == null || (T = recyclerView.T(view)) == null || this.f15971w.n(T)) {
                return null;
            }
            return T;
        }

        public void M0(h hVar, h hVar2) {
        }

        public void M1(int i10, int i11) {
            int U = U();
            if (U == 0) {
                this.f15972x.x(i10, i11);
                return;
            }
            int i12 = Integer.MIN_VALUE;
            int i13 = Integer.MAX_VALUE;
            int i14 = Integer.MAX_VALUE;
            int i15 = Integer.MIN_VALUE;
            for (int i16 = 0; i16 < U; i16++) {
                View T = T(i16);
                Rect rect = this.f15972x.E;
                a0(T, rect);
                int i17 = rect.left;
                if (i17 < i13) {
                    i13 = i17;
                }
                int i18 = rect.right;
                if (i18 > i12) {
                    i12 = i18;
                }
                int i19 = rect.top;
                if (i19 < i14) {
                    i14 = i19;
                }
                int i20 = rect.bottom;
                if (i20 > i15) {
                    i15 = i20;
                }
            }
            this.f15972x.E.set(i13, i14, i12, i15);
            L1(this.f15972x.E, i10, i11);
        }

        public View N(int i10) {
            int U = U();
            for (int i11 = 0; i11 < U; i11++) {
                View T = T(i11);
                e0 i02 = RecyclerView.i0(T);
                if (i02 != null && i02.getLayoutPosition() == i10 && !i02.shouldIgnore() && (this.f15972x.E0.e() || !i02.isRemoved())) {
                    return T;
                }
            }
            return null;
        }

        public boolean N0(RecyclerView recyclerView, ArrayList<View> arrayList, int i10, int i11) {
            return false;
        }

        public void N1(RecyclerView recyclerView) {
            if (recyclerView == null) {
                this.f15972x = null;
                this.f15971w = null;
                this.M = 0;
                this.N = 0;
            } else {
                this.f15972x = recyclerView;
                this.f15971w = recyclerView.A;
                this.M = recyclerView.getWidth();
                this.N = recyclerView.getHeight();
            }
            this.K = 1073741824;
            this.L = 1073741824;
        }

        public abstract q O();

        public void O0(RecyclerView recyclerView) {
        }

        public boolean O1(View view, int i10, int i11, q qVar) {
            return (!view.isLayoutRequested() && this.G && E0(view.getWidth(), i10, ((ViewGroup.MarginLayoutParams) qVar).width) && E0(view.getHeight(), i11, ((ViewGroup.MarginLayoutParams) qVar).height)) ? false : true;
        }

        public q P(Context context, AttributeSet attributeSet) {
            return new q(context, attributeSet);
        }

        @Deprecated
        public void P0(RecyclerView recyclerView) {
        }

        public boolean P1() {
            return false;
        }

        public q Q(ViewGroup.LayoutParams layoutParams) {
            if (layoutParams instanceof q) {
                return new q((q) layoutParams);
            }
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                return new q((ViewGroup.MarginLayoutParams) layoutParams);
            }
            return new q(layoutParams);
        }

        public void Q0(RecyclerView recyclerView, w wVar) {
            P0(recyclerView);
        }

        public boolean Q1(View view, int i10, int i11, q qVar) {
            return (this.G && E0(view.getMeasuredWidth(), i10, ((ViewGroup.MarginLayoutParams) qVar).width) && E0(view.getMeasuredHeight(), i11, ((ViewGroup.MarginLayoutParams) qVar).height)) ? false : true;
        }

        public int R() {
            return -1;
        }

        public View R0(View view, int i10, w wVar, b0 b0Var) {
            return null;
        }

        public void R1(RecyclerView recyclerView, b0 b0Var, int i10) {
            Log.e("RecyclerView", "You must override smoothScrollToPosition to support smooth scrolling");
        }

        public int S(View view) {
            return ((q) view.getLayoutParams()).f15982x.bottom;
        }

        public void S0(AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.f15972x;
            T0(recyclerView.f15912x, recyclerView.E0, accessibilityEvent);
        }

        public void S1(a0 a0Var) {
            a0 a0Var2 = this.C;
            if (a0Var2 != null && a0Var != a0Var2 && a0Var2.h()) {
                this.C.r();
            }
            this.C = a0Var;
            a0Var.q(this.f15972x, this);
        }

        public View T(int i10) {
            androidx.recyclerview.widget.f fVar = this.f15971w;
            if (fVar != null) {
                return fVar.f(i10);
            }
            return null;
        }

        public void T0(w wVar, b0 b0Var, AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.f15972x;
            if (recyclerView == null || accessibilityEvent == null) {
                return;
            }
            boolean z10 = true;
            if (!recyclerView.canScrollVertically(1) && !this.f15972x.canScrollVertically(-1) && !this.f15972x.canScrollHorizontally(-1) && !this.f15972x.canScrollHorizontally(1)) {
                z10 = false;
            }
            accessibilityEvent.setScrollable(z10);
            h hVar = this.f15972x.H;
            if (hVar != null) {
                accessibilityEvent.setItemCount(hVar.getItemCount());
            }
        }

        public void T1() {
            a0 a0Var = this.C;
            if (a0Var != null) {
                a0Var.r();
            }
        }

        public int U() {
            androidx.recyclerview.widget.f fVar = this.f15971w;
            if (fVar != null) {
                return fVar.g();
            }
            return 0;
        }

        public void U0(w wVar, b0 b0Var, p3.c cVar) {
            if (this.f15972x.canScrollVertically(-1) || this.f15972x.canScrollHorizontally(-1)) {
                cVar.a(8192);
                cVar.B0(true);
            }
            if (this.f15972x.canScrollVertically(1) || this.f15972x.canScrollHorizontally(1)) {
                cVar.a(4096);
                cVar.B0(true);
            }
            cVar.d0(c.b.a(r0(wVar, b0Var), Y(wVar, b0Var), C0(wVar, b0Var), s0(wVar, b0Var)));
        }

        public boolean U1() {
            return false;
        }

        public void V0(p3.c cVar) {
            RecyclerView recyclerView = this.f15972x;
            U0(recyclerView.f15912x, recyclerView.E0, cVar);
        }

        public final int[] W(View view, Rect rect) {
            int[] iArr = new int[2];
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            int v02 = v0() - getPaddingRight();
            int h02 = h0() - getPaddingBottom();
            int left = (view.getLeft() + rect.left) - view.getScrollX();
            int top = (view.getTop() + rect.top) - view.getScrollY();
            int width = rect.width() + left;
            int height = rect.height() + top;
            int i10 = left - paddingLeft;
            int min = Math.min(0, i10);
            int i11 = top - paddingTop;
            int min2 = Math.min(0, i11);
            int i12 = width - v02;
            int max = Math.max(0, i12);
            int max2 = Math.max(0, height - h02);
            if (k0() != 1) {
                if (min == 0) {
                    min = Math.min(i10, max);
                }
                max = min;
            } else if (max == 0) {
                max = Math.max(min, i12);
            }
            if (min2 == 0) {
                min2 = Math.min(i11, max2);
            }
            iArr[0] = max;
            iArr[1] = min2;
            return iArr;
        }

        public void W0(View view, p3.c cVar) {
            e0 i02 = RecyclerView.i0(view);
            if (i02 == null || i02.isRemoved() || this.f15971w.n(i02.itemView)) {
                return;
            }
            RecyclerView recyclerView = this.f15972x;
            X0(recyclerView.f15912x, recyclerView.E0, view, cVar);
        }

        public boolean X() {
            RecyclerView recyclerView = this.f15972x;
            return recyclerView != null && recyclerView.C;
        }

        public void X0(w wVar, b0 b0Var, View view, p3.c cVar) {
        }

        public int Y(w wVar, b0 b0Var) {
            return -1;
        }

        public View Y0(View view, int i10) {
            return null;
        }

        public int Z(View view) {
            return view.getBottom() + S(view);
        }

        public void Z0(RecyclerView recyclerView, int i10, int i11) {
        }

        public void a0(View view, Rect rect) {
            RecyclerView.k0(view, rect);
        }

        public void a1(RecyclerView recyclerView) {
        }

        public int b0(View view) {
            return view.getLeft() - l0(view);
        }

        public void b1(RecyclerView recyclerView, int i10, int i11, int i12) {
        }

        public int c0(View view) {
            Rect rect = ((q) view.getLayoutParams()).f15982x;
            return view.getMeasuredHeight() + rect.top + rect.bottom;
        }

        public void c1(RecyclerView recyclerView, int i10, int i11) {
        }

        public int d0(View view) {
            Rect rect = ((q) view.getLayoutParams()).f15982x;
            return view.getMeasuredWidth() + rect.left + rect.right;
        }

        public void d1(RecyclerView recyclerView, int i10, int i11) {
        }

        public int e0(View view) {
            return view.getRight() + q0(view);
        }

        public void e1(RecyclerView recyclerView, int i10, int i11, Object obj) {
            d1(recyclerView, i10, i11);
        }

        public int f0(View view) {
            return view.getTop() - t0(view);
        }

        public void f1(w wVar, b0 b0Var) {
            Log.e("RecyclerView", "You must override onLayoutChildren(Recycler recycler, State state) ");
        }

        public View g0() {
            View focusedChild;
            RecyclerView recyclerView = this.f15972x;
            if (recyclerView == null || (focusedChild = recyclerView.getFocusedChild()) == null || this.f15971w.n(focusedChild)) {
                return null;
            }
            return focusedChild;
        }

        public void g1(b0 b0Var) {
        }

        public int getPaddingBottom() {
            RecyclerView recyclerView = this.f15972x;
            if (recyclerView != null) {
                return recyclerView.getPaddingBottom();
            }
            return 0;
        }

        public int getPaddingEnd() {
            RecyclerView recyclerView = this.f15972x;
            if (recyclerView != null) {
                return o3.c0.I(recyclerView);
            }
            return 0;
        }

        public int getPaddingLeft() {
            RecyclerView recyclerView = this.f15972x;
            if (recyclerView != null) {
                return recyclerView.getPaddingLeft();
            }
            return 0;
        }

        public int getPaddingRight() {
            RecyclerView recyclerView = this.f15972x;
            if (recyclerView != null) {
                return recyclerView.getPaddingRight();
            }
            return 0;
        }

        public int getPaddingStart() {
            RecyclerView recyclerView = this.f15972x;
            if (recyclerView != null) {
                return o3.c0.J(recyclerView);
            }
            return 0;
        }

        public int getPaddingTop() {
            RecyclerView recyclerView = this.f15972x;
            if (recyclerView != null) {
                return recyclerView.getPaddingTop();
            }
            return 0;
        }

        public int h0() {
            return this.N;
        }

        public void h1(w wVar, b0 b0Var, int i10, int i11) {
            this.f15972x.x(i10, i11);
        }

        public int i0() {
            return this.L;
        }

        @Deprecated
        public boolean i1(RecyclerView recyclerView, View view, View view2) {
            return F0() || recyclerView.z0();
        }

        public int j0() {
            RecyclerView recyclerView = this.f15972x;
            h adapter = recyclerView != null ? recyclerView.getAdapter() : null;
            if (adapter != null) {
                return adapter.getItemCount();
            }
            return 0;
        }

        public boolean j1(RecyclerView recyclerView, b0 b0Var, View view, View view2) {
            return i1(recyclerView, view, view2);
        }

        public int k0() {
            return o3.c0.E(this.f15972x);
        }

        public void k1(Parcelable parcelable) {
        }

        public int l0(View view) {
            return ((q) view.getLayoutParams()).f15982x.left;
        }

        public Parcelable l1() {
            return null;
        }

        public void m(View view) {
            n(view, -1);
        }

        public int m0() {
            return o3.c0.F(this.f15972x);
        }

        public void m1(int i10) {
        }

        public void n(View view, int i10) {
            q(view, i10, true);
        }

        public int n0() {
            return o3.c0.G(this.f15972x);
        }

        public void n1(a0 a0Var) {
            if (this.C == a0Var) {
                this.C = null;
            }
        }

        public void o(View view) {
            p(view, -1);
        }

        public int o0(View view) {
            return ((q) view.getLayoutParams()).a();
        }

        public boolean o1(int i10, Bundle bundle) {
            RecyclerView recyclerView = this.f15972x;
            return p1(recyclerView.f15912x, recyclerView.E0, i10, bundle);
        }

        public void p(View view, int i10) {
            q(view, i10, false);
        }

        public boolean p1(w wVar, b0 b0Var, int i10, Bundle bundle) {
            int h02;
            int v02;
            int i11;
            int i12;
            RecyclerView recyclerView = this.f15972x;
            if (recyclerView == null) {
                return false;
            }
            if (i10 == 4096) {
                h02 = recyclerView.canScrollVertically(1) ? (h0() - getPaddingTop()) - getPaddingBottom() : 0;
                if (this.f15972x.canScrollHorizontally(1)) {
                    v02 = (v0() - getPaddingLeft()) - getPaddingRight();
                    i11 = h02;
                    i12 = v02;
                }
                i11 = h02;
                i12 = 0;
            } else if (i10 != 8192) {
                i12 = 0;
                i11 = 0;
            } else {
                h02 = recyclerView.canScrollVertically(-1) ? -((h0() - getPaddingTop()) - getPaddingBottom()) : 0;
                if (this.f15972x.canScrollHorizontally(-1)) {
                    v02 = -((v0() - getPaddingLeft()) - getPaddingRight());
                    i11 = h02;
                    i12 = v02;
                }
                i11 = h02;
                i12 = 0;
            }
            if (i11 == 0 && i12 == 0) {
                return false;
            }
            this.f15972x.w1(i12, i11, null, Integer.MIN_VALUE, true);
            return true;
        }

        public final void q(View view, int i10, boolean z10) {
            e0 i02 = RecyclerView.i0(view);
            if (!z10 && !i02.isRemoved()) {
                this.f15972x.B.p(i02);
            } else {
                this.f15972x.B.b(i02);
            }
            q qVar = (q) view.getLayoutParams();
            if (!i02.wasReturnedFromScrap() && !i02.isScrap()) {
                if (view.getParent() == this.f15972x) {
                    int m10 = this.f15971w.m(view);
                    if (i10 == -1) {
                        i10 = this.f15971w.g();
                    }
                    if (m10 == -1) {
                        throw new IllegalStateException("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:" + this.f15972x.indexOfChild(view) + this.f15972x.Q());
                    } else if (m10 != i10) {
                        this.f15972x.I.J0(m10, i10);
                    }
                } else {
                    this.f15971w.a(view, i10, false);
                    qVar.f15983y = true;
                    a0 a0Var = this.C;
                    if (a0Var != null && a0Var.h()) {
                        this.C.k(view);
                    }
                }
            } else {
                if (i02.isScrap()) {
                    i02.unScrap();
                } else {
                    i02.clearReturnedFromScrapFlag();
                }
                this.f15971w.c(view, i10, view.getLayoutParams(), false);
            }
            if (qVar.f15984z) {
                i02.itemView.invalidate();
                qVar.f15984z = false;
            }
        }

        public int q0(View view) {
            return ((q) view.getLayoutParams()).f15982x.right;
        }

        public boolean q1(View view, int i10, Bundle bundle) {
            RecyclerView recyclerView = this.f15972x;
            return r1(recyclerView.f15912x, recyclerView.E0, view, i10, bundle);
        }

        public void r(String str) {
            RecyclerView recyclerView = this.f15972x;
            if (recyclerView != null) {
                recyclerView.o(str);
            }
        }

        public int r0(w wVar, b0 b0Var) {
            return -1;
        }

        public boolean r1(w wVar, b0 b0Var, View view, int i10, Bundle bundle) {
            return false;
        }

        public void s(View view, int i10) {
            t(view, i10, (q) view.getLayoutParams());
        }

        public int s0(w wVar, b0 b0Var) {
            return 0;
        }

        public void s1() {
            for (int U = U() - 1; U >= 0; U--) {
                this.f15971w.q(U);
            }
        }

        public void t(View view, int i10, q qVar) {
            e0 i02 = RecyclerView.i0(view);
            if (i02.isRemoved()) {
                this.f15972x.B.b(i02);
            } else {
                this.f15972x.B.p(i02);
            }
            this.f15971w.c(view, i10, qVar, i02.isRemoved());
        }

        public int t0(View view) {
            return ((q) view.getLayoutParams()).f15982x.top;
        }

        public void t1(w wVar) {
            for (int U = U() - 1; U >= 0; U--) {
                if (!RecyclerView.i0(T(U)).shouldIgnore()) {
                    w1(U, wVar);
                }
            }
        }

        public void u(View view, Rect rect) {
            RecyclerView recyclerView = this.f15972x;
            if (recyclerView == null) {
                rect.set(0, 0, 0, 0);
            } else {
                rect.set(recyclerView.n0(view));
            }
        }

        public void u0(View view, boolean z10, Rect rect) {
            Matrix matrix;
            if (z10) {
                Rect rect2 = ((q) view.getLayoutParams()).f15982x;
                rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
            } else {
                rect.set(0, 0, view.getWidth(), view.getHeight());
            }
            if (this.f15972x != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
                RectF rectF = this.f15972x.G;
                rectF.set(rect);
                matrix.mapRect(rectF);
                rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
            }
            rect.offset(view.getLeft(), view.getTop());
        }

        public void u1(w wVar) {
            int j10 = wVar.j();
            for (int i10 = j10 - 1; i10 >= 0; i10--) {
                View n10 = wVar.n(i10);
                e0 i02 = RecyclerView.i0(n10);
                if (!i02.shouldIgnore()) {
                    i02.setIsRecyclable(false);
                    if (i02.isTmpDetached()) {
                        this.f15972x.removeDetachedView(n10, false);
                    }
                    m mVar = this.f15972x.f15900m0;
                    if (mVar != null) {
                        mVar.j(i02);
                    }
                    i02.setIsRecyclable(true);
                    wVar.y(n10);
                }
            }
            wVar.e();
            if (j10 > 0) {
                this.f15972x.invalidate();
            }
        }

        public boolean v() {
            return false;
        }

        public int v0() {
            return this.M;
        }

        public void v1(View view, w wVar) {
            y1(view);
            wVar.B(view);
        }

        public boolean w() {
            return false;
        }

        public int w0() {
            return this.K;
        }

        public void w1(int i10, w wVar) {
            View T = T(i10);
            z1(i10);
            wVar.B(T);
        }

        public boolean x(q qVar) {
            return qVar != null;
        }

        public boolean x0() {
            int U = U();
            for (int i10 = 0; i10 < U; i10++) {
                ViewGroup.LayoutParams layoutParams = T(i10).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    return true;
                }
            }
            return false;
        }

        public boolean x1(Runnable runnable) {
            RecyclerView recyclerView = this.f15972x;
            if (recyclerView != null) {
                return recyclerView.removeCallbacks(runnable);
            }
            return false;
        }

        public boolean y0() {
            return this.E;
        }

        public void y1(View view) {
            this.f15971w.p(view);
        }

        public void z(int i10, int i11, b0 b0Var, c cVar) {
        }

        public boolean z0() {
            return this.F;
        }

        public void z1(int i10) {
            if (T(i10) != null) {
                this.f15971w.q(i10);
            }
        }
    }

    /* loaded from: classes.dex */
    public interface r {
        void b(View view);

        void d(View view);
    }

    /* loaded from: classes.dex */
    public static abstract class s {
        public abstract boolean a(int i10, int i11);
    }

    /* loaded from: classes.dex */
    public interface t {
        void a(RecyclerView recyclerView, MotionEvent motionEvent);

        boolean c(RecyclerView recyclerView, MotionEvent motionEvent);

        void e(boolean z10);
    }

    /* loaded from: classes.dex */
    public static abstract class u {
        public void a(RecyclerView recyclerView, int i10) {
        }

        public void b(RecyclerView recyclerView, int i10, int i11) {
        }
    }

    /* loaded from: classes.dex */
    public static class v {

        /* renamed from: a  reason: collision with root package name */
        public SparseArray<a> f15985a = new SparseArray<>();

        /* renamed from: b  reason: collision with root package name */
        public int f15986b = 0;

        /* loaded from: classes.dex */
        public static class a {

            /* renamed from: a  reason: collision with root package name */
            public final ArrayList<e0> f15987a = new ArrayList<>();

            /* renamed from: b  reason: collision with root package name */
            public int f15988b = 5;

            /* renamed from: c  reason: collision with root package name */
            public long f15989c = 0;

            /* renamed from: d  reason: collision with root package name */
            public long f15990d = 0;
        }

        public void a() {
            this.f15986b++;
        }

        public void b() {
            for (int i10 = 0; i10 < this.f15985a.size(); i10++) {
                this.f15985a.valueAt(i10).f15987a.clear();
            }
        }

        public void c() {
            this.f15986b--;
        }

        public void d(int i10, long j10) {
            a g10 = g(i10);
            g10.f15990d = j(g10.f15990d, j10);
        }

        public void e(int i10, long j10) {
            a g10 = g(i10);
            g10.f15989c = j(g10.f15989c, j10);
        }

        public e0 f(int i10) {
            a aVar = this.f15985a.get(i10);
            if (aVar == null || aVar.f15987a.isEmpty()) {
                return null;
            }
            ArrayList<e0> arrayList = aVar.f15987a;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (!arrayList.get(size).isAttachedToTransitionOverlay()) {
                    return arrayList.remove(size);
                }
            }
            return null;
        }

        public final a g(int i10) {
            a aVar = this.f15985a.get(i10);
            if (aVar == null) {
                a aVar2 = new a();
                this.f15985a.put(i10, aVar2);
                return aVar2;
            }
            return aVar;
        }

        public void h(h hVar, h hVar2, boolean z10) {
            if (hVar != null) {
                c();
            }
            if (!z10 && this.f15986b == 0) {
                b();
            }
            if (hVar2 != null) {
                a();
            }
        }

        public void i(e0 e0Var) {
            int itemViewType = e0Var.getItemViewType();
            ArrayList<e0> arrayList = g(itemViewType).f15987a;
            if (this.f15985a.get(itemViewType).f15988b <= arrayList.size()) {
                return;
            }
            e0Var.resetInternal();
            arrayList.add(e0Var);
        }

        public long j(long j10, long j11) {
            return j10 == 0 ? j11 : ((j10 / 4) * 3) + (j11 / 4);
        }

        public boolean k(int i10, long j10, long j11) {
            long j12 = g(i10).f15990d;
            return j12 == 0 || j10 + j12 < j11;
        }

        public boolean l(int i10, long j10, long j11) {
            long j12 = g(i10).f15989c;
            return j12 == 0 || j10 + j12 < j11;
        }
    }

    /* loaded from: classes.dex */
    public final class w {

        /* renamed from: a  reason: collision with root package name */
        public final ArrayList<e0> f15991a;

        /* renamed from: b  reason: collision with root package name */
        public ArrayList<e0> f15992b;

        /* renamed from: c  reason: collision with root package name */
        public final ArrayList<e0> f15993c;

        /* renamed from: d  reason: collision with root package name */
        public final List<e0> f15994d;

        /* renamed from: e  reason: collision with root package name */
        public int f15995e;

        /* renamed from: f  reason: collision with root package name */
        public int f15996f;

        /* renamed from: g  reason: collision with root package name */
        public v f15997g;

        public w() {
            ArrayList<e0> arrayList = new ArrayList<>();
            this.f15991a = arrayList;
            this.f15992b = null;
            this.f15993c = new ArrayList<>();
            this.f15994d = Collections.unmodifiableList(arrayList);
            this.f15995e = 2;
            this.f15996f = 2;
        }

        public void A(int i10) {
            a(this.f15993c.get(i10), true);
            this.f15993c.remove(i10);
        }

        public void B(View view) {
            e0 i02 = RecyclerView.i0(view);
            if (i02.isTmpDetached()) {
                RecyclerView.this.removeDetachedView(view, false);
            }
            if (i02.isScrap()) {
                i02.unScrap();
            } else if (i02.wasReturnedFromScrap()) {
                i02.clearReturnedFromScrapFlag();
            }
            C(i02);
            if (RecyclerView.this.f15900m0 == null || i02.isRecyclable()) {
                return;
            }
            RecyclerView.this.f15900m0.j(i02);
        }

        public void C(e0 e0Var) {
            boolean z10;
            boolean z11 = true;
            if (!e0Var.isScrap() && e0Var.itemView.getParent() == null) {
                if (!e0Var.isTmpDetached()) {
                    if (!e0Var.shouldIgnore()) {
                        boolean doesTransientStatePreventRecycling = e0Var.doesTransientStatePreventRecycling();
                        h hVar = RecyclerView.this.H;
                        if ((hVar != null && doesTransientStatePreventRecycling && hVar.onFailedToRecycleView(e0Var)) || e0Var.isRecyclable()) {
                            if (this.f15996f <= 0 || e0Var.hasAnyOfTheFlags(526)) {
                                z10 = false;
                            } else {
                                int size = this.f15993c.size();
                                if (size >= this.f15996f && size > 0) {
                                    A(0);
                                    size--;
                                }
                                if (RecyclerView.f15883c1 && size > 0 && !RecyclerView.this.D0.d(e0Var.mPosition)) {
                                    int i10 = size - 1;
                                    while (i10 >= 0) {
                                        if (!RecyclerView.this.D0.d(this.f15993c.get(i10).mPosition)) {
                                            break;
                                        }
                                        i10--;
                                    }
                                    size = i10 + 1;
                                }
                                this.f15993c.add(size, e0Var);
                                z10 = true;
                            }
                            if (z10) {
                                z11 = false;
                            } else {
                                a(e0Var, true);
                            }
                            r1 = z10;
                        } else {
                            z11 = false;
                        }
                        RecyclerView.this.B.q(e0Var);
                        if (r1 || z11 || !doesTransientStatePreventRecycling) {
                            return;
                        }
                        e0Var.mBindingAdapter = null;
                        e0Var.mOwnerRecyclerView = null;
                        return;
                    }
                    throw new IllegalArgumentException("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle." + RecyclerView.this.Q());
                }
                throw new IllegalArgumentException("Tmp detached view should be removed from RecyclerView before it can be recycled: " + e0Var + RecyclerView.this.Q());
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Scrapped or attached views may not be recycled. isScrap:");
            sb2.append(e0Var.isScrap());
            sb2.append(" isAttached:");
            sb2.append(e0Var.itemView.getParent() != null);
            sb2.append(RecyclerView.this.Q());
            throw new IllegalArgumentException(sb2.toString());
        }

        public void D(View view) {
            e0 i02 = RecyclerView.i0(view);
            if (!i02.hasAnyOfTheFlags(12) && i02.isUpdated() && !RecyclerView.this.p(i02)) {
                if (this.f15992b == null) {
                    this.f15992b = new ArrayList<>();
                }
                i02.setScrapContainer(this, true);
                this.f15992b.add(i02);
            } else if (i02.isInvalid() && !i02.isRemoved() && !RecyclerView.this.H.hasStableIds()) {
                throw new IllegalArgumentException("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool." + RecyclerView.this.Q());
            } else {
                i02.setScrapContainer(this, false);
                this.f15991a.add(i02);
            }
        }

        public void E(v vVar) {
            v vVar2 = this.f15997g;
            if (vVar2 != null) {
                vVar2.c();
            }
            this.f15997g = vVar;
            if (vVar == null || RecyclerView.this.getAdapter() == null) {
                return;
            }
            this.f15997g.a();
        }

        public void F(c0 c0Var) {
        }

        public void G(int i10) {
            this.f15995e = i10;
            K();
        }

        public final boolean H(e0 e0Var, int i10, int i11, long j10) {
            e0Var.mBindingAdapter = null;
            e0Var.mOwnerRecyclerView = RecyclerView.this;
            int itemViewType = e0Var.getItemViewType();
            long nanoTime = RecyclerView.this.getNanoTime();
            if (j10 == Long.MAX_VALUE || this.f15997g.k(itemViewType, nanoTime, j10)) {
                RecyclerView.this.H.bindViewHolder(e0Var, i10);
                this.f15997g.d(e0Var.getItemViewType(), RecyclerView.this.getNanoTime() - nanoTime);
                b(e0Var);
                if (RecyclerView.this.E0.e()) {
                    e0Var.mPreLayoutPosition = i11;
                    return true;
                }
                return true;
            }
            return false;
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x005c  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x005f  */
        /* JADX WARN: Removed duplicated region for block: B:62:0x0130  */
        /* JADX WARN: Removed duplicated region for block: B:68:0x014d  */
        /* JADX WARN: Removed duplicated region for block: B:71:0x0170  */
        /* JADX WARN: Removed duplicated region for block: B:76:0x017f  */
        /* JADX WARN: Removed duplicated region for block: B:85:0x01a9  */
        /* JADX WARN: Removed duplicated region for block: B:86:0x01b7  */
        /* JADX WARN: Removed duplicated region for block: B:92:0x01d3 A[ADDED_TO_REGION] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public androidx.recyclerview.widget.RecyclerView.e0 I(int r17, boolean r18, long r19) {
            /*
                Method dump skipped, instructions count: 530
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.w.I(int, boolean, long):androidx.recyclerview.widget.RecyclerView$e0");
        }

        public void J(e0 e0Var) {
            if (e0Var.mInChangeScrap) {
                this.f15992b.remove(e0Var);
            } else {
                this.f15991a.remove(e0Var);
            }
            e0Var.mScrapContainer = null;
            e0Var.mInChangeScrap = false;
            e0Var.clearReturnedFromScrapFlag();
        }

        public void K() {
            p pVar = RecyclerView.this.I;
            this.f15996f = this.f15995e + (pVar != null ? pVar.I : 0);
            for (int size = this.f15993c.size() - 1; size >= 0 && this.f15993c.size() > this.f15996f; size--) {
                A(size);
            }
        }

        public boolean L(e0 e0Var) {
            if (e0Var.isRemoved()) {
                return RecyclerView.this.E0.e();
            }
            int i10 = e0Var.mPosition;
            if (i10 >= 0 && i10 < RecyclerView.this.H.getItemCount()) {
                if (RecyclerView.this.E0.e() || RecyclerView.this.H.getItemViewType(e0Var.mPosition) == e0Var.getItemViewType()) {
                    return !RecyclerView.this.H.hasStableIds() || e0Var.getItemId() == RecyclerView.this.H.getItemId(e0Var.mPosition);
                }
                return false;
            }
            throw new IndexOutOfBoundsException("Inconsistency detected. Invalid view holder adapter position" + e0Var + RecyclerView.this.Q());
        }

        public void M(int i10, int i11) {
            int i12;
            int i13 = i11 + i10;
            for (int size = this.f15993c.size() - 1; size >= 0; size--) {
                e0 e0Var = this.f15993c.get(size);
                if (e0Var != null && (i12 = e0Var.mPosition) >= i10 && i12 < i13) {
                    e0Var.addFlags(2);
                    A(size);
                }
            }
        }

        public void a(e0 e0Var, boolean z10) {
            RecyclerView.r(e0Var);
            View view = e0Var.itemView;
            androidx.recyclerview.widget.z zVar = RecyclerView.this.L0;
            if (zVar != null) {
                o3.a n10 = zVar.n();
                o3.c0.r0(view, n10 instanceof z.a ? ((z.a) n10).n(view) : null);
            }
            if (z10) {
                g(e0Var);
            }
            e0Var.mBindingAdapter = null;
            e0Var.mOwnerRecyclerView = null;
            i().i(e0Var);
        }

        public final void b(e0 e0Var) {
            if (RecyclerView.this.y0()) {
                View view = e0Var.itemView;
                if (o3.c0.C(view) == 0) {
                    o3.c0.C0(view, 1);
                }
                androidx.recyclerview.widget.z zVar = RecyclerView.this.L0;
                if (zVar == null) {
                    return;
                }
                o3.a n10 = zVar.n();
                if (n10 instanceof z.a) {
                    ((z.a) n10).o(view);
                }
                o3.c0.r0(view, n10);
            }
        }

        public void c() {
            this.f15991a.clear();
            z();
        }

        public void d() {
            int size = this.f15993c.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.f15993c.get(i10).clearOldPosition();
            }
            int size2 = this.f15991a.size();
            for (int i11 = 0; i11 < size2; i11++) {
                this.f15991a.get(i11).clearOldPosition();
            }
            ArrayList<e0> arrayList = this.f15992b;
            if (arrayList != null) {
                int size3 = arrayList.size();
                for (int i12 = 0; i12 < size3; i12++) {
                    this.f15992b.get(i12).clearOldPosition();
                }
            }
        }

        public void e() {
            this.f15991a.clear();
            ArrayList<e0> arrayList = this.f15992b;
            if (arrayList != null) {
                arrayList.clear();
            }
        }

        public int f(int i10) {
            if (i10 >= 0 && i10 < RecyclerView.this.E0.b()) {
                return !RecyclerView.this.E0.e() ? i10 : RecyclerView.this.f15916z.m(i10);
            }
            throw new IndexOutOfBoundsException("invalid position " + i10 + ". State item count is " + RecyclerView.this.E0.b() + RecyclerView.this.Q());
        }

        public void g(e0 e0Var) {
            x xVar = RecyclerView.this.J;
            if (xVar != null) {
                xVar.a(e0Var);
            }
            int size = RecyclerView.this.K.size();
            for (int i10 = 0; i10 < size; i10++) {
                RecyclerView.this.K.get(i10).a(e0Var);
            }
            h hVar = RecyclerView.this.H;
            if (hVar != null) {
                hVar.onViewRecycled(e0Var);
            }
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.E0 != null) {
                recyclerView.B.q(e0Var);
            }
        }

        public e0 h(int i10) {
            int size;
            int m10;
            ArrayList<e0> arrayList = this.f15992b;
            if (arrayList != null && (size = arrayList.size()) != 0) {
                for (int i11 = 0; i11 < size; i11++) {
                    e0 e0Var = this.f15992b.get(i11);
                    if (!e0Var.wasReturnedFromScrap() && e0Var.getLayoutPosition() == i10) {
                        e0Var.addFlags(32);
                        return e0Var;
                    }
                }
                if (RecyclerView.this.H.hasStableIds() && (m10 = RecyclerView.this.f15916z.m(i10)) > 0 && m10 < RecyclerView.this.H.getItemCount()) {
                    long itemId = RecyclerView.this.H.getItemId(m10);
                    for (int i12 = 0; i12 < size; i12++) {
                        e0 e0Var2 = this.f15992b.get(i12);
                        if (!e0Var2.wasReturnedFromScrap() && e0Var2.getItemId() == itemId) {
                            e0Var2.addFlags(32);
                            return e0Var2;
                        }
                    }
                }
            }
            return null;
        }

        public v i() {
            if (this.f15997g == null) {
                this.f15997g = new v();
            }
            return this.f15997g;
        }

        public int j() {
            return this.f15991a.size();
        }

        public List<e0> k() {
            return this.f15994d;
        }

        public e0 l(long j10, int i10, boolean z10) {
            for (int size = this.f15991a.size() - 1; size >= 0; size--) {
                e0 e0Var = this.f15991a.get(size);
                if (e0Var.getItemId() == j10 && !e0Var.wasReturnedFromScrap()) {
                    if (i10 == e0Var.getItemViewType()) {
                        e0Var.addFlags(32);
                        if (e0Var.isRemoved() && !RecyclerView.this.E0.e()) {
                            e0Var.setFlags(2, 14);
                        }
                        return e0Var;
                    } else if (!z10) {
                        this.f15991a.remove(size);
                        RecyclerView.this.removeDetachedView(e0Var.itemView, false);
                        y(e0Var.itemView);
                    }
                }
            }
            int size2 = this.f15993c.size();
            while (true) {
                size2--;
                if (size2 < 0) {
                    return null;
                }
                e0 e0Var2 = this.f15993c.get(size2);
                if (e0Var2.getItemId() == j10 && !e0Var2.isAttachedToTransitionOverlay()) {
                    if (i10 == e0Var2.getItemViewType()) {
                        if (!z10) {
                            this.f15993c.remove(size2);
                        }
                        return e0Var2;
                    } else if (!z10) {
                        A(size2);
                        return null;
                    }
                }
            }
        }

        public e0 m(int i10, boolean z10) {
            View e10;
            int size = this.f15991a.size();
            for (int i11 = 0; i11 < size; i11++) {
                e0 e0Var = this.f15991a.get(i11);
                if (!e0Var.wasReturnedFromScrap() && e0Var.getLayoutPosition() == i10 && !e0Var.isInvalid() && (RecyclerView.this.E0.f15942h || !e0Var.isRemoved())) {
                    e0Var.addFlags(32);
                    return e0Var;
                }
            }
            if (!z10 && (e10 = RecyclerView.this.A.e(i10)) != null) {
                e0 i02 = RecyclerView.i0(e10);
                RecyclerView.this.A.s(e10);
                int m10 = RecyclerView.this.A.m(e10);
                if (m10 != -1) {
                    RecyclerView.this.A.d(m10);
                    D(e10);
                    i02.addFlags(8224);
                    return i02;
                }
                throw new IllegalStateException("layout index should not be -1 after unhiding a view:" + i02 + RecyclerView.this.Q());
            }
            int size2 = this.f15993c.size();
            for (int i12 = 0; i12 < size2; i12++) {
                e0 e0Var2 = this.f15993c.get(i12);
                if (!e0Var2.isInvalid() && e0Var2.getLayoutPosition() == i10 && !e0Var2.isAttachedToTransitionOverlay()) {
                    if (!z10) {
                        this.f15993c.remove(i12);
                    }
                    return e0Var2;
                }
            }
            return null;
        }

        public View n(int i10) {
            return this.f15991a.get(i10).itemView;
        }

        public View o(int i10) {
            return p(i10, false);
        }

        public View p(int i10, boolean z10) {
            return I(i10, z10, Long.MAX_VALUE).itemView;
        }

        public final void q(ViewGroup viewGroup, boolean z10) {
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                if (childAt instanceof ViewGroup) {
                    q((ViewGroup) childAt, true);
                }
            }
            if (z10) {
                if (viewGroup.getVisibility() == 4) {
                    viewGroup.setVisibility(0);
                    viewGroup.setVisibility(4);
                    return;
                }
                int visibility = viewGroup.getVisibility();
                viewGroup.setVisibility(4);
                viewGroup.setVisibility(visibility);
            }
        }

        public final void r(e0 e0Var) {
            View view = e0Var.itemView;
            if (view instanceof ViewGroup) {
                q((ViewGroup) view, false);
            }
        }

        public void s() {
            int size = this.f15993c.size();
            for (int i10 = 0; i10 < size; i10++) {
                q qVar = (q) this.f15993c.get(i10).itemView.getLayoutParams();
                if (qVar != null) {
                    qVar.f15983y = true;
                }
            }
        }

        public void t() {
            int size = this.f15993c.size();
            for (int i10 = 0; i10 < size; i10++) {
                e0 e0Var = this.f15993c.get(i10);
                if (e0Var != null) {
                    e0Var.addFlags(6);
                    e0Var.addChangePayload(null);
                }
            }
            h hVar = RecyclerView.this.H;
            if (hVar == null || !hVar.hasStableIds()) {
                z();
            }
        }

        public void u(int i10, int i11) {
            int size = this.f15993c.size();
            for (int i12 = 0; i12 < size; i12++) {
                e0 e0Var = this.f15993c.get(i12);
                if (e0Var != null && e0Var.mPosition >= i10) {
                    e0Var.offsetPosition(i11, false);
                }
            }
        }

        public void v(int i10, int i11) {
            int i12;
            int i13;
            int i14;
            int i15;
            if (i10 < i11) {
                i12 = -1;
                i14 = i10;
                i13 = i11;
            } else {
                i12 = 1;
                i13 = i10;
                i14 = i11;
            }
            int size = this.f15993c.size();
            for (int i16 = 0; i16 < size; i16++) {
                e0 e0Var = this.f15993c.get(i16);
                if (e0Var != null && (i15 = e0Var.mPosition) >= i14 && i15 <= i13) {
                    if (i15 == i10) {
                        e0Var.offsetPosition(i11 - i10, false);
                    } else {
                        e0Var.offsetPosition(i12, false);
                    }
                }
            }
        }

        public void w(int i10, int i11, boolean z10) {
            int i12 = i10 + i11;
            for (int size = this.f15993c.size() - 1; size >= 0; size--) {
                e0 e0Var = this.f15993c.get(size);
                if (e0Var != null) {
                    int i13 = e0Var.mPosition;
                    if (i13 >= i12) {
                        e0Var.offsetPosition(-i11, z10);
                    } else if (i13 >= i10) {
                        e0Var.addFlags(8);
                        A(size);
                    }
                }
            }
        }

        public void x(h hVar, h hVar2, boolean z10) {
            c();
            i().h(hVar, hVar2, z10);
        }

        public void y(View view) {
            e0 i02 = RecyclerView.i0(view);
            i02.mScrapContainer = null;
            i02.mInChangeScrap = false;
            i02.clearReturnedFromScrapFlag();
            C(i02);
        }

        public void z() {
            for (int size = this.f15993c.size() - 1; size >= 0; size--) {
                A(size);
            }
            this.f15993c.clear();
            if (RecyclerView.f15883c1) {
                RecyclerView.this.D0.b();
            }
        }
    }

    /* loaded from: classes.dex */
    public interface x {
        void a(e0 e0Var);
    }

    /* loaded from: classes.dex */
    public class y extends j {
        public y() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void a() {
            RecyclerView.this.o(null);
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.E0.f15941g = true;
            recyclerView.V0(true);
            if (RecyclerView.this.f15916z.p()) {
                return;
            }
            RecyclerView.this.requestLayout();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void c(int i10, int i11, Object obj) {
            RecyclerView.this.o(null);
            if (RecyclerView.this.f15916z.r(i10, i11, obj)) {
                h();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void d(int i10, int i11) {
            RecyclerView.this.o(null);
            if (RecyclerView.this.f15916z.s(i10, i11)) {
                h();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void e(int i10, int i11, int i12) {
            RecyclerView.this.o(null);
            if (RecyclerView.this.f15916z.t(i10, i11, i12)) {
                h();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void f(int i10, int i11) {
            RecyclerView.this.o(null);
            if (RecyclerView.this.f15916z.u(i10, i11)) {
                h();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void g() {
            h hVar;
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.f15914y == null || (hVar = recyclerView.H) == null || !hVar.canRestoreState()) {
                return;
            }
            RecyclerView.this.requestLayout();
        }

        public void h() {
            if (RecyclerView.f15882b1) {
                RecyclerView recyclerView = RecyclerView.this;
                if (recyclerView.P && recyclerView.O) {
                    o3.c0.j0(recyclerView, recyclerView.D);
                    return;
                }
            }
            RecyclerView recyclerView2 = RecyclerView.this;
            recyclerView2.f15888a0 = true;
            recyclerView2.requestLayout();
        }
    }

    static {
        int i10 = Build.VERSION.SDK_INT;
        Z0 = i10 == 18 || i10 == 19 || i10 == 20;
        f15881a1 = i10 >= 23;
        f15882b1 = i10 >= 16;
        f15883c1 = i10 >= 21;
        f15884d1 = i10 <= 15;
        f15885e1 = i10 <= 15;
        Class<?> cls = Integer.TYPE;
        f15886f1 = new Class[]{Context.class, AttributeSet.class, cls, cls};
        f15887g1 = new c();
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, u4.a.f54361a);
    }

    public static RecyclerView X(View view) {
        if (view instanceof ViewGroup) {
            if (view instanceof RecyclerView) {
                return (RecyclerView) view;
            }
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                RecyclerView X = X(viewGroup.getChildAt(i10));
                if (X != null) {
                    return X;
                }
            }
            return null;
        }
        return null;
    }

    private o3.q getScrollingChildHelper() {
        if (this.O0 == null) {
            this.O0 = new o3.q(this);
        }
        return this.O0;
    }

    public static e0 i0(View view) {
        if (view == null) {
            return null;
        }
        return ((q) view.getLayoutParams()).f15981w;
    }

    public static void k0(View view, Rect rect) {
        q qVar = (q) view.getLayoutParams();
        Rect rect2 = qVar.f15982x;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) qVar).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) qVar).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) qVar).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) qVar).bottomMargin);
    }

    public static void r(e0 e0Var) {
        WeakReference<RecyclerView> weakReference = e0Var.mNestedRecyclerView;
        if (weakReference != null) {
            RecyclerView recyclerView = weakReference.get();
            while (recyclerView != null) {
                if (recyclerView == e0Var.itemView) {
                    return;
                }
                ViewParent parent = recyclerView.getParent();
                recyclerView = parent instanceof View ? (View) parent : null;
            }
            e0Var.mNestedRecyclerView = null;
        }
    }

    public void A(View view) {
        e0 i02 = i0(view);
        L0(view);
        h hVar = this.H;
        if (hVar != null && i02 != null) {
            hVar.onViewDetachedFromWindow(i02);
        }
        List<r> list = this.f15890c0;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.f15890c0.get(size).b(view);
            }
        }
    }

    public final boolean A0(View view, View view2, int i10) {
        int i11;
        if (view2 == null || view2 == this || view2 == view || T(view2) == null) {
            return false;
        }
        if (view == null || T(view) == null) {
            return true;
        }
        this.E.set(0, 0, view.getWidth(), view.getHeight());
        this.F.set(0, 0, view2.getWidth(), view2.getHeight());
        offsetDescendantRectToMyCoords(view, this.E);
        offsetDescendantRectToMyCoords(view2, this.F);
        char c10 = 65535;
        int i12 = this.I.k0() == 1 ? -1 : 1;
        Rect rect = this.E;
        int i13 = rect.left;
        Rect rect2 = this.F;
        int i14 = rect2.left;
        if ((i13 < i14 || rect.right <= i14) && rect.right < rect2.right) {
            i11 = 1;
        } else {
            int i15 = rect.right;
            int i16 = rect2.right;
            i11 = ((i15 > i16 || i13 >= i16) && i13 > i14) ? -1 : 0;
        }
        int i17 = rect.top;
        int i18 = rect2.top;
        if ((i17 < i18 || rect.bottom <= i18) && rect.bottom < rect2.bottom) {
            c10 = 1;
        } else {
            int i19 = rect.bottom;
            int i20 = rect2.bottom;
            if ((i19 <= i20 && i17 < i20) || i17 <= i18) {
                c10 = 0;
            }
        }
        if (i10 == 1) {
            return c10 < 0 || (c10 == 0 && i11 * i12 < 0);
        } else if (i10 == 2) {
            return c10 > 0 || (c10 == 0 && i11 * i12 > 0);
        } else if (i10 == 17) {
            return i11 < 0;
        } else if (i10 == 33) {
            return c10 < 0;
        } else if (i10 == 66) {
            return i11 > 0;
        } else if (i10 == 130) {
            return c10 > 0;
        } else {
            throw new IllegalArgumentException("Invalid direction: " + i10 + Q());
        }
    }

    public void A1(boolean z10) {
        if (this.S < 1) {
            this.S = 1;
        }
        if (!z10 && !this.U) {
            this.T = false;
        }
        if (this.S == 1) {
            if (z10 && this.T && !this.U && this.I != null && this.H != null) {
                C();
            }
            if (!this.U) {
                this.T = false;
            }
        }
        this.S--;
    }

    public final void B() {
        int i10 = this.W;
        this.W = 0;
        if (i10 == 0 || !y0()) {
            return;
        }
        AccessibilityEvent obtain = AccessibilityEvent.obtain();
        obtain.setEventType(2048);
        p3.b.b(obtain, i10);
        sendAccessibilityEventUnchecked(obtain);
    }

    public void B0(int i10) {
        if (this.I == null) {
            return;
        }
        setScrollState(2);
        this.I.G1(i10);
        awakenScrollBars();
    }

    public void B1(int i10) {
        getScrollingChildHelper().r(i10);
    }

    public void C() {
        if (this.H == null) {
            Log.w("RecyclerView", "No adapter attached; skipping layout");
        } else if (this.I == null) {
            Log.e("RecyclerView", "No layout manager attached; skipping layout");
        } else {
            this.E0.f15944j = false;
            boolean z10 = this.U0 && !(this.V0 == getWidth() && this.W0 == getHeight());
            this.V0 = 0;
            this.W0 = 0;
            this.U0 = false;
            if (this.E0.f15939e == 1) {
                D();
                this.I.I1(this);
                E();
            } else if (!this.f15916z.q() && !z10 && this.I.v0() == getWidth() && this.I.h0() == getHeight()) {
                this.I.I1(this);
            } else {
                this.I.I1(this);
                E();
            }
            F();
        }
    }

    public void C0() {
        int j10 = this.A.j();
        for (int i10 = 0; i10 < j10; i10++) {
            ((q) this.A.i(i10).getLayoutParams()).f15983y = true;
        }
        this.f15912x.s();
    }

    public void C1() {
        setScrollState(0);
        D1();
    }

    public final void D() {
        boolean z10 = true;
        this.E0.a(1);
        R(this.E0);
        this.E0.f15944j = false;
        y1();
        this.B.f();
        M0();
        U0();
        l1();
        b0 b0Var = this.E0;
        b0Var.f15943i = (b0Var.f15945k && this.I0) ? false : false;
        this.I0 = false;
        this.H0 = false;
        b0Var.f15942h = b0Var.f15946l;
        b0Var.f15940f = this.H.getItemCount();
        W(this.N0);
        if (this.E0.f15945k) {
            int g10 = this.A.g();
            for (int i10 = 0; i10 < g10; i10++) {
                e0 i02 = i0(this.A.f(i10));
                if (!i02.shouldIgnore() && (!i02.isInvalid() || this.H.hasStableIds())) {
                    this.B.e(i02, this.f15900m0.u(this.E0, i02, m.e(i02), i02.getUnmodifiedPayloads()));
                    if (this.E0.f15943i && i02.isUpdated() && !i02.isRemoved() && !i02.shouldIgnore() && !i02.isInvalid()) {
                        this.B.c(e0(i02), i02);
                    }
                }
            }
        }
        if (this.E0.f15946l) {
            m1();
            b0 b0Var2 = this.E0;
            boolean z11 = b0Var2.f15941g;
            b0Var2.f15941g = false;
            this.I.f1(this.f15912x, b0Var2);
            this.E0.f15941g = z11;
            for (int i11 = 0; i11 < this.A.g(); i11++) {
                e0 i03 = i0(this.A.f(i11));
                if (!i03.shouldIgnore() && !this.B.i(i03)) {
                    int e10 = m.e(i03);
                    boolean hasAnyOfTheFlags = i03.hasAnyOfTheFlags(8192);
                    if (!hasAnyOfTheFlags) {
                        e10 |= 4096;
                    }
                    m.c u10 = this.f15900m0.u(this.E0, i03, e10, i03.getUnmodifiedPayloads());
                    if (hasAnyOfTheFlags) {
                        X0(i03, u10);
                    } else {
                        this.B.a(i03, u10);
                    }
                }
            }
            s();
        } else {
            s();
        }
        N0();
        A1(false);
        this.E0.f15939e = 2;
    }

    public void D0() {
        int j10 = this.A.j();
        for (int i10 = 0; i10 < j10; i10++) {
            e0 i02 = i0(this.A.i(i10));
            if (i02 != null && !i02.shouldIgnore()) {
                i02.addFlags(6);
            }
        }
        C0();
        this.f15912x.t();
    }

    public final void D1() {
        this.B0.f();
        p pVar = this.I;
        if (pVar != null) {
            pVar.T1();
        }
    }

    public final void E() {
        y1();
        M0();
        this.E0.a(6);
        this.f15916z.j();
        this.E0.f15940f = this.H.getItemCount();
        this.E0.f15938d = 0;
        if (this.f15914y != null && this.H.canRestoreState()) {
            Parcelable parcelable = this.f15914y.f16000w;
            if (parcelable != null) {
                this.I.k1(parcelable);
            }
            this.f15914y = null;
        }
        b0 b0Var = this.E0;
        b0Var.f15942h = false;
        this.I.f1(this.f15912x, b0Var);
        b0 b0Var2 = this.E0;
        b0Var2.f15941g = false;
        b0Var2.f15945k = b0Var2.f15945k && this.f15900m0 != null;
        b0Var2.f15939e = 4;
        N0();
        A1(false);
    }

    public final void E0(int i10, int i11, MotionEvent motionEvent, int i12) {
        p pVar = this.I;
        if (pVar == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else if (this.U) {
        } else {
            int[] iArr = this.R0;
            iArr[0] = 0;
            iArr[1] = 0;
            boolean v10 = pVar.v();
            boolean w10 = this.I.w();
            z1(w10 ? v10 | 2 : v10, i12);
            if (G(v10 != 0 ? i10 : 0, w10 ? i11 : 0, this.R0, this.P0, i12)) {
                int[] iArr2 = this.R0;
                i10 -= iArr2[0];
                i11 -= iArr2[1];
            }
            n1(v10 != 0 ? i10 : 0, w10 ? i11 : 0, motionEvent, i12);
            androidx.recyclerview.widget.m mVar = this.C0;
            if (mVar != null && (i10 != 0 || i11 != 0)) {
                mVar.f(this, i10, i11);
            }
            B1(i12);
        }
    }

    public void E1(int i10, int i11, Object obj) {
        int i12;
        int j10 = this.A.j();
        int i13 = i10 + i11;
        for (int i14 = 0; i14 < j10; i14++) {
            View i15 = this.A.i(i14);
            e0 i02 = i0(i15);
            if (i02 != null && !i02.shouldIgnore() && (i12 = i02.mPosition) >= i10 && i12 < i13) {
                i02.addFlags(2);
                i02.addChangePayload(obj);
                ((q) i15.getLayoutParams()).f15983y = true;
            }
        }
        this.f15912x.M(i10, i11);
    }

    public final void F() {
        this.E0.a(4);
        y1();
        M0();
        b0 b0Var = this.E0;
        b0Var.f15939e = 1;
        if (b0Var.f15945k) {
            for (int g10 = this.A.g() - 1; g10 >= 0; g10--) {
                e0 i02 = i0(this.A.f(g10));
                if (!i02.shouldIgnore()) {
                    long e02 = e0(i02);
                    m.c t10 = this.f15900m0.t(this.E0, i02);
                    e0 g11 = this.B.g(e02);
                    if (g11 != null && !g11.shouldIgnore()) {
                        boolean h10 = this.B.h(g11);
                        boolean h11 = this.B.h(i02);
                        if (h10 && g11 == i02) {
                            this.B.d(i02, t10);
                        } else {
                            m.c n10 = this.B.n(g11);
                            this.B.d(i02, t10);
                            m.c m10 = this.B.m(i02);
                            if (n10 == null) {
                                p0(e02, i02, g11);
                            } else {
                                m(g11, i02, n10, m10, h10, h11);
                            }
                        }
                    } else {
                        this.B.d(i02, t10);
                    }
                }
            }
            this.B.o(this.X0);
        }
        this.I.u1(this.f15912x);
        b0 b0Var2 = this.E0;
        b0Var2.f15937c = b0Var2.f15940f;
        this.f15891d0 = false;
        this.f15892e0 = false;
        b0Var2.f15945k = false;
        b0Var2.f15946l = false;
        this.I.D = false;
        ArrayList<e0> arrayList = this.f15912x.f15992b;
        if (arrayList != null) {
            arrayList.clear();
        }
        p pVar = this.I;
        if (pVar.J) {
            pVar.I = 0;
            pVar.J = false;
            this.f15912x.K();
        }
        this.I.g1(this.E0);
        N0();
        A1(false);
        this.B.f();
        int[] iArr = this.N0;
        if (y(iArr[0], iArr[1])) {
            J(0, 0);
        }
        Y0();
        j1();
    }

    public void F0(int i10) {
        int g10 = this.A.g();
        for (int i11 = 0; i11 < g10; i11++) {
            this.A.f(i11).offsetLeftAndRight(i10);
        }
    }

    public boolean G(int i10, int i11, int[] iArr, int[] iArr2, int i12) {
        return getScrollingChildHelper().d(i10, i11, iArr, iArr2, i12);
    }

    public void G0(int i10) {
        int g10 = this.A.g();
        for (int i11 = 0; i11 < g10; i11++) {
            this.A.f(i11).offsetTopAndBottom(i10);
        }
    }

    public final void H(int i10, int i11, int i12, int i13, int[] iArr, int i14, int[] iArr2) {
        getScrollingChildHelper().e(i10, i11, i12, i13, iArr, i14, iArr2);
    }

    public void H0(int i10, int i11) {
        int j10 = this.A.j();
        for (int i12 = 0; i12 < j10; i12++) {
            e0 i02 = i0(this.A.i(i12));
            if (i02 != null && !i02.shouldIgnore() && i02.mPosition >= i10) {
                i02.offsetPosition(i11, false);
                this.E0.f15941g = true;
            }
        }
        this.f15912x.u(i10, i11);
        requestLayout();
    }

    public void I(int i10) {
        p pVar = this.I;
        if (pVar != null) {
            pVar.m1(i10);
        }
        Q0(i10);
        u uVar = this.F0;
        if (uVar != null) {
            uVar.a(this, i10);
        }
        List<u> list = this.G0;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.G0.get(size).a(this, i10);
            }
        }
    }

    public void I0(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int j10 = this.A.j();
        if (i10 < i11) {
            i14 = -1;
            i13 = i10;
            i12 = i11;
        } else {
            i12 = i10;
            i13 = i11;
            i14 = 1;
        }
        for (int i16 = 0; i16 < j10; i16++) {
            e0 i02 = i0(this.A.i(i16));
            if (i02 != null && (i15 = i02.mPosition) >= i13 && i15 <= i12) {
                if (i15 == i10) {
                    i02.offsetPosition(i11 - i10, false);
                } else {
                    i02.offsetPosition(i14, false);
                }
                this.E0.f15941g = true;
            }
        }
        this.f15912x.v(i10, i11);
        requestLayout();
    }

    public void J(int i10, int i11) {
        this.f15894g0++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i10, scrollY - i11);
        R0(i10, i11);
        u uVar = this.F0;
        if (uVar != null) {
            uVar.b(this, i10, i11);
        }
        List<u> list = this.G0;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.G0.get(size).b(this, i10, i11);
            }
        }
        this.f15894g0--;
    }

    public void J0(int i10, int i11, boolean z10) {
        int i12 = i10 + i11;
        int j10 = this.A.j();
        for (int i13 = 0; i13 < j10; i13++) {
            e0 i02 = i0(this.A.i(i13));
            if (i02 != null && !i02.shouldIgnore()) {
                int i14 = i02.mPosition;
                if (i14 >= i12) {
                    i02.offsetPosition(-i11, z10);
                    this.E0.f15941g = true;
                } else if (i14 >= i10) {
                    i02.flagRemovedAndOffsetPosition(i10 - 1, -i11, z10);
                    this.E0.f15941g = true;
                }
            }
        }
        this.f15912x.w(i10, i11, z10);
        requestLayout();
    }

    public void K() {
        int i10;
        for (int size = this.S0.size() - 1; size >= 0; size--) {
            e0 e0Var = this.S0.get(size);
            if (e0Var.itemView.getParent() == this && !e0Var.shouldIgnore() && (i10 = e0Var.mPendingAccessibilityState) != -1) {
                o3.c0.C0(e0Var.itemView, i10);
                e0Var.mPendingAccessibilityState = -1;
            }
        }
        this.S0.clear();
    }

    public void K0(View view) {
    }

    public final boolean L(MotionEvent motionEvent) {
        t tVar = this.N;
        if (tVar == null) {
            if (motionEvent.getAction() == 0) {
                return false;
            }
            return V(motionEvent);
        }
        tVar.a(this, motionEvent);
        int action = motionEvent.getAction();
        if (action == 3 || action == 1) {
            this.N = null;
        }
        return true;
    }

    public void L0(View view) {
    }

    public void M() {
        if (this.f15899l0 != null) {
            return;
        }
        EdgeEffect a10 = this.f15895h0.a(this, 3);
        this.f15899l0 = a10;
        if (this.C) {
            a10.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            a10.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void M0() {
        this.f15893f0++;
    }

    public void N() {
        if (this.f15896i0 != null) {
            return;
        }
        EdgeEffect a10 = this.f15895h0.a(this, 0);
        this.f15896i0 = a10;
        if (this.C) {
            a10.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            a10.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public void N0() {
        O0(true);
    }

    public void O() {
        if (this.f15898k0 != null) {
            return;
        }
        EdgeEffect a10 = this.f15895h0.a(this, 2);
        this.f15898k0 = a10;
        if (this.C) {
            a10.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            a10.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public void O0(boolean z10) {
        int i10 = this.f15893f0 - 1;
        this.f15893f0 = i10;
        if (i10 < 1) {
            this.f15893f0 = 0;
            if (z10) {
                B();
                K();
            }
        }
    }

    public void P() {
        if (this.f15897j0 != null) {
            return;
        }
        EdgeEffect a10 = this.f15895h0.a(this, 1);
        this.f15897j0 = a10;
        if (this.C) {
            a10.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            a10.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public final void P0(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f15902o0) {
            int i10 = actionIndex == 0 ? 1 : 0;
            this.f15902o0 = motionEvent.getPointerId(i10);
            int x10 = (int) (motionEvent.getX(i10) + 0.5f);
            this.f15906s0 = x10;
            this.f15904q0 = x10;
            int y10 = (int) (motionEvent.getY(i10) + 0.5f);
            this.f15907t0 = y10;
            this.f15905r0 = y10;
        }
    }

    public String Q() {
        return " " + super.toString() + ", adapter:" + this.H + ", layout:" + this.I + ", context:" + getContext();
    }

    public void Q0(int i10) {
    }

    public final void R(b0 b0Var) {
        if (getScrollState() == 2) {
            OverScroller overScroller = this.B0.f15955y;
            b0Var.f15950p = overScroller.getFinalX() - overScroller.getCurrX();
            b0Var.f15951q = overScroller.getFinalY() - overScroller.getCurrY();
            return;
        }
        b0Var.f15950p = 0;
        b0Var.f15951q = 0;
    }

    public void R0(int i10, int i11) {
    }

    public View S(float f10, float f11) {
        for (int g10 = this.A.g() - 1; g10 >= 0; g10--) {
            View f12 = this.A.f(g10);
            float translationX = f12.getTranslationX();
            float translationY = f12.getTranslationY();
            if (f10 >= f12.getLeft() + translationX && f10 <= f12.getRight() + translationX && f11 >= f12.getTop() + translationY && f11 <= f12.getBottom() + translationY) {
                return f12;
            }
        }
        return null;
    }

    public void S0() {
        if (this.K0 || !this.O) {
            return;
        }
        o3.c0.j0(this, this.T0);
        this.K0 = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:?, code lost:
        return r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.view.View T(android.view.View r3) {
        /*
            r2 = this;
            android.view.ViewParent r0 = r3.getParent()
        L4:
            if (r0 == 0) goto L14
            if (r0 == r2) goto L14
            boolean r1 = r0 instanceof android.view.View
            if (r1 == 0) goto L14
            r3 = r0
            android.view.View r3 = (android.view.View) r3
            android.view.ViewParent r0 = r3.getParent()
            goto L4
        L14:
            if (r0 != r2) goto L17
            goto L18
        L17:
            r3 = 0
        L18:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.T(android.view.View):android.view.View");
    }

    public final boolean T0() {
        return this.f15900m0 != null && this.I.U1();
    }

    public e0 U(View view) {
        View T = T(view);
        if (T == null) {
            return null;
        }
        return h0(T);
    }

    public final void U0() {
        boolean z10;
        if (this.f15891d0) {
            this.f15916z.y();
            if (this.f15892e0) {
                this.I.a1(this);
            }
        }
        if (T0()) {
            this.f15916z.w();
        } else {
            this.f15916z.j();
        }
        boolean z11 = false;
        boolean z12 = this.H0 || this.I0;
        this.E0.f15945k = this.R && this.f15900m0 != null && ((z10 = this.f15891d0) || z12 || this.I.D) && (!z10 || this.H.hasStableIds());
        b0 b0Var = this.E0;
        if (b0Var.f15945k && z12 && !this.f15891d0 && T0()) {
            z11 = true;
        }
        b0Var.f15946l = z11;
    }

    public final boolean V(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        int size = this.M.size();
        for (int i10 = 0; i10 < size; i10++) {
            t tVar = this.M.get(i10);
            if (tVar.c(this, motionEvent) && action != 3) {
                this.N = tVar;
                return true;
            }
        }
        return false;
    }

    public void V0(boolean z10) {
        this.f15892e0 = z10 | this.f15892e0;
        this.f15891d0 = true;
        D0();
    }

    public final void W(int[] iArr) {
        int g10 = this.A.g();
        if (g10 == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i10 = Integer.MAX_VALUE;
        int i11 = Integer.MIN_VALUE;
        for (int i12 = 0; i12 < g10; i12++) {
            e0 i02 = i0(this.A.f(i12));
            if (!i02.shouldIgnore()) {
                int layoutPosition = i02.getLayoutPosition();
                if (layoutPosition < i10) {
                    i10 = layoutPosition;
                }
                if (layoutPosition > i11) {
                    i11 = layoutPosition;
                }
            }
        }
        iArr[0] = i10;
        iArr[1] = i11;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void W0(float r7, float r8, float r9, float r10) {
        /*
            r6 = this;
            r0 = 0
            int r1 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            r2 = 1065353216(0x3f800000, float:1.0)
            r3 = 1
            if (r1 >= 0) goto L21
            r6.N()
            android.widget.EdgeEffect r1 = r6.f15896i0
            float r4 = -r8
            int r5 = r6.getWidth()
            float r5 = (float) r5
            float r4 = r4 / r5
            int r5 = r6.getHeight()
            float r5 = (float) r5
            float r9 = r9 / r5
            float r9 = r2 - r9
            s3.e.c(r1, r4, r9)
        L1f:
            r9 = r3
            goto L3c
        L21:
            int r1 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r1 <= 0) goto L3b
            r6.O()
            android.widget.EdgeEffect r1 = r6.f15898k0
            int r4 = r6.getWidth()
            float r4 = (float) r4
            float r4 = r8 / r4
            int r5 = r6.getHeight()
            float r5 = (float) r5
            float r9 = r9 / r5
            s3.e.c(r1, r4, r9)
            goto L1f
        L3b:
            r9 = 0
        L3c:
            int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r1 >= 0) goto L56
            r6.P()
            android.widget.EdgeEffect r9 = r6.f15897j0
            float r1 = -r10
            int r2 = r6.getHeight()
            float r2 = (float) r2
            float r1 = r1 / r2
            int r2 = r6.getWidth()
            float r2 = (float) r2
            float r7 = r7 / r2
            s3.e.c(r9, r1, r7)
            goto L72
        L56:
            int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r1 <= 0) goto L71
            r6.M()
            android.widget.EdgeEffect r9 = r6.f15899l0
            int r1 = r6.getHeight()
            float r1 = (float) r1
            float r1 = r10 / r1
            int r4 = r6.getWidth()
            float r4 = (float) r4
            float r7 = r7 / r4
            float r2 = r2 - r7
            s3.e.c(r9, r1, r2)
            goto L72
        L71:
            r3 = r9
        L72:
            if (r3 != 0) goto L7c
            int r7 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r7 != 0) goto L7c
            int r7 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r7 == 0) goto L7f
        L7c:
            o3.c0.i0(r6)
        L7f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.W0(float, float, float, float):void");
    }

    public void X0(e0 e0Var, m.c cVar) {
        e0Var.setFlags(0, 8192);
        if (this.E0.f15943i && e0Var.isUpdated() && !e0Var.isRemoved() && !e0Var.shouldIgnore()) {
            this.B.c(e0(e0Var), e0Var);
        }
        this.B.e(e0Var, cVar);
    }

    public final View Y() {
        e0 Z;
        b0 b0Var = this.E0;
        int i10 = b0Var.f15947m;
        if (i10 == -1) {
            i10 = 0;
        }
        int b10 = b0Var.b();
        for (int i11 = i10; i11 < b10; i11++) {
            e0 Z2 = Z(i11);
            if (Z2 == null) {
                break;
            } else if (Z2.itemView.hasFocusable()) {
                return Z2.itemView;
            }
        }
        int min = Math.min(b10, i10);
        while (true) {
            min--;
            if (min < 0 || (Z = Z(min)) == null) {
                return null;
            }
            if (Z.itemView.hasFocusable()) {
                return Z.itemView;
            }
        }
    }

    public final void Y0() {
        View findViewById;
        if (!this.A0 || this.H == null || !hasFocus() || getDescendantFocusability() == 393216) {
            return;
        }
        if (getDescendantFocusability() == 131072 && isFocused()) {
            return;
        }
        if (!isFocused()) {
            View focusedChild = getFocusedChild();
            if (f15885e1 && (focusedChild.getParent() == null || !focusedChild.hasFocus())) {
                if (this.A.g() == 0) {
                    requestFocus();
                    return;
                }
            } else if (!this.A.n(focusedChild)) {
                return;
            }
        }
        View view = null;
        e0 a02 = (this.E0.f15948n == -1 || !this.H.hasStableIds()) ? null : a0(this.E0.f15948n);
        if (a02 != null && !this.A.n(a02.itemView) && a02.itemView.hasFocusable()) {
            view = a02.itemView;
        } else if (this.A.g() > 0) {
            view = Y();
        }
        if (view != null) {
            int i10 = this.E0.f15949o;
            if (i10 != -1 && (findViewById = view.findViewById(i10)) != null && findViewById.isFocusable()) {
                view = findViewById;
            }
            view.requestFocus();
        }
    }

    public e0 Z(int i10) {
        e0 e0Var = null;
        if (this.f15891d0) {
            return null;
        }
        int j10 = this.A.j();
        for (int i11 = 0; i11 < j10; i11++) {
            e0 i02 = i0(this.A.i(i11));
            if (i02 != null && !i02.isRemoved() && d0(i02) == i10) {
                if (!this.A.n(i02.itemView)) {
                    return i02;
                }
                e0Var = i02;
            }
        }
        return e0Var;
    }

    public final void Z0() {
        boolean z10;
        EdgeEffect edgeEffect = this.f15896i0;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z10 = this.f15896i0.isFinished();
        } else {
            z10 = false;
        }
        EdgeEffect edgeEffect2 = this.f15897j0;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z10 |= this.f15897j0.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f15898k0;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z10 |= this.f15898k0.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f15899l0;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            z10 |= this.f15899l0.isFinished();
        }
        if (z10) {
            o3.c0.i0(this);
        }
    }

    public void a(int i10, int i11) {
        if (i10 < 0) {
            N();
            if (this.f15896i0.isFinished()) {
                this.f15896i0.onAbsorb(-i10);
            }
        } else if (i10 > 0) {
            O();
            if (this.f15898k0.isFinished()) {
                this.f15898k0.onAbsorb(i10);
            }
        }
        if (i11 < 0) {
            P();
            if (this.f15897j0.isFinished()) {
                this.f15897j0.onAbsorb(-i11);
            }
        } else if (i11 > 0) {
            M();
            if (this.f15899l0.isFinished()) {
                this.f15899l0.onAbsorb(i11);
            }
        }
        if (i10 == 0 && i11 == 0) {
            return;
        }
        o3.c0.i0(this);
    }

    public e0 a0(long j10) {
        h hVar = this.H;
        e0 e0Var = null;
        if (hVar != null && hVar.hasStableIds()) {
            int j11 = this.A.j();
            for (int i10 = 0; i10 < j11; i10++) {
                e0 i02 = i0(this.A.i(i10));
                if (i02 != null && !i02.isRemoved() && i02.getItemId() == j10) {
                    if (!this.A.n(i02.itemView)) {
                        return i02;
                    }
                    e0Var = i02;
                }
            }
        }
        return e0Var;
    }

    public void a1() {
        m mVar = this.f15900m0;
        if (mVar != null) {
            mVar.k();
        }
        p pVar = this.I;
        if (pVar != null) {
            pVar.t1(this.f15912x);
            this.I.u1(this.f15912x);
        }
        this.f15912x.c();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i10, int i11) {
        p pVar = this.I;
        if (pVar == null || !pVar.N0(this, arrayList, i10, i11)) {
            super.addFocusables(arrayList, i10, i11);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0036 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public androidx.recyclerview.widget.RecyclerView.e0 b0(int r6, boolean r7) {
        /*
            r5 = this;
            androidx.recyclerview.widget.f r0 = r5.A
            int r0 = r0.j()
            r1 = 0
            r2 = 0
        L8:
            if (r2 >= r0) goto L3a
            androidx.recyclerview.widget.f r3 = r5.A
            android.view.View r3 = r3.i(r2)
            androidx.recyclerview.widget.RecyclerView$e0 r3 = i0(r3)
            if (r3 == 0) goto L37
            boolean r4 = r3.isRemoved()
            if (r4 != 0) goto L37
            if (r7 == 0) goto L23
            int r4 = r3.mPosition
            if (r4 == r6) goto L2a
            goto L37
        L23:
            int r4 = r3.getLayoutPosition()
            if (r4 == r6) goto L2a
            goto L37
        L2a:
            androidx.recyclerview.widget.f r1 = r5.A
            android.view.View r4 = r3.itemView
            boolean r1 = r1.n(r4)
            if (r1 == 0) goto L36
            r1 = r3
            goto L37
        L36:
            return r3
        L37:
            int r2 = r2 + 1
            goto L8
        L3a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.b0(int, boolean):androidx.recyclerview.widget.RecyclerView$e0");
    }

    public boolean b1(View view) {
        y1();
        boolean r10 = this.A.r(view);
        if (r10) {
            e0 i02 = i0(view);
            this.f15912x.J(i02);
            this.f15912x.C(i02);
        }
        A1(!r10);
        return r10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6 */
    public boolean c0(int i10, int i11) {
        p pVar = this.I;
        if (pVar == null) {
            Log.e("RecyclerView", "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return false;
        } else if (this.U) {
            return false;
        } else {
            int v10 = pVar.v();
            boolean w10 = this.I.w();
            if (v10 == 0 || Math.abs(i10) < this.f15911w0) {
                i10 = 0;
            }
            if (!w10 || Math.abs(i11) < this.f15911w0) {
                i11 = 0;
            }
            if (i10 == 0 && i11 == 0) {
                return false;
            }
            float f10 = i10;
            float f11 = i11;
            if (!dispatchNestedPreFling(f10, f11)) {
                boolean z10 = v10 != 0 || w10;
                dispatchNestedFling(f10, f11, z10);
                s sVar = this.f15909v0;
                if (sVar != null && sVar.a(i10, i11)) {
                    return true;
                }
                if (z10) {
                    if (w10) {
                        v10 = (v10 == true ? 1 : 0) | 2;
                    }
                    z1(v10, 1);
                    int i12 = this.f15913x0;
                    int max = Math.max(-i12, Math.min(i10, i12));
                    int i13 = this.f15913x0;
                    this.B0.b(max, Math.max(-i13, Math.min(i11, i13)));
                    return true;
                }
            }
            return false;
        }
    }

    public void c1(o oVar) {
        p pVar = this.I;
        if (pVar != null) {
            pVar.r("Cannot remove item decoration during a scroll  or layout");
        }
        this.L.remove(oVar);
        if (this.L.isEmpty()) {
            setWillNotDraw(getOverScrollMode() == 2);
        }
        C0();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof q) && this.I.x((q) layoutParams);
    }

    @Override // android.view.View
    public int computeHorizontalScrollExtent() {
        p pVar = this.I;
        if (pVar != null && pVar.v()) {
            return this.I.B(this.E0);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeHorizontalScrollOffset() {
        p pVar = this.I;
        if (pVar != null && pVar.v()) {
            return this.I.C(this.E0);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeHorizontalScrollRange() {
        p pVar = this.I;
        if (pVar != null && pVar.v()) {
            return this.I.D(this.E0);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollExtent() {
        p pVar = this.I;
        if (pVar != null && pVar.w()) {
            return this.I.E(this.E0);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollOffset() {
        p pVar = this.I;
        if (pVar != null && pVar.w()) {
            return this.I.F(this.E0);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollRange() {
        p pVar = this.I;
        if (pVar != null && pVar.w()) {
            return this.I.G(this.E0);
        }
        return 0;
    }

    public int d0(e0 e0Var) {
        if (e0Var.hasAnyOfTheFlags(524) || !e0Var.isBound()) {
            return -1;
        }
        return this.f15916z.e(e0Var.mPosition);
    }

    public void d1(int i10) {
        int itemDecorationCount = getItemDecorationCount();
        if (i10 >= 0 && i10 < itemDecorationCount) {
            c1(o0(i10));
            return;
        }
        throw new IndexOutOfBoundsException(i10 + " is an invalid index for size " + itemDecorationCount);
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f10, float f11, boolean z10) {
        return getScrollingChildHelper().a(f10, f11, z10);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f10, float f11) {
        return getScrollingChildHelper().b(f10, f11);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i10, int i11, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i10, i11, iArr, iArr2);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i10, int i11, int i12, int i13, int[] iArr) {
        return getScrollingChildHelper().f(i10, i11, i12, i13, iArr);
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchSaveInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        boolean z10;
        super.draw(canvas);
        int size = this.L.size();
        boolean z11 = false;
        for (int i10 = 0; i10 < size; i10++) {
            this.L.get(i10).k(canvas, this, this.E0);
        }
        EdgeEffect edgeEffect = this.f15896i0;
        boolean z12 = true;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z10 = false;
        } else {
            int save = canvas.save();
            int paddingBottom = this.C ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + paddingBottom, 0.0f);
            EdgeEffect edgeEffect2 = this.f15896i0;
            z10 = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(save);
        }
        EdgeEffect edgeEffect3 = this.f15897j0;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int save2 = canvas.save();
            if (this.C) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.f15897j0;
            z10 |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(save2);
        }
        EdgeEffect edgeEffect5 = this.f15898k0;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int save3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.C ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate(paddingTop, -width);
            EdgeEffect edgeEffect6 = this.f15898k0;
            z10 |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(save3);
        }
        EdgeEffect edgeEffect7 = this.f15899l0;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int save4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.C) {
                canvas.translate((-getWidth()) + getPaddingRight(), (-getHeight()) + getPaddingBottom());
            } else {
                canvas.translate(-getWidth(), -getHeight());
            }
            EdgeEffect edgeEffect8 = this.f15899l0;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z11 = true;
            }
            z10 |= z11;
            canvas.restoreToCount(save4);
        }
        if (z10 || this.f15900m0 == null || this.L.size() <= 0 || !this.f15900m0.p()) {
            z12 = z10;
        }
        if (z12) {
            o3.c0.i0(this);
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j10) {
        return super.drawChild(canvas, view, j10);
    }

    public long e0(e0 e0Var) {
        return this.H.hasStableIds() ? e0Var.getItemId() : e0Var.mPosition;
    }

    public void e1(r rVar) {
        List<r> list = this.f15890c0;
        if (list == null) {
            return;
        }
        list.remove(rVar);
    }

    public final void f(e0 e0Var) {
        View view = e0Var.itemView;
        boolean z10 = view.getParent() == this;
        this.f15912x.J(h0(view));
        if (e0Var.isTmpDetached()) {
            this.A.c(view, -1, view.getLayoutParams(), true);
        } else if (!z10) {
            this.A.b(view, true);
        } else {
            this.A.k(view);
        }
    }

    public int f0(View view) {
        e0 i02 = i0(view);
        if (i02 != null) {
            return i02.getAbsoluteAdapterPosition();
        }
        return -1;
    }

    public void f1(t tVar) {
        this.M.remove(tVar);
        if (this.N == tVar) {
            this.N = null;
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public View focusSearch(View view, int i10) {
        View view2;
        boolean z10;
        View Y02 = this.I.Y0(view, i10);
        if (Y02 != null) {
            return Y02;
        }
        boolean z11 = (this.H == null || this.I == null || z0() || this.U) ? false : true;
        FocusFinder focusFinder = FocusFinder.getInstance();
        if (z11 && (i10 == 2 || i10 == 1)) {
            if (this.I.w()) {
                int i11 = i10 == 2 ? TsExtractor.TS_STREAM_TYPE_HDMV_DTS : 33;
                z10 = focusFinder.findNextFocus(this, view, i11) == null;
                if (f15884d1) {
                    i10 = i11;
                }
            } else {
                z10 = false;
            }
            if (!z10 && this.I.v()) {
                int i12 = (this.I.k0() == 1) ^ (i10 == 2) ? 66 : 17;
                boolean z12 = focusFinder.findNextFocus(this, view, i12) == null;
                if (f15884d1) {
                    i10 = i12;
                }
                z10 = z12;
            }
            if (z10) {
                v();
                if (T(view) == null) {
                    return null;
                }
                y1();
                this.I.R0(view, i10, this.f15912x, this.E0);
                A1(false);
            }
            view2 = focusFinder.findNextFocus(this, view, i10);
        } else {
            View findNextFocus = focusFinder.findNextFocus(this, view, i10);
            if (findNextFocus == null && z11) {
                v();
                if (T(view) == null) {
                    return null;
                }
                y1();
                view2 = this.I.R0(view, i10, this.f15912x, this.E0);
                A1(false);
            } else {
                view2 = findNextFocus;
            }
        }
        if (view2 == null || view2.hasFocusable()) {
            return A0(view, view2, i10) ? view2 : super.focusSearch(view, i10);
        } else if (getFocusedChild() == null) {
            return super.focusSearch(view, i10);
        } else {
            i1(view2, null);
            return view;
        }
    }

    public void g(o oVar) {
        h(oVar, -1);
    }

    public int g0(View view) {
        e0 i02 = i0(view);
        if (i02 != null) {
            return i02.getLayoutPosition();
        }
        return -1;
    }

    public void g1(u uVar) {
        List<u> list = this.G0;
        if (list != null) {
            list.remove(uVar);
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        p pVar = this.I;
        if (pVar != null) {
            return pVar.O();
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + Q());
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        p pVar = this.I;
        if (pVar != null) {
            return pVar.P(getContext(), attributeSet);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + Q());
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public h getAdapter() {
        return this.H;
    }

    @Override // android.view.View
    public int getBaseline() {
        p pVar = this.I;
        if (pVar != null) {
            return pVar.R();
        }
        return super.getBaseline();
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i10, int i11) {
        k kVar = this.M0;
        if (kVar == null) {
            return super.getChildDrawingOrder(i10, i11);
        }
        return kVar.a(i10, i11);
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.C;
    }

    public androidx.recyclerview.widget.z getCompatAccessibilityDelegate() {
        return this.L0;
    }

    public l getEdgeEffectFactory() {
        return this.f15895h0;
    }

    public m getItemAnimator() {
        return this.f15900m0;
    }

    public int getItemDecorationCount() {
        return this.L.size();
    }

    public p getLayoutManager() {
        return this.I;
    }

    public int getMaxFlingVelocity() {
        return this.f15913x0;
    }

    public int getMinFlingVelocity() {
        return this.f15911w0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public long getNanoTime() {
        if (f15883c1) {
            return System.nanoTime();
        }
        return 0L;
    }

    public s getOnFlingListener() {
        return this.f15909v0;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.A0;
    }

    public v getRecycledViewPool() {
        return this.f15912x.i();
    }

    public int getScrollState() {
        return this.f15901n0;
    }

    public void h(o oVar, int i10) {
        p pVar = this.I;
        if (pVar != null) {
            pVar.r("Cannot add item decoration during a scroll  or layout");
        }
        if (this.L.isEmpty()) {
            setWillNotDraw(false);
        }
        if (i10 < 0) {
            this.L.add(oVar);
        } else {
            this.L.add(i10, oVar);
        }
        C0();
        requestLayout();
    }

    public e0 h0(View view) {
        ViewParent parent = view.getParent();
        if (parent != null && parent != this) {
            throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
        }
        return i0(view);
    }

    public void h1() {
        e0 e0Var;
        int g10 = this.A.g();
        for (int i10 = 0; i10 < g10; i10++) {
            View f10 = this.A.f(i10);
            e0 h02 = h0(f10);
            if (h02 != null && (e0Var = h02.mShadowingHolder) != null) {
                View view = e0Var.itemView;
                int left = f10.getLeft();
                int top = f10.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().j();
    }

    public void i(r rVar) {
        if (this.f15890c0 == null) {
            this.f15890c0 = new ArrayList();
        }
        this.f15890c0.add(rVar);
    }

    public final void i1(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        this.E.set(0, 0, view3.getWidth(), view3.getHeight());
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof q) {
            q qVar = (q) layoutParams;
            if (!qVar.f15983y) {
                Rect rect = qVar.f15982x;
                Rect rect2 = this.E;
                rect2.left -= rect.left;
                rect2.right += rect.right;
                rect2.top -= rect.top;
                rect2.bottom += rect.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, this.E);
            offsetRectIntoDescendantCoords(view, this.E);
        }
        this.I.B1(this, view, this.E, !this.R, view2 == null);
    }

    @Override // android.view.View
    public boolean isAttachedToWindow() {
        return this.O;
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.U;
    }

    @Override // android.view.View, o3.p
    public boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().l();
    }

    public void j(t tVar) {
        this.M.add(tVar);
    }

    public void j0(View view, Rect rect) {
        k0(view, rect);
    }

    public final void j1() {
        b0 b0Var = this.E0;
        b0Var.f15948n = -1L;
        b0Var.f15947m = -1;
        b0Var.f15949o = -1;
    }

    public void k(u uVar) {
        if (this.G0 == null) {
            this.G0 = new ArrayList();
        }
        this.G0.add(uVar);
    }

    public final void k1() {
        VelocityTracker velocityTracker = this.f15903p0;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        B1(0);
        Z0();
    }

    public void l(e0 e0Var, m.c cVar, m.c cVar2) {
        e0Var.setIsRecyclable(false);
        if (this.f15900m0.a(e0Var, cVar, cVar2)) {
            S0();
        }
    }

    public final int l0(View view) {
        int id2 = view.getId();
        while (!view.isFocused() && (view instanceof ViewGroup) && view.hasFocus()) {
            view = ((ViewGroup) view).getFocusedChild();
            if (view.getId() != -1) {
                id2 = view.getId();
            }
        }
        return id2;
    }

    public final void l1() {
        int absoluteAdapterPosition;
        View focusedChild = (this.A0 && hasFocus() && this.H != null) ? getFocusedChild() : null;
        e0 U = focusedChild != null ? U(focusedChild) : null;
        if (U == null) {
            j1();
            return;
        }
        this.E0.f15948n = this.H.hasStableIds() ? U.getItemId() : -1L;
        b0 b0Var = this.E0;
        if (this.f15891d0) {
            absoluteAdapterPosition = -1;
        } else {
            absoluteAdapterPosition = U.isRemoved() ? U.mOldPosition : U.getAbsoluteAdapterPosition();
        }
        b0Var.f15947m = absoluteAdapterPosition;
        this.E0.f15949o = l0(U.itemView);
    }

    public final void m(e0 e0Var, e0 e0Var2, m.c cVar, m.c cVar2, boolean z10, boolean z11) {
        e0Var.setIsRecyclable(false);
        if (z10) {
            f(e0Var);
        }
        if (e0Var != e0Var2) {
            if (z11) {
                f(e0Var2);
            }
            e0Var.mShadowedHolder = e0Var2;
            f(e0Var);
            this.f15912x.J(e0Var);
            e0Var2.setIsRecyclable(false);
            e0Var2.mShadowingHolder = e0Var;
        }
        if (this.f15900m0.b(e0Var, e0Var2, cVar, cVar2)) {
            S0();
        }
    }

    public final String m0(Context context, String str) {
        if (str.charAt(0) == '.') {
            return context.getPackageName() + str;
        } else if (str.contains(TopicConstant.SEPARATOR)) {
            return str;
        } else {
            return RecyclerView.class.getPackage().getName() + '.' + str;
        }
    }

    public void m1() {
        int j10 = this.A.j();
        for (int i10 = 0; i10 < j10; i10++) {
            e0 i02 = i0(this.A.i(i10));
            if (!i02.shouldIgnore()) {
                i02.saveOldPosition();
            }
        }
    }

    public void n(e0 e0Var, m.c cVar, m.c cVar2) {
        f(e0Var);
        e0Var.setIsRecyclable(false);
        if (this.f15900m0.c(e0Var, cVar, cVar2)) {
            S0();
        }
    }

    public Rect n0(View view) {
        q qVar = (q) view.getLayoutParams();
        if (!qVar.f15983y) {
            return qVar.f15982x;
        }
        if (this.E0.e() && (qVar.b() || qVar.d())) {
            return qVar.f15982x;
        }
        Rect rect = qVar.f15982x;
        rect.set(0, 0, 0, 0);
        int size = this.L.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.E.set(0, 0, 0, 0);
            this.L.get(i10).g(this.E, view, this, this.E0);
            int i11 = rect.left;
            Rect rect2 = this.E;
            rect.left = i11 + rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        qVar.f15983y = false;
        return rect;
    }

    public boolean n1(int i10, int i11, MotionEvent motionEvent, int i12) {
        int i13;
        int i14;
        int i15;
        int i16;
        v();
        if (this.H != null) {
            int[] iArr = this.R0;
            iArr[0] = 0;
            iArr[1] = 0;
            o1(i10, i11, iArr);
            int[] iArr2 = this.R0;
            int i17 = iArr2[0];
            int i18 = iArr2[1];
            i13 = i18;
            i14 = i17;
            i15 = i10 - i17;
            i16 = i11 - i18;
        } else {
            i13 = 0;
            i14 = 0;
            i15 = 0;
            i16 = 0;
        }
        if (!this.L.isEmpty()) {
            invalidate();
        }
        int[] iArr3 = this.R0;
        iArr3[0] = 0;
        iArr3[1] = 0;
        H(i14, i13, i15, i16, this.P0, i12, iArr3);
        int[] iArr4 = this.R0;
        int i19 = i15 - iArr4[0];
        int i20 = i16 - iArr4[1];
        boolean z10 = (iArr4[0] == 0 && iArr4[1] == 0) ? false : true;
        int i21 = this.f15906s0;
        int[] iArr5 = this.P0;
        this.f15906s0 = i21 - iArr5[0];
        this.f15907t0 -= iArr5[1];
        int[] iArr6 = this.Q0;
        iArr6[0] = iArr6[0] + iArr5[0];
        iArr6[1] = iArr6[1] + iArr5[1];
        if (getOverScrollMode() != 2) {
            if (motionEvent != null && !o3.o.a(motionEvent, 8194)) {
                W0(motionEvent.getX(), i19, motionEvent.getY(), i20);
            }
            u(i10, i11);
        }
        if (i14 != 0 || i13 != 0) {
            J(i14, i13);
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        return (!z10 && i14 == 0 && i13 == 0) ? false : true;
    }

    public void o(String str) {
        if (z0()) {
            if (str == null) {
                throw new IllegalStateException("Cannot call this method while RecyclerView is computing a layout or scrolling" + Q());
            }
            throw new IllegalStateException(str);
        } else if (this.f15894g0 > 0) {
            Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException("" + Q()));
        }
    }

    public o o0(int i10) {
        int itemDecorationCount = getItemDecorationCount();
        if (i10 >= 0 && i10 < itemDecorationCount) {
            return this.L.get(i10);
        }
        throw new IndexOutOfBoundsException(i10 + " is an invalid index for size " + itemDecorationCount);
    }

    public void o1(int i10, int i11, int[] iArr) {
        y1();
        M0();
        k3.j.a("RV Scroll");
        R(this.E0);
        int F1 = i10 != 0 ? this.I.F1(i10, this.f15912x, this.E0) : 0;
        int H1 = i11 != 0 ? this.I.H1(i11, this.f15912x, this.E0) : 0;
        k3.j.b();
        h1();
        N0();
        A1(false);
        if (iArr != null) {
            iArr[0] = F1;
            iArr[1] = H1;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f15893f0 = 0;
        boolean z10 = true;
        this.O = true;
        if (!this.R || isLayoutRequested()) {
            z10 = false;
        }
        this.R = z10;
        p pVar = this.I;
        if (pVar != null) {
            pVar.K(this);
        }
        this.K0 = false;
        if (f15883c1) {
            ThreadLocal<androidx.recyclerview.widget.m> threadLocal = androidx.recyclerview.widget.m.A;
            androidx.recyclerview.widget.m mVar = threadLocal.get();
            this.C0 = mVar;
            if (mVar == null) {
                this.C0 = new androidx.recyclerview.widget.m();
                Display x10 = o3.c0.x(this);
                float f10 = 60.0f;
                if (!isInEditMode() && x10 != null) {
                    float refreshRate = x10.getRefreshRate();
                    if (refreshRate >= 30.0f) {
                        f10 = refreshRate;
                    }
                }
                androidx.recyclerview.widget.m mVar2 = this.C0;
                mVar2.f16248y = 1.0E9f / f10;
                threadLocal.set(mVar2);
            }
            this.C0.a(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        androidx.recyclerview.widget.m mVar;
        super.onDetachedFromWindow();
        m mVar2 = this.f15900m0;
        if (mVar2 != null) {
            mVar2.k();
        }
        C1();
        this.O = false;
        p pVar = this.I;
        if (pVar != null) {
            pVar.L(this, this.f15912x);
        }
        this.S0.clear();
        removeCallbacks(this.T0);
        this.B.j();
        if (!f15883c1 || (mVar = this.C0) == null) {
            return;
        }
        mVar.j(this);
        this.C0 = null;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int size = this.L.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.L.get(i10).i(canvas, this, this.E0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0068  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onGenericMotionEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            androidx.recyclerview.widget.RecyclerView$p r0 = r5.I
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            boolean r0 = r5.U
            if (r0 == 0) goto Lb
            return r1
        Lb:
            int r0 = r6.getAction()
            r2 = 8
            if (r0 != r2) goto L78
            int r0 = r6.getSource()
            r0 = r0 & 2
            r2 = 0
            if (r0 == 0) goto L3e
            androidx.recyclerview.widget.RecyclerView$p r0 = r5.I
            boolean r0 = r0.w()
            if (r0 == 0) goto L2c
            r0 = 9
            float r0 = r6.getAxisValue(r0)
            float r0 = -r0
            goto L2d
        L2c:
            r0 = r2
        L2d:
            androidx.recyclerview.widget.RecyclerView$p r3 = r5.I
            boolean r3 = r3.v()
            if (r3 == 0) goto L3c
            r3 = 10
            float r3 = r6.getAxisValue(r3)
            goto L64
        L3c:
            r3 = r2
            goto L64
        L3e:
            int r0 = r6.getSource()
            r3 = 4194304(0x400000, float:5.877472E-39)
            r0 = r0 & r3
            if (r0 == 0) goto L62
            r0 = 26
            float r0 = r6.getAxisValue(r0)
            androidx.recyclerview.widget.RecyclerView$p r3 = r5.I
            boolean r3 = r3.w()
            if (r3 == 0) goto L57
            float r0 = -r0
            goto L3c
        L57:
            androidx.recyclerview.widget.RecyclerView$p r3 = r5.I
            boolean r3 = r3.v()
            if (r3 == 0) goto L62
            r3 = r0
            r0 = r2
            goto L64
        L62:
            r0 = r2
            r3 = r0
        L64:
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L6c
            int r2 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r2 == 0) goto L78
        L6c:
            float r2 = r5.f15915y0
            float r3 = r3 * r2
            int r2 = (int) r3
            float r3 = r5.f15917z0
            float r0 = r0 * r3
            int r0 = (int) r0
            r3 = 1
            r5.E0(r2, r0, r6, r3)
        L78:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        if (this.U) {
            return false;
        }
        this.N = null;
        if (V(motionEvent)) {
            q();
            return true;
        }
        p pVar = this.I;
        if (pVar == null) {
            return false;
        }
        boolean v10 = pVar.v();
        boolean w10 = this.I.w();
        if (this.f15903p0 == null) {
            this.f15903p0 = VelocityTracker.obtain();
        }
        this.f15903p0.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            if (this.V) {
                this.V = false;
            }
            this.f15902o0 = motionEvent.getPointerId(0);
            int x10 = (int) (motionEvent.getX() + 0.5f);
            this.f15906s0 = x10;
            this.f15904q0 = x10;
            int y10 = (int) (motionEvent.getY() + 0.5f);
            this.f15907t0 = y10;
            this.f15905r0 = y10;
            if (this.f15901n0 == 2) {
                getParent().requestDisallowInterceptTouchEvent(true);
                setScrollState(1);
                B1(1);
            }
            int[] iArr = this.Q0;
            iArr[1] = 0;
            iArr[0] = 0;
            int i10 = v10;
            if (w10) {
                i10 = (v10 ? 1 : 0) | 2;
            }
            z1(i10, 0);
        } else if (actionMasked == 1) {
            this.f15903p0.clear();
            B1(0);
        } else if (actionMasked == 2) {
            int findPointerIndex = motionEvent.findPointerIndex(this.f15902o0);
            if (findPointerIndex < 0) {
                Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.f15902o0 + " not found. Did any MotionEvents get skipped?");
                return false;
            }
            int x11 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
            int y11 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
            if (this.f15901n0 != 1) {
                int i11 = x11 - this.f15904q0;
                int i12 = y11 - this.f15905r0;
                if (!v10 || Math.abs(i11) <= this.f15908u0) {
                    z10 = false;
                } else {
                    this.f15906s0 = x11;
                    z10 = true;
                }
                if (w10 && Math.abs(i12) > this.f15908u0) {
                    this.f15907t0 = y11;
                    z10 = true;
                }
                if (z10) {
                    setScrollState(1);
                }
            }
        } else if (actionMasked == 3) {
            q();
        } else if (actionMasked == 5) {
            this.f15902o0 = motionEvent.getPointerId(actionIndex);
            int x12 = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.f15906s0 = x12;
            this.f15904q0 = x12;
            int y12 = (int) (motionEvent.getY(actionIndex) + 0.5f);
            this.f15907t0 = y12;
            this.f15905r0 = y12;
        } else if (actionMasked == 6) {
            P0(motionEvent);
        }
        return this.f15901n0 == 1;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        k3.j.a("RV OnLayout");
        C();
        k3.j.b();
        this.R = true;
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        p pVar = this.I;
        if (pVar == null) {
            x(i10, i11);
            return;
        }
        boolean z10 = false;
        if (pVar.z0()) {
            int mode = View.MeasureSpec.getMode(i10);
            int mode2 = View.MeasureSpec.getMode(i11);
            this.I.h1(this.f15912x, this.E0, i10, i11);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z10 = true;
            }
            this.U0 = z10;
            if (z10 || this.H == null) {
                return;
            }
            if (this.E0.f15939e == 1) {
                D();
            }
            this.I.J1(i10, i11);
            this.E0.f15944j = true;
            E();
            this.I.M1(i10, i11);
            if (this.I.P1()) {
                this.I.J1(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                this.E0.f15944j = true;
                E();
                this.I.M1(i10, i11);
            }
            this.V0 = getMeasuredWidth();
            this.W0 = getMeasuredHeight();
        } else if (this.P) {
            this.I.h1(this.f15912x, this.E0, i10, i11);
        } else {
            if (this.f15888a0) {
                y1();
                M0();
                U0();
                N0();
                b0 b0Var = this.E0;
                if (b0Var.f15946l) {
                    b0Var.f15942h = true;
                } else {
                    this.f15916z.j();
                    this.E0.f15942h = false;
                }
                this.f15888a0 = false;
                A1(false);
            } else if (this.E0.f15946l) {
                setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
                return;
            }
            h hVar = this.H;
            if (hVar != null) {
                this.E0.f15940f = hVar.getItemCount();
            } else {
                this.E0.f15940f = 0;
            }
            y1();
            this.I.h1(this.f15912x, this.E0, i10, i11);
            A1(false);
            this.E0.f15942h = false;
        }
    }

    @Override // android.view.ViewGroup
    public boolean onRequestFocusInDescendants(int i10, Rect rect) {
        if (z0()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i10, rect);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof z)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        z zVar = (z) parcelable;
        this.f15914y = zVar;
        super.onRestoreInstanceState(zVar.getSuperState());
        requestLayout();
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        z zVar = new z(super.onSaveInstanceState());
        z zVar2 = this.f15914y;
        if (zVar2 != null) {
            zVar.a(zVar2);
        } else {
            p pVar = this.I;
            if (pVar != null) {
                zVar.f16000w = pVar.l1();
            } else {
                zVar.f16000w = null;
            }
        }
        return zVar;
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (i10 == i12 && i11 == i13) {
            return;
        }
        w0();
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f8  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
            Method dump skipped, instructions count: 480
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public boolean p(e0 e0Var) {
        m mVar = this.f15900m0;
        return mVar == null || mVar.g(e0Var, e0Var.getUnmodifiedPayloads());
    }

    public final void p0(long j10, e0 e0Var, e0 e0Var2) {
        int g10 = this.A.g();
        for (int i10 = 0; i10 < g10; i10++) {
            e0 i02 = i0(this.A.f(i10));
            if (i02 != e0Var && e0(i02) == j10) {
                h hVar = this.H;
                if (hVar != null && hVar.hasStableIds()) {
                    throw new IllegalStateException("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:" + i02 + " \n View Holder 2:" + e0Var + Q());
                }
                throw new IllegalStateException("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:" + i02 + " \n View Holder 2:" + e0Var + Q());
            }
        }
        Log.e("RecyclerView", "Problem while matching changed view holders with the newones. The pre-layout information for the change holder " + e0Var2 + " cannot be found but it is necessary for " + e0Var + Q());
    }

    public void p1(int i10) {
        if (this.U) {
            return;
        }
        C1();
        p pVar = this.I;
        if (pVar == null) {
            Log.e("RecyclerView", "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        pVar.G1(i10);
        awakenScrollBars();
    }

    public final void q() {
        k1();
        setScrollState(0);
    }

    public boolean q0() {
        return !this.R || this.f15891d0 || this.f15916z.p();
    }

    public final void q1(h hVar, boolean z10, boolean z11) {
        h hVar2 = this.H;
        if (hVar2 != null) {
            hVar2.unregisterAdapterDataObserver(this.f15910w);
            this.H.onDetachedFromRecyclerView(this);
        }
        if (!z10 || z11) {
            a1();
        }
        this.f15916z.y();
        h hVar3 = this.H;
        this.H = hVar;
        if (hVar != null) {
            hVar.registerAdapterDataObserver(this.f15910w);
            hVar.onAttachedToRecyclerView(this);
        }
        p pVar = this.I;
        if (pVar != null) {
            pVar.M0(hVar3, this.H);
        }
        this.f15912x.x(hVar3, this.H, z10);
        this.E0.f15941g = true;
    }

    public final boolean r0() {
        int g10 = this.A.g();
        for (int i10 = 0; i10 < g10; i10++) {
            e0 i02 = i0(this.A.f(i10));
            if (i02 != null && !i02.shouldIgnore() && i02.isUpdated()) {
                return true;
            }
        }
        return false;
    }

    public boolean r1(e0 e0Var, int i10) {
        if (z0()) {
            e0Var.mPendingAccessibilityState = i10;
            this.S0.add(e0Var);
            return false;
        }
        o3.c0.C0(e0Var.itemView, i10);
        return true;
    }

    @Override // android.view.ViewGroup
    public void removeDetachedView(View view, boolean z10) {
        e0 i02 = i0(view);
        if (i02 != null) {
            if (i02.isTmpDetached()) {
                i02.clearTmpDetachFlag();
            } else if (!i02.shouldIgnore()) {
                throw new IllegalArgumentException("Called removeDetachedView with a view which is not flagged as tmp detached." + i02 + Q());
            }
        }
        view.clearAnimation();
        A(view);
        super.removeDetachedView(view, z10);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        if (!this.I.j1(this, this.E0, view, view2) && view2 != null) {
            i1(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z10) {
        return this.I.A1(this, view, rect, z10);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z10) {
        int size = this.M.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.M.get(i10).e(z10);
        }
        super.requestDisallowInterceptTouchEvent(z10);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.S == 0 && !this.U) {
            super.requestLayout();
        } else {
            this.T = true;
        }
    }

    public void s() {
        int j10 = this.A.j();
        for (int i10 = 0; i10 < j10; i10++) {
            e0 i02 = i0(this.A.i(i10));
            if (!i02.shouldIgnore()) {
                i02.clearOldPosition();
            }
        }
        this.f15912x.d();
    }

    public void s0() {
        this.f15916z = new androidx.recyclerview.widget.a(new f());
    }

    public boolean s1(AccessibilityEvent accessibilityEvent) {
        if (z0()) {
            int a10 = accessibilityEvent != null ? p3.b.a(accessibilityEvent) : 0;
            this.W |= a10 != 0 ? a10 : 0;
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public void scrollBy(int i10, int i11) {
        p pVar = this.I;
        if (pVar == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else if (this.U) {
        } else {
            boolean v10 = pVar.v();
            boolean w10 = this.I.w();
            if (v10 || w10) {
                if (!v10) {
                    i10 = 0;
                }
                if (!w10) {
                    i11 = 0;
                }
                n1(i10, i11, null, 0);
            }
        }
    }

    @Override // android.view.View
    public void scrollTo(int i10, int i11) {
        Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (s1(accessibilityEvent)) {
            return;
        }
        super.sendAccessibilityEventUnchecked(accessibilityEvent);
    }

    public void setAccessibilityDelegateCompat(androidx.recyclerview.widget.z zVar) {
        this.L0 = zVar;
        o3.c0.r0(this, zVar);
    }

    public void setAdapter(h hVar) {
        setLayoutFrozen(false);
        q1(hVar, false, true);
        V0(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(k kVar) {
        if (kVar == this.M0) {
            return;
        }
        this.M0 = kVar;
        setChildrenDrawingOrderEnabled(kVar != null);
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z10) {
        if (z10 != this.C) {
            w0();
        }
        this.C = z10;
        super.setClipToPadding(z10);
        if (this.R) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(l lVar) {
        n3.h.g(lVar);
        this.f15895h0 = lVar;
        w0();
    }

    public void setHasFixedSize(boolean z10) {
        this.P = z10;
    }

    public void setItemAnimator(m mVar) {
        m mVar2 = this.f15900m0;
        if (mVar2 != null) {
            mVar2.k();
            this.f15900m0.x(null);
        }
        this.f15900m0 = mVar;
        if (mVar != null) {
            mVar.x(this.J0);
        }
    }

    public void setItemViewCacheSize(int i10) {
        this.f15912x.G(i10);
    }

    @Deprecated
    public void setLayoutFrozen(boolean z10) {
        suppressLayout(z10);
    }

    public void setLayoutManager(p pVar) {
        if (pVar == this.I) {
            return;
        }
        C1();
        if (this.I != null) {
            m mVar = this.f15900m0;
            if (mVar != null) {
                mVar.k();
            }
            this.I.t1(this.f15912x);
            this.I.u1(this.f15912x);
            this.f15912x.c();
            if (this.O) {
                this.I.L(this, this.f15912x);
            }
            this.I.N1(null);
            this.I = null;
        } else {
            this.f15912x.c();
        }
        this.A.o();
        this.I = pVar;
        if (pVar != null) {
            if (pVar.f15972x == null) {
                pVar.N1(this);
                if (this.O) {
                    this.I.K(this);
                }
            } else {
                throw new IllegalArgumentException("LayoutManager " + pVar + " is already attached to a RecyclerView:" + pVar.f15972x.Q());
            }
        }
        this.f15912x.K();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (Build.VERSION.SDK_INT < 18) {
            if (layoutTransition == null) {
                suppressLayout(false);
                return;
            } else if (layoutTransition.getAnimator(0) == null && layoutTransition.getAnimator(1) == null && layoutTransition.getAnimator(2) == null && layoutTransition.getAnimator(3) == null && layoutTransition.getAnimator(4) == null) {
                suppressLayout(true);
                return;
            }
        }
        if (layoutTransition == null) {
            super.setLayoutTransition(null);
            return;
        }
        throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
    }

    @Override // android.view.View, o3.p
    public void setNestedScrollingEnabled(boolean z10) {
        getScrollingChildHelper().m(z10);
    }

    public void setOnFlingListener(s sVar) {
        this.f15909v0 = sVar;
    }

    @Deprecated
    public void setOnScrollListener(u uVar) {
        this.F0 = uVar;
    }

    public void setPreserveFocusAfterLayout(boolean z10) {
        this.A0 = z10;
    }

    public void setRecycledViewPool(v vVar) {
        this.f15912x.E(vVar);
    }

    @Deprecated
    public void setRecyclerListener(x xVar) {
        this.J = xVar;
    }

    void setScrollState(int i10) {
        if (i10 == this.f15901n0) {
            return;
        }
        this.f15901n0 = i10;
        if (i10 != 2) {
            D1();
        }
        I(i10);
    }

    public void setScrollingTouchSlop(int i10) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i10 != 0) {
            if (i10 != 1) {
                Log.w("RecyclerView", "setScrollingTouchSlop(): bad argument constant " + i10 + "; using default value");
            } else {
                this.f15908u0 = viewConfiguration.getScaledPagingTouchSlop();
                return;
            }
        }
        this.f15908u0 = viewConfiguration.getScaledTouchSlop();
    }

    public void setViewCacheExtension(c0 c0Var) {
        this.f15912x.F(c0Var);
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i10) {
        return getScrollingChildHelper().o(i10);
    }

    @Override // android.view.View, o3.p
    public void stopNestedScroll() {
        getScrollingChildHelper().q();
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean z10) {
        if (z10 != this.U) {
            o("Do not suppressLayout in layout or scroll");
            if (!z10) {
                this.U = false;
                if (this.T && this.I != null && this.H != null) {
                    requestLayout();
                }
                this.T = false;
                return;
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0));
            this.U = true;
            this.V = true;
            C1();
        }
    }

    public void t() {
        List<u> list = this.G0;
        if (list != null) {
            list.clear();
        }
    }

    @SuppressLint({"InlinedApi"})
    public final void t0() {
        if (o3.c0.D(this) == 0) {
            o3.c0.D0(this, 8);
        }
    }

    public void t1(int i10, int i11) {
        u1(i10, i11, null);
    }

    public void u(int i10, int i11) {
        boolean z10;
        EdgeEffect edgeEffect = this.f15896i0;
        if (edgeEffect == null || edgeEffect.isFinished() || i10 <= 0) {
            z10 = false;
        } else {
            this.f15896i0.onRelease();
            z10 = this.f15896i0.isFinished();
        }
        EdgeEffect edgeEffect2 = this.f15898k0;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i10 < 0) {
            this.f15898k0.onRelease();
            z10 |= this.f15898k0.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f15897j0;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i11 > 0) {
            this.f15897j0.onRelease();
            z10 |= this.f15897j0.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f15899l0;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i11 < 0) {
            this.f15899l0.onRelease();
            z10 |= this.f15899l0.isFinished();
        }
        if (z10) {
            o3.c0.i0(this);
        }
    }

    public final void u0() {
        this.A = new androidx.recyclerview.widget.f(new e());
    }

    public void u1(int i10, int i11, Interpolator interpolator) {
        v1(i10, i11, interpolator, Integer.MIN_VALUE);
    }

    public void v() {
        if (this.R && !this.f15891d0) {
            if (this.f15916z.p()) {
                if (this.f15916z.o(4) && !this.f15916z.o(11)) {
                    k3.j.a("RV PartialInvalidate");
                    y1();
                    M0();
                    this.f15916z.w();
                    if (!this.T) {
                        if (r0()) {
                            C();
                        } else {
                            this.f15916z.i();
                        }
                    }
                    A1(true);
                    N0();
                    k3.j.b();
                    return;
                } else if (this.f15916z.p()) {
                    k3.j.a("RV FullInvalidate");
                    C();
                    k3.j.b();
                    return;
                } else {
                    return;
                }
            }
            return;
        }
        k3.j.a("RV FullInvalidate");
        C();
        k3.j.b();
    }

    public void v0(StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2) {
        if (stateListDrawable != null && drawable != null && stateListDrawable2 != null && drawable2 != null) {
            Resources resources = getContext().getResources();
            new androidx.recyclerview.widget.l(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(u4.b.f54362a), resources.getDimensionPixelSize(u4.b.f54364c), resources.getDimensionPixelOffset(u4.b.f54363b));
            return;
        }
        throw new IllegalArgumentException("Trying to set fast scroller without both required drawables." + Q());
    }

    public void v1(int i10, int i11, Interpolator interpolator, int i12) {
        w1(i10, i11, interpolator, i12, false);
    }

    public final void w(Context context, String str, AttributeSet attributeSet, int i10, int i11) {
        ClassLoader classLoader;
        Constructor constructor;
        if (str != null) {
            String trim = str.trim();
            if (trim.isEmpty()) {
                return;
            }
            String m02 = m0(context, trim);
            try {
                if (isInEditMode()) {
                    classLoader = getClass().getClassLoader();
                } else {
                    classLoader = context.getClassLoader();
                }
                Class<? extends U> asSubclass = Class.forName(m02, false, classLoader).asSubclass(p.class);
                Object[] objArr = null;
                try {
                    constructor = asSubclass.getConstructor(f15886f1);
                    objArr = new Object[]{context, attributeSet, Integer.valueOf(i10), Integer.valueOf(i11)};
                } catch (NoSuchMethodException e10) {
                    try {
                        constructor = asSubclass.getConstructor(new Class[0]);
                    } catch (NoSuchMethodException e11) {
                        e11.initCause(e10);
                        throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + m02, e11);
                    }
                }
                constructor.setAccessible(true);
                setLayoutManager((p) constructor.newInstance(objArr));
            } catch (ClassCastException e12) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + m02, e12);
            } catch (ClassNotFoundException e13) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + m02, e13);
            } catch (IllegalAccessException e14) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + m02, e14);
            } catch (InstantiationException e15) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + m02, e15);
            } catch (InvocationTargetException e16) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + m02, e16);
            }
        }
    }

    public void w0() {
        this.f15899l0 = null;
        this.f15897j0 = null;
        this.f15898k0 = null;
        this.f15896i0 = null;
    }

    public void w1(int i10, int i11, Interpolator interpolator, int i12, boolean z10) {
        p pVar = this.I;
        if (pVar == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else if (this.U) {
        } else {
            if (!pVar.v()) {
                i10 = 0;
            }
            if (!this.I.w()) {
                i11 = 0;
            }
            if (i10 == 0 && i11 == 0) {
                return;
            }
            if (i12 == Integer.MIN_VALUE || i12 > 0) {
                if (z10) {
                    int i13 = i10 != 0 ? 1 : 0;
                    if (i11 != 0) {
                        i13 |= 2;
                    }
                    z1(i13, 1);
                }
                this.B0.e(i10, i11, i12, interpolator);
                return;
            }
            scrollBy(i10, i11);
        }
    }

    public void x(int i10, int i11) {
        setMeasuredDimension(p.y(i10, getPaddingLeft() + getPaddingRight(), o3.c0.G(this)), p.y(i11, getPaddingTop() + getPaddingBottom(), o3.c0.F(this)));
    }

    public void x0() {
        if (this.L.size() == 0) {
            return;
        }
        p pVar = this.I;
        if (pVar != null) {
            pVar.r("Cannot invalidate item decorations during a scroll or layout");
        }
        C0();
        requestLayout();
    }

    public void x1(int i10) {
        if (this.U) {
            return;
        }
        p pVar = this.I;
        if (pVar == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            pVar.R1(this, this.E0, i10);
        }
    }

    public final boolean y(int i10, int i11) {
        W(this.N0);
        int[] iArr = this.N0;
        return (iArr[0] == i10 && iArr[1] == i11) ? false : true;
    }

    public boolean y0() {
        AccessibilityManager accessibilityManager = this.f15889b0;
        return accessibilityManager != null && accessibilityManager.isEnabled();
    }

    public void y1() {
        int i10 = this.S + 1;
        this.S = i10;
        if (i10 != 1 || this.U) {
            return;
        }
        this.T = false;
    }

    public void z(View view) {
        e0 i02 = i0(view);
        K0(view);
        h hVar = this.H;
        if (hVar != null && i02 != null) {
            hVar.onViewAttachedToWindow(i02);
        }
        List<r> list = this.f15890c0;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.f15890c0.get(size).d(view);
            }
        }
    }

    public boolean z0() {
        return this.f15893f0 > 0;
    }

    public boolean z1(int i10, int i11) {
        return getScrollingChildHelper().p(i10, i11);
    }

    public RecyclerView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f15910w = new y();
        this.f15912x = new w();
        this.B = new f0();
        this.D = new a();
        this.E = new Rect();
        this.F = new Rect();
        this.G = new RectF();
        this.K = new ArrayList();
        this.L = new ArrayList<>();
        this.M = new ArrayList<>();
        this.S = 0;
        this.f15891d0 = false;
        this.f15892e0 = false;
        this.f15893f0 = 0;
        this.f15894g0 = 0;
        this.f15895h0 = new l();
        this.f15900m0 = new androidx.recyclerview.widget.i();
        this.f15901n0 = 0;
        this.f15902o0 = -1;
        this.f15915y0 = Float.MIN_VALUE;
        this.f15917z0 = Float.MIN_VALUE;
        boolean z10 = true;
        this.A0 = true;
        this.B0 = new d0();
        this.D0 = f15883c1 ? new m.b() : null;
        this.E0 = new b0();
        this.H0 = false;
        this.I0 = false;
        this.J0 = new n();
        this.K0 = false;
        this.N0 = new int[2];
        this.P0 = new int[2];
        this.Q0 = new int[2];
        this.R0 = new int[2];
        this.S0 = new ArrayList();
        this.T0 = new b();
        this.V0 = 0;
        this.W0 = 0;
        this.X0 = new d();
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f15908u0 = viewConfiguration.getScaledTouchSlop();
        this.f15915y0 = o3.e0.b(viewConfiguration, context);
        this.f15917z0 = o3.e0.d(viewConfiguration, context);
        this.f15911w0 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f15913x0 = viewConfiguration.getScaledMaximumFlingVelocity();
        setWillNotDraw(getOverScrollMode() == 2);
        this.f15900m0.x(this.J0);
        s0();
        u0();
        t0();
        if (o3.c0.C(this) == 0) {
            o3.c0.C0(this, 1);
        }
        this.f15889b0 = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new androidx.recyclerview.widget.z(this));
        int[] iArr = u4.d.f54374f;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i10, 0);
        o3.c0.p0(this, context, iArr, attributeSet, obtainStyledAttributes, i10, 0);
        String string = obtainStyledAttributes.getString(u4.d.f54383o);
        if (obtainStyledAttributes.getInt(u4.d.f54377i, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.C = obtainStyledAttributes.getBoolean(u4.d.f54376h, true);
        boolean z11 = obtainStyledAttributes.getBoolean(u4.d.f54378j, false);
        this.Q = z11;
        if (z11) {
            v0((StateListDrawable) obtainStyledAttributes.getDrawable(u4.d.f54381m), obtainStyledAttributes.getDrawable(u4.d.f54382n), (StateListDrawable) obtainStyledAttributes.getDrawable(u4.d.f54379k), obtainStyledAttributes.getDrawable(u4.d.f54380l));
        }
        obtainStyledAttributes.recycle();
        w(context, string, attributeSet, i10, 0);
        if (Build.VERSION.SDK_INT >= 21) {
            int[] iArr2 = Y0;
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i10, 0);
            o3.c0.p0(this, context, iArr2, attributeSet, obtainStyledAttributes2, i10, 0);
            z10 = obtainStyledAttributes2.getBoolean(0, true);
            obtainStyledAttributes2.recycle();
        }
        setNestedScrollingEnabled(z10);
    }

    /* loaded from: classes.dex */
    public static class z extends v3.a {
        public static final Parcelable.Creator<z> CREATOR = new a();

        /* renamed from: w  reason: collision with root package name */
        public Parcelable f16000w;

        /* loaded from: classes.dex */
        public class a implements Parcelable.ClassLoaderCreator<z> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public z createFromParcel(Parcel parcel) {
                return new z(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b */
            public z createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new z(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c */
            public z[] newArray(int i10) {
                return new z[i10];
            }
        }

        public z(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f16000w = parcel.readParcelable(classLoader == null ? p.class.getClassLoader() : classLoader);
        }

        public void a(z zVar) {
            this.f16000w = zVar.f16000w;
        }

        @Override // v3.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeParcelable(this.f16000w, 0);
        }

        public z(Parcelable parcelable) {
            super(parcelable);
        }
    }

    /* loaded from: classes.dex */
    public static class q extends ViewGroup.MarginLayoutParams {

        /* renamed from: w  reason: collision with root package name */
        public e0 f15981w;

        /* renamed from: x  reason: collision with root package name */
        public final Rect f15982x;

        /* renamed from: y  reason: collision with root package name */
        public boolean f15983y;

        /* renamed from: z  reason: collision with root package name */
        public boolean f15984z;

        public q(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f15982x = new Rect();
            this.f15983y = true;
            this.f15984z = false;
        }

        public int a() {
            return this.f15981w.getLayoutPosition();
        }

        public boolean b() {
            return this.f15981w.isUpdated();
        }

        public boolean c() {
            return this.f15981w.isRemoved();
        }

        public boolean d() {
            return this.f15981w.isInvalid();
        }

        public q(int i10, int i11) {
            super(i10, i11);
            this.f15982x = new Rect();
            this.f15983y = true;
            this.f15984z = false;
        }

        public q(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f15982x = new Rect();
            this.f15983y = true;
            this.f15984z = false;
        }

        public q(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f15982x = new Rect();
            this.f15983y = true;
            this.f15984z = false;
        }

        public q(q qVar) {
            super((ViewGroup.LayoutParams) qVar);
            this.f15982x = new Rect();
            this.f15983y = true;
            this.f15984z = false;
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        p pVar = this.I;
        if (pVar != null) {
            return pVar.Q(layoutParams);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + Q());
    }
}
