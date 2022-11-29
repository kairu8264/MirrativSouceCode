package ai;

/* loaded from: classes3.dex */
public final class al2 implements q62<cm1> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ cl2 f1913a;

    public al2(cl2 cl2Var) {
        this.f1913a = cl2Var;
    }

    @Override // ai.q62
    public final /* bridge */ /* synthetic */ void b(cm1 cm1Var) {
        cm1 cm1Var2;
        cm1 cm1Var3 = cm1Var;
        synchronized (this.f1913a) {
            this.f1913a.f2865z = cm1Var3;
            cm1Var2 = this.f1913a.f2865z;
            cm1Var2.a();
        }
    }

    @Override // ai.q62
    public final void zza() {
        synchronized (this.f1913a) {
            this.f1913a.f2865z = null;
        }
    }
}
