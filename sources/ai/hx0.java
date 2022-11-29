package ai;

import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class hx0 implements rn3<Set<gc1<vk>>> {

    /* renamed from: a  reason: collision with root package name */
    public final eo3<ax0> f5021a;

    /* renamed from: b  reason: collision with root package name */
    public final eo3<Executor> f5022b;

    /* renamed from: c  reason: collision with root package name */
    public final eo3<JSONObject> f5023c;

    public hx0(eo3<ax0> eo3Var, eo3<Executor> eo3Var2, eo3<JSONObject> eo3Var3) {
        this.f5021a = eo3Var;
        this.f5022b = eo3Var2;
        this.f5023c = eo3Var3;
    }

    @Override // ai.eo3
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set singleton;
        ax0 zzb = this.f5021a.zzb();
        t43 t43Var = hk0.f4878a;
        zn3.b(t43Var);
        if (this.f5023c.zzb() == null) {
            singleton = Collections.emptySet();
        } else {
            singleton = Collections.singleton(new gc1(zzb, t43Var));
        }
        zn3.b(singleton);
        return singleton;
    }
}
