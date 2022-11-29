package vi;

/* loaded from: classes3.dex */
public final class x implements Runnable {

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ g f57402w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ y f57403x;

    public x(y yVar, g gVar) {
        this.f57403x = yVar;
        this.f57402w = gVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        d dVar;
        d dVar2;
        obj = this.f57403x.f57405b;
        synchronized (obj) {
            y yVar = this.f57403x;
            dVar = yVar.f57406c;
            if (dVar != null) {
                dVar2 = yVar.f57406c;
                dVar2.a((Exception) rh.p.i(this.f57402w.n()));
            }
        }
    }
}
