package ai;

/* loaded from: classes3.dex */
public final class gl0 implements Runnable {

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ il0 f4505w;

    public gl0(il0 il0Var) {
        this.f4505w = il0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        jl0 jl0Var;
        boolean z10;
        jl0 jl0Var2;
        jl0 jl0Var3;
        jl0Var = this.f4505w.N;
        if (jl0Var != null) {
            z10 = this.f4505w.O;
            if (!z10) {
                jl0Var3 = this.f4505w.N;
                jl0Var3.i();
                this.f4505w.O = true;
            }
            jl0Var2 = this.f4505w.N;
            jl0Var2.b();
        }
    }
}
