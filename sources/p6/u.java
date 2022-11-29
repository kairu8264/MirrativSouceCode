package p6;

import android.content.Context;
import android.content.pm.Signature;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.util.DisplayMetrics;
import com.dena.mirrorman.clientlog.logs.MRLog;
import java.util.Date;
import java.util.Locale;
import p6.w;

/* loaded from: classes.dex */
public class u {
    public String A;
    public String B;
    public String C;
    public String D;
    public int E;

    /* renamed from: a  reason: collision with root package name */
    public String f46095a;

    /* renamed from: b  reason: collision with root package name */
    public String f46096b;

    /* renamed from: c  reason: collision with root package name */
    public int f46097c;

    /* renamed from: d  reason: collision with root package name */
    public Boolean f46098d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f46099e = false;

    /* renamed from: f  reason: collision with root package name */
    public String f46100f;

    /* renamed from: g  reason: collision with root package name */
    public String f46101g;

    /* renamed from: h  reason: collision with root package name */
    public String f46102h;

    /* renamed from: i  reason: collision with root package name */
    public String f46103i;

    /* renamed from: j  reason: collision with root package name */
    public String f46104j;

    /* renamed from: k  reason: collision with root package name */
    public String f46105k;

    /* renamed from: l  reason: collision with root package name */
    public String f46106l;

    /* renamed from: m  reason: collision with root package name */
    public String f46107m;

    /* renamed from: n  reason: collision with root package name */
    public String f46108n;

    /* renamed from: o  reason: collision with root package name */
    public String f46109o;

    /* renamed from: p  reason: collision with root package name */
    public String f46110p;

    /* renamed from: q  reason: collision with root package name */
    public String f46111q;

    /* renamed from: r  reason: collision with root package name */
    public String f46112r;

    /* renamed from: s  reason: collision with root package name */
    public String f46113s;

    /* renamed from: t  reason: collision with root package name */
    public String f46114t;

    /* renamed from: u  reason: collision with root package name */
    public String f46115u;

    /* renamed from: v  reason: collision with root package name */
    public String f46116v;

    /* renamed from: w  reason: collision with root package name */
    public String f46117w;

    /* renamed from: x  reason: collision with root package name */
    public String f46118x;

    /* renamed from: y  reason: collision with root package name */
    public String f46119y;

    /* renamed from: z  reason: collision with root package name */
    public String f46120z;

    public u(Context context, String str) {
        Resources resources = context.getResources();
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        Configuration configuration = resources.getConfiguration();
        Locale r10 = c1.r(configuration);
        int i10 = configuration.screenLayout;
        this.f46105k = v(context);
        this.f46106l = e(context);
        this.f46107m = k(configuration);
        this.f46108n = j();
        this.f46109o = i();
        this.f46110p = t();
        this.f46111q = u();
        this.f46112r = b();
        this.f46113s = q(r10);
        this.f46114t = h(r10);
        this.f46115u = y(i10);
        this.f46116v = x(i10);
        this.f46117w = w(displayMetrics);
        this.f46118x = n(displayMetrics);
        this.f46119y = m(displayMetrics);
        this.f46104j = g(str);
        this.f46103i = o(context);
        this.f46120z = p();
        this.A = a();
        this.B = f();
        this.C = c(context);
        this.D = d(context);
        this.E = l(configuration);
    }

    public void A(Context context) {
        String str = this.f46095a;
        Boolean bool = this.f46098d;
        this.f46095a = null;
        this.f46098d = null;
        this.f46096b = null;
        this.f46097c = -1;
        for (int i10 = 1; i10 <= 3; i10++) {
            try {
                w.b a10 = w.a(context, i10 * 3000);
                if (this.f46095a == null) {
                    this.f46095a = a10.a();
                }
                if (this.f46098d == null) {
                    this.f46098d = a10.b();
                }
                if (this.f46095a != null && this.f46098d != null) {
                    this.f46096b = MRLog.TARGET_TYPE_SERVICE;
                    this.f46097c = i10;
                    return;
                }
            } catch (Exception unused) {
            }
        }
        for (int i11 = 1; i11 <= 3; i11++) {
            Object l10 = c1.l(context, 11000L);
            if (l10 != null) {
                if (this.f46095a == null) {
                    this.f46095a = c1.x(context, l10, 1000L);
                }
                if (this.f46098d == null) {
                    this.f46098d = c1.Q(context, l10, 1000L);
                }
                if (this.f46095a != null && this.f46098d != null) {
                    this.f46096b = "library";
                    this.f46097c = i11;
                    return;
                }
            }
        }
        if (this.f46095a == null) {
            this.f46095a = str;
        }
        if (this.f46098d == null) {
            this.f46098d = bool;
        }
    }

    public final String a() {
        String[] C = c1.C();
        if (C != null && C.length != 0) {
            return C[0];
        }
        return c1.o();
    }

    public final String b() {
        return "" + Build.VERSION.SDK_INT;
    }

    public final String c(Context context) {
        try {
            return c1.f45891b.format(new Date(context.getPackageManager().getPackageInfo(context.getPackageName(), 4096).firstInstallTime));
        } catch (Exception unused) {
            return null;
        }
    }

