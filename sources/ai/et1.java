package ai;

import android.content.Context;
import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
public final class et1 implements rn3<s43<String>> {

    /* renamed from: a  reason: collision with root package name */
    public final eo3<u> f3779a;

    /* renamed from: b  reason: collision with root package name */
    public final eo3<Context> f3780b;

    /* renamed from: c  reason: collision with root package name */
    public final eo3<t43> f3781c;

    public et1(eo3<u> eo3Var, eo3<Context> eo3Var2, eo3<t43> eo3Var3) {
        this.f3779a = eo3Var;
        this.f3780b = eo3Var2;
        this.f3781c = eo3Var3;
    }

    @Override // ai.eo3
    public final /* bridge */ /* synthetic */ Object zzb() {
        final u zzb = this.f3779a.zzb();
        final Context a10 = ((cn2) this.f3780b).a();
        t43 t43Var = hk0.f4878a;
        zn3.b(t43Var);
        s43 h10 = t43Var.h(new Callable(zzb, a10) { // from class: ai.dt1

            /* renamed from: a  reason: collision with root package name */
            public final u f3404a;

            /* renamed from: b  reason: collision with root package name */
            public final Context f3405b;

            {
                this.f3404a = zzb;
                this.f3405b = a10;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                u uVar = this.f3404a;
                return uVar.b().d(this.f3405b);
            }
        });
        zn3.b(h10);
        return h10;
    }
}
