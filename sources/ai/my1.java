package ai;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.Build;
import b3.j;
import com.dena.mirrorman.clientlog.logs.ActionLogBase;
import com.google.android.gms.ads.AdService;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class my1 extends dc0 {
    public final nq2 A;

    /* renamed from: w  reason: collision with root package name */
    public final Context f7107w;

    /* renamed from: x  reason: collision with root package name */
    public final pp1 f7108x;

    /* renamed from: y  reason: collision with root package name */
    public final yj0 f7109y;

    /* renamed from: z  reason: collision with root package name */
    public final ey1 f7110z;

    public my1(Context context, ey1 ey1Var, yj0 yj0Var, pp1 pp1Var, nq2 nq2Var) {
        this.f7107w = context;
        this.f7108x = pp1Var;
        this.f7109y = yj0Var;
        this.f7110z = ey1Var;
        this.A = nq2Var;
    }

    public static void S5(final Activity activity, final xg.n nVar, final yg.v0 v0Var, final ey1 ey1Var, final pp1 pp1Var, final nq2 nq2Var, final String str, final String str2) {
        wg.t.d();
        AlertDialog.Builder builder = new AlertDialog.Builder(activity, wg.t.f().m());
        final Resources j10 = wg.t.h().j();
        builder.setTitle(j10 == null ? "Open ad when you're back online." : j10.getString(vg.a.f57320g)).setMessage(j10 == null ? "We'll send you a notification with a link to the advertiser site." : j10.getString(vg.a.f57319f)).setPositiveButton(j10 == null ? "OK" : j10.getString(vg.a.f57316c), new DialogInterface.OnClickListener(pp1Var, activity, nq2Var, ey1Var, str, v0Var, str2, j10, nVar) { // from class: ai.hy1
            public final String A;
            public final yg.v0 B;
            public final String C;
            public final Resources D;
            public final xg.n E;

            /* renamed from: w  reason: collision with root package name */
            public final pp1 f5036w;

            /* renamed from: x  reason: collision with root package name */
            public final Activity f5037x;

            /* renamed from: y  reason: collision with root package name */
            public final nq2 f5038y;

            /* renamed from: z  reason: collision with root package name */
            public final ey1 f5039z;

            {
                this.f5036w = pp1Var;
                this.f5037x = activity;
                this.f5038y = nq2Var;
                this.f5039z = ey1Var;
                this.A = str;
                this.B = v0Var;
                this.C = str2;
                this.D = j10;
                this.E = nVar;
            }

            /* JADX WARN: Code restructure failed: missing block: B:7:0x003d, code lost:
                if (r0.zze(yh.b.h1(r10), r14, r13) == false) goto L14;
             */
            @Override // android.content.DialogInterface.OnClickListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void onClick(android.content.DialogInterface r19, int r20) {
                /*
                    r18 = this;
                    r1 = r18
                    ai.pp1 r9 = r1.f5036w
                    android.app.Activity r10 = r1.f5037x
                    ai.nq2 r11 = r1.f5038y
                    ai.ey1 r12 = r1.f5039z
                    java.lang.String r13 = r1.A
                    yg.v0 r0 = r1.B
                    java.lang.String r14 = r1.C
                    android.content.res.Resources r15 = r1.D
                    xg.n r8 = r1.E
                    if (r9 == 0) goto L34
                    java.util.HashMap r7 = new java.util.HashMap
                    r7.<init>()
                    java.lang.String r2 = "dialog_action"
                    java.lang.String r3 = "confirm"
                    r7.put(r2, r3)
                    java.lang.String r16 = "dialog_click"
                    r2 = r10
                    r3 = r9
                    r4 = r11
                    r5 = r12
                    r6 = r13
                    r17 = r7
                    r7 = r16
                    r1 = r8
                    r8 = r17
                    ai.my1.U5(r2, r3, r4, r5, r6, r7, r8)
                    goto L35
                L34:
                    r1 = r8
                L35:
                    yh.a r2 = yh.b.h1(r10)     // Catch: android.os.RemoteException -> L40
                    boolean r0 = r0.zze(r2, r14, r13)     // Catch: android.os.RemoteException -> L40
                    if (r0 != 0) goto L55
                    goto L46
                L40:
                    r0 = move-exception
                    java.lang.String r2 = "Failed to schedule offline notification poster."
                    ai.uj0.d(r2, r0)
                L46:
                    r12.e(r13)
                    if (r9 == 0) goto L55
                    java.lang.String r7 = "offline_notification_worker_not_scheduled"
                    r2 = r10
                    r3 = r9
                    r4 = r11
                    r5 = r12
                    r6 = r13
                    ai.my1.T5(r2, r3, r4, r5, r6, r7)
                L55:
                    wg.t.d()
                    yg.e r0 = wg.t.f()
                    android.app.AlertDialog$Builder r2 = new android.app.AlertDialog$Builder
                    int r0 = r0.m()
                    r2.<init>(r10, r0)
                    if (r15 != 0) goto L6a
                    java.lang.String r0 = "You'll get a notification with the link when you're back online"
                    goto L70
                L6a:
                    int r0 = vg.a.f57317d
                    java.lang.String r0 = r15.getString(r0)
                L70:
                    android.app.AlertDialog$Builder r0 = r2.setMessage(r0)
                    ai.ky1 r3 = new ai.ky1
                    r3.<init>(r1)
                    r0.setOnCancelListener(r3)
                    android.app.AlertDialog r0 = r2.create()
                    r0.show()
                    java.util.Timer r2 = new java.util.Timer
                    r2.<init>()
                    ai.ly1 r3 = new ai.ly1
                    r3.<init>(r0, r2, r1)
                    r0 = 3000(0xbb8, double:1.482E-320)
                    r2.schedule(r3, r0)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: ai.hy1.onClick(android.content.DialogInterface, int):void");
            }
        }).setNegativeButton(j10 == null ? "No thanks" : j10.getString(vg.a.f57318e), new DialogInterface.OnClickListener(ey1Var, str, pp1Var, activity, nq2Var, nVar) { // from class: ai.iy1
            public final nq2 A;
            public final xg.n B;

            /* renamed from: w  reason: collision with root package name */
            public final ey1 f5444w;

            /* renamed from: x  reason: collision with root package name */
            public final String f5445x;

            /* renamed from: y  reason: collision with root package name */
            public final pp1 f5446y;

            /* renamed from: z  reason: collision with root package name */
            public final Activity f5447z;

            {
                this.f5444w = ey1Var;
                this.f5445x = str;
                this.f5446y = pp1Var;
                this.f5447z = activity;
                this.A = nq2Var;
                this.B = nVar;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                ey1 ey1Var2 = this.f5444w;
                String str3 = this.f5445x;
                pp1 pp1Var2 = this.f5446y;
                Activity activity2 = this.f5447z;
                nq2 nq2Var2 = this.A;
                xg.n nVar2 = this.B;
                ey1Var2.e(str3);
                if (pp1Var2 != null) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("dialog_action", "dismiss");
                    my1.U5(activity2, pp1Var2, nq2Var2, ey1Var2, str3, "dialog_click", hashMap);
                }
                if (nVar2 != null) {
                    nVar2.zzb();
                }
            }
        }).setOnCancelListener(new DialogInterface.OnCancelListener(ey1Var, str, pp1Var, activity, nq2Var, nVar) { // from class: ai.jy1
            public final nq2 A;
            public final xg.n B;

            /* renamed from: w  reason: collision with root package name */
            public final ey1 f5957w;

            /* renamed from: x  reason: collision with root package name */
            public final String f5958x;

            /* renamed from: y  reason: collision with root package name */
            public final pp1 f5959y;

            /* renamed from: z  reason: collision with root package name */
            public final Activity f5960z;

            {
                this.f5957w = ey1Var;
                this.f5958x = str;
                this.f5959y = pp1Var;
                this.f5960z = activity;
                this.A = nq2Var;
                this.B = nVar;
            }

            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                ey1 ey1Var2 = this.f5957w;
                String str3 = this.f5958x;
                pp1 pp1Var2 = this.f5959y;
                Activity activity2 = this.f5960z;
                nq2 nq2Var2 = this.A;
                xg.n nVar2 = this.B;
                ey1Var2.e(str3);
                if (pp1Var2 != null) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("dialog_action", "dismiss");
                    my1.U5(activity2, pp1Var2, nq2Var2, ey1Var2, str3, "dialog_click", hashMap);
                }
                if (nVar2 != null) {
                    nVar2.zzb();
                }
            }
        });
        builder.create().show();
    }

    public static void T5(Context context, pp1 pp1Var, nq2 nq2Var, ey1 ey1Var, String str, String str2) {
        U5(context, pp1Var, nq2Var, ey1Var, str, str2, new HashMap());
    }

    public static void U5(Context context, pp1 pp1Var, nq2 nq2Var, ey1 ey1Var, String str, String str2, Map<String, String> map) {
        String f10;
        if (((Boolean) ft.c().c(ox.f8011i6)).booleanValue()) {
            mq2 a10 = mq2.a(str2);
            a10.c("gqi", str);
            wg.t.d();
            a10.c("device_connectivity", true == yg.d2.i(context) ? "online" : "offline");
            a10.c("event_timestamp", String.valueOf(wg.t.k().currentTimeMillis()));
            for (Map.Entry<String, String> entry : map.entrySet()) {
                a10.c(entry.getKey(), entry.getValue());
            }
            f10 = nq2Var.b(a10);
        } else {
            op1 d10 = pp1Var.d();
            d10.d("gqi", str);
            d10.d(ActionLogBase.ACTION, str2);
            wg.t.d();
            d10.d("device_connectivity", true == yg.d2.i(context) ? "online" : "offline");
            d10.d("event_timestamp", String.valueOf(wg.t.k().currentTimeMillis()));
            for (Map.Entry<String, String> entry2 : map.entrySet()) {
                d10.d(entry2.getKey(), entry2.getValue());
            }
            f10 = d10.f();
        }
        ey1Var.h(new gy1(wg.t.k().currentTimeMillis(), str, f10, 2));
    }

    @Override // ai.ec0
    public final void I0(Intent intent) {
        String stringExtra = intent.getStringExtra("offline_notification_action");
        if (stringExtra.equals("offline_notification_clicked") || stringExtra.equals("offline_notification_dismissed")) {
            String stringExtra2 = intent.getStringExtra("gws_query_id");
            String stringExtra3 = intent.getStringExtra("uri");
            wg.t.d();
            boolean i10 = yg.d2.i(this.f7107w);
            HashMap hashMap = new HashMap();
            if (stringExtra.equals("offline_notification_clicked")) {
                hashMap.put("offline_notification_action", "offline_notification_clicked");
                r8 = true == i10 ? (char) 1 : (char) 2;
                hashMap.put("obvs", String.valueOf(Build.VERSION.SDK_INT));
                hashMap.put("olaih", String.valueOf(stringExtra3.startsWith("http")));
                try {
                    Context context = this.f7107w;
                    Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(stringExtra3);
                    if (launchIntentForPackage == null) {
                        launchIntentForPackage = new Intent("android.intent.action.VIEW");
                        launchIntentForPackage.setData(Uri.parse(stringExtra3));
                    }
                    launchIntentForPackage.addFlags(268435456);
                    context.startActivity(launchIntentForPackage);
                    hashMap.put("olaa", "olas");
                } catch (ActivityNotFoundException unused) {
                    hashMap.put("olaa", "olaf");
                }
            } else {
                hashMap.put("offline_notification_action", "offline_notification_dismissed");
            }
            V5(stringExtra2, "offline_notification_action", hashMap);
            try {
                SQLiteDatabase writableDatabase = this.f7110z.getWritableDatabase();
                if (r8 == 1) {
                    this.f7110z.c(writableDatabase, this.f7109y, stringExtra2);
                } else {
                    ey1.o(writableDatabase, stringExtra2);
                }
            } catch (SQLiteException e10) {
                uj0.c("Failed to get writable offline buffering database: ".concat(e10.toString()));
            }
        }
    }

    @Override // ai.ec0
    public final void I2(yh.a aVar, String str, String str2) {
        Context context = (Context) yh.b.z0(aVar);
        wg.t.d();
        if (vh.n.k()) {
            NotificationChannel notificationChannel = new NotificationChannel("offline_notification_channel", "AdMob Offline Notifications", 2);
            notificationChannel.setShowBadge(false);
            ((NotificationManager) context.getSystemService(NotificationManager.class)).createNotificationChannel(notificationChannel);
        }
        Intent intent = new Intent();
        intent.setClass(context, AdService.class);
        intent.setAction("offline_notification_clicked");
        intent.putExtra("offline_notification_action", "offline_notification_clicked");
        intent.putExtra("gws_query_id", str2);
        intent.putExtra("uri", str);
        int i10 = rw2.f9611a;
        PendingIntent a10 = rw2.a(context, 0, intent, i10 | 1073741824, 0);
        Intent intent2 = new Intent();
        intent2.setClass(context, AdService.class);
        intent2.setAction("offline_notification_dismissed");
        intent2.putExtra("offline_notification_action", "offline_notification_dismissed");
        intent2.putExtra("gws_query_id", str2);
        PendingIntent a11 = rw2.a(context, 0, intent2, i10 | 1073741824, 0);
        Resources j10 = wg.t.h().j();
        ((NotificationManager) context.getSystemService("notification")).notify(str2, 54321, new j.e(context, "offline_notification_channel").r(j10 == null ? "View the ad you saved when you were offline" : j10.getString(vg.a.f57315b)).q(j10 == null ? "Tap to open ad" : j10.getString(vg.a.f57314a)).j(true).t(a11).p(a10).D(context.getApplicationInfo().icon).c());
        V5(str2, "offline_notification_impression", new HashMap());
    }

    public final void V5(String str, String str2, Map<String, String> map) {
        U5(this.f7107w, this.f7108x, this.A, this.f7110z, str, str2, map);
    }

    @Override // ai.ec0
    public final void f() {
        ey1 ey1Var = this.f7110z;
        final yj0 yj0Var = this.f7109y;
        ey1Var.a(new fp2(yj0Var) { // from class: ai.yx1

            /* renamed from: a  reason: collision with root package name */
            public final yj0 f12763a;

            {
                this.f12763a = yj0Var;
            }

            @Override // ai.fp2
            public final Object a(Object obj) {
                ey1.p((SQLiteDatabase) obj, this.f12763a);
                return null;
            }
        });
    }
}
