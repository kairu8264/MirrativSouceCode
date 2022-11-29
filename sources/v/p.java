package v;

import androidx.compose.ui.platform.c1;
import androidx.compose.ui.platform.d1;

/* loaded from: classes.dex */
public final class p extends d1 implements z0.h {

    /* renamed from: x  reason: collision with root package name */
    public final a f56305x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(a aVar, io.l<? super c1, wn.v> lVar) {
        super(lVar);
        jo.p.h(aVar, "overscrollEffect");
        jo.p.h(lVar, "inspectorInfo");
        this.f56305x = aVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof p) {
            return jo.p.c(this.f56305x, ((p) obj).f56305x);
        }
        return false;
    }

    public int hashCode() {
        return this.f56305x.hashCode();
    }

    public String toString() {
        return "DrawOverscrollModifier(overscrollEffect=" + this.f56305x + ')';
    }

    @Override // z0.h
    public void x0(e1.c cVar) {
        jo.p.h(cVar, "<this>");
        cVar.c1();
        this.f56305x.v(cVar);
    }
}
