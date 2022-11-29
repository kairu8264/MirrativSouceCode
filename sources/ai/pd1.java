package ai;

import java.util.Collections;
import java.util.Set;

/* loaded from: classes3.dex */
public final class pd1 implements rn3<Set<gc1<t91>>> {

    /* renamed from: a  reason: collision with root package name */
    public final md1 f8385a;

    /* renamed from: b  reason: collision with root package name */
    public final eo3<u31> f8386b;

    public pd1(md1 md1Var, eo3<u31> eo3Var) {
        this.f8385a = md1Var;
        this.f8386b = eo3Var;
    }

    @Override // ai.eo3
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set singleton = Collections.singleton(new gc1(this.f8386b.zzb(), hk0.f4883f));
        zn3.b(singleton);
        return singleton;
    }
}
