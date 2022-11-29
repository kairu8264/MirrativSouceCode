package od;

import com.dena.mirrativ.mirrativapi.core.MRErrorKt;
import com.dena.mirrorman.net.api.response.LiveGiftRankingResponse;
import com.dena.mirrorman.net.retrofit.MRRequest;
import pd.e0;

/* loaded from: classes2.dex */
public final class v implements uo.q0 {

    /* renamed from: w  reason: collision with root package name */
    public final jf.x f45307w;

    /* renamed from: x  reason: collision with root package name */
    public final q8.a f45308x;

    /* renamed from: y  reason: collision with root package name */
    public final MRRequest f45309y;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ uo.q0 f45310z;

    @co.f(c = "com.dena.mirrorman.actioncreator.LiveGiftRankingUsersActionCreator$loadNext$1", f = "LiveGiftRankingUsersActionCreator.kt", l = {39}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {
        public final /* synthetic */ String A;

        /* renamed from: w  reason: collision with root package name */
        public int f45311w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f45313y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ String f45314z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, String str2, String str3, ao.d<? super a> dVar) {
            super(2, dVar);
            this.f45313y = str;
            this.f45314z = str2;
            this.A = str3;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new a(this.f45313y, this.f45314z, this.A, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((a) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f45311w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    MRRequest mRRequest = v.this.f45309y;
                    String str = this.f45313y;
                    String str2 = this.f45314z;
                    String c11 = v.this.f45307w.c();
                    String str3 = this.A;
                    this.f45311w = 1;
                    obj = mRRequest.getStreamGiftRanking(str, str2, c11, str3, this);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                v.this.f45308x.a(new e0.b(v.this.f45307w, (LiveGiftRankingResponse) obj));
            } catch (Throwable th2) {
                v.this.f45308x.a(new e0.a(v.this.f45307w, MRErrorKt.convertMRException(th2).getError()));
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrorman.actioncreator.LiveGiftRankingUsersActionCreator$reload$1", f = "LiveGiftRankingUsersActionCreator.kt", l = {22}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class b extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f45315w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f45317y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ String f45318z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, String str2, ao.d<? super b> dVar) {
            super(2, dVar);
            this.f45317y = str;
            this.f45318z = str2;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new b(this.f45317y, this.f45318z, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((b) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f45315w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    MRRequest mRRequest = v.this.f45309y;
                    String str = this.f45317y;
                    String str2 = this.f45318z;
                    String c11 = v.this.f45307w.c();
                    this.f45315w = 1;
                    obj = MRRequest.DefaultImpls.getStreamGiftRanking$default(mRRequest, str, str2, c11, null, this, 8, null);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                v.this.f45308x.a(new e0.b(v.this.f45307w, (LiveGiftRankingResponse) obj));
            } catch (Throwable th2) {
                v.this.f45308x.a(new e0.a(v.this.f45307w, MRErrorKt.convertMRException(th2).getError()));
            }
            return wn.v.f59242a;
        }
    }

    public v(jf.x xVar, q8.a aVar, MRRequest mRRequest) {
        jo.p.h(xVar, "rankingType");
        jo.p.h(aVar, "dispatcher");
        jo.p.h(mRRequest, "request");
        this.f45307w = xVar;
        this.f45308x = aVar;
        this.f45309y = mRRequest;
        this.f45310z = uo.r0.b();
    }

    public final void d(String str, String str2, String str3) {
        jo.p.h(str, "referer");
        jo.p.h(str2, "liveId");
        jo.p.h(str3, "nextCursor");
        this.f45308x.a(new e0.c(this.f45307w));
        uo.l.d(this, null, null, new a(str, str2, str3, null), 3, null);
    }

    public final void e(String str, String str2) {
        jo.p.h(str, "referer");
        jo.p.h(str2, "liveId");
        this.f45308x.a(new e0.d(this.f45307w));
        uo.l.d(this, null, null, new b(str, str2, null), 3, null);
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.f45310z.getCoroutineContext();
    }
}
