package ip;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import jo.h;
import jo.p;
import wn.v;

/* loaded from: classes4.dex */
public final class e {

    /* renamed from: i  reason: collision with root package name */
    public static final Logger f36976i;

    /* renamed from: a  reason: collision with root package name */
    public int f36978a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f36979b;

    /* renamed from: c  reason: collision with root package name */
    public long f36980c;

    /* renamed from: d  reason: collision with root package name */
    public final List<ip.d> f36981d;

    /* renamed from: e  reason: collision with root package name */
    public final List<ip.d> f36982e;

    /* renamed from: f  reason: collision with root package name */
    public final Runnable f36983f;

    /* renamed from: g  reason: collision with root package name */
    public final a f36984g;

    /* renamed from: j  reason: collision with root package name */
    public static final b f36977j = new b(null);

    /* renamed from: h  reason: collision with root package name */
    public static final e f36975h = new e(new c(fp.b.J(fp.b.f32121i + " TaskRunner", true)));

    /* loaded from: classes4.dex */
    public interface a {
        long a();

        void b(e eVar);

        void c(e eVar, long j10);

        void execute(Runnable runnable);
    }

    /* loaded from: classes4.dex */
    public static final class b {
        public b() {
        }

        public final Logger a() {
            return e.f36976i;
        }

        public /* synthetic */ b(h hVar) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public static final class c implements a {

        /* renamed from: a  reason: collision with root package name */
        public final ThreadPoolExecutor f36985a;

        public c(ThreadFactory threadFactory) {
            p.h(threadFactory, "threadFactory");
            this.f36985a = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), threadFactory);
        }

        @Override // ip.e.a
        public long a() {
            return System.nanoTime();
        }

        @Override // ip.e.a
        public void b(e eVar) {
            p.h(eVar, "taskRunner");
            eVar.notify();
        }

        @Override // ip.e.a
        public void c(e eVar, long j10) throws InterruptedException {
            p.h(eVar, "taskRunner");
            long j11 = j10 / 1000000;
            long j12 = j10 - (1000000 * j11);
            if (j11 > 0 || j10 > 0) {
                eVar.wait(j11, (int) j12);
            }
        }

