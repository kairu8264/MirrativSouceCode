package er;

import ep.c0;
import ep.e0;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* loaded from: classes4.dex */
public interface f<F, T> {

    /* loaded from: classes4.dex */
    public static abstract class a {
        public static Type a(int i10, ParameterizedType parameterizedType) {
            return x.g(i10, parameterizedType);
        }

        public static Class<?> b(Type type) {
            return x.h(type);
        }

        public f<?, c0> c(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, t tVar) {
            return null;
        }

        public f<e0, ?> d(Type type, Annotation[] annotationArr, t tVar) {
            return null;
        }

        public f<?, String> e(Type type, Annotation[] annotationArr, t tVar) {
            return null;
        }
    }

    T a(F f10) throws IOException;
}
