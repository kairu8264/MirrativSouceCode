package dm;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import ul.c;

/* loaded from: classes4.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    public final Context f29725a;

    /* renamed from: b  reason: collision with root package name */
    public final SharedPreferences f29726b;

    /* renamed from: c  reason: collision with root package name */
    public final c f29727c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f29728d;

    public a(Context context, String str, c cVar) {
        Context a10 = a(context);
        this.f29725a = a10;
        this.f29726b = a10.getSharedPreferences("com.google.firebase.common.prefs:" + str, 0);
        this.f29727c = cVar;
        this.f29728d = c();
    }

    public static Context a(Context context) {
        return Build.VERSION.SDK_INT < 24 ? context : c3.a.b(context);
    }

    public synchronized boolean b() {
        return this.f29728d;
    }

    public final boolean c() {
        if (this.f29726b.contains("firebase_data_collection_default_enabled")) {
            return this.f29726b.getBoolean("firebase_data_collection_default_enabled", true);
        }
        return d();
    }

    public final boolean d() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            PackageManager packageManager = this.f29725a.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(this.f29725a.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_data_collection_default_enabled")) {
                return true;
            }
            return applicationInfo.metaData.getBoolean("firebase_data_collection_default_enabled");
        } catch (PackageManager.NameNotFoundException unused) {
            return true;
        }
    }
}
