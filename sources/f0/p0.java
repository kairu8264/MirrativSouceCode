package f0;

import d2.l;

/* loaded from: classes.dex */
public final class p0 {

    /* renamed from: a  reason: collision with root package name */
    public m2.q f31574a;

    /* renamed from: b  reason: collision with root package name */
    public m2.d f31575b;

    /* renamed from: c  reason: collision with root package name */
    public l.b f31576c;

    /* renamed from: d  reason: collision with root package name */
    public y1.d0 f31577d;

    /* renamed from: e  reason: collision with root package name */
    public Object f31578e;

    /* renamed from: f  reason: collision with root package name */
    public long f31579f;

    public p0(m2.q qVar, m2.d dVar, l.b bVar, y1.d0 d0Var, Object obj) {
        jo.p.h(qVar, "layoutDirection");
        jo.p.h(dVar, "density");
        jo.p.h(bVar, "fontFamilyResolver");
        jo.p.h(d0Var, "resolvedStyle");
        jo.p.h(obj, "typeface");
        this.f31574a = qVar;
        this.f31575b = dVar;
        this.f31576c = bVar;
        this.f31577d = d0Var;
        this.f31578e = obj;
        this.f31579f = a();
    }

    public final long a() {
        return h0.b(this.f31577d, this.f31575b, this.f31576c, null, 0, 24, null);
    }

    public final long b() {
        return this.f31579f;
    }

    public final void c(m2.q qVar, m2.d dVar, l.b bVar, y1.d0 d0Var, Object obj) {
        jo.p.h(qVar, "layoutDirection");
        jo.p.h(dVar, "density");
        jo.p.h(bVar, "fontFamilyResolver");
        jo.p.h(d0Var, "resolvedStyle");
        jo.p.h(obj, "typeface");
        if (qVar == this.f31574a && jo.p.c(dVar, this.f31575b) && jo.p.c(bVar, this.f31576c) && jo.p.c(d0Var, this.f31577d) && jo.p.c(obj, this.f31578e)) {
            return;
        }
        this.f31574a = qVar;
        this.f31575b = dVar;
        this.f31576c = bVar;
        this.f31577d = d0Var;
        this.f31578e = obj;
        this.f31579f = a();
    }
}
