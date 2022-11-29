package o7;

import com.bumptech.glide.Registry;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import o7.h;
import s7.n;

/* loaded from: classes.dex */
public final class g<Transcode> {

    /* renamed from: a  reason: collision with root package name */
    public final List<n.a<?>> f44145a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public final List<m7.e> f44146b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    public com.bumptech.glide.e f44147c;

    /* renamed from: d  reason: collision with root package name */
    public Object f44148d;

    /* renamed from: e  reason: collision with root package name */
    public int f44149e;

    /* renamed from: f  reason: collision with root package name */
    public int f44150f;

    /* renamed from: g  reason: collision with root package name */
    public Class<?> f44151g;

    /* renamed from: h  reason: collision with root package name */
    public h.e f44152h;

    /* renamed from: i  reason: collision with root package name */
    public m7.h f44153i;

    /* renamed from: j  reason: collision with root package name */
    public Map<Class<?>, m7.l<?>> f44154j;

    /* renamed from: k  reason: collision with root package name */
    public Class<Transcode> f44155k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f44156l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f44157m;

    /* renamed from: n  reason: collision with root package name */
    public m7.e f44158n;

    /* renamed from: o  reason: collision with root package name */
    public com.bumptech.glide.h f44159o;

    /* renamed from: p  reason: collision with root package name */
    public j f44160p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f44161q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f44162r;

    public void a() {
        this.f44147c = null;
        this.f44148d = null;
        this.f44158n = null;
        this.f44151g = null;
        this.f44155k = null;
        this.f44153i = null;
        this.f44159o = null;
        this.f44154j = null;
        this.f44160p = null;
        this.f44145a.clear();
        this.f44156l = false;
        this.f44146b.clear();
        this.f44157m = false;
    }

    public p7.b b() {
        return this.f44147c.b();
    }

    public List<m7.e> c() {
        if (!this.f44157m) {
            this.f44157m = true;
            this.f44146b.clear();
            List<n.a<?>> g10 = g();
            int size = g10.size();
            for (int i10 = 0; i10 < size; i10++) {
                n.a<?> aVar = g10.get(i10);
                if (!this.f44146b.contains(aVar.f52264a)) {
                    this.f44146b.add(aVar.f52264a);
                }
                for (int i11 = 0; i11 < aVar.f52265b.size(); i11++) {
                    if (!this.f44146b.contains(aVar.f52265b.get(i11))) {
                        this.f44146b.add(aVar.f52265b.get(i11));
                    }
                }
            }
        }
        return this.f44146b;
    }

    public q7.a d() {
        return this.f44152h.a();
    }

    public j e() {
        return this.f44160p;
    }

    public int f() {
        return this.f44150f;
    }

    public List<n.a<?>> g() {
        if (!this.f44156l) {
            this.f44156l = true;
            this.f44145a.clear();
            List i10 = this.f44147c.i().i(this.f44148d);
            int size = i10.size();
            for (int i11 = 0; i11 < size; i11++) {
                n.a<?> b10 = ((s7.n) i10.get(i11)).b(this.f44148d, this.f44149e, this.f44150f, this.f44153i);
                if (b10 != null) {
                    this.f44145a.add(b10);
                }
            }
        }
        return this.f44145a;
    }

    public <Data> s<Data, ?, Transcode> h(Class<Data> cls) {
        return this.f44147c.i().h(cls, this.f44151g, this.f44155k);
    }

    public Class<?> i() {
        return this.f44148d.getClass();
    }

    public List<s7.n<File, ?>> j(File file) throws Registry.NoModelLoaderAvailableException {
        return this.f44147c.i().i(file);
    }

    public m7.h k() {
        return this.f44153i;
    }

    public com.bumptech.glide.h l() {
        return this.f44159o;
    }

    public List<Class<?>> m() {
        return this.f44147c.i().j(this.f44148d.getClass(), this.f44151g, this.f44155k);
    }

    public <Z> m7.k<Z> n(u<Z> uVar) {
        return this.f44147c.i().k(uVar);
    }

    public m7.e o() {
        return this.f44158n;
    }

    public <X> m7.d<X> p(X x10) throws Registry.NoSourceEncoderAvailableException {
        return this.f44147c.i().m(x10);
    }

    public Class<?> q() {
        return (Class<Transcode>) this.f44155k;
    }

    public <Z> m7.l<Z> r(Class<Z> cls) {
        m7.l<Z> lVar = (m7.l<Z>) this.f44154j.get(cls);
        if (lVar == null) {
            Iterator<Map.Entry<Class<?>, m7.l<?>>> it = this.f44154j.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry<Class<?>, m7.l<?>> next = it.next();
                if (next.getKey().isAssignableFrom(cls)) {
                    lVar = (m7.l<Z>) next.getValue();
                    break;
                }
            }
        }
        if (lVar == null) {
            if (this.f44154j.isEmpty() && this.f44161q) {
                throw new IllegalArgumentException("Missing transformation for " + cls + ". If you wish to ignore unknown resource types, use the optional transformation methods.");
            }
            return u7.c.c();
        }
        return lVar;
    }

    public int s() {
        return this.f44149e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean t(Class<?> cls) {
        return h(cls) != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <R> void u(com.bumptech.glide.e eVar, Object obj, m7.e eVar2, int i10, int i11, j jVar, Class<?> cls, Class<R> cls2, com.bumptech.glide.h hVar, m7.h hVar2, Map<Class<?>, m7.l<?>> map, boolean z10, boolean z11, h.e eVar3) {
        this.f44147c = eVar;
        this.f44148d = obj;
        this.f44158n = eVar2;
        this.f44149e = i10;
        this.f44150f = i11;
        this.f44160p = jVar;
        this.f44151g = cls;
        this.f44152h = eVar3;
        this.f44155k = cls2;
        this.f44159o = hVar;
        this.f44153i = hVar2;
        this.f44154j = map;
        this.f44161q = z10;
        this.f44162r = z11;
    }

    public boolean v(u<?> uVar) {
        return this.f44147c.i().n(uVar);
    }

    public boolean w() {
        return this.f44162r;
    }

    public boolean x(m7.e eVar) {
        List<n.a<?>> g10 = g();
        int size = g10.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (g10.get(i10).f52264a.equals(eVar)) {
                return true;
            }
        }
        return false;
    }
}
