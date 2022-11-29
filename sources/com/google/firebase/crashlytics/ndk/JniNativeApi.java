package com.google.firebase.crashlytics.ndk;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.os.Build;
import android.text.TextUtils;
import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import ll.d;
import xk.f;

/* loaded from: classes4.dex */
class JniNativeApi implements d {

    /* renamed from: b  reason: collision with root package name */
    public static final boolean f27949b;

    /* renamed from: c  reason: collision with root package name */
    public static final FilenameFilter f27950c = b.f27957a;

    /* renamed from: a  reason: collision with root package name */
    public final Context f27951a;

    static {
        boolean z10;
        try {
            System.loadLibrary("crashlytics");
            z10 = true;
        } catch (UnsatisfiedLinkError e10) {
            f.f().d("libcrashlytics could not be loaded. This APK may not have been compiled for this device's architecture. NDK crashes will not be reported to Crashlytics:\n" + e10.getLocalizedMessage());
            z10 = false;
        }
        f27949b = z10;
    }

    public JniNativeApi(Context context) {
        this.f27951a = context;
    }

    @TargetApi(21)
    public static void c(List<String> list, PackageInfo packageInfo) {
        ApplicationInfo applicationInfo = packageInfo.applicationInfo;
        String[] strArr = applicationInfo.splitSourceDirs;
        if (strArr != null) {
            Collections.addAll(list, strArr);
        }
        File file = new File(applicationInfo.dataDir, String.format("files/splitcompat/%s/verified-splits", e(packageInfo)));
        if (!file.exists()) {
            f.f().b("No dynamic features found at " + file.getAbsolutePath());
            return;
        }
        File[] listFiles = file.listFiles(f27950c);
        if (listFiles == null) {
            listFiles = new File[0];
        }
        f.f().b("Found " + listFiles.length + " APKs in " + file.getAbsolutePath());
        for (File file2 : listFiles) {
            f.f().b("Adding " + file2.getName() + " to classpath.");
            list.add(file2.getAbsolutePath());
        }
    }

    public static int d() {
        return Build.VERSION.SDK_INT >= 24 ? 9216 : 1024;
    }

    public static String e(PackageInfo packageInfo) {
        if (Build.VERSION.SDK_INT >= 28) {
            return Long.toString(packageInfo.getLongVersionCode());
        }
        return Integer.toString(packageInfo.versionCode);
    }

    public static boolean f() {
        return Build.VERSION.SDK_INT >= 21;
    }

    public static /* synthetic */ boolean g(File file, String str) {
        return str.toLowerCase().endsWith(".apk");
    }

    private native boolean nativeInit(String[] strArr, Object obj);

    @Override // ll.d
    public boolean a(String str, AssetManager assetManager) {
        String[] h10 = h(Build.CPU_ABI);
        if (h10.length < 2) {
            return false;
        }
        return f27949b && nativeInit(new String[]{h10[0], h10[1], str}, assetManager);
    }

    public String[] h(String str) {
        try {
            PackageInfo packageInfo = this.f27951a.getPackageManager().getPackageInfo(this.f27951a.getPackageName(), d());
            ArrayList<String> arrayList = new ArrayList(10);
            arrayList.add(packageInfo.applicationInfo.sourceDir);
            if (f()) {
                c(arrayList, packageInfo);
            }
            String[] strArr = packageInfo.applicationInfo.sharedLibraryFiles;
            if (strArr != null) {
                Collections.addAll(arrayList, strArr);
            }
            ArrayList arrayList2 = new ArrayList(10);
            File parentFile = new File(packageInfo.applicationInfo.nativeLibraryDir).getParentFile();
            if (parentFile != null) {
                arrayList2.add(new File(parentFile, str).getPath());
                if (str.startsWith("arm64")) {
                    arrayList2.add(new File(parentFile, "arm64").getPath());
                } else if (str.startsWith("arm")) {
                    arrayList2.add(new File(parentFile, "arm").getPath());
                }
            }
            for (String str2 : arrayList) {
                if (str2.endsWith(".apk")) {
                    arrayList2.add(str2 + "!/lib/" + str);
                }
            }
            arrayList2.add(System.getProperty("java.library.path"));
            arrayList2.add(packageInfo.applicationInfo.nativeLibraryDir);
            String str3 = File.pathSeparator;
            return new String[]{TextUtils.join(str3, arrayList), TextUtils.join(str3, arrayList2)};
        } catch (PackageManager.NameNotFoundException e10) {
            f.f().e("Unable to compose package paths", e10);
            throw new RuntimeException(e10);
        }
    }
}
