package ai;

import android.content.Context;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class p12 implements rn3<o12> {

    /* renamed from: a  reason: collision with root package name */
    public final eo3<Context> f8221a;

    /* renamed from: b  reason: collision with root package name */
    public final eo3<cf1> f8222b;

    /* renamed from: c  reason: collision with root package name */
    public final eo3<Executor> f8223c;

    public p12(eo3<Context> eo3Var, eo3<cf1> eo3Var2, eo3<Executor> eo3Var3) {
        this.f8221a = eo3Var;
        this.f8222b = eo3Var2;
        this.f8223c = eo3Var3;
    }

    @Override // ai.eo3
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new o12(this.f8221a.zzb(), this.f8222b.zzb(), this.f8223c.zzb());
    }
}
