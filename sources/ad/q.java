package ad;

import ad.l;
import android.content.res.Resources;
import androidx.lifecycle.LiveData;
import bd.a;
import com.dena.mirrativ.mirrativapi.user.ContractBank;
import com.dena.mirrativ.mirrativapi.user.ContractBanksResponse;
import java.util.ArrayList;
import java.util.List;
import org.greenrobot.eventbus.ThreadMode;

/* loaded from: classes2.dex */
public final class q extends androidx.lifecycle.q0 {
    public final androidx.lifecycle.e0<ContractBanksResponse> A;
    public final LiveData<List<bd.a>> B;

    /* renamed from: y  reason: collision with root package name */
    public final q8.a f1272y;

    /* renamed from: z  reason: collision with root package name */
    public final Resources f1273z;

    /* loaded from: classes2.dex */
    public static final class a<I, O> implements n.a {
        @Override // n.a
        public final List<? extends bd.a> apply(ContractBanksResponse contractBanksResponse) {
            List<ContractBank> banks = contractBanksResponse.getBanks();
            ArrayList arrayList = new ArrayList(xn.t.u(banks, 10));
            for (ContractBank contractBank : banks) {
                arrayList.add(new a.C0113a(contractBank));
            }
            return arrayList;
        }
    }

    public q(q8.a aVar, Resources resources) {
        jo.p.h(aVar, "dispatcher");
        jo.p.h(resources, "resources");
        this.f1272y = aVar;
        this.f1273z = resources;
        aVar.b(this);
        androidx.lifecycle.e0<ContractBanksResponse> e0Var = new androidx.lifecycle.e0<>();
        this.A = e0Var;
        LiveData<List<bd.a>> b10 = androidx.lifecycle.p0.b(e0Var, new a());
        jo.p.g(b10, "crossinline transform: (…p(this) { transform(it) }");
        this.B = b10;
    }

    @Override // androidx.lifecycle.q0
    public void d() {
        this.f1272y.c(this);
        super.d();
    }

    public final LiveData<List<bd.a>> f() {
        return this.B;
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(l.c cVar) {
        jo.p.h(cVar, "event");
        this.A.p(cVar.a());
    }
}
