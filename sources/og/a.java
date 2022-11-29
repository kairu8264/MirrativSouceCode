package og;

import android.util.SparseArray;
import java.util.HashMap;
import zf.d;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static SparseArray<d> f45428a = new SparseArray<>();

    /* renamed from: b  reason: collision with root package name */
    public static HashMap<d, Integer> f45429b;

    static {
        HashMap<d, Integer> hashMap = new HashMap<>();
        f45429b = hashMap;
        hashMap.put(d.DEFAULT, 0);
        f45429b.put(d.VERY_LOW, 1);
        f45429b.put(d.HIGHEST, 2);
        for (d dVar : f45429b.keySet()) {
            f45428a.append(f45429b.get(dVar).intValue(), dVar);
        }
    }

    public static int a(d dVar) {
        Integer num = f45429b.get(dVar);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("PriorityMapping is missing known Priority value " + dVar);
    }

    public static d b(int i10) {
        d dVar = f45428a.get(i10);
        if (dVar != null) {
            return dVar;
        }
        throw new IllegalArgumentException("Unknown Priority for value " + i10);
    }
}
