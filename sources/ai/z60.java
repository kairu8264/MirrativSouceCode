package ai;

/* loaded from: classes3.dex */
public final class z60 implements qk0<e60> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ j70 f12891a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ k70 f12892b;

    public z60(k70 k70Var, j70 j70Var) {
        this.f12892b = k70Var;
        this.f12891a = j70Var;
    }

    @Override // ai.qk0
    public final /* bridge */ /* synthetic */ void a(e60 e60Var) {
        Object obj;
        j70 j70Var;
        j70 j70Var2;
        j70 j70Var3;
        obj = this.f12892b.f6106a;
        synchronized (obj) {
            this.f12892b.f6113h = 0;
            j70Var = this.f12892b.f6112g;
            if (j70Var != null) {
                j70 j70Var4 = this.f12891a;
                j70Var2 = this.f12892b.f6112g;
                if (j70Var4 != j70Var2) {
                    yg.p1.k("New JS engine is loaded, marking previous one as destroyable.");
                    j70Var3 = this.f12892b.f6112g;
                    j70Var3.h();
                }
            }
            this.f12892b.f6112g = this.f12891a;
        }
    }
}
