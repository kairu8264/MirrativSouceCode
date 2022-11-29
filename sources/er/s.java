package er;

import ep.d0;
import ep.e0;
import java.util.Objects;

/* loaded from: classes4.dex */
public final class s<T> {

    /* renamed from: a  reason: collision with root package name */
    public final d0 f31258a;

    /* renamed from: b  reason: collision with root package name */
    public final T f31259b;

    /* renamed from: c  reason: collision with root package name */
    public final e0 f31260c;

    public s(d0 d0Var, T t10, e0 e0Var) {
        this.f31258a = d0Var;
        this.f31259b = t10;
        this.f31260c = e0Var;
    }

    public static <T> s<T> c(e0 e0Var, d0 d0Var) {
        Objects.requireNonNull(e0Var, "body == null");
        Objects.requireNonNull(d0Var, "rawResponse == null");
        if (!d0Var.u0()) {
            return new s<>(d0Var, null, e0Var);
        }
        throw new IllegalArgumentException("rawResponse should not be successful response");
    }

    public static <T> s<T> h(T t10, d0 d0Var) {
        Objects.requireNonNull(d0Var, "rawResponse == null");
        if (d0Var.u0()) {
            return new s<>(d0Var, t10, null);
        }
        throw new IllegalArgumentException("rawResponse must be successful response");
    }

    public T a() {
        return this.f31259b;
    }

    public int b() {
        return this.f31258a.h();
    }

    public e0 d() {
        return this.f31260c;
    }

    public ep.u e() {
        return this.f31258a.p();
    }

    public boolean f() {
        return this.f31258a.u0();
    }

    public String g() {
        return this.f31258a.q();
    }

    public String toString() {
        return this.f31258a.toString();
    }
}
