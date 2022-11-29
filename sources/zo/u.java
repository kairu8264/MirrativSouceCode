package zo;

import ai.r23;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import uo.u0;
import uo.v0;

/* loaded from: classes4.dex */
public class u {

    /* renamed from: w  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f63331w = AtomicReferenceFieldUpdater.newUpdater(u.class, Object.class, "_next");

    /* renamed from: x  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f63332x = AtomicReferenceFieldUpdater.newUpdater(u.class, Object.class, "_prev");

    /* renamed from: y  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f63333y = AtomicReferenceFieldUpdater.newUpdater(u.class, Object.class, "_removedRef");
    public volatile /* synthetic */ Object _next = this;
    public volatile /* synthetic */ Object _prev = this;
    private volatile /* synthetic */ Object _removedRef = null;

    /* loaded from: classes4.dex */
    public static abstract class a extends zo.b {
        @Override // zo.b
        public final void a(zo.d<?> dVar, Object obj) {
            boolean z10 = obj == null;
            u h10 = h();
            if (h10 == null) {
                if (u0.a() && !(!z10)) {
                    throw new AssertionError();
                }
                return;
            }
            u i10 = i();
            if (i10 == null) {
                if (u0.a() && !(!z10)) {
                    throw new AssertionError();
                }
                return;
            }
            if (r23.a(u.f63331w, h10, dVar, z10 ? n(h10, i10) : i10) && z10) {
                f(h10, i10);
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:31:0x0054, code lost:
            if (uo.u0.a() == false) goto L35;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x0056, code lost:
            if (r4 != null) goto L34;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x0058, code lost:
            r7 = true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x005a, code lost:
            r7 = false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x005b, code lost:
            if (r7 == false) goto L30;
         */
        /* JADX WARN: Code restructure failed: missing block: B:38:0x0063, code lost:
            throw new java.lang.AssertionError();
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x0064, code lost:
            return null;
         */
        @Override // zo.b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object c(zo.d<?> r7) {
            /*
                r6 = this;
            L0:
                zo.u r0 = r6.m(r7)
                if (r0 != 0) goto L9
                java.lang.Object r7 = zo.c.f63279b
                return r7
            L9:
                java.lang.Object r1 = r0._next
                r2 = 0
                if (r1 != r7) goto Lf
                return r2
            Lf:
                boolean r3 = r7.h()
                if (r3 == 0) goto L16
                return r2
            L16:
                boolean r3 = r1 instanceof zo.d0
                if (r3 == 0) goto L29
                zo.d0 r1 = (zo.d0) r1
                boolean r2 = r7.b(r1)
                if (r2 == 0) goto L25
                java.lang.Object r7 = zo.c.f63279b
                return r7
            L25:
                r1.c(r0)
                goto L0
            L29:
                java.lang.Object r3 = r6.e(r0)
                if (r3 == 0) goto L30
                return r3
            L30:
                boolean r3 = r6.l(r0, r1)
                if (r3 == 0) goto L37
                goto L0
            L37:
                zo.u$c r3 = new zo.u$c
                r4 = r1
                zo.u r4 = (zo.u) r4
                r3.<init>(r0, r4, r6)
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = zo.u.f63331w
                boolean r4 = ai.r23.a(r4, r0, r1, r3)
                if (r4 == 0) goto L0
                java.lang.Object r4 = r3.c(r0)     // Catch: java.lang.Throwable -> L65
                java.lang.Object r5 = zo.v.f63342a     // Catch: java.lang.Throwable -> L65
                if (r4 != r5) goto L50
                goto L0
            L50:
                boolean r7 = uo.u0.a()     // Catch: java.lang.Throwable -> L65
                if (r7 == 0) goto L64
                if (r4 != 0) goto L5a
                r7 = 1
                goto L5b
            L5a:
                r7 = 0
            L5b:
                if (r7 == 0) goto L5e
                goto L64
            L5e:
                java.lang.AssertionError r7 = new java.lang.AssertionError     // Catch: java.lang.Throwable -> L65
                r7.<init>()     // Catch: java.lang.Throwable -> L65
                throw r7     // Catch: java.lang.Throwable -> L65
            L64:
                return r2
            L65:
                r7 = move-exception
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = zo.u.f63331w
                ai.r23.a(r2, r0, r3, r1)
                throw r7
            */
            throw new UnsupportedOperationException("Method not decompiled: zo.u.a.c(zo.d):java.lang.Object");
        }

        public abstract Object e(u uVar);

        public abstract void f(u uVar, u uVar2);

        public abstract void g(c cVar);

        public abstract u h();

        public abstract u i();

        public Object j(c cVar) {
            g(cVar);
            return null;
        }

        public void k(u uVar) {
        }

        public abstract boolean l(u uVar, Object obj);

        public abstract u m(d0 d0Var);

        public abstract Object n(u uVar, u uVar2);
    }

    /* loaded from: classes4.dex */
    public static abstract class b extends zo.d<u> {

        /* renamed from: b  reason: collision with root package name */
        public final u f63334b;

