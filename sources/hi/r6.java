package hi;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.StrictMode;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes3.dex */
public final class r6 implements a6 {

    /* renamed from: b  reason: collision with root package name */
    public static final Map<String, r6> f35971b = new s.a();

    /* renamed from: a  reason: collision with root package name */
    public final SharedPreferences f35972a;

    public static r6 a(Context context, String str) {
        r6 r6Var;
        if (!r5.a()) {
            synchronized (r6.class) {
                r6Var = f35971b.get(null);
                if (r6Var == null) {
                    StrictMode.allowThreadDiskReads();
                    throw null;
                }
            }
            return r6Var;
        }
        throw null;
    }

    public static synchronized void b() {
        synchronized (r6.class) {
            Map<String, r6> map = f35971b;
            Iterator<r6> it = map.values().iterator();
            if (!it.hasNext()) {
                map.clear();
            } else {
                SharedPreferences sharedPreferences = it.next().f35972a;
                throw null;
            }
        }
    }

    @Override // hi.a6
    public final Object t(String str) {
        throw null;
    }
}
