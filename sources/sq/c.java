package sq;

import jo.p;

/* loaded from: classes4.dex */
public abstract class c {

    /* renamed from: a  reason: collision with root package name */
    public b f52833a;

    public c(b bVar) {
        p.h(bVar, "level");
        this.f52833a = bVar;
    }

    public final boolean a(b bVar) {
        return this.f52833a.compareTo(bVar) <= 0;
    }

    public final void b(String str) {
        p.h(str, "msg");
        c(b.DEBUG, str);
    }

    public final void c(b bVar, String str) {
        if (a(bVar)) {
            h(bVar, str);
        }
    }

    public final void d(String str) {
        p.h(str, "msg");
        c(b.ERROR, str);
    }

    public final void e(String str) {
        p.h(str, "msg");
        c(b.INFO, str);
    }

    public final boolean f(b bVar) {
        p.h(bVar, "lvl");
        return this.f52833a.compareTo(bVar) <= 0;
    }

    public final void g(b bVar, io.a<String> aVar) {
        p.h(bVar, "lvl");
        p.h(aVar, "msg");
        if (f(bVar)) {
            c(bVar, aVar.invoke());
        }
    }

    public abstract void h(b bVar, String str);
}
