package ai;

import java.util.Map;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class uw0 implements r30<Object> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ vw0 f10858a;

    public uw0(vw0 vw0Var) {
        this.f10858a = vw0Var;
    }

    @Override // ai.r30
    public final void a(Object obj, Map<String, String> map) {
        Executor executor;
        if (vw0.g(this.f10858a, map)) {
            executor = this.f10858a.f11394c;
            executor.execute(new Runnable(this) { // from class: ai.tw0

                /* renamed from: w  reason: collision with root package name */
                public final uw0 f10483w;

                {
                    this.f10483w = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    ax0 ax0Var;
                    ax0Var = this.f10483w.f10858a.f11395d;
                    ax0Var.b();
                }
            });
        }
    }
}
