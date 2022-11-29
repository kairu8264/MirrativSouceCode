package y1;

/* loaded from: classes.dex */
public final class a0 {

    /* renamed from: a  reason: collision with root package name */
    public static final a0 f61062a = new a0();

    public final void a(c1.w wVar, z zVar) {
        jo.p.h(wVar, "canvas");
        jo.p.h(zVar, "textLayoutResult");
        boolean z10 = zVar.h() && j2.k.d(zVar.k().f(), j2.k.f37107a.a());
        if (z10) {
            b1.h b10 = b1.i.b(b1.f.f16721b.c(), b1.m.a(m2.o.g(zVar.A()), m2.o.f(zVar.A())));
            wVar.p();
            c1.w.x(wVar, b10, 0, 2, null);
        }
        try {
            c1.u f10 = zVar.k().i().f();
            if (f10 != null) {
                zVar.v().A(wVar, f10, zVar.k().i().t(), zVar.k().i().w());
            } else {
                zVar.v().B(wVar, zVar.k().i().g(), zVar.k().i().t(), zVar.k().i().w());
            }
        } finally {
            if (z10) {
                wVar.k();
            }
        }
    }
}
