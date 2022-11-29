package od;

import pd.l0;

/* loaded from: classes2.dex */
public final class b0 implements uo.q0 {

    /* renamed from: w  reason: collision with root package name */
    public final q8.a f44723w;

    /* renamed from: x  reason: collision with root package name */
    public final hf.h0 f44724x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ da.b f44725y;

    public b0(q8.a aVar, hf.h0 h0Var) {
        jo.p.h(aVar, "dispatcher");
        jo.p.h(h0Var, "newNoticeRepository");
        this.f44723w = aVar;
        this.f44724x = h0Var;
        this.f44725y = new da.b();
    }

    public final void a() {
        jf.e0 i10 = this.f44724x.i();
        if (i10 != null) {
            this.f44723w.a(new l0.d(i10.i()));
            this.f44723w.a(new l0.b(i10.d()));
            this.f44723w.a(new l0.a(i10.a()));
        }
    }

    public final void b(int i10) {
        this.f44723w.a(new l0.c(i10));
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.f44725y.getCoroutineContext();
    }
}
