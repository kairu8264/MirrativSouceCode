package ai;

import java.util.UUID;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class ex0 implements rn3<qk> {

    /* renamed from: a  reason: collision with root package name */
    public final eo3<fl2> f3803a;

    /* renamed from: b  reason: collision with root package name */
    public final eo3<zj0> f3804b;

    /* renamed from: c  reason: collision with root package name */
    public final eo3<JSONObject> f3805c;

    /* renamed from: d  reason: collision with root package name */
    public final eo3<String> f3806d;

    public ex0(eo3<fl2> eo3Var, eo3<zj0> eo3Var2, eo3<JSONObject> eo3Var3, eo3<String> eo3Var4) {
        this.f3803a = eo3Var;
        this.f3804b = eo3Var2;
        this.f3805c = eo3Var3;
        this.f3806d = eo3Var4;
    }

    @Override // ai.eo3
    public final /* bridge */ /* synthetic */ Object zzb() {
        ((k11) this.f3803a).a();
        zj0 a10 = ((cs0) this.f3804b).a();
        JSONObject zzb = this.f3805c.zzb();
        String zzb2 = this.f3806d.zzb();
        boolean equals = "native".equals(zzb2);
        wg.t.d();
        return new qk(UUID.randomUUID().toString(), a10, zzb2, zzb, false, equals);
    }
}
