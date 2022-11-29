package bp;

import ai.r23;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import uo.u0;

/* loaded from: classes4.dex */
public final class n {

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f18581b = AtomicReferenceFieldUpdater.newUpdater(n.class, Object.class, "lastScheduledTask");

    /* renamed from: c  reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f18582c = AtomicIntegerFieldUpdater.newUpdater(n.class, "producerIndex");

    /* renamed from: d  reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f18583d = AtomicIntegerFieldUpdater.newUpdater(n.class, "consumerIndex");

    /* renamed from: e  reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f18584e = AtomicIntegerFieldUpdater.newUpdater(n.class, "blockingTasksInBuffer");

    /* renamed from: a  reason: collision with root package name */
    public final AtomicReferenceArray<h> f18585a = new AtomicReferenceArray<>(128);
    private volatile /* synthetic */ Object lastScheduledTask = null;
    private volatile /* synthetic */ int producerIndex = 0;
    private volatile /* synthetic */ int consumerIndex = 0;
    private volatile /* synthetic */ int blockingTasksInBuffer = 0;

    public static /* synthetic */ h b(n nVar, h hVar, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return nVar.a(hVar, z10);
    }

    public final h a(h hVar, boolean z10) {
        if (z10) {
            return c(hVar);
        }
        h hVar2 = (h) f18581b.getAndSet(this, hVar);
        if (hVar2 == null) {
            return null;
        }
        return c(hVar2);
    }

    public final h c(h hVar) {
        if (hVar.f18570x.b() == 1) {
            f18584e.incrementAndGet(this);
        }
        if (e() == 127) {
            return hVar;
        }
        int i10 = this.producerIndex & 127;
        while (this.f18585a.get(i10) != null) {
            Thread.yield();
        }
        this.f18585a.lazySet(i10, hVar);
        f18582c.incrementAndGet(this);
        return null;
    }

    public final void d(h hVar) {
        if (hVar != null) {
            if (hVar.f18570x.b() == 1) {
                int decrementAndGet = f18584e.decrementAndGet(this);
                if (u0.a()) {
                    if (!(decrementAndGet >= 0)) {
                        throw new AssertionError();
                    }
                }
            }
        }
    }

    public final int e() {
        return this.producerIndex - this.consumerIndex;
    }

    public final int f() {
        return this.lastScheduledTask != null ? e() + 1 : e();
    }

    public final void g(d dVar) {
        h hVar = (h) f18581b.getAndSet(this, null);
        if (hVar != null) {
            dVar.a(hVar);
        }
        do {
        } while (j(dVar));
    }

    public final h h() {
        h hVar = (h) f18581b.getAndSet(this, null);
        return hVar == null ? i() : hVar;
    }

    public final h i() {
        h andSet;
        while (true) {
            int i10 = this.consumerIndex;
            if (i10 - this.producerIndex == 0) {
                return null;
            }
            int i11 = i10 & 127;
            if (f18583d.compareAndSet(this, i10, i10 + 1) && (andSet = this.f18585a.getAndSet(i11, null)) != null) {
                d(andSet);
                return andSet;
            }
        }
    }

    public final boolean j(d dVar) {
        h i10 = i();
        if (i10 == null) {
            return false;
        }
        dVar.a(i10);
        return true;
    }

    public final long k(n nVar) {
        if (u0.a()) {
            if (!(e() == 0)) {
                throw new AssertionError();
            }
        }
        int i10 = nVar.producerIndex;
        AtomicReferenceArray<h> atomicReferenceArray = nVar.f18585a;
        for (int i11 = nVar.consumerIndex; i11 != i10; i11++) {
            int i12 = i11 & 127;
            if (nVar.blockingTasksInBuffer == 0) {
                break;
            }
            h hVar = atomicReferenceArray.get(i12);
            if (hVar != null) {
                if ((hVar.f18570x.b() == 1) && atomicReferenceArray.compareAndSet(i12, hVar, null)) {
                    f18584e.decrementAndGet(nVar);
                    b(this, hVar, false, 2, null);
                    return -1L;
                }
            }
        }
        return m(nVar, true);
    }

    public final long l(n nVar) {
        if (u0.a()) {
            if (!(e() == 0)) {
                throw new AssertionError();
            }
        }
        h i10 = nVar.i();
        if (i10 != null) {
            h b10 = b(this, i10, false, 2, null);
            if (u0.a()) {
                if (b10 == null) {
                    return -1L;
                }
                throw new AssertionError();
            }
            return -1L;
        }
        return m(nVar, false);
    }

    public final long m(n nVar, boolean z10) {
        h hVar;
        do {
            hVar = (h) nVar.lastScheduledTask;
            if (hVar == null) {
                return -2L;
            }
            if (z10) {
                if (!(hVar.f18570x.b() == 1)) {
                    return -2L;
                }
            }
            long a10 = l.f18577e.a() - hVar.f18569w;
            long j10 = l.f18573a;
            if (a10 < j10) {
                return j10 - a10;
            }
        } while (!r23.a(f18581b, nVar, hVar, null));
        b(this, hVar, false, 2, null);
        return -1L;
    }
}
