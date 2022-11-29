package ai;

/* loaded from: classes3.dex */
public final class fl0 implements Runnable {

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ il0 f4077w;

    public fl0(il0 il0Var) {
        this.f4077w = il0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        jl0 jl0Var;
        jl0 jl0Var2;
        jl0 jl0Var3;
        jl0Var = this.f4077w.N;
        if (jl0Var != null) {
            jl0Var2 = this.f4077w.N;
            jl0Var2.d();
            jl0Var3 = this.f4077w.N;
            jl0Var3.e();
        }
    }
}
