package vi;

/* loaded from: classes3.dex */
public final class z implements Runnable {

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ g f57407w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ a0 f57408x;

    public z(a0 a0Var, g gVar) {
        this.f57408x = a0Var;
        this.f57407w = gVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        e eVar;
        e eVar2;
        obj = this.f57408x.f57350b;
        synchronized (obj) {
            a0 a0Var = this.f57408x;
            eVar = a0Var.f57351c;
            if (eVar != null) {
                eVar2 = a0Var.f57351c;
                eVar2.onSuccess(this.f57407w.o());
            }
        }
    }
}
