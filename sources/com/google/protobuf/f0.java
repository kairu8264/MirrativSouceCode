package com.google.protobuf;

import com.google.protobuf.f;
import com.google.protobuf.p0;
import com.google.protobuf.q0;
import com.google.protobuf.t;
import com.google.protobuf.z;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import sun.misc.Unsafe;

/* loaded from: classes4.dex */
public final class f0<T> implements fn.v<T> {

    /* renamed from: r  reason: collision with root package name */
    public static final int[] f28103r = new int[0];

    /* renamed from: s  reason: collision with root package name */
    public static final Unsafe f28104s = fn.b0.B();

    /* renamed from: a  reason: collision with root package name */
    public final int[] f28105a;

    /* renamed from: b  reason: collision with root package name */
    public final Object[] f28106b;

    /* renamed from: c  reason: collision with root package name */
    public final int f28107c;

    /* renamed from: d  reason: collision with root package name */
    public final int f28108d;

    /* renamed from: e  reason: collision with root package name */
    public final d0 f28109e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f28110f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f28111g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f28112h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f28113i;

    /* renamed from: j  reason: collision with root package name */
    public final int[] f28114j;

    /* renamed from: k  reason: collision with root package name */
    public final int f28115k;

    /* renamed from: l  reason: collision with root package name */
    public final int f28116l;

    /* renamed from: m  reason: collision with root package name */
    public final fn.o f28117m;

    /* renamed from: n  reason: collision with root package name */
    public final x f28118n;

    /* renamed from: o  reason: collision with root package name */
    public final m0<?, ?> f28119o;

    /* renamed from: p  reason: collision with root package name */
    public final m<?> f28120p;

    /* renamed from: q  reason: collision with root package name */
    public final b0 f28121q;

