package dk;

/* loaded from: classes3.dex */
public abstract class g implements Runnable {

    /* renamed from: w  reason: collision with root package name */
    public final jk.o<?> f29688w;

    public g() {
        this.f29688w = null;
    }

    public g(jk.o<?> oVar) {
        this.f29688w = oVar;
    }

    public abstract void a();

    public final jk.o<?> b() {
        return this.f29688w;
    }

    public final void c(Exception exc) {
        jk.o<?> oVar = this.f29688w;
        if (oVar != null) {
            oVar.d(exc);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            a();
        } catch (Exception e10) {
            c(e10);
        }
    }
}
