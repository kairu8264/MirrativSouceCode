package t;

import kotlin.NoWhenBranchMatchedException;
import l0.c2;
import q1.q0;
import u.u0;
import u.z0;

/* loaded from: classes.dex */
public final class a0 extends v {

    /* renamed from: w  reason: collision with root package name */
    public final z0<l>.a<m2.k, u.n> f52839w;

    /* renamed from: x  reason: collision with root package name */
    public final c2<z> f52840x;

    /* renamed from: y  reason: collision with root package name */
    public final c2<z> f52841y;

    /* renamed from: z  reason: collision with root package name */
    public final io.l<z0.b<l>, u.c0<m2.k>> f52842z;

    /* loaded from: classes.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f52843a;

        static {
            int[] iArr = new int[l.values().length];
            iArr[l.Visible.ordinal()] = 1;
            iArr[l.PreEnter.ordinal()] = 2;
            iArr[l.PostExit.ordinal()] = 3;
            f52843a = iArr;
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends jo.q implements io.l<q0.a, wn.v> {

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ q0 f52845x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ long f52846y;

        /* loaded from: classes.dex */
        public static final class a extends jo.q implements io.l<l, m2.k> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ a0 f52847w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ long f52848x;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(a0 a0Var, long j10) {
                super(1);
                this.f52847w = a0Var;
                this.f52848x = j10;
            }

            public final long a(l lVar) {
                jo.p.h(lVar, "it");
                return this.f52847w.g(lVar, this.f52848x);
            }

            @Override // io.l
            public /* bridge */ /* synthetic */ m2.k invoke(l lVar) {
                return m2.k.b(a(lVar));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(q0 q0Var, long j10) {
            super(1);
            this.f52845x = q0Var;
            this.f52846y = j10;
        }

        public final void a(q0.a aVar) {
            jo.p.h(aVar, "$this$layout");
            q0.a.x(aVar, this.f52845x, a0.this.a().a(a0.this.f(), new a(a0.this, this.f52846y)).getValue().n(), 0.0f, null, 6, null);
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(q0.a aVar) {
            a(aVar);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends jo.q implements io.l<z0.b<l>, u.c0<m2.k>> {
        public c() {
            super(1);
        }

        @Override // io.l
        /* renamed from: a */
        public final u.c0<m2.k> invoke(z0.b<l> bVar) {
            u0 u0Var;
            u.c0<m2.k> a10;
            u0 u0Var2;
            u0 u0Var3;
            jo.p.h(bVar, "$this$null");
            l lVar = l.PreEnter;
            l lVar2 = l.Visible;
            if (bVar.c(lVar, lVar2)) {
                z value = a0.this.b().getValue();
                a10 = value != null ? value.a() : null;
                if (a10 == null) {
                    u0Var3 = m.f52953d;
                    return u0Var3;
                }
                return a10;
            } else if (!bVar.c(lVar2, l.PostExit)) {
                u0Var = m.f52953d;
                return u0Var;
            } else {
                z value2 = a0.this.c().getValue();
                a10 = value2 != null ? value2.a() : null;
                if (a10 == null) {
                    u0Var2 = m.f52953d;
                    return u0Var2;
                }
                return a10;
            }
        }
    }

    public a0(z0<l>.a<m2.k, u.n> aVar, c2<z> c2Var, c2<z> c2Var2) {
        jo.p.h(aVar, "lazyAnimation");
        jo.p.h(c2Var, "slideIn");
        jo.p.h(c2Var2, "slideOut");
        this.f52839w = aVar;
        this.f52840x = c2Var;
        this.f52841y = c2Var2;
        this.f52842z = new c();
    }

    public final z0<l>.a<m2.k, u.n> a() {
        return this.f52839w;
    }

    public final c2<z> b() {
        return this.f52840x;
    }

    public final c2<z> c() {
        return this.f52841y;
    }

    public final io.l<z0.b<l>, u.c0<m2.k>> f() {
        return this.f52842z;
    }

    public final long g(l lVar, long j10) {
        io.l<m2.o, m2.k> b10;
        io.l<m2.o, m2.k> b11;
        jo.p.h(lVar, "targetState");
        z value = this.f52840x.getValue();
        m2.k kVar = null;
        m2.k invoke = (value == null || (b10 = value.b()) == null) ? null : b10.invoke(m2.o.b(j10));
        long a10 = invoke == null ? m2.k.f40528b.a() : invoke.n();
        z value2 = this.f52841y.getValue();
        if (value2 != null && (b11 = value2.b()) != null) {
            kVar = b11.invoke(m2.o.b(j10));
        }
        long a11 = kVar == null ? m2.k.f40528b.a() : kVar.n();
        int i10 = a.f52843a[lVar.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 == 3) {
                    return a11;
                }
                throw new NoWhenBranchMatchedException();
            }
            return a10;
        }
        return m2.k.f40528b.a();
    }

    @Override // q1.x
    public q1.d0 q(q1.e0 e0Var, q1.b0 b0Var, long j10) {
        q1.d0 O0;
        jo.p.h(e0Var, "$receiver");
        jo.p.h(b0Var, "measurable");
        q0 M = b0Var.M(j10);
        O0 = q1.e0.O0(e0Var, M.r0(), M.f0(), null, new b(M, m2.p.a(M.r0(), M.f0())), 4, null);
        return O0;
    }
}
