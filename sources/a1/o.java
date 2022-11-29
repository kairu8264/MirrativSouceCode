package a1;

/* loaded from: classes.dex */
public final class o implements io.l<p, wn.v> {

    /* renamed from: w  reason: collision with root package name */
    public final m f331w;

    public o(m mVar) {
        jo.p.h(mVar, "modifier");
        this.f331w = mVar;
    }

    public final m a() {
        return this.f331w;
    }

    public void b(p pVar) {
        jo.p.h(pVar, "focusProperties");
        this.f331w.v0(new l(pVar));
    }

    @Override // io.l
    public /* bridge */ /* synthetic */ wn.v invoke(p pVar) {
        b(pVar);
        return wn.v.f59242a;
    }
}
