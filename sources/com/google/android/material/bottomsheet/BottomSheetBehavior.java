package com.google.android.material.bottomsheet;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import nj.l;
import o3.c0;
import o3.p0;
import p3.c;
import p3.f;
import w3.c;
import wi.j;
import wi.k;

/* loaded from: classes3.dex */
public class BottomSheetBehavior<V extends View> extends CoordinatorLayout.c<V> {
    public static final int Y = k.f58912i;
    public float A;
    public int B;
    public float C;
    public boolean D;
    public boolean E;
    public boolean F;
    public int G;
    public w3.c H;
    public boolean I;
    public int J;
    public boolean K;
    public int L;
    public int M;
    public int N;
    public WeakReference<V> O;
    public WeakReference<View> P;
    public final ArrayList<g> Q;
    public VelocityTracker R;
    public int S;
    public int T;
    public boolean U;
    public Map<View, Integer> V;
    public int W;
    public final c.AbstractC0951c X;

    /* renamed from: a  reason: collision with root package name */
    public int f27392a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f27393b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f27394c;

    /* renamed from: d  reason: collision with root package name */
    public float f27395d;

    /* renamed from: e  reason: collision with root package name */
    public int f27396e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f27397f;

    /* renamed from: g  reason: collision with root package name */
    public int f27398g;

    /* renamed from: h  reason: collision with root package name */
    public int f27399h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f27400i;

    /* renamed from: j  reason: collision with root package name */
    public tj.g f27401j;

    /* renamed from: k  reason: collision with root package name */
    public int f27402k;

    /* renamed from: l  reason: collision with root package name */
    public int f27403l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f27404m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f27405n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f27406o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f27407p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f27408q;

    /* renamed from: r  reason: collision with root package name */
    public int f27409r;

    /* renamed from: s  reason: collision with root package name */
    public int f27410s;

    /* renamed from: t  reason: collision with root package name */
    public tj.k f27411t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f27412u;

    /* renamed from: v  reason: collision with root package name */
    public BottomSheetBehavior<V>.i f27413v;

    /* renamed from: w  reason: collision with root package name */
    public ValueAnimator f27414w;

    /* renamed from: x  reason: collision with root package name */
    public int f27415x;

    /* renamed from: y  reason: collision with root package name */
    public int f27416y;

    /* renamed from: z  reason: collision with root package name */
    public int f27417z;

    /* loaded from: classes3.dex */
    public class a implements Runnable {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ View f27418w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ ViewGroup.LayoutParams f27419x;

        public a(View view, ViewGroup.LayoutParams layoutParams) {
            this.f27418w = view;
            this.f27419x = layoutParams;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f27418w.setLayoutParams(this.f27419x);
        }
    }

    /* loaded from: classes3.dex */
    public class b implements Runnable {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ View f27421w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ int f27422x;

        public b(View view, int i10) {
            this.f27421w = view;
            this.f27422x = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            BottomSheetBehavior.this.C0(this.f27421w, this.f27422x);
        }
    }

