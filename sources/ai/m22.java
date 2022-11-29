package ai;

import android.content.Context;
import com.google.android.gms.internal.ads.zzdkm;
import com.google.android.gms.internal.ads.zzehs;
import com.google.android.gms.internal.ads.zzfaw;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class m22 implements yy1<cm1, pm2, n02> {

    /* renamed from: a  reason: collision with root package name */
    public final Context f6778a;

    /* renamed from: b  reason: collision with root package name */
    public final Executor f6779b;

    /* renamed from: c  reason: collision with root package name */
    public final hm1 f6780c;

    public m22(Context context, Executor executor, hm1 hm1Var) {
        this.f6778a = context;
        this.f6779b = executor;
        this.f6780c = hm1Var;
    }

    @Override // ai.yy1
    public final void a(sl2 sl2Var, fl2 fl2Var, uy1<pm2, n02> uy1Var) throws zzfaw {
        try {
            yl2 yl2Var = sl2Var.f9875a.f8473a;
            if (yl2Var.f12661o.f7852a == 3) {
                uy1Var.f10879b.A(this.f6778a, yl2Var.f12650d, fl2Var.f4111v.toString(), uy1Var.f10880c);
            } else {
                uy1Var.f10879b.y(this.f6778a, yl2Var.f12650d, fl2Var.f4111v.toString(), uy1Var.f10880c);
            }
        } catch (Exception e10) {
            String valueOf = String.valueOf(uy1Var.f10878a);
            uj0.g(valueOf.length() != 0 ? "Fail to load ad from adapter ".concat(valueOf) : new String("Fail to load ad from adapter "), e10);
        }
    }

    @Override // ai.yy1
    public final /* bridge */ /* synthetic */ cm1 b(sl2 sl2Var, fl2 fl2Var, final uy1<pm2, n02> uy1Var) throws zzfaw, zzehs {
        dm1 b10 = this.f6780c.b(new j11(sl2Var, fl2Var, uy1Var.f10878a), new em1(new ne1(uy1Var) { // from class: ai.l22

            /* renamed from: a  reason: collision with root package name */
            public final uy1 f6467a;

            {
                this.f6467a = uy1Var;
            }

            @Override // ai.ne1
            public final void a(boolean z10, Context context, i51 i51Var) {
                uy1 uy1Var2 = this.f6467a;
                try {
                    ((pm2) uy1Var2.f10879b).v(z10);
                    ((pm2) uy1Var2.f10879b).z(context);
                } catch (zzfaw e10) {
                    throw new zzdkm(e10.getCause());
                }
            }
        }));
        b10.a().y0(new fw0(uy1Var.f10879b), this.f6779b);
        uy1Var.f10880c.S5(b10.m());
        return b10.h();
    }
}
