package ai;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes3.dex */
public final class rk3 {

    /* renamed from: a  reason: collision with root package name */
    public static final Class<?> f9486a;

    /* renamed from: b  reason: collision with root package name */
    public static final dl3<?, ?> f9487b;

    /* renamed from: c  reason: collision with root package name */
    public static final dl3<?, ?> f9488c;

    /* renamed from: d  reason: collision with root package name */
    public static final dl3<?, ?> f9489d;

    static {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        f9486a = cls;
        f9487b = C(false);
        f9488c = C(true);
        f9489d = new fl3();
    }

    public static void A(Class<?> cls) {
        Class<?> cls2;
        if (!ri3.class.isAssignableFrom(cls) && (cls2 = f9486a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    public static void B(int i10, List<?> list, zh3 zh3Var, ok3 ok3Var) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i11 = 0; i11 < list.size(); i11++) {
            zh3Var.D(i10, list.get(i11), ok3Var);
        }
    }

    public static dl3<?, ?> C(boolean z10) {
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
            return (dl3) cls.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z10));
        } catch (Throwable unused2) {
            return null;
        }
    }

    public static int D(List<Long> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof lj3) {
            lj3 lj3Var = (lj3) list;
            i10 = 0;
            while (i11 < size) {
                i10 += yh3.C(lj3Var.g(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += yh3.C(list.get(i11).longValue());
                i11++;
            }
        }
        return i10;
    }

    public static int E(int i10, List<Long> list, boolean z10) {
        if (list.size() == 0) {
            return 0;
        }
        return D(list) + (list.size() * yh3.z(i10));
    }

    public static int F(List<Long> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof lj3) {
            lj3 lj3Var = (lj3) list;
            i10 = 0;
            while (i11 < size) {
                i10 += yh3.C(lj3Var.g(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += yh3.C(list.get(i11).longValue());
                i11++;
            }
        }
        return i10;
    }

    public static int G(int i10, List<Long> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return F(list) + (size * yh3.z(i10));
    }

    public static int H(List<Long> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof lj3) {
            lj3 lj3Var = (lj3) list;
            i10 = 0;
            while (i11 < size) {
                long g10 = lj3Var.g(i11);
                i10 += yh3.C((g10 >> 63) ^ (g10 + g10));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                long longValue = list.get(i11).longValue();
                i10 += yh3.C((longValue >> 63) ^ (longValue + longValue));
                i11++;
            }
        }
        return i10;
    }

    public static int I(int i10, List<Long> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return H(list) + (size * yh3.z(i10));
    }

    public static int J(List<Integer> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof si3) {
            si3 si3Var = (si3) list;
            i10 = 0;
            while (i11 < size) {
                i10 += yh3.A(si3Var.g(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += yh3.A(list.get(i11).intValue());
                i11++;
            }
        }
        return i10;
    }

    public static int K(int i10, List<Integer> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return J(list) + (size * yh3.z(i10));
    }

    public static int L(List<Integer> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof si3) {
            si3 si3Var = (si3) list;
            i10 = 0;
            while (i11 < size) {
                i10 += yh3.A(si3Var.g(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += yh3.A(list.get(i11).intValue());
                i11++;
            }
        }
        return i10;
    }

    public static int M(int i10, List<Integer> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return L(list) + (size * yh3.z(i10));
    }

    public static int N(List<Integer> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof si3) {
            si3 si3Var = (si3) list;
            i10 = 0;
            while (i11 < size) {
                i10 += yh3.B(si3Var.g(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += yh3.B(list.get(i11).intValue());
                i11++;
            }
        }
        return i10;
    }

    public static int O(int i10, List<Integer> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return N(list) + (size * yh3.z(i10));
    }

    public static int P(List<Integer> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof si3) {
            si3 si3Var = (si3) list;
            i10 = 0;
            while (i11 < size) {
                int g10 = si3Var.g(i11);
                i10 += yh3.B((g10 >> 31) ^ (g10 + g10));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                int intValue = list.get(i11).intValue();
                i10 += yh3.B((intValue >> 31) ^ (intValue + intValue));
                i11++;
            }
        }
        return i10;
    }

    public static int Q(int i10, List<Integer> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return P(list) + (size * yh3.z(i10));
    }

    public static int R(List<?> list) {
        return list.size() * 4;
    }

    public static int S(int i10, List<?> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (yh3.B(i10 << 3) + 4);
    }

    public static int T(List<?> list) {
        return list.size() * 8;
    }

    public static int U(int i10, List<?> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (yh3.B(i10 << 3) + 8);
    }

    public static int V(List<?> list) {
        return list.size();
    }

    public static int W(int i10, List<?> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (yh3.B(i10 << 3) + 1);
    }

    public static int X(int i10, List<?> list) {
        int D;
        int D2;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        int z10 = yh3.z(i10) * size;
        if (list instanceof gj3) {
            gj3 gj3Var = (gj3) list;
            while (i11 < size) {
                Object Y = gj3Var.Y(i11);
                if (Y instanceof oh3) {
                    D2 = yh3.b((oh3) Y);
                } else {
                    D2 = yh3.D((String) Y);
                }
                z10 += D2;
                i11++;
            }
        } else {
            while (i11 < size) {
                Object obj = list.get(i11);
                if (obj instanceof oh3) {
                    D = yh3.b((oh3) obj);
                } else {
                    D = yh3.D((String) obj);
                }
                z10 += D;
                i11++;
            }
        }
        return z10;
    }

    public static int Y(int i10, Object obj, ok3 ok3Var) {
        if (obj instanceof ej3) {
            int B = yh3.B(i10 << 3);
            int a10 = ((ej3) obj).a();
            return B + yh3.B(a10) + a10;
        }
        return yh3.B(i10 << 3) + yh3.c((xj3) obj, ok3Var);
    }

    public static int Z(int i10, List<?> list, ok3 ok3Var) {
        int c10;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int z10 = yh3.z(i10) * size;
        for (int i11 = 0; i11 < size; i11++) {
            Object obj = list.get(i11);
            if (obj instanceof ej3) {
                c10 = yh3.a((ej3) obj);
            } else {
                c10 = yh3.c((xj3) obj, ok3Var);
            }
            z10 += c10;
        }
        return z10;
    }

    public static dl3<?, ?> a() {
        return f9487b;
    }

    public static int a0(int i10, List<oh3> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int z10 = size * yh3.z(i10);
        for (int i11 = 0; i11 < list.size(); i11++) {
            z10 += yh3.b(list.get(i11));
        }
        return z10;
    }

    public static dl3<?, ?> b() {
        return f9488c;
    }

    public static int b0(int i10, List<xj3> list, ok3 ok3Var) {
        int size = list.size();
        if (size != 0) {
            int i11 = 0;
            for (int i12 = 0; i12 < size; i12++) {
                i11 += yh3.f(i10, list.get(i12), ok3Var);
            }
            return i11;
        }
        return 0;
    }

    public static dl3<?, ?> c() {
        return f9489d;
    }

    public static boolean d(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static <T, FT extends hi3<FT>> void e(ei3<FT> ei3Var, T t10, T t11) {
        ei3Var.b(t11);
        throw null;
    }

    public static <T, UT, UB> void f(dl3<UT, UB> dl3Var, T t10, T t11) {
        dl3Var.i(t10, dl3Var.o(dl3Var.j(t10), dl3Var.j(t11)));
    }

    public static <UT, UB> UB g(int i10, List<Integer> list, vi3 vi3Var, UB ub2, dl3<UT, UB> dl3Var) {
        if (vi3Var == null) {
            return ub2;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i11 = 0;
            for (int i12 = 0; i12 < size; i12++) {
                int intValue = list.get(i12).intValue();
                if (vi3Var.G(intValue)) {
                    if (i12 != i11) {
                        list.set(i11, Integer.valueOf(intValue));
                    }
                    i11++;
                } else {
                    ub2 = (UB) h(i10, intValue, ub2, dl3Var);
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
                if (!vi3Var.G(intValue2)) {
                    ub2 = (UB) h(i10, intValue2, ub2, dl3Var);
                    it.remove();
                }
            }
        }
        return ub2;
    }

    public static <UT, UB> UB h(int i10, int i11, UB ub2, dl3<UT, UB> dl3Var) {
        if (ub2 == null) {
            ub2 = dl3Var.g();
        }
        dl3Var.b(ub2, i10, i11);
        return ub2;
    }

    public static <T> void i(sj3 sj3Var, T t10, T t11, long j10) {
        nl3.w(t10, j10, sj3.c(nl3.v(t10, j10), nl3.v(t11, j10)));
    }

    public static void j(int i10, List<Double> list, zh3 zh3Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zh3Var.b(i10, list, z10);
    }

    public static void k(int i10, List<Float> list, zh3 zh3Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zh3Var.a(i10, list, z10);
    }

    public static void l(int i10, List<Long> list, zh3 zh3Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zh3Var.I(i10, list, z10);
    }

    public static void m(int i10, List<Long> list, zh3 zh3Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zh3Var.J(i10, list, z10);
    }

    public static void n(int i10, List<Long> list, zh3 zh3Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zh3Var.k(i10, list, z10);
    }

    public static void o(int i10, List<Long> list, zh3 zh3Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zh3Var.K(i10, list, z10);
    }

    public static void p(int i10, List<Long> list, zh3 zh3Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zh3Var.i(i10, list, z10);
    }

    public static void q(int i10, List<Integer> list, zh3 zh3Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zh3Var.G(i10, list, z10);
    }

    public static void r(int i10, List<Integer> list, zh3 zh3Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zh3Var.g(i10, list, z10);
    }

    public static void s(int i10, List<Integer> list, zh3 zh3Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zh3Var.j(i10, list, z10);
    }

    public static void t(int i10, List<Integer> list, zh3 zh3Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zh3Var.H(i10, list, z10);
    }

    public static void u(int i10, List<Integer> list, zh3 zh3Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zh3Var.h(i10, list, z10);
    }

    public static void v(int i10, List<Integer> list, zh3 zh3Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zh3Var.c(i10, list, z10);
    }

    public static void w(int i10, List<Boolean> list, zh3 zh3Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zh3Var.d(i10, list, z10);
    }

    public static void x(int i10, List<String> list, zh3 zh3Var) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zh3Var.e(i10, list);
    }

    public static void y(int i10, List<oh3> list, zh3 zh3Var) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zh3Var.f(i10, list);
    }

    public static void z(int i10, List<?> list, zh3 zh3Var, ok3 ok3Var) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i11 = 0; i11 < list.size(); i11++) {
            zh3Var.C(i10, list.get(i11), ok3Var);
        }
    }
}
