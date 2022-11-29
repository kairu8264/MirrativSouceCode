package od;

import com.dena.mirrativ.mirrativapi.user.TosResponse;
import com.dena.mirrativ.mirrativapi.user.UserApi;
import com.dena.mirrorman.net.api.Referer;
import pd.x;

/* loaded from: classes2.dex */
public final class s implements uo.q0 {

    /* renamed from: w  reason: collision with root package name */
    public final q8.a f45214w;

    /* renamed from: x  reason: collision with root package name */
    public final UserApi f45215x;

    /* renamed from: y  reason: collision with root package name */
    public final kf.x f45216y;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ uo.q0 f45217z;

    @co.f(c = "com.dena.mirrorman.actioncreator.LatestRewardActionCreator$agreeTos$1", f = "LatestRewardActionCreator.kt", l = {22}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f45218w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ int f45220y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i10, ao.d<? super a> dVar) {
            super(2, dVar);
            this.f45220y = i10;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new a(this.f45220y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((a) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f45218w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    UserApi userApi = s.this.f45215x;
                    int i11 = this.f45220y;
                    this.f45218w = 1;
                    if (userApi.postTos(Referer.HOME, i11, this) == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
            } catch (Throwable unused) {
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrorman.actioncreator.LatestRewardActionCreator$fetchSeasonRatingStatusAndReward$1", f = "LatestRewardActionCreator.kt", l = {81, 82}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class b extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public Object f45221w;

        /* renamed from: x  reason: collision with root package name */
        public int f45222x;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ String f45224z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, ao.d<? super b> dVar) {
            super(2, dVar);
            this.f45224z = str;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new b(this.f45224z, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((b) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        /* JADX WARN: Removed duplicated region for block: B:29:0x007b  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x007c  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x0085 A[Catch: all -> 0x0096, TryCatch #0 {all -> 0x0096, blocks: (B:7:0x0012, B:21:0x0051, B:23:0x005a, B:27:0x0071, B:31:0x007d, B:33:0x0085, B:35:0x0088, B:11:0x001e, B:17:0x003a, B:14:0x0025), top: B:39:0x0008 }] */
        /* JADX WARN: Removed duplicated region for block: B:35:0x0088 A[Catch: all -> 0x0096, TRY_LEAVE, TryCatch #0 {all -> 0x0096, blocks: (B:7:0x0012, B:21:0x0051, B:23:0x005a, B:27:0x0071, B:31:0x007d, B:33:0x0085, B:35:0x0088, B:11:0x001e, B:17:0x003a, B:14:0x0025), top: B:39:0x0008 }] */
        @Override // co.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                r10 = this;
                java.lang.Object r0 = bo.c.c()
                int r1 = r10.f45222x
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L22
                if (r1 == r3) goto L1e
                if (r1 != r2) goto L16
                java.lang.Object r0 = r10.f45221w
                com.dena.mirrativ.mirrativapi.user.SeasonRatingStatusResponse r0 = (com.dena.mirrativ.mirrativapi.user.SeasonRatingStatusResponse) r0
                wn.m.b(r11)     // Catch: java.lang.Throwable -> L96
                goto L51
            L16:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L1e:
                wn.m.b(r11)     // Catch: java.lang.Throwable -> L96
                goto L3a
            L22:
                wn.m.b(r11)
                od.s r11 = od.s.this     // Catch: java.lang.Throwable -> L96
                com.dena.mirrativ.mirrativapi.user.UserApi r4 = od.s.b(r11)     // Catch: java.lang.Throwable -> L96
                java.lang.String r5 = r10.f45224z     // Catch: java.lang.Throwable -> L96
                r6 = 0
                r8 = 2
                r9 = 0
                r10.f45222x = r3     // Catch: java.lang.Throwable -> L96
                r7 = r10
                java.lang.Object r11 = com.dena.mirrativ.mirrativapi.user.UserApi.DefaultImpls.getSeasonRatingStatus$default(r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L96
                if (r11 != r0) goto L3a
                return r0
            L3a:
                com.dena.mirrativ.mirrativapi.user.SeasonRatingStatusResponse r11 = (com.dena.mirrativ.mirrativapi.user.SeasonRatingStatusResponse) r11     // Catch: java.lang.Throwable -> L96
                od.s r1 = od.s.this     // Catch: java.lang.Throwable -> L96
                com.dena.mirrativ.mirrativapi.user.UserApi r1 = od.s.b(r1)     // Catch: java.lang.Throwable -> L96
                java.lang.String r4 = r10.f45224z     // Catch: java.lang.Throwable -> L96
                r10.f45221w = r11     // Catch: java.lang.Throwable -> L96
                r10.f45222x = r2     // Catch: java.lang.Throwable -> L96
                java.lang.Object r1 = r1.getLatestReward(r4, r10)     // Catch: java.lang.Throwable -> L96
                if (r1 != r0) goto L4f
                return r0
            L4f:
                r0 = r11
                r11 = r1
            L51:
                com.dena.mirrativ.mirrativapi.user.LatestRewardResponse r11 = (com.dena.mirrativ.mirrativapi.user.LatestRewardResponse) r11     // Catch: java.lang.Throwable -> L96
                boolean r1 = r0.getShowPopup()     // Catch: java.lang.Throwable -> L96
                r2 = 0
                if (r1 == 0) goto L70
                od.s r1 = od.s.this     // Catch: java.lang.Throwable -> L96
                kf.x r1 = od.s.c(r1)     // Catch: java.lang.Throwable -> L96
                int r1 = r1.e1()     // Catch: java.lang.Throwable -> L96
                com.dena.mirrativ.mirrativapi.user.SeasonRatingStatusSeason r4 = r0.getSeason()     // Catch: java.lang.Throwable -> L96
                int r4 = r4.getMonth()     // Catch: java.lang.Throwable -> L96
                if (r1 == r4) goto L70
                r1 = r3
                goto L71
            L70:
                r1 = r2
            L71:
                od.s r4 = od.s.this     // Catch: java.lang.Throwable -> L96
                q8.a r4 = od.s.a(r4)     // Catch: java.lang.Throwable -> L96
                pd.x$b r5 = new pd.x$b     // Catch: java.lang.Throwable -> L96
                if (r1 == 0) goto L7c
                goto L7d
            L7c:
                r3 = r2
            L7d:
                r5.<init>(r0, r3)     // Catch: java.lang.Throwable -> L96
                r4.a(r5)     // Catch: java.lang.Throwable -> L96
                if (r1 == 0) goto L88
                wn.v r11 = wn.v.f59242a     // Catch: java.lang.Throwable -> L96
                return r11
            L88:
                od.s r0 = od.s.this     // Catch: java.lang.Throwable -> L96
                q8.a r0 = od.s.a(r0)     // Catch: java.lang.Throwable -> L96
                pd.x$a r1 = new pd.x$a     // Catch: java.lang.Throwable -> L96
                r1.<init>(r11)     // Catch: java.lang.Throwable -> L96
                r0.a(r1)     // Catch: java.lang.Throwable -> L96
            L96:
                wn.v r11 = wn.v.f59242a
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: od.s.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @co.f(c = "com.dena.mirrorman.actioncreator.LatestRewardActionCreator$fetchTos$1", f = "LatestRewardActionCreator.kt", l = {31}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class c extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f45225w;

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
            int i10 = this.f45225w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    UserApi userApi = s.this.f45215x;
                    this.f45225w = 1;
                    obj = userApi.getTos(Referer.HOME, this);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                s.this.f45214w.a(new x.c((TosResponse) obj));
            } catch (Throwable unused) {
            }
            return wn.v.f59242a;
        }
    }

    public s(q8.a aVar, UserApi userApi, kf.x xVar) {
        jo.p.h(aVar, "dispatcher");
        jo.p.h(userApi, "userApi");
        jo.p.h(xVar, "userPreference");
        this.f45214w = aVar;
        this.f45215x = userApi;
        this.f45216y = xVar;
        this.f45217z = uo.r0.b();
    }

    public final void d(int i10) {
        this.f45216y.L1(i10);
        uo.l.d(this, null, null, new a(i10, null), 3, null);
    }

    public final void e(String str) {
        jo.p.h(str, "referer");
        uo.l.d(this, null, null, new b(str, null), 3, null);
    }

    public final void f() {
        uo.l.d(this, null, null, new c(null), 3, null);
    }

    public final void g() {
        this.f45216y.v3(true);
        this.f45214w.a(x.d.f47323a);
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.f45217z.getCoroutineContext();
    }

    public final void h() {
        this.f45216y.t5(true);
        this.f45214w.a(x.f.f47324a);
    }

    public final void i(int i10) {
        this.f45216y.Q3(i10);
        this.f45214w.a(x.g.f47325a);
    }

    public final void j(int i10) {
        this.f45216y.t2(i10);
        this.f45214w.a(x.h.f47326a);
    }

    public final void k(int i10) {
        this.f45216y.d2(i10);
        this.f45214w.a(x.i.f47327a);
    }

    public final void l(int i10) {
        this.f45216y.y0(i10);
        this.f45214w.a(x.j.f47328a);
    }

    public final void m(int i10) {
        this.f45216y.H2(i10);
        this.f45214w.a(x.k.f47329a);
    }
}
