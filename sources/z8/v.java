package z8;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.e0;
import androidx.lifecycle.q0;
import com.dena.mirrorman.net.api.response.MissionInfoResponse;
import com.dena.mirrorman.net.api.response.MissionReceiveRewardResponse;
import ha.a;
import org.greenrobot.eventbus.ThreadMode;
import uo.r0;
import z8.m;

/* loaded from: classes.dex */
public final class v extends q0 implements uo.q0 {
    public final e0<ha.a> A;
    public final LiveData<ha.a> B;
    public final e0<wn.p<MissionReceiveRewardResponse, Integer, Boolean>> C;
    public final LiveData<wn.p<MissionReceiveRewardResponse, Integer, Boolean>> D;
    public final e0<MissionInfoResponse> E;
    public final LiveData<MissionInfoResponse> F;

    /* renamed from: y  reason: collision with root package name */
    public final q8.a f62777y;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ uo.q0 f62778z;

    public v(q8.a aVar) {
        jo.p.h(aVar, "dispatcher");
        this.f62777y = aVar;
        this.f62778z = r0.b();
        e0<ha.a> e0Var = new e0<>(a.d.f34697b);
        this.A = e0Var;
        this.B = e0Var;
        e0<wn.p<MissionReceiveRewardResponse, Integer, Boolean>> e0Var2 = new e0<>();
        this.C = e0Var2;
        this.D = e0Var2;
        e0<MissionInfoResponse> e0Var3 = new e0<>();
        this.E = e0Var3;
        this.F = e0Var3;
        aVar.b(this);
    }

    @Override // androidx.lifecycle.q0
    public void d() {
        r0.d(this, null, 1, null);
        this.f62777y.c(this);
        super.d();
    }

    public final LiveData<MissionInfoResponse> f() {
        return this.F;
    }

    public final LiveData<ha.a> g() {
        return this.B;
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.f62778z.getCoroutineContext();
    }

    public final LiveData<wn.p<MissionReceiveRewardResponse, Integer, Boolean>> h() {
        return this.D;
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(m.b bVar) {
        jo.p.h(bVar, "event");
        this.E.p(bVar.a());
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(m.e eVar) {
        jo.p.h(eVar, "event");
        this.A.p(a.b.f34695b);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(m.f fVar) {
        jo.p.h(fVar, "event");
        this.A.p(a.d.f34697b);
        this.C.p(new wn.p<>(fVar.b(), Integer.valueOf(fVar.a()), Boolean.valueOf(fVar.c())));
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(m.d dVar) {
        jo.p.h(dVar, "event");
        this.A.p(new a.C0439a(dVar.a()));
    }
}
