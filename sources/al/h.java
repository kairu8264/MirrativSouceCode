package al;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public class h {

    /* renamed from: a  reason: collision with root package name */
    public final Executor f13768a;

    /* renamed from: b  reason: collision with root package name */
    public vi.g<Void> f13769b = vi.j.e(null);

    /* renamed from: c  reason: collision with root package name */
    public final Object f13770c = new Object();

    /* renamed from: d  reason: collision with root package name */
    public final ThreadLocal<Boolean> f13771d = new ThreadLocal<>();

    /* loaded from: classes2.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            h.this.f13771d.set(Boolean.TRUE);
        }
    }

    /* loaded from: classes2.dex */
    public class b implements Callable<Void> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Runnable f13773a;

        public b(Runnable runnable) {
            this.f13773a = runnable;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Void call() throws Exception {
            this.f13773a.run();
            return null;
        }
    }

    /* loaded from: classes2.dex */
    public class c implements vi.a<Void, T> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Callable f13775a;

        public c(Callable callable) {
            this.f13775a = callable;
        }

        /* JADX WARN: Type inference failed for: r1v2, types: [T, java.lang.Object] */
        @Override // vi.a
        public T a(vi.g<Void> gVar) throws Exception {
            return this.f13775a.call();
        }
    }

    /* loaded from: classes2.dex */
    public class d implements vi.a<T, Void> {
        public d() {
        }

        @Override // vi.a
        /* renamed from: b */
        public Void a(vi.g<T> gVar) throws Exception {
            return null;
        }
    }

    public h(Executor executor) {
        this.f13768a = executor;
        executor.execute(new a());
    }

    public void b() {
        if (!e()) {
            throw new IllegalStateException("Not running on background worker thread as intended.");
        }
    }

    public Executor c() {
        return this.f13768a;
    }

    public final <T> vi.g<Void> d(vi.g<T> gVar) {
        return gVar.j(this.f13768a, new d());
    }

    public final boolean e() {
        return Boolean.TRUE.equals(this.f13771d.get());
    }

    public final <T> vi.a<Void, T> f(Callable<T> callable) {
        return new c(callable);
    }

    public vi.g<Void> g(Runnable runnable) {
        return h(new b(runnable));
    }

    public <T> vi.g<T> h(Callable<T> callable) {
        vi.g<T> j10;
        synchronized (this.f13770c) {
            j10 = this.f13769b.j(this.f13768a, f(callable));
            this.f13769b = d(j10);
        }
        return j10;
    }

    public <T> vi.g<T> i(Callable<vi.g<T>> callable) {
        vi.g<T> l10;
        synchronized (this.f13770c) {
            l10 = this.f13769b.l(this.f13768a, f(callable));
            this.f13769b = d(l10);
        }
        return l10;
    }
}
