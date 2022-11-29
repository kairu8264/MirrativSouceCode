package ai;

import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
public final class c82 implements xc2<d82> {

    /* renamed from: a  reason: collision with root package name */
    public final t43 f2752a;

    /* renamed from: b  reason: collision with root package name */
    public final yl2 f2753b;

    /* renamed from: c  reason: collision with root package name */
    public final zj0 f2754c;

    /* renamed from: d  reason: collision with root package name */
    public final jj0 f2755d;

    public c82(t43 t43Var, yl2 yl2Var, zj0 zj0Var, jj0 jj0Var) {
        this.f2752a = t43Var;
        this.f2753b = yl2Var;
        this.f2754c = zj0Var;
        this.f2755d = jj0Var;
    }

    public final /* synthetic */ d82 a() throws Exception {
        return new d82(this.f2753b.f12656j, this.f2754c, this.f2755d.j());
    }

    @Override // ai.xc2
    public final s43<d82> zza() {
        return this.f2752a.h(new Callable(this) { // from class: ai.b82

            /* renamed from: a  reason: collision with root package name */
            public final c82 f2270a;

            {
                this.f2270a = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f2270a.a();
            }
        });
    }
}
