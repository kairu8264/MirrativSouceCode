package ai;

import android.content.Context;

/* loaded from: classes3.dex */
public final class p92 implements rn3<o92> {

    /* renamed from: a  reason: collision with root package name */
    public final eo3<Context> f8358a;

    /* renamed from: b  reason: collision with root package name */
    public final eo3<t43> f8359b;

    public p92(eo3<Context> eo3Var, eo3<t43> eo3Var2) {
        this.f8358a = eo3Var;
        this.f8359b = eo3Var2;
    }

    @Override // ai.eo3
    public final /* bridge */ /* synthetic */ Object zzb() {
        Context a10 = ((cn2) this.f8358a).a();
        t43 t43Var = hk0.f4878a;
        zn3.b(t43Var);
        return new o92(a10, t43Var);
    }
}
