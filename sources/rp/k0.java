package rp;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.zip.Inflater;
import rp.y;

/* loaded from: classes4.dex */
public final class k0 extends i {

    /* renamed from: i  reason: collision with root package name */
    public static final a f51707i = new a(null);
    @Deprecated

    /* renamed from: j  reason: collision with root package name */
    public static final y f51708j = y.a.e(y.f51736x, "/", false, 1, null);

    /* renamed from: e  reason: collision with root package name */
    public final y f51709e;

    /* renamed from: f  reason: collision with root package name */
    public final i f51710f;

    /* renamed from: g  reason: collision with root package name */
    public final Map<y, sp.d> f51711g;

    /* renamed from: h  reason: collision with root package name */
    public final String f51712h;

    /* loaded from: classes4.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }
    }

    public k0(y yVar, i iVar, Map<y, sp.d> map, String str) {
        jo.p.h(yVar, "zipPath");
        jo.p.h(iVar, "fileSystem");
        jo.p.h(map, "entries");
        this.f51709e = yVar;
        this.f51710f = iVar;
        this.f51711g = map;
        this.f51712h = str;
    }

    @Override // rp.i
    public f0 b(y yVar, boolean z10) {
        jo.p.h(yVar, "file");
        throw new IOException("zip file systems are read-only");
    }

    @Override // rp.i
    public void c(y yVar, y yVar2) {
        jo.p.h(yVar, "source");
        jo.p.h(yVar2, "target");
        throw new IOException("zip file systems are read-only");
    }

    @Override // rp.i
    public void g(y yVar, boolean z10) {
        jo.p.h(yVar, "dir");
        throw new IOException("zip file systems are read-only");
    }

    @Override // rp.i
    public void i(y yVar, boolean z10) {
        jo.p.h(yVar, "path");
        throw new IOException("zip file systems are read-only");
    }

    @Override // rp.i
    public List<y> k(y yVar) {
        jo.p.h(yVar, "dir");
        List<y> s10 = s(yVar, true);
        jo.p.e(s10);
        return s10;
    }

    @Override // rp.i
    public h m(y yVar) {
        e eVar;
        jo.p.h(yVar, "path");
        sp.d dVar = this.f51711g.get(r(yVar));
        Throwable th2 = null;
        if (dVar == null) {
            return null;
        }
        h hVar = new h(!dVar.h(), dVar.h(), null, dVar.h() ? null : Long.valueOf(dVar.g()), null, dVar.e(), null, null, 128, null);
        if (dVar.f() == -1) {
            return hVar;
        }
        g n10 = this.f51710f.n(this.f51709e);
        try {
            eVar = t.c(n10.p(dVar.f()));
        } catch (Throwable th3) {
            th2 = th3;
            eVar = null;
        }
        if (n10 != null) {
            try {
                n10.close();
            } catch (Throwable th4) {
                if (th2 == null) {
                    th2 = th4;
                } else {
                    wn.a.a(th2, th4);
                }
            }
        }
        if (th2 == null) {
            jo.p.e(eVar);
            return sp.e.h(eVar, hVar);
        }
        throw th2;
    }

    @Override // rp.i
    public g n(y yVar) {
        jo.p.h(yVar, "file");
        throw new UnsupportedOperationException("not implemented yet!");
    }

    @Override // rp.i
    public f0 p(y yVar, boolean z10) {
        jo.p.h(yVar, "file");
        throw new IOException("zip file systems are read-only");
    }

    @Override // rp.i
    public h0 q(y yVar) throws IOException {
        e eVar;
        jo.p.h(yVar, "path");
        sp.d dVar = this.f51711g.get(r(yVar));
        if (dVar != null) {
            g n10 = this.f51710f.n(this.f51709e);
            Throwable th2 = null;
            try {
                eVar = t.c(n10.p(dVar.f()));
            } catch (Throwable th3) {
                eVar = null;
                th2 = th3;
            }
            if (n10 != null) {
                try {
                    n10.close();
                } catch (Throwable th4) {
                    if (th2 == null) {
                        th2 = th4;
                    } else {
                        wn.a.a(th2, th4);
                    }
                }
            }
            if (th2 == null) {
                jo.p.e(eVar);
                sp.e.k(eVar);
                if (dVar.d() == 0) {
                    return new sp.b(eVar, dVar.g(), true);
                }
                return new sp.b(new o(new sp.b(eVar, dVar.c(), true), new Inflater(true)), dVar.g(), false);
            }
            throw th2;
        }
        throw new FileNotFoundException(jo.p.o("no such file: ", yVar));
    }

    public final y r(y yVar) {
        return f51708j.q(yVar, true);
    }

    public final List<y> s(y yVar, boolean z10) {
        sp.d dVar = this.f51711g.get(r(yVar));
        if (dVar == null) {
            if (z10) {
                throw new IOException(jo.p.o("not a directory: ", yVar));
            }
            return null;
        }
        return xn.a0.B0(dVar.b());
    }
}
