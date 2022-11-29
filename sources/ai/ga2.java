package ai;

import android.content.Context;
import android.view.ViewGroup;
import java.util.Set;

/* loaded from: classes3.dex */
public final class ga2 implements rn3<ea2> {

    /* renamed from: a  reason: collision with root package name */
    public final eo3<t43> f4371a;

    /* renamed from: b  reason: collision with root package name */
    public final eo3<ViewGroup> f4372b;

    /* renamed from: c  reason: collision with root package name */
    public final eo3<Context> f4373c;

    /* renamed from: d  reason: collision with root package name */
    public final eo3<Set<String>> f4374d;

    public ga2(eo3<t43> eo3Var, eo3<ViewGroup> eo3Var2, eo3<Context> eo3Var3, eo3<Set<String>> eo3Var4) {
        this.f4371a = eo3Var;
        this.f4372b = eo3Var2;
        this.f4373c = eo3Var3;
        this.f4374d = eo3Var4;
    }

    @Override // ai.eo3
    public final /* bridge */ /* synthetic */ Object zzb() {
        t43 t43Var = hk0.f4878a;
        zn3.b(t43Var);
        return new ea2(t43Var, ((ry0) this.f4372b).a(), this.f4373c.zzb(), ((co3) this.f4374d).zzb());
    }
}
