package a0;

import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
public final class d extends CancellationException {

    /* renamed from: w  reason: collision with root package name */
    public final i f29w;

    /* renamed from: x  reason: collision with root package name */
    public final u.k<Float, u.m> f30x;

    public d(i iVar, u.k<Float, u.m> kVar) {
        jo.p.h(iVar, "item");
        jo.p.h(kVar, "previousAnimation");
        this.f29w = iVar;
        this.f30x = kVar;
    }

    public final i a() {
        return this.f29w;
    }

    public final u.k<Float, u.m> b() {
        return this.f30x;
    }
}
