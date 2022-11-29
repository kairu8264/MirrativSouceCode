package ai;

import ai.d41;

/* loaded from: classes3.dex */
public final class ii2<RequestComponentT extends d41<AdT>, AdT> implements ti2<RequestComponentT, AdT> {

    /* renamed from: a  reason: collision with root package name */
    public RequestComponentT f5245a;

    @Override // ai.ti2
    public final /* bridge */ /* synthetic */ s43 a(ui2 ui2Var, si2 si2Var, Object obj) {
        return c(ui2Var, si2Var, null);
    }

    @Override // ai.ti2
    /* renamed from: b */
    public final synchronized RequestComponentT d() {
        return this.f5245a;
    }

    public final synchronized s43<AdT> c(ui2 ui2Var, si2<RequestComponentT> si2Var, RequestComponentT requestcomponentt) {
        y11<AdT> q10;
        if (requestcomponentt != null) {
            this.f5245a = requestcomponentt;
        } else {
            this.f5245a = si2Var.a(ui2Var.f10719b).a();
        }
        q10 = this.f5245a.q();
        return q10.d(q10.c());
    }
}
