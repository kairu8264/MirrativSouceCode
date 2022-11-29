package v;

import c1.g1;
import c1.q0;
import x0.f;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a  reason: collision with root package name */
    public static final float f56293a = m2.g.l(30);

    /* renamed from: b  reason: collision with root package name */
    public static final x0.f f56294b;

    /* renamed from: c  reason: collision with root package name */
    public static final x0.f f56295c;

    /* loaded from: classes.dex */
    public static final class a implements g1 {
        @Override // c1.g1
        public c1.q0 a(long j10, m2.q qVar, m2.d dVar) {
            jo.p.h(qVar, "layoutDirection");
            jo.p.h(dVar, "density");
            float X = dVar.X(n.b());
            return new q0.b(new b1.h(0.0f, -X, b1.l.i(j10), b1.l.g(j10) + X));
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements g1 {
        @Override // c1.g1
        public c1.q0 a(long j10, m2.q qVar, m2.d dVar) {
            jo.p.h(qVar, "layoutDirection");
            jo.p.h(dVar, "density");
            float X = dVar.X(n.b());
            return new q0.b(new b1.h(-X, 0.0f, b1.l.i(j10) + X, b1.l.g(j10)));
        }
    }

    static {
        f.a aVar = x0.f.f59359u;
        f56294b = z0.d.a(aVar, new a());
        f56295c = z0.d.a(aVar, new b());
    }

    public static final x0.f a(x0.f fVar, w.q qVar) {
        x0.f fVar2;
        jo.p.h(fVar, "<this>");
        jo.p.h(qVar, "orientation");
        if (qVar == w.q.Vertical) {
            fVar2 = f56295c;
        } else {
            fVar2 = f56294b;
        }
        return fVar.L(fVar2);
    }

    public static final float b() {
        return f56293a;
    }
}
