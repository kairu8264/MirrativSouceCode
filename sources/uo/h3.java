package uo;

/* loaded from: classes4.dex */
public final class h3 extends k0 {

    /* renamed from: x  reason: collision with root package name */
    public static final h3 f56029x = new h3();

    @Override // uo.k0
    public void X(ao.g gVar, Runnable runnable) {
        k3 k3Var = (k3) gVar.get(k3.f56048x);
        if (k3Var != null) {
            k3Var.f56049w = true;
            return;
        }
        throw new UnsupportedOperationException("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
    }

    @Override // uo.k0
    public boolean c0(ao.g gVar) {
        return false;
    }

    @Override // uo.k0
    public k0 d0(int i10) {
        throw new UnsupportedOperationException("limitedParallelism is not supported for Dispatchers.Unconfined");
    }

    @Override // uo.k0
    public String toString() {
        return "Dispatchers.Unconfined";
    }
}
