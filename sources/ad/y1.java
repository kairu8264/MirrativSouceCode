package ad;

import ad.x0;
import androidx.lifecycle.LiveData;
import bd.c;
import com.dena.mirrativ.mirrativapi.user.ContractSummaryPaymentType;
import com.dena.mirrativ.mirrativapi.user.ContractSummaryResponse;
import ha.a;
import org.greenrobot.eventbus.ThreadMode;

/* loaded from: classes2.dex */
public final class y1 extends androidx.lifecycle.q0 {
    public final LiveData<ha.a> A;
    public final androidx.lifecycle.e0<ContractSummaryResponse> B;
    public final androidx.lifecycle.e0<ha.a> C;
    public final LiveData<ha.a> D;
    public final LiveData<bd.c> E;
    public final LiveData<String> F;
    public final LiveData<Boolean> G;
    public final androidx.lifecycle.e0<b1> H;
    public final LiveData<b1> I;

    /* renamed from: y  reason: collision with root package name */
    public final q8.a f1422y;

    /* renamed from: z  reason: collision with root package name */
    public final androidx.lifecycle.e0<ha.a> f1423z;

    /* loaded from: classes2.dex */
    public static final class a<I, O> implements n.a {
        @Override // n.a
        public final bd.c apply(ContractSummaryResponse contractSummaryResponse) {
            ContractSummaryResponse contractSummaryResponse2 = contractSummaryResponse;
            c.a aVar = bd.c.P;
            jo.p.g(contractSummaryResponse2, "it");
            return aVar.a(contractSummaryResponse2);
        }
    }

    /* loaded from: classes2.dex */
    public static final class b<I, O> implements n.a {
        @Override // n.a
        public final String apply(ContractSummaryResponse contractSummaryResponse) {
            return contractSummaryResponse.getTermsPageUrl();
        }
    }

    /* loaded from: classes2.dex */
    public static final class c<I, O> implements n.a {
        @Override // n.a
        public final Boolean apply(ContractSummaryResponse contractSummaryResponse) {
            ContractSummaryResponse contractSummaryResponse2 = contractSummaryResponse;
            return Boolean.valueOf(contractSummaryResponse2.getContractStatus() == s1.COMPLETE.c() && contractSummaryResponse2.getKycStatus() == g2.CONFIRMED.c());
        }
    }

    public y1(q8.a aVar) {
        jo.p.h(aVar, "dispatcher");
        this.f1422y = aVar;
        aVar.b(this);
        androidx.lifecycle.e0<ha.a> e0Var = new androidx.lifecycle.e0<>(a.d.f34697b);
        this.f1423z = e0Var;
        this.A = e0Var;
        androidx.lifecycle.e0<ContractSummaryResponse> e0Var2 = new androidx.lifecycle.e0<>();
        this.B = e0Var2;
        androidx.lifecycle.e0<ha.a> e0Var3 = new androidx.lifecycle.e0<>(a.b.f34695b);
        this.C = e0Var3;
        this.D = e0Var3;
        LiveData<bd.c> b10 = androidx.lifecycle.p0.b(e0Var2, new a());
        jo.p.g(b10, "crossinline transform: (…p(this) { transform(it) }");
        this.E = b10;
        LiveData<String> b11 = androidx.lifecycle.p0.b(e0Var2, new b());
        jo.p.g(b11, "crossinline transform: (…p(this) { transform(it) }");
        this.F = b11;
        LiveData<Boolean> b12 = androidx.lifecycle.p0.b(e0Var2, new c());
        jo.p.g(b12, "crossinline transform: (…p(this) { transform(it) }");
        this.G = b12;
        androidx.lifecycle.e0<b1> e0Var4 = new androidx.lifecycle.e0<>();
        this.H = e0Var4;
        this.I = e0Var4;
    }

    @Override // androidx.lifecycle.q0
    public void d() {
        this.f1422y.c(this);
        super.d();
    }

    public final LiveData<bd.c> f() {
        return this.E;
    }

    public final LiveData<b1> g() {
        return this.I;
    }

    public final LiveData<ha.a> h() {
        return this.A;
    }

    public final LiveData<ha.a> i() {
        return this.D;
    }

    public final LiveData<String> j() {
        return this.F;
    }

    public final LiveData<Boolean> k() {
        return this.G;
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(x0.d dVar) {
        jo.p.h(dVar, "event");
        this.C.p(a.b.f34695b);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(x0.c cVar) {
        jo.p.h(cVar, "event");
        this.C.p(a.d.f34697b);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(x0.e eVar) {
        jo.p.h(eVar, "event");
        this.f1423z.p(a.b.f34695b);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(x0.a aVar) {
        jo.p.h(aVar, "event");
        this.f1423z.p(new a.C0439a(aVar.a()));
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(x0.b bVar) {
        b1 b1Var;
        jo.p.h(bVar, "event");
        this.f1423z.p(a.d.f34697b);
        this.B.p(bVar.a());
        androidx.lifecycle.e0<b1> e0Var = this.H;
        if (bVar.a().getKycStatus() == g2.PENDING.c()) {
            b1Var = b1.REQUIRED_CONFIRM_IDENTIFICATION_DOCUMENT;
        } else if (bVar.a().getKycStatus() != g2.CONFIRMED.c()) {
            b1Var = b1.REQUIRED_REGISTER_IDENTIFICATION;
        } else if (bVar.a().getAccountStatus() == v0.UNCONFIRMED.c()) {
            b1Var = b1.REQUIRED_REGISTER_BANK_ACCOUNT;
        } else if (bVar.a().getAccountStatus() == v0.NG_CONFIRM.c()) {
            b1Var = b1.REQUIRED_REGISTER_BANK_ACCOUNT;
        } else {
            b1Var = bVar.a().getPaymentType() == ContractSummaryPaymentType.COIN ? b1.REQUIRED_REGISTER_BANK_ACCOUNT : b1.ENABLED_CONTRACT_START;
        }
        e0Var.p(b1Var);
    }
}
