package ci;

/* loaded from: classes3.dex */
public final class j implements Runnable {

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ l f19649w;

    public /* synthetic */ j(l lVar, i iVar) {
        this.f19649w = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long b10 = this.f19649w.b();
        if (b10 == -1 || vh.i.b().currentTimeMillis() <= b10) {
            return;
        }
        l.f(l.c(this.f19649w));
    }
}
