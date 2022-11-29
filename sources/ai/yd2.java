package ai;

import android.content.Context;

/* loaded from: classes3.dex */
public final class yd2 implements rn3<wd2> {

    /* renamed from: a  reason: collision with root package name */
    public final eo3<ke0> f12548a;

    /* renamed from: b  reason: collision with root package name */
    public final eo3<Context> f12549b;

    /* renamed from: c  reason: collision with root package name */
    public final eo3<String> f12550c;

    /* renamed from: d  reason: collision with root package name */
    public final eo3<t43> f12551d;

    public yd2(eo3<ke0> eo3Var, eo3<Context> eo3Var2, eo3<String> eo3Var3, eo3<t43> eo3Var4) {
        this.f12548a = eo3Var;
        this.f12549b = eo3Var2;
        this.f12550c = eo3Var3;
        this.f12551d = eo3Var4;
    }

    @Override // ai.eo3
    public final /* bridge */ /* synthetic */ Object zzb() {
        Context a10 = ((tr0) this.f12549b).a();
        String a11 = ((ze2) this.f12550c).a();
        t43 t43Var = hk0.f4878a;
        zn3.b(t43Var);
        return new wd2(null, a10, a11, t43Var);
    }
}
