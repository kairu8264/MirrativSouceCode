package v0;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
public final class w {

    /* renamed from: a  reason: collision with root package name */
    public final io.l<io.a<wn.v>, wn.v> f56538a;

    /* renamed from: b  reason: collision with root package name */
    public final io.p<Set<? extends Object>, h, wn.v> f56539b;

    /* renamed from: c  reason: collision with root package name */
    public final io.l<Object, wn.v> f56540c;

    /* renamed from: d  reason: collision with root package name */
    public final m0.e<a<?>> f56541d;

    /* renamed from: e  reason: collision with root package name */
    public f f56542e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f56543f;

    /* renamed from: g  reason: collision with root package name */
    public a<?> f56544g;

    /* loaded from: classes.dex */
    public static final class a<T> {

        /* renamed from: a  reason: collision with root package name */
        public final io.l<T, wn.v> f56545a;

        /* renamed from: b  reason: collision with root package name */
        public final m0.d<T> f56546b;

        /* renamed from: c  reason: collision with root package name */
        public final HashSet<Object> f56547c;

        /* renamed from: d  reason: collision with root package name */
        public T f56548d;

        /* JADX WARN: Multi-variable type inference failed */
        public a(io.l<? super T, wn.v> lVar) {
            jo.p.h(lVar, "onChanged");
            this.f56545a = lVar;
            this.f56546b = new m0.d<>();
            this.f56547c = new HashSet<>();
        }

        public final void a(Object obj) {
            jo.p.h(obj, "value");
            m0.d<T> dVar = this.f56546b;
            T t10 = this.f56548d;
            jo.p.e(t10);
            dVar.c(obj, t10);
        }

        public final void b(Collection<? extends Object> collection) {
            jo.p.h(collection, "scopes");
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                this.f56545a.invoke(it.next());
            }
        }

        public final T c() {
            return this.f56548d;
        }

        public final HashSet<Object> d() {
            return this.f56547c;
        }

        public final m0.d<T> e() {
            return this.f56546b;
        }

        public final io.l<T, wn.v> f() {
            return this.f56545a;
        }

