package f0;

import e2.l;

/* loaded from: classes.dex */
public final class s implements t {

    /* renamed from: a  reason: collision with root package name */
    public u f31607a;

    /* renamed from: b  reason: collision with root package name */
    public a1.g f31608b;

    public void a(int i10) {
        l.a aVar = e2.l.f30112b;
        if (e2.l.l(i10, aVar.d())) {
            b().a(a1.c.f288b.d());
        } else if (e2.l.l(i10, aVar.f())) {
            b().a(a1.c.f288b.f());
        } else {
            if (e2.l.l(i10, aVar.b()) ? true : e2.l.l(i10, aVar.c()) ? true : e2.l.l(i10, aVar.g()) ? true : e2.l.l(i10, aVar.h()) ? true : e2.l.l(i10, aVar.a())) {
                return;
            }
            e2.l.l(i10, aVar.e());
        }
    }

    public final a1.g b() {
        a1.g gVar = this.f31608b;
        if (gVar != null) {
            return gVar;
        }
        jo.p.v("focusManager");
        return null;
    }

    public final u c() {
        u uVar = this.f31607a;
        if (uVar != null) {
            return uVar;
        }
        jo.p.v("keyboardActions");
        return null;
    }

    public final void d(int i10) {
        io.l<t, wn.v> lVar;
        l.a aVar = e2.l.f30112b;
        wn.v vVar = null;
        if (e2.l.l(i10, aVar.b())) {
            lVar = c().b();
        } else if (e2.l.l(i10, aVar.c())) {
            lVar = c().c();
        } else if (e2.l.l(i10, aVar.d())) {
            lVar = c().d();
        } else if (e2.l.l(i10, aVar.f())) {
            lVar = c().e();
        } else if (e2.l.l(i10, aVar.g())) {
            lVar = c().f();
        } else if (e2.l.l(i10, aVar.h())) {
            lVar = c().g();
        } else {
            if (!(e2.l.l(i10, aVar.a()) ? true : e2.l.l(i10, aVar.e()))) {
                throw new IllegalStateException("invalid ImeAction".toString());
            }
            lVar = null;
        }
        if (lVar != null) {
            lVar.invoke(this);
            vVar = wn.v.f59242a;
        }
        if (vVar == null) {
            a(i10);
        }
    }

    public final void e(a1.g gVar) {
        jo.p.h(gVar, "<set-?>");
        this.f31608b = gVar;
    }

    public final void f(u uVar) {
        jo.p.h(uVar, "<set-?>");
        this.f31607a = uVar;
    }
}
