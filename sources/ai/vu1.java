package ai;

import android.content.Context;

/* loaded from: classes3.dex */
public final class vu1 implements rn3<uu1> {

    /* renamed from: a  reason: collision with root package name */
    public final eo3<Context> f11362a;

    /* renamed from: b  reason: collision with root package name */
    public final eo3<ai0> f11363b;

    public vu1(eo3<Context> eo3Var, eo3<ai0> eo3Var2) {
        this.f11362a = eo3Var;
        this.f11363b = eo3Var2;
    }

    @Override // ai.eo3
    /* renamed from: a */
    public final uu1 zzb() {
        return new uu1(((cn2) this.f11362a).a(), this.f11363b.zzb());
    }
}
