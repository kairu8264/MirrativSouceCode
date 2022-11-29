package ai;

import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class z21 implements rn3<gc1<p51>> {

    /* renamed from: a  reason: collision with root package name */
    public final eo3<i91> f12836a;

    /* renamed from: b  reason: collision with root package name */
    public final eo3<Executor> f12837b;

    public z21(eo3<i91> eo3Var, eo3<Executor> eo3Var2) {
        this.f12836a = eo3Var;
        this.f12837b = eo3Var2;
    }

    @Override // ai.eo3
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new gc1(this.f12836a.zzb(), this.f12837b.zzb());
    }
}
