package uo;

import ai.r23;
import ao.g;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.CompletionHandlerException;
import kotlinx.coroutines.JobCancellationException;
import kotlinx.coroutines.TimeoutCancellationException;
import uo.d2;
import zo.u;

/* loaded from: classes4.dex */
public class k2 implements d2, x, t2 {

    /* renamed from: w  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f56040w = AtomicReferenceFieldUpdater.newUpdater(k2.class, Object.class, "_state");
    private volatile /* synthetic */ Object _parentHandle;
    private volatile /* synthetic */ Object _state;

    /* loaded from: classes4.dex */
    public static final class a<T> extends q<T> {
        public final k2 E;

        public a(ao.d<? super T> dVar, k2 k2Var) {
            super(dVar, 1);
            this.E = k2Var;
        }

        @Override // uo.q
        public String D() {
            return "AwaitContinuation";
        }

        @Override // uo.q
        public Throwable s(d2 d2Var) {
            Throwable d10;
            Object n02 = this.E.n0();
            return (!(n02 instanceof c) || (d10 = ((c) n02).d()) == null) ? n02 instanceof d0 ? ((d0) n02).f55999a : d2Var.n() : d10;
        }
    }

    /* loaded from: classes4.dex */
    public static final class b extends j2 {
        public final k2 A;
        public final c B;
        public final w C;
        public final Object D;

        public b(k2 k2Var, c cVar, w wVar, Object obj) {
            this.A = k2Var;
            this.B = cVar;
            this.C = wVar;
            this.D = obj;
        }

