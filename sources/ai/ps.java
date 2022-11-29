package ai;

import android.app.Activity;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzcgw;

/* loaded from: classes3.dex */
public final class ps extends ct<qc0> {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Activity f8540b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ bt f8541c;

    public ps(bt btVar, Activity activity) {
        this.f8541c = btVar;
        this.f8540b = activity;
    }

    @Override // ai.ct
    public final /* bridge */ /* synthetic */ qc0 a() {
        bt.f(this.f8540b, "ad_overlay");
        return null;
    }

    @Override // ai.ct
    public final /* bridge */ /* synthetic */ qc0 b() throws RemoteException {
        rd0 rd0Var;
        nc0 nc0Var;
        ox.a(this.f8540b);
        if (((Boolean) ft.c().c(ox.W6)).booleanValue()) {
            try {
                return pc0.R5(((tc0) xj0.a(this.f8540b, "com.google.android.gms.ads.ChimeraAdOverlayCreatorImpl", os.f7896a)).L(yh.b.h1(this.f8540b)));
            } catch (RemoteException | zzcgw | NullPointerException e10) {
                this.f8541c.f2481h = pd0.c(this.f8540b.getApplicationContext());
                rd0Var = this.f8541c.f2481h;
                rd0Var.b(e10, "ClientApiBroker.createAdOverlay");
                return null;
            }
        }
        nc0Var = this.f8541c.f2479f;
        return nc0Var.c(this.f8540b);
    }

    @Override // ai.ct
    public final /* bridge */ /* synthetic */ qc0 c(ku kuVar) throws RemoteException {
        return kuVar.P(yh.b.h1(this.f8540b));
    }
}
