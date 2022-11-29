package ai;

import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class wr0 implements rn3<Set<gc1<tb1>>> {

    /* renamed from: a  reason: collision with root package name */
    public final eo3<pw1> f11726a;

    /* renamed from: b  reason: collision with root package name */
    public final eo3<Executor> f11727b;

    public wr0(eo3<pw1> eo3Var, eo3<Executor> eo3Var2) {
        this.f11726a = eo3Var;
        this.f11727b = eo3Var2;
    }

    @Override // ai.eo3
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set emptySet;
        pw1 zzb = this.f11726a.zzb();
        t43 t43Var = hk0.f4878a;
        zn3.b(t43Var);
        if (((Boolean) ft.c().c(ox.f8078r1)).booleanValue()) {
            if (((Boolean) ft.c().c(ox.f8011i6)).booleanValue()) {
                emptySet = Collections.singleton(new gc1(zzb, t43Var));
                zn3.b(emptySet);
                return emptySet;
            }
        }
        emptySet = Collections.emptySet();
        zn3.b(emptySet);
        return emptySet;
    }
}
