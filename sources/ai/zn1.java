package ai;

import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class zn1 implements rn3<gc1<ga1>> {

    /* renamed from: a  reason: collision with root package name */
    public final eo3<lo1> f13054a;

    /* renamed from: b  reason: collision with root package name */
    public final eo3<Executor> f13055b;

    public zn1(eo3<lo1> eo3Var, eo3<Executor> eo3Var2) {
        this.f13054a = eo3Var;
        this.f13055b = eo3Var2;
    }

    @Override // ai.eo3
    public final /* bridge */ /* synthetic */ Object zzb() {
        t43 t43Var = hk0.f4878a;
        zn3.b(t43Var);
        return new gc1(this.f13054a.zzb(), t43Var);
    }
}
