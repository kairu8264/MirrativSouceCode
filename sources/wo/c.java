package wo;

import ai.r23;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import jo.j0;
import kotlinx.coroutines.internal.UndeliveredElementException;
import uo.u0;
import uo.v0;
import wn.l;
import zo.k0;
import zo.u;

/* loaded from: classes4.dex */
public abstract class c<E> implements b0<E> {

    /* renamed from: y  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f59264y = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "onCloseHandler");

    /* renamed from: w  reason: collision with root package name */
    public final io.l<E, wn.v> f59265w;

    /* renamed from: x  reason: collision with root package name */
    public final zo.s f59266x = new zo.s();
    private volatile /* synthetic */ Object onCloseHandler = null;

    /* loaded from: classes4.dex */
    public static final class a<E> extends a0 {

        /* renamed from: z  reason: collision with root package name */
        public final E f59267z;

        public a(E e10) {
            this.f59267z = e10;
        }

        @Override // wo.a0
        public void Q() {
        }

        @Override // wo.a0
        public Object S() {
            return this.f59267z;
        }

        @Override // wo.a0
        public void U(p<?> pVar) {
            if (u0.a()) {
                throw new AssertionError();
            }
        }

        @Override // wo.a0
        public k0 V(u.c cVar) {
            k0 k0Var = uo.r.f56081a;
            if (cVar != null) {
                cVar.d();
            }
            return k0Var;
        }

        @Override // zo.u
        public String toString() {
            return "SendBuffered@" + v0.b(this) + '(' + this.f59267z + ')';
        }
    }

    /* loaded from: classes4.dex */
    public static final class b extends u.b {

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ zo.u f59268d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ c f59269e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(zo.u uVar, c cVar) {
            super(uVar);
            this.f59268d = uVar;
            this.f59269e = cVar;
        }

