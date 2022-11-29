package er;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* loaded from: classes4.dex */
public interface c<R, T> {

    /* loaded from: classes4.dex */
    public static abstract class a {
        public static Type b(int i10, ParameterizedType parameterizedType) {
            return x.g(i10, parameterizedType);
        }

        public static Class<?> c(Type type) {
            return x.h(type);
        }

        public abstract c<?, ?> a(Type type, Annotation[] annotationArr, t tVar);
    }

    Type a();

    T b(b<R> bVar);
}
