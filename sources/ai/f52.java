package ai;

/* loaded from: classes3.dex */
public final class f52 implements q62<ty0> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ g52 f3949a;

    public f52(g52 g52Var) {
        this.f3949a = g52Var;
    }

    @Override // ai.q62
    public final /* bridge */ /* synthetic */ void b(ty0 ty0Var) {
        ty0 ty0Var2;
        ty0 ty0Var3;
        ty0 ty0Var4;
        ty0 ty0Var5 = ty0Var;
        synchronized (this.f3949a) {
            ty0Var2 = this.f3949a.C;
            if (ty0Var2 != null) {
                ty0Var4 = this.f3949a.C;
                ty0Var4.b();
            }
            this.f3949a.C = ty0Var5;
            ty0Var3 = this.f3949a.C;
            ty0Var3.a();
        }
    }

    @Override // ai.q62
    public final void zza() {
        synchronized (this.f3949a) {
            this.f3949a.C = null;
        }
    }
}
