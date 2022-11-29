package pi;

import hi.be;

/* loaded from: classes3.dex */
public final class n5 implements Runnable {

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ u f48067w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ na f48068x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ u5 f48069y;

    public n5(u5 u5Var, u uVar, na naVar) {
        this.f48069y = u5Var;
        this.f48067w = uVar;
        this.f48068x = naVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ba baVar;
        u h12 = this.f48069y.h1(this.f48067w, this.f48068x);
        be.b();
        baVar = this.f48069y.f48261w;
        if (baVar.T().A(null, c3.f47731v0)) {
            this.f48069y.B4(h12, this.f48068x);
        } else {
            this.f48069y.z0(h12, this.f48068x);
        }
    }
}
