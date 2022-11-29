package ai;

import ai.d41;

/* loaded from: classes3.dex */
public final class ji2<RequestComponentT extends d41<AdT>, AdT> implements ti2<RequestComponentT, AdT> {

    /* renamed from: a  reason: collision with root package name */
    public final ti2<RequestComponentT, AdT> f5805a;

    /* renamed from: b  reason: collision with root package name */
    public RequestComponentT f5806b;

    public ji2(ti2<RequestComponentT, AdT> ti2Var) {
        this.f5805a = ti2Var;
    }

    @Override // ai.ti2
    public final /* bridge */ /* synthetic */ s43 a(ui2 ui2Var, si2 si2Var, Object obj) {
        return c(ui2Var, si2Var, null);
    }

    @Override // ai.ti2
    /* renamed from: b */
    public final synchronized RequestComponentT d() {
        return this.f5806b;
    }

    public final synchronized s43<AdT> c(ui2 ui2Var, si2<RequestComponentT> si2Var, RequestComponentT requestcomponentt) {
        this.f5806b = requestcomponentt;
        if (ui2Var.f10718a != null) {
            y11<AdT> q10 = requestcomponentt.q();
            return q10.d(q10.b(j43.a(ui2Var.f10718a)));
        }
        return ((ii2) this.f5805a).c(ui2Var, si2Var, requestcomponentt);
    }
}