    /* loaded from: classes3.dex */
    public class c implements ValueAnimator.AnimatorUpdateListener {
        public c() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            if (BottomSheetBehavior.this.f27401j != null) {
                BottomSheetBehavior.this.f27401j.Z(floatValue);
            }
        }
    }

    /* loaded from: classes3.dex */
    public class d implements l.c {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ boolean f27425a;

        public d(boolean z10) {
            this.f27425a = z10;
        }

        @Override // nj.l.c
        public p0 a(View view, p0 p0Var, l.d dVar) {
            BottomSheetBehavior.this.f27410s = p0Var.m();
            boolean d10 = l.d(view);
            int paddingBottom = view.getPaddingBottom();
            int paddingLeft = view.getPaddingLeft();
            int paddingRight = view.getPaddingRight();
            if (BottomSheetBehavior.this.f27405n) {
                BottomSheetBehavior.this.f27409r = p0Var.j();
                paddingBottom = dVar.f43668d + BottomSheetBehavior.this.f27409r;
            }
            if (BottomSheetBehavior.this.f27406o) {
                paddingLeft = (d10 ? dVar.f43667c : dVar.f43665a) + p0Var.k();
            }
            if (BottomSheetBehavior.this.f27407p) {
                paddingRight = (d10 ? dVar.f43665a : dVar.f43667c) + p0Var.l();
            }
            view.setPadding(paddingLeft, view.getPaddingTop(), paddingRight, paddingBottom);
            if (this.f27425a) {
                BottomSheetBehavior.this.f27403l = p0Var.h().f31716d;
            }
            if (BottomSheetBehavior.this.f27405n || this.f27425a) {
                BottomSheetBehavior.this.J0(false);
            }
            return p0Var;
        }
    }

    /* loaded from: classes3.dex */
    public class e extends c.AbstractC0951c {
        public e() {
        }

        @Override // w3.c.AbstractC0951c
        public int a(View view, int i10, int i11) {
            return view.getLeft();
        }

        @Override // w3.c.AbstractC0951c
        public int b(View view, int i10, int i11) {
            int d02 = BottomSheetBehavior.this.d0();
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            return i3.a.b(i10, d02, bottomSheetBehavior.D ? bottomSheetBehavior.N : bottomSheetBehavior.B);
        }

        @Override // w3.c.AbstractC0951c
        public int e(View view) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            if (bottomSheetBehavior.D) {
                return bottomSheetBehavior.N;
            }
            return bottomSheetBehavior.B;
        }

        @Override // w3.c.AbstractC0951c
        public void j(int i10) {
            if (i10 == 1 && BottomSheetBehavior.this.F) {
                BottomSheetBehavior.this.A0(1);
            }
        }

        @Override // w3.c.AbstractC0951c
        public void k(View view, int i10, int i11, int i12, int i13) {
            BottomSheetBehavior.this.a0(i11);
        }

        @Override // w3.c.AbstractC0951c
        public void l(View view, float f10, float f11) {
            int i10;
            int i11 = 4;
            if (f11 < 0.0f) {
                if (BottomSheetBehavior.this.f27393b) {
                    i10 = BottomSheetBehavior.this.f27416y;
                } else {
                    int top = view.getTop();
                    BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                    int i12 = bottomSheetBehavior.f27417z;
                    if (top > i12) {
                        i10 = i12;
                        i11 = 6;
                    } else {
                        i10 = bottomSheetBehavior.d0();
                    }
                }
                i11 = 3;
            } else {
                BottomSheetBehavior bottomSheetBehavior2 = BottomSheetBehavior.this;
                if (bottomSheetBehavior2.D && bottomSheetBehavior2.E0(view, f11)) {
                    if ((Math.abs(f10) >= Math.abs(f11) || f11 <= 500.0f) && !n(view)) {
                        if (BottomSheetBehavior.this.f27393b) {
                            i10 = BottomSheetBehavior.this.f27416y;
                        } else if (Math.abs(view.getTop() - BottomSheetBehavior.this.d0()) < Math.abs(view.getTop() - BottomSheetBehavior.this.f27417z)) {
                            i10 = BottomSheetBehavior.this.d0();
                        } else {
                            i10 = BottomSheetBehavior.this.f27417z;
                            i11 = 6;
                        }
                        i11 = 3;
                    } else {
                        i10 = BottomSheetBehavior.this.N;
                        i11 = 5;
                    }
                } else if (f11 != 0.0f && Math.abs(f10) <= Math.abs(f11)) {
                    if (BottomSheetBehavior.this.f27393b) {
                        i10 = BottomSheetBehavior.this.B;
                    } else {
                        int top2 = view.getTop();
                        if (Math.abs(top2 - BottomSheetBehavior.this.f27417z) < Math.abs(top2 - BottomSheetBehavior.this.B)) {
                            i10 = BottomSheetBehavior.this.f27417z;
                            i11 = 6;
                        } else {
                            i10 = BottomSheetBehavior.this.B;
                        }
                    }
                } else {
                    int top3 = view.getTop();
                    if (BottomSheetBehavior.this.f27393b) {
                        if (Math.abs(top3 - BottomSheetBehavior.this.f27416y) < Math.abs(top3 - BottomSheetBehavior.this.B)) {
                            i10 = BottomSheetBehavior.this.f27416y;
                            i11 = 3;
                        } else {
                            i10 = BottomSheetBehavior.this.B;
                        }
                    } else {
                        BottomSheetBehavior bottomSheetBehavior3 = BottomSheetBehavior.this;
                        int i13 = bottomSheetBehavior3.f27417z;
                        if (top3 < i13) {
                            if (top3 < Math.abs(top3 - bottomSheetBehavior3.B)) {
                                i10 = BottomSheetBehavior.this.d0();
                                i11 = 3;
                            } else {
                                i10 = BottomSheetBehavior.this.f27417z;
                            }
                        } else if (Math.abs(top3 - i13) < Math.abs(top3 - BottomSheetBehavior.this.B)) {
                            i10 = BottomSheetBehavior.this.f27417z;
                        } else {
                            i10 = BottomSheetBehavior.this.B;
                        }
                        i11 = 6;
                    }
                }
            }
            BottomSheetBehavior.this.F0(view, i11, i10, true);
        }

        @Override // w3.c.AbstractC0951c
        public boolean m(View view, int i10) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            int i11 = bottomSheetBehavior.G;
            if (i11 == 1 || bottomSheetBehavior.U) {
                return false;
            }
            if (i11 == 3 && bottomSheetBehavior.S == i10) {
                WeakReference<View> weakReference = bottomSheetBehavior.P;
                View view2 = weakReference != null ? weakReference.get() : null;
                if (view2 != null && view2.canScrollVertically(-1)) {
                    return false;
                }
            }
            WeakReference<V> weakReference2 = BottomSheetBehavior.this.O;
            return weakReference2 != null && weakReference2.get() == view;
        }

        public final boolean n(View view) {
            int top = view.getTop();
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            return top > (bottomSheetBehavior.N + bottomSheetBehavior.d0()) / 2;
        }
    }

    /* loaded from: classes3.dex */
    public class f implements p3.f {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f27428a;

        public f(int i10) {
            this.f27428a = i10;
        }

        @Override // p3.f
        public boolean a(View view, f.a aVar) {
            BottomSheetBehavior.this.z0(this.f27428a);
            return true;
        }
    }

    /* loaded from: classes3.dex */
    public static abstract class g {
        public abstract void a(View view, float f10);

        public abstract void b(View view, int i10);
    }

    /* loaded from: classes3.dex */
    public class i implements Runnable {

        /* renamed from: w  reason: collision with root package name */
        public final View f27434w;

        /* renamed from: x  reason: collision with root package name */
        public boolean f27435x;

        /* renamed from: y  reason: collision with root package name */
        public int f27436y;

        public i(View view, int i10) {
            this.f27434w = view;
            this.f27436y = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            w3.c cVar = BottomSheetBehavior.this.H;
            if (cVar != null && cVar.k(true)) {
                c0.j0(this.f27434w, this);
            } else {
                BottomSheetBehavior.this.A0(this.f27436y);
            }
            this.f27435x = false;
        }
    }

    public BottomSheetBehavior() {
        this.f27392a = 0;
        this.f27393b = true;
        this.f27394c = false;
        this.f27402k = -1;
        this.f27413v = null;
        this.A = 0.5f;
        this.C = -1.0f;
        this.F = true;
        this.G = 4;
        this.Q = new ArrayList<>();
        this.W = -1;
        this.X = new e();
    }

    public static <V extends View> BottomSheetBehavior<V> c0(V v10) {
        ViewGroup.LayoutParams layoutParams = v10.getLayoutParams();
        if (layoutParams instanceof CoordinatorLayout.f) {
            CoordinatorLayout.c f10 = ((CoordinatorLayout.f) layoutParams).f();
            if (f10 instanceof BottomSheetBehavior) {
                return (BottomSheetBehavior) f10;
            }
            throw new IllegalArgumentException("The view is not associated with BottomSheetBehavior");
        }
        throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean A(CoordinatorLayout coordinatorLayout, V v10, View view, View view2, int i10, int i11) {
        this.J = 0;
        this.K = false;
        return (i10 & 2) != 0;
    }

    public void A0(int i10) {
        V v10;
        if (this.G == i10) {
            return;
        }
        this.G = i10;
        WeakReference<V> weakReference = this.O;
        if (weakReference == null || (v10 = weakReference.get()) == null) {
            return;
        }
        if (i10 == 3) {
            I0(true);
        } else if (i10 == 6 || i10 == 5 || i10 == 4) {
            I0(false);
        }
        H0(i10);
        for (int i11 = 0; i11 < this.Q.size(); i11++) {
            this.Q.get(i11).b(v10, i10);
        }
        G0();
    }

    public final void B0(View view) {
        boolean z10 = (Build.VERSION.SDK_INT < 29 || h0() || this.f27397f) ? false : true;
        if (this.f27405n || this.f27406o || this.f27407p || z10) {
            l.a(view, new d(z10));
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void C(CoordinatorLayout coordinatorLayout, V v10, View view, int i10) {
        int i11;
        int i12 = 3;
        if (v10.getTop() == d0()) {
            A0(3);
            return;
        }
        WeakReference<View> weakReference = this.P;
        if (weakReference != null && view == weakReference.get() && this.K) {
            if (this.J > 0) {
                if (this.f27393b) {
                    i11 = this.f27416y;
                } else {
                    int top = v10.getTop();
                    int i13 = this.f27417z;
                    if (top > i13) {
                        i11 = i13;
                        i12 = 6;
                    } else {
                        i11 = d0();
                    }
                }
            } else if (this.D && E0(v10, g0())) {
                i11 = this.N;
                i12 = 5;
            } else if (this.J == 0) {
                int top2 = v10.getTop();
                if (this.f27393b) {
                    if (Math.abs(top2 - this.f27416y) < Math.abs(top2 - this.B)) {
                        i11 = this.f27416y;
                    } else {
                        i11 = this.B;
                        i12 = 4;
                    }
                } else {
                    int i14 = this.f27417z;
                    if (top2 < i14) {
                        if (top2 < Math.abs(top2 - this.B)) {
                            i11 = d0();
                        } else {
                            i11 = this.f27417z;
                        }
                    } else if (Math.abs(top2 - i14) < Math.abs(top2 - this.B)) {
                        i11 = this.f27417z;
                    } else {
                        i11 = this.B;
                        i12 = 4;
                    }
                    i12 = 6;
                }
            } else {
                if (this.f27393b) {
                    i11 = this.B;
                } else {
                    int top3 = v10.getTop();
                    if (Math.abs(top3 - this.f27417z) < Math.abs(top3 - this.B)) {
                        i11 = this.f27417z;
                        i12 = 6;
                    } else {
                        i11 = this.B;
                    }
                }
                i12 = 4;
            }
            F0(v10, i12, i11, false);
            this.K = false;
        }
    }

    public void C0(View view, int i10) {
        int i11;
        int i12;
        if (i10 == 4) {
            i11 = this.B;
        } else if (i10 == 6) {
            int i13 = this.f27417z;
            if (!this.f27393b || i13 > (i12 = this.f27416y)) {
                i11 = i13;
            } else {
                i10 = 3;
                i11 = i12;
            }
        } else if (i10 == 3) {
            i11 = d0();
        } else if (this.D && i10 == 5) {
            i11 = this.N;
        } else {
            throw new IllegalArgumentException("Illegal state argument: " + i10);
        }
        F0(view, i10, i11, false);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean D(CoordinatorLayout coordinatorLayout, V v10, MotionEvent motionEvent) {
        if (v10.isShown()) {
            int actionMasked = motionEvent.getActionMasked();
            if (this.G == 1 && actionMasked == 0) {
                return true;
            }
            w3.c cVar = this.H;
            if (cVar != null) {
                cVar.z(motionEvent);
            }
            if (actionMasked == 0) {
                l0();
            }
            if (this.R == null) {
                this.R = VelocityTracker.obtain();
            }
            this.R.addMovement(motionEvent);
            if (this.H != null && actionMasked == 2 && !this.I && Math.abs(this.T - motionEvent.getY()) > this.H.u()) {
                this.H.b(v10, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
            return !this.I;
        }
        return false;
    }

    public final void D0(int i10) {
        V v10 = this.O.get();
        if (v10 == null) {
            return;
        }
        ViewParent parent = v10.getParent();
        if (parent != null && parent.isLayoutRequested() && c0.U(v10)) {
            v10.post(new b(v10, i10));
        } else {
            C0(v10, i10);
        }
    }

    public boolean E0(View view, float f10) {
        if (this.E) {
            return true;
        }
        if (view.getTop() < this.B) {
            return false;
        }
        return Math.abs((((float) view.getTop()) + (f10 * 0.1f)) - ((float) this.B)) / ((float) V()) > 0.5f;
    }

    public void F0(View view, int i10, int i11, boolean z10) {
        w3.c cVar = this.H;
        if (cVar != null && (!z10 ? !cVar.H(view, view.getLeft(), i11) : !cVar.F(view.getLeft(), i11))) {
            A0(2);
            H0(i10);
            if (this.f27413v == null) {
                this.f27413v = new i(view, i10);
            }
            if (!this.f27413v.f27435x) {
                BottomSheetBehavior<V>.i iVar = this.f27413v;
                iVar.f27436y = i10;
                c0.j0(view, iVar);
                this.f27413v.f27435x = true;
                return;
            }
            this.f27413v.f27436y = i10;
            return;
        }
        A0(i10);
    }

    public final void G0() {
        V v10;
        WeakReference<V> weakReference = this.O;
        if (weakReference == null || (v10 = weakReference.get()) == null) {
            return;
        }
        c0.l0(v10, 524288);
        c0.l0(v10, 262144);
        c0.l0(v10, 1048576);
        int i10 = this.W;
        if (i10 != -1) {
            c0.l0(v10, i10);
        }
        if (!this.f27393b && this.G != 6) {
            this.W = R(v10, j.f58884a, 6);
        }
        if (this.D && this.G != 5) {
            k0(v10, c.a.f45765y, 5);
        }
        int i11 = this.G;
        if (i11 == 3) {
            k0(v10, c.a.f45764x, this.f27393b ? 4 : 6);
        } else if (i11 == 4) {
            k0(v10, c.a.f45763w, this.f27393b ? 3 : 6);
        } else if (i11 != 6) {
        } else {
            k0(v10, c.a.f45764x, 4);
            k0(v10, c.a.f45763w, 3);
        }
    }

    public final void H0(int i10) {
        ValueAnimator valueAnimator;
        if (i10 == 2) {
            return;
        }
        boolean z10 = i10 == 3;
        if (this.f27412u != z10) {
            this.f27412u = z10;
            if (this.f27401j == null || (valueAnimator = this.f27414w) == null) {
                return;
            }
            if (valueAnimator.isRunning()) {
                this.f27414w.reverse();
                return;
            }
            float f10 = z10 ? 0.0f : 1.0f;
            this.f27414w.setFloatValues(1.0f - f10, f10);
            this.f27414w.start();
        }
    }

    public final void I0(boolean z10) {
        Map<View, Integer> map;
        WeakReference<V> weakReference = this.O;
        if (weakReference == null) {
            return;
        }
        ViewParent parent = weakReference.get().getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (Build.VERSION.SDK_INT >= 16 && z10) {
                if (this.V != null) {
                    return;
                }
                this.V = new HashMap(childCount);
            }
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = coordinatorLayout.getChildAt(i10);
                if (childAt != this.O.get()) {
                    if (z10) {
                        if (Build.VERSION.SDK_INT >= 16) {
                            this.V.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                        }
                        if (this.f27394c) {
                            c0.C0(childAt, 4);
                        }
                    } else if (this.f27394c && (map = this.V) != null && map.containsKey(childAt)) {
                        c0.C0(childAt, this.V.get(childAt).intValue());
                    }
                }
            }
            if (!z10) {
                this.V = null;
            } else if (this.f27394c) {
                this.O.get().sendAccessibilityEvent(8);
            }
        }
    }

    public final void J0(boolean z10) {
        V v10;
        if (this.O != null) {
            T();
            if (this.G != 4 || (v10 = this.O.get()) == null) {
                return;
            }
            if (z10) {
                D0(this.G);
            } else {
                v10.requestLayout();
            }
        }
    }

    public final int R(V v10, int i10, int i11) {
        return c0.c(v10, v10.getResources().getString(i10), W(i11));
    }

    public void S(g gVar) {
        if (this.Q.contains(gVar)) {
            return;
        }
        this.Q.add(gVar);
    }

    public final void T() {
        int V = V();
        if (this.f27393b) {
            this.B = Math.max(this.N - V, this.f27416y);
        } else {
            this.B = this.N - V;
        }
    }

    public final void U() {
        this.f27417z = (int) (this.N * (1.0f - this.A));
    }

    public final int V() {
        int i10;
        if (this.f27397f) {
            return Math.min(Math.max(this.f27398g, this.N - ((this.M * 9) / 16)), this.L) + this.f27409r;
        }
        if (!this.f27404m && !this.f27405n && (i10 = this.f27403l) > 0) {
            return Math.max(this.f27396e, i10 + this.f27399h);
        }
        return this.f27396e + this.f27409r;
    }

    public final p3.f W(int i10) {
        return new f(i10);
    }

    public final void X(Context context, AttributeSet attributeSet, boolean z10) {
        Y(context, attributeSet, z10, null);
    }

    public final void Y(Context context, AttributeSet attributeSet, boolean z10, ColorStateList colorStateList) {
        if (this.f27400i) {
            this.f27411t = tj.k.e(context, attributeSet, wi.b.f58768e, Y).m();
            tj.g gVar = new tj.g(this.f27411t);
            this.f27401j = gVar;
            gVar.N(context);
            if (z10 && colorStateList != null) {
                this.f27401j.Y(colorStateList);
                return;
            }
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(16842801, typedValue, true);
            this.f27401j.setTint(typedValue.data);
        }
    }

    public final void Z() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f27414w = ofFloat;
        ofFloat.setDuration(500L);
        this.f27414w.addUpdateListener(new c());
    }

    public void a0(int i10) {
        float f10;
        float f11;
        V v10 = this.O.get();
        if (v10 == null || this.Q.isEmpty()) {
            return;
        }
        int i11 = this.B;
        if (i10 <= i11 && i11 != d0()) {
            int i12 = this.B;
            f10 = i12 - i10;
            f11 = i12 - d0();
        } else {
            int i13 = this.B;
            f10 = i13 - i10;
            f11 = this.N - i13;
        }
        float f12 = f10 / f11;
        for (int i14 = 0; i14 < this.Q.size(); i14++) {
            this.Q.get(i14).a(v10, f12);
        }
    }

    public View b0(View view) {
        if (c0.W(view)) {
            return view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View b02 = b0(viewGroup.getChildAt(i10));
                if (b02 != null) {
                    return b02;
                }
            }
            return null;
        }
        return null;
    }

    public int d0() {
        if (this.f27393b) {
            return this.f27416y;
        }
        return Math.max(this.f27415x, this.f27408q ? 0 : this.f27410s);
    }

    public tj.g e0() {
        return this.f27401j;
    }

    public int f0() {
        return this.G;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void g(CoordinatorLayout.f fVar) {
        super.g(fVar);
        this.O = null;
        this.H = null;
    }

    public final float g0() {
        VelocityTracker velocityTracker = this.R;
        if (velocityTracker == null) {
            return 0.0f;
        }
        velocityTracker.computeCurrentVelocity(1000, this.f27395d);
        return this.R.getYVelocity(this.S);
    }

    public boolean h0() {
        return this.f27404m;
    }

    public boolean i0() {
        return this.D;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void j() {
        super.j();
        this.O = null;
        this.H = null;
    }

    public void j0(g gVar) {
        this.Q.remove(gVar);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean k(CoordinatorLayout coordinatorLayout, V v10, MotionEvent motionEvent) {
        w3.c cVar;
        if (v10.isShown() && this.F) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                l0();
            }
            if (this.R == null) {
                this.R = VelocityTracker.obtain();
            }
            this.R.addMovement(motionEvent);
            if (actionMasked == 0) {
                int x10 = (int) motionEvent.getX();
                this.T = (int) motionEvent.getY();
                if (this.G != 2) {
                    WeakReference<View> weakReference = this.P;
                    View view = weakReference != null ? weakReference.get() : null;
                    if (view != null && coordinatorLayout.v(view, x10, this.T)) {
                        this.S = motionEvent.getPointerId(motionEvent.getActionIndex());
                        this.U = true;
                    }
                }
                this.I = this.S == -1 && !coordinatorLayout.v(v10, x10, this.T);
            } else if (actionMasked == 1 || actionMasked == 3) {
                this.U = false;
                this.S = -1;
                if (this.I) {
                    this.I = false;
                    return false;
                }
            }
            if (this.I || (cVar = this.H) == null || !cVar.G(motionEvent)) {
                WeakReference<View> weakReference2 = this.P;
                View view2 = weakReference2 != null ? weakReference2.get() : null;
                return (actionMasked != 2 || view2 == null || this.I || this.G == 1 || coordinatorLayout.v(view2, (int) motionEvent.getX(), (int) motionEvent.getY()) || this.H == null || Math.abs(((float) this.T) - motionEvent.getY()) <= ((float) this.H.u())) ? false : true;
            }
            return true;
        }
        this.I = true;
        return false;
    }

    public final void k0(V v10, c.a aVar, int i10) {
        c0.n0(v10, aVar, null, W(i10));
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean l(CoordinatorLayout coordinatorLayout, V v10, int i10) {
        tj.g gVar;
        if (c0.B(coordinatorLayout) && !c0.B(v10)) {
            v10.setFitsSystemWindows(true);
        }
        if (this.O == null) {
            this.f27398g = coordinatorLayout.getResources().getDimensionPixelSize(wi.d.f58802b);
            B0(v10);
            this.O = new WeakReference<>(v10);
            if (this.f27400i && (gVar = this.f27401j) != null) {
                c0.v0(v10, gVar);
            }
            tj.g gVar2 = this.f27401j;
            if (gVar2 != null) {
                float f10 = this.C;
                if (f10 == -1.0f) {
                    f10 = c0.y(v10);
                }
                gVar2.X(f10);
                boolean z10 = this.G == 3;
                this.f27412u = z10;
                this.f27401j.Z(z10 ? 0.0f : 1.0f);
            }
            G0();
            if (c0.C(v10) == 0) {
                c0.C0(v10, 1);
            }
            int measuredWidth = v10.getMeasuredWidth();
            int i11 = this.f27402k;
            if (measuredWidth > i11 && i11 != -1) {
                ViewGroup.LayoutParams layoutParams = v10.getLayoutParams();
                layoutParams.width = this.f27402k;
                v10.post(new a(v10, layoutParams));
            }
        }
        if (this.H == null) {
            this.H = w3.c.m(coordinatorLayout, this.X);
        }
        int top = v10.getTop();
        coordinatorLayout.C(v10, i10);
        this.M = coordinatorLayout.getWidth();
        this.N = coordinatorLayout.getHeight();
        int height = v10.getHeight();
        this.L = height;
        int i12 = this.N;
        int i13 = i12 - height;
        int i14 = this.f27410s;
        if (i13 < i14) {
            if (this.f27408q) {
                this.L = i12;
            } else {
                this.L = i12 - i14;
            }
        }
        this.f27416y = Math.max(0, i12 - this.L);
        U();
        T();
        int i15 = this.G;
        if (i15 == 3) {
            c0.c0(v10, d0());
        } else if (i15 == 6) {
            c0.c0(v10, this.f27417z);
        } else if (this.D && i15 == 5) {
            c0.c0(v10, this.N);
        } else if (i15 == 4) {
            c0.c0(v10, this.B);
        } else if (i15 == 1 || i15 == 2) {
            c0.c0(v10, top - v10.getTop());
        }
        this.P = new WeakReference<>(b0(v10));
        return true;
    }

    public final void l0() {
        this.S = -1;
        VelocityTracker velocityTracker = this.R;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.R = null;
        }
    }

    public final void m0(h hVar) {
        int i10 = this.f27392a;
        if (i10 == 0) {
            return;
        }
        if (i10 == -1 || (i10 & 1) == 1) {
            this.f27396e = hVar.f27431x;
        }
        if (i10 == -1 || (i10 & 2) == 2) {
            this.f27393b = hVar.f27432y;
        }
        if (i10 == -1 || (i10 & 4) == 4) {
            this.D = hVar.f27433z;
        }
        if (i10 == -1 || (i10 & 8) == 8) {
            this.E = hVar.A;
        }
    }

    @Deprecated
    public void n0(g gVar) {
        Log.w("BottomSheetBehavior", "BottomSheetBehavior now supports multiple callbacks. `setBottomSheetCallback()` removes all existing callbacks, including ones set internally by library authors, which may result in unintended behavior. This may change in the future. Please use `addBottomSheetCallback()` and `removeBottomSheetCallback()` instead to set your own callbacks.");
        this.Q.clear();
        if (gVar != null) {
            this.Q.add(gVar);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean o(CoordinatorLayout coordinatorLayout, V v10, View view, float f10, float f11) {
        WeakReference<View> weakReference = this.P;
        if (weakReference == null || view != weakReference.get()) {
            return false;
        }
        return this.G != 3 || super.o(coordinatorLayout, v10, view, f10, f11);
    }

    public void o0(boolean z10) {
        this.F = z10;
    }

    public void p0(int i10) {
        if (i10 >= 0) {
            this.f27415x = i10;
            return;
        }
        throw new IllegalArgumentException("offset must be greater than or equal to 0");
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void q(CoordinatorLayout coordinatorLayout, V v10, View view, int i10, int i11, int[] iArr, int i12) {
        if (i12 == 1) {
            return;
        }
        WeakReference<View> weakReference = this.P;
        if (view != (weakReference != null ? weakReference.get() : null)) {
            return;
        }
        int top = v10.getTop();
        int i13 = top - i11;
        if (i11 > 0) {
            if (i13 < d0()) {
                iArr[1] = top - d0();
                c0.c0(v10, -iArr[1]);
                A0(3);
            } else if (!this.F) {
                return;
            } else {
                iArr[1] = i11;
                c0.c0(v10, -i11);
                A0(1);
            }
        } else if (i11 < 0 && !view.canScrollVertically(-1)) {
            int i14 = this.B;
            if (i13 > i14 && !this.D) {
                iArr[1] = top - i14;
                c0.c0(v10, -iArr[1]);
                A0(4);
            } else if (!this.F) {
                return;
            } else {
                iArr[1] = i11;
                c0.c0(v10, -i11);
                A0(1);
            }
        }
        a0(v10.getTop());
        this.J = i11;
        this.K = true;
    }

    public void q0(boolean z10) {
        if (this.f27393b == z10) {
            return;
        }
        this.f27393b = z10;
        if (this.O != null) {
            T();
        }
        A0((this.f27393b && this.G == 6) ? 3 : this.G);
        G0();
    }

    public void r0(boolean z10) {
        this.f27404m = z10;
    }

    public void s0(float f10) {
        if (f10 > 0.0f && f10 < 1.0f) {
            this.A = f10;
            if (this.O != null) {
                U();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void t(CoordinatorLayout coordinatorLayout, V v10, View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
    }

    public void t0(boolean z10) {
        if (this.D != z10) {
            this.D = z10;
            if (!z10 && this.G == 5) {
                z0(4);
            }
            G0();
        }
    }

    public void u0(int i10) {
        this.f27402k = i10;
    }

    public void v0(int i10) {
        w0(i10, false);
    }

    public final void w0(int i10, boolean z10) {
        boolean z11 = true;
        if (i10 == -1) {
            if (!this.f27397f) {
                this.f27397f = true;
            }
            z11 = false;
        } else {
            if (this.f27397f || this.f27396e != i10) {
                this.f27397f = false;
                this.f27396e = Math.max(0, i10);
            }
            z11 = false;
        }
        if (z11) {
            J0(z10);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void x(CoordinatorLayout coordinatorLayout, V v10, Parcelable parcelable) {
        h hVar = (h) parcelable;
        super.x(coordinatorLayout, v10, hVar.getSuperState());
        m0(hVar);
        int i10 = hVar.f27430w;
        if (i10 != 1 && i10 != 2) {
            this.G = i10;
        } else {
            this.G = 4;
        }
    }

    public void x0(int i10) {
        this.f27392a = i10;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public Parcelable y(CoordinatorLayout coordinatorLayout, V v10) {
        return new h(super.y(coordinatorLayout, v10), (BottomSheetBehavior<?>) this);
    }

    public void y0(boolean z10) {
        this.E = z10;
    }

    public void z0(int i10) {
        if (i10 == this.G) {
            return;
        }
        if (this.O == null) {
            if (i10 == 4 || i10 == 3 || i10 == 6 || (this.D && i10 == 5)) {
                this.G = i10;
                return;
            }
            return;
        }
        D0(i10);
    }

    /* loaded from: classes3.dex */
    public static class h extends v3.a {
        public static final Parcelable.Creator<h> CREATOR = new a();
        public boolean A;

        /* renamed from: w  reason: collision with root package name */
        public final int f27430w;

        /* renamed from: x  reason: collision with root package name */
        public int f27431x;

        /* renamed from: y  reason: collision with root package name */
        public boolean f27432y;

        /* renamed from: z  reason: collision with root package name */
        public boolean f27433z;

        /* loaded from: classes3.dex */
        public static class a implements Parcelable.ClassLoaderCreator<h> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public h createFromParcel(Parcel parcel) {
                return new h(parcel, (ClassLoader) null);
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
            this.f27430w = parcel.readInt();
            this.f27431x = parcel.readInt();
            this.f27432y = parcel.readInt() == 1;
            this.f27433z = parcel.readInt() == 1;
            this.A = parcel.readInt() == 1;
        }

        @Override // v3.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f27430w);
            parcel.writeInt(this.f27431x);
            parcel.writeInt(this.f27432y ? 1 : 0);
            parcel.writeInt(this.f27433z ? 1 : 0);
            parcel.writeInt(this.A ? 1 : 0);
        }

        public h(Parcelable parcelable, BottomSheetBehavior<?> bottomSheetBehavior) {
            super(parcelable);
            this.f27430w = bottomSheetBehavior.G;
            this.f27431x = bottomSheetBehavior.f27396e;
            this.f27432y = bottomSheetBehavior.f27393b;
            this.f27433z = bottomSheetBehavior.D;
            this.A = bottomSheetBehavior.E;
        }
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int i10;
        this.f27392a = 0;
        this.f27393b = true;
        this.f27394c = false;
        this.f27402k = -1;
        this.f27413v = null;
        this.A = 0.5f;
        this.C = -1.0f;
        this.F = true;
        this.G = 4;
        this.Q = new ArrayList<>();
        this.W = -1;
        this.X = new e();
        this.f27399h = context.getResources().getDimensionPixelSize(wi.d.V);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, wi.l.N);
        this.f27400i = obtainStyledAttributes.hasValue(wi.l.f58967e0);
        int i11 = wi.l.Q;
        boolean hasValue = obtainStyledAttributes.hasValue(i11);
        if (hasValue) {
            Y(context, attributeSet, hasValue, qj.c.a(context, obtainStyledAttributes, i11));
        } else {
            X(context, attributeSet, hasValue);
        }
        Z();
        if (Build.VERSION.SDK_INT >= 21) {
            this.C = obtainStyledAttributes.getDimension(wi.l.P, -1.0f);
        }
        int i12 = wi.l.O;
        if (obtainStyledAttributes.hasValue(i12)) {
            u0(obtainStyledAttributes.getDimensionPixelSize(i12, -1));
        }
        int i13 = wi.l.W;
        TypedValue peekValue = obtainStyledAttributes.peekValue(i13);
        if (peekValue != null && (i10 = peekValue.data) == -1) {
            v0(i10);
        } else {
            v0(obtainStyledAttributes.getDimensionPixelSize(i13, -1));
        }
        t0(obtainStyledAttributes.getBoolean(wi.l.V, false));
        r0(obtainStyledAttributes.getBoolean(wi.l.Z, false));
        q0(obtainStyledAttributes.getBoolean(wi.l.T, true));
        y0(obtainStyledAttributes.getBoolean(wi.l.Y, false));
        o0(obtainStyledAttributes.getBoolean(wi.l.R, true));
        x0(obtainStyledAttributes.getInt(wi.l.X, 0));
        s0(obtainStyledAttributes.getFloat(wi.l.U, 0.5f));
        int i14 = wi.l.S;
        TypedValue peekValue2 = obtainStyledAttributes.peekValue(i14);
        if (peekValue2 != null && peekValue2.type == 16) {
            p0(peekValue2.data);
        } else {
            p0(obtainStyledAttributes.getDimensionPixelOffset(i14, 0));
        }
        this.f27405n = obtainStyledAttributes.getBoolean(wi.l.f58931a0, false);
        this.f27406o = obtainStyledAttributes.getBoolean(wi.l.f58940b0, false);
        this.f27407p = obtainStyledAttributes.getBoolean(wi.l.f58949c0, false);
        this.f27408q = obtainStyledAttributes.getBoolean(wi.l.f58958d0, true);
        obtainStyledAttributes.recycle();
        this.f27395d = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }
}
