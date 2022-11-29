package ai;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzehs;
import com.google.android.gms.internal.ads.zzfaw;

/* loaded from: classes3.dex */
public final class d12 implements yy1<id1, ya0, n02> {

    /* renamed from: a  reason: collision with root package name */
    public final Context f3101a;

    /* renamed from: b  reason: collision with root package name */
    public final ge1 f3102b;

    public d12(Context context, ge1 ge1Var) {
        this.f3101a = context;
        this.f3102b = ge1Var;
    }

    @Override // ai.yy1
    public final void a(sl2 sl2Var, fl2 fl2Var, uy1<ya0, n02> uy1Var) throws zzfaw {
        try {
            uy1Var.f10879b.r0(fl2Var.V);
            uy1Var.f10879b.U3(fl2Var.Q, fl2Var.f4111v.toString(), sl2Var.f9875a.f8473a.f12650d, yh.b.h1(this.f3101a), new b12(this, uy1Var, null), uy1Var.f10880c);
        } catch (RemoteException e10) {
            throw new zzfaw(e10);
        }
    }

    @Override // ai.yy1
    public final /* bridge */ /* synthetic */ id1 b(sl2 sl2Var, fl2 fl2Var, uy1<ya0, n02> uy1Var) throws zzfaw, zzehs {
        x02 x02Var = new x02(fl2Var, uy1Var.f10879b, false);
        jd1 c10 = this.f3102b.c(new j11(sl2Var, fl2Var, uy1Var.f10878a), new md1(x02Var, null));
        x02Var.b(c10.d());
        uy1Var.f10880c.S5(c10.g());
        return c10.h();
    }
}
