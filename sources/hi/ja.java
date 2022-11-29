package hi;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes3.dex */
public final class ja {

    /* renamed from: a  reason: collision with root package name */
    public static final Class<?> f35826a;

    /* renamed from: b  reason: collision with root package name */
    public static final va<?, ?> f35827b;

    /* renamed from: c  reason: collision with root package name */
    public static final va<?, ?> f35828c;

    /* renamed from: d  reason: collision with root package name */
    public static final va<?, ?> f35829d;

    static {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        f35826a = cls;
        f35827b = C(false);
        f35828c = C(true);
        f35829d = new xa();
    }

    public static int A(int i10, List<?> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (b8.a(i10 << 3) + 1);
    }

    public static void B(int i10, List<Long> list, c8 c8Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        c8Var.k(i10, list, z10);
    }

    public static va<?, ?> C(boolean z10) {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            cls = null;
        }
        if (cls == null) {
            return null;
        }
        try {
            return (va) cls.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z10));
        } catch (Throwable unused2) {
            return null;
        }
    }

    public static int D(List<?> list) {
        return list.size();
    }

    public static int E(int i10, List<u7> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int D = size * b8.D(i10);
        for (int i11 = 0; i11 < list.size(); i11++) {
            D += b8.x(list.get(i11));
        }
        return D;
    }

    public static int F(int i10, List<Integer> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return G(list) + (size * b8.D(i10));
    }

    public static int G(List<Integer> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof u8) {
            u8 u8Var = (u8) list;
            i10 = 0;
            while (i11 < size) {
                i10 += b8.z(u8Var.f(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += b8.z(list.get(i11).intValue());
                i11++;
            }
        }
        return i10;
    }

    public static int H(int i10, List<?> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (b8.a(i10 << 3) + 4);
    }

    public static int I(List<?> list) {
        return list.size() * 4;
    }

    public static int J(int i10, List<?> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (b8.a(i10 << 3) + 8);
    }

    public static int K(List<?> list) {
        return list.size() * 8;
    }

    public static int L(int i10, List<w9> list, ha haVar) {
        int size = list.size();
        if (size != 0) {
            int i11 = 0;
            for (int i12 = 0; i12 < size; i12++) {
                i11 += b8.y(i10, list.get(i12), haVar);
            }
            return i11;
        }
        return 0;
    }

    public static int M(int i10, List<Integer> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return N(list) + (size * b8.D(i10));
    }

    public static int N(List<Integer> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof u8) {
            u8 u8Var = (u8) list;
            i10 = 0;
            while (i11 < size) {
                i10 += b8.z(u8Var.f(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += b8.z(list.get(i11).intValue());
                i11++;
            }
        }
        return i10;
    }

    public static int O(int i10, List<Long> list, boolean z10) {
        if (list.size() == 0) {
            return 0;
        }
        return P(list) + (list.size() * b8.D(i10));
    }

    public static int P(List<Long> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof k9) {
            k9 k9Var = (k9) list;
            i10 = 0;
            while (i11 < size) {
                i10 += b8.b(k9Var.G(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += b8.b(list.get(i11).longValue());
                i11++;
            }
        }
        return i10;
    }

    public static int Q(int i10, Object obj, ha haVar) {
        if (obj instanceof d9) {
            int a10 = b8.a(i10 << 3);
            int a11 = ((d9) obj).a();
            return a10 + b8.a(a11) + a11;
        }
        return b8.a(i10 << 3) + b8.B((w9) obj, haVar);
    }

    public static int R(int i10, List<?> list, ha haVar) {
        int B;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int D = b8.D(i10) * size;
        for (int i11 = 0; i11 < size; i11++) {
            Object obj = list.get(i11);
            if (obj instanceof d9) {
                B = b8.A((d9) obj);
            } else {
                B = b8.B((w9) obj, haVar);
            }
            D += B;
        }
        return D;
    }

    public static int S(int i10, List<Integer> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return T(list) + (size * b8.D(i10));
    }

    public static int T(List<Integer> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof u8) {
            u8 u8Var = (u8) list;
            i10 = 0;
            while (i11 < size) {
                int f10 = u8Var.f(i11);
                i10 += b8.a((f10 >> 31) ^ (f10 + f10));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                int intValue = list.get(i11).intValue();
                i10 += b8.a((intValue >> 31) ^ (intValue + intValue));
                i11++;
            }
        }
        return i10;
    }

    public static int U(int i10, List<Long> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return V(list) + (size * b8.D(i10));
    }

    public static int V(List<Long> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof k9) {
            k9 k9Var = (k9) list;
            i10 = 0;
            while (i11 < size) {
                long G = k9Var.G(i11);
                i10 += b8.b((G >> 63) ^ (G + G));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                long longValue = list.get(i11).longValue();
                i10 += b8.b((longValue >> 63) ^ (longValue + longValue));
                i11++;
            }
        }
        return i10;
    }

    public static int W(int i10, List<?> list) {
        int C;
        int C2;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        int D = b8.D(i10) * size;
        if (list instanceof f9) {
            f9 f9Var = (f9) list;
            while (i11 < size) {
                Object E = f9Var.E(i11);
                if (E instanceof u7) {
                    C2 = b8.x((u7) E);
                } else {
                    C2 = b8.C((String) E);
                }
                D += C2;
                i11++;
            }
        } else {
            while (i11 < size) {
                Object obj = list.get(i11);
                if (obj instanceof u7) {
                    C = b8.x((u7) obj);
                } else {
                    C = b8.C((String) obj);
                }
                D += C;
                i11++;
            }
        }
        return D;
    }

    public static int X(int i10, List<Integer> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return Y(list) + (size * b8.D(i10));
    }

    public static int Y(List<Integer> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof u8) {
            u8 u8Var = (u8) list;
            i10 = 0;
            while (i11 < size) {
                i10 += b8.a(u8Var.f(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += b8.a(list.get(i11).intValue());
                i11++;
            }
        }
        return i10;
    }

    public static int Z(int i10, List<Long> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return a0(list) + (size * b8.D(i10));
    }

    public static va<?, ?> a() {
        return f35828c;
    }

    public static int a0(List<Long> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof k9) {
            k9 k9Var = (k9) list;
            i10 = 0;
            while (i11 < size) {
                i10 += b8.b(k9Var.G(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += b8.b(list.get(i11).longValue());
                i11++;
            }
        }
        return i10;
    }

    public static va<?, ?> b() {
        return f35829d;
    }

    public static va<?, ?> b0() {
        return f35827b;
    }

    public static <UT, UB> UB c(int i10, List<Integer> list, x8 x8Var, UB ub2, va<UT, UB> vaVar) {
        if (x8Var == null) {
            return ub2;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i11 = 0;
            for (int i12 = 0; i12 < size; i12++) {
                int intValue = list.get(i12).intValue();
                if (x8Var.G(intValue)) {
                    if (i12 != i11) {
                        list.set(i11, Integer.valueOf(intValue));
                    }
                    i11++;
                } else {
                    ub2 = (UB) d(i10, intValue, ub2, vaVar);
                }
            }
            if (i11 != size) {
                list.subList(i11, size).clear();
                return ub2;
            }
        } else {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = it.next().intValue();
                if (!x8Var.G(intValue2)) {
                    ub2 = (UB) d(i10, intValue2, ub2, vaVar);
                    it.remove();
                }
            }
        }
        return ub2;
    }

    public static <UT, UB> UB d(int i10, int i11, UB ub2, va<UT, UB> vaVar) {
        if (ub2 == null) {
            ub2 = vaVar.e();
        }
        vaVar.f(ub2, i10, i11);
        return ub2;
    }

    public static <T, FT extends k8<FT>> void e(h8<FT> h8Var, T t10, T t11) {
        h8Var.a(t11);
        throw null;
    }

    public static <T, UT, UB> void f(va<UT, UB> vaVar, T t10, T t11) {
        vaVar.h(t10, vaVar.d(vaVar.c(t10), vaVar.c(t11)));
    }

    public static void g(Class<?> cls) {
        Class<?> cls2;
        if (!t8.class.isAssignableFrom(cls) && (cls2 = f35826a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    public static boolean h(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static <T> void i(q9 q9Var, T t10, T t11, long j10) {
        fb.x(t10, j10, q9.b(fb.k(t10, j10), fb.k(t11, j10)));
    }

    public static void j(int i10, List<Boolean> list, c8 c8Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        c8Var.n(i10, list, z10);
    }

    public static void k(int i10, List<u7> list, c8 c8Var) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        c8Var.p(i10, list);
    }

    public static void l(int i10, List<Double> list, c8 c8Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        c8Var.r(i10, list, z10);
    }

    public static void m(int i10, List<Integer> list, c8 c8Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        c8Var.u(i10, list, z10);
    }

    public static void n(int i10, List<Integer> list, c8 c8Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        c8Var.w(i10, list, z10);
    }

    public static void o(int i10, List<Long> list, c8 c8Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        c8Var.y(i10, list, z10);
    }

    public static void p(int i10, List<Float> list, c8 c8Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        c8Var.A(i10, list, z10);
    }

    public static void q(int i10, List<?> list, c8 c8Var, ha haVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i11 = 0; i11 < list.size(); i11++) {
            c8Var.B(i10, list.get(i11), haVar);
        }
    }

    public static void r(int i10, List<Integer> list, c8 c8Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        c8Var.D(i10, list, z10);
    }

    public static void s(int i10, List<Long> list, c8 c8Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        c8Var.F(i10, list, z10);
    }

    public static void t(int i10, List<?> list, c8 c8Var, ha haVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i11 = 0; i11 < list.size(); i11++) {
            c8Var.G(i10, list.get(i11), haVar);
        }
    }

    public static void u(int i10, List<Integer> list, c8 c8Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        c8Var.I(i10, list, z10);
    }

    public static void v(int i10, List<Long> list, c8 c8Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        c8Var.K(i10, list, z10);
    }

    public static void w(int i10, List<Integer> list, c8 c8Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        c8Var.b(i10, list, z10);
    }

    public static void x(int i10, List<Long> list, c8 c8Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        c8Var.d(i10, list, z10);
    }

    public static void y(int i10, List<String> list, c8 c8Var) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        c8Var.g(i10, list);
    }

    public static void z(int i10, List<Integer> list, c8 c8Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        c8Var.i(i10, list, z10);
    }
}
