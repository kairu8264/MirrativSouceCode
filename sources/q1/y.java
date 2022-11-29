package q1;

import androidx.compose.ui.platform.c1;
import androidx.compose.ui.platform.d1;

/* loaded from: classes.dex */
public final class y extends d1 implements x {

    /* renamed from: x  reason: collision with root package name */
    public final io.q<e0, b0, m2.b, d0> f48625x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public y(io.q<? super e0, ? super b0, ? super m2.b, ? extends d0> qVar, io.l<? super c1, wn.v> lVar) {
        super(lVar);
        jo.p.h(qVar, "measureBlock");
        jo.p.h(lVar, "inspectorInfo");
        this.f48625x = qVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        y yVar = obj instanceof y ? (y) obj : null;
        if (yVar == null) {
            return false;
        }
        return jo.p.c(this.f48625x, yVar.f48625x);
    }

    public int hashCode() {
        return this.f48625x.hashCode();
    }

    @Override // q1.x
    public d0 q(e0 e0Var, b0 b0Var, long j10) {
        jo.p.h(e0Var, "$this$measure");
        jo.p.h(b0Var, "measurable");
        return this.f48625x.s0(e0Var, b0Var, m2.b.b(j10));
    }

    public String toString() {
        return "LayoutModifierImpl(measureBlock=" + this.f48625x + ')';
    }
}
