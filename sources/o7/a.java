package o7;

import android.os.Process;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import o7.p;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f44123a;

    /* renamed from: b  reason: collision with root package name */
    public final Executor f44124b;

    /* renamed from: c  reason: collision with root package name */
    public final Map<m7.e, d> f44125c;

    /* renamed from: d  reason: collision with root package name */
    public final ReferenceQueue<p<?>> f44126d;

    /* renamed from: e  reason: collision with root package name */
    public p.a f44127e;

    /* renamed from: f  reason: collision with root package name */
    public volatile boolean f44128f;

    /* renamed from: g  reason: collision with root package name */
    public volatile c f44129g;

    /* renamed from: o7.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class ThreadFactoryC0657a implements ThreadFactory {

        /* renamed from: o7.a$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class RunnableC0658a implements Runnable {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ Runnable f44130w;

            public RunnableC0658a(Runnable runnable) {
                this.f44130w = runnable;
            }

            @Override // java.lang.Runnable
            public void run() {
                Process.setThreadPriority(10);
                this.f44130w.run();
            }
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(new RunnableC0658a(runnable), "glide-active-resources");
        }
    }

    /* loaded from: classes.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.b();
        }
    }

    /* loaded from: classes.dex */
    public interface c {
        void a();
    }

    /* loaded from: classes.dex */
    public static final class d extends WeakReference<p<?>> {

        /* renamed from: a  reason: collision with root package name */
        public final m7.e f44133a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f44134b;

        /* renamed from: c  reason: collision with root package name */
        public u<?> f44135c;

        public d(m7.e eVar, p<?> pVar, ReferenceQueue<? super p<?>> referenceQueue, boolean z10) {
            super(pVar, referenceQueue);
            this.f44133a = (m7.e) i8.j.d(eVar);
            this.f44135c = (pVar.f() && z10) ? (u) i8.j.d(pVar.e()) : null;
            this.f44134b = pVar.f();
        }

        public void a() {
            this.f44135c = null;
            clear();
        }
    }

    public a(boolean z10) {
        this(z10, Executors.newSingleThreadExecutor(new ThreadFactoryC0657a()));
    }

    public synchronized void a(m7.e eVar, p<?> pVar) {
        d put = this.f44125c.put(eVar, new d(eVar, pVar, this.f44126d, this.f44123a));
        if (put != null) {
            put.a();
        }
    }

    public void b() {
        while (!this.f44128f) {
            try {
                c((d) this.f44126d.remove());
                c cVar = this.f44129g;
                if (cVar != null) {
                    cVar.a();
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public void c(d dVar) {
        u<?> uVar;
        synchronized (this) {
            this.f44125c.remove(dVar.f44133a);
            if (dVar.f44134b && (uVar = dVar.f44135c) != null) {
                this.f44127e.b(dVar.f44133a, new p<>(uVar, true, false, dVar.f44133a, this.f44127e));
            }
        }
    }

    public synchronized void d(m7.e eVar) {
        d remove = this.f44125c.remove(eVar);
        if (remove != null) {
            remove.a();
        }
    }

    public synchronized p<?> e(m7.e eVar) {
        d dVar = this.f44125c.get(eVar);
        if (dVar == null) {
            return null;
        }
        p<?> pVar = dVar.get();
        if (pVar == null) {
            c(dVar);
        }
        return pVar;
    }

    public void f(p.a aVar) {
        synchronized (aVar) {
            synchronized (this) {
                this.f44127e = aVar;
            }
        }
    }

    public void g() {
        this.f44128f = true;
        Executor executor = this.f44124b;
        if (executor instanceof ExecutorService) {
            i8.e.c((ExecutorService) executor);
        }
    }

    public a(boolean z10, Executor executor) {
        this.f44125c = new HashMap();
        this.f44126d = new ReferenceQueue<>();
        this.f44123a = z10;
        this.f44124b = executor;
        executor.execute(new b());
    }
}
