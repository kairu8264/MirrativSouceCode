package na;

import co.l;
import com.dena.mirrativ.mirrativapi.core.MRErrorKt;
import com.dena.mirrativ.mirrativapi.livegame.LiveGameApi;
import com.dena.mirrativ.mirrativapi.livegame.LiveGameListResponse;
import com.dena.mirrativ.mirrativapi.livegame.LiveGameStartResponse;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import hf.v0;
import kf.p;
import na.b;
import uo.q0;
import wn.m;
import wn.v;

/* loaded from: classes.dex */
public final class a implements q0 {
    public final /* synthetic */ da.b A;

    /* renamed from: w  reason: collision with root package name */
    public final q8.a f41623w;

    /* renamed from: x  reason: collision with root package name */
    public final LiveGameApi f41624x;

    /* renamed from: y  reason: collision with root package name */
    public final v0 f41625y;

    /* renamed from: z  reason: collision with root package name */
    public final p f41626z;

    @co.f(c = "com.dena.mirrativ.livegame.listing.LiveGameListingActionCreator$load$1", f = "LiveGameListingActionCreator.kt", l = {22}, m = "invokeSuspend")
    /* renamed from: na.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0619a extends l implements io.p<q0, ao.d<? super v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f41627w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f41629y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0619a(String str, ao.d<? super C0619a> dVar) {
            super(2, dVar);
            this.f41629y = str;
        }

        @Override // co.a
        public final ao.d<v> create(Object obj, ao.d<?> dVar) {
            return new C0619a(this.f41629y, dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super v> dVar) {
            return ((C0619a) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f41627w;
            try {
                if (i10 == 0) {
                    m.b(obj);
                    LiveGameApi liveGameApi = a.this.f41624x;
                    String str = this.f41629y;
                    this.f41627w = 1;
                    obj = LiveGameApi.DefaultImpls.getLiveGameList$default(liveGameApi, str, null, this, 2, null);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    m.b(obj);
                }
                LiveGameListResponse liveGameListResponse = (LiveGameListResponse) obj;
                a.this.f41623w.a(new b.c(liveGameListResponse));
                a.this.f41626z.C0(liveGameListResponse.getLatestCreatedAt());
            } catch (Throwable unused) {
                a.this.f41623w.a(b.C0620b.f41639a);
            }
            return v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrativ.livegame.listing.LiveGameListingActionCreator$loadNext$1", f = "LiveGameListingActionCreator.kt", l = {35}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class b extends l implements io.p<q0, ao.d<? super v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f41630w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f41632y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ String f41633z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, String str2, ao.d<? super b> dVar) {
            super(2, dVar);
            this.f41632y = str;
            this.f41633z = str2;
        }

        @Override // co.a
        public final ao.d<v> create(Object obj, ao.d<?> dVar) {
            return new b(this.f41632y, this.f41633z, dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super v> dVar) {
            return ((b) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f41630w;
            try {
                if (i10 == 0) {
                    m.b(obj);
                    LiveGameApi liveGameApi = a.this.f41624x;
                    String str = this.f41632y;
                    String str2 = this.f41633z;
                    this.f41630w = 1;
                    obj = liveGameApi.getLiveGameList(str, str2, this);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    m.b(obj);
                }
                a.this.f41623w.a(new b.c((LiveGameListResponse) obj));
            } catch (Throwable unused) {
                a.this.f41623w.a(b.C0620b.f41639a);
            }
            return v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrativ.livegame.listing.LiveGameListingActionCreator$startPlay$1", f = "LiveGameListingActionCreator.kt", l = {50}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class c extends l implements io.p<q0, ao.d<? super v>, Object> {
        public final /* synthetic */ String A;

        /* renamed from: w  reason: collision with root package name */
        public int f41634w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f41636y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ String f41637z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, String str2, String str3, ao.d<? super c> dVar) {
            super(2, dVar);
            this.f41636y = str;
            this.f41637z = str2;
            this.A = str3;
        }

        @Override // co.a
        public final ao.d<v> create(Object obj, ao.d<?> dVar) {
            return new c(this.f41636y, this.f41637z, this.A, dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super v> dVar) {
            return ((c) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f41634w;
            try {
                if (i10 == 0) {
                    m.b(obj);
                    if (a.this.f41625y.j()) {
                        a.this.f41623w.a(b.g.f41644a);
                        return v.f59242a;
                    }
                    LiveGameApi liveGameApi = a.this.f41624x;
                    String str = this.f41636y;
                    String str2 = this.f41637z;
                    String str3 = this.A;
                    this.f41634w = 1;
                    obj = liveGameApi.postLiveGameStart(str, str2, false, str3, this);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    m.b(obj);
                }
                a.this.f41623w.a(new b.f((LiveGameStartResponse) obj));
            } catch (Throwable th2) {
                a.this.f41623w.a(new b.e(MRErrorKt.convertMRException(th2).getError()));
            }
            return v.f59242a;
        }
    }

    public a(q8.a aVar, LiveGameApi liveGameApi, v0 v0Var, p pVar) {
        jo.p.h(aVar, "dispatcher");
        jo.p.h(liveGameApi, "liveGameApi");
        jo.p.h(v0Var, "userHelper");
        jo.p.h(pVar, "noticePreference");
        this.f41623w = aVar;
        this.f41624x = liveGameApi;
        this.f41625y = v0Var;
        this.f41626z = pVar;
        this.A = new da.b();
    }

    public final void e(String str) {
        jo.p.h(str, "referer");
        this.f41623w.a(b.a.f41638a);
        uo.l.d(this, null, null, new C0619a(str, null), 3, null);
    }

    public final void f(String str, String str2) {
        jo.p.h(str, "referer");
        jo.p.h(str2, "nextCursor");
        this.f41623w.a(b.d.f41641a);
        uo.l.d(this, null, null, new b(str, str2, null), 3, null);
    }

    public final void g(String str, String str2, String str3) {
        jo.p.h(str, "referer");
        jo.p.h(str2, TtmlNode.ATTR_ID);
        uo.l.d(this, null, null, new c(str, str2, str3, null), 3, null);
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.A.getCoroutineContext();
    }
}
