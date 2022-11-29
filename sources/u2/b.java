package u2;

import java.util.ArrayList;
import t2.d;
import t2.e;

/* loaded from: classes.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList<t2.e> f54276a = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    public a f54277b = new a();

    /* renamed from: c  reason: collision with root package name */
    public t2.f f54278c;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: k  reason: collision with root package name */
        public static int f54279k = 0;

        /* renamed from: l  reason: collision with root package name */
        public static int f54280l = 1;

        /* renamed from: m  reason: collision with root package name */
        public static int f54281m = 2;

        /* renamed from: a  reason: collision with root package name */
        public e.b f54282a;

        /* renamed from: b  reason: collision with root package name */
        public e.b f54283b;

        /* renamed from: c  reason: collision with root package name */
        public int f54284c;

        /* renamed from: d  reason: collision with root package name */
        public int f54285d;

        /* renamed from: e  reason: collision with root package name */
        public int f54286e;

        /* renamed from: f  reason: collision with root package name */
        public int f54287f;

        /* renamed from: g  reason: collision with root package name */
        public int f54288g;

        /* renamed from: h  reason: collision with root package name */
        public boolean f54289h;

        /* renamed from: i  reason: collision with root package name */
        public boolean f54290i;

        /* renamed from: j  reason: collision with root package name */
        public int f54291j;
    }

    /* renamed from: u2.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0853b {
        void a();

        void b(t2.e eVar, a aVar);
    }

    public b(t2.f fVar) {
        this.f54278c = fVar;
    }

    public final boolean a(InterfaceC0853b interfaceC0853b, t2.e eVar, int i10) {
        this.f54277b.f54282a = eVar.y();
        this.f54277b.f54283b = eVar.O();
        this.f54277b.f54284c = eVar.R();
        this.f54277b.f54285d = eVar.v();
        a aVar = this.f54277b;
        aVar.f54290i = false;
        aVar.f54291j = i10;
        e.b bVar = aVar.f54282a;
        e.b bVar2 = e.b.MATCH_CONSTRAINT;
        boolean z10 = bVar == bVar2;
        boolean z11 = aVar.f54283b == bVar2;
        boolean z12 = z10 && eVar.f53058c0 > 0.0f;
        boolean z13 = z11 && eVar.f53058c0 > 0.0f;
        if (z12 && eVar.f53099x[0] == 4) {
            aVar.f54282a = e.b.FIXED;
        }
        if (z13 && eVar.f53099x[1] == 4) {
            aVar.f54283b = e.b.FIXED;
        }
        interfaceC0853b.b(eVar, aVar);
        eVar.b1(this.f54277b.f54286e);
        eVar.C0(this.f54277b.f54287f);
        eVar.B0(this.f54277b.f54289h);
        eVar.r0(this.f54277b.f54288g);
        a aVar2 = this.f54277b;
        aVar2.f54291j = a.f54279k;
        return aVar2.f54290i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x008d, code lost:
        if (r8 != r9) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0094, code lost:
        if (r5.f53058c0 <= 0.0f) goto L55;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(t2.f r13) {
        /*
            r12 = this;
            java.util.ArrayList<t2.e> r0 = r13.J0
            int r0 = r0.size()
            r1 = 64
            boolean r1 = r13.J1(r1)
            u2.b$b r2 = r13.z1()
            r3 = 0
            r4 = r3
        L12:
            if (r4 >= r0) goto La4
            java.util.ArrayList<t2.e> r5 = r13.J0
            java.lang.Object r5 = r5.get(r4)
            t2.e r5 = (t2.e) r5
            boolean r6 = r5 instanceof t2.g
            if (r6 == 0) goto L22
            goto La0
        L22:
            boolean r6 = r5 instanceof t2.a
            if (r6 == 0) goto L28
            goto La0
        L28:
            boolean r6 = r5.g0()
            if (r6 == 0) goto L30
            goto La0
        L30:
            if (r1 == 0) goto L47
            u2.l r6 = r5.f53061e
            if (r6 == 0) goto L47
            u2.n r7 = r5.f53063f
            if (r7 == 0) goto L47
            u2.g r6 = r6.f54351e
            boolean r6 = r6.f54312j
            if (r6 == 0) goto L47
            u2.g r6 = r7.f54351e
            boolean r6 = r6.f54312j
            if (r6 == 0) goto L47
            goto La0
        L47:
            t2.e$b r6 = r5.s(r3)
            r7 = 1
            t2.e$b r8 = r5.s(r7)
            t2.e$b r9 = t2.e.b.MATCH_CONSTRAINT
            if (r6 != r9) goto L60
            int r10 = r5.f53095v
            if (r10 == r7) goto L60
            if (r8 != r9) goto L60
            int r10 = r5.f53097w
            if (r10 == r7) goto L60
            r10 = r7
            goto L61
        L60:
            r10 = r3
        L61:
            if (r10 != 0) goto L97
            boolean r11 = r13.J1(r7)
            if (r11 == 0) goto L97
            boolean r11 = r5 instanceof t2.k
            if (r11 != 0) goto L97
            if (r6 != r9) goto L7c
            int r11 = r5.f53095v
            if (r11 != 0) goto L7c
            if (r8 == r9) goto L7c
            boolean r11 = r5.d0()
            if (r11 != 0) goto L7c
            r10 = r7
        L7c:
            if (r8 != r9) goto L8b
            int r11 = r5.f53097w
            if (r11 != 0) goto L8b
            if (r6 == r9) goto L8b
            boolean r11 = r5.d0()
            if (r11 != 0) goto L8b
            r10 = r7
        L8b:
            if (r6 == r9) goto L8f
            if (r8 != r9) goto L97
        L8f:
            float r6 = r5.f53058c0
            r8 = 0
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 <= 0) goto L97
            goto L98
        L97:
            r7 = r10
        L98:
            if (r7 == 0) goto L9b
            goto La0
        L9b:
            int r6 = u2.b.a.f54279k
            r12.a(r2, r5, r6)
        La0:
            int r4 = r4 + 1
            goto L12
        La4:
            r2.a()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: u2.b.b(t2.f):void");
    }

    public final void c(t2.f fVar, String str, int i10, int i11, int i12) {
        int G = fVar.G();
        int F = fVar.F();
        fVar.R0(0);
        fVar.Q0(0);
        fVar.b1(i11);
        fVar.C0(i12);
        fVar.R0(G);
        fVar.Q0(F);
        this.f54278c.N1(i10);
        this.f54278c.j1();
    }

    public long d(t2.f fVar, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        boolean z10;
        int i19;
        t2.f fVar2;
        int i20;
        boolean z11;
        int i21;
        int i22;
        boolean z12;
        b bVar = this;
        InterfaceC0853b z13 = fVar.z1();
        int size = fVar.J0.size();
        int R = fVar.R();
        int v10 = fVar.v();
        boolean b10 = t2.j.b(i10, 128);
        boolean z14 = b10 || t2.j.b(i10, 64);
        if (z14) {
            for (int i23 = 0; i23 < size; i23++) {
                t2.e eVar = fVar.J0.get(i23);
                e.b y10 = eVar.y();
                e.b bVar2 = e.b.MATCH_CONSTRAINT;
                boolean z15 = (y10 == bVar2) && (eVar.O() == bVar2) && eVar.t() > 0.0f;
                if ((eVar.d0() && z15) || ((eVar.f0() && z15) || (eVar instanceof t2.k) || eVar.d0() || eVar.f0())) {
                    z14 = false;
                    break;
                }
            }
        }
        if (z14) {
            q2.e eVar2 = q2.d.f48664x;
        }
        boolean z16 = z14 & ((i13 == 1073741824 && i15 == 1073741824) || b10);
        int i24 = 2;
        if (z16) {
            int min = Math.min(fVar.E(), i14);
            int min2 = Math.min(fVar.D(), i16);
            if (i13 == 1073741824 && fVar.R() != min) {
                fVar.b1(min);
                fVar.C1();
            }
            if (i15 == 1073741824 && fVar.v() != min2) {
                fVar.C0(min2);
                fVar.C1();
            }
            if (i13 == 1073741824 && i15 == 1073741824) {
                z10 = fVar.w1(b10);
                i19 = 2;
            } else {
                boolean x12 = fVar.x1(b10);
                if (i13 == 1073741824) {
                    x12 &= fVar.y1(b10, 0);
                    i19 = 1;
                } else {
                    i19 = 0;
                }
                if (i15 == 1073741824) {
                    z10 = fVar.y1(b10, 1) & x12;
                    i19++;
                } else {
                    z10 = x12;
                }
            }
            if (z10) {
                fVar.g1(i13 == 1073741824, i15 == 1073741824);
            }
        } else {
            z10 = false;
            i19 = 0;
        }
        if (z10 && i19 == 2) {
            return 0L;
        }
        int A1 = fVar.A1();
        if (size > 0) {
            b(fVar);
        }
        e(fVar);
        int size2 = bVar.f54276a.size();
        if (size > 0) {
            c(fVar, "First pass", 0, R, v10);
        }
        if (size2 > 0) {
            e.b y11 = fVar.y();
            e.b bVar3 = e.b.WRAP_CONTENT;
            boolean z17 = y11 == bVar3;
            boolean z18 = fVar.O() == bVar3;
            int max = Math.max(fVar.R(), bVar.f54278c.G());
            int max2 = Math.max(fVar.v(), bVar.f54278c.F());
            int i25 = 0;
            boolean z19 = false;
            while (i25 < size2) {
                t2.e eVar3 = bVar.f54276a.get(i25);
                if (eVar3 instanceof t2.k) {
                    int R2 = eVar3.R();
                    int v11 = eVar3.v();
                    i22 = A1;
                    boolean a10 = bVar.a(z13, eVar3, a.f54280l) | z19;
                    int R3 = eVar3.R();
                    int v12 = eVar3.v();
                    if (R3 != R2) {
                        eVar3.b1(R3);
                        if (z17 && eVar3.K() > max) {
                            max = Math.max(max, eVar3.K() + eVar3.m(d.b.RIGHT).e());
                        }
                        z12 = true;
                    } else {
                        z12 = a10;
                    }
                    if (v12 != v11) {
                        eVar3.C0(v12);
                        if (z18 && eVar3.p() > max2) {
                            max2 = Math.max(max2, eVar3.p() + eVar3.m(d.b.BOTTOM).e());
                        }
                        z12 = true;
                    }
                    z19 = z12 | ((t2.k) eVar3).m1();
                } else {
                    i22 = A1;
                }
                i25++;
                A1 = i22;
                i24 = 2;
            }
            int i26 = A1;
            int i27 = i24;
            int i28 = 0;
            while (i28 < i27) {
                int i29 = 0;
                while (i29 < size2) {
                    t2.e eVar4 = bVar.f54276a.get(i29);
                    if (((eVar4 instanceof t2.h) && !(eVar4 instanceof t2.k)) || (eVar4 instanceof t2.g) || eVar4.Q() == 8 || ((z16 && eVar4.f53061e.f54351e.f54312j && eVar4.f53063f.f54351e.f54312j) || (eVar4 instanceof t2.k))) {
                        z11 = z16;
                        i21 = size2;
                    } else {
                        int R4 = eVar4.R();
                        int v13 = eVar4.v();
                        z11 = z16;
                        int n10 = eVar4.n();
                        int i30 = a.f54280l;
                        i21 = size2;
                        if (i28 == 1) {
                            i30 = a.f54281m;
                        }
                        boolean a11 = bVar.a(z13, eVar4, i30) | z19;
                        int R5 = eVar4.R();
                        int v14 = eVar4.v();
                        if (R5 != R4) {
                            eVar4.b1(R5);
                            if (z17 && eVar4.K() > max) {
                                max = Math.max(max, eVar4.K() + eVar4.m(d.b.RIGHT).e());
                            }
                            a11 = true;
                        }
                        if (v14 != v13) {
                            eVar4.C0(v14);
                            if (z18 && eVar4.p() > max2) {
                                max2 = Math.max(max2, eVar4.p() + eVar4.m(d.b.BOTTOM).e());
                            }
                            a11 = true;
                        }
                        z19 = (!eVar4.U() || n10 == eVar4.n()) ? a11 : true;
                    }
                    i29++;
                    bVar = this;
                    z16 = z11;
                    size2 = i21;
                }
                boolean z20 = z16;
                int i31 = size2;
                if (!z19) {
                    break;
                }
                i28++;
                c(fVar, "intermediate pass", i28, R, v10);
                bVar = this;
                z16 = z20;
                size2 = i31;
                i27 = 2;
                z19 = false;
            }
            fVar2 = fVar;
            i20 = i26;
        } else {
            fVar2 = fVar;
            i20 = A1;
        }
        fVar2.M1(i20);
        return 0L;
    }

    public void e(t2.f fVar) {
        this.f54276a.clear();
        int size = fVar.J0.size();
        for (int i10 = 0; i10 < size; i10++) {
            t2.e eVar = fVar.J0.get(i10);
            e.b y10 = eVar.y();
            e.b bVar = e.b.MATCH_CONSTRAINT;
            if (y10 == bVar || eVar.O() == bVar) {
                this.f54276a.add(eVar);
            }
        }
        fVar.C1();
    }
}
