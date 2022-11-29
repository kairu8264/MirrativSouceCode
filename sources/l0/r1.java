package l0;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.KotlinNothingValueException;
import l0.i;

/* loaded from: classes.dex */
public final class r1 {

    /* renamed from: v  reason: collision with root package name */
    public static final a f39247v = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public final p1 f39248a;

    /* renamed from: b  reason: collision with root package name */
    public int[] f39249b;

    /* renamed from: c  reason: collision with root package name */
    public Object[] f39250c;

    /* renamed from: d  reason: collision with root package name */
    public ArrayList<d> f39251d;

    /* renamed from: e  reason: collision with root package name */
    public int f39252e;

    /* renamed from: f  reason: collision with root package name */
    public int f39253f;

    /* renamed from: g  reason: collision with root package name */
    public int f39254g;

    /* renamed from: h  reason: collision with root package name */
    public int f39255h;

    /* renamed from: i  reason: collision with root package name */
    public int f39256i;

    /* renamed from: j  reason: collision with root package name */
    public int f39257j;

    /* renamed from: k  reason: collision with root package name */
    public int f39258k;

    /* renamed from: l  reason: collision with root package name */
    public int f39259l;

    /* renamed from: m  reason: collision with root package name */
    public int f39260m;

    /* renamed from: n  reason: collision with root package name */
    public int f39261n;

    /* renamed from: o  reason: collision with root package name */
    public final f0 f39262o;

    /* renamed from: p  reason: collision with root package name */
    public final f0 f39263p;

    /* renamed from: q  reason: collision with root package name */
    public final f0 f39264q;

    /* renamed from: r  reason: collision with root package name */
    public int f39265r;

    /* renamed from: s  reason: collision with root package name */
    public int f39266s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f39267t;

