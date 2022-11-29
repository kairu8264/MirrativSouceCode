package ai;

import android.content.Context;

/* loaded from: classes3.dex */
public final class t92 implements rn3<r92> {

    /* renamed from: a  reason: collision with root package name */
    public final eo3<Context> f10202a;

    /* renamed from: b  reason: collision with root package name */
    public final eo3<t43> f10203b;

    public t92(eo3<Context> eo3Var, eo3<t43> eo3Var2) {
        this.f10202a = eo3Var;
        this.f10203b = eo3Var2;
    }

    @Override // ai.eo3
    public final /* bridge */ /* synthetic */ Object zzb() {
        t43 t43Var = hk0.f4878a;
        zn3.b(t43Var);
        return new r92(this.f10202a.zzb(), t43Var);
    }
}
