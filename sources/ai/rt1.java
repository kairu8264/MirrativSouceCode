package ai;

import java.util.UUID;

/* loaded from: classes3.dex */
public final class rt1 implements rn3<String> {
    public static rt1 a() {
        rt1 rt1Var;
        rt1Var = qt1.f9194a;
        return rt1Var;
    }

    @Override // ai.eo3
    public final /* bridge */ /* synthetic */ Object zzb() {
        wg.t.d();
        String uuid = UUID.randomUUID().toString();
        zn3.b(uuid);
        return uuid;
    }
}
