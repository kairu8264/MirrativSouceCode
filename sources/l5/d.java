package l5;

import android.content.Context;
import android.os.PowerManager;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import l5.j;

/* loaded from: classes.dex */
public class d implements b, s5.a {
    public static final String H = k5.j.f("Processor");
    public WorkDatabase A;
    public List<e> D;

    /* renamed from: x  reason: collision with root package name */
    public Context f39555x;

    /* renamed from: y  reason: collision with root package name */
    public androidx.work.a f39556y;

    /* renamed from: z  reason: collision with root package name */
    public w5.a f39557z;
    public Map<String, j> C = new HashMap();
    public Map<String, j> B = new HashMap();
    public Set<String> E = new HashSet();
    public final List<b> F = new ArrayList();

    /* renamed from: w  reason: collision with root package name */
    public PowerManager.WakeLock f39554w = null;
    public final Object G = new Object();

    /* loaded from: classes.dex */
    public static class a implements Runnable {

        /* renamed from: w  reason: collision with root package name */
        public b f39558w;

        /* renamed from: x  reason: collision with root package name */
        public String f39559x;

        /* renamed from: y  reason: collision with root package name */
        public nk.c<Boolean> f39560y;

        public a(b bVar, String str, nk.c<Boolean> cVar) {
            this.f39558w = bVar;
            this.f39559x = str;
            this.f39560y = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z10;
            try {
                z10 = this.f39560y.get().booleanValue();
            } catch (InterruptedException | ExecutionException unused) {
                z10 = true;
            }
            this.f39558w.d(this.f39559x, z10);
        }
    }

    public d(Context context, androidx.work.a aVar, w5.a aVar2, WorkDatabase workDatabase, List<e> list) {
        this.f39555x = context;
        this.f39556y = aVar;
        this.f39557z = aVar2;
        this.A = workDatabase;
        this.D = list;
    }

    public static boolean e(String str, j jVar) {
        if (jVar != null) {
            jVar.d();
            k5.j.c().a(H, String.format("WorkerWrapper interrupted for %s", str), new Throwable[0]);
            return true;
        }
        k5.j.c().a(H, String.format("WorkerWrapper could not be found for %s", str), new Throwable[0]);
        return false;
    }

    @Override // s5.a
    public void a(String str) {
        synchronized (this.G) {
            this.B.remove(str);
            m();
        }
    }

    @Override // s5.a
    public void b(String str, k5.e eVar) {
        synchronized (this.G) {
            k5.j.c().d(H, String.format("Moving WorkSpec (%s) to the foreground", str), new Throwable[0]);
            j remove = this.C.remove(str);
            if (remove != null) {
                if (this.f39554w == null) {
                    PowerManager.WakeLock b10 = u5.j.b(this.f39555x, "ProcessorForegroundLck");
                    this.f39554w = b10;
                    b10.acquire();
                }
                this.B.put(str, remove);
                c3.a.n(this.f39555x, androidx.work.impl.foreground.a.c(this.f39555x, str, eVar));
            }
        }
    }

    public void c(b bVar) {
        synchronized (this.G) {
            this.F.add(bVar);
        }
    }

    @Override // l5.b
    public void d(String str, boolean z10) {
        synchronized (this.G) {
            this.C.remove(str);
            k5.j.c().a(H, String.format("%s %s executed; reschedule = %s", getClass().getSimpleName(), str, Boolean.valueOf(z10)), new Throwable[0]);
            for (b bVar : this.F) {
                bVar.d(str, z10);
            }
        }
    }

    public boolean f(String str) {
        boolean contains;
        synchronized (this.G) {
            contains = this.E.contains(str);
        }
        return contains;
    }

    public boolean g(String str) {
        boolean z10;
        synchronized (this.G) {
            z10 = this.C.containsKey(str) || this.B.containsKey(str);
        }
        return z10;
    }

    public boolean h(String str) {
        boolean containsKey;
        synchronized (this.G) {
            containsKey = this.B.containsKey(str);
        }
        return containsKey;
    }

    public void i(b bVar) {
        synchronized (this.G) {
            this.F.remove(bVar);
        }
    }

    public boolean j(String str) {
        return k(str, null);
    }

    public boolean k(String str, WorkerParameters.a aVar) {
        synchronized (this.G) {
            if (g(str)) {
                k5.j.c().a(H, String.format("Work %s is already enqueued for processing", str), new Throwable[0]);
                return false;
            }
            j a10 = new j.c(this.f39555x, this.f39556y, this.f39557z, this, this.A, str).c(this.D).b(aVar).a();
            nk.c<Boolean> b10 = a10.b();
            b10.i(new a(this, str, b10), this.f39557z.a());
            this.C.put(str, a10);
            this.f39557z.c().execute(a10);
            k5.j.c().a(H, String.format("%s: processing %s", getClass().getSimpleName(), str), new Throwable[0]);
            return true;
        }
    }

    public boolean l(String str) {
        boolean e10;
        synchronized (this.G) {
            boolean z10 = true;
            k5.j.c().a(H, String.format("Processor cancelling %s", str), new Throwable[0]);
            this.E.add(str);
            j remove = this.B.remove(str);
            if (remove == null) {
                z10 = false;
            }
            if (remove == null) {
                remove = this.C.remove(str);
            }
            e10 = e(str, remove);
            if (z10) {
                m();
            }
        }
        return e10;
    }

    public final void m() {
        synchronized (this.G) {
            if (!(!this.B.isEmpty())) {
                this.f39555x.startService(androidx.work.impl.foreground.a.e(this.f39555x));
                PowerManager.WakeLock wakeLock = this.f39554w;
                if (wakeLock != null) {
                    wakeLock.release();
                    this.f39554w = null;
                }
            }
        }
    }

    public boolean n(String str) {
        boolean e10;
        synchronized (this.G) {
            k5.j.c().a(H, String.format("Processor stopping foreground work %s", str), new Throwable[0]);
            e10 = e(str, this.B.remove(str));
        }
        return e10;
    }

    public boolean o(String str) {
        boolean e10;
        synchronized (this.G) {
            k5.j.c().a(H, String.format("Processor stopping background work %s", str), new Throwable[0]);
            e10 = e(str, this.C.remove(str));
        }
        return e10;
    }
}
