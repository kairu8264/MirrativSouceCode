package ai;

import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
public final class aa2 implements xc2<ba2> {

    /* renamed from: a  reason: collision with root package name */
    public final t43 f1802a;

    /* renamed from: b  reason: collision with root package name */
    public final yl2 f1803b;

    public aa2(t43 t43Var, yl2 yl2Var) {
        this.f1802a = t43Var;
        this.f1803b = yl2Var;
    }

    public final /* synthetic */ ba2 a() throws Exception {
        return new ba2("requester_type_2".equals(eh.o.d(this.f1803b)));
    }

    @Override // ai.xc2
    public final s43<ba2> zza() {
        return this.f1802a.h(new Callable(this) { // from class: ai.z92

            /* renamed from: a  reason: collision with root package name */
            public final aa2 f12919a;

            {
                this.f12919a = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f12919a.a();
            }
        });
    }
}
