package x8;

import com.dena.mirrativ.mirrativapi.core.ApiUtil;
import com.dena.mirrorman.net.api.Referer;
import com.dena.mirrorman.net.api.response.App;
import com.dena.mirrorman.net.api.response.MissionStatusResponse;
import com.dena.mirrorman.net.retrofit.MRRequest;
import ep.c0;
import hf.v0;
import jf.d0;
import kf.x;
import pd.s;
import pd.v;
import ud.h2;
import uo.b3;
import uo.d2;
import uo.g1;
import uo.l0;
import uo.q0;
import wn.v;
import xn.r;

/* loaded from: classes.dex */
public final class a implements q0 {
    public final x A;
    public final ao.g B;
    public final l0 C;

    /* renamed from: w  reason: collision with root package name */
    public final q8.a f59774w;

    /* renamed from: x  reason: collision with root package name */
    public final MRRequest f59775x;

    /* renamed from: y  reason: collision with root package name */
    public final v0 f59776y;

    /* renamed from: z  reason: collision with root package name */
    public final d0 f59777z;

    @co.f(c = "com.dena.mirrativ.catalog.home.HomeCatalogActionCreator$changeMyApp$1", f = "HomeCatalogActionCreator.kt", l = {63, 66}, m = "invokeSuspend")
    /* renamed from: x8.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0992a extends co.l implements io.p<q0, ao.d<? super v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f59778w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ boolean f59779x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ a f59780y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ App.AppParams f59781z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0992a(boolean z10, a aVar, App.AppParams appParams, ao.d<? super C0992a> dVar) {
            super(2, dVar);
            this.f59779x = z10;
            this.f59780y = aVar;
            this.f59781z = appParams;
        }

        @Override // co.a
        public final ao.d<v> create(Object obj, ao.d<?> dVar) {
            return new C0992a(this.f59779x, this.f59780y, this.f59781z, dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super v> dVar) {
            return ((C0992a) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f59778w;
            if (i10 != 0) {
                if (i10 == 1) {
                    wn.m.b(obj);
                    this.f59780y.f59774w.a(new s.a(this.f59781z));
                    return v.f59242a;
                } else if (i10 == 2) {
                    wn.m.b(obj);
                    this.f59780y.f59774w.a(new s.c(this.f59781z));
                    return v.f59242a;
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
            wn.m.b(obj);
            if (!this.f59779x) {
                MRRequest mRRequest = this.f59780y.f59775x;
                c0 appMyAppRequestBody = ApiUtil.INSTANCE.appMyAppRequestBody(r.d(this.f59781z.getAppId()));
                this.f59778w = 1;
                if (mRRequest.postAddMyApp(Referer.HOME_SELECT, appMyAppRequestBody, this) == c10) {
                    return c10;
                }
                this.f59780y.f59774w.a(new s.a(this.f59781z));
                return v.f59242a;
            }
            MRRequest mRRequest2 = this.f59780y.f59775x;
            c0 appMyAppRequestBody2 = ApiUtil.INSTANCE.appMyAppRequestBody(r.d(this.f59781z.getAppId()));
            this.f59778w = 2;
            if (mRRequest2.postDeleteMyApp(Referer.HOME_SELECT, appMyAppRequestBody2, this) == c10) {
                return c10;
            }
            this.f59780y.f59774w.a(new s.c(this.f59781z));
            return v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrativ.catalog.home.HomeCatalogActionCreator$loadMissionStatus$1", f = "HomeCatalogActionCreator.kt", l = {78}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class b extends co.l implements io.p<q0, ao.d<? super v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f59782w;

        public b(ao.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<v> create(Object obj, ao.d<?> dVar) {
            return new b(dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super v> dVar) {
            return ((b) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f59782w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    MRRequest mRRequest = a.this.f59775x;
                    this.f59782w = 1;
                    obj = mRRequest.getMissionStatus(Referer.HOME_SELECT, this);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                a.this.f59774w.a(new v.c(h2.f54992e.a((MissionStatusResponse) obj)));
            } catch (Throwable unused) {
                a.this.f59774w.a(v.a.f47291a);
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrativ.catalog.home.HomeCatalogActionCreator$reloadApps$1", f = "HomeCatalogActionCreator.kt", l = {46, 47}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class c extends co.l implements io.p<q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f59784w;

        /* renamed from: x  reason: collision with root package name */
        public /* synthetic */ Object f59785x;