        @Override // ip.e.a
        public void execute(Runnable runnable) {
            p.h(runnable, "runnable");
            this.f36985a.execute(runnable);
        }
    }

    /* loaded from: classes4.dex */
    public static final class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ip.a d10;
            while (true) {
                synchronized (e.this) {
                    d10 = e.this.d();
                }
                if (d10 == null) {
                    return;
                }
                ip.d d11 = d10.d();
                p.e(d11);
                long j10 = -1;
                boolean isLoggable = e.f36977j.a().isLoggable(Level.FINE);
                if (isLoggable) {
                    j10 = d11.h().g().a();
                    ip.b.c(d10, d11, "starting");
                }
                try {
                    e.this.j(d10);
                    v vVar = v.f59242a;
                    if (isLoggable) {
                        long a10 = d11.h().g().a() - j10;
                        ip.b.c(d10, d11, "finished run in " + ip.b.b(a10));
                    }
                } catch (Throwable th2) {
                    if (isLoggable) {
                        long a11 = d11.h().g().a() - j10;
                        ip.b.c(d10, d11, "failed a run in " + ip.b.b(a11));
                    }
                    throw th2;
                }
            }
        }
    }

    static {
        Logger logger = Logger.getLogger(e.class.getName());
        p.g(logger, "Logger.getLogger(TaskRunner::class.java.name)");
        f36976i = logger;
    }

    public e(a aVar) {
        p.h(aVar, "backend");
        this.f36984g = aVar;
        this.f36978a = 10000;
        this.f36981d = new ArrayList();
        this.f36982e = new ArrayList();
        this.f36983f = new d();
    }

    public final void c(ip.a aVar, long j10) {
        if (fp.b.f32120h && !Thread.holdsLock(this)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Thread ");
            Thread currentThread = Thread.currentThread();
            p.g(currentThread, "Thread.currentThread()");
            sb2.append(currentThread.getName());
            sb2.append(" MUST hold lock on ");
            sb2.append(this);
            throw new AssertionError(sb2.toString());
        }
        ip.d d10 = aVar.d();
        p.e(d10);
        if (d10.c() == aVar) {
            boolean d11 = d10.d();
            d10.m(false);
            d10.l(null);
            this.f36981d.remove(d10);
            if (j10 != -1 && !d11 && !d10.g()) {
                d10.k(aVar, j10, true);
            }
            if (!d10.e().isEmpty()) {
                this.f36982e.add(d10);
                return;
            }
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public final ip.a d() {
        boolean z10;
        if (fp.b.f32120h && !Thread.holdsLock(this)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Thread ");
            Thread currentThread = Thread.currentThread();
            p.g(currentThread, "Thread.currentThread()");
            sb2.append(currentThread.getName());
            sb2.append(" MUST hold lock on ");
            sb2.append(this);
            throw new AssertionError(sb2.toString());
        }
        while (!this.f36982e.isEmpty()) {
            long a10 = this.f36984g.a();
            long j10 = Long.MAX_VALUE;
            Iterator<ip.d> it = this.f36982e.iterator();
            ip.a aVar = null;
            while (true) {
                if (!it.hasNext()) {
                    z10 = false;
                    break;
                }
                ip.a aVar2 = it.next().e().get(0);
                long max = Math.max(0L, aVar2.c() - a10);
                if (max > 0) {
                    j10 = Math.min(max, j10);
                } else if (aVar != null) {
                    z10 = true;
                    break;
                } else {
                    aVar = aVar2;
                }
            }
            if (aVar != null) {
                e(aVar);
                if (z10 || (!this.f36979b && (!this.f36982e.isEmpty()))) {
                    this.f36984g.execute(this.f36983f);
                }
                return aVar;
            } else if (this.f36979b) {
                if (j10 < this.f36980c - a10) {
                    this.f36984g.b(this);
                }
                return null;
            } else {
                this.f36979b = true;
                this.f36980c = a10 + j10;
                try {
                    try {
                        this.f36984g.c(this, j10);
                    } catch (InterruptedException unused) {
                        f();
                    }
                } finally {
                    this.f36979b = false;
                }
            }
        }
        return null;
    }

    public final void e(ip.a aVar) {
        if (fp.b.f32120h && !Thread.holdsLock(this)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Thread ");
            Thread currentThread = Thread.currentThread();
            p.g(currentThread, "Thread.currentThread()");
            sb2.append(currentThread.getName());
            sb2.append(" MUST hold lock on ");
            sb2.append(this);
            throw new AssertionError(sb2.toString());
        }
        aVar.g(-1L);
        ip.d d10 = aVar.d();
        p.e(d10);
        d10.e().remove(aVar);
        this.f36982e.remove(d10);
        d10.l(aVar);
        this.f36981d.add(d10);
    }

    public final void f() {
        for (int size = this.f36981d.size() - 1; size >= 0; size--) {
            this.f36981d.get(size).b();
        }
        for (int size2 = this.f36982e.size() - 1; size2 >= 0; size2--) {
            ip.d dVar = this.f36982e.get(size2);
            dVar.b();
            if (dVar.e().isEmpty()) {
                this.f36982e.remove(size2);
            }
        }
    }

    public final a g() {
        return this.f36984g;
    }

    public final void h(ip.d dVar) {
        p.h(dVar, "taskQueue");
        if (fp.b.f32120h && !Thread.holdsLock(this)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Thread ");
            Thread currentThread = Thread.currentThread();
            p.g(currentThread, "Thread.currentThread()");
            sb2.append(currentThread.getName());
            sb2.append(" MUST hold lock on ");
            sb2.append(this);
            throw new AssertionError(sb2.toString());
        }
        if (dVar.c() == null) {
            if (!dVar.e().isEmpty()) {
                fp.b.a(this.f36982e, dVar);
            } else {
                this.f36982e.remove(dVar);
            }
        }
        if (this.f36979b) {
            this.f36984g.b(this);
        } else {
            this.f36984g.execute(this.f36983f);
        }
    }

    public final ip.d i() {
        int i10;
        synchronized (this) {
            i10 = this.f36978a;
            this.f36978a = i10 + 1;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append('Q');
        sb2.append(i10);
        return new ip.d(this, sb2.toString());
    }

    public final void j(ip.a aVar) {
        if (fp.b.f32120h && Thread.holdsLock(this)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Thread ");
            Thread currentThread = Thread.currentThread();
            p.g(currentThread, "Thread.currentThread()");
            sb2.append(currentThread.getName());
            sb2.append(" MUST NOT hold lock on ");
            sb2.append(this);
            throw new AssertionError(sb2.toString());
        }
        Thread currentThread2 = Thread.currentThread();
        p.g(currentThread2, "currentThread");
        String name = currentThread2.getName();
        currentThread2.setName(aVar.b());
        try {
            long f10 = aVar.f();
            synchronized (this) {
                c(aVar, f10);
                v vVar = v.f59242a;
            }
            currentThread2.setName(name);
        } catch (Throwable th2) {
            synchronized (this) {
                c(aVar, -1L);
                v vVar2 = v.f59242a;
                currentThread2.setName(name);
                throw th2;
            }
        }
    }
}
