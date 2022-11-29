package ai;

import android.app.Activity;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public final class ny0 extends km {

    /* renamed from: w  reason: collision with root package name */
    public final my0 f7566w;

    /* renamed from: x  reason: collision with root package name */
    public final au f7567x;

    /* renamed from: y  reason: collision with root package name */
    public final yg2 f7568y;

    /* renamed from: z  reason: collision with root package name */
    public boolean f7569z = false;

    public ny0(my0 my0Var, au auVar, yg2 yg2Var) {
        this.f7566w = my0Var;
        this.f7567x = auVar;
        this.f7568y = yg2Var;
    }

    @Override // ai.lm
    public final void L5(qm qmVar) {
    }

    @Override // ai.lm
    public final au c() {
        return this.f7567x;
    }

    @Override // ai.lm
    public final lv f() {
        if (((Boolean) ft.c().c(ox.f7952b5)).booleanValue()) {
            return this.f7566w.d();
        }
        return null;
    }

    @Override // ai.lm
    public final void m5(iv ivVar) {
        rh.p.d("setOnPaidEventListener must be called on the main UI thread.");
        yg2 yg2Var = this.f7568y;
        if (yg2Var != null) {
            yg2Var.v(ivVar);
        }
    }

    @Override // ai.lm
    public final void p0(boolean z10) {
        this.f7569z = z10;
    }

    @Override // ai.lm
    public final void q5(yh.a aVar, sm smVar) {
        try {
            this.f7568y.h(smVar);
            this.f7566w.h((Activity) yh.b.z0(aVar), smVar, this.f7569z);
        } catch (RemoteException e10) {
            uj0.i("#007 Could not call remote method.", e10);
        }
    }
}
