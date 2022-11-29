package ai;

/* loaded from: classes3.dex */
public final class gh2 implements q62<my0> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ hh2 f4449a;

    public gh2(hh2 hh2Var) {
        this.f4449a = hh2Var;
    }

    @Override // ai.q62
    public final /* bridge */ /* synthetic */ void b(my0 my0Var) {
        yg2 yg2Var;
        yg2 yg2Var2;
        my0 my0Var2 = my0Var;
        synchronized (this.f4449a) {
            my0 my0Var3 = this.f4449a.E;
            if (my0Var3 != null) {
                my0Var3.b();
            }
            hh2 hh2Var = this.f4449a;
            hh2Var.E = my0Var2;
            my0Var2.g(hh2Var);
            yg2Var = this.f4449a.B;
            hh2 hh2Var2 = this.f4449a;
            yg2Var2 = hh2Var2.B;
            yg2Var.y(new ny0(my0Var2, hh2Var2, yg2Var2));
            my0Var2.a();
        }
    }

    @Override // ai.q62
    public final void zza() {
        synchronized (this.f4449a) {
            this.f4449a.E = null;
        }
    }
}
