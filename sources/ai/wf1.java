package ai;

import java.util.UUID;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class wf1 implements rn3<qk> {

    /* renamed from: a  reason: collision with root package name */
    public final eo3<zj0> f11608a;

    /* renamed from: b  reason: collision with root package name */
    public final eo3<String> f11609b;

    public wf1(eo3<zj0> eo3Var, eo3<String> eo3Var2) {
        this.f11608a = eo3Var;
        this.f11609b = eo3Var2;
    }

    @Override // ai.eo3
    public final /* bridge */ /* synthetic */ Object zzb() {
        zj0 a10 = ((cs0) this.f11608a).a();
        wg.t.d();
        return new qk(UUID.randomUUID().toString(), a10, "native", new JSONObject(), false, true);
    }
}
