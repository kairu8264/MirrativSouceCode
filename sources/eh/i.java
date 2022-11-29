package eh;

import ai.eo3;
import ai.hk0;
import ai.rn3;
import ai.t43;
import ai.ut1;
import ai.vt1;
import ai.zn3;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class i implements rn3<h> {

    /* renamed from: a  reason: collision with root package name */
    public final eo3<Executor> f30594a;

    /* renamed from: b  reason: collision with root package name */
    public final eo3<ut1> f30595b;

    public i(eo3<Executor> eo3Var, eo3<ut1> eo3Var2) {
        this.f30594a = eo3Var;
        this.f30595b = eo3Var2;
    }

    @Override // ai.eo3
    /* renamed from: a */
    public final h zzb() {
        t43 t43Var = hk0.f4878a;
        zn3.b(t43Var);
        return new h(t43Var, ((vt1) this.f30595b).zzb());
    }
}
