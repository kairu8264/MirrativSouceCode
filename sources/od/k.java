package od;

import com.dena.mirrativ.mirrativapi.core.MRErrorKt;
import com.dena.mirrorman.net.api.response.Graph;
import com.dena.mirrorman.net.retrofit.MRRequest;
import hf.v0;
import pd.o;
import uo.g1;
import uo.i2;

/* loaded from: classes2.dex */
public final class k implements uo.q0 {
    public final ao.g A;

    /* renamed from: w  reason: collision with root package name */
    public final String f44950w;

    /* renamed from: x  reason: collision with root package name */
    public final v0 f44951x;

    /* renamed from: y  reason: collision with root package name */
    public final q8.a f44952y;

    /* renamed from: z  reason: collision with root package name */
    public final MRRequest f44953z;

    @co.f(c = "com.dena.mirrorman.actioncreator.FollowPushSettingsActionCreator$loadNext$1", f = "FollowPushSettingsActionCreator.kt", l = {41}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f44954w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ int f44956y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i10, ao.d<? super a> dVar) {
            super(2, dVar);
            this.f44956y = i10;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new a(this.f44956y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((a) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f44954w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    MRRequest mRRequest = k.this.f44953z;
                    String str = k.this.f44950w;
                    String x10 = k.this.f44951x.x();
                    Integer d10 = co.b.d(this.f44956y);
                    this.f44954w = 1;
                    obj = mRRequest.getFollowingUsers(str, x10, d10, this);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                k.this.f44952y.a(new o.c((Graph.FollowingList) obj));
            } catch (Throwable th2) {
                k.this.f44952y.a(new o.b(MRErrorKt.convertMRException(th2).getError()));
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrorman.actioncreator.FollowPushSettingsActionCreator$reload$1", f = "FollowPushSettingsActionCreator.kt", l = {26}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class b extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f44957w;

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
            int i10 = this.f44957w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    MRRequest mRRequest = k.this.f44953z;
                    String str = k.this.f44950w;
                    String x10 = k.this.f44951x.x();
                    this.f44957w = 1;
                    obj = MRRequest.DefaultImpls.getFollowingUsers$default(mRRequest, str, x10, null, this, 4, null);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                k.this.f44952y.a(new o.c((Graph.FollowingList) obj));
            } catch (Throwable th2) {
                k.this.f44952y.a(new o.b(MRErrorKt.convertMRException(th2).getError()));
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrorman.actioncreator.FollowPushSettingsActionCreator$updateFollowNotificationSetting$1", f = "FollowPushSettingsActionCreator.kt", l = {62}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class c extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f44959w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f44961y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ boolean f44962z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, boolean z10, ao.d<? super c> dVar) {
            super(2, dVar);
            this.f44961y = str;
            this.f44962z = z10;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new c(this.f44961y, this.f44962z, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((c) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f44959w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    MRRequest mRRequest = k.this.f44953z;
                    String str = k.this.f44950w;
                    String str2 = this.f44961y;
                    int i11 = this.f44962z ? 1 : 0;
                    this.f44959w = 1;
                    if (mRRequest.postFollowNotificationSetting(str, str2, i11, this) == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
            } catch (Exception e10) {
                k.this.f44952y.a(new o.a(this.f44961y, true ^ this.f44962z, MRErrorKt.convertMRException(e10).getError()));
            }
            return wn.v.f59242a;
        }
    }

    public k(String str, v0 v0Var, q8.a aVar, MRRequest mRRequest) {
        uo.b0 b10;
        jo.p.h(str, "referer");
        jo.p.h(v0Var, "userHelper");
        jo.p.h(aVar, "dispatcher");
        jo.p.h(mRRequest, "request");
        this.f44950w = str;
        this.f44951x = v0Var;
        this.f44952y = aVar;
        this.f44953z = mRRequest;
        uo.k0 b11 = g1.b();
        b10 = i2.b(null, 1, null);
        this.A = b11.plus(b10);
    }

    public final void e(int i10) {
        this.f44952y.a(o.d.f47091a);
        uo.l.d(this, null, null, new a(i10, null), 3, null);
    }

    public final void f() {
        this.f44952y.a(o.e.f47092a);
        uo.l.d(this, null, null, new b(null), 3, null);
    }

    public final void g(String str, boolean z10) {
        jo.p.h(str, "followUserId");
        this.f44952y.a(new o.f(str, z10));
        uo.l.d(this, null, null, new c(str, z10, null), 3, null);
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.A;
    }
}