        @Override // zo.d
        /* renamed from: k */
        public Object i(zo.u uVar) {
            if (this.f59269e.w()) {
                return null;
            }
            return zo.t.a();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c(io.l<? super E, wn.v> lVar) {
        this.f59265w = lVar;
    }

    public void A(zo.u uVar) {
    }

    public final y<?> B(E e10) {
        zo.u G;
        zo.u uVar = this.f59266x;
        a aVar = new a(e10);
        do {
            G = uVar.G();
            if (G instanceof y) {
                return (y) G;
            }
        } while (!G.x(aVar, uVar));
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x006f, code lost:
        r4 = r0.t();
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0077, code lost:
        if (r4 != bo.c.c()) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0079, code lost:
        co.h.c(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0080, code lost:
        if (r4 != bo.c.c()) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0082, code lost:
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0085, code lost:
        return wn.v.f59242a;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object C(E r4, ao.d<? super wn.v> r5) {
        /*
            r3 = this;
            ao.d r0 = bo.b.b(r5)
            uo.q r0 = uo.s.b(r0)
        L8:
            boolean r1 = d(r3)
            if (r1 == 0) goto L4d
            io.l<E, wn.v> r1 = r3.f59265w
            if (r1 != 0) goto L18
            wo.c0 r1 = new wo.c0
            r1.<init>(r4, r0)
            goto L1f
        L18:
            wo.d0 r1 = new wo.d0
            io.l<E, wn.v> r2 = r3.f59265w
            r1.<init>(r4, r0, r2)
        L1f:
            java.lang.Object r2 = r3.h(r1)
            if (r2 != 0) goto L29
            uo.s.c(r0, r1)
            goto L6f
        L29:
            boolean r1 = r2 instanceof wo.p
            if (r1 == 0) goto L33
            wo.p r2 = (wo.p) r2
            a(r3, r0, r4, r2)
            goto L6f
        L33:
            zo.k0 r1 = wo.b.f59262e
            if (r2 != r1) goto L38
            goto L4d
        L38:
            boolean r1 = r2 instanceof wo.w
            if (r1 == 0) goto L3d
            goto L4d
        L3d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "enqueueSend returned "
            java.lang.String r5 = jo.p.o(r5, r2)
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        L4d:
            java.lang.Object r1 = r3.z(r4)
            zo.k0 r2 = wo.b.f59259b
            if (r1 != r2) goto L61
            wn.l$a r4 = wn.l.f59224w
            wn.v r4 = wn.v.f59242a
            java.lang.Object r4 = wn.l.a(r4)
            r0.resumeWith(r4)
            goto L6f
        L61:
            zo.k0 r2 = wo.b.f59260c
            if (r1 != r2) goto L66
            goto L8
        L66:
            boolean r2 = r1 instanceof wo.p
            if (r2 == 0) goto L86
            wo.p r1 = (wo.p) r1
            a(r3, r0, r4, r1)
        L6f:
            java.lang.Object r4 = r0.t()
            java.lang.Object r0 = bo.c.c()
            if (r4 != r0) goto L7c
            co.h.c(r5)
        L7c:
            java.lang.Object r5 = bo.c.c()
            if (r4 != r5) goto L83
            return r4
        L83:
            wn.v r4 = wn.v.f59242a
            return r4
        L86:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "offerInternal returned "
            java.lang.String r5 = jo.p.o(r5, r1)
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: wo.c.C(java.lang.Object, ao.d):java.lang.Object");
    }

    public y<E> D() {
        zo.u uVar;
        zo.u N;
        zo.s sVar = this.f59266x;
        while (true) {
            uVar = (zo.u) sVar.D();
            if (uVar != sVar && (uVar instanceof y)) {
                if (((((y) uVar) instanceof p) && !uVar.J()) || (N = uVar.N()) == null) {
                    break;
                }
                N.I();
            }
        }
        uVar = null;
        return (y) uVar;
    }

    public final a0 E() {
        zo.u uVar;
        zo.u N;
        zo.s sVar = this.f59266x;
        while (true) {
            uVar = (zo.u) sVar.D();
            if (uVar != sVar && (uVar instanceof a0)) {
                if (((((a0) uVar) instanceof p) && !uVar.J()) || (N = uVar.N()) == null) {
                    break;
                }
                N.I();
            }
        }
        uVar = null;
        return (a0) uVar;
    }

    public final int e() {
        zo.s sVar = this.f59266x;
        int i10 = 0;
        for (zo.u uVar = (zo.u) sVar.D(); !jo.p.c(uVar, sVar); uVar = uVar.E()) {
            if (uVar instanceof zo.u) {
                i10++;
            }
        }
        return i10;
    }

    public Object h(a0 a0Var) {
        boolean z10;
        zo.u G;
        if (v()) {
            zo.u uVar = this.f59266x;
            do {
                G = uVar.G();
                if (G instanceof y) {
                    return G;
                }
            } while (!G.x(a0Var, uVar));
            return null;
        }
        zo.u uVar2 = this.f59266x;
        b bVar = new b(a0Var, this);
        while (true) {
            zo.u G2 = uVar2.G();
            if (!(G2 instanceof y)) {
                int P = G2.P(a0Var, uVar2, bVar);
                z10 = true;
                if (P != 1) {
                    if (P == 2) {
                        z10 = false;
                        break;
                    }
                } else {
                    break;
                }
            } else {
                return G2;
            }
        }
        if (z10) {
            return null;
        }
        return wo.b.f59262e;
    }

    public String i() {
        return "";
    }

    public final p<?> j() {
        zo.u E = this.f59266x.E();
        p<?> pVar = E instanceof p ? (p) E : null;
        if (pVar == null) {
            return null;
        }
        o(pVar);
        return pVar;
    }

    public final p<?> k() {
        zo.u G = this.f59266x.G();
        p<?> pVar = G instanceof p ? (p) G : null;
        if (pVar == null) {
            return null;
        }
        o(pVar);
        return pVar;
    }

    @Override // wo.b0
    public final Object l(E e10) {
        Object z10 = z(e10);
        if (z10 == wo.b.f59259b) {
            return m.f59279b.c(wn.v.f59242a);
        }
        if (z10 == wo.b.f59260c) {
            p<?> k10 = k();
            return k10 == null ? m.f59279b.b() : m.f59279b.a(p(k10));
        } else if (z10 instanceof p) {
            return m.f59279b.a(p((p) z10));
        } else {
            throw new IllegalStateException(jo.p.o("trySend returned ", z10).toString());
        }
    }

    public final zo.s m() {
        return this.f59266x;
    }

    public final String n() {
        String o10;
        zo.u E = this.f59266x.E();
        if (E == this.f59266x) {
            return "EmptyQueue";
        }
        if (E instanceof p) {
            o10 = E.toString();
        } else if (E instanceof w) {
            o10 = "ReceiveQueued";
        } else {
            o10 = E instanceof a0 ? "SendQueued" : jo.p.o("UNEXPECTED:", E);
        }
        zo.u G = this.f59266x.G();
        if (G != E) {
            String str = o10 + ",queueSize=" + e();
            if (G instanceof p) {
                return str + ",closedForSend=" + G;
            }
            return str;
        }
        return o10;
    }

    public final void o(p<?> pVar) {
        Object b10 = zo.p.b(null, 1, null);
        while (true) {
            zo.u G = pVar.G();
            w wVar = G instanceof w ? (w) G : null;
            if (wVar == null) {
                break;
            } else if (!wVar.K()) {
                wVar.H();
            } else {
                b10 = zo.p.c(b10, wVar);
            }
        }
        if (b10 != null) {
            if (!(b10 instanceof ArrayList)) {
                ((w) b10).U(pVar);
            } else {
                ArrayList arrayList = (ArrayList) b10;
                int size = arrayList.size() - 1;
                if (size >= 0) {
                    while (true) {
                        int i10 = size - 1;
                        ((w) arrayList.get(size)).U(pVar);
                        if (i10 < 0) {
                            break;
                        }
                        size = i10;
                    }
                }
            }
        }
        A(pVar);
    }

    public final Throwable p(p<?> pVar) {
        o(pVar);
        return pVar.a0();
    }

    public final void q(ao.d<?> dVar, E e10, p<?> pVar) {
        UndeliveredElementException d10;
        o(pVar);
        Throwable a02 = pVar.a0();
        io.l<E, wn.v> lVar = this.f59265w;
        if (lVar == null || (d10 = zo.c0.d(lVar, e10, null, 2, null)) == null) {
            l.a aVar = wn.l.f59224w;
            dVar.resumeWith(wn.l.a(wn.m.a(a02)));
            return;
        }
        wn.a.a(d10, a02);
        l.a aVar2 = wn.l.f59224w;
        dVar.resumeWith(wn.l.a(wn.m.a(d10)));
    }

    @Override // wo.b0
    public final Object r(E e10, ao.d<? super wn.v> dVar) {
        Object C;
        return (z(e10) != wo.b.f59259b && (C = C(e10, dVar)) == bo.c.c()) ? C : wn.v.f59242a;
    }

    public String toString() {
        return v0.a(this) + '@' + v0.b(this) + '{' + n() + '}' + i();
    }

    public final void u(Throwable th2) {
        k0 k0Var;
        Object obj = this.onCloseHandler;
        if (obj == null || obj == (k0Var = wo.b.f59263f) || !r23.a(f59264y, this, obj, k0Var)) {
            return;
        }
        ((io.l) j0.e(obj, 1)).invoke(th2);
    }

    public abstract boolean v();

    public abstract boolean w();

    @Override // wo.b0
    public boolean x(Throwable th2) {
        boolean z10;
        p<?> pVar = new p<>(th2);
        zo.u uVar = this.f59266x;
        while (true) {
            zo.u G = uVar.G();
            z10 = true;
            if (!(!(G instanceof p))) {
                z10 = false;
                break;
            } else if (G.x(pVar, uVar)) {
                break;
            }
        }
        if (!z10) {
            pVar = (p) this.f59266x.G();
        }
        o(pVar);
        if (z10) {
            u(th2);
        }
        return z10;
    }

    public final boolean y() {
        return !(this.f59266x.E() instanceof y) && w();
    }

    public Object z(E e10) {
        y<E> D;
        k0 l10;
        do {
            D = D();
            if (D == null) {
                return wo.b.f59260c;
            }
            l10 = D.l(e10, null);
        } while (l10 == null);
        if (u0.a()) {
            if (!(l10 == uo.r.f56081a)) {
                throw new AssertionError();
            }
        }
        D.i(e10);
        return D.a();
    }
}
