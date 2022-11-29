package uo;

/* loaded from: classes4.dex */
public abstract class a<T> extends k2 implements ao.d<T>, q0 {

    /* renamed from: x  reason: collision with root package name */
    public final ao.g f55988x;

    public a(ao.g gVar, boolean z10, boolean z11) {
        super(z11);
        if (z10) {
            q0((d2) gVar.get(d2.f56001s));
        }
        this.f55988x = gVar.plus(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // uo.k2
    public final void D0(Object obj) {
        if (obj instanceof d0) {
            d0 d0Var = (d0) obj;
            W0(d0Var.f55999a, d0Var.a());
            return;
        }
        X0(obj);
    }

    public void V0(Object obj) {
        H(obj);
    }

    public void W0(Throwable th2, boolean z10) {
    }

    public void X0(T t10) {
    }

    public final <R> void Y0(s0 s0Var, R r10, io.p<? super R, ? super ao.d<? super T>, ? extends Object> pVar) {
        s0Var.c(pVar, r10, this);
    }

    @Override // uo.k2
    public String Z() {
        return jo.p.o(v0.a(this), " was cancelled");
    }

    @Override // ao.d
    public final ao.g getContext() {
        return this.f55988x;
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.f55988x;
    }

    @Override // uo.k2, uo.d2
    public boolean isActive() {
        return super.isActive();
    }

    @Override // uo.k2
    public final void p0(Throwable th2) {
        n0.a(this.f55988x, th2);
    }

    @Override // ao.d
    public final void resumeWith(Object obj) {
        Object w02 = w0(g0.d(obj, null, 1, null));
        if (w02 == l2.f56054b) {
            return;
        }
        V0(w02);
    }

    @Override // uo.k2
    public String y0() {
        String b10 = j0.b(this.f55988x);
        if (b10 == null) {
            return super.y0();
        }
        return '\"' + b10 + "\":" + super.y0();
    }
}
