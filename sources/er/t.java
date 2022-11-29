package er;

import ep.c0;
import ep.e;
import ep.e0;
import ep.z;
import er.a;
import er.c;
import er.f;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* loaded from: classes4.dex */
public final class t {

    /* renamed from: a  reason: collision with root package name */
    public final Map<Method, u<?>> f31261a = new ConcurrentHashMap();

    /* renamed from: b  reason: collision with root package name */
    public final e.a f31262b;

    /* renamed from: c  reason: collision with root package name */
    public final ep.v f31263c;

    /* renamed from: d  reason: collision with root package name */
    public final List<f.a> f31264d;

    /* renamed from: e  reason: collision with root package name */
    public final List<c.a> f31265e;

    /* renamed from: f  reason: collision with root package name */
    public final Executor f31266f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f31267g;

    /* loaded from: classes4.dex */
    public class a implements InvocationHandler {

        /* renamed from: a  reason: collision with root package name */
        public final p f31268a = p.f();

        /* renamed from: b  reason: collision with root package name */
        public final Object[] f31269b = new Object[0];

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ Class f31270c;

        public a(Class cls) {
            this.f31270c = cls;
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            if (method.getDeclaringClass() == Object.class) {
                return method.invoke(this, objArr);
            }
            if (objArr == null) {
                objArr = this.f31269b;
            }
            if (this.f31268a.h(method)) {
                return this.f31268a.g(method, this.f31270c, obj, objArr);
            }
            return t.this.c(method).a(objArr);
        }
    }

    public t(e.a aVar, ep.v vVar, List<f.a> list, List<c.a> list2, Executor executor, boolean z10) {
        this.f31262b = aVar;
        this.f31263c = vVar;
        this.f31264d = list;
        this.f31265e = list2;
        this.f31266f = executor;
        this.f31267g = z10;
    }

    public c<?, ?> a(Type type, Annotation[] annotationArr) {
        return d(null, type, annotationArr);
    }

