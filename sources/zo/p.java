package zo;

import java.util.ArrayList;
import java.util.List;
import uo.u0;

/* loaded from: classes4.dex */
public final class p<E> {
    public static <E> Object a(Object obj) {
        return obj;
    }

    public static /* synthetic */ Object b(Object obj, int i10, jo.h hVar) {
        if ((i10 & 1) != 0) {
            obj = null;
        }
        return a(obj);
    }

    public static final Object c(Object obj, E e10) {
        if (!u0.a() || (!(e10 instanceof List))) {
            if (obj == null) {
                return a(e10);
            }
            if (obj instanceof ArrayList) {
                ((ArrayList) obj).add(e10);
                return a(obj);
            }
            ArrayList arrayList = new ArrayList(4);
            arrayList.add(obj);
            arrayList.add(e10);
            return a(arrayList);
        }
        throw new AssertionError();
    }
}
