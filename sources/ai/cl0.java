package ai;

/* loaded from: classes3.dex */
public final class cl0 implements Runnable {

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ String f2859w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ String f2860x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ il0 f2861y;

    public cl0(il0 il0Var, String str, String str2) {
        this.f2861y = il0Var;
        this.f2859w = str;
        this.f2860x = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        jl0 jl0Var;
        jl0 jl0Var2;
        jl0Var = this.f2861y.N;
        if (jl0Var != null) {
            jl0Var2 = this.f2861y.N;
            jl0Var2.f(this.f2859w, this.f2860x);
        }
    }
}
