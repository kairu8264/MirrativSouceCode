package androidx.lifecycle;

import com.mirrativ.llstream.protocol.v1.topic.TopicConstant;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class z {

    /* renamed from: a  reason: collision with root package name */
    public static Map<Class<?>, Integer> f15635a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public static Map<Class<?>, List<Constructor<? extends n>>> f15636b = new HashMap();

    public static n a(Constructor<? extends n> constructor, Object obj) {
        try {
            return constructor.newInstance(obj);
        } catch (IllegalAccessException e10) {
            throw new RuntimeException(e10);
        } catch (InstantiationException e11) {
            throw new RuntimeException(e11);
        } catch (InvocationTargetException e12) {
            throw new RuntimeException(e12);
        }
    }

    public static Constructor<? extends n> b(Class<?> cls) {
        try {
            Package r02 = cls.getPackage();
            String canonicalName = cls.getCanonicalName();
            String name = r02 != null ? r02.getName() : "";
            if (!name.isEmpty()) {
                canonicalName = canonicalName.substring(name.length() + 1);
            }
            String c10 = c(canonicalName);
            if (!name.isEmpty()) {
                c10 = name + TopicConstant.SEPARATOR + c10;
            }
            Constructor declaredConstructor = Class.forName(c10).getDeclaredConstructor(cls);
            if (!declaredConstructor.isAccessible()) {
                declaredConstructor.setAccessible(true);
            }
            return declaredConstructor;
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (NoSuchMethodException e10) {
            throw new RuntimeException(e10);
        }
    }

    public static String c(String str) {
        return str.replace(TopicConstant.SEPARATOR, "_") + "_LifecycleAdapter";
    }

    public static int d(Class<?> cls) {
        Integer num = f15635a.get(cls);
        if (num != null) {
            return num.intValue();
        }
        int g10 = g(cls);
        f15635a.put(cls, Integer.valueOf(g10));
        return g10;
    }

    public static boolean e(Class<?> cls) {
        return cls != null && t.class.isAssignableFrom(cls);
    }

    public static r f(Object obj) {
        boolean z10 = obj instanceof r;
        boolean z11 = obj instanceof m;
        if (z10 && z11) {
            return new FullLifecycleObserverAdapter((m) obj, (r) obj);
        }
        if (z11) {
            return new FullLifecycleObserverAdapter((m) obj, null);
        }
        if (z10) {
            return (r) obj;
        }
        Class<?> cls = obj.getClass();
        if (d(cls) == 2) {
            List<Constructor<? extends n>> list = f15636b.get(cls);
            if (list.size() == 1) {
                return new SingleGeneratedAdapterObserver(a(list.get(0), obj));
            }
            n[] nVarArr = new n[list.size()];
            for (int i10 = 0; i10 < list.size(); i10++) {
                nVarArr[i10] = a(list.get(i10), obj);
            }
            return new CompositeGeneratedAdaptersObserver(nVarArr);
        }
        return new ReflectiveGenericLifecycleObserver(obj);
    }

    public static int g(Class<?> cls) {
        Class<?>[] interfaces;
        if (cls.getCanonicalName() == null) {
            return 1;
        }
        Constructor<? extends n> b10 = b(cls);
        if (b10 != null) {
            f15636b.put(cls, Collections.singletonList(b10));
            return 2;
        } else if (d.f15525c.d(cls)) {
            return 1;
        } else {
            Class<? super Object> superclass = cls.getSuperclass();
            ArrayList arrayList = null;
            if (e(superclass)) {
                if (d(superclass) == 1) {
                    return 1;
                }
                arrayList = new ArrayList(f15636b.get(superclass));
            }
            for (Class<?> cls2 : cls.getInterfaces()) {
                if (e(cls2)) {
                    if (d(cls2) == 1) {
                        return 1;
                    }
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.addAll(f15636b.get(cls2));
                }
            }
            if (arrayList != null) {
                f15636b.put(cls, arrayList);
                return 2;
            }
            return 1;
        }
    }
}