        /* renamed from: c  reason: collision with root package name */
        public u f63335c;

        public b(u uVar) {
            this.f63334b = uVar;
        }

        @Override // zo.d
        /* renamed from: j */
        public void d(u uVar, Object obj) {
            boolean z10 = obj == null;
            u uVar2 = z10 ? this.f63334b : this.f63335c;
            if (uVar2 != null && r23.a(u.f63331w, uVar, this, uVar2) && z10) {
                u uVar3 = this.f63334b;
                u uVar4 = this.f63335c;
                jo.p.e(uVar4);
                uVar3.B(uVar4);
            }
        }
    }

    /* loaded from: classes4.dex */
    public static final class c extends d0 {

        /* renamed from: a  reason: collision with root package name */
        public final u f63336a;

        /* renamed from: b  reason: collision with root package name */
        public final u f63337b;

        /* renamed from: c  reason: collision with root package name */
        public final a f63338c;

        public c(u uVar, u uVar2, a aVar) {
            this.f63336a = uVar;
            this.f63337b = uVar2;
            this.f63338c = aVar;
        }

        @Override // zo.d0
        public zo.d<?> a() {
            return this.f63338c.b();
        }

        @Override // zo.d0
        public Object c(Object obj) {
            Object f10;
            Object obj2;
            if (u0.a()) {
                if (!(obj == this.f63336a)) {
                    throw new AssertionError();
                }
            }
            Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
            u uVar = (u) obj;
            Object j10 = this.f63338c.j(this);
            Object obj3 = v.f63342a;
            if (j10 == obj3) {
                u uVar2 = this.f63337b;
                if (r23.a(u.f63331w, uVar, this, uVar2.O())) {
                    this.f63338c.k(uVar);
                    uVar2.z(null);
                }
                return obj3;
            }
            if (j10 != null) {
                f10 = a().e(j10);
            } else {
                f10 = a().f();
            }
            if (f10 == zo.c.f63278a) {
                obj2 = a();
            } else if (f10 == null) {
                obj2 = this.f63338c.n(uVar, this.f63337b);
            } else {
                obj2 = this.f63337b;
            }
            r23.a(u.f63331w, uVar, this, obj2);
            return null;
        }

        public final void d() {
            this.f63338c.g(this);
        }

        @Override // zo.d0
        public String toString() {
            return "PrepareOp(op=" + a() + ')';
        }
    }

    /* loaded from: classes4.dex */
    public static class d<T> extends a {

        /* renamed from: c  reason: collision with root package name */
        public static final /* synthetic */ AtomicReferenceFieldUpdater f63339c = AtomicReferenceFieldUpdater.newUpdater(d.class, Object.class, "_affectedNode");

        /* renamed from: d  reason: collision with root package name */
        public static final /* synthetic */ AtomicReferenceFieldUpdater f63340d = AtomicReferenceFieldUpdater.newUpdater(d.class, Object.class, "_originalNext");
        private volatile /* synthetic */ Object _affectedNode = null;
        private volatile /* synthetic */ Object _originalNext = null;

        /* renamed from: b  reason: collision with root package name */
        public final u f63341b;

        public d(u uVar) {
            this.f63341b = uVar;
        }

        @Override // zo.u.a
        public Object e(u uVar) {
            if (uVar == this.f63341b) {
                return t.b();
            }
            return null;
        }

        @Override // zo.u.a
        public final void f(u uVar, u uVar2) {
            uVar2.z(null);
        }

        @Override // zo.u.a
        public void g(c cVar) {
            r23.a(f63339c, this, null, cVar.f63336a);
            r23.a(f63340d, this, null, cVar.f63337b);
        }

        @Override // zo.u.a
        public final u h() {
            return (u) this._affectedNode;
        }

        @Override // zo.u.a
        public final u i() {
            return (u) this._originalNext;
        }

        @Override // zo.u.a
        public final boolean l(u uVar, Object obj) {
            if (obj instanceof e0) {
                ((e0) obj).f63286a.I();
                return true;
            }
            return false;
        }

        @Override // zo.u.a
        public final u m(d0 d0Var) {
            u uVar = this.f63341b;
            while (true) {
                Object obj = uVar._next;
                if (obj instanceof d0) {
                    d0 d0Var2 = (d0) obj;
                    if (d0Var.b(d0Var2)) {
                        return null;
                    }
                    d0Var2.c(this.f63341b);
                } else {
                    return (u) obj;
                }
            }
        }

        @Override // zo.u.a
        public final Object n(u uVar, u uVar2) {
            return uVar2.O();
        }

        public final T o() {
            T t10 = (T) h();
            jo.p.e(t10);
            return t10;
        }
    }

    public final u A(u uVar) {
        while (uVar.J()) {
            uVar = (u) uVar._prev;
        }
        return uVar;
    }

    public final void B(u uVar) {
        u uVar2;
        do {
            uVar2 = (u) uVar._prev;
            if (D() != uVar) {
                return;
            }
        } while (!r23.a(f63332x, uVar, uVar2, this));
        if (J()) {
            uVar.z(null);
        }
    }

