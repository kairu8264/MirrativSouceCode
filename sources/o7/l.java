package o7;

import com.bumptech.glide.load.engine.GlideException;
import j8.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import o7.h;
import o7.p;

/* loaded from: classes.dex */
public class l<R> implements h.b<R>, a.f {
    public static final c V = new c();
    public final c A;
    public final m B;
    public final r7.a C;
    public final r7.a D;
    public final r7.a E;
    public final r7.a F;
    public final AtomicInteger G;
    public m7.e H;
    public boolean I;
    public boolean J;
    public boolean K;
    public boolean L;
    public u<?> M;
    public m7.a N;
    public boolean O;
    public GlideException P;
    public boolean Q;
    public p<?> R;
    public h<R> S;
    public volatile boolean T;
    public boolean U;

    /* renamed from: w  reason: collision with root package name */
    public final e f44216w;

    /* renamed from: x  reason: collision with root package name */
    public final j8.c f44217x;

    /* renamed from: y  reason: collision with root package name */
    public final p.a f44218y;

    /* renamed from: z  reason: collision with root package name */
    public final n3.e<l<?>> f44219z;

    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: w  reason: collision with root package name */
        public final e8.i f44220w;

        public a(e8.i iVar) {
            this.f44220w = iVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this.f44220w.f()) {
                synchronized (l.this) {
                    if (l.this.f44216w.f(this.f44220w)) {
                        l.this.f(this.f44220w);
                    }
                    l.this.i();
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public class b implements Runnable {

        /* renamed from: w  reason: collision with root package name */
        public final e8.i f44222w;

        public b(e8.i iVar) {
            this.f44222w = iVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this.f44222w.f()) {
                synchronized (l.this) {
                    if (l.this.f44216w.f(this.f44222w)) {
                        l.this.R.b();
                        l.this.g(this.f44222w);
                        l.this.r(this.f44222w);
                    }
                    l.this.i();
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public static class c {
        public <R> p<R> a(u<R> uVar, boolean z10, m7.e eVar, p.a aVar) {
            return new p<>(uVar, z10, true, eVar, aVar);
        }
    }

    /* loaded from: classes.dex */
    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        public final e8.i f44224a;

        /* renamed from: b  reason: collision with root package name */
        public final Executor f44225b;

        public d(e8.i iVar, Executor executor) {
            this.f44224a = iVar;
            this.f44225b = executor;
        }

        public boolean equals(Object obj) {
            if (obj instanceof d) {
                return this.f44224a.equals(((d) obj).f44224a);
            }
            return false;
        }

        public int hashCode() {
            return this.f44224a.hashCode();
        }
    }

    /* loaded from: classes.dex */
    public static final class e implements Iterable<d> {

        /* renamed from: w  reason: collision with root package name */
        public final List<d> f44226w;

        public e() {
            this(new ArrayList(2));
        }

        public static d j(e8.i iVar) {
            return new d(iVar, i8.e.a());
        }

        public void clear() {
            this.f44226w.clear();
        }

        public void d(e8.i iVar, Executor executor) {
            this.f44226w.add(new d(iVar, executor));
        }

        public boolean f(e8.i iVar) {
            return this.f44226w.contains(j(iVar));
        }

        public e g() {
            return new e(new ArrayList(this.f44226w));
        }

        public boolean isEmpty() {
            return this.f44226w.isEmpty();
        }

        @Override // java.lang.Iterable
        public Iterator<d> iterator() {
            return this.f44226w.iterator();
        }

        public void k(e8.i iVar) {
            this.f44226w.remove(j(iVar));
        }

        public int size() {
            return this.f44226w.size();
        }

        public e(List<d> list) {
            this.f44226w = list;
        }
    }

    public l(r7.a aVar, r7.a aVar2, r7.a aVar3, r7.a aVar4, m mVar, p.a aVar5, n3.e<l<?>> eVar) {
        this(aVar, aVar2, aVar3, aVar4, mVar, aVar5, eVar, V);
    }

    @Override // o7.h.b
    public void a(h<?> hVar) {
        j().execute(hVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o7.h.b
    public void b(u<R> uVar, m7.a aVar, boolean z10) {
        synchronized (this) {
            this.M = uVar;
            this.N = aVar;
            this.U = z10;
        }
        o();
    }

    @Override // o7.h.b
    public void c(GlideException glideException) {
        synchronized (this) {
            this.P = glideException;
        }
        n();
    }

    public synchronized void d(e8.i iVar, Executor executor) {
        this.f44217x.c();
        this.f44216w.d(iVar, executor);
        boolean z10 = true;
        if (this.O) {
            k(1);
            executor.execute(new b(iVar));
        } else if (this.Q) {
            k(1);
            executor.execute(new a(iVar));
        } else {
            if (this.T) {
                z10 = false;
            }
            i8.j.a(z10, "Cannot add callbacks to a cancelled EngineJob");
        }
    }

    @Override // j8.a.f
    public j8.c e() {
        return this.f44217x;
    }

    public void f(e8.i iVar) {
        try {
            iVar.c(this.P);
        } catch (Throwable th2) {
            throw new o7.b(th2);
        }
    }

    public void g(e8.i iVar) {
        try {
            iVar.b(this.R, this.N, this.U);
        } catch (Throwable th2) {
            throw new o7.b(th2);
        }
    }

    public void h() {
        if (m()) {
            return;
        }
        this.T = true;
        this.S.i();
        this.B.c(this, this.H);
    }

    public void i() {
        p<?> pVar;
        synchronized (this) {
            this.f44217x.c();
            i8.j.a(m(), "Not yet complete!");
            int decrementAndGet = this.G.decrementAndGet();
            i8.j.a(decrementAndGet >= 0, "Can't decrement below 0");
            if (decrementAndGet == 0) {
                pVar = this.R;
                q();
            } else {
                pVar = null;
            }
        }
        if (pVar != null) {
            pVar.g();
        }
    }

    public final r7.a j() {
        if (this.J) {
            return this.E;
        }
        return this.K ? this.F : this.D;
    }

    public synchronized void k(int i10) {
        p<?> pVar;
        i8.j.a(m(), "Not yet complete!");
        if (this.G.getAndAdd(i10) == 0 && (pVar = this.R) != null) {
            pVar.b();
        }
    }

    public synchronized l<R> l(m7.e eVar, boolean z10, boolean z11, boolean z12, boolean z13) {
        this.H = eVar;
        this.I = z10;
        this.J = z11;
        this.K = z12;
        this.L = z13;
        return this;
    }

    public final boolean m() {
        return this.Q || this.O || this.T;
    }

    public void n() {
        synchronized (this) {
            this.f44217x.c();
            if (this.T) {
                q();
            } else if (!this.f44216w.isEmpty()) {
                if (!this.Q) {
                    this.Q = true;
                    m7.e eVar = this.H;
                    e g10 = this.f44216w.g();
                    k(g10.size() + 1);
                    this.B.d(this, eVar, null);
                    Iterator<d> it = g10.iterator();
                    while (it.hasNext()) {
                        d next = it.next();
                        next.f44225b.execute(new a(next.f44224a));
                    }
                    i();
                    return;
                }
                throw new IllegalStateException("Already failed once");
            } else {
                throw new IllegalStateException("Received an exception without any callbacks to notify");
            }
        }
    }

    public void o() {
        synchronized (this) {
            this.f44217x.c();
            if (this.T) {
                this.M.c();
                q();
            } else if (!this.f44216w.isEmpty()) {
                if (!this.O) {
                    this.R = this.A.a(this.M, this.I, this.H, this.f44218y);
                    this.O = true;
                    e g10 = this.f44216w.g();
                    k(g10.size() + 1);
                    this.B.d(this, this.H, this.R);
                    Iterator<d> it = g10.iterator();
                    while (it.hasNext()) {
                        d next = it.next();
                        next.f44225b.execute(new b(next.f44224a));
                    }
                    i();
                    return;
                }
                throw new IllegalStateException("Already have resource");
            } else {
                throw new IllegalStateException("Received a resource without any callbacks to notify");
            }
        }
    }

    public boolean p() {
        return this.L;
    }

    public final synchronized void q() {
        if (this.H != null) {
            this.f44216w.clear();
            this.H = null;
            this.R = null;
            this.M = null;
            this.Q = false;
            this.T = false;
            this.O = false;
            this.U = false;
            this.S.C(false);
            this.S = null;
            this.P = null;
            this.N = null;
            this.f44219z.a(this);
        } else {
            throw new IllegalArgumentException();
        }
    }

    public synchronized void r(e8.i iVar) {
        boolean z10;
        this.f44217x.c();
        this.f44216w.k(iVar);
        if (this.f44216w.isEmpty()) {
            h();
            if (!this.O && !this.Q) {
                z10 = false;
                if (z10 && this.G.get() == 0) {
                    q();
                }
            }
            z10 = true;
            if (z10) {
                q();
            }
        }
    }

    public synchronized void s(h<R> hVar) {
        this.S = hVar;
        (hVar.I() ? this.C : j()).execute(hVar);
    }

    public l(r7.a aVar, r7.a aVar2, r7.a aVar3, r7.a aVar4, m mVar, p.a aVar5, n3.e<l<?>> eVar, c cVar) {
        this.f44216w = new e();
        this.f44217x = j8.c.a();
        this.G = new AtomicInteger();
        this.C = aVar;
        this.D = aVar2;
        this.E = aVar3;
        this.F = aVar4;
        this.B = mVar;
        this.f44218y = aVar5;
        this.f44219z = eVar;
        this.A = cVar;
    }
}