    public final String d(Context context) {
        try {
            return c1.f45891b.format(new Date(context.getPackageManager().getPackageInfo(context.getPackageName(), 4096).lastUpdateTime));
        } catch (Exception unused) {
            return null;
        }
    }

    public final String e(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (Exception unused) {
            return null;
        }
    }

    public final String f() {
        return Build.ID;
    }

    public final String g(String str) {
        return str == null ? "android4.28.8" : c1.k("%s@%s", str, "android4.28.8");
    }

    public final String h(Locale locale) {
        return locale.getCountry();
    }

    public final String i() {
        return Build.MANUFACTURER;
    }

    public final String j() {
        return Build.MODEL;
    }

    public final String k(Configuration configuration) {
        if ((configuration.uiMode & 15) == 4) {
            return "tv";
        }
        int i10 = configuration.screenLayout & 15;
        if (i10 == 1 || i10 == 2) {
            return "phone";
        }
        if (i10 == 3 || i10 == 4) {
            return "tablet";
        }
        return null;
    }

    public final int l(Configuration configuration) {
        return configuration.uiMode & 15;
    }

    public final String m(DisplayMetrics displayMetrics) {
        return String.valueOf(displayMetrics.heightPixels);
    }

    public final String n(DisplayMetrics displayMetrics) {
        return String.valueOf(displayMetrics.widthPixels);
    }

    public final String o(Context context) {
        Cursor query;
        try {
            Signature[] signatureArr = context.getPackageManager().getPackageInfo("com.facebook.katana", 64).signatures;
            if (signatureArr == null || signatureArr.length != 1 || !"30820268308201d102044a9c4610300d06092a864886f70d0101040500307a310b3009060355040613025553310b3009060355040813024341311230100603550407130950616c6f20416c746f31183016060355040a130f46616365626f6f6b204d6f62696c653111300f060355040b130846616365626f6f6b311d301b0603550403131446616365626f6f6b20436f72706f726174696f6e3020170d3039303833313231353231365a180f32303530303932353231353231365a307a310b3009060355040613025553310b3009060355040813024341311230100603550407130950616c6f20416c746f31183016060355040a130f46616365626f6f6b204d6f62696c653111300f060355040b130846616365626f6f6b311d301b0603550403131446616365626f6f6b20436f72706f726174696f6e30819f300d06092a864886f70d010101050003818d0030818902818100c207d51df8eb8c97d93ba0c8c1002c928fab00dc1b42fca5e66e99cc3023ed2d214d822bc59e8e35ddcf5f44c7ae8ade50d7e0c434f500e6c131f4a2834f987fc46406115de2018ebbb0d5a3c261bd97581ccfef76afc7135a6d59e8855ecd7eacc8f8737e794c60a761c536b72b11fac8e603f5da1a2d54aa103b8a13c0dbc10203010001300d06092a864886f70d0101040500038181005ee9be8bcbb250648d3b741290a82a1c9dc2e76a0af2f2228f1d9f9c4007529c446a70175c5a900d5141812866db46be6559e2141616483998211f4a673149fb2232a10d247663b26a9031e15f84bc1c74d141ff98a02d76f85b2c8ab2571b6469b232d8e768a7f7ca04f7abe4a775615916c07940656b58717457b42bd928a2".equals(signatureArr[0].toCharsString()) || (query = context.getContentResolver().query(Uri.parse("content://com.facebook.katana.provider.AttributionIdProvider"), new String[]{"aid"}, null, null, null)) == null) {
                return null;
            }
            if (!query.moveToFirst()) {
                query.close();
                return null;
            }
            String string = query.getString(query.getColumnIndex("aid"));
            query.close();
            return string;
        } catch (Exception unused) {
        }
        return null;
    }

    public final String p() {
        return Build.DISPLAY;
    }

    public final String q(Locale locale) {
        return locale.getLanguage();
    }

    public final String r(String str) {
        if (str == null) {
            return null;
        }
        return c1.a0(str);
    }

    public final String s(String str) {
        if (str == null) {
            return null;
        }
        return c1.S(str.replaceAll(":", ""));
    }

    public final String t() {
        return "android";
    }

    public final String u() {
        return Build.VERSION.RELEASE;
    }

    public final String v(Context context) {
        return context.getPackageName();
    }

    public final String w(DisplayMetrics displayMetrics) {
        int i10 = displayMetrics.densityDpi;
        if (i10 == 0) {
            return null;
        }
        return i10 < 140 ? "low" : i10 > 200 ? "high" : "medium";
    }

    public final String x(int i10) {
        int i11 = i10 & 48;
        if (i11 != 16) {
            if (i11 != 32) {
                return null;
            }
            return "long";
        }
        return "normal";
    }

    public final String y(int i10) {
        int i11 = i10 & 15;
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 != 4) {
                        return null;
                    }
                    return "xlarge";
                }
                return "large";
            }
            return "normal";
        }
        return "small";
    }

    public void z(Context context) {
        if (this.f46099e) {
            return;
        }
        if (!c1.a(context, "android.permission.ACCESS_WIFI_STATE")) {
            k.h().b("Missing permission: ACCESS_WIFI_STATE", new Object[0]);
        }
        String t10 = c1.t(context);
        this.f46100f = r(t10);
        this.f46101g = s(t10);
        this.f46102h = c1.m(context);
        this.f46099e = true;
    }
}
