package xh;

import android.annotation.TargetApi;
import android.app.AppOpsManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import android.os.Binder;
import android.os.Process;
import n3.d;
import vh.n;

/* loaded from: classes3.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    public final Context f60294a;

    public b(Context context) {
        this.f60294a = context;
    }

    public int a(String str) {
        return this.f60294a.checkCallingOrSelfPermission(str);
    }

    public int b(String str, String str2) {
        return this.f60294a.getPackageManager().checkPermission(str, str2);
    }

    public ApplicationInfo c(String str, int i10) throws PackageManager.NameNotFoundException {
        return this.f60294a.getPackageManager().getApplicationInfo(str, i10);
    }

    public CharSequence d(String str) throws PackageManager.NameNotFoundException {
        return this.f60294a.getPackageManager().getApplicationLabel(this.f60294a.getPackageManager().getApplicationInfo(str, 0));
    }

    public d<CharSequence, Drawable> e(String str) throws PackageManager.NameNotFoundException {
        ApplicationInfo applicationInfo = this.f60294a.getPackageManager().getApplicationInfo(str, 0);
        return d.a(this.f60294a.getPackageManager().getApplicationLabel(applicationInfo), this.f60294a.getPackageManager().getApplicationIcon(applicationInfo));
    }

    public PackageInfo f(String str, int i10) throws PackageManager.NameNotFoundException {
        return this.f60294a.getPackageManager().getPackageInfo(str, i10);
    }

    public boolean g() {
        String nameForUid;
        if (Binder.getCallingUid() == Process.myUid()) {
            return a.a(this.f60294a);
        }
        if (!n.k() || (nameForUid = this.f60294a.getPackageManager().getNameForUid(Binder.getCallingUid())) == null) {
            return false;
        }
        return this.f60294a.getPackageManager().isInstantApp(nameForUid);
    }

    @TargetApi(19)
    public final boolean h(int i10, String str) {
        if (n.f()) {
            try {
                AppOpsManager appOpsManager = (AppOpsManager) this.f60294a.getSystemService("appops");
                if (appOpsManager != null) {
                    appOpsManager.checkPackage(i10, str);
                    return true;
                }
                throw new NullPointerException("context.getSystemService(Context.APP_OPS_SERVICE) is null");
            } catch (SecurityException unused) {
                return false;
            }
        }
        String[] packagesForUid = this.f60294a.getPackageManager().getPackagesForUid(i10);
        if (str != null && packagesForUid != null) {
            for (String str2 : packagesForUid) {
                if (str.equals(str2)) {
                    return true;
                }
            }
        }
        return false;
    }
}