    public <T> T b(Class<T> cls) {
        j(cls);
        return (T) Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new a(cls));
    }

    public u<?> c(Method method) {
        u<?> uVar;
        u<?> uVar2 = this.f31261a.get(method);
        if (uVar2 != null) {
            return uVar2;
        }
        synchronized (this.f31261a) {
            uVar = this.f31261a.get(method);
            if (uVar == null) {
                uVar = u.b(this, method);
                this.f31261a.put(method, uVar);
            }
        }
        return uVar;
    }

    public c<?, ?> d(c.a aVar, Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "returnType == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        int indexOf = this.f31265e.indexOf(aVar) + 1;
        int size = this.f31265e.size();
        for (int i10 = indexOf; i10 < size; i10++) {
            c<?, ?> a10 = this.f31265e.get(i10).a(type, annotationArr, this);
            if (a10 != null) {
                return a10;
            }
        }
        StringBuilder sb2 = new StringBuilder("Could not locate call adapter for ");
        sb2.append(type);
        sb2.append(".\n");
        if (aVar != null) {
            sb2.append("  Skipped:");
            for (int i11 = 0; i11 < indexOf; i11++) {
                sb2.append("\n   * ");
                sb2.append(this.f31265e.get(i11).getClass().getName());
            }
            sb2.append('\n');
        }
        sb2.append("  Tried:");
        int size2 = this.f31265e.size();
        while (indexOf < size2) {
            sb2.append("\n   * ");
            sb2.append(this.f31265e.get(indexOf).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(sb2.toString());
    }

    public <T> f<T, c0> e(f.a aVar, Type type, Annotation[] annotationArr, Annotation[] annotationArr2) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr, "parameterAnnotations == null");
        Objects.requireNonNull(annotationArr2, "methodAnnotations == null");
        int indexOf = this.f31264d.indexOf(aVar) + 1;
        int size = this.f31264d.size();
        for (int i10 = indexOf; i10 < size; i10++) {
            f<T, c0> fVar = (f<T, c0>) this.f31264d.get(i10).c(type, annotationArr, annotationArr2, this);
            if (fVar != null) {
                return fVar;
            }
        }
        StringBuilder sb2 = new StringBuilder("Could not locate RequestBody converter for ");
        sb2.append(type);
        sb2.append(".\n");
        if (aVar != null) {
            sb2.append("  Skipped:");
            for (int i11 = 0; i11 < indexOf; i11++) {
                sb2.append("\n   * ");
                sb2.append(this.f31264d.get(i11).getClass().getName());
            }
            sb2.append('\n');
        }
        sb2.append("  Tried:");
        int size2 = this.f31264d.size();
        while (indexOf < size2) {
            sb2.append("\n   * ");
            sb2.append(this.f31264d.get(indexOf).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(sb2.toString());
    }

    public <T> f<e0, T> f(f.a aVar, Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        int indexOf = this.f31264d.indexOf(aVar) + 1;
        int size = this.f31264d.size();
        for (int i10 = indexOf; i10 < size; i10++) {
            f<e0, T> fVar = (f<e0, T>) this.f31264d.get(i10).d(type, annotationArr, this);
            if (fVar != null) {
                return fVar;
            }
        }
        StringBuilder sb2 = new StringBuilder("Could not locate ResponseBody converter for ");
        sb2.append(type);
        sb2.append(".\n");
        if (aVar != null) {
            sb2.append("  Skipped:");
            for (int i11 = 0; i11 < indexOf; i11++) {
                sb2.append("\n   * ");
                sb2.append(this.f31264d.get(i11).getClass().getName());
            }
            sb2.append('\n');
        }
        sb2.append("  Tried:");
        int size2 = this.f31264d.size();
        while (indexOf < size2) {
            sb2.append("\n   * ");
            sb2.append(this.f31264d.get(indexOf).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(sb2.toString());
    }

    public <T> f<T, c0> g(Type type, Annotation[] annotationArr, Annotation[] annotationArr2) {
        return e(null, type, annotationArr, annotationArr2);
    }

    public <T> f<e0, T> h(Type type, Annotation[] annotationArr) {
        return f(null, type, annotationArr);
    }

    public <T> f<T, String> i(Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        int size = this.f31264d.size();
        for (int i10 = 0; i10 < size; i10++) {
            f<T, String> fVar = (f<T, String>) this.f31264d.get(i10).e(type, annotationArr, this);
            if (fVar != null) {
                return fVar;
            }
        }
        return a.d.f31100a;
    }

    public final void j(Class<?> cls) {
        Method[] declaredMethods;
        if (cls.isInterface()) {
            ArrayDeque arrayDeque = new ArrayDeque(1);
            arrayDeque.add(cls);
            while (!arrayDeque.isEmpty()) {
                Class<?> cls2 = (Class) arrayDeque.removeFirst();
                if (cls2.getTypeParameters().length != 0) {
                    StringBuilder sb2 = new StringBuilder("Type parameters are unsupported on ");
                    sb2.append(cls2.getName());
                    if (cls2 != cls) {
                        sb2.append(" which is an interface of ");
                        sb2.append(cls.getName());
                    }
                    throw new IllegalArgumentException(sb2.toString());
                }
                Collections.addAll(arrayDeque, cls2.getInterfaces());
            }
            if (this.f31267g) {
                p f10 = p.f();
                for (Method method : cls.getDeclaredMethods()) {
                    if (!f10.h(method) && !Modifier.isStatic(method.getModifiers())) {
                        c(method);
                    }
                }
                return;
            }
            return;
        }
        throw new IllegalArgumentException("API declarations must be interfaces.");
    }

    /* loaded from: classes4.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final p f31272a;

        /* renamed from: b  reason: collision with root package name */
        public e.a f31273b;

        /* renamed from: c  reason: collision with root package name */
        public ep.v f31274c;

        /* renamed from: d  reason: collision with root package name */
        public final List<f.a> f31275d;

        /* renamed from: e  reason: collision with root package name */
        public final List<c.a> f31276e;

        /* renamed from: f  reason: collision with root package name */
        public Executor f31277f;

        /* renamed from: g  reason: collision with root package name */
        public boolean f31278g;

        public b(p pVar) {
            this.f31275d = new ArrayList();
            this.f31276e = new ArrayList();
            this.f31272a = pVar;
        }

        public b a(c.a aVar) {
            List<c.a> list = this.f31276e;
            Objects.requireNonNull(aVar, "factory == null");
            list.add(aVar);
            return this;
        }

        public b b(f.a aVar) {
            List<f.a> list = this.f31275d;
            Objects.requireNonNull(aVar, "factory == null");
            list.add(aVar);
            return this;
        }

        public b c(ep.v vVar) {
            Objects.requireNonNull(vVar, "baseUrl == null");
            List<String> n10 = vVar.n();
            if ("".equals(n10.get(n10.size() - 1))) {
                this.f31274c = vVar;
                return this;
            }
            throw new IllegalArgumentException("baseUrl must end in /: " + vVar);
        }

        public b d(String str) {
            Objects.requireNonNull(str, "baseUrl == null");
            return c(ep.v.h(str));
        }

        public t e() {
            if (this.f31274c != null) {
                e.a aVar = this.f31273b;
                if (aVar == null) {
                    aVar = new z();
                }
                e.a aVar2 = aVar;
                Executor executor = this.f31277f;
                if (executor == null) {
                    executor = this.f31272a.b();
                }
                Executor executor2 = executor;
                ArrayList arrayList = new ArrayList(this.f31276e);
                arrayList.addAll(this.f31272a.a(executor2));
                ArrayList arrayList2 = new ArrayList(this.f31275d.size() + 1 + this.f31272a.d());
                arrayList2.add(new er.a());
                arrayList2.addAll(this.f31275d);
                arrayList2.addAll(this.f31272a.c());
                return new t(aVar2, this.f31274c, Collections.unmodifiableList(arrayList2), Collections.unmodifiableList(arrayList), executor2, this.f31278g);
            }
            throw new IllegalStateException("Base URL required.");
        }

        public b f(e.a aVar) {
            Objects.requireNonNull(aVar, "factory == null");
            this.f31273b = aVar;
            return this;
        }

        public b g(z zVar) {
            Objects.requireNonNull(zVar, "client == null");
            return f(zVar);
        }

        public b() {
            this(p.f());
        }
    }
}
