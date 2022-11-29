package nh;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.util.Log;

/* loaded from: classes3.dex */
public class h {

    /* renamed from: c  reason: collision with root package name */
    public static h f43553c;

    /* renamed from: a  reason: collision with root package name */
    public final Context f43554a;

    /* renamed from: b  reason: collision with root package name */
    public volatile String f43555b;

    public h(Context context) {
        this.f43554a = context.getApplicationContext();
    }

    public static h a(Context context) {
        rh.p.i(context);
        synchronized (h.class) {
            if (f43553c == null) {
                w.d(context);
                f43553c = new h(context);
            }
        }
        return f43553c;
    }

    public static final s d(PackageInfo packageInfo, s... sVarArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr == null) {
            return null;
        }
        if (signatureArr.length != 1) {
            Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
            return null;
        }
        t tVar = new t(packageInfo.signatures[0].toByteArray());
        for (int i10 = 0; i10 < sVarArr.length; i10++) {
            if (sVarArr[i10].equals(tVar)) {
                return sVarArr[i10];
            }
        }
        return null;
    }

    public static final boolean e(PackageInfo packageInfo, boolean z10) {
        if (packageInfo != null && packageInfo.signatures != null) {
            if ((z10 ? d(packageInfo, v.f43566a) : d(packageInfo, v.f43566a[0])) != null) {
                return true;
            }
        }
        return false;
    }

    public boolean b(PackageInfo packageInfo) {
        if (packageInfo == null) {
            return false;
        }
        if (e(packageInfo, false)) {
            return true;
        }
        if (e(packageInfo, true)) {
            if (g.e(this.f43554a)) {
                return true;
            }
            Log.w("GoogleSignatureVerifier", "Test-keys aren't accepted on this build.");
        }
        return false;
    }

    public boolean c(int i10) {
        g0 c10;
        int length;
        String[] packagesForUid = this.f43554a.getPackageManager().getPackagesForUid(i10);
        if (packagesForUid != null && (length = packagesForUid.length) != 0) {
            c10 = null;
            int i11 = 0;
            while (true) {
                if (i11 < length) {
                    c10 = f(packagesForUid[i11], false, false);
                    if (c10.f43550a) {
                        break;
                    }
                    i11++;
                } else {
                    rh.p.i(c10);
                    break;
                }
            }
        } else {
            c10 = g0.c("no pkgs");
        }
        c10.e();
        return c10.f43550a;
    }

    @SuppressLint({"PackageManagerGetSignatures"})
    public final g0 f(String str, boolean z10, boolean z11) {
        g0 c10;
        ApplicationInfo applicationInfo;
        if (str == null) {
            return g0.c("null pkg");
        }
        if (!str.equals(this.f43555b)) {
            if (w.e()) {
                c10 = w.b(str, g.e(this.f43554a), false, false);
            } else {
                try {
                    PackageInfo packageInfo = this.f43554a.getPackageManager().getPackageInfo(str, 64);
                    boolean e10 = g.e(this.f43554a);
                    if (packageInfo == null) {
                        c10 = g0.c("null pkg");
                    } else {
                        Signature[] signatureArr = packageInfo.signatures;
                        if (signatureArr != null && signatureArr.length == 1) {
                            t tVar = new t(packageInfo.signatures[0].toByteArray());
                            String str2 = packageInfo.packageName;
                            g0 a10 = w.a(str2, tVar, e10, false);
                            c10 = (!a10.f43550a || (applicationInfo = packageInfo.applicationInfo) == null || (applicationInfo.flags & 2) == 0 || !w.a(str2, tVar, false, true).f43550a) ? a10 : g0.c("debuggable release cert app rejected");
                        } else {
                            c10 = g0.c("single cert required");
                        }
                    }
                } catch (PackageManager.NameNotFoundException e11) {
                    return g0.d(str.length() != 0 ? "no pkg ".concat(str) : new String("no pkg "), e11);
                }
            }
            if (c10.f43550a) {
                this.f43555b = str;
            }
            return c10;
        }
        return g0.b();
    }
}
