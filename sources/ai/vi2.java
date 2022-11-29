package ai;

import android.content.Context;

/* loaded from: classes3.dex */
public final class vi2 {
    public static ti2<vx0, by0> a(Context context, fn2 fn2Var, yn2 yn2Var) {
        return c(context, fn2Var, yn2Var);
    }

    public static ti2<gy0, my0> b(Context context, fn2 fn2Var, yn2 yn2Var) {
        return c(context, fn2Var, yn2Var);
    }

    public static <AppOpenAdRequestComponent extends d41<AppOpenAd>, AppOpenAd extends u01> ti2<AppOpenAdRequestComponent, AppOpenAd> c(Context context, fn2 fn2Var, yn2 yn2Var) {
        zi0 o10;
        if (((Boolean) ft.c().c(ox.F4)).booleanValue()) {
            o10 = wg.t.h().p().n();
        } else {
            o10 = wg.t.h().p().o();
        }
        boolean z10 = false;
        if (o10 != null && o10.i()) {
            z10 = true;
        }
        if (((Integer) ft.c().c(ox.V4)).intValue() > 0) {
            if (!((Boolean) ft.c().c(ox.E4)).booleanValue() || z10) {
                xn2 a10 = yn2Var.a(on2.AppOpen, context, fn2Var, new wh2(new th2()));
                ji2 ji2Var = new ji2(new ii2());
                kn2 kn2Var = a10.f12039a;
                t43 t43Var = hk0.f4878a;
                return new yh2(ji2Var, new fi2(kn2Var, t43Var), a10.f12040b, a10.f12039a.c().D, t43Var);
            }
        }
        return new ii2();
    }
}
