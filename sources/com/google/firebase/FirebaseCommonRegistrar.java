package com.google.firebase;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.util.ArrayList;
import java.util.List;
import pk.e;
import pk.f;
import pk.g;
import um.c;
import um.h;
import vk.d;
import vk.i;

/* loaded from: classes.dex */
public class FirebaseCommonRegistrar implements i {
    public static /* synthetic */ String e(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        return applicationInfo != null ? String.valueOf(applicationInfo.targetSdkVersion) : "";
    }

    public static /* synthetic */ String f(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        return (applicationInfo == null || Build.VERSION.SDK_INT < 24) ? "" : String.valueOf(applicationInfo.minSdkVersion);
    }

    public static /* synthetic */ String g(Context context) {
        int i10 = Build.VERSION.SDK_INT;
        return (i10 < 16 || !context.getPackageManager().hasSystemFeature("android.hardware.type.television")) ? (i10 < 20 || !context.getPackageManager().hasSystemFeature("android.hardware.type.watch")) ? (i10 < 23 || !context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) ? (i10 < 26 || !context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) ? "" : "embedded" : TtmlNode.TEXT_EMPHASIS_AUTO : "watch" : "tv";
    }

    public static /* synthetic */ String h(Context context) {
        String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
        return installerPackageName != null ? i(installerPackageName) : "";
    }

    public static String i(String str) {
        return str.replace(' ', '_').replace('/', '_');
    }

    @Override // vk.i
    public List<d<?>> getComponents() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(c.c());
        arrayList.add(vl.d.e());
        arrayList.add(h.b("fire-android", String.valueOf(Build.VERSION.SDK_INT)));
        arrayList.add(h.b("fire-core", "20.0.0"));
        arrayList.add(h.b("device-name", i(Build.PRODUCT)));
        arrayList.add(h.b("device-model", i(Build.DEVICE)));
        arrayList.add(h.b("device-brand", i(Build.BRAND)));
        arrayList.add(h.c("android-target-sdk", e.f48438a));
        arrayList.add(h.c("android-min-sdk", f.f48439a));
        arrayList.add(h.c("android-platform", g.f48440a));
        arrayList.add(h.c("android-installer", pk.d.f48437a));
        String a10 = um.e.a();
        if (a10 != null) {
            arrayList.add(h.b("kotlin", a10));
        }
        return arrayList;
    }
}
