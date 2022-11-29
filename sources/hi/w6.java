package hi;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class w6 {
    public static q a(o5 o5Var) {
        if (o5Var == null) {
            return q.f35921f;
        }
        int A = o5Var.A() - 1;
        if (A == 1) {
            if (o5Var.z()) {
                return new u(o5Var.u());
            }
            return q.f35928m;
        } else if (A == 2) {
            if (o5Var.y()) {
                return new i(Double.valueOf(o5Var.r()));
            }
            return new i(null);
        } else if (A == 3) {
            if (o5Var.x()) {
                return new g(Boolean.valueOf(o5Var.w()));
            }
            return new g(null);
        } else if (A == 4) {
            List<o5> v10 = o5Var.v();
            ArrayList arrayList = new ArrayList();
            for (o5 o5Var2 : v10) {
                arrayList.add(a(o5Var2));
            }
            return new r(o5Var.t(), arrayList);
        } else {
            throw new IllegalArgumentException("Unknown type found. Cannot convert entity");
        }
    }

    public static q b(Object obj) {
        if (obj == null) {
            return q.f35922g;
        }
        if (obj instanceof String) {
            return new u((String) obj);
        }
        if (obj instanceof Double) {
            return new i((Double) obj);
        }
        if (obj instanceof Long) {
            return new i(Double.valueOf(((Long) obj).doubleValue()));
        }
        if (obj instanceof Integer) {
            return new i(Double.valueOf(((Integer) obj).doubleValue()));
        }
        if (obj instanceof Boolean) {
            return new g((Boolean) obj);
        }
        if (obj instanceof Map) {
            n nVar = new n();
            Map map = (Map) obj;
            for (Object obj2 : map.keySet()) {
                q b10 = b(map.get(obj2));
                if (obj2 != null) {
                    if (!(obj2 instanceof String)) {
                        obj2 = obj2.toString();
                    }
                    nVar.k((String) obj2, b10);
                }
            }
            return nVar;
        } else if (obj instanceof List) {
            f fVar = new f();
            for (Object obj3 : (List) obj) {
                fVar.B(fVar.p(), b(obj3));
            }
            return fVar;
        } else {
            throw new IllegalArgumentException("Invalid value type");
        }
    }
}