        @Override // uo.f0
        public void Q(Throwable th2) {
            this.A.c0(this.B, this.C, this.D);
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(Throwable th2) {
            Q(th2);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes4.dex */
    public static final class c implements x1 {
        private volatile /* synthetic */ Object _exceptionsHolder = null;
        private volatile /* synthetic */ int _isCompleting;
        private volatile /* synthetic */ Object _rootCause;

        /* renamed from: w  reason: collision with root package name */
        public final p2 f56041w;

        public c(p2 p2Var, boolean z10, Throwable th2) {
            this.f56041w = p2Var;
            this._isCompleting = z10 ? 1 : 0;
            this._rootCause = th2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void a(Throwable th2) {
            Throwable d10 = d();
            if (d10 == null) {
                l(th2);
            } else if (th2 == d10) {
            } else {
                Object c10 = c();
                if (c10 == null) {
                    k(th2);
                } else if (!(c10 instanceof Throwable)) {
                    if (!(c10 instanceof ArrayList)) {
                        throw new IllegalStateException(jo.p.o("State is ", c10).toString());
                    }
                    ((ArrayList) c10).add(th2);
                } else if (th2 == c10) {
                } else {
                    ArrayList<Throwable> b10 = b();
                    b10.add(c10);
                    b10.add(th2);
                    k(b10);
                }
            }
        }

        public final ArrayList<Throwable> b() {
            return new ArrayList<>(4);
        }

        public final Object c() {
            return this._exceptionsHolder;
        }

        public final Throwable d() {
            return (Throwable) this._rootCause;
        }

        public final boolean e() {
            return d() != null;
        }

        @Override // uo.x1
        public p2 f() {
            return this.f56041w;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [int, boolean] */
        public final boolean g() {
            return this._isCompleting;
        }

        public final boolean h() {
            zo.k0 k0Var;
            Object c10 = c();
            k0Var = l2.f56057e;
            return c10 == k0Var;
        }

        public final List<Throwable> i(Throwable th2) {
            ArrayList<Throwable> arrayList;
            zo.k0 k0Var;
            Object c10 = c();
            if (c10 == null) {
                arrayList = b();
            } else if (c10 instanceof Throwable) {
                ArrayList<Throwable> b10 = b();
                b10.add(c10);
                arrayList = b10;
            } else if (!(c10 instanceof ArrayList)) {
                throw new IllegalStateException(jo.p.o("State is ", c10).toString());
            } else {
                arrayList = (ArrayList) c10;
            }
            Throwable d10 = d();
            if (d10 != null) {
                arrayList.add(0, d10);
            }
            if (th2 != null && !jo.p.c(th2, d10)) {
                arrayList.add(th2);
            }
            k0Var = l2.f56057e;
            k(k0Var);
            return arrayList;
        }

        @Override // uo.x1
        public boolean isActive() {
            return d() == null;
        }

        public final void j(boolean z10) {
            this._isCompleting = z10 ? 1 : 0;
        }

        public final void k(Object obj) {
            this._exceptionsHolder = obj;
        }

        public final void l(Throwable th2) {
            this._rootCause = th2;
        }

        public String toString() {
            return "Finishing[cancelling=" + e() + ", completing=" + g() + ", rootCause=" + d() + ", exceptions=" + c() + ", list=" + f() + ']';
        }
    }

    /* loaded from: classes4.dex */
    public static final class d extends u.b {

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ zo.u f56042d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ k2 f56043e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ Object f56044f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(zo.u uVar, k2 k2Var, Object obj) {
            super(uVar);
            this.f56042d = uVar;
            this.f56043e = k2Var;
            this.f56044f = obj;
        }

        @Override // zo.d
        /* renamed from: k */
        public Object i(zo.u uVar) {
            if (this.f56043e.n0() == this.f56044f) {
                return null;
            }
            return zo.t.a();
        }
    }

    @co.f(c = "kotlinx.coroutines.JobSupport$children$1", f = "JobSupport.kt", l = {952, 954}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class e extends co.k implements io.p<ro.i<? super d2>, ao.d<? super wn.v>, Object> {
        public /* synthetic */ Object A;

        /* renamed from: x  reason: collision with root package name */
        public Object f56045x;

        /* renamed from: y  reason: collision with root package name */
        public Object f56046y;

        /* renamed from: z  reason: collision with root package name */
        public int f56047z;

        public e(ao.d<? super e> dVar) {
            super(2, dVar);
        }

        @Override // io.p
        /* renamed from: a */
        public final Object invoke(ro.i<? super d2> iVar, ao.d<? super wn.v> dVar) {
            return ((e) create(iVar, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            e eVar = new e(dVar);
            eVar.A = obj;
            return eVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x0067  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0069 -> B:28:0x007f). Please submit an issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x007c -> B:28:0x007f). Please submit an issue!!! */
        @Override // co.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = bo.c.c()
                int r1 = r7.f56047z
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L2b
                if (r1 == r3) goto L27
                if (r1 != r2) goto L1f
                java.lang.Object r1 = r7.f56046y
                zo.u r1 = (zo.u) r1
                java.lang.Object r3 = r7.f56045x
                zo.s r3 = (zo.s) r3
                java.lang.Object r4 = r7.A
                ro.i r4 = (ro.i) r4
                wn.m.b(r8)
                r8 = r7
                goto L7f
            L1f:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L27:
                wn.m.b(r8)
                goto L84
            L2b:
                wn.m.b(r8)
                java.lang.Object r8 = r7.A
                ro.i r8 = (ro.i) r8
                uo.k2 r1 = uo.k2.this
                java.lang.Object r1 = r1.n0()
                boolean r4 = r1 instanceof uo.w
                if (r4 == 0) goto L49
                uo.w r1 = (uo.w) r1
                uo.x r1 = r1.A
                r7.f56047z = r3
                java.lang.Object r8 = r8.b(r1, r7)
                if (r8 != r0) goto L84
                return r0
            L49:
                boolean r3 = r1 instanceof uo.x1
                if (r3 == 0) goto L84
                uo.x1 r1 = (uo.x1) r1
                uo.p2 r1 = r1.f()
                if (r1 != 0) goto L56
                goto L84
            L56:
                java.lang.Object r3 = r1.D()
                zo.u r3 = (zo.u) r3
                r4 = r8
                r8 = r7
                r6 = r3
                r3 = r1
                r1 = r6
            L61:
                boolean r5 = jo.p.c(r1, r3)
                if (r5 != 0) goto L84
                boolean r5 = r1 instanceof uo.w
                if (r5 == 0) goto L7f
                r5 = r1
                uo.w r5 = (uo.w) r5
                uo.x r5 = r5.A
                r8.A = r4
                r8.f56045x = r3
                r8.f56046y = r1
                r8.f56047z = r2
                java.lang.Object r5 = r4.b(r5, r8)
                if (r5 != r0) goto L7f
                return r0
            L7f:
                zo.u r1 = r1.E()
                goto L61
            L84:
                wn.v r8 = wn.v.f59242a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: uo.k2.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public k2(boolean z10) {
        this._state = z10 ? l2.f56059g : l2.f56058f;
        this._parentHandle = null;
    }

    public static /* synthetic */ CancellationException O0(k2 k2Var, Throwable th2, String str, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 1) != 0) {
                str = null;
            }
            return k2Var.N0(th2, str);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toCancellationException");
    }

    public final void A0(p2 p2Var, Throwable th2) {
        CompletionHandlerException completionHandlerException;
        C0(th2);
        CompletionHandlerException completionHandlerException2 = null;
        for (zo.u uVar = (zo.u) p2Var.D(); !jo.p.c(uVar, p2Var); uVar = uVar.E()) {
            if (uVar instanceof e2) {
                j2 j2Var = (j2) uVar;
                try {
                    j2Var.Q(th2);
                } catch (Throwable th3) {
                    if (completionHandlerException2 == null) {
                        completionHandlerException = null;
                    } else {
                        wn.a.a(completionHandlerException2, th3);
                        completionHandlerException = completionHandlerException2;
                    }
                    if (completionHandlerException == null) {
                        completionHandlerException2 = new CompletionHandlerException("Exception in completion handler " + j2Var + " for " + this, th3);
                    }
                }
            }
        }
        if (completionHandlerException2 != null) {
            p0(completionHandlerException2);
        }
        Y(th2);
    }

    public final boolean B(Object obj, p2 p2Var, j2 j2Var) {
        int P;
        d dVar = new d(j2Var, this, obj);
        do {
            P = p2Var.G().P(j2Var, p2Var, dVar);
            if (P == 1) {
                return true;
            }
        } while (P != 2);
        return false;
    }

    public final void B0(p2 p2Var, Throwable th2) {
        CompletionHandlerException completionHandlerException;
        CompletionHandlerException completionHandlerException2 = null;
        for (zo.u uVar = (zo.u) p2Var.D(); !jo.p.c(uVar, p2Var); uVar = uVar.E()) {
            if (uVar instanceof j2) {
                j2 j2Var = (j2) uVar;
                try {
                    j2Var.Q(th2);
                } catch (Throwable th3) {
                    if (completionHandlerException2 == null) {
                        completionHandlerException = null;
                    } else {
                        wn.a.a(completionHandlerException2, th3);
                        completionHandlerException = completionHandlerException2;
                    }
                    if (completionHandlerException == null) {
                        completionHandlerException2 = new CompletionHandlerException("Exception in completion handler " + j2Var + " for " + this, th3);
                    }
                }
            }
        }
        if (completionHandlerException2 == null) {
            return;
        }
        p0(completionHandlerException2);
    }

    public void C0(Throwable th2) {
    }

    public final void D(Throwable th2, List<? extends Throwable> list) {
        if (list.size() <= 1) {
            return;
        }
        Set newSetFromMap = Collections.newSetFromMap(new IdentityHashMap(list.size()));
        Throwable n10 = !u0.d() ? th2 : zo.j0.n(th2);
        for (Throwable th3 : list) {
            if (u0.d()) {
                th3 = zo.j0.n(th3);
            }
            if (th3 != th2 && th3 != n10 && !(th3 instanceof CancellationException) && newSetFromMap.add(th3)) {
                wn.a.a(th2, th3);
            }
        }
    }

    public void D0(Object obj) {
    }

    @Override // uo.d2
    public final Object E(ao.d<? super wn.v> dVar) {
        if (!s0()) {
            g2.j(dVar.getContext());
            return wn.v.f59242a;
        }
        Object t02 = t0(dVar);
        return t02 == bo.c.c() ? t02 : wn.v.f59242a;
    }

    public void E0() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [uo.w1] */
    public final void F0(l1 l1Var) {
        p2 p2Var = new p2();
        if (!l1Var.isActive()) {
            p2Var = new w1(p2Var);
        }
        r23.a(f56040w, this, l1Var, p2Var);
    }

    @Override // uo.t2
    public CancellationException G() {
        Throwable th2;
        Object n02 = n0();
        if (n02 instanceof c) {
            th2 = ((c) n02).d();
        } else if (n02 instanceof d0) {
            th2 = ((d0) n02).f55999a;
        } else if (n02 instanceof x1) {
            throw new IllegalStateException(jo.p.o("Cannot be cancelling child in this state: ", n02).toString());
        } else {
            th2 = null;
        }
        CancellationException cancellationException = th2 instanceof CancellationException ? th2 : null;
        return cancellationException == null ? new JobCancellationException(jo.p.o("Parent job is ", M0(n02)), th2, this) : cancellationException;
    }

    public final void G0(j2 j2Var) {
        j2Var.y(new p2());
        r23.a(f56040w, this, j2Var, j2Var.E());
    }

    public void H(Object obj) {
    }

    public final <T, R> void H0(cp.d<? super R> dVar, io.p<? super T, ? super ao.d<? super R>, ? extends Object> pVar) {
        Object n02;
        do {
            n02 = n0();
            if (dVar.g()) {
                return;
            }
            if (!(n02 instanceof x1)) {
                if (dVar.m()) {
                    if (n02 instanceof d0) {
                        dVar.p(((d0) n02).f55999a);
                        return;
                    } else {
                        ap.b.b(pVar, l2.h(n02), dVar.o());
                        return;
                    }
                }
                return;
            }
        } while (L0(n02) != 0);
        dVar.e(p(new y2(dVar, pVar)));
    }

    public final void I0(j2 j2Var) {
        Object n02;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        l1 l1Var;
        do {
            n02 = n0();
            if (!(n02 instanceof j2)) {
                if (!(n02 instanceof x1) || ((x1) n02).f() == null) {
                    return;
                }
                j2Var.K();
                return;
            } else if (n02 != j2Var) {
                return;
            } else {
                atomicReferenceFieldUpdater = f56040w;
                l1Var = l2.f56059g;
            }
        } while (!r23.a(atomicReferenceFieldUpdater, this, n02, l1Var));
    }

    public final Object J(ao.d<Object> dVar) {
        Object n02;
        do {
            n02 = n0();
            if (!(n02 instanceof x1)) {
                if (n02 instanceof d0) {
                    Throwable th2 = ((d0) n02).f55999a;
                    if (u0.d()) {
                        if (dVar instanceof co.e) {
                            throw zo.j0.a(th2, (co.e) dVar);
                        }
                        throw th2;
                    }
                    throw th2;
                }
                return l2.h(n02);
            }
        } while (L0(n02) < 0);
        return Q(dVar);
    }

    public final <T, R> void J0(cp.d<? super R> dVar, io.p<? super T, ? super ao.d<? super R>, ? extends Object> pVar) {
        Object n02 = n0();
        if (n02 instanceof d0) {
            dVar.p(((d0) n02).f55999a);
        } else {
            ap.a.d(pVar, l2.h(n02), dVar.o(), null, 4, null);
        }
    }

    @Override // uo.d2
    public final v K(x xVar) {
        return (v) d2.a.d(this, true, false, new w(xVar), 2, null);
    }

    public final void K0(v vVar) {
        this._parentHandle = vVar;
    }

    public final int L0(Object obj) {
        l1 l1Var;
        if (obj instanceof l1) {
            if (((l1) obj).isActive()) {
                return 0;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f56040w;
            l1Var = l2.f56059g;
            if (r23.a(atomicReferenceFieldUpdater, this, obj, l1Var)) {
                E0();
                return 1;
            }
            return -1;
        } else if (obj instanceof w1) {
            if (r23.a(f56040w, this, obj, ((w1) obj).f())) {
                E0();
                return 1;
            }
            return -1;
        } else {
            return 0;
        }
    }

    public final String M0(Object obj) {
        if (!(obj instanceof c)) {
            return obj instanceof x1 ? ((x1) obj).isActive() ? "Active" : "New" : obj instanceof d0 ? "Cancelled" : "Completed";
        }
        c cVar = (c) obj;
        return cVar.e() ? "Cancelling" : cVar.g() ? "Completing" : "Active";
    }

    public final CancellationException N0(Throwable th2, String str) {
        CancellationException cancellationException = th2 instanceof CancellationException ? (CancellationException) th2 : null;
        if (cancellationException == null) {
            if (str == null) {
                str = Z();
            }
            cancellationException = new JobCancellationException(str, th2, this);
        }
        return cancellationException;
    }

    @Override // uo.d2
    public final i1 O(boolean z10, boolean z11, io.l<? super Throwable, wn.v> lVar) {
        j2 x02 = x0(lVar, z10);
        while (true) {
            Object n02 = n0();
            if (n02 instanceof l1) {
                l1 l1Var = (l1) n02;
                if (l1Var.isActive()) {
                    if (r23.a(f56040w, this, n02, x02)) {
                        return x02;
                    }
                } else {
                    F0(l1Var);
                }
            } else {
                if (n02 instanceof x1) {
                    p2 f10 = ((x1) n02).f();
                    if (f10 == null) {
                        Objects.requireNonNull(n02, "null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                        G0((j2) n02);
                    } else {
                        i1 i1Var = r2.f56082w;
                        if (z10 && (n02 instanceof c)) {
                            synchronized (n02) {
                                r3 = ((c) n02).d();
                                if (r3 == null || ((lVar instanceof w) && !((c) n02).g())) {
                                    if (B(n02, f10, x02)) {
                                        if (r3 == null) {
                                            return x02;
                                        }
                                        i1Var = x02;
                                    }
                                }
                                wn.v vVar = wn.v.f59242a;
                            }
                        }
                        if (r3 != null) {
                            if (z11) {
                                lVar.invoke(r3);
                            }
                            return i1Var;
                        } else if (B(n02, f10, x02)) {
                            return x02;
                        }
                    }
                } else {
                    if (z11) {
                        d0 d0Var = n02 instanceof d0 ? (d0) n02 : null;
                        lVar.invoke(d0Var != null ? d0Var.f55999a : null);
                    }
                    return r2.f56082w;
                }
            }
        }
    }

    public final String P0() {
        return y0() + '{' + M0(n0()) + '}';
    }

    public final Object Q(ao.d<Object> dVar) {
        a aVar = new a(bo.b.b(dVar), this);
        aVar.y();
        s.a(aVar, p(new v2(aVar)));
        Object t10 = aVar.t();
        if (t10 == bo.c.c()) {
            co.h.c(dVar);
        }
        return t10;
    }

    public final boolean Q0(x1 x1Var, Object obj) {
        if (u0.a()) {
            if (!((x1Var instanceof l1) || (x1Var instanceof j2))) {
                throw new AssertionError();
            }
        }
        if (!u0.a() || (!(obj instanceof d0))) {
            if (r23.a(f56040w, this, x1Var, l2.g(obj))) {
                C0(null);
                D0(obj);
                b0(x1Var, obj);
                return true;
            }
            return false;
        }
        throw new AssertionError();
    }

    public final boolean R0(x1 x1Var, Throwable th2) {
        if (!u0.a() || (!(x1Var instanceof c))) {
            if (!u0.a() || x1Var.isActive()) {
                p2 l02 = l0(x1Var);
                if (l02 == null) {
                    return false;
                }
                if (r23.a(f56040w, this, x1Var, new c(l02, false, th2))) {
                    A0(l02, th2);
                    return true;
                }
                return false;
            }
            throw new AssertionError();
        }
        throw new AssertionError();
    }

    public final boolean S(Throwable th2) {
        return V(th2);
    }

    public final Object S0(Object obj, Object obj2) {
        zo.k0 k0Var;
        zo.k0 k0Var2;
        if (!(obj instanceof x1)) {
            k0Var2 = l2.f56053a;
            return k0Var2;
        } else if (((obj instanceof l1) || (obj instanceof j2)) && !(obj instanceof w) && !(obj2 instanceof d0)) {
            if (Q0((x1) obj, obj2)) {
                return obj2;
            }
            k0Var = l2.f56055c;
            return k0Var;
        } else {
            return T0((x1) obj, obj2);
        }
    }

    public final Object T0(x1 x1Var, Object obj) {
        zo.k0 k0Var;
        zo.k0 k0Var2;
        zo.k0 k0Var3;
        p2 l02 = l0(x1Var);
        if (l02 == null) {
            k0Var3 = l2.f56055c;
            return k0Var3;
        }
        c cVar = x1Var instanceof c ? (c) x1Var : null;
        if (cVar == null) {
            cVar = new c(l02, false, null);
        }
        synchronized (cVar) {
            if (cVar.g()) {
                k0Var2 = l2.f56053a;
                return k0Var2;
            }
            cVar.j(true);
            if (cVar != x1Var && !r23.a(f56040w, this, x1Var, cVar)) {
                k0Var = l2.f56055c;
                return k0Var;
            }
            if (u0.a() && !(!cVar.h())) {
                throw new AssertionError();
            }
            boolean e10 = cVar.e();
            d0 d0Var = obj instanceof d0 ? (d0) obj : null;
            if (d0Var != null) {
                cVar.a(d0Var.f55999a);
            }
            Throwable d10 = true ^ e10 ? cVar.d() : null;
            wn.v vVar = wn.v.f59242a;
            if (d10 != null) {
                A0(l02, d10);
            }
            w f02 = f0(x1Var);
            if (f02 != null && U0(cVar, f02, obj)) {
                return l2.f56054b;
            }
            return e0(cVar, obj);
        }
    }

    public final boolean U0(c cVar, w wVar, Object obj) {
        while (d2.a.d(wVar.A, false, false, new b(this, cVar, wVar, obj), 1, null) == r2.f56082w) {
            wVar = z0(wVar);
            if (wVar == null) {
                return false;
            }
        }
        return true;
    }

    public final boolean V(Object obj) {
        Object obj2;
        zo.k0 k0Var;
        zo.k0 k0Var2;
        zo.k0 k0Var3;
        obj2 = l2.f56053a;
        if (k0() && (obj2 = X(obj)) == l2.f56054b) {
            return true;
        }
        k0Var = l2.f56053a;
        if (obj2 == k0Var) {
            obj2 = u0(obj);
        }
        k0Var2 = l2.f56053a;
        if (obj2 == k0Var2 || obj2 == l2.f56054b) {
            return true;
        }
        k0Var3 = l2.f56056d;
        if (obj2 == k0Var3) {
            return false;
        }
        H(obj2);
        return true;
    }

    public void W(Throwable th2) {
        V(th2);
    }

    public final Object X(Object obj) {
        zo.k0 k0Var;
        Object S0;
        zo.k0 k0Var2;
        do {
            Object n02 = n0();
            if (!(n02 instanceof x1) || ((n02 instanceof c) && ((c) n02).g())) {
                k0Var = l2.f56053a;
                return k0Var;
            }
            S0 = S0(n02, new d0(d0(obj), false, 2, null));
            k0Var2 = l2.f56055c;
        } while (S0 == k0Var2);
        return S0;
    }

    public final boolean Y(Throwable th2) {
        if (r0()) {
            return true;
        }
        boolean z10 = th2 instanceof CancellationException;
        v m02 = m0();
        return (m02 == null || m02 == r2.f56082w) ? z10 : m02.c(th2) || z10;
    }

    public String Z() {
        return "Job was cancelled";
    }

    public boolean a0(Throwable th2) {
        if (th2 instanceof CancellationException) {
            return true;
        }
        return V(th2) && j0();
    }

    public final void b0(x1 x1Var, Object obj) {
        v m02 = m0();
        if (m02 != null) {
            m02.dispose();
            K0(r2.f56082w);
        }
        d0 d0Var = obj instanceof d0 ? (d0) obj : null;
        Throwable th2 = d0Var != null ? d0Var.f55999a : null;
        if (x1Var instanceof j2) {
            try {
                ((j2) x1Var).Q(th2);
                return;
            } catch (Throwable th3) {
                p0(new CompletionHandlerException("Exception in completion handler " + x1Var + " for " + this, th3));
                return;
            }
        }
        p2 f10 = x1Var.f();
        if (f10 == null) {
            return;
        }
        B0(f10, th2);
    }

    @Override // uo.d2
    public void c(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new JobCancellationException(Z(), null, this);
        }
        W(cancellationException);
    }

    public final void c0(c cVar, w wVar, Object obj) {
        if (u0.a()) {
            if (!(n0() == cVar)) {
                throw new AssertionError();
            }
        }
        w z02 = z0(wVar);
        if (z02 == null || !U0(cVar, z02, obj)) {
            H(e0(cVar, obj));
        }
    }

    public final Throwable d0(Object obj) {
        if (obj == null ? true : obj instanceof Throwable) {
            Throwable th2 = (Throwable) obj;
            return th2 == null ? new JobCancellationException(Z(), null, this) : th2;
        }
        Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.ParentJob");
        return ((t2) obj).G();
    }

    public final Object e0(c cVar, Object obj) {
        boolean e10;
        Throwable i02;
        boolean z10 = true;
        if (u0.a()) {
            if (!(n0() == cVar)) {
                throw new AssertionError();
            }
        }
        if (!u0.a() || (!cVar.h())) {
            if (!u0.a() || cVar.g()) {
                d0 d0Var = obj instanceof d0 ? (d0) obj : null;
                Throwable th2 = d0Var == null ? null : d0Var.f55999a;
                synchronized (cVar) {
                    e10 = cVar.e();
                    List<Throwable> i10 = cVar.i(th2);
                    i02 = i0(cVar, i10);
                    if (i02 != null) {
                        D(i02, i10);
                    }
                }
                if (i02 != null && i02 != th2) {
                    obj = new d0(i02, false, 2, null);
                }
                if (i02 != null) {
                    if (!Y(i02) && !o0(i02)) {
                        z10 = false;
                    }
                    if (z10) {
                        Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
                        ((d0) obj).b();
                    }
                }
                if (!e10) {
                    C0(i02);
                }
                D0(obj);
                boolean a10 = r23.a(f56040w, this, cVar, l2.g(obj));
                if (!u0.a() || a10) {
                    b0(cVar, obj);
                    return obj;
                }
                throw new AssertionError();
            }
            throw new AssertionError();
        }
        throw new AssertionError();
    }

    public final w f0(x1 x1Var) {
        w wVar = x1Var instanceof w ? (w) x1Var : null;
        if (wVar == null) {
            p2 f10 = x1Var.f();
            if (f10 == null) {
                return null;
            }
            return z0(f10);
        }
        return wVar;
    }

    @Override // ao.g
    public <R> R fold(R r10, io.p<? super R, ? super g.b, ? extends R> pVar) {
        return (R) d2.a.b(this, r10, pVar);
    }

    public final Object g0() {
        Object n02 = n0();
        if (!(n02 instanceof x1)) {
            if (!(n02 instanceof d0)) {
                return l2.h(n02);
            }
            throw ((d0) n02).f55999a;
        }
        throw new IllegalStateException("This job has not completed yet".toString());
    }

    @Override // ao.g.b, ao.g
    public <E extends g.b> E get(g.c<E> cVar) {
        return (E) d2.a.c(this, cVar);
    }

    @Override // ao.g.b
    public final g.c<?> getKey() {
        return d2.f56001s;
    }

    public final Throwable h0(Object obj) {
        d0 d0Var = obj instanceof d0 ? (d0) obj : null;
        if (d0Var == null) {
            return null;
        }
        return d0Var.f55999a;
    }

    @Override // uo.d2
    public final ro.g<d2> i() {
        return ro.j.b(new e(null));
    }

    public final Throwable i0(c cVar, List<? extends Throwable> list) {
        Object obj;
        boolean z10;
        Object obj2 = null;
        if (list.isEmpty()) {
            if (cVar.e()) {
                return new JobCancellationException(Z(), null, this);
            }
            return null;
        }
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (!(((Throwable) obj) instanceof CancellationException)) {
                break;
            }
        }
        Throwable th2 = (Throwable) obj;
        if (th2 != null) {
            return th2;
        }
        Throwable th3 = list.get(0);
        if (th3 instanceof TimeoutCancellationException) {
            Iterator<T> it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                Throwable th4 = (Throwable) next;
                if (th4 == th3 || !(th4 instanceof TimeoutCancellationException)) {
                    z10 = false;
                    continue;
                } else {
                    z10 = true;
                    continue;
                }
                if (z10) {
                    obj2 = next;
                    break;
                }
            }
            Throwable th5 = (Throwable) obj2;
            if (th5 != null) {
                return th5;
            }
        }
        return th3;
    }

    @Override // uo.d2
    public boolean isActive() {
        Object n02 = n0();
        return (n02 instanceof x1) && ((x1) n02).isActive();
    }

    @Override // uo.d2
    public final boolean isCancelled() {
        Object n02 = n0();
        return (n02 instanceof d0) || ((n02 instanceof c) && ((c) n02).e());
    }

    @Override // uo.x
    public final void j(t2 t2Var) {
        V(t2Var);
    }

    public boolean j0() {
        return true;
    }

    public boolean k0() {
        return false;
    }

    public final p2 l0(x1 x1Var) {
        p2 f10 = x1Var.f();
        if (f10 == null) {
            if (x1Var instanceof l1) {
                return new p2();
            }
            if (x1Var instanceof j2) {
                G0((j2) x1Var);
                return null;
            }
            throw new IllegalStateException(jo.p.o("State should have list: ", x1Var).toString());
        }
        return f10;
    }

    public final v m0() {
        return (v) this._parentHandle;
    }

    @Override // ao.g
    public ao.g minusKey(g.c<?> cVar) {
        return d2.a.e(this, cVar);
    }

    @Override // uo.d2
    public final CancellationException n() {
        Object n02 = n0();
        if (!(n02 instanceof c)) {
            if (n02 instanceof x1) {
                throw new IllegalStateException(jo.p.o("Job is still new or active: ", this).toString());
            }
            return n02 instanceof d0 ? O0(this, ((d0) n02).f55999a, null, 1, null) : new JobCancellationException(jo.p.o(v0.a(this), " has completed normally"), null, this);
        }
        Throwable d10 = ((c) n02).d();
        CancellationException N0 = d10 != null ? N0(d10, jo.p.o(v0.a(this), " is cancelling")) : null;
        if (N0 != null) {
            return N0;
        }
        throw new IllegalStateException(jo.p.o("Job is still new or active: ", this).toString());
    }

    public final Object n0() {
        while (true) {
            Object obj = this._state;
            if (!(obj instanceof zo.d0)) {
                return obj;
            }
            ((zo.d0) obj).c(this);
        }
    }

    public boolean o0(Throwable th2) {
        return false;
    }

    @Override // uo.d2
    public final i1 p(io.l<? super Throwable, wn.v> lVar) {
        return O(false, true, lVar);
    }

    public void p0(Throwable th2) {
        throw th2;
    }

    @Override // ao.g
    public ao.g plus(ao.g gVar) {
        return d2.a.f(this, gVar);
    }

    public final void q0(d2 d2Var) {
        if (u0.a()) {
            if (!(m0() == null)) {
                throw new AssertionError();
            }
        }
        if (d2Var == null) {
            K0(r2.f56082w);
            return;
        }
        d2Var.start();
        v K = d2Var.K(this);
        K0(K);
        if (w()) {
            K.dispose();
            K0(r2.f56082w);
        }
    }

    public boolean r0() {
        return false;
    }

    public final boolean s0() {
        Object n02;
        do {
            n02 = n0();
            if (!(n02 instanceof x1)) {
                return false;
            }
        } while (L0(n02) < 0);
        return true;
    }

    @Override // uo.d2
    public final boolean start() {
        int L0;
        do {
            L0 = L0(n0());
            if (L0 == 0) {
                return false;
            }
        } while (L0 != 1);
        return true;
    }

    public final Object t0(ao.d<? super wn.v> dVar) {
        q qVar = new q(bo.b.b(dVar), 1);
        qVar.y();
        s.a(qVar, p(new w2(qVar)));
        Object t10 = qVar.t();
        if (t10 == bo.c.c()) {
            co.h.c(dVar);
        }
        return t10 == bo.c.c() ? t10 : wn.v.f59242a;
    }

    public String toString() {
        return P0() + '@' + v0.b(this);
    }

    public final Object u0(Object obj) {
        zo.k0 k0Var;
        zo.k0 k0Var2;
        zo.k0 k0Var3;
        zo.k0 k0Var4;
        zo.k0 k0Var5;
        zo.k0 k0Var6;
        Throwable th2 = null;
        while (true) {
            Object n02 = n0();
            if (n02 instanceof c) {
                synchronized (n02) {
                    if (((c) n02).h()) {
                        k0Var2 = l2.f56056d;
                        return k0Var2;
                    }
                    boolean e10 = ((c) n02).e();
                    if (obj != null || !e10) {
                        if (th2 == null) {
                            th2 = d0(obj);
                        }
                        ((c) n02).a(th2);
                    }
                    Throwable d10 = e10 ^ true ? ((c) n02).d() : null;
                    if (d10 != null) {
                        A0(((c) n02).f(), d10);
                    }
                    k0Var = l2.f56053a;
                    return k0Var;
                }
            } else if (!(n02 instanceof x1)) {
                k0Var3 = l2.f56056d;
                return k0Var3;
            } else {
                if (th2 == null) {
                    th2 = d0(obj);
                }
                x1 x1Var = (x1) n02;
                if (x1Var.isActive()) {
                    if (R0(x1Var, th2)) {
                        k0Var4 = l2.f56053a;
                        return k0Var4;
                    }
                } else {
                    Object S0 = S0(n02, new d0(th2, false, 2, null));
                    k0Var5 = l2.f56053a;
                    if (S0 != k0Var5) {
                        k0Var6 = l2.f56055c;
                        if (S0 != k0Var6) {
                            return S0;
                        }
                    } else {
                        throw new IllegalStateException(jo.p.o("Cannot happen in ", n02).toString());
                    }
                }
            }
        }
    }

    public final boolean v0(Object obj) {
        Object S0;
        zo.k0 k0Var;
        zo.k0 k0Var2;
        do {
            S0 = S0(n0(), obj);
            k0Var = l2.f56053a;
            if (S0 == k0Var) {
                return false;
            }
            if (S0 == l2.f56054b) {
                return true;
            }
            k0Var2 = l2.f56055c;
        } while (S0 == k0Var2);
        H(S0);
        return true;
    }

    public final boolean w() {
        return !(n0() instanceof x1);
    }

    public final Object w0(Object obj) {
        Object S0;
        zo.k0 k0Var;
        zo.k0 k0Var2;
        do {
            S0 = S0(n0(), obj);
            k0Var = l2.f56053a;
            if (S0 != k0Var) {
                k0Var2 = l2.f56055c;
            } else {
                throw new IllegalStateException("Job " + this + " is already complete or completing, but is being completed with " + obj, h0(obj));
            }
        } while (S0 == k0Var2);
        return S0;
    }

    public final j2 x0(io.l<? super Throwable, wn.v> lVar, boolean z10) {
        if (z10) {
            r0 = lVar instanceof e2 ? (e2) lVar : null;
            if (r0 == null) {
                r0 = new b2(lVar);
            }
        } else {
            j2 j2Var = lVar instanceof j2 ? (j2) lVar : null;
            if (j2Var != null) {
                if (u0.a() && !(!(j2Var instanceof e2))) {
                    throw new AssertionError();
                }
                r0 = j2Var;
            }
            if (r0 == null) {
                r0 = new c2(lVar);
            }
        }
        r0.U(this);
        return r0;
    }

    public String y0() {
        return v0.a(this);
    }

    public final w z0(zo.u uVar) {
        while (uVar.J()) {
            uVar = uVar.G();
        }
        while (true) {
            uVar = uVar.E();
            if (!uVar.J()) {
                if (uVar instanceof w) {
                    return (w) uVar;
                }
                if (uVar instanceof p2) {
                    return null;
                }
            }
        }
    }
}
