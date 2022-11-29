package ai;

import android.content.Context;

/* loaded from: classes3.dex */
public final class oc2 implements rn3<mc2> {

    /* renamed from: a  reason: collision with root package name */
    public final eo3<t43> f7716a;

    /* renamed from: b  reason: collision with root package name */
    public final eo3<Context> f7717b;

    /* renamed from: c  reason: collision with root package name */
    public final eo3<zj0> f7718c;

    public oc2(eo3<t43> eo3Var, eo3<Context> eo3Var2, eo3<zj0> eo3Var3) {
        this.f7716a = eo3Var;
        this.f7717b = eo3Var2;
        this.f7718c = eo3Var3;
    }

    @Override // ai.eo3
    public final /* bridge */ /* synthetic */ Object zzb() {
        t43 t43Var = hk0.f4878a;
        zn3.b(t43Var);
        return new mc2(t43Var, ((cn2) this.f7717b).a(), ((cs0) this.f7718c).a());
    }
}