        public final void g(T t10) {
            this.f56548d = t10;
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends jo.q implements io.p<Set<? extends Object>, h, wn.v> {

        /* loaded from: classes.dex */
        public static final class a extends jo.q implements io.a<wn.v> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ w f56550w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(w wVar) {
                super(0);
                this.f56550w = wVar;
            }

            public final void a() {
                this.f56550w.f();
            }

            @Override // io.a
            public /* bridge */ /* synthetic */ wn.v invoke() {
                a();
                return wn.v.f59242a;
            }
        }

        public b() {
            super(2);
        }

        public final void a(Set<? extends Object> set, h hVar) {
            int i10;
            int f10;
            m0.c<Object> o10;
            jo.p.h(set, "applied");
            jo.p.h(hVar, "<anonymous parameter 1>");
            m0.e eVar = w.this.f56541d;
            w wVar = w.this;
            synchronized (eVar) {
                m0.e eVar2 = wVar.f56541d;
                int p10 = eVar2.p();
                i10 = 0;
                if (p10 > 0) {
                    Object[] n10 = eVar2.n();
                    int i11 = 0;
                    do {
                        a aVar = (a) n10[i10];
                        HashSet<Object> d10 = aVar.d();
                        m0.d e10 = aVar.e();
                        for (Object obj : set) {
                            f10 = e10.f(obj);
                            if (f10 >= 0) {
                                o10 = e10.o(f10);
                                for (Object obj2 : o10) {
                                    d10.add(obj2);
                                    i11 = 1;
                                }
                            }
                        }
                        i10++;
                    } while (i10 < p10);
                    i10 = i11;
                }
                wn.v vVar = wn.v.f59242a;
            }
            if (i10 != 0) {
                w.this.f56538a.invoke(new a(w.this));
            }
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ wn.v invoke(Set<? extends Object> set, h hVar) {
            a(set, hVar);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends jo.q implements io.l<Object, wn.v> {
        public c() {
            super(1);
        }

        public final void a(Object obj) {
            jo.p.h(obj, "state");
            if (w.this.f56543f) {
                return;
            }
            m0.e eVar = w.this.f56541d;
            w wVar = w.this;
            synchronized (eVar) {
                a aVar = wVar.f56544g;
                jo.p.e(aVar);
                aVar.a(obj);
                wn.v vVar = wn.v.f59242a;
            }
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(Object obj) {
            a(obj);
            return wn.v.f59242a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public w(io.l<? super io.a<wn.v>, wn.v> lVar) {
        jo.p.h(lVar, "onChangedExecutor");
        this.f56538a = lVar;
        this.f56539b = new b();
        this.f56540c = new c();
        this.f56541d = new m0.e<>(new a[16], 0);
    }

    public final void f() {
        m0.e<a<?>> eVar = this.f56541d;
        int p10 = eVar.p();
        if (p10 > 0) {
            int i10 = 0;
            a<?>[] n10 = eVar.n();
            do {
                a<?> aVar = n10[i10];
                HashSet<Object> d10 = aVar.d();
                if (!d10.isEmpty()) {
                    aVar.b(d10);
                    d10.clear();
                }
                i10++;
            } while (i10 < p10);
        }
    }

    public final void g() {
        synchronized (this.f56541d) {
            m0.e<a<?>> eVar = this.f56541d;
            int p10 = eVar.p();
            if (p10 > 0) {
                int i10 = 0;
                a<?>[] n10 = eVar.n();
                do {
                    n10[i10].e().d();
                    i10++;
                } while (i10 < p10);
                wn.v vVar = wn.v.f59242a;
            } else {
                wn.v vVar2 = wn.v.f59242a;
            }
        }
    }

    public final void h(io.l<Object, Boolean> lVar) {
        jo.p.h(lVar, "predicate");
        synchronized (this.f56541d) {
            m0.e<a<?>> eVar = this.f56541d;
            int p10 = eVar.p();
            if (p10 > 0) {
                a<?>[] n10 = eVar.n();
                int i10 = 0;
                do {
                    m0.d<?> e10 = n10[i10].e();
                    int j10 = e10.j();
                    int i11 = 0;
                    for (int i12 = 0; i12 < j10; i12++) {
                        int i13 = e10.k()[i12];
                        m0.c<?> cVar = e10.i()[i13];
                        jo.p.e(cVar);
                        int size = cVar.size();
                        int i14 = 0;
                        for (int i15 = 0; i15 < size; i15++) {
                            Object obj = cVar.j()[i15];
                            if (obj != null) {
                                if (!lVar.invoke(obj).booleanValue()) {
                                    if (i14 != i15) {
                                        cVar.j()[i14] = obj;
                                    }
                                    i14++;
                                }
                            } else {
                                throw new NullPointerException("null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                            }
                        }
                        int size2 = cVar.size();
                        for (int i16 = i14; i16 < size2; i16++) {
                            cVar.j()[i16] = null;
                        }
                        cVar.m(i14);
                        if (cVar.size() > 0) {
                            if (i11 != i12) {
                                int i17 = e10.k()[i11];
                                e10.k()[i11] = i13;
                                e10.k()[i12] = i17;
                            }
                            i11++;
                        }
                    }
                    int j11 = e10.j();
                    for (int i18 = i11; i18 < j11; i18++) {
                        e10.l()[e10.k()[i18]] = null;
                    }
                    e10.p(i11);
                    i10++;
                } while (i10 < p10);
                wn.v vVar = wn.v.f59242a;
            } else {
                wn.v vVar2 = wn.v.f59242a;
            }
        }
    }

    public final <T> a<T> i(io.l<? super T, wn.v> lVar) {
        int i10;
        m0.e<a<?>> eVar = this.f56541d;
        int p10 = eVar.p();
        if (p10 > 0) {
            a<?>[] n10 = eVar.n();
            i10 = 0;
            do {
                if (n10[i10].f() == lVar) {
                    break;
                }
                i10++;
            } while (i10 < p10);
            i10 = -1;
        } else {
            i10 = -1;
        }
        if (i10 == -1) {
            a<T> aVar = new a<>(lVar);
            this.f56541d.c(aVar);
            return aVar;
        }
        return (a<T>) this.f56541d.n()[i10];
    }

    public final <T> void j(T t10, io.l<? super T, wn.v> lVar, io.a<wn.v> aVar) {
        a<?> i10;
        jo.p.h(t10, "scope");
        jo.p.h(lVar, "onValueChangedForScope");
        jo.p.h(aVar, "block");
        a<?> aVar2 = this.f56544g;
        boolean z10 = this.f56543f;
        synchronized (this.f56541d) {
            i10 = i(lVar);
            i10.e().n(t10);
        }
        Object c10 = i10.c();
        i10.g(t10);
        this.f56544g = i10;
        this.f56543f = false;
        h.f56484e.d(this.f56540c, null, aVar);
        this.f56544g = aVar2;
        i10.g(c10);
        this.f56543f = z10;
    }

    public final void k() {
        this.f56542e = h.f56484e.e(this.f56539b);
    }

    public final void l() {
        f fVar = this.f56542e;
        if (fVar != null) {
            fVar.dispose();
        }
    }
}
