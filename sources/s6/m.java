package s6;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

/* loaded from: classes.dex */
public class m<T> {

    /* renamed from: e  reason: collision with root package name */
    public static Executor f52166e = Executors.newCachedThreadPool();

    /* renamed from: a  reason: collision with root package name */
    public final Set<h<T>> f52167a;

    /* renamed from: b  reason: collision with root package name */
    public final Set<h<Throwable>> f52168b;

    /* renamed from: c  reason: collision with root package name */
    public final Handler f52169c;

    /* renamed from: d  reason: collision with root package name */
    public volatile l<T> f52170d;

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (m.this.f52170d == null) {
                return;
            }
            l lVar = m.this.f52170d;
            if (lVar.b() != null) {
                m.this.i(lVar.b());
            } else {
                m.this.g(lVar.a());
            }
        }
    }

    /* loaded from: classes.dex */
    public class b extends FutureTask<l<T>> {
        public b(Callable<l<T>> callable) {
            super(callable);
        }

        @Override // java.util.concurrent.FutureTask
        public void done() {
            if (isCancelled()) {
                return;
            }
            try {
                m.this.l(get());
            } catch (InterruptedException | ExecutionException e10) {
                m.this.l(new l(e10));
            }
        }
    }

    public m(Callable<l<T>> callable) {
        this(callable, false);
    }

    public synchronized m<T> e(h<Throwable> hVar) {
        if (this.f52170d != null && this.f52170d.a() != null) {
            hVar.a(this.f52170d.a());
        }
        this.f52168b.add(hVar);
        return this;
    }

    public synchronized m<T> f(h<T> hVar) {
        if (this.f52170d != null && this.f52170d.b() != null) {
            hVar.a(this.f52170d.b());
        }
        this.f52167a.add(hVar);
        return this;
    }

    public final synchronized void g(Throwable th2) {
        ArrayList<h> arrayList = new ArrayList(this.f52168b);
        if (arrayList.isEmpty()) {
            f7.d.d("Lottie encountered an error but no failure listener was added:", th2);
            return;
        }
        for (h hVar : arrayList) {
            hVar.a(th2);
        }
    }

    public final void h() {
        this.f52169c.post(new a());
    }

    public final synchronized void i(T t10) {
        for (h hVar : new ArrayList(this.f52167a)) {
            hVar.a(t10);
        }
    }

    public synchronized m<T> j(h<Throwable> hVar) {
        this.f52168b.remove(hVar);
        return this;
    }

    public synchronized m<T> k(h<T> hVar) {
        this.f52167a.remove(hVar);
        return this;
    }

    public final void l(l<T> lVar) {
        if (this.f52170d == null) {
            this.f52170d = lVar;
            h();
            return;
        }
        throw new IllegalStateException("A task may only be set once.");
    }

    public m(Callable<l<T>> callable, boolean z10) {
        this.f52167a = new LinkedHashSet(1);
        this.f52168b = new LinkedHashSet(1);
        this.f52169c = new Handler(Looper.getMainLooper());
        this.f52170d = null;
        if (z10) {
            try {
                l(callable.call());
                return;
            } catch (Throwable th2) {
                l(new l<>(th2));
                return;
            }
        }
        f52166e.execute(new b(callable));
    }
}
