package h0;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final d f33749a = new d();

    /* renamed from: b  reason: collision with root package name */
    public static final float f33750b;

    /* renamed from: c  reason: collision with root package name */
    public static final float f33751c;

    /* renamed from: d  reason: collision with root package name */
    public static final y.t0 f33752d;

    /* renamed from: e  reason: collision with root package name */
    public static final float f33753e;

    /* renamed from: f  reason: collision with root package name */
    public static final float f33754f;

    /* renamed from: g  reason: collision with root package name */
    public static final float f33755g;

    /* renamed from: h  reason: collision with root package name */
    public static final float f33756h;

    /* renamed from: i  reason: collision with root package name */
    public static final float f33757i;

    /* renamed from: j  reason: collision with root package name */
    public static final float f33758j;

    /* renamed from: k  reason: collision with root package name */
    public static final y.t0 f33759k;

    static {
        float l10 = m2.g.l(16);
        f33750b = l10;
        float f10 = 8;
        float l11 = m2.g.l(f10);
        f33751c = l11;
        y.t0 d10 = y.r0.d(l10, l11, l10, l11);
        f33752d = d10;
        f33753e = m2.g.l(64);
        f33754f = m2.g.l(36);
        f33755g = m2.g.l(18);
        f33756h = m2.g.l(f10);
        f33757i = m2.g.l(1);
        float l12 = m2.g.l(f10);
        f33758j = l12;
        f33759k = y.r0.d(l12, d10.d(), l12, d10.a());
    }

    public final c a(long j10, long j11, long j12, long j13, l0.i iVar, int i10, int i11) {
        long j14;
        iVar.x(1870371134);
        long h10 = (i11 & 1) != 0 ? q0.f34133a.a(iVar, 6).h() : j10;
        long b10 = (i11 & 2) != 0 ? i.b(h10, iVar, i10 & 14) : j11;
        if ((i11 & 4) != 0) {
            q0 q0Var = q0.f34133a;
            j14 = c1.e0.e(c1.c0.k(q0Var.a(iVar, 6).g(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null), q0Var.a(iVar, 6).l());
        } else {
            j14 = j12;
        }
        q qVar = new q(h10, b10, j14, (i11 & 8) != 0 ? c1.c0.k(q0.f34133a.a(iVar, 6).g(), n.f34046a.b(iVar, 6), 0.0f, 0.0f, 0.0f, 14, null) : j13, null);
        iVar.O();
        return qVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x008c, code lost:
        if (r3 == l0.i.f39065a.a()) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final h0.e b(float r14, float r15, float r16, float r17, float r18, l0.i r19, int r20, int r21) {
        /*
            r13 = this;
            r0 = r19
            r1 = -737170518(0xffffffffd40fabaa, float:-2.46824147E12)
            r0.x(r1)
            r1 = r21 & 1
            r2 = 2
            if (r1 == 0) goto L14
            float r1 = (float) r2
            float r1 = m2.g.l(r1)
            r4 = r1
            goto L15
        L14:
            r4 = r14
        L15:
            r1 = r21 & 2
            if (r1 == 0) goto L22
            r1 = 8
            float r1 = (float) r1
            float r1 = m2.g.l(r1)
            r5 = r1
            goto L23
        L22:
            r5 = r15
        L23:
            r1 = r21 & 4
            r3 = 0
            if (r1 == 0) goto L2f
            float r1 = (float) r3
            float r1 = m2.g.l(r1)
            r6 = r1
            goto L31
        L2f:
            r6 = r16
        L31:
            r1 = r21 & 8
            r7 = 4
            if (r1 == 0) goto L3c
            float r1 = (float) r7
            float r1 = m2.g.l(r1)
            goto L3e
        L3c:
            r1 = r17
        L3e:
            r8 = r21 & 16
            if (r8 == 0) goto L48
            float r8 = (float) r7
            float r8 = m2.g.l(r8)
            goto L4a
        L48:
            r8 = r18
        L4a:
            r9 = 5
            java.lang.Object[] r10 = new java.lang.Object[r9]
            m2.g r11 = m2.g.e(r4)
            r10[r3] = r11
            m2.g r11 = m2.g.e(r5)
            r12 = 1
            r10[r12] = r11
            m2.g r11 = m2.g.e(r6)
            r10[r2] = r11
            r2 = 3
            m2.g r11 = m2.g.e(r1)
            r10[r2] = r11
            m2.g r2 = m2.g.e(r8)
            r10[r7] = r2
            r2 = -568225417(0xffffffffde219177, float:-2.91055434E18)
            r0.x(r2)
            r2 = r3
        L74:
            if (r3 >= r9) goto L80
            r7 = r10[r3]
            boolean r7 = r0.P(r7)
            r2 = r2 | r7
            int r3 = r3 + 1
            goto L74
        L80:
            java.lang.Object r3 = r19.y()
            if (r2 != 0) goto L8e
            l0.i$a r2 = l0.i.f39065a
            java.lang.Object r2 = r2.a()
            if (r3 != r2) goto L99
        L8e:
            h0.r r2 = new h0.r
            r9 = 0
            r3 = r2
            r7 = r1
            r3.<init>(r4, r5, r6, r7, r8, r9)
            r0.q(r2)
        L99:
            r19.O()
            h0.r r3 = (h0.r) r3
            r19.O()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: h0.d.b(float, float, float, float, float, l0.i, int, int):h0.e");
    }

    public final y.t0 c() {
        return f33752d;
    }

    public final float d() {
        return f33754f;
    }

    public final float e() {
        return f33753e;
    }

    public final v.h f(l0.i iVar, int i10) {
        iVar.x(-2091313033);
        v.h a10 = v.i.a(f33757i, c1.c0.k(q0.f34133a.a(iVar, 6).g(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null));
        iVar.O();
        return a10;
    }

    public final y.t0 g() {
        return f33759k;
    }

    public final c h(long j10, long j11, long j12, l0.i iVar, int i10, int i11) {
        iVar.x(-2124406093);
        long l10 = (i11 & 1) != 0 ? q0.f34133a.a(iVar, 6).l() : j10;
        q qVar = new q(l10, (i11 & 2) != 0 ? q0.f34133a.a(iVar, 6).h() : j11, l10, (i11 & 4) != 0 ? c1.c0.k(q0.f34133a.a(iVar, 6).g(), n.f34046a.b(iVar, 6), 0.0f, 0.0f, 0.0f, 14, null) : j12, null);
        iVar.O();
        return qVar;
    }

    public final c i(long j10, long j11, long j12, l0.i iVar, int i10, int i11) {
        iVar.x(182742216);
        long d10 = (i11 & 1) != 0 ? c1.c0.f18634b.d() : j10;
        q qVar = new q(d10, (i11 & 2) != 0 ? q0.f34133a.a(iVar, 6).h() : j11, d10, (i11 & 4) != 0 ? c1.c0.k(q0.f34133a.a(iVar, 6).g(), n.f34046a.b(iVar, 6), 0.0f, 0.0f, 0.0f, 14, null) : j12, null);
        iVar.O();
        return qVar;
    }
}
