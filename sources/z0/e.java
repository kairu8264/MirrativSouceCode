package z0;

import androidx.compose.ui.platform.c1;
import androidx.compose.ui.platform.d1;
import wn.v;

/* loaded from: classes.dex */
public final class e extends d1 implements h {

    /* renamed from: x  reason: collision with root package name */
    public final io.l<e1.e, v> f62399x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public e(io.l<? super e1.e, v> lVar, io.l<? super c1, v> lVar2) {
        super(lVar2);
        jo.p.h(lVar, "onDraw");
        jo.p.h(lVar2, "inspectorInfo");
        this.f62399x = lVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof e) {
            return jo.p.c(this.f62399x, ((e) obj).f62399x);
        }
        return false;
    }

    public int hashCode() {
        return this.f62399x.hashCode();
    }

    @Override // z0.h
    public void x0(e1.c cVar) {
        jo.p.h(cVar, "<this>");
        this.f62399x.invoke(cVar);
        cVar.c1();
    }
}
