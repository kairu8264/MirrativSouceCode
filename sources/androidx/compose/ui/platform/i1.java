package androidx.compose.ui.platform;

import ao.g;
import x0.g;

/* loaded from: classes.dex */
public final class i1 implements x0.g {

    /* renamed from: w  reason: collision with root package name */
    public final l0.s0 f14472w;

    public i1() {
        l0.s0 e10;
        e10 = l0.z1.e(Float.valueOf(1.0f), null, 2, null);
        this.f14472w = e10;
    }

    public void b(float f10) {
        this.f14472w.setValue(Float.valueOf(f10));
    }

    @Override // ao.g
    public <R> R fold(R r10, io.p<? super R, ? super g.b, ? extends R> pVar) {
        return (R) g.a.a(this, r10, pVar);
    }

    @Override // ao.g.b, ao.g
    public <E extends g.b> E get(g.c<E> cVar) {
        return (E) g.a.b(this, cVar);
    }

    @Override // ao.g
    public ao.g minusKey(g.c<?> cVar) {
        return g.a.c(this, cVar);
    }

    @Override // ao.g
    public ao.g plus(ao.g gVar) {
        return g.a.d(this, gVar);
    }
}
