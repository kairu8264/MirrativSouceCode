package ai;

import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
public final class ia2 implements xc2<ja2> {

    /* renamed from: a  reason: collision with root package name */
    public final t43 f5148a;

    /* renamed from: b  reason: collision with root package name */
    public final ms1 f5149b;

    public ia2(t43 t43Var, ms1 ms1Var) {
        this.f5148a = t43Var;
        this.f5149b = ms1Var;
    }

    public final /* synthetic */ ja2 a() throws Exception {
        return new ja2(this.f5149b.g(), this.f5149b.d(), wg.t.n().k());
    }

    @Override // ai.xc2
    public final s43<ja2> zza() {
        return this.f5148a.h(new Callable(this) { // from class: ai.ha2

            /* renamed from: a  reason: collision with root package name */
            public final ia2 f4791a;

            {
                this.f4791a = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f4791a.a();
            }
        });
    }
}
