package wo;

import ai.r23;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import jo.j0;
import kotlinx.coroutines.channels.ClosedSendChannelException;
import uo.u0;
import zo.k0;

/* loaded from: classes4.dex */
public final class q<E> implements f<E> {
    @Deprecated
    public static final k0 B;
    @Deprecated
    public static final c<Object> C;

    /* renamed from: x  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f59285x;

    /* renamed from: y  reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f59286y;

    /* renamed from: z  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f59287z;
    private volatile /* synthetic */ Object _state;
    private volatile /* synthetic */ int _updating;
    private volatile /* synthetic */ Object onCloseHandler;

    /* renamed from: w  reason: collision with root package name */
    public static final b f59284w = new b(null);
    @Deprecated
    public static final a A = new a(null);

    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final Throwable f59288a;

        public a(Throwable th2) {
            this.f59288a = th2;
        }

        public final Throwable a() {
            Throwable th2 = this.f59288a;
            return th2 == null ? new ClosedSendChannelException("Channel was closed") : th2;
        }

        public final Throwable b() {
            Throwable th2 = this.f59288a;
            return th2 == null ? new IllegalStateException("Channel was closed") : th2;
        }
    }

    /* loaded from: classes4.dex */
    public static final class b {
        public b() {
        }

        public /* synthetic */ b(jo.h hVar) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public static final class c<E> {

        /* renamed from: a  reason: collision with root package name */
        public final Object f59289a;

        /* renamed from: b  reason: collision with root package name */
        public final d<E>[] f59290b;

        public c(Object obj, d<E>[] dVarArr) {
            this.f59289a = obj;
            this.f59290b = dVarArr;
        }
    }

    /* loaded from: classes4.dex */
    public static final class d<E> extends r<E> implements x<E> {
        public final q<E> B;

        public d(q<E> qVar) {
            super(null);
            this.B = qVar;
        }

        @Override // wo.r, wo.a
        public void R(boolean z10) {
            if (z10) {
                this.B.c(this);
            }
        }

        @Override // wo.r, wo.c
        public Object z(E e10) {
            return super.z(e10);
        }
    }

    static {
        k0 k0Var = new k0("UNDEFINED");
        B = k0Var;
        C = new c<>(k0Var, null);
        f59285x = AtomicReferenceFieldUpdater.newUpdater(q.class, Object.class, "_state");
        f59286y = AtomicIntegerFieldUpdater.newUpdater(q.class, "_updating");
        f59287z = AtomicReferenceFieldUpdater.newUpdater(q.class, Object.class, "onCloseHandler");
    }

    public q() {
        this._state = C;
        this._updating = 0;
        this.onCloseHandler = null;
    }

    public final d<E>[] b(d<E>[] dVarArr, d<E> dVar) {
        if (dVarArr == null) {
            d<E>[] dVarArr2 = new d[1];
            for (int i10 = 0; i10 < 1; i10++) {
                dVarArr2[i10] = dVar;
            }
            return dVarArr2;
        }
        return (d[]) xn.n.w(dVarArr, dVar);
    }

    public final void c(d<E> dVar) {
        Object obj;
        Object obj2;
        d<E>[] dVarArr;
        do {
            obj = this._state;
            if (obj instanceof a) {
                return;
            }
            if (obj instanceof c) {
                c cVar = (c) obj;
                obj2 = cVar.f59289a;
                dVarArr = cVar.f59290b;
                jo.p.e(dVarArr);
            } else {
                throw new IllegalStateException(jo.p.o("Invalid state ", obj).toString());
            }
        } while (!r23.a(f59285x, this, obj, new c(obj2, i(dVarArr, dVar))));
    }

    public final E d() {
        Object obj = this._state;
        if (!(obj instanceof a)) {
            if (obj instanceof c) {
                E e10 = (E) ((c) obj).f59289a;
                if (e10 != B) {
                    return e10;
                }
                throw new IllegalStateException("No value");
            }
            throw new IllegalStateException(jo.p.o("Invalid state ", obj).toString());
        }
        throw ((a) obj).b();
    }

    public final E e() {
        Object obj = this._state;
        if (obj instanceof a) {
            return null;
        }
        if (obj instanceof c) {
            k0 k0Var = B;
            E e10 = (E) ((c) obj).f59289a;
            if (e10 == k0Var) {
                return null;
            }
            return e10;
        }
        throw new IllegalStateException(jo.p.o("Invalid state ", obj).toString());
    }

    public final void f(Throwable th2) {
        k0 k0Var;
        Object obj = this.onCloseHandler;
        if (obj == null || obj == (k0Var = wo.b.f59263f) || !r23.a(f59287z, this, obj, k0Var)) {
            return;
        }
        ((io.l) j0.e(obj, 1)).invoke(th2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // wo.f
    public x<E> g() {
        Object obj;
        c cVar;
        d dVar = new d(this);
        do {
            obj = this._state;
            if (obj instanceof a) {
                dVar.x(((a) obj).f59288a);
                return dVar;
            } else if (obj instanceof c) {
                cVar = (c) obj;
                Object obj2 = cVar.f59289a;
                if (obj2 != B) {
                    dVar.z(obj2);
                }
            } else {
                throw new IllegalStateException(jo.p.o("Invalid state ", obj).toString());
            }
        } while (!r23.a(f59285x, this, obj, new c(cVar.f59289a, b(cVar.f59290b, dVar))));
        return dVar;
    }

    public final a h(E e10) {
        Object obj;
        if (f59286y.compareAndSet(this, 0, 1)) {
            do {
                try {
                    obj = this._state;
                    if (obj instanceof a) {
                        return (a) obj;
                    }
                    if (obj instanceof c) {
                    } else {
                        throw new IllegalStateException(jo.p.o("Invalid state ", obj).toString());
                    }
                } finally {
                    this._updating = 0;
                }
            } while (!r23.a(f59285x, this, obj, new c(e10, ((c) obj).f59290b)));
            d<E>[] dVarArr = ((c) obj).f59290b;
            if (dVarArr != null) {
                int length = dVarArr.length;
                int i10 = 0;
                while (i10 < length) {
                    d<E> dVar = dVarArr[i10];
                    i10++;
                    dVar.z(e10);
                }
            }
            return null;
        }
        return null;
    }

    public final d<E>[] i(d<E>[] dVarArr, d<E> dVar) {
        int length = dVarArr.length;
        int N = xn.o.N(dVarArr, dVar);
        if (u0.a()) {
            if (!(N >= 0)) {
                throw new AssertionError();
            }
        }
        if (length == 1) {
            return null;
        }
        d<E>[] dVarArr2 = new d[length - 1];
        xn.n.m(dVarArr, dVarArr2, 0, 0, N, 6, null);
        xn.n.m(dVarArr, dVarArr2, N, N + 1, 0, 8, null);
        return dVarArr2;
    }

    @Override // wo.b0
    public Object l(E e10) {
        a h10 = h(e10);
        if (h10 == null) {
            return m.f59279b.c(wn.v.f59242a);
        }
        return m.f59279b.a(h10.a());
    }

    @Override // wo.b0
    public Object r(E e10, ao.d<? super wn.v> dVar) {
        a h10 = h(e10);
        if (h10 == null) {
            if (bo.c.c() == null) {
                return null;
            }
            return wn.v.f59242a;
        }
        throw h10.a();
    }

    @Override // wo.b0
    public boolean x(Throwable th2) {
        Object obj;
        int i10;
        do {
            obj = this._state;
            i10 = 0;
            if (obj instanceof a) {
                return false;
            }
            if (!(obj instanceof c)) {
                throw new IllegalStateException(jo.p.o("Invalid state ", obj).toString());
            }
        } while (!r23.a(f59285x, this, obj, th2 == null ? A : new a(th2)));
        d<E>[] dVarArr = ((c) obj).f59290b;
        if (dVarArr != null) {
            int length = dVarArr.length;
            while (i10 < length) {
                d<E> dVar = dVarArr[i10];
                i10++;
                dVar.x(th2);
            }
        }
        f(th2);
        return true;
    }

    public q(E e10) {
        this();
        f59285x.lazySet(this, new c(e10, null));
    }
}
