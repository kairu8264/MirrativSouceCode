package ai;

/* loaded from: classes3.dex */
public final class i62 implements q62<id1> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ j62 f5126a;

    public i62(j62 j62Var) {
        this.f5126a = j62Var;
    }

    @Override // ai.q62
    public final /* bridge */ /* synthetic */ void b(id1 id1Var) {
        id1 id1Var2;
        id1 id1Var3 = id1Var;
        synchronized (this.f5126a) {
            this.f5126a.C = id1Var3;
            id1Var2 = this.f5126a.C;
            id1Var2.a();
        }
    }

    @Override // ai.q62
    public final void zza() {
        synchronized (this.f5126a) {
            this.f5126a.C = null;
        }
    }
}
