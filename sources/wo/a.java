package wo;

import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import uo.i1;
import uo.p;
import uo.u0;
import uo.v0;
import wn.l;
import wo.m;
import zo.j0;
import zo.k0;
import zo.u;

/* loaded from: classes4.dex */
public abstract class a<E> extends wo.c<E> implements wo.i<E> {

    /* renamed from: wo.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0982a<E> implements k<E> {

        /* renamed from: a  reason: collision with root package name */
        public final a<E> f59245a;

        /* renamed from: b  reason: collision with root package name */
        public Object f59246b = wo.b.f59261d;

        public C0982a(a<E> aVar) {
            this.f59245a = aVar;
        }

        @Override // wo.k
        public Object a(ao.d<? super Boolean> dVar) {
            Object b10 = b();
            k0 k0Var = wo.b.f59261d;
            if (b10 != k0Var) {
                return co.b.a(c(b()));
            }
            e(this.f59245a.V());
            return b() != k0Var ? co.b.a(c(b())) : d(dVar);
        }

        public final Object b() {
            return this.f59246b;
        }

        public final boolean c(Object obj) {
            if (obj instanceof p) {
                p pVar = (p) obj;
                if (pVar.f59283z == null) {
                    return false;
                }
                throw j0.k(pVar.Z());
            }
            return true;
        }

        public final Object d(ao.d<? super Boolean> dVar) {
            uo.q b10 = uo.s.b(bo.b.b(dVar));
            d dVar2 = new d(this, b10);
            while (true) {
                if (this.f59245a.K(dVar2)) {
                    this.f59245a.Z(b10, dVar2);
                    break;
                }
                Object V = this.f59245a.V();
                e(V);
                if (V instanceof p) {
                    p pVar = (p) V;
                    if (pVar.f59283z == null) {
                        l.a aVar = wn.l.f59224w;
                        b10.resumeWith(wn.l.a(co.b.a(false)));
                    } else {
                        l.a aVar2 = wn.l.f59224w;
                        b10.resumeWith(wn.l.a(wn.m.a(pVar.Z())));
                    }
                } else if (V != wo.b.f59261d) {
                    Boolean a10 = co.b.a(true);
                    io.l<E, wn.v> lVar = this.f59245a.f59265w;
                    b10.R(a10, lVar == null ? null : zo.c0.a(lVar, V, b10.getContext()));
                }
            }
            Object t10 = b10.t();
            if (t10 == bo.c.c()) {
                co.h.c(dVar);
            }
            return t10;
        }

        public final void e(Object obj) {
            this.f59246b = obj;
        }

