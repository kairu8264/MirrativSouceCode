package em;

import android.annotation.TargetApi;
import android.app.NotificationManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Binder;
import android.os.Bundle;
import android.util.Log;
import java.util.concurrent.Executor;

/* loaded from: classes4.dex */
public final class h0 {
    public static boolean a(Context context) {
        return Binder.getCallingUid() == context.getApplicationInfo().uid;
    }

    public static void b(Context context) {
        if (i0.b(context)) {
            return;
        }
        d(g0.f30688w, context, e(context));
    }

    public static /* synthetic */ void c(Context context, boolean z10, vi.h hVar) {
        try {
            if (!a(context)) {
                String valueOf = String.valueOf(context.getPackageName());
                Log.e("FirebaseMessaging", valueOf.length() != 0 ? "error configuring notification delegate for package ".concat(valueOf) : new String("error configuring notification delegate for package "));
                return;
            }
            i0.c(context, true);
            NotificationManager notificationManager = (NotificationManager) context.getSystemService(NotificationManager.class);
            if (z10) {
                notificationManager.setNotificationDelegate("com.google.android.gms");
            } else if ("com.google.android.gms".equals(notificationManager.getNotificationDelegate())) {
                notificationManager.setNotificationDelegate(null);
            }
        } finally {
            hVar.e(null);
        }
    }

    @TargetApi(29)
    public static vi.g<Void> d(Executor executor, final Context context, final boolean z10) {
        if (!vh.n.m()) {
            return vi.j.e(null);
        }
        final vi.h hVar = new vi.h();
        executor.execute(new Runnable() { // from class: em.f0
            @Override // java.lang.Runnable
            public final void run() {
                h0.c(context, z10, hVar);
            }
        });
        return hVar.a();
    }

    public static boolean e(Context context) {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            Context applicationContext = context.getApplicationContext();
            PackageManager packageManager = applicationContext.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(applicationContext.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_messaging_notification_delegation_enabled")) {
                return true;
            }
            return applicationInfo.metaData.getBoolean("firebase_messaging_notification_delegation_enabled");
        } catch (PackageManager.NameNotFoundException unused) {
            return true;
        }
    }
}
