package ai;

/* loaded from: classes3.dex */
public final class gg0 extends yf0 {

    /* renamed from: w  reason: collision with root package name */
    public final gh.c f4428w;

    /* renamed from: x  reason: collision with root package name */
    public final gh.b f4429x;

    public gg0(gh.c cVar, gh.b bVar) {
        this.f4428w = cVar;
        this.f4429x = bVar;
    }

    @Override // ai.zf0
    public final void B(sr srVar) {
        if (this.f4428w != null) {
            this.f4428w.a(srVar.P());
        }
    }

    @Override // ai.zf0
    public final void E(int i10) {
    }

    @Override // ai.zf0
    public final void c() {
        gh.c cVar = this.f4428w;
        if (cVar != null) {
            cVar.b(this.f4429x);
        }
    }
}
