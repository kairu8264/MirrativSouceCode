package q8;

import dq.c;
import jo.p;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final c f48785a;

    public a() {
        c c10 = c.c();
        p.g(c10, "getDefault()");
        this.f48785a = c10;
    }

    public final void a(Object obj) {
        p.h(obj, "event");
        this.f48785a.l(obj);
    }

    public final void b(Object obj) {
        p.h(obj, "observer");
        if (!this.f48785a.j(obj)) {
            this.f48785a.p(obj);
            return;
        }
        g9.a aVar = g9.a.f32826a;
        aVar.b("Subscriber " + obj + " already registered to event ", new Object[0]);
    }

    public final void c(Object obj) {
        p.h(obj, "observer");
        if (this.f48785a.j(obj)) {
            this.f48785a.r(obj);
            return;
        }
        g9.a aVar = g9.a.f32826a;
        aVar.b("Subscriber to unregister was not registered before: " + obj, new Object[0]);
    }
}
