package o7;

import android.util.Log;
import j8.a;
import java.util.Map;
import java.util.concurrent.Executor;
import o7.h;
import o7.p;
import q7.a;
import q7.h;

/* loaded from: classes.dex */
public class k implements m, h.a, p.a {

    /* renamed from: i  reason: collision with root package name */
    public static final boolean f44190i = Log.isLoggable("Engine", 2);

    /* renamed from: a  reason: collision with root package name */
    public final r f44191a;

    /* renamed from: b  reason: collision with root package name */
    public final o f44192b;

    /* renamed from: c  reason: collision with root package name */
    public final q7.h f44193c;

    /* renamed from: d  reason: collision with root package name */
    public final b f44194d;

    /* renamed from: e  reason: collision with root package name */
    public final x f44195e;

    /* renamed from: f  reason: collision with root package name */
    public final c f44196f;

    /* renamed from: g  reason: collision with root package name */
    public final a f44197g;

    /* renamed from: h  reason: collision with root package name */
    public final o7.a f44198h;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final h.e f44199a;

        /* renamed from: b  reason: collision with root package name */
        public final n3.e<h<?>> f44200b = j8.a.d(150, new C0660a());

        /* renamed from: c  reason: collision with root package name */
        public int f44201c;

        /* renamed from: o7.k$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class C0660a implements a.d<h<?>> {
            public C0660a() {
            }

            @Override // j8.a.d
            /* renamed from: a */
            public h<?> create() {
                a aVar = a.this;
                return new h<>(aVar.f44199a, aVar.f44200b);
            }
        }

        public a(h.e eVar) {
            this.f44199a = eVar;
        }

        public <R> h<R> a(com.bumptech.glide.e eVar, Object obj, n nVar, m7.e eVar2, int i10, int i11, Class<?> cls, Class<R> cls2, com.bumptech.glide.h hVar, j jVar, Map<Class<?>, m7.l<?>> map, boolean z10, boolean z11, boolean z12, m7.h hVar2, h.b<R> bVar) {
            h hVar3 = (h) i8.j.d(this.f44200b.acquire());
            int i12 = this.f44201c;
            this.f44201c = i12 + 1;
            return hVar3.t(eVar, obj, nVar, eVar2, i10, i11, cls, cls2, hVar, jVar, map, z10, z11, z12, hVar2, bVar, i12);
        }
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final r7.a f44203a;

        /* renamed from: b  reason: collision with root package name */
        public final r7.a f44204b;

        /* renamed from: c  reason: collision with root package name */
        public final r7.a f44205c;

        /* renamed from: d  reason: collision with root package name */
        public final r7.a f44206d;

        /* renamed from: e  reason: collision with root package name */
        public final m f44207e;

        /* renamed from: f  reason: collision with root package name */
        public final p.a f44208f;

        /* renamed from: g  reason: collision with root package name */
        public final n3.e<l<?>> f44209g = j8.a.d(150, new a());

        /* loaded from: classes.dex */
        public class a implements a.d<l<?>> {
            public a() {
            }

            @Override // j8.a.d
            /* renamed from: a */
            public l<?> create() {
                b bVar = b.this;
                return new l<>(bVar.f44203a, bVar.f44204b, bVar.f44205c, bVar.f44206d, bVar.f44207e, bVar.f44208f, bVar.f44209g);
            }
        }

        public b(r7.a aVar, r7.a aVar2, r7.a aVar3, r7.a aVar4, m mVar, p.a aVar5) {
            this.f44203a = aVar;
            this.f44204b = aVar2;
            this.f44205c = aVar3;
            this.f44206d = aVar4;
            this.f44207e = mVar;
            this.f44208f = aVar5;
        }

        public <R> l<R> a(m7.e eVar, boolean z10, boolean z11, boolean z12, boolean z13) {
            return ((l) i8.j.d(this.f44209g.acquire())).l(eVar, z10, z11, z12, z13);
        }

        public void b() {
            i8.e.c(this.f44203a);
            i8.e.c(this.f44204b);
            i8.e.c(this.f44205c);
            i8.e.c(this.f44206d);
        }
    }

    /* loaded from: classes.dex */
    public static class c implements h.e {

        /* renamed from: a  reason: collision with root package name */
        public final a.InterfaceC0736a f44211a;

        /* renamed from: b  reason: collision with root package name */
        public volatile q7.a f44212b;

        public c(a.InterfaceC0736a interfaceC0736a) {
            this.f44211a = interfaceC0736a;
        }

        @Override // o7.h.e
        public q7.a a() {
            if (this.f44212b == null) {
                synchronized (this) {
                    if (this.f44212b == null) {
                        this.f44212b = this.f44211a.a();
                    }
                    if (this.f44212b == null) {
                        this.f44212b = new q7.b();
                    }
                }
            }
            return this.f44212b;
        }

        public synchronized void b() {
            if (this.f44212b == null) {
                return;
            }
            this.f44212b.clear();
        }
    }

    /* loaded from: classes.dex */
    public class d {

        /* renamed from: a  reason: collision with root package name */
        public final l<?> f44213a;

        /* renamed from: b  reason: collision with root package name */
        public final e8.i f44214b;

        public d(e8.i iVar, l<?> lVar) {
            this.f44214b = iVar;
            this.f44213a = lVar;
        }

        public void a() {
            synchronized (k.this) {
                this.f44213a.r(this.f44214b);
            }
        }
    }

    public k(q7.h hVar, a.InterfaceC0736a interfaceC0736a, r7.a aVar, r7.a aVar2, r7.a aVar3, r7.a aVar4, boolean z10) {
        this(hVar, interfaceC0736a, aVar, aVar2, aVar3, aVar4, null, null, null, null, null, null, z10);
    }

    public static void j(String str, long j10, m7.e eVar) {
        Log.v("Engine", str + " in " + i8.f.a(j10) + "ms, key: " + eVar);
    }

    @Override // q7.h.a
    public void a(u<?> uVar) {
        this.f44195e.a(uVar, true);
    }

    @Override // o7.p.a
    public void b(m7.e eVar, p<?> pVar) {
        this.f44198h.d(eVar);
        if (pVar.f()) {
            this.f44193c.c(eVar, pVar);
        } else {
            this.f44195e.a(pVar, false);
        }
    }

    @Override // o7.m
    public synchronized void c(l<?> lVar, m7.e eVar) {
        this.f44191a.d(eVar, lVar);
    }

    @Override // o7.m
    public synchronized void d(l<?> lVar, m7.e eVar, p<?> pVar) {
        if (pVar != null) {
            if (pVar.f()) {
                this.f44198h.a(eVar, pVar);
            }
        }
        this.f44191a.d(eVar, lVar);
    }

    public final p<?> e(m7.e eVar) {
        u<?> d10 = this.f44193c.d(eVar);
        if (d10 == null) {
            return null;
        }
        if (d10 instanceof p) {
            return (p) d10;
        }
        return new p<>(d10, true, true, eVar, this);
    }

    public <R> d f(com.bumptech.glide.e eVar, Object obj, m7.e eVar2, int i10, int i11, Class<?> cls, Class<R> cls2, com.bumptech.glide.h hVar, j jVar, Map<Class<?>, m7.l<?>> map, boolean z10, boolean z11, m7.h hVar2, boolean z12, boolean z13, boolean z14, boolean z15, e8.i iVar, Executor executor) {
        long b10 = f44190i ? i8.f.b() : 0L;
        n a10 = this.f44192b.a(obj, eVar2, i10, i11, map, cls, cls2, hVar2);
        synchronized (this) {
            p<?> i12 = i(a10, z12, b10);
            if (i12 == null) {
                return m(eVar, obj, eVar2, i10, i11, cls, cls2, hVar, jVar, map, z10, z11, hVar2, z12, z13, z14, z15, iVar, executor, a10, b10);
            }
            iVar.b(i12, m7.a.MEMORY_CACHE, false);
            return null;
        }
    }

    public final p<?> g(m7.e eVar) {
        p<?> e10 = this.f44198h.e(eVar);
        if (e10 != null) {
            e10.b();
        }
        return e10;
    }

    public final p<?> h(m7.e eVar) {
        p<?> e10 = e(eVar);
        if (e10 != null) {
            e10.b();
            this.f44198h.a(eVar, e10);
        }
        return e10;
    }

    public final p<?> i(n nVar, boolean z10, long j10) {
        if (z10) {
            p<?> g10 = g(nVar);
            if (g10 != null) {
                if (f44190i) {
                    j("Loaded resource from active resources", j10, nVar);
                }
                return g10;
            }
            p<?> h10 = h(nVar);
            if (h10 != null) {
                if (f44190i) {
                    j("Loaded resource from cache", j10, nVar);
                }
                return h10;
            }
            return null;
        }
        return null;
    }

    public void k(u<?> uVar) {
        if (uVar instanceof p) {
            ((p) uVar).g();
            return;
        }
        throw new IllegalArgumentException("Cannot release anything but an EngineResource");
    }

    public void l() {
        this.f44194d.b();
        this.f44196f.b();
        this.f44198h.g();
    }

    public final <R> d m(com.bumptech.glide.e eVar, Object obj, m7.e eVar2, int i10, int i11, Class<?> cls, Class<R> cls2, com.bumptech.glide.h hVar, j jVar, Map<Class<?>, m7.l<?>> map, boolean z10, boolean z11, m7.h hVar2, boolean z12, boolean z13, boolean z14, boolean z15, e8.i iVar, Executor executor, n nVar, long j10) {
        l<?> a10 = this.f44191a.a(nVar, z15);
        if (a10 != null) {
            a10.d(iVar, executor);
            if (f44190i) {
                j("Added to existing load", j10, nVar);
            }
            return new d(iVar, a10);
        }
        l<R> a11 = this.f44194d.a(nVar, z12, z13, z14, z15);
        h<R> a12 = this.f44197g.a(eVar, obj, nVar, eVar2, i10, i11, cls, cls2, hVar, jVar, map, z10, z11, z15, hVar2, a11);
        this.f44191a.c(nVar, a11);
        a11.d(iVar, executor);
        a11.s(a12);
        if (f44190i) {
            j("Started new load", j10, nVar);
        }
        return new d(iVar, a11);
    }

    public k(q7.h hVar, a.InterfaceC0736a interfaceC0736a, r7.a aVar, r7.a aVar2, r7.a aVar3, r7.a aVar4, r rVar, o oVar, o7.a aVar5, b bVar, a aVar6, x xVar, boolean z10) {
        this.f44193c = hVar;
        c cVar = new c(interfaceC0736a);
        this.f44196f = cVar;
        o7.a aVar7 = aVar5 == null ? new o7.a(z10) : aVar5;
        this.f44198h = aVar7;
        aVar7.f(this);
        this.f44192b = oVar == null ? new o() : oVar;
        this.f44191a = rVar == null ? new r() : rVar;
        this.f44194d = bVar == null ? new b(aVar, aVar2, aVar3, aVar4, this, this) : bVar;
        this.f44197g = aVar6 == null ? new a(cVar) : aVar6;
        this.f44195e = xVar == null ? new x() : xVar;
        hVar.e(this);
    }
}
