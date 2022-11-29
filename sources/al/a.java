package al;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;

/* loaded from: classes2.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    public final String f13739a;

    /* renamed from: b  reason: collision with root package name */
    public final String f13740b;

    /* renamed from: c  reason: collision with root package name */
    public final String f13741c;

    /* renamed from: d  reason: collision with root package name */
    public final String f13742d;

    /* renamed from: e  reason: collision with root package name */
    public final String f13743e;

    /* renamed from: f  reason: collision with root package name */
    public final String f13744f;

    /* renamed from: g  reason: collision with root package name */
    public final xk.e f13745g;

    public a(String str, String str2, String str3, String str4, String str5, String str6, xk.e eVar) {
        this.f13739a = str;
        this.f13740b = str2;
        this.f13741c = str3;
        this.f13742d = str4;
        this.f13743e = str5;
        this.f13744f = str6;
        this.f13745g = eVar;
    }

    public static a a(Context context, v vVar, String str, String str2, xk.e eVar) throws PackageManager.NameNotFoundException {
        String packageName = context.getPackageName();
        String g10 = vVar.g();
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
        String num = Integer.toString(packageInfo.versionCode);
        String str3 = packageInfo.versionName;
        if (str3 == null) {
            str3 = "0.0";
        }
        return new a(str, str2, g10, packageName, num, str3, eVar);
    }
}
