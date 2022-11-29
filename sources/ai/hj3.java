package ai;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class hj3 extends kj3 {

    /* renamed from: c  reason: collision with root package name */
    public static final Class<?> f4875c = Collections.unmodifiableList(Collections.emptyList()).getClass();

    public /* synthetic */ hj3(jj3 jj3Var) {
        super(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <L> List<L> f(Object obj, long j10, int i10) {
        fj3 fj3Var;
        List<L> arrayList;
        List<L> list = (List) nl3.v(obj, j10);
        if (list.isEmpty()) {
            if (list instanceof gj3) {
                arrayList = new fj3(i10);
            } else if ((list instanceof ek3) && (list instanceof aj3)) {
                arrayList = ((aj3) list).i(i10);
            } else {
                arrayList = new ArrayList<>(i10);
            }
            nl3.w(obj, j10, arrayList);
            return arrayList;
        }
        if (f4875c.isAssignableFrom(list.getClass())) {
            ArrayList arrayList2 = new ArrayList(list.size() + i10);
            arrayList2.addAll(list);
            nl3.w(obj, j10, arrayList2);
            fj3Var = arrayList2;
        } else if (list instanceof il3) {
            fj3 fj3Var2 = new fj3(list.size() + i10);
            fj3Var2.addAll(fj3Var2.size(), (il3) list);
            nl3.w(obj, j10, fj3Var2);
            fj3Var = fj3Var2;
        } else if ((list instanceof ek3) && (list instanceof aj3)) {
            aj3 aj3Var = (aj3) list;
            if (aj3Var.zza()) {
                return list;
            }
            aj3 i11 = aj3Var.i(list.size() + i10);
            nl3.w(obj, j10, i11);
            return i11;
        } else {
            return list;
        }
        return fj3Var;
    }

    @Override // ai.kj3
    public final <L> List<L> a(Object obj, long j10) {
        return f(obj, j10, 10);
    }

    @Override // ai.kj3
    public final void b(Object obj, long j10) {
        Object unmodifiableList;
        List list = (List) nl3.v(obj, j10);
        if (list instanceof gj3) {
            unmodifiableList = ((gj3) list).h();
        } else if (f4875c.isAssignableFrom(list.getClass())) {
            return;
        } else {
            if ((list instanceof ek3) && (list instanceof aj3)) {
                aj3 aj3Var = (aj3) list;
                if (aj3Var.zza()) {
                    aj3Var.zzb();
                    return;
                }
                return;
            }
            unmodifiableList = Collections.unmodifiableList(list);
        }
        nl3.w(obj, j10, unmodifiableList);
    }

    @Override // ai.kj3
    public final <E> void c(Object obj, Object obj2, long j10) {
        List list = (List) nl3.v(obj2, j10);
        List f10 = f(obj, j10, list.size());
        int size = f10.size();
        int size2 = list.size();
        if (size > 0 && size2 > 0) {
            f10.addAll(list);
        }
        if (size > 0) {
            list = f10;
        }
        nl3.w(obj, j10, list);
    }
}
