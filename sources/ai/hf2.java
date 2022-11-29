package ai;

import java.util.HashSet;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class hf2 implements rn3<bd2<JSONObject>> {
    public static bd2<JSONObject> a(ti0 ti0Var, ui0 ui0Var, Object obj, td2 td2Var, se2 se2Var, kn3<nd2> kn3Var, kn3<wd2> kn3Var2, kn3<de2> kn3Var3, kn3<he2> kn3Var4, kn3<oe2> kn3Var5, kn3<ve2> kn3Var6, kn3<of2> kn3Var7, kn3<kf2> kn3Var8, Executor executor, ScheduledExecutorService scheduledExecutorService) {
        HashSet hashSet = new HashSet();
        hashSet.add((le2) obj);
        hashSet.add(td2Var);
        hashSet.add(se2Var);
        if (((Boolean) ft.c().c(ox.Z3)).booleanValue()) {
            hashSet.add(kn3Var.zzb());
        }
        if (((Boolean) ft.c().c(ox.f7942a4)).booleanValue()) {
            hashSet.add(kn3Var2.zzb());
        }
        if (((Boolean) ft.c().c(ox.f7951b4)).booleanValue()) {
            hashSet.add(kn3Var3.zzb());
        }
        if (((Boolean) ft.c().c(ox.f7960c4)).booleanValue()) {
            hashSet.add(kn3Var4.zzb());
        }
        if (((Boolean) ft.c().c(ox.f7993g4)).booleanValue()) {
            hashSet.add(kn3Var6.zzb());
        }
        if (((Boolean) ft.c().c(ox.f8001h4)).booleanValue()) {
            hashSet.add(kn3Var7.zzb());
        }
        return new bd2<>(executor, hashSet);
    }
}
