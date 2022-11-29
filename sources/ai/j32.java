package ai;

import android.content.Context;
import com.google.android.gms.internal.ads.zzdkm;
import com.google.android.gms.internal.ads.zzehs;
import com.google.android.gms.internal.ads.zzfaw;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class j32 implements yy1<cm1, pm2, o02> {

    /* renamed from: a  reason: collision with root package name */
    public final Context f5609a;

    /* renamed from: b  reason: collision with root package name */
    public final Executor f5610b;

    /* renamed from: c  reason: collision with root package name */
    public final hm1 f5611c;

    public j32(Context context, Executor executor, hm1 hm1Var) {
        this.f5609a = context;
        this.f5610b = executor;
        this.f5611c = hm1Var;
    }

    public static final void e(sl2 sl2Var, fl2 fl2Var, uy1<pm2, o02> uy1Var) {
        try {
            uy1Var.f10879b.o(sl2Var.f9875a.f8473a.f12650d, fl2Var.f4111v.toString());
        } catch (Exception e10) {
            String valueOf = String.valueOf(uy1Var.f10878a);
            uj0.g(valueOf.length() != 0 ? "Fail to load ad from adapter ".concat(valueOf) : new String("Fail to load ad from adapter "), e10);
        }
    }

    @Override // ai.yy1
    public final void a(sl2 sl2Var, fl2 fl2Var, uy1<pm2, o02> uy1Var) throws zzfaw {
        if (!uy1Var.f10879b.q()) {
            uy1Var.f10880c.T5(new h32(this, sl2Var, fl2Var, uy1Var));
            uy1Var.f10879b.n(this.f5609a, sl2Var.f9875a.f8473a.f12650d, null, uy1Var.f10880c, fl2Var.f4111v.toString());
            return;
        }
        e(sl2Var, fl2Var, uy1Var);
    }

    @Override // ai.yy1
    public final /* bridge */ /* synthetic */ cm1 b(sl2 sl2Var, fl2 fl2Var, final uy1<pm2, o02> uy1Var) throws zzfaw, zzehs {
        dm1 b10 = this.f5611c.b(new j11(sl2Var, fl2Var, uy1Var.f10878a), new em1(new ne1(uy1Var) { // from class: ai.f32

            /* renamed from: a  reason: collision with root package name */
            public final uy1 f3914a;

            {
                this.f3914a = uy1Var;
            }

            @Override // ai.ne1
            public final void a(boolean z10, Context context, i51 i51Var) {
                uy1 uy1Var2 = this.f3914a;
                try {
                    ((pm2) uy1Var2.f10879b).v(z10);
                    ((pm2) uy1Var2.f10879b).p();
                } catch (zzfaw e10) {
                    uj0.g("Cannot show rewarded video.", e10);
                    throw new zzdkm(e10.getCause());
                }
            }
        }));
        b10.a().y0(new fw0(uy1Var.f10879b), this.f5610b);
        d61 b11 = b10.b();
        t41 c10 = b10.c();
        uy1Var.f10880c.S5(new i32(this, b10.i(), c10, b11, b10.k()));
        return b10.h();
    }
}
