package od;

import com.dena.mirrativ.mirrativapi.core.MRErrorKt;
import com.dena.mirrorman.net.api.response.SeasonYellYelledUsersResponse;
import com.dena.mirrorman.net.retrofit.MRRequest;

/* loaded from: classes2.dex */
public final class u implements uo.q0 {

    /* renamed from: w  reason: collision with root package name */
    public final q8.a f45297w;

    /* renamed from: x  reason: collision with root package name */
    public final MRRequest f45298x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ uo.q0 f45299y;

    /* renamed from: z  reason: collision with root package name */
    public final jf.x f45300z;

    @co.f(c = "com.dena.mirrorman.actioncreator.LiveGiftCheerUsersActionCreator$reloadCheerUsers$1", f = "LiveGiftCheerUsersActionCreator.kt", l = {24}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {
        public final /* synthetic */ String A;

        /* renamed from: w  reason: collision with root package name */
        public int f45301w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f45303y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ String f45304z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, String str2, String str3, ao.d<? super a> dVar) {
            super(2, dVar);
            this.f45303y = str;
            this.f45304z = str2;
            this.A = str3;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new a(this.f45303y, this.f45304z, this.A, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((a) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f45301w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    MRRequest mRRequest = u.this.f45298x;
                    String str = this.f45303y;
                    String str2 = this.f45304z;
                    String str3 = this.A;
                    this.f45301w = 1;
                    obj = mRRequest.getSeasonYellYelledUsers(str, str2, str3, this);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                u.this.f45297w.a(new pd.c0(u.this.f45300z, (SeasonYellYelledUsersResponse) obj));
            } catch (Throwable th2) {
                u.this.f45297w.a(new pd.b0(u.this.f45300z, MRErrorKt.convertMRException(th2).getError()));
            }
            return wn.v.f59242a;
        }
    }

    public u(q8.a aVar, MRRequest mRRequest) {
        jo.p.h(aVar, "dispatcher");
        jo.p.h(mRRequest, "request");
        this.f45297w = aVar;
        this.f45298x = mRRequest;
        this.f45299y = uo.r0.b();
        this.f45300z = jf.x.CHEER;
    }

    public final void d(String str, String str2, String str3) {
        jo.p.h(str, "referer");
        this.f45297w.a(new pd.d0(this.f45300z));
        uo.l.d(this, null, null, new a(str, str2, str3, null), 3, null);
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.f45299y.getCoroutineContext();
    }
}
