package sp;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import io.l;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URI;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.LinkedHashSet;
import java.util.List;
import jo.p;
import jo.q;
import rp.f0;
import rp.h0;
import rp.y;
import so.n;
import so.o;
import wn.k;
import xn.a0;
import xn.t;
import xn.x;

/* loaded from: classes4.dex */
public final class c extends rp.i {

    /* renamed from: f  reason: collision with root package name */
    public static final a f52803f = new a(null);
    @Deprecated

    /* renamed from: g  reason: collision with root package name */
    public static final y f52804g = y.a.e(y.f51736x, "/", false, 1, null);

    /* renamed from: e  reason: collision with root package name */
    public final wn.f f52805e;

    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: sp.c$a$a  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0807a extends q implements l<d, Boolean> {

            /* renamed from: w  reason: collision with root package name */
            public static final C0807a f52806w = new C0807a();

            public C0807a() {
                super(1);
            }

            @Override // io.l
            /* renamed from: a */
            public final Boolean invoke(d dVar) {
                p.h(dVar, "entry");
                return Boolean.valueOf(c.f52803f.c(dVar.a()));
            }
        }

        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final y b() {
            return c.f52804g;
        }

        public final boolean c(y yVar) {
            return !n.o(yVar.l(), ".class", true);
        }

        public final y d(y yVar, y yVar2) {
            p.h(yVar, "<this>");
            p.h(yVar2, TtmlNode.RUBY_BASE);
            return b().p(n.x(o.k0(yVar.toString(), yVar2.toString()), '\\', '/', false, 4, null));
        }

        public final List<k<rp.i, y>> e(ClassLoader classLoader) {
            p.h(classLoader, "<this>");
            Enumeration<URL> resources = classLoader.getResources("");
            p.g(resources, "getResources(\"\")");
            ArrayList<URL> list = Collections.list(resources);
            p.g(list, "java.util.Collections.list(this)");
            ArrayList arrayList = new ArrayList();
            for (URL url : list) {
                a aVar = c.f52803f;
                p.g(url, "it");
                k<rp.i, y> f10 = aVar.f(url);
                if (f10 != null) {
                    arrayList.add(f10);
                }
            }
            Enumeration<URL> resources2 = classLoader.getResources("META-INF/MANIFEST.MF");
            p.g(resources2, "getResources(\"META-INF/MANIFEST.MF\")");
            ArrayList<URL> list2 = Collections.list(resources2);
            p.g(list2, "java.util.Collections.list(this)");
            ArrayList arrayList2 = new ArrayList();
            for (URL url2 : list2) {
                a aVar2 = c.f52803f;
                p.g(url2, "it");
                k<rp.i, y> g10 = aVar2.g(url2);
                if (g10 != null) {
                    arrayList2.add(g10);
                }
            }
            return a0.o0(arrayList, arrayList2);
        }

        public final k<rp.i, y> f(URL url) {
            p.h(url, "<this>");
            if (p.c(url.getProtocol(), "file")) {
                return wn.q.a(rp.i.f51697b, y.a.d(y.f51736x, new File(url.toURI()), false, 1, null));
            }
            return null;
        }

        public final k<rp.i, y> g(URL url) {
            int Z;
            p.h(url, "<this>");
            String url2 = url.toString();
            p.g(url2, "toString()");
            if (n.C(url2, "jar:file:", false, 2, null) && (Z = o.Z(url2, "!", 0, false, 6, null)) != -1) {
                y.a aVar = y.f51736x;
                String substring = url2.substring(4, Z);
                p.g(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                return wn.q.a(e.d(y.a.d(aVar, new File(URI.create(substring)), false, 1, null), rp.i.f51697b, C0807a.f52806w), b());
            }
            return null;
        }
    }

