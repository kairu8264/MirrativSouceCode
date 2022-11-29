package ai;

import android.content.Context;
import java.util.Set;

/* loaded from: classes3.dex */
public final class jc1 implements rn3<ic1> {

    /* renamed from: a  reason: collision with root package name */
    public final eo3<Context> f5695a;

    /* renamed from: b  reason: collision with root package name */
    public final eo3<Set<gc1<vk>>> f5696b;

    /* renamed from: c  reason: collision with root package name */
    public final eo3<fl2> f5697c;

    public jc1(eo3<Context> eo3Var, eo3<Set<gc1<vk>>> eo3Var2, eo3<fl2> eo3Var3) {
        this.f5695a = eo3Var;
        this.f5696b = eo3Var2;
        this.f5697c = eo3Var3;
    }

    @Override // ai.eo3
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new ic1(this.f5695a.zzb(), ((co3) this.f5696b).zzb(), ((k11) this.f5697c).a());
    }
}
