package q1;

import androidx.compose.ui.platform.c1;
import androidx.compose.ui.platform.d1;

/* loaded from: classes.dex */
public final class s extends d1 implements p0, u {

    /* renamed from: x  reason: collision with root package name */
    public final Object f48604x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(Object obj, io.l<? super c1, wn.v> lVar) {
        super(lVar);
        jo.p.h(obj, "layoutId");
        jo.p.h(lVar, "inspectorInfo");
        this.f48604x = obj;
    }

    @Override // q1.u
    public Object a() {
        return this.f48604x;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        s sVar = obj instanceof s ? (s) obj : null;
        if (sVar == null) {
            return false;
        }
        return jo.p.c(a(), sVar.a());
    }

    @Override // q1.p0
    public Object g0(m2.d dVar, Object obj) {
        jo.p.h(dVar, "<this>");
        return this;
    }

    public int hashCode() {
        return a().hashCode();
    }

    public String toString() {
        return "LayoutId(id=" + a() + ')';
    }
}
