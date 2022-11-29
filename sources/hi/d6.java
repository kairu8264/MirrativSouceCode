package hi;

import android.content.Context;
import android.database.ContentObserver;
import android.util.Log;

/* loaded from: classes3.dex */
public final class d6 implements a6 {

    /* renamed from: c  reason: collision with root package name */
    public static d6 f35719c;

    /* renamed from: a  reason: collision with root package name */
    public final Context f35720a;

    /* renamed from: b  reason: collision with root package name */
    public final ContentObserver f35721b;

    public d6() {
        this.f35720a = null;
        this.f35721b = null;
    }

    public d6(Context context) {
        this.f35720a = context;
        c6 c6Var = new c6(this, null);
        this.f35721b = c6Var;
        context.getContentResolver().registerContentObserver(q5.f35930a, true, c6Var);
    }

    public static d6 a(Context context) {
        d6 d6Var;
        d6 d6Var2;
        synchronized (d6.class) {
            if (f35719c == null) {
                if (c3.b.b(context, "com.google.android.providers.gsf.permission.READ_GSERVICES") == 0) {
                    d6Var2 = new d6(context);
                } else {
                    d6Var2 = new d6();
                }
                f35719c = d6Var2;
            }
            d6Var = f35719c;
        }
        return d6Var;
    }

    public static synchronized void d() {
        Context context;
        synchronized (d6.class) {
            d6 d6Var = f35719c;
            if (d6Var != null && (context = d6Var.f35720a) != null && d6Var.f35721b != null) {
                context.getContentResolver().unregisterContentObserver(f35719c.f35721b);
            }
            f35719c = null;
        }
    }

    @Override // hi.a6
    /* renamed from: b */
    public final String t(final String str) {
        if (this.f35720a == null) {
            return null;
        }
        try {
            return (String) y5.a(new z5() { // from class: hi.b6
                @Override // hi.z5
                public final Object zza() {
                    return d6.this.c(str);
                }
            });
        } catch (IllegalStateException | NullPointerException | SecurityException e10) {
            String valueOf = String.valueOf(str);
            Log.e("GservicesLoader", valueOf.length() != 0 ? "Unable to read GServices for: ".concat(valueOf) : new String("Unable to read GServices for: "), e10);
            return null;
        }
    }

    public final /* synthetic */ String c(String str) {
        return q5.a(this.f35720a.getContentResolver(), str, null);
    }
}
