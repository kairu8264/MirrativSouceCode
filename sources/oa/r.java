package oa;

import com.dena.mirrativ.mirrativapi.livegame.LiveGameApi;
import com.dena.mirrativ.mirrativapi.livegame.LiveGameDailyRankingYesterdayResponse;
import oa.s;
import uo.q0;

/* loaded from: classes.dex */
public final class r implements q0 {

    /* renamed from: w  reason: collision with root package name */
    public final q8.a f44493w;

    /* renamed from: x  reason: collision with root package name */
    public final LiveGameApi f44494x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ da.b f44495y;

    @co.f(c = "com.dena.mirrativ.livegame.ranking.LiveGameDailyRankingYesterdayActionCreator$load$1", f = "LiveGameDailyRankingYesterdayActionCreator.kt", l = {17}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class a extends co.l implements io.p<q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f44496w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f44498y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, ao.d<? super a> dVar) {
            super(2, dVar);
            this.f44498y = str;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new a(this.f44498y, dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((a) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f44496w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    LiveGameApi liveGameApi = r.this.f44494x;
                    String str = this.f44498y;
                    this.f44496w = 1;
                    obj = liveGameApi.getLiveGameDailyRankingYesterday(str, "", this);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                r.this.f44493w.a(new s.e((LiveGameDailyRankingYesterdayResponse) obj));
            } catch (Throwable unused) {
                r.this.f44493w.a(s.b.f44504a);
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrativ.livegame.ranking.LiveGameDailyRankingYesterdayActionCreator$loadNext$1", f = "LiveGameDailyRankingYesterdayActionCreator.kt", l = {29}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class b extends co.l implements io.p<q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f44499w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f44501y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ String f44502z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, String str2, ao.d<? super b> dVar) {
            super(2, dVar);
            this.f44501y = str;
            this.f44502z = str2;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new b(this.f44501y, this.f44502z, dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((b) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f44499w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    LiveGameApi liveGameApi = r.this.f44494x;
                    String str = this.f44501y;
                    String str2 = this.f44502z;
                    this.f44499w = 1;
                    obj = liveGameApi.getLiveGameDailyRankingYesterday(str, str2, this);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                r.this.f44493w.a(new s.d((LiveGameDailyRankingYesterdayResponse) obj));
            } catch (Throwable unused) {
                r.this.f44493w.a(s.b.f44504a);
            }
            return wn.v.f59242a;
        }
    }

    public r(q8.a aVar, LiveGameApi liveGameApi) {
        jo.p.h(aVar, "dispatcher");
        jo.p.h(liveGameApi, "liveGameApi");
        this.f44493w = aVar;
        this.f44494x = liveGameApi;
        this.f44495y = new da.b();
    }

    public final void c(String str) {
        jo.p.h(str, "referer");
        this.f44493w.a(s.a.f44503a);
        uo.l.d(this, null, null, new a(str, null), 3, null);
    }

    public final void d(String str, String str2) {
        jo.p.h(str, "referer");
        jo.p.h(str2, "nextCursor");
        this.f44493w.a(s.c.f44505a);
        uo.l.d(this, null, null, new b(str, str2, null), 3, null);
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.f44495y.getCoroutineContext();
    }
}
