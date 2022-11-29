package h0;

/* loaded from: classes.dex */
public final class v1 {

    /* renamed from: a  reason: collision with root package name */
    public static final v1 f34296a = new v1();

    /* renamed from: b  reason: collision with root package name */
    public static final float f34297b = m2.g.l(56);

    /* renamed from: c  reason: collision with root package name */
    public static final float f34298c = m2.g.l(280);

    /* renamed from: d  reason: collision with root package name */
    public static final float f34299d = m2.g.l(1);

    /* renamed from: e  reason: collision with root package name */
    public static final float f34300e = m2.g.l(2);

    public final u1 a(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, l0.i iVar, int i10, int i11, int i12, int i13) {
        iVar.x(231892599);
        long k10 = (i13 & 1) != 0 ? c1.c0.k(((c1.c0) iVar.G(p.a())).u(), ((Number) iVar.G(o.a())).floatValue(), 0.0f, 0.0f, 0.0f, 14, null) : j10;
        long k11 = (i13 & 2) != 0 ? c1.c0.k(k10, n.f34046a.b(iVar, 6), 0.0f, 0.0f, 0.0f, 14, null) : j11;
        long k12 = (i13 & 4) != 0 ? c1.c0.k(q0.f34133a.a(iVar, 6).g(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null) : j12;
        long h10 = (i13 & 8) != 0 ? q0.f34133a.a(iVar, 6).h() : j13;
        long b10 = (i13 & 16) != 0 ? q0.f34133a.a(iVar, 6).b() : j14;
        long k13 = (i13 & 32) != 0 ? c1.c0.k(q0.f34133a.a(iVar, 6).h(), n.f34046a.c(iVar, 6), 0.0f, 0.0f, 0.0f, 14, null) : j15;
        long k14 = (i13 & 64) != 0 ? c1.c0.k(q0.f34133a.a(iVar, 6).g(), 0.42f, 0.0f, 0.0f, 0.0f, 14, null) : j16;
        long k15 = (i13 & 128) != 0 ? c1.c0.k(k14, n.f34046a.b(iVar, 6), 0.0f, 0.0f, 0.0f, 14, null) : j17;
        long b11 = (i13 & 256) != 0 ? q0.f34133a.a(iVar, 6).b() : j18;
        long k16 = (i13 & 512) != 0 ? c1.c0.k(q0.f34133a.a(iVar, 6).g(), 0.54f, 0.0f, 0.0f, 0.0f, 14, null) : j19;
        long k17 = (i13 & 1024) != 0 ? c1.c0.k(k16, n.f34046a.b(iVar, 6), 0.0f, 0.0f, 0.0f, 14, null) : j20;
        long j31 = (i13 & 2048) != 0 ? k16 : j21;
        long k18 = (i13 & 4096) != 0 ? c1.c0.k(q0.f34133a.a(iVar, 6).g(), 0.54f, 0.0f, 0.0f, 0.0f, 14, null) : j22;
        long k19 = (i13 & 8192) != 0 ? c1.c0.k(k18, n.f34046a.b(iVar, 6), 0.0f, 0.0f, 0.0f, 14, null) : j23;
        long b12 = (i13 & 16384) != 0 ? q0.f34133a.a(iVar, 6).b() : j24;
        long k20 = (32768 & i13) != 0 ? c1.c0.k(q0.f34133a.a(iVar, 6).h(), n.f34046a.c(iVar, 6), 0.0f, 0.0f, 0.0f, 14, null) : j25;
        long k21 = (65536 & i13) != 0 ? c1.c0.k(q0.f34133a.a(iVar, 6).g(), n.f34046a.d(iVar, 6), 0.0f, 0.0f, 0.0f, 14, null) : j26;
        long k22 = (131072 & i13) != 0 ? c1.c0.k(k21, n.f34046a.b(iVar, 6), 0.0f, 0.0f, 0.0f, 14, null) : j27;
        long b13 = (262144 & i13) != 0 ? q0.f34133a.a(iVar, 6).b() : j28;
        long k23 = (524288 & i13) != 0 ? c1.c0.k(q0.f34133a.a(iVar, 6).g(), n.f34046a.d(iVar, 6), 0.0f, 0.0f, 0.0f, 14, null) : j29;
        v vVar = new v(k10, k11, h10, b10, k13, k14, b11, k15, k16, k17, j31, k18, k19, b12, k12, k20, k21, k22, b13, k23, (i13 & 1048576) != 0 ? c1.c0.k(k23, n.f34046a.b(iVar, 6), 0.0f, 0.0f, 0.0f, 14, null) : j30, null);
        iVar.O();
        return vVar;
    }
}
