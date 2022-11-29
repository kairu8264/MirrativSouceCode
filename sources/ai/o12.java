package ai;

import android.content.Context;
import com.google.android.gms.internal.ads.zzehs;
import com.google.android.gms.internal.ads.zzfaw;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class o12 implements yy1<jg1, pm2, n02> {

    /* renamed from: a  reason: collision with root package name */
    public final Context f7605a;

    /* renamed from: b  reason: collision with root package name */
    public final cf1 f7606b;

    /* renamed from: c  reason: collision with root package name */
    public final Executor f7607c;

    public o12(Context context, cf1 cf1Var, Executor executor) {
        this.f7605a = context;
        this.f7606b = cf1Var;
        this.f7607c = executor;
    }

    public static final boolean c(sl2 sl2Var, int i10) {
        return sl2Var.f9875a.f8473a.f12653g.contains(Integer.toString(i10));
    }

    @Override // ai.yy1
    public final void a(sl2 sl2Var, fl2 fl2Var, uy1<pm2, n02> uy1Var) throws zzfaw {
        yl2 yl2Var = sl2Var.f9875a.f8473a;
        uy1Var.f10879b.r(this.f7605a, sl2Var.f9875a.f8473a.f12650d, fl2Var.f4111v.toString(), yg.y0.l(fl2Var.f4108s), uy1Var.f10880c, yl2Var.f12655i, yl2Var.f12653g);
    }

    @Override // ai.yy1
    public final /* bridge */ /* synthetic */ jg1 b(sl2 sl2Var, fl2 fl2Var, uy1<pm2, n02> uy1Var) throws zzfaw, zzehs {
        og1 C;
        k90 b10 = uy1Var.f10879b.b();
        l90 c10 = uy1Var.f10879b.c();
        o90 x10 = uy1Var.f10879b.x();
        if (x10 != null && c(sl2Var, 6)) {
            C = og1.B(x10);
        } else if (b10 != null && c(sl2Var, 6)) {
            C = og1.E(b10);
        } else if (b10 != null && c(sl2Var, 2)) {
            C = og1.D(b10);
        } else if (c10 != null && c(sl2Var, 6)) {
            C = og1.F(c10);
        } else if (c10 != null && c(sl2Var, 1)) {
            C = og1.C(c10);
        } else {
            throw new zzehs(1, "No native ad mappers");
        }
        if (sl2Var.f9875a.f8473a.f12653g.contains(Integer.toString(C.d0()))) {
            qg1 d10 = this.f7606b.d(new j11(sl2Var, fl2Var, uy1Var.f10878a), new ah1(C), new pi1(c10, b10, x10, null));
            uy1Var.f10880c.S5(d10.f());
            d10.a().y0(new fw0(uy1Var.f10879b), this.f7607c);
            return d10.h();
        }
        throw new zzehs(1, "No corresponding native ad listener");
    }
}
