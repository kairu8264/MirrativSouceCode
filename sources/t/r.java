package t;

import kotlin.NoWhenBranchMatchedException;
import l0.c2;
import q1.q0;
import u.u0;
import u.z0;

/* loaded from: classes.dex */
public final class r extends v {
    public final c2<x0.a> A;
    public x0.a B;
    public final io.l<z0.b<l>, u.c0<m2.o>> C;

    /* renamed from: w  reason: collision with root package name */
    public final z0<l>.a<m2.o, u.n> f52983w;

    /* renamed from: x  reason: collision with root package name */
    public final z0<l>.a<m2.k, u.n> f52984x;

    /* renamed from: y  reason: collision with root package name */
    public final c2<i> f52985y;

    /* renamed from: z  reason: collision with root package name */
    public final c2<i> f52986z;

    /* loaded from: classes.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f52987a;

        static {
            int[] iArr = new int[l.values().length];
            iArr[l.Visible.ordinal()] = 1;
            iArr[l.PreEnter.ordinal()] = 2;
            iArr[l.PostExit.ordinal()] = 3;
            f52987a = iArr;
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends jo.q implements io.l<q0.a, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ q0 f52988w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ long f52989x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ long f52990y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(q0 q0Var, long j10, long j11) {
            super(1);
            this.f52988w = q0Var;
            this.f52989x = j10;
            this.f52990y = j11;
        }

        public final void a(q0.a aVar) {
            jo.p.h(aVar, "$this$layout");
            q0.a.j(aVar, this.f52988w, m2.k.j(this.f52989x) + m2.k.j(this.f52990y), m2.k.k(this.f52989x) + m2.k.k(this.f52990y), 0.0f, 4, null);
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(q0.a aVar) {
            a(aVar);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends jo.q implements io.l<l, m2.o> {

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ long f52992x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(long j10) {
            super(1);
            this.f52992x = j10;
        }

        public final long a(l lVar) {
            jo.p.h(lVar, "it");
            return r.this.i(lVar, this.f52992x);
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ m2.o invoke(l lVar) {
            return m2.o.b(a(lVar));
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends jo.q implements io.l<z0.b<l>, u.c0<m2.k>> {

        /* renamed from: w  reason: collision with root package name */
        public static final d f52993w = new d();

        public d() {
            super(1);
        }

