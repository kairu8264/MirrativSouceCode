package gd;

import co.l;
import com.dena.mirrativ.mirrativapi.core.MRErrorKt;
import com.dena.mirrativ.mirrativapi.otherfeatures.OtherFeaturesApi;
import com.dena.mirrativ.mirrativapi.otherfeatures.passbook.coin.CoinHistoriesResponse;
import com.dena.mirrativ.mirrativapi.user.ContractSummaryResponse;
import com.dena.mirrativ.mirrativapi.user.UserApi;
import com.dena.mirrorman.net.api.response.AvailableRewardAdIdsResponse;
import com.dena.mirrorman.net.retrofit.MRRequest;
import gd.d;
import hf.v0;
import io.p;
import pd.s;
import uo.b0;
import uo.g1;
import uo.i2;
import uo.k0;
import uo.q0;
import wn.m;
import wn.v;

/* loaded from: classes2.dex */
public final class c implements q0 {
    public final v0 A;
    public final ao.g B;

    /* renamed from: w  reason: collision with root package name */
    public final q8.a f33184w;

    /* renamed from: x  reason: collision with root package name */
    public final UserApi f33185x;

    /* renamed from: y  reason: collision with root package name */
    public final OtherFeaturesApi f33186y;

    /* renamed from: z  reason: collision with root package name */
    public final MRRequest f33187z;

    @co.f(c = "com.dena.mirrativ.user.mypage.passbook.coin.CoinPassbookActionCreator$loadAvailableRewardAdIds$1", f = "CoinPassbookActionCreator.kt", l = {76}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends l implements p<q0, ao.d<? super v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f33188w;

        public a(ao.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<v> create(Object obj, ao.d<?> dVar) {
            return new a(dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super v> dVar) {
            return ((a) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f33188w;
            try {
                if (i10 == 0) {
                    m.b(obj);
                    MRRequest mRRequest = c.this.f33187z;
                    this.f33188w = 1;
                    obj = mRRequest.getAvailableRewardAdIds("passbook_coin", this);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    m.b(obj);
                }
                c.this.f33184w.a(new d.a((AvailableRewardAdIdsResponse) obj));
            } catch (Throwable unused) {
            }
            return v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrativ.user.mypage.passbook.coin.CoinPassbookActionCreator$loadNext$1", f = "CoinPassbookActionCreator.kt", l = {52}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class b extends l implements p<q0, ao.d<? super v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f33190w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ int f33192y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(int i10, ao.d<? super b> dVar) {
            super(2, dVar);
            this.f33192y = i10;
        }

        @Override // co.a
        public final ao.d<v> create(Object obj, ao.d<?> dVar) {
            return new b(this.f33192y, dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super v> dVar) {
            return ((b) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f33190w;
            try {
                if (i10 == 0) {
                    m.b(obj);
                    OtherFeaturesApi otherFeaturesApi = c.this.f33186y;
                    Integer d10 = co.b.d(this.f33192y);
                    this.f33190w = 1;
                    obj = otherFeaturesApi.getUserCoinHistories("passbook.orb", d10, this);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    m.b(obj);
                }
                c.this.f33184w.a(new d.C0401d((CoinHistoriesResponse) obj));
            } catch (Throwable th2) {
                c.this.f33184w.a(new d.b(MRErrorKt.convertMRException(th2).getError()));
            }
            return v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrativ.user.mypage.passbook.coin.CoinPassbookActionCreator$loadSummary$1", f = "CoinPassbookActionCreator.kt", l = {64}, m = "invokeSuspend")
    /* renamed from: gd.c$c  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0400c extends l implements p<q0, ao.d<? super v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f33193w;

        public C0400c(ao.d<? super C0400c> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<v> create(Object obj, ao.d<?> dVar) {
            return new C0400c(dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super v> dVar) {
            return ((C0400c) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f33193w;
            try {
                if (i10 == 0) {
                    m.b(obj);
                    UserApi userApi = c.this.f33185x;
                    this.f33193w = 1;
                    obj = userApi.getSummary("passbook_coin", this);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    m.b(obj);
                }
                c.this.f33184w.a(new d.e((ContractSummaryResponse) obj));
            } catch (Throwable th2) {
                c.this.f33184w.a(new d.c(MRErrorKt.convertMRException(th2).getError()));
            }
            return v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrativ.user.mypage.passbook.coin.CoinPassbookActionCreator$reload$1", f = "CoinPassbookActionCreator.kt", l = {31}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class d extends l implements p<q0, ao.d<? super v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f33195w;

        public d(ao.d<? super d> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<v> create(Object obj, ao.d<?> dVar) {
            return new d(dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super v> dVar) {
            return ((d) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f33195w;
            try {
                if (i10 == 0) {
                    m.b(obj);
                    OtherFeaturesApi otherFeaturesApi = c.this.f33186y;
                    this.f33195w = 1;
                    obj = OtherFeaturesApi.DefaultImpls.getUserCoinHistories$default(otherFeaturesApi, "passbook.orb", null, this, 2, null);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    m.b(obj);
                }
                CoinHistoriesResponse coinHistoriesResponse = (CoinHistoriesResponse) obj;
                c.this.f33184w.a(new s.j(new jf.f((int) coinHistoriesResponse.getFreeCoin(), (int) coinHistoriesResponse.getPaidCoin())));
                c.this.f33184w.a(new d.C0401d(coinHistoriesResponse));
            } catch (Throwable th2) {
                c.this.f33184w.a(new d.b(MRErrorKt.convertMRException(th2).getError()));
            }
            return v.f59242a;
        }
    }

    public c(q8.a aVar, UserApi userApi, OtherFeaturesApi otherFeaturesApi, MRRequest mRRequest, v0 v0Var) {
        b0 b10;
        jo.p.h(aVar, "dispatcher");
        jo.p.h(userApi, "userApi");
        jo.p.h(otherFeaturesApi, "otherFeaturesApi");
        jo.p.h(mRRequest, "request");
        jo.p.h(v0Var, "userHelper");
        this.f33184w = aVar;
        this.f33185x = userApi;
        this.f33186y = otherFeaturesApi;
        this.f33187z = mRRequest;
        this.A = v0Var;
        k0 b11 = g1.b();
        b10 = i2.b(null, 1, null);
        this.B = b11.plus(b10);
    }

    public final void e() {
        if (this.A.j()) {
            return;
        }
        uo.l.d(this, null, null, new a(null), 3, null);
    }

    public final void f(int i10) {
        this.f33184w.a(d.f.f33203a);
        uo.l.d(this, null, null, new b(i10, null), 3, null);
    }

    public final void g() {
        this.f33184w.a(d.g.f33204a);
        uo.l.d(this, null, null, new C0400c(null), 3, null);
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.B;
    }

    public final void h() {
        this.f33184w.a(d.h.f33205a);
        uo.l.d(this, null, null, new d(null), 3, null);
    }

    public final void i(boolean z10) {
        this.f33184w.a(new d.i(z10));
    }
}
