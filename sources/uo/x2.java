package uo;

/* loaded from: classes4.dex */
public final class x2 implements Runnable {

    /* renamed from: w  reason: collision with root package name */
    public final k0 f56097w;

    /* renamed from: x  reason: collision with root package name */
    public final p<wn.v> f56098x;

    /* JADX WARN: Multi-variable type inference failed */
    public x2(k0 k0Var, p<? super wn.v> pVar) {
        this.f56097w = k0Var;
        this.f56098x = pVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f56098x.k(this.f56097w, wn.v.f59242a);
    }
}