    /* renamed from: u  reason: collision with root package name */
    public z0 f39268u;

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final List<d> b(r1 r1Var, int i10, r1 r1Var2, boolean z10, boolean z11) {
            ArrayList arrayList;
            boolean z12;
            int i11;
            int c02 = r1Var.c0(i10);
            int i12 = i10 + c02;
            int J = r1Var.J(i10);
            int J2 = r1Var.J(i12);
            int i13 = J2 - J;
            boolean G = r1Var.G(i10);
            r1Var2.h0(c02);
            r1Var2.i0(i13, r1Var2.U());
            if (r1Var.f39252e < i12) {
                r1Var.q0(i12);
            }
            if (r1Var.f39257j < J2) {
                r1Var.s0(J2, i12);
            }
            int[] iArr = r1Var2.f39249b;
            int U = r1Var2.U();
            xn.n.g(r1Var.f39249b, iArr, U * 5, i10 * 5, i12 * 5);
            Object[] objArr = r1Var2.f39250c;
            int i14 = r1Var2.f39255h;
            xn.n.i(r1Var.f39250c, objArr, i14, J, J2);
            int V = r1Var2.V();
            q1.z(iArr, U, V);
            int i15 = U - i10;
            int i16 = U + c02;
            int K = i14 - r1Var2.K(iArr, U);
            int i17 = r1Var2.f39259l;
            int i18 = r1Var2.f39258k;
            int length = objArr.length;
            int i19 = i17;
            int i20 = U;
            while (true) {
                if (i20 >= i16) {
                    break;
                }
                if (i20 != U) {
                    i11 = i16;
                    q1.z(iArr, i20, q1.r(iArr, i20) + i15);
                } else {
                    i11 = i16;
                }
                int i21 = K;
                q1.v(iArr, i20, r1Var2.M(r1Var2.K(iArr, i20) + K, i19 >= i20 ? r1Var2.f39257j : 0, i18, length));
                if (i20 == i19) {
                    i19++;
                }
                i20++;
                K = i21;
                i16 = i11;
            }
            int i22 = i16;
            r1Var2.f39259l = i19;
            int n10 = q1.n(r1Var.f39251d, i10, r1Var.W());
            int n11 = q1.n(r1Var.f39251d, i12, r1Var.W());
            if (n10 < n11) {
                ArrayList arrayList2 = r1Var.f39251d;
                ArrayList arrayList3 = new ArrayList(n11 - n10);
                for (int i23 = n10; i23 < n11; i23++) {
                    Object obj = arrayList2.get(i23);
                    jo.p.g(obj, "sourceAnchors[anchorIndex]");
                    d dVar = (d) obj;
                    dVar.c(dVar.a() + i15);
                    arrayList3.add(dVar);
                }
                r1Var2.f39251d.addAll(q1.n(r1Var2.f39251d, r1Var2.U(), r1Var2.W()), arrayList3);
                arrayList2.subList(n10, n11).clear();
                arrayList = arrayList3;
            } else {
                arrayList = xn.s.k();
            }
            int y02 = r1Var.y0(i10);
            if (!z10) {
                boolean F0 = r1Var.F0(i10, c02);
                r1Var.G0(J, i13, i10 - 1);
                z12 = F0;
            } else {
                int i24 = y02 >= 0 ? 1 : 0;
                if (i24 != 0) {
                    r1Var.T0();
                    r1Var.z(y02 - r1Var.U());
                    r1Var.T0();
                }
                r1Var.z(i10 - r1Var.U());
                z12 = r1Var.E0();
                if (i24 != 0) {
                    r1Var.O0();
                    r1Var.N();
                    r1Var.O0();
                    r1Var.N();
                }
            }
            if (!z12) {
                r1Var2.f39261n += q1.l(iArr, U) ? 1 : q1.o(iArr, U);
                if (z11) {
                    r1Var2.f39265r = i22;
                    r1Var2.f39255h = i14 + i13;
                }
                if (G) {
                    r1Var2.a1(V);
                }
                return arrayList;
            }
            k.x("Unexpectedly removed anchors".toString());
            throw new KotlinNothingValueException();
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements Iterator<Object>, ko.a {

        /* renamed from: w  reason: collision with root package name */
        public int f39269w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ int f39270x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ r1 f39271y;

        public b(int i10, int i11, r1 r1Var) {
            this.f39270x = i11;
            this.f39271y = r1Var;
            this.f39269w = i10;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f39269w < this.f39270x;
        }

        @Override // java.util.Iterator
        public Object next() {
            if (hasNext()) {
                Object[] objArr = this.f39271y.f39250c;
                r1 r1Var = this.f39271y;
                int i10 = this.f39269w;
                this.f39269w = i10 + 1;
                return objArr[r1Var.L(i10)];
            }
            return null;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public r1(p1 p1Var) {
        jo.p.h(p1Var, "table");
        this.f39248a = p1Var;
        this.f39249b = p1Var.k();
        this.f39250c = p1Var.p();
        this.f39251d = p1Var.j();
        this.f39252e = p1Var.m();
        this.f39253f = (this.f39249b.length / 5) - p1Var.m();
        this.f39254g = p1Var.m();
        this.f39257j = p1Var.r();
        this.f39258k = this.f39250c.length - p1Var.r();
        this.f39259l = p1Var.m();
        this.f39262o = new f0();
        this.f39263p = new f0();
        this.f39264q = new f0();
        this.f39266s = -1;
    }

    public static /* synthetic */ void m0(r1 r1Var, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = r1Var.f39266s;
        }
        r1Var.l0(i10);
    }

    public final d A(int i10) {
        ArrayList<d> arrayList = this.f39251d;
        int s10 = q1.s(arrayList, i10, W());
        if (s10 < 0) {
            if (i10 > this.f39252e) {
                i10 = -(W() - i10);
            }
            d dVar = new d(i10);
            arrayList.add(-(s10 + 1), dVar);
            return dVar;
        }
        d dVar2 = arrayList.get(s10);
        jo.p.g(dVar2, "get(location)");
        return dVar2;
    }

    public final int A0(int i10) {
        return i10 > -2 ? i10 : W() + i10 + 2;
    }

    public final int B(d dVar) {
        jo.p.h(dVar, "anchor");
        int a10 = dVar.a();
        return a10 < 0 ? a10 + W() : a10;
    }

    public final int B0(int i10, int i11) {
        return i10 < i11 ? i10 : -((W() - i10) + 2);
    }

    public final int C(int[] iArr, int i10) {
        return K(iArr, i10) + q1.d(q1.f(iArr, i10) >> 29);
    }

    public final void C0() {
        z0 z0Var = this.f39268u;
        if (z0Var != null) {
            while (z0Var.b()) {
                b1(z0Var.d(), z0Var);
            }
        }
    }

    public final void D() {
        int i10 = this.f39260m;
        this.f39260m = i10 + 1;
        if (i10 == 0) {
            J0();
        }
    }

    public final boolean D0(int i10, int i11) {
        int i12 = i11 + i10;
        int n10 = q1.n(this.f39251d, i12, S() - this.f39253f);
        if (n10 >= this.f39251d.size()) {
            n10--;
        }
        int i13 = n10 + 1;
        int i14 = 0;
        while (n10 >= 0) {
            d dVar = this.f39251d.get(n10);
            jo.p.g(dVar, "anchors[index]");
            d dVar2 = dVar;
            int B = B(dVar2);
            if (B < i10) {
                break;
            }
            if (B < i12) {
                dVar2.c(Integer.MIN_VALUE);
                if (i14 == 0) {
                    i14 = n10 + 1;
                }
                i13 = n10;
            }
            n10--;
        }
        boolean z10 = i13 < i14;
        if (z10) {
            this.f39251d.subList(i13, i14).clear();
        }
        return z10;
    }

    public final boolean E(int i10) {
        int i11 = i10 + 1;
        int c02 = i10 + c0(i10);
        while (i11 < c02) {
            if (q1.b(this.f39249b, Z(i11))) {
                return true;
            }
            i11 += c0(i11);
        }
        return false;
    }

    public final boolean E0() {
        if (this.f39260m == 0) {
            int i10 = this.f39265r;
            int i11 = this.f39255h;
            int N0 = N0();
            z0 z0Var = this.f39268u;
            if (z0Var != null) {
                while (z0Var.b() && z0Var.c() >= i10) {
                    z0Var.d();
                }
            }
            boolean F0 = F0(i10, this.f39265r - i10);
            G0(i11, this.f39255h - i11, i10 - 1);
            this.f39265r = i10;
            this.f39255h = i11;
            this.f39261n -= N0;
            return F0;
        }
        throw new IllegalArgumentException("Cannot remove group while inserting".toString());
    }

    public final void F() {
        this.f39267t = true;
        if (this.f39262o.d()) {
            q0(W());
            s0(this.f39250c.length - this.f39258k, this.f39252e);
            C0();
        }
        this.f39248a.g(this, this.f39249b, this.f39252e, this.f39250c, this.f39257j, this.f39251d);
    }

    public final boolean F0(int i10, int i11) {
        if (i11 > 0) {
            ArrayList<d> arrayList = this.f39251d;
            q0(i10);
            r0 = arrayList.isEmpty() ^ true ? D0(i10, i11) : false;
            this.f39252e = i10;
            this.f39253f += i11;
            int i12 = this.f39259l;
            if (i12 > i10) {
                this.f39259l = Math.max(i10, i12 - i11);
            }
            int i13 = this.f39254g;
            if (i13 >= this.f39252e) {
                this.f39254g = i13 - i11;
            }
            if (H(this.f39266s)) {
                a1(this.f39266s);
            }
        }
        return r0;
    }

    public final boolean G(int i10) {
        return i10 >= 0 && q1.b(this.f39249b, Z(i10));
    }

    public final void G0(int i10, int i11, int i12) {
        if (i11 > 0) {
            int i13 = this.f39258k;
            int i14 = i10 + i11;
            s0(i14, i12);
            this.f39257j = i10;
            this.f39258k = i13 + i11;
            xn.n.r(this.f39250c, null, i10, i14);
            int i15 = this.f39256i;
            if (i15 >= i10) {
                this.f39256i = i15 - i11;
            }
        }
    }

    public final boolean H(int i10) {
        return i10 >= 0 && q1.c(this.f39249b, Z(i10));
    }

    public final void H0() {
        if (this.f39260m == 0) {
            C0();
            this.f39265r = 0;
            this.f39254g = S() - this.f39253f;
            this.f39255h = 0;
            this.f39256i = 0;
            this.f39261n = 0;
            return;
        }
        k.x("Cannot reset when inserting".toString());
        throw new KotlinNothingValueException();
    }

    public final int I(int i10, int i11, int i12) {
        return i10 < 0 ? (i12 - i11) + i10 + 1 : i10;
    }

    public final int I0() {
        int S = (S() - this.f39253f) - this.f39263p.h();
        this.f39254g = S;
        return S;
    }

    public final int J(int i10) {
        return K(this.f39249b, Z(i10));
    }

    public final void J0() {
        this.f39263p.i((S() - this.f39253f) - this.f39254g);
    }

    public final int K(int[] iArr, int i10) {
        return i10 >= S() ? this.f39250c.length - this.f39258k : I(q1.e(iArr, i10), this.f39258k, this.f39250c.length);
    }

    public final Object K0(int i10, Object obj) {
        int R0 = R0(this.f39249b, Z(this.f39265r));
        boolean z10 = true;
        int i11 = R0 + i10;
        if ((i11 < R0 || i11 >= K(this.f39249b, Z(this.f39265r + 1))) ? false : false) {
            int L = L(i11);
            Object[] objArr = this.f39250c;
            Object obj2 = objArr[L];
            objArr[L] = obj;
            return obj2;
        }
        k.x(("Write to an invalid slot index " + i10 + " for group " + this.f39265r).toString());
        throw new KotlinNothingValueException();
    }

    public final int L(int i10) {
        return i10 < this.f39257j ? i10 : i10 + this.f39258k;
    }

    public final void L0(Object obj) {
        int i10 = this.f39255h;
        if (i10 <= this.f39256i) {
            this.f39250c[L(i10 - 1)] = obj;
        } else {
            k.x("Writing to an invalid slot".toString());
            throw new KotlinNothingValueException();
        }
    }

    public final int M(int i10, int i11, int i12, int i13) {
        return i10 > i11 ? -(((i13 - i12) - i10) + 1) : i10;
    }

    public final Object M0() {
        if (this.f39260m > 0) {
            i0(1, this.f39266s);
        }
        Object[] objArr = this.f39250c;
        int i10 = this.f39255h;
        this.f39255h = i10 + 1;
        return objArr[L(i10)];
    }

    public final int N() {
        boolean z10 = this.f39260m > 0;
        int i10 = this.f39265r;
        int i11 = this.f39254g;
        int i12 = this.f39266s;
        int Z = Z(i12);
        int i13 = this.f39261n;
        int i14 = i10 - i12;
        boolean l10 = q1.l(this.f39249b, Z);
        if (z10) {
            q1.w(this.f39249b, Z, i14);
            q1.y(this.f39249b, Z, i13);
            this.f39261n = this.f39264q.h() + (l10 ? 1 : i13);
            this.f39266s = z0(this.f39249b, i12);
        } else {
            if ((i10 != i11 ? 0 : 1) != 0) {
                int g10 = q1.g(this.f39249b, Z);
                int o10 = q1.o(this.f39249b, Z);
                q1.w(this.f39249b, Z, i14);
                q1.y(this.f39249b, Z, i13);
                int h10 = this.f39262o.h();
                I0();
                this.f39266s = h10;
                int z02 = z0(this.f39249b, i12);
                int h11 = this.f39264q.h();
                this.f39261n = h11;
                if (z02 == h10) {
                    this.f39261n = h11 + (l10 ? 0 : i13 - o10);
                } else {
                    int i15 = i14 - g10;
                    int i16 = l10 ? 0 : i13 - o10;
                    if (i15 != 0 || i16 != 0) {
                        while (z02 != 0 && z02 != h10 && (i16 != 0 || i15 != 0)) {
                            int Z2 = Z(z02);
                            if (i15 != 0) {
                                q1.w(this.f39249b, Z2, q1.g(this.f39249b, Z2) + i15);
                            }
                            if (i16 != 0) {
                                int[] iArr = this.f39249b;
                                q1.y(iArr, Z2, q1.o(iArr, Z2) + i16);
                            }
                            if (q1.l(this.f39249b, Z2)) {
                                i16 = 0;
                            }
                            z02 = z0(this.f39249b, z02);
                        }
                    }
                    this.f39261n += i16;
                }
            } else {
                throw new IllegalArgumentException("Expected to be at the end of a group".toString());
            }
        }
        return i13;
    }

    public final int N0() {
        int Z = Z(this.f39265r);
        int g10 = this.f39265r + q1.g(this.f39249b, Z);
        this.f39265r = g10;
        this.f39255h = K(this.f39249b, Z(g10));
        if (q1.l(this.f39249b, Z)) {
            return 1;
        }
        return q1.o(this.f39249b, Z);
    }

    public final void O() {
        int i10 = this.f39260m;
        if (i10 > 0) {
            int i11 = i10 - 1;
            this.f39260m = i11;
            if (i11 == 0) {
                if (this.f39264q.b() == this.f39262o.b()) {
                    I0();
                    return;
                } else {
                    k.x("startGroup/endGroup mismatch while inserting".toString());
                    throw new KotlinNothingValueException();
                }
            }
            return;
        }
        throw new IllegalStateException("Unbalanced begin/end insert".toString());
    }

    public final void O0() {
        int i10 = this.f39254g;
        this.f39265r = i10;
        this.f39255h = K(this.f39249b, Z(i10));
    }

    public final void P(int i10) {
        boolean z10 = true;
        if (this.f39260m <= 0) {
            int i11 = this.f39266s;
            if (i11 != i10) {
                if (i10 < i11 || i10 >= this.f39254g) {
                    z10 = false;
                }
                if (z10) {
                    int i12 = this.f39265r;
                    int i13 = this.f39255h;
                    int i14 = this.f39256i;
                    this.f39265r = i10;
                    T0();
                    this.f39265r = i12;
                    this.f39255h = i13;
                    this.f39256i = i14;
                    return;
                }
                throw new IllegalArgumentException(("Started group at " + i10 + " must be a subgroup of the group at " + i11).toString());
            }
            return;
        }
        throw new IllegalArgumentException("Cannot call ensureStarted() while inserting".toString());
    }

    public final Object P0(int i10, int i11) {
        int R0 = R0(this.f39249b, Z(i10));
        boolean z10 = true;
        int K = K(this.f39249b, Z(i10 + 1));
        int i12 = i11 + R0;
        if (R0 > i12 || i12 >= K) {
            z10 = false;
        }
        if (!z10) {
            return i.f39065a.a();
        }
        return this.f39250c[L(i12)];
    }

    public final void Q(d dVar) {
        jo.p.h(dVar, "anchor");
        P(dVar.e(this));
    }

    public final Object Q0(d dVar, int i10) {
        jo.p.h(dVar, "anchor");
        return P0(B(dVar), i10);
    }

    public final void R(int i10, int i11, int i12) {
        int B0 = B0(i10, this.f39252e);
        while (i12 < i11) {
            q1.z(this.f39249b, Z(i12), B0);
            int g10 = q1.g(this.f39249b, Z(i12)) + i12;
            R(i12, g10, i12 + 1);
            i12 = g10;
        }
    }

    public final int R0(int[] iArr, int i10) {
        return i10 >= S() ? this.f39250c.length - this.f39258k : I(q1.t(iArr, i10), this.f39258k, this.f39250c.length);
    }

    public final int S() {
        return this.f39249b.length / 5;
    }

    public final void S0(int i10, Object obj, Object obj2) {
        V0(i10, obj, false, obj2);
    }

    public final boolean T() {
        return this.f39267t;
    }

    public final void T0() {
        if (this.f39260m == 0) {
            i.a aVar = i.f39065a;
            V0(0, aVar.a(), false, aVar.a());
            return;
        }
        throw new IllegalArgumentException("Key must be supplied when inserting".toString());
    }

    public final int U() {
        return this.f39265r;
    }

    public final void U0(int i10, Object obj) {
        V0(i10, obj, false, i.f39065a.a());
    }

    public final int V() {
        return this.f39266s;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void V0(int i10, Object obj, boolean z10, Object obj2) {
        int g10;
        byte b10 = this.f39260m > 0 ? (byte) 1 : (byte) 0;
        this.f39264q.i(this.f39261n);
        if (b10 != 0) {
            h0(1);
            int i11 = this.f39265r;
            int Z = Z(i11);
            i.a aVar = i.f39065a;
            int i12 = obj != aVar.a() ? 1 : 0;
            int i13 = (z10 || obj2 == aVar.a()) ? 0 : 1;
            q1.k(this.f39249b, Z, i10, z10, i12, i13, this.f39266s, this.f39255h);
            this.f39256i = this.f39255h;
            int i14 = (z10 ? 1 : 0) + i12 + i13;
            if (i14 > 0) {
                i0(i14, i11);
                Object[] objArr = this.f39250c;
                int i15 = this.f39255h;
                if (z10) {
                    objArr[i15] = obj2;
                    i15++;
                }
                if (i12 != 0) {
                    objArr[i15] = obj;
                    i15++;
                }
                if (i13 != 0) {
                    objArr[i15] = obj2;
                    i15++;
                }
                this.f39255h = i15;
            }
            this.f39261n = 0;
            g10 = i11 + 1;
            this.f39266s = i11;
            this.f39265r = g10;
        } else {
            this.f39262o.i(this.f39266s);
            J0();
            int i16 = this.f39265r;
            int Z2 = Z(i16);
            if (!jo.p.c(obj2, i.f39065a.a())) {
                if (z10) {
                    d1(obj2);
                } else {
                    Z0(obj2);
                }
            }
            this.f39255h = R0(this.f39249b, Z2);
            this.f39256i = K(this.f39249b, Z(this.f39265r + 1));
            this.f39261n = q1.o(this.f39249b, Z2);
            this.f39266s = i16;
            this.f39265r = i16 + 1;
            g10 = i16 + q1.g(this.f39249b, Z2);
        }
        this.f39254g = g10;
    }

    public final int W() {
        return S() - this.f39253f;
    }

    public final void W0(Object obj) {
        V0(125, obj, true, i.f39065a.a());
    }

    public final p1 X() {
        return this.f39248a;
    }

    public final Object X0(Object obj) {
        Object M0 = M0();
        L0(obj);
        return M0;
    }

    public final Object Y(int i10) {
        int Z = Z(i10);
        return q1.h(this.f39249b, Z) ? this.f39250c[C(this.f39249b, Z)] : i.f39065a.a();
    }

    public final void Y0(int i10, int i11) {
        int i12;
        int S = S() - this.f39253f;
        if (i10 < i11) {
            for (int n10 = q1.n(this.f39251d, i10, S); n10 < this.f39251d.size(); n10++) {
                d dVar = this.f39251d.get(n10);
                jo.p.g(dVar, "anchors[index]");
                d dVar2 = dVar;
                int a10 = dVar2.a();
                if (a10 >= 0 || (i12 = a10 + S) >= i11) {
                    return;
                }
                dVar2.c(i12);
            }
            return;
        }
        for (int n11 = q1.n(this.f39251d, i11, S); n11 < this.f39251d.size(); n11++) {
            d dVar3 = this.f39251d.get(n11);
            jo.p.g(dVar3, "anchors[index]");
            d dVar4 = dVar3;
            int a11 = dVar4.a();
            if (a11 < 0) {
                return;
            }
            dVar4.c(-(S - a11));
        }
    }

    public final int Z(int i10) {
        return i10 < this.f39252e ? i10 : i10 + this.f39253f;
    }

    public final void Z0(Object obj) {
        int Z = Z(this.f39265r);
        if (q1.h(this.f39249b, Z)) {
            this.f39250c[L(C(this.f39249b, Z))] = obj;
        } else {
            k.x("Updating the data of a group that was not created with a data slot".toString());
            throw new KotlinNothingValueException();
        }
    }

    public final int a0(int i10) {
        return q1.m(this.f39249b, Z(i10));
    }

    public final void a1(int i10) {
        if (i10 >= 0) {
            z0 z0Var = this.f39268u;
            if (z0Var == null) {
                z0Var = new z0(null, 1, null);
                this.f39268u = z0Var;
            }
            z0Var.a(i10);
        }
    }

    public final Object b0(int i10) {
        int Z = Z(i10);
        if (q1.j(this.f39249b, Z)) {
            return this.f39250c[q1.q(this.f39249b, Z)];
        }
        return null;
    }

    public final void b1(int i10, z0 z0Var) {
        int Z = Z(i10);
        boolean E = E(i10);
        if (q1.c(this.f39249b, Z) != E) {
            q1.u(this.f39249b, Z, E);
            int y02 = y0(i10);
            if (y02 >= 0) {
                z0Var.a(y02);
            }
        }
    }

    public final int c0(int i10) {
        return q1.g(this.f39249b, Z(i10));
    }

    public final void c1(int[] iArr, int i10, int i11) {
        q1.v(iArr, i10, M(i11, this.f39257j, this.f39258k, this.f39250c.length));
    }

    public final Iterator<Object> d0() {
        int K = K(this.f39249b, Z(this.f39265r));
        int[] iArr = this.f39249b;
        int i10 = this.f39265r;
        return new b(K, K(iArr, Z(i10 + c0(i10))), this);
    }

    public final void d1(Object obj) {
        f1(this.f39265r, obj);
    }

    public final boolean e0(int i10) {
        return f0(i10, this.f39265r);
    }

    public final void e1(d dVar, Object obj) {
        jo.p.h(dVar, "anchor");
        f1(dVar.e(this), obj);
    }

    public final boolean f0(int i10, int i11) {
        int S;
        int c02;
        if (i11 == this.f39266s) {
            S = this.f39254g;
        } else {
            if (i11 > this.f39262o.g(0)) {
                c02 = c0(i11);
            } else {
                int c10 = this.f39262o.c(i11);
                if (c10 < 0) {
                    c02 = c0(i11);
                } else {
                    S = (S() - this.f39253f) - this.f39263p.f(c10);
                }
            }
            S = c02 + i11;
        }
        return i10 > i11 && i10 < S;
    }

    public final void f1(int i10, Object obj) {
        int Z = Z(i10);
        int[] iArr = this.f39249b;
        if (Z < iArr.length && q1.l(iArr, Z)) {
            this.f39250c[L(x0(this.f39249b, Z))] = obj;
            return;
        }
        k.x(("Updating the node of a group at " + i10 + " that was not created with as a node group").toString());
        throw new KotlinNothingValueException();
    }

    public final boolean g0(int i10) {
        int i11 = this.f39266s;
        return (i10 > i11 && i10 < this.f39254g) || (i11 == 0 && i10 == 0);
    }

    public final void h0(int i10) {
        if (i10 > 0) {
            int i11 = this.f39265r;
            q0(i11);
            int i12 = this.f39252e;
            int i13 = this.f39253f;
            int[] iArr = this.f39249b;
            int length = iArr.length / 5;
            int i14 = length - i13;
            if (i13 < i10) {
                int max = Math.max(Math.max(length * 2, i14 + i10), 32);
                int[] iArr2 = new int[max * 5];
                int i15 = max - i14;
                xn.n.g(iArr, iArr2, 0, 0, i12 * 5);
                xn.n.g(iArr, iArr2, (i12 + i15) * 5, (i13 + i12) * 5, length * 5);
                this.f39249b = iArr2;
                i13 = i15;
            }
            int i16 = this.f39254g;
            if (i16 >= i12) {
                this.f39254g = i16 + i10;
            }
            int i17 = i12 + i10;
            this.f39252e = i17;
            this.f39253f = i13 - i10;
            int M = M(i14 > 0 ? J(i11 + i10) : 0, this.f39259l >= i12 ? this.f39257j : 0, this.f39258k, this.f39250c.length);
            for (int i18 = i12; i18 < i17; i18++) {
                q1.v(this.f39249b, i18, M);
            }
            int i19 = this.f39259l;
            if (i19 >= i12) {
                this.f39259l = i19 + i10;
            }
        }
    }

    public final void i0(int i10, int i11) {
        if (i10 > 0) {
            s0(this.f39255h, i11);
            int i12 = this.f39257j;
            int i13 = this.f39258k;
            if (i13 < i10) {
                Object[] objArr = this.f39250c;
                int length = objArr.length;
                int i14 = length - i13;
                int max = Math.max(Math.max(length * 2, i14 + i10), 32);
                Object[] objArr2 = new Object[max];
                for (int i15 = 0; i15 < max; i15++) {
                    objArr2[i15] = null;
                }
                int i16 = max - i14;
                xn.n.i(objArr, objArr2, 0, 0, i12);
                xn.n.i(objArr, objArr2, i12 + i16, i13 + i12, length);
                this.f39250c = objArr2;
                i13 = i16;
            }
            int i17 = this.f39256i;
            if (i17 >= i12) {
                this.f39256i = i17 + i10;
            }
            this.f39257j = i12 + i10;
            this.f39258k = i13 - i10;
        }
    }

    public final boolean j0() {
        int i10 = this.f39265r;
        return i10 < this.f39254g && q1.l(this.f39249b, Z(i10));
    }

    public final boolean k0(int i10) {
        return q1.l(this.f39249b, Z(i10));
    }

    public final void l0(int i10) {
        int Z = Z(i10);
        if (q1.i(this.f39249b, Z)) {
            return;
        }
        q1.x(this.f39249b, Z, true);
        if (q1.c(this.f39249b, Z)) {
            return;
        }
        a1(y0(i10));
    }

    public final void n0(int i10, int i11, int i12) {
        int i13 = i12 + i10;
        int W = W();
        int n10 = q1.n(this.f39251d, i10, W);
        ArrayList arrayList = new ArrayList();
        if (n10 >= 0) {
            while (n10 < this.f39251d.size()) {
                d dVar = this.f39251d.get(n10);
                jo.p.g(dVar, "anchors[index]");
                d dVar2 = dVar;
                int B = B(dVar2);
                if (B < i10 || B >= i13) {
                    break;
                }
                arrayList.add(dVar2);
                this.f39251d.remove(n10);
            }
        }
        int i14 = i11 - i10;
        int size = arrayList.size();
        for (int i15 = 0; i15 < size; i15++) {
            d dVar3 = (d) arrayList.get(i15);
            int B2 = B(dVar3) + i14;
            if (B2 >= this.f39252e) {
                dVar3.c(-(W - B2));
            } else {
                dVar3.c(B2);
            }
            this.f39251d.add(q1.n(this.f39251d, B2, W), dVar3);
        }
    }

    public final List<d> o0(p1 p1Var, int i10) {
        jo.p.h(p1Var, "table");
        if (this.f39260m > 0) {
            if (i10 == 0 && this.f39265r == 0 && this.f39248a.m() == 0) {
                int[] iArr = this.f39249b;
                Object[] objArr = this.f39250c;
                ArrayList<d> arrayList = this.f39251d;
                int[] k10 = p1Var.k();
                int m10 = p1Var.m();
                Object[] p10 = p1Var.p();
                int r10 = p1Var.r();
                this.f39249b = k10;
                this.f39250c = p10;
                this.f39251d = p1Var.j();
                this.f39252e = m10;
                this.f39253f = (k10.length / 5) - m10;
                this.f39257j = r10;
                this.f39258k = p10.length - r10;
                this.f39259l = m10;
                p1Var.A(iArr, 0, objArr, 0, arrayList);
                return this.f39251d;
            }
            r1 x10 = p1Var.x();
            try {
                return f39247v.b(x10, i10, this, true, true);
            } finally {
                x10.F();
            }
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    public final void p0(int i10) {
        if (!(this.f39260m == 0)) {
            throw new IllegalArgumentException("Cannot move a group while inserting".toString());
        }
        if (!(i10 >= 0)) {
            throw new IllegalArgumentException("Parameter offset is out of bounds".toString());
        }
        if (i10 == 0) {
            return;
        }
        int i11 = this.f39265r;
        int i12 = this.f39266s;
        int i13 = this.f39254g;
        int i14 = i11;
        for (int i15 = i10; i15 > 0; i15--) {
            i14 += q1.g(this.f39249b, Z(i14));
            if (!(i14 <= i13)) {
                throw new IllegalArgumentException("Parameter offset is out of bounds".toString());
            }
        }
        int g10 = q1.g(this.f39249b, Z(i14));
        int i16 = this.f39255h;
        int K = K(this.f39249b, Z(i14));
        int i17 = i14 + g10;
        int K2 = K(this.f39249b, Z(i17));
        int i18 = K2 - K;
        i0(i18, Math.max(this.f39265r - 1, 0));
        h0(g10);
        int[] iArr = this.f39249b;
        int Z = Z(i17) * 5;
        xn.n.g(iArr, iArr, Z(i11) * 5, Z, (g10 * 5) + Z);
        if (i18 > 0) {
            Object[] objArr = this.f39250c;
            xn.n.i(objArr, objArr, i16, L(K + i18), L(K2 + i18));
        }
        int i19 = K + i18;
        int i20 = i19 - i16;
        int i21 = this.f39257j;
        int i22 = this.f39258k;
        int length = this.f39250c.length;
        int i23 = this.f39259l;
        int i24 = i11 + g10;
        int i25 = i11;
        while (i25 < i24) {
            int Z2 = Z(i25);
            int i26 = i21;
            int i27 = i20;
            c1(iArr, Z2, M(K(iArr, Z2) - i20, i23 < Z2 ? 0 : i26, i22, length));
            i25++;
            i21 = i26;
            i20 = i27;
        }
        n0(i17, i11, g10);
        if (!F0(i17, g10)) {
            R(i12, this.f39254g, i11);
            if (i18 > 0) {
                G0(i19, i18, i17 - 1);
                return;
            }
            return;
        }
        k.x("Unexpectedly removed anchors".toString());
        throw new KotlinNothingValueException();
    }

    public final void q0(int i10) {
        int i11 = this.f39253f;
        int i12 = this.f39252e;
        if (i12 != i10) {
            if (!this.f39251d.isEmpty()) {
                Y0(i12, i10);
            }
            if (i11 > 0) {
                int[] iArr = this.f39249b;
                int i13 = i10 * 5;
                int i14 = i11 * 5;
                int i15 = i12 * 5;
                if (i10 < i12) {
                    xn.n.g(iArr, iArr, i14 + i13, i13, i15);
                } else {
                    xn.n.g(iArr, iArr, i15, i15 + i14, i13 + i14);
                }
            }
            if (i10 < i12) {
                i12 = i10 + i11;
            }
            int S = S();
            k.X(i12 < S);
            while (i12 < S) {
                int r10 = q1.r(this.f39249b, i12);
                int B0 = B0(A0(r10), i10);
                if (B0 != r10) {
                    q1.z(this.f39249b, i12, B0);
                }
                i12++;
                if (i12 == i10) {
                    i12 += i11;
                }
            }
        }
        this.f39252e = i10;
    }

    public final List<d> r0(int i10, p1 p1Var, int i11) {
        jo.p.h(p1Var, "table");
        boolean z10 = true;
        k.X((this.f39260m > 0 || c0(this.f39265r + i10) != 1) ? false : false);
        int i12 = this.f39265r;
        int i13 = this.f39255h;
        int i14 = this.f39256i;
        z(i10);
        T0();
        D();
        r1 x10 = p1Var.x();
        try {
            List<d> b10 = f39247v.b(x10, i11, this, false, true);
            x10.F();
            O();
            N();
            this.f39265r = i12;
            this.f39255h = i13;
            this.f39256i = i14;
            return b10;
        } catch (Throwable th2) {
            x10.F();
            throw th2;
        }
    }

    public final void s0(int i10, int i11) {
        int i12 = this.f39258k;
        int i13 = this.f39257j;
        int i14 = this.f39259l;
        if (i13 != i10) {
            Object[] objArr = this.f39250c;
            if (i10 < i13) {
                xn.n.i(objArr, objArr, i10 + i12, i10, i13);
            } else {
                xn.n.i(objArr, objArr, i13, i13 + i12, i10 + i12);
            }
            xn.n.r(objArr, null, i10, i10 + i12);
        }
        int min = Math.min(i11 + 1, W());
        if (i14 != min) {
            int length = this.f39250c.length - i12;
            if (min < i14) {
                int Z = Z(min);
                int Z2 = Z(i14);
                int i15 = this.f39252e;
                while (Z < Z2) {
                    int e10 = q1.e(this.f39249b, Z);
                    if (e10 >= 0) {
                        q1.v(this.f39249b, Z, -((length - e10) + 1));
                        Z++;
                        if (Z == i15) {
                            Z += this.f39253f;
                        }
                    } else {
                        k.x("Unexpected anchor value, expected a positive anchor".toString());
                        throw new KotlinNothingValueException();
                    }
                }
            } else {
                int Z3 = Z(i14);
                int Z4 = Z(min);
                while (Z3 < Z4) {
                    int e11 = q1.e(this.f39249b, Z3);
                    if (e11 < 0) {
                        q1.v(this.f39249b, Z3, e11 + length + 1);
                        Z3++;
                        if (Z3 == this.f39252e) {
                            Z3 += this.f39253f;
                        }
                    } else {
                        k.x("Unexpected anchor value, expected a negative anchor".toString());
                        throw new KotlinNothingValueException();
                    }
                }
            }
            this.f39259l = min;
        }
        this.f39257j = i10;
    }

    public final List<d> t0(d dVar, int i10, r1 r1Var) {
        jo.p.h(dVar, "anchor");
        jo.p.h(r1Var, "writer");
        if (r1Var.f39260m > 0) {
            if (this.f39260m == 0) {
                if (dVar.b()) {
                    int B = B(dVar) + i10;
                    int i11 = this.f39265r;
                    if (i11 <= B && B < this.f39254g) {
                        int y02 = y0(B);
                        int c02 = c0(B);
                        int w02 = k0(B) ? 1 : w0(B);
                        List<d> b10 = f39247v.b(this, B, r1Var, false, false);
                        a1(y02);
                        boolean z10 = w02 > 0;
                        while (y02 >= i11) {
                            int Z = Z(y02);
                            int[] iArr = this.f39249b;
                            q1.w(iArr, Z, q1.g(iArr, Z) - c02);
                            if (z10) {
                                if (q1.l(this.f39249b, Z)) {
                                    z10 = false;
                                } else {
                                    int[] iArr2 = this.f39249b;
                                    q1.y(iArr2, Z, q1.o(iArr2, Z) - w02);
                                }
                            }
                            y02 = y0(y02);
                        }
                        if (z10) {
                            k.X(this.f39261n >= w02);
                            this.f39261n -= w02;
                        }
                        return b10;
                    }
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    public String toString() {
        return "SlotWriter(current = " + this.f39265r + " end=" + this.f39254g + " size = " + W() + " gap=" + this.f39252e + '-' + (this.f39252e + this.f39253f) + ')';
    }

    public final Object u0(int i10) {
        int Z = Z(i10);
        if (q1.l(this.f39249b, Z)) {
            return this.f39250c[L(x0(this.f39249b, Z))];
        }
        return null;
    }

    public final Object v0(d dVar) {
        jo.p.h(dVar, "anchor");
        return u0(dVar.e(this));
    }

    public final int w0(int i10) {
        return q1.o(this.f39249b, Z(i10));
    }

    public final int x0(int[] iArr, int i10) {
        return K(iArr, i10);
    }

    public final int y0(int i10) {
        return z0(this.f39249b, i10);
    }

    public final void z(int i10) {
        boolean z10 = true;
        if (i10 >= 0) {
            if (!(this.f39260m <= 0)) {
                throw new IllegalStateException("Cannot call seek() while inserting".toString());
            }
            if (i10 == 0) {
                return;
            }
            int i11 = this.f39265r + i10;
            if (i11 < this.f39266s || i11 > this.f39254g) {
                z10 = false;
            }
            if (z10) {
                this.f39265r = i11;
                int K = K(this.f39249b, Z(i11));
                this.f39255h = K;
                this.f39256i = K;
                return;
            }
            k.x(("Cannot seek outside the current group (" + this.f39266s + '-' + this.f39254g + ')').toString());
            throw new KotlinNothingValueException();
        }
        throw new IllegalArgumentException("Cannot seek backwards".toString());
    }

    public final int z0(int[] iArr, int i10) {
        return A0(q1.r(iArr, Z(i10)));
    }
}
