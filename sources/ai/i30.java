package ai;

import java.util.Map;

/* loaded from: classes3.dex */
public final class i30 implements r30<rp0> {
    @Override // ai.r30
    public final /* bridge */ /* synthetic */ void a(rp0 rp0Var, Map map) {
        rp0 rp0Var2 = rp0Var;
        if (rp0Var2.r() != null) {
            rp0Var2.r().zza();
        }
        xg.n d02 = rp0Var2.d0();
        if (d02 != null) {
            d02.zzb();
            return;
        }
        xg.n C = rp0Var2.C();
        if (C != null) {
            C.zzb();
        } else {
            uj0.f("A GMSG tried to close something that wasn't an overlay.");
        }
    }
}
