package s1;

import c1.i0;
import c1.s0;
import c1.t0;
import q1.q0;
import s1.k;

/* loaded from: classes.dex */
public final class h extends p implements m2.d {
    public static final a Z = new a(null);

    /* renamed from: a0  reason: collision with root package name */
    public static final s0 f51852a0;
    public final /* synthetic */ q1.e0 Y;

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }
    }

    static {
        s0 a10 = c1.i.a();
        a10.l(c1.c0.f18634b.c());
        a10.w(1.0f);
        a10.v(t0.f18770a.b());
        f51852a0 = a10;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(k kVar) {
        super(kVar);
        jo.p.h(kVar, "layoutNode");
        this.Y = kVar.k0();
    }

    @Override // s1.p
    public q1.e0 B1() {
        return z1().k0();
    }

    @Override // q1.l
    public int E(int i10) {
        return z1().d0().e(i10);
    }

    @Override // q1.l
    public int G(int i10) {
        return z1().d0().b(i10);
    }

    @Override // m2.d
    public float G0() {
        return this.Y.G0();
    }

    @Override // m2.d
    public float I0(float f10) {
        return this.Y.I0(f10);
    }

    @Override // q1.b0
    public q0 M(long j10) {
        E0(j10);
        m0.e<k> A0 = z1().A0();
        int p10 = A0.p();
        if (p10 > 0) {
            int i10 = 0;
            k[] n10 = A0.n();
            do {
                n10[i10].r1(k.i.NotUsed);
                i10++;
            } while (i10 < p10);
            z1().B0(z1().j0().c(z1().k0(), z1().W(), j10));
            X1();
            return this;
        }
        z1().B0(z1().j0().c(z1().k0(), z1().W(), j10));
        X1();
        return this;
    }

    @Override // m2.d
    public int N0(long j10) {
        return this.Y.N0(j10);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009f A[EDGE_INSN: B:39:0x009f->B:37:0x009f ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    @Override // s1.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public <T extends s1.n<T, M>, C, M extends x0.f> void N1(s1.p.f<T, C, M> r20, long r21, s1.f<C> r23, boolean r24, boolean r25) {
        /*
            r19 = this;
            r0 = r19
            r8 = r20
            r9 = r21
            r11 = r23
            java.lang.String r1 = "hitTestSource"
            jo.p.h(r8, r1)
            java.lang.String r1 = "hitTestResult"
            jo.p.h(r11, r1)
            s1.k r1 = r19.z1()
            boolean r1 = r8.b(r1)
            r12 = 0
            r13 = 1
            if (r1 == 0) goto L45
            boolean r1 = r0.l2(r9)
            if (r1 == 0) goto L28
            r14 = r25
        L26:
            r1 = r13
            goto L48
        L28:
            if (r24 == 0) goto L45
            long r1 = r19.C1()
            float r1 = r0.n1(r9, r1)
            boolean r2 = java.lang.Float.isInfinite(r1)
            if (r2 != 0) goto L40
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L40
            r1 = r13
            goto L41
        L40:
            r1 = r12
        L41:
            if (r1 == 0) goto L45
            r14 = r12
            goto L26
        L45:
            r14 = r25
            r1 = r12
        L48:
            if (r1 == 0) goto La2
            int r15 = s1.f.f(r23)
            s1.k r1 = r19.z1()
            m0.e r1 = r1.z0()
            int r2 = r1.p()
            if (r2 <= 0) goto L9f
            int r2 = r2 - r13
            java.lang.Object[] r16 = r1.n()
            r17 = r2
        L63:
            r1 = r16[r17]
            r18 = r1
            s1.k r18 = (s1.k) r18
            boolean r1 = r18.g()
            if (r1 == 0) goto L98
            r1 = r20
            r2 = r18
            r3 = r21
            r5 = r23
            r6 = r24
            r7 = r14
            r1.c(r2, r3, r5, r6, r7)
            boolean r1 = r23.r()
            if (r1 != 0) goto L85
        L83:
            r1 = r13
            goto L94
        L85:
            s1.p r1 = r18.s0()
            boolean r1 = r1.g2()
            if (r1 == 0) goto L93
            r23.d()
            goto L83
        L93:
            r1 = r12
        L94:
            if (r1 != 0) goto L98
            r1 = r13
            goto L99
        L98:
            r1 = r12
        L99:
            if (r1 != 0) goto L9f
            int r17 = r17 + (-1)
            if (r17 >= 0) goto L63
        L9f:
            s1.f.j(r11, r15)
        La2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: s1.h.N1(s1.p$f, long, s1.f, boolean, boolean):void");
    }

    @Override // m2.d
    public long W0(long j10) {
        return this.Y.W0(j10);
    }

    @Override // m2.d
    public int X(float f10) {
        return this.Y.X(f10);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    @Override // s1.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a2(c1.w r7) {
        /*
            r6 = this;
            java.lang.String r0 = "canvas"
            jo.p.h(r7, r0)
            s1.k r0 = r6.z1()
            s1.y r0 = s1.o.a(r0)
            s1.k r1 = r6.z1()
            m0.e r1 = r1.z0()
            int r2 = r1.p()
            if (r2 <= 0) goto L31
            r3 = 0
            java.lang.Object[] r1 = r1.n()
        L20:
            r4 = r1[r3]
            s1.k r4 = (s1.k) r4
            boolean r5 = r4.g()
            if (r5 == 0) goto L2d
            r4.S(r7)
        L2d:
            int r3 = r3 + 1
            if (r3 < r2) goto L20
        L31:
            boolean r0 = r0.getShowLayoutBounds()
            if (r0 == 0) goto L3c
            c1.s0 r0 = s1.h.f51852a0
            r6.p1(r7, r0)
        L3c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: s1.h.a2(c1.w):void");
    }

    @Override // m2.d
    public float c0(long j10) {
        return this.Y.c0(j10);
    }

    @Override // q1.l
    public int e(int i10) {
        return z1().d0().a(i10);
    }

    @Override // m2.d
    public long f(long j10) {
        return this.Y.f(j10);
    }

    @Override // m2.d
    public float getDensity() {
        return this.Y.getDensity();
    }

    @Override // s1.p
    public int k1(q1.a aVar) {
        jo.p.h(aVar, "alignmentLine");
        Integer num = z1().J().get(aVar);
        if (num != null) {
            return num.intValue();
        }
        return Integer.MIN_VALUE;
    }

    @Override // m2.d
    public float s(int i10) {
        return this.Y.s(i10);
    }

    @Override // m2.d
    public float t(float f10) {
        return this.Y.t(f10);
    }

    @Override // q1.l
    public int u(int i10) {
        return z1().d0().d(i10);
    }

    @Override // s1.p, q1.q0
    public void v0(long j10, float f10, io.l<? super i0, wn.v> lVar) {
        super.v0(j10, f10, lVar);
        p I1 = I1();
        boolean z10 = true;
        if (I1 == null || !I1.R1()) {
            z10 = false;
        }
        if (z10) {
            return;
        }
        Z1();
        z1().X0();
    }
}
