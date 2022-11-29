package ai;

import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
public final class f92 implements xc2<g92> {

    /* renamed from: a  reason: collision with root package name */
    public final t43 f3970a;

    /* renamed from: b  reason: collision with root package name */
    public final rn1 f3971b;

    /* renamed from: c  reason: collision with root package name */
    public final String f3972c;

    /* renamed from: d  reason: collision with root package name */
    public final yl2 f3973d;

    public f92(t43 t43Var, rn1 rn1Var, yl2 yl2Var, String str) {
        this.f3970a = t43Var;
        this.f3971b = rn1Var;
        this.f3973d = yl2Var;
        this.f3972c = str;
    }

    public final /* synthetic */ g92 a() throws Exception {
        return new g92(this.f3971b.b(this.f3973d.f12652f, this.f3972c), this.f3971b.c());
    }

    @Override // ai.xc2
    public final s43<g92> zza() {
        return this.f3970a.h(new Callable(this) { // from class: ai.e92

            /* renamed from: a  reason: collision with root package name */
            public final f92 f3591a;

            {
                this.f3591a = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f3591a.a();
            }
        });
    }
}
