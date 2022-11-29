package od;

import com.dena.mirrativ.mirrativapi.core.ApiUtil;
import com.dena.mirrativ.mirrativapi.core.MRErrorKt;
import com.dena.mirrorman.net.api.Referer;
import com.dena.mirrorman.net.api.response.App;
import com.dena.mirrorman.net.retrofit.MRRequest;
import java.util.List;
import pd.d;
import uo.g1;
import uo.i2;

/* loaded from: classes2.dex */
public final class c implements uo.q0 {

    /* renamed from: w  reason: collision with root package name */
    public final q8.a f44727w;

    /* renamed from: x  reason: collision with root package name */
    public final MRRequest f44728x;

    /* renamed from: y  reason: collision with root package name */
    public final ao.g f44729y;

    /* renamed from: z  reason: collision with root package name */
    public static final a f44726z = new a(null);
    public static final int A = 8;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }
    }

    @co.f(c = "com.dena.mirrorman.actioncreator.ChooseMyAppsActionCreator$getRecommendApps$1", f = "ChooseMyAppsActionCreator.kt", l = {29}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class b extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f44730w;

        public b(ao.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new b(dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((b) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f44730w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    MRRequest mRRequest = c.this.f44728x;
                    this.f44730w = 1;
                    obj = mRRequest.getRecommendApps(Referer.TUTORIAL, this);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                c.this.f44727w.a(new d.e((App.Apps) obj));
            } catch (Throwable th2) {
                c.this.f44727w.a(new d.C0713d(MRErrorKt.convertMRException(th2).getError()));
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrorman.actioncreator.ChooseMyAppsActionCreator$loadMoreApps$1", f = "ChooseMyAppsActionCreator.kt", l = {54}, m = "invokeSuspend")
    /* renamed from: od.c$c  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0677c extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f44732w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f44734y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ int f44735z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0677c(String str, int i10, ao.d<? super C0677c> dVar) {
            super(2, dVar);
            this.f44734y = str;
            this.f44735z = i10;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new C0677c(this.f44734y, this.f44735z, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((C0677c) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f44732w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    MRRequest mRRequest = c.this.f44728x;
                    String str = this.f44734y;
                    Integer d10 = co.b.d(this.f44735z);
                    this.f44732w = 1;
                    obj = mRRequest.getAppSearch(Referer.TUTORIAL, str, null, d10, this);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                c.this.f44727w.a(new d.c((App.Apps) obj));
            } catch (Throwable th2) {
                c.this.f44727w.a(new d.b(MRErrorKt.convertMRException(th2).getError()));
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrorman.actioncreator.ChooseMyAppsActionCreator$registerMyApps$1", f = "ChooseMyAppsActionCreator.kt", l = {77}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class d extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f44736w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ List<String> f44738y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(List<String> list, ao.d<? super d> dVar) {
            super(2, dVar);
            this.f44738y = list;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new d(this.f44738y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((d) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f44736w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    MRRequest mRRequest = c.this.f44728x;
                    ep.c0 appMyAppRequestBody = ApiUtil.INSTANCE.appMyAppRequestBody(this.f44738y);
                    this.f44736w = 1;
                    if (mRRequest.postAddMyApp(Referer.TUTORIAL, appMyAppRequestBody, this) == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                c.this.f44727w.a(d.g.f46701a);
            } catch (Throwable th2) {
                c.this.f44727w.a(new d.f(MRErrorKt.convertMRException(th2).getError()));
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrorman.actioncreator.ChooseMyAppsActionCreator$searchApps$1", f = "ChooseMyAppsActionCreator.kt", l = {42}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class e extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f44739w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f44741y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str, ao.d<? super e> dVar) {
            super(2, dVar);
            this.f44741y = str;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new e(this.f44741y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((e) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f44739w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    MRRequest mRRequest = c.this.f44728x;
                    String str = this.f44741y;
                    this.f44739w = 1;
                    obj = MRRequest.DefaultImpls.getAppSearch$default(mRRequest, Referer.TUTORIAL, str, null, null, this, 12, null);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                c.this.f44727w.a(new d.i((App.Apps) obj));
            } catch (Throwable th2) {
                c.this.f44727w.a(new d.h(MRErrorKt.convertMRException(th2).getError()));
            }
            return wn.v.f59242a;
        }
    }

    public c(q8.a aVar, MRRequest mRRequest) {
        uo.b0 b10;
        jo.p.h(aVar, "dispatcher");
        jo.p.h(mRRequest, "request");
        this.f44727w = aVar;
        this.f44728x = mRRequest;
        uo.k0 b11 = g1.b();
        b10 = i2.b(null, 1, null);
        this.f44729y = b11.plus(b10);
    }

    public final void c(String str) {
        jo.p.h(str, "appId");
        this.f44727w.a(new d.a(str));
    }

    public final void d() {
        this.f44727w.a(d.l.f46706a);
        uo.l.d(this, null, null, new b(null), 3, null);
    }

    public final void e(String str, int i10) {
        jo.p.h(str, "searchText");
        this.f44727w.a(d.k.f46705a);
        uo.l.d(this, null, null, new C0677c(str, i10, null), 3, null);
    }

    public final void f(List<String> list) {
        jo.p.h(list, "appIds");
        uo.l.d(this, null, null, new d(list, null), 3, null);
    }

    public final void g(String str) {
        jo.p.h(str, "searchText");
        this.f44727w.a(d.l.f46706a);
        this.f44727w.a(new d.m(str));
        uo.l.d(this, null, null, new e(str, null), 3, null);
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.f44729y;
    }

    public final void h() {
        this.f44727w.a(d.j.f46704a);
    }

    public final void i(String str) {
        jo.p.h(str, "appId");
        this.f44727w.a(new d.n(str));
    }
}