    public f0(int[] iArr, Object[] objArr, int i10, int i11, d0 d0Var, boolean z10, boolean z11, int[] iArr2, int i12, int i13, fn.o oVar, x xVar, m0<?, ?> m0Var, m<?> mVar, b0 b0Var) {
        this.f28105a = iArr;
        this.f28106b = objArr;
        this.f28107c = i10;
        this.f28108d = i11;
        this.f28111g = d0Var instanceof r;
        this.f28112h = z10;
        this.f28110f = mVar != null && mVar.e(d0Var);
        this.f28113i = z11;
        this.f28114j = iArr2;
        this.f28115k = i12;
        this.f28116l = i13;
        this.f28117m = oVar;
        this.f28118n = xVar;
        this.f28119o = m0Var;
        this.f28120p = mVar;
        this.f28109e = d0Var;
        this.f28121q = b0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean A(Object obj, int i10, fn.v vVar) {
        return vVar.d(fn.b0.A(obj, R(i10)));
    }

    public static boolean F(int i10) {
        return (i10 & 268435456) != 0;
    }

    public static List<?> G(Object obj, long j10) {
        return (List) fn.b0.A(obj, j10);
    }

    public static <T> long H(T t10, long j10) {
        return fn.b0.y(t10, j10);
    }

    public static <T> f0<T> N(Class<T> cls, fn.l lVar, fn.o oVar, x xVar, m0<?, ?> m0Var, m<?> mVar, b0 b0Var) {
        if (lVar instanceof fn.u) {
            return P((fn.u) lVar, oVar, xVar, m0Var, mVar, b0Var);
        }
        return O((fn.x) lVar, oVar, xVar, m0Var, mVar, b0Var);
    }

    public static <T> f0<T> O(fn.x xVar, fn.o oVar, x xVar2, m0<?, ?> m0Var, m<?> mVar, b0 b0Var) {
        boolean z10 = xVar.c() == fn.s.PROTO3;
        o[] e10 = xVar.e();
        if (e10.length == 0) {
            int length = e10.length;
            int[] iArr = new int[length * 3];
            Object[] objArr = new Object[length * 2];
            if (e10.length <= 0) {
                int[] d10 = xVar.d();
                if (d10 == null) {
                    d10 = f28103r;
                }
                if (e10.length <= 0) {
                    int[] iArr2 = f28103r;
                    int[] iArr3 = f28103r;
                    int[] iArr4 = new int[d10.length + iArr2.length + iArr3.length];
                    System.arraycopy(d10, 0, iArr4, 0, d10.length);
                    System.arraycopy(iArr2, 0, iArr4, d10.length, iArr2.length);
                    System.arraycopy(iArr3, 0, iArr4, d10.length + iArr2.length, iArr3.length);
                    return new f0<>(iArr, objArr, 0, 0, xVar.b(), z10, true, iArr4, d10.length, d10.length + iArr2.length, oVar, xVar2, m0Var, mVar, b0Var);
                }
                o oVar2 = e10[0];
                throw null;
            }
            o oVar3 = e10[0];
            throw null;
        }
        o oVar4 = e10[0];
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:122:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x037a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static <T> com.google.protobuf.f0<T> P(fn.u r34, fn.o r35, com.google.protobuf.x r36, com.google.protobuf.m0<?, ?> r37, com.google.protobuf.m<?> r38, com.google.protobuf.b0 r39) {
        /*
            Method dump skipped, instructions count: 996
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.f0.P(fn.u, fn.o, com.google.protobuf.x, com.google.protobuf.m0, com.google.protobuf.m, com.google.protobuf.b0):com.google.protobuf.f0");
    }

    public static long R(int i10) {
        return i10 & 1048575;
    }

    public static <T> boolean S(T t10, long j10) {
        return ((Boolean) fn.b0.A(t10, j10)).booleanValue();
    }

    public static <T> double T(T t10, long j10) {
        return ((Double) fn.b0.A(t10, j10)).doubleValue();
    }

    public static <T> float U(T t10, long j10) {
        return ((Float) fn.b0.A(t10, j10)).floatValue();
    }

    public static <T> int V(T t10, long j10) {
        return ((Integer) fn.b0.A(t10, j10)).intValue();
    }

    public static <T> long W(T t10, long j10) {
        return ((Long) fn.b0.A(t10, j10)).longValue();
    }

    public static Field d0(Class<?> cls, String str) {
        Field[] declaredFields;
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            for (Field field : cls.getDeclaredFields()) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw new RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + Arrays.toString(declaredFields));
        }
    }

    public static int h0(int i10) {
        return (i10 & 267386880) >>> 20;
    }

    public static <T> boolean k(T t10, long j10) {
        return fn.b0.p(t10, j10);
    }

    public static <T> double l(T t10, long j10) {
        return fn.b0.v(t10, j10);
    }

    public static <T> float p(T t10, long j10) {
        return fn.b0.w(t10, j10);
    }

    public static <T> int w(T t10, long j10) {
        return fn.b0.x(t10, j10);
    }

    public static boolean x(int i10) {
        return (i10 & 536870912) != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <N> boolean B(Object obj, int i10, int i11) {
        List list = (List) fn.b0.A(obj, R(i10));
        if (list.isEmpty()) {
            return true;
        }
        fn.v s10 = s(i11);
        for (int i12 = 0; i12 < list.size(); i12++) {
            if (!s10.d(list.get(i12))) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v8, types: [fn.v] */
    public final boolean C(T t10, int i10, int i11) {
        Map<?, ?> e10 = this.f28121q.e(fn.b0.A(t10, R(i10)));
        if (e10.isEmpty()) {
            return true;
        }
        if (this.f28121q.b(r(i11)).f28242c.a() != p0.c.MESSAGE) {
            return true;
        }
        fn.v<T> vVar = 0;
        for (Object obj : e10.values()) {
            if (vVar == null) {
                vVar = fn.t.a().d(obj.getClass());
            }
            boolean d10 = vVar.d(obj);
            vVar = vVar;
            if (!d10) {
                return false;
            }
        }
        return true;
    }

    public final boolean D(T t10, T t11, int i10) {
        long Y = Y(i10) & 1048575;
        return fn.b0.x(t10, Y) == fn.b0.x(t11, Y);
    }

    public final boolean E(T t10, int i10, int i11) {
        return fn.b0.x(t10, (long) (Y(i11) & 1048575)) == i10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0077, code lost:
        r0 = r16.f28115k;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x007b, code lost:
        if (r0 >= r16.f28116l) goto L328;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x007d, code lost:
        r13 = n(r19, r16.f28114j[r0], r13, r17);
        r0 = r0 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:363:?, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0088, code lost:
        if (r13 == null) goto L332;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x008a, code lost:
        r17.o(r19, r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x008d, code lost:
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final <UT, UB, ET extends com.google.protobuf.p.b<ET>> void I(com.google.protobuf.m0<UT, UB> r17, com.google.protobuf.m<ET> r18, T r19, com.google.protobuf.j0 r20, com.google.protobuf.l r21) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1720
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.f0.I(com.google.protobuf.m0, com.google.protobuf.m, java.lang.Object, com.google.protobuf.j0, com.google.protobuf.l):void");
    }

    public final <K, V> void J(Object obj, int i10, Object obj2, l lVar, j0 j0Var) throws IOException {
        long R = R(i0(i10));
        Object A = fn.b0.A(obj, R);
        if (A == null) {
            A = this.f28121q.d(obj2);
            fn.b0.O(obj, R, A);
        } else if (this.f28121q.h(A)) {
            Object d10 = this.f28121q.d(obj2);
            this.f28121q.a(d10, A);
            fn.b0.O(obj, R, d10);
            A = d10;
        }
        j0Var.o(this.f28121q.c(A), this.f28121q.b(obj2), lVar);
    }

    public final void K(T t10, T t11, int i10) {
        long R = R(i0(i10));
        if (y(t11, i10)) {
            Object A = fn.b0.A(t10, R);
            Object A2 = fn.b0.A(t11, R);
            if (A != null && A2 != null) {
                fn.b0.O(t10, R, t.h(A, A2));
                e0(t10, i10);
            } else if (A2 != null) {
                fn.b0.O(t10, R, A2);
                e0(t10, i10);
            }
        }
    }

    public final void L(T t10, T t11, int i10) {
        int i02 = i0(i10);
        int Q = Q(i10);
        long R = R(i02);
        if (E(t11, Q, i10)) {
            Object A = E(t10, Q, i10) ? fn.b0.A(t10, R) : null;
            Object A2 = fn.b0.A(t11, R);
            if (A != null && A2 != null) {
                fn.b0.O(t10, R, t.h(A, A2));
                f0(t10, Q, i10);
            } else if (A2 != null) {
                fn.b0.O(t10, R, A2);
                f0(t10, Q, i10);
            }
        }
    }

    public final void M(T t10, T t11, int i10) {
        int i02 = i0(i10);
        long R = R(i02);
        int Q = Q(i10);
        switch (h0(i02)) {
            case 0:
                if (y(t11, i10)) {
                    fn.b0.K(t10, R, fn.b0.v(t11, R));
                    e0(t10, i10);
                    return;
                }
                return;
            case 1:
                if (y(t11, i10)) {
                    fn.b0.L(t10, R, fn.b0.w(t11, R));
                    e0(t10, i10);
                    return;
                }
                return;
            case 2:
                if (y(t11, i10)) {
                    fn.b0.N(t10, R, fn.b0.y(t11, R));
                    e0(t10, i10);
                    return;
                }
                return;
            case 3:
                if (y(t11, i10)) {
                    fn.b0.N(t10, R, fn.b0.y(t11, R));
                    e0(t10, i10);
                    return;
                }
                return;
            case 4:
                if (y(t11, i10)) {
                    fn.b0.M(t10, R, fn.b0.x(t11, R));
                    e0(t10, i10);
                    return;
                }
                return;
            case 5:
                if (y(t11, i10)) {
                    fn.b0.N(t10, R, fn.b0.y(t11, R));
                    e0(t10, i10);
                    return;
                }
                return;
            case 6:
                if (y(t11, i10)) {
                    fn.b0.M(t10, R, fn.b0.x(t11, R));
                    e0(t10, i10);
                    return;
                }
                return;
            case 7:
                if (y(t11, i10)) {
                    fn.b0.E(t10, R, fn.b0.p(t11, R));
                    e0(t10, i10);
                    return;
                }
                return;
            case 8:
                if (y(t11, i10)) {
                    fn.b0.O(t10, R, fn.b0.A(t11, R));
                    e0(t10, i10);
                    return;
                }
                return;
            case 9:
                K(t10, t11, i10);
                return;
            case 10:
                if (y(t11, i10)) {
                    fn.b0.O(t10, R, fn.b0.A(t11, R));
                    e0(t10, i10);
                    return;
                }
                return;
            case 11:
                if (y(t11, i10)) {
                    fn.b0.M(t10, R, fn.b0.x(t11, R));
                    e0(t10, i10);
                    return;
                }
                return;
            case 12:
                if (y(t11, i10)) {
                    fn.b0.M(t10, R, fn.b0.x(t11, R));
                    e0(t10, i10);
                    return;
                }
                return;
            case 13:
                if (y(t11, i10)) {
                    fn.b0.M(t10, R, fn.b0.x(t11, R));
                    e0(t10, i10);
                    return;
                }
                return;
            case 14:
                if (y(t11, i10)) {
                    fn.b0.N(t10, R, fn.b0.y(t11, R));
                    e0(t10, i10);
                    return;
                }
                return;
            case 15:
                if (y(t11, i10)) {
                    fn.b0.M(t10, R, fn.b0.x(t11, R));
                    e0(t10, i10);
                    return;
                }
                return;
            case 16:
                if (y(t11, i10)) {
                    fn.b0.N(t10, R, fn.b0.y(t11, R));
                    e0(t10, i10);
                    return;
                }
                return;
            case 17:
                K(t10, t11, i10);
                return;
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
                this.f28118n.d(t10, t11, R);
                return;
            case 50:
                k0.F(this.f28121q, t10, t11, R);
                return;
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
                if (E(t11, Q, i10)) {
                    fn.b0.O(t10, R, fn.b0.A(t11, R));
                    f0(t10, Q, i10);
                    return;
                }
                return;
            case 60:
                L(t10, t11, i10);
                return;
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
                if (E(t11, Q, i10)) {
                    fn.b0.O(t10, R, fn.b0.A(t11, R));
                    f0(t10, Q, i10);
                    return;
                }
                return;
            case 68:
                L(t10, t11, i10);
                return;
            default:
                return;
        }
    }

    public final int Q(int i10) {
        return this.f28105a[i10];
    }

    public final int X(int i10) {
        if (i10 < this.f28107c || i10 > this.f28108d) {
            return -1;
        }
        return g0(i10, 0);
    }

    public final int Y(int i10) {
        return this.f28105a[i10 + 2];
    }

    public final <E> void Z(Object obj, long j10, j0 j0Var, fn.v<E> vVar, l lVar) throws IOException {
        j0Var.l(this.f28118n.e(obj, j10), vVar, lVar);
    }

    @Override // fn.v
    public void a(T t10, T t11) {
        Objects.requireNonNull(t11);
        for (int i10 = 0; i10 < this.f28105a.length; i10 += 3) {
            M(t10, t11, i10);
        }
        k0.G(this.f28119o, t10, t11);
        if (this.f28110f) {
            k0.E(this.f28120p, t10, t11);
        }
    }

    public final <E> void a0(Object obj, int i10, j0 j0Var, fn.v<E> vVar, l lVar) throws IOException {
        j0Var.C(this.f28118n.e(obj, R(i10)), vVar, lVar);
    }

    @Override // fn.v
    public void b(T t10, q0 q0Var) throws IOException {
        if (q0Var.w() == q0.a.DESCENDING) {
            l0(t10, q0Var);
        } else if (this.f28112h) {
            k0(t10, q0Var);
        } else {
            j0(t10, q0Var);
        }
    }

    public final void b0(Object obj, int i10, j0 j0Var) throws IOException {
        if (x(i10)) {
            fn.b0.O(obj, R(i10), j0Var.O());
        } else if (this.f28111g) {
            fn.b0.O(obj, R(i10), j0Var.F());
        } else {
            fn.b0.O(obj, R(i10), j0Var.q());
        }
    }

    @Override // fn.v
    public void c(T t10) {
        int i10;
        int i11 = this.f28115k;
        while (true) {
            i10 = this.f28116l;
            if (i11 >= i10) {
                break;
            }
            long R = R(i0(this.f28114j[i11]));
            Object A = fn.b0.A(t10, R);
            if (A != null) {
                fn.b0.O(t10, R, this.f28121q.f(A));
            }
            i11++;
        }
        int length = this.f28114j.length;
        while (i10 < length) {
            this.f28118n.c(t10, this.f28114j[i10]);
            i10++;
        }
        this.f28119o.j(t10);
        if (this.f28110f) {
            this.f28120p.f(t10);
        }
    }

    public final void c0(Object obj, int i10, j0 j0Var) throws IOException {
        if (x(i10)) {
            j0Var.p(this.f28118n.e(obj, R(i10)));
        } else {
            j0Var.H(this.f28118n.e(obj, R(i10)));
        }
    }

    @Override // fn.v
    public final boolean d(T t10) {
        int i10;
        int i11;
        int i12 = 1048575;
        int i13 = 0;
        int i14 = 0;
        while (i14 < this.f28115k) {
            int i15 = this.f28114j[i14];
            int Q = Q(i15);
            int i02 = i0(i15);
            int i16 = this.f28105a[i15 + 2];
            int i17 = i16 & 1048575;
            int i18 = 1 << (i16 >>> 20);
            if (i17 != i12) {
                if (i17 != 1048575) {
                    i13 = f28104s.getInt(t10, i17);
                }
                i11 = i13;
                i10 = i17;
            } else {
                i10 = i12;
                i11 = i13;
            }
            if (F(i02) && !z(t10, i15, i10, i11, i18)) {
                return false;
            }
            int h02 = h0(i02);
            if (h02 != 9 && h02 != 17) {
                if (h02 != 27) {
                    if (h02 == 60 || h02 == 68) {
                        if (E(t10, Q, i15) && !A(t10, i02, s(i15))) {
                            return false;
                        }
                    } else if (h02 != 49) {
                        if (h02 == 50 && !C(t10, i02, i15)) {
                            return false;
                        }
                    }
                }
                if (!B(t10, i02, i15)) {
                    return false;
                }
            } else if (z(t10, i15, i10, i11, i18) && !A(t10, i02, s(i15))) {
                return false;
            }
            i14++;
            i12 = i10;
            i13 = i11;
        }
        return !this.f28110f || this.f28120p.c(t10).p();
    }

    @Override // fn.v
    public int e(T t10) {
        return this.f28112h ? u(t10) : t(t10);
    }

    public final void e0(T t10, int i10) {
        int Y = Y(i10);
        long j10 = 1048575 & Y;
        if (j10 == 1048575) {
            return;
        }
        fn.b0.M(t10, j10, (1 << (Y >>> 20)) | fn.b0.x(t10, j10));
    }

    @Override // fn.v
    public T f() {
        return (T) this.f28117m.a(this.f28109e);
    }

    public final void f0(T t10, int i10, int i11) {
        fn.b0.M(t10, Y(i11) & 1048575, i10);
    }

    @Override // fn.v
    public int g(T t10) {
        int i10;
        int f10;
        int length = this.f28105a.length;
        int i11 = 0;
        for (int i12 = 0; i12 < length; i12 += 3) {
            int i02 = i0(i12);
            int Q = Q(i12);
            long R = R(i02);
            int i13 = 37;
            switch (h0(i02)) {
                case 0:
                    i10 = i11 * 53;
                    f10 = t.f(Double.doubleToLongBits(fn.b0.v(t10, R)));
                    i11 = i10 + f10;
                    break;
                case 1:
                    i10 = i11 * 53;
                    f10 = Float.floatToIntBits(fn.b0.w(t10, R));
                    i11 = i10 + f10;
                    break;
                case 2:
                    i10 = i11 * 53;
                    f10 = t.f(fn.b0.y(t10, R));
                    i11 = i10 + f10;
                    break;
                case 3:
                    i10 = i11 * 53;
                    f10 = t.f(fn.b0.y(t10, R));
                    i11 = i10 + f10;
                    break;
                case 4:
                    i10 = i11 * 53;
                    f10 = fn.b0.x(t10, R);
                    i11 = i10 + f10;
                    break;
                case 5:
                    i10 = i11 * 53;
                    f10 = t.f(fn.b0.y(t10, R));
                    i11 = i10 + f10;
                    break;
                case 6:
                    i10 = i11 * 53;
                    f10 = fn.b0.x(t10, R);
                    i11 = i10 + f10;
                    break;
                case 7:
                    i10 = i11 * 53;
                    f10 = t.c(fn.b0.p(t10, R));
                    i11 = i10 + f10;
                    break;
                case 8:
                    i10 = i11 * 53;
                    f10 = ((String) fn.b0.A(t10, R)).hashCode();
                    i11 = i10 + f10;
                    break;
                case 9:
                    Object A = fn.b0.A(t10, R);
                    if (A != null) {
                        i13 = A.hashCode();
                    }
                    i11 = (i11 * 53) + i13;
                    break;
                case 10:
                    i10 = i11 * 53;
                    f10 = fn.b0.A(t10, R).hashCode();
                    i11 = i10 + f10;
                    break;
                case 11:
                    i10 = i11 * 53;
                    f10 = fn.b0.x(t10, R);
                    i11 = i10 + f10;
                    break;
                case 12:
                    i10 = i11 * 53;
                    f10 = fn.b0.x(t10, R);
                    i11 = i10 + f10;
                    break;
                case 13:
                    i10 = i11 * 53;
                    f10 = fn.b0.x(t10, R);
                    i11 = i10 + f10;
                    break;
                case 14:
                    i10 = i11 * 53;
                    f10 = t.f(fn.b0.y(t10, R));
                    i11 = i10 + f10;
                    break;
                case 15:
                    i10 = i11 * 53;
                    f10 = fn.b0.x(t10, R);
                    i11 = i10 + f10;
                    break;
                case 16:
                    i10 = i11 * 53;
                    f10 = t.f(fn.b0.y(t10, R));
                    i11 = i10 + f10;
                    break;
                case 17:
                    Object A2 = fn.b0.A(t10, R);
                    if (A2 != null) {
                        i13 = A2.hashCode();
                    }
                    i11 = (i11 * 53) + i13;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    i10 = i11 * 53;
                    f10 = fn.b0.A(t10, R).hashCode();
                    i11 = i10 + f10;
                    break;
                case 50:
                    i10 = i11 * 53;
                    f10 = fn.b0.A(t10, R).hashCode();
                    i11 = i10 + f10;
                    break;
                case 51:
                    if (E(t10, Q, i12)) {
                        i10 = i11 * 53;
                        f10 = t.f(Double.doubleToLongBits(T(t10, R)));
                        i11 = i10 + f10;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (E(t10, Q, i12)) {
                        i10 = i11 * 53;
                        f10 = Float.floatToIntBits(U(t10, R));
                        i11 = i10 + f10;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (E(t10, Q, i12)) {
                        i10 = i11 * 53;
                        f10 = t.f(W(t10, R));
                        i11 = i10 + f10;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (E(t10, Q, i12)) {
                        i10 = i11 * 53;
                        f10 = t.f(W(t10, R));
                        i11 = i10 + f10;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (E(t10, Q, i12)) {
                        i10 = i11 * 53;
                        f10 = V(t10, R);
                        i11 = i10 + f10;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (E(t10, Q, i12)) {
                        i10 = i11 * 53;
                        f10 = t.f(W(t10, R));
                        i11 = i10 + f10;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (E(t10, Q, i12)) {
                        i10 = i11 * 53;
                        f10 = V(t10, R);
                        i11 = i10 + f10;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (E(t10, Q, i12)) {
                        i10 = i11 * 53;
                        f10 = t.c(S(t10, R));
                        i11 = i10 + f10;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (E(t10, Q, i12)) {
                        i10 = i11 * 53;
                        f10 = ((String) fn.b0.A(t10, R)).hashCode();
                        i11 = i10 + f10;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (E(t10, Q, i12)) {
                        i10 = i11 * 53;
                        f10 = fn.b0.A(t10, R).hashCode();
                        i11 = i10 + f10;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (E(t10, Q, i12)) {
                        i10 = i11 * 53;
                        f10 = fn.b0.A(t10, R).hashCode();
                        i11 = i10 + f10;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (E(t10, Q, i12)) {
                        i10 = i11 * 53;
                        f10 = V(t10, R);
                        i11 = i10 + f10;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (E(t10, Q, i12)) {
                        i10 = i11 * 53;
                        f10 = V(t10, R);
                        i11 = i10 + f10;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (E(t10, Q, i12)) {
                        i10 = i11 * 53;
                        f10 = V(t10, R);
                        i11 = i10 + f10;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (E(t10, Q, i12)) {
                        i10 = i11 * 53;
                        f10 = t.f(W(t10, R));
                        i11 = i10 + f10;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (E(t10, Q, i12)) {
                        i10 = i11 * 53;
                        f10 = V(t10, R);
                        i11 = i10 + f10;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (E(t10, Q, i12)) {
                        i10 = i11 * 53;
                        f10 = t.f(W(t10, R));
                        i11 = i10 + f10;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (E(t10, Q, i12)) {
                        i10 = i11 * 53;
                        f10 = fn.b0.A(t10, R).hashCode();
                        i11 = i10 + f10;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int hashCode = (i11 * 53) + this.f28119o.g(t10).hashCode();
        return this.f28110f ? (hashCode * 53) + this.f28120p.c(t10).hashCode() : hashCode;
    }

    public final int g0(int i10, int i11) {
        int length = (this.f28105a.length / 3) - 1;
        while (i11 <= length) {
            int i12 = (length + i11) >>> 1;
            int i13 = i12 * 3;
            int Q = Q(i13);
            if (i10 == Q) {
                return i13;
            }
            if (i10 < Q) {
                length = i12 - 1;
            } else {
                i11 = i12 + 1;
            }
        }
        return -1;
    }

    @Override // fn.v
    public void h(T t10, j0 j0Var, l lVar) throws IOException {
        Objects.requireNonNull(lVar);
        I(this.f28119o, this.f28120p, t10, j0Var, lVar);
    }

    @Override // fn.v
    public boolean i(T t10, T t11) {
        int length = this.f28105a.length;
        for (int i10 = 0; i10 < length; i10 += 3) {
            if (!m(t10, t11, i10)) {
                return false;
            }
        }
        if (this.f28119o.g(t10).equals(this.f28119o.g(t11))) {
            if (this.f28110f) {
                return this.f28120p.c(t10).equals(this.f28120p.c(t11));
            }
            return true;
        }
        return false;
    }

    public final int i0(int i10) {
        return this.f28105a[i10 + 1];
    }

    public final boolean j(T t10, T t11, int i10) {
        return y(t10, i10) == y(t11, i10);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x048f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void j0(T r18, com.google.protobuf.q0 r19) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1336
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.f0.j0(java.lang.Object, com.google.protobuf.q0):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0588  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void k0(T r13, com.google.protobuf.q0 r14) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1584
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.f0.k0(java.lang.Object, com.google.protobuf.q0):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x058e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void l0(T r11, com.google.protobuf.q0 r12) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1586
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.f0.l0(java.lang.Object, com.google.protobuf.q0):void");
    }

    public final boolean m(T t10, T t11, int i10) {
        int i02 = i0(i10);
        long R = R(i02);
        switch (h0(i02)) {
            case 0:
                return j(t10, t11, i10) && Double.doubleToLongBits(fn.b0.v(t10, R)) == Double.doubleToLongBits(fn.b0.v(t11, R));
            case 1:
                return j(t10, t11, i10) && Float.floatToIntBits(fn.b0.w(t10, R)) == Float.floatToIntBits(fn.b0.w(t11, R));
            case 2:
                return j(t10, t11, i10) && fn.b0.y(t10, R) == fn.b0.y(t11, R);
            case 3:
                return j(t10, t11, i10) && fn.b0.y(t10, R) == fn.b0.y(t11, R);
            case 4:
                return j(t10, t11, i10) && fn.b0.x(t10, R) == fn.b0.x(t11, R);
            case 5:
                return j(t10, t11, i10) && fn.b0.y(t10, R) == fn.b0.y(t11, R);
            case 6:
                return j(t10, t11, i10) && fn.b0.x(t10, R) == fn.b0.x(t11, R);
            case 7:
                return j(t10, t11, i10) && fn.b0.p(t10, R) == fn.b0.p(t11, R);
            case 8:
                return j(t10, t11, i10) && k0.K(fn.b0.A(t10, R), fn.b0.A(t11, R));
            case 9:
                return j(t10, t11, i10) && k0.K(fn.b0.A(t10, R), fn.b0.A(t11, R));
            case 10:
                return j(t10, t11, i10) && k0.K(fn.b0.A(t10, R), fn.b0.A(t11, R));
            case 11:
                return j(t10, t11, i10) && fn.b0.x(t10, R) == fn.b0.x(t11, R);
            case 12:
                return j(t10, t11, i10) && fn.b0.x(t10, R) == fn.b0.x(t11, R);
            case 13:
                return j(t10, t11, i10) && fn.b0.x(t10, R) == fn.b0.x(t11, R);
            case 14:
                return j(t10, t11, i10) && fn.b0.y(t10, R) == fn.b0.y(t11, R);
            case 15:
                return j(t10, t11, i10) && fn.b0.x(t10, R) == fn.b0.x(t11, R);
            case 16:
                return j(t10, t11, i10) && fn.b0.y(t10, R) == fn.b0.y(t11, R);
            case 17:
                return j(t10, t11, i10) && k0.K(fn.b0.A(t10, R), fn.b0.A(t11, R));
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
                return k0.K(fn.b0.A(t10, R), fn.b0.A(t11, R));
            case 50:
                return k0.K(fn.b0.A(t10, R), fn.b0.A(t11, R));
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 68:
                return D(t10, t11, i10) && k0.K(fn.b0.A(t10, R), fn.b0.A(t11, R));
            default:
                return true;
        }
    }

    public final <K, V> void m0(q0 q0Var, int i10, Object obj, int i11) throws IOException {
        if (obj != null) {
            q0Var.G(i10, this.f28121q.b(r(i11)), this.f28121q.e(obj));
        }
    }

    public final <UT, UB> UB n(Object obj, int i10, UB ub2, m0<UT, UB> m0Var) {
        t.e q10;
        int Q = Q(i10);
        Object A = fn.b0.A(obj, R(i0(i10)));
        return (A == null || (q10 = q(i10)) == null) ? ub2 : (UB) o(i10, Q, this.f28121q.c(A), q10, ub2, m0Var);
    }

    public final void n0(int i10, Object obj, q0 q0Var) throws IOException {
        if (obj instanceof String) {
            q0Var.f(i10, (String) obj);
        } else {
            q0Var.i(i10, (f) obj);
        }
    }

    public final <K, V, UT, UB> UB o(int i10, int i11, Map<K, V> map, t.e eVar, UB ub2, m0<UT, UB> m0Var) {
        z.a<?, ?> b10 = this.f28121q.b(r(i10));
        Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<K, V> next = it.next();
            if (!eVar.a(((Integer) next.getValue()).intValue())) {
                if (ub2 == null) {
                    ub2 = m0Var.n();
                }
                f.h t10 = f.t(z.b(b10, next.getKey(), next.getValue()));
                try {
                    z.e(t10.b(), b10, next.getKey(), next.getValue());
                    m0Var.d(ub2, i11, t10.a());
                    it.remove();
                } catch (IOException e10) {
                    throw new RuntimeException(e10);
                }
            }
        }
        return ub2;
    }

    public final <UT, UB> void o0(m0<UT, UB> m0Var, T t10, q0 q0Var) throws IOException {
        m0Var.t(m0Var.g(t10), q0Var);
    }

    public final t.e q(int i10) {
        return (t.e) this.f28106b[((i10 / 3) * 2) + 1];
    }

    public final Object r(int i10) {
        return this.f28106b[(i10 / 3) * 2];
    }

    public final fn.v s(int i10) {
        int i11 = (i10 / 3) * 2;
        fn.v vVar = (fn.v) this.f28106b[i11];
        if (vVar != null) {
            return vVar;
        }
        fn.v<T> d10 = fn.t.a().d((Class) this.f28106b[i11 + 1]);
        this.f28106b[i11] = d10;
        return d10;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final int t(T t10) {
        int i10;
        int i11;
        int i12;
        int d10;
        int K;
        boolean z10;
        int f10;
        int i13;
        int U;
        int W;
        Unsafe unsafe = f28104s;
        int i14 = 1048575;
        int i15 = 1048575;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        while (i16 < this.f28105a.length) {
            int i02 = i0(i16);
            int Q = Q(i16);
            int h02 = h0(i02);
            if (h02 <= 17) {
                i10 = this.f28105a[i16 + 2];
                int i19 = i10 & i14;
                i11 = 1 << (i10 >>> 20);
                if (i19 != i15) {
                    i18 = unsafe.getInt(t10, i19);
                    i15 = i19;
                }
            } else {
                i10 = (!this.f28113i || h02 < fn.e.DOUBLE_LIST_PACKED.a() || h02 > fn.e.SINT64_LIST_PACKED.a()) ? 0 : this.f28105a[i16 + 2] & i14;
                i11 = 0;
            }
            long R = R(i02);
            switch (h02) {
                case 0:
                    if ((i18 & i11) == 0) {
                        break;
                    } else {
                        i12 = CodedOutputStream.i(Q, 0.0d);
                        i17 += i12;
                        break;
                    }
                case 1:
                    if ((i18 & i11) == 0) {
                        break;
                    } else {
                        i12 = CodedOutputStream.q(Q, 0.0f);
                        i17 += i12;
                        break;
                    }
                case 2:
                    if ((i18 & i11) == 0) {
                        break;
                    } else {
                        i12 = CodedOutputStream.x(Q, unsafe.getLong(t10, R));
                        i17 += i12;
                        break;
                    }
                case 3:
                    if ((i18 & i11) == 0) {
                        break;
                    } else {
                        i12 = CodedOutputStream.X(Q, unsafe.getLong(t10, R));
                        i17 += i12;
                        break;
                    }
                case 4:
                    if ((i18 & i11) == 0) {
                        break;
                    } else {
                        i12 = CodedOutputStream.v(Q, unsafe.getInt(t10, R));
                        i17 += i12;
                        break;
                    }
                case 5:
                    if ((i18 & i11) == 0) {
                        break;
                    } else {
                        i12 = CodedOutputStream.o(Q, 0L);
                        i17 += i12;
                        break;
                    }
                case 6:
                    if ((i18 & i11) != 0) {
                        i12 = CodedOutputStream.m(Q, 0);
                        i17 += i12;
                        break;
                    }
                    break;
                case 7:
                    if ((i18 & i11) != 0) {
                        d10 = CodedOutputStream.d(Q, true);
                        i17 += d10;
                    }
                    break;
                case 8:
                    if ((i18 & i11) != 0) {
                        Object object = unsafe.getObject(t10, R);
                        if (object instanceof f) {
                            d10 = CodedOutputStream.g(Q, (f) object);
                        } else {
                            d10 = CodedOutputStream.S(Q, (String) object);
                        }
                        i17 += d10;
                    }
                    break;
                case 9:
                    if ((i18 & i11) != 0) {
                        d10 = k0.o(Q, unsafe.getObject(t10, R), s(i16));
                        i17 += d10;
                    }
                    break;
                case 10:
                    if ((i18 & i11) != 0) {
                        d10 = CodedOutputStream.g(Q, (f) unsafe.getObject(t10, R));
                        i17 += d10;
                    }
                    break;
                case 11:
                    if ((i18 & i11) != 0) {
                        d10 = CodedOutputStream.V(Q, unsafe.getInt(t10, R));
                        i17 += d10;
                    }
                    break;
                case 12:
                    if ((i18 & i11) != 0) {
                        d10 = CodedOutputStream.k(Q, unsafe.getInt(t10, R));
                        i17 += d10;
                    }
                    break;
                case 13:
                    if ((i18 & i11) != 0) {
                        K = CodedOutputStream.K(Q, 0);
                        i17 += K;
                    }
                    break;
                case 14:
                    if ((i18 & i11) != 0) {
                        d10 = CodedOutputStream.M(Q, 0L);
                        i17 += d10;
                    }
                    break;
                case 15:
                    if ((i18 & i11) != 0) {
                        d10 = CodedOutputStream.O(Q, unsafe.getInt(t10, R));
                        i17 += d10;
                    }
                    break;
                case 16:
                    if ((i18 & i11) != 0) {
                        d10 = CodedOutputStream.Q(Q, unsafe.getLong(t10, R));
                        i17 += d10;
                    }
                    break;
                case 17:
                    if ((i18 & i11) != 0) {
                        d10 = CodedOutputStream.s(Q, (d0) unsafe.getObject(t10, R), s(i16));
                        i17 += d10;
                    }
                    break;
                case 18:
                    d10 = k0.h(Q, (List) unsafe.getObject(t10, R), false);
                    i17 += d10;
                    break;
                case 19:
                    z10 = false;
                    f10 = k0.f(Q, (List) unsafe.getObject(t10, R), false);
                    i17 += f10;
                    break;
                case 20:
                    z10 = false;
                    f10 = k0.m(Q, (List) unsafe.getObject(t10, R), false);
                    i17 += f10;
                    break;
                case 21:
                    z10 = false;
                    f10 = k0.x(Q, (List) unsafe.getObject(t10, R), false);
                    i17 += f10;
                    break;
                case 22:
                    z10 = false;
                    f10 = k0.k(Q, (List) unsafe.getObject(t10, R), false);
                    i17 += f10;
                    break;
                case 23:
                    z10 = false;
                    f10 = k0.h(Q, (List) unsafe.getObject(t10, R), false);
                    i17 += f10;
                    break;
                case 24:
                    z10 = false;
                    f10 = k0.f(Q, (List) unsafe.getObject(t10, R), false);
                    i17 += f10;
                    break;
                case 25:
                    z10 = false;
                    f10 = k0.a(Q, (List) unsafe.getObject(t10, R), false);
                    i17 += f10;
                    break;
                case 26:
                    d10 = k0.u(Q, (List) unsafe.getObject(t10, R));
                    i17 += d10;
                    break;
                case 27:
                    d10 = k0.p(Q, (List) unsafe.getObject(t10, R), s(i16));
                    i17 += d10;
                    break;
                case 28:
                    d10 = k0.c(Q, (List) unsafe.getObject(t10, R));
                    i17 += d10;
                    break;
                case 29:
                    d10 = k0.v(Q, (List) unsafe.getObject(t10, R), false);
                    i17 += d10;
                    break;
                case 30:
                    z10 = false;
                    f10 = k0.d(Q, (List) unsafe.getObject(t10, R), false);
                    i17 += f10;
                    break;
                case 31:
                    z10 = false;
                    f10 = k0.f(Q, (List) unsafe.getObject(t10, R), false);
                    i17 += f10;
                    break;
                case 32:
                    z10 = false;
                    f10 = k0.h(Q, (List) unsafe.getObject(t10, R), false);
                    i17 += f10;
                    break;
                case 33:
                    z10 = false;
                    f10 = k0.q(Q, (List) unsafe.getObject(t10, R), false);
                    i17 += f10;
                    break;
                case 34:
                    z10 = false;
                    f10 = k0.s(Q, (List) unsafe.getObject(t10, R), false);
                    i17 += f10;
                    break;
                case 35:
                    i13 = k0.i((List) unsafe.getObject(t10, R));
                    if (i13 > 0) {
                        if (this.f28113i) {
                            unsafe.putInt(t10, i10, i13);
                        }
                        U = CodedOutputStream.U(Q);
                        W = CodedOutputStream.W(i13);
                        K = U + W + i13;
                        i17 += K;
                    }
                    break;
                case 36:
                    i13 = k0.g((List) unsafe.getObject(t10, R));
                    if (i13 > 0) {
                        if (this.f28113i) {
                            unsafe.putInt(t10, i10, i13);
                        }
                        U = CodedOutputStream.U(Q);
                        W = CodedOutputStream.W(i13);
                        K = U + W + i13;
                        i17 += K;
                    }
                    break;
                case 37:
                    i13 = k0.n((List) unsafe.getObject(t10, R));
                    if (i13 > 0) {
                        if (this.f28113i) {
                            unsafe.putInt(t10, i10, i13);
                        }
                        U = CodedOutputStream.U(Q);
                        W = CodedOutputStream.W(i13);
                        K = U + W + i13;
                        i17 += K;
                    }
                    break;
                case 38:
                    i13 = k0.y((List) unsafe.getObject(t10, R));
                    if (i13 > 0) {
                        if (this.f28113i) {
                            unsafe.putInt(t10, i10, i13);
                        }
                        U = CodedOutputStream.U(Q);
                        W = CodedOutputStream.W(i13);
                        K = U + W + i13;
                        i17 += K;
                    }
                    break;
                case 39:
                    i13 = k0.l((List) unsafe.getObject(t10, R));
                    if (i13 > 0) {
                        if (this.f28113i) {
                            unsafe.putInt(t10, i10, i13);
                        }
                        U = CodedOutputStream.U(Q);
                        W = CodedOutputStream.W(i13);
                        K = U + W + i13;
                        i17 += K;
                    }
                    break;
                case 40:
                    i13 = k0.i((List) unsafe.getObject(t10, R));
                    if (i13 > 0) {
                        if (this.f28113i) {
                            unsafe.putInt(t10, i10, i13);
                        }
                        U = CodedOutputStream.U(Q);
                        W = CodedOutputStream.W(i13);
                        K = U + W + i13;
                        i17 += K;
                    }
                    break;
                case 41:
                    i13 = k0.g((List) unsafe.getObject(t10, R));
                    if (i13 > 0) {
                        if (this.f28113i) {
                            unsafe.putInt(t10, i10, i13);
                        }
                        U = CodedOutputStream.U(Q);
                        W = CodedOutputStream.W(i13);
                        K = U + W + i13;
                        i17 += K;
                    }
                    break;
                case 42:
                    i13 = k0.b((List) unsafe.getObject(t10, R));
                    if (i13 > 0) {
                        if (this.f28113i) {
                            unsafe.putInt(t10, i10, i13);
                        }
                        U = CodedOutputStream.U(Q);
                        W = CodedOutputStream.W(i13);
                        K = U + W + i13;
                        i17 += K;
                    }
                    break;
                case 43:
                    i13 = k0.w((List) unsafe.getObject(t10, R));
                    if (i13 > 0) {
                        if (this.f28113i) {
                            unsafe.putInt(t10, i10, i13);
                        }
                        U = CodedOutputStream.U(Q);
                        W = CodedOutputStream.W(i13);
                        K = U + W + i13;
                        i17 += K;
                    }
                    break;
                case 44:
                    i13 = k0.e((List) unsafe.getObject(t10, R));
                    if (i13 > 0) {
                        if (this.f28113i) {
                            unsafe.putInt(t10, i10, i13);
                        }
                        U = CodedOutputStream.U(Q);
                        W = CodedOutputStream.W(i13);
                        K = U + W + i13;
                        i17 += K;
                    }
                    break;
                case 45:
                    i13 = k0.g((List) unsafe.getObject(t10, R));
                    if (i13 > 0) {
                        if (this.f28113i) {
                            unsafe.putInt(t10, i10, i13);
                        }
                        U = CodedOutputStream.U(Q);
                        W = CodedOutputStream.W(i13);
                        K = U + W + i13;
                        i17 += K;
                    }
                    break;
                case 46:
                    i13 = k0.i((List) unsafe.getObject(t10, R));
                    if (i13 > 0) {
                        if (this.f28113i) {
                            unsafe.putInt(t10, i10, i13);
                        }
                        U = CodedOutputStream.U(Q);
                        W = CodedOutputStream.W(i13);
                        K = U + W + i13;
                        i17 += K;
                    }
                    break;
                case 47:
                    i13 = k0.r((List) unsafe.getObject(t10, R));
                    if (i13 > 0) {
                        if (this.f28113i) {
                            unsafe.putInt(t10, i10, i13);
                        }
                        U = CodedOutputStream.U(Q);
                        W = CodedOutputStream.W(i13);
                        K = U + W + i13;
                        i17 += K;
                    }
                    break;
                case 48:
                    i13 = k0.t((List) unsafe.getObject(t10, R));
                    if (i13 > 0) {
                        if (this.f28113i) {
                            unsafe.putInt(t10, i10, i13);
                        }
                        U = CodedOutputStream.U(Q);
                        W = CodedOutputStream.W(i13);
                        K = U + W + i13;
                        i17 += K;
                    }
                    break;
                case 49:
                    d10 = k0.j(Q, (List) unsafe.getObject(t10, R), s(i16));
                    i17 += d10;
                    break;
                case 50:
                    d10 = this.f28121q.g(Q, unsafe.getObject(t10, R), r(i16));
                    i17 += d10;
                    break;
                case 51:
                    if (E(t10, Q, i16)) {
                        d10 = CodedOutputStream.i(Q, 0.0d);
                        i17 += d10;
                    }
                    break;
                case 52:
                    if (E(t10, Q, i16)) {
                        d10 = CodedOutputStream.q(Q, 0.0f);
                        i17 += d10;
                    }
                    break;
                case 53:
                    if (E(t10, Q, i16)) {
                        d10 = CodedOutputStream.x(Q, W(t10, R));
                        i17 += d10;
                    }
                    break;
                case 54:
                    if (E(t10, Q, i16)) {
                        d10 = CodedOutputStream.X(Q, W(t10, R));
                        i17 += d10;
                    }
                    break;
                case 55:
                    if (E(t10, Q, i16)) {
                        d10 = CodedOutputStream.v(Q, V(t10, R));
                        i17 += d10;
                    }
                    break;
                case 56:
                    if (E(t10, Q, i16)) {
                        d10 = CodedOutputStream.o(Q, 0L);
                        i17 += d10;
                    }
                    break;
                case 57:
                    if (E(t10, Q, i16)) {
                        K = CodedOutputStream.m(Q, 0);
                        i17 += K;
                    }
                    break;
                case 58:
                    if (E(t10, Q, i16)) {
                        d10 = CodedOutputStream.d(Q, true);
                        i17 += d10;
                    }
                    break;
                case 59:
                    if (E(t10, Q, i16)) {
                        Object object2 = unsafe.getObject(t10, R);
                        if (object2 instanceof f) {
                            d10 = CodedOutputStream.g(Q, (f) object2);
                        } else {
                            d10 = CodedOutputStream.S(Q, (String) object2);
                        }
                        i17 += d10;
                    }
                    break;
                case 60:
                    if (E(t10, Q, i16)) {
                        d10 = k0.o(Q, unsafe.getObject(t10, R), s(i16));
                        i17 += d10;
                    }
                    break;
                case 61:
                    if (E(t10, Q, i16)) {
                        d10 = CodedOutputStream.g(Q, (f) unsafe.getObject(t10, R));
                        i17 += d10;
                    }
                    break;
                case 62:
                    if (E(t10, Q, i16)) {
                        d10 = CodedOutputStream.V(Q, V(t10, R));
                        i17 += d10;
                    }
                    break;
                case 63:
                    if (E(t10, Q, i16)) {
                        d10 = CodedOutputStream.k(Q, V(t10, R));
                        i17 += d10;
                    }
                    break;
                case 64:
                    if (E(t10, Q, i16)) {
                        K = CodedOutputStream.K(Q, 0);
                        i17 += K;
                    }
                    break;
                case 65:
                    if (E(t10, Q, i16)) {
                        d10 = CodedOutputStream.M(Q, 0L);
                        i17 += d10;
                    }
                    break;
                case 66:
                    if (E(t10, Q, i16)) {
                        d10 = CodedOutputStream.O(Q, V(t10, R));
                        i17 += d10;
                    }
                    break;
                case 67:
                    if (E(t10, Q, i16)) {
                        d10 = CodedOutputStream.Q(Q, W(t10, R));
                        i17 += d10;
                    }
                    break;
                case 68:
                    if (E(t10, Q, i16)) {
                        d10 = CodedOutputStream.s(Q, (d0) unsafe.getObject(t10, R), s(i16));
                        i17 += d10;
                    }
                    break;
            }
            i16 += 3;
            i14 = 1048575;
        }
        int v10 = i17 + v(this.f28119o, t10);
        return this.f28110f ? v10 + this.f28120p.c(t10).l() : v10;
    }

    public final int u(T t10) {
        int i10;
        int i11;
        int U;
        int W;
        Unsafe unsafe = f28104s;
        int i12 = 0;
        for (int i13 = 0; i13 < this.f28105a.length; i13 += 3) {
            int i02 = i0(i13);
            int h02 = h0(i02);
            int Q = Q(i13);
            long R = R(i02);
            int i14 = (h02 < fn.e.DOUBLE_LIST_PACKED.a() || h02 > fn.e.SINT64_LIST_PACKED.a()) ? 0 : this.f28105a[i13 + 2] & 1048575;
            switch (h02) {
                case 0:
                    if (y(t10, i13)) {
                        i10 = CodedOutputStream.i(Q, 0.0d);
                        break;
                    } else {
                        continue;
                    }
                case 1:
                    if (y(t10, i13)) {
                        i10 = CodedOutputStream.q(Q, 0.0f);
                        break;
                    } else {
                        continue;
                    }
                case 2:
                    if (y(t10, i13)) {
                        i10 = CodedOutputStream.x(Q, fn.b0.y(t10, R));
                        break;
                    } else {
                        continue;
                    }
                case 3:
                    if (y(t10, i13)) {
                        i10 = CodedOutputStream.X(Q, fn.b0.y(t10, R));
                        break;
                    } else {
                        continue;
                    }
                case 4:
                    if (y(t10, i13)) {
                        i10 = CodedOutputStream.v(Q, fn.b0.x(t10, R));
                        break;
                    } else {
                        continue;
                    }
                case 5:
                    if (y(t10, i13)) {
                        i10 = CodedOutputStream.o(Q, 0L);
                        break;
                    } else {
                        continue;
                    }
                case 6:
                    if (y(t10, i13)) {
                        i10 = CodedOutputStream.m(Q, 0);
                        break;
                    } else {
                        continue;
                    }
                case 7:
                    if (y(t10, i13)) {
                        i10 = CodedOutputStream.d(Q, true);
                        break;
                    } else {
                        continue;
                    }
                case 8:
                    if (y(t10, i13)) {
                        Object A = fn.b0.A(t10, R);
                        if (A instanceof f) {
                            i10 = CodedOutputStream.g(Q, (f) A);
                            break;
                        } else {
                            i10 = CodedOutputStream.S(Q, (String) A);
                            break;
                        }
                    } else {
                        continue;
                    }
                case 9:
                    if (y(t10, i13)) {
                        i10 = k0.o(Q, fn.b0.A(t10, R), s(i13));
                        break;
                    } else {
                        continue;
                    }
                case 10:
                    if (y(t10, i13)) {
                        i10 = CodedOutputStream.g(Q, (f) fn.b0.A(t10, R));
                        break;
                    } else {
                        continue;
                    }
                case 11:
                    if (y(t10, i13)) {
                        i10 = CodedOutputStream.V(Q, fn.b0.x(t10, R));
                        break;
                    } else {
                        continue;
                    }
                case 12:
                    if (y(t10, i13)) {
                        i10 = CodedOutputStream.k(Q, fn.b0.x(t10, R));
                        break;
                    } else {
                        continue;
                    }
                case 13:
                    if (y(t10, i13)) {
                        i10 = CodedOutputStream.K(Q, 0);
                        break;
                    } else {
                        continue;
                    }
                case 14:
                    if (y(t10, i13)) {
                        i10 = CodedOutputStream.M(Q, 0L);
                        break;
                    } else {
                        continue;
                    }
                case 15:
                    if (y(t10, i13)) {
                        i10 = CodedOutputStream.O(Q, fn.b0.x(t10, R));
                        break;
                    } else {
                        continue;
                    }
                case 16:
                    if (y(t10, i13)) {
                        i10 = CodedOutputStream.Q(Q, fn.b0.y(t10, R));
                        break;
                    } else {
                        continue;
                    }
                case 17:
                    if (y(t10, i13)) {
                        i10 = CodedOutputStream.s(Q, (d0) fn.b0.A(t10, R), s(i13));
                        break;
                    } else {
                        continue;
                    }
                case 18:
                    i10 = k0.h(Q, G(t10, R), false);
                    break;
                case 19:
                    i10 = k0.f(Q, G(t10, R), false);
                    break;
                case 20:
                    i10 = k0.m(Q, G(t10, R), false);
                    break;
                case 21:
                    i10 = k0.x(Q, G(t10, R), false);
                    break;
                case 22:
                    i10 = k0.k(Q, G(t10, R), false);
                    break;
                case 23:
                    i10 = k0.h(Q, G(t10, R), false);
                    break;
                case 24:
                    i10 = k0.f(Q, G(t10, R), false);
                    break;
                case 25:
                    i10 = k0.a(Q, G(t10, R), false);
                    break;
                case 26:
                    i10 = k0.u(Q, G(t10, R));
                    break;
                case 27:
                    i10 = k0.p(Q, G(t10, R), s(i13));
                    break;
                case 28:
                    i10 = k0.c(Q, G(t10, R));
                    break;
                case 29:
                    i10 = k0.v(Q, G(t10, R), false);
                    break;
                case 30:
                    i10 = k0.d(Q, G(t10, R), false);
                    break;
                case 31:
                    i10 = k0.f(Q, G(t10, R), false);
                    break;
                case 32:
                    i10 = k0.h(Q, G(t10, R), false);
                    break;
                case 33:
                    i10 = k0.q(Q, G(t10, R), false);
                    break;
                case 34:
                    i10 = k0.s(Q, G(t10, R), false);
                    break;
                case 35:
                    i11 = k0.i((List) unsafe.getObject(t10, R));
                    if (i11 > 0) {
                        if (this.f28113i) {
                            unsafe.putInt(t10, i14, i11);
                        }
                        U = CodedOutputStream.U(Q);
                        W = CodedOutputStream.W(i11);
                        i10 = U + W + i11;
                        break;
                    } else {
                        continue;
                    }
                case 36:
                    i11 = k0.g((List) unsafe.getObject(t10, R));
                    if (i11 > 0) {
                        if (this.f28113i) {
                            unsafe.putInt(t10, i14, i11);
                        }
                        U = CodedOutputStream.U(Q);
                        W = CodedOutputStream.W(i11);
                        i10 = U + W + i11;
                        break;
                    } else {
                        continue;
                    }
                case 37:
                    i11 = k0.n((List) unsafe.getObject(t10, R));
                    if (i11 > 0) {
                        if (this.f28113i) {
                            unsafe.putInt(t10, i14, i11);
                        }
                        U = CodedOutputStream.U(Q);
                        W = CodedOutputStream.W(i11);
                        i10 = U + W + i11;
                        break;
                    } else {
                        continue;
                    }
                case 38:
                    i11 = k0.y((List) unsafe.getObject(t10, R));
                    if (i11 > 0) {
                        if (this.f28113i) {
                            unsafe.putInt(t10, i14, i11);
                        }
                        U = CodedOutputStream.U(Q);
                        W = CodedOutputStream.W(i11);
                        i10 = U + W + i11;
                        break;
                    } else {
                        continue;
                    }
                case 39:
                    i11 = k0.l((List) unsafe.getObject(t10, R));
                    if (i11 > 0) {
                        if (this.f28113i) {
                            unsafe.putInt(t10, i14, i11);
                        }
                        U = CodedOutputStream.U(Q);
                        W = CodedOutputStream.W(i11);
                        i10 = U + W + i11;
                        break;
                    } else {
                        continue;
                    }
                case 40:
                    i11 = k0.i((List) unsafe.getObject(t10, R));
                    if (i11 > 0) {
                        if (this.f28113i) {
                            unsafe.putInt(t10, i14, i11);
                        }
                        U = CodedOutputStream.U(Q);
                        W = CodedOutputStream.W(i11);
                        i10 = U + W + i11;
                        break;
                    } else {
                        continue;
                    }
                case 41:
                    i11 = k0.g((List) unsafe.getObject(t10, R));
                    if (i11 > 0) {
                        if (this.f28113i) {
                            unsafe.putInt(t10, i14, i11);
                        }
                        U = CodedOutputStream.U(Q);
                        W = CodedOutputStream.W(i11);
                        i10 = U + W + i11;
                        break;
                    } else {
                        continue;
                    }
                case 42:
                    i11 = k0.b((List) unsafe.getObject(t10, R));
                    if (i11 > 0) {
                        if (this.f28113i) {
                            unsafe.putInt(t10, i14, i11);
                        }
                        U = CodedOutputStream.U(Q);
                        W = CodedOutputStream.W(i11);
                        i10 = U + W + i11;
                        break;
                    } else {
                        continue;
                    }
                case 43:
                    i11 = k0.w((List) unsafe.getObject(t10, R));
                    if (i11 > 0) {
                        if (this.f28113i) {
                            unsafe.putInt(t10, i14, i11);
                        }
                        U = CodedOutputStream.U(Q);
                        W = CodedOutputStream.W(i11);
                        i10 = U + W + i11;
                        break;
                    } else {
                        continue;
                    }
                case 44:
                    i11 = k0.e((List) unsafe.getObject(t10, R));
                    if (i11 > 0) {
                        if (this.f28113i) {
                            unsafe.putInt(t10, i14, i11);
                        }
                        U = CodedOutputStream.U(Q);
                        W = CodedOutputStream.W(i11);
                        i10 = U + W + i11;
                        break;
                    } else {
                        continue;
                    }
                case 45:
                    i11 = k0.g((List) unsafe.getObject(t10, R));
                    if (i11 > 0) {
                        if (this.f28113i) {
                            unsafe.putInt(t10, i14, i11);
                        }
                        U = CodedOutputStream.U(Q);
                        W = CodedOutputStream.W(i11);
                        i10 = U + W + i11;
                        break;
                    } else {
                        continue;
                    }
                case 46:
                    i11 = k0.i((List) unsafe.getObject(t10, R));
                    if (i11 > 0) {
                        if (this.f28113i) {
                            unsafe.putInt(t10, i14, i11);
                        }
                        U = CodedOutputStream.U(Q);
                        W = CodedOutputStream.W(i11);
                        i10 = U + W + i11;
                        break;
                    } else {
                        continue;
                    }
                case 47:
                    i11 = k0.r((List) unsafe.getObject(t10, R));
                    if (i11 > 0) {
                        if (this.f28113i) {
                            unsafe.putInt(t10, i14, i11);
                        }
                        U = CodedOutputStream.U(Q);
                        W = CodedOutputStream.W(i11);
                        i10 = U + W + i11;
                        break;
                    } else {
                        continue;
                    }
                case 48:
                    i11 = k0.t((List) unsafe.getObject(t10, R));
                    if (i11 > 0) {
                        if (this.f28113i) {
                            unsafe.putInt(t10, i14, i11);
                        }
                        U = CodedOutputStream.U(Q);
                        W = CodedOutputStream.W(i11);
                        i10 = U + W + i11;
                        break;
                    } else {
                        continue;
                    }
                case 49:
                    i10 = k0.j(Q, G(t10, R), s(i13));
                    break;
                case 50:
                    i10 = this.f28121q.g(Q, fn.b0.A(t10, R), r(i13));
                    break;
                case 51:
                    if (E(t10, Q, i13)) {
                        i10 = CodedOutputStream.i(Q, 0.0d);
                        break;
                    } else {
                        continue;
                    }
                case 52:
                    if (E(t10, Q, i13)) {
                        i10 = CodedOutputStream.q(Q, 0.0f);
                        break;
                    } else {
                        continue;
                    }
                case 53:
                    if (E(t10, Q, i13)) {
                        i10 = CodedOutputStream.x(Q, W(t10, R));
                        break;
                    } else {
                        continue;
                    }
                case 54:
                    if (E(t10, Q, i13)) {
                        i10 = CodedOutputStream.X(Q, W(t10, R));
                        break;
                    } else {
                        continue;
                    }
                case 55:
                    if (E(t10, Q, i13)) {
                        i10 = CodedOutputStream.v(Q, V(t10, R));
                        break;
                    } else {
                        continue;
                    }
                case 56:
                    if (E(t10, Q, i13)) {
                        i10 = CodedOutputStream.o(Q, 0L);
                        break;
                    } else {
                        continue;
                    }
                case 57:
                    if (E(t10, Q, i13)) {
                        i10 = CodedOutputStream.m(Q, 0);
                        break;
                    } else {
                        continue;
                    }
                case 58:
                    if (E(t10, Q, i13)) {
                        i10 = CodedOutputStream.d(Q, true);
                        break;
                    } else {
                        continue;
                    }
                case 59:
                    if (E(t10, Q, i13)) {
                        Object A2 = fn.b0.A(t10, R);
                        if (A2 instanceof f) {
                            i10 = CodedOutputStream.g(Q, (f) A2);
                            break;
                        } else {
                            i10 = CodedOutputStream.S(Q, (String) A2);
                            break;
                        }
                    } else {
                        continue;
                    }
                case 60:
                    if (E(t10, Q, i13)) {
                        i10 = k0.o(Q, fn.b0.A(t10, R), s(i13));
                        break;
                    } else {
                        continue;
                    }
                case 61:
                    if (E(t10, Q, i13)) {
                        i10 = CodedOutputStream.g(Q, (f) fn.b0.A(t10, R));
                        break;
                    } else {
                        continue;
                    }
                case 62:
                    if (E(t10, Q, i13)) {
                        i10 = CodedOutputStream.V(Q, V(t10, R));
                        break;
                    } else {
                        continue;
                    }
                case 63:
                    if (E(t10, Q, i13)) {
                        i10 = CodedOutputStream.k(Q, V(t10, R));
                        break;
                    } else {
                        continue;
                    }
                case 64:
                    if (E(t10, Q, i13)) {
                        i10 = CodedOutputStream.K(Q, 0);
                        break;
                    } else {
                        continue;
                    }
                case 65:
                    if (E(t10, Q, i13)) {
                        i10 = CodedOutputStream.M(Q, 0L);
                        break;
                    } else {
                        continue;
                    }
                case 66:
                    if (E(t10, Q, i13)) {
                        i10 = CodedOutputStream.O(Q, V(t10, R));
                        break;
                    } else {
                        continue;
                    }
                case 67:
                    if (E(t10, Q, i13)) {
                        i10 = CodedOutputStream.Q(Q, W(t10, R));
                        break;
                    } else {
                        continue;
                    }
                case 68:
                    if (E(t10, Q, i13)) {
                        i10 = CodedOutputStream.s(Q, (d0) fn.b0.A(t10, R), s(i13));
                        break;
                    } else {
                        continue;
                    }
                default:
            }
            i12 += i10;
        }
        return i12 + v(this.f28119o, t10);
    }

    public final <UT, UB> int v(m0<UT, UB> m0Var, T t10) {
        return m0Var.h(m0Var.g(t10));
    }

    public final boolean y(T t10, int i10) {
        int Y = Y(i10);
        long j10 = 1048575 & Y;
        if (j10 != 1048575) {
            return (fn.b0.x(t10, j10) & (1 << (Y >>> 20))) != 0;
        }
        int i02 = i0(i10);
        long R = R(i02);
        switch (h0(i02)) {
            case 0:
                return fn.b0.v(t10, R) != 0.0d;
            case 1:
                return fn.b0.w(t10, R) != 0.0f;
            case 2:
                return fn.b0.y(t10, R) != 0;
            case 3:
                return fn.b0.y(t10, R) != 0;
            case 4:
                return fn.b0.x(t10, R) != 0;
            case 5:
                return fn.b0.y(t10, R) != 0;
            case 6:
                return fn.b0.x(t10, R) != 0;
            case 7:
                return fn.b0.p(t10, R);
            case 8:
                Object A = fn.b0.A(t10, R);
                if (A instanceof String) {
                    return !((String) A).isEmpty();
                }
                if (A instanceof f) {
                    return !f.f28094x.equals(A);
                }
                throw new IllegalArgumentException();
            case 9:
                return fn.b0.A(t10, R) != null;
            case 10:
                return !f.f28094x.equals(fn.b0.A(t10, R));
            case 11:
                return fn.b0.x(t10, R) != 0;
            case 12:
                return fn.b0.x(t10, R) != 0;
            case 13:
                return fn.b0.x(t10, R) != 0;
            case 14:
                return fn.b0.y(t10, R) != 0;
            case 15:
                return fn.b0.x(t10, R) != 0;
            case 16:
                return fn.b0.y(t10, R) != 0;
            case 17:
                return fn.b0.A(t10, R) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    public final boolean z(T t10, int i10, int i11, int i12, int i13) {
        if (i11 == 1048575) {
            return y(t10, i10);
        }
        return (i12 & i13) != 0;
    }
}
