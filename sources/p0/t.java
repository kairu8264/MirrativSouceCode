package p0;

import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes.dex */
public final class t<K, V> {

    /* renamed from: e  reason: collision with root package name */
    public static final a f45669e = new a(null);

    /* renamed from: f  reason: collision with root package name */
    public static final t f45670f = new t(0, 0, new Object[0]);

    /* renamed from: a  reason: collision with root package name */
    public int f45671a;

    /* renamed from: b  reason: collision with root package name */
    public int f45672b;

    /* renamed from: c  reason: collision with root package name */
    public final r0.e f45673c;

    /* renamed from: d  reason: collision with root package name */
    public Object[] f45674d;

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final t a() {
            return t.f45670f;
        }
    }

    /* loaded from: classes.dex */
    public static final class b<K, V> {

        /* renamed from: a  reason: collision with root package name */
        public t<K, V> f45675a;

        /* renamed from: b  reason: collision with root package name */
        public final int f45676b;

        public b(t<K, V> tVar, int i10) {
            jo.p.h(tVar, "node");
            this.f45675a = tVar;
            this.f45676b = i10;
        }

        public final t<K, V> a() {
            return this.f45675a;
        }

        public final int b() {
            return this.f45676b;
        }

        public final void c(t<K, V> tVar) {
            jo.p.h(tVar, "<set-?>");
            this.f45675a = tVar;
        }
    }

    public t(int i10, int i11, Object[] objArr, r0.e eVar) {
        jo.p.h(objArr, "buffer");
        this.f45671a = i10;
        this.f45672b = i11;
        this.f45673c = eVar;
        this.f45674d = objArr;
    }

    public final t<K, V> A(int i10, f<K, V> fVar) {
        fVar.p(fVar.size() - 1);
        fVar.o(W(i10));
        if (this.f45674d.length == 2) {
            return null;
        }
        if (this.f45673c == fVar.k()) {
            this.f45674d = x.b(this.f45674d, i10);
            return this;
        }
        return new t<>(0, 0, x.b(this.f45674d, i10), fVar.k());
    }

    public final t<K, V> B(int i10, K k10, V v10, r0.e eVar) {
        int n10 = n(i10);
        if (this.f45673c == eVar) {
            this.f45674d = x.a(this.f45674d, n10, k10, v10);
            this.f45671a = i10 | this.f45671a;
            return this;
        }
        return new t<>(i10 | this.f45671a, this.f45672b, x.a(this.f45674d, n10, k10, v10), eVar);
    }

    public final t<K, V> C(int i10, int i11, int i12, K k10, V v10, int i13, r0.e eVar) {
        if (this.f45673c == eVar) {
            this.f45674d = d(i10, i11, i12, k10, v10, i13, eVar);
            this.f45671a ^= i11;
            this.f45672b |= i11;
            return this;
        }
        return new t<>(this.f45671a ^ i11, i11 | this.f45672b, d(i10, i11, i12, k10, v10, i13, eVar), eVar);
    }

    public final t<K, V> D(int i10, K k10, V v10, int i11, f<K, V> fVar) {
        t<K, V> D;
        jo.p.h(fVar, "mutator");
        int f10 = 1 << x.f(i10, i11);
        if (q(f10)) {
            int n10 = n(f10);
            if (jo.p.c(k10, t(n10))) {
                fVar.o(W(n10));
                return W(n10) == v10 ? this : M(n10, v10, fVar);
            }
            fVar.p(fVar.size() + 1);
            return C(n10, f10, i10, k10, v10, i11, fVar.k());
        } else if (r(f10)) {
            int O = O(f10);
            t<K, V> N = N(O);
            if (i11 == 30) {
                D = N.w(k10, v10, fVar);
            } else {
                D = N.D(i10, k10, v10, i11 + 5, fVar);
            }
            return N == D ? this : L(O, D, fVar.k());
        } else {
            fVar.p(fVar.size() + 1);
            return B(f10, k10, v10, fVar.k());
        }
    }

    public final t<K, V> E(t<K, V> tVar, int i10, r0.b bVar, f<K, V> fVar) {
        jo.p.h(tVar, "otherNode");
        jo.p.h(bVar, "intersectionCounter");
        jo.p.h(fVar, "mutator");
        if (this == tVar) {
            bVar.b(e());
            return this;
        } else if (i10 > 30) {
            return x(tVar, bVar, fVar.k());
        } else {
            int i11 = this.f45672b | tVar.f45672b;
            int i12 = this.f45671a;
            int i13 = tVar.f45671a;
            int i14 = i12 & i13;
            int i15 = (i12 ^ i13) & (~i11);
            while (i14 != 0) {
                int lowestOneBit = Integer.lowestOneBit(i14);
                if (jo.p.c(t(n(lowestOneBit)), tVar.t(tVar.n(lowestOneBit)))) {
                    i15 |= lowestOneBit;
                } else {
                    i11 |= lowestOneBit;
                }
                i14 ^= lowestOneBit;
            }
            int i16 = 0;
            if ((i11 & i15) == 0) {
                t<K, V> tVar2 = (jo.p.c(this.f45673c, fVar.k()) && this.f45671a == i15 && this.f45672b == i11) ? this : new t<>(i15, i11, new Object[(Integer.bitCount(i15) * 2) + Integer.bitCount(i11)]);
                int i17 = i11;
                int i18 = 0;
                while (i17 != 0) {
                    int lowestOneBit2 = Integer.lowestOneBit(i17);
                    Object[] objArr = tVar2.f45674d;
                    objArr[(objArr.length - 1) - i18] = F(tVar, lowestOneBit2, i10, bVar, fVar);
                    i18++;
                    i17 ^= lowestOneBit2;
                }
                while (i15 != 0) {
                    int lowestOneBit3 = Integer.lowestOneBit(i15);
                    int i19 = i16 * 2;
                    if (!tVar.q(lowestOneBit3)) {
                        int n10 = n(lowestOneBit3);
                        tVar2.f45674d[i19] = t(n10);
                        tVar2.f45674d[i19 + 1] = W(n10);
                    } else {
                        int n11 = tVar.n(lowestOneBit3);
                        tVar2.f45674d[i19] = tVar.t(n11);
                        tVar2.f45674d[i19 + 1] = tVar.W(n11);
                        if (q(lowestOneBit3)) {
                            bVar.c(bVar.a() + 1);
                        }
                    }
                    i16++;
                    i15 ^= lowestOneBit3;
                }
                return l(tVar2) ? this : tVar.l(tVar2) ? tVar : tVar2;
            }
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    public final t<K, V> F(t<K, V> tVar, int i10, int i11, r0.b bVar, f<K, V> fVar) {
        if (r(i10)) {
            t<K, V> N = N(O(i10));
            if (tVar.r(i10)) {
                return N.E(tVar.N(tVar.O(i10)), i11 + 5, bVar, fVar);
            }
            if (tVar.q(i10)) {
                int n10 = tVar.n(i10);
                K t10 = tVar.t(n10);
                V W = tVar.W(n10);
                int size = fVar.size();
                t<K, V> D = N.D(t10 != null ? t10.hashCode() : 0, t10, W, i11 + 5, fVar);
                if (fVar.size() == size) {
                    bVar.c(bVar.a() + 1);
                    return D;
                }
                return D;
            }
            return N;
        } else if (tVar.r(i10)) {
            t<K, V> N2 = tVar.N(tVar.O(i10));
            if (q(i10)) {
                int n11 = n(i10);
                K t11 = t(n11);
                int i12 = i11 + 5;
                if (!N2.k(t11 != null ? t11.hashCode() : 0, t11, i12)) {
                    return N2.D(t11 != null ? t11.hashCode() : 0, t11, W(n11), i12, fVar);
                }
                bVar.c(bVar.a() + 1);
            }
            return N2;
        } else {
            int n12 = n(i10);
            K t12 = t(n12);
            V W2 = W(n12);
            int n13 = tVar.n(i10);
            K t13 = tVar.t(n13);
            return u(t12 != null ? t12.hashCode() : 0, t12, W2, t13 != null ? t13.hashCode() : 0, t13, tVar.W(n13), i11 + 5, fVar.k());
        }
    }

    public final t<K, V> G(int i10, K k10, int i11, f<K, V> fVar) {
        t<K, V> G;
        jo.p.h(fVar, "mutator");
        int f10 = 1 << x.f(i10, i11);
        if (q(f10)) {
            int n10 = n(f10);
            return jo.p.c(k10, t(n10)) ? I(n10, f10, fVar) : this;
        } else if (r(f10)) {
            int O = O(f10);
            t<K, V> N = N(O);
            if (i11 == 30) {
                G = N.z(k10, fVar);
            } else {
                G = N.G(i10, k10, i11 + 5, fVar);
            }
            return K(N, G, O, f10, fVar.k());
        } else {
            return this;
        }
    }

    public final t<K, V> H(int i10, K k10, V v10, int i11, f<K, V> fVar) {
        t<K, V> H;
        jo.p.h(fVar, "mutator");
        int f10 = 1 << x.f(i10, i11);
        if (q(f10)) {
            int n10 = n(f10);
            return (jo.p.c(k10, t(n10)) && jo.p.c(v10, W(n10))) ? I(n10, f10, fVar) : this;
        } else if (r(f10)) {
            int O = O(f10);
            t<K, V> N = N(O);
            if (i11 == 30) {
                H = N.y(k10, v10, fVar);
            } else {
                H = N.H(i10, k10, v10, i11 + 5, fVar);
            }
            return K(N, H, O, f10, fVar.k());
        } else {
            return this;
        }
    }

    public final t<K, V> I(int i10, int i11, f<K, V> fVar) {
        fVar.p(fVar.size() - 1);
        fVar.o(W(i10));
        if (this.f45674d.length == 2) {
            return null;
        }
        if (this.f45673c == fVar.k()) {
            this.f45674d = x.b(this.f45674d, i10);
            this.f45671a ^= i11;
            return this;
        }
        return new t<>(i11 ^ this.f45671a, this.f45672b, x.b(this.f45674d, i10), fVar.k());
    }

    public final t<K, V> J(int i10, int i11, r0.e eVar) {
        Object[] objArr = this.f45674d;
        if (objArr.length == 1) {
            return null;
        }
        if (this.f45673c == eVar) {
            this.f45674d = x.c(objArr, i10);
            this.f45672b ^= i11;
            return this;
        }
        return new t<>(this.f45671a, i11 ^ this.f45672b, x.c(objArr, i10), eVar);
    }

    public final t<K, V> K(t<K, V> tVar, t<K, V> tVar2, int i10, int i11, r0.e eVar) {
        if (tVar2 == null) {
            return J(i10, i11, eVar);
        }
        return (this.f45673c == eVar || tVar != tVar2) ? L(i10, tVar2, eVar) : this;
    }

    public final t<K, V> L(int i10, t<K, V> tVar, r0.e eVar) {
        Object[] objArr = this.f45674d;
        if (objArr.length == 1 && tVar.f45674d.length == 2 && tVar.f45672b == 0) {
            tVar.f45671a = this.f45672b;
            return tVar;
        } else if (this.f45673c == eVar) {
            objArr[i10] = tVar;
            return this;
        } else {
            Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
            jo.p.g(copyOf, "copyOf(this, size)");
            copyOf[i10] = tVar;
            return new t<>(this.f45671a, this.f45672b, copyOf, eVar);
        }
    }

    public final t<K, V> M(int i10, V v10, f<K, V> fVar) {
        if (this.f45673c == fVar.k()) {
            this.f45674d[i10 + 1] = v10;
            return this;
        }
        fVar.m(fVar.i() + 1);
        Object[] objArr = this.f45674d;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        jo.p.g(copyOf, "copyOf(this, size)");
        copyOf[i10 + 1] = v10;
        return new t<>(this.f45671a, this.f45672b, copyOf, fVar.k());
    }

    public final t<K, V> N(int i10) {
        Object obj = this.f45674d[i10];
        Objects.requireNonNull(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode>");
        return (t) obj;
    }

    public final int O(int i10) {
        return (this.f45674d.length - 1) - Integer.bitCount((i10 - 1) & this.f45672b);
    }

    public final b<K, V> P(int i10, K k10, V v10, int i11) {
        b<K, V> P;
        int f10 = 1 << x.f(i10, i11);
        if (q(f10)) {
            int n10 = n(f10);
            if (jo.p.c(k10, t(n10))) {
                if (W(n10) == v10) {
                    return null;
                }
                return V(n10, v10).c();
            }
            return v(n10, f10, i10, k10, v10, i11).b();
        } else if (r(f10)) {
            int O = O(f10);
            t<K, V> N = N(O);
            if (i11 == 30) {
                P = N.h(k10, v10);
                if (P == null) {
                    return null;
                }
            } else {
                P = N.P(i10, k10, v10, i11 + 5);
                if (P == null) {
                    return null;
                }
            }
            P.c(U(O, f10, P.a()));
            return P;
        } else {
            return s(f10, k10, v10).b();
        }
    }

    public final t<K, V> Q(int i10, K k10, int i11) {
        t<K, V> Q;
        int f10 = 1 << x.f(i10, i11);
        if (q(f10)) {
            int n10 = n(f10);
            return jo.p.c(k10, t(n10)) ? R(n10, f10) : this;
        } else if (r(f10)) {
            int O = O(f10);
            t<K, V> N = N(O);
            if (i11 == 30) {
                Q = N.i(k10);
            } else {
                Q = N.Q(i10, k10, i11 + 5);
            }
            return T(N, Q, O, f10);
        } else {
            return this;
        }
    }

    public final t<K, V> R(int i10, int i11) {
        Object[] objArr = this.f45674d;
        if (objArr.length == 2) {
            return null;
        }
        return new t<>(i11 ^ this.f45671a, this.f45672b, x.b(objArr, i10));
    }

    public final t<K, V> S(int i10, int i11) {
        Object[] objArr = this.f45674d;
        if (objArr.length == 1) {
            return null;
        }
        return new t<>(this.f45671a, i11 ^ this.f45672b, x.c(objArr, i10));
    }

    public final t<K, V> T(t<K, V> tVar, t<K, V> tVar2, int i10, int i11) {
        if (tVar2 == null) {
            return S(i10, i11);
        }
        return tVar != tVar2 ? U(i10, i11, tVar2) : this;
    }

    public final t<K, V> U(int i10, int i11, t<K, V> tVar) {
        Object[] objArr = tVar.f45674d;
        if (objArr.length == 2 && tVar.f45672b == 0) {
            if (this.f45674d.length == 1) {
                tVar.f45671a = this.f45672b;
                return tVar;
            }
            return new t<>(this.f45671a ^ i11, i11 ^ this.f45672b, x.e(this.f45674d, i10, n(i11), objArr[0], objArr[1]));
        }
        Object[] objArr2 = this.f45674d;
        Object[] copyOf = Arrays.copyOf(objArr2, objArr2.length);
        jo.p.g(copyOf, "copyOf(this, newSize)");
        copyOf[i10] = tVar;
        return new t<>(this.f45671a, this.f45672b, copyOf);
    }

    public final t<K, V> V(int i10, V v10) {
        Object[] objArr = this.f45674d;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        jo.p.g(copyOf, "copyOf(this, size)");
        copyOf[i10 + 1] = v10;
        return new t<>(this.f45671a, this.f45672b, copyOf);
    }

    public final V W(int i10) {
        return (V) this.f45674d[i10 + 1];
    }

    public final b<K, V> b() {
        return new b<>(this, 1);
    }

    public final b<K, V> c() {
        return new b<>(this, 0);
    }

    public final Object[] d(int i10, int i11, int i12, K k10, V v10, int i13, r0.e eVar) {
        K t10 = t(i10);
        return x.d(this.f45674d, i10, O(i11) + 1, u(t10 != null ? t10.hashCode() : 0, t10, W(i10), i12, k10, v10, i13 + 5, eVar));
    }

    public final int e() {
        if (this.f45672b == 0) {
            return this.f45674d.length / 2;
        }
        int bitCount = Integer.bitCount(this.f45671a);
        int length = this.f45674d.length;
        for (int i10 = bitCount * 2; i10 < length; i10++) {
            bitCount += N(i10).e();
        }
        return bitCount;
    }

    public final boolean f(K k10) {
        po.g s10 = po.n.s(po.n.t(0, this.f45674d.length), 2);
        int k11 = s10.k();
        int m10 = s10.m();
        int p10 = s10.p();
        if ((p10 > 0 && k11 <= m10) || (p10 < 0 && m10 <= k11)) {
            while (!jo.p.c(k10, this.f45674d[k11])) {
                if (k11 != m10) {
                    k11 += p10;
                }
            }
            return true;
        }
        return false;
    }

    public final V g(K k10) {
        po.g s10 = po.n.s(po.n.t(0, this.f45674d.length), 2);
        int k11 = s10.k();
        int m10 = s10.m();
        int p10 = s10.p();
        if ((p10 <= 0 || k11 > m10) && (p10 >= 0 || m10 > k11)) {
            return null;
        }
        while (!jo.p.c(k10, t(k11))) {
            if (k11 == m10) {
                return null;
            }
            k11 += p10;
        }
        return W(k11);
    }

    public final b<K, V> h(K k10, V v10) {
        po.g s10 = po.n.s(po.n.t(0, this.f45674d.length), 2);
        int k11 = s10.k();
        int m10 = s10.m();
        int p10 = s10.p();
        if ((p10 > 0 && k11 <= m10) || (p10 < 0 && m10 <= k11)) {
            while (!jo.p.c(k10, t(k11))) {
                if (k11 != m10) {
                    k11 += p10;
                }
            }
            if (v10 == W(k11)) {
                return null;
            }
            Object[] objArr = this.f45674d;
            Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
            jo.p.g(copyOf, "copyOf(this, size)");
            copyOf[k11 + 1] = v10;
            return new t(0, 0, copyOf).c();
        }
        return new t(0, 0, x.a(this.f45674d, 0, k10, v10)).b();
    }

    public final t<K, V> i(K k10) {
        po.g s10 = po.n.s(po.n.t(0, this.f45674d.length), 2);
        int k11 = s10.k();
        int m10 = s10.m();
        int p10 = s10.p();
        if ((p10 > 0 && k11 <= m10) || (p10 < 0 && m10 <= k11)) {
            while (!jo.p.c(k10, t(k11))) {
                if (k11 != m10) {
                    k11 += p10;
                }
            }
            return j(k11);
        }
        return this;
    }

    public final t<K, V> j(int i10) {
        Object[] objArr = this.f45674d;
        if (objArr.length == 2) {
            return null;
        }
        return new t<>(0, 0, x.b(objArr, i10));
    }

    public final boolean k(int i10, K k10, int i11) {
        int f10 = 1 << x.f(i10, i11);
        if (q(f10)) {
            return jo.p.c(k10, t(n(f10)));
        }
        if (r(f10)) {
            t<K, V> N = N(O(f10));
            if (i11 == 30) {
                return N.f(k10);
            }
            return N.k(i10, k10, i11 + 5);
        }
        return false;
    }

    public final boolean l(t<K, V> tVar) {
        if (this == tVar) {
            return true;
        }
        if (this.f45672b == tVar.f45672b && this.f45671a == tVar.f45671a) {
            int length = this.f45674d.length;
            for (int i10 = 0; i10 < length; i10++) {
                if (this.f45674d[i10] != tVar.f45674d[i10]) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public final int m() {
        return Integer.bitCount(this.f45671a);
    }

    public final int n(int i10) {
        return Integer.bitCount((i10 - 1) & this.f45671a) * 2;
    }

    public final V o(int i10, K k10, int i11) {
        int f10 = 1 << x.f(i10, i11);
        if (q(f10)) {
            int n10 = n(f10);
            if (jo.p.c(k10, t(n10))) {
                return W(n10);
            }
            return null;
        } else if (r(f10)) {
            t<K, V> N = N(O(f10));
            if (i11 == 30) {
                return N.g(k10);
            }
            return N.o(i10, k10, i11 + 5);
        } else {
            return null;
        }
    }

    public final Object[] p() {
        return this.f45674d;
    }

    public final boolean q(int i10) {
        return (i10 & this.f45671a) != 0;
    }

    public final boolean r(int i10) {
        return (i10 & this.f45672b) != 0;
    }

    public final t<K, V> s(int i10, K k10, V v10) {
        return new t<>(i10 | this.f45671a, this.f45672b, x.a(this.f45674d, n(i10), k10, v10));
    }

    public final K t(int i10) {
        return (K) this.f45674d[i10];
    }

    public final t<K, V> u(int i10, K k10, V v10, int i11, K k11, V v11, int i12, r0.e eVar) {
        if (i12 > 30) {
            return new t<>(0, 0, new Object[]{k10, v10, k11, v11}, eVar);
        }
        int f10 = x.f(i10, i12);
        int f11 = x.f(i11, i12);
        if (f10 != f11) {
            return new t<>((1 << f10) | (1 << f11), 0, f10 < f11 ? new Object[]{k10, v10, k11, v11} : new Object[]{k11, v11, k10, v10}, eVar);
        }
        return new t<>(0, 1 << f10, new Object[]{u(i10, k10, v10, i11, k11, v11, i12 + 5, eVar)}, eVar);
    }

    public final t<K, V> v(int i10, int i11, int i12, K k10, V v10, int i13) {
        return new t<>(this.f45671a ^ i11, i11 | this.f45672b, d(i10, i11, i12, k10, v10, i13, null));
    }

    public final t<K, V> w(K k10, V v10, f<K, V> fVar) {
        po.g s10 = po.n.s(po.n.t(0, this.f45674d.length), 2);
        int k11 = s10.k();
        int m10 = s10.m();
        int p10 = s10.p();
        if ((p10 > 0 && k11 <= m10) || (p10 < 0 && m10 <= k11)) {
            while (!jo.p.c(k10, t(k11))) {
                if (k11 != m10) {
                    k11 += p10;
                }
            }
            fVar.o(W(k11));
            if (this.f45673c == fVar.k()) {
                this.f45674d[k11 + 1] = v10;
                return this;
            }
            fVar.m(fVar.i() + 1);
            Object[] objArr = this.f45674d;
            Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
            jo.p.g(copyOf, "copyOf(this, size)");
            copyOf[k11 + 1] = v10;
            return new t<>(0, 0, copyOf, fVar.k());
        }
        fVar.p(fVar.size() + 1);
        return new t<>(0, 0, x.a(this.f45674d, 0, k10, v10), fVar.k());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final t<K, V> x(t<K, V> tVar, r0.b bVar, r0.e eVar) {
        r0.a.a(this.f45672b == 0);
        r0.a.a(this.f45671a == 0);
        r0.a.a(tVar.f45672b == 0);
        r0.a.a(tVar.f45671a == 0);
        Object[] objArr = this.f45674d;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length + tVar.f45674d.length);
        jo.p.g(copyOf, "copyOf(this, newSize)");
        int length = this.f45674d.length;
        po.g s10 = po.n.s(po.n.t(0, tVar.f45674d.length), 2);
        int k10 = s10.k();
        int m10 = s10.m();
        int p10 = s10.p();
        if ((p10 > 0 && k10 <= m10) || (p10 < 0 && m10 <= k10)) {
            while (true) {
                if (!f(tVar.f45674d[k10])) {
                    Object[] objArr2 = tVar.f45674d;
                    copyOf[length] = objArr2[k10];
                    copyOf[length + 1] = objArr2[k10 + 1];
                    length += 2;
                } else {
                    bVar.c(bVar.a() + 1);
                }
                if (k10 == m10) {
                    break;
                }
                k10 += p10;
            }
        }
        if (length == this.f45674d.length) {
            return this;
        }
        if (length == tVar.f45674d.length) {
            return tVar;
        }
        if (length == copyOf.length) {
            return new t<>(0, 0, copyOf, eVar);
        }
        Object[] copyOf2 = Arrays.copyOf(copyOf, length);
        jo.p.g(copyOf2, "copyOf(this, newSize)");
        return new t<>(0, 0, copyOf2, eVar);
    }

    public final t<K, V> y(K k10, V v10, f<K, V> fVar) {
        po.g s10 = po.n.s(po.n.t(0, this.f45674d.length), 2);
        int k11 = s10.k();
        int m10 = s10.m();
        int p10 = s10.p();
        if ((p10 > 0 && k11 <= m10) || (p10 < 0 && m10 <= k11)) {
            while (true) {
                if (!jo.p.c(k10, t(k11)) || !jo.p.c(v10, W(k11))) {
                    if (k11 == m10) {
                        break;
                    }
                    k11 += p10;
                } else {
                    return A(k11, fVar);
                }
            }
        }
        return this;
    }

    public final t<K, V> z(K k10, f<K, V> fVar) {
        po.g s10 = po.n.s(po.n.t(0, this.f45674d.length), 2);
        int k11 = s10.k();
        int m10 = s10.m();
        int p10 = s10.p();
        if ((p10 > 0 && k11 <= m10) || (p10 < 0 && m10 <= k11)) {
            while (!jo.p.c(k10, t(k11))) {
                if (k11 != m10) {
                    k11 += p10;
                }
            }
            return A(k11, fVar);
        }
        return this;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public t(int i10, int i11, Object[] objArr) {
        this(i10, i11, objArr, null);
        jo.p.h(objArr, "buffer");
    }
}
