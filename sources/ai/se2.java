package ai;

import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
public final class se2 implements xc2<te2> {

    /* renamed from: a  reason: collision with root package name */
    public final t43 f9813a;

    /* renamed from: b  reason: collision with root package name */
    public final List<String> f9814b;

    /* renamed from: c  reason: collision with root package name */
    public final yw f9815c;

    /* JADX WARN: Multi-variable type inference failed */
    public se2(yw ywVar, yw ywVar2, t43 t43Var, List<String> list) {
        this.f9815c = ywVar;
        this.f9813a = ywVar2;
        this.f9814b = t43Var;
    }

    @Override // ai.xc2
    public final s43<te2> zza() {
        return this.f9813a.h(new Callable(this) { // from class: ai.re2

            /* renamed from: a  reason: collision with root package name */
            public final se2 f9414a;

            {
                this.f9414a = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new te2(this.f9414a.f9814b);
            }
        });
    }
}