        @Override // wo.k
        public E next() {
            E e10 = (E) this.f59246b;
            if (!(e10 instanceof p)) {
                k0 k0Var = wo.b.f59261d;
                if (e10 != k0Var) {
                    this.f59246b = k0Var;
                    return e10;
                }
                throw new IllegalStateException("'hasNext' should be called prior to 'next' invocation");
            }
            throw j0.k(((p) e10).Z());
        }
    }

    /* loaded from: classes4.dex */
    public static class b<E> extends w<E> {
        public final int A;

        /* renamed from: z  reason: collision with root package name */
        public final uo.p<Object> f59247z;

        public b(uo.p<Object> pVar, int i10) {
            this.f59247z = pVar;
            this.A = i10;
        }

        @Override // wo.w
        public void U(p<?> pVar) {
            if (this.A == 1) {
                uo.p<Object> pVar2 = this.f59247z;
                l.a aVar = wn.l.f59224w;
                pVar2.resumeWith(wn.l.a(m.b(m.f59279b.a(pVar.f59283z))));
                return;
            }
            uo.p<Object> pVar3 = this.f59247z;
            l.a aVar2 = wn.l.f59224w;
            pVar3.resumeWith(wn.l.a(wn.m.a(pVar.Z())));
        }

        public final Object V(E e10) {
            return this.A == 1 ? m.b(m.f59279b.c(e10)) : e10;
        }

        @Override // wo.y
        public void i(E e10) {
            this.f59247z.T(uo.r.f56081a);
        }

        @Override // wo.y
        public k0 l(E e10, u.c cVar) {
            Object h10 = this.f59247z.h(V(e10), cVar == null ? null : cVar.f63338c, S(e10));
            if (h10 == null) {
                return null;
            }
            if (u0.a()) {
                if (!(h10 == uo.r.f56081a)) {
                    throw new AssertionError();
                }
            }
            if (cVar != null) {
                cVar.d();
            }
            return uo.r.f56081a;
        }

        @Override // zo.u
        public String toString() {
            return "ReceiveElement@" + v0.b(this) + "[receiveMode=" + this.A + ']';
        }
    }

    /* loaded from: classes4.dex */
    public static final class c<E> extends b<E> {
        public final io.l<E, wn.v> B;

        /* JADX WARN: Multi-variable type inference failed */
        public c(uo.p<Object> pVar, int i10, io.l<? super E, wn.v> lVar) {
            super(pVar, i10);
            this.B = lVar;
        }

        @Override // wo.w
        public io.l<Throwable, wn.v> S(E e10) {
            return zo.c0.a(this.B, e10, this.f59247z.getContext());
        }
    }

    /* loaded from: classes4.dex */
    public static class d<E> extends w<E> {
        public final uo.p<Boolean> A;

        /* renamed from: z  reason: collision with root package name */
        public final C0982a<E> f59248z;

        /* JADX WARN: Multi-variable type inference failed */
        public d(C0982a<E> c0982a, uo.p<? super Boolean> pVar) {
            this.f59248z = c0982a;
            this.A = pVar;
        }

        @Override // wo.w
        public io.l<Throwable, wn.v> S(E e10) {
            io.l<E, wn.v> lVar = this.f59248z.f59245a.f59265w;
            if (lVar == null) {
                return null;
            }
            return zo.c0.a(lVar, e10, this.A.getContext());
        }

        @Override // wo.w
        public void U(p<?> pVar) {
            Object q10;
            if (pVar.f59283z == null) {
                q10 = p.a.b(this.A, Boolean.FALSE, null, 2, null);
            } else {
                q10 = this.A.q(pVar.Z());
            }
            if (q10 != null) {
                this.f59248z.e(pVar);
                this.A.T(q10);
            }
        }

        @Override // wo.y
        public void i(E e10) {
            this.f59248z.e(e10);
            this.A.T(uo.r.f56081a);
        }

        @Override // wo.y
        public k0 l(E e10, u.c cVar) {
            Object h10 = this.A.h(Boolean.TRUE, cVar == null ? null : cVar.f63338c, S(e10));
            if (h10 == null) {
                return null;
            }
            if (u0.a()) {
                if (!(h10 == uo.r.f56081a)) {
                    throw new AssertionError();
                }
            }
            if (cVar != null) {
                cVar.d();
            }
            return uo.r.f56081a;
        }

        @Override // zo.u
        public String toString() {
            return jo.p.o("ReceiveHasNext@", v0.b(this));
        }
    }

    /* loaded from: classes4.dex */
    public static final class e<R, E> extends w<E> implements i1 {
        public final cp.d<R> A;
        public final io.p<Object, ao.d<? super R>, Object> B;
        public final int C;

        /* renamed from: z  reason: collision with root package name */
        public final a<E> f59249z;

        /* JADX WARN: Multi-variable type inference failed */
        public e(a<E> aVar, cp.d<? super R> dVar, io.p<Object, ? super ao.d<? super R>, ? extends Object> pVar, int i10) {
            this.f59249z = aVar;
            this.A = dVar;
            this.B = pVar;
            this.C = i10;
        }

        @Override // wo.w
        public io.l<Throwable, wn.v> S(E e10) {
            io.l<E, wn.v> lVar = this.f59249z.f59265w;
            if (lVar == null) {
                return null;
            }
            return zo.c0.a(lVar, e10, this.A.o().getContext());
        }

        @Override // wo.w
        public void U(p<?> pVar) {
            if (this.A.m()) {
                int i10 = this.C;
                if (i10 == 0) {
                    this.A.p(pVar.Z());
                } else if (i10 != 1) {
                } else {
                    ap.a.d(this.B, m.b(m.f59279b.a(pVar.f59283z)), this.A.o(), null, 4, null);
                }
            }
        }

        @Override // uo.i1
        public void dispose() {
            if (K()) {
                this.f59249z.T();
            }
        }

        @Override // wo.y
        public void i(E e10) {
            ap.a.c(this.B, this.C == 1 ? m.b(m.f59279b.c(e10)) : e10, this.A.o(), S(e10));
        }

        @Override // wo.y
        public k0 l(E e10, u.c cVar) {
            return (k0) this.A.j(cVar);
        }

        @Override // zo.u
        public String toString() {
            return "ReceiveSelect@" + v0.b(this) + '[' + this.A + ",receiveMode=" + this.C + ']';
        }
    }

    /* loaded from: classes4.dex */
    public final class f extends uo.g {

        /* renamed from: w  reason: collision with root package name */
        public final w<?> f59250w;

        public f(w<?> wVar) {
            this.f59250w = wVar;
        }

        @Override // uo.o
        public void a(Throwable th2) {
            if (this.f59250w.K()) {
                a.this.T();
            }
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(Throwable th2) {
            a(th2);
            return wn.v.f59242a;
        }

        public String toString() {
            return "RemoveReceiveOnCancel[" + this.f59250w + ']';
        }
    }

    /* loaded from: classes4.dex */
    public static final class g<E> extends u.d<a0> {
        public g(zo.s sVar) {
            super(sVar);
        }

        @Override // zo.u.d, zo.u.a
        public Object e(zo.u uVar) {
            if (uVar instanceof p) {
                return uVar;
            }
            if (uVar instanceof a0) {
                return null;
            }
            return wo.b.f59261d;
        }

        @Override // zo.u.a
        public Object j(u.c cVar) {
            k0 V = ((a0) cVar.f63336a).V(cVar);
            if (V == null) {
                return zo.v.f63342a;
            }
            Object obj = zo.c.f63279b;
            if (V == obj) {
                return obj;
            }
            if (u0.a()) {
                if (V == uo.r.f56081a) {
                    return null;
                }
                throw new AssertionError();
            }
            return null;
        }

        @Override // zo.u.a
        public void k(zo.u uVar) {
            ((a0) uVar).W();
        }
    }

    /* loaded from: classes4.dex */
    public static final class h extends u.b {

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ zo.u f59252d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ a f59253e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(zo.u uVar, a aVar) {
            super(uVar);
            this.f59252d = uVar;
            this.f59253e = aVar;
        }

        @Override // zo.d
        /* renamed from: k */
        public Object i(zo.u uVar) {
            if (this.f59253e.O()) {
                return null;
            }
            return zo.t.a();
        }
    }

    /* loaded from: classes4.dex */
    public static final class i implements cp.c<m<? extends E>> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ a<E> f59254w;

        public i(a<E> aVar) {
            this.f59254w = aVar;
        }

        @Override // cp.c
        public <R> void m(cp.d<? super R> dVar, io.p<? super m<? extends E>, ? super ao.d<? super R>, ? extends Object> pVar) {
            this.f59254w.Y(dVar, 1, pVar);
        }
    }

    @co.f(c = "kotlinx.coroutines.channels.AbstractChannel", f = "AbstractChannel.kt", l = {633}, m = "receiveCatching-JP2dKIU")
    /* loaded from: classes4.dex */
    public static final class j extends co.d {

        /* renamed from: w  reason: collision with root package name */
        public /* synthetic */ Object f59255w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ a<E> f59256x;

        /* renamed from: y  reason: collision with root package name */
        public int f59257y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(a<E> aVar, ao.d<? super j> dVar) {
            super(dVar);
            this.f59256x = aVar;
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            this.f59255w = obj;
            this.f59257y |= Integer.MIN_VALUE;
            Object f10 = this.f59256x.f(this);
            return f10 == bo.c.c() ? f10 : m.b(f10);
        }
    }

    public a(io.l<? super E, wn.v> lVar) {
        super(lVar);
    }

    @Override // wo.c
    public y<E> D() {
        y<E> D = super.D();
        if (D != null && !(D instanceof p)) {
            T();
        }
        return D;
    }

    public final boolean I(Throwable th2) {
        boolean x10 = x(th2);
        R(x10);
        return x10;
    }

    public final g<E> J() {
        return new g<>(m());
    }

    public final boolean K(w<? super E> wVar) {
        boolean L = L(wVar);
        if (L) {
            U();
        }
        return L;
    }

    public boolean L(w<? super E> wVar) {
        int P;
        zo.u G;
        if (N()) {
            zo.u m10 = m();
            do {
                G = m10.G();
                if (!(!(G instanceof a0))) {
                    return false;
                }
            } while (!G.x(wVar, m10));
        } else {
            zo.u m11 = m();
            h hVar = new h(wVar, this);
            do {
                zo.u G2 = m11.G();
                if (!(!(G2 instanceof a0))) {
                    return false;
                }
                P = G2.P(wVar, m11, hVar);
                if (P != 1) {
                }
            } while (P != 2);
            return false;
        }
        return true;
    }

    public final <R> boolean M(cp.d<? super R> dVar, io.p<Object, ? super ao.d<? super R>, ? extends Object> pVar, int i10) {
        e eVar = new e(this, dVar, pVar, i10);
        boolean K = K(eVar);
        if (K) {
            dVar.e(eVar);
        }
        return K;
    }

    public abstract boolean N();

    public abstract boolean O();

    public boolean P() {
        return j() != null && O();
    }

    public final boolean Q() {
        return !(m().E() instanceof a0) && O();
    }

    public void R(boolean z10) {
        p<?> k10 = k();
        if (k10 != null) {
            Object b10 = zo.p.b(null, 1, null);
            while (true) {
                zo.u G = k10.G();
                if (G instanceof zo.s) {
                    S(b10, k10);
                    return;
                } else if (u0.a() && !(G instanceof a0)) {
                    throw new AssertionError();
                } else {
                    if (!G.K()) {
                        G.H();
                    } else {
                        b10 = zo.p.c(b10, (a0) G);
                    }
                }
            }
        } else {
            throw new IllegalStateException("Cannot happen".toString());
        }
    }

    public void S(Object obj, p<?> pVar) {
        if (obj == null) {
            return;
        }
        if (!(obj instanceof ArrayList)) {
            ((a0) obj).U(pVar);
            return;
        }
        ArrayList arrayList = (ArrayList) obj;
        int size = arrayList.size() - 1;
        if (size < 0) {
            return;
        }
        while (true) {
            int i10 = size - 1;
            ((a0) arrayList.get(size)).U(pVar);
            if (i10 < 0) {
                return;
            }
            size = i10;
        }
    }

    public void T() {
    }

    public void U() {
    }

    public Object V() {
        while (true) {
            a0 E = E();
            if (E == null) {
                return wo.b.f59261d;
            }
            k0 V = E.V(null);
            if (V != null) {
                if (u0.a()) {
                    if (!(V == uo.r.f56081a)) {
                        throw new AssertionError();
                    }
                }
                E.Q();
                return E.S();
            }
            E.W();
        }
    }

    public Object W(cp.d<?> dVar) {
        g<E> J = J();
        Object b10 = dVar.b(J);
        if (b10 != null) {
            return b10;
        }
        J.o().Q();
        return J.o().S();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [wo.a$b] */
    public final <R> Object X(int i10, ao.d<? super R> dVar) {
        c cVar;
        uo.q b10 = uo.s.b(bo.b.b(dVar));
        if (this.f59265w == null) {
            cVar = new b(b10, i10);
        } else {
            cVar = new c(b10, i10, this.f59265w);
        }
        while (true) {
            if (K(cVar)) {
                Z(b10, cVar);
                break;
            }
            Object V = V();
            if (V instanceof p) {
                cVar.U((p) V);
                break;
            } else if (V != wo.b.f59261d) {
                b10.R(cVar.V(V), cVar.S(V));
                break;
            }
        }
        Object t10 = b10.t();
        if (t10 == bo.c.c()) {
            co.h.c(dVar);
        }
        return t10;
    }

    public final <R> void Y(cp.d<? super R> dVar, int i10, io.p<Object, ? super ao.d<? super R>, ? extends Object> pVar) {
        while (!dVar.g()) {
            if (Q()) {
                if (M(dVar, pVar, i10)) {
                    return;
                }
            } else {
                Object W = W(dVar);
                if (W == cp.e.d()) {
                    return;
                }
                if (W != wo.b.f59261d && W != zo.c.f63279b) {
                    a0(pVar, dVar, i10, W);
                }
            }
        }
    }

    public final void Z(uo.p<?> pVar, w<?> wVar) {
        pVar.M(new f(wVar));
    }

    public final <R> void a0(io.p<Object, ? super ao.d<? super R>, ? extends Object> pVar, cp.d<? super R> dVar, int i10, Object obj) {
        boolean z10 = obj instanceof p;
        if (!z10) {
            if (i10 == 1) {
                m.b bVar = m.f59279b;
                ap.b.b(pVar, m.b(z10 ? bVar.a(((p) obj).f59283z) : bVar.c(obj)), dVar.o());
                return;
            }
            ap.b.b(pVar, obj, dVar.o());
        } else if (i10 != 0) {
            if (i10 == 1 && dVar.m()) {
                ap.b.b(pVar, m.b(m.f59279b.a(((p) obj).f59283z)), dVar.o());
            }
        } else {
            throw j0.k(((p) obj).Z());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // wo.x
    public final Object b(ao.d<? super E> dVar) {
        Object V = V();
        return (V == wo.b.f59261d || (V instanceof p)) ? X(0, dVar) : V;
    }

    @Override // wo.x
    public final void c(CancellationException cancellationException) {
        if (P()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new CancellationException(jo.p.o(v0.a(this), " was cancelled"));
        }
        I(cancellationException);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    @Override // wo.x
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f(ao.d<? super wo.m<? extends E>> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof wo.a.j
            if (r0 == 0) goto L13
            r0 = r5
            wo.a$j r0 = (wo.a.j) r0
            int r1 = r0.f59257y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f59257y = r1
            goto L18
        L13:
            wo.a$j r0 = new wo.a$j
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f59255w
            java.lang.Object r1 = bo.c.c()
            int r2 = r0.f59257y
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            wn.m.b(r5)
            goto L5b
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            wn.m.b(r5)
            java.lang.Object r5 = r4.V()
            zo.k0 r2 = wo.b.f59261d
            if (r5 == r2) goto L52
            boolean r0 = r5 instanceof wo.p
            if (r0 == 0) goto L4b
            wo.m$b r0 = wo.m.f59279b
            wo.p r5 = (wo.p) r5
            java.lang.Throwable r5 = r5.f59283z
            java.lang.Object r5 = r0.a(r5)
            goto L51
        L4b:
            wo.m$b r0 = wo.m.f59279b
            java.lang.Object r5 = r0.c(r5)
        L51:
            return r5
        L52:
            r0.f59257y = r3
            java.lang.Object r5 = r4.X(r3, r0)
            if (r5 != r1) goto L5b
            return r1
        L5b:
            wo.m r5 = (wo.m) r5
            java.lang.Object r5 = r5.l()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: wo.a.f(ao.d):java.lang.Object");
    }

    @Override // wo.x
    public final k<E> iterator() {
        return new C0982a(this);
    }

    @Override // wo.x
    public final cp.c<m<E>> s() {
        return new i(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // wo.x
    public final Object t() {
        Object V = V();
        return V == wo.b.f59261d ? m.f59279b.b() : V instanceof p ? m.f59279b.a(((p) V).f59283z) : m.f59279b.c(V);
    }
}
