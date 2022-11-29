package ai;

import android.content.Context;
import java.util.Set;

/* loaded from: classes3.dex */
public final class eb2 implements rn3<cb2> {

    /* renamed from: a  reason: collision with root package name */
    public final eo3<t43> f3602a;

    /* renamed from: b  reason: collision with root package name */
    public final eo3<Context> f3603b;

    /* renamed from: c  reason: collision with root package name */
    public final eo3<Set<String>> f3604c;

    public eb2(eo3<t43> eo3Var, eo3<Context> eo3Var2, eo3<Set<String>> eo3Var3) {
        this.f3602a = eo3Var;
        this.f3603b = eo3Var2;
        this.f3604c = eo3Var3;
    }

    @Override // ai.eo3
    public final /* bridge */ /* synthetic */ Object zzb() {
        t43 t43Var = hk0.f4878a;
        zn3.b(t43Var);
        return new cb2(t43Var, ((cn2) this.f3603b).a(), this.f3604c.zzb());
    }
}
