package ai;

/* loaded from: classes3.dex */
public final class l62 implements q62<u01> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ m62 f6489a;

    public l62(m62 m62Var) {
        this.f6489a = m62Var;
    }

    @Override // ai.q62
    public final /* bridge */ /* synthetic */ void b(u01 u01Var) {
        synchronized (this.f6489a) {
            this.f6489a.f6818c = u01Var.d();
            u01Var.a();
        }
    }

    @Override // ai.q62
    public final void zza() {
        synchronized (this.f6489a) {
        }
    }
}
