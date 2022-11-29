package ai;

import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class k72 implements rn3<j72> {

    /* renamed from: a  reason: collision with root package name */
    public final eo3<s43<String>> f6115a;

    /* renamed from: b  reason: collision with root package name */
    public final eo3<Executor> f6116b;

    public k72(eo3<s43<String>> eo3Var, eo3<Executor> eo3Var2) {
        this.f6115a = eo3Var;
        this.f6116b = eo3Var2;
    }

    @Override // ai.eo3
    public final /* bridge */ /* synthetic */ Object zzb() {
        t43 t43Var = hk0.f4878a;
        zn3.b(t43Var);
        return new j72(this.f6115a.zzb(), t43Var);
    }
}