        @co.f(c = "com.dena.mirrativ.catalog.home.HomeCatalogActionCreator$reloadApps$1$myAppsRequest$1", f = "HomeCatalogActionCreator.kt", l = {44}, m = "invokeSuspend")
        /* renamed from: x8.a$c$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0993a extends co.l implements io.p<q0, ao.d<? super App.Apps>, Object> {

            /* renamed from: w  reason: collision with root package name */
            public int f59787w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ a f59788x;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0993a(a aVar, ao.d<? super C0993a> dVar) {
                super(2, dVar);
                this.f59788x = aVar;
            }

            @Override // co.a
            public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
                return new C0993a(this.f59788x, dVar);
            }

            @Override // io.p
            public final Object invoke(q0 q0Var, ao.d<? super App.Apps> dVar) {
                return ((C0993a) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
            }

            @Override // co.a
            public final Object invokeSuspend(Object obj) {
                Object c10 = bo.c.c();
                int i10 = this.f59787w;
                if (i10 == 0) {
                    wn.m.b(obj);
                    MRRequest mRRequest = this.f59788x.f59775x;
                    String x10 = this.f59788x.f59776y.x();
                    this.f59787w = 1;
                    obj = mRRequest.getMyApp(Referer.HOME_SELECT, x10, this);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                return obj;
            }
        }

        @co.f(c = "com.dena.mirrativ.catalog.home.HomeCatalogActionCreator$reloadApps$1$onLiveRequest$1", f = "HomeCatalogActionCreator.kt", l = {43}, m = "invokeSuspend")
        /* loaded from: classes.dex */
        public static final class b extends co.l implements io.p<q0, ao.d<? super App.Apps>, Object> {

            /* renamed from: w  reason: collision with root package name */
            public int f59789w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ a f59790x;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(a aVar, ao.d<? super b> dVar) {
                super(2, dVar);
                this.f59790x = aVar;
            }

            @Override // co.a
            public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
                return new b(this.f59790x, dVar);
            }

            @Override // io.p
            public final Object invoke(q0 q0Var, ao.d<? super App.Apps> dVar) {
                return ((b) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
            }

            @Override // co.a
            public final Object invokeSuspend(Object obj) {
                Object c10 = bo.c.c();
                int i10 = this.f59789w;
                if (i10 == 0) {
                    wn.m.b(obj);
                    MRRequest mRRequest = this.f59790x.f59775x;
                    this.f59789w = 1;
                    obj = mRRequest.getOnliveApps(Referer.HOME_SELECT, this);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                return obj;
            }
        }

        public c(ao.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            c cVar = new c(dVar);
            cVar.f59785x = obj;
            return cVar;
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((c) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x0089  */
        @Override // co.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                r12 = this;
                java.lang.Object r0 = bo.c.c()
                int r1 = r12.f59784w
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L26
                if (r1 == r3) goto L1e
                if (r1 != r2) goto L16
                java.lang.Object r0 = r12.f59785x
                com.dena.mirrorman.net.api.response.App$Apps r0 = (com.dena.mirrorman.net.api.response.App.Apps) r0
                wn.m.b(r13)
                goto L67
            L16:
                java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r13.<init>(r0)
                throw r13
            L1e:
                java.lang.Object r1 = r12.f59785x
                uo.y0 r1 = (uo.y0) r1
                wn.m.b(r13)
                goto L58
            L26:
                wn.m.b(r13)
                java.lang.Object r13 = r12.f59785x
                uo.q0 r13 = (uo.q0) r13
                r5 = 0
                r6 = 0
                x8.a$c$b r7 = new x8.a$c$b
                x8.a r1 = x8.a.this
                r10 = 0
                r7.<init>(r1, r10)
                r8 = 3
                r9 = 0
                r4 = r13
                uo.y0 r1 = uo.j.b(r4, r5, r6, r7, r8, r9)
                x8.a$c$a r7 = new x8.a$c$a
                x8.a r4 = x8.a.this
                r7.<init>(r4, r10)
                r4 = r13
                uo.y0 r13 = uo.j.b(r4, r5, r6, r7, r8, r9)
                r12.f59785x = r13
                r12.f59784w = r3
                java.lang.Object r1 = r1.o(r12)
                if (r1 != r0) goto L55
                return r0
            L55:
                r11 = r1
                r1 = r13
                r13 = r11
            L58:
                com.dena.mirrorman.net.api.response.App$Apps r13 = (com.dena.mirrorman.net.api.response.App.Apps) r13
                r12.f59785x = r13
                r12.f59784w = r2
                java.lang.Object r1 = r1.o(r12)
                if (r1 != r0) goto L65
                return r0
            L65:
                r0 = r13
                r13 = r1
            L67:
                com.dena.mirrorman.net.api.response.App$Apps r13 = (com.dena.mirrorman.net.api.response.App.Apps) r13
                java.util.List r0 = r0.getApps()
                java.util.List r1 = r13.getApps()
                java.util.List r0 = xn.a0.o0(r0, r1)
                java.util.HashSet r1 = new java.util.HashSet
                r1.<init>()
                java.util.ArrayList r2 = new java.util.ArrayList
                r2.<init>()
                java.util.Iterator r0 = r0.iterator()
            L83:
                boolean r3 = r0.hasNext()
                if (r3 == 0) goto L9e
                java.lang.Object r3 = r0.next()
                r4 = r3
                com.dena.mirrorman.net.api.response.App$AppParams r4 = (com.dena.mirrorman.net.api.response.App.AppParams) r4
                java.lang.String r4 = r4.getAppId()
                boolean r4 = r1.add(r4)
                if (r4 == 0) goto L83
                r2.add(r3)
                goto L83
            L9e:
                x8.a r0 = x8.a.this
                jf.d0 r0 = x8.a.b(r0)
                r0.d()
                x8.a r0 = x8.a.this
                jf.d0 r0 = x8.a.b(r0)
                java.util.List r13 = r13.getApps()
                r0.b(r13)
                x8.a r13 = x8.a.this
                q8.a r13 = x8.a.a(r13)
                pd.v$b r0 = new pd.v$b
                r0.<init>(r2)
                r13.a(r0)
                wn.v r13 = wn.v.f59242a
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: x8.a.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends ao.a implements l0 {
        public d(l0.a aVar) {
            super(aVar);
        }

        @Override // uo.l0
        public void handleException(ao.g gVar, Throwable th2) {
        }
    }

    public a(q8.a aVar, MRRequest mRRequest, v0 v0Var, d0 d0Var, x xVar) {
        jo.p.h(aVar, "dispatcher");
        jo.p.h(mRRequest, "request");
        jo.p.h(v0Var, "userHelper");
        jo.p.h(d0Var, "myAppRepository");
        jo.p.h(xVar, "userPreference");
        this.f59774w = aVar;
        this.f59775x = mRRequest;
        this.f59776y = v0Var;
        this.f59777z = d0Var;
        this.A = xVar;
        this.B = g1.b().plus(b3.b(null, 1, null));
        this.C = new d(l0.f56050r);
    }

    public final void e(App.AppParams appParams) {
        jo.p.h(appParams, "app");
        if (this.f59776y.l()) {
            uo.l.d(this, null, null, new C0992a(this.f59777z.e(appParams.getAppId()) != null, this, appParams, null), 3, null);
        } else {
            this.f59774w.a(v.f.f47296a);
        }
    }

    public final void f() {
        uo.l.d(this, null, null, new b(null), 3, null);
    }

    public final void g(App.AppParams appParams) {
        this.f59774w.a(new v.d(appParams));
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.B;
    }

    public final d2 h() {
        d2 d10;
        d10 = uo.l.d(this, this.C, null, new c(null), 2, null);
        return d10;
    }

    public final void i(boolean z10) {
        this.f59774w.a(new v.e(z10));
    }
}
