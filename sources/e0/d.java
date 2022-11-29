package e0;

import jo.h;
import jo.p;

/* loaded from: classes.dex */
public final class d implements b {

    /* renamed from: a  reason: collision with root package name */
    public final float f30027a;

    public d(float f10) {
        this.f30027a = f10;
    }

    public /* synthetic */ d(float f10, h hVar) {
        this(f10);
    }

    @Override // e0.b
    public float a(long j10, m2.d dVar) {
        p.h(dVar, "density");
        return dVar.I0(this.f30027a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && m2.g.n(this.f30027a, ((d) obj).f30027a);
    }

    public int hashCode() {
        return m2.g.o(this.f30027a);
    }

    public String toString() {
        return "CornerSize(size = " + this.f30027a + ".dp)";
    }
}
