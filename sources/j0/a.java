package j0;

import c1.c0;
import c1.i1;
import c1.j1;
import c1.k1;
import g1.c;
import g1.d;
import jo.h;
import jo.p;
import m2.g;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static c f37048a;

    public static final c a(i0.a aVar) {
        c.a c10;
        p.h(aVar, "<this>");
        c cVar = f37048a;
        if (cVar != null) {
            p.e(cVar);
            return cVar;
        }
        c.a aVar2 = new c.a("Filled.ArrowBack", g.l(24.0f), g.l(24.0f), 24.0f, 24.0f, 0L, 0, 96, (h) null);
        int b10 = g1.p.b();
        i1 i1Var = new i1(c0.f18634b.a(), null);
        int a10 = j1.f18697b.a();
        int a11 = k1.f18705b.a();
        d dVar = new d();
        dVar.g(20.0f, 11.0f);
        dVar.d(7.83f);
        dVar.f(5.59f, -5.59f);
        dVar.e(12.0f, 4.0f);
        dVar.f(-8.0f, 8.0f);
        dVar.f(8.0f, 8.0f);
        dVar.f(1.41f, -1.41f);
        dVar.e(7.83f, 13.0f);
        dVar.d(20.0f);
        dVar.h(-2.0f);
        dVar.b();
        c10 = aVar2.c(dVar.c(), (r30 & 2) != 0 ? g1.p.b() : b10, (r30 & 4) != 0 ? "" : "", (r30 & 8) != 0 ? null : i1Var, (r30 & 16) != 0 ? 1.0f : 1.0f, (r30 & 32) == 0 ? null : null, (r30 & 64) != 0 ? 1.0f : 1.0f, (r30 & 128) != 0 ? 0.0f : 1.0f, (r30 & 256) != 0 ? g1.p.c() : a10, (r30 & 512) != 0 ? g1.p.d() : a11, (r30 & 1024) != 0 ? 4.0f : 1.0f, (r30 & 2048) != 0 ? 0.0f : 0.0f, (r30 & 4096) == 0 ? 0.0f : 1.0f, (r30 & 8192) == 0 ? 0.0f : 0.0f);
        c f10 = c10.f();
        f37048a = f10;
        p.e(f10);
        return f10;
    }
}
