package y;

/* loaded from: classes.dex */
public final class h0 extends androidx.compose.ui.platform.d1 implements q1.p0 {

    /* renamed from: x  reason: collision with root package name */
    public final float f60803x;

    /* renamed from: y  reason: collision with root package name */
    public final boolean f60804y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(float f10, boolean z10, io.l<? super androidx.compose.ui.platform.c1, wn.v> lVar) {
        super(lVar);
        jo.p.h(lVar, "inspectorInfo");
        this.f60803x = f10;
        this.f60804y = z10;
    }

    @Override // q1.p0
    /* renamed from: b */
    public x0 g0(m2.d dVar, Object obj) {
        jo.p.h(dVar, "<this>");
        x0 x0Var = obj instanceof x0 ? (x0) obj : null;
        if (x0Var == null) {
            x0Var = new x0(0.0f, false, null, 7, null);
        }
        x0Var.f(this.f60803x);
        x0Var.e(this.f60804y);
        return x0Var;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        h0 h0Var = obj instanceof h0 ? (h0) obj : null;
        if (h0Var == null) {
            return false;
        }
        return ((this.f60803x > h0Var.f60803x ? 1 : (this.f60803x == h0Var.f60803x ? 0 : -1)) == 0) && this.f60804y == h0Var.f60804y;
    }

    public int hashCode() {
        return (Float.hashCode(this.f60803x) * 31) + Boolean.hashCode(this.f60804y);
    }

    public String toString() {
        return "LayoutWeightImpl(weight=" + this.f60803x + ", fill=" + this.f60804y + ')';
    }
}
