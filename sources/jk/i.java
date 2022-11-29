package jk;

/* loaded from: classes3.dex */
public final class i implements Runnable {

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ d f38075w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ j f38076x;

    public i(j jVar, d dVar) {
        this.f38076x = jVar;
        this.f38075w = dVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        b bVar;
        b bVar2;
        obj = this.f38076x.f38078b;
        synchronized (obj) {
            bVar = this.f38076x.f38079c;
            if (bVar != null) {
                bVar2 = this.f38076x.f38079c;
                bVar2.a(this.f38075w.f());
            }
        }
    }
}
