package l0;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class o1 {

    /* renamed from: a  reason: collision with root package name */
    public final p1 f39218a;

    /* renamed from: b  reason: collision with root package name */
    public final int[] f39219b;

    /* renamed from: c  reason: collision with root package name */
    public final int f39220c;

    /* renamed from: d  reason: collision with root package name */
    public final Object[] f39221d;

    /* renamed from: e  reason: collision with root package name */
    public final int f39222e;

    /* renamed from: f  reason: collision with root package name */
    public int f39223f;

    /* renamed from: g  reason: collision with root package name */
    public int f39224g;

    /* renamed from: h  reason: collision with root package name */
    public int f39225h;

    /* renamed from: i  reason: collision with root package name */
    public int f39226i;

    /* renamed from: j  reason: collision with root package name */
    public int f39227j;

    /* renamed from: k  reason: collision with root package name */
    public int f39228k;

    public o1(p1 p1Var) {
        jo.p.h(p1Var, "table");
        this.f39218a = p1Var;
        this.f39219b = p1Var.k();
        int m10 = p1Var.m();
        this.f39220c = m10;
        this.f39221d = p1Var.p();
        this.f39222e = p1Var.r();
        this.f39224g = m10;
        this.f39225h = -1;
    }

    public final Object A(int i10) {
        return L(this.f39219b, i10);
    }

    public final int B(int i10) {
        int G;
        G = q1.G(this.f39219b, i10);
        return G;
    }

    public final boolean C(int i10) {
        boolean I;
        I = q1.I(this.f39219b, i10);
        return I;
    }

    public final boolean D(int i10) {
        boolean J;
        J = q1.J(this.f39219b, i10);
        return J;
    }

    public final boolean E() {
        return r() || this.f39223f == this.f39224g;
    }

    public final boolean F() {
        boolean L;
        L = q1.L(this.f39219b, this.f39223f);
        return L;
    }

    public final boolean G(int i10) {
        boolean L;
        L = q1.L(this.f39219b, i10);
        return L;
    }

    public final Object H() {
        int i10;
        if (this.f39226i <= 0 && (i10 = this.f39227j) < this.f39228k) {
            Object[] objArr = this.f39221d;
            this.f39227j = i10 + 1;
            return objArr[i10];
        }
        return i.f39065a.a();
    }

    public final Object I(int i10) {
        boolean L;
        L = q1.L(this.f39219b, i10);
        if (L) {
            return J(this.f39219b, i10);
        }
        return null;
    }

    public final Object J(int[] iArr, int i10) {
        boolean L;
        int P;
        L = q1.L(iArr, i10);
        if (L) {
            Object[] objArr = this.f39221d;
            P = q1.P(iArr, i10);
            return objArr[P];
        }
        return i.f39065a.a();
    }

    public final int K(int i10) {
        int O;
        O = q1.O(this.f39219b, i10);
        return O;
    }

    public final Object L(int[] iArr, int i10) {
        boolean J;
        int Q;
        J = q1.J(iArr, i10);
        if (J) {
            Object[] objArr = this.f39221d;
            Q = q1.Q(iArr, i10);
            return objArr[Q];
        }
        return null;
    }

    public final int M(int i10) {
        int R;
        R = q1.R(this.f39219b, i10);
        return R;
    }

    public final void N(int i10) {
        int G;
        if (this.f39226i == 0) {
            this.f39223f = i10;
            int R = i10 < this.f39220c ? q1.R(this.f39219b, i10) : -1;
            this.f39225h = R;
            if (R >= 0) {
                G = q1.G(this.f39219b, R);
                this.f39224g = R + G;
            } else {
                this.f39224g = this.f39220c;
            }
            this.f39227j = 0;
            this.f39228k = 0;
            return;
        }
        throw new IllegalArgumentException("Cannot reposition while in an empty region".toString());
    }

    public final void O(int i10) {
        int G;
        G = q1.G(this.f39219b, i10);
        int i11 = G + i10;
        int i12 = this.f39223f;
        if (i12 >= i10 && i12 <= i11) {
            this.f39225h = i10;
            this.f39224g = i11;
            this.f39227j = 0;
            this.f39228k = 0;
            return;
        }
        throw new IllegalArgumentException(("Index " + i10 + " is not a parent of " + i12).toString());
    }

    public final int P() {
        boolean L;
        int G;
        if (this.f39226i == 0) {
            L = q1.L(this.f39219b, this.f39223f);
            int O = L ? 1 : q1.O(this.f39219b, this.f39223f);
            int i10 = this.f39223f;
            G = q1.G(this.f39219b, i10);
            this.f39223f = i10 + G;
            return O;
        }
        throw new IllegalArgumentException("Cannot skip while in an empty region".toString());
    }

    public final void Q() {
        if (this.f39226i == 0) {
            this.f39223f = this.f39224g;
            return;
        }
        throw new IllegalArgumentException("Cannot skip the enclosing group while in an empty region".toString());
    }

    public final void R() {
        int R;
        int G;
        int T;
        int E;
        if (this.f39226i <= 0) {
            R = q1.R(this.f39219b, this.f39223f);
            if (R == this.f39225h) {
                int i10 = this.f39223f;
                this.f39225h = i10;
                G = q1.G(this.f39219b, i10);
                this.f39224g = i10 + G;
                int i11 = this.f39223f;
                int i12 = i11 + 1;
                this.f39223f = i12;
                T = q1.T(this.f39219b, i11);
                this.f39227j = T;
                if (i11 < this.f39220c - 1) {
                    E = q1.E(this.f39219b, i12);
                } else {
                    E = this.f39222e;
                }
                this.f39228k = E;
                return;
            }
            throw new IllegalArgumentException("Invalid slot table detected".toString());
        }
    }

    public final void S() {
        boolean L;
        if (this.f39226i <= 0) {
            L = q1.L(this.f39219b, this.f39223f);
            if (L) {
                R();
                return;
            }
            throw new IllegalArgumentException("Expected a node group".toString());
        }
    }

    public final d a(int i10) {
        int S;
        ArrayList<d> j10 = this.f39218a.j();
        S = q1.S(j10, i10, this.f39220c);
        if (S < 0) {
            d dVar = new d(i10);
            j10.add(-(S + 1), dVar);
            return dVar;
        }
        d dVar2 = j10.get(S);
        jo.p.g(dVar2, "get(location)");
        return dVar2;
    }

    public final Object b(int[] iArr, int i10) {
        boolean H;
        int A;
        H = q1.H(iArr, i10);
        if (H) {
            Object[] objArr = this.f39221d;
            A = q1.A(iArr, i10);
            return objArr[A];
        }
        return i.f39065a.a();
    }

    public final void c() {
        this.f39226i++;
    }

    public final void d() {
        this.f39218a.f(this);
    }

    public final boolean e(int i10) {
        boolean C;
        C = q1.C(this.f39219b, i10);
        return C;
    }

    public final void f() {
        int i10 = this.f39226i;
        if (i10 > 0) {
            this.f39226i = i10 - 1;
            return;
        }
        throw new IllegalArgumentException("Unbalanced begin/end empty".toString());
    }

    public final void g() {
        int R;
        int G;
        int i10;
        if (this.f39226i == 0) {
            if (this.f39223f == this.f39224g) {
                R = q1.R(this.f39219b, this.f39225h);
                this.f39225h = R;
                if (R >= 0) {
                    G = q1.G(this.f39219b, R);
                    i10 = R + G;
                } else {
                    i10 = this.f39220c;
                }
                this.f39224g = i10;
                return;
            }
            throw new IllegalArgumentException("endGroup() not called at the end of a group".toString());
        }
    }

    public final List<j0> h() {
        int M;
        boolean L;
        int G;
        ArrayList arrayList = new ArrayList();
        if (this.f39226i > 0) {
            return arrayList;
        }
        int i10 = this.f39223f;
        int i11 = 0;
        while (i10 < this.f39224g) {
            M = q1.M(this.f39219b, i10);
            Object L2 = L(this.f39219b, i10);
            L = q1.L(this.f39219b, i10);
            arrayList.add(new j0(M, L2, i10, L ? 1 : q1.O(this.f39219b, i10), i11));
            G = q1.G(this.f39219b, i10);
            i10 += G;
            i11++;
        }
        return arrayList;
    }

    public final void i(int i10, io.p<? super Integer, Object, wn.v> pVar) {
        int T;
        jo.p.h(pVar, "block");
        T = q1.T(this.f39219b, i10);
        int i11 = i10 + 1;
        int E = i11 < this.f39218a.m() ? q1.E(this.f39218a.k(), i11) : this.f39218a.r();
        for (int i12 = T; i12 < E; i12++) {
            pVar.invoke(Integer.valueOf(i12 - T), this.f39221d[i12]);
        }
    }

    public final int j() {
        return this.f39224g;
    }

    public final int k() {
        return this.f39223f;
    }

    public final Object l() {
        int i10 = this.f39223f;
        if (i10 < this.f39224g) {
            return b(this.f39219b, i10);
        }
        return 0;
    }

    public final int m() {
        return this.f39224g;
    }

    public final int n() {
        int M;
        int i10 = this.f39223f;
        if (i10 < this.f39224g) {
            M = q1.M(this.f39219b, i10);
            return M;
        }
        return 0;
    }

    public final Object o() {
        int i10 = this.f39223f;
        if (i10 < this.f39224g) {
            return L(this.f39219b, i10);
        }
        return null;
    }

    public final int p() {
        int G;
        G = q1.G(this.f39219b, this.f39223f);
        return G;
    }

    public final int q() {
        int T;
        int i10 = this.f39227j;
        T = q1.T(this.f39219b, this.f39225h);
        return i10 - T;
    }

    public final boolean r() {
        return this.f39226i > 0;
    }

    public final int s() {
        return this.f39225h;
    }

    public final int t() {
        int O;
        int i10 = this.f39225h;
        if (i10 >= 0) {
            O = q1.O(this.f39219b, i10);
            return O;
        }
        return 0;
    }

    public String toString() {
        return "SlotReader(current=" + this.f39223f + ", key=" + n() + ", parent=" + this.f39225h + ", end=" + this.f39224g + ')';
    }

    public final int u() {
        return this.f39220c;
    }

    public final p1 v() {
        return this.f39218a;
    }

    public final Object w(int i10) {
        return b(this.f39219b, i10);
    }

    public final Object x(int i10) {
        return y(this.f39223f, i10);
    }

    public final Object y(int i10, int i11) {
        int T;
        T = q1.T(this.f39219b, i10);
        int i12 = i10 + 1;
        int i13 = T + i11;
        return i13 < (i12 < this.f39220c ? q1.E(this.f39219b, i12) : this.f39222e) ? this.f39221d[i13] : i.f39065a.a();
    }

    public final int z(int i10) {
        int M;
        M = q1.M(this.f39219b, i10);
        return M;
    }
}
