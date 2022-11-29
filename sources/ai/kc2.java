package ai;

import android.content.Context;

/* loaded from: classes3.dex */
public final class kc2 implements rn3<ic2> {

    /* renamed from: a  reason: collision with root package name */
    public final eo3<ai0> f6165a;

    /* renamed from: b  reason: collision with root package name */
    public final eo3<t43> f6166b;

    /* renamed from: c  reason: collision with root package name */
    public final eo3<Context> f6167c;

    public kc2(eo3<ai0> eo3Var, eo3<t43> eo3Var2, eo3<Context> eo3Var3) {
        this.f6165a = eo3Var;
        this.f6166b = eo3Var2;
        this.f6167c = eo3Var3;
    }

    @Override // ai.eo3
    public final /* bridge */ /* synthetic */ Object zzb() {
        t43 t43Var = hk0.f4878a;
        zn3.b(t43Var);
        return new ic2(this.f6165a.zzb(), t43Var, ((cn2) this.f6167c).a());
    }
}
