package f0;

/* loaded from: classes.dex */
public final class u0 {
    public static final long b(long j10, b1.h hVar) {
        float j11;
        float e10;
        if (b1.f.m(j10) < hVar.i()) {
            j11 = hVar.i();
        } else {
            j11 = b1.f.m(j10) > hVar.j() ? hVar.j() : b1.f.m(j10);
        }
        if (b1.f.n(j10) < hVar.l()) {
            e10 = hVar.l();
        } else {
            e10 = b1.f.n(j10) > hVar.e() ? hVar.e() : b1.f.n(j10);
        }
        return b1.g.a(j11, e10);
    }
}
