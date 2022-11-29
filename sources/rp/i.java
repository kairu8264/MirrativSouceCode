package rp;

import java.io.IOException;
import java.util.List;
import rp.y;

/* loaded from: classes4.dex */
public abstract class i {

    /* renamed from: a  reason: collision with root package name */
    public static final a f51696a = new a(null);

    /* renamed from: b  reason: collision with root package name */
    public static final i f51697b;

    /* renamed from: c  reason: collision with root package name */
    public static final y f51698c;

    /* renamed from: d  reason: collision with root package name */
    public static final i f51699d;

    /* loaded from: classes4.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }
    }

    static {
        i rVar;
        try {
            Class.forName("java.nio.file.Files");
            rVar = new s();
        } catch (ClassNotFoundException unused) {
            rVar = new r();
        }
        f51697b = rVar;
        y.a aVar = y.f51736x;
        String property = System.getProperty("java.io.tmpdir");
        jo.p.g(property, "getProperty(\"java.io.tmpdir\")");
        f51698c = y.a.e(aVar, property, false, 1, null);
        ClassLoader classLoader = sp.c.class.getClassLoader();
        jo.p.g(classLoader, "ResourceFileSystem::class.java.classLoader");
        f51699d = new sp.c(classLoader, false);
    }

    public final f0 a(y yVar) throws IOException {
        jo.p.h(yVar, "file");
        return b(yVar, false);
    }

    public abstract f0 b(y yVar, boolean z10) throws IOException;

    public abstract void c(y yVar, y yVar2) throws IOException;

    public final void d(y yVar) throws IOException {
        jo.p.h(yVar, "dir");
        e(yVar, false);
    }

    public final void e(y yVar, boolean z10) throws IOException {
        jo.p.h(yVar, "dir");
        sp.h.a(this, yVar, z10);
    }

    public final void f(y yVar) throws IOException {
        jo.p.h(yVar, "dir");
        g(yVar, false);
    }

    public abstract void g(y yVar, boolean z10) throws IOException;

    public final void h(y yVar) throws IOException {
        jo.p.h(yVar, "path");
        i(yVar, false);
    }

    public abstract void i(y yVar, boolean z10) throws IOException;

    public final boolean j(y yVar) throws IOException {
        jo.p.h(yVar, "path");
        return sp.h.b(this, yVar);
    }

    public abstract List<y> k(y yVar) throws IOException;

    public final h l(y yVar) throws IOException {
        jo.p.h(yVar, "path");
        return sp.h.c(this, yVar);
    }

    public abstract h m(y yVar) throws IOException;

    public abstract g n(y yVar) throws IOException;

    public final f0 o(y yVar) throws IOException {
        jo.p.h(yVar, "file");
        return p(yVar, false);
    }

    public abstract f0 p(y yVar, boolean z10) throws IOException;

    public abstract h0 q(y yVar) throws IOException;
}
