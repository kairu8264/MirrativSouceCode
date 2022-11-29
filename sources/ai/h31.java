package ai;

import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class h31 implements rn3<gc1<nc1>> {

    /* renamed from: a  reason: collision with root package name */
    public final eo3<i91> f4722a;

    /* renamed from: b  reason: collision with root package name */
    public final eo3<Executor> f4723b;

    public h31(eo3<i91> eo3Var, eo3<Executor> eo3Var2) {
        this.f4722a = eo3Var;
        this.f4723b = eo3Var2;
    }

    @Override // ai.eo3
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new gc1(this.f4722a.zzb(), this.f4723b.zzb());
    }
}