    /* loaded from: classes4.dex */
    public static final class b extends q implements io.a<List<? extends k<? extends rp.i, ? extends y>>> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ClassLoader f52807w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ClassLoader classLoader) {
            super(0);
            this.f52807w = classLoader;
        }

        @Override // io.a
        /* renamed from: a */
        public final List<k<rp.i, y>> invoke() {
            return c.f52803f.e(this.f52807w);
        }
    }

    public c(ClassLoader classLoader, boolean z10) {
        p.h(classLoader, "classLoader");
        this.f52805e = wn.g.a(new b(classLoader));
        if (z10) {
            u().size();
        }
    }

    @Override // rp.i
    public f0 b(y yVar, boolean z10) {
        p.h(yVar, "file");
        throw new IOException(this + " is read-only");
    }

    @Override // rp.i
    public void c(y yVar, y yVar2) {
        p.h(yVar, "source");
        p.h(yVar2, "target");
        throw new IOException(this + " is read-only");
    }

    @Override // rp.i
    public void g(y yVar, boolean z10) {
        p.h(yVar, "dir");
        throw new IOException(this + " is read-only");
    }

    @Override // rp.i
    public void i(y yVar, boolean z10) {
        p.h(yVar, "path");
        throw new IOException(this + " is read-only");
    }

    @Override // rp.i
    public List<y> k(y yVar) {
        p.h(yVar, "dir");
        String v10 = v(yVar);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        boolean z10 = false;
        for (k<rp.i, y> kVar : u()) {
            rp.i a10 = kVar.a();
            y b10 = kVar.b();
            try {
                List<y> k10 = a10.k(b10.p(v10));
                ArrayList<y> arrayList = new ArrayList();
                for (Object obj : k10) {
                    if (f52803f.c((y) obj)) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList(t.u(arrayList, 10));
                for (y yVar2 : arrayList) {
                    arrayList2.add(f52803f.d(yVar2, b10));
                }
                x.y(linkedHashSet, arrayList2);
                z10 = true;
            } catch (IOException unused) {
            }
        }
        if (z10) {
            return a0.B0(linkedHashSet);
        }
        throw new FileNotFoundException(p.o("file not found: ", yVar));
    }

    @Override // rp.i
    public rp.h m(y yVar) {
        p.h(yVar, "path");
        if (f52803f.c(yVar)) {
            String v10 = v(yVar);
            for (k<rp.i, y> kVar : u()) {
                rp.h m10 = kVar.a().m(kVar.b().p(v10));
                if (m10 != null) {
                    return m10;
                }
            }
            return null;
        }
        return null;
    }

    @Override // rp.i
    public rp.g n(y yVar) {
        p.h(yVar, "file");
        if (f52803f.c(yVar)) {
            String v10 = v(yVar);
            for (k<rp.i, y> kVar : u()) {
                try {
                    return kVar.a().n(kVar.b().p(v10));
                } catch (FileNotFoundException unused) {
                }
            }
            throw new FileNotFoundException(p.o("file not found: ", yVar));
        }
        throw new FileNotFoundException(p.o("file not found: ", yVar));
    }

    @Override // rp.i
    public f0 p(y yVar, boolean z10) {
        p.h(yVar, "file");
        throw new IOException(this + " is read-only");
    }

    @Override // rp.i
    public h0 q(y yVar) {
        p.h(yVar, "file");
        if (f52803f.c(yVar)) {
            String v10 = v(yVar);
            for (k<rp.i, y> kVar : u()) {
                try {
                    return kVar.a().q(kVar.b().p(v10));
                } catch (FileNotFoundException unused) {
                }
            }
            throw new FileNotFoundException(p.o("file not found: ", yVar));
        }
        throw new FileNotFoundException(p.o("file not found: ", yVar));
    }

    public final y t(y yVar) {
        return f52804g.q(yVar, true);
    }

    public final List<k<rp.i, y>> u() {
        return (List) this.f52805e.getValue();
    }

    public final String v(y yVar) {
        return t(yVar).o(f52804g).toString();
    }
}
