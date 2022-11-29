package l0;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import v0.h;

/* loaded from: classes.dex */
public final class w<T> implements v0.c0, x<T> {

    /* renamed from: w  reason: collision with root package name */
    public final io.a<T> f39289w;

    /* renamed from: x  reason: collision with root package name */
    public a<T> f39290x;

    /* loaded from: classes.dex */
    public static final class a<T> extends v0.d0 {

        /* renamed from: f  reason: collision with root package name */
        public static final C0556a f39291f = new C0556a(null);

        /* renamed from: g  reason: collision with root package name */
        public static final Object f39292g = new Object();

        /* renamed from: c  reason: collision with root package name */
        public HashSet<v0.c0> f39293c;

        /* renamed from: d  reason: collision with root package name */
        public Object f39294d = f39292g;

        /* renamed from: e  reason: collision with root package name */
        public int f39295e;

        /* renamed from: l0.w$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0556a {
            public C0556a() {
            }

            public /* synthetic */ C0556a(jo.h hVar) {
                this();
            }
        }

        @Override // v0.d0
        public void a(v0.d0 d0Var) {
            jo.p.h(d0Var, "value");
            a aVar = (a) d0Var;
            this.f39293c = aVar.f39293c;
            this.f39294d = aVar.f39294d;
            this.f39295e = aVar.f39295e;
        }

        @Override // v0.d0
        public v0.d0 b() {
            return new a();
        }

        public final HashSet<v0.c0> g() {
            return this.f39293c;
        }

        public final Object h() {
            return this.f39294d;
        }

        public final boolean i(x<?> xVar, v0.h hVar) {
            jo.p.h(xVar, "derivedState");
            jo.p.h(hVar, "snapshot");
            return this.f39294d != f39292g && this.f39295e == j(xVar, hVar);
        }

        public final int j(x<?> xVar, v0.h hVar) {
            HashSet<v0.c0> hashSet;
            a2 a2Var;
            jo.p.h(xVar, "derivedState");
            jo.p.h(hVar, "snapshot");
            synchronized (v0.m.C()) {
                hashSet = this.f39293c;
            }
            int i10 = 7;
            if (hashSet != null) {
                a2Var = v1.f39287a;
                n0.e eVar = (n0.e) a2Var.a();
                if (eVar == null) {
                    eVar = n0.a.b();
                }
                int size = eVar.size();
                int i11 = 0;
                for (int i12 = 0; i12 < size; i12++) {
                    ((io.l) ((wn.k) eVar.get(i12)).a()).invoke(xVar);
                }
                try {
                    Iterator<v0.c0> it = hashSet.iterator();
                    while (it.hasNext()) {
                        v0.c0 next = it.next();
                        v0.d0 d10 = next.d();
                        jo.p.g(next, "stateObject");
                        v0.d0 P = v0.m.P(d10, next, hVar);
                        i10 = (((i10 * 31) + c.a(P)) * 31) + P.d();
                    }
                    wn.v vVar = wn.v.f59242a;
                } finally {
                    int size2 = eVar.size();
                    while (i11 < size2) {
                        ((io.l) ((wn.k) eVar.get(i11)).b()).invoke(xVar);
                        i11++;
                    }
                }
            }
            return i10;
        }

        public final void k(HashSet<v0.c0> hashSet) {
            this.f39293c = hashSet;
        }

        public final void l(Object obj) {
            this.f39294d = obj;
        }

