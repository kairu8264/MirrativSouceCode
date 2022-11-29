package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.n;
import java.util.List;

/* loaded from: classes.dex */
public class LinearLayoutManager extends RecyclerView.p implements n.j, RecyclerView.a0.b {
    public int O;
    public c P;
    public x Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public boolean U;
    public boolean V;
    public int W;
    public int X;
    public boolean Y;
    public d Z;

    /* renamed from: a0  reason: collision with root package name */
    public final a f15852a0;

    /* renamed from: b0  reason: collision with root package name */
    public final b f15853b0;

    /* renamed from: c0  reason: collision with root package name */
    public int f15854c0;

    /* renamed from: d0  reason: collision with root package name */
    public int[] f15855d0;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public x f15856a;

        /* renamed from: b  reason: collision with root package name */
        public int f15857b;

        /* renamed from: c  reason: collision with root package name */
        public int f15858c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f15859d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f15860e;

        public a() {
            e();
        }

        public void a() {
            int m10;
            if (this.f15859d) {
                m10 = this.f15856a.i();
            } else {
                m10 = this.f15856a.m();
            }
            this.f15858c = m10;
        }

        public void b(View view, int i10) {
            if (this.f15859d) {
                this.f15858c = this.f15856a.d(view) + this.f15856a.o();
            } else {
                this.f15858c = this.f15856a.g(view);
            }
            this.f15857b = i10;
        }

        public void c(View view, int i10) {
            int o10 = this.f15856a.o();
            if (o10 >= 0) {
                b(view, i10);
                return;
            }
            this.f15857b = i10;
            if (this.f15859d) {
                int i11 = (this.f15856a.i() - o10) - this.f15856a.d(view);
                this.f15858c = this.f15856a.i() - i11;
                if (i11 > 0) {
                    int e10 = this.f15858c - this.f15856a.e(view);
                    int m10 = this.f15856a.m();
                    int min = e10 - (m10 + Math.min(this.f15856a.g(view) - m10, 0));
                    if (min < 0) {
                        this.f15858c += Math.min(i11, -min);
                        return;
                    }
                    return;
                }
                return;
            }
            int g10 = this.f15856a.g(view);
            int m11 = g10 - this.f15856a.m();
            this.f15858c = g10;
            if (m11 > 0) {
                int i12 = (this.f15856a.i() - Math.min(0, (this.f15856a.i() - o10) - this.f15856a.d(view))) - (g10 + this.f15856a.e(view));
                if (i12 < 0) {
                    this.f15858c -= Math.min(m11, -i12);
                }
            }
        }

        public boolean d(View view, RecyclerView.b0 b0Var) {
            RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
            return !qVar.c() && qVar.a() >= 0 && qVar.a() < b0Var.b();
        }

        public void e() {
            this.f15857b = -1;
            this.f15858c = Integer.MIN_VALUE;
            this.f15859d = false;
            this.f15860e = false;
        }

        public String toString() {
            return "AnchorInfo{mPosition=" + this.f15857b + ", mCoordinate=" + this.f15858c + ", mLayoutFromEnd=" + this.f15859d + ", mValid=" + this.f15860e + '}';
        }
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public int f15861a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f15862b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f15863c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f15864d;

