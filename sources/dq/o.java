package dq;

import com.mirrativ.llstream.protocol.v1.topic.TopicConstant;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.greenrobot.eventbus.EventBusException;

/* loaded from: classes4.dex */
public class o {

    /* renamed from: d  reason: collision with root package name */
    public static final Map<Class<?>, List<n>> f29847d = new ConcurrentHashMap();

    /* renamed from: e  reason: collision with root package name */
    public static final a[] f29848e = new a[4];

    /* renamed from: a  reason: collision with root package name */
    public List<fq.b> f29849a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f29850b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f29851c;

    /* loaded from: classes4.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final List<n> f29852a = new ArrayList();

        /* renamed from: b  reason: collision with root package name */
        public final Map<Class, Object> f29853b = new HashMap();

        /* renamed from: c  reason: collision with root package name */
        public final Map<String, Class> f29854c = new HashMap();

        /* renamed from: d  reason: collision with root package name */
        public final StringBuilder f29855d = new StringBuilder(128);

        /* renamed from: e  reason: collision with root package name */
        public Class<?> f29856e;

        /* renamed from: f  reason: collision with root package name */
        public Class<?> f29857f;

        /* renamed from: g  reason: collision with root package name */
        public boolean f29858g;

        /* renamed from: h  reason: collision with root package name */
        public fq.a f29859h;

        public boolean a(Method method, Class<?> cls) {
            Object put = this.f29853b.put(cls, method);
            if (put == null) {
                return true;
            }
            if (put instanceof Method) {
                if (b((Method) put, cls)) {
                    this.f29853b.put(cls, this);
                } else {
                    throw new IllegalStateException();
                }
            }
            return b(method, cls);
        }

        public final boolean b(Method method, Class<?> cls) {
            this.f29855d.setLength(0);
            this.f29855d.append(method.getName());
            StringBuilder sb2 = this.f29855d;
            sb2.append('>');
            sb2.append(cls.getName());
            String sb3 = this.f29855d.toString();
            Class<?> declaringClass = method.getDeclaringClass();
            Class put = this.f29854c.put(sb3, declaringClass);
            if (put == null || put.isAssignableFrom(declaringClass)) {
                return true;
            }
            this.f29854c.put(sb3, put);
            return false;
        }

        public void c(Class<?> cls) {
            this.f29857f = cls;
            this.f29856e = cls;
            this.f29858g = false;
            this.f29859h = null;
        }

        public void d() {
            if (this.f29858g) {
                this.f29857f = null;
                return;
            }
            Class<? super Object> superclass = this.f29857f.getSuperclass();
            this.f29857f = superclass;
            String name = superclass.getName();
            if (name.startsWith("java.") || name.startsWith("javax.") || name.startsWith("android.") || name.startsWith("androidx.")) {
                this.f29857f = null;
            }
        }

        public void e() {
            this.f29852a.clear();
            this.f29853b.clear();
            this.f29854c.clear();
            this.f29855d.setLength(0);
            this.f29856e = null;
            this.f29857f = null;
            this.f29858g = false;
            this.f29859h = null;
        }
    }

    public o(List<fq.b> list, boolean z10, boolean z11) {
        this.f29849a = list;
        this.f29850b = z10;
        this.f29851c = z11;
    }

    public List<n> a(Class<?> cls) {
        List<n> b10;
        Map<Class<?>, List<n>> map = f29847d;
        List<n> list = map.get(cls);
        if (list != null) {
            return list;
        }
        if (this.f29851c) {
            b10 = c(cls);
        } else {
            b10 = b(cls);
        }
        if (!b10.isEmpty()) {
            map.put(cls, b10);
            return b10;
        }
        throw new EventBusException("Subscriber " + cls + " and its super classes have no public methods with the @Subscribe annotation");
    }

    public final List<n> b(Class<?> cls) {
        n[] a10;
        a g10 = g();
        g10.c(cls);
        while (g10.f29857f != null) {
            fq.a f10 = f(g10);
            g10.f29859h = f10;
            if (f10 != null) {
                for (n nVar : f10.a()) {
                    if (g10.a(nVar.f29841a, nVar.f29843c)) {
                        g10.f29852a.add(nVar);
                    }
                }
            } else {
                d(g10);
            }
            g10.d();
        }
        return e(g10);
    }

    public final List<n> c(Class<?> cls) {
        a g10 = g();
        g10.c(cls);
        while (g10.f29857f != null) {
            d(g10);
            g10.d();
        }
        return e(g10);
    }

    public final void d(a aVar) {
        Method[] methods;
        try {
            try {
                methods = aVar.f29857f.getDeclaredMethods();
            } catch (Throwable unused) {
                methods = aVar.f29857f.getMethods();
                aVar.f29858g = true;
            }
            for (Method method : methods) {
                int modifiers = method.getModifiers();
                if ((modifiers & 1) != 0 && (modifiers & 5192) == 0) {
                    Class<?>[] parameterTypes = method.getParameterTypes();
                    if (parameterTypes.length == 1) {
                        l lVar = (l) method.getAnnotation(l.class);
                        if (lVar != null) {
                            Class<?> cls = parameterTypes[0];
                            if (aVar.a(method, cls)) {
                                aVar.f29852a.add(new n(method, cls, lVar.threadMode(), lVar.priority(), lVar.sticky()));
                            }
                        }
                    } else if (this.f29850b && method.isAnnotationPresent(l.class)) {
                        throw new EventBusException("@Subscribe method " + (method.getDeclaringClass().getName() + TopicConstant.SEPARATOR + method.getName()) + "must have exactly 1 parameter but has " + parameterTypes.length);
                    }
                } else if (this.f29850b && method.isAnnotationPresent(l.class)) {
                    throw new EventBusException((method.getDeclaringClass().getName() + TopicConstant.SEPARATOR + method.getName()) + " is a illegal @Subscribe method: must be public, non-static, and non-abstract");
                }
            }
        } catch (LinkageError e10) {
            String str = "Could not inspect methods of " + aVar.f29857f.getName();
            throw new EventBusException(this.f29851c ? str + ". Please consider using EventBus annotation processor to avoid reflection." : str + ". Please make this class visible to EventBus annotation processor to avoid reflection.", e10);
        }
    }

    public final List<n> e(a aVar) {
        ArrayList arrayList = new ArrayList(aVar.f29852a);
        aVar.e();
        synchronized (f29848e) {
            int i10 = 0;
            while (true) {
                if (i10 >= 4) {
                    break;
                }
                a[] aVarArr = f29848e;
                if (aVarArr[i10] == null) {
                    aVarArr[i10] = aVar;
                    break;
                }
                i10++;
            }
        }
        return arrayList;
    }

    public final fq.a f(a aVar) {
        fq.a aVar2 = aVar.f29859h;
        if (aVar2 != null && aVar2.c() != null) {
            fq.a c10 = aVar.f29859h.c();
            if (aVar.f29857f == c10.b()) {
                return c10;
            }
        }
        List<fq.b> list = this.f29849a;
        if (list != null) {
            for (fq.b bVar : list) {
                fq.a a10 = bVar.a(aVar.f29857f);
                if (a10 != null) {
                    return a10;
                }
            }
            return null;
        }
        return null;
    }

    public final a g() {
        synchronized (f29848e) {
            for (int i10 = 0; i10 < 4; i10++) {
                a[] aVarArr = f29848e;
                a aVar = aVarArr[i10];
                if (aVar != null) {
                    aVarArr[i10] = null;
                    return aVar;
                }
            }
            return new a();
        }
    }
}
