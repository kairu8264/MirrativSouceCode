package h0;

/* loaded from: classes.dex */
public final class c0 {

    /* renamed from: a  reason: collision with root package name */
    public static final u.b1<m2.g> f33746a = new u.b1<>(120, 0, u.b0.b(), 2, null);

    /* renamed from: b  reason: collision with root package name */
    public static final u.b1<m2.g> f33747b = new u.b1<>(150, 0, new u.u(0.4f, 0.0f, 0.6f, 1.0f), 2, null);

    /* renamed from: c  reason: collision with root package name */
    public static final u.b1<m2.g> f33748c = new u.b1<>(120, 0, new u.u(0.4f, 0.0f, 0.6f, 1.0f), 2, null);

    public static final Object d(u.a<m2.g, ?> aVar, float f10, x.j jVar, x.j jVar2, ao.d<? super wn.v> dVar) {
        u.i<m2.g> b10;
        if (jVar2 != null) {
            b10 = b0.f33744a.a(jVar2);
        } else {
            b10 = jVar != null ? b0.f33744a.b(jVar) : null;
        }
        u.i<m2.g> iVar = b10;
        if (iVar != null) {
            Object f11 = u.a.f(aVar, m2.g.e(f10), iVar, null, null, dVar, 12, null);
            return f11 == bo.c.c() ? f11 : wn.v.f59242a;
        }
        Object v10 = aVar.v(m2.g.e(f10), dVar);
        return v10 == bo.c.c() ? v10 : wn.v.f59242a;
    }
}
