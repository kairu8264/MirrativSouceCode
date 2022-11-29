package q1;

import androidx.compose.ui.platform.c1;
import androidx.compose.ui.platform.d1;

/* loaded from: classes.dex */
public final class j0 extends d1 implements i0 {

    /* renamed from: x  reason: collision with root package name */
    public final io.l<q, wn.v> f48587x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public j0(io.l<? super q, wn.v> lVar, io.l<? super c1, wn.v> lVar2) {
        super(lVar2);
        jo.p.h(lVar, "callback");
        jo.p.h(lVar2, "inspectorInfo");
        this.f48587x = lVar;
    }

    @Override // q1.i0
    public void a0(q qVar) {
        jo.p.h(qVar, "coordinates");
        this.f48587x.invoke(qVar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof j0) {
            return jo.p.c(this.f48587x, ((j0) obj).f48587x);
        }
        return false;
    }

    public int hashCode() {
        return this.f48587x.hashCode();
    }
}
