package ai;

import android.content.Context;

/* loaded from: classes3.dex */
public final class fy1 implements rn3<ey1> {

    /* renamed from: a  reason: collision with root package name */
    public final eo3<Context> f4249a;

    /* renamed from: b  reason: collision with root package name */
    public final eo3<t43> f4250b;

    public fy1(eo3<Context> eo3Var, eo3<t43> eo3Var2) {
        this.f4249a = eo3Var;
        this.f4250b = eo3Var2;
    }

    @Override // ai.eo3
    public final /* bridge */ /* synthetic */ Object zzb() {
        Context a10 = ((tr0) this.f4249a).a();
        t43 t43Var = hk0.f4878a;
        zn3.b(t43Var);
        return new ey1(a10, t43Var);
    }
}
