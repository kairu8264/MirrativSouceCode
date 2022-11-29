package f5;

import android.os.Trace;

/* loaded from: classes.dex */
public final class b {
    public static void a(String str) {
        Trace.beginSection(str);
    }

    public static void b() {
        Trace.endSection();
    }
}
