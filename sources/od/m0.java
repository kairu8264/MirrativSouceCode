package od;

import com.dena.mirrativ.mirrativapi.core.MRErrorKt;
import com.dena.mirrorman.net.api.response.event.ShooterAcceptMatchingResponse;
import com.dena.mirrorman.net.api.response.event.ShooterMatchingResponse;
import com.dena.mirrorman.net.retrofit.MRRequest;
import pd.a1;

/* loaded from: classes2.dex */
public final class m0 implements uo.q0 {

    /* renamed from: w  reason: collision with root package name */
    public final q8.a f45048w;

    /* renamed from: x  reason: collision with root package name */
    public final MRRequest f45049x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ da.b f45050y;

    @co.f(c = "com.dena.mirrorman.actioncreator.ShooterMatchingActionCreator$acceptMatching$1", f = "ShooterMatchingActionCreator.kt", l = {32}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f45051w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f45053y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, ao.d<? super a> dVar) {
            super(2, dVar);
            this.f45053y = str;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new a(this.f45053y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((a) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f45051w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    MRRequest mRRequest = m0.this.f45049x;
                    String str = this.f45053y;
                    this.f45051w = 1;
                    obj = mRRequest.acceptShooterMatching(str, this);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                m0.this.f45048w.a(new a1.c(((ShooterAcceptMatchingResponse) obj).getLiveId()));
            } catch (Throwable th2) {
                m0.this.f45048w.a(new a1.a(MRErrorKt.convertMRException(th2).getError()));
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrorman.actioncreator.ShooterMatchingActionCreator$cancelMatching$1", f = "ShooterMatchingActionCreator.kt", l = {44}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class b extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f45054w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f45056y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, ao.d<? super b> dVar) {
            super(2, dVar);
            this.f45056y = str;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new b(this.f45056y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((b) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f45054w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    MRRequest mRRequest = m0.this.f45049x;
                    String str = this.f45056y;
                    this.f45054w = 1;
                    if (mRRequest.cancelShooterMatching(str, this) == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                m0.this.f45048w.a(a1.f.f46583a);
            } catch (Throwable th2) {
                m0.this.f45048w.a(new a1.d(MRErrorKt.convertMRException(th2).getError()));
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrorman.actioncreator.ShooterMatchingActionCreator$fetchMatchingInfo$1", f = "ShooterMatchingActionCreator.kt", l = {20}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class c extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f45057w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f45059y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, ao.d<? super c> dVar) {
            super(2, dVar);
            this.f45059y = str;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new c(this.f45059y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((c) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f45057w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    MRRequest mRRequest = m0.this.f45049x;
                    String str = this.f45059y;
                    this.f45057w = 1;
                    obj = mRRequest.getShooterMatching(str, this);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                m0.this.f45048w.a(new a1.i((ShooterMatchingResponse) obj));
            } catch (Throwable th2) {
                m0.this.f45048w.a(new a1.g(MRErrorKt.convertMRException(th2).getError()));
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrorman.actioncreator.ShooterMatchingActionCreator$requestMatching$1", f = "ShooterMatchingActionCreator.kt", l = {56}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class d extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f45060w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f45062y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, ao.d<? super d> dVar) {
            super(2, dVar);
            this.f45062y = str;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new d(this.f45062y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((d) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f45060w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    MRRequest mRRequest = m0.this.f45049x;
                    String str = this.f45062y;
                    this.f45060w = 1;
                    if (mRRequest.requestShooterMatching(str, this) == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                m0.this.f45048w.a(a1.l.f46589a);
            } catch (Throwable th2) {
                m0.this.f45048w.a(new a1.j(MRErrorKt.convertMRException(th2).getError()));
            }
            return wn.v.f59242a;
        }
    }

    public m0(q8.a aVar, MRRequest mRRequest) {
        jo.p.h(aVar, "dispatcher");
        jo.p.h(mRRequest, "request");
        this.f45048w = aVar;
        this.f45049x = mRRequest;
        this.f45050y = new da.b();
    }

    public final void a(String str) {
        jo.p.h(str, "referer");
        this.f45048w.a(a1.b.f46579a);
        uo.l.d(this, null, null, new a(str, null), 3, null);
    }

    public final void d(String str) {
        jo.p.h(str, "referer");
        this.f45048w.a(a1.e.f46582a);
        uo.l.d(this, null, null, new b(str, null), 3, null);
    }

    public final void e(String str) {
        jo.p.h(str, "referer");
        this.f45048w.a(a1.h.f46585a);
        uo.l.d(this, null, null, new c(str, null), 3, null);
    }

    public final void f() {
        this.f45048w.a(a1.m.f46590a);
    }

    public final void g(String str) {
        jo.p.h(str, "referer");
        this.f45048w.a(a1.k.f46588a);
        uo.l.d(this, null, null, new d(str, null), 3, null);
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.f45050y.getCoroutineContext();
    }
}
