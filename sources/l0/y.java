package l0;

/* loaded from: classes.dex */
public final class y implements k1 {

    /* renamed from: w  reason: collision with root package name */
    public final io.l<a0, z> f39324w;

    /* renamed from: x  reason: collision with root package name */
    public z f39325x;

    /* JADX WARN: Multi-variable type inference failed */
    public y(io.l<? super a0, ? extends z> lVar) {
        jo.p.h(lVar, "effect");
        this.f39324w = lVar;
    }

    @Override // l0.k1
    public void a() {
        a0 a0Var;
        io.l<a0, z> lVar = this.f39324w;
        a0Var = c0.f38967a;
        this.f39325x = lVar.invoke(a0Var);
    }

    @Override // l0.k1
    public void b() {
    }

    @Override // l0.k1
    public void c() {
        z zVar = this.f39325x;
        if (zVar != null) {
            zVar.dispose();
        }
        this.f39325x = null;
    }
}
