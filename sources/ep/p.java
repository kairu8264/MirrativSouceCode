package ep;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import jp.e;

/* loaded from: classes4.dex */
public final class p {

    /* renamed from: c  reason: collision with root package name */
    public Runnable f30987c;

    /* renamed from: d  reason: collision with root package name */
    public ExecutorService f30988d;

    /* renamed from: a  reason: collision with root package name */
    public int f30985a = 64;

    /* renamed from: b  reason: collision with root package name */
    public int f30986b = 5;

    /* renamed from: e  reason: collision with root package name */
    public final ArrayDeque<e.a> f30989e = new ArrayDeque<>();

    /* renamed from: f  reason: collision with root package name */
    public final ArrayDeque<e.a> f30990f = new ArrayDeque<>();

    /* renamed from: g  reason: collision with root package name */
    public final ArrayDeque<jp.e> f30991g = new ArrayDeque<>();

    public final void a(e.a aVar) {
        e.a d10;
        jo.p.h(aVar, "call");
        synchronized (this) {
            this.f30989e.add(aVar);
            if (!aVar.b().q() && (d10 = d(aVar.d())) != null) {
                aVar.e(d10);
            }
            wn.v vVar = wn.v.f59242a;
        }
        h();
    }

    public final synchronized void b(jp.e eVar) {
        jo.p.h(eVar, "call");
        this.f30991g.add(eVar);
    }

    public final synchronized ExecutorService c() {
        ExecutorService executorService;
        if (this.f30988d == null) {
            TimeUnit timeUnit = TimeUnit.SECONDS;
            SynchronousQueue synchronousQueue = new SynchronousQueue();
            this.f30988d = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, timeUnit, synchronousQueue, fp.b.J(fp.b.f32121i + " Dispatcher", false));
        }
        executorService = this.f30988d;
        jo.p.e(executorService);
        return executorService;
    }

    public final e.a d(String str) {
        Iterator<e.a> it = this.f30990f.iterator();
        while (it.hasNext()) {
            e.a next = it.next();
            if (jo.p.c(next.d(), str)) {
                return next;
            }
        }
        Iterator<e.a> it2 = this.f30989e.iterator();
        while (it2.hasNext()) {
            e.a next2 = it2.next();
            if (jo.p.c(next2.d(), str)) {
                return next2;
            }
        }
        return null;
    }

    public final <T> void e(Deque<T> deque, T t10) {
        Runnable runnable;
        synchronized (this) {
            if (deque.remove(t10)) {
                runnable = this.f30987c;
                wn.v vVar = wn.v.f59242a;
            } else {
                throw new AssertionError("Call wasn't in-flight!");
            }
        }
        if (h() || runnable == null) {
            return;
        }
        runnable.run();
    }

    public final void f(e.a aVar) {
        jo.p.h(aVar, "call");
        aVar.c().decrementAndGet();
        e(this.f30990f, aVar);
    }

    public final void g(jp.e eVar) {
        jo.p.h(eVar, "call");
        e(this.f30991g, eVar);
    }

    public final boolean h() {
        int i10;
        boolean z10;
        if (fp.b.f32120h && Thread.holdsLock(this)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Thread ");
            Thread currentThread = Thread.currentThread();
            jo.p.g(currentThread, "Thread.currentThread()");
            sb2.append(currentThread.getName());
            sb2.append(" MUST NOT hold lock on ");
            sb2.append(this);
            throw new AssertionError(sb2.toString());
        }
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            Iterator<e.a> it = this.f30989e.iterator();
            jo.p.g(it, "readyAsyncCalls.iterator()");
            while (it.hasNext()) {
                e.a next = it.next();
                if (this.f30990f.size() >= this.f30985a) {
                    break;
                } else if (next.c().get() < this.f30986b) {
                    it.remove();
                    next.c().incrementAndGet();
                    jo.p.g(next, "asyncCall");
                    arrayList.add(next);
                    this.f30990f.add(next);
                }
            }
            z10 = i() > 0;
            wn.v vVar = wn.v.f59242a;
        }
        int size = arrayList.size();
        for (i10 = 0; i10 < size; i10++) {
            ((e.a) arrayList.get(i10)).a(c());
        }
        return z10;
    }

    public final synchronized int i() {
        return this.f30990f.size() + this.f30991g.size();
    }
}
