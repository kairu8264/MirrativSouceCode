package ai;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzehs;
import com.google.android.gms.internal.ads.zzfaw;

/* loaded from: classes3.dex */
public final class t12 implements yy1<jg1, ya0, n02> {

    /* renamed from: a */
    public final Context f10068a;

    /* renamed from: b */
    public final cf1 f10069b;

    /* renamed from: c */
    public o90 f10070c;

    /* renamed from: d */
    public final zj0 f10071d;

    public t12(Context context, cf1 cf1Var, zj0 zj0Var) {
        this.f10068a = context;
        this.f10069b = cf1Var;
        this.f10071d = zj0Var;
    }

    @Override // ai.yy1
    public final void a(sl2 sl2Var, fl2 fl2Var, uy1<ya0, n02> uy1Var) throws zzfaw {
        try {
            uy1Var.f10879b.r0(fl2Var.V);
            if (this.f10071d.f13015y < ((Integer) ft.c().c(ox.f7966d1)).intValue()) {
                uy1Var.f10879b.R2(fl2Var.Q, fl2Var.f4111v.toString(), sl2Var.f9875a.f8473a.f12650d, yh.b.h1(this.f10068a), new r12(this, uy1Var, null), uy1Var.f10880c);
            } else {
                uy1Var.f10879b.w5(fl2Var.Q, fl2Var.f4111v.toString(), sl2Var.f9875a.f8473a.f12650d, yh.b.h1(this.f10068a), new r12(this, uy1Var, null), uy1Var.f10880c, sl2Var.f9875a.f8473a.f12655i);
            }
        } catch (RemoteException e10) {
            throw new zzfaw(e10);
        }
    }

    @Override // ai.yy1
    public final /* bridge */ /* synthetic */ jg1 b(sl2 sl2Var, fl2 fl2Var, uy1<ya0, n02> uy1Var) throws zzfaw, zzehs {
        if (sl2Var.f9875a.f8473a.f12653g.contains(Integer.toString(6))) {
            og1 B = og1.B(this.f10070c);
            if (sl2Var.f9875a.f8473a.f12653g.contains(Integer.toString(B.d0()))) {
                qg1 d10 = this.f10069b.d(new j11(sl2Var, fl2Var, uy1Var.f10878a), new ah1(B), new pi1(null, null, this.f10070c, null));
                uy1Var.f10880c.S5(d10.g());
                return d10.h();
            }
            throw new zzehs(1, "No corresponding native ad listener");
        }
        throw new zzehs(2, "Unified must be used for RTB.");
    }
}
