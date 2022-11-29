package v0;

import java.util.Set;
import kotlin.KotlinNothingValueException;

/* loaded from: classes.dex */
public final class f0 extends c {

    /* renamed from: n  reason: collision with root package name */
    public final c f56471n;

    /* renamed from: o  reason: collision with root package name */
    public final io.l<Object, wn.v> f56472o;

    /* renamed from: p  reason: collision with root package name */
    public final io.l<Object, wn.v> f56473p;

    /* renamed from: q  reason: collision with root package name */
    public final boolean f56474q;

    /* renamed from: r  reason: collision with root package name */
    public final boolean f56475r;

    public f0(c cVar, io.l<Object, wn.v> lVar, io.l<Object, wn.v> lVar2, boolean z10, boolean z11) {
        super(0, k.A.a(), m.k(lVar, (cVar == null || (r1 = cVar.h()) == null) ? ((a) m.e().get()).h() : r1, z10), m.l(lVar2, (cVar == null || (r2 = cVar.j()) == null) ? ((a) m.e().get()).j() : r2));
        io.l<Object, wn.v> h10;
        io.l<Object, wn.v> j10;
        this.f56471n = cVar;
        this.f56472o = lVar;
        this.f56473p = lVar2;
        this.f56474q = z10;
        this.f56475r = z11;
    }

    @Override // v0.c
    public i A() {
        return Q().A();
    }

    @Override // v0.c
    public Set<c0> C() {
        return Q().C();
    }

    @Override // v0.c
    public void M(Set<c0> set) {
        v.b();
        throw new KotlinNothingValueException();
    }

    @Override // v0.c
    public c N(io.l<Object, wn.v> lVar, io.l<Object, wn.v> lVar2) {
        io.l<Object, wn.v> F = m.F(lVar, h(), false, 4, null);
        io.l<Object, wn.v> l10 = m.l(lVar2, j());
        if (!this.f56474q) {
            return new f0(Q().N(null, l10), F, l10, false, true);
        }
        return Q().N(F, l10);
    }

    public final c Q() {
        c cVar = this.f56471n;
        if (cVar == null) {
            Object obj = m.e().get();
            jo.p.g(obj, "currentGlobalSnapshot.get()");
            return (c) obj;
        }
        return cVar;
    }

    @Override // v0.c, v0.h
    /* renamed from: R */
    public Void l(h hVar) {
        jo.p.h(hVar, "snapshot");
        v.b();
        throw new KotlinNothingValueException();
    }

    @Override // v0.c, v0.h
    /* renamed from: S */
    public Void m(h hVar) {
        jo.p.h(hVar, "snapshot");
        v.b();
        throw new KotlinNothingValueException();
    }

    @Override // v0.c, v0.h
    public void d() {
        c cVar;
        s(true);
        if (!this.f56475r || (cVar = this.f56471n) == null) {
            return;
        }
        cVar.d();
    }

    @Override // v0.h
    public int f() {
        return Q().f();
    }

    @Override // v0.h
    public k g() {
        return Q().g();
    }

    @Override // v0.c, v0.h
    public boolean i() {
        return Q().i();
    }

    @Override // v0.c, v0.h
    public void n() {
        Q().n();
    }

    @Override // v0.c, v0.h
    public void o(c0 c0Var) {
        jo.p.h(c0Var, "state");
        Q().o(c0Var);
    }

    @Override // v0.h
    public void t(int i10) {
        v.b();
        throw new KotlinNothingValueException();
    }

    @Override // v0.h
    public void u(k kVar) {
        jo.p.h(kVar, "value");
        v.b();
        throw new KotlinNothingValueException();
    }

    @Override // v0.c, v0.h
    public h v(io.l<Object, wn.v> lVar) {
        io.l<Object, wn.v> F = m.F(lVar, h(), false, 4, null);
        if (!this.f56474q) {
            return m.c(Q().v(null), F, true);
        }
        return Q().v(F);
    }
}
