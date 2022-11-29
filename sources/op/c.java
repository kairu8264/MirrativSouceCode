package op;

import android.util.Log;
import ep.z;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Level;
import java.util.logging.Logger;
import jo.p;
import so.o;
import so.q;
import xn.n0;

/* loaded from: classes4.dex */
public final class c {

    /* renamed from: b  reason: collision with root package name */
    public static final Map<String, String> f45495b;

    /* renamed from: c  reason: collision with root package name */
    public static final c f45496c = new c();

    /* renamed from: a  reason: collision with root package name */
    public static final CopyOnWriteArraySet<Logger> f45494a = new CopyOnWriteArraySet<>();

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Package r12 = z.class.getPackage();
        String name = r12 != null ? r12.getName() : null;
        if (name != null) {
            linkedHashMap.put(name, "OkHttp");
        }
        String name2 = z.class.getName();
        p.g(name2, "OkHttpClient::class.java.name");
        linkedHashMap.put(name2, "okhttp.OkHttpClient");
        String name3 = mp.d.class.getName();
        p.g(name3, "Http2::class.java.name");
        linkedHashMap.put(name3, "okhttp.Http2");
        String name4 = ip.e.class.getName();
        p.g(name4, "TaskRunner::class.java.name");
        linkedHashMap.put(name4, "okhttp.TaskRunner");
        linkedHashMap.put("okhttp3.mockwebserver.MockWebServer", "okhttp.MockWebServer");
        f45495b = n0.n(linkedHashMap);
    }

    public final void a(String str, int i10, String str2, Throwable th2) {
        int min;
        p.h(str, "loggerName");
        p.h(str2, "message");
        String d10 = d(str);
        if (Log.isLoggable(d10, i10)) {
            if (th2 != null) {
                str2 = str2 + "\n" + Log.getStackTraceString(th2);
            }
            int i11 = 0;
            int length = str2.length();
            while (i11 < length) {
                int T = o.T(str2, '\n', i11, false, 4, null);
                if (T == -1) {
                    T = length;
                }
                while (true) {
                    min = Math.min(T, i11 + 4000);
                    String substring = str2.substring(i11, min);
                    p.g(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    Log.println(i10, d10, substring);
                    if (min >= T) {
                        break;
                    }
                    i11 = min;
                }
                i11 = min + 1;
            }
        }
    }

    public final void b() {
        for (Map.Entry<String, String> entry : f45495b.entrySet()) {
            c(entry.getKey(), entry.getValue());
        }
    }

    public final void c(String str, String str2) {
        Level level;
        Logger logger = Logger.getLogger(str);
        if (f45494a.add(logger)) {
            p.g(logger, "logger");
            logger.setUseParentHandlers(false);
            if (Log.isLoggable(str2, 3)) {
                level = Level.FINE;
            } else {
                level = Log.isLoggable(str2, 4) ? Level.INFO : Level.WARNING;
            }
            logger.setLevel(level);
            logger.addHandler(d.f45497a);
        }
    }

    public final String d(String str) {
        String str2 = f45495b.get(str);
        return str2 != null ? str2 : q.S0(str, 23);
    }
}
