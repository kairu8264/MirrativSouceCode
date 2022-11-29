package ai;

import java.util.Map;

/* loaded from: classes3.dex */
public final class yo1 implements dq2 {

    /* renamed from: w  reason: collision with root package name */
    public final Map<wp2, xo1> f12690w;

    /* renamed from: x  reason: collision with root package name */
    public final qn f12691x;

    public yo1(qn qnVar, Map<wp2, xo1> map) {
        this.f12690w = map;
        this.f12691x = qnVar;
    }

    @Override // ai.dq2
    public final void A(wp2 wp2Var, String str) {
    }

    @Override // ai.dq2
    public final void K(wp2 wp2Var, String str) {
        if (this.f12690w.containsKey(wp2Var)) {
            this.f12691x.c(this.f12690w.get(wp2Var).f12042a);
        }
    }

    @Override // ai.dq2
    public final void c(wp2 wp2Var, String str) {
        if (this.f12690w.containsKey(wp2Var)) {
            this.f12691x.c(this.f12690w.get(wp2Var).f12043b);
        }
    }

    @Override // ai.dq2
    public final void n(wp2 wp2Var, String str, Throwable th2) {
        if (this.f12690w.containsKey(wp2Var)) {
            this.f12691x.c(this.f12690w.get(wp2Var).f12044c);
        }
    }
}
