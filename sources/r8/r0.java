package r8;

import com.dena.mirrativ.mirrativapi.core.MRErrorKt;
import com.dena.mirrorman.net.api.response.DashboardCatalog;
import com.dena.mirrorman.net.live.GetLiveCatalogRequest;
import com.dena.mirrorman.net.retrofit.MRRequest;
import pd.a0;
import uo.d2;
import uo.i2;

/* loaded from: classes.dex */
public final class r0 implements uo.q0 {
    public final hf.e0 A;
    public final MRRequest B;
    public final GetLiveCatalogRequest C;
    public final ao.g D;
    public d2 E;

    /* renamed from: w  reason: collision with root package name */
    public final String f49987w;

    /* renamed from: x  reason: collision with root package name */
    public final String f49988x;

    /* renamed from: y  reason: collision with root package name */
    public final q8.a f49989y;

    /* renamed from: z  reason: collision with root package name */
    public final hf.v0 f49990z;

    @co.f(c = "com.dena.mirrativ.catalog.LiveCatalogActionCreator$follow$1", f = "LiveCatalogActionCreator.kt", l = {65}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class a extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f49991w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f49993y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, ao.d<? super a> dVar) {
            super(2, dVar);
            this.f49993y = str;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new a(this.f49993y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((a) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f49991w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    if (!r0.this.f49990z.l()) {
                        r0.this.f49989y.a(new a0.j(r0.this.f49987w));
                        r0.this.f49989y.a(new a0.b(r0.this.f49987w, this.f49993y));
                        return wn.v.f59242a;
                    }
                    MRRequest mRRequest = r0.this.B;
                    String str = r0.this.f49988x;
                    String str2 = this.f49993y;
                    this.f49991w = 1;
                    if (mRRequest.postGraphFollow(str, str2, this) == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                r0.this.f49989y.a(new a0.a(r0.this.f49987w, this.f49993y));
            } catch (Throwable unused) {
                r0.this.f49989y.a(new a0.b(r0.this.f49987w, this.f49993y));
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrativ.catalog.LiveCatalogActionCreator$loadNext$1", f = "LiveCatalogActionCreator.kt", l = {49}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class b extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f49994w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f49996y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, ao.d<? super b> dVar) {
            super(2, dVar);
            this.f49996y = str;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new b(this.f49996y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((b) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f49994w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    GetLiveCatalogRequest getLiveCatalogRequest = r0.this.C;
                    String str = this.f49996y;
                    this.f49994w = 1;
                    obj = getLiveCatalogRequest.execute(str, this);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                r0.this.f49989y.a(new a0.d(r0.this.f49987w, (DashboardCatalog) obj, false, r0.this.C.getAsSmall()));
            } catch (Throwable th2) {
                r0.this.f49989y.a(new a0.c(r0.this.f49987w, MRErrorKt.convertMRException(th2).getError()));
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrativ.catalog.LiveCatalogActionCreator$reload$1", f = "LiveCatalogActionCreator.kt", l = {37}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class c extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f49997w;

        public c(ao.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new c(dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((c) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f49997w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    GetLiveCatalogRequest getLiveCatalogRequest = r0.this.C;
                    this.f49997w = 1;
                    obj = GetLiveCatalogRequest.DefaultImpls.execute$default(getLiveCatalogRequest, null, this, 1, null);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                r0.this.f49989y.a(new a0.d(r0.this.f49987w, (DashboardCatalog) obj, true, r0.this.C.getAsSmall()));
            } catch (Throwable th2) {
                r0.this.f49989y.a(new a0.c(r0.this.f49987w, MRErrorKt.convertMRException(th2).getError()));
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrativ.catalog.LiveCatalogActionCreator$startPreview$1", f = "LiveCatalogActionCreator.kt", l = {118, 120, 121}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class d extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {
        public final /* synthetic */ String A;
        public final /* synthetic */ String B;

        /* renamed from: w  reason: collision with root package name */
        public Object f49999w;

        /* renamed from: x  reason: collision with root package name */
        public int f50000x;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ int f50002z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(int i10, String str, String str2, ao.d<? super d> dVar) {
            super(2, dVar);
            this.f50002z = i10;
            this.A = str;
            this.B = str2;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new d(this.f50002z, this.A, this.B, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((d) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:56)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:30)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:18)
            */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0075  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0078  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0085 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:30:0x0098 A[RETURN] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0096 -> B:21:0x006f). Please submit an issue!!! */
        @Override // co.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r15) {
            /*
                r14 = this;
                java.lang.Object r0 = bo.c.c()
                int r1 = r14.f50000x
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L2f
                if (r1 == r4) goto L27
                if (r1 == r3) goto L1e
                if (r1 != r2) goto L16
                java.lang.Object r1 = r14.f49999w
                java.lang.String r1 = (java.lang.String) r1
                goto L2b
            L16:
                java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r15.<init>(r0)
                throw r15
            L1e:
                java.lang.Object r1 = r14.f49999w
                java.lang.String r1 = (java.lang.String) r1
                wn.m.b(r15)     // Catch: java.lang.Throwable -> L99
                r15 = r14
                goto L86
            L27:
                java.lang.Object r1 = r14.f49999w
                java.lang.String r1 = (java.lang.String) r1
            L2b:
                wn.m.b(r15)     // Catch: java.lang.Throwable -> L99
                goto L6e
            L2f:
                wn.m.b(r15)
                java.lang.Object[] r15 = new java.lang.Object[r2]
                r1 = 0
                r8.r0 r5 = r8.r0.this
                java.lang.String r5 = r8.r0.d(r5)
                r15[r1] = r5
                int r1 = r14.f50002z
                java.lang.Integer r1 = co.b.d(r1)
                r15[r4] = r1
                java.lang.String r1 = r14.A
                r15[r3] = r1
                java.util.List r5 = xn.s.o(r15)
                r7 = 0
                r8 = 0
                r9 = 0
                r10 = 0
                r11 = 0
                r12 = 62
                r13 = 0
                java.lang.String r6 = "/"
                java.lang.String r1 = xn.a0.g0(r5, r6, r7, r8, r9, r10, r11, r12, r13)
                r8.r0 r15 = r8.r0.this     // Catch: java.lang.Throwable -> L99
                com.dena.mirrorman.net.retrofit.MRRequest r15 = r8.r0.e(r15)     // Catch: java.lang.Throwable -> L99
                java.lang.String r5 = r14.B     // Catch: java.lang.Throwable -> L99
                r14.f49999w = r1     // Catch: java.lang.Throwable -> L99
                r14.f50000x = r4     // Catch: java.lang.Throwable -> L99
                java.lang.Object r15 = r15.postLivePreviewStart(r1, r5, r14)     // Catch: java.lang.Throwable -> L99
                if (r15 != r0) goto L6e
                return r0
            L6e:
                r15 = r14
            L6f:
                boolean r4 = of.n.n()     // Catch: java.lang.Throwable -> L99
                if (r4 == 0) goto L78
                r4 = 5000(0x1388, double:2.4703E-320)
                goto L7b
            L78:
                r4 = 60000(0xea60, double:2.9644E-319)
            L7b:
                r15.f49999w = r1     // Catch: java.lang.Throwable -> L99
                r15.f50000x = r3     // Catch: java.lang.Throwable -> L99
                java.lang.Object r4 = uo.b1.a(r4, r15)     // Catch: java.lang.Throwable -> L99
                if (r4 != r0) goto L86
                return r0
            L86:
                r8.r0 r4 = r8.r0.this     // Catch: java.lang.Throwable -> L99
                com.dena.mirrorman.net.retrofit.MRRequest r4 = r8.r0.e(r4)     // Catch: java.lang.Throwable -> L99
                java.lang.String r5 = r15.B     // Catch: java.lang.Throwable -> L99
                r15.f49999w = r1     // Catch: java.lang.Throwable -> L99
                r15.f50000x = r2     // Catch: java.lang.Throwable -> L99
                java.lang.Object r4 = r4.postLivePreviewPolling(r1, r5, r15)     // Catch: java.lang.Throwable -> L99
                if (r4 != r0) goto L6f
                return r0
            L99:
                r15 = move-exception
                g9.a.c(r15)
                wn.v r15 = wn.v.f59242a
                return r15
            */
            throw new UnsupportedOperationException("Method not decompiled: r8.r0.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @co.f(c = "com.dena.mirrativ.catalog.LiveCatalogActionCreator$stopPreview$1", f = "LiveCatalogActionCreator.kt", l = {100}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class e extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {
        public final /* synthetic */ String A;

        /* renamed from: w  reason: collision with root package name */
        public int f50003w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ int f50005y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ String f50006z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(int i10, String str, String str2, ao.d<? super e> dVar) {
            super(2, dVar);
            this.f50005y = i10;
            this.f50006z = str;
            this.A = str2;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new e(this.f50005y, this.f50006z, this.A, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((e) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f50003w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    String g02 = xn.a0.g0(xn.s.o(r0.this.f49988x, co.b.d(this.f50005y), this.f50006z), "/", null, null, 0, null, null, 62, null);
                    MRRequest mRRequest = r0.this.B;
                    String str = this.A;
                    this.f50003w = 1;
                    if (mRRequest.postLivePreviewEnd(g02, str, this) == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
            } catch (Throwable th2) {
                g9.a.c(th2);
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrativ.catalog.LiveCatalogActionCreator$unFollow$1", f = "LiveCatalogActionCreator.kt", l = {76}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class f extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f50007w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f50009y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String str, ao.d<? super f> dVar) {
            super(2, dVar);
            this.f50009y = str;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new f(this.f50009y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((f) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f50007w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    MRRequest mRRequest = r0.this.B;
                    String str = r0.this.f49988x;
                    String str2 = this.f50009y;
                    this.f50007w = 1;
                    if (mRRequest.postGraphUnfollow(str, str2, this) == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                r0.this.f49989y.a(new a0.i(r0.this.f49987w, this.f50009y));
            } catch (Throwable unused) {
                r0.this.f49989y.a(new a0.b(r0.this.f49987w, this.f50009y));
            }
            return wn.v.f59242a;
        }
    }

    public r0(String str, String str2, q8.a aVar, hf.v0 v0Var, hf.e0 e0Var, MRRequest mRRequest, GetLiveCatalogRequest getLiveCatalogRequest) {
        uo.b0 b10;
        uo.b0 b11;
        jo.p.h(str, "actionId");
        jo.p.h(str2, "referer");
        jo.p.h(aVar, "dispatcher");
        jo.p.h(v0Var, "userHelper");
        jo.p.h(e0Var, "networkHelper");
        jo.p.h(mRRequest, "request");
        jo.p.h(getLiveCatalogRequest, "getLiveCatalogRequest");
        this.f49987w = str;
        this.f49988x = str2;
        this.f49989y = aVar;
        this.f49990z = v0Var;
        this.A = e0Var;
        this.B = mRRequest;
        this.C = getLiveCatalogRequest;
        uo.k0 b12 = uo.g1.b();
        b10 = i2.b(null, 1, null);
        this.D = b12.plus(b10);
        b11 = i2.b(null, 1, null);
        this.E = b11;
    }

    public final void g() {
        uo.r0.d(this, null, 1, null);
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.D;
    }

    public final void h(String str) {
        jo.p.h(str, "userId");
        uo.l.d(this, null, null, new a(str, null), 3, null);
    }

    public final void i(String str) {
        jo.p.h(str, "nextCursor");
        this.f49989y.a(new a0.e(this.f49987w));
        uo.l.d(this, null, null, new b(str, null), 3, null);
    }

    public final void j() {
        this.f49989y.a(new a0.f(this.f49987w));
        uo.l.d(this, null, null, new c(null), 3, null);
    }

    public final void k(String str, int i10, String str2) {
        d2 d10;
        jo.p.h(str, "liveId");
        if (this.A.d()) {
            this.f49989y.a(new a0.g(this.f49987w, str));
            d2.a.a(this.E, null, 1, null);
            d10 = uo.l.d(uo.r0.a(uo.g1.b()), null, null, new d(i10, str2, str, null), 3, null);
            this.E = d10;
        }
    }

    public final void l(String str, int i10, String str2) {
        jo.p.h(str, "liveId");
        this.f49989y.a(new a0.h(this.f49987w, str));
        d2.a.a(this.E, null, 1, null);
        uo.l.d(this, null, null, new e(i10, str2, str, null), 3, null);
    }

    public final void m(String str) {
        jo.p.h(str, "userId");
        uo.l.d(this, null, null, new f(str, null), 3, null);
    }

    public final void n(String str) {
        jo.p.h(str, "liveId");
        this.f49989y.a(new a0.k(this.f49987w, str));
    }
}
