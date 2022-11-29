package cp;

import ai.r23;
import ao.g;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import jo.p;
import uo.d2;
import uo.e2;
import uo.g0;
import uo.i1;
import uo.n0;
import uo.r;
import uo.u0;
import wn.l;
import wn.m;
import wn.v;
import zo.d0;
import zo.j0;
import zo.s;
import zo.u;

/* loaded from: classes4.dex */
public final class b<R> extends s implements cp.a<R>, cp.d<R>, ao.d<R>, co.e {
    public static final /* synthetic */ AtomicReferenceFieldUpdater A = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "_state");
    public static final /* synthetic */ AtomicReferenceFieldUpdater B = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "_result");
    private volatile /* synthetic */ Object _parentHandle;
    private volatile /* synthetic */ Object _result;
    public volatile /* synthetic */ Object _state = e.e();

    /* renamed from: z  reason: collision with root package name */
    public final ao.d<R> f28586z;

    /* loaded from: classes4.dex */
    public static final class a extends zo.d<Object> {

        /* renamed from: b  reason: collision with root package name */
        public final b<?> f28587b;

        /* renamed from: c  reason: collision with root package name */
        public final zo.b f28588c;

        /* renamed from: d  reason: collision with root package name */
        public final long f28589d;

        public a(b<?> bVar, zo.b bVar2) {
            f fVar;
            this.f28587b = bVar;
            this.f28588c = bVar2;
            fVar = e.f28596e;
            this.f28589d = fVar.a();
            bVar2.d(this);
        }

        @Override // zo.d
        public void d(Object obj, Object obj2) {
            j(obj2);
            this.f28588c.a(this, obj2);
        }

        @Override // zo.d
        public long g() {
            return this.f28589d;
        }

        @Override // zo.d
        public Object i(Object obj) {
            Object k10;
            if (obj != null || (k10 = k()) == null) {
                try {
                    return this.f28588c.c(this);
                } catch (Throwable th2) {
                    if (obj == null) {
                        l();
                    }
                    throw th2;
                }
            }
            return k10;
        }

        public final void j(Object obj) {
            boolean z10 = obj == null;
            if (r23.a(b.A, this.f28587b, this, z10 ? null : e.e()) && z10) {
                this.f28587b.V();
            }
        }

        public final Object k() {
            b<?> bVar = this.f28587b;
            while (true) {
                Object obj = bVar._state;
                if (obj == this) {
                    return null;
                }
                if (obj instanceof d0) {
                    ((d0) obj).c(this.f28587b);
                } else if (obj == e.e()) {
                    if (r23.a(b.A, this.f28587b, e.e(), this)) {
                        return null;
                    }
                } else {
                    return e.d();
                }
            }
        }

        public final void l() {
            r23.a(b.A, this.f28587b, this, e.e());
        }

        @Override // zo.d0
        public String toString() {
            return "AtomicSelectOp(sequence=" + g() + ')';
        }
    }

    /* renamed from: cp.b$b  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0262b extends u {

        /* renamed from: z  reason: collision with root package name */
        public final i1 f28590z;

        public C0262b(i1 i1Var) {
            this.f28590z = i1Var;
        }
    }

    /* loaded from: classes4.dex */
    public static final class c extends d0 {

        /* renamed from: a  reason: collision with root package name */
        public final u.c f28591a;

        public c(u.c cVar) {
            this.f28591a = cVar;
        }

        @Override // zo.d0
        public zo.d<?> a() {
            return this.f28591a.a();
        }

        @Override // zo.d0
        public Object c(Object obj) {
            Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectBuilderImpl<*>");
            b bVar = (b) obj;
            this.f28591a.d();
            Object e10 = this.f28591a.a().e(null);
            r23.a(b.A, bVar, this, e10 == null ? this.f28591a.f63338c : e.e());
            return e10;
        }
    }

    /* loaded from: classes4.dex */
    public final class d extends e2 {
        public d() {
        }

        @Override // uo.f0
        public void Q(Throwable th2) {
            if (b.this.m()) {
                b.this.p(S().n());
            }
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ v invoke(Throwable th2) {
            Q(th2);
            return v.f59242a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b(ao.d<? super R> dVar) {
        Object obj;
        this.f28586z = dVar;
        obj = e.f28594c;
        this._result = obj;
        this._parentHandle = null;
    }

    public final void V() {
        i1 W = W();
        if (W != null) {
            W.dispose();
        }
        for (u uVar = (u) D(); !p.c(uVar, this); uVar = uVar.E()) {
            if (uVar instanceof C0262b) {
                ((C0262b) uVar).f28590z.dispose();
            }
        }
    }

    public final i1 W() {
        return (i1) this._parentHandle;
    }

    public final Object X() {
        Object obj;
        Object obj2;
        Object obj3;
        if (!g()) {
            Z();
        }
        Object obj4 = this._result;
        obj = e.f28594c;
        if (obj4 == obj) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = B;
            obj3 = e.f28594c;
            if (r23.a(atomicReferenceFieldUpdater, this, obj3, bo.c.c())) {
                return bo.c.c();
            }
            obj4 = this._result;
        }
        obj2 = e.f28595d;
        if (obj4 != obj2) {
            if (obj4 instanceof uo.d0) {
                throw ((uo.d0) obj4).f55999a;
            }
            return obj4;
        }
        throw new IllegalStateException("Already resumed");
    }

    public final void Y(Throwable th2) {
        if (m()) {
            l.a aVar = l.f59224w;
            resumeWith(l.a(m.a(th2)));
        } else if (th2 instanceof CancellationException) {
        } else {
            Object X = X();
            if (X instanceof uo.d0) {
                Throwable th3 = ((uo.d0) X).f55999a;
                if (u0.d()) {
                    th3 = j0.n(th3);
                }
                if (th3 == (!u0.d() ? th2 : j0.n(th2))) {
                    return;
                }
            }
            n0.a(getContext(), th2);
        }
    }

    public final void Z() {
        d2 d2Var = (d2) getContext().get(d2.f56001s);
        if (d2Var == null) {
            return;
        }
        i1 d10 = d2.a.d(d2Var, true, false, new d(), 2, null);
        a0(d10);
        if (g()) {
            d10.dispose();
        }
    }

    public final void a0(i1 i1Var) {
        this._parentHandle = i1Var;
    }

    @Override // cp.d
    public Object b(zo.b bVar) {
        return new a(this, bVar).c(null);
    }

    @Override // cp.d
    public void e(i1 i1Var) {
        C0262b c0262b = new C0262b(i1Var);
        if (!g()) {
            v(c0262b);
            if (!g()) {
                return;
            }
        }
        i1Var.dispose();
    }

    @Override // cp.d
    public boolean g() {
        while (true) {
            Object obj = this._state;
            if (obj == e.e()) {
                return false;
            }
            if (!(obj instanceof d0)) {
                return true;
            }
            ((d0) obj).c(this);
        }
    }

    @Override // co.e
    public co.e getCallerFrame() {
        ao.d<R> dVar = this.f28586z;
        if (dVar instanceof co.e) {
            return (co.e) dVar;
        }
        return null;
    }

    @Override // ao.d
    public g getContext() {
        return this.f28586z.getContext();
    }

    @Override // co.e
    public StackTraceElement getStackTraceElement() {
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0031, code lost:
        V();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0036, code lost:
        return uo.r.f56081a;
     */
    @Override // cp.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object j(zo.u.c r4) {
        /*
            r3 = this;
        L0:
            java.lang.Object r0 = r3._state
            java.lang.Object r1 = cp.e.e()
            r2 = 0
            if (r0 != r1) goto L37
            if (r4 != 0) goto L18
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = cp.b.A
            java.lang.Object r1 = cp.e.e()
            boolean r0 = ai.r23.a(r0, r3, r1, r2)
            if (r0 != 0) goto L31
            goto L0
        L18:
            cp.b$c r0 = new cp.b$c
            r0.<init>(r4)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = cp.b.A
            java.lang.Object r2 = cp.e.e()
            boolean r1 = ai.r23.a(r1, r3, r2, r0)
            if (r1 != 0) goto L2a
            goto L0
        L2a:
            java.lang.Object r4 = r0.c(r3)
            if (r4 == 0) goto L31
            return r4
        L31:
            r3.V()
            zo.k0 r4 = uo.r.f56081a
            return r4
        L37:
            boolean r1 = r0 instanceof zo.d0
            if (r1 == 0) goto L6b
            if (r4 == 0) goto L65
            zo.d r1 = r4.a()
            boolean r2 = r1 instanceof cp.b.a
            if (r2 == 0) goto L59
            r2 = r1
            cp.b$a r2 = (cp.b.a) r2
            cp.b<?> r2 = r2.f28587b
            if (r2 == r3) goto L4d
            goto L59
        L4d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "Cannot use matching select clauses on the same object"
            java.lang.String r0 = r0.toString()
            r4.<init>(r0)
            throw r4
        L59:
            r2 = r0
            zo.d0 r2 = (zo.d0) r2
            boolean r1 = r1.b(r2)
            if (r1 == 0) goto L65
            java.lang.Object r4 = zo.c.f63279b
            return r4
        L65:
            zo.d0 r0 = (zo.d0) r0
            r0.c(r3)
            goto L0
        L6b:
            if (r4 != 0) goto L6e
            return r2
        L6e:
            zo.u$a r4 = r4.f63338c
            if (r0 != r4) goto L75
            zo.k0 r4 = uo.r.f56081a
            return r4
        L75:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: cp.b.j(zo.u$c):java.lang.Object");
    }

    @Override // cp.d
    public boolean m() {
        Object j10 = j(null);
        if (j10 == r.f56081a) {
            return true;
        }
        if (j10 == null) {
            return false;
        }
        throw new IllegalStateException(p.o("Unexpected trySelectIdempotent result ", j10).toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // cp.a
    public <Q> void n(cp.c<? extends Q> cVar, io.p<? super Q, ? super ao.d<? super R>, ? extends Object> pVar) {
        cVar.m(this, pVar);
    }

    @Override // cp.d
    public ao.d<R> o() {
        return this;
    }

    @Override // cp.d
    public void p(Throwable th2) {
        Object obj;
        Object obj2;
        Object obj3;
        if (u0.a() && !g()) {
            throw new AssertionError();
        }
        while (true) {
            Object obj4 = this._result;
            obj = e.f28594c;
            if (obj4 == obj) {
                ao.d<R> dVar = this.f28586z;
                uo.d0 d0Var = new uo.d0((u0.d() && (dVar instanceof co.e)) ? j0.j(th2, (co.e) dVar) : th2, false, 2, null);
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = B;
                obj2 = e.f28594c;
                if (r23.a(atomicReferenceFieldUpdater, this, obj2, d0Var)) {
                    return;
                }
            } else if (obj4 == bo.c.c()) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = B;
                Object c10 = bo.c.c();
                obj3 = e.f28595d;
                if (r23.a(atomicReferenceFieldUpdater2, this, c10, obj3)) {
                    ao.d b10 = bo.b.b(this.f28586z);
                    l.a aVar = l.f59224w;
                    b10.resumeWith(l.a(m.a(th2)));
                    return;
                }
            } else {
                throw new IllegalStateException("Already resumed");
            }
        }
    }

    @Override // ao.d
    public void resumeWith(Object obj) {
        Object obj2;
        Object obj3;
        Object obj4;
        if (u0.a() && !g()) {
            throw new AssertionError();
        }
        while (true) {
            Object obj5 = this._result;
            obj2 = e.f28594c;
            if (obj5 == obj2) {
                Object d10 = g0.d(obj, null, 1, null);
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = B;
                obj3 = e.f28594c;
                if (r23.a(atomicReferenceFieldUpdater, this, obj3, d10)) {
                    return;
                }
            } else if (obj5 == bo.c.c()) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = B;
                Object c10 = bo.c.c();
                obj4 = e.f28595d;
                if (r23.a(atomicReferenceFieldUpdater2, this, c10, obj4)) {
                    if (l.c(obj)) {
                        ao.d<R> dVar = this.f28586z;
                        Throwable b10 = l.b(obj);
                        p.e(b10);
                        l.a aVar = l.f59224w;
                        if (u0.d() && (dVar instanceof co.e)) {
                            b10 = j0.j(b10, (co.e) dVar);
                        }
                        dVar.resumeWith(l.a(m.a(b10)));
                        return;
                    }
                    this.f28586z.resumeWith(obj);
                    return;
                }
            } else {
                throw new IllegalStateException("Already resumed");
            }
        }
    }

    @Override // zo.u
    public String toString() {
        return "SelectInstance(state=" + this._state + ", result=" + this._result + ')';
    }
}
