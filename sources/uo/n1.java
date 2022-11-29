package uo;

import ai.r23;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import uo.a1;

/* loaded from: classes4.dex */
public abstract class n1 extends o1 implements a1 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater A = AtomicReferenceFieldUpdater.newUpdater(n1.class, Object.class, "_queue");
    public static final /* synthetic */ AtomicReferenceFieldUpdater B = AtomicReferenceFieldUpdater.newUpdater(n1.class, Object.class, "_delayed");
    private volatile /* synthetic */ Object _queue = null;
    private volatile /* synthetic */ Object _delayed = null;
    private volatile /* synthetic */ int _isCompleted = 0;

    /* loaded from: classes4.dex */
    public final class a extends c {

        /* renamed from: z  reason: collision with root package name */
        public final p<wn.v> f56066z;

        /* JADX WARN: Multi-variable type inference failed */
        public a(long j10, p<? super wn.v> pVar) {
            super(j10);
            this.f56066z = pVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f56066z.k(n1.this, wn.v.f59242a);
        }

        @Override // uo.n1.c
        public String toString() {
            return jo.p.o(super.toString(), this.f56066z);
        }
    }

    /* loaded from: classes4.dex */
    public static final class b extends c {

        /* renamed from: z  reason: collision with root package name */
        public final Runnable f56067z;

        public b(long j10, Runnable runnable) {
            super(j10);
            this.f56067z = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f56067z.run();
        }

        @Override // uo.n1.c
        public String toString() {
            return jo.p.o(super.toString(), this.f56067z);
        }
    }

    /* loaded from: classes4.dex */
    public static abstract class c implements Runnable, Comparable<c>, i1, zo.q0 {

        /* renamed from: w  reason: collision with root package name */
        public long f56068w;

        /* renamed from: x  reason: collision with root package name */
        public Object f56069x;

        /* renamed from: y  reason: collision with root package name */
        public int f56070y = -1;

        public c(long j10) {
            this.f56068w = j10;
        }

        @Override // zo.q0
        public zo.p0<?> a() {
            Object obj = this.f56069x;
            if (obj instanceof zo.p0) {
                return (zo.p0) obj;
            }
            return null;
        }

        @Override // uo.i1
        public final synchronized void dispose() {
            zo.k0 k0Var;
            zo.k0 k0Var2;
            Object obj = this.f56069x;
            k0Var = q1.f56078a;
            if (obj == k0Var) {
                return;
            }
            d dVar = obj instanceof d ? (d) obj : null;
            if (dVar != null) {
                dVar.g(this);
            }
            k0Var2 = q1.f56078a;
            this.f56069x = k0Var2;
        }

        @Override // zo.q0
        public void e(zo.p0<?> p0Var) {
            zo.k0 k0Var;
            Object obj = this.f56069x;
            k0Var = q1.f56078a;
            if (obj != k0Var) {
                this.f56069x = p0Var;
                return;
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }

        @Override // zo.q0
        public int getIndex() {
            return this.f56070y;
        }

        @Override // java.lang.Comparable
        /* renamed from: h */
        public int compareTo(c cVar) {
            int i10 = ((this.f56068w - cVar.f56068w) > 0L ? 1 : ((this.f56068w - cVar.f56068w) == 0L ? 0 : -1));
            if (i10 > 0) {
                return 1;
            }
            return i10 < 0 ? -1 : 0;
        }

        public final synchronized int i(long j10, d dVar, n1 n1Var) {
            zo.k0 k0Var;
            Object obj = this.f56069x;
            k0Var = q1.f56078a;
            if (obj == k0Var) {
                return 2;
            }
            synchronized (dVar) {
                c b10 = dVar.b();
                if (n1Var.Y0()) {
                    return 1;
                }
                if (b10 == null) {
                    dVar.f56071b = j10;
                } else {
                    long j11 = b10.f56068w;
                    if (j11 - j10 < 0) {
                        j10 = j11;
                    }
                    if (j10 - dVar.f56071b > 0) {
                        dVar.f56071b = j10;
                    }
                }
                long j12 = this.f56068w;
                long j13 = dVar.f56071b;
                if (j12 - j13 < 0) {
                    this.f56068w = j13;
                }
                dVar.a(this);
                return 0;
            }
        }

        public final boolean l(long j10) {
            return j10 - this.f56068w >= 0;
        }

        @Override // zo.q0
        public void setIndex(int i10) {
            this.f56070y = i10;
        }

        public String toString() {
            return "Delayed[nanos=" + this.f56068w + ']';
        }
    }

    /* loaded from: classes4.dex */
    public static final class d extends zo.p0<c> {

        /* renamed from: b  reason: collision with root package name */
        public long f56071b;

        public d(long j10) {
            this.f56071b = j10;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v0, types: [int, boolean] */
    public final boolean Y0() {
        return this._isCompleted;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x004f  */
    @Override // uo.m1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long A0() {
        /*
            r9 = this;
            boolean r0 = r9.B0()
            r1 = 0
            if (r0 == 0) goto L9
            return r1
        L9:
            java.lang.Object r0 = r9._delayed
            uo.n1$d r0 = (uo.n1.d) r0
            if (r0 == 0) goto L45
            boolean r3 = r0.d()
            if (r3 != 0) goto L45
            uo.c.a()
            long r3 = java.lang.System.nanoTime()
        L1c:
            monitor-enter(r0)
            zo.q0 r5 = r0.b()     // Catch: java.lang.Throwable -> L42
            r6 = 0
            if (r5 != 0) goto L26
            monitor-exit(r0)
            goto L3d
        L26:
            uo.n1$c r5 = (uo.n1.c) r5     // Catch: java.lang.Throwable -> L42
            boolean r7 = r5.l(r3)     // Catch: java.lang.Throwable -> L42
            r8 = 0
            if (r7 == 0) goto L34
            boolean r5 = r9.W0(r5)     // Catch: java.lang.Throwable -> L42
            goto L35
        L34:
            r5 = r8
        L35:
            if (r5 == 0) goto L3c
            zo.q0 r5 = r0.h(r8)     // Catch: java.lang.Throwable -> L42
            r6 = r5
        L3c:
            monitor-exit(r0)
        L3d:
            uo.n1$c r6 = (uo.n1.c) r6
            if (r6 != 0) goto L1c
            goto L45
        L42:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        L45:
            java.lang.Runnable r0 = r9.T0()
            if (r0 == 0) goto L4f
            r0.run()
            return r1
        L4f:
            long r0 = r9.p0()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: uo.n1.A0():long");
    }

    public final boolean B1(c cVar) {
        d dVar = (d) this._delayed;
        return (dVar == null ? null : dVar.e()) == cVar;
    }

    public final void N0() {
        zo.k0 k0Var;
        zo.k0 k0Var2;
        if (u0.a() && !Y0()) {
            throw new AssertionError();
        }
        while (true) {
            Object obj = this._queue;
            if (obj == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = A;
                k0Var = q1.f56079b;
                if (r23.a(atomicReferenceFieldUpdater, this, null, k0Var)) {
                    return;
                }
            } else if (!(obj instanceof zo.x)) {
                k0Var2 = q1.f56079b;
                if (obj == k0Var2) {
                    return;
                }
                zo.x xVar = new zo.x(8, true);
                xVar.a((Runnable) obj);
                if (r23.a(A, this, obj, xVar)) {
                    return;
                }
            } else {
                ((zo.x) obj).d();
                return;
            }
        }
    }

    @Override // uo.a1
    public void S(long j10, p<? super wn.v> pVar) {
        long c10 = q1.c(j10);
        if (c10 < 4611686018427387903L) {
            uo.c.a();
            long nanoTime = System.nanoTime();
            a aVar = new a(c10 + nanoTime, pVar);
            s.a(pVar, aVar);
            m1(nanoTime, aVar);
        }
    }

    public final Runnable T0() {
        zo.k0 k0Var;
        while (true) {
            Object obj = this._queue;
            if (obj == null) {
                return null;
            }
            if (!(obj instanceof zo.x)) {
                k0Var = q1.f56079b;
                if (obj == k0Var) {
                    return null;
                }
                if (r23.a(A, this, obj, null)) {
                    return (Runnable) obj;
                }
            } else {
                zo.x xVar = (zo.x) obj;
                Object j10 = xVar.j();
                if (j10 != zo.x.f63347h) {
                    return (Runnable) j10;
                }
                r23.a(A, this, obj, xVar.i());
            }
        }
    }

    public void V0(Runnable runnable) {
        if (W0(runnable)) {
            L0();
        } else {
            w0.C.V0(runnable);
        }
    }

    public final boolean W0(Runnable runnable) {
        zo.k0 k0Var;
        while (true) {
            Object obj = this._queue;
            if (Y0()) {
                return false;
            }
            if (obj == null) {
                if (r23.a(A, this, null, runnable)) {
                    return true;
                }
            } else if (!(obj instanceof zo.x)) {
                k0Var = q1.f56079b;
                if (obj == k0Var) {
                    return false;
                }
                zo.x xVar = new zo.x(8, true);
                xVar.a((Runnable) obj);
                xVar.a(runnable);
                if (r23.a(A, this, obj, xVar)) {
                    return true;
                }
            } else {
                zo.x xVar2 = (zo.x) obj;
                int a10 = xVar2.a(runnable);
                if (a10 == 0) {
                    return true;
                }
                if (a10 == 1) {
                    r23.a(A, this, obj, xVar2.i());
                } else if (a10 == 2) {
                    return false;
                }
            }
        }
    }

    @Override // uo.k0
    public final void X(ao.g gVar, Runnable runnable) {
        V0(runnable);
    }

    @Override // uo.a1
    public i1 d(long j10, Runnable runnable, ao.g gVar) {
        return a1.a.a(this, j10, runnable, gVar);
    }

    public boolean i1() {
        zo.k0 k0Var;
        if (x0()) {
            d dVar = (d) this._delayed;
            if (dVar == null || dVar.d()) {
                Object obj = this._queue;
                if (obj != null) {
                    if (obj instanceof zo.x) {
                        return ((zo.x) obj).g();
                    }
                    k0Var = q1.f56079b;
                    if (obj != k0Var) {
                        return false;
                    }
                }
                return true;
            }
            return false;
        }
        return false;
    }

    public final void j1() {
        uo.c.a();
        long nanoTime = System.nanoTime();
        while (true) {
            d dVar = (d) this._delayed;
            c i10 = dVar == null ? null : dVar.i();
            if (i10 == null) {
                return;
            }
            F0(nanoTime, i10);
        }
    }

    public final void k1() {
        this._queue = null;
        this._delayed = null;
    }

    public final void m1(long j10, c cVar) {
        int o12 = o1(j10, cVar);
        if (o12 == 0) {
            if (B1(cVar)) {
                L0();
            }
        } else if (o12 == 1) {
            F0(j10, cVar);
        } else if (o12 != 2) {
            throw new IllegalStateException("unexpected result".toString());
        }
    }

    public final int o1(long j10, c cVar) {
        if (Y0()) {
            return 1;
        }
        d dVar = (d) this._delayed;
        if (dVar == null) {
            r23.a(B, this, null, new d(j10));
            Object obj = this._delayed;
            jo.p.e(obj);
            dVar = (d) obj;
        }
        return cVar.i(j10, dVar, this);
    }

    @Override // uo.m1
    public long p0() {
        zo.k0 k0Var;
        if (super.p0() == 0) {
            return 0L;
        }
        Object obj = this._queue;
        if (obj != null) {
            if (!(obj instanceof zo.x)) {
                k0Var = q1.f56079b;
                return obj == k0Var ? Long.MAX_VALUE : 0L;
            } else if (!((zo.x) obj).g()) {
                return 0L;
            }
        }
        d dVar = (d) this._delayed;
        c e10 = dVar == null ? null : dVar.e();
        if (e10 == null) {
            return Long.MAX_VALUE;
        }
        long j10 = e10.f56068w;
        uo.c.a();
        return po.n.e(j10 - System.nanoTime(), 0L);
    }

    @Override // uo.m1
    public void shutdown() {
        d3.f56003a.c();
        z1(true);
        N0();
        do {
        } while (A0() <= 0);
        j1();
    }

    public final i1 u1(long j10, Runnable runnable) {
        long c10 = q1.c(j10);
        if (c10 < 4611686018427387903L) {
            uo.c.a();
            long nanoTime = System.nanoTime();
            b bVar = new b(c10 + nanoTime, runnable);
            m1(nanoTime, bVar);
            return bVar;
        }
        return r2.f56082w;
    }

    public final void z1(boolean z10) {
        this._isCompleted = z10 ? 1 : 0;
    }
}
