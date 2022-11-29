package h0;

/* loaded from: classes.dex */
public final class k0 {

    /* renamed from: a  reason: collision with root package name */
    public static final k0 f33936a = new k0();

    public final l0 a(float f10, float f11, float f12, float f13, l0.i iVar, int i10, int i11) {
        iVar.x(380403812);
        if ((i11 & 1) != 0) {
            f10 = m2.g.l(6);
        }
        float f14 = f10;
        if ((i11 & 2) != 0) {
            f11 = m2.g.l(12);
        }
        float f15 = f11;
        if ((i11 & 4) != 0) {
            f12 = m2.g.l(8);
        }
        float f16 = f12;
        if ((i11 & 8) != 0) {
            f13 = m2.g.l(8);
        }
        float f17 = f13;
        Object[] objArr = {m2.g.e(f14), m2.g.e(f15), m2.g.e(f16), m2.g.e(f17)};
        iVar.x(-568225417);
        boolean z10 = false;
        for (int i12 = 0; i12 < 4; i12++) {
            z10 |= iVar.P(objArr[i12]);
        }
        Object y10 = iVar.y();
        if (z10 || y10 == l0.i.f39065a.a()) {
            y10 = new t(f14, f15, f16, f17, null);
            iVar.q(y10);
        }
        iVar.O();
        t tVar = (t) y10;
        iVar.O();
        return tVar;
    }
}
