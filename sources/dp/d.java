package dp;

import ai.r23;
import io.l;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import jo.q;
import uo.i1;
import uo.p;
import uo.r;
import wn.v;
import zo.d0;
import zo.k0;
import zo.s;
import zo.u;

/* loaded from: classes4.dex */
public final class d implements dp.c {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f29748a = AtomicReferenceFieldUpdater.newUpdater(d.class, Object.class, "_state");
    public volatile /* synthetic */ Object _state;

    /* loaded from: classes4.dex */
    public final class a extends b {
        public final p<v> C;

        /* renamed from: dp.d$a$a  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0290a extends q implements l<Throwable, v> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ d f29749w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ a f29750x;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0290a(d dVar, a aVar) {
                super(1);
                this.f29749w = dVar;
                this.f29750x = aVar;
            }

            public final void a(Throwable th2) {
                this.f29749w.c(this.f29750x.f29751z);
            }

            @Override // io.l
            public /* bridge */ /* synthetic */ v invoke(Throwable th2) {
                a(th2);
                return v.f59242a;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a(Object obj, p<? super v> pVar) {
            super(obj);
            this.C = pVar;
        }

        @Override // dp.d.b
        public void Q() {
            this.C.T(r.f56081a);
        }

        @Override // dp.d.b
        public boolean U() {
            return S() && this.C.h(v.f59242a, null, new C0290a(d.this, this)) != null;
        }

        @Override // zo.u
        public String toString() {
            return "LockCont[" + this.f29751z + ", " + this.C + "] for " + d.this;
        }
    }

    /* loaded from: classes4.dex */
    public abstract class b extends u implements i1 {
        public static final /* synthetic */ AtomicIntegerFieldUpdater B = AtomicIntegerFieldUpdater.newUpdater(b.class, "isTaken");
        private volatile /* synthetic */ int isTaken = 0;

        /* renamed from: z  reason: collision with root package name */
        public final Object f29751z;

        public b(Object obj) {
            this.f29751z = obj;
        }

        public abstract void Q();

        public final boolean S() {
            return B.compareAndSet(this, 0, 1);
        }

        public abstract boolean U();

        @Override // uo.i1
        public final void dispose() {
            K();
        }
    }

    /* loaded from: classes4.dex */
    public static final class c extends s {

        /* renamed from: z  reason: collision with root package name */
        public Object f29752z;

        public c(Object obj) {
            this.f29752z = obj;
        }

        @Override // zo.u
        public String toString() {
            return "LockedQueue[" + this.f29752z + ']';
        }
    }

    /* renamed from: dp.d$d  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0291d extends zo.d<d> {

        /* renamed from: b  reason: collision with root package name */
        public final c f29753b;

        public C0291d(c cVar) {
            this.f29753b = cVar;
        }

        @Override // zo.d
        /* renamed from: j */
        public void d(d dVar, Object obj) {
            r23.a(d.f29748a, dVar, this, obj == null ? dp.e.f29761f : this.f29753b);
        }

        @Override // zo.d
        /* renamed from: k */
        public Object i(d dVar) {
            k0 k0Var;
            if (this.f29753b.Q()) {
                return null;
            }
            k0Var = dp.e.f29757b;
            return k0Var;
        }
    }

    /* loaded from: classes4.dex */
    public static final class e extends q implements l<Throwable, v> {

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ Object f29755x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Object obj) {
            super(1);
            this.f29755x = obj;
        }

        public final void a(Throwable th2) {
            d.this.c(this.f29755x);
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ v invoke(Throwable th2) {
            a(th2);
            return v.f59242a;
        }
    }

    public d(boolean z10) {
        this._state = z10 ? dp.e.f29760e : dp.e.f29761f;
    }

    @Override // dp.c
    public Object a(Object obj, ao.d<? super v> dVar) {
        Object d10;
        return (!b(obj) && (d10 = d(obj, dVar)) == bo.c.c()) ? d10 : v.f59242a;
    }

    @Override // dp.c
    public boolean b(Object obj) {
        k0 k0Var;
        while (true) {
            Object obj2 = this._state;
            if (obj2 instanceof dp.b) {
                Object obj3 = ((dp.b) obj2).f29747a;
                k0Var = dp.e.f29759d;
                if (obj3 != k0Var) {
                    return false;
                }
                if (r23.a(f29748a, this, obj2, obj == null ? dp.e.f29760e : new dp.b(obj))) {
                    return true;
                }
            } else if (obj2 instanceof c) {
                if (((c) obj2).f29752z != obj) {
                    return false;
                }
                throw new IllegalStateException(jo.p.o("Already locked by ", obj).toString());
            } else if (!(obj2 instanceof d0)) {
                throw new IllegalStateException(jo.p.o("Illegal state ", obj2).toString());
            } else {
                ((d0) obj2).c(this);
            }
        }
    }

