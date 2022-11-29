package em;

import android.annotation.SuppressLint;
import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;
import em.x0;
import java.util.concurrent.ExecutorService;

@SuppressLint({"UnwrappedWakefulBroadcastReceiver"})
/* loaded from: classes4.dex */
public abstract class f extends Service {

    /* renamed from: x  reason: collision with root package name */
    public Binder f30679x;

    /* renamed from: z  reason: collision with root package name */
    public int f30681z;

    /* renamed from: w  reason: collision with root package name */
    public final ExecutorService f30678w = m.b();

    /* renamed from: y  reason: collision with root package name */
    public final Object f30680y = new Object();
    public int A = 0;

    /* loaded from: classes4.dex */
    public class a implements x0.a {
        public a() {
        }

        @Override // em.x0.a
        public vi.g<Void> a(Intent intent) {
            return f.this.h(intent);
        }
    }

    public final void b(Intent intent) {
        if (intent != null) {
            u0.b(intent);
        }
        synchronized (this.f30680y) {
            int i10 = this.A - 1;
            this.A = i10;
            if (i10 == 0) {
                i(this.f30681z);
            }
        }
    }

    public Intent c(Intent intent) {
        return intent;
    }

    public abstract void d(Intent intent);

    public boolean e(Intent intent) {
        return false;
    }

    public /* synthetic */ void f(Intent intent, vi.g gVar) {
        b(intent);
    }

    public /* synthetic */ void g(Intent intent, vi.h hVar) {
        try {
            d(intent);
        } finally {
            hVar.c(null);
        }
    }

    public final vi.g<Void> h(final Intent intent) {
        if (e(intent)) {
            return vi.j.e(null);
        }
        final vi.h hVar = new vi.h();
        this.f30678w.execute(new Runnable() { // from class: em.d
            @Override // java.lang.Runnable
            public final void run() {
                f.this.g(intent, hVar);
            }
        });
        return hVar.a();
    }

    public boolean i(int i10) {
        return stopSelfResult(i10);
    }

    @Override // android.app.Service
    public final synchronized IBinder onBind(Intent intent) {
        if (Log.isLoggable("EnhancedIntentService", 3)) {
            Log.d("EnhancedIntentService", "Service received bind request");
        }
        if (this.f30679x == null) {
            this.f30679x = new x0(new a());
        }
        return this.f30679x;
    }

    @Override // android.app.Service
    public void onDestroy() {
        this.f30678w.shutdown();
        super.onDestroy();
    }

    @Override // android.app.Service
    public final int onStartCommand(final Intent intent, int i10, int i11) {
        synchronized (this.f30680y) {
            this.f30681z = i11;
            this.A++;
        }
        Intent c10 = c(intent);
        if (c10 == null) {
            b(intent);
            return 2;
        }
        vi.g<Void> h10 = h(c10);
        if (h10.r()) {
            b(intent);
            return 2;
        }
        h10.b(e.f30672w, new vi.c() { // from class: em.c
            @Override // vi.c
            public final void a(vi.g gVar) {
                f.this.f(intent, gVar);
            }
        });
        return 3;
    }
}
