package vi;

/* loaded from: classes3.dex */
public final class v implements Runnable {

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ g f57397w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ w f57398x;

    public v(w wVar, g gVar) {
        this.f57398x = wVar;
        this.f57397w = gVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        c cVar;
        c cVar2;
        obj = this.f57398x.f57400b;
        synchronized (obj) {
            w wVar = this.f57398x;
            cVar = wVar.f57401c;
            if (cVar != null) {
                cVar2 = wVar.f57401c;
                cVar2.a(this.f57397w);
            }
        }
    }
}
