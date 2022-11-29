package zo;

import java.util.Iterator;
import java.util.List;
import java.util.ServiceLoader;
import uo.o2;

/* loaded from: classes4.dex */
public final class z {

    /* renamed from: a  reason: collision with root package name */
    public static final z f63353a;

    /* renamed from: b  reason: collision with root package name */
    public static final boolean f63354b;

    /* renamed from: c  reason: collision with root package name */
    public static final o2 f63355c;

    static {
        z zVar = new z();
        f63353a = zVar;
        f63354b = l0.e("kotlinx.coroutines.fast.service.loader", true);
        f63355c = zVar.a();
    }

    public final o2 a() {
        List<y> v10;
        Object next;
        try {
            if (f63354b) {
                v10 = n.f63309a.c();
            } else {
                v10 = ro.n.v(ro.l.c(ServiceLoader.load(y.class, y.class.getClassLoader()).iterator()));
            }
            Iterator<T> it = v10.iterator();
            if (it.hasNext()) {
                next = it.next();
                if (it.hasNext()) {
                    int loadPriority = ((y) next).getLoadPriority();
                    do {
                        Object next2 = it.next();
                        int loadPriority2 = ((y) next2).getLoadPriority();
                        if (loadPriority < loadPriority2) {
                            next = next2;
                            loadPriority = loadPriority2;
                        }
                    } while (it.hasNext());
                }
            } else {
                next = null;
            }
            y yVar = (y) next;
            o2 e10 = yVar == null ? null : a0.e(yVar, v10);
            return e10 == null ? a0.b(null, null, 3, null) : e10;
        } catch (Throwable th2) {
            return a0.b(th2, null, 2, null);
        }
    }
}
