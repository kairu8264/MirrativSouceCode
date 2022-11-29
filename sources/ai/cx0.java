package ai;

import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class cx0 implements rn3<vw0> {

    /* renamed from: a  reason: collision with root package name */
    public final eo3<qk> f3065a;

    /* renamed from: b  reason: collision with root package name */
    public final eo3<h80> f3066b;

    /* renamed from: c  reason: collision with root package name */
    public final eo3<Executor> f3067c;

    public cx0(eo3<qk> eo3Var, eo3<h80> eo3Var2, eo3<Executor> eo3Var3) {
        this.f3065a = eo3Var;
        this.f3066b = eo3Var2;
        this.f3067c = eo3Var3;
    }

    @Override // ai.eo3
    public final /* bridge */ /* synthetic */ Object zzb() {
        t43 a10 = po2.a();
        zn3.b(a10);
        return new vw0(this.f3065a.zzb().d(), this.f3066b.zzb(), a10);
    }
}
