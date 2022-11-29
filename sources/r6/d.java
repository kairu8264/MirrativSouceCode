package r6;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p6.k;

/* loaded from: classes.dex */
public class d implements h {

    /* renamed from: a  reason: collision with root package name */
    public final List<Runnable> f49774a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public boolean f49775b = false;

    /* renamed from: c  reason: collision with root package name */
    public boolean f49776c = false;

    /* renamed from: d  reason: collision with root package name */
    public ThreadPoolExecutor f49777d;

    /* loaded from: classes.dex */
    public class a implements RejectedExecutionHandler {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f49778a;

        public a(String str) {
            this.f49778a = str;
        }

        @Override // java.util.concurrent.RejectedExecutionHandler
        public void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
            k.h().b("Runnable [%s] rejected from [%s] ", runnable.toString(), this.f49778a);
        }
    }

    /* loaded from: classes.dex */
    public class b implements Runnable {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ long f49780w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ Runnable f49781x;

        public b(long j10, Runnable runnable) {
            this.f49780w = j10;
            this.f49781x = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Thread.sleep(this.f49780w);
            } catch (InterruptedException e10) {
                k.h().b("Sleep delay exception: %s", e10.getMessage());
            }
            d.this.submit(this.f49781x);
        }
    }

    /* loaded from: classes.dex */
    public class c implements Runnable {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ Runnable f49783w;

        public c(Runnable runnable) {
            this.f49783w = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            Runnable runnable;
            d.this.g(this.f49783w);
            while (true) {
                synchronized (d.this.f49774a) {
                    if (d.this.f49776c) {
                        return;
                    }
                    if (d.this.f49774a.isEmpty()) {
                        d.this.f49775b = false;
                        return;
                    } else {
                        runnable = (Runnable) d.this.f49774a.get(0);
                        d.this.f49774a.remove(0);
                    }
                }
                d.this.g(runnable);
            }
        }
    }

    public d(String str) {
        this.f49777d = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), new g(str), new a(str));
    }

    @Override // r6.h
    public void a(Runnable runnable, long j10) {
        synchronized (this.f49774a) {
            if (this.f49776c) {
                return;
            }
            this.f49777d.submit(new b(j10, runnable));
        }
    }

    public final void f(Runnable runnable) {
        this.f49777d.submit(new c(runnable));
    }

    public final void g(Runnable runnable) {
        try {
            if (this.f49776c) {
                return;
            }
            runnable.run();
        } catch (Throwable th2) {
            k.h().b("Execution failed: %s", th2.getMessage());
        }
    }

    @Override // r6.f
    public void submit(Runnable runnable) {
        synchronized (this.f49774a) {
            if (this.f49776c) {
                return;
            }
            if (!this.f49775b) {
                this.f49775b = true;
                f(runnable);
            } else {
                this.f49774a.add(runnable);
            }
        }
    }
}
