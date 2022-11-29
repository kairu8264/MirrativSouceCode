package ai;

import java.util.Set;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class cd2<T> implements rn3<bd2<T>> {

    /* renamed from: a  reason: collision with root package name */
    public final eo3<Executor> f2790a;

    /* renamed from: b  reason: collision with root package name */
    public final eo3<Set<xc2<? extends wc2<T>>>> f2791b;

    public cd2(eo3<Executor> eo3Var, eo3<Set<xc2<? extends wc2<T>>>> eo3Var2) {
        this.f2790a = eo3Var;
        this.f2791b = eo3Var2;
    }

    @Override // ai.eo3
    /* renamed from: a */
    public final bd2<T> zzb() {
        t43 t43Var = hk0.f4878a;
        zn3.b(t43Var);
        return new bd2<>(t43Var, ((co3) this.f2791b).zzb());
    }
}
