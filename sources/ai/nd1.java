package ai;

import java.util.Collections;
import java.util.Set;

/* loaded from: classes3.dex */
public final class nd1 implements rn3<Set<gc1<l51>>> {

    /* renamed from: a  reason: collision with root package name */
    public final md1 f7264a;

    /* renamed from: b  reason: collision with root package name */
    public final eo3<u31> f7265b;

    public nd1(md1 md1Var, eo3<u31> eo3Var) {
        this.f7264a = md1Var;
        this.f7265b = eo3Var;
    }

    @Override // ai.eo3
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set singleton = Collections.singleton(new gc1(this.f7265b.zzb(), hk0.f4883f));
        zn3.b(singleton);
        return singleton;
    }
}
