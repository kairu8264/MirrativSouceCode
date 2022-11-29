package wo;

import java.util.List;
import java.util.concurrent.locks.ReentrantLock;
import uo.u0;
import zo.k0;

/* loaded from: classes4.dex */
public final class d<E> extends c<E> implements f<E> {
    public final ReentrantLock A;
    public final Object[] B;
    public final List<a<E>> C;
    private volatile /* synthetic */ long _head;
    private volatile /* synthetic */ int _size;
    private volatile /* synthetic */ long _tail;

    /* renamed from: z  reason: collision with root package name */
    public final int f59271z;

    /* loaded from: classes4.dex */
    public static final class a<E> extends wo.a<E> implements x<E> {
        public final ReentrantLock A;
        private volatile /* synthetic */ long _subHead;

        /* renamed from: z  reason: collision with root package name */
        public final d<E> f59272z;

        public a(d<E> dVar) {
            super(null);
            this.f59272z = dVar;
            this.A = new ReentrantLock();
            this._subHead = 0L;
        }

        @Override // wo.a
        public boolean N() {
            return false;
        }

        @Override // wo.a
        public boolean O() {
            return c0() >= this.f59272z.N();
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x0028  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x002c  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0030  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x003c  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x003f  */
        @Override // wo.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.Object V() {
            /*
                r8 = this;
                java.util.concurrent.locks.ReentrantLock r0 = r8.A
                r0.lock()
                java.lang.Object r1 = r8.e0()     // Catch: java.lang.Throwable -> L46
                boolean r2 = r1 instanceof wo.p     // Catch: java.lang.Throwable -> L46
                r3 = 1
                if (r2 == 0) goto Lf
                goto L13
            Lf:
                zo.k0 r2 = wo.b.f59261d     // Catch: java.lang.Throwable -> L46
                if (r1 != r2) goto L15
            L13:
                r2 = 0
                goto L20
            L15:
                long r4 = r8.c0()     // Catch: java.lang.Throwable -> L46
                r6 = 1
                long r4 = r4 + r6
                r8.f0(r4)     // Catch: java.lang.Throwable -> L46
                r2 = r3
            L20:
                r0.unlock()
                boolean r0 = r1 instanceof wo.p
                r4 = 0
                if (r0 == 0) goto L2c
                r0 = r1
                wo.p r0 = (wo.p) r0
                goto L2d
            L2c:
                r0 = r4
            L2d:
                if (r0 != 0) goto L30
                goto L35
            L30:
                java.lang.Throwable r0 = r0.f59283z
                r8.x(r0)
            L35:
                boolean r0 = r8.b0()
                if (r0 == 0) goto L3c
                goto L3d
            L3c:
                r3 = r2
            L3d:
                if (r3 == 0) goto L45
                wo.d<E> r0 = r8.f59272z
                r2 = 3
                wo.d.S(r0, r4, r4, r2, r4)
            L45:
                return r1
            L46:
                r1 = move-exception
                r0.unlock()
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: wo.d.a.V():java.lang.Object");
        }

        @Override // wo.a
        public Object W(cp.d<?> dVar) {
            ReentrantLock reentrantLock = this.A;
            reentrantLock.lock();
            try {
                Object e02 = e0();
                boolean z10 = false;
                if (!(e02 instanceof p) && e02 != b.f59261d) {
                    if (!dVar.m()) {
                        e02 = cp.e.d();
                    } else {
                        f0(c0() + 1);
                        z10 = true;
                    }
                }
                reentrantLock.unlock();
                p pVar = e02 instanceof p ? (p) e02 : null;
                if (pVar != null) {
                    x(pVar.f59283z);
                }
                if (b0() ? true : z10) {
                    d.S(this.f59272z, null, null, 3, null);
                }
                return e02;
            } catch (Throwable th2) {
                reentrantLock.unlock();
                throw th2;
            }
        }

        public final boolean b0() {
            p pVar;
            boolean z10 = false;
            while (true) {
                pVar = null;
                if (!d0() || !this.A.tryLock()) {
                    break;
                }
                try {
                    E e10 = (E) e0();
                    if (e10 != b.f59261d) {
                        if (e10 instanceof p) {
                            pVar = (p) e10;
                            break;
                        }
                        y<E> D = D();
                        if (D != null && !(D instanceof p)) {
                            k0 l10 = D.l(e10, null);
                            if (l10 != null) {
                                if (u0.a()) {
                                    if (!(l10 == uo.r.f56081a)) {
                                        throw new AssertionError();
                                    }
                                }
                                f0(c0() + 1);
                                this.A.unlock();
                                D.i(e10);
                                z10 = true;
                            }
                        }
                    }
                } finally {
                    this.A.unlock();
                }
            }
            if (pVar != null) {
                x(pVar.f59283z);
            }
            return z10;
        }

        public final long c0() {
            return this._subHead;
        }

        public final boolean d0() {
            if (j() != null) {
                return false;
            }
            return (O() && this.f59272z.j() == null) ? false : true;
        }

        public final Object e0() {
            long c02 = c0();
            p<?> j10 = this.f59272z.j();
            if (c02 >= this.f59272z.N()) {
                if (j10 == null) {
                    j10 = j();
                }
                return j10 == null ? b.f59261d : j10;
            }
            Object J = this.f59272z.J(c02);
            p<?> j11 = j();
            return j11 != null ? j11 : J;
        }

        public final void f0(long j10) {
            this._subHead = j10;
        }

        @Override // wo.c
        public boolean v() {
            throw new IllegalStateException("Should not be used".toString());
        }

        @Override // wo.c
        public boolean w() {
            throw new IllegalStateException("Should not be used".toString());
        }

        @Override // wo.c, wo.b0
        public boolean x(Throwable th2) {
            boolean x10 = super.x(th2);
            if (x10) {
                d.S(this.f59272z, null, this, 1, null);
                ReentrantLock reentrantLock = this.A;
                reentrantLock.lock();
                try {
                    f0(this.f59272z.N());
                    wn.v vVar = wn.v.f59242a;
                } finally {
                    reentrantLock.unlock();
                }
            }
            return x10;
        }
    }

    public d(int i10) {
        super(null);
        this.f59271z = i10;
        if (i10 >= 1) {
            this.A = new ReentrantLock();
            this.B = new Object[i10];
            this._head = 0L;
            this._tail = 0L;
            this._size = 0;
            this.C = zo.f.b();
            return;
        }
        throw new IllegalArgumentException(("ArrayBroadcastChannel capacity must be at least 1, but " + K() + " was specified").toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void S(d dVar, a aVar, a aVar2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            aVar = null;
        }
        if ((i10 & 2) != 0) {
            aVar2 = null;
        }
        dVar.R(aVar, aVar2);
    }

    public final void H() {
        boolean z10;
        boolean z11 = false;
        loop0: while (true) {
            z10 = z11;
            for (a<E> aVar : this.C) {
                if (aVar.b0()) {
                    break;
                }
                z10 = true;
            }
            z11 = true;
        }
        if (z11 || !z10) {
            S(this, null, null, 3, null);
        }
    }

    public final long I() {
        long j10 = Long.MAX_VALUE;
        for (a<E> aVar : this.C) {
            j10 = po.n.j(j10, aVar.c0());
        }
        return j10;
    }

    public final E J(long j10) {
        return (E) this.B[(int) (j10 % this.f59271z)];
    }

    public final int K() {
        return this.f59271z;
    }

    public final long L() {
        return this._head;
    }

    public final int M() {
        return this._size;
    }

    public final long N() {
        return this._tail;
    }

    public final void O(long j10) {
        this._head = j10;
    }

    public final void P(int i10) {
        this._size = i10;
    }

    public final void Q(long j10) {
        this._tail = j10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x00a3, code lost:
        throw new java.lang.AssertionError();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void R(wo.d.a<E> r14, wo.d.a<E> r15) {
        /*
            r13 = this;
            r0 = 0
        L1:
            java.util.concurrent.locks.ReentrantLock r1 = r13.A
            r1.lock()
            if (r14 == 0) goto L23
            long r2 = r13.N()     // Catch: java.lang.Throwable -> L20
            r14.f0(r2)     // Catch: java.lang.Throwable -> L20
            java.util.List<wo.d$a<E>> r2 = r13.C     // Catch: java.lang.Throwable -> L20
            boolean r2 = r2.isEmpty()     // Catch: java.lang.Throwable -> L20
            java.util.List<wo.d$a<E>> r3 = r13.C     // Catch: java.lang.Throwable -> L20
            r3.add(r14)     // Catch: java.lang.Throwable -> L20
            if (r2 != 0) goto L23
            r1.unlock()
            return
        L20:
            r14 = move-exception
            goto Ld0
        L23:
            if (r15 == 0) goto L3a
            java.util.List<wo.d$a<E>> r14 = r13.C     // Catch: java.lang.Throwable -> L20
            r14.remove(r15)     // Catch: java.lang.Throwable -> L20
            long r2 = r13.L()     // Catch: java.lang.Throwable -> L20
            long r14 = r15.c0()     // Catch: java.lang.Throwable -> L20
            int r14 = (r2 > r14 ? 1 : (r2 == r14 ? 0 : -1))
            if (r14 == 0) goto L3a
            r1.unlock()
            return
        L3a:
            long r14 = r13.I()     // Catch: java.lang.Throwable -> L20
            long r2 = r13.N()     // Catch: java.lang.Throwable -> L20
            long r4 = r13.L()     // Catch: java.lang.Throwable -> L20
            long r14 = po.n.j(r14, r2)     // Catch: java.lang.Throwable -> L20
            int r6 = (r14 > r4 ? 1 : (r14 == r4 ? 0 : -1))
            if (r6 > 0) goto L52
            r1.unlock()
            return
        L52:
            int r6 = r13.M()     // Catch: java.lang.Throwable -> L20
        L56:
            int r7 = (r4 > r14 ? 1 : (r4 == r14 ? 0 : -1))
            if (r7 >= 0) goto Lcc
            java.lang.Object[] r7 = r13.B     // Catch: java.lang.Throwable -> L20
            int r8 = r13.K()     // Catch: java.lang.Throwable -> L20
            long r8 = (long) r8     // Catch: java.lang.Throwable -> L20
            long r8 = r4 % r8
            int r8 = (int) r8     // Catch: java.lang.Throwable -> L20
            r7[r8] = r0     // Catch: java.lang.Throwable -> L20
            int r7 = r13.K()     // Catch: java.lang.Throwable -> L20
            r8 = 0
            r9 = 1
            if (r6 < r7) goto L70
            r7 = r9
            goto L71
        L70:
            r7 = r8
        L71:
            r10 = 1
            long r4 = r4 + r10
            r13.O(r4)     // Catch: java.lang.Throwable -> L20
            int r6 = r6 + (-1)
            r13.P(r6)     // Catch: java.lang.Throwable -> L20
            if (r7 == 0) goto L56
        L7e:
            wo.a0 r7 = r13.E()     // Catch: java.lang.Throwable -> L20
            if (r7 != 0) goto L85
            goto L56
        L85:
            boolean r12 = r7 instanceof wo.p     // Catch: java.lang.Throwable -> L20
            if (r12 == 0) goto L8a
            goto L56
        L8a:
            zo.k0 r12 = r7.V(r0)     // Catch: java.lang.Throwable -> L20
            if (r12 == 0) goto L7e
            boolean r14 = uo.u0.a()     // Catch: java.lang.Throwable -> L20
            if (r14 == 0) goto La4
            zo.k0 r14 = uo.r.f56081a     // Catch: java.lang.Throwable -> L20
            if (r12 != r14) goto L9b
            r8 = r9
        L9b:
            if (r8 == 0) goto L9e
            goto La4
        L9e:
            java.lang.AssertionError r14 = new java.lang.AssertionError     // Catch: java.lang.Throwable -> L20
            r14.<init>()     // Catch: java.lang.Throwable -> L20
            throw r14     // Catch: java.lang.Throwable -> L20
        La4:
            java.lang.Object[] r14 = r13.B     // Catch: java.lang.Throwable -> L20
            int r15 = r13.K()     // Catch: java.lang.Throwable -> L20
            long r4 = (long) r15     // Catch: java.lang.Throwable -> L20
            long r4 = r2 % r4
            int r15 = (int) r4     // Catch: java.lang.Throwable -> L20
            java.lang.Object r4 = r7.S()     // Catch: java.lang.Throwable -> L20
            r14[r15] = r4     // Catch: java.lang.Throwable -> L20
            int r6 = r6 + 1
            r13.P(r6)     // Catch: java.lang.Throwable -> L20
            long r2 = r2 + r10
            r13.Q(r2)     // Catch: java.lang.Throwable -> L20
            wn.v r14 = wn.v.f59242a     // Catch: java.lang.Throwable -> L20
            r1.unlock()
            r7.Q()
            r13.H()
            r14 = r0
            r15 = r14
            goto L1
        Lcc:
            r1.unlock()
            return
        Ld0:
            r1.unlock()
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: wo.d.R(wo.d$a, wo.d$a):void");
    }

    @Override // wo.f
    public x<E> g() {
        a aVar = new a(this);
        S(this, aVar, null, 2, null);
        return aVar;
    }

    @Override // wo.c
    public String i() {
        return "(buffer:capacity=" + this.B.length + ",size=" + M() + ')';
    }

    @Override // wo.c
    public boolean v() {
        return false;
    }

    @Override // wo.c
    public boolean w() {
        return M() >= this.f59271z;
    }

    @Override // wo.c, wo.b0
    public boolean x(Throwable th2) {
        if (super.x(th2)) {
            H();
            return true;
        }
        return false;
    }

    @Override // wo.c
    public Object z(E e10) {
        ReentrantLock reentrantLock = this.A;
        reentrantLock.lock();
        try {
            p<?> k10 = k();
            if (k10 == null) {
                int M = M();
                if (M >= K()) {
                    return b.f59260c;
                }
                long N = N();
                this.B[(int) (N % K())] = e10;
                P(M + 1);
                Q(N + 1);
                wn.v vVar = wn.v.f59242a;
                reentrantLock.unlock();
                H();
                return b.f59259b;
            }
            return k10;
        } finally {
            reentrantLock.unlock();
        }
    }
}
