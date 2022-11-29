package z5;

import io.l;
import io.p;
import jo.q;
import q1.b0;
import q1.d0;
import q1.e0;
import q1.m;
import q1.q0;
import q1.x;
import wn.v;
import x0.f;
import xo.i0;
import xo.s;

/* loaded from: classes.dex */
public final class d implements k6.i, x {

    /* renamed from: w  reason: collision with root package name */
    public final s<m2.b> f62552w = i0.a(m2.b.b(j.c()));

    /* loaded from: classes.dex */
    public static final class a extends q implements l<q0.a, v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ q0 f62553w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(q0 q0Var) {
            super(1);
            this.f62553w = q0Var;
        }

        public final void a(q0.a aVar) {
            q0.a.j(aVar, this.f62553w, 0, 0, 0.0f, 4, null);
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ v invoke(q0.a aVar) {
            a(aVar);
            return v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements xo.c<k6.h> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ xo.c f62554w;

        /* loaded from: classes.dex */
        public static final class a<T> implements xo.d {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ xo.d f62555w;

            @co.f(c = "coil.compose.ConstraintsSizeResolver$size$$inlined$mapNotNull$1$2", f = "AsyncImage.kt", l = {225}, m = "emit")
            /* renamed from: z5.d$b$a$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C1081a extends co.d {

                /* renamed from: w  reason: collision with root package name */
                public /* synthetic */ Object f62556w;

                /* renamed from: x  reason: collision with root package name */
                public int f62557x;

                public C1081a(ao.d dVar) {
                    super(dVar);
                }

                @Override // co.a
                public final Object invokeSuspend(Object obj) {
                    this.f62556w = obj;
                    this.f62557x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(xo.d dVar) {
                this.f62555w = dVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
            /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
            @Override // xo.d
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object emit(java.lang.Object r7, ao.d r8) {
                /*
                    r6 = this;
                    boolean r0 = r8 instanceof z5.d.b.a.C1081a
                    if (r0 == 0) goto L13
                    r0 = r8
                    z5.d$b$a$a r0 = (z5.d.b.a.C1081a) r0
                    int r1 = r0.f62557x
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f62557x = r1
                    goto L18
                L13:
                    z5.d$b$a$a r0 = new z5.d$b$a$a
                    r0.<init>(r8)
                L18:
                    java.lang.Object r8 = r0.f62556w
                    java.lang.Object r1 = bo.c.c()
                    int r2 = r0.f62557x
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    wn.m.b(r8)
                    goto L4c
                L29:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r8)
                    throw r7
                L31:
                    wn.m.b(r8)
                    xo.d r8 = r6.f62555w
                    m2.b r7 = (m2.b) r7
                    long r4 = r7.t()
                    k6.h r7 = z5.a.d(r4)
                    if (r7 != 0) goto L43
                    goto L4c
                L43:
                    r0.f62557x = r3
                    java.lang.Object r7 = r8.emit(r7, r0)
                    if (r7 != r1) goto L4c
                    return r1
                L4c:
                    wn.v r7 = wn.v.f59242a
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: z5.d.b.a.emit(java.lang.Object, ao.d):java.lang.Object");
            }
        }

        public b(xo.c cVar) {
            this.f62554w = cVar;
        }

        @Override // xo.c
        public Object a(xo.d<? super k6.h> dVar, ao.d dVar2) {
            Object a10 = this.f62554w.a(new a(dVar), dVar2);
            return a10 == bo.c.c() ? a10 : v.f59242a;
        }
    }

    @Override // x0.f
    public x0.f L(x0.f fVar) {
        return x.a.h(this, fVar);
    }

    @Override // k6.i
    public Object b(ao.d<? super k6.h> dVar) {
        return xo.e.o(new b(this.f62552w), dVar);
    }

    @Override // q1.x
    public int d(m mVar, q1.l lVar, int i10) {
        return x.a.e(this, mVar, lVar, i10);
    }

    @Override // x0.f.b, x0.f
    public boolean e(l<? super f.b, Boolean> lVar) {
        return x.a.a(this, lVar);
    }

    @Override // q1.x
    public int h(m mVar, q1.l lVar, int i10) {
        return x.a.f(this, mVar, lVar, i10);
    }

    @Override // x0.f.b, x0.f
    public <R> R k(R r10, p<? super R, ? super f.b, ? extends R> pVar) {
        return (R) x.a.b(this, r10, pVar);
    }

    @Override // x0.f.b, x0.f
    public <R> R o(R r10, p<? super f.b, ? super R, ? extends R> pVar) {
        return (R) x.a.c(this, r10, pVar);
    }

    @Override // q1.x
    public d0 q(e0 e0Var, b0 b0Var, long j10) {
        d0 O0;
        this.f62552w.setValue(m2.b.b(j10));
        q0 M = b0Var.M(j10);
        O0 = e0.O0(e0Var, M.r0(), M.f0(), null, new a(M), 4, null);
        return O0;
    }

    @Override // q1.x
    public int u(m mVar, q1.l lVar, int i10) {
        return x.a.d(this, mVar, lVar, i10);
    }

    @Override // q1.x
    public int w(m mVar, q1.l lVar, int i10) {
        return x.a.g(this, mVar, lVar, i10);
    }
}