        @Override // io.l
        /* renamed from: a */
        public final u.c0<m2.k> invoke(z0.b<l> bVar) {
            u0 u0Var;
            jo.p.h(bVar, "$this$animate");
            u0Var = m.f52953d;
            return u0Var;
        }
    }

    /* loaded from: classes.dex */
    public static final class e extends jo.q implements io.l<l, m2.k> {

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ long f52995x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(long j10) {
            super(1);
            this.f52995x = j10;
        }

        public final long a(l lVar) {
            jo.p.h(lVar, "it");
            return r.this.j(lVar, this.f52995x);
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ m2.k invoke(l lVar) {
            return m2.k.b(a(lVar));
        }
    }

    /* loaded from: classes.dex */
    public static final class f extends jo.q implements io.l<z0.b<l>, u.c0<m2.o>> {
        public f() {
            super(1);
        }

        @Override // io.l
        /* renamed from: a */
        public final u.c0<m2.o> invoke(z0.b<l> bVar) {
            u0 u0Var;
            jo.p.h(bVar, "$this$null");
            l lVar = l.PreEnter;
            l lVar2 = l.Visible;
            u.c0<m2.o> c0Var = null;
            if (bVar.c(lVar, lVar2)) {
                i value = r.this.c().getValue();
                if (value != null) {
                    c0Var = value.b();
                }
            } else if (!bVar.c(lVar2, l.PostExit)) {
                c0Var = m.f52954e;
            } else {
                i value2 = r.this.f().getValue();
                if (value2 != null) {
                    c0Var = value2.b();
                }
            }
            if (c0Var == null) {
                u0Var = m.f52954e;
                return u0Var;
            }
            return c0Var;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public r(z0<l>.a<m2.o, u.n> aVar, z0<l>.a<m2.k, u.n> aVar2, c2<i> c2Var, c2<i> c2Var2, c2<? extends x0.a> c2Var3) {
        jo.p.h(aVar, "sizeAnimation");
        jo.p.h(aVar2, "offsetAnimation");
        jo.p.h(c2Var, "expand");
        jo.p.h(c2Var2, "shrink");
        jo.p.h(c2Var3, "alignment");
        this.f52983w = aVar;
        this.f52984x = aVar2;
        this.f52985y = c2Var;
        this.f52986z = c2Var2;
        this.A = c2Var3;
        this.C = new f();
    }

    public final c2<x0.a> a() {
        return this.A;
    }

    public final x0.a b() {
        return this.B;
    }

    public final c2<i> c() {
        return this.f52985y;
    }

    public final c2<i> f() {
        return this.f52986z;
    }

    public final void g(x0.a aVar) {
        this.B = aVar;
    }

    public final long i(l lVar, long j10) {
        jo.p.h(lVar, "targetState");
        i value = this.f52985y.getValue();
        long j11 = value == null ? j10 : value.d().invoke(m2.o.b(j10)).j();
        i value2 = this.f52986z.getValue();
        long j12 = value2 == null ? j10 : value2.d().invoke(m2.o.b(j10)).j();
        int i10 = a.f52987a[lVar.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 == 3) {
                    return j12;
                }
                throw new NoWhenBranchMatchedException();
            }
            return j11;
        }
        return j10;
    }

    public final long j(l lVar, long j10) {
        m2.k b10;
        jo.p.h(lVar, "targetState");
        if (this.B != null && this.A.getValue() != null && !jo.p.c(this.B, this.A.getValue())) {
            int i10 = a.f52987a[lVar.ordinal()];
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 == 3) {
                        i value = this.f52986z.getValue();
                        if (value == null) {
                            b10 = null;
                        } else {
                            long j11 = value.d().invoke(m2.o.b(j10)).j();
                            x0.a value2 = a().getValue();
                            jo.p.e(value2);
                            x0.a aVar = value2;
                            m2.q qVar = m2.q.Ltr;
                            long a10 = aVar.a(j10, j11, qVar);
                            x0.a b11 = b();
                            jo.p.e(b11);
                            long a11 = b11.a(j10, j11, qVar);
                            b10 = m2.k.b(m2.l.a(m2.k.j(a10) - m2.k.j(a11), m2.k.k(a10) - m2.k.k(a11)));
                        }
                        if (b10 == null) {
                            return m2.k.f40528b.a();
                        }
                        return b10.n();
                    }
                    throw new NoWhenBranchMatchedException();
                }
                return m2.k.f40528b.a();
            }
            return m2.k.f40528b.a();
        }
        return m2.k.f40528b.a();
    }

    @Override // q1.x
    public q1.d0 q(q1.e0 e0Var, q1.b0 b0Var, long j10) {
        long n10;
        q1.d0 O0;
        jo.p.h(e0Var, "$receiver");
        jo.p.h(b0Var, "measurable");
        q0 M = b0Var.M(j10);
        long a10 = m2.p.a(M.r0(), M.f0());
        long j11 = this.f52983w.a(this.C, new c(a10)).getValue().j();
        long n11 = this.f52984x.a(d.f52993w, new e(a10)).getValue().n();
        x0.a aVar = this.B;
        m2.k b10 = aVar == null ? null : m2.k.b(aVar.a(a10, j11, m2.q.Ltr));
        if (b10 == null) {
            n10 = m2.k.f40528b.a();
        } else {
            n10 = b10.n();
        }
        O0 = q1.e0.O0(e0Var, m2.o.g(j11), m2.o.f(j11), null, new b(M, n10, n11), 4, null);
        return O0;
    }
}
