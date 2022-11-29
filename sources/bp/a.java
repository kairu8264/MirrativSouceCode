package bp;

import android.support.v4.media.session.PlaybackStateCompat;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import jo.p;
import uo.u0;
import uo.v0;
import wn.v;
import zo.f0;
import zo.k0;

/* loaded from: classes4.dex */
public final class a implements Executor, Closeable {
    public final bp.d A;
    public final bp.d B;
    public final f0<c> C;
    private volatile /* synthetic */ int _isTerminated;
    public volatile /* synthetic */ long controlState;
    private volatile /* synthetic */ long parkedWorkersStack;

    /* renamed from: w  reason: collision with root package name */
    public final int f18555w;

    /* renamed from: x  reason: collision with root package name */
    public final int f18556x;

    /* renamed from: y  reason: collision with root package name */
    public final long f18557y;

    /* renamed from: z  reason: collision with root package name */
    public final String f18558z;
    public static final C0133a D = new C0133a(null);
    public static final k0 H = new k0("NOT_IN_STACK");
    public static final /* synthetic */ AtomicLongFieldUpdater E = AtomicLongFieldUpdater.newUpdater(a.class, "parkedWorkersStack");
    public static final /* synthetic */ AtomicLongFieldUpdater F = AtomicLongFieldUpdater.newUpdater(a.class, "controlState");
    public static final /* synthetic */ AtomicIntegerFieldUpdater G = AtomicIntegerFieldUpdater.newUpdater(a.class, "_isTerminated");

    /* renamed from: bp.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0133a {
        public C0133a() {
        }

        public /* synthetic */ C0133a(jo.h hVar) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f18559a;

