package hi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class h9 extends j9 {

    /* renamed from: c  reason: collision with root package name */
    public static final Class<?> f35803c = Collections.unmodifiableList(Collections.emptyList()).getClass();

    public /* synthetic */ h9(g9 g9Var) {
        super(null);
    }

    @Override // hi.j9
    public final void a(Object obj, long j10) {
        Object unmodifiableList;
        List list = (List) fb.k(obj, j10);
        if (list instanceof f9) {
            unmodifiableList = ((f9) list).c();
        } else if (f35803c.isAssignableFrom(list.getClass())) {
            return;
        } else {
            if ((list instanceof da) && (list instanceof a9)) {
                a9 a9Var = (a9) list;
                if (a9Var.b()) {
                    a9Var.zzb();
                    return;
                }
                return;
            }
            unmodifiableList = Collections.unmodifiableList(list);
        }
        fb.x(obj, j10, unmodifiableList);
    }

    @Override // hi.j9
    public final <E> void b(Object obj, Object obj2, long j10) {
        ArrayList arrayList;
        List list = (List) fb.k(obj2, j10);
        int size = list.size();
        List list2 = (List) fb.k(obj, j10);
        if (list2.isEmpty()) {
            if (list2 instanceof f9) {
                list2 = new e9(size);
            } else if ((list2 instanceof da) && (list2 instanceof a9)) {
                list2 = ((a9) list2).v(size);
            } else {
                list2 = new ArrayList(size);
            }
            fb.x(obj, j10, list2);
        } else {
            if (f35803c.isAssignableFrom(list2.getClass())) {
                ArrayList arrayList2 = new ArrayList(list2.size() + size);
                arrayList2.addAll(list2);
                fb.x(obj, j10, arrayList2);
                arrayList = arrayList2;
            } else if (list2 instanceof ab) {
                e9 e9Var = new e9(list2.size() + size);
                e9Var.addAll(e9Var.size(), (ab) list2);
                fb.x(obj, j10, e9Var);
                arrayList = e9Var;
            } else if ((list2 instanceof da) && (list2 instanceof a9)) {
                a9 a9Var = (a9) list2;
                if (!a9Var.b()) {
                    list2 = a9Var.v(list2.size() + size);
                    fb.x(obj, j10, list2);
                }
            }
            list2 = arrayList;
        }
        int size2 = list2.size();
        int size3 = list.size();
        if (size2 > 0 && size3 > 0) {
            list2.addAll(list);
        }
        if (size2 > 0) {
            list = list2;
        }
        fb.x(obj, j10, list);
    }
}
