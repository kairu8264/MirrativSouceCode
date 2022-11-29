package ai;

import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class d31 implements rn3<gc1<h71>> {

    /* renamed from: a  reason: collision with root package name */
    public final eo3<i91> f3115a;

    /* renamed from: b  reason: collision with root package name */
    public final eo3<Executor> f3116b;

    public d31(eo3<i91> eo3Var, eo3<Executor> eo3Var2) {
        this.f3115a = eo3Var;
        this.f3116b = eo3Var2;
    }

    @Override // ai.eo3
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new gc1(this.f3115a.zzb(), this.f3116b.zzb());
    }
}
