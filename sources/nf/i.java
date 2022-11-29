package nf;

import androidx.lifecycle.LiveData;
import com.dena.mirrativ.mirrativapi.user.ContractSummaryResponse;
import ha.a;
import org.greenrobot.eventbus.ThreadMode;
import pd.j;
import uo.r0;

/* loaded from: classes3.dex */
public final class i implements uo.q0 {
    public final androidx.lifecycle.e0<ContractSummaryResponse> A;
    public final LiveData<ContractSummaryResponse> B;

    /* renamed from: w  reason: collision with root package name */
    public final q8.a f42943w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ uo.q0 f42944x;

    /* renamed from: y  reason: collision with root package name */
    public final androidx.lifecycle.e0<ha.a> f42945y;

    /* renamed from: z  reason: collision with root package name */
    public final LiveData<ha.a> f42946z;

    public i(q8.a aVar) {
        jo.p.h(aVar, "dispatcher");
        this.f42943w = aVar;
        this.f42944x = r0.b();
        aVar.b(this);
        androidx.lifecycle.e0<ha.a> e0Var = new androidx.lifecycle.e0<>(a.d.f34697b);
        this.f42945y = e0Var;
        this.f42946z = e0Var;
        androidx.lifecycle.e0<ContractSummaryResponse> e0Var2 = new androidx.lifecycle.e0<>();
        this.A = e0Var2;
        this.B = e0Var2;
    }

    public final LiveData<ContractSummaryResponse> a() {
        return this.B;
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.f42944x.getCoroutineContext();
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(j.b bVar) {
        jo.p.h(bVar, "event");
        this.f42945y.p(a.b.f34695b);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(j.a aVar) {
        jo.p.h(aVar, "event");
        throw null;
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(j.c cVar) {
        jo.p.h(cVar, "event");
        this.f42945y.p(a.d.f34697b);
        this.A.p(cVar.a());
    }
}
