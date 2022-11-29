package ai;

import android.os.Bundle;

/* loaded from: classes3.dex */
public final class xi0 {

    /* renamed from: a  reason: collision with root package name */
    public long f11958a = -1;

    /* renamed from: b  reason: collision with root package name */
    public long f11959b = -1;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ yi0 f11960c;

    public xi0(yi0 yi0Var) {
        this.f11960c = yi0Var;
    }

    public final long a() {
        return this.f11959b;
    }

    public final void b() {
        vh.f fVar;
        fVar = this.f11960c.f12608a;
        this.f11959b = fVar.elapsedRealtime();
    }

    public final void c() {
        vh.f fVar;
        fVar = this.f11960c.f12608a;
        this.f11958a = fVar.elapsedRealtime();
    }

    public final Bundle d() {
        Bundle bundle = new Bundle();
        bundle.putLong("topen", this.f11958a);
        bundle.putLong("tclose", this.f11959b);
        return bundle;
    }
}
