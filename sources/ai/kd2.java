package ai;

import android.content.Context;

/* loaded from: classes3.dex */
public final class kd2 implements rn3<jd2> {

    /* renamed from: a  reason: collision with root package name */
    public final eo3<t43> f6176a;

    /* renamed from: b  reason: collision with root package name */
    public final eo3<Context> f6177b;

    public kd2(eo3<t43> eo3Var, eo3<Context> eo3Var2) {
        this.f6176a = eo3Var;
        this.f6177b = eo3Var2;
    }

    @Override // ai.eo3
    public final /* bridge */ /* synthetic */ Object zzb() {
        t43 t43Var = hk0.f4878a;
        zn3.b(t43Var);
        return new jd2(t43Var, ((cn2) this.f6177b).a());
    }
}
