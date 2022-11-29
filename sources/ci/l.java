package ci;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class l implements ih.b {

    /* renamed from: e */
    public static ih.b f19650e;

    /* renamed from: a */
    public final Context f19651a;

    /* renamed from: b */
    public boolean f19652b;

    /* renamed from: c */
    public final ScheduledExecutorService f19653c;

    /* renamed from: d */
    public final ExecutorService f19654d;

    public l(Context context) {
        this.f19652b = false;
        ScheduledExecutorService newSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
        this.f19653c = newSingleThreadScheduledExecutor;
        this.f19654d = Executors.newSingleThreadExecutor();
        this.f19651a = context;
        if (this.f19652b) {
            return;
        }
        newSingleThreadScheduledExecutor.scheduleAtFixedRate(new j(this, null), 0L, 86400L, TimeUnit.SECONDS);
        this.f19652b = true;
    }

    public static synchronized ih.b d(Context context) {
        ih.b bVar;
        synchronized (l.class) {
            rh.p.j(context, "Context must not be null");
            if (f19650e == null) {
                f19650e = new l(context.getApplicationContext());
            }
            bVar = f19650e;
        }
        return bVar;
    }

    public static final void f(Context context) {
        if (!g(context).edit().remove("app_set_id").commit()) {
            String valueOf = String.valueOf(context.getPackageName());
            Log.e("AppSet", valueOf.length() != 0 ? "Failed to clear app set ID generated for App ".concat(valueOf) : new String("Failed to clear app set ID generated for App "));
        }
        if (g(context).edit().remove("app_set_id_last_used_time").commit()) {
            return;
        }
        String valueOf2 = String.valueOf(context.getPackageName());
        Log.e("AppSet", valueOf2.length() != 0 ? "Failed to clear app set ID last used time for App ".concat(valueOf2) : new String("Failed to clear app set ID last used time for App "));
    }

    public static final SharedPreferences g(Context context) {
        return context.getSharedPreferences("app_set_id_storage", 0);
    }

    public static final void h(Context context) throws k {
        if (g(context).edit().putLong("app_set_id_last_used_time", vh.i.b().currentTimeMillis()).commit()) {
            return;
        }
        String valueOf = String.valueOf(context.getPackageName());
        Log.e("AppSet", valueOf.length() != 0 ? "Failed to store app set ID last used time for App ".concat(valueOf) : new String("Failed to store app set ID last used time for App "));
        throw new k("Failed to store the app set ID last used time.");
    }

    @Override // ih.b
    public final vi.g<ih.c> a() {
        final vi.h hVar = new vi.h();
        this.f19654d.execute(new Runnable() { // from class: ci.h
            @Override // java.lang.Runnable
            public final void run() {
                l.this.e(hVar);
            }
        });
        return hVar.a();
    }

    public final long b() {
        long j10 = g(this.f19651a).getLong("app_set_id_last_used_time", -1L);
        if (j10 != -1) {
            return j10 + 33696000000L;
        }
        return -1L;
    }

    public final /* synthetic */ void e(vi.h hVar) {
        String string = g(this.f19651a).getString("app_set_id", null);
        long b10 = b();
        if (string != null && vh.i.b().currentTimeMillis() <= b10) {
            try {
                h(this.f19651a);
            } catch (k e10) {
                hVar.b(e10);
                return;
            }
        } else {
            string = UUID.randomUUID().toString();
            try {
                Context context = this.f19651a;
                if (!g(context).edit().putString("app_set_id", string).commit()) {
                    String valueOf = String.valueOf(context.getPackageName());
                    Log.e("AppSet", valueOf.length() != 0 ? "Failed to store app set ID generated for App ".concat(valueOf) : new String("Failed to store app set ID generated for App "));
                    throw new k("Failed to store the app set ID.");
                }
                h(context);
                Context context2 = this.f19651a;
                if (!g(context2).edit().putLong("app_set_id_creation_time", vh.i.b().currentTimeMillis()).commit()) {
                    String valueOf2 = String.valueOf(context2.getPackageName());
                    Log.e("AppSet", valueOf2.length() != 0 ? "Failed to store app set ID creation time for App ".concat(valueOf2) : new String("Failed to store app set ID creation time for App "));
                    throw new k("Failed to store the app set ID creation time.");
                }
            } catch (k e11) {
                hVar.b(e11);
                return;
            }
        }
        hVar.c(new ih.c(string, 1));
    }
}
