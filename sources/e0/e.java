package e0;

import b1.l;
import jo.p;

/* loaded from: classes.dex */
public final class e implements b {

    /* renamed from: a  reason: collision with root package name */
    public final float f30028a;

    public e(float f10) {
        this.f30028a = f10;
        if (f10 < 0.0f || f10 > 100.0f) {
            throw new IllegalArgumentException("The percent should be in the range of [0, 100]");
        }
    }

    @Override // e0.b
    public float a(long j10, m2.d dVar) {
        p.h(dVar, "density");
        return l.h(j10) * (this.f30028a / 100.0f);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && p.c(Float.valueOf(this.f30028a), Float.valueOf(((e) obj).f30028a));
    }

    public int hashCode() {
        return Float.hashCode(this.f30028a);
    }

    public String toString() {
        return "CornerSize(size = " + this.f30028a + "%)";
    }
}
