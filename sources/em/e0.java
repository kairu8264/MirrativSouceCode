package em;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.Log;
import java.util.List;

/* loaded from: classes4.dex */
public class e0 {

    /* renamed from: a  reason: collision with root package name */
    public final Context f30673a;

    /* renamed from: b  reason: collision with root package name */
    public String f30674b;

    /* renamed from: c  reason: collision with root package name */
    public String f30675c;

    /* renamed from: d  reason: collision with root package name */
    public int f30676d;

    /* renamed from: e  reason: collision with root package name */
    public int f30677e = 0;

    public e0(Context context) {
        this.f30673a = context;
    }

    public static String c(pk.c cVar) {
        String d10 = cVar.k().d();
        if (d10 != null) {
            return d10;
        }
        String c10 = cVar.k().c();
        if (c10.startsWith("1:")) {
            String[] split = c10.split(":");
            if (split.length < 2) {
                return null;
            }
            String str = split[1];
            if (str.isEmpty()) {
                return null;
            }
            return str;
        }
        return c10;
    }

    public synchronized String a() {
        if (this.f30674b == null) {
            h();
        }
        return this.f30674b;
    }

    public synchronized String b() {
        if (this.f30675c == null) {
            h();
        }
        return this.f30675c;
    }

    public synchronized int d() {
        PackageInfo f10;
        if (this.f30676d == 0 && (f10 = f("com.google.android.gms")) != null) {
            this.f30676d = f10.versionCode;
        }
        return this.f30676d;
    }

    public synchronized int e() {
        int i10 = this.f30677e;
        if (i10 != 0) {
            return i10;
        }
        PackageManager packageManager = this.f30673a.getPackageManager();
        if (packageManager.checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
            Log.e("FirebaseMessaging", "Google Play services missing or without correct permission.");
            return 0;
        }
        int i11 = 1;
        if (!vh.n.k()) {
            Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
            intent.setPackage("com.google.android.gms");
            List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
            if (queryIntentServices != null && queryIntentServices.size() > 0) {
                this.f30677e = 1;
                return 1;
            }
        }
        Intent intent2 = new Intent("com.google.iid.TOKEN_REQUEST");
        intent2.setPackage("com.google.android.gms");
        List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
        if (queryBroadcastReceivers != null && queryBroadcastReceivers.size() > 0) {
            this.f30677e = 2;
            return 2;
        }
        Log.w("FirebaseMessaging", "Failed to resolve IID implementation package, falling back");
        if (vh.n.k()) {
            this.f30677e = 2;
            i11 = 2;
        } else {
            this.f30677e = 1;
        }
        return i11;
    }

    public final PackageInfo f(String str) {
        try {
            return this.f30673a.getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException e10) {
            Log.w("FirebaseMessaging", "Failed to find package ".concat(e10.toString()));
            return null;
        }
    }

    public boolean g() {
        return e() != 0;
    }

    public final synchronized void h() {
        PackageInfo f10 = f(this.f30673a.getPackageName());
        if (f10 != null) {
            this.f30674b = Integer.toString(f10.versionCode);
            this.f30675c = f10.versionName;
        }
    }
}
