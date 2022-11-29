package ai;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.internal.ads.zzehs;
import com.google.android.gms.internal.ads.zzfaw;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class wz1 implements yy1<ty0, pm2, n02> {

    /* renamed from: a  reason: collision with root package name */
    public final Context f11824a;

    /* renamed from: b  reason: collision with root package name */
    public final rz0 f11825b;

    /* renamed from: c  reason: collision with root package name */
    public final Executor f11826c;

    public wz1(Context context, rz0 rz0Var, Executor executor) {
        this.f11824a = context;
        this.f11825b = rz0Var;
        this.f11826c = executor;
    }

    @Override // ai.yy1
    public final void a(sl2 sl2Var, fl2 fl2Var, uy1<pm2, n02> uy1Var) throws zzfaw {
        fs b10;
        fs fsVar = sl2Var.f9875a.f8473a.f12651e;
        if (fsVar.J) {
            b10 = new fs(this.f11824a, rg.w.b(fsVar.A, fsVar.f4174x));
        } else {
            if (((Boolean) ft.c().c(ox.B5)).booleanValue() && fl2Var.f4087d0) {
                b10 = new fs(this.f11824a, rg.w.c(fsVar.A, fsVar.f4174x));
            } else {
                b10 = cm2.b(this.f11824a, fl2Var.f4110u);
            }
        }
        fs fsVar2 = b10;
        if (((Boolean) ft.c().c(ox.B5)).booleanValue() && fl2Var.f4087d0) {
            uy1Var.f10879b.e(this.f11824a, fsVar2, sl2Var.f9875a.f8473a.f12650d, fl2Var.f4111v.toString(), yg.y0.l(fl2Var.f4108s), uy1Var.f10880c);
        } else {
            uy1Var.f10879b.j(this.f11824a, fsVar2, sl2Var.f9875a.f8473a.f12650d, fl2Var.f4111v.toString(), yg.y0.l(fl2Var.f4108s), uy1Var.f10880c);
        }
    }

    @Override // ai.yy1
    public final /* bridge */ /* synthetic */ ty0 b(sl2 sl2Var, final fl2 fl2Var, uy1<pm2, n02> uy1Var) throws zzfaw, zzehs {
        final View d10;
        if (((Boolean) ft.c().c(ox.B5)).booleanValue() && fl2Var.f4087d0) {
            i90 f10 = uy1Var.f10879b.f();
            if (f10 != null) {
                try {
                    d10 = (View) yh.b.z0(f10.c());
                    boolean a10 = f10.a();
                    if (d10 == null) {
                        throw new zzfaw(new Exception("BannerAdapterWrapper interscrollerView should not be null"));
                    }
                    if (a10) {
                        try {
                            d10 = (View) j43.i(j43.a(null), new p33(this, d10, fl2Var) { // from class: ai.vz1

                                /* renamed from: a  reason: collision with root package name */
                                public final wz1 f11420a;

                                /* renamed from: b  reason: collision with root package name */
                                public final View f11421b;

                                /* renamed from: c  reason: collision with root package name */
                                public final fl2 f11422c;

                                {
                                    this.f11420a = this;
                                    this.f11421b = d10;
                                    this.f11422c = fl2Var;
                                }

                                @Override // ai.p33
                                public final s43 a(Object obj) {
                                    return this.f11420a.c(this.f11421b, this.f11422c, obj);
                                }
                            }, hk0.f4882e).get();
                        } catch (InterruptedException | ExecutionException e10) {
                            throw new zzfaw(e10);
                        }
                    }
                } catch (RemoteException e11) {
                    throw new zzfaw(e11);
                }
            } else {
                uj0.c("getInterscrollerAd should not be null after loadInterscrollerAd loaded ad.");
                throw new zzfaw(new Exception("getInterscrollerAd should not be null after loadInterscrollerAd loaded ad."));
            }
        } else {
            d10 = uy1Var.f10879b.d();
        }
        uy0 d11 = this.f11825b.d(new j11(sl2Var, fl2Var, uy1Var.f10878a), new az0(d10, null, uz1.a(uy1Var.f10879b), fl2Var.f4110u.get(0)));
        d11.j().S0(d10);
        d11.a().y0(new fw0(uy1Var.f10879b), this.f11826c);
        uy1Var.f10880c.S5(d11.f());
        return d11.h();
    }

    public final /* synthetic */ s43 c(View view, fl2 fl2Var, Object obj) throws Exception {
        return j43.a(i01.a(this.f11824a, view, fl2Var));
    }
}
