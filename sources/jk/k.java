package jk;

/* loaded from: classes3.dex */
public final class k implements Runnable {

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ d f38080w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ l f38081x;

    public k(l lVar, d dVar) {
        this.f38081x = lVar;
        this.f38080w = dVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        c cVar;
        c cVar2;
        obj = this.f38081x.f38083b;
        synchronized (obj) {
            cVar = this.f38081x.f38084c;
            if (cVar != null) {
                cVar2 = this.f38081x.f38084c;
                cVar2.onSuccess(this.f38080w.g());
            }
        }
    }
}
