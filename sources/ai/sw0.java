package ai;

import java.util.Map;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class sw0 implements r30<Object> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ vw0 f10009a;

    public sw0(vw0 vw0Var) {
        this.f10009a = vw0Var;
    }

    @Override // ai.r30
    public final void a(Object obj, Map<String, String> map) {
        Executor executor;
        if (vw0.g(this.f10009a, map)) {
            executor = this.f10009a.f11394c;
            executor.execute(new Runnable(this) { // from class: ai.rw0

                /* renamed from: w  reason: collision with root package name */
                public final sw0 f9609w;

                {
                    this.f9609w = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    ax0 ax0Var;
                    ax0Var = this.f9609w.f10009a.f11395d;
                    ax0Var.a();
                }
            });
        }
    }
}
