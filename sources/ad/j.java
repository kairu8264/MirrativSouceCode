package ad;

import ad.b;
import android.content.res.Resources;
import androidx.lifecycle.LiveData;
import bd.a;
import com.dena.mirrativ.mirrativapi.user.ContractBank;
import com.dena.mirrativ.mirrativapi.user.ContractBanksResponse;
import java.util.ArrayList;
import java.util.List;
import org.greenrobot.eventbus.ThreadMode;

/* loaded from: classes2.dex */
public final class j extends androidx.lifecycle.q0 {
    public final androidx.lifecycle.e0<ContractBanksResponse> A;
    public final LiveData<List<bd.a>> B;

    /* renamed from: y  reason: collision with root package name */
    public final q8.a f1134y;

    /* renamed from: z  reason: collision with root package name */
    public final Resources f1135z;

    /* loaded from: classes2.dex */
    public static final class a<I, O> implements n.a {
        public a() {
        }

        @Override // n.a
        public final List<? extends bd.a> apply(ContractBanksResponse contractBanksResponse) {
            List d10 = xn.r.d(new a.e(j.this.g()));
            List<ContractBank> banks = contractBanksResponse.getBanks();
            ArrayList arrayList = new ArrayList(xn.t.u(banks, 10));
            for (ContractBank contractBank : banks) {
                arrayList.add(new a.C0113a(contractBank));
            }
            List d11 = xn.r.d(new a.d(j.this.g()));
            y0[] values = y0.values();
            ArrayList<y0> arrayList2 = new ArrayList();
            int length = values.length;
            for (int i10 = 0; i10 < length; i10++) {
                y0 y0Var = values[i10];
                if (!(y0Var == y0.MAJOR)) {
                    arrayList2.add(y0Var);
                }
            }
            ArrayList arrayList3 = new ArrayList(xn.t.u(arrayList2, 10));
            for (y0 y0Var2 : arrayList2) {
                arrayList3.add(new a.c(y0Var2, j.this.g()));
            }
            return xn.a0.o0(xn.a0.o0(xn.a0.o0(d10, arrayList), d11), arrayList3);
        }
    }

    public j(q8.a aVar, Resources resources) {
        jo.p.h(aVar, "dispatcher");
        jo.p.h(resources, "resources");
        this.f1134y = aVar;
        this.f1135z = resources;
        aVar.b(this);
        androidx.lifecycle.e0<ContractBanksResponse> e0Var = new androidx.lifecycle.e0<>();
        this.A = e0Var;
        LiveData<List<bd.a>> b10 = androidx.lifecycle.p0.b(e0Var, new a());
        jo.p.g(b10, "crossinline transform: (…p(this) { transform(it) }");
        this.B = b10;
    }

    @Override // androidx.lifecycle.q0
    public void d() {
        this.f1134y.c(this);
        super.d();
    }

    public final LiveData<List<bd.a>> f() {
        return this.B;
    }

    public final Resources g() {
        return this.f1135z;
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(b.c cVar) {
        jo.p.h(cVar, "event");
        this.A.p(cVar.a());
    }
}
