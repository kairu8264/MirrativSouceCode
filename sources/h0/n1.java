package h0;

/* loaded from: classes.dex */
public final class n1 {

    /* renamed from: a  reason: collision with root package name */
    public static final n1 f34048a = new n1();

    public final m1 a(long j10, long j11, float f10, long j12, long j13, float f11, long j14, long j15, long j16, long j17, l0.i iVar, int i10, int i11, int i12) {
        long j18;
        long j19;
        float f12;
        long j20;
        long j21;
        int i13;
        long j22;
        iVar.x(-1032127534);
        long k10 = (i12 & 1) != 0 ? q0.f34133a.a(iVar, 6).k() : j10;
        long j23 = (i12 & 2) != 0 ? k10 : j11;
        float f13 = (i12 & 4) != 0 ? 0.54f : f10;
        long l10 = (i12 & 8) != 0 ? q0.f34133a.a(iVar, 6).l() : j12;
        long g10 = (i12 & 16) != 0 ? q0.f34133a.a(iVar, 6).g() : j13;
        float f14 = (i12 & 32) != 0 ? 0.38f : f11;
        if ((i12 & 64) != 0) {
            j18 = k10;
            j19 = c1.e0.e(c1.c0.k(k10, n.f34046a.b(iVar, 6), 0.0f, 0.0f, 0.0f, 14, null), q0.f34133a.a(iVar, 6).l());
        } else {
            j18 = k10;
            j19 = j14;
        }
        if ((i12 & 128) != 0) {
            f12 = f14;
            j20 = c1.e0.e(c1.c0.k(j23, n.f34046a.b(iVar, 6), 0.0f, 0.0f, 0.0f, 14, null), q0.f34133a.a(iVar, 6).l());
        } else {
            f12 = f14;
            j20 = j15;
        }
        if ((i12 & 256) != 0) {
            j21 = j19;
            i13 = 6;
            j22 = c1.e0.e(c1.c0.k(l10, n.f34046a.b(iVar, 6), 0.0f, 0.0f, 0.0f, 14, null), q0.f34133a.a(iVar, 6).l());
        } else {
            j21 = j19;
            i13 = 6;
            j22 = j16;
        }
        u uVar = new u(j18, c1.c0.k(j23, f13, 0.0f, 0.0f, 0.0f, 14, null), l10, c1.c0.k(g10, f12, 0.0f, 0.0f, 0.0f, 14, null), j21, c1.c0.k(j20, f13, 0.0f, 0.0f, 0.0f, 14, null), j22, c1.c0.k((i12 & 512) != 0 ? c1.e0.e(c1.c0.k(g10, n.f34046a.b(iVar, i13), 0.0f, 0.0f, 0.0f, 14, null), q0.f34133a.a(iVar, 6).l()) : j17, f12, 0.0f, 0.0f, 0.0f, 14, null), null);
        iVar.O();
        return uVar;
    }
}
