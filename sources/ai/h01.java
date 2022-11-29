package ai;

import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class h01 implements rn3<c01> {

    /* renamed from: a  reason: collision with root package name */
    public final eo3<t01> f4667a;

    /* renamed from: b  reason: collision with root package name */
    public final eo3<a20> f4668b;

    /* renamed from: c  reason: collision with root package name */
    public final eo3<Runnable> f4669c;

    /* renamed from: d  reason: collision with root package name */
    public final eo3<Executor> f4670d;

    public h01(eo3<t01> eo3Var, eo3<a20> eo3Var2, eo3<Runnable> eo3Var3, eo3<Executor> eo3Var4) {
        this.f4667a = eo3Var;
        this.f4668b = eo3Var2;
        this.f4669c = eo3Var3;
        this.f4670d = eo3Var4;
    }

    @Override // ai.eo3
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new c01(((r21) this.f4667a).zzb(), ((g01) this.f4668b).a(), ((f01) this.f4669c).a(), this.f4670d.zzb());
    }
}
