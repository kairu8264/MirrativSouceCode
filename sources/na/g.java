package na;

import a0.b;
import a0.c0;
import a0.e0;
import a0.f0;
import a0.o;
import a0.y;
import androidx.compose.ui.platform.g2;
import androidx.compose.ui.platform.o0;
import co.l;
import io.p;
import io.r;
import java.util.List;
import jo.q;
import l0.c2;
import l0.h2;
import l0.l1;
import l0.n1;
import l0.u1;
import q1.w;
import s1.a;
import uo.q0;
import wn.m;
import wn.v;
import x0.a;
import x0.f;
import xn.a0;
import y.a1;
import y.d1;
import y.f;
import y.g1;
import y.r0;
import y.t0;
import y.y0;

/* loaded from: classes.dex */
public final class g {

    @co.f(c = "com.dena.mirrativ.livegame.listing.LiveGameListingViewKt$LiveGameListingView$1", f = "LiveGameListingView.kt", l = {61}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class a extends l implements p<q0, ao.d<? super v>, Object> {
        public final /* synthetic */ int A;
        public final /* synthetic */ io.a<v> B;

        /* renamed from: w  reason: collision with root package name */
        public int f41679w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ e0 f41680x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ List<na.d> f41681y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ int f41682z;

        /* renamed from: na.g$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0622a extends q implements io.a<Integer> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ e0 f41683w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0622a(e0 e0Var) {
                super(0);
                this.f41683w = e0Var;
            }

            @Override // io.a
            /* renamed from: a */
            public final Integer invoke() {
                return Integer.valueOf(this.f41683w.m());
            }
        }

        /* loaded from: classes.dex */
        public static final class b implements xo.d<Boolean> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ io.a<v> f41684w;

            public b(io.a<v> aVar) {
                this.f41684w = aVar;
            }

            public final Object a(boolean z10, ao.d<? super v> dVar) {
                this.f41684w.invoke();
                return v.f59242a;
            }

            @Override // xo.d
            public /* bridge */ /* synthetic */ Object emit(Boolean bool, ao.d dVar) {
                return a(bool.booleanValue(), dVar);
            }
        }

        /* loaded from: classes.dex */
        public static final class c implements xo.c<Boolean> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ xo.c f41685w;

            /* renamed from: na.g$a$c$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C0623a<T> implements xo.d {

                /* renamed from: w  reason: collision with root package name */
                public final /* synthetic */ xo.d f41686w;

                @co.f(c = "com.dena.mirrativ.livegame.listing.LiveGameListingViewKt$LiveGameListingView$1$invokeSuspend$$inlined$filter$1$2", f = "LiveGameListingView.kt", l = {224}, m = "emit")
                /* renamed from: na.g$a$c$a$a  reason: collision with other inner class name */
                /* loaded from: classes.dex */
                public static final class C0624a extends co.d {

                    /* renamed from: w  reason: collision with root package name */
                    public /* synthetic */ Object f41687w;

                    /* renamed from: x  reason: collision with root package name */
                    public int f41688x;

                    public C0624a(ao.d dVar) {
                        super(dVar);
                    }

                    @Override // co.a
                    public final Object invokeSuspend(Object obj) {
                        this.f41687w = obj;
                        this.f41688x |= Integer.MIN_VALUE;
                        return C0623a.this.emit(null, this);
                    }
                }

                public C0623a(xo.d dVar) {
                    this.f41686w = dVar;
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
                @Override // xo.d
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object emit(java.lang.Object r5, ao.d r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof na.g.a.c.C0623a.C0624a
                        if (r0 == 0) goto L13
                        r0 = r6
                        na.g$a$c$a$a r0 = (na.g.a.c.C0623a.C0624a) r0
                        int r1 = r0.f41688x
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f41688x = r1
                        goto L18
                    L13:
                        na.g$a$c$a$a r0 = new na.g$a$c$a$a
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.f41687w
                        java.lang.Object r1 = bo.c.c()
                        int r2 = r0.f41688x
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        wn.m.b(r6)
                        goto L48
                    L29:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L31:
                        wn.m.b(r6)
                        xo.d r6 = r4.f41686w
                        r2 = r5
                        java.lang.Boolean r2 = (java.lang.Boolean) r2
                        boolean r2 = r2.booleanValue()
                        if (r2 == 0) goto L48
                        r0.f41688x = r3
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L48
                        return r1
                    L48:
                        wn.v r5 = wn.v.f59242a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: na.g.a.c.C0623a.emit(java.lang.Object, ao.d):java.lang.Object");
                }
            }

