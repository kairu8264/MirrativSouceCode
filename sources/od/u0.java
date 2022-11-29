package od;

import pd.j1;

/* loaded from: classes2.dex */
public final class u0 implements uo.q0 {

    /* renamed from: w  reason: collision with root package name */
    public final q8.a f45305w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ da.b f45306x;

    public u0(q8.a aVar) {
        jo.p.h(aVar, "dispatcher");
        this.f45305w = aVar;
        this.f45306x = new da.b();
    }

    public final void a(long j10) {
        this.f45305w.a(new j1.a(j10));
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.f45306x.getCoroutineContext();
    }
}
