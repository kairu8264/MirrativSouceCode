package od;

import com.dena.mirrativ.mirrativapi.core.MRErrorKt;
import com.dena.mirrativ.mirrativapi.user.ContractSummaryResponse;
import com.dena.mirrativ.mirrativapi.user.UserApi;
import pd.j;

/* loaded from: classes2.dex */
public final class h implements uo.q0 {

    /* renamed from: w  reason: collision with root package name */
    public final q8.a f44905w;

    /* renamed from: x  reason: collision with root package name */
    public final UserApi f44906x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ uo.q0 f44907y;

    @co.f(c = "com.dena.mirrorman.actioncreator.ContractSummaryActionCreator$getSummary$1", f = "ContractSummaryActionCreator.kt", l = {20}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f44908w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f44910y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, ao.d<? super a> dVar) {
            super(2, dVar);
            this.f44910y = str;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new a(this.f44910y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((a) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f44908w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    h.this.b().a(j.b.f46989a);
                    UserApi userApi = h.this.f44906x;
                    String str = this.f44910y;
                    this.f44908w = 1;
                    obj = userApi.getSummary(str, this);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                h.this.b().a(new j.c((ContractSummaryResponse) obj));
            } catch (Exception e10) {
                h.this.b().a(MRErrorKt.convertMRException(e10).getError());
            }
            return wn.v.f59242a;
        }
    }

    public h(q8.a aVar, UserApi userApi) {
        jo.p.h(aVar, "dispatcher");
        jo.p.h(userApi, "userApi");
        this.f44905w = aVar;
        this.f44906x = userApi;
        this.f44907y = uo.r0.b();
    }

    public final q8.a b() {
        return this.f44905w;
    }

    public final void c(String str) {
        jo.p.h(str, "referer");
        uo.l.d(this, null, null, new a(str, null), 3, null);
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.f44907y.getCoroutineContext();
    }
}
