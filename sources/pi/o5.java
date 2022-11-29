package pi;

/* loaded from: classes3.dex */
public final class o5 implements Runnable {

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ u f48098w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ String f48099x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ u5 f48100y;

    public o5(u5 u5Var, u uVar, String str) {
        this.f48100y = u5Var;
        this.f48098w = uVar;
        this.f48099x = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ba baVar;
        ba baVar2;
        baVar = this.f48100y.f48261w;
        baVar.d();
        baVar2 = this.f48100y.f48261w;
        baVar2.h(this.f48098w, this.f48099x);
    }
}
