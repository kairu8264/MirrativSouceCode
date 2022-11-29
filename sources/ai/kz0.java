package ai;

import java.util.Collections;
import java.util.Set;

/* loaded from: classes3.dex */
public final class kz0 implements rn3<Set<gc1<vk>>> {

    /* renamed from: a  reason: collision with root package name */
    public final az0 f6415a;

    /* renamed from: b  reason: collision with root package name */
    public final eo3<l01> f6416b;

    public kz0(az0 az0Var, eo3<l01> eo3Var) {
        this.f6415a = az0Var;
        this.f6416b = eo3Var;
    }

    @Override // ai.eo3
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set singleton = Collections.singleton(new gc1(this.f6416b.zzb(), hk0.f4883f));
        zn3.b(singleton);
        return singleton;
    }
}