        public void a() {
            this.f15861a = 0;
            this.f15862b = false;
            this.f15863c = false;
            this.f15864d = false;
        }
    }

    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: b  reason: collision with root package name */
        public int f15866b;

        /* renamed from: c  reason: collision with root package name */
        public int f15867c;

        /* renamed from: d  reason: collision with root package name */
        public int f15868d;

        /* renamed from: e  reason: collision with root package name */
        public int f15869e;

        /* renamed from: f  reason: collision with root package name */
        public int f15870f;

        /* renamed from: g  reason: collision with root package name */
        public int f15871g;

        /* renamed from: k  reason: collision with root package name */
        public int f15875k;

        /* renamed from: m  reason: collision with root package name */
        public boolean f15877m;

        /* renamed from: a  reason: collision with root package name */
        public boolean f15865a = true;

        /* renamed from: h  reason: collision with root package name */
        public int f15872h = 0;

        /* renamed from: i  reason: collision with root package name */
        public int f15873i = 0;

        /* renamed from: j  reason: collision with root package name */
        public boolean f15874j = false;

        /* renamed from: l  reason: collision with root package name */
        public List<RecyclerView.e0> f15876l = null;

        public void a() {
            b(null);
        }

        public void b(View view) {
            View f10 = f(view);
            if (f10 == null) {
                this.f15868d = -1;
            } else {
                this.f15868d = ((RecyclerView.q) f10.getLayoutParams()).a();
            }
        }

        public boolean c(RecyclerView.b0 b0Var) {
            int i10 = this.f15868d;
            return i10 >= 0 && i10 < b0Var.b();
        }

        public View d(RecyclerView.w wVar) {
            if (this.f15876l != null) {
                return e();
            }
            View o10 = wVar.o(this.f15868d);
            this.f15868d += this.f15869e;
            return o10;
        }

        public final View e() {
            int size = this.f15876l.size();
            for (int i10 = 0; i10 < size; i10++) {
                View view = this.f15876l.get(i10).itemView;
                RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
                if (!qVar.c() && this.f15868d == qVar.a()) {
                    b(view);
                    return view;
                }
            }
            return null;
        }

        public View f(View view) {
            int a10;
            int size = this.f15876l.size();
            View view2 = null;
            int i10 = Integer.MAX_VALUE;
            for (int i11 = 0; i11 < size; i11++) {
                View view3 = this.f15876l.get(i11).itemView;
                RecyclerView.q qVar = (RecyclerView.q) view3.getLayoutParams();
                if (view3 != view && !qVar.c() && (a10 = (qVar.a() - this.f15868d) * this.f15869e) >= 0 && a10 < i10) {
                    view2 = view3;
                    if (a10 == 0) {
                        break;
                    }
                    i10 = a10;
                }
            }
            return view2;
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    /* loaded from: classes.dex */
    public static class d implements Parcelable {
        public static final Parcelable.Creator<d> CREATOR = new a();

        /* renamed from: w  reason: collision with root package name */
        public int f15878w;

        /* renamed from: x  reason: collision with root package name */
        public int f15879x;

        /* renamed from: y  reason: collision with root package name */
        public boolean f15880y;

        /* loaded from: classes.dex */
        public class a implements Parcelable.Creator<d> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public d createFromParcel(Parcel parcel) {
                return new d(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public d[] newArray(int i10) {
                return new d[i10];
            }
        }

        public d() {
        }

        public boolean a() {
            return this.f15878w >= 0;
        }

        public void b() {
            this.f15878w = -1;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeInt(this.f15878w);
            parcel.writeInt(this.f15879x);
            parcel.writeInt(this.f15880y ? 1 : 0);
        }

        public d(Parcel parcel) {
            this.f15878w = parcel.readInt();
            this.f15879x = parcel.readInt();
            this.f15880y = parcel.readInt() == 1;
        }

        public d(d dVar) {
            this.f15878w = dVar.f15878w;
            this.f15879x = dVar.f15879x;
            this.f15880y = dVar.f15880y;
        }
    }

    public LinearLayoutManager(Context context) {
        this(context, 1, false);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void A(int i10, RecyclerView.p.c cVar) {
        boolean z10;
        int i11;
        d dVar = this.Z;
        if (dVar != null && dVar.a()) {
            d dVar2 = this.Z;
            z10 = dVar2.f15880y;
            i11 = dVar2.f15878w;
        } else {
            H2();
            z10 = this.T;
            i11 = this.W;
            if (i11 == -1) {
                i11 = z10 ? i10 - 1 : 0;
            }
        }
        int i12 = z10 ? -1 : 1;
        for (int i13 = 0; i13 < this.f15854c0 && i11 >= 0 && i11 < i10; i13++) {
            cVar.a(i11, 0);
            i11 += i12;
        }
    }

    public final void A2(RecyclerView.w wVar, RecyclerView.b0 b0Var, int i10, int i11) {
        if (!b0Var.g() || U() == 0 || b0Var.e() || !U1()) {
            return;
        }
        List<RecyclerView.e0> k10 = wVar.k();
        int size = k10.size();
        int o02 = o0(T(0));
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 0; i14 < size; i14++) {
            RecyclerView.e0 e0Var = k10.get(i14);
            if (!e0Var.isRemoved()) {
                if ((e0Var.getLayoutPosition() < o02) != this.T ? true : true) {
                    i12 += this.Q.e(e0Var.itemView);
                } else {
                    i13 += this.Q.e(e0Var.itemView);
                }
            }
        }
        this.P.f15876l = k10;
        if (i12 > 0) {
            T2(o0(u2()), i10);
            c cVar = this.P;
            cVar.f15872h = i12;
            cVar.f15867c = 0;
            cVar.a();
            d2(wVar, this.P, b0Var, false);
        }
        if (i13 > 0) {
            R2(o0(t2()), i11);
            c cVar2 = this.P;
            cVar2.f15872h = i13;
            cVar2.f15867c = 0;
            cVar2.a();
            d2(wVar, this.P, b0Var, false);
        }
        this.P.f15876l = null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int B(RecyclerView.b0 b0Var) {
        return X1(b0Var);
    }

    public void B2(RecyclerView.w wVar, RecyclerView.b0 b0Var, a aVar, int i10) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int C(RecyclerView.b0 b0Var) {
        return Y1(b0Var);
    }

    public final void C2(RecyclerView.w wVar, c cVar) {
        if (!cVar.f15865a || cVar.f15877m) {
            return;
        }
        int i10 = cVar.f15871g;
        int i11 = cVar.f15873i;
        if (cVar.f15870f == -1) {
            E2(wVar, i10, i11);
        } else {
            F2(wVar, i10, i11);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int D(RecyclerView.b0 b0Var) {
        return Z1(b0Var);
    }

    public final void D2(RecyclerView.w wVar, int i10, int i11) {
        if (i10 == i11) {
            return;
        }
        if (i11 <= i10) {
            while (i10 > i11) {
                w1(i10, wVar);
                i10--;
            }
            return;
        }
        for (int i12 = i11 - 1; i12 >= i10; i12--) {
            w1(i12, wVar);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int E(RecyclerView.b0 b0Var) {
        return X1(b0Var);
    }

    public final void E2(RecyclerView.w wVar, int i10, int i11) {
        int U = U();
        if (i10 < 0) {
            return;
        }
        int h10 = (this.Q.h() - i10) + i11;
        if (this.T) {
            for (int i12 = 0; i12 < U; i12++) {
                View T = T(i12);
                if (this.Q.g(T) < h10 || this.Q.q(T) < h10) {
                    D2(wVar, 0, i12);
                    return;
                }
            }
            return;
        }
        int i13 = U - 1;
        for (int i14 = i13; i14 >= 0; i14--) {
            View T2 = T(i14);
            if (this.Q.g(T2) < h10 || this.Q.q(T2) < h10) {
                D2(wVar, i13, i14);
                return;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int F(RecyclerView.b0 b0Var) {
        return Y1(b0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int F1(int i10, RecyclerView.w wVar, RecyclerView.b0 b0Var) {
        if (this.O == 1) {
            return 0;
        }
        return I2(i10, wVar, b0Var);
    }

    public final void F2(RecyclerView.w wVar, int i10, int i11) {
        if (i10 < 0) {
            return;
        }
        int i12 = i10 - i11;
        int U = U();
        if (!this.T) {
            for (int i13 = 0; i13 < U; i13++) {
                View T = T(i13);
                if (this.Q.d(T) > i12 || this.Q.p(T) > i12) {
                    D2(wVar, 0, i13);
                    return;
                }
            }
            return;
        }
        int i14 = U - 1;
        for (int i15 = i14; i15 >= 0; i15--) {
            View T2 = T(i15);
            if (this.Q.d(T2) > i12 || this.Q.p(T2) > i12) {
                D2(wVar, i14, i15);
                return;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int G(RecyclerView.b0 b0Var) {
        return Z1(b0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void G1(int i10) {
        this.W = i10;
        this.X = Integer.MIN_VALUE;
        d dVar = this.Z;
        if (dVar != null) {
            dVar.b();
        }
        C1();
    }

    public boolean G2() {
        return this.Q.k() == 0 && this.Q.h() == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int H1(int i10, RecyclerView.w wVar, RecyclerView.b0 b0Var) {
        if (this.O == 0) {
            return 0;
        }
        return I2(i10, wVar, b0Var);
    }

    public final void H2() {
        if (this.O != 1 && x2()) {
            this.T = !this.S;
        } else {
            this.T = this.S;
        }
    }

    public int I2(int i10, RecyclerView.w wVar, RecyclerView.b0 b0Var) {
        if (U() == 0 || i10 == 0) {
            return 0;
        }
        c2();
        this.P.f15865a = true;
        int i11 = i10 > 0 ? 1 : -1;
        int abs = Math.abs(i10);
        Q2(i11, abs, true, b0Var);
        c cVar = this.P;
        int d22 = cVar.f15871g + d2(wVar, cVar, b0Var, false);
        if (d22 < 0) {
            return 0;
        }
        if (abs > d22) {
            i10 = i11 * d22;
        }
        this.Q.r(-i10);
        this.P.f15875k = i10;
        return i10;
    }

    public void J2(int i10, int i11) {
        this.W = i10;
        this.X = i11;
        d dVar = this.Z;
        if (dVar != null) {
            dVar.b();
        }
        C1();
    }

    public void K2(int i10) {
        if (i10 != 0 && i10 != 1) {
            throw new IllegalArgumentException("invalid orientation:" + i10);
        }
        r(null);
        if (i10 != this.O || this.Q == null) {
            x b10 = x.b(this, i10);
            this.Q = b10;
            this.f15852a0.f15856a = b10;
            this.O = i10;
            C1();
        }
    }

    public void L2(boolean z10) {
        r(null);
        if (z10 == this.S) {
            return;
        }
        this.S = z10;
        C1();
    }

    public void M2(boolean z10) {
        r(null);
        if (this.U == z10) {
            return;
        }
        this.U = z10;
        C1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public View N(int i10) {
        int U = U();
        if (U == 0) {
            return null;
        }
        int o02 = i10 - o0(T(0));
        if (o02 >= 0 && o02 < U) {
            View T = T(o02);
            if (o0(T) == i10) {
                return T;
            }
        }
        return super.N(i10);
    }

    public final boolean N2(RecyclerView.w wVar, RecyclerView.b0 b0Var, a aVar) {
        View q22;
        boolean z10 = false;
        if (U() == 0) {
            return false;
        }
        View g02 = g0();
        if (g02 != null && aVar.d(g02, b0Var)) {
            aVar.c(g02, o0(g02));
            return true;
        }
        boolean z11 = this.R;
        boolean z12 = this.U;
        if (z11 == z12 && (q22 = q2(wVar, b0Var, aVar.f15859d, z12)) != null) {
            aVar.b(q22, o0(q22));
            if (!b0Var.e() && U1()) {
                int g10 = this.Q.g(q22);
                int d10 = this.Q.d(q22);
                int m10 = this.Q.m();
                int i10 = this.Q.i();
                boolean z13 = d10 <= m10 && g10 < m10;
                if (g10 >= i10 && d10 > i10) {
                    z10 = true;
                }
                if (z13 || z10) {
                    if (aVar.f15859d) {
                        m10 = i10;
                    }
                    aVar.f15858c = m10;
                }
            }
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public RecyclerView.q O() {
        return new RecyclerView.q(-2, -2);
    }

    public final boolean O2(RecyclerView.b0 b0Var, a aVar) {
        int i10;
        int g10;
        if (!b0Var.e() && (i10 = this.W) != -1) {
            if (i10 >= 0 && i10 < b0Var.b()) {
                aVar.f15857b = this.W;
                d dVar = this.Z;
                if (dVar != null && dVar.a()) {
                    boolean z10 = this.Z.f15880y;
                    aVar.f15859d = z10;
                    if (z10) {
                        aVar.f15858c = this.Q.i() - this.Z.f15879x;
                    } else {
                        aVar.f15858c = this.Q.m() + this.Z.f15879x;
                    }
                    return true;
                } else if (this.X == Integer.MIN_VALUE) {
                    View N = N(this.W);
                    if (N != null) {
                        if (this.Q.e(N) > this.Q.n()) {
                            aVar.a();
                            return true;
                        } else if (this.Q.g(N) - this.Q.m() < 0) {
                            aVar.f15858c = this.Q.m();
                            aVar.f15859d = false;
                            return true;
                        } else if (this.Q.i() - this.Q.d(N) < 0) {
                            aVar.f15858c = this.Q.i();
                            aVar.f15859d = true;
                            return true;
                        } else {
                            if (aVar.f15859d) {
                                g10 = this.Q.d(N) + this.Q.o();
                            } else {
                                g10 = this.Q.g(N);
                            }
                            aVar.f15858c = g10;
                        }
                    } else {
                        if (U() > 0) {
                            aVar.f15859d = (this.W < o0(T(0))) == this.T;
                        }
                        aVar.a();
                    }
                    return true;
                } else {
                    boolean z11 = this.T;
                    aVar.f15859d = z11;
                    if (z11) {
                        aVar.f15858c = this.Q.i() - this.X;
                    } else {
                        aVar.f15858c = this.Q.m() + this.X;
                    }
                    return true;
                }
            }
            this.W = -1;
            this.X = Integer.MIN_VALUE;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean P1() {
        return (i0() == 1073741824 || w0() == 1073741824 || !x0()) ? false : true;
    }

    public final void P2(RecyclerView.w wVar, RecyclerView.b0 b0Var, a aVar) {
        if (O2(b0Var, aVar) || N2(wVar, b0Var, aVar)) {
            return;
        }
        aVar.a();
        aVar.f15857b = this.U ? b0Var.b() - 1 : 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void Q0(RecyclerView recyclerView, RecyclerView.w wVar) {
        super.Q0(recyclerView, wVar);
        if (this.Y) {
            t1(wVar);
            wVar.c();
        }
    }

    public final void Q2(int i10, int i11, boolean z10, RecyclerView.b0 b0Var) {
        int m10;
        this.P.f15877m = G2();
        this.P.f15870f = i10;
        int[] iArr = this.f15855d0;
        iArr[0] = 0;
        iArr[1] = 0;
        V1(b0Var, iArr);
        int max = Math.max(0, this.f15855d0[0]);
        int max2 = Math.max(0, this.f15855d0[1]);
        boolean z11 = i10 == 1;
        c cVar = this.P;
        int i12 = z11 ? max2 : max;
        cVar.f15872h = i12;
        if (!z11) {
            max = max2;
        }
        cVar.f15873i = max;
        if (z11) {
            cVar.f15872h = i12 + this.Q.j();
            View t22 = t2();
            c cVar2 = this.P;
            cVar2.f15869e = this.T ? -1 : 1;
            int o02 = o0(t22);
            c cVar3 = this.P;
            cVar2.f15868d = o02 + cVar3.f15869e;
            cVar3.f15866b = this.Q.d(t22);
            m10 = this.Q.d(t22) - this.Q.i();
        } else {
            View u22 = u2();
            this.P.f15872h += this.Q.m();
            c cVar4 = this.P;
            cVar4.f15869e = this.T ? 1 : -1;
            int o03 = o0(u22);
            c cVar5 = this.P;
            cVar4.f15868d = o03 + cVar5.f15869e;
            cVar5.f15866b = this.Q.g(u22);
            m10 = (-this.Q.g(u22)) + this.Q.m();
        }
        c cVar6 = this.P;
        cVar6.f15867c = i11;
        if (z10) {
            cVar6.f15867c = i11 - m10;
        }
        cVar6.f15871g = m10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public View R0(View view, int i10, RecyclerView.w wVar, RecyclerView.b0 b0Var) {
        int a22;
        View o22;
        View t22;
        H2();
        if (U() == 0 || (a22 = a2(i10)) == Integer.MIN_VALUE) {
            return null;
        }
        c2();
        Q2(a22, (int) (this.Q.n() * 0.33333334f), false, b0Var);
        c cVar = this.P;
        cVar.f15871g = Integer.MIN_VALUE;
        cVar.f15865a = false;
        d2(wVar, cVar, b0Var, true);
        if (a22 == -1) {
            o22 = p2();
        } else {
            o22 = o2();
        }
        if (a22 == -1) {
            t22 = u2();
        } else {
            t22 = t2();
        }
        if (t22.hasFocusable()) {
            if (o22 == null) {
                return null;
            }
            return t22;
        }
        return o22;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void R1(RecyclerView recyclerView, RecyclerView.b0 b0Var, int i10) {
        r rVar = new r(recyclerView.getContext());
        rVar.p(i10);
        S1(rVar);
    }

    public final void R2(int i10, int i11) {
        this.P.f15867c = this.Q.i() - i11;
        c cVar = this.P;
        cVar.f15869e = this.T ? -1 : 1;
        cVar.f15868d = i10;
        cVar.f15870f = 1;
        cVar.f15866b = i11;
        cVar.f15871g = Integer.MIN_VALUE;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void S0(AccessibilityEvent accessibilityEvent) {
        super.S0(accessibilityEvent);
        if (U() > 0) {
            accessibilityEvent.setFromIndex(i2());
            accessibilityEvent.setToIndex(l2());
        }
    }

    public final void S2(a aVar) {
        R2(aVar.f15857b, aVar.f15858c);
    }

    public final void T2(int i10, int i11) {
        this.P.f15867c = i11 - this.Q.m();
        c cVar = this.P;
        cVar.f15868d = i10;
        cVar.f15869e = this.T ? 1 : -1;
        cVar.f15870f = -1;
        cVar.f15866b = i11;
        cVar.f15871g = Integer.MIN_VALUE;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean U1() {
        return this.Z == null && this.R == this.U;
    }

    public final void U2(a aVar) {
        T2(aVar.f15857b, aVar.f15858c);
    }

    public void V1(RecyclerView.b0 b0Var, int[] iArr) {
        int i10;
        int v22 = v2(b0Var);
        if (this.P.f15870f == -1) {
            i10 = 0;
        } else {
            i10 = v22;
            v22 = 0;
        }
        iArr[0] = v22;
        iArr[1] = i10;
    }

    public void W1(RecyclerView.b0 b0Var, c cVar, RecyclerView.p.c cVar2) {
        int i10 = cVar.f15868d;
        if (i10 < 0 || i10 >= b0Var.b()) {
            return;
        }
        cVar2.a(i10, Math.max(0, cVar.f15871g));
    }

    public final int X1(RecyclerView.b0 b0Var) {
        if (U() == 0) {
            return 0;
        }
        c2();
        return a0.a(b0Var, this.Q, h2(!this.V, true), g2(!this.V, true), this, this.V);
    }

    public final int Y1(RecyclerView.b0 b0Var) {
        if (U() == 0) {
            return 0;
        }
        c2();
        return a0.b(b0Var, this.Q, h2(!this.V, true), g2(!this.V, true), this, this.V, this.T);
    }

    public final int Z1(RecyclerView.b0 b0Var) {
        if (U() == 0) {
            return 0;
        }
        c2();
        return a0.c(b0Var, this.Q, h2(!this.V, true), g2(!this.V, true), this, this.V);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a0.b
    public PointF a(int i10) {
        if (U() == 0) {
            return null;
        }
        int i11 = (i10 < o0(T(0))) != this.T ? -1 : 1;
        if (this.O == 0) {
            return new PointF(i11, 0.0f);
        }
        return new PointF(0.0f, i11);
    }

    public int a2(int i10) {
        return i10 != 1 ? i10 != 2 ? i10 != 17 ? i10 != 33 ? i10 != 66 ? (i10 == 130 && this.O == 1) ? 1 : Integer.MIN_VALUE : this.O == 0 ? 1 : Integer.MIN_VALUE : this.O == 1 ? -1 : Integer.MIN_VALUE : this.O == 0 ? -1 : Integer.MIN_VALUE : (this.O != 1 && x2()) ? -1 : 1 : (this.O != 1 && x2()) ? 1 : -1;
    }

    public c b2() {
        return new c();
    }

    @Override // androidx.recyclerview.widget.n.j
    public void c(View view, View view2, int i10, int i11) {
        r("Cannot drop a view during a scroll or layout calculation");
        c2();
        H2();
        int o02 = o0(view);
        int o03 = o0(view2);
        boolean z10 = o02 < o03 ? true : true;
        if (this.T) {
            if (z10) {
                J2(o03, this.Q.i() - (this.Q.g(view2) + this.Q.e(view)));
            } else {
                J2(o03, this.Q.i() - this.Q.d(view2));
            }
        } else if (z10) {
            J2(o03, this.Q.g(view2));
        } else {
            J2(o03, this.Q.d(view2) - this.Q.e(view));
        }
    }

    public void c2() {
        if (this.P == null) {
            this.P = b2();
        }
    }

    public int d2(RecyclerView.w wVar, c cVar, RecyclerView.b0 b0Var, boolean z10) {
        int i10 = cVar.f15867c;
        int i11 = cVar.f15871g;
        if (i11 != Integer.MIN_VALUE) {
            if (i10 < 0) {
                cVar.f15871g = i11 + i10;
            }
            C2(wVar, cVar);
        }
        int i12 = cVar.f15867c + cVar.f15872h;
        b bVar = this.f15853b0;
        while (true) {
            if ((!cVar.f15877m && i12 <= 0) || !cVar.c(b0Var)) {
                break;
            }
            bVar.a();
            z2(wVar, b0Var, cVar, bVar);
            if (!bVar.f15862b) {
                cVar.f15866b += bVar.f15861a * cVar.f15870f;
                if (!bVar.f15863c || cVar.f15876l != null || !b0Var.e()) {
                    int i13 = cVar.f15867c;
                    int i14 = bVar.f15861a;
                    cVar.f15867c = i13 - i14;
                    i12 -= i14;
                }
                int i15 = cVar.f15871g;
                if (i15 != Integer.MIN_VALUE) {
                    int i16 = i15 + bVar.f15861a;
                    cVar.f15871g = i16;
                    int i17 = cVar.f15867c;
                    if (i17 < 0) {
                        cVar.f15871g = i16 + i17;
                    }
                    C2(wVar, cVar);
                }
                if (z10 && bVar.f15864d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i10 - cVar.f15867c;
    }

    public int e2() {
        View n22 = n2(0, U(), true, false);
        if (n22 == null) {
            return -1;
        }
        return o0(n22);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void f1(RecyclerView.w wVar, RecyclerView.b0 b0Var) {
        int i10;
        int i11;
        int i12;
        int i13;
        int r22;
        int i14;
        View N;
        int g10;
        int i15;
        int i16 = -1;
        if ((this.Z != null || this.W != -1) && b0Var.b() == 0) {
            t1(wVar);
            return;
        }
        d dVar = this.Z;
        if (dVar != null && dVar.a()) {
            this.W = this.Z.f15878w;
        }
        c2();
        this.P.f15865a = false;
        H2();
        View g02 = g0();
        a aVar = this.f15852a0;
        if (aVar.f15860e && this.W == -1 && this.Z == null) {
            if (g02 != null && (this.Q.g(g02) >= this.Q.i() || this.Q.d(g02) <= this.Q.m())) {
                this.f15852a0.c(g02, o0(g02));
            }
        } else {
            aVar.e();
            a aVar2 = this.f15852a0;
            aVar2.f15859d = this.T ^ this.U;
            P2(wVar, b0Var, aVar2);
            this.f15852a0.f15860e = true;
        }
        c cVar = this.P;
        cVar.f15870f = cVar.f15875k >= 0 ? 1 : -1;
        int[] iArr = this.f15855d0;
        iArr[0] = 0;
        iArr[1] = 0;
        V1(b0Var, iArr);
        int max = Math.max(0, this.f15855d0[0]) + this.Q.m();
        int max2 = Math.max(0, this.f15855d0[1]) + this.Q.j();
        if (b0Var.e() && (i14 = this.W) != -1 && this.X != Integer.MIN_VALUE && (N = N(i14)) != null) {
            if (this.T) {
                i15 = this.Q.i() - this.Q.d(N);
                g10 = this.X;
            } else {
                g10 = this.Q.g(N) - this.Q.m();
                i15 = this.X;
            }
            int i17 = i15 - g10;
            if (i17 > 0) {
                max += i17;
            } else {
                max2 -= i17;
            }
        }
        a aVar3 = this.f15852a0;
        if (!aVar3.f15859d ? !this.T : this.T) {
            i16 = 1;
        }
        B2(wVar, b0Var, aVar3, i16);
        H(wVar);
        this.P.f15877m = G2();
        this.P.f15874j = b0Var.e();
        this.P.f15873i = 0;
        a aVar4 = this.f15852a0;
        if (aVar4.f15859d) {
            U2(aVar4);
            c cVar2 = this.P;
            cVar2.f15872h = max;
            d2(wVar, cVar2, b0Var, false);
            c cVar3 = this.P;
            i11 = cVar3.f15866b;
            int i18 = cVar3.f15868d;
            int i19 = cVar3.f15867c;
            if (i19 > 0) {
                max2 += i19;
            }
            S2(this.f15852a0);
            c cVar4 = this.P;
            cVar4.f15872h = max2;
            cVar4.f15868d += cVar4.f15869e;
            d2(wVar, cVar4, b0Var, false);
            c cVar5 = this.P;
            i10 = cVar5.f15866b;
            int i20 = cVar5.f15867c;
            if (i20 > 0) {
                T2(i18, i11);
                c cVar6 = this.P;
                cVar6.f15872h = i20;
                d2(wVar, cVar6, b0Var, false);
                i11 = this.P.f15866b;
            }
        } else {
            S2(aVar4);
            c cVar7 = this.P;
            cVar7.f15872h = max2;
            d2(wVar, cVar7, b0Var, false);
            c cVar8 = this.P;
            i10 = cVar8.f15866b;
            int i21 = cVar8.f15868d;
            int i22 = cVar8.f15867c;
            if (i22 > 0) {
                max += i22;
            }
            U2(this.f15852a0);
            c cVar9 = this.P;
            cVar9.f15872h = max;
            cVar9.f15868d += cVar9.f15869e;
            d2(wVar, cVar9, b0Var, false);
            c cVar10 = this.P;
            i11 = cVar10.f15866b;
            int i23 = cVar10.f15867c;
            if (i23 > 0) {
                R2(i21, i10);
                c cVar11 = this.P;
                cVar11.f15872h = i23;
                d2(wVar, cVar11, b0Var, false);
                i10 = this.P.f15866b;
            }
        }
        if (U() > 0) {
            if (this.T ^ this.U) {
                int r23 = r2(i10, wVar, b0Var, true);
                i12 = i11 + r23;
                i13 = i10 + r23;
                r22 = s2(i12, wVar, b0Var, false);
            } else {
                int s22 = s2(i11, wVar, b0Var, true);
                i12 = i11 + s22;
                i13 = i10 + s22;
                r22 = r2(i13, wVar, b0Var, false);
            }
            i11 = i12 + r22;
            i10 = i13 + r22;
        }
        A2(wVar, b0Var, i11, i10);
        if (!b0Var.e()) {
            this.Q.s();
        } else {
            this.f15852a0.e();
        }
        this.R = this.U;
    }

    public final View f2() {
        return m2(0, U());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void g1(RecyclerView.b0 b0Var) {
        super.g1(b0Var);
        this.Z = null;
        this.W = -1;
        this.X = Integer.MIN_VALUE;
        this.f15852a0.e();
    }

    public View g2(boolean z10, boolean z11) {
        if (this.T) {
            return n2(0, U(), z10, z11);
        }
        return n2(U() - 1, -1, z10, z11);
    }

    public View h2(boolean z10, boolean z11) {
        if (this.T) {
            return n2(U() - 1, -1, z10, z11);
        }
        return n2(0, U(), z10, z11);
    }

    public int i2() {
        View n22 = n2(0, U(), false, true);
        if (n22 == null) {
            return -1;
        }
        return o0(n22);
    }

    public int j2() {
        View n22 = n2(U() - 1, -1, true, false);
        if (n22 == null) {
            return -1;
        }
        return o0(n22);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void k1(Parcelable parcelable) {
        if (parcelable instanceof d) {
            d dVar = (d) parcelable;
            this.Z = dVar;
            if (this.W != -1) {
                dVar.b();
            }
            C1();
        }
    }

    public final View k2() {
        return m2(U() - 1, -1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public Parcelable l1() {
        if (this.Z != null) {
            return new d(this.Z);
        }
        d dVar = new d();
        if (U() > 0) {
            c2();
            boolean z10 = this.R ^ this.T;
            dVar.f15880y = z10;
            if (z10) {
                View t22 = t2();
                dVar.f15879x = this.Q.i() - this.Q.d(t22);
                dVar.f15878w = o0(t22);
            } else {
                View u22 = u2();
                dVar.f15878w = o0(u22);
                dVar.f15879x = this.Q.g(u22) - this.Q.m();
            }
        } else {
            dVar.b();
        }
        return dVar;
    }

    public int l2() {
        View n22 = n2(U() - 1, -1, false, true);
        if (n22 == null) {
            return -1;
        }
        return o0(n22);
    }

    public View m2(int i10, int i11) {
        int i12;
        int i13;
        c2();
        if ((i11 > i10 ? (char) 1 : i11 < i10 ? (char) 65535 : (char) 0) == 0) {
            return T(i10);
        }
        if (this.Q.g(T(i10)) < this.Q.m()) {
            i12 = 16644;
            i13 = 16388;
        } else {
            i12 = 4161;
            i13 = 4097;
        }
        if (this.O == 0) {
            return this.A.a(i10, i11, i12, i13);
        }
        return this.B.a(i10, i11, i12, i13);
    }

    public View n2(int i10, int i11, boolean z10, boolean z11) {
        c2();
        int i12 = z10 ? 24579 : 320;
        int i13 = z11 ? 320 : 0;
        if (this.O == 0) {
            return this.A.a(i10, i11, i12, i13);
        }
        return this.B.a(i10, i11, i12, i13);
    }

    public final View o2() {
        return this.T ? f2() : k2();
    }

    public final View p2() {
        return this.T ? k2() : f2();
    }

    public View q2(RecyclerView.w wVar, RecyclerView.b0 b0Var, boolean z10, boolean z11) {
        int i10;
        int i11;
        c2();
        int U = U();
        int i12 = -1;
        if (z11) {
            i10 = U() - 1;
            i11 = -1;
        } else {
            i12 = U;
            i10 = 0;
            i11 = 1;
        }
        int b10 = b0Var.b();
        int m10 = this.Q.m();
        int i13 = this.Q.i();
        View view = null;
        View view2 = null;
        View view3 = null;
        while (i10 != i12) {
            View T = T(i10);
            int o02 = o0(T);
            int g10 = this.Q.g(T);
            int d10 = this.Q.d(T);
            if (o02 >= 0 && o02 < b10) {
                if (!((RecyclerView.q) T.getLayoutParams()).c()) {
                    boolean z12 = d10 <= m10 && g10 < m10;
                    boolean z13 = g10 >= i13 && d10 > i13;
                    if (!z12 && !z13) {
                        return T;
                    }
                    if (z10) {
                        if (!z13) {
                            if (view != null) {
                            }
                            view = T;
                        }
                        view2 = T;
                    } else {
                        if (!z12) {
                            if (view != null) {
                            }
                            view = T;
                        }
                        view2 = T;
                    }
                } else if (view3 == null) {
                    view3 = T;
                }
            }
            i10 += i11;
        }
        return view != null ? view : view2 != null ? view2 : view3;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void r(String str) {
        if (this.Z == null) {
            super.r(str);
        }
    }

    public final int r2(int i10, RecyclerView.w wVar, RecyclerView.b0 b0Var, boolean z10) {
        int i11;
        int i12 = this.Q.i() - i10;
        if (i12 > 0) {
            int i13 = -I2(-i12, wVar, b0Var);
            int i14 = i10 + i13;
            if (!z10 || (i11 = this.Q.i() - i14) <= 0) {
                return i13;
            }
            this.Q.r(i11);
            return i11 + i13;
        }
        return 0;
    }

    public final int s2(int i10, RecyclerView.w wVar, RecyclerView.b0 b0Var, boolean z10) {
        int m10;
        int m11 = i10 - this.Q.m();
        if (m11 > 0) {
            int i11 = -I2(m11, wVar, b0Var);
            int i12 = i10 + i11;
            if (!z10 || (m10 = i12 - this.Q.m()) <= 0) {
                return i11;
            }
            this.Q.r(-m10);
            return i11 - m10;
        }
        return 0;
    }

    public final View t2() {
        return T(this.T ? 0 : U() - 1);
    }

    public final View u2() {
        return T(this.T ? U() - 1 : 0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean v() {
        return this.O == 0;
    }

    @Deprecated
    public int v2(RecyclerView.b0 b0Var) {
        if (b0Var.d()) {
            return this.Q.n();
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean w() {
        return this.O == 1;
    }

    public int w2() {
        return this.O;
    }

    public boolean x2() {
        return k0() == 1;
    }

    public boolean y2() {
        return this.V;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void z(int i10, int i11, RecyclerView.b0 b0Var, RecyclerView.p.c cVar) {
        if (this.O != 0) {
            i10 = i11;
        }
        if (U() == 0 || i10 == 0) {
            return;
        }
        c2();
        Q2(i10 > 0 ? 1 : -1, Math.abs(i10), true, b0Var);
        W1(b0Var, this.P, cVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean z0() {
        return true;
    }

    public void z2(RecyclerView.w wVar, RecyclerView.b0 b0Var, c cVar, b bVar) {
        int i10;
        int i11;
        int i12;
        int i13;
        int f10;
        View d10 = cVar.d(wVar);
        if (d10 == null) {
            bVar.f15862b = true;
            return;
        }
        RecyclerView.q qVar = (RecyclerView.q) d10.getLayoutParams();
        if (cVar.f15876l == null) {
            if (this.T == (cVar.f15870f == -1)) {
                o(d10);
            } else {
                p(d10, 0);
            }
        } else {
            if (this.T == (cVar.f15870f == -1)) {
                m(d10);
            } else {
                n(d10, 0);
            }
        }
        I0(d10, 0, 0);
        bVar.f15861a = this.Q.e(d10);
        if (this.O == 1) {
            if (x2()) {
                f10 = v0() - getPaddingRight();
                i13 = f10 - this.Q.f(d10);
            } else {
                i13 = getPaddingLeft();
                f10 = this.Q.f(d10) + i13;
            }
            if (cVar.f15870f == -1) {
                int i14 = cVar.f15866b;
                i12 = i14;
                i11 = f10;
                i10 = i14 - bVar.f15861a;
            } else {
                int i15 = cVar.f15866b;
                i10 = i15;
                i11 = f10;
                i12 = bVar.f15861a + i15;
            }
        } else {
            int paddingTop = getPaddingTop();
            int f11 = this.Q.f(d10) + paddingTop;
            if (cVar.f15870f == -1) {
                int i16 = cVar.f15866b;
                i11 = i16;
                i10 = paddingTop;
                i12 = f11;
                i13 = i16 - bVar.f15861a;
            } else {
                int i17 = cVar.f15866b;
                i10 = paddingTop;
                i11 = bVar.f15861a + i17;
                i12 = f11;
                i13 = i17;
            }
        }
        H0(d10, i13, i10, i11, i12);
        if (qVar.c() || qVar.b()) {
            bVar.f15863c = true;
        }
        bVar.f15864d = d10.hasFocusable();
    }

    public LinearLayoutManager(Context context, int i10, boolean z10) {
        this.O = 1;
        this.S = false;
        this.T = false;
        this.U = false;
        this.V = true;
        this.W = -1;
        this.X = Integer.MIN_VALUE;
        this.Z = null;
        this.f15852a0 = new a();
        this.f15853b0 = new b();
        this.f15854c0 = 2;
        this.f15855d0 = new int[2];
        K2(i10);
        L2(z10);
    }

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i10, int i11) {
        this.O = 1;
        this.S = false;
        this.T = false;
        this.U = false;
        this.V = true;
        this.W = -1;
        this.X = Integer.MIN_VALUE;
        this.Z = null;
        this.f15852a0 = new a();
        this.f15853b0 = new b();
        this.f15854c0 = 2;
        this.f15855d0 = new int[2];
        RecyclerView.p.d p02 = RecyclerView.p.p0(context, attributeSet, i10, i11);
        K2(p02.f15977a);
        L2(p02.f15979c);
        M2(p02.f15980d);
    }
}
