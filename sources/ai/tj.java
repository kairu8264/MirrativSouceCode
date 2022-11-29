package ai;

import android.os.Trace;

/* loaded from: classes3.dex */
public final class tj {
    public static void a(String str) {
        if (vj.f11100a >= 18) {
            Trace.beginSection(str);
        }
    }

    public static void b() {
        if (vj.f11100a >= 18) {
            Trace.endSection();
        }
    }
}