    @Override // dp.c
    public void c(Object obj) {
        dp.b bVar;
        k0 k0Var;
        while (true) {
            Object obj2 = this._state;
            if (obj2 instanceof dp.b) {
                if (obj == null) {
                    Object obj3 = ((dp.b) obj2).f29747a;
                    k0Var = dp.e.f29759d;
                    if (!(obj3 != k0Var)) {
                        throw new IllegalStateException("Mutex is not locked".toString());
                    }
                } else {
                    dp.b bVar2 = (dp.b) obj2;
                    if (!(bVar2.f29747a == obj)) {
                        throw new IllegalStateException(("Mutex is locked by " + bVar2.f29747a + " but expected " + obj).toString());
                    }
                }
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f29748a;
                bVar = dp.e.f29761f;
                if (r23.a(atomicReferenceFieldUpdater, this, obj2, bVar)) {
                    return;
                }
            } else if (obj2 instanceof d0) {
                ((d0) obj2).c(this);
            } else if (obj2 instanceof c) {
                if (obj != null) {
                    c cVar = (c) obj2;
                    if (!(cVar.f29752z == obj)) {
                        throw new IllegalStateException(("Mutex is locked by " + cVar.f29752z + " but expected " + obj).toString());
                    }
                }
                c cVar2 = (c) obj2;
                u L = cVar2.L();
                if (L == null) {
                    C0291d c0291d = new C0291d(cVar2);
                    if (r23.a(f29748a, this, obj2, c0291d) && c0291d.c(this) == null) {
                        return;
                    }
                } else {
                    b bVar3 = (b) L;
                    if (bVar3.U()) {
                        Object obj4 = bVar3.f29751z;
                        if (obj4 == null) {
                            obj4 = dp.e.f29758c;
                        }
                        cVar2.f29752z = obj4;
                        bVar3.Q();
                        return;
                    }
                }
            } else {
                throw new IllegalStateException(jo.p.o("Illegal state ", obj2).toString());
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x006e, code lost:
        uo.s.c(r0, r1);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(java.lang.Object r7, ao.d<? super wn.v> r8) {
        /*
            r6 = this;
            ao.d r0 = bo.b.b(r8)
            uo.q r0 = uo.s.b(r0)
            dp.d$a r1 = new dp.d$a
            r1.<init>(r7, r0)
        Ld:
            java.lang.Object r2 = r6._state
            boolean r3 = r2 instanceof dp.b
            if (r3 == 0) goto L4a
            r3 = r2
            dp.b r3 = (dp.b) r3
            java.lang.Object r4 = r3.f29747a
            zo.k0 r5 = dp.e.f()
            if (r4 == r5) goto L2b
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = dp.d.f29748a
            dp.d$c r5 = new dp.d$c
            java.lang.Object r3 = r3.f29747a
            r5.<init>(r3)
            ai.r23.a(r4, r6, r2, r5)
            goto Ld
        L2b:
            if (r7 != 0) goto L32
            dp.b r3 = dp.e.c()
            goto L37
        L32:
            dp.b r3 = new dp.b
            r3.<init>(r7)
        L37:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = dp.d.f29748a
            boolean r2 = ai.r23.a(r4, r6, r2, r3)
            if (r2 == 0) goto Ld
            wn.v r1 = wn.v.f59242a
            dp.d$e r2 = new dp.d$e
            r2.<init>(r7)
            r0.R(r1, r2)
            goto L71
        L4a:
            boolean r3 = r2 instanceof dp.d.c
            if (r3 == 0) goto L98
            r3 = r2
            dp.d$c r3 = (dp.d.c) r3
            java.lang.Object r4 = r3.f29752z
            if (r4 == r7) goto L57
            r4 = 1
            goto L58
        L57:
            r4 = 0
        L58:
            if (r4 == 0) goto L88
            r3.v(r1)
            java.lang.Object r3 = r6._state
            if (r3 == r2) goto L6e
            boolean r2 = r1.S()
            if (r2 != 0) goto L68
            goto L6e
        L68:
            dp.d$a r1 = new dp.d$a
            r1.<init>(r7, r0)
            goto Ld
        L6e:
            uo.s.c(r0, r1)
        L71:
            java.lang.Object r7 = r0.t()
            java.lang.Object r0 = bo.c.c()
            if (r7 != r0) goto L7e
            co.h.c(r8)
        L7e:
            java.lang.Object r8 = bo.c.c()
            if (r7 != r8) goto L85
            return r7
        L85:
            wn.v r7 = wn.v.f59242a
            return r7
        L88:
            java.lang.String r8 = "Already locked by "
            java.lang.String r7 = jo.p.o(r8, r7)
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r7 = r7.toString()
            r8.<init>(r7)
            throw r8
        L98:
            boolean r3 = r2 instanceof zo.d0
            if (r3 == 0) goto La3
            zo.d0 r2 = (zo.d0) r2
            r2.c(r6)
            goto Ld
        La3:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "Illegal state "
            java.lang.String r8 = jo.p.o(r8, r2)
            java.lang.String r8 = r8.toString()
            r7.<init>(r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: dp.d.d(java.lang.Object, ao.d):java.lang.Object");
    }

    public String toString() {
        while (true) {
            Object obj = this._state;
            if (obj instanceof dp.b) {
                return "Mutex[" + ((dp.b) obj).f29747a + ']';
            } else if (!(obj instanceof d0)) {
                if (obj instanceof c) {
                    return "Mutex[" + ((c) obj).f29752z + ']';
                }
                throw new IllegalStateException(jo.p.o("Illegal state ", obj).toString());
            } else {
                ((d0) obj).c(this);
            }
        }
    }
}
