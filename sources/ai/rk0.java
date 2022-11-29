package ai;

import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes3.dex */
public final class rk0 implements e43 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ tk0 f9480a;

    public rk0(tk0 tk0Var) {
        this.f9480a = tk0Var;
    }

    @Override // ai.e43
    public final void a(Throwable th2) {
        AtomicInteger atomicInteger;
        atomicInteger = this.f9480a.f10333b;
        atomicInteger.set(-1);
    }

    @Override // ai.e43
    public final void b(Object obj) {
        AtomicInteger atomicInteger;
        atomicInteger = this.f9480a.f10333b;
        atomicInteger.set(1);
    }
}
