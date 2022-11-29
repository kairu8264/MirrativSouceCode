package ai;

import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
public final class qa2 implements xc2<ra2> {

    /* renamed from: a  reason: collision with root package name */
    public final t43 f8862a;

    /* renamed from: b  reason: collision with root package name */
    public final el2 f8863b;

    public qa2(t43 t43Var, el2 el2Var) {
        this.f8862a = t43Var;
        this.f8863b = el2Var;
    }

    public final /* synthetic */ ra2 a() throws Exception {
        return new ra2(this.f8863b);
    }

    @Override // ai.xc2
    public final s43<ra2> zza() {
        return this.f8862a.h(new Callable(this) { // from class: ai.pa2

            /* renamed from: a  reason: collision with root package name */
            public final qa2 f8363a;

            {
                this.f8363a = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f8363a.a();
            }
        });
    }
}
