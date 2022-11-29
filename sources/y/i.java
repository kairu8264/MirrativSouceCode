package y;

/* loaded from: classes.dex */
public final class i extends androidx.compose.ui.platform.d1 implements q1.p0 {

    /* renamed from: x  reason: collision with root package name */
    public x0.a f60807x;

    /* renamed from: y  reason: collision with root package name */
    public boolean f60808y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(x0.a aVar, boolean z10, io.l<? super androidx.compose.ui.platform.c1, wn.v> lVar) {
        super(lVar);
        jo.p.h(aVar, "alignment");
        jo.p.h(lVar, "inspectorInfo");
        this.f60807x = aVar;
        this.f60808y = z10;
    }

    public final x0.a b() {
        return this.f60807x;
    }

    public final boolean c() {
        return this.f60808y;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        i iVar = obj instanceof i ? (i) obj : null;
        if (iVar == null) {
            return false;
        }
        return jo.p.c(this.f60807x, iVar.f60807x) && this.f60808y == iVar.f60808y;
    }

    @Override // q1.p0
    /* renamed from: f */
    public i g0(m2.d dVar, Object obj) {
        jo.p.h(dVar, "<this>");
        return this;
    }

    public int hashCode() {
        return (this.f60807x.hashCode() * 31) + Boolean.hashCode(this.f60808y);
    }

    public String toString() {
        return "BoxChildData(alignment=" + this.f60807x + ", matchParentSize=" + this.f60808y + ')';
    }
}
