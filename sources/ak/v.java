package ak;

import android.os.Bundle;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
public final class v extends r<Void> {

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ c0 f13684y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(c0 c0Var, jk.o<Void> oVar) {
        super(c0Var, oVar);
        this.f13684y = c0Var;
    }

    @Override // ak.r, dk.n0
    public final void S2(Bundle bundle, Bundle bundle2) {
        AtomicBoolean atomicBoolean;
        dk.f fVar;
        super.S2(bundle, bundle2);
        atomicBoolean = this.f13684y.f13325f;
        if (!atomicBoolean.compareAndSet(true, false)) {
            fVar = c0.f13318g;
            fVar.e("Expected keepingAlive to be true, but was false.", new Object[0]);
        }
        if (bundle.getBoolean("keep_alive")) {
            this.f13684y.a();
        }
    }
}
