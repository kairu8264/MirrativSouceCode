package ai;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Build;
import com.google.android.exoplayer2.C;

/* loaded from: classes3.dex */
public final class me0 {
    public int A;
    public final String B;
    public boolean C;

    /* renamed from: a  reason: collision with root package name */
    public int f6890a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f6891b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f6892c;

    /* renamed from: d  reason: collision with root package name */
    public int f6893d;

    /* renamed from: e  reason: collision with root package name */
    public int f6894e;

    /* renamed from: f  reason: collision with root package name */
    public int f6895f;

    /* renamed from: g  reason: collision with root package name */
    public String f6896g;

    /* renamed from: h  reason: collision with root package name */
    public int f6897h;

    /* renamed from: i  reason: collision with root package name */
    public int f6898i;

    /* renamed from: j  reason: collision with root package name */
    public int f6899j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f6900k;

    /* renamed from: l  reason: collision with root package name */
    public int f6901l;

    /* renamed from: m  reason: collision with root package name */
    public double f6902m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f6903n;

    /* renamed from: o  reason: collision with root package name */
    public String f6904o;

    /* renamed from: p  reason: collision with root package name */
    public String f6905p;

    /* renamed from: q  reason: collision with root package name */
    public final boolean f6906q;

    /* renamed from: r  reason: collision with root package name */
    public final boolean f6907r;

    /* renamed from: s  reason: collision with root package name */
    public final String f6908s;

    /* renamed from: t  reason: collision with root package name */
    public final boolean f6909t;

    /* renamed from: u  reason: collision with root package name */
    public final boolean f6910u;

    /* renamed from: v  reason: collision with root package name */
    public final boolean f6911v;

    /* renamed from: w  reason: collision with root package name */
    public final String f6912w;

    /* renamed from: x  reason: collision with root package name */
    public final String f6913x;

    /* renamed from: y  reason: collision with root package name */
    public float f6914y;

    /* renamed from: z  reason: collision with root package name */
    public int f6915z;

