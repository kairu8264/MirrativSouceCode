package al;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public class r {

    /* renamed from: a  reason: collision with root package name */
    public final SharedPreferences f13869a;

    /* renamed from: b  reason: collision with root package name */
    public final pk.c f13870b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f13871c;

    /* renamed from: d  reason: collision with root package name */
    public vi.h<Void> f13872d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f13873e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f13874f;

    /* renamed from: g  reason: collision with root package name */
    public Boolean f13875g;

    /* renamed from: h  reason: collision with root package name */
    public final vi.h<Void> f13876h;

    public r(pk.c cVar) {
        Object obj = new Object();
        this.f13871c = obj;
        this.f13872d = new vi.h<>();
        this.f13873e = false;
        this.f13874f = false;
        this.f13876h = new vi.h<>();
        Context h10 = cVar.h();
        this.f13870b = cVar;
        this.f13869a = g.r(h10);
        Boolean b10 = b();
        this.f13875g = b10 == null ? a(h10) : b10;
        synchronized (obj) {
            if (d()) {
                this.f13872d.e(null);
                this.f13873e = true;
            }
        }
    }

    public static Boolean f(Context context) {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_crashlytics_collection_enabled")) {
                return null;
            }
            return Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_crashlytics_collection_enabled"));
        } catch (PackageManager.NameNotFoundException e10) {
            xk.f.f().e("Could not read data collection permission from manifest", e10);
            return null;
        }
    }

    @SuppressLint({"ApplySharedPref"})
    public static void h(SharedPreferences sharedPreferences, Boolean bool) {
        SharedPreferences.Editor edit = sharedPreferences.edit();
        if (bool != null) {
            edit.putBoolean("firebase_crashlytics_collection_enabled", bool.booleanValue());
        } else {
            edit.remove("firebase_crashlytics_collection_enabled");
        }
        edit.commit();
    }

    public final Boolean a(Context context) {
        Boolean f10 = f(context);
        if (f10 == null) {
            this.f13874f = false;
            return null;
        }
        this.f13874f = true;
        return Boolean.valueOf(Boolean.TRUE.equals(f10));
    }

    public final Boolean b() {
        if (this.f13869a.contains("firebase_crashlytics_collection_enabled")) {
            this.f13874f = false;
            return Boolean.valueOf(this.f13869a.getBoolean("firebase_crashlytics_collection_enabled", true));
        }
        return null;
    }

    public void c(boolean z10) {
        if (z10) {
            this.f13876h.e(null);
            return;
        }
        throw new IllegalStateException("An invalid data collection token was used.");
    }

    public synchronized boolean d() {
        boolean q10;
        Boolean bool = this.f13875g;
        if (bool != null) {
            q10 = bool.booleanValue();
        } else {
            q10 = this.f13870b.q();
        }
        e(q10);
        return q10;
    }

    public final void e(boolean z10) {
        String str;
        String str2 = z10 ? "ENABLED" : "DISABLED";
        if (this.f13875g == null) {
            str = "global Firebase setting";
        } else {
            str = this.f13874f ? "firebase_crashlytics_collection_enabled manifest flag" : "API";
        }
        xk.f.f().b(String.format("Crashlytics automatic data collection %s by %s.", str2, str));
    }

    public synchronized void g(Boolean bool) {
        if (bool != null) {
            try {
                this.f13874f = false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f13875g = bool != null ? bool : a(this.f13870b.h());
        h(this.f13869a, bool);
        synchronized (this.f13871c) {
            if (d()) {
                if (!this.f13873e) {
                    this.f13872d.e(null);
                    this.f13873e = true;
                }
            } else if (this.f13873e) {
                this.f13872d = new vi.h<>();
                this.f13873e = false;
            }
        }
    }

    public vi.g<Void> i() {
        vi.g<Void> a10;
        synchronized (this.f13871c) {
            a10 = this.f13872d.a();
        }
        return a10;
    }

    public vi.g<Void> j(Executor executor) {
        return k0.i(executor, this.f13876h.a(), i());
    }
}
