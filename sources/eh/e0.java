package eh;

import ai.e43;
import ai.uj0;

/* loaded from: classes3.dex */
public final class e0 implements e43<j> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ f0 f30572a;

    public e0(f0 f0Var) {
        this.f30572a = f0Var;
    }

    @Override // ai.e43
    public final void a(Throwable th2) {
        wg.t.h().k(th2, "SignalGeneratorImpl.initializeWebViewForSignalCollection");
        f0.u6(this.f30572a, "sgf", "sgf_reason", th2.getMessage());
        uj0.d("Failed to initialize webview for loading SDKCore. ", th2);
    }

    @Override // ai.e43
    public final /* bridge */ /* synthetic */ void b(j jVar) {
        uj0.a("Initialized webview successfully for SDKCore.");
    }
}
