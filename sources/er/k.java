package er;

import java.lang.reflect.Method;
import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
public final class k {

    /* renamed from: a  reason: collision with root package name */
    public final Method f31132a;

    /* renamed from: b  reason: collision with root package name */
    public final List<?> f31133b;

    public k(Method method, List<?> list) {
        this.f31132a = method;
        this.f31133b = Collections.unmodifiableList(list);
    }

    public Method a() {
        return this.f31132a;
    }

    public String toString() {
        return String.format("%s.%s() %s", this.f31132a.getDeclaringClass().getName(), this.f31132a.getName(), this.f31133b);
    }
}
