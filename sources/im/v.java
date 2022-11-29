package im;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes4.dex */
public class v {

    /* renamed from: c  reason: collision with root package name */
    public static final lm.a f36896c = lm.a.e();

    /* renamed from: d  reason: collision with root package name */
    public static v f36897d;

    /* renamed from: a  reason: collision with root package name */
    public volatile SharedPreferences f36898a;

    /* renamed from: b  reason: collision with root package name */
    public final ExecutorService f36899b;

    public v(ExecutorService executorService) {
        this.f36899b = executorService;
    }

    public static synchronized v e() {
        v vVar;
        synchronized (v.class) {
            if (f36897d == null) {
                f36897d = new v(Executors.newSingleThreadExecutor());
            }
            vVar = f36897d;
        }
        return vVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void h(Context context) {
        if (this.f36898a != null || context == null) {
            return;
        }
        this.f36898a = context.getSharedPreferences("FirebasePerfSharedPrefs", 0);
    }

    public sm.e<Boolean> b(String str) {
        if (str == null) {
            f36896c.a("Key is null when getting boolean value on device cache.");
            return sm.e.a();
        }
        if (this.f36898a == null) {
            i(c());
            if (this.f36898a == null) {
                return sm.e.a();
            }
        }
        if (!this.f36898a.contains(str)) {
            return sm.e.a();
        }
        try {
            return sm.e.e(Boolean.valueOf(this.f36898a.getBoolean(str, false)));
        } catch (ClassCastException e10) {
            f36896c.b("Key %s from sharedPreferences has type other than long: %s", str, e10.getMessage());
            return sm.e.a();
        }
    }

    public final Context c() {
        try {
            pk.c.i();
            return pk.c.i().h();
        } catch (IllegalStateException unused) {
            return null;
        }
    }

    public sm.e<Float> d(String str) {
        if (str == null) {
            f36896c.a("Key is null when getting float value on device cache.");
            return sm.e.a();
        }
        if (this.f36898a == null) {
            i(c());
            if (this.f36898a == null) {
                return sm.e.a();
            }
        }
        if (!this.f36898a.contains(str)) {
            return sm.e.a();
        }
        try {
            return sm.e.e(Float.valueOf(this.f36898a.getFloat(str, 0.0f)));
        } catch (ClassCastException e10) {
            f36896c.b("Key %s from sharedPreferences has type other than float: %s", str, e10.getMessage());
            return sm.e.a();
        }
    }

    public sm.e<Long> f(String str) {
        if (str == null) {
            f36896c.a("Key is null when getting long value on device cache.");
            return sm.e.a();
        }
        if (this.f36898a == null) {
            i(c());
            if (this.f36898a == null) {
                return sm.e.a();
            }
        }
        if (!this.f36898a.contains(str)) {
            return sm.e.a();
        }
        try {
            return sm.e.e(Long.valueOf(this.f36898a.getLong(str, 0L)));
        } catch (ClassCastException e10) {
            f36896c.b("Key %s from sharedPreferences has type other than long: %s", str, e10.getMessage());
            return sm.e.a();
        }
    }

    public sm.e<String> g(String str) {
        if (str == null) {
            f36896c.a("Key is null when getting String value on device cache.");
            return sm.e.a();
        }
        if (this.f36898a == null) {
            i(c());
            if (this.f36898a == null) {
                return sm.e.a();
            }
        }
        if (!this.f36898a.contains(str)) {
            return sm.e.a();
        }
        try {
            return sm.e.e(this.f36898a.getString(str, ""));
        } catch (ClassCastException e10) {
            f36896c.b("Key %s from sharedPreferences has type other than String: %s", str, e10.getMessage());
            return sm.e.a();
        }
    }

    public synchronized void i(final Context context) {
        if (this.f36898a == null && context != null) {
            this.f36899b.execute(new Runnable() { // from class: im.u
                @Override // java.lang.Runnable
                public final void run() {
                    v.this.h(context);
                }
            });
        }
    }

    public boolean j(String str, float f10) {
        if (str == null) {
            f36896c.a("Key is null when setting float value on device cache.");
            return false;
        }
        if (this.f36898a == null) {
            i(c());
            if (this.f36898a == null) {
                return false;
            }
        }
        this.f36898a.edit().putFloat(str, f10).apply();
        return true;
    }

    public boolean k(String str, long j10) {
        if (str == null) {
            f36896c.a("Key is null when setting long value on device cache.");
            return false;
        }
        if (this.f36898a == null) {
            i(c());
            if (this.f36898a == null) {
                return false;
            }
        }
        this.f36898a.edit().putLong(str, j10).apply();
        return true;
    }

    public boolean l(String str, String str2) {
        if (str == null) {
            f36896c.a("Key is null when setting String value on device cache.");
            return false;
        }
        if (this.f36898a == null) {
            i(c());
            if (this.f36898a == null) {
                return false;
            }
        }
        if (str2 == null) {
            this.f36898a.edit().remove(str).apply();
            return true;
        }
        this.f36898a.edit().putString(str, str2).apply();
        return true;
    }

    public boolean m(String str, boolean z10) {
        if (str == null) {
            f36896c.a("Key is null when setting boolean value on device cache.");
            return false;
        }
        if (this.f36898a == null) {
            i(c());
            if (this.f36898a == null) {
                return false;
            }
        }
        this.f36898a.edit().putBoolean(str, z10).apply();
        return true;
    }
}
