package al;

import android.content.Context;

/* loaded from: classes2.dex */
public class x {

    /* renamed from: a  reason: collision with root package name */
    public String f13897a;

    public static String b(Context context) {
        String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
        return installerPackageName == null ? "" : installerPackageName;
    }

    public synchronized String a(Context context) {
        if (this.f13897a == null) {
            this.f13897a = b(context);
        }
        return "".equals(this.f13897a) ? null : this.f13897a;
    }
}
