package jk;

/* loaded from: classes3.dex */
public final class g implements Runnable {

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ d f38070w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ h f38071x;

    public g(h hVar, d dVar) {
        this.f38071x = hVar;
        this.f38070w = dVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        a aVar;
        a aVar2;
        obj = this.f38071x.f38073b;
        synchronized (obj) {
            aVar = this.f38071x.f38074c;
            if (aVar != null) {
                aVar2 = this.f38071x.f38074c;
                aVar2.onComplete(this.f38070w);
            }
        }
    }
}
