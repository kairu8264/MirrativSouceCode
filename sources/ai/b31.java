package ai;

import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class b31 implements rn3<gc1<xg.q>> {

    /* renamed from: a  reason: collision with root package name */
    public final eo3<i91> f2215a;

    /* renamed from: b  reason: collision with root package name */
    public final eo3<Executor> f2216b;

    public b31(eo3<i91> eo3Var, eo3<Executor> eo3Var2) {
        this.f2215a = eo3Var;
        this.f2216b = eo3Var2;
    }

    @Override // ai.eo3
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new gc1(this.f2215a.zzb(), this.f2216b.zzb());
    }
}