        public final void m(int i10) {
            this.f39295e = i10;
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends jo.q implements io.l<Object, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ w<T> f39296w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ HashSet<v0.c0> f39297x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(w<T> wVar, HashSet<v0.c0> hashSet) {
            super(1);
            this.f39296w = wVar;
            this.f39297x = hashSet;
        }

        public final void a(Object obj) {
            jo.p.h(obj, "it");
            if (obj != this.f39296w) {
                if (obj instanceof v0.c0) {
                    this.f39297x.add(obj);
                    return;
                }
                return;
            }
            throw new IllegalStateException("A derived state calculation cannot read itself".toString());
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(Object obj) {
            a(obj);
            return wn.v.f59242a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public w(io.a<? extends T> aVar) {
        jo.p.h(aVar, "calculation");
        this.f39289w = aVar;
        this.f39290x = new a<>();
    }

    @Override // l0.x
    public T c() {
        a<T> aVar = this.f39290x;
        h.a aVar2 = v0.h.f56484e;
        return (T) p((a) v0.m.A(aVar, aVar2.b()), aVar2.b(), this.f39289w).h();
    }

    @Override // v0.c0
    public v0.d0 d() {
        return this.f39290x;
    }

    @Override // l0.c2
    public T getValue() {
        io.l<Object, wn.v> h10 = v0.h.f56484e.b().h();
        if (h10 != null) {
            h10.invoke(this);
        }
        return c();
    }

    @Override // v0.c0
    public void j(v0.d0 d0Var) {
        jo.p.h(d0Var, "value");
        this.f39290x = (a) d0Var;
    }

    @Override // l0.x
    public Set<v0.c0> m() {
        a<T> aVar = this.f39290x;
        h.a aVar2 = v0.h.f56484e;
        HashSet<v0.c0> g10 = p((a) v0.m.A(aVar, aVar2.b()), aVar2.b(), this.f39289w).g();
        return g10 != null ? g10 : xn.t0.b();
    }

    public final a<T> p(a<T> aVar, v0.h hVar, io.a<? extends T> aVar2) {
        a2 a2Var;
        a2 a2Var2;
        a2 a2Var3;
        h.a aVar3;
        a<T> aVar4;
        a2 a2Var4;
        if (aVar.i(this, hVar)) {
            return aVar;
        }
        a2Var = v1.f39288b;
        Boolean bool = (Boolean) a2Var.a();
        int i10 = 0;
        boolean booleanValue = bool != null ? bool.booleanValue() : false;
        HashSet<v0.c0> hashSet = new HashSet<>();
        a2Var2 = v1.f39287a;
        n0.e eVar = (n0.e) a2Var2.a();
        if (eVar == null) {
            eVar = n0.a.b();
        }
        int size = eVar.size();
        for (int i11 = 0; i11 < size; i11++) {
            ((io.l) ((wn.k) eVar.get(i11)).a()).invoke(this);
        }
        if (!booleanValue) {
            try {
                a2Var3 = v1.f39288b;
                a2Var3.b(Boolean.TRUE);
            } finally {
                int size2 = eVar.size();
                while (i10 < size2) {
                    ((io.l) ((wn.k) eVar.get(i10)).b()).invoke(this);
                    i10++;
                }
            }
        }
        Object d10 = v0.h.f56484e.d(new b(this, hashSet), null, aVar2);
        if (!booleanValue) {
            a2Var4 = v1.f39288b;
            a2Var4.b(Boolean.FALSE);
        }
        synchronized (v0.m.C()) {
            aVar3 = v0.h.f56484e;
            v0.h b10 = aVar3.b();
            aVar4 = (a) v0.m.I(this.f39290x, this, b10);
            aVar4.k(hashSet);
            aVar4.m(aVar4.j(this, b10));
            aVar4.l(d10);
        }
        if (!booleanValue) {
            aVar3.c();
        }
        return aVar4;
    }

    public final String q() {
        a<T> aVar = this.f39290x;
        h.a aVar2 = v0.h.f56484e;
        a aVar3 = (a) v0.m.A(aVar, aVar2.b());
        return aVar3.i(this, aVar2.b()) ? String.valueOf(aVar3.h()) : "<Not calculated>";
    }

    public String toString() {
        a aVar = (a) v0.m.A(this.f39290x, v0.h.f56484e.b());
        return "DerivedState(value=" + q() + ")@" + hashCode();
    }
}
