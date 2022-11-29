package ai;

import java.util.Collections;
import java.util.Set;

/* loaded from: classes3.dex */
public final class xd1 implements rn3<Set<gc1<qe1>>> {

    /* renamed from: a  reason: collision with root package name */
    public final eo3<qe1> f11909a;

    public xd1(eo3<qe1> eo3Var) {
        this.f11909a = eo3Var;
    }

    @Override // ai.eo3
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set singleton = Collections.singleton(new gc1(this.f11909a.zzb(), hk0.f4883f));
        zn3.b(singleton);
        return singleton;
    }
}
