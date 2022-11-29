package androidx.lifecycle;

import androidx.lifecycle.o;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Deprecated
/* loaded from: classes.dex */
public final class d {

    /* renamed from: c  reason: collision with root package name */
    public static d f15525c = new d();

    /* renamed from: a  reason: collision with root package name */
    public final Map<Class<?>, a> f15526a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public final Map<Class<?>, Boolean> f15527b = new HashMap();

    @Deprecated
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final Map<o.b, List<b>> f15528a = new HashMap();

        /* renamed from: b  reason: collision with root package name */
        public final Map<b, o.b> f15529b;

        public a(Map<b, o.b> map) {
            this.f15529b = map;
            for (Map.Entry<b, o.b> entry : map.entrySet()) {
                o.b value = entry.getValue();
                List<b> list = this.f15528a.get(value);
                if (list == null) {
                    list = new ArrayList<>();
                    this.f15528a.put(value, list);
                }
                list.add(entry.getKey());
            }
        }

        public static void b(List<b> list, u uVar, o.b bVar, Object obj) {
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    list.get(size).a(uVar, bVar, obj);
                }
            }
        }

        public void a(u uVar, o.b bVar, Object obj) {
            b(this.f15528a.get(bVar), uVar, bVar, obj);
            b(this.f15528a.get(o.b.ON_ANY), uVar, bVar, obj);
        }
    }

    @Deprecated
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final int f15530a;

        /* renamed from: b  reason: collision with root package name */
        public final Method f15531b;

        public b(int i10, Method method) {
            this.f15530a = i10;
            this.f15531b = method;
            method.setAccessible(true);
        }

        public void a(u uVar, o.b bVar, Object obj) {
            try {
                int i10 = this.f15530a;
                if (i10 == 0) {
                    this.f15531b.invoke(obj, new Object[0]);
                } else if (i10 == 1) {
                    this.f15531b.invoke(obj, uVar);
                } else if (i10 != 2) {
                } else {
                    this.f15531b.invoke(obj, uVar, bVar);
                }
            } catch (IllegalAccessException e10) {
                throw new RuntimeException(e10);
            } catch (InvocationTargetException e11) {
                throw new RuntimeException("Failed to call observer method", e11.getCause());
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                return this.f15530a == bVar.f15530a && this.f15531b.getName().equals(bVar.f15531b.getName());
            }
            return false;
        }

        public int hashCode() {
            return (this.f15530a * 31) + this.f15531b.getName().hashCode();
        }
    }

    public final a a(Class<?> cls, Method[] methodArr) {
        int i10;
        a c10;
        Class<? super Object> superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        if (superclass != null && (c10 = c(superclass)) != null) {
            hashMap.putAll(c10.f15529b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            for (Map.Entry<b, o.b> entry : c(cls2).f15529b.entrySet()) {
                e(hashMap, entry.getKey(), entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            methodArr = b(cls);
        }
        boolean z10 = false;
        for (Method method : methodArr) {
            g0 g0Var = (g0) method.getAnnotation(g0.class);
            if (g0Var != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i10 = 0;
                } else if (!parameterTypes[0].isAssignableFrom(u.class)) {
                    throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                } else {
                    i10 = 1;
                }
                o.b value = g0Var.value();
                if (parameterTypes.length > 1) {
                    if (parameterTypes[1].isAssignableFrom(o.b.class)) {
                        if (value != o.b.ON_ANY) {
                            throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                        }
                        i10 = 2;
                    } else {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                }
                if (parameterTypes.length <= 2) {
                    e(hashMap, new b(i10, method), value, cls);
                    z10 = true;
                } else {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
            }
        }
        a aVar = new a(hashMap);
        this.f15526a.put(cls, aVar);
        this.f15527b.put(cls, Boolean.valueOf(z10));
        return aVar;
    }

    public final Method[] b(Class<?> cls) {
        try {
            return cls.getDeclaredMethods();
        } catch (NoClassDefFoundError e10) {
            throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e10);
        }
    }

    public a c(Class<?> cls) {
        a aVar = this.f15526a.get(cls);
        return aVar != null ? aVar : a(cls, null);
    }

    public boolean d(Class<?> cls) {
        Boolean bool = this.f15527b.get(cls);
        if (bool != null) {
            return bool.booleanValue();
        }
        Method[] b10 = b(cls);
        for (Method method : b10) {
            if (((g0) method.getAnnotation(g0.class)) != null) {
                a(cls, b10);
                return true;
            }
        }
        this.f15527b.put(cls, Boolean.FALSE);
        return false;
    }

    public final void e(Map<b, o.b> map, b bVar, o.b bVar2, Class<?> cls) {
        o.b bVar3 = map.get(bVar);
        if (bVar3 == null || bVar2 == bVar3) {
            if (bVar3 == null) {
                map.put(bVar, bVar2);
                return;
            }
            return;
        }
        Method method = bVar.f15531b;
        throw new IllegalArgumentException("Method " + method.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + bVar3 + ", new value " + bVar2);
    }
}