            public c(xo.c cVar) {
                this.f41685w = cVar;
            }

            @Override // xo.c
            public Object a(xo.d<? super Boolean> dVar, ao.d dVar2) {
                Object a10 = this.f41685w.a(new C0623a(dVar), dVar2);
                return a10 == bo.c.c() ? a10 : v.f59242a;
            }
        }

        /* loaded from: classes.dex */
        public static final class d implements xo.c<Boolean> {
            public final /* synthetic */ int A;

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ xo.c f41690w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ e0 f41691x;

            /* renamed from: y  reason: collision with root package name */
            public final /* synthetic */ List f41692y;

            /* renamed from: z  reason: collision with root package name */
            public final /* synthetic */ int f41693z;

            /* renamed from: na.g$a$d$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C0625a<T> implements xo.d {
                public final /* synthetic */ int A;

                /* renamed from: w  reason: collision with root package name */
                public final /* synthetic */ xo.d f41694w;

                /* renamed from: x  reason: collision with root package name */
                public final /* synthetic */ e0 f41695x;

                /* renamed from: y  reason: collision with root package name */
                public final /* synthetic */ List f41696y;

                /* renamed from: z  reason: collision with root package name */
                public final /* synthetic */ int f41697z;

                @co.f(c = "com.dena.mirrativ.livegame.listing.LiveGameListingViewKt$LiveGameListingView$1$invokeSuspend$$inlined$map$1$2", f = "LiveGameListingView.kt", l = {224}, m = "emit")
                /* renamed from: na.g$a$d$a$a  reason: collision with other inner class name */
                /* loaded from: classes.dex */
                public static final class C0626a extends co.d {

                    /* renamed from: w  reason: collision with root package name */
                    public /* synthetic */ Object f41698w;

                    /* renamed from: x  reason: collision with root package name */
                    public int f41699x;

                    public C0626a(ao.d dVar) {
                        super(dVar);
                    }

                    @Override // co.a
                    public final Object invokeSuspend(Object obj) {
                        this.f41698w = obj;
                        this.f41699x |= Integer.MIN_VALUE;
                        return C0625a.this.emit(null, this);
                    }
                }

                public C0625a(xo.d dVar, e0 e0Var, List list, int i10, int i11) {
                    this.f41694w = dVar;
                    this.f41695x = e0Var;
                    this.f41696y = list;
                    this.f41697z = i10;
                    this.A = i11;
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
                @Override // xo.d
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object emit(java.lang.Object r6, ao.d r7) {
                    /*
                        r5 = this;
                        boolean r0 = r7 instanceof na.g.a.d.C0625a.C0626a
                        if (r0 == 0) goto L13
                        r0 = r7
                        na.g$a$d$a$a r0 = (na.g.a.d.C0625a.C0626a) r0
                        int r1 = r0.f41699x
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f41699x = r1
                        goto L18
                    L13:
                        na.g$a$d$a$a r0 = new na.g$a$d$a$a
                        r0.<init>(r7)
                    L18:
                        java.lang.Object r7 = r0.f41698w
                        java.lang.Object r1 = bo.c.c()
                        int r2 = r0.f41699x
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        wn.m.b(r7)
                        goto L6e
                    L29:
                        java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                        java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                        r6.<init>(r7)
                        throw r6
                    L31:
                        wn.m.b(r7)
                        xo.d r7 = r5.f41694w
                        java.lang.Number r6 = (java.lang.Number) r6
                        r6.intValue()
                        a0.e0 r6 = r5.f41695x
                        int r6 = r6.m()
                        a0.e0 r2 = r5.f41695x
                        a0.t r2 = r2.p()
                        java.util.List r2 = r2.b()
                        int r2 = r2.size()
                        int r6 = r6 + r2
                        java.util.List r2 = r5.f41696y
                        int r2 = r2.size()
                        int r4 = r5.f41697z
                        int r2 = r2 - r4
                        int r4 = r5.A
                        int r2 = r2 / r4
                        if (r6 <= r2) goto L60
                        r6 = r3
                        goto L61
                    L60:
                        r6 = 0
                    L61:
                        java.lang.Boolean r6 = co.b.a(r6)
                        r0.f41699x = r3
                        java.lang.Object r6 = r7.emit(r6, r0)
                        if (r6 != r1) goto L6e
                        return r1
                    L6e:
                        wn.v r6 = wn.v.f59242a
                        return r6
                    */
                    throw new UnsupportedOperationException("Method not decompiled: na.g.a.d.C0625a.emit(java.lang.Object, ao.d):java.lang.Object");
                }
            }

            public d(xo.c cVar, e0 e0Var, List list, int i10, int i11) {
                this.f41690w = cVar;
                this.f41691x = e0Var;
                this.f41692y = list;
                this.f41693z = i10;
                this.A = i11;
            }

            @Override // xo.c
            public Object a(xo.d<? super Boolean> dVar, ao.d dVar2) {
                Object a10 = this.f41690w.a(new C0625a(dVar, this.f41691x, this.f41692y, this.f41693z, this.A), dVar2);
                return a10 == bo.c.c() ? a10 : v.f59242a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(e0 e0Var, List<na.d> list, int i10, int i11, io.a<v> aVar, ao.d<? super a> dVar) {
            super(2, dVar);
            this.f41680x = e0Var;
            this.f41681y = list;
            this.f41682z = i10;
            this.A = i11;
            this.B = aVar;
        }

        @Override // co.a
        public final ao.d<v> create(Object obj, ao.d<?> dVar) {
            return new a(this.f41680x, this.f41681y, this.f41682z, this.A, this.B, dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super v> dVar) {
            return ((a) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f41679w;
            if (i10 == 0) {
                m.b(obj);
                c cVar = new c(new d(u1.m(new C0622a(this.f41680x)), this.f41680x, this.f41681y, this.f41682z, this.A));
                b bVar = new b(this.B);
                this.f41679w = 1;
                if (cVar.a(bVar, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                m.b(obj);
            }
            return v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends q implements io.l<y, v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ List<Object> f41701w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ io.l<d, v> f41702x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.l<d, v> f41703y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ int f41704z;

        /* loaded from: classes.dex */
        public static final class a extends q implements p<a0.q, Integer, a0.c> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ List<Object> f41705w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(List<? extends Object> list) {
                super(2);
                this.f41705w = list;
            }

            public final long a(a0.q qVar, int i10) {
                jo.p.h(qVar, "$this$items");
                Object obj = this.f41705w.get(i10);
                if (obj instanceof na.c) {
                    return c0.a(2);
                }
                if (obj instanceof d) {
                    return c0.a(1);
                }
                throw new IllegalStateException("存在しないclassです");
            }

            @Override // io.p
            public /* bridge */ /* synthetic */ a0.c invoke(a0.q qVar, Integer num) {
                return a0.c.a(a(qVar, num.intValue()));
            }
        }

        /* renamed from: na.g$b$b  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0627b extends q implements r<o, Integer, l0.i, Integer, v> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ List<Object> f41706w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ io.l<d, v> f41707x;

            /* renamed from: y  reason: collision with root package name */
            public final /* synthetic */ io.l<d, v> f41708y;

            /* renamed from: z  reason: collision with root package name */
            public final /* synthetic */ int f41709z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0627b(List<? extends Object> list, io.l<? super d, v> lVar, io.l<? super d, v> lVar2, int i10) {
                super(4);
                this.f41706w = list;
                this.f41707x = lVar;
                this.f41708y = lVar2;
                this.f41709z = i10;
            }

            @Override // io.r
            public /* bridge */ /* synthetic */ v F(o oVar, Integer num, l0.i iVar, Integer num2) {
                a(oVar, num.intValue(), iVar, num2.intValue());
                return v.f59242a;
            }

            public final void a(o oVar, int i10, l0.i iVar, int i11) {
                int i12;
                jo.p.h(oVar, "$this$items");
                if ((i11 & 112) == 0) {
                    i12 = i11 | (iVar.d(i10) ? 32 : 16);
                } else {
                    i12 = i11;
                }
                if ((i12 & 721) == 144 && iVar.j()) {
                    iVar.I();
                    return;
                }
                Object obj = this.f41706w.get(i10);
                if (obj instanceof na.c) {
                    iVar.x(-1915883662);
                    iVar.x(-483455358);
                    f.a aVar = x0.f.f59359u;
                    y.f fVar = y.f.f60773a;
                    f.l g10 = fVar.g();
                    a.C0986a c0986a = x0.a.f59327a;
                    q1.c0 a10 = y.p.a(g10, c0986a.k(), iVar, 0);
                    iVar.x(-1323940314);
                    m2.d dVar = (m2.d) iVar.G(o0.e());
                    m2.q qVar = (m2.q) iVar.G(o0.j());
                    g2 g2Var = (g2) iVar.G(o0.n());
                    a.C0787a c0787a = s1.a.f51802o;
                    io.a<s1.a> a11 = c0787a.a();
                    io.q<n1<s1.a>, l0.i, Integer, v> a12 = w.a(aVar);
                    if (!(iVar.k() instanceof l0.e)) {
                        l0.h.c();
                    }
                    iVar.D();
                    if (iVar.f()) {
                        iVar.r(a11);
                    } else {
                        iVar.o();
                    }
                    iVar.E();
                    l0.i a13 = h2.a(iVar);
                    h2.b(a13, a10, c0787a.d());
                    h2.b(a13, dVar, c0787a.b());
                    h2.b(a13, qVar, c0787a.c());
                    h2.b(a13, g2Var, c0787a.f());
                    iVar.c();
                    a12.s0(n1.a(n1.b(iVar)), iVar, 0);
                    iVar.x(2058660585);
                    iVar.x(-1163856341);
                    y.r rVar = y.r.f60913a;
                    x0.f b10 = y.g.b(d1.n(aVar, 0.0f, 1, null), 4.3974357f, false, 2, null);
                    x0.a f10 = c0986a.f();
                    iVar.x(733328855);
                    q1.c0 h10 = y.j.h(f10, false, iVar, 6);
                    iVar.x(-1323940314);
                    m2.d dVar2 = (m2.d) iVar.G(o0.e());
                    m2.q qVar2 = (m2.q) iVar.G(o0.j());
                    g2 g2Var2 = (g2) iVar.G(o0.n());
                    io.a<s1.a> a14 = c0787a.a();
                    io.q<n1<s1.a>, l0.i, Integer, v> a15 = w.a(b10);
                    if (!(iVar.k() instanceof l0.e)) {
                        l0.h.c();
                    }
                    iVar.D();
                    if (iVar.f()) {
                        iVar.r(a14);
                    } else {
                        iVar.o();
                    }
                    iVar.E();
                    l0.i a16 = h2.a(iVar);
                    h2.b(a16, h10, c0787a.d());
                    h2.b(a16, dVar2, c0787a.b());
                    h2.b(a16, qVar2, c0787a.c());
                    h2.b(a16, g2Var2, c0787a.f());
                    iVar.c();
                    a15.s0(n1.a(n1.b(iVar)), iVar, 0);
                    iVar.x(2058660585);
                    iVar.x(-2137368960);
                    y.l lVar = y.l.f60836a;
                    na.c cVar = (na.c) obj;
                    l9.d.c(cVar.b(), z0.d.a(d1.l(aVar, 0.0f, 1, null), e0.g.c(m2.g.l(4))), null, 0, null, null, iVar, 0, 60);
                    iVar.x(693286680);
                    q1.c0 a17 = y0.a(fVar.f(), c0986a.l(), iVar, 0);
                    iVar.x(-1323940314);
                    m2.d dVar3 = (m2.d) iVar.G(o0.e());
                    m2.q qVar3 = (m2.q) iVar.G(o0.j());
                    g2 g2Var3 = (g2) iVar.G(o0.n());
                    io.a<s1.a> a18 = c0787a.a();
                    io.q<n1<s1.a>, l0.i, Integer, v> a19 = w.a(aVar);
                    if (!(iVar.k() instanceof l0.e)) {
                        l0.h.c();
                    }
                    iVar.D();
                    if (iVar.f()) {
                        iVar.r(a18);
                    } else {
                        iVar.o();
                    }
                    iVar.E();
                    l0.i a20 = h2.a(iVar);
                    h2.b(a20, a17, c0787a.d());
                    h2.b(a20, dVar3, c0787a.b());
                    h2.b(a20, qVar3, c0787a.c());
                    h2.b(a20, g2Var3, c0787a.f());
                    iVar.c();
                    a19.s0(n1.a(n1.b(iVar)), iVar, 0);
                    iVar.x(2058660585);
                    iVar.x(-678309503);
                    a1 a1Var = a1.f60672a;
                    j.a(cVar.a(), iVar, 0);
                    g1.a(d1.y(aVar, m2.g.l(12)), iVar, 6);
                    iVar.O();
                    iVar.O();
                    iVar.s();
                    iVar.O();
                    iVar.O();
                    iVar.O();
                    iVar.O();
                    iVar.s();
                    iVar.O();
                    iVar.O();
                    v.w.a(v1.e.c(ja.k.mission_description, iVar, 0), null, y.g.b(d1.n(r0.m(aVar, 0.0f, m2.g.l(10), 0.0f, m2.g.l(2), 5, null), 0.0f, 1, null), 17.326086f, false, 2, null), null, null, 0.0f, null, iVar, 440, 120);
                    iVar.O();
                    iVar.O();
                    iVar.s();
                    iVar.O();
                    iVar.O();
                    iVar.O();
                } else if (!(obj instanceof d)) {
                    iVar.x(-1915882082);
                    iVar.O();
                } else {
                    iVar.x(-1915882157);
                    io.l<d, v> lVar2 = this.f41707x;
                    io.l<d, v> lVar3 = this.f41708y;
                    int i13 = this.f41709z;
                    e.a((d) obj, lVar2, lVar3, iVar, ((i13 >> 3) & 896) | ((i13 >> 3) & 112));
                    iVar.O();
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(List<? extends Object> list, io.l<? super d, v> lVar, io.l<? super d, v> lVar2, int i10) {
            super(1);
            this.f41701w = list;
            this.f41702x = lVar;
            this.f41703y = lVar2;
            this.f41704z = i10;
        }

        public final void a(y yVar) {
            jo.p.h(yVar, "$this$LazyVerticalGrid");
            y.b(yVar, this.f41701w.size(), null, new a(this.f41701w), null, s0.c.c(1736648671, true, new C0627b(this.f41701w, this.f41702x, this.f41703y, this.f41704z)), 10, null);
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ v invoke(y yVar) {
            a(yVar);
            return v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends q implements p<l0.i, Integer, v> {
        public final /* synthetic */ io.a<v> A;
        public final /* synthetic */ int B;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ c2<na.c> f41710w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ List<d> f41711x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.l<d, v> f41712y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ io.l<d, v> f41713z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(c2<na.c> c2Var, List<d> list, io.l<? super d, v> lVar, io.l<? super d, v> lVar2, io.a<v> aVar, int i10) {
            super(2);
            this.f41710w = c2Var;
            this.f41711x = list;
            this.f41712y = lVar;
            this.f41713z = lVar2;
            this.A = aVar;
            this.B = i10;
        }

        public final void a(l0.i iVar, int i10) {
            g.a(this.f41710w, this.f41711x, this.f41712y, this.f41713z, this.A, iVar, this.B | 1);
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ v invoke(l0.i iVar, Integer num) {
            a(iVar, num.intValue());
            return v.f59242a;
        }
    }

    public static final void a(c2<na.c> c2Var, List<d> list, io.l<? super d, v> lVar, io.l<? super d, v> lVar2, io.a<v> aVar, l0.i iVar, int i10) {
        List<d> list2;
        jo.p.h(c2Var, "liveGameListingBindModel");
        jo.p.h(list, "gameListingItemBindModels");
        jo.p.h(lVar, "onClickImage");
        jo.p.h(lVar2, "onClickPlay");
        jo.p.h(aVar, "onNext");
        l0.i h10 = iVar.h(-1480499020);
        e0 a10 = f0.a(0, 0, h10, 0, 3);
        l0.c0.c(a10, new a(a10, list, 2, 2, aVar, null), h10, 64);
        na.c value = c2Var.getValue();
        if (value == null || (list2 = a0.o0(xn.r.d(value), list)) == null) {
            list2 = list;
        }
        b.C0000b c0000b = new b.C0000b(2);
        float f10 = 16;
        t0 d10 = r0.d(m2.g.l(f10), m2.g.l(f10), m2.g.l(f10), m2.g.l(f10));
        y.f fVar = y.f.f60773a;
        a0.g.a(c0000b, d1.j(x0.f.f59359u, 0.0f, 1, null), a10, d10, false, fVar.n(m2.g.l(12)), fVar.n(m2.g.l(8)), null, false, new b(list2, lVar, lVar2, i10), h10, 1769520, 400);
        l1 l10 = h10.l();
        if (l10 == null) {
            return;
        }
        l10.a(new c(c2Var, list, lVar, lVar2, aVar, i10));
    }
}
