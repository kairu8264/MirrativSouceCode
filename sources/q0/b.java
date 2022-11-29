package q0;

import java.util.Iterator;
import jo.h;
import jo.p;
import n0.g;
import p0.d;
import xn.i;

/* loaded from: classes.dex */
public final class b<E> extends i<E> implements g<E> {
    public static final a A = new a(null);
    public static final b B;

    /* renamed from: x  reason: collision with root package name */
    public final Object f48510x;

    /* renamed from: y  reason: collision with root package name */
    public final Object f48511y;

    /* renamed from: z  reason: collision with root package name */
    public final d<E, q0.a> f48512z;

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(h hVar) {
            this();
        }

        public final <E> g<E> a() {
            return b.B;
        }
    }

    static {
        r0.c cVar = r0.c.f49705a;
        B = new b(cVar, cVar, d.f45651z.a());
    }

    public b(Object obj, Object obj2, d<E, q0.a> dVar) {
        p.h(dVar, "hashMap");
        this.f48510x = obj;
        this.f48511y = obj2;
        this.f48512z = dVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xn.a, java.util.Collection, java.util.List, n0.e
    public g<E> add(E e10) {
        if (this.f48512z.containsKey(e10)) {
            return this;
        }
        if (isEmpty()) {
            return new b(e10, e10, this.f48512z.t(e10, new q0.a()));
        }
        Object obj = this.f48511y;
        q0.a aVar = this.f48512z.get(obj);
        p.e(aVar);
        return new b(this.f48510x, e10, this.f48512z.t(obj, aVar.e(e10)).t(e10, new q0.a(obj)));
    }

    @Override // xn.a, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return this.f48512z.containsKey(obj);
    }

    @Override // xn.a
    public int d() {
        return this.f48512z.size();
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<E> iterator() {
        return new c(this.f48510x, this.f48512z);
    }

    @Override // xn.a, java.util.Collection, java.util.List, n0.e
    public g<E> remove(E e10) {
        q0.a aVar = this.f48512z.get(e10);
        if (aVar == null) {
            return this;
        }
        d<E, q0.a> u10 = this.f48512z.u(e10);
        if (aVar.b()) {
            q0.a aVar2 = u10.get(aVar.d());
            p.e(aVar2);
            u10 = u10.t(aVar.d(), aVar2.e(aVar.c()));
        }
        if (aVar.a()) {
            q0.a aVar3 = u10.get(aVar.c());
            p.e(aVar3);
            u10 = u10.t(aVar.c(), aVar3.f(aVar.d()));
        }
        return new b(!aVar.b() ? aVar.c() : this.f48510x, !aVar.a() ? aVar.d() : this.f48511y, u10);
    }
}
