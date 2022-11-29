package ai;

import java.util.Objects;
import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
public final class h53 extends r43 {

    /* renamed from: y  reason: collision with root package name */
    public final Callable f4753y;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ i53 f4754z;

    public h53(i53 i53Var, Callable callable) {
        this.f4754z = i53Var;
        Objects.requireNonNull(callable);
        this.f4753y = callable;
    }

    @Override // ai.r43
    public final Object a() throws Exception {
        return this.f4753y.call();
    }

    @Override // ai.r43
    public final String c() {
        return this.f4753y.toString();
    }

    @Override // ai.r43
    public final boolean d() {
        return this.f4754z.isDone();
    }

    @Override // ai.r43
    public final void e(Object obj) {
        this.f4754z.u(obj);
    }

    @Override // ai.r43
    public final void f(Throwable th2) {
        this.f4754z.v(th2);
    }
}
