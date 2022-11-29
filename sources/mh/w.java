package mh;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes3.dex */
public final class w {

    /* renamed from: e */
    public static w f41174e;

    /* renamed from: a */
    public final Context f41175a;

    /* renamed from: b */
    public final ScheduledExecutorService f41176b;

    /* renamed from: c */
    public r f41177c = new r(this, null);

    /* renamed from: d */
    public int f41178d = 1;

    public w(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.f41176b = scheduledExecutorService;
        this.f41175a = context.getApplicationContext();
    }

    public static /* bridge */ /* synthetic */ Context a(w wVar) {
        return wVar.f41175a;
    }

    public static synchronized w b(Context context) {
        w wVar;
        synchronized (w.class) {
            if (f41174e == null) {
                ei.e.a();
                f41174e = new w(context, Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, new wh.a("MessengerIpcClient"))));
            }
            wVar = f41174e;
        }
        return wVar;
    }

    public static /* bridge */ /* synthetic */ ScheduledExecutorService e(w wVar) {
        return wVar.f41176b;
    }

    public final vi.g<Void> c(int i10, Bundle bundle) {
        return g(new t(f(), 2, bundle));
    }

    public final vi.g<Bundle> d(int i10, Bundle bundle) {
        return g(new v(f(), 1, bundle));
    }

    public final synchronized int f() {
        int i10;
        i10 = this.f41178d;
        this.f41178d = i10 + 1;
        return i10;
    }

    public final synchronized <T> vi.g<T> g(u<T> uVar) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(uVar);
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 9);
            sb2.append("Queueing ");
            sb2.append(valueOf);
            Log.d("MessengerIpcClient", sb2.toString());
        }
        if (!this.f41177c.g(uVar)) {
            r rVar = new r(this, null);
            this.f41177c = rVar;
            rVar.g(uVar);
        }
        return uVar.f41171b.a();
    }
}
