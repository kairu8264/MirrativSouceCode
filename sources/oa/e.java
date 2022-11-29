package oa;

import com.dena.mirrativ.mirrativapi.livegame.LiveGameApi;
import com.dena.mirrativ.mirrativapi.livegame.LiveGameDailyRankingResponse;
import na.b;
import oa.f;
import uo.q0;

/* loaded from: classes.dex */
public final class e implements q0 {

    /* renamed from: w  reason: collision with root package name */
    public final q8.a f44328w;

    /* renamed from: x  reason: collision with root package name */
    public final LiveGameApi f44329x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ da.b f44330y;

    @co.f(c = "com.dena.mirrativ.livegame.ranking.LiveGameDailyRankingActionCreator$load$1", f = "LiveGameDailyRankingActionCreator.kt", l = {18}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class a extends co.l implements io.p<q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f44331w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f44333y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ String f44334z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, String str2, ao.d<? super a> dVar) {
            super(2, dVar);
            this.f44333y = str;
            this.f44334z = str2;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new a(this.f44333y, this.f44334z, dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((a) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f44331w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    LiveGameApi liveGameApi = e.this.f44329x;
                    String str = this.f44333y;
                    String str2 = this.f44334z;
                    this.f44331w = 1;
                    obj = liveGameApi.getLiveGameDailyRankingToday(str, "", str2, this);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                e.this.f44328w.a(new f.e((LiveGameDailyRankingResponse) obj));
            } catch (Throwable unused) {
                e.this.f44328w.a(f.b.f44340a);
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrativ.livegame.ranking.LiveGameDailyRankingActionCreator$loadNext$1", f = "LiveGameDailyRankingActionCreator.kt", l = {30}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class b extends co.l implements io.p<q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f44335w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f44337y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ String f44338z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, String str2, ao.d<? super b> dVar) {
            super(2, dVar);
            this.f44337y = str;
            this.f44338z = str2;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new b(this.f44337y, this.f44338z, dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((b) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f44335w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    LiveGameApi liveGameApi = e.this.f44329x;
                    String str = this.f44337y;
                    String str2 = this.f44338z;
                    this.f44335w = 1;
                    obj = liveGameApi.getLiveGameDailyRankingToday(str, str2, null, this);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                e.this.f44328w.a(new f.d((LiveGameDailyRankingResponse) obj));
            } catch (Throwable unused) {
                e.this.f44328w.a(f.b.f44340a);
            }
            return wn.v.f59242a;
        }
    }

    public e(q8.a aVar, LiveGameApi liveGameApi) {
        jo.p.h(aVar, "dispatcher");
        jo.p.h(liveGameApi, "liveGameApi");
        this.f44328w = aVar;
        this.f44329x = liveGameApi;
        this.f44330y = new da.b();
    }

    public final void c(String str, String str2) {
        jo.p.h(str, "referer");
        this.f44328w.a(f.a.f44339a);
        uo.l.d(this, null, null, new a(str, str2, null), 3, null);
    }

    public final void d(String str, String str2) {
        jo.p.h(str, "referer");
        jo.p.h(str2, "nextCursor");
        this.f44328w.a(b.d.f41641a);
        uo.l.d(this, null, null, new b(str, str2, null), 3, null);
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.f44330y.getCoroutineContext();
    }
}
