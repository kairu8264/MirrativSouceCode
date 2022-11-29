package vk;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public final class d<T> {

    /* renamed from: a  reason: collision with root package name */
    public final Set<Class<? super T>> f57421a;

    /* renamed from: b  reason: collision with root package name */
    public final Set<q> f57422b;

    /* renamed from: c  reason: collision with root package name */
    public final int f57423c;

    /* renamed from: d  reason: collision with root package name */
    public final int f57424d;

    /* renamed from: e  reason: collision with root package name */
    public final h<T> f57425e;

    /* renamed from: f  reason: collision with root package name */
    public final Set<Class<?>> f57426f;

    /* loaded from: classes.dex */
    public static class b<T> {

        /* renamed from: a  reason: collision with root package name */
        public final Set<Class<? super T>> f57427a;

        /* renamed from: b  reason: collision with root package name */
        public final Set<q> f57428b;

        /* renamed from: c  reason: collision with root package name */
        public int f57429c;

        /* renamed from: d  reason: collision with root package name */
        public int f57430d;

        /* renamed from: e  reason: collision with root package name */
        public h<T> f57431e;

        /* renamed from: f  reason: collision with root package name */
        public Set<Class<?>> f57432f;

        public b<T> b(q qVar) {
            z.c(qVar, "Null dependency");
            i(qVar.c());
            this.f57428b.add(qVar);
            return this;
        }

        public b<T> c() {
            return h(1);
        }

        public d<T> d() {
            z.d(this.f57431e != null, "Missing required property: factory.");
            return new d<>(new HashSet(this.f57427a), new HashSet(this.f57428b), this.f57429c, this.f57430d, this.f57431e, this.f57432f);
        }

        public b<T> e() {
            return h(2);
        }

        public b<T> f(h<T> hVar) {
            this.f57431e = (h) z.c(hVar, "Null factory");
            return this;
        }

        public final b<T> g() {
            this.f57430d = 1;
            return this;
        }

        public final b<T> h(int i10) {
            z.d(this.f57429c == 0, "Instantiation type has already been set.");
            this.f57429c = i10;
            return this;
        }

        public final void i(Class<?> cls) {
            z.a(!this.f57427a.contains(cls), "Components are not allowed to depend on interfaces they themselves provide.");
        }

        @SafeVarargs
        public b(Class<T> cls, Class<? super T>... clsArr) {
            HashSet hashSet = new HashSet();
            this.f57427a = hashSet;
            this.f57428b = new HashSet();
            this.f57429c = 0;
            this.f57430d = 0;
            this.f57432f = new HashSet();
            z.c(cls, "Null interface");
            hashSet.add(cls);
            for (Class<? super T> cls2 : clsArr) {
                z.c(cls2, "Null interface");
            }
            Collections.addAll(this.f57427a, clsArr);
        }
    }

    public static <T> b<T> c(Class<T> cls) {
        return new b<>(cls, new Class[0]);
    }

    @SafeVarargs
    public static <T> b<T> d(Class<T> cls, Class<? super T>... clsArr) {
        return new b<>(cls, clsArr);
    }

    public static <T> d<T> i(final T t10, Class<T> cls) {
        return j(cls).f(new h() { // from class: vk.b
            @Override // vk.h
            public final Object a(e eVar) {
                Object n10;
                n10 = d.n(t10, eVar);
                return n10;
            }
        }).d();
    }

    public static <T> b<T> j(Class<T> cls) {
        return c(cls).g();
    }

    public static /* synthetic */ Object n(Object obj, e eVar) {
        return obj;
    }

    public static /* synthetic */ Object o(Object obj, e eVar) {
        return obj;
    }

    @SafeVarargs
    public static <T> d<T> p(final T t10, Class<T> cls, Class<? super T>... clsArr) {
        return d(cls, clsArr).f(new h() { // from class: vk.c
            @Override // vk.h
            public final Object a(e eVar) {
                Object o10;
                o10 = d.o(t10, eVar);
                return o10;
            }
        }).d();
    }

    public Set<q> e() {
        return this.f57422b;
    }

    public h<T> f() {
        return this.f57425e;
    }

    public Set<Class<? super T>> g() {
        return this.f57421a;
    }

    public Set<Class<?>> h() {
        return this.f57426f;
    }

    public boolean k() {
        return this.f57423c == 1;
    }

    public boolean l() {
        return this.f57423c == 2;
    }

    public boolean m() {
        return this.f57424d == 0;
    }

    public String toString() {
        return "Component<" + Arrays.toString(this.f57421a.toArray()) + ">{" + this.f57423c + ", type=" + this.f57424d + ", deps=" + Arrays.toString(this.f57422b.toArray()) + "}";
    }

    public d(Set<Class<? super T>> set, Set<q> set2, int i10, int i11, h<T> hVar, Set<Class<?>> set3) {
        this.f57421a = Collections.unmodifiableSet(set);
        this.f57422b = Collections.unmodifiableSet(set2);
        this.f57423c = i10;
        this.f57424d = i11;
        this.f57425e = hVar;
        this.f57426f = Collections.unmodifiableSet(set3);
    }
}
