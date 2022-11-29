package od;

import pd.h1;

/* loaded from: classes2.dex */
public final class s0 implements uo.q0 {

    /* renamed from: w  reason: collision with root package name */
    public final q8.a f45227w;

    /* renamed from: x  reason: collision with root package name */
    public final kf.x f45228x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ uo.q0 f45229y;

    public s0(q8.a aVar, kf.x xVar) {
        jo.p.h(aVar, "dispatcher");
        jo.p.h(xVar, "userPreference");
        this.f45227w = aVar;
        this.f45228x = xVar;
        this.f45229y = uo.r0.b();
    }

    public final void a() {
        this.f45228x.clear();
        this.f45227w.a(h1.a.f46909a);
    }

    public final void b(int i10) {
        this.f45228x.e(i10);
        this.f45227w.a(new h1.b(i10));
    }

    public final void c(int i10) {
        this.f45228x.M4(i10);
        this.f45227w.a(new h1.c(i10));
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.f45229y.getCoroutineContext();
    }
}
