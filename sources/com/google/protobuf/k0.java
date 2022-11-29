package com.google.protobuf;

import com.google.protobuf.p;
import com.google.protobuf.t;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes4.dex */
public final class k0 {

    /* renamed from: a  reason: collision with root package name */
    public static final Class<?> f28153a = B();

    /* renamed from: b  reason: collision with root package name */
    public static final m0<?, ?> f28154b = C(false);

    /* renamed from: c  reason: collision with root package name */
    public static final m0<?, ?> f28155c = C(true);

    /* renamed from: d  reason: collision with root package name */
    public static final m0<?, ?> f28156d = new fn.z();

    public static <UT, UB> UB A(int i10, List<Integer> list, t.e eVar, UB ub2, m0<UT, UB> m0Var) {
        if (eVar == null) {
            return ub2;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i11 = 0;
            for (int i12 = 0; i12 < size; i12++) {
                int intValue = list.get(i12).intValue();
                if (eVar.a(intValue)) {
                    if (i12 != i11) {
                        list.set(i11, Integer.valueOf(intValue));
                    }
                    i11++;
                } else {
                    ub2 = (UB) L(i10, intValue, ub2, m0Var);
                }
            }
            if (i11 != size) {
                list.subList(i11, size).clear();
            }
        } else {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = it.next().intValue();
                if (!eVar.a(intValue2)) {
                    ub2 = (UB) L(i10, intValue2, ub2, m0Var);
                    it.remove();
                }
            }
        }
        return ub2;
    }

    public static Class<?> B() {
        try {
            return Class.forName("com.google.protobuf.GeneratedMessageV3");
        } catch (Throwable unused) {
            return null;
        }
    }

    public static m0<?, ?> C(boolean z10) {
        try {
            Class<?> D = D();
            if (D == null) {
                return null;
            }
            return (m0) D.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z10));
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Class<?> D() {
        try {
            return Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            return null;
        }
    }

    public static <T, FT extends p.b<FT>> void E(m<FT> mVar, T t10, T t11) {
        p<FT> c10 = mVar.c(t11);
        if (c10.n()) {
            return;
        }
        mVar.d(t10).u(c10);
    }

    public static <T> void F(b0 b0Var, T t10, T t11, long j10) {
        fn.b0.O(t10, j10, b0Var.a(fn.b0.A(t10, j10), fn.b0.A(t11, j10)));
    }

    public static <T, UT, UB> void G(m0<UT, UB> m0Var, T t10, T t11) {
        m0Var.p(t10, m0Var.k(m0Var.g(t10), m0Var.g(t11)));
    }

    public static m0<?, ?> H() {
        return f28154b;
    }

    public static m0<?, ?> I() {
        return f28155c;
    }

    public static void J(Class<?> cls) {
        Class<?> cls2;
        if (!r.class.isAssignableFrom(cls) && (cls2 = f28153a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    public static boolean K(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static <UT, UB> UB L(int i10, int i11, UB ub2, m0<UT, UB> m0Var) {
        if (ub2 == null) {
            ub2 = m0Var.n();
        }
        m0Var.e(ub2, i10, i11);
        return ub2;
    }

    public static m0<?, ?> M() {
        return f28156d;
    }

    public static void N(int i10, List<Boolean> list, q0 q0Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        q0Var.F(i10, list, z10);
    }

    public static void O(int i10, List<f> list, q0 q0Var) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        q0Var.O(i10, list);
    }

    public static void P(int i10, List<Double> list, q0 q0Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        q0Var.M(i10, list, z10);
    }

    public static void Q(int i10, List<Integer> list, q0 q0Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        q0Var.p(i10, list, z10);
    }

    public static void R(int i10, List<Integer> list, q0 q0Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        q0Var.l(i10, list, z10);
    }

    public static void S(int i10, List<Long> list, q0 q0Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        q0Var.D(i10, list, z10);
    }

    public static void T(int i10, List<Float> list, q0 q0Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        q0Var.a(i10, list, z10);
    }

    public static void U(int i10, List<?> list, q0 q0Var, fn.v vVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        q0Var.e(i10, list, vVar);
    }

    public static void V(int i10, List<Integer> list, q0 q0Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        q0Var.h(i10, list, z10);
    }

    public static void W(int i10, List<Long> list, q0 q0Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        q0Var.L(i10, list, z10);
    }

    public static void X(int i10, List<?> list, q0 q0Var, fn.v vVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        q0Var.r(i10, list, vVar);
    }

    public static void Y(int i10, List<Integer> list, q0 q0Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        q0Var.E(i10, list, z10);
    }

    public static void Z(int i10, List<Long> list, q0 q0Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        q0Var.t(i10, list, z10);
    }

    public static int a(int i10, List<?> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (z10) {
            return CodedOutputStream.U(i10) + CodedOutputStream.C(size);
        }
        return size * CodedOutputStream.d(i10, true);
    }

    public static void a0(int i10, List<Integer> list, q0 q0Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        q0Var.J(i10, list, z10);
    }

    public static int b(List<?> list) {
        return list.size();
    }

    public static void b0(int i10, List<Long> list, q0 q0Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        q0Var.n(i10, list, z10);
    }

    public static int c(int i10, List<f> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int U = size * CodedOutputStream.U(i10);
        for (int i11 = 0; i11 < list.size(); i11++) {
            U += CodedOutputStream.h(list.get(i11));
        }
        return U;
    }

    public static void c0(int i10, List<String> list, q0 q0Var) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        q0Var.d(i10, list);
    }

    public static int d(int i10, List<Integer> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int e10 = e(list);
        if (z10) {
            return CodedOutputStream.U(i10) + CodedOutputStream.C(e10);
        }
        return e10 + (size * CodedOutputStream.U(i10));
    }

    public static void d0(int i10, List<Integer> list, q0 q0Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        q0Var.m(i10, list, z10);
    }

    public static int e(List<Integer> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof s) {
            s sVar = (s) list;
            i10 = 0;
            while (i11 < size) {
                i10 += CodedOutputStream.l(sVar.getInt(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += CodedOutputStream.l(list.get(i11).intValue());
                i11++;
            }
        }
        return i10;
    }

    public static void e0(int i10, List<Long> list, q0 q0Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        q0Var.u(i10, list, z10);
    }

    public static int f(int i10, List<?> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (z10) {
            return CodedOutputStream.U(i10) + CodedOutputStream.C(size * 4);
        }
        return size * CodedOutputStream.m(i10, 0);
    }

    public static int g(List<?> list) {
        return list.size() * 4;
    }

    public static int h(int i10, List<?> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (z10) {
            return CodedOutputStream.U(i10) + CodedOutputStream.C(size * 8);
        }
        return size * CodedOutputStream.o(i10, 0L);
    }

    public static int i(List<?> list) {
        return list.size() * 8;
    }

    public static int j(int i10, List<d0> list, fn.v vVar) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            i11 += CodedOutputStream.s(i10, list.get(i12), vVar);
        }
        return i11;
    }

    public static int k(int i10, List<Integer> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int l10 = l(list);
        if (z10) {
            return CodedOutputStream.U(i10) + CodedOutputStream.C(l10);
        }
        return l10 + (size * CodedOutputStream.U(i10));
    }

    public static int l(List<Integer> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof s) {
            s sVar = (s) list;
            i10 = 0;
            while (i11 < size) {
                i10 += CodedOutputStream.w(sVar.getInt(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += CodedOutputStream.w(list.get(i11).intValue());
                i11++;
            }
        }
        return i10;
    }

    public static int m(int i10, List<Long> list, boolean z10) {
        if (list.size() == 0) {
            return 0;
        }
        int n10 = n(list);
        if (z10) {
            return CodedOutputStream.U(i10) + CodedOutputStream.C(n10);
        }
        return n10 + (list.size() * CodedOutputStream.U(i10));
    }

    public static int n(List<Long> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof y) {
            y yVar = (y) list;
            i10 = 0;
            while (i11 < size) {
                i10 += CodedOutputStream.y(yVar.p(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += CodedOutputStream.y(list.get(i11).longValue());
                i11++;
            }
        }
        return i10;
    }

    public static int o(int i10, Object obj, fn.v vVar) {
        if (obj instanceof v) {
            return CodedOutputStream.A(i10, (v) obj);
        }
        return CodedOutputStream.F(i10, (d0) obj, vVar);
    }

    public static int p(int i10, List<?> list, fn.v vVar) {
        int H;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int U = CodedOutputStream.U(i10) * size;
        for (int i11 = 0; i11 < size; i11++) {
            Object obj = list.get(i11);
            if (obj instanceof v) {
                H = CodedOutputStream.B((v) obj);
            } else {
                H = CodedOutputStream.H((d0) obj, vVar);
            }
            U += H;
        }
        return U;
    }

    public static int q(int i10, List<Integer> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int r10 = r(list);
        if (z10) {
            return CodedOutputStream.U(i10) + CodedOutputStream.C(r10);
        }
        return r10 + (size * CodedOutputStream.U(i10));
    }

    public static int r(List<Integer> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof s) {
            s sVar = (s) list;
            i10 = 0;
            while (i11 < size) {
                i10 += CodedOutputStream.P(sVar.getInt(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += CodedOutputStream.P(list.get(i11).intValue());
                i11++;
            }
        }
        return i10;
    }

    public static int s(int i10, List<Long> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int t10 = t(list);
        if (z10) {
            return CodedOutputStream.U(i10) + CodedOutputStream.C(t10);
        }
        return t10 + (size * CodedOutputStream.U(i10));
    }

    public static int t(List<Long> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof y) {
            y yVar = (y) list;
            i10 = 0;
            while (i11 < size) {
                i10 += CodedOutputStream.R(yVar.p(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += CodedOutputStream.R(list.get(i11).longValue());
                i11++;
            }
        }
        return i10;
    }

    public static int u(int i10, List<?> list) {
        int T;
        int T2;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        int U = CodedOutputStream.U(i10) * size;
        if (list instanceof fn.i) {
            fn.i iVar = (fn.i) list;
            while (i11 < size) {
                Object L1 = iVar.L1(i11);
                if (L1 instanceof f) {
                    T2 = CodedOutputStream.h((f) L1);
                } else {
                    T2 = CodedOutputStream.T((String) L1);
                }
                U += T2;
                i11++;
            }
        } else {
            while (i11 < size) {
                Object obj = list.get(i11);
                if (obj instanceof f) {
                    T = CodedOutputStream.h((f) obj);
                } else {
                    T = CodedOutputStream.T((String) obj);
                }
                U += T;
                i11++;
            }
        }
        return U;
    }

    public static int v(int i10, List<Integer> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int w10 = w(list);
        if (z10) {
            return CodedOutputStream.U(i10) + CodedOutputStream.C(w10);
        }
        return w10 + (size * CodedOutputStream.U(i10));
    }

    public static int w(List<Integer> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof s) {
            s sVar = (s) list;
            i10 = 0;
            while (i11 < size) {
                i10 += CodedOutputStream.W(sVar.getInt(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += CodedOutputStream.W(list.get(i11).intValue());
                i11++;
            }
        }
        return i10;
    }

    public static int x(int i10, List<Long> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int y10 = y(list);
        if (z10) {
            return CodedOutputStream.U(i10) + CodedOutputStream.C(y10);
        }
        return y10 + (size * CodedOutputStream.U(i10));
    }

    public static int y(List<Long> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof y) {
            y yVar = (y) list;
            i10 = 0;
            while (i11 < size) {
                i10 += CodedOutputStream.Y(yVar.p(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += CodedOutputStream.Y(list.get(i11).longValue());
                i11++;
            }
        }
        return i10;
    }

    public static <UT, UB> UB z(int i10, List<Integer> list, t.d<?> dVar, UB ub2, m0<UT, UB> m0Var) {
        if (dVar == null) {
            return ub2;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i11 = 0;
            for (int i12 = 0; i12 < size; i12++) {
                int intValue = list.get(i12).intValue();
                if (dVar.a(intValue) != null) {
                    if (i12 != i11) {
                        list.set(i11, Integer.valueOf(intValue));
                    }
                    i11++;
                } else {
                    ub2 = (UB) L(i10, intValue, ub2, m0Var);
                }
            }
            if (i11 != size) {
                list.subList(i11, size).clear();
            }
        } else {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = it.next().intValue();
                if (dVar.a(intValue2) == null) {
                    ub2 = (UB) L(i10, intValue2, ub2, m0Var);
                    it.remove();
                }
            }
        }
        return ub2;
    }
}
