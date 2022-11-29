package ai;

import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class go1 implements rn3<Set<gc1<dq2>>> {

    /* renamed from: a  reason: collision with root package name */
    public final eo3<Executor> f4526a;

    /* renamed from: b  reason: collision with root package name */
    public final eo3<yo1> f4527b;

    public go1(eo3<Executor> eo3Var, eo3<yo1> eo3Var2) {
        this.f4526a = eo3Var;
        this.f4527b = eo3Var2;
    }

    @Override // ai.eo3
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set emptySet;
        t43 t43Var = hk0.f4878a;
        zn3.b(t43Var);
        yo1 zzb = ((zo1) this.f4527b).zzb();
        if (((Boolean) ft.c().c(ox.f8056o3)).booleanValue()) {
            emptySet = Collections.singleton(new gc1(zzb, t43Var));
        } else {
            emptySet = Collections.emptySet();
        }
        zn3.b(emptySet);
        return emptySet;
    }
}
