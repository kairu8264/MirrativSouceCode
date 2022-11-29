package hi;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class v5 {
    public static double a(double d10) {
        int i10;
        if (Double.isNaN(d10)) {
            return 0.0d;
        }
        if (Double.isInfinite(d10) || d10 == 0.0d || i10 == 0) {
            return d10;
        }
        return (i10 > 0 ? 1 : -1) * Math.floor(Math.abs(d10));
    }

    public static int b(double d10) {
        int i10;
        if (Double.isNaN(d10) || Double.isInfinite(d10) || d10 == 0.0d) {
            return 0;
        }
        return (int) (((i10 > 0 ? 1 : -1) * Math.floor(Math.abs(d10))) % 4.294967296E9d);
    }

    public static int c(u4 u4Var) {
        int b10 = b(u4Var.d("runtime.counter").e().doubleValue() + 1.0d);
        if (b10 <= 1000000) {
            u4Var.g("runtime.counter", new i(Double.valueOf(b10)));
            return b10;
        }
        throw new IllegalStateException("Instructions allowed exceeded");
    }

    public static long d(double d10) {
        return b(d10) & 4294967295L;
    }

    public static n0 e(String str) {
        n0 n0Var = null;
        if (str != null && !str.isEmpty()) {
            n0Var = n0.a(Integer.parseInt(str));
        }
        if (n0Var != null) {
            return n0Var;
        }
        throw new IllegalArgumentException(String.format("Unsupported commandId %s", str));
    }

    public static Object f(q qVar) {
        if (q.f35922g.equals(qVar)) {
            return null;
        }
        if (q.f35921f.equals(qVar)) {
            return "";
        }
        if (qVar instanceof n) {
            return g((n) qVar);
        }
        if (qVar instanceof f) {
            ArrayList arrayList = new ArrayList();
            Iterator<q> it = ((f) qVar).iterator();
            while (it.hasNext()) {
                Object f10 = f(it.next());
                if (f10 != null) {
                    arrayList.add(f10);
                }
            }
            return arrayList;
        } else if (!qVar.e().isNaN()) {
            return qVar.e();
        } else {
            return qVar.h();
        }
    }

    public static Map<String, Object> g(n nVar) {
        HashMap hashMap = new HashMap();
        for (String str : nVar.a()) {
            Object f10 = f(nVar.s(str));
            if (f10 != null) {
                hashMap.put(str, f10);
            }
        }
        return hashMap;
    }

    public static void h(String str, int i10, List<q> list) {
        if (list.size() != i10) {
            throw new IllegalArgumentException(String.format("%s operation requires %s parameters found %s", str, Integer.valueOf(i10), Integer.valueOf(list.size())));
        }
    }

    public static void i(String str, int i10, List<q> list) {
        if (list.size() < i10) {
            throw new IllegalArgumentException(String.format("%s operation requires at least %s parameters found %s", str, Integer.valueOf(i10), Integer.valueOf(list.size())));
        }
    }

    public static void j(String str, int i10, List<q> list) {
        if (list.size() > i10) {
            throw new IllegalArgumentException(String.format("%s operation requires at most %s parameters found %s", str, Integer.valueOf(i10), Integer.valueOf(list.size())));
        }
    }

    public static boolean k(q qVar) {
        if (qVar == null) {
            return false;
        }
        Double e10 = qVar.e();
        return !e10.isNaN() && e10.doubleValue() >= 0.0d && e10.equals(Double.valueOf(Math.floor(e10.doubleValue())));
    }

    public static boolean l(q qVar, q qVar2) {
        if (qVar.getClass().equals(qVar2.getClass())) {
            if ((qVar instanceof v) || (qVar instanceof o)) {
                return true;
            }
            if (qVar instanceof i) {
                if (Double.isNaN(qVar.e().doubleValue()) || Double.isNaN(qVar2.e().doubleValue())) {
                    return false;
                }
                return qVar.e().equals(qVar2.e());
            } else if (qVar instanceof u) {
                return qVar.h().equals(qVar2.h());
            } else {
                if (qVar instanceof g) {
                    return qVar.f().equals(qVar2.f());
                }
                return qVar == qVar2;
            }
        }
        return false;
    }
}
