package v0;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.KotlinNothingValueException;

/* loaded from: classes.dex */
public final class g0 extends h {

    /* renamed from: g  reason: collision with root package name */
    public final h f56478g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f56479h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f56480i;

    /* renamed from: j  reason: collision with root package name */
    public final io.l<Object, wn.v> f56481j;

    /* renamed from: k  reason: collision with root package name */
    public final io.l<Object, wn.v> f56482k;

    /* renamed from: l  reason: collision with root package name */
    public final h f56483l;

    public g0(h hVar, io.l<Object, wn.v> lVar, boolean z10, boolean z11) {
        super(0, k.A.a(), null);
        AtomicReference atomicReference;
        io.l<Object, wn.v> h10;
        io.l<Object, wn.v> E;
        this.f56478g = hVar;
        this.f56479h = z10;
        this.f56480i = z11;
        if (hVar == null || (h10 = hVar.h()) == null) {
            atomicReference = m.f56514i;
            h10 = ((a) atomicReference.get()).h();
        }
        E = m.E(lVar, h10, z10);
        this.f56481j = E;
        this.f56483l = this;
    }

    @Override // v0.h
    /* renamed from: A */
    public Void m(h hVar) {
        jo.p.h(hVar, "snapshot");
        v.b();
        throw new KotlinNothingValueException();
    }

    @Override // v0.h
    public void d() {
        h hVar;
        s(true);
        if (!this.f56480i || (hVar = this.f56478g) == null) {
            return;
        }
        hVar.d();
    }

    @Override // v0.h
    public int f() {
        return y().f();
    }

    @Override // v0.h
    public k g() {
        return y().g();
    }

    @Override // v0.h
    public io.l<Object, wn.v> h() {
        return this.f56481j;
    }

    @Override // v0.h
    public boolean i() {
        return y().i();
    }

    @Override // v0.h
    public io.l<Object, wn.v> j() {
        return this.f56482k;
    }

    @Override // v0.h
    public void n() {
        y().n();
    }

    @Override // v0.h
    public void o(c0 c0Var) {
        jo.p.h(c0Var, "state");
        y().o(c0Var);
    }

    @Override // v0.h
    public h v(io.l<Object, wn.v> lVar) {
        h y10;
        io.l<Object, wn.v> F = m.F(lVar, h(), false, 4, null);
        if (!this.f56479h) {
            y10 = m.y(y().v(null), F, true);
            return y10;
        }
        return y().v(F);
    }

    public final h y() {
        AtomicReference atomicReference;
        h hVar = this.f56478g;
        if (hVar == null) {
            atomicReference = m.f56514i;
            Object obj = atomicReference.get();
            jo.p.g(obj, "currentGlobalSnapshot.get()");
            return (h) obj;
        }
        return hVar;
    }

    @Override // v0.h
    /* renamed from: z */
    public Void l(h hVar) {
        jo.p.h(hVar, "snapshot");
        v.b();
        throw new KotlinNothingValueException();
    }
}
