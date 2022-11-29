package ai;

import java.util.Map;

/* loaded from: classes3.dex */
public final class kv0 implements rn3<jv0> {

    /* renamed from: a  reason: collision with root package name */
    public final eo3<Map<String, mv0>> f6366a;

    /* renamed from: b  reason: collision with root package name */
    public final eo3<Map<String, lv0>> f6367b;

    public kv0(eo3<Map<String, mv0>> eo3Var, eo3<Map<String, lv0>> eo3Var2) {
        this.f6366a = eo3Var;
        this.f6367b = eo3Var2;
    }

    @Override // ai.eo3
    /* renamed from: a */
    public final jv0 zzb() {
        return new jv0(((vn3) this.f6366a).zzb(), ((vn3) this.f6367b).zzb());
    }
}
