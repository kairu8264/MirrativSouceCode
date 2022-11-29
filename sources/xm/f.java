package xm;

import an.d;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public final class f {

    /* renamed from: h  reason: collision with root package name */
    public String f60406h;

    /* renamed from: a  reason: collision with root package name */
    public zm.d f60399a = zm.d.C;

    /* renamed from: b  reason: collision with root package name */
    public q f60400b = q.DEFAULT;

    /* renamed from: c  reason: collision with root package name */
    public d f60401c = c.IDENTITY;

    /* renamed from: d  reason: collision with root package name */
    public final Map<Type, g<?>> f60402d = new HashMap();

    /* renamed from: e  reason: collision with root package name */
    public final List<u> f60403e = new ArrayList();

    /* renamed from: f  reason: collision with root package name */
    public final List<u> f60404f = new ArrayList();

    /* renamed from: g  reason: collision with root package name */
    public boolean f60405g = false;

    /* renamed from: i  reason: collision with root package name */
    public int f60407i = 2;

    /* renamed from: j  reason: collision with root package name */
    public int f60408j = 2;

    /* renamed from: k  reason: collision with root package name */
    public boolean f60409k = false;

    /* renamed from: l  reason: collision with root package name */
    public boolean f60410l = false;

    /* renamed from: m  reason: collision with root package name */
    public boolean f60411m = true;

    /* renamed from: n  reason: collision with root package name */
    public boolean f60412n = false;

    /* renamed from: o  reason: collision with root package name */
    public boolean f60413o = false;

    /* renamed from: p  reason: collision with root package name */
    public boolean f60414p = false;

    /* renamed from: q  reason: collision with root package name */
    public s f60415q = r.DOUBLE;

    /* renamed from: r  reason: collision with root package name */
    public s f60416r = r.LAZILY_PARSED_NUMBER;

    public final void a(String str, int i10, int i11, List<u> list) {
        u uVar;
        u uVar2;
        boolean z10 = dn.d.f29735a;
        u uVar3 = null;
        if (str != null && !str.trim().isEmpty()) {
            uVar = d.b.f13934b.b(str);
            if (z10) {
                uVar3 = dn.d.f29737c.b(str);
                uVar2 = dn.d.f29736b.b(str);
            }
            uVar2 = null;
        } else if (i10 == 2 || i11 == 2) {
            return;
        } else {
            u a10 = d.b.f13934b.a(i10, i11);
            if (z10) {
                uVar3 = dn.d.f29737c.a(i10, i11);
                u a11 = dn.d.f29736b.a(i10, i11);
                uVar = a10;
                uVar2 = a11;
            } else {
                uVar = a10;
                uVar2 = null;
            }
        }
        list.add(uVar);
        if (z10) {
            list.add(uVar3);
            list.add(uVar2);
        }
    }

    public e b() {
        List<u> arrayList = new ArrayList<>(this.f60403e.size() + this.f60404f.size() + 3);
        arrayList.addAll(this.f60403e);
        Collections.reverse(arrayList);
        ArrayList arrayList2 = new ArrayList(this.f60404f);
        Collections.reverse(arrayList2);
        arrayList.addAll(arrayList2);
        a(this.f60406h, this.f60407i, this.f60408j, arrayList);
        return new e(this.f60399a, this.f60401c, this.f60402d, this.f60405g, this.f60409k, this.f60413o, this.f60411m, this.f60412n, this.f60414p, this.f60410l, this.f60400b, this.f60406h, this.f60407i, this.f60408j, this.f60403e, this.f60404f, arrayList, this.f60415q, this.f60416r);
    }

    public f c(Type type, Object obj) {
        boolean z10 = obj instanceof p;
        zm.a.a(z10 || (obj instanceof j) || (obj instanceof g) || (obj instanceof t));
        if (obj instanceof g) {
            this.f60402d.put(type, (g) obj);
        }
        if (z10 || (obj instanceof j)) {
            this.f60403e.add(an.l.b(en.a.get(type), obj));
        }
        if (obj instanceof t) {
            this.f60403e.add(an.n.a(en.a.get(type), (t) obj));
        }
        return this;
    }

    public f d(u uVar) {
        this.f60403e.add(uVar);
        return this;
    }

    public f e(c cVar) {
        this.f60401c = cVar;
        return this;
    }

    public f f() {
        this.f60414p = true;
        return this;
    }
}
