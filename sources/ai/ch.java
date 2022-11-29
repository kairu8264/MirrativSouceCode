package ai;

/* loaded from: classes3.dex */
public final class ch implements Runnable {

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ ih f2825w;

    public ch(ih ihVar) {
        this.f2825w = ihVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10;
        lh lhVar;
        z10 = this.f2825w.f5226b0;
        if (z10) {
            return;
        }
        lhVar = this.f2825w.K;
        lhVar.b(this.f2825w);
    }
}
