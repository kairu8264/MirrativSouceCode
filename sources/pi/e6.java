package pi;

import android.util.Log;

/* loaded from: classes3.dex */
public final class e6 implements k3 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ b5 f47782a;

    public e6(f6 f6Var, b5 b5Var) {
        this.f47782a = b5Var;
    }

    @Override // pi.k3
    public final boolean zza() {
        return this.f47782a.o() && Log.isLoggable(this.f47782a.r().B(), 3);
    }
}
