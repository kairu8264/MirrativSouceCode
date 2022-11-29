package v0;

import kotlin.KotlinNothingValueException;

/* loaded from: classes.dex */
public final class g extends h {

    /* renamed from: g  reason: collision with root package name */
    public final io.l<Object, wn.v> f56476g;

    /* renamed from: h  reason: collision with root package name */
    public int f56477h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(int i10, k kVar, io.l<Object, wn.v> lVar) {
        super(i10, kVar, null);
        jo.p.h(kVar, "invalid");
        this.f56476g = lVar;
        this.f56477h = 1;
    }

    @Override // v0.h
    public void d() {
        if (e()) {
            return;
        }
        m(this);
        super.d();
    }

    @Override // v0.h
    public io.l<Object, wn.v> h() {
        return this.f56476g;
    }

    @Override // v0.h
    public boolean i() {
        return true;
    }

    @Override // v0.h
    public io.l<Object, wn.v> j() {
        return null;
    }

    @Override // v0.h
    public void l(h hVar) {
        jo.p.h(hVar, "snapshot");
        this.f56477h++;
    }

    @Override // v0.h
    public void m(h hVar) {
        jo.p.h(hVar, "snapshot");
        int i10 = this.f56477h - 1;
        this.f56477h = i10;
        if (i10 == 0) {
            b();
        }
    }

    @Override // v0.h
    public void n() {
    }

    @Override // v0.h
    public void o(c0 c0Var) {
        jo.p.h(c0Var, "state");
        m.R();
        throw new KotlinNothingValueException();
    }

    @Override // v0.h
    public h v(io.l<Object, wn.v> lVar) {
        m.Y(this);
        return new e(f(), g(), lVar, this);
    }
}
