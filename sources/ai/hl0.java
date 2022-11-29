package ai;

/* loaded from: classes3.dex */
public final class hl0 implements Runnable {

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ il0 f4890w;

    public hl0(il0 il0Var) {
        this.f4890w = il0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        jl0 jl0Var;
        jl0 jl0Var2;
        jl0Var = this.f4890w.N;
        if (jl0Var != null) {
            jl0Var2 = this.f4890w.N;
            jl0Var2.d();
        }
    }
}
