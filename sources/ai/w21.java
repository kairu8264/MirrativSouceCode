package ai;

import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class w21 implements rn3<gc1<v41>> {

    /* renamed from: a  reason: collision with root package name */
    public final eo3<i91> f11466a;

    /* renamed from: b  reason: collision with root package name */
    public final eo3<Executor> f11467b;

    public w21(eo3<i91> eo3Var, eo3<Executor> eo3Var2) {
        this.f11466a = eo3Var;
        this.f11467b = eo3Var2;
    }

    @Override // ai.eo3
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new gc1(this.f11466a.zzb(), this.f11467b.zzb());
    }
}
