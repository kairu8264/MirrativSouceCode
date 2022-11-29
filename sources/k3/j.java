package k3;

import android.os.Build;
import android.os.Trace;
import android.util.Log;
import java.lang.reflect.Method;

@Deprecated
/* loaded from: classes.dex */
public final class j {

    /* renamed from: a  reason: collision with root package name */
    public static long f38385a;

    /* renamed from: b  reason: collision with root package name */
    public static Method f38386b;

    /* renamed from: c  reason: collision with root package name */
    public static Method f38387c;

    /* renamed from: d  reason: collision with root package name */
    public static Method f38388d;

    /* renamed from: e  reason: collision with root package name */
    public static Method f38389e;

    static {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 18 || i10 >= 29) {
            return;
        }
        try {
            f38385a = Trace.class.getField("TRACE_TAG_APP").getLong(null);
            Class cls = Long.TYPE;
            f38386b = Trace.class.getMethod("isTagEnabled", cls);
            Class cls2 = Integer.TYPE;
            f38387c = Trace.class.getMethod("asyncTraceBegin", cls, String.class, cls2);
            f38388d = Trace.class.getMethod("asyncTraceEnd", cls, String.class, cls2);
            f38389e = Trace.class.getMethod("traceCounter", cls, String.class, cls2);
        } catch (Exception e10) {
            Log.i("TraceCompat", "Unable to initialize via reflection.", e10);
        }
    }

    public static void a(String str) {
        if (Build.VERSION.SDK_INT >= 18) {
            Trace.beginSection(str);
        }
    }

    public static void b() {
        if (Build.VERSION.SDK_INT >= 18) {
            Trace.endSection();
        }
    }
}
