package ai;

import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class a31 implements rn3<gc1<v61>> {

    /* renamed from: a  reason: collision with root package name */
    public final eo3<i91> f1714a;

    /* renamed from: b  reason: collision with root package name */
    public final eo3<Executor> f1715b;

    public a31(eo3<i91> eo3Var, eo3<Executor> eo3Var2) {
        this.f1714a = eo3Var;
        this.f1715b = eo3Var2;
    }

    @Override // ai.eo3
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new gc1(this.f1714a.zzb(), this.f1715b.zzb());
    }
}
