package ai;

import java.util.Collections;
import java.util.Set;

/* loaded from: classes3.dex */
public final class sx0 implements rn3<Set<gc1<vk>>> {

    /* renamed from: a  reason: collision with root package name */
    public final px0 f10014a;

    /* renamed from: b  reason: collision with root package name */
    public final eo3<l01> f10015b;

    public sx0(px0 px0Var, eo3<l01> eo3Var) {
        this.f10014a = px0Var;
        this.f10015b = eo3Var;
    }

    @Override // ai.eo3
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set singleton = Collections.singleton(new gc1(this.f10015b.zzb(), hk0.f4883f));
        zn3.b(singleton);
        return singleton;
    }
}
