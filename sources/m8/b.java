package m8;

import android.util.Log;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    public static final String f40621a = "b";

    public static void a(Map<Class<?>, List<n8.c>> map) {
        Log.i(f40621a, "# SOURCE -> FILTER... -> OUTPUT");
        for (Class<?> cls : map.keySet()) {
            for (n8.c cVar : map.get(cls)) {
                StringBuilder sb2 = new StringBuilder(cls.getSimpleName());
                for (k8.b bVar : cVar.f()) {
                    sb2.append(" -> ");
                    sb2.append(bVar.getClass().getSimpleName());
                }
                sb2.append(" -> ");
                sb2.append(cVar.getClass().getSimpleName());
                Log.i(f40621a, sb2.toString());
            }
        }
    }
}
