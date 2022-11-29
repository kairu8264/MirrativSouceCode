package im;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public final class d extends t<String> {

    /* renamed from: a  reason: collision with root package name */
    public static d f36877a;

    /* renamed from: b  reason: collision with root package name */
    public static final Map<Long, String> f36878b = Collections.unmodifiableMap(new a());

    /* loaded from: classes4.dex */
    public class a extends HashMap<Long, String> {
        public a() {
            put(461L, "FIREPERF_AUTOPUSH");
            put(462L, "FIREPERF");
            put(675L, "FIREPERF_INTERNAL_LOW");
            put(676L, "FIREPERF_INTERNAL_HIGH");
        }
    }

    public static synchronized d e() {
        d dVar;
        synchronized (d.class) {
            if (f36877a == null) {
                f36877a = new d();
            }
            dVar = f36877a;
        }
        return dVar;
    }

    public static String f(long j10) {
        return f36878b.get(Long.valueOf(j10));
    }

    public static boolean g(long j10) {
        return f36878b.containsKey(Long.valueOf(j10));
    }

    @Override // im.t
    public String a() {
        return "com.google.firebase.perf.LogSourceName";
    }

    @Override // im.t
    public String c() {
        return "fpr_log_source";
    }

    public String d() {
        return gm.a.f33663c;
    }
}
