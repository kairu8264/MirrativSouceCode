package ai;

import android.content.Context;

/* loaded from: classes3.dex */
public final class lz0 implements rn3<hh0> {

    /* renamed from: a  reason: collision with root package name */
    public final az0 f6731a;

    /* renamed from: b  reason: collision with root package name */
    public final eo3<Context> f6732b;

    /* renamed from: c  reason: collision with root package name */
    public final eo3<yl2> f6733c;

    public lz0(az0 az0Var, eo3<Context> eo3Var, eo3<yl2> eo3Var2) {
        this.f6731a = az0Var;
        this.f6732b = eo3Var;
        this.f6733c = eo3Var2;
    }

    @Override // ai.eo3
    /* renamed from: a */
    public final hh0 zzb() {
        return new hh0(((cn2) this.f6732b).a(), ((l41) this.f6733c).a().f12652f);
    }
}
