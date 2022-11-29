package z;

import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
public final class d extends CancellationException {

    /* renamed from: w  reason: collision with root package name */
    public final n f62178w;

    /* renamed from: x  reason: collision with root package name */
    public final u.k<Float, u.m> f62179x;

    public d(n nVar, u.k<Float, u.m> kVar) {
        jo.p.h(nVar, "item");
        jo.p.h(kVar, "previousAnimation");
        this.f62178w = nVar;
        this.f62179x = kVar;
    }

    public final n a() {
        return this.f62178w;
    }

    public final u.k<Float, u.m> b() {
        return this.f62179x;
    }
}
