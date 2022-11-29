package c9;

import c9.b;
import com.dena.mirrativ.mirrativapi.core.ApiUtil;
import com.dena.mirrativ.mirrativapi.core.MRErrorKt;
import com.dena.mirrorman.net.api.response.App;
import com.dena.mirrorman.net.api.response.Graph;
import com.dena.mirrorman.net.api.response.user.UrgeUsersResponse;
import com.dena.mirrorman.net.retrofit.MRRequest;
import hf.c;
import pd.s;
import uo.q0;

/* loaded from: classes.dex */
public final class a implements q0 {

    /* renamed from: w  reason: collision with root package name */
    public final q8.a f18856w;

    /* renamed from: x  reason: collision with root package name */
    public final MRRequest f18857x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ da.b f18858y;

    @co.f(c = "com.dena.mirrativ.catalog.search.SearchActionCreator$appToggleRegistration$1", f = "SearchActionCreator.kt", l = {125, 131}, m = "invokeSuspend")
    /* renamed from: c9.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0139a extends co.l implements io.p<q0, ao.d<? super wn.v>, Object> {
        public final /* synthetic */ c.a A;

        /* renamed from: w  reason: collision with root package name */
        public int f18859w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ boolean f18860x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ a f18861y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ String f18862z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0139a(boolean z10, a aVar, String str, c.a aVar2, ao.d<? super C0139a> dVar) {
            super(2, dVar);
            this.f18860x = z10;
            this.f18861y = aVar;
            this.f18862z = str;
            this.A = aVar2;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new C0139a(this.f18860x, this.f18861y, this.f18862z, this.A, dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((C0139a) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f18859w;
            if (i10 != 0) {
                if (i10 == 1) {
                    wn.m.b(obj);
                    this.f18861y.f18856w.a(new s.a(this.A.c()));
                    return wn.v.f59242a;
                } else if (i10 == 2) {
                    wn.m.b(obj);
                    this.f18861y.f18856w.a(new s.c(this.A.c()));
                    return wn.v.f59242a;
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
            wn.m.b(obj);
            if (this.f18860x) {
                MRRequest mRRequest = this.f18861y.f18857x;
                String str = this.f18862z;
                ep.c0 appMyAppRequestBody = ApiUtil.INSTANCE.appMyAppRequestBody(xn.r.d(this.A.d()));
                this.f18859w = 1;
                if (mRRequest.postAddMyApp(str, appMyAppRequestBody, this) == c10) {
                    return c10;
                }
                this.f18861y.f18856w.a(new s.a(this.A.c()));
                return wn.v.f59242a;
            }
            MRRequest mRRequest2 = this.f18861y.f18857x;
            String str2 = this.f18862z;
            ep.c0 appMyAppRequestBody2 = ApiUtil.INSTANCE.appMyAppRequestBody(xn.r.d(this.A.d()));
            this.f18859w = 2;
            if (mRRequest2.postDeleteMyApp(str2, appMyAppRequestBody2, this) == c10) {
                return c10;
            }
            this.f18861y.f18856w.a(new s.c(this.A.c()));
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrativ.catalog.search.SearchActionCreator$fetchAppsBySearch$1", f = "SearchActionCreator.kt", l = {97}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class b extends co.l implements io.p<q0, ao.d<? super wn.v>, Object> {
        public final /* synthetic */ Integer A;
        public final /* synthetic */ boolean B;
        public final /* synthetic */ boolean C;

        /* renamed from: w  reason: collision with root package name */
        public int f18863w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f18865y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ String f18866z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, String str2, Integer num, boolean z10, boolean z11, ao.d<? super b> dVar) {
            super(2, dVar);
            this.f18865y = str;
            this.f18866z = str2;
            this.A = num;
            this.B = z10;
            this.C = z11;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new b(this.f18865y, this.f18866z, this.A, this.B, this.C, dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((b) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f18863w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    MRRequest mRRequest = a.this.f18857x;
                    String str = this.f18865y;
                    String str2 = this.f18866z;
                    Integer num = this.A;
                    this.f18863w = 1;
                    obj = mRRequest.getAppSearch(str, str2, null, num, this);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                a.this.f18856w.a(new b.c((App.Apps) obj, this.B, this.C));
            } catch (Exception e10) {
                a.this.f18856w.a(new b.C0140b(MRErrorKt.convertMRException(e10).getError(), this.C));
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrativ.catalog.search.SearchActionCreator$fetchRecommendedApps$1", f = "SearchActionCreator.kt", l = {79}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class c extends co.l implements io.p<q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f18867w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f18869y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ boolean f18870z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, boolean z10, ao.d<? super c> dVar) {
            super(2, dVar);
            this.f18869y = str;
            this.f18870z = z10;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new c(this.f18869y, this.f18870z, dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((c) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f18867w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    MRRequest mRRequest = a.this.f18857x;
                    String str = this.f18869y;
                    if (str == null) {
                        str = "";
                    }
                    this.f18867w = 1;
                    obj = mRRequest.getRecommendApps(str, this);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                a.this.f18856w.a(new b.d((App.Apps) obj, this.f18870z));
            } catch (Exception e10) {
                a.this.f18856w.a(new b.C0140b(MRErrorKt.convertMRException(e10).getError(), this.f18870z));
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrativ.catalog.search.SearchActionCreator$fetchRecommendedUsers$1", f = "SearchActionCreator.kt", l = {22}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class d extends co.l implements io.p<q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f18871w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f18873y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, ao.d<? super d> dVar) {
            super(2, dVar);
            this.f18873y = str;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new d(this.f18873y, dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((d) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f18871w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    MRRequest mRRequest = a.this.f18857x;
                    String str = this.f18873y;
                    this.f18871w = 1;
                    obj = MRRequest.DefaultImpls.getRecommendedUsers$default(mRRequest, str, 0, this, 2, null);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                a.this.f18856w.a(new b.e((Graph.RecommendUserList) obj));
            } catch (Exception e10) {
                a.this.f18856w.a(new b.f(MRErrorKt.convertMRException(e10).getError()));
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrativ.catalog.search.SearchActionCreator$fetchUsersBySearch$1", f = "SearchActionCreator.kt", l = {34}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class e extends co.l implements io.p<q0, ao.d<? super wn.v>, Object> {
        public final /* synthetic */ Integer A;

        /* renamed from: w  reason: collision with root package name */
        public int f18874w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f18876y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ String f18877z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str, String str2, Integer num, ao.d<? super e> dVar) {
            super(2, dVar);
            this.f18876y = str;
            this.f18877z = str2;
            this.A = num;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new e(this.f18876y, this.f18877z, this.A, dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((e) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f18874w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    MRRequest mRRequest = a.this.f18857x;
                    String str = this.f18876y;
                    String str2 = this.f18877z;
                    Integer num = this.A;
                    this.f18874w = 1;
                    obj = mRRequest.getUserSearch(str, str2, num, this);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                a.this.f18856w.a(new b.g((UrgeUsersResponse) obj));
            } catch (Throwable th2) {
                a.this.f18856w.a(new b.f(MRErrorKt.convertMRException(th2).getError()));
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrativ.catalog.search.SearchActionCreator$followUser$1", f = "SearchActionCreator.kt", l = {45}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class f extends co.l implements io.p<q0, ao.d<? super wn.v>, Object> {
        public final /* synthetic */ int A;

        /* renamed from: w  reason: collision with root package name */
        public int f18878w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f18880y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ String f18881z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String str, String str2, int i10, ao.d<? super f> dVar) {
            super(2, dVar);
            this.f18880y = str;
            this.f18881z = str2;
            this.A = i10;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new f(this.f18880y, this.f18881z, this.A, dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((f) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f18878w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    MRRequest mRRequest = a.this.f18857x;
                    String str = this.f18880y;
                    String str2 = this.f18881z;
                    this.f18878w = 1;
                    if (mRRequest.postFollow(str, str2, this) == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                a.this.f18856w.a(new nd.y(this.f18881z, true));
            } catch (Exception e10) {
                a.this.f18856w.a(new nd.r(this.A, false, MRErrorKt.convertMRException(e10).getError()));
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrativ.catalog.search.SearchActionCreator$unFollowUser$1", f = "SearchActionCreator.kt", l = {62}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class g extends co.l implements io.p<q0, ao.d<? super wn.v>, Object> {
        public final /* synthetic */ int A;

        /* renamed from: w  reason: collision with root package name */
        public int f18882w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f18884y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ String f18885z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(String str, String str2, int i10, ao.d<? super g> dVar) {
            super(2, dVar);
            this.f18884y = str;
            this.f18885z = str2;
            this.A = i10;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new g(this.f18884y, this.f18885z, this.A, dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((g) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f18882w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    MRRequest mRRequest = a.this.f18857x;
                    String str = this.f18884y;
                    String str2 = this.f18885z;
                    this.f18882w = 1;
                    if (mRRequest.postUnfollow(str, str2, this) == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                a.this.f18856w.a(new nd.y(this.f18885z, false));
            } catch (Exception e10) {
                a.this.f18856w.a(new nd.r(this.A, true, MRErrorKt.convertMRException(e10).getError()));
            }
            return wn.v.f59242a;
        }
    }

    public a(q8.a aVar, MRRequest mRRequest) {
        jo.p.h(aVar, "dispatcher");
        jo.p.h(mRRequest, "request");
        this.f18856w = aVar;
        this.f18857x = mRRequest;
        this.f18858y = new da.b();
    }

    public final void c(String str, c.a aVar, boolean z10) {
        jo.p.h(str, "mReferer");
        jo.p.h(aVar, "appInfo");
        this.f18856w.a(new b.a(aVar));
        uo.l.d(this, null, null, new C0139a(z10, this, str, aVar, null), 3, null);
    }

    public final void d(String str, String str2, Integer num, boolean z10, boolean z11) {
        jo.p.h(str, "mReferer");
        jo.p.h(str2, "keyword");
        this.f18856w.a(new b.h(false, z11));
        uo.l.d(this, null, null, new b(str, str2, num, z10, z11, null), 3, null);
    }

    public final void e(String str, boolean z10) {
        uo.l.d(this, null, null, new c(str, z10, null), 3, null);
    }

    public final void f(String str) {
        jo.p.h(str, "mReferer");
        uo.l.d(this, null, null, new d(str, null), 3, null);
    }

    public final void g(String str, String str2, Integer num) {
        jo.p.h(str, "mReferer");
        jo.p.h(str2, "keyword");
        this.f18856w.a(new b.h(true, false));
        uo.l.d(this, null, null, new e(str, str2, num, null), 3, null);
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.f18858y.getCoroutineContext();
    }

    public final void h(String str, String str2, int i10) {
        jo.p.h(str, "mReferer");
        jo.p.h(str2, "userId");
        uo.l.d(this, null, null, new f(str, str2, i10, null), 3, null);
    }

    public final void i(String str, String str2, int i10) {
        jo.p.h(str, "mReferer");
        jo.p.h(str2, "userId");
        uo.l.d(this, null, null, new g(str, str2, i10, null), 3, null);
    }
}
