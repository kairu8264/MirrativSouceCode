package p7;

import android.util.Log;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

/* loaded from: classes.dex */
public final class j implements p7.b {

    /* renamed from: a  reason: collision with root package name */
    public final h<a, Object> f46186a = new h<>();

    /* renamed from: b  reason: collision with root package name */
    public final b f46187b = new b();

    /* renamed from: c  reason: collision with root package name */
    public final Map<Class<?>, NavigableMap<Integer, Integer>> f46188c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    public final Map<Class<?>, p7.a<?>> f46189d = new HashMap();

    /* renamed from: e  reason: collision with root package name */
    public final int f46190e;

    /* renamed from: f  reason: collision with root package name */
    public int f46191f;

    /* loaded from: classes.dex */
    public static final class a implements m {

        /* renamed from: a  reason: collision with root package name */
        public final b f46192a;

        /* renamed from: b  reason: collision with root package name */
        public int f46193b;

        /* renamed from: c  reason: collision with root package name */
        public Class<?> f46194c;

        public a(b bVar) {
            this.f46192a = bVar;
        }

        @Override // p7.m
        public void a() {
            this.f46192a.c(this);
        }

        public void b(int i10, Class<?> cls) {
            this.f46193b = i10;
            this.f46194c = cls;
        }

        public boolean equals(Object obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                return this.f46193b == aVar.f46193b && this.f46194c == aVar.f46194c;
            }
            return false;
        }

        public int hashCode() {
            int i10 = this.f46193b * 31;
            Class<?> cls = this.f46194c;
            return i10 + (cls != null ? cls.hashCode() : 0);
        }

        public String toString() {
            return "Key{size=" + this.f46193b + "array=" + this.f46194c + '}';
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends d<a> {
        @Override // p7.d
        /* renamed from: d */
        public a a() {
            return new a(this);
        }

        public a e(int i10, Class<?> cls) {
            a b10 = b();
            b10.b(i10, cls);
            return b10;
        }
    }

    public j(int i10) {
        this.f46190e = i10;
    }

    @Override // p7.b
    public synchronized void a(int i10) {
        try {
            if (i10 >= 40) {
                b();
            } else if (i10 >= 20 || i10 == 15) {
                i(this.f46190e / 2);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // p7.b
    public synchronized void b() {
        i(0);
    }

    @Override // p7.b
    public synchronized <T> T c(int i10, Class<T> cls) {
        a e10;
        Integer ceilingKey = n(cls).ceilingKey(Integer.valueOf(i10));
        if (q(i10, ceilingKey)) {
            e10 = this.f46187b.e(ceilingKey.intValue(), cls);
        } else {
            e10 = this.f46187b.e(i10, cls);
        }
        return (T) m(e10, cls);
    }

    @Override // p7.b
    public synchronized <T> T d(int i10, Class<T> cls) {
        return (T) m(this.f46187b.e(i10, cls), cls);
    }

    @Override // p7.b
    public synchronized <T> void e(T t10) {
        Class<?> cls = t10.getClass();
        p7.a<T> k10 = k(cls);
        int b10 = k10.b(t10);
        int a10 = k10.a() * b10;
        if (p(a10)) {
            a e10 = this.f46187b.e(b10, cls);
            this.f46186a.d(e10, t10);
            NavigableMap<Integer, Integer> n10 = n(cls);
            Integer num = (Integer) n10.get(Integer.valueOf(e10.f46193b));
            Integer valueOf = Integer.valueOf(e10.f46193b);
            int i10 = 1;
            if (num != null) {
                i10 = 1 + num.intValue();
            }
            n10.put(valueOf, Integer.valueOf(i10));
            this.f46191f += a10;
            h();
        }
    }

    @Override // p7.b
    @Deprecated
    public <T> void f(T t10, Class<T> cls) {
        e(t10);
    }

    public final void g(int i10, Class<?> cls) {
        NavigableMap<Integer, Integer> n10 = n(cls);
        Integer num = (Integer) n10.get(Integer.valueOf(i10));
        if (num != null) {
            if (num.intValue() == 1) {
                n10.remove(Integer.valueOf(i10));
                return;
            } else {
                n10.put(Integer.valueOf(i10), Integer.valueOf(num.intValue() - 1));
                return;
            }
        }
        throw new NullPointerException("Tried to decrement empty size, size: " + i10 + ", this: " + this);
    }

    public final void h() {
        i(this.f46190e);
    }

    public final void i(int i10) {
        while (this.f46191f > i10) {
            Object f10 = this.f46186a.f();
            i8.j.d(f10);
            p7.a j10 = j(f10);
            this.f46191f -= j10.b(f10) * j10.a();
            g(j10.b(f10), f10.getClass());
            if (Log.isLoggable(j10.getTag(), 2)) {
                Log.v(j10.getTag(), "evicted: " + j10.b(f10));
            }
        }
    }

    public final <T> p7.a<T> j(T t10) {
        return k(t10.getClass());
    }

    public final <T> p7.a<T> k(Class<T> cls) {
        i iVar = (p7.a<T>) this.f46189d.get(cls);
        if (iVar == null) {
            if (cls.equals(int[].class)) {
                iVar = new i();
            } else if (cls.equals(byte[].class)) {
                iVar = new g();
            } else {
                throw new IllegalArgumentException("No array pool found for: " + cls.getSimpleName());
            }
            this.f46189d.put(cls, iVar);
        }
        return iVar;
    }

    public final <T> T l(a aVar) {
        return (T) this.f46186a.a(aVar);
    }

    public final <T> T m(a aVar, Class<T> cls) {
        p7.a<T> k10 = k(cls);
        T t10 = (T) l(aVar);
        if (t10 != null) {
            this.f46191f -= k10.b(t10) * k10.a();
            g(k10.b(t10), cls);
        }
        if (t10 == null) {
            if (Log.isLoggable(k10.getTag(), 2)) {
                Log.v(k10.getTag(), "Allocated " + aVar.f46193b + " bytes");
            }
            return k10.newArray(aVar.f46193b);
        }
        return t10;
    }

    public final NavigableMap<Integer, Integer> n(Class<?> cls) {
        NavigableMap<Integer, Integer> navigableMap = this.f46188c.get(cls);
        if (navigableMap == null) {
            TreeMap treeMap = new TreeMap();
            this.f46188c.put(cls, treeMap);
            return treeMap;
        }
        return navigableMap;
    }

    public final boolean o() {
        int i10 = this.f46191f;
        return i10 == 0 || this.f46190e / i10 >= 2;
    }

    public final boolean p(int i10) {
        return i10 <= this.f46190e / 2;
    }

    public final boolean q(int i10, Integer num) {
        return num != null && (o() || num.intValue() <= i10 * 8);
    }
}
