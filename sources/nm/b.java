package nm;

import tm.g;

/* loaded from: classes4.dex */
public final class b extends e {

    /* renamed from: a  reason: collision with root package name */
    public final g f43705a;

    public b(g gVar) {
        this.f43705a = gVar;
    }

    @Override // nm.e
    public boolean c() {
        return this.f43705a.d0() && (this.f43705a.Z() > 0 || this.f43705a.Y() > 0 || (this.f43705a.c0() && this.f43705a.b0().V()));
    }
}
