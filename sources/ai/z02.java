package ai;

import android.content.Context;
import com.google.android.gms.internal.ads.zzdkm;
import com.google.android.gms.internal.ads.zzehs;
import com.google.android.gms.internal.ads.zzfaw;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class z02 implements yy1<id1, pm2, n02> {

    /* renamed from: a  reason: collision with root package name */
    public final Context f12785a;

    /* renamed from: b  reason: collision with root package name */
    public final ge1 f12786b;

    /* renamed from: c  reason: collision with root package name */
    public final zj0 f12787c;

    /* renamed from: d  reason: collision with root package name */
    public final Executor f12788d;

    public z02(Context context, zj0 zj0Var, ge1 ge1Var, Executor executor) {
        this.f12785a = context;
        this.f12787c = zj0Var;
        this.f12786b = ge1Var;
        this.f12788d = executor;
    }

    @Override // ai.yy1
    public final void a(sl2 sl2Var, fl2 fl2Var, uy1<pm2, n02> uy1Var) throws zzfaw {
        uy1Var.f10879b.k(this.f12785a, sl2Var.f9875a.f8473a.f12650d, fl2Var.f4111v.toString(), yg.y0.l(fl2Var.f4108s), uy1Var.f10880c);
    }

    @Override // ai.yy1
    public final /* bridge */ /* synthetic */ id1 b(sl2 sl2Var, fl2 fl2Var, final uy1<pm2, n02> uy1Var) throws zzfaw, zzehs {
        jd1 c10 = this.f12786b.c(new j11(sl2Var, fl2Var, uy1Var.f10878a), new md1(new ne1(this, uy1Var) { // from class: ai.y02

            /* renamed from: a  reason: collision with root package name */
            public final z02 f12383a;

            /* renamed from: b  reason: collision with root package name */
            public final uy1 f12384b;

            {
                this.f12383a = this;
                this.f12384b = uy1Var;
            }

            @Override // ai.ne1
            public final void a(boolean z10, Context context, i51 i51Var) {
                this.f12383a.c(this.f12384b, z10, context, i51Var);
            }
        }, null));
        c10.a().y0(new fw0(uy1Var.f10879b), this.f12788d);
        uy1Var.f10880c.S5(c10.f());
        return c10.h();
    }

    public final /* synthetic */ void c(uy1 uy1Var, boolean z10, Context context, i51 i51Var) throws zzdkm {
        try {
            ((pm2) uy1Var.f10879b).v(z10);
            if (this.f12787c.f13015y < ((Integer) ft.c().c(ox.f8101u0)).intValue()) {
                ((pm2) uy1Var.f10879b).g();
            } else {
                ((pm2) uy1Var.f10879b).h(context);
            }
        } catch (zzfaw e10) {
            uj0.e("Cannot show interstitial.");
            throw new zzdkm(e10.getCause());
        }
    }
}
