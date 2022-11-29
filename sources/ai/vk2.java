package ai;

/* loaded from: classes3.dex */
public final class vk2 implements q62<cm1> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ wk2 f11116a;

    public vk2(wk2 wk2Var) {
        this.f11116a = wk2Var;
    }

    @Override // ai.q62
    public final /* bridge */ /* synthetic */ void b(cm1 cm1Var) {
        cm1 cm1Var2;
        cm1 cm1Var3 = cm1Var;
        synchronized (this.f11116a) {
            this.f11116a.B = cm1Var3;
            cm1Var2 = this.f11116a.B;
            cm1Var2.a();
        }
    }

    @Override // ai.q62
    public final void zza() {
        synchronized (this.f11116a) {
            this.f11116a.B = null;
        }
    }
}
