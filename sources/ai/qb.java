package ai;

import android.os.Trace;

/* loaded from: classes3.dex */
public final class qb {
    public static void a(String str) {
        if (sb.f9778a >= 18) {
            Trace.beginSection(str);
        }
    }

    public static void b() {
        if (sb.f9778a >= 18) {
            Trace.endSection();
        }
    }
}
