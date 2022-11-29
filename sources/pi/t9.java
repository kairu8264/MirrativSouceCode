package pi;

/* loaded from: classes3.dex */
public final class t9 implements Runnable {

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ ca f48244w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ ba f48245x;

    public t9(ba baVar, ca caVar) {
        this.f48245x = baVar;
        this.f48244w = caVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ba.j0(this.f48245x, this.f48244w);
        this.f48245x.u();
    }
}
