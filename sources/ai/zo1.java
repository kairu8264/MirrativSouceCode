package ai;

import java.util.Map;

/* loaded from: classes3.dex */
public final class zo1 implements rn3<yo1> {

    /* renamed from: a  reason: collision with root package name */
    public final eo3<qn> f13060a;

    /* renamed from: b  reason: collision with root package name */
    public final eo3<Map<wp2, xo1>> f13061b;

    public zo1(eo3<qn> eo3Var, eo3<Map<wp2, xo1>> eo3Var2) {
        this.f13060a = eo3Var;
        this.f13061b = eo3Var2;
    }

    @Override // ai.eo3
    /* renamed from: a */
    public final yo1 zzb() {
        return new yo1(this.f13060a.zzb(), ((vn3) this.f13061b).zzb());
    }
}
