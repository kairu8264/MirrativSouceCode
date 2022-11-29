package ai;

import android.content.Context;

/* loaded from: classes3.dex */
public final class vc2 implements rn3<uc2> {

    /* renamed from: a  reason: collision with root package name */
    public final eo3<t43> f11021a;

    /* renamed from: b  reason: collision with root package name */
    public final eo3<Context> f11022b;

    public vc2(eo3<t43> eo3Var, eo3<Context> eo3Var2) {
        this.f11021a = eo3Var;
        this.f11022b = eo3Var2;
    }

    @Override // ai.eo3
    public final /* bridge */ /* synthetic */ Object zzb() {
        t43 t43Var = hk0.f4878a;
        zn3.b(t43Var);
        return new uc2(t43Var, ((cn2) this.f11022b).a());
    }
}
