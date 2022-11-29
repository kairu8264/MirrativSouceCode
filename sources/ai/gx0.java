package ai;

import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class gx0 implements rn3<Set<gc1<q51>>> {

    /* renamed from: a  reason: collision with root package name */
    public final eo3<ax0> f4621a;

    /* renamed from: b  reason: collision with root package name */
    public final eo3<Executor> f4622b;

    /* renamed from: c  reason: collision with root package name */
    public final eo3<JSONObject> f4623c;

    public gx0(eo3<ax0> eo3Var, eo3<Executor> eo3Var2, eo3<JSONObject> eo3Var3) {
        this.f4621a = eo3Var;
        this.f4622b = eo3Var2;
        this.f4623c = eo3Var3;
    }

    @Override // ai.eo3
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set singleton;
        ax0 zzb = this.f4621a.zzb();
        t43 t43Var = hk0.f4878a;
        zn3.b(t43Var);
        if (this.f4623c.zzb() == null) {
            singleton = Collections.emptySet();
        } else {
            singleton = Collections.singleton(new gc1(zzb, t43Var));
        }
        zn3.b(singleton);
        return singleton;
    }
}
