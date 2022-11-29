package em;

import android.annotation.TargetApi;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import b3.j;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final AtomicInteger f30643a = new AtomicInteger((int) SystemClock.elapsedRealtime());

    /* renamed from: em.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static class C0307a {

        /* renamed from: a  reason: collision with root package name */
        public final j.e f30644a;

        /* renamed from: b  reason: collision with root package name */
        public final String f30645b;

        /* renamed from: c  reason: collision with root package name */
        public final int f30646c = 0;

        public C0307a(j.e eVar, String str, int i10) {
            this.f30644a = eVar;
            this.f30645b = str;
        }
    }

    public static PendingIntent a(Context context, com.google.firebase.messaging.c cVar, String str, PackageManager packageManager) {
        Intent f10 = f(str, cVar, packageManager);
        if (f10 == null) {
            return null;
        }
        f10.addFlags(67108864);
        f10.putExtras(cVar.y());
        if (q(cVar)) {
            f10.putExtra("gcm.n.analytics_data", cVar.x());
        }
        return PendingIntent.getActivity(context, g(), f10, l(1073741824));
    }

    public static PendingIntent b(Context context, com.google.firebase.messaging.c cVar) {
        if (q(cVar)) {
            return c(context, new Intent("com.google.firebase.messaging.NOTIFICATION_DISMISS").putExtras(cVar.x()));
        }
        return null;
    }

    public static PendingIntent c(Context context, Intent intent) {
        return PendingIntent.getBroadcast(context, g(), new Intent("com.google.firebase.MESSAGING_EVENT").setComponent(new ComponentName(context, "com.google.firebase.iid.FirebaseInstanceIdReceiver")).putExtra("wrapped_intent", intent), l(1073741824));
    }

    public static C0307a d(Context context, com.google.firebase.messaging.c cVar) {
        Bundle j10 = j(context.getPackageManager(), context.getPackageName());
        return e(context, context.getPackageName(), cVar, k(context, cVar.k(), j10), context.getResources(), context.getPackageManager(), j10);
    }

    public static C0307a e(Context context, String str, com.google.firebase.messaging.c cVar, String str2, Resources resources, PackageManager packageManager, Bundle bundle) {
        j.e eVar = new j.e(context, str2);
        String n10 = cVar.n(resources, str, "gcm.n.title");
        if (!TextUtils.isEmpty(n10)) {
            eVar.r(n10);
        }
        String n11 = cVar.n(resources, str, "gcm.n.body");
        if (!TextUtils.isEmpty(n11)) {
            eVar.q(n11);
            eVar.F(new j.c().m(n11));
        }
        eVar.D(m(packageManager, resources, str, cVar.p("gcm.n.icon"), bundle));
        Uri n12 = n(str, cVar, resources);
        if (n12 != null) {
            eVar.E(n12);
        }
        eVar.p(a(context, cVar, str, packageManager));
        PendingIntent b10 = b(context, cVar);
        if (b10 != null) {
            eVar.t(b10);
        }
        Integer h10 = h(context, cVar.p("gcm.n.color"), bundle);
        if (h10 != null) {
            eVar.m(h10.intValue());
        }
        eVar.j(!cVar.a("gcm.n.sticky"));
        eVar.x(cVar.a("gcm.n.local_only"));
        String p10 = cVar.p("gcm.n.ticker");
        if (p10 != null) {
            eVar.H(p10);
        }
        Integer m10 = cVar.m();
        if (m10 != null) {
            eVar.A(m10.intValue());
        }
        Integer r10 = cVar.r();
        if (r10 != null) {
            eVar.K(r10.intValue());
        }
        Integer l10 = cVar.l();
        if (l10 != null) {
            eVar.y(l10.intValue());
        }
        Long j10 = cVar.j("gcm.n.event_time");
        if (j10 != null) {
            eVar.C(true);
            eVar.L(j10.longValue());
        }
        long[] q10 = cVar.q();
        if (q10 != null) {
            eVar.J(q10);
        }
        int[] e10 = cVar.e();
        if (e10 != null) {
            eVar.w(e10[0], e10[1], e10[2]);
        }
        eVar.s(i(cVar));
        return new C0307a(eVar, o(cVar), 0);
    }

    public static Intent f(String str, com.google.firebase.messaging.c cVar, PackageManager packageManager) {
        String p10 = cVar.p("gcm.n.click_action");
        if (!TextUtils.isEmpty(p10)) {
            Intent intent = new Intent(p10);
            intent.setPackage(str);
            intent.setFlags(268435456);
            return intent;
        }
        Uri f10 = cVar.f();
        if (f10 != null) {
            Intent intent2 = new Intent("android.intent.action.VIEW");
            intent2.setPackage(str);
            intent2.setData(f10);
            return intent2;
        }
        Intent launchIntentForPackage = packageManager.getLaunchIntentForPackage(str);
        if (launchIntentForPackage == null) {
            Log.w("FirebaseMessaging", "No activity found to launch app");
        }
        return launchIntentForPackage;
    }

    public static int g() {
        return f30643a.incrementAndGet();
    }

    public static Integer h(Context context, String str, Bundle bundle) {
        if (Build.VERSION.SDK_INT < 21) {
            return null;
        }
        if (!TextUtils.isEmpty(str)) {
            try {
                return Integer.valueOf(Color.parseColor(str));
            } catch (IllegalArgumentException unused) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 56);
                sb2.append("Color is invalid: ");
                sb2.append(str);
                sb2.append(". Notification will use default color.");
                Log.w("FirebaseMessaging", sb2.toString());
            }
        }
        int i10 = bundle.getInt("com.google.firebase.messaging.default_notification_color", 0);
        if (i10 != 0) {
            try {
                return Integer.valueOf(c3.a.d(context, i10));
            } catch (Resources.NotFoundException unused2) {
                Log.w("FirebaseMessaging", "Cannot find the color resource referenced in AndroidManifest.");
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    public static int i(com.google.firebase.messaging.c cVar) {
        boolean a10 = cVar.a("gcm.n.default_sound");
        ?? r02 = a10;
        if (cVar.a("gcm.n.default_vibrate_timings")) {
            r02 = (a10 ? 1 : 0) | true;
        }
        return cVar.a("gcm.n.default_light_settings") ? r02 | 4 : r02;
    }

    public static Bundle j(PackageManager packageManager, String str) {
        try {
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(str, 128);
            if (applicationInfo != null) {
                Bundle bundle = applicationInfo.metaData;
                if (bundle != null) {
                    return bundle;
                }
            }
        } catch (PackageManager.NameNotFoundException e10) {
            Log.w("FirebaseMessaging", "Couldn't get own application info: ".concat(e10.toString()));
        }
        return Bundle.EMPTY;
    }

    @TargetApi(26)
    public static String k(Context context, String str, Bundle bundle) {
        String string;
        if (Build.VERSION.SDK_INT < 26) {
            return null;
        }
        try {
            if (context.getPackageManager().getApplicationInfo(context.getPackageName(), 0).targetSdkVersion >= 26) {
                NotificationManager notificationManager = (NotificationManager) context.getSystemService(NotificationManager.class);
                if (!TextUtils.isEmpty(str)) {
                    if (notificationManager.getNotificationChannel(str) != null) {
                        return str;
                    }
                    StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 122);
                    sb2.append("Notification Channel requested (");
                    sb2.append(str);
                    sb2.append(") has not been created by the app. Manifest configuration, or default, value will be used.");
                    Log.w("FirebaseMessaging", sb2.toString());
                }
                String string2 = bundle.getString("com.google.firebase.messaging.default_notification_channel_id");
                if (!TextUtils.isEmpty(string2)) {
                    if (notificationManager.getNotificationChannel(string2) != null) {
                        return string2;
                    }
                    Log.w("FirebaseMessaging", "Notification Channel set in AndroidManifest.xml has not been created by the app. Default value will be used.");
                } else {
                    Log.w("FirebaseMessaging", "Missing Default Notification Channel metadata in AndroidManifest. Default value will be used.");
                }
                if (notificationManager.getNotificationChannel("fcm_fallback_notification_channel") == null) {
                    int identifier = context.getResources().getIdentifier("fcm_fallback_notification_channel_label", "string", context.getPackageName());
                    if (identifier == 0) {
                        Log.e("FirebaseMessaging", "String resource \"fcm_fallback_notification_channel_label\" is not found. Using default string channel name.");
                        string = "Misc";
                    } else {
                        string = context.getString(identifier);
                    }
                    notificationManager.createNotificationChannel(new NotificationChannel("fcm_fallback_notification_channel", string, 3));
                }
                return "fcm_fallback_notification_channel";
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return null;
    }

    public static int l(int i10) {
        return Build.VERSION.SDK_INT >= 23 ? 1140850688 : 1073741824;
    }

    public static int m(PackageManager packageManager, Resources resources, String str, String str2, Bundle bundle) {
        if (!TextUtils.isEmpty(str2)) {
            int identifier = resources.getIdentifier(str2, "drawable", str);
            if (identifier != 0 && p(resources, identifier)) {
                return identifier;
            }
            int identifier2 = resources.getIdentifier(str2, "mipmap", str);
            if (identifier2 != 0 && p(resources, identifier2)) {
                return identifier2;
            }
            StringBuilder sb2 = new StringBuilder(String.valueOf(str2).length() + 61);
            sb2.append("Icon resource ");
            sb2.append(str2);
            sb2.append(" not found. Notification will use default icon.");
            Log.w("FirebaseMessaging", sb2.toString());
        }
        int i10 = bundle.getInt("com.google.firebase.messaging.default_notification_icon", 0);
        if (i10 == 0 || !p(resources, i10)) {
            try {
                i10 = packageManager.getApplicationInfo(str, 0).icon;
            } catch (PackageManager.NameNotFoundException e10) {
                Log.w("FirebaseMessaging", "Couldn't get own application info: ".concat(e10.toString()));
            }
        }
        if (i10 == 0 || !p(resources, i10)) {
            return 17301651;
        }
        return i10;
    }

    public static Uri n(String str, com.google.firebase.messaging.c cVar, Resources resources) {
        String o10 = cVar.o();
        if (TextUtils.isEmpty(o10)) {
            return null;
        }
        if (!"default".equals(o10) && resources.getIdentifier(o10, "raw", str) != 0) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 24 + String.valueOf(o10).length());
            sb2.append("android.resource://");
            sb2.append(str);
            sb2.append("/raw/");
            sb2.append(o10);
            return Uri.parse(sb2.toString());
        }
        return RingtoneManager.getDefaultUri(2);
    }

    public static String o(com.google.firebase.messaging.c cVar) {
        String p10 = cVar.p("gcm.n.tag");
        if (TextUtils.isEmpty(p10)) {
            long uptimeMillis = SystemClock.uptimeMillis();
            StringBuilder sb2 = new StringBuilder(37);
            sb2.append("FCM-Notification:");
            sb2.append(uptimeMillis);
            return sb2.toString();
        }
        return p10;
    }

    @TargetApi(26)
    public static boolean p(Resources resources, int i10) {
        if (Build.VERSION.SDK_INT != 26) {
            return true;
        }
        try {
            if (resources.getDrawable(i10, null) instanceof AdaptiveIconDrawable) {
                StringBuilder sb2 = new StringBuilder(77);
                sb2.append("Adaptive icons cannot be used in notifications. Ignoring icon id: ");
                sb2.append(i10);
                Log.e("FirebaseMessaging", sb2.toString());
                return false;
            }
            return true;
        } catch (Resources.NotFoundException unused) {
            StringBuilder sb3 = new StringBuilder(66);
            sb3.append("Couldn't find resource ");
            sb3.append(i10);
            sb3.append(", treating it as an invalid icon");
            Log.e("FirebaseMessaging", sb3.toString());
            return false;
        }
    }

    public static boolean q(com.google.firebase.messaging.c cVar) {
        return cVar.a("google.c.a.e");
    }
}