        static {
            int[] iArr = new int[d.values().length];
            iArr[d.PARKING.ordinal()] = 1;
            iArr[d.BLOCKING.ordinal()] = 2;
            iArr[d.CPU_ACQUIRED.ordinal()] = 3;
            iArr[d.DORMANT.ordinal()] = 4;
            iArr[d.TERMINATED.ordinal()] = 5;
            f18559a = iArr;
        }
    }

    /* loaded from: classes4.dex */
    public enum d {
        CPU_ACQUIRED,
        BLOCKING,
        PARKING,
        DORMANT,
        TERMINATED
    }

    public a(int i10, int i11, long j10, String str) {
        this.f18555w = i10;
        this.f18556x = i11;
        this.f18557y = j10;
        this.f18558z = str;
        if (!(i10 >= 1)) {
            throw new IllegalArgumentException(("Core pool size " + i10 + " should be at least 1").toString());
        }
        if (!(i11 >= i10)) {
            throw new IllegalArgumentException(("Max pool size " + i11 + " should be greater than or equals to core pool size " + i10).toString());
        }
        if (!(i11 <= 2097150)) {
            throw new IllegalArgumentException(("Max pool size " + i11 + " should not exceed maximal supported number of threads 2097150").toString());
        }
        if (j10 > 0) {
            this.A = new bp.d();
            this.B = new bp.d();
            this.parkedWorkersStack = 0L;
            this.C = new f0<>(i10 + 1);
            this.controlState = i10 << 42;
            this._isTerminated = 0;
            return;
        }
        throw new IllegalArgumentException(("Idle worker keep alive time " + j10 + " must be positive").toString());
    }

    public static /* synthetic */ boolean K(a aVar, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = aVar.controlState;
        }
        return aVar.I(j10);
    }

    public static /* synthetic */ void j(a aVar, Runnable runnable, i iVar, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            iVar = l.f18578f;
        }
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        aVar.i(runnable, iVar, z10);
    }

    public final void C(long j10) {
        int i10;
        if (G.compareAndSet(this, 0, 1)) {
            c e10 = e();
            synchronized (this.C) {
                i10 = (int) (this.controlState & 2097151);
            }
            if (1 <= i10) {
                int i11 = 1;
                while (true) {
                    int i12 = i11 + 1;
                    c b10 = this.C.b(i11);
                    p.e(b10);
                    c cVar = b10;
                    if (cVar != e10) {
                        while (cVar.isAlive()) {
                            LockSupport.unpark(cVar);
                            cVar.join(j10);
                        }
                        d dVar = cVar.f18561x;
                        if (u0.a()) {
                            if (!(dVar == d.TERMINATED)) {
                                throw new AssertionError();
                            }
                        }
                        cVar.f18560w.g(this.B);
                    }
                    if (i11 == i10) {
                        break;
                    }
                    i11 = i12;
                }
            }
            this.B.b();
            this.A.b();
            while (true) {
                h f10 = e10 == null ? null : e10.f(true);
                if (f10 == null && (f10 = this.A.d()) == null && (f10 = this.B.d()) == null) {
                    break;
                }
                z(f10);
            }
            if (e10 != null) {
                e10.s(d.TERMINATED);
            }
            if (u0.a()) {
                if (!(((int) ((this.controlState & 9223367638808264704L) >> 42)) == this.f18555w)) {
                    throw new AssertionError();
                }
            }
            this.parkedWorkersStack = 0L;
            this.controlState = 0L;
        }
    }

    public final void E(boolean z10) {
        long addAndGet = F.addAndGet(this, PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE);
        if (z10 || L() || I(addAndGet)) {
            return;
        }
        L();
    }

    public final void F() {
        if (L() || K(this, 0L, 1, null)) {
            return;
        }
        L();
    }

    public final h G(c cVar, h hVar, boolean z10) {
        if (cVar == null || cVar.f18561x == d.TERMINATED) {
            return hVar;
        }
        if (hVar.f18570x.b() == 0 && cVar.f18561x == d.BLOCKING) {
            return hVar;
        }
        cVar.B = true;
        return cVar.f18560w.a(hVar, z10);
    }

    public final boolean I(long j10) {
        if (po.n.d(((int) (2097151 & j10)) - ((int) ((j10 & 4398044413952L) >> 21)), 0) < this.f18555w) {
            int c10 = c();
            if (c10 == 1 && this.f18555w > 1) {
                c();
            }
            if (c10 > 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean L() {
        c o10;
        do {
            o10 = o();
            if (o10 == null) {
                return false;
            }
        } while (!c.D.compareAndSet(o10, -1, 0));
        LockSupport.unpark(o10);
        return true;
    }

    public final boolean a(h hVar) {
        if (hVar.f18570x.b() == 1) {
            return this.B.a(hVar);
        }
        return this.A.a(hVar);
    }

    public final int c() {
        synchronized (this.C) {
            if (isTerminated()) {
                return -1;
            }
            long j10 = this.controlState;
            int i10 = (int) (j10 & 2097151);
            int d10 = po.n.d(i10 - ((int) ((j10 & 4398044413952L) >> 21)), 0);
            if (d10 >= this.f18555w) {
                return 0;
            }
            if (i10 >= this.f18556x) {
                return 0;
            }
            int i11 = ((int) (this.controlState & 2097151)) + 1;
            if (i11 > 0 && this.C.b(i11) == null) {
                c cVar = new c(i11);
                this.C.c(i11, cVar);
                if (i11 == ((int) (2097151 & F.incrementAndGet(this)))) {
                    cVar.start();
                    return d10 + 1;
                }
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        C(10000L);
    }

    public final h d(Runnable runnable, i iVar) {
        long a10 = l.f18577e.a();
        if (runnable instanceof h) {
            h hVar = (h) runnable;
            hVar.f18569w = a10;
            hVar.f18570x = iVar;
            return hVar;
        }
        return new k(runnable, a10, iVar);
    }

    public final c e() {
        Thread currentThread = Thread.currentThread();
        c cVar = currentThread instanceof c ? (c) currentThread : null;
        if (cVar != null && p.c(a.this, this)) {
            return cVar;
        }
        return null;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        j(this, runnable, null, false, 6, null);
    }

    public final void i(Runnable runnable, i iVar, boolean z10) {
        uo.c.a();
        h d10 = d(runnable, iVar);
        c e10 = e();
        h G2 = G(e10, d10, z10);
        if (G2 != null && !a(G2)) {
            throw new RejectedExecutionException(p.o(this.f18558z, " was terminated"));
        }
        boolean z11 = z10 && e10 != null;
        if (d10.f18570x.b() != 0) {
            E(z11);
        } else if (z11) {
        } else {
            F();
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [int, boolean] */
    public final boolean isTerminated() {
        return this._isTerminated;
    }

    public final int n(c cVar) {
        Object h10 = cVar.h();
        while (h10 != H) {
            if (h10 == null) {
                return 0;
            }
            c cVar2 = (c) h10;
            int g10 = cVar2.g();
            if (g10 != 0) {
                return g10;
            }
            h10 = cVar2.h();
        }
        return -1;
    }

    public final c o() {
        while (true) {
            long j10 = this.parkedWorkersStack;
            c b10 = this.C.b((int) (2097151 & j10));
            if (b10 == null) {
                return null;
            }
            long j11 = (PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE + j10) & (-2097152);
            int n10 = n(b10);
            if (n10 >= 0 && E.compareAndSet(this, j10, n10 | j11)) {
                b10.p(H);
                return b10;
            }
        }
    }

    public final boolean p(c cVar) {
        long j10;
        long j11;
        int g10;
        if (cVar.h() != H) {
            return false;
        }
        do {
            j10 = this.parkedWorkersStack;
            int i10 = (int) (2097151 & j10);
            j11 = (PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE + j10) & (-2097152);
            g10 = cVar.g();
            if (u0.a()) {
                if (!(g10 != 0)) {
                    throw new AssertionError();
                }
            }
            cVar.p(this.C.b(i10));
        } while (!E.compareAndSet(this, j10, g10 | j11));
        return true;
    }

    public String toString() {
        ArrayList arrayList = new ArrayList();
        int a10 = this.C.a();
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 1;
        while (i15 < a10) {
            int i16 = i15 + 1;
            c b10 = this.C.b(i15);
            if (b10 != null) {
                int f10 = b10.f18560w.f();
                int i17 = b.f18559a[b10.f18561x.ordinal()];
                if (i17 == 1) {
                    i12++;
                } else if (i17 == 2) {
                    i11++;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(f10);
                    sb2.append('b');
                    arrayList.add(sb2.toString());
                } else if (i17 == 3) {
                    i10++;
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(f10);
                    sb3.append('c');
                    arrayList.add(sb3.toString());
                } else if (i17 == 4) {
                    i13++;
                    if (f10 > 0) {
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append(f10);
                        sb4.append('d');
                        arrayList.add(sb4.toString());
                    }
                } else if (i17 == 5) {
                    i14++;
                }
            }
            i15 = i16;
        }
        long j10 = this.controlState;
        return this.f18558z + '@' + v0.b(this) + "[Pool Size {core = " + this.f18555w + ", max = " + this.f18556x + "}, Worker States {CPU = " + i10 + ", blocking = " + i11 + ", parked = " + i12 + ", dormant = " + i13 + ", terminated = " + i14 + "}, running workers queues = " + arrayList + ", global CPU queue size = " + this.A.c() + ", global blocking queue size = " + this.B.c() + ", Control State {created workers= " + ((int) (2097151 & j10)) + ", blocking tasks = " + ((int) ((4398044413952L & j10) >> 21)) + ", CPUs acquired = " + (this.f18555w - ((int) ((9223367638808264704L & j10) >> 42))) + "}]";
    }

    public final void v(c cVar, int i10, int i11) {
        while (true) {
            long j10 = this.parkedWorkersStack;
            int i12 = (int) (2097151 & j10);
            long j11 = (PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE + j10) & (-2097152);
            if (i12 == i10) {
                i12 = i11 == 0 ? n(cVar) : i11;
            }
            if (i12 >= 0 && E.compareAndSet(this, j10, j11 | i12)) {
                return;
            }
        }
    }

    public final void z(h hVar) {
        try {
            hVar.run();
        } finally {
            try {
            } finally {
            }
        }
    }

    /* loaded from: classes4.dex */
    public final class c extends Thread {
        public static final /* synthetic */ AtomicIntegerFieldUpdater D = AtomicIntegerFieldUpdater.newUpdater(c.class, "workerCtl");
        public int A;
        public boolean B;
        private volatile int indexInArray;
        private volatile Object nextParkedWorker;

        /* renamed from: w  reason: collision with root package name */
        public final n f18560w;
        public volatile /* synthetic */ int workerCtl;

        /* renamed from: x  reason: collision with root package name */
        public d f18561x;

        /* renamed from: y  reason: collision with root package name */
        public long f18562y;

        /* renamed from: z  reason: collision with root package name */
        public long f18563z;

        public c() {
            setDaemon(true);
            this.f18560w = new n();
            this.f18561x = d.DORMANT;
            this.workerCtl = 0;
            this.nextParkedWorker = a.H;
            this.A = no.c.f43727w.b();
        }

        public final void b(int i10) {
            if (i10 == 0) {
                return;
            }
            a.F.addAndGet(a.this, -2097152L);
            d dVar = this.f18561x;
            if (dVar != d.TERMINATED) {
                if (u0.a()) {
                    if (!(dVar == d.BLOCKING)) {
                        throw new AssertionError();
                    }
                }
                this.f18561x = d.DORMANT;
            }
        }

        public final void c(int i10) {
            if (i10 != 0 && s(d.BLOCKING)) {
                a.this.F();
            }
        }

        public final void d(h hVar) {
            int b10 = hVar.f18570x.b();
            i(b10);
            c(b10);
            a.this.z(hVar);
            b(b10);
        }

        public final h e(boolean z10) {
            h m10;
            h m11;
            if (z10) {
                boolean z11 = k(a.this.f18555w * 2) == 0;
                if (z11 && (m11 = m()) != null) {
                    return m11;
                }
                h h10 = this.f18560w.h();
                if (h10 != null) {
                    return h10;
                }
                if (!z11 && (m10 = m()) != null) {
                    return m10;
                }
            } else {
                h m12 = m();
                if (m12 != null) {
                    return m12;
                }
            }
            return t(false);
        }

        public final h f(boolean z10) {
            h d10;
            if (q()) {
                return e(z10);
            }
            if (z10) {
                d10 = this.f18560w.h();
                if (d10 == null) {
                    d10 = a.this.B.d();
                }
            } else {
                d10 = a.this.B.d();
            }
            return d10 == null ? t(true) : d10;
        }

        public final int g() {
            return this.indexInArray;
        }

        public final Object h() {
            return this.nextParkedWorker;
        }

        public final void i(int i10) {
            this.f18562y = 0L;
            if (this.f18561x == d.PARKING) {
                if (u0.a()) {
                    if (!(i10 == 1)) {
                        throw new AssertionError();
                    }
                }
                this.f18561x = d.BLOCKING;
            }
        }

        public final boolean j() {
            return this.nextParkedWorker != a.H;
        }

        public final int k(int i10) {
            int i11 = this.A;
            int i12 = i11 ^ (i11 << 13);
            int i13 = i12 ^ (i12 >> 17);
            int i14 = i13 ^ (i13 << 5);
            this.A = i14;
            int i15 = i10 - 1;
            return (i15 & i10) == 0 ? i14 & i15 : (i14 & Integer.MAX_VALUE) % i10;
        }

        public final void l() {
            if (this.f18562y == 0) {
                this.f18562y = System.nanoTime() + a.this.f18557y;
            }
            LockSupport.parkNanos(a.this.f18557y);
            if (System.nanoTime() - this.f18562y >= 0) {
                this.f18562y = 0L;
                u();
            }
        }

        public final h m() {
            if (k(2) == 0) {
                h d10 = a.this.A.d();
                return d10 == null ? a.this.B.d() : d10;
            }
            h d11 = a.this.B.d();
            return d11 == null ? a.this.A.d() : d11;
        }

        public final void n() {
            loop0: while (true) {
                boolean z10 = false;
                while (!a.this.isTerminated() && this.f18561x != d.TERMINATED) {
                    h f10 = f(this.B);
                    if (f10 != null) {
                        this.f18563z = 0L;
                        d(f10);
                    } else {
                        this.B = false;
                        if (this.f18563z == 0) {
                            r();
                        } else if (z10) {
                            s(d.PARKING);
                            Thread.interrupted();
                            LockSupport.parkNanos(this.f18563z);
                            this.f18563z = 0L;
                        } else {
                            z10 = true;
                        }
                    }
                }
            }
            s(d.TERMINATED);
        }

        public final void o(int i10) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(a.this.f18558z);
            sb2.append("-worker-");
            sb2.append(i10 == 0 ? "TERMINATED" : String.valueOf(i10));
            setName(sb2.toString());
            this.indexInArray = i10;
        }

        public final void p(Object obj) {
            this.nextParkedWorker = obj;
        }

        public final boolean q() {
            boolean z10;
            if (this.f18561x != d.CPU_ACQUIRED) {
                a aVar = a.this;
                while (true) {
                    long j10 = aVar.controlState;
                    if (((int) ((9223367638808264704L & j10) >> 42)) != 0) {
                        if (a.F.compareAndSet(aVar, j10, j10 - 4398046511104L)) {
                            z10 = true;
                            break;
                        }
                    } else {
                        z10 = false;
                        break;
                    }
                }
                if (!z10) {
                    return false;
                }
                this.f18561x = d.CPU_ACQUIRED;
            }
            return true;
        }

        public final void r() {
            if (!j()) {
                a.this.p(this);
                return;
            }
            if (u0.a()) {
                if (!(this.f18560w.f() == 0)) {
                    throw new AssertionError();
                }
            }
            this.workerCtl = -1;
            while (j() && this.workerCtl == -1 && !a.this.isTerminated() && this.f18561x != d.TERMINATED) {
                s(d.PARKING);
                Thread.interrupted();
                l();
            }
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            n();
        }

        public final boolean s(d dVar) {
            d dVar2 = this.f18561x;
            boolean z10 = dVar2 == d.CPU_ACQUIRED;
            if (z10) {
                a.F.addAndGet(a.this, 4398046511104L);
            }
            if (dVar2 != dVar) {
                this.f18561x = dVar;
            }
            return z10;
        }

        public final h t(boolean z10) {
            long l10;
            if (u0.a()) {
                if (!(this.f18560w.f() == 0)) {
                    throw new AssertionError();
                }
            }
            int i10 = (int) (a.this.controlState & 2097151);
            if (i10 < 2) {
                return null;
            }
            int k10 = k(i10);
            a aVar = a.this;
            int i11 = 0;
            long j10 = Long.MAX_VALUE;
            while (i11 < i10) {
                i11++;
                k10++;
                if (k10 > i10) {
                    k10 = 1;
                }
                c b10 = aVar.C.b(k10);
                if (b10 != null && b10 != this) {
                    if (u0.a()) {
                        if (!(this.f18560w.f() == 0)) {
                            throw new AssertionError();
                        }
                    }
                    if (z10) {
                        l10 = this.f18560w.k(b10.f18560w);
                    } else {
                        l10 = this.f18560w.l(b10.f18560w);
                    }
                    if (l10 == -1) {
                        return this.f18560w.h();
                    }
                    if (l10 > 0) {
                        j10 = Math.min(j10, l10);
                    }
                }
            }
            if (j10 == Long.MAX_VALUE) {
                j10 = 0;
            }
            this.f18563z = j10;
            return null;
        }

        public final void u() {
            a aVar = a.this;
            synchronized (aVar.C) {
                if (aVar.isTerminated()) {
                    return;
                }
                if (((int) (aVar.controlState & 2097151)) <= aVar.f18555w) {
                    return;
                }
                if (D.compareAndSet(this, -1, 1)) {
                    int g10 = g();
                    o(0);
                    aVar.v(this, g10, 0);
                    int andDecrement = (int) (a.F.getAndDecrement(aVar) & 2097151);
                    if (andDecrement != g10) {
                        c b10 = aVar.C.b(andDecrement);
                        p.e(b10);
                        c cVar = b10;
                        aVar.C.c(g10, cVar);
                        cVar.o(g10);
                        aVar.v(cVar, andDecrement, g10);
                    }
                    aVar.C.c(andDecrement, null);
                    v vVar = v.f59242a;
                    this.f18561x = d.TERMINATED;
                }
            }
        }

        public c(int i10) {
            this();
            o(i10);
        }
    }
}
