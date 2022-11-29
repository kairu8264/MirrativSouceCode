package androidx.lifecycle;

import uo.g1;

/* loaded from: classes.dex */
public final class h0 extends uo.k0 {

    /* renamed from: x  reason: collision with root package name */
    public final i f15541x = new i();

    @Override // uo.k0
    public void X(ao.g gVar, Runnable runnable) {
        jo.p.h(gVar, "context");
        jo.p.h(runnable, "block");
        this.f15541x.c(gVar, runnable);
    }

    @Override // uo.k0
    public boolean c0(ao.g gVar) {
        jo.p.h(gVar, "context");
        if (g1.c().h0().c0(gVar)) {
            return true;
        }
        return !this.f15541x.b();
    }
}
