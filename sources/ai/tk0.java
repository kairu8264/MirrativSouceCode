package ai;

import java.util.concurrent.atomic.AtomicInteger;

@Deprecated
/* loaded from: classes3.dex */
public class tk0<T> {

    /* renamed from: a  reason: collision with root package name */
    public final mk0<T> f10332a;

    /* renamed from: b  reason: collision with root package name */
    public final AtomicInteger f10333b;

    public tk0() {
        mk0<T> mk0Var = new mk0<>();
        this.f10332a = mk0Var;
        this.f10333b = new AtomicInteger(0);
        j43.p(mk0Var, new rk0(this), hk0.f4883f);
    }

    @Deprecated
    public final void b(qk0<T> qk0Var, ok0 ok0Var) {
        j43.p(this.f10332a, new sk0(this, qk0Var, ok0Var), hk0.f4883f);
    }

    @Deprecated
    public final void c(T t10) {
        this.f10332a.d(t10);
    }

    @Deprecated
    public final void d() {
        this.f10332a.e(new Exception());
    }

    @Deprecated
    public final int e() {
        return this.f10333b.get();
    }
}
