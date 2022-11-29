package ai;

import android.content.Context;

/* loaded from: classes3.dex */
public final class y82 implements rn3<w82> {

    /* renamed from: a  reason: collision with root package name */
    public final eo3<t43> f12481a;

    /* renamed from: b  reason: collision with root package name */
    public final eo3<Context> f12482b;

    public y82(eo3<t43> eo3Var, eo3<Context> eo3Var2) {
        this.f12481a = eo3Var;
        this.f12482b = eo3Var2;
    }

    @Override // ai.eo3
    /* renamed from: a */
    public final w82 zzb() {
        t43 t43Var = hk0.f4878a;
        zn3.b(t43Var);
        return new w82(t43Var, ((tr0) this.f12482b).a());
    }
}
