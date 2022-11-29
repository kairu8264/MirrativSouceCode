package ai;

import android.content.Context;

/* loaded from: classes3.dex */
public final class om2 {
    public static void a(int i10, Throwable th2, String str) {
        StringBuilder sb2 = new StringBuilder(31);
        sb2.append("Ad failed to load : ");
        sb2.append(i10);
        uj0.e(sb2.toString());
        yg.p1.l(str, th2);
        if (i10 == 3) {
            return;
        }
        wg.t.h().l(th2, str);
    }

    public static void b(Context context, boolean z10) {
        if (z10) {
            uj0.e("This request is sent from a test device.");
            return;
        }
        dt.a();
        String r10 = nj0.r(context);
        StringBuilder sb2 = new StringBuilder(String.valueOf(r10).length() + 102);
        sb2.append("Use RequestConfiguration.Builder().setTestDeviceIds(Arrays.asList(\"");
        sb2.append(r10);
        sb2.append("\")) to get test ads on this device.");
        uj0.e(sb2.toString());
    }
}
