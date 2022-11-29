package er;

import java.lang.reflect.Method;
import java.lang.reflect.Type;

/* loaded from: classes4.dex */
public abstract class u<T> {
    public static <T> u<T> b(t tVar, Method method) {
        r b10 = r.b(tVar, method);
        Type genericReturnType = method.getGenericReturnType();
        if (!x.j(genericReturnType)) {
            if (genericReturnType != Void.TYPE) {
                return j.f(tVar, method, b10);
            }
            throw x.m(method, "Service methods cannot return void.", new Object[0]);
        }
        throw x.m(method, "Method return type must not include a type variable or wildcard: %s", genericReturnType);
    }

    public abstract T a(Object[] objArr);
}
