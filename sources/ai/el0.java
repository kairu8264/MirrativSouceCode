package ai;

/* loaded from: classes3.dex */
public final class el0 implements Runnable {

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ int f3708w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ int f3709x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ il0 f3710y;

    public el0(il0 il0Var, int i10, int i11) {
        this.f3710y = il0Var;
        this.f3708w = i10;
        this.f3709x = i11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        jl0 jl0Var;
        jl0 jl0Var2;
        jl0Var = this.f3710y.N;
        if (jl0Var != null) {
            jl0Var2 = this.f3710y.N;
            jl0Var2.g(this.f3708w, this.f3709x);
        }
    }
}
