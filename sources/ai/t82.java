package ai;

import android.content.Context;

/* loaded from: classes3.dex */
public final class t82 implements rn3<r82> {

    /* renamed from: a  reason: collision with root package name */
    public final eo3<t43> f10198a;

    /* renamed from: b  reason: collision with root package name */
    public final eo3<Context> f10199b;

    public t82(eo3<t43> eo3Var, eo3<Context> eo3Var2) {
        this.f10198a = eo3Var;
        this.f10199b = eo3Var2;
    }

    @Override // ai.eo3
    public final /* bridge */ /* synthetic */ Object zzb() {
        t43 t43Var = hk0.f4878a;
        zn3.b(t43Var);
        return new r82(t43Var, ((cn2) this.f10199b).a());
    }
}
