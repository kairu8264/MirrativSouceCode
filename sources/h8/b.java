package h8;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import m7.e;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final ConcurrentMap<String, e> f34591a = new ConcurrentHashMap();

    public static PackageInfo a(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
        } catch (PackageManager.NameNotFoundException e10) {
            Log.e("AppVersionSignature", "Cannot resolve info for" + context.getPackageName(), e10);
            return null;
        }
    }

    public static String b(PackageInfo packageInfo) {
        if (packageInfo != null) {
            return String.valueOf(packageInfo.versionCode);
        }
        return UUID.randomUUID().toString();
    }

    public static e c(Context context) {
        String packageName = context.getPackageName();
        ConcurrentMap<String, e> concurrentMap = f34591a;
        e eVar = concurrentMap.get(packageName);
        if (eVar == null) {
            e d10 = d(context);
            e putIfAbsent = concurrentMap.putIfAbsent(packageName, d10);
            return putIfAbsent == null ? d10 : putIfAbsent;
        }
        return eVar;
    }

    public static e d(Context context) {
        return new d(b(a(context)));
    }
}
