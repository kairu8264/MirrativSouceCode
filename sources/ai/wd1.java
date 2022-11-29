package ai;

import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class wd1 implements rn3<gc1<v41>> {

    /* renamed from: a  reason: collision with root package name */
    public final md1 f11571a;

    /* renamed from: b  reason: collision with root package name */
    public final eo3<se1> f11572b;

    /* renamed from: c  reason: collision with root package name */
    public final eo3<Executor> f11573c;

    public wd1(md1 md1Var, eo3<se1> eo3Var, eo3<Executor> eo3Var2) {
        this.f11571a = md1Var;
        this.f11572b = eo3Var;
        this.f11573c = eo3Var2;
    }

    @Override // ai.eo3
    public final /* bridge */ /* synthetic */ Object zzb() {
        t43 t43Var = hk0.f4878a;
        zn3.b(t43Var);
        return new gc1(this.f11572b.zzb(), t43Var);
    }
}
