package dd;

import co.l;
import com.dena.mirrativ.mirrativapi.core.MRErrorKt;
import com.dena.mirrativ.mirrativapi.user.ContractSummaryResponse;
import com.dena.mirrativ.mirrativapi.user.UserApi;
import dd.b;
import io.p;
import uo.q0;
import uo.r0;
import wn.m;
import wn.v;

/* loaded from: classes2.dex */
public final class a implements q0 {

    /* renamed from: w  reason: collision with root package name */
    public final q8.a f29549w;

    /* renamed from: x  reason: collision with root package name */
    public final UserApi f29550x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ q0 f29551y;

    @co.f(c = "com.dena.mirrativ.user.mypage.contract.monthlyranking.MonthlyRankingActionCreator$getSummary$1", f = "MonthlyRankingActionCreator.kt", l = {16}, m = "invokeSuspend")
    /* renamed from: dd.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0284a extends l implements p<q0, ao.d<? super v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f29552w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f29554y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0284a(String str, ao.d<? super C0284a> dVar) {
            super(2, dVar);
            this.f29554y = str;
        }

        @Override // co.a
        public final ao.d<v> create(Object obj, ao.d<?> dVar) {
            return new C0284a(this.f29554y, dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super v> dVar) {
            return ((C0284a) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f29552w;
            try {
                if (i10 == 0) {
                    m.b(obj);
                    UserApi a10 = a.this.a();
                    String str = this.f29554y;
                    this.f29552w = 1;
                    obj = a10.getSummary(str, this);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    m.b(obj);
                }
                a.this.b().a(new b.c((ContractSummaryResponse) obj));
            } catch (Throwable th2) {
                a.this.b().a(new b.C0285b(MRErrorKt.convertMRException(th2).getError()));
            }
            return v.f59242a;
        }
    }

    public a(q8.a aVar, UserApi userApi) {
        jo.p.h(aVar, "dispatcher");
        jo.p.h(userApi, "api");
        this.f29549w = aVar;
        this.f29550x = userApi;
        this.f29551y = r0.b();
    }

    public final UserApi a() {
        return this.f29550x;
    }

    public final q8.a b() {
        return this.f29549w;
    }

    public final void c(String str) {
        jo.p.h(str, "referer");
        this.f29549w.a(b.a.f29555a);
        uo.l.d(this, null, null, new C0284a(str, null), 3, null);
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.f29551y.getCoroutineContext();
    }
}
