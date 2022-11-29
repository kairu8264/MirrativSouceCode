package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import k5.j;
import l5.i;
import u5.g;
import u5.n;

/* loaded from: classes.dex */
public class d implements l5.b {
    public static final String G = j.f("SystemAlarmDispatcher");
    public final i A;
    public final androidx.work.impl.background.systemalarm.a B;
    public final Handler C;
    public final List<Intent> D;
    public Intent E;
    public c F;

    /* renamed from: w  reason: collision with root package name */
    public final Context f16603w;

    /* renamed from: x  reason: collision with root package name */
    public final w5.a f16604x;

    /* renamed from: y  reason: collision with root package name */
    public final n f16605y;

    /* renamed from: z  reason: collision with root package name */
    public final l5.d f16606z;

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            d dVar;
            RunnableC0086d runnableC0086d;
            synchronized (d.this.D) {
                d dVar2 = d.this;
                dVar2.E = dVar2.D.get(0);
            }
            Intent intent = d.this.E;
            if (intent != null) {
                String action = intent.getAction();
                int intExtra = d.this.E.getIntExtra("KEY_START_ID", 0);
                j c10 = j.c();
                String str = d.G;
                c10.a(str, String.format("Processing command %s, %s", d.this.E, Integer.valueOf(intExtra)), new Throwable[0]);
                PowerManager.WakeLock b10 = u5.j.b(d.this.f16603w, String.format("%s (%s)", action, Integer.valueOf(intExtra)));
                try {
                    j.c().a(str, String.format("Acquiring operation wake lock (%s) %s", action, b10), new Throwable[0]);
                    b10.acquire();
                    d dVar3 = d.this;
                    dVar3.B.p(dVar3.E, intExtra, dVar3);
                    j.c().a(str, String.format("Releasing operation wake lock (%s) %s", action, b10), new Throwable[0]);
                    b10.release();
                    dVar = d.this;
                    runnableC0086d = new RunnableC0086d(dVar);
                } catch (Throwable th2) {
                    try {
                        j c11 = j.c();
                        String str2 = d.G;
                        c11.b(str2, "Unexpected error in onHandleIntent", th2);
                        j.c().a(str2, String.format("Releasing operation wake lock (%s) %s", action, b10), new Throwable[0]);
                        b10.release();
                        dVar = d.this;
                        runnableC0086d = new RunnableC0086d(dVar);
                    } catch (Throwable th3) {
                        j.c().a(d.G, String.format("Releasing operation wake lock (%s) %s", action, b10), new Throwable[0]);
                        b10.release();
                        d dVar4 = d.this;
                        dVar4.k(new RunnableC0086d(dVar4));
                        throw th3;
                    }
                }
                dVar.k(runnableC0086d);
            }
        }
    }

    /* loaded from: classes.dex */
    public static class b implements Runnable {

        /* renamed from: w  reason: collision with root package name */
        public final d f16608w;

        /* renamed from: x  reason: collision with root package name */
        public final Intent f16609x;

        /* renamed from: y  reason: collision with root package name */
        public final int f16610y;

        public b(d dVar, Intent intent, int i10) {
            this.f16608w = dVar;
            this.f16609x = intent;
            this.f16610y = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f16608w.a(this.f16609x, this.f16610y);
        }
    }

    /* loaded from: classes.dex */
    public interface c {
        void i();
    }

    /* renamed from: androidx.work.impl.background.systemalarm.d$d  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class RunnableC0086d implements Runnable {

        /* renamed from: w  reason: collision with root package name */
        public final d f16611w;

        public RunnableC0086d(d dVar) {
            this.f16611w = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f16611w.c();
        }
    }

    public d(Context context) {
        this(context, null, null);
    }

    public boolean a(Intent intent, int i10) {
        j c10 = j.c();
        String str = G;
        c10.a(str, String.format("Adding command %s (%s)", intent, Integer.valueOf(i10)), new Throwable[0]);
        b();
        String action = intent.getAction();
        if (TextUtils.isEmpty(action)) {
            j.c().h(str, "Unknown command. Ignoring", new Throwable[0]);
            return false;
        } else if ("ACTION_CONSTRAINTS_CHANGED".equals(action) && i("ACTION_CONSTRAINTS_CHANGED")) {
            return false;
        } else {
            intent.putExtra("KEY_START_ID", i10);
            synchronized (this.D) {
                boolean z10 = this.D.isEmpty() ? false : true;
                this.D.add(intent);
                if (!z10) {
                    l();
                }
            }
            return true;
        }
    }

    public final void b() {
        if (this.C.getLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException("Needs to be invoked on the main thread.");
        }
    }

    public void c() {
        j c10 = j.c();
        String str = G;
        c10.a(str, "Checking if commands are complete.", new Throwable[0]);
        b();
        synchronized (this.D) {
            if (this.E != null) {
                j.c().a(str, String.format("Removing command %s", this.E), new Throwable[0]);
                if (this.D.remove(0).equals(this.E)) {
                    this.E = null;
                } else {
                    throw new IllegalStateException("Dequeue-d command is not the first.");
                }
            }
            g c11 = this.f16604x.c();
            if (!this.B.o() && this.D.isEmpty() && !c11.a()) {
                j.c().a(str, "No more commands & intents.", new Throwable[0]);
                c cVar = this.F;
                if (cVar != null) {
                    cVar.i();
                }
            } else if (!this.D.isEmpty()) {
                l();
            }
        }
    }

    @Override // l5.b
    public void d(String str, boolean z10) {
        k(new b(this, androidx.work.impl.background.systemalarm.a.c(this.f16603w, str, z10), 0));
    }

    public l5.d e() {
        return this.f16606z;
    }

    public w5.a f() {
        return this.f16604x;
    }

    public i g() {
        return this.A;
    }

    public n h() {
        return this.f16605y;
    }

    public final boolean i(String str) {
        b();
        synchronized (this.D) {
            for (Intent intent : this.D) {
                if (str.equals(intent.getAction())) {
                    return true;
                }
            }
            return false;
        }
    }

    public void j() {
        j.c().a(G, "Destroying SystemAlarmDispatcher", new Throwable[0]);
        this.f16606z.i(this);
        this.f16605y.a();
        this.F = null;
    }

    public void k(Runnable runnable) {
        this.C.post(runnable);
    }

    public final void l() {
        b();
        PowerManager.WakeLock b10 = u5.j.b(this.f16603w, "ProcessCommand");
        try {
            b10.acquire();
            this.A.p().b(new a());
        } finally {
            b10.release();
        }
    }

    public void m(c cVar) {
        if (this.F != null) {
            j.c().b(G, "A completion listener for SystemAlarmDispatcher already exists.", new Throwable[0]);
        } else {
            this.F = cVar;
        }
    }

    public d(Context context, l5.d dVar, i iVar) {
        Context applicationContext = context.getApplicationContext();
        this.f16603w = applicationContext;
        this.B = new androidx.work.impl.background.systemalarm.a(applicationContext);
        this.f16605y = new n();
        iVar = iVar == null ? i.k(context) : iVar;
        this.A = iVar;
        dVar = dVar == null ? iVar.m() : dVar;
        this.f16606z = dVar;
        this.f16604x = iVar.p();
        dVar.c(this);
        this.D = new ArrayList();
        this.E = null;
        this.C = new Handler(Looper.getMainLooper());
    }
}
