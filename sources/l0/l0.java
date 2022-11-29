package l0;

import uo.d2;
import uo.i2;

/* loaded from: classes.dex */
public final class l0 implements k1 {

    /* renamed from: w  reason: collision with root package name */
    public final io.p<uo.q0, ao.d<? super wn.v>, Object> f39199w;

    /* renamed from: x  reason: collision with root package name */
    public final uo.q0 f39200x;

    /* renamed from: y  reason: collision with root package name */
    public uo.d2 f39201y;

    /* JADX WARN: Multi-variable type inference failed */
    public l0(ao.g gVar, io.p<? super uo.q0, ? super ao.d<? super wn.v>, ? extends Object> pVar) {
        jo.p.h(gVar, "parentCoroutineContext");
        jo.p.h(pVar, "task");
        this.f39199w = pVar;
        this.f39200x = uo.r0.a(gVar);
    }

    @Override // l0.k1
    public void a() {
        uo.d2 d10;
        uo.d2 d2Var = this.f39201y;
        if (d2Var != null) {
            i2.f(d2Var, "Old job was still running!", null, 2, null);
        }
        d10 = uo.l.d(this.f39200x, null, null, this.f39199w, 3, null);
        this.f39201y = d10;
    }

    @Override // l0.k1
    public void b() {
        uo.d2 d2Var = this.f39201y;
        if (d2Var != null) {
            d2.a.a(d2Var, null, 1, null);
        }
        this.f39201y = null;
    }

    @Override // l0.k1
    public void c() {
        uo.d2 d2Var = this.f39201y;
        if (d2Var != null) {
            d2.a.a(d2Var, null, 1, null);
        }
        this.f39201y = null;
    }
}
