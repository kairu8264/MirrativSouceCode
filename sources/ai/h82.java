package ai;

import android.os.Bundle;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class h82 implements xc2<wc2<Bundle>> {

    /* renamed from: a  reason: collision with root package name */
    public final Executor f4779a;

    /* renamed from: b  reason: collision with root package name */
    public final fj0 f4780b;

    public h82(Executor executor, fj0 fj0Var) {
        this.f4779a = executor;
        this.f4780b = fj0Var;
    }

    @Override // ai.xc2
    public final s43<wc2<Bundle>> zza() {
        if (((Boolean) ft.c().c(ox.N1)).booleanValue()) {
            return j43.a(null);
        }
        return j43.j(this.f4780b.r(), f82.f3966a, this.f4779a);
    }
}
