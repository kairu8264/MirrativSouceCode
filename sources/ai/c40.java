package ai;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.view.View;
import com.google.android.exoplayer2.C;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class c40 {
    public static final Intent a(Uri uri, Context context, u uVar, View view) {
        if (uri == null) {
            return null;
        }
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.addFlags(268435456);
        intent.setData(uri);
        intent.setAction("android.intent.action.VIEW");
        return intent;
    }

    public static final ResolveInfo b(Intent intent, Context context, u uVar, View view) {
        return c(intent, new ArrayList(), context, uVar, view);
    }

    public static final ResolveInfo c(Intent intent, ArrayList<ResolveInfo> arrayList, Context context, u uVar, View view) {
        PackageManager packageManager;
        ResolveInfo resolveInfo = null;
        try {
            packageManager = context.getPackageManager();
        } catch (Throwable th2) {
            wg.t.h().k(th2, "OpenSystemBrowserHandler.getDefaultBrowserResolverForIntent");
        }
        if (packageManager == null) {
            return null;
        }
        List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, C.DEFAULT_BUFFER_SEGMENT_SIZE);
        ResolveInfo resolveActivity = packageManager.resolveActivity(intent, C.DEFAULT_BUFFER_SEGMENT_SIZE);
        if (queryIntentActivities != null && resolveActivity != null) {
            int i10 = 0;
            while (true) {
                if (i10 >= queryIntentActivities.size()) {
                    break;
                } else if (resolveActivity.activityInfo.name.equals(queryIntentActivities.get(i10).activityInfo.name)) {
                    resolveInfo = resolveActivity;
                    break;
                } else {
                    i10++;
                }
            }
        }
        arrayList.addAll(queryIntentActivities);
        return resolveInfo;
    }

    public static final Intent d(Intent intent, ResolveInfo resolveInfo, Context context, u uVar, View view) {
        Intent intent2 = new Intent(intent);
        ActivityInfo activityInfo = resolveInfo.activityInfo;
        intent2.setClassName(activityInfo.packageName, activityInfo.name);
        return intent2;
    }
}
