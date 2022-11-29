package ai;

/* loaded from: classes3.dex */
public final class ow extends hv {

    /* renamed from: w  reason: collision with root package name */
    public final rg.p f7927w;

    public ow(rg.p pVar) {
        this.f7927w = pVar;
    }

    @Override // ai.iv
    public final void d4(hs hsVar) {
        if (this.f7927w != null) {
            this.f7927w.a(rg.h.a(hsVar.f4953x, hsVar.f4954y, hsVar.f4955z));
        }
    }
}
