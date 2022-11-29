package zm;

import com.google.gson.JsonIOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;

/* loaded from: classes4.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final Map<Type, xm.g<?>> f63209a;

    /* renamed from: b  reason: collision with root package name */
    public final cn.b f63210b = cn.b.a();

    /* loaded from: classes4.dex */
    public class a implements zm.i<T> {
        public a() {
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [T, java.util.concurrent.ConcurrentHashMap] */
        @Override // zm.i
        public T a() {
            return new ConcurrentHashMap();
        }
    }

    /* loaded from: classes4.dex */
    public class b implements zm.i<T> {
        public b() {
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.util.TreeMap, T] */
        @Override // zm.i
        public T a() {
            return new TreeMap();
        }
    }

    /* renamed from: zm.c$c  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public class C1100c implements zm.i<T> {
        public C1100c() {
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.util.LinkedHashMap, T] */
        @Override // zm.i
        public T a() {
            return new LinkedHashMap();
        }
    }

    /* loaded from: classes4.dex */
    public class d implements zm.i<T> {
        public d() {
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [zm.h, T] */
        @Override // zm.i
        public T a() {
            return new zm.h();
        }
    }

    /* loaded from: classes4.dex */
    public class e implements zm.i<T> {

        /* renamed from: a  reason: collision with root package name */
        public final zm.m f63215a = zm.m.b();

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ Class f63216b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ Type f63217c;

        public e(Class cls, Type type) {
            this.f63216b = cls;
            this.f63217c = type;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [T, java.lang.Object] */
        @Override // zm.i
        public T a() {
            try {
                return this.f63215a.c(this.f63216b);
            } catch (Exception e10) {
                throw new RuntimeException("Unable to invoke no-args constructor for " + this.f63217c + ". Registering an InstanceCreator with Gson for this type may fix this problem.", e10);
            }
        }
    }

    /* loaded from: classes4.dex */
    public class f implements zm.i<T> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ xm.g f63219a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ Type f63220b;

        public f(xm.g gVar, Type type) {
            this.f63219a = gVar;
            this.f63220b = type;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [T, java.lang.Object] */
        @Override // zm.i
        public T a() {
            return this.f63219a.a(this.f63220b);
        }
    }

    /* loaded from: classes4.dex */
    public class g implements zm.i<T> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ xm.g f63222a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ Type f63223b;

        public g(xm.g gVar, Type type) {
            this.f63222a = gVar;
            this.f63223b = type;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [T, java.lang.Object] */
        @Override // zm.i
        public T a() {
            return this.f63222a.a(this.f63223b);
        }
    }

    /* loaded from: classes4.dex */
    public class h implements zm.i<T> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Constructor f63225a;

        public h(Constructor constructor) {
            this.f63225a = constructor;
        }

        /* JADX WARN: Type inference failed for: r0v6, types: [T, java.lang.Object] */
        @Override // zm.i
        public T a() {
            try {
                return this.f63225a.newInstance(null);
            } catch (IllegalAccessException e10) {
                throw new AssertionError(e10);
            } catch (InstantiationException e11) {
                throw new RuntimeException("Failed to invoke " + this.f63225a + " with no args", e11);
            } catch (InvocationTargetException e12) {
                throw new RuntimeException("Failed to invoke " + this.f63225a + " with no args", e12.getTargetException());
            }
        }
    }

    /* loaded from: classes4.dex */
    public class i implements zm.i<T> {
        public i() {
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [T, java.util.TreeSet] */
        @Override // zm.i
        public T a() {
            return new TreeSet();
        }
    }

    /* loaded from: classes4.dex */
    public class j implements zm.i<T> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Type f63228a;

        public j(Type type) {
            this.f63228a = type;
        }

        /* JADX WARN: Type inference failed for: r0v7, types: [T, java.util.EnumSet] */
        @Override // zm.i
        public T a() {
            Type type = this.f63228a;
            if (type instanceof ParameterizedType) {
                Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
                if (type2 instanceof Class) {
                    return EnumSet.noneOf((Class) type2);
                }
                throw new JsonIOException("Invalid EnumSet type: " + this.f63228a.toString());
            }
            throw new JsonIOException("Invalid EnumSet type: " + this.f63228a.toString());
        }
    }

    /* loaded from: classes4.dex */
    public class k implements zm.i<T> {
        public k() {
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [T, java.util.LinkedHashSet] */
        @Override // zm.i
        public T a() {
            return new LinkedHashSet();
        }
    }

    /* loaded from: classes4.dex */
    public class l implements zm.i<T> {
        public l() {
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [T, java.util.ArrayDeque] */
        @Override // zm.i
        public T a() {
            return new ArrayDeque();
        }
    }

    /* loaded from: classes4.dex */
    public class m implements zm.i<T> {
        public m() {
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [T, java.util.ArrayList] */
        @Override // zm.i
        public T a() {
            return new ArrayList();
        }
    }

    /* loaded from: classes4.dex */
    public class n implements zm.i<T> {
        public n() {
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.util.concurrent.ConcurrentSkipListMap, T] */
        @Override // zm.i
        public T a() {
            return new ConcurrentSkipListMap();
        }
    }

    public c(Map<Type, xm.g<?>> map) {
        this.f63209a = map;
    }

    public <T> zm.i<T> a(en.a<T> aVar) {
        Type type = aVar.getType();
        Class<? super T> rawType = aVar.getRawType();
        xm.g<?> gVar = this.f63209a.get(type);
        if (gVar != null) {
            return new f(gVar, type);
        }
        xm.g<?> gVar2 = this.f63209a.get(rawType);
        if (gVar2 != null) {
            return new g(gVar2, type);
        }
        zm.i<T> b10 = b(rawType);
        if (b10 != null) {
            return b10;
        }
        zm.i<T> c10 = c(type, rawType);
        return c10 != null ? c10 : d(type, rawType);
    }

    public final <T> zm.i<T> b(Class<? super T> cls) {
        try {
            Constructor<? super T> declaredConstructor = cls.getDeclaredConstructor(new Class[0]);
            if (!declaredConstructor.isAccessible()) {
                this.f63210b.b(declaredConstructor);
            }
            return new h(declaredConstructor);
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    public final <T> zm.i<T> c(Type type, Class<? super T> cls) {
        if (Collection.class.isAssignableFrom(cls)) {
            if (SortedSet.class.isAssignableFrom(cls)) {
                return new i();
            }
            if (EnumSet.class.isAssignableFrom(cls)) {
                return new j(type);
            }
            if (Set.class.isAssignableFrom(cls)) {
                return new k();
            }
            if (Queue.class.isAssignableFrom(cls)) {
                return new l();
            }
            return new m();
        } else if (Map.class.isAssignableFrom(cls)) {
            if (ConcurrentNavigableMap.class.isAssignableFrom(cls)) {
                return new n();
            }
            if (ConcurrentMap.class.isAssignableFrom(cls)) {
                return new a();
            }
            if (SortedMap.class.isAssignableFrom(cls)) {
                return new b();
            }
            if ((type instanceof ParameterizedType) && !String.class.isAssignableFrom(en.a.get(((ParameterizedType) type).getActualTypeArguments()[0]).getRawType())) {
                return new C1100c();
            }
            return new d();
        } else {
            return null;
        }
    }

    public final <T> zm.i<T> d(Type type, Class<? super T> cls) {
        return new e(cls, type);
    }

    public String toString() {
        return this.f63209a.toString();
    }
}
