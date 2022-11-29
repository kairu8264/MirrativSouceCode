package gd;

import android.content.Context;
import androidx.compose.ui.platform.g2;
import androidx.compose.ui.platform.o0;
import androidx.compose.ui.platform.z;
import co.l;
import io.p;
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
import x0.f;
import y.d1;
import y.r;
import y.r0;
import z.c0;
import z.g0;
import z.h0;

/* loaded from: classes2.dex */
public final class a {

    @co.f(c = "com.dena.mirrativ.user.mypage.passbook.coin.CoinHistoriesViewKt$CoinPassbookView$1", f = "CoinHistoriesView.kt", l = {65}, m = "invokeSuspend")
    /* renamed from: gd.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0387a extends l implements p<q0, ao.d<? super v>, Object> {
        public final /* synthetic */ io.a<v> A;

        /* renamed from: w  reason: collision with root package name */
        public int f33130w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ g0 f33131x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ List<j> f33132y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ int f33133z;

        /* renamed from: gd.a$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0388a extends q implements io.a<Integer> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ g0 f33134w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0388a(g0 g0Var) {
                super(0);
                this.f33134w = g0Var;
            }

            @Override // io.a
            /* renamed from: a */
            public final Integer invoke() {
                return Integer.valueOf(this.f33134w.m());
            }
        }

        /* renamed from: gd.a$a$b */
        /* loaded from: classes2.dex */
        public static final class b extends q implements io.a<Integer> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ g0 f33135w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(g0 g0Var) {
                super(0);
                this.f33135w = g0Var;
            }

            @Override // io.a
            /* renamed from: a */
            public final Integer invoke() {
                return Integer.valueOf(this.f33135w.p().b().size());
            }
        }

        @co.f(c = "com.dena.mirrativ.user.mypage.passbook.coin.CoinHistoriesViewKt$CoinPassbookView$1$3", f = "CoinHistoriesView.kt", l = {}, m = "invokeSuspend")
        /* renamed from: gd.a$a$c */
        /* loaded from: classes2.dex */
        public static final class c extends l implements io.q<Integer, Integer, ao.d<? super Boolean>, Object> {
            public final /* synthetic */ int A;

            /* renamed from: w  reason: collision with root package name */
            public int f33136w;

            /* renamed from: x  reason: collision with root package name */
            public /* synthetic */ int f33137x;

            /* renamed from: y  reason: collision with root package name */
            public /* synthetic */ int f33138y;

            /* renamed from: z  reason: collision with root package name */
            public final /* synthetic */ List<j> f33139z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(List<j> list, int i10, ao.d<? super c> dVar) {
                super(3, dVar);
                this.f33139z = list;
                this.A = i10;
            }

            public final Object a(int i10, int i11, ao.d<? super Boolean> dVar) {
                c cVar = new c(this.f33139z, this.A, dVar);
                cVar.f33137x = i10;
                cVar.f33138y = i11;
                return cVar.invokeSuspend(v.f59242a);
            }

            @Override // co.a
            public final Object invokeSuspend(Object obj) {
                bo.c.c();
                if (this.f33136w == 0) {
                    m.b(obj);
                    return co.b.a(this.f33137x + this.f33138y > this.f33139z.size() - this.A);
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // io.q
            public /* bridge */ /* synthetic */ Object s0(Integer num, Integer num2, ao.d<? super Boolean> dVar) {
                return a(num.intValue(), num2.intValue(), dVar);
            }
        }

        /* renamed from: gd.a$a$d */
        /* loaded from: classes2.dex */
        public static final class d implements xo.d<Boolean> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ io.a<v> f33140w;

            public d(io.a<v> aVar) {
                this.f33140w = aVar;
            }

            public final Object a(boolean z10, ao.d<? super v> dVar) {
                this.f33140w.invoke();
                return v.f59242a;
            }

            @Override // xo.d
            public /* bridge */ /* synthetic */ Object emit(Boolean bool, ao.d dVar) {
                return a(bool.booleanValue(), dVar);
            }
        }

        /* renamed from: gd.a$a$e */
        /* loaded from: classes2.dex */
        public static final class e implements xo.c<Boolean> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ xo.c f33141w;

            /* renamed from: gd.a$a$e$a  reason: collision with other inner class name */
            /* loaded from: classes2.dex */
            public static final class C0389a<T> implements xo.d {

                /* renamed from: w  reason: collision with root package name */
                public final /* synthetic */ xo.d f33142w;

                @co.f(c = "com.dena.mirrativ.user.mypage.passbook.coin.CoinHistoriesViewKt$CoinPassbookView$1$invokeSuspend$$inlined$filter$1$2", f = "CoinHistoriesView.kt", l = {224}, m = "emit")
                /* renamed from: gd.a$a$e$a$a  reason: collision with other inner class name */
                /* loaded from: classes2.dex */
                public static final class C0390a extends co.d {

                    /* renamed from: w  reason: collision with root package name */
                    public /* synthetic */ Object f33143w;

                    /* renamed from: x  reason: collision with root package name */
                    public int f33144x;

                    public C0390a(ao.d dVar) {
                        super(dVar);
                    }

                    @Override // co.a
                    public final Object invokeSuspend(Object obj) {
                        this.f33143w = obj;
                        this.f33144x |= Integer.MIN_VALUE;
                        return C0389a.this.emit(null, this);
                    }
                }

                public C0389a(xo.d dVar) {
                    this.f33142w = dVar;
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
                        boolean r0 = r6 instanceof gd.a.C0387a.e.C0389a.C0390a
                        if (r0 == 0) goto L13
                        r0 = r6
                        gd.a$a$e$a$a r0 = (gd.a.C0387a.e.C0389a.C0390a) r0
                        int r1 = r0.f33144x
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f33144x = r1
                        goto L18
                    L13:
                        gd.a$a$e$a$a r0 = new gd.a$a$e$a$a
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.f33143w
                        java.lang.Object r1 = bo.c.c()
                        int r2 = r0.f33144x
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
                        xo.d r6 = r4.f33142w
                        r2 = r5
                        java.lang.Boolean r2 = (java.lang.Boolean) r2
                        boolean r2 = r2.booleanValue()
                        if (r2 == 0) goto L48
                        r0.f33144x = r3
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L48
                        return r1
                    L48:
                        wn.v r5 = wn.v.f59242a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: gd.a.C0387a.e.C0389a.emit(java.lang.Object, ao.d):java.lang.Object");
                }
            }

            public e(xo.c cVar) {
                this.f33141w = cVar;
            }

            @Override // xo.c
            public Object a(xo.d<? super Boolean> dVar, ao.d dVar2) {
                Object a10 = this.f33141w.a(new C0389a(dVar), dVar2);
                return a10 == bo.c.c() ? a10 : v.f59242a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0387a(g0 g0Var, List<j> list, int i10, io.a<v> aVar, ao.d<? super C0387a> dVar) {
            super(2, dVar);
            this.f33131x = g0Var;
            this.f33132y = list;
            this.f33133z = i10;
            this.A = aVar;
        }

        @Override // co.a
        public final ao.d<v> create(Object obj, ao.d<?> dVar) {
            return new C0387a(this.f33131x, this.f33132y, this.f33133z, this.A, dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super v> dVar) {
            return ((C0387a) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f33130w;
            if (i10 == 0) {
                m.b(obj);
                e eVar = new e(xo.e.h(u1.m(new C0388a(this.f33131x)), u1.m(new b(this.f33131x)), new c(this.f33132y, this.f33133z, null)));
                d dVar = new d(this.A);
                this.f33130w = 1;
                if (eVar.a(dVar, this) == c10) {
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

    @co.f(c = "com.dena.mirrativ.user.mypage.passbook.coin.CoinHistoriesViewKt$CoinPassbookView$2$1", f = "CoinHistoriesView.kt", l = {72}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class b extends l implements p<q0, ao.d<? super v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f33146w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ g0 f33147x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.l<Boolean, v> f33148y;

        /* renamed from: gd.a$b$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0391a extends q implements io.a<Integer> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ g0 f33149w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0391a(g0 g0Var) {
                super(0);
                this.f33149w = g0Var;
            }

            @Override // io.a
            /* renamed from: a */
            public final Integer invoke() {
                return Integer.valueOf(this.f33149w.n());
            }
        }

        /* renamed from: gd.a$b$b  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0392b implements xo.d<Boolean> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ io.l<Boolean, v> f33150w;

            /* JADX WARN: Multi-variable type inference failed */
            public C0392b(io.l<? super Boolean, v> lVar) {
                this.f33150w = lVar;
            }

            public final Object a(boolean z10, ao.d<? super v> dVar) {
                this.f33150w.invoke(co.b.a(z10));
                return v.f59242a;
            }

            @Override // xo.d
            public /* bridge */ /* synthetic */ Object emit(Boolean bool, ao.d dVar) {
                return a(bool.booleanValue(), dVar);
            }
        }

        /* loaded from: classes2.dex */
        public static final class c implements xo.c<Boolean> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ xo.c f33151w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ g0 f33152x;

            /* renamed from: gd.a$b$c$a  reason: collision with other inner class name */
            /* loaded from: classes2.dex */
            public static final class C0393a<T> implements xo.d {

                /* renamed from: w  reason: collision with root package name */
                public final /* synthetic */ xo.d f33153w;

                /* renamed from: x  reason: collision with root package name */
                public final /* synthetic */ g0 f33154x;

                @co.f(c = "com.dena.mirrativ.user.mypage.passbook.coin.CoinHistoriesViewKt$CoinPassbookView$2$1$invokeSuspend$$inlined$map$1$2", f = "CoinHistoriesView.kt", l = {224}, m = "emit")
                /* renamed from: gd.a$b$c$a$a  reason: collision with other inner class name */
                /* loaded from: classes2.dex */
                public static final class C0394a extends co.d {

                    /* renamed from: w  reason: collision with root package name */
                    public /* synthetic */ Object f33155w;

                    /* renamed from: x  reason: collision with root package name */
                    public int f33156x;

                    public C0394a(ao.d dVar) {
                        super(dVar);
                    }

                    @Override // co.a
                    public final Object invokeSuspend(Object obj) {
                        this.f33155w = obj;
                        this.f33156x |= Integer.MIN_VALUE;
                        return C0393a.this.emit(null, this);
                    }
                }

                public C0393a(xo.d dVar, g0 g0Var) {
                    this.f33153w = dVar;
                    this.f33154x = g0Var;
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
                        boolean r0 = r6 instanceof gd.a.b.c.C0393a.C0394a
                        if (r0 == 0) goto L13
                        r0 = r6
                        gd.a$b$c$a$a r0 = (gd.a.b.c.C0393a.C0394a) r0
                        int r1 = r0.f33156x
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f33156x = r1
                        goto L18
                    L13:
                        gd.a$b$c$a$a r0 = new gd.a$b$c$a$a
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.f33155w
                        java.lang.Object r1 = bo.c.c()
                        int r2 = r0.f33156x
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        wn.m.b(r6)
                        goto L56
                    L29:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L31:
                        wn.m.b(r6)
                        xo.d r6 = r4.f33153w
                        java.lang.Number r5 = (java.lang.Number) r5
                        int r5 = r5.intValue()
                        if (r5 != 0) goto L48
                        z.g0 r5 = r4.f33154x
                        int r5 = r5.m()
                        if (r5 != 0) goto L48
                        r5 = r3
                        goto L49
                    L48:
                        r5 = 0
                    L49:
                        java.lang.Boolean r5 = co.b.a(r5)
                        r0.f33156x = r3
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L56
                        return r1
                    L56:
                        wn.v r5 = wn.v.f59242a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: gd.a.b.c.C0393a.emit(java.lang.Object, ao.d):java.lang.Object");
                }
            }

            public c(xo.c cVar, g0 g0Var) {
                this.f33151w = cVar;
                this.f33152x = g0Var;
            }

            @Override // xo.c
            public Object a(xo.d<? super Boolean> dVar, ao.d dVar2) {
                Object a10 = this.f33151w.a(new C0393a(dVar, this.f33152x), dVar2);
                return a10 == bo.c.c() ? a10 : v.f59242a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(g0 g0Var, io.l<? super Boolean, v> lVar, ao.d<? super b> dVar) {
            super(2, dVar);
            this.f33147x = g0Var;
            this.f33148y = lVar;
        }

        @Override // co.a
        public final ao.d<v> create(Object obj, ao.d<?> dVar) {
            return new b(this.f33147x, this.f33148y, dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super v> dVar) {
            return ((b) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f33146w;
            if (i10 == 0) {
                m.b(obj);
                xo.c j10 = xo.e.j(new c(u1.m(new C0391a(this.f33147x)), this.f33147x));
                C0392b c0392b = new C0392b(this.f33148y);
                this.f33146w = 1;
                if (j10.a(c0392b, this) == c10) {
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

    /* loaded from: classes2.dex */
    public static final class c extends q implements io.l<c0, v> {
        public final /* synthetic */ c2<Integer> A;
        public final /* synthetic */ c2<Integer> B;
        public final /* synthetic */ c2<Integer> C;
        public final /* synthetic */ io.a<v> D;
        public final /* synthetic */ int E;
        public final /* synthetic */ c2<ha.a> F;
        public final /* synthetic */ io.a<v> G;
        public final /* synthetic */ Context H;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ List<j> f33158w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ io.a<v> f33159x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ int f33160y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ c2<id.d> f33161z;

        /* renamed from: gd.a$c$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0395a extends q implements io.q<z.h, l0.i, Integer, v> {
            public final /* synthetic */ c2<Integer> A;
            public final /* synthetic */ c2<Integer> B;
            public final /* synthetic */ io.a<v> C;
            public final /* synthetic */ int D;
            public final /* synthetic */ List<j> E;
            public final /* synthetic */ c2<ha.a> F;
            public final /* synthetic */ io.a<v> G;
            public final /* synthetic */ Context H;

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ io.a<v> f33162w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ int f33163x;

            /* renamed from: y  reason: collision with root package name */
            public final /* synthetic */ c2<id.d> f33164y;

            /* renamed from: z  reason: collision with root package name */
            public final /* synthetic */ c2<Integer> f33165z;

            /* renamed from: gd.a$c$a$a  reason: collision with other inner class name */
            /* loaded from: classes2.dex */
            public static final class C0396a extends q implements io.a<v> {

                /* renamed from: w  reason: collision with root package name */
                public final /* synthetic */ io.a<v> f33166w;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0396a(io.a<v> aVar) {
                    super(0);
                    this.f33166w = aVar;
                }

                public final void a() {
                    this.f33166w.invoke();
                }

                @Override // io.a
                public /* bridge */ /* synthetic */ v invoke() {
                    a();
                    return v.f59242a;
                }
            }

            /* renamed from: gd.a$c$a$b */
            /* loaded from: classes2.dex */
            public static final class b extends q implements io.a<v> {

                /* renamed from: w  reason: collision with root package name */
                public final /* synthetic */ io.a<v> f33167w;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(io.a<v> aVar) {
                    super(0);
                    this.f33167w = aVar;
                }

                public final void a() {
                    this.f33167w.invoke();
                }

                @Override // io.a
                public /* bridge */ /* synthetic */ v invoke() {
                    a();
                    return v.f59242a;
                }
            }

            /* renamed from: gd.a$c$a$c  reason: collision with other inner class name */
            /* loaded from: classes2.dex */
            public static final class C0397c extends q implements io.a<v> {

                /* renamed from: w  reason: collision with root package name */
                public final /* synthetic */ io.a<v> f33168w;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0397c(io.a<v> aVar) {
                    super(0);
                    this.f33168w = aVar;
                }

                public final void a() {
                    this.f33168w.invoke();
                }

                @Override // io.a
                public /* bridge */ /* synthetic */ v invoke() {
                    a();
                    return v.f59242a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0395a(io.a<v> aVar, int i10, c2<id.d> c2Var, c2<Integer> c2Var2, c2<Integer> c2Var3, c2<Integer> c2Var4, io.a<v> aVar2, int i11, List<j> list, c2<? extends ha.a> c2Var5, io.a<v> aVar3, Context context) {
                super(3);
                this.f33162w = aVar;
                this.f33163x = i10;
                this.f33164y = c2Var;
                this.f33165z = c2Var2;
                this.A = c2Var3;
                this.B = c2Var4;
                this.C = aVar2;
                this.D = i11;
                this.E = list;
                this.F = c2Var5;
                this.G = aVar3;
                this.H = context;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r24v0, types: [java.lang.Object, l0.i] */
            /* JADX WARN: Type inference failed for: r4v7 */
            /* JADX WARN: Type inference failed for: r5v12 */
            public final void a(z.h hVar, l0.i iVar, int i10) {
                io.a<v> aVar;
                int i11;
                jo.p.h(hVar, "$this$stickyHeader");
                if ((i10 & 81) == 16 && iVar.j()) {
                    iVar.I();
                    return;
                }
                f.a aVar2 = x0.f.f59359u;
                x0.f d10 = v.e.d(d1.n(aVar2, 0.0f, 1, null), c1.c0.f18634b.f(), null, 2, null);
                io.a<v> aVar3 = this.f33162w;
                c2<id.d> c2Var = this.f33164y;
                c2<Integer> c2Var2 = this.f33165z;
                c2<Integer> c2Var3 = this.A;
                c2<Integer> c2Var4 = this.B;
                io.a<v> aVar4 = this.C;
                List<j> list = this.E;
                c2<ha.a> c2Var5 = this.F;
                io.a<v> aVar5 = this.G;
                Context context = this.H;
                iVar.x(-483455358);
                q1.c0 a10 = y.p.a(y.f.f60773a.g(), x0.a.f59327a.k(), iVar, 0);
                iVar.x(-1323940314);
                m2.d dVar = (m2.d) iVar.G(o0.e());
                m2.q qVar = (m2.q) iVar.G(o0.j());
                g2 g2Var = (g2) iVar.G(o0.n());
                a.C0787a c0787a = s1.a.f51802o;
                io.a<s1.a> a11 = c0787a.a();
                io.q<n1<s1.a>, l0.i, Integer, v> a12 = w.a(d10);
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
                r rVar = r.f60913a;
                String b10 = v1.f.b(sb.c.text_setting_coin_passbook, iVar, 0);
                iVar.x(1157296644);
                boolean P = iVar.P(aVar3);
                Object y10 = iVar.y();
                if (P || y10 == l0.i.f39065a.a()) {
                    y10 = new C0396a(aVar3);
                    iVar.q(y10);
                }
                iVar.O();
                l9.f.a(b10, false, y10, null, iVar, 0, 10);
                id.d value = c2Var.getValue();
                iVar.x(1660780746);
                if (value == null) {
                    aVar = aVar4;
                    i11 = 0;
                } else {
                    aVar = aVar4;
                    i11 = 0;
                    hd.j.a(false, value.e(), value.g(context), value.a(context), value.b(), value.c(), value.d(), value.f(), iVar, 6);
                    float f10 = 16;
                    h0.w.a(r0.m(aVar2, m2.g.l(f10), m2.g.l(f10), m2.g.l(f10), 0.0f, 8, null), v1.b.a(sb.a.f52602a, iVar, 0), 0.0f, 0.0f, iVar, 0, 12);
                    v vVar = v.f59242a;
                }
                iVar.O();
                int intValue = c2Var2.getValue().intValue();
                int intValue2 = c2Var3.getValue().intValue();
                int intValue3 = c2Var4.getValue().intValue();
                iVar.x(1157296644);
                boolean P2 = iVar.P(aVar);
                Object y11 = iVar.y();
                if (P2 || y11 == l0.i.f39065a.a()) {
                    y11 = new b(aVar);
                    iVar.q(y11);
                }
                iVar.O();
                e.a(intValue, intValue2, intValue3, y11, iVar, 0);
                if (list.isEmpty()) {
                    ha.a value2 = c2Var5.getValue();
                    String b11 = v1.f.b(sb.c.text_no_coin_histories, iVar, i11);
                    iVar.x(1157296644);
                    boolean P3 = iVar.P(aVar5);
                    Object y12 = iVar.y();
                    if (P3 || y12 == l0.i.f39065a.a()) {
                        y12 = new C0397c(aVar5);
                        iVar.q(y12);
                    }
                    iVar.O();
                    l9.e.b(value2, b11, (io.a) y12, iVar, ha.a.f34693a);
                }
                iVar.O();
                iVar.O();
                iVar.s();
                iVar.O();
                iVar.O();
            }

            @Override // io.q
            public /* bridge */ /* synthetic */ v s0(z.h hVar, l0.i iVar, Integer num) {
                a(hVar, iVar, num.intValue());
                return v.f59242a;
            }
        }

        /* loaded from: classes2.dex */
        public static final class b extends q implements io.a<v> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ io.a<v> f33169w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(io.a<v> aVar) {
                super(0);
                this.f33169w = aVar;
            }

            public final void a() {
                this.f33169w.invoke();
            }

            @Override // io.a
            public /* bridge */ /* synthetic */ v invoke() {
                a();
                return v.f59242a;
            }
        }

        /* renamed from: gd.a$c$c  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0398c extends q implements io.l<Integer, Object> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ List f33170w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0398c(List list) {
                super(1);
                this.f33170w = list;
            }

            public final Object a(int i10) {
                this.f33170w.get(i10);
                return null;
            }

            @Override // io.l
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return a(num.intValue());
            }
        }

        /* loaded from: classes2.dex */
        public static final class d extends q implements io.r<z.h, Integer, l0.i, Integer, v> {
            public final /* synthetic */ int A;

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ List f33171w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ List f33172x;

            /* renamed from: y  reason: collision with root package name */
            public final /* synthetic */ c2 f33173y;

            /* renamed from: z  reason: collision with root package name */
            public final /* synthetic */ io.a f33174z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(List list, List list2, c2 c2Var, io.a aVar, int i10) {
                super(4);
                this.f33171w = list;
                this.f33172x = list2;
                this.f33173y = c2Var;
                this.f33174z = aVar;
                this.A = i10;
            }

            @Override // io.r
            public /* bridge */ /* synthetic */ v F(z.h hVar, Integer num, l0.i iVar, Integer num2) {
                a(hVar, num.intValue(), iVar, num2.intValue());
                return v.f59242a;
            }

            public final void a(z.h hVar, int i10, l0.i iVar, int i11) {
                int i12;
                int i13;
                jo.p.h(hVar, "$this$items");
                if ((i11 & 14) == 0) {
                    i12 = i11 | (iVar.P(hVar) ? 4 : 2);
                } else {
                    i12 = i11;
                }
                if ((i11 & 112) == 0) {
                    i12 |= iVar.d(i10) ? 32 : 16;
                }
                if ((i12 & 731) == 146 && iVar.j()) {
                    iVar.I();
                    return;
                }
                int i14 = (i12 & 112) | (i12 & 14);
                j jVar = (j) this.f33171w.get(i10);
                if ((i14 & 112) == 0) {
                    i13 = i14 | (iVar.d(i10) ? 32 : 16);
                } else {
                    i13 = i14;
                }
                if ((i14 & 896) == 0) {
                    i13 |= iVar.P(jVar) ? 256 : 128;
                }
                if ((i13 & 5841) == 1168 && iVar.j()) {
                    iVar.I();
                    return;
                }
                gd.b.a(false, jVar, null, iVar, ((i13 >> 3) & 112) | 6, 4);
                if (i10 == this.f33172x.size() - 1) {
                    iVar.x(-1424927973);
                    ha.a aVar = (ha.a) this.f33173y.getValue();
                    String b10 = v1.f.b(sb.c.text_no_coin_histories, iVar, 0);
                    iVar.x(1157296644);
                    boolean P = iVar.P(this.f33174z);
                    Object y10 = iVar.y();
                    if (P || y10 == l0.i.f39065a.a()) {
                        y10 = new b(this.f33174z);
                        iVar.q(y10);
                    }
                    iVar.O();
                    l9.e.b(aVar, b10, (io.a) y10, iVar, ha.a.f34693a);
                    iVar.O();
                    return;
                }
                iVar.x(-1424927698);
                h0.w.a(r0.m(x0.f.f59359u, m2.g.l(16), 0.0f, 0.0f, 0.0f, 14, null), v1.b.a(sb.a.f52602a, iVar, 0), 0.0f, 0.0f, iVar, 6, 12);
                iVar.O();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(List<j> list, io.a<v> aVar, int i10, c2<id.d> c2Var, c2<Integer> c2Var2, c2<Integer> c2Var3, c2<Integer> c2Var4, io.a<v> aVar2, int i11, c2<? extends ha.a> c2Var5, io.a<v> aVar3, Context context) {
            super(1);
            this.f33158w = list;
            this.f33159x = aVar;
            this.f33160y = i10;
            this.f33161z = c2Var;
            this.A = c2Var2;
            this.B = c2Var3;
            this.C = c2Var4;
            this.D = aVar2;
            this.E = i11;
            this.F = c2Var5;
            this.G = aVar3;
            this.H = context;
        }

        public final void a(c0 c0Var) {
            jo.p.h(c0Var, "$this$LazyColumn");
            c0.a(c0Var, null, null, s0.c.c(1829420445, true, new C0395a(this.f33159x, this.f33160y, this.f33161z, this.A, this.B, this.C, this.D, this.E, this.f33158w, this.F, this.G, this.H)), 3, null);
            List<j> list = this.f33158w;
            c0Var.c(list.size(), null, new C0398c(list), s0.c.c(-1091073711, true, new d(list, list, this.F, this.G, this.f33160y)));
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ v invoke(c0 c0Var) {
            a(c0Var);
            return v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends q implements p<l0.i, Integer, v> {
        public final /* synthetic */ c2<id.d> A;
        public final /* synthetic */ List<j> B;
        public final /* synthetic */ io.a<v> C;
        public final /* synthetic */ io.a<v> D;
        public final /* synthetic */ io.l<Boolean, v> E;
        public final /* synthetic */ io.a<v> F;
        public final /* synthetic */ io.a<v> G;
        public final /* synthetic */ int H;
        public final /* synthetic */ int I;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ c2<ha.a> f33175w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ c2<Integer> f33176x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ c2<Integer> f33177y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ c2<Integer> f33178z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(c2<? extends ha.a> c2Var, c2<Integer> c2Var2, c2<Integer> c2Var3, c2<Integer> c2Var4, c2<id.d> c2Var5, List<j> list, io.a<v> aVar, io.a<v> aVar2, io.l<? super Boolean, v> lVar, io.a<v> aVar3, io.a<v> aVar4, int i10, int i11) {
            super(2);
            this.f33175w = c2Var;
            this.f33176x = c2Var2;
            this.f33177y = c2Var3;
            this.f33178z = c2Var4;
            this.A = c2Var5;
            this.B = list;
            this.C = aVar;
            this.D = aVar2;
            this.E = lVar;
            this.F = aVar3;
            this.G = aVar4;
            this.H = i10;
            this.I = i11;
        }

        public final void a(l0.i iVar, int i10) {
            a.a(this.f33175w, this.f33176x, this.f33177y, this.f33178z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, iVar, this.H | 1, this.I);
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ v invoke(l0.i iVar, Integer num) {
            a(iVar, num.intValue());
            return v.f59242a;
        }
    }

    public static final void a(c2<? extends ha.a> c2Var, c2<Integer> c2Var2, c2<Integer> c2Var3, c2<Integer> c2Var4, c2<id.d> c2Var5, List<j> list, io.a<v> aVar, io.a<v> aVar2, io.l<? super Boolean, v> lVar, io.a<v> aVar3, io.a<v> aVar4, l0.i iVar, int i10, int i11) {
        jo.p.h(c2Var, "statusState");
        jo.p.h(c2Var2, "possessionCoin");
        jo.p.h(c2Var3, "freeCoin");
        jo.p.h(c2Var4, "paidCoin");
        jo.p.h(c2Var5, "rankBindModel");
        jo.p.h(list, "historyBindModels");
        jo.p.h(aVar, "onBackPressed");
        jo.p.h(aVar2, "onNext");
        jo.p.h(lVar, "onChangeScrollTopState");
        jo.p.h(aVar3, "onClickRetry");
        jo.p.h(aVar4, "onClickPurchase");
        l0.i h10 = iVar.h(428883796);
        g0 a10 = h0.a(0, 0, h10, 0, 3);
        Context context = (Context) h10.G(z.g());
        l0.c0.c(a10, new C0387a(a10, list, 2, aVar2, null), h10, 64);
        h10.x(511388516);
        boolean P = h10.P(a10) | h10.P(lVar);
        Object y10 = h10.y();
        if (P || y10 == l0.i.f39065a.a()) {
            y10 = new b(a10, lVar, null);
            h10.q(y10);
        }
        h10.O();
        l0.c0.c(a10, (p) y10, h10, 64);
        z.g.a(null, a10, null, false, null, null, null, false, new c(list, aVar, i10, c2Var5, c2Var2, c2Var3, c2Var4, aVar4, i11, c2Var, aVar3, context), h10, 0, 253);
        l1 l10 = h10.l();
        if (l10 == null) {
            return;
        }
        l10.a(new d(c2Var, c2Var2, c2Var3, c2Var4, c2Var5, list, aVar, aVar2, lVar, aVar3, aVar4, i10, i11));
    }
}
