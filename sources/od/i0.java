package od;

import com.dena.mirrativ.mirrativapi.core.MRErrorKt;
import com.dena.mirrativ.mirrativapi.user.SeasonRatingLiveResult;
import com.dena.mirrativ.mirrativapi.user.SeasonRatingStatusResponse;
import com.dena.mirrativ.mirrativapi.user.UserApi;
import pd.v0;

/* loaded from: classes2.dex */
public final class i0 implements uo.q0 {

    /* renamed from: w  reason: collision with root package name */
    public final q8.a f44930w;

    /* renamed from: x  reason: collision with root package name */
    public final UserApi f44931x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ uo.q0 f44932y;

    @co.f(c = "com.dena.mirrorman.actioncreator.SeasonRatingActionCreator$fetchLiveResult$1", f = "SeasonRatingActionCreator.kt", l = {19}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f44933w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f44935y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ String f44936z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, String str2, ao.d<? super a> dVar) {
            super(2, dVar);
            this.f44935y = str;
            this.f44936z = str2;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new a(this.f44935y, this.f44936z, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((a) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f44933w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    UserApi userApi = i0.this.f44931x;
                    String str = this.f44935y;
                    String str2 = this.f44936z;
                    this.f44933w = 1;
                    obj = userApi.getSeasonRatingLiveResult(str, str2, this);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                i0.this.f44930w.a(new v0.b((SeasonRatingLiveResult) obj));
            } catch (Throwable th2) {
                i0.this.f44930w.a(new v0.a(MRErrorKt.convertMRException(th2).getError()));
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrorman.actioncreator.SeasonRatingActionCreator$fetchStatus$1", f = "SeasonRatingActionCreator.kt", l = {34}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class b extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f44937w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f44939y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, ao.d<? super b> dVar) {
            super(2, dVar);
            this.f44939y = str;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new b(this.f44939y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((b) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f44937w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    UserApi userApi = i0.this.f44931x;
                    String str = this.f44939y;
                    this.f44937w = 1;
                    obj = UserApi.DefaultImpls.getSeasonRatingStatus$default(userApi, str, null, this, 2, null);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                i0.this.f44930w.a(new v0.d((SeasonRatingStatusResponse) obj));
            } catch (Throwable unused) {
            }
            return wn.v.f59242a;
        }
    }

    public i0(q8.a aVar, UserApi userApi) {
        jo.p.h(aVar, "dispatcher");
        jo.p.h(userApi, "userApi");
        this.f44930w = aVar;
        this.f44931x = userApi;
        this.f44932y = uo.r0.b();
    }

    public final void c(String str, String str2) {
        jo.p.h(str, "referer");
        jo.p.h(str2, "liveId");
        uo.l.d(this, null, null, new a(str, str2, null), 3, null);
    }

    public final void d(String str) {
        jo.p.h(str, "referer");
        uo.l.d(this, null, null, new b(str, null), 3, null);
    }

    public final void e() {
        this.f44930w.a(v0.c.f47299a);
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.f44932y.getCoroutineContext();
    }
}
