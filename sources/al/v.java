package al;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import java.util.Locale;
import java.util.UUID;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public class v implements w {

    /* renamed from: g  reason: collision with root package name */
    public static final Pattern f13889g = Pattern.compile("[^\\p{Alnum}]");

    /* renamed from: h  reason: collision with root package name */
    public static final String f13890h = Pattern.quote("/");

    /* renamed from: a  reason: collision with root package name */
    public final x f13891a;

    /* renamed from: b  reason: collision with root package name */
    public final Context f13892b;

    /* renamed from: c  reason: collision with root package name */
    public final String f13893c;

    /* renamed from: d  reason: collision with root package name */
    public final yl.f f13894d;

    /* renamed from: e  reason: collision with root package name */
    public final r f13895e;

    /* renamed from: f  reason: collision with root package name */
    public String f13896f;

    public v(Context context, String str, yl.f fVar, r rVar) {
        if (context == null) {
            throw new IllegalArgumentException("appContext must not be null");
        }
        if (str != null) {
            this.f13892b = context;
            this.f13893c = str;
            this.f13894d = fVar;
            this.f13895e = rVar;
            this.f13891a = new x();
            return;
        }
        throw new IllegalArgumentException("appIdentifier must not be null");
    }

    public static String c() {
        return "SYN_" + UUID.randomUUID().toString();
    }

    public static String e(String str) {
        if (str == null) {
            return null;
        }
        return f13889g.matcher(str).replaceAll("").toLowerCase(Locale.US);
    }

    public static boolean k(String str) {
        return str != null && str.startsWith("SYN_");
    }

    @Override // al.w
    public synchronized String a() {
        String str = this.f13896f;
        if (str != null) {
            return str;
        }
        xk.f.f().i("Determining Crashlytics installation ID...");
        SharedPreferences r10 = g.r(this.f13892b);
        String string = r10.getString("firebase.installation.id", null);
        xk.f f10 = xk.f.f();
        f10.i("Cached Firebase Installation ID: " + string);
        if (this.f13895e.d()) {
            String d10 = d();
            xk.f f11 = xk.f.f();
            f11.i("Fetched Firebase Installation ID: " + d10);
            if (d10 == null) {
                d10 = string == null ? c() : string;
            }
            if (d10.equals(string)) {
                this.f13896f = l(r10);
            } else {
                this.f13896f = b(d10, r10);
            }
        } else if (k(string)) {
            this.f13896f = l(r10);
        } else {
            this.f13896f = b(c(), r10);
        }
        if (this.f13896f == null) {
            xk.f.f().k("Unable to determine Crashlytics Install Id, creating a new one.");
            this.f13896f = b(c(), r10);
        }
        xk.f f12 = xk.f.f();
        f12.i("Crashlytics installation ID: " + this.f13896f);
        return this.f13896f;
    }

    public final synchronized String b(String str, SharedPreferences sharedPreferences) {
        String e10;
        e10 = e(UUID.randomUUID().toString());
        xk.f f10 = xk.f.f();
        f10.i("Created new Crashlytics installation ID: " + e10 + " for FID: " + str);
        sharedPreferences.edit().putString("crashlytics.installation.id", e10).putString("firebase.installation.id", str).apply();
        return e10;
    }

    public final String d() {
        try {
            return (String) k0.d(this.f13894d.getId());
        } catch (Exception e10) {
            xk.f.f().l("Failed to retrieve Firebase Installations ID.", e10);
            return null;
        }
    }

    public String f() {
        return this.f13893c;
    }

    public String g() {
        return this.f13891a.a(this.f13892b);
    }

    public String h() {
        return String.format(Locale.US, "%s/%s", m(Build.MANUFACTURER), m(Build.MODEL));
    }

    public String i() {
        return m(Build.VERSION.INCREMENTAL);
    }

    public String j() {
        return m(Build.VERSION.RELEASE);
    }

    public final String l(SharedPreferences sharedPreferences) {
        return sharedPreferences.getString("crashlytics.installation.id", null);
    }

    public final String m(String str) {
        return str.replaceAll(f13890h, "");
    }
}
