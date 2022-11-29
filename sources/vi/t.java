package vi;

/* loaded from: classes3.dex */
public final class t implements Runnable {

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ u f57393w;

    public t(u uVar) {
        this.f57393w = uVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        b bVar;
        b bVar2;
        obj = this.f57393w.f57395b;
        synchronized (obj) {
            u uVar = this.f57393w;
            bVar = uVar.f57396c;
            if (bVar != null) {
                bVar2 = uVar.f57396c;
                bVar2.c();
            }
        }
    }
}
