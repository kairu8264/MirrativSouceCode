package er;

import ep.d0;
import ep.e;
import ep.e0;
import er.x;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* loaded from: classes4.dex */
public abstract class j<ResponseT, ReturnT> extends u<ReturnT> {

    /* renamed from: a  reason: collision with root package name */
    public final r f31125a;

    /* renamed from: b  reason: collision with root package name */
    public final e.a f31126b;

    /* renamed from: c  reason: collision with root package name */
    public final f<e0, ResponseT> f31127c;

    /* loaded from: classes4.dex */
    public static final class a<ResponseT, ReturnT> extends j<ResponseT, ReturnT> {

        /* renamed from: d  reason: collision with root package name */
        public final er.c<ResponseT, ReturnT> f31128d;

        public a(r rVar, e.a aVar, f<e0, ResponseT> fVar, er.c<ResponseT, ReturnT> cVar) {
            super(rVar, aVar, fVar);
            this.f31128d = cVar;
        }

        @Override // er.j
        public ReturnT c(er.b<ResponseT> bVar, Object[] objArr) {
            return this.f31128d.b(bVar);
        }
    }

    /* loaded from: classes4.dex */
    public static final class b<ResponseT> extends j<ResponseT, Object> {

        /* renamed from: d  reason: collision with root package name */
        public final er.c<ResponseT, er.b<ResponseT>> f31129d;

        /* renamed from: e  reason: collision with root package name */
        public final boolean f31130e;

        public b(r rVar, e.a aVar, f<e0, ResponseT> fVar, er.c<ResponseT, er.b<ResponseT>> cVar, boolean z10) {
            super(rVar, aVar, fVar);
            this.f31129d = cVar;
            this.f31130e = z10;
        }

        @Override // er.j
        public Object c(er.b<ResponseT> bVar, Object[] objArr) {
            er.b<ResponseT> b10 = this.f31129d.b(bVar);
            ao.d dVar = (ao.d) objArr[objArr.length - 1];
            try {
                if (this.f31130e) {
                    return l.b(b10, dVar);
                }
                return l.a(b10, dVar);
            } catch (Exception e10) {
                return l.d(e10, dVar);
            }
        }
    }

    /* loaded from: classes4.dex */
    public static final class c<ResponseT> extends j<ResponseT, Object> {

        /* renamed from: d  reason: collision with root package name */
        public final er.c<ResponseT, er.b<ResponseT>> f31131d;

        public c(r rVar, e.a aVar, f<e0, ResponseT> fVar, er.c<ResponseT, er.b<ResponseT>> cVar) {
            super(rVar, aVar, fVar);
            this.f31131d = cVar;
        }

        @Override // er.j
        public Object c(er.b<ResponseT> bVar, Object[] objArr) {
            er.b<ResponseT> b10 = this.f31131d.b(bVar);
            ao.d dVar = (ao.d) objArr[objArr.length - 1];
            try {
                return l.c(b10, dVar);
            } catch (Exception e10) {
                return l.d(e10, dVar);
            }
        }
    }

    public j(r rVar, e.a aVar, f<e0, ResponseT> fVar) {
        this.f31125a = rVar;
        this.f31126b = aVar;
        this.f31127c = fVar;
    }

    public static <ResponseT, ReturnT> er.c<ResponseT, ReturnT> d(t tVar, Method method, Type type, Annotation[] annotationArr) {
        try {
            return (er.c<ResponseT, ReturnT>) tVar.a(type, annotationArr);
        } catch (RuntimeException e10) {
            throw x.n(method, e10, "Unable to create call adapter for %s", type);
        }
    }

    public static <ResponseT> f<e0, ResponseT> e(t tVar, Method method, Type type) {
        try {
            return tVar.h(type, method.getAnnotations());
        } catch (RuntimeException e10) {
            throw x.n(method, e10, "Unable to create converter for %s", type);
        }
    }

    public static <ResponseT, ReturnT> j<ResponseT, ReturnT> f(t tVar, Method method, r rVar) {
        Type genericReturnType;
        boolean z10;
        boolean z11 = rVar.f31232k;
        Annotation[] annotations = method.getAnnotations();
        if (z11) {
            Type[] genericParameterTypes = method.getGenericParameterTypes();
            Type f10 = x.f(0, (ParameterizedType) genericParameterTypes[genericParameterTypes.length - 1]);
            if (x.h(f10) == s.class && (f10 instanceof ParameterizedType)) {
                f10 = x.g(0, (ParameterizedType) f10);
                z10 = true;
            } else {
                z10 = false;
            }
            genericReturnType = new x.b(null, er.b.class, f10);
            annotations = w.a(annotations);
        } else {
            genericReturnType = method.getGenericReturnType();
            z10 = false;
        }
        er.c d10 = d(tVar, method, genericReturnType, annotations);
        Type a10 = d10.a();
        if (a10 != d0.class) {
            if (a10 != s.class) {
                if (rVar.f31224c.equals("HEAD") && !Void.class.equals(a10)) {
                    throw x.m(method, "HEAD method must use Void as response type.", new Object[0]);
                }
                f e10 = e(tVar, method, a10);
                e.a aVar = tVar.f31262b;
                if (z11) {
                    if (z10) {
                        return new c(rVar, aVar, e10, d10);
                    }
                    return new b(rVar, aVar, e10, d10, false);
                }
                return new a(rVar, aVar, e10, d10);
            }
            throw x.m(method, "Response must include generic type (e.g., Response<String>)", new Object[0]);
        }
        throw x.m(method, "'" + x.h(a10).getName() + "' is not a valid response body type. Did you mean ResponseBody?", new Object[0]);
    }

    @Override // er.u
    public final ReturnT a(Object[] objArr) {
        return c(new m(this.f31125a, objArr, this.f31126b, this.f31127c), objArr);
    }

    public abstract ReturnT c(er.b<ResponseT> bVar, Object[] objArr);
}
