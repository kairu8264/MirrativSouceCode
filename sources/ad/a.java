package ad;

import ad.b;
import com.dena.mirrativ.mirrativapi.core.MRErrorKt;
import com.dena.mirrativ.mirrativapi.user.ContractBanksResponse;
import com.dena.mirrativ.mirrativapi.user.UserApi;

/* loaded from: classes2.dex */
public final class a implements uo.q0 {

    /* renamed from: w  reason: collision with root package name */
    public final q8.a f945w;

    /* renamed from: x  reason: collision with root package name */
    public final UserApi f946x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ uo.q0 f947y;

    @co.f(c = "com.dena.mirrativ.user.mypage.contract.BankIndexActionCreator$fetchBankList$1", f = "BankIndexActionCreator.kt", l = {20}, m = "invokeSuspend")
    /* renamed from: ad.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0019a extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f948w;

        public C0019a(ao.d<? super C0019a> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new C0019a(dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((C0019a) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f948w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    UserApi userApi = a.this.f946x;
                    int c11 = y0.MAJOR.c();
                    this.f948w = 1;
                    obj = userApi.getContractBanks("bank_index", c11, this);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                a.this.f945w.a(new b.c((ContractBanksResponse) obj));
            } catch (Throwable th2) {
                a.this.f945w.a(new b.a(MRErrorKt.convertMRException(th2).getError()));
            }
            return wn.v.f59242a;
        }
    }

    public a(q8.a aVar, UserApi userApi) {
        jo.p.h(aVar, "dispatcher");
        jo.p.h(userApi, "userApi");
        this.f945w = aVar;
        this.f946x = userApi;
        this.f947y = uo.r0.b();
    }

    public final void c() {
        this.f945w.a(b.C0020b.f958a);
        uo.l.d(this, null, null, new C0019a(null), 3, null);
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.f947y.getCoroutineContext();
    }
}
