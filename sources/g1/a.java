package g1;

import c1.c0;
import c1.d0;
import c1.k0;
import c1.m0;
import c1.w;
import c1.y;
import e1.a;
import wn.v;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public k0 f32329a;

    /* renamed from: b  reason: collision with root package name */
    public w f32330b;

    /* renamed from: c  reason: collision with root package name */
    public m2.d f32331c;

    /* renamed from: d  reason: collision with root package name */
    public m2.q f32332d = m2.q.Ltr;

    /* renamed from: e  reason: collision with root package name */
    public long f32333e = m2.o.f40537b.a();

    /* renamed from: f  reason: collision with root package name */
    public final e1.a f32334f = new e1.a();

    public final void a(e1.e eVar) {
        e1.e.L0(eVar, c0.f18634b.a(), 0L, 0L, 0.0f, null, null, c1.r.f18740b.a(), 62, null);
    }

    public final void b(long j10, m2.d dVar, m2.q qVar, io.l<? super e1.e, v> lVar) {
        jo.p.h(dVar, "density");
        jo.p.h(qVar, "layoutDirection");
        jo.p.h(lVar, "block");
        this.f32331c = dVar;
        this.f32332d = qVar;
        k0 k0Var = this.f32329a;
        w wVar = this.f32330b;
        if (k0Var == null || wVar == null || m2.o.g(j10) > k0Var.getWidth() || m2.o.f(j10) > k0Var.getHeight()) {
            k0Var = m0.b(m2.o.g(j10), m2.o.f(j10), 0, false, null, 28, null);
            wVar = y.a(k0Var);
            this.f32329a = k0Var;
            this.f32330b = wVar;
        }
        this.f32333e = j10;
        e1.a aVar = this.f32334f;
        long b10 = m2.p.b(j10);
        a.C0296a z10 = aVar.z();
        m2.d a10 = z10.a();
        m2.q b11 = z10.b();
        w c10 = z10.c();
        long d10 = z10.d();
        a.C0296a z11 = aVar.z();
        z11.j(dVar);
        z11.k(qVar);
        z11.i(wVar);
        z11.l(b10);
        wVar.p();
        a(aVar);
        lVar.invoke(aVar);
        wVar.k();
        a.C0296a z12 = aVar.z();
        z12.j(a10);
        z12.k(b11);
        z12.i(c10);
        z12.l(d10);
        k0Var.a();
    }

    public final void c(e1.e eVar, float f10, d0 d0Var) {
        jo.p.h(eVar, "target");
        k0 k0Var = this.f32329a;
        if (k0Var != null) {
            e1.e.A(eVar, k0Var, 0L, this.f32333e, 0L, 0L, f10, null, d0Var, 0, 0, 858, null);
            return;
        }
        throw new IllegalStateException("drawCachedImage must be invoked first before attempting to draw the result into another destination".toString());
    }
}
