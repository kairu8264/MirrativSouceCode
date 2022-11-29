package jp;

import ep.f0;
import java.lang.ref.Reference;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import jo.p;
import jp.e;
import wn.v;

/* loaded from: classes4.dex */
public final class h {

    /* renamed from: f  reason: collision with root package name */
    public static final a f38212f = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public final long f38213a;

    /* renamed from: b  reason: collision with root package name */
    public final ip.d f38214b;

    /* renamed from: c  reason: collision with root package name */
    public final b f38215c;

    /* renamed from: d  reason: collision with root package name */
    public final ConcurrentLinkedQueue<f> f38216d;

    /* renamed from: e  reason: collision with root package name */
    public final int f38217e;

    /* loaded from: classes4.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public static final class b extends ip.a {
        public b(String str) {
            super(str, false, 2, null);
        }

        @Override // ip.a
        public long f() {
            return h.this.b(System.nanoTime());
        }
    }

    public h(ip.e eVar, int i10, long j10, TimeUnit timeUnit) {
        p.h(eVar, "taskRunner");
        p.h(timeUnit, "timeUnit");
        this.f38217e = i10;
        this.f38213a = timeUnit.toNanos(j10);
        this.f38214b = eVar.i();
        this.f38215c = new b(fp.b.f32121i + " ConnectionPool");
        this.f38216d = new ConcurrentLinkedQueue<>();
        if (j10 > 0) {
            return;
        }
        throw new IllegalArgumentException(("keepAliveDuration <= 0: " + j10).toString());
    }

    public final boolean a(ep.a aVar, e eVar, List<f0> list, boolean z10) {
        p.h(aVar, "address");
        p.h(eVar, "call");
        Iterator<f> it = this.f38216d.iterator();
        while (it.hasNext()) {
            f next = it.next();
            p.g(next, "connection");
            synchronized (next) {
                if (z10) {
                    if (!next.v()) {
                        v vVar = v.f59242a;
                    }
                }
                if (next.t(aVar, list)) {
                    eVar.e(next);
                    return true;
                }
                v vVar2 = v.f59242a;
            }
        }
        return false;
    }

    public final long b(long j10) {
        Iterator<f> it = this.f38216d.iterator();
        int i10 = 0;
        long j11 = Long.MIN_VALUE;
        f fVar = null;
        int i11 = 0;
        while (it.hasNext()) {
            f next = it.next();
            p.g(next, "connection");
            synchronized (next) {
                if (d(next, j10) > 0) {
                    i11++;
                } else {
                    i10++;
                    long o10 = j10 - next.o();
                    if (o10 > j11) {
                        v vVar = v.f59242a;
                        fVar = next;
                        j11 = o10;
                    } else {
                        v vVar2 = v.f59242a;
                    }
                }
            }
        }
        long j12 = this.f38213a;
        if (j11 < j12 && i10 <= this.f38217e) {
            if (i10 > 0) {
                return j12 - j11;
            }
            if (i11 > 0) {
                return j12;
            }
            return -1L;
        }
        p.e(fVar);
        synchronized (fVar) {
            if (!fVar.n().isEmpty()) {
                return 0L;
            }
            if (fVar.o() + j11 != j10) {
                return 0L;
            }
            fVar.C(true);
            this.f38216d.remove(fVar);
            fp.b.k(fVar.D());
            if (this.f38216d.isEmpty()) {
                this.f38214b.a();
            }
            return 0L;
        }
    }

    public final boolean c(f fVar) {
        p.h(fVar, "connection");
        if (fp.b.f32120h && !Thread.holdsLock(fVar)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Thread ");
            Thread currentThread = Thread.currentThread();
            p.g(currentThread, "Thread.currentThread()");
            sb2.append(currentThread.getName());
            sb2.append(" MUST hold lock on ");
            sb2.append(fVar);
            throw new AssertionError(sb2.toString());
        } else if (!fVar.p() && this.f38217e != 0) {
            ip.d.j(this.f38214b, this.f38215c, 0L, 2, null);
            return false;
        } else {
            fVar.C(true);
            this.f38216d.remove(fVar);
            if (this.f38216d.isEmpty()) {
                this.f38214b.a();
                return true;
            }
            return true;
        }
    }

    public final int d(f fVar, long j10) {
        if (fp.b.f32120h && !Thread.holdsLock(fVar)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Thread ");
            Thread currentThread = Thread.currentThread();
            p.g(currentThread, "Thread.currentThread()");
            sb2.append(currentThread.getName());
            sb2.append(" MUST hold lock on ");
            sb2.append(fVar);
            throw new AssertionError(sb2.toString());
        }
        List<Reference<e>> n10 = fVar.n();
        int i10 = 0;
        while (i10 < n10.size()) {
            Reference<e> reference = n10.get(i10);
            if (reference.get() != null) {
                i10++;
            } else {
                np.h.f43761c.g().l("A connection to " + fVar.z().a().l() + " was leaked. Did you forget to close a response body?", ((e.b) reference).a());
                n10.remove(i10);
                fVar.C(true);
                if (n10.isEmpty()) {
                    fVar.B(j10 - this.f38213a);
                    return 0;
                }
            }
        }
        return n10.size();
    }

    public final void e(f fVar) {
        p.h(fVar, "connection");
        if (fp.b.f32120h && !Thread.holdsLock(fVar)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Thread ");
            Thread currentThread = Thread.currentThread();
            p.g(currentThread, "Thread.currentThread()");
            sb2.append(currentThread.getName());
            sb2.append(" MUST hold lock on ");
            sb2.append(fVar);
            throw new AssertionError(sb2.toString());
        }
        this.f38216d.add(fVar);
        ip.d.j(this.f38214b, this.f38215c, 0L, 2, null);
    }
}
