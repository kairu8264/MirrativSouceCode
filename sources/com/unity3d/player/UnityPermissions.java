package com.unity3d.player;

import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageItemInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;

/* loaded from: classes4.dex */
public class UnityPermissions {
    private static final String SKIP_DIALOG_METADATA_NAME = "unityplayer.SkipPermissionsDialog";

    private static boolean checkInfoForMetadata(PackageItemInfo packageItemInfo) {
        try {
            return packageItemInfo.metaData.getBoolean(SKIP_DIALOG_METADATA_NAME);
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean hasUserAuthorizedPermission(Activity activity, String str) {
        return activity.checkCallingOrSelfPermission(str) == 0;
    }

    public static void requestUserPermissions(Activity activity, String[] strArr, IPermissionRequestCallbacks iPermissionRequestCallbacks) {
        if (!PlatformSupport.MARSHMALLOW_SUPPORT || activity == null || strArr == null) {
            return;
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("96489") == null) {
            e eVar = new e(activity, iPermissionRequestCallbacks);
            Bundle bundle = new Bundle();
            bundle.putStringArray("PermissionNames", strArr);
            eVar.setArguments(bundle);
            FragmentTransaction beginTransaction = fragmentManager.beginTransaction();
            beginTransaction.add(0, eVar, "96489");
            beginTransaction.commit();
        }
    }

    public static boolean skipPermissionsDialog(Activity activity) {
        ActivityInfo activityInfo;
        ApplicationInfo applicationInfo;
        if (PlatformSupport.MARSHMALLOW_SUPPORT) {
            try {
                PackageManager packageManager = activity.getPackageManager();
                activityInfo = packageManager.getActivityInfo(activity.getComponentName(), 128);
                applicationInfo = packageManager.getApplicationInfo(activity.getPackageName(), 128);
            } catch (Exception unused) {
            }
            if (checkInfoForMetadata(activityInfo)) {
                return true;
            }
            return checkInfoForMetadata(applicationInfo);
        }
        return false;
    }
}