    /* JADX WARN: Can't wrap try/catch for region: R(13:1|(1:3)(1:34)|4|(1:6)|7|(3:28|29|(7:31|10|11|12|(1:14)|16|(2:23|24)(1:22)))|9|10|11|12|(0)|16|(1:18)(3:20|23|24)) */
    /* JADX WARN: Removed duplicated region for block: B:22:0x009e A[Catch: Exception -> 0x00be, TRY_LEAVE, TryCatch #0 {Exception -> 0x00be, blocks: (B:20:0x0090, B:22:0x009e), top: B:33:0x0090 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public me0(android.content.Context r7) {
        /*
            r6 = this;
            r6.<init>()
            android.content.pm.PackageManager r0 = r7.getPackageManager()
            r6.b(r7)
            r6.c(r7)
            r6.d(r7)
            java.util.Locale r1 = java.util.Locale.getDefault()
            java.lang.String r2 = "geo:0,0?q=donuts"
            android.content.pm.ResolveInfo r2 = e(r0, r2)
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L20
            r2 = r3
            goto L21
        L20:
            r2 = r4
        L21:
            r6.f6906q = r2
            java.lang.String r2 = "http://www.google.com"
            android.content.pm.ResolveInfo r2 = e(r0, r2)
            if (r2 == 0) goto L2c
            goto L2d
        L2c:
            r3 = r4
        L2d:
            r6.f6907r = r3
            java.lang.String r2 = r1.getCountry()
            r6.f6908s = r2
            ai.dt.a()
            boolean r2 = ai.nj0.k()
            r6.f6909t = r2
            boolean r2 = vh.j.b(r7)
            r6.f6910u = r2
            boolean r2 = vh.j.c(r7)
            r6.f6911v = r2
            java.lang.String r1 = r1.getLanguage()
            r6.f6912w = r1
            java.lang.String r1 = "market://details?id=com.google.android.gms.ads"
            android.content.pm.ResolveInfo r0 = e(r0, r1)
            java.lang.String r1 = "."
            r2 = 0
            if (r0 != 0) goto L5d
        L5b:
            r0 = r2
            goto L8e
        L5d:
            android.content.pm.ActivityInfo r0 = r0.activityInfo
            if (r0 != 0) goto L62
            goto L5b
        L62:
            xh.b r3 = xh.c.a(r7)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L5b
            java.lang.String r5 = r0.packageName     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L5b
            android.content.pm.PackageInfo r3 = r3.f(r5, r4)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L5b
            if (r3 == 0) goto L5b
            int r3 = r3.versionCode     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L5b
            java.lang.String r0 = r0.packageName     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L5b
            java.lang.String r4 = java.lang.String.valueOf(r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L5b
            int r4 = r4.length()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L5b
            int r4 = r4 + 12
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L5b
            r5.<init>(r4)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L5b
            r5.append(r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L5b
            r5.append(r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L5b
            r5.append(r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L5b
            java.lang.String r0 = r5.toString()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L5b
        L8e:
            r6.f6913x = r0
            xh.b r0 = xh.c.a(r7)     // Catch: java.lang.Exception -> Lbe
            java.lang.String r3 = "com.android.vending"
            r4 = 128(0x80, float:1.794E-43)
            android.content.pm.PackageInfo r0 = r0.f(r3, r4)     // Catch: java.lang.Exception -> Lbe
            if (r0 == 0) goto Lbe
            int r3 = r0.versionCode     // Catch: java.lang.Exception -> Lbe
            java.lang.String r0 = r0.packageName     // Catch: java.lang.Exception -> Lbe
            java.lang.String r4 = java.lang.String.valueOf(r0)     // Catch: java.lang.Exception -> Lbe
            int r4 = r4.length()     // Catch: java.lang.Exception -> Lbe
            int r4 = r4 + 12
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Lbe
            r5.<init>(r4)     // Catch: java.lang.Exception -> Lbe
            r5.append(r3)     // Catch: java.lang.Exception -> Lbe
            r5.append(r1)     // Catch: java.lang.Exception -> Lbe
            r5.append(r0)     // Catch: java.lang.Exception -> Lbe
            java.lang.String r2 = r5.toString()     // Catch: java.lang.Exception -> Lbe
        Lbe:
            r6.B = r2
            android.content.res.Resources r7 = r7.getResources()
            if (r7 != 0) goto Lc7
            return
        Lc7:
            android.util.DisplayMetrics r7 = r7.getDisplayMetrics()
            if (r7 != 0) goto Lce
            return
        Lce:
            float r0 = r7.density
            r6.f6914y = r0
            int r0 = r7.widthPixels
            r6.f6915z = r0
            int r7 = r7.heightPixels
            r6.A = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.me0.<init>(android.content.Context):void");
    }

    public static ResolveInfo e(PackageManager packageManager, String str) {
        try {
            return packageManager.resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)), C.DEFAULT_BUFFER_SEGMENT_SIZE);
        } catch (Throwable th2) {
            wg.t.h().k(th2, "DeviceInfo.getResolveInfo");
            return null;
        }
    }

    public final ne0 a() {
        return new ne0(this.f6890a, this.f6906q, this.f6907r, this.f6896g, this.f6908s, this.f6909t, this.f6910u, this.f6911v, this.f6891b, this.f6892c, this.f6912w, this.f6913x, this.B, this.f6893d, this.f6897h, this.f6898i, this.f6899j, this.f6894e, this.f6895f, this.f6914y, this.f6915z, this.A, this.f6902m, this.f6903n, this.f6900k, this.f6901l, this.f6904o, this.C, this.f6905p);
    }

    public final void b(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        if (audioManager != null) {
            try {
                this.f6890a = audioManager.getMode();
                this.f6891b = audioManager.isMusicActive();
                this.f6892c = audioManager.isSpeakerphoneOn();
                this.f6893d = audioManager.getStreamVolume(3);
                this.f6894e = audioManager.getRingerMode();
                this.f6895f = audioManager.getStreamVolume(2);
                return;
            } catch (Throwable th2) {
                wg.t.h().k(th2, "DeviceInfo.gatherAudioInfo");
            }
        }
        this.f6890a = -2;
        this.f6891b = false;
        this.f6892c = false;
        this.f6893d = 0;
        this.f6894e = 2;
        this.f6895f = 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    @android.annotation.TargetApi(16)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(android.content.Context r6) {
        /*
            r5 = this;
            java.lang.String r0 = "phone"
            java.lang.Object r0 = r6.getSystemService(r0)
            android.telephony.TelephonyManager r0 = (android.telephony.TelephonyManager) r0
            java.lang.String r1 = "connectivity"
            java.lang.Object r1 = r6.getSystemService(r1)
            android.net.ConnectivityManager r1 = (android.net.ConnectivityManager) r1
            java.lang.String r2 = r0.getNetworkOperator()
            r5.f6896g = r2
            boolean r2 = vh.n.n()
            r3 = 0
            if (r2 == 0) goto L31
            ai.gx<java.lang.Boolean> r2 = ai.ox.f7971d6
            ai.mx r4 = ai.ft.c()
            java.lang.Object r2 = r4.c(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L31
            r2 = r3
            goto L35
        L31:
            int r2 = r0.getNetworkType()
        L35:
            r5.f6898i = r2
            int r0 = r0.getPhoneType()
            r5.f6899j = r0
            r0 = -2
            r5.f6897h = r0
            r5.f6900k = r3
            r0 = -1
            r5.f6901l = r0
            wg.t.d()
            java.lang.String r2 = "android.permission.ACCESS_NETWORK_STATE"
            boolean r6 = yg.d2.e(r6, r2)
            if (r6 == 0) goto L6f
            android.net.NetworkInfo r6 = r1.getActiveNetworkInfo()
            if (r6 == 0) goto L67
            int r0 = r6.getType()
            r5.f6897h = r0
            android.net.NetworkInfo$DetailedState r6 = r6.getDetailedState()
            int r6 = r6.ordinal()
            r5.f6901l = r6
            goto L69
        L67:
            r5.f6897h = r0
        L69:
            boolean r6 = r1.isActiveNetworkMetered()
            r5.f6900k = r6
        L6f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.me0.c(android.content.Context):void");
    }

    public final void d(Context context) {
        Intent registerReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        boolean z10 = false;
        if (registerReceiver == null) {
            this.f6902m = -1.0d;
            this.f6903n = false;
            return;
        }
        int intExtra = registerReceiver.getIntExtra("status", -1);
        this.f6902m = registerReceiver.getIntExtra("level", -1) / registerReceiver.getIntExtra("scale", -1);
        if (intExtra == 2 || intExtra == 5) {
            z10 = true;
        }
        this.f6903n = z10;
    }

    public me0(Context context, ne0 ne0Var) {
        b(context);
        c(context);
        d(context);
        this.f6904o = Build.FINGERPRINT;
        this.f6905p = Build.DEVICE;
        boolean z10 = false;
        if (vh.n.b() && ny.a(context)) {
            z10 = true;
        }
        this.C = z10;
        this.f6906q = ne0Var.f7273a;
        this.f6907r = ne0Var.f7274b;
        this.f6908s = ne0Var.f7276d;
        this.f6909t = ne0Var.f7277e;
        this.f6910u = ne0Var.f7278f;
        this.f6911v = ne0Var.f7279g;
        this.f6912w = ne0Var.f7280h;
        this.f6913x = ne0Var.f7281i;
        this.B = ne0Var.f7282j;
        this.f6914y = ne0Var.f7285m;
        this.f6915z = ne0Var.f7286n;
        this.A = ne0Var.f7287o;
    }
}
