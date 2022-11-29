package ip;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;
import jo.p;
import wn.v;

/* loaded from: classes4.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public boolean f36969a;

    /* renamed from: b  reason: collision with root package name */
    public a f36970b;

    /* renamed from: c  reason: collision with root package name */
    public final List<a> f36971c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f36972d;

    /* renamed from: e  reason: collision with root package name */
    public final e f36973e;

    /* renamed from: f  reason: collision with root package name */
    public final String f36974f;

    public d(e eVar, String str) {
        p.h(eVar, "taskRunner");
        p.h(str, "name");
        this.f36973e = eVar;
        this.f36974f = str;
        this.f36971c = new ArrayList();
    }

    public static /* synthetic */ void j(d dVar, a aVar, long j10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = 0;
        }
        dVar.i(aVar, j10);
    }

    public final void a() {
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
        synchronized (this.f36973e) {
            if (b()) {
                this.f36973e.h(this);
            }
            v vVar = v.f59242a;
        }
    }

    public final boolean b() {
        a aVar = this.f36970b;
        if (aVar != null) {
            p.e(aVar);
            if (aVar.a()) {
                this.f36972d = true;
            }
        }
        boolean z10 = false;
        for (int size = this.f36971c.size() - 1; size >= 0; size--) {
            if (this.f36971c.get(size).a()) {
                a aVar2 = this.f36971c.get(size);
                if (e.f36977j.a().isLoggable(Level.FINE)) {
                    b.a(aVar2, this, "canceled");
                }
                this.f36971c.remove(size);
                z10 = true;
            }
        }
        return z10;
    }

    public final a c() {
        return this.f36970b;
    }

    public final boolean d() {
        return this.f36972d;
    }

    public final List<a> e() {
        return this.f36971c;
    }

    public final String f() {
        return this.f36974f;
    }

    public final boolean g() {
        return this.f36969a;
    }

    public final e h() {
        return this.f36973e;
    }

    public final void i(a aVar, long j10) {
        p.h(aVar, "task");
        synchronized (this.f36973e) {
            if (this.f36969a) {
                if (aVar.a()) {
                    if (e.f36977j.a().isLoggable(Level.FINE)) {
                        b.a(aVar, this, "schedule canceled (queue is shutdown)");
                    }
                    return;
                }
                if (e.f36977j.a().isLoggable(Level.FINE)) {
                    b.a(aVar, this, "schedule failed (queue is shutdown)");
                }
                throw new RejectedExecutionException();
            }
            if (k(aVar, j10, false)) {
                this.f36973e.h(this);
            }
            v vVar = v.f59242a;
        }
    }

    public final boolean k(a aVar, long j10, boolean z10) {
        String str;
        p.h(aVar, "task");
        aVar.e(this);
        long a10 = this.f36973e.g().a();
        long j11 = a10 + j10;
        int indexOf = this.f36971c.indexOf(aVar);
        if (indexOf != -1) {
            if (aVar.c() <= j11) {
                if (e.f36977j.a().isLoggable(Level.FINE)) {
                    b.a(aVar, this, "already scheduled");
                }
                return false;
            }
            this.f36971c.remove(indexOf);
        }
        aVar.g(j11);
        if (e.f36977j.a().isLoggable(Level.FINE)) {
            if (z10) {
                str = "run again after " + b.b(j11 - a10);
            } else {
                str = "scheduled after " + b.b(j11 - a10);
            }
            b.a(aVar, this, str);
        }
        Iterator<a> it = this.f36971c.iterator();
        int i10 = 0;
        while (true) {
            if (!it.hasNext()) {
                i10 = -1;
                break;
            }
            if (it.next().c() - a10 > j10) {
                break;
            }
            i10++;
        }
        if (i10 == -1) {
            i10 = this.f36971c.size();
        }
        this.f36971c.add(i10, aVar);
        return i10 == 0;
    }

    public final void l(a aVar) {
        this.f36970b = aVar;
    }

    public final void m(boolean z10) {
        this.f36972d = z10;
    }

    public final void n() {
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
        synchronized (this.f36973e) {
            this.f36969a = true;
            if (b()) {
                this.f36973e.h(this);
            }
            v vVar = v.f59242a;
        }
    }

    public String toString() {
        return this.f36974f;
    }
}