    public final Object D() {
        while (true) {
            Object obj = this._next;
            if (!(obj instanceof d0)) {
                return obj;
            }
            ((d0) obj).c(this);
        }
    }

    public final u E() {
        return t.c(D());
    }

    public final u G() {
        u z10 = z(null);
        return z10 == null ? A((u) this._prev) : z10;
    }

    public final void H() {
        ((e0) D()).f63286a.I();
    }

    public final void I() {
        u uVar = this;
        while (true) {
            Object D = uVar.D();
            if (!(D instanceof e0)) {
                uVar.z(null);
                return;
            }
            uVar = ((e0) D).f63286a;
        }
    }

    public boolean J() {
        return D() instanceof e0;
    }

    public boolean K() {
        return N() == null;
    }

    public final u L() {
        while (true) {
            u uVar = (u) D();
            if (uVar == this) {
                return null;
            }
            if (uVar.K()) {
                return uVar;
            }
            uVar.H();
        }
    }

    public final u N() {
        Object D;
        u uVar;
        do {
            D = D();
            if (D instanceof e0) {
                return ((e0) D).f63286a;
            }
            if (D == this) {
                return (u) D;
            }
            uVar = (u) D;
        } while (!r23.a(f63331w, this, D, uVar.O()));
        uVar.z(null);
        return null;
    }

    public final e0 O() {
        e0 e0Var = (e0) this._removedRef;
        if (e0Var == null) {
            e0 e0Var2 = new e0(this);
            f63333y.lazySet(this, e0Var2);
            return e0Var2;
        }
        return e0Var;
    }

    public final int P(u uVar, u uVar2, b bVar) {
        f63332x.lazySet(uVar, this);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f63331w;
        atomicReferenceFieldUpdater.lazySet(uVar, uVar2);
        bVar.f63335c = uVar2;
        if (r23.a(atomicReferenceFieldUpdater, this, uVar2, bVar)) {
            return bVar.c(this) == null ? 1 : 2;
        }
        return 0;
    }

    public String toString() {
        return new jo.w(this) { // from class: zo.u.e
            @Override // qo.f
            public Object get() {
                return v0.a(this.f38131x);
            }
        } + '@' + v0.b(this);
    }

    public final void v(u uVar) {
        do {
        } while (!G().x(uVar, this));
    }

    public final boolean x(u uVar, u uVar2) {
        f63332x.lazySet(uVar, this);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f63331w;
        atomicReferenceFieldUpdater.lazySet(uVar, uVar2);
        if (r23.a(atomicReferenceFieldUpdater, this, uVar2, uVar)) {
            uVar.B(uVar2);
            return true;
        }
        return false;
    }

    public final boolean y(u uVar) {
        f63332x.lazySet(uVar, this);
        f63331w.lazySet(uVar, this);
        while (D() == this) {
            if (r23.a(f63331w, this, this, uVar)) {
                uVar.B(this);
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0048, code lost:
        if (ai.r23.a(zo.u.f63331w, r3, r2, ((zo.e0) r4).f63286a) != false) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final zo.u z(zo.d0 r8) {
        /*
            r7 = this;
        L0:
            java.lang.Object r0 = r7._prev
            zo.u r0 = (zo.u) r0
            r1 = 0
            r2 = r0
        L6:
            r3 = r1
        L7:
            java.lang.Object r4 = r2._next
            if (r4 != r7) goto L18
            if (r0 != r2) goto Le
            return r2
        Le:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = zo.u.f63332x
            boolean r0 = ai.r23.a(r1, r7, r0, r2)
            if (r0 != 0) goto L17
            goto L0
        L17:
            return r2
        L18:
            boolean r5 = r7.J()
            if (r5 == 0) goto L1f
            return r1
        L1f:
            if (r4 != r8) goto L22
            return r2
        L22:
            boolean r5 = r4 instanceof zo.d0
            if (r5 == 0) goto L38
            if (r8 == 0) goto L32
            r0 = r4
            zo.d0 r0 = (zo.d0) r0
            boolean r0 = r8.b(r0)
            if (r0 == 0) goto L32
            return r1
        L32:
            zo.d0 r4 = (zo.d0) r4
            r4.c(r2)
            goto L0
        L38:
            boolean r5 = r4 instanceof zo.e0
            if (r5 == 0) goto L52
            if (r3 == 0) goto L4d
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = zo.u.f63331w
            zo.e0 r4 = (zo.e0) r4
            zo.u r4 = r4.f63286a
            boolean r2 = ai.r23.a(r5, r3, r2, r4)
            if (r2 != 0) goto L4b
            goto L0
        L4b:
            r2 = r3
            goto L6
        L4d:
            java.lang.Object r2 = r2._prev
            zo.u r2 = (zo.u) r2
            goto L7
        L52:
            r3 = r4
            zo.u r3 = (zo.u) r3
            r6 = r3
            r3 = r2
            r2 = r6
            goto L7
        */
        throw new UnsupportedOperationException("Method not decompiled: zo.u.z(zo.d0):zo.u");
    }
}
