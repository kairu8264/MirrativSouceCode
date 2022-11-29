package ai;

/* loaded from: classes3.dex */
public final class m implements Runnable {

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ n f6738w;

    public m(n nVar) {
        this.f6738w = nVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        boolean z10;
        vt2 vt2Var;
        Object obj2;
        obj = this.f6738w.G;
        synchronized (obj) {
            z10 = this.f6738w.H;
            if (z10) {
                return;
            }
            this.f6738w.H = true;
            try {
                n.p(this.f6738w);
            } catch (Exception e10) {
                vt2Var = this.f6738w.B;
                vt2Var.c(2023, -1L, e10);
            }
            obj2 = this.f6738w.G;
            synchronized (obj2) {
                this.f6738w.H = false;
            }
        }
    }
}
