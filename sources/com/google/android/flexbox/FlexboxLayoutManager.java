package com.google.android.flexbox;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.r;
import androidx.recyclerview.widget.x;
import com.google.android.flexbox.a;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public class FlexboxLayoutManager extends RecyclerView.p implements qg.a, RecyclerView.a0.b {

    /* renamed from: o0  reason: collision with root package name */
    public static final Rect f27094o0 = new Rect();
    public int O;
    public int P;
    public int Q;
    public int R;
    public boolean T;
    public boolean U;
    public RecyclerView.w X;
    public RecyclerView.b0 Y;
    public d Z;

    /* renamed from: b0  reason: collision with root package name */
    public x f27096b0;

    /* renamed from: c0  reason: collision with root package name */
    public x f27097c0;

    /* renamed from: d0  reason: collision with root package name */
    public e f27098d0;

    /* renamed from: i0  reason: collision with root package name */
    public boolean f27103i0;

    /* renamed from: k0  reason: collision with root package name */
    public final Context f27105k0;

    /* renamed from: l0  reason: collision with root package name */
    public View f27106l0;
    public int S = -1;
    public List<qg.c> V = new ArrayList();
    public final com.google.android.flexbox.a W = new com.google.android.flexbox.a(this);

    /* renamed from: a0  reason: collision with root package name */
    public b f27095a0 = new b();

    /* renamed from: e0  reason: collision with root package name */
    public int f27099e0 = -1;

    /* renamed from: f0  reason: collision with root package name */
    public int f27100f0 = Integer.MIN_VALUE;

    /* renamed from: g0  reason: collision with root package name */
    public int f27101g0 = Integer.MIN_VALUE;

    /* renamed from: h0  reason: collision with root package name */
    public int f27102h0 = Integer.MIN_VALUE;

    /* renamed from: j0  reason: collision with root package name */
    public SparseArray<View> f27104j0 = new SparseArray<>();

    /* renamed from: m0  reason: collision with root package name */
    public int f27107m0 = -1;

    /* renamed from: n0  reason: collision with root package name */
    public a.b f27108n0 = new a.b();

    /* loaded from: classes3.dex */
    public class b {

        /* renamed from: a  reason: collision with root package name */
        public int f27109a;

        /* renamed from: b  reason: collision with root package name */
        public int f27110b;

        /* renamed from: c  reason: collision with root package name */
        public int f27111c;

        /* renamed from: d  reason: collision with root package name */
        public int f27112d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f27113e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f27114f;

        /* renamed from: g  reason: collision with root package name */
        public boolean f27115g;

        public b() {
            this.f27112d = 0;
        }

        public static /* synthetic */ int l(b bVar, int i10) {
            int i11 = bVar.f27112d + i10;
            bVar.f27112d = i11;
            return i11;
        }

        public final void r() {
            if (!FlexboxLayoutManager.this.l() && FlexboxLayoutManager.this.T) {
                this.f27111c = this.f27113e ? FlexboxLayoutManager.this.f27096b0.i() : FlexboxLayoutManager.this.v0() - FlexboxLayoutManager.this.f27096b0.m();
            } else {
                this.f27111c = this.f27113e ? FlexboxLayoutManager.this.f27096b0.i() : FlexboxLayoutManager.this.f27096b0.m();
            }
        }

        public final void s(View view) {
            x xVar = FlexboxLayoutManager.this.P == 0 ? FlexboxLayoutManager.this.f27097c0 : FlexboxLayoutManager.this.f27096b0;
            if (!FlexboxLayoutManager.this.l() && FlexboxLayoutManager.this.T) {
                if (this.f27113e) {
                    this.f27111c = xVar.g(view) + xVar.o();
                } else {
                    this.f27111c = xVar.d(view);
                }
            } else if (this.f27113e) {
                this.f27111c = xVar.d(view) + xVar.o();
            } else {
                this.f27111c = xVar.g(view);
            }
            this.f27109a = FlexboxLayoutManager.this.o0(view);
            this.f27115g = false;
            int[] iArr = FlexboxLayoutManager.this.W.f27131c;
            int i10 = this.f27109a;
            if (i10 == -1) {
                i10 = 0;
            }
            int i11 = iArr[i10];
            this.f27110b = i11 != -1 ? i11 : 0;
            if (FlexboxLayoutManager.this.V.size() > this.f27110b) {
                this.f27109a = ((qg.c) FlexboxLayoutManager.this.V.get(this.f27110b)).f49485o;
            }
        }

        public final void t() {
            this.f27109a = -1;
            this.f27110b = -1;
            this.f27111c = Integer.MIN_VALUE;
            this.f27114f = false;
            this.f27115g = false;
            if (FlexboxLayoutManager.this.l()) {
                if (FlexboxLayoutManager.this.P == 0) {
                    this.f27113e = FlexboxLayoutManager.this.O == 1;
                } else {
                    this.f27113e = FlexboxLayoutManager.this.P == 2;
                }
            } else if (FlexboxLayoutManager.this.P == 0) {
                this.f27113e = FlexboxLayoutManager.this.O == 3;
            } else {
                this.f27113e = FlexboxLayoutManager.this.P == 2;
            }
        }

        public String toString() {
            return "AnchorInfo{mPosition=" + this.f27109a + ", mFlexLinePosition=" + this.f27110b + ", mCoordinate=" + this.f27111c + ", mPerpendicularCoordinate=" + this.f27112d + ", mLayoutFromEnd=" + this.f27113e + ", mValid=" + this.f27114f + ", mAssignedFromSavedState=" + this.f27115g + '}';
        }
    }

    /* loaded from: classes3.dex */
    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public int f27117a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f27118b;

        /* renamed from: c  reason: collision with root package name */
        public int f27119c;

        /* renamed from: d  reason: collision with root package name */
        public int f27120d;

        /* renamed from: e  reason: collision with root package name */
        public int f27121e;

        /* renamed from: f  reason: collision with root package name */
        public int f27122f;

        /* renamed from: g  reason: collision with root package name */
        public int f27123g;

        /* renamed from: h  reason: collision with root package name */
        public int f27124h;

        /* renamed from: i  reason: collision with root package name */
        public int f27125i;

        /* renamed from: j  reason: collision with root package name */
        public boolean f27126j;

        public d() {
            this.f27124h = 1;
            this.f27125i = 1;
        }

        public static /* synthetic */ int c(d dVar, int i10) {
            int i11 = dVar.f27121e + i10;
            dVar.f27121e = i11;
            return i11;
        }

        public static /* synthetic */ int d(d dVar, int i10) {
            int i11 = dVar.f27121e - i10;
            dVar.f27121e = i11;
            return i11;
        }

        public static /* synthetic */ int i(d dVar, int i10) {
            int i11 = dVar.f27117a - i10;
            dVar.f27117a = i11;
            return i11;
        }

        public static /* synthetic */ int l(d dVar) {
            int i10 = dVar.f27119c;
            dVar.f27119c = i10 + 1;
            return i10;
        }

        public static /* synthetic */ int m(d dVar) {
            int i10 = dVar.f27119c;
            dVar.f27119c = i10 - 1;
            return i10;
        }

        public static /* synthetic */ int n(d dVar, int i10) {
            int i11 = dVar.f27119c + i10;
            dVar.f27119c = i11;
            return i11;
        }

        public static /* synthetic */ int q(d dVar, int i10) {
            int i11 = dVar.f27122f + i10;
            dVar.f27122f = i11;
            return i11;
        }

        public static /* synthetic */ int u(d dVar, int i10) {
            int i11 = dVar.f27120d + i10;
            dVar.f27120d = i11;
            return i11;
        }

        public static /* synthetic */ int v(d dVar, int i10) {
            int i11 = dVar.f27120d - i10;
            dVar.f27120d = i11;
            return i11;
        }

        public final boolean D(RecyclerView.b0 b0Var, List<qg.c> list) {
            int i10;
            int i11 = this.f27120d;
            return i11 >= 0 && i11 < b0Var.b() && (i10 = this.f27119c) >= 0 && i10 < list.size();
        }

        public String toString() {
            return "LayoutState{mAvailable=" + this.f27117a + ", mFlexLinePosition=" + this.f27119c + ", mPosition=" + this.f27120d + ", mOffset=" + this.f27121e + ", mScrollingOffset=" + this.f27122f + ", mLastScrollDelta=" + this.f27123g + ", mItemDirection=" + this.f27124h + ", mLayoutDirection=" + this.f27125i + '}';
        }
    }

    public FlexboxLayoutManager(Context context, AttributeSet attributeSet, int i10, int i11) {
        RecyclerView.p.d p02 = RecyclerView.p.p0(context, attributeSet, i10, i11);
        int i12 = p02.f15977a;
        if (i12 != 0) {
            if (i12 == 1) {
                if (p02.f15979c) {
                    N2(3);
                } else {
                    N2(2);
                }
            }
        } else if (p02.f15979c) {
            N2(1);
        } else {
            N2(0);
        }
        O2(1);
        M2(4);
        this.f27105k0 = context;
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

    private boolean O1(View view, int i10, int i11, RecyclerView.q qVar) {
        return (!view.isLayoutRequested() && D0() && E0(view.getWidth(), i10, ((ViewGroup.MarginLayoutParams) qVar).width) && E0(view.getHeight(), i11, ((ViewGroup.MarginLayoutParams) qVar).height)) ? false : true;
    }

    public final int A2(int i10, RecyclerView.w wVar, RecyclerView.b0 b0Var) {
        if (U() == 0 || i10 == 0) {
            return 0;
        }
        j2();
        int i11 = 1;
        this.Z.f27126j = true;
        boolean z10 = !l() && this.T;
        if (!z10 ? i10 <= 0 : i10 >= 0) {
            i11 = -1;
        }
        int abs = Math.abs(i10);
        U2(i11, abs);
        int k22 = this.Z.f27122f + k2(wVar, b0Var, this.Z);
        if (k22 < 0) {
            return 0;
        }
        if (z10) {
            if (abs > k22) {
                i10 = (-i11) * k22;
            }
        } else if (abs > k22) {
            i10 = i11 * k22;
        }
        this.f27096b0.r(-i10);
        this.Z.f27123g = i10;
        return i10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int B(RecyclerView.b0 b0Var) {
        return f2(b0Var);
    }

    public final int B2(int i10) {
        int i11;
        if (U() == 0 || i10 == 0) {
            return 0;
        }
        j2();
        boolean l10 = l();
        View view = this.f27106l0;
        int width = l10 ? view.getWidth() : view.getHeight();
        int v02 = l10 ? v0() : h0();
        if (k0() == 1) {
            int abs = Math.abs(i10);
            if (i10 >= 0) {
                if (this.f27095a0.f27112d + i10 <= 0) {
                    return i10;
                }
                i11 = this.f27095a0.f27112d;
            } else {
                i11 = Math.min((v02 + this.f27095a0.f27112d) - width, abs);
            }
        } else if (i10 <= 0) {
            if (this.f27095a0.f27112d + i10 >= 0) {
                return i10;
            }
            i11 = this.f27095a0.f27112d;
        } else {
            return Math.min((v02 - this.f27095a0.f27112d) - width, i10);
        }
        return -i11;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int C(RecyclerView.b0 b0Var) {
        return g2(b0Var);
    }

    public final boolean C2(View view, boolean z10) {
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int v02 = v0() - getPaddingRight();
        int h02 = h0() - getPaddingBottom();
        int x22 = x2(view);
        int z22 = z2(view);
        int y22 = y2(view);
        int v22 = v2(view);
        return z10 ? (paddingLeft <= x22 && v02 >= y22) && (paddingTop <= z22 && h02 >= v22) : (x22 >= v02 || y22 >= paddingLeft) && (z22 >= h02 || v22 >= paddingTop);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int D(RecyclerView.b0 b0Var) {
        return h2(b0Var);
    }

    public final int D2(qg.c cVar, d dVar) {
        if (l()) {
            return E2(cVar, dVar);
        }
        return F2(cVar, dVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int E(RecyclerView.b0 b0Var) {
        return f2(b0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00ce  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int E2(qg.c r22, com.google.android.flexbox.FlexboxLayoutManager.d r23) {
        /*
            Method dump skipped, instructions count: 423
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayoutManager.E2(qg.c, com.google.android.flexbox.FlexboxLayoutManager$d):int");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int F(RecyclerView.b0 b0Var) {
        return g2(b0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int F1(int i10, RecyclerView.w wVar, RecyclerView.b0 b0Var) {
        if (l() && this.P != 0) {
            int B2 = B2(i10);
            b.l(this.f27095a0, B2);
            this.f27097c0.r(-B2);
            return B2;
        }
        int A2 = A2(i10, wVar, b0Var);
        this.f27104j0.clear();
        return A2;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00d4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int F2(qg.c r26, com.google.android.flexbox.FlexboxLayoutManager.d r27) {
        /*
            Method dump skipped, instructions count: 541
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayoutManager.F2(qg.c, com.google.android.flexbox.FlexboxLayoutManager$d):int");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int G(RecyclerView.b0 b0Var) {
        return h2(b0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void G1(int i10) {
        this.f27099e0 = i10;
        this.f27100f0 = Integer.MIN_VALUE;
        e eVar = this.f27098d0;
        if (eVar != null) {
            eVar.h();
        }
        C1();
    }

    public final void G2(RecyclerView.w wVar, d dVar) {
        if (dVar.f27126j) {
            if (dVar.f27125i == -1) {
                I2(wVar, dVar);
            } else {
                J2(wVar, dVar);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int H1(int i10, RecyclerView.w wVar, RecyclerView.b0 b0Var) {
        if (!l() && (this.P != 0 || l())) {
            int B2 = B2(i10);
            b.l(this.f27095a0, B2);
            this.f27097c0.r(-B2);
            return B2;
        }
        int A2 = A2(i10, wVar, b0Var);
        this.f27104j0.clear();
        return A2;
    }

    public final void H2(RecyclerView.w wVar, int i10, int i11) {
        while (i11 >= i10) {
            w1(i11, wVar);
            i11--;
        }
    }

    public final void I2(RecyclerView.w wVar, d dVar) {
        int U;
        int i10;
        View T;
        int i11;
        if (dVar.f27122f < 0 || (U = U()) == 0 || (T = T(U - 1)) == null || (i11 = this.W.f27131c[o0(T)]) == -1) {
            return;
        }
        qg.c cVar = this.V.get(i11);
        int i12 = i10;
        while (true) {
            if (i12 < 0) {
                break;
            }
            View T2 = T(i12);
            if (T2 != null) {
                if (!c2(T2, dVar.f27122f)) {
                    break;
                } else if (cVar.f49485o != o0(T2)) {
                    continue;
                } else if (i11 <= 0) {
                    U = i12;
                    break;
                } else {
                    i11 += dVar.f27125i;
                    cVar = this.V.get(i11);
                    U = i12;
                }
            }
            i12--;
        }
        H2(wVar, U, i10);
    }

    public final void J2(RecyclerView.w wVar, d dVar) {
        int U;
        View T;
        if (dVar.f27122f < 0 || (U = U()) == 0 || (T = T(0)) == null) {
            return;
        }
        int i10 = this.W.f27131c[o0(T)];
        int i11 = -1;
        if (i10 == -1) {
            return;
        }
        qg.c cVar = this.V.get(i10);
        int i12 = 0;
        while (true) {
            if (i12 >= U) {
                break;
            }
            View T2 = T(i12);
            if (T2 != null) {
                if (!d2(T2, dVar.f27122f)) {
                    break;
                } else if (cVar.f49486p != o0(T2)) {
                    continue;
                } else if (i10 >= this.V.size() - 1) {
                    i11 = i12;
                    break;
                } else {
                    i10 += dVar.f27125i;
                    cVar = this.V.get(i10);
                    i11 = i12;
                }
            }
            i12++;
        }
        H2(wVar, 0, i11);
    }

    public final void K2() {
        int w02;
        if (l()) {
            w02 = i0();
        } else {
            w02 = w0();
        }
        this.Z.f27118b = w02 == 0 || w02 == Integer.MIN_VALUE;
    }

    public final void L2() {
        int k02 = k0();
        int i10 = this.O;
        if (i10 == 0) {
            this.T = k02 == 1;
            this.U = this.P == 2;
        } else if (i10 == 1) {
            this.T = k02 != 1;
            this.U = this.P == 2;
        } else if (i10 == 2) {
            boolean z10 = k02 == 1;
            this.T = z10;
            if (this.P == 2) {
                this.T = !z10;
            }
            this.U = false;
        } else if (i10 != 3) {
            this.T = false;
            this.U = false;
        } else {
            boolean z11 = k02 == 1;
            this.T = z11;
            if (this.P == 2) {
                this.T = !z11;
            }
            this.U = true;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void M0(RecyclerView.h hVar, RecyclerView.h hVar2) {
        s1();
    }

    public void M2(int i10) {
        int i11 = this.R;
        if (i11 != i10) {
            if (i11 == 4 || i10 == 4) {
                s1();
                e2();
            }
            this.R = i10;
            C1();
        }
    }

    public void N2(int i10) {
        if (this.O != i10) {
            s1();
            this.O = i10;
            this.f27096b0 = null;
            this.f27097c0 = null;
            e2();
            C1();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public RecyclerView.q O() {
        return new c(-2, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void O0(RecyclerView recyclerView) {
        super.O0(recyclerView);
        this.f27106l0 = (View) recyclerView.getParent();
    }

    public void O2(int i10) {
        if (i10 != 2) {
            int i11 = this.P;
            if (i11 != i10) {
                if (i11 == 0 || i10 == 0) {
                    s1();
                    e2();
                }
                this.P = i10;
                this.f27096b0 = null;
                this.f27097c0 = null;
                C1();
                return;
            }
            return;
        }
        throw new UnsupportedOperationException("wrap_reverse is not supported in FlexboxLayoutManager");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public RecyclerView.q P(Context context, AttributeSet attributeSet) {
        return new c(context, attributeSet);
    }

    public final boolean P2(RecyclerView.b0 b0Var, b bVar) {
        View l22;
        int m10;
        boolean z10 = false;
        if (U() == 0) {
            return false;
        }
        if (bVar.f27113e) {
            l22 = o2(b0Var.b());
        } else {
            l22 = l2(b0Var.b());
        }
        if (l22 != null) {
            bVar.s(l22);
            if (!b0Var.e() && U1()) {
                if (this.f27096b0.g(l22) >= this.f27096b0.i() || this.f27096b0.d(l22) < this.f27096b0.m()) {
                    z10 = true;
                }
                if (z10) {
                    if (bVar.f27113e) {
                        m10 = this.f27096b0.i();
                    } else {
                        m10 = this.f27096b0.m();
                    }
                    bVar.f27111c = m10;
                }
            }
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void Q0(RecyclerView recyclerView, RecyclerView.w wVar) {
        super.Q0(recyclerView, wVar);
        if (this.f27103i0) {
            t1(wVar);
            wVar.c();
        }
    }

    public final boolean Q2(RecyclerView.b0 b0Var, b bVar, e eVar) {
        int i10;
        View T;
        int g10;
        if (!b0Var.e() && (i10 = this.f27099e0) != -1) {
            if (i10 >= 0 && i10 < b0Var.b()) {
                bVar.f27109a = this.f27099e0;
                bVar.f27110b = this.W.f27131c[bVar.f27109a];
                e eVar2 = this.f27098d0;
                if (eVar2 != null && eVar2.g(b0Var.b())) {
                    bVar.f27111c = this.f27096b0.m() + eVar.f27128x;
                    bVar.f27115g = true;
                    bVar.f27110b = -1;
                    return true;
                } else if (this.f27100f0 == Integer.MIN_VALUE) {
                    View N = N(this.f27099e0);
                    if (N != null) {
                        if (this.f27096b0.e(N) > this.f27096b0.n()) {
                            bVar.r();
                            return true;
                        } else if (this.f27096b0.g(N) - this.f27096b0.m() < 0) {
                            bVar.f27111c = this.f27096b0.m();
                            bVar.f27113e = false;
                            return true;
                        } else if (this.f27096b0.i() - this.f27096b0.d(N) < 0) {
                            bVar.f27111c = this.f27096b0.i();
                            bVar.f27113e = true;
                            return true;
                        } else {
                            if (bVar.f27113e) {
                                g10 = this.f27096b0.d(N) + this.f27096b0.o();
                            } else {
                                g10 = this.f27096b0.g(N);
                            }
                            bVar.f27111c = g10;
                        }
                    } else {
                        if (U() > 0 && (T = T(0)) != null) {
                            bVar.f27113e = this.f27099e0 < o0(T);
                        }
                        bVar.r();
                    }
                    return true;
                } else {
                    if (l() || !this.T) {
                        bVar.f27111c = this.f27096b0.m() + this.f27100f0;
                    } else {
                        bVar.f27111c = this.f27100f0 - this.f27096b0.j();
                    }
                    return true;
                }
            }
            this.f27099e0 = -1;
            this.f27100f0 = Integer.MIN_VALUE;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void R1(RecyclerView recyclerView, RecyclerView.b0 b0Var, int i10) {
        r rVar = new r(recyclerView.getContext());
        rVar.p(i10);
        S1(rVar);
    }

    public final void R2(RecyclerView.b0 b0Var, b bVar) {
        if (Q2(b0Var, bVar, this.f27098d0) || P2(b0Var, bVar)) {
            return;
        }
        bVar.r();
        bVar.f27109a = 0;
        bVar.f27110b = 0;
    }

    public final void S2(int i10) {
        if (i10 >= q2()) {
            return;
        }
        int U = U();
        this.W.t(U);
        this.W.u(U);
        this.W.s(U);
        if (i10 >= this.W.f27131c.length) {
            return;
        }
        this.f27107m0 = i10;
        View w22 = w2();
        if (w22 == null) {
            return;
        }
        this.f27099e0 = o0(w22);
        if (!l() && this.T) {
            this.f27100f0 = this.f27096b0.d(w22) + this.f27096b0.j();
        } else {
            this.f27100f0 = this.f27096b0.g(w22) - this.f27096b0.m();
        }
    }

    public final void T2(int i10) {
        int i11;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(v0(), w0());
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(h0(), i0());
        int v02 = v0();
        int h02 = h0();
        boolean z10 = true;
        if (l()) {
            int i12 = this.f27101g0;
            if (i12 == Integer.MIN_VALUE || i12 == v02) {
                z10 = false;
            }
            i11 = this.Z.f27118b ? this.f27105k0.getResources().getDisplayMetrics().heightPixels : this.Z.f27117a;
        } else {
            int i13 = this.f27102h0;
            if (i13 == Integer.MIN_VALUE || i13 == h02) {
                z10 = false;
            }
            if (!this.Z.f27118b) {
                i11 = this.Z.f27117a;
            } else {
                i11 = this.f27105k0.getResources().getDisplayMetrics().widthPixels;
            }
        }
        int i14 = i11;
        this.f27101g0 = v02;
        this.f27102h0 = h02;
        int i15 = this.f27107m0;
        if (i15 != -1 || (this.f27099e0 == -1 && !z10)) {
            int min = i15 != -1 ? Math.min(i15, this.f27095a0.f27109a) : this.f27095a0.f27109a;
            this.f27108n0.a();
            if (l()) {
                if (this.V.size() > 0) {
                    this.W.j(this.V, min);
                    this.W.b(this.f27108n0, makeMeasureSpec, makeMeasureSpec2, i14, min, this.f27095a0.f27109a, this.V);
                } else {
                    this.W.s(i10);
                    this.W.d(this.f27108n0, makeMeasureSpec, makeMeasureSpec2, i14, 0, this.V);
                }
            } else if (this.V.size() > 0) {
                this.W.j(this.V, min);
                this.W.b(this.f27108n0, makeMeasureSpec2, makeMeasureSpec, i14, min, this.f27095a0.f27109a, this.V);
            } else {
                this.W.s(i10);
                this.W.g(this.f27108n0, makeMeasureSpec, makeMeasureSpec2, i14, 0, this.V);
            }
            this.V = this.f27108n0.f27134a;
            this.W.q(makeMeasureSpec, makeMeasureSpec2, min);
            this.W.Y(min);
        } else if (this.f27095a0.f27113e) {
        } else {
            this.V.clear();
            this.f27108n0.a();
            if (l()) {
                this.W.e(this.f27108n0, makeMeasureSpec, makeMeasureSpec2, i14, this.f27095a0.f27109a, this.V);
            } else {
                this.W.h(this.f27108n0, makeMeasureSpec, makeMeasureSpec2, i14, this.f27095a0.f27109a, this.V);
            }
            this.V = this.f27108n0.f27134a;
            this.W.p(makeMeasureSpec, makeMeasureSpec2);
            this.W.X();
            b bVar = this.f27095a0;
            bVar.f27110b = this.W.f27131c[bVar.f27109a];
            this.Z.f27119c = this.f27095a0.f27110b;
        }
    }

    public final void U2(int i10, int i11) {
        this.Z.f27125i = i10;
        boolean l10 = l();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(v0(), w0());
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(h0(), i0());
        boolean z10 = !l10 && this.T;
        if (i10 == 1) {
            View T = T(U() - 1);
            if (T == null) {
                return;
            }
            this.Z.f27121e = this.f27096b0.d(T);
            int o02 = o0(T);
            View p22 = p2(T, this.V.get(this.W.f27131c[o02]));
            this.Z.f27124h = 1;
            d dVar = this.Z;
            dVar.f27120d = o02 + dVar.f27124h;
            if (this.W.f27131c.length <= this.Z.f27120d) {
                this.Z.f27119c = -1;
            } else {
                d dVar2 = this.Z;
                dVar2.f27119c = this.W.f27131c[dVar2.f27120d];
            }
            if (z10) {
                this.Z.f27121e = this.f27096b0.g(p22);
                this.Z.f27122f = (-this.f27096b0.g(p22)) + this.f27096b0.m();
                d dVar3 = this.Z;
                dVar3.f27122f = Math.max(dVar3.f27122f, 0);
            } else {
                this.Z.f27121e = this.f27096b0.d(p22);
                this.Z.f27122f = this.f27096b0.d(p22) - this.f27096b0.i();
            }
            if ((this.Z.f27119c == -1 || this.Z.f27119c > this.V.size() - 1) && this.Z.f27120d <= getFlexItemCount()) {
                int i12 = i11 - this.Z.f27122f;
                this.f27108n0.a();
                if (i12 > 0) {
                    if (l10) {
                        this.W.d(this.f27108n0, makeMeasureSpec, makeMeasureSpec2, i12, this.Z.f27120d, this.V);
                    } else {
                        this.W.g(this.f27108n0, makeMeasureSpec, makeMeasureSpec2, i12, this.Z.f27120d, this.V);
                    }
                    this.W.q(makeMeasureSpec, makeMeasureSpec2, this.Z.f27120d);
                    this.W.Y(this.Z.f27120d);
                }
            }
        } else {
            View T2 = T(0);
            if (T2 == null) {
                return;
            }
            this.Z.f27121e = this.f27096b0.g(T2);
            int o03 = o0(T2);
            View m22 = m2(T2, this.V.get(this.W.f27131c[o03]));
            this.Z.f27124h = 1;
            int i13 = this.W.f27131c[o03];
            if (i13 == -1) {
                i13 = 0;
            }
            if (i13 > 0) {
                this.Z.f27120d = o03 - this.V.get(i13 - 1).b();
            } else {
                this.Z.f27120d = -1;
            }
            this.Z.f27119c = i13 > 0 ? i13 - 1 : 0;
            if (z10) {
                this.Z.f27121e = this.f27096b0.d(m22);
                this.Z.f27122f = this.f27096b0.d(m22) - this.f27096b0.i();
                d dVar4 = this.Z;
                dVar4.f27122f = Math.max(dVar4.f27122f, 0);
            } else {
                this.Z.f27121e = this.f27096b0.g(m22);
                this.Z.f27122f = (-this.f27096b0.g(m22)) + this.f27096b0.m();
            }
        }
        d dVar5 = this.Z;
        dVar5.f27117a = i11 - dVar5.f27122f;
    }

    public final void V2(b bVar, boolean z10, boolean z11) {
        if (z11) {
            K2();
        } else {
            this.Z.f27118b = false;
        }
        if (!l() && this.T) {
            this.Z.f27117a = bVar.f27111c - getPaddingRight();
        } else {
            this.Z.f27117a = this.f27096b0.i() - bVar.f27111c;
        }
        this.Z.f27120d = bVar.f27109a;
        this.Z.f27124h = 1;
        this.Z.f27125i = 1;
        this.Z.f27121e = bVar.f27111c;
        this.Z.f27122f = Integer.MIN_VALUE;
        this.Z.f27119c = bVar.f27110b;
        if (!z10 || this.V.size() <= 1 || bVar.f27110b < 0 || bVar.f27110b >= this.V.size() - 1) {
            return;
        }
        d.l(this.Z);
        d.u(this.Z, this.V.get(bVar.f27110b).b());
    }

    public final void W2(b bVar, boolean z10, boolean z11) {
        if (z11) {
            K2();
        } else {
            this.Z.f27118b = false;
        }
        if (!l() && this.T) {
            this.Z.f27117a = (this.f27106l0.getWidth() - bVar.f27111c) - this.f27096b0.m();
        } else {
            this.Z.f27117a = bVar.f27111c - this.f27096b0.m();
        }
        this.Z.f27120d = bVar.f27109a;
        this.Z.f27124h = 1;
        this.Z.f27125i = -1;
        this.Z.f27121e = bVar.f27111c;
        this.Z.f27122f = Integer.MIN_VALUE;
        this.Z.f27119c = bVar.f27110b;
        if (!z10 || bVar.f27110b <= 0 || this.V.size() <= bVar.f27110b) {
            return;
        }
        d.m(this.Z);
        d.v(this.Z, this.V.get(bVar.f27110b).b());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void Z0(RecyclerView recyclerView, int i10, int i11) {
        super.Z0(recyclerView, i10, i11);
        S2(i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a0.b
    public PointF a(int i10) {
        View T;
        if (U() == 0 || (T = T(0)) == null) {
            return null;
        }
        int i11 = i10 < o0(T) ? -1 : 1;
        if (l()) {
            return new PointF(0.0f, i11);
        }
        return new PointF(i11, 0.0f);
    }

    @Override // qg.a
    public int b(int i10, int i11, int i12) {
        return RecyclerView.p.V(v0(), w0(), i11, i12, v());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void b1(RecyclerView recyclerView, int i10, int i11, int i12) {
        super.b1(recyclerView, i10, i11, i12);
        S2(Math.min(i10, i11));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void c1(RecyclerView recyclerView, int i10, int i11) {
        super.c1(recyclerView, i10, i11);
        S2(i10);
    }

    public final boolean c2(View view, int i10) {
        return (l() || !this.T) ? this.f27096b0.g(view) >= this.f27096b0.h() - i10 : this.f27096b0.d(view) <= i10;
    }

    @Override // qg.a
    public View d(int i10) {
        View view = this.f27104j0.get(i10);
        return view != null ? view : this.X.o(i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void d1(RecyclerView recyclerView, int i10, int i11) {
        super.d1(recyclerView, i10, i11);
        S2(i10);
    }

    public final boolean d2(View view, int i10) {
        return (l() || !this.T) ? this.f27096b0.d(view) <= i10 : this.f27096b0.h() - this.f27096b0.g(view) <= i10;
    }

    @Override // qg.a
    public int e(int i10, int i11, int i12) {
        return RecyclerView.p.V(h0(), i0(), i11, i12, w());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void e1(RecyclerView recyclerView, int i10, int i11, Object obj) {
        super.e1(recyclerView, i10, i11, obj);
        S2(i10);
    }

    public final void e2() {
        this.V.clear();
        this.f27095a0.t();
        this.f27095a0.f27112d = 0;
    }

    @Override // qg.a
    public int f(View view) {
        int l02;
        int q02;
        if (l()) {
            l02 = t0(view);
            q02 = S(view);
        } else {
            l02 = l0(view);
            q02 = q0(view);
        }
        return l02 + q02;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void f1(RecyclerView.w wVar, RecyclerView.b0 b0Var) {
        int i10;
        int i11;
        this.X = wVar;
        this.Y = b0Var;
        int b10 = b0Var.b();
        if (b10 == 0 && b0Var.e()) {
            return;
        }
        L2();
        j2();
        i2();
        this.W.t(b10);
        this.W.u(b10);
        this.W.s(b10);
        this.Z.f27126j = false;
        e eVar = this.f27098d0;
        if (eVar != null && eVar.g(b10)) {
            this.f27099e0 = this.f27098d0.f27127w;
        }
        if (!this.f27095a0.f27114f || this.f27099e0 != -1 || this.f27098d0 != null) {
            this.f27095a0.t();
            R2(b0Var, this.f27095a0);
            this.f27095a0.f27114f = true;
        }
        H(wVar);
        if (this.f27095a0.f27113e) {
            W2(this.f27095a0, false, true);
        } else {
            V2(this.f27095a0, false, true);
        }
        T2(b10);
        k2(wVar, b0Var, this.Z);
        if (this.f27095a0.f27113e) {
            i11 = this.Z.f27121e;
            V2(this.f27095a0, true, false);
            k2(wVar, b0Var, this.Z);
            i10 = this.Z.f27121e;
        } else {
            i10 = this.Z.f27121e;
            W2(this.f27095a0, true, false);
            k2(wVar, b0Var, this.Z);
            i11 = this.Z.f27121e;
        }
        if (U() > 0) {
            if (this.f27095a0.f27113e) {
                u2(i11 + t2(i10, wVar, b0Var, true), wVar, b0Var, false);
            } else {
                t2(i10 + u2(i11, wVar, b0Var, true), wVar, b0Var, false);
            }
        }
    }

    public final int f2(RecyclerView.b0 b0Var) {
        if (U() == 0) {
            return 0;
        }
        int b10 = b0Var.b();
        j2();
        View l22 = l2(b10);
        View o22 = o2(b10);
        if (b0Var.b() == 0 || l22 == null || o22 == null) {
            return 0;
        }
        return Math.min(this.f27096b0.n(), this.f27096b0.d(o22) - this.f27096b0.g(l22));
    }

    @Override // qg.a
    public void g(qg.c cVar) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void g1(RecyclerView.b0 b0Var) {
        super.g1(b0Var);
        this.f27098d0 = null;
        this.f27099e0 = -1;
        this.f27100f0 = Integer.MIN_VALUE;
        this.f27107m0 = -1;
        this.f27095a0.t();
        this.f27104j0.clear();
    }

    public final int g2(RecyclerView.b0 b0Var) {
        if (U() == 0) {
            return 0;
        }
        int b10 = b0Var.b();
        View l22 = l2(b10);
        View o22 = o2(b10);
        if (b0Var.b() != 0 && l22 != null && o22 != null) {
            int o02 = o0(l22);
            int o03 = o0(o22);
            int abs = Math.abs(this.f27096b0.d(o22) - this.f27096b0.g(l22));
            int[] iArr = this.W.f27131c;
            int i10 = iArr[o02];
            if (i10 != 0 && i10 != -1) {
                return Math.round((i10 * (abs / ((iArr[o03] - i10) + 1))) + (this.f27096b0.m() - this.f27096b0.g(l22)));
            }
        }
        return 0;
    }

    @Override // qg.a
    public int getAlignContent() {
        return 5;
    }

    @Override // qg.a
    public int getAlignItems() {
        return this.R;
    }

    @Override // qg.a
    public int getFlexDirection() {
        return this.O;
    }

    @Override // qg.a
    public int getFlexItemCount() {
        return this.Y.b();
    }

    @Override // qg.a
    public List<qg.c> getFlexLinesInternal() {
        return this.V;
    }

    @Override // qg.a
    public int getFlexWrap() {
        return this.P;
    }

    @Override // qg.a
    public int getLargestMainSize() {
        if (this.V.size() == 0) {
            return 0;
        }
        int i10 = Integer.MIN_VALUE;
        int size = this.V.size();
        for (int i11 = 0; i11 < size; i11++) {
            i10 = Math.max(i10, this.V.get(i11).f49475e);
        }
        return i10;
    }

    @Override // qg.a
    public int getMaxLine() {
        return this.S;
    }

    @Override // qg.a
    public int getSumOfCrossSize() {
        int size = this.V.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            i10 += this.V.get(i11).f49477g;
        }
        return i10;
    }

    @Override // qg.a
    public View h(int i10) {
        return d(i10);
    }

    public final int h2(RecyclerView.b0 b0Var) {
        if (U() == 0) {
            return 0;
        }
        int b10 = b0Var.b();
        View l22 = l2(b10);
        View o22 = o2(b10);
        if (b0Var.b() == 0 || l22 == null || o22 == null) {
            return 0;
        }
        int n22 = n2();
        return (int) ((Math.abs(this.f27096b0.d(o22) - this.f27096b0.g(l22)) / ((q2() - n22) + 1)) * b0Var.b());
    }

    @Override // qg.a
    public void i(int i10, View view) {
        this.f27104j0.put(i10, view);
    }

    public final void i2() {
        if (this.Z == null) {
            this.Z = new d();
        }
    }

    @Override // qg.a
    public int j(View view, int i10, int i11) {
        int t02;
        int S;
        if (l()) {
            t02 = l0(view);
            S = q0(view);
        } else {
            t02 = t0(view);
            S = S(view);
        }
        return t02 + S;
    }

    public final void j2() {
        if (this.f27096b0 != null) {
            return;
        }
        if (l()) {
            if (this.P == 0) {
                this.f27096b0 = x.a(this);
                this.f27097c0 = x.c(this);
                return;
            }
            this.f27096b0 = x.c(this);
            this.f27097c0 = x.a(this);
        } else if (this.P == 0) {
            this.f27096b0 = x.c(this);
            this.f27097c0 = x.a(this);
        } else {
            this.f27096b0 = x.a(this);
            this.f27097c0 = x.c(this);
        }
    }

    @Override // qg.a
    public void k(View view, int i10, int i11, qg.c cVar) {
        u(view, f27094o0);
        if (l()) {
            int l02 = l0(view) + q0(view);
            cVar.f49475e += l02;
            cVar.f49476f += l02;
            return;
        }
        int t02 = t0(view) + S(view);
        cVar.f49475e += t02;
        cVar.f49476f += t02;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void k1(Parcelable parcelable) {
        if (parcelable instanceof e) {
            this.f27098d0 = (e) parcelable;
            C1();
        }
    }

    public final int k2(RecyclerView.w wVar, RecyclerView.b0 b0Var, d dVar) {
        if (dVar.f27122f != Integer.MIN_VALUE) {
            if (dVar.f27117a < 0) {
                d.q(dVar, dVar.f27117a);
            }
            G2(wVar, dVar);
        }
        int i10 = dVar.f27117a;
        int i11 = dVar.f27117a;
        int i12 = 0;
        boolean l10 = l();
        while (true) {
            if ((i11 > 0 || this.Z.f27118b) && dVar.D(b0Var, this.V)) {
                qg.c cVar = this.V.get(dVar.f27119c);
                dVar.f27120d = cVar.f49485o;
                i12 += D2(cVar, dVar);
                if (l10 || !this.T) {
                    d.c(dVar, cVar.a() * dVar.f27125i);
                } else {
                    d.d(dVar, cVar.a() * dVar.f27125i);
                }
                i11 -= cVar.a();
            }
        }
        d.i(dVar, i12);
        if (dVar.f27122f != Integer.MIN_VALUE) {
            d.q(dVar, i12);
            if (dVar.f27117a < 0) {
                d.q(dVar, dVar.f27117a);
            }
            G2(wVar, dVar);
        }
        return i10 - dVar.f27117a;
    }

    @Override // qg.a
    public boolean l() {
        int i10 = this.O;
        return i10 == 0 || i10 == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public Parcelable l1() {
        if (this.f27098d0 != null) {
            return new e(this.f27098d0);
        }
        e eVar = new e();
        if (U() <= 0) {
            eVar.h();
        } else {
            View w22 = w2();
            eVar.f27127w = o0(w22);
            eVar.f27128x = this.f27096b0.g(w22) - this.f27096b0.m();
        }
        return eVar;
    }

    public final View l2(int i10) {
        View s22 = s2(0, U(), i10);
        if (s22 == null) {
            return null;
        }
        int i11 = this.W.f27131c[o0(s22)];
        if (i11 == -1) {
            return null;
        }
        return m2(s22, this.V.get(i11));
    }

    public final View m2(View view, qg.c cVar) {
        boolean l10 = l();
        int i10 = cVar.f49478h;
        for (int i11 = 1; i11 < i10; i11++) {
            View T = T(i11);
            if (T != null && T.getVisibility() != 8) {
                if (this.T && !l10) {
                    if (this.f27096b0.d(view) >= this.f27096b0.d(T)) {
                    }
                    view = T;
                } else {
                    if (this.f27096b0.g(view) <= this.f27096b0.g(T)) {
                    }
                    view = T;
                }
            }
        }
        return view;
    }

    public int n2() {
        View r22 = r2(0, U(), false);
        if (r22 == null) {
            return -1;
        }
        return o0(r22);
    }

    public final View o2(int i10) {
        View s22 = s2(U() - 1, -1, i10);
        if (s22 == null) {
            return null;
        }
        return p2(s22, this.V.get(this.W.f27131c[o0(s22)]));
    }

    public final View p2(View view, qg.c cVar) {
        boolean l10 = l();
        int U = (U() - cVar.f49478h) - 1;
        for (int U2 = U() - 2; U2 > U; U2--) {
            View T = T(U2);
            if (T != null && T.getVisibility() != 8) {
                if (this.T && !l10) {
                    if (this.f27096b0.g(view) <= this.f27096b0.g(T)) {
                    }
                    view = T;
                } else {
                    if (this.f27096b0.d(view) >= this.f27096b0.d(T)) {
                    }
                    view = T;
                }
            }
        }
        return view;
    }

    public int q2() {
        View r22 = r2(U() - 1, -1, false);
        if (r22 == null) {
            return -1;
        }
        return o0(r22);
    }

    public final View r2(int i10, int i11, boolean z10) {
        int i12 = i11 > i10 ? 1 : -1;
        while (i10 != i11) {
            View T = T(i10);
            if (C2(T, z10)) {
                return T;
            }
            i10 += i12;
        }
        return null;
    }

    public final View s2(int i10, int i11, int i12) {
        int o02;
        j2();
        i2();
        int m10 = this.f27096b0.m();
        int i13 = this.f27096b0.i();
        int i14 = i11 > i10 ? 1 : -1;
        View view = null;
        View view2 = null;
        while (i10 != i11) {
            View T = T(i10);
            if (T != null && (o02 = o0(T)) >= 0 && o02 < i12) {
                if (((RecyclerView.q) T.getLayoutParams()).c()) {
                    if (view2 == null) {
                        view2 = T;
                    }
                } else if (this.f27096b0.g(T) >= m10 && this.f27096b0.d(T) <= i13) {
                    return T;
                } else {
                    if (view == null) {
                        view = T;
                    }
                }
            }
            i10 += i14;
        }
        return view != null ? view : view2;
    }

    @Override // qg.a
    public void setFlexLines(List<qg.c> list) {
        this.V = list;
    }

    public final int t2(int i10, RecyclerView.w wVar, RecyclerView.b0 b0Var, boolean z10) {
        int i11;
        int i12;
        if (!l() && this.T) {
            int m10 = i10 - this.f27096b0.m();
            if (m10 <= 0) {
                return 0;
            }
            i11 = A2(m10, wVar, b0Var);
        } else {
            int i13 = this.f27096b0.i() - i10;
            if (i13 <= 0) {
                return 0;
            }
            i11 = -A2(-i13, wVar, b0Var);
        }
        int i14 = i10 + i11;
        if (!z10 || (i12 = this.f27096b0.i() - i14) <= 0) {
            return i11;
        }
        this.f27096b0.r(i12);
        return i12 + i11;
    }

    public final int u2(int i10, RecyclerView.w wVar, RecyclerView.b0 b0Var, boolean z10) {
        int i11;
        int m10;
        if (!l() && this.T) {
            int i12 = this.f27096b0.i() - i10;
            if (i12 <= 0) {
                return 0;
            }
            i11 = A2(-i12, wVar, b0Var);
        } else {
            int m11 = i10 - this.f27096b0.m();
            if (m11 <= 0) {
                return 0;
            }
            i11 = -A2(m11, wVar, b0Var);
        }
        int i13 = i10 + i11;
        if (!z10 || (m10 = i13 - this.f27096b0.m()) <= 0) {
            return i11;
        }
        this.f27096b0.r(-m10);
        return i11 - m10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean v() {
        if (this.P == 0) {
            return l();
        }
        if (l()) {
            int v02 = v0();
            View view = this.f27106l0;
            if (v02 <= (view != null ? view.getWidth() : 0)) {
                return false;
            }
        }
        return true;
    }

    public final int v2(View view) {
        return Z(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.q) view.getLayoutParams())).bottomMargin;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean w() {
        if (this.P == 0) {
            return !l();
        }
        if (l()) {
            return true;
        }
        int h02 = h0();
        View view = this.f27106l0;
        return h02 > (view != null ? view.getHeight() : 0);
    }

    public final View w2() {
        return T(0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean x(RecyclerView.q qVar) {
        return qVar instanceof c;
    }

    public final int x2(View view) {
        return b0(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.q) view.getLayoutParams())).leftMargin;
    }

    public final int y2(View view) {
        return e0(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.q) view.getLayoutParams())).rightMargin;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean z0() {
        return true;
    }

    public final int z2(View view) {
        return f0(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.q) view.getLayoutParams())).topMargin;
    }

    /* loaded from: classes3.dex */
    public static class e implements Parcelable {
        public static final Parcelable.Creator<e> CREATOR = new a();

        /* renamed from: w  reason: collision with root package name */
        public int f27127w;

        /* renamed from: x  reason: collision with root package name */
        public int f27128x;

        /* loaded from: classes3.dex */
        public class a implements Parcelable.Creator<e> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public e createFromParcel(Parcel parcel) {
                return new e(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public e[] newArray(int i10) {
                return new e[i10];
            }
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final boolean g(int i10) {
            int i11 = this.f27127w;
            return i11 >= 0 && i11 < i10;
        }

        public final void h() {
            this.f27127w = -1;
        }

        public String toString() {
            return "SavedState{mAnchorPosition=" + this.f27127w + ", mAnchorOffset=" + this.f27128x + '}';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeInt(this.f27127w);
            parcel.writeInt(this.f27128x);
        }

        public e() {
        }

        public e(Parcel parcel) {
            this.f27127w = parcel.readInt();
            this.f27128x = parcel.readInt();
        }

        public e(e eVar) {
            this.f27127w = eVar.f27127w;
            this.f27128x = eVar.f27128x;
        }
    }

    /* loaded from: classes3.dex */
    public static class c extends RecyclerView.q implements qg.b {
        public static final Parcelable.Creator<c> CREATOR = new a();
        public float A;
        public float B;
        public int C;
        public float D;
        public int E;
        public int F;
        public int G;
        public int H;
        public boolean I;

        /* loaded from: classes3.dex */
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

        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.A = 0.0f;
            this.B = 1.0f;
            this.C = -1;
            this.D = -1.0f;
            this.G = 16777215;
            this.H = 16777215;
        }

        @Override // qg.b
        public boolean B0() {
            return this.I;
        }

        @Override // qg.b
        public int G1() {
            return ((ViewGroup.MarginLayoutParams) this).rightMargin;
        }

        @Override // qg.b
        public int I1() {
            return this.F;
        }

        @Override // qg.b
        public int K() {
            return this.C;
        }

        @Override // qg.b
        public int K1() {
            return this.H;
        }

        @Override // qg.b
        public float L() {
            return this.B;
        }

        @Override // qg.b
        public int M0() {
            return this.G;
        }

        @Override // qg.b
        public int N() {
            return this.E;
        }

        @Override // qg.b
        public int d0() {
            return ((ViewGroup.MarginLayoutParams) this).topMargin;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // qg.b
        public int getHeight() {
            return ((ViewGroup.MarginLayoutParams) this).height;
        }

        @Override // qg.b
        public int getOrder() {
            return 1;
        }

        @Override // qg.b
        public int getWidth() {
            return ((ViewGroup.MarginLayoutParams) this).width;
        }

        @Override // qg.b
        public void h0(int i10) {
            this.F = i10;
        }

        @Override // qg.b
        public float i0() {
            return this.A;
        }

        @Override // qg.b
        public void i1(int i10) {
            this.E = i10;
        }

        @Override // qg.b
        public int j1() {
            return ((ViewGroup.MarginLayoutParams) this).bottomMargin;
        }

        @Override // qg.b
        public int m1() {
            return ((ViewGroup.MarginLayoutParams) this).leftMargin;
        }

        @Override // qg.b
        public float q0() {
            return this.D;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeFloat(this.A);
            parcel.writeFloat(this.B);
            parcel.writeInt(this.C);
            parcel.writeFloat(this.D);
            parcel.writeInt(this.E);
            parcel.writeInt(this.F);
            parcel.writeInt(this.G);
            parcel.writeInt(this.H);
            parcel.writeByte(this.I ? (byte) 1 : (byte) 0);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).bottomMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).leftMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).rightMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).topMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).height);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).width);
        }

        public c(int i10, int i11) {
            super(i10, i11);
            this.A = 0.0f;
            this.B = 1.0f;
            this.C = -1;
            this.D = -1.0f;
            this.G = 16777215;
            this.H = 16777215;
        }

        public c(Parcel parcel) {
            super(-2, -2);
            this.A = 0.0f;
            this.B = 1.0f;
            this.C = -1;
            this.D = -1.0f;
            this.G = 16777215;
            this.H = 16777215;
            this.A = parcel.readFloat();
            this.B = parcel.readFloat();
            this.C = parcel.readInt();
            this.D = parcel.readFloat();
            this.E = parcel.readInt();
            this.F = parcel.readInt();
            this.G = parcel.readInt();
            this.H = parcel.readInt();
            this.I = parcel.readByte() != 0;
            ((ViewGroup.MarginLayoutParams) this).bottomMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).leftMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).rightMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).topMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).height = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).width = parcel.readInt();
        }
    }
}
