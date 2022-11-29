package y;

import x0.a;

/* loaded from: classes.dex */
public final class y extends androidx.compose.ui.platform.d1 implements q1.p0 {

    /* renamed from: x  reason: collision with root package name */
    public final a.b f61026x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(a.b bVar, io.l<? super androidx.compose.ui.platform.c1, wn.v> lVar) {
        super(lVar);
        jo.p.h(bVar, "horizontal");
        jo.p.h(lVar, "inspectorInfo");
        this.f61026x = bVar;
    }

    @Override // q1.p0
    /* renamed from: b */
    public x0 g0(m2.d dVar, Object obj) {
        jo.p.h(dVar, "<this>");
        x0 x0Var = obj instanceof x0 ? (x0) obj : null;
        if (x0Var == null) {
            x0Var = new x0(0.0f, false, null, 7, null);
        }
        x0Var.d(s.f60957a.b(this.f61026x));
        return x0Var;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        y yVar = obj instanceof y ? (y) obj : null;
        if (yVar == null) {
            return false;
        }
        return jo.p.c(this.f61026x, yVar.f61026x);
    }

    public int hashCode() {
        return this.f61026x.hashCode();
    }

    public String toString() {
        return "HorizontalAlignModifier(horizontal=" + this.f61026x + ')';
    }
}
