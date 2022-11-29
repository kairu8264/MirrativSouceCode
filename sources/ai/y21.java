package ai;

import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class y21 implements rn3<gc1<l51>> {

    /* renamed from: a  reason: collision with root package name */
    public final eo3<i91> f12424a;

    /* renamed from: b  reason: collision with root package name */
    public final eo3<Executor> f12425b;

    public y21(eo3<i91> eo3Var, eo3<Executor> eo3Var2) {
        this.f12424a = eo3Var;
        this.f12425b = eo3Var2;
    }

    @Override // ai.eo3
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new gc1(this.f12424a.zzb(), this.f12425b.zzb());
    }
}
