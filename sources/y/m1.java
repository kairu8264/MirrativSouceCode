package y;

import x0.a;

/* loaded from: classes.dex */
public final class m1 extends androidx.compose.ui.platform.d1 implements q1.p0 {

    /* renamed from: x  reason: collision with root package name */
    public final a.c f60852x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1(a.c cVar, io.l<? super androidx.compose.ui.platform.c1, wn.v> lVar) {
        super(lVar);
        jo.p.h(cVar, "vertical");
        jo.p.h(lVar, "inspectorInfo");
        this.f60852x = cVar;
    }

    @Override // q1.p0
    /* renamed from: b */
    public x0 g0(m2.d dVar, Object obj) {
        jo.p.h(dVar, "<this>");
        x0 x0Var = obj instanceof x0 ? (x0) obj : null;
        if (x0Var == null) {
            x0Var = new x0(0.0f, false, null, 7, null);
        }
        x0Var.d(s.f60957a.c(this.f60852x));
        return x0Var;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        m1 m1Var = obj instanceof m1 ? (m1) obj : null;
        if (m1Var == null) {
            return false;
        }
        return jo.p.c(this.f60852x, m1Var.f60852x);
    }

    public int hashCode() {
        return this.f60852x.hashCode();
    }

    public String toString() {
        return "VerticalAlignModifier(vertical=" + this.f60852x + ')';
    }
}
