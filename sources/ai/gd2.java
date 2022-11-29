package ai;

import android.content.Context;

/* loaded from: classes3.dex */
public final class gd2 implements rn3<fd2> {

    /* renamed from: a  reason: collision with root package name */
    public final eo3<t43> f4397a;

    /* renamed from: b  reason: collision with root package name */
    public final eo3<Context> f4398b;

    public gd2(eo3<t43> eo3Var, eo3<Context> eo3Var2) {
        this.f4397a = eo3Var;
        this.f4398b = eo3Var2;
    }

    @Override // ai.eo3
    /* renamed from: a */
    public final fd2 zzb() {
        t43 t43Var = hk0.f4878a;
        zn3.b(t43Var);
        return new fd2(t43Var, ((tr0) this.f4398b).a());
    }
}
