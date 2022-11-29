package g1;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class i<T> {
    public static <T> ArrayList<T> a(ArrayList<T> arrayList) {
        jo.p.h(arrayList, "backing");
        return arrayList;
    }

    public static /* synthetic */ ArrayList b(ArrayList arrayList, int i10, jo.h hVar) {
        if ((i10 & 1) != 0) {
            arrayList = new ArrayList();
        }
        return a(arrayList);
    }

    public static final int c(ArrayList<T> arrayList) {
        return arrayList.size();
    }

    public static final T d(ArrayList<T> arrayList) {
        return arrayList.get(c(arrayList) - 1);
    }

    public static final T e(ArrayList<T> arrayList) {
        return arrayList.remove(c(arrayList) - 1);
    }

    public static final boolean f(ArrayList<T> arrayList, T t10) {
        return arrayList.add(t10);
    }
}
