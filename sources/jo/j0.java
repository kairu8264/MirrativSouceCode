package jo;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import ko.e;

/* loaded from: classes4.dex */
public class j0 {
    public static Collection a(Object obj) {
        if ((obj instanceof ko.a) && !(obj instanceof ko.b)) {
            p(obj, "kotlin.collections.MutableCollection");
        }
        return f(obj);
    }

    public static Iterable b(Object obj) {
        if ((obj instanceof ko.a) && !(obj instanceof ko.c)) {
            p(obj, "kotlin.collections.MutableIterable");
        }
        return g(obj);
    }

    public static List c(Object obj) {
        if ((obj instanceof ko.a) && !(obj instanceof ko.d)) {
            p(obj, "kotlin.collections.MutableList");
        }
        return h(obj);
    }

    public static Map d(Object obj) {
        if ((obj instanceof ko.a) && !(obj instanceof ko.e)) {
            p(obj, "kotlin.collections.MutableMap");
        }
        return i(obj);
    }

    public static Object e(Object obj, int i10) {
        if (obj != null && !k(obj, i10)) {
            p(obj, "kotlin.jvm.functions.Function" + i10);
        }
        return obj;
    }

    public static Collection f(Object obj) {
        try {
            return (Collection) obj;
        } catch (ClassCastException e10) {
            throw o(e10);
        }
    }

    public static Iterable g(Object obj) {
        try {
            return (Iterable) obj;
        } catch (ClassCastException e10) {
            throw o(e10);
        }
    }

    public static List h(Object obj) {
        try {
            return (List) obj;
        } catch (ClassCastException e10) {
            throw o(e10);
        }
    }

    public static Map i(Object obj) {
        try {
            return (Map) obj;
        } catch (ClassCastException e10) {
            throw o(e10);
        }
    }

    public static int j(Object obj) {
        if (obj instanceof k) {
            return ((k) obj).getArity();
        }
        if (obj instanceof io.a) {
            return 0;
        }
        if (obj instanceof io.l) {
            return 1;
        }
        if (obj instanceof io.p) {
            return 2;
        }
        if (obj instanceof io.q) {
            return 3;
        }
        if (obj instanceof io.r) {
            return 4;
        }
        if (obj instanceof io.s) {
            return 5;
        }
        if (obj instanceof io.t) {
            return 6;
        }
        if (obj instanceof io.u) {
            return 7;
        }
        if (obj instanceof io.v) {
            return 8;
        }
        if (obj instanceof io.w) {
            return 9;
        }
        if (obj instanceof io.b) {
            return 10;
        }
        if (obj instanceof io.c) {
            return 11;
        }
        if (obj instanceof io.d) {
            return 12;
        }
        if (obj instanceof io.e) {
            return 13;
        }
        if (obj instanceof io.f) {
            return 14;
        }
        if (obj instanceof io.g) {
            return 15;
        }
        if (obj instanceof io.h) {
            return 16;
        }
        if (obj instanceof io.i) {
            return 17;
        }
        if (obj instanceof io.j) {
            return 18;
        }
        if (obj instanceof io.k) {
            return 19;
        }
        if (obj instanceof io.m) {
            return 20;
        }
        if (obj instanceof io.n) {
            return 21;
        }
        return obj instanceof io.o ? 22 : -1;
    }

    public static boolean k(Object obj, int i10) {
        return (obj instanceof wn.b) && j(obj) == i10;
    }

    public static boolean l(Object obj) {
        return (obj instanceof Map.Entry) && (!(obj instanceof ko.a) || (obj instanceof e.a));
    }

    public static boolean m(Object obj) {
        return (obj instanceof Set) && (!(obj instanceof ko.a) || (obj instanceof ko.f));
    }

    public static <T extends Throwable> T n(T t10) {
        return (T) p.n(t10, j0.class.getName());
    }

    public static ClassCastException o(ClassCastException classCastException) {
        throw ((ClassCastException) n(classCastException));
    }

    public static void p(Object obj, String str) {
        String name = obj == null ? "null" : obj.getClass().getName();
        q(name + " cannot be cast to " + str);
    }

    public static void q(String str) {
        throw o(new ClassCastException(str));
    }
}
