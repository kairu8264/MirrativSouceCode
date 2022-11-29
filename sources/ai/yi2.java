package ai;

import android.content.Context;

/* loaded from: classes3.dex */
public final class yi2 implements rn3<ti2<hm1, cm1>> {

    /* renamed from: a  reason: collision with root package name */
    public final eo3<Context> f12622a;

    /* renamed from: b  reason: collision with root package name */
    public final eo3<fn2> f12623b;

    /* renamed from: c  reason: collision with root package name */
    public final eo3<yn2> f12624c;

    public yi2(eo3<Context> eo3Var, eo3<fn2> eo3Var2, eo3<yn2> eo3Var3) {
        this.f12622a = eo3Var;
        this.f12623b = eo3Var2;
        this.f12624c = eo3Var3;
    }

    @Override // ai.eo3
    /* renamed from: a */
    public final ti2<hm1, cm1> zzb() {
        zi0 o10;
        Context zzb = this.f12622a.zzb();
        fn2 zzb2 = this.f12623b.zzb();
        yn2 zzb3 = this.f12624c.zzb();
        if (((Boolean) ft.c().c(ox.F4)).booleanValue()) {
            o10 = wg.t.h().p().n();
        } else {
            o10 = wg.t.h().p().o();
        }
        boolean z10 = false;
        if (o10 != null && o10.i()) {
            z10 = true;
        }
        if (((Integer) ft.c().c(ox.H4)).intValue() > 0) {
            if (!((Boolean) ft.c().c(ox.E4)).booleanValue() || z10) {
                xn2 a10 = zzb3.a(on2.Rewarded, zzb, zzb2, new wh2(new th2()));
                ji2 ji2Var = new ji2(new ii2());
                kn2 kn2Var = a10.f12039a;
                t43 t43Var = hk0.f4878a;
                return new yh2(ji2Var, new fi2(kn2Var, t43Var), a10.f12040b, a10.f12039a.c().D, t43Var);
            }
        }
        return new ii2();
    }
}
