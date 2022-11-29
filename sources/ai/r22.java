package ai;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzehs;
import com.google.android.gms.internal.ads.zzfaw;

/* loaded from: classes3.dex */
public final class r22 implements yy1<cm1, ya0, n02> {

    /* renamed from: a  reason: collision with root package name */
    public final Context f9313a;

    /* renamed from: b  reason: collision with root package name */
    public final hm1 f9314b;

    public r22(Context context, hm1 hm1Var) {
        this.f9313a = context;
        this.f9314b = hm1Var;
    }

    @Override // ai.yy1
    public final void a(sl2 sl2Var, fl2 fl2Var, uy1<ya0, n02> uy1Var) throws zzfaw {
        try {
            uy1Var.f10879b.r0(fl2Var.V);
            if (sl2Var.f9875a.f8473a.f12661o.f7852a == 3) {
                uy1Var.f10879b.h5(fl2Var.Q, fl2Var.f4111v.toString(), sl2Var.f9875a.f8473a.f12650d, yh.b.h1(this.f9313a), new o22(this, uy1Var, null), uy1Var.f10880c);
            } else {
                uy1Var.f10879b.A3(fl2Var.Q, fl2Var.f4111v.toString(), sl2Var.f9875a.f8473a.f12650d, yh.b.h1(this.f9313a), new o22(this, uy1Var, null), uy1Var.f10880c);
            }
        } catch (RemoteException e10) {
            yg.p1.l("Remote exception loading a rewarded RTB ad", e10);
        }
    }

    @Override // ai.yy1
    public final /* bridge */ /* synthetic */ cm1 b(sl2 sl2Var, fl2 fl2Var, uy1<ya0, n02> uy1Var) throws zzfaw, zzehs {
        x02 x02Var = new x02(fl2Var, uy1Var.f10879b, true);
        dm1 b10 = this.f9314b.b(new j11(sl2Var, fl2Var, uy1Var.f10878a), new em1(x02Var));
        x02Var.b(b10.d());
        uy1Var.f10880c.S5(b10.n());
        return b10.h();
    }
}
