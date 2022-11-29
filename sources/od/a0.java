package od;

import pd.k0;

/* loaded from: classes2.dex */
public final class a0 implements uo.q0 {

    /* renamed from: w  reason: collision with root package name */
    public final q8.a f44657w;

    /* renamed from: x  reason: collision with root package name */
    public final hf.h0 f44658x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ uo.q0 f44659y;

    public a0(q8.a aVar, hf.h0 h0Var) {
        jo.p.h(aVar, "dispatcher");
        jo.p.h(h0Var, "newNoticeRepository");
        this.f44657w = aVar;
        this.f44658x = h0Var;
        this.f44659y = uo.r0.b();
    }

    public final void a() {
        jf.e0 i10 = this.f44658x.i();
        if (i10 != null) {
            this.f44657w.a(new k0.c(i10.h()));
            this.f44657w.a(new k0.d(i10.j()));
            this.f44657w.a(new k0.b(i10.b()));
            this.f44657w.a(new k0.a(i10.f()));
        }
    }

    public final void b(boolean z10, boolean z11, boolean z12) {
        this.f44657w.a(new k0.c(z10));
        this.f44657w.a(new k0.d(z11));
        this.f44657w.a(new k0.a(z12));
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.f44659y.getCoroutineContext();
    }
}
