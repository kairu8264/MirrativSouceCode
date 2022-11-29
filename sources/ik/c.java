package ik;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import dk.f;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes3.dex */
public final class c {

    /* renamed from: c  reason: collision with root package name */
    public static final f f36838c = new f("SplitInstallInfoProvider");

    /* renamed from: a  reason: collision with root package name */
    public final Context f36839a;

    /* renamed from: b  reason: collision with root package name */
    public final String f36840b;

    public c(Context context) {
        this.f36839a = context;
        this.f36840b = context.getPackageName();
    }

    public static boolean b(String str) {
        return str.startsWith("config.") || str.contains(".config.");
    }

    public final Set<String> a() {
        HashSet hashSet = new HashSet();
        for (String str : d()) {
            if (!b(str)) {
                hashSet.add(str);
            }
        }
        return hashSet;
    }

    public final Bundle c() {
        Bundle bundle;
        try {
            ApplicationInfo applicationInfo = this.f36839a.getPackageManager().getApplicationInfo(this.f36840b, 128);
            if (applicationInfo == null || (bundle = applicationInfo.metaData) == null) {
                f36838c.a("App has no applicationInfo or metaData", new Object[0]);
                return null;
            }
            return bundle;
        } catch (PackageManager.NameNotFoundException unused) {
            f36838c.e("App is not found in PackageManager", new Object[0]);
            return null;
        }
    }

    public final Set<String> d() {
        HashSet hashSet = new HashSet();
        Bundle c10 = c();
        if (c10 != null) {
            String string = c10.getString("com.android.dynamic.apk.fused.modules");
            if (string != null && !string.isEmpty()) {
                Collections.addAll(hashSet, string.split(",", -1));
                hashSet.remove("");
                hashSet.remove(TtmlNode.RUBY_BASE);
            } else {
                f36838c.a("App has no fused modules.", new Object[0]);
            }
        }
        if (Build.VERSION.SDK_INT >= 21) {
            String[] strArr = null;
            try {
                PackageInfo packageInfo = this.f36839a.getPackageManager().getPackageInfo(this.f36840b, 0);
                if (packageInfo != null) {
                    strArr = packageInfo.splitNames;
                }
            } catch (PackageManager.NameNotFoundException unused) {
                f36838c.e("App is not found in PackageManager", new Object[0]);
            }
            if (strArr != null) {
                f36838c.a("Adding splits from package manager: %s", Arrays.toString(strArr));
                Collections.addAll(hashSet, strArr);
            } else {
                f36838c.a("No splits are found or app cannot be found in package manager.", new Object[0]);
            }
            a a10 = b.a();
            if (a10 != null) {
                hashSet.addAll(a10.zza());
            }
        }
        return hashSet;
    }
}
