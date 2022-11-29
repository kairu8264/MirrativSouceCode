package vh;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import com.dena.mirrorman.clientlog.logs.MRLog;

/* loaded from: classes3.dex */
public final class j {

    /* renamed from: a  reason: collision with root package name */
    public static Boolean f57330a;

    /* renamed from: b  reason: collision with root package name */
    public static Boolean f57331b;

    /* renamed from: c  reason: collision with root package name */
    public static Boolean f57332c;

    /* renamed from: d  reason: collision with root package name */
    public static Boolean f57333d;

    /* renamed from: e  reason: collision with root package name */
    public static Boolean f57334e;

    public static boolean a(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (f57334e == null) {
            boolean z10 = false;
            if (n.k() && packageManager.hasSystemFeature("android.hardware.type.automotive")) {
                z10 = true;
            }
            f57334e = Boolean.valueOf(z10);
        }
        return f57334e.booleanValue();
    }

    public static boolean b(Context context) {
        if (f57332c == null) {
            PackageManager packageManager = context.getPackageManager();
            boolean z10 = false;
            if (packageManager.hasSystemFeature("com.google.android.feature.services_updater") && packageManager.hasSystemFeature("cn.google.services")) {
                z10 = true;
            }
            f57332c = Boolean.valueOf(z10);
        }
        return f57332c.booleanValue();
    }

    @TargetApi(21)
    public static boolean c(Context context) {
        return g(context);
    }

    public static boolean d() {
        int i10 = nh.g.f43544a;
        return MRLog.TARGET_TYPE_USER.equals(Build.TYPE);
    }

    @TargetApi(20)
    public static boolean e(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (f57330a == null) {
            boolean z10 = false;
            if (n.g() && packageManager.hasSystemFeature("android.hardware.type.watch")) {
                z10 = true;
            }
            f57330a = Boolean.valueOf(z10);
        }
        return f57330a.booleanValue();
    }

    @TargetApi(26)
    public static boolean f(Context context) {
        if (e(context)) {
            if (!n.j()) {
                return true;
            }
            if (g(context) && !n.k()) {
                return true;
            }
        }
        return false;
    }

    @TargetApi(21)
    public static boolean g(Context context) {
        if (f57331b == null) {
            boolean z10 = false;
            if (n.h() && context.getPackageManager().hasSystemFeature("cn.google")) {
                z10 = true;
            }
            f57331b = Boolean.valueOf(z10);
        }
        return f57331b.booleanValue();
    }

    public static boolean h(Context context) {
        if (f57333d == null) {
            boolean z10 = true;
            if (!context.getPackageManager().hasSystemFeature("android.hardware.type.iot") && !context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) {
                z10 = false;
            }
            f57333d = Boolean.valueOf(z10);
        }
        return f57333d.booleanValue();
    }
}
