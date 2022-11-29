package ai;

/* loaded from: classes3.dex */
public final class wr<AdT> extends pt {

    /* renamed from: w  reason: collision with root package name */
    public final rg.d<AdT> f11724w;

    /* renamed from: x  reason: collision with root package name */
    public final AdT f11725x;

    public wr(rg.d<AdT> dVar, AdT adt) {
        this.f11724w = dVar;
        this.f11725x = adt;
    }

    @Override // ai.qt
    public final void B2(sr srVar) {
        rg.d<AdT> dVar = this.f11724w;
        if (dVar != null) {
            dVar.a(srVar.P());
        }
    }

    @Override // ai.qt
    public final void zzb() {
        AdT adt;
        rg.d<AdT> dVar = this.f11724w;
        if (dVar == null || (adt = this.f11725x) == null) {
            return;
        }
        dVar.b(adt);
    }
}
