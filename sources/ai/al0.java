package ai;

/* loaded from: classes3.dex */
public final class al0 implements Runnable {

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ il0 f1911w;

    public al0(il0 il0Var) {
        this.f1911w = il0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        jl0 jl0Var;
        jl0 jl0Var2;
        jl0Var = this.f1911w.N;
        if (jl0Var != null) {
            jl0Var2 = this.f1911w.N;
            jl0Var2.c();
        }
    }
}
