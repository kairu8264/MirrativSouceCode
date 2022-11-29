package q2;

import java.util.Arrays;
import java.util.HashMap;
import q2.i;
import t2.d;

/* loaded from: classes.dex */
public class d {

    /* renamed from: r  reason: collision with root package name */
    public static boolean f48658r = false;

    /* renamed from: s  reason: collision with root package name */
    public static boolean f48659s = true;

    /* renamed from: t  reason: collision with root package name */
    public static boolean f48660t = true;

    /* renamed from: u  reason: collision with root package name */
    public static boolean f48661u = true;

    /* renamed from: v  reason: collision with root package name */
    public static boolean f48662v = false;

    /* renamed from: w  reason: collision with root package name */
    public static int f48663w = 1000;

    /* renamed from: x  reason: collision with root package name */
    public static e f48664x;

    /* renamed from: y  reason: collision with root package name */
    public static long f48665y;

    /* renamed from: z  reason: collision with root package name */
    public static long f48666z;

    /* renamed from: d  reason: collision with root package name */
    public a f48670d;

    /* renamed from: g  reason: collision with root package name */
    public q2.b[] f48673g;

    /* renamed from: n  reason: collision with root package name */
    public final c f48680n;

    /* renamed from: q  reason: collision with root package name */
    public a f48683q;

    /* renamed from: a  reason: collision with root package name */
    public boolean f48667a = false;

    /* renamed from: b  reason: collision with root package name */
    public int f48668b = 0;

    /* renamed from: c  reason: collision with root package name */
    public HashMap<String, i> f48669c = null;

    /* renamed from: e  reason: collision with root package name */
    public int f48671e = 32;

    /* renamed from: f  reason: collision with root package name */
    public int f48672f = 32;

    /* renamed from: h  reason: collision with root package name */
    public boolean f48674h = false;

    /* renamed from: i  reason: collision with root package name */
    public boolean f48675i = false;

    /* renamed from: j  reason: collision with root package name */
    public boolean[] f48676j = new boolean[32];

    /* renamed from: k  reason: collision with root package name */
    public int f48677k = 1;

    /* renamed from: l  reason: collision with root package name */
    public int f48678l = 0;

    /* renamed from: m  reason: collision with root package name */
    public int f48679m = 32;

    /* renamed from: o  reason: collision with root package name */
    public i[] f48681o = new i[f48663w];

    /* renamed from: p  reason: collision with root package name */
    public int f48682p = 0;

    /* loaded from: classes.dex */
    public interface a {
        void a(a aVar);

        void b(i iVar);

        i c(d dVar, boolean[] zArr);

        void clear();

        i getKey();

        boolean isEmpty();
    }

    /* loaded from: classes.dex */
    public class b extends q2.b {
        public b(c cVar) {
            this.f48652e = new j(this, cVar);
        }
    }

    public d() {
        this.f48673g = null;
        this.f48673g = new q2.b[32];
        C();
        c cVar = new c();
        this.f48680n = cVar;
        this.f48670d = new h(cVar);
        if (f48662v) {
            this.f48683q = new b(cVar);
        } else {
            this.f48683q = new q2.b(cVar);
        }
    }

    public static q2.b s(d dVar, i iVar, i iVar2, float f10) {
        return dVar.r().j(iVar, iVar2, f10);
    }

    public static e w() {
        return f48664x;
    }

    public void A(a aVar) throws Exception {
        u(aVar);
        B(aVar, false);
        n();
    }

    public final int B(a aVar, boolean z10) {
        for (int i10 = 0; i10 < this.f48677k; i10++) {
            this.f48676j[i10] = false;
        }
        boolean z11 = false;
        int i11 = 0;
        while (!z11) {
            i11++;
            if (i11 >= this.f48677k * 2) {
                return i11;
            }
            if (aVar.getKey() != null) {
                this.f48676j[aVar.getKey().f48699y] = true;
            }
            i c10 = aVar.c(this, this.f48676j);
            if (c10 != null) {
                boolean[] zArr = this.f48676j;
                int i12 = c10.f48699y;
                if (zArr[i12]) {
                    return i11;
                }
                zArr[i12] = true;
            }
            if (c10 != null) {
                float f10 = Float.MAX_VALUE;
                int i13 = -1;
                for (int i14 = 0; i14 < this.f48678l; i14++) {
                    q2.b bVar = this.f48673g[i14];
                    if (bVar.f48648a.F != i.a.UNRESTRICTED && !bVar.f48653f && bVar.t(c10)) {
                        float e10 = bVar.f48652e.e(c10);
                        if (e10 < 0.0f) {
                            float f11 = (-bVar.f48649b) / e10;
                            if (f11 < f10) {
                                i13 = i14;
                                f10 = f11;
                            }
                        }
                    }
                }
                if (i13 > -1) {
                    q2.b bVar2 = this.f48673g[i13];
                    bVar2.f48648a.f48700z = -1;
                    bVar2.x(c10);
                    i iVar = bVar2.f48648a;
                    iVar.f48700z = i13;
                    iVar.n(this, bVar2);
                }
            } else {
                z11 = true;
            }
        }
        return i11;
    }

    public final void C() {
        int i10 = 0;
        if (f48662v) {
            while (i10 < this.f48678l) {
                q2.b bVar = this.f48673g[i10];
                if (bVar != null) {
                    this.f48680n.f48654a.a(bVar);
                }
                this.f48673g[i10] = null;
                i10++;
            }
            return;
        }
        while (i10 < this.f48678l) {
            q2.b bVar2 = this.f48673g[i10];
            if (bVar2 != null) {
                this.f48680n.f48655b.a(bVar2);
            }
            this.f48673g[i10] = null;
            i10++;
        }
    }

    public void D() {
        c cVar;
        int i10 = 0;
        while (true) {
            cVar = this.f48680n;
            i[] iVarArr = cVar.f48657d;
            if (i10 >= iVarArr.length) {
                break;
            }
            i iVar = iVarArr[i10];
            if (iVar != null) {
                iVar.i();
            }
            i10++;
        }
        cVar.f48656c.b(this.f48681o, this.f48682p);
        this.f48682p = 0;
        Arrays.fill(this.f48680n.f48657d, (Object) null);
        HashMap<String, i> hashMap = this.f48669c;
        if (hashMap != null) {
            hashMap.clear();
        }
        this.f48668b = 0;
        this.f48670d.clear();
        this.f48677k = 1;
        for (int i11 = 0; i11 < this.f48678l; i11++) {
            q2.b[] bVarArr = this.f48673g;
            if (bVarArr[i11] != null) {
                bVarArr[i11].f48650c = false;
            }
        }
        C();
        this.f48678l = 0;
        if (f48662v) {
            this.f48683q = new b(this.f48680n);
        } else {
            this.f48683q = new q2.b(this.f48680n);
        }
    }

    public final i a(i.a aVar, String str) {
        i acquire = this.f48680n.f48656c.acquire();
        if (acquire == null) {
            acquire = new i(aVar, str);
            acquire.m(aVar, str);
        } else {
            acquire.i();
            acquire.m(aVar, str);
        }
        int i10 = this.f48682p;
        int i11 = f48663w;
        if (i10 >= i11) {
            int i12 = i11 * 2;
            f48663w = i12;
            this.f48681o = (i[]) Arrays.copyOf(this.f48681o, i12);
        }
        i[] iVarArr = this.f48681o;
        int i13 = this.f48682p;
        this.f48682p = i13 + 1;
        iVarArr[i13] = acquire;
        return acquire;
    }

    public void b(t2.e eVar, t2.e eVar2, float f10, int i10) {
        d.b bVar = d.b.LEFT;
        i q10 = q(eVar.m(bVar));
        d.b bVar2 = d.b.TOP;
        i q11 = q(eVar.m(bVar2));
        d.b bVar3 = d.b.RIGHT;
        i q12 = q(eVar.m(bVar3));
        d.b bVar4 = d.b.BOTTOM;
        i q13 = q(eVar.m(bVar4));
        i q14 = q(eVar2.m(bVar));
        i q15 = q(eVar2.m(bVar2));
        i q16 = q(eVar2.m(bVar3));
        i q17 = q(eVar2.m(bVar4));
        q2.b r10 = r();
        double d10 = f10;
        double d11 = i10;
        r10.q(q11, q13, q15, q17, (float) (Math.sin(d10) * d11));
        d(r10);
        q2.b r11 = r();
        r11.q(q10, q12, q14, q16, (float) (Math.cos(d10) * d11));
        d(r11);
    }

    public void c(i iVar, i iVar2, int i10, float f10, i iVar3, i iVar4, int i11, int i12) {
        q2.b r10 = r();
        r10.h(iVar, iVar2, i10, f10, iVar3, iVar4, i11);
        if (i12 != 8) {
            r10.d(this, i12);
        }
        d(r10);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0082 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0083  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void d(q2.b r6) {
        /*
            r5 = this;
            if (r6 != 0) goto L3
            return
        L3:
            int r0 = r5.f48678l
            r1 = 1
            int r0 = r0 + r1
            int r2 = r5.f48679m
            if (r0 >= r2) goto L12
            int r0 = r5.f48677k
            int r0 = r0 + r1
            int r2 = r5.f48672f
            if (r0 < r2) goto L15
        L12:
            r5.y()
        L15:
            r0 = 0
            boolean r2 = r6.f48653f
            if (r2 != 0) goto L84
            r6.D(r5)
            boolean r2 = r6.isEmpty()
            if (r2 == 0) goto L24
            return
        L24:
            r6.r()
            boolean r2 = r6.f(r5)
            if (r2 == 0) goto L7b
            q2.i r2 = r5.p()
            r6.f48648a = r2
            int r3 = r5.f48678l
            r5.l(r6)
            int r4 = r5.f48678l
            int r3 = r3 + r1
            if (r4 != r3) goto L7b
            q2.d$a r0 = r5.f48683q
            r0.a(r6)
            q2.d$a r0 = r5.f48683q
            r5.B(r0, r1)
            int r0 = r2.f48700z
            r3 = -1
            if (r0 != r3) goto L7c
            q2.i r0 = r6.f48648a
            if (r0 != r2) goto L59
            q2.i r0 = r6.v(r2)
            if (r0 == 0) goto L59
            r6.x(r0)
        L59:
            boolean r0 = r6.f48653f
            if (r0 != 0) goto L62
            q2.i r0 = r6.f48648a
            r0.n(r5, r6)
        L62:
            boolean r0 = q2.d.f48662v
            if (r0 == 0) goto L6e
            q2.c r0 = r5.f48680n
            q2.f<q2.b> r0 = r0.f48654a
            r0.a(r6)
            goto L75
        L6e:
            q2.c r0 = r5.f48680n
            q2.f<q2.b> r0 = r0.f48655b
            r0.a(r6)
        L75:
            int r0 = r5.f48678l
            int r0 = r0 - r1
            r5.f48678l = r0
            goto L7c
        L7b:
            r1 = r0
        L7c:
            boolean r0 = r6.s()
            if (r0 != 0) goto L83
            return
        L83:
            r0 = r1
        L84:
            if (r0 != 0) goto L89
            r5.l(r6)
        L89:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: q2.d.d(q2.b):void");
    }

    public q2.b e(i iVar, i iVar2, int i10, int i11) {
        if (f48659s && i11 == 8 && iVar2.C && iVar.f48700z == -1) {
            iVar.l(this, iVar2.B + i10);
            return null;
        }
        q2.b r10 = r();
        r10.n(iVar, iVar2, i10);
        if (i11 != 8) {
            r10.d(this, i11);
        }
        d(r10);
        return r10;
    }

    public void f(i iVar, int i10) {
        if (f48659s && iVar.f48700z == -1) {
            float f10 = i10;
            iVar.l(this, f10);
            for (int i11 = 0; i11 < this.f48668b + 1; i11++) {
                i iVar2 = this.f48680n.f48657d[i11];
                if (iVar2 != null && iVar2.J && iVar2.K == iVar.f48699y) {
                    iVar2.l(this, iVar2.L + f10);
                }
            }
            return;
        }
        int i12 = iVar.f48700z;
        if (i12 != -1) {
            q2.b bVar = this.f48673g[i12];
            if (bVar.f48653f) {
                bVar.f48649b = i10;
                return;
            } else if (bVar.f48652e.h() == 0) {
                bVar.f48653f = true;
                bVar.f48649b = i10;
                return;
            } else {
                q2.b r10 = r();
                r10.m(iVar, i10);
                d(r10);
                return;
            }
        }
        q2.b r11 = r();
        r11.i(iVar, i10);
        d(r11);
    }

    public void g(i iVar, i iVar2, int i10, boolean z10) {
        q2.b r10 = r();
        i t10 = t();
        t10.A = 0;
        r10.o(iVar, iVar2, t10, i10);
        d(r10);
    }

    public void h(i iVar, i iVar2, int i10, int i11) {
        q2.b r10 = r();
        i t10 = t();
        t10.A = 0;
        r10.o(iVar, iVar2, t10, i10);
        if (i11 != 8) {
            m(r10, (int) (r10.f48652e.e(t10) * (-1.0f)), i11);
        }
        d(r10);
    }

    public void i(i iVar, i iVar2, int i10, boolean z10) {
        q2.b r10 = r();
        i t10 = t();
        t10.A = 0;
        r10.p(iVar, iVar2, t10, i10);
        d(r10);
    }

    public void j(i iVar, i iVar2, int i10, int i11) {
        q2.b r10 = r();
        i t10 = t();
        t10.A = 0;
        r10.p(iVar, iVar2, t10, i10);
        if (i11 != 8) {
            m(r10, (int) (r10.f48652e.e(t10) * (-1.0f)), i11);
        }
        d(r10);
    }

    public void k(i iVar, i iVar2, i iVar3, i iVar4, float f10, int i10) {
        q2.b r10 = r();
        r10.k(iVar, iVar2, iVar3, iVar4, f10);
        if (i10 != 8) {
            r10.d(this, i10);
        }
        d(r10);
    }

    public final void l(q2.b bVar) {
        int i10;
        if (f48660t && bVar.f48653f) {
            bVar.f48648a.l(this, bVar.f48649b);
        } else {
            q2.b[] bVarArr = this.f48673g;
            int i11 = this.f48678l;
            bVarArr[i11] = bVar;
            i iVar = bVar.f48648a;
            iVar.f48700z = i11;
            this.f48678l = i11 + 1;
            iVar.n(this, bVar);
        }
        if (f48660t && this.f48667a) {
            int i12 = 0;
            while (i12 < this.f48678l) {
                if (this.f48673g[i12] == null) {
                    System.out.println("WTF");
                }
                q2.b[] bVarArr2 = this.f48673g;
                if (bVarArr2[i12] != null && bVarArr2[i12].f48653f) {
                    q2.b bVar2 = bVarArr2[i12];
                    bVar2.f48648a.l(this, bVar2.f48649b);
                    if (f48662v) {
                        this.f48680n.f48654a.a(bVar2);
                    } else {
                        this.f48680n.f48655b.a(bVar2);
                    }
                    this.f48673g[i12] = null;
                    int i13 = i12 + 1;
                    int i14 = i13;
                    while (true) {
                        i10 = this.f48678l;
                        if (i13 >= i10) {
                            break;
                        }
                        q2.b[] bVarArr3 = this.f48673g;
                        int i15 = i13 - 1;
                        bVarArr3[i15] = bVarArr3[i13];
                        if (bVarArr3[i15].f48648a.f48700z == i13) {
                            bVarArr3[i15].f48648a.f48700z = i15;
                        }
                        i14 = i13;
                        i13++;
                    }
                    if (i14 < i10) {
                        this.f48673g[i14] = null;
                    }
                    this.f48678l = i10 - 1;
                    i12--;
                }
                i12++;
            }
            this.f48667a = false;
        }
    }

    public void m(q2.b bVar, int i10, int i11) {
        bVar.e(o(i11, null), i10);
    }

    public final void n() {
        for (int i10 = 0; i10 < this.f48678l; i10++) {
            q2.b bVar = this.f48673g[i10];
            bVar.f48648a.B = bVar.f48649b;
        }
    }

    public i o(int i10, String str) {
        if (this.f48677k + 1 >= this.f48672f) {
            y();
        }
        i a10 = a(i.a.ERROR, str);
        int i11 = this.f48668b + 1;
        this.f48668b = i11;
        this.f48677k++;
        a10.f48699y = i11;
        a10.A = i10;
        this.f48680n.f48657d[i11] = a10;
        this.f48670d.b(a10);
        return a10;
    }

    public i p() {
        if (this.f48677k + 1 >= this.f48672f) {
            y();
        }
        i a10 = a(i.a.SLACK, null);
        int i10 = this.f48668b + 1;
        this.f48668b = i10;
        this.f48677k++;
        a10.f48699y = i10;
        this.f48680n.f48657d[i10] = a10;
        return a10;
    }

    public i q(Object obj) {
        i iVar = null;
        if (obj == null) {
            return null;
        }
        if (this.f48677k + 1 >= this.f48672f) {
            y();
        }
        if (obj instanceof t2.d) {
            t2.d dVar = (t2.d) obj;
            iVar = dVar.h();
            if (iVar == null) {
                dVar.r(this.f48680n);
                iVar = dVar.h();
            }
            int i10 = iVar.f48699y;
            if (i10 == -1 || i10 > this.f48668b || this.f48680n.f48657d[i10] == null) {
                if (i10 != -1) {
                    iVar.i();
                }
                int i11 = this.f48668b + 1;
                this.f48668b = i11;
                this.f48677k++;
                iVar.f48699y = i11;
                iVar.F = i.a.UNRESTRICTED;
                this.f48680n.f48657d[i11] = iVar;
            }
        }
        return iVar;
    }

    public q2.b r() {
        q2.b acquire;
        if (f48662v) {
            acquire = this.f48680n.f48654a.acquire();
            if (acquire == null) {
                acquire = new b(this.f48680n);
                f48666z++;
            } else {
                acquire.y();
            }
        } else {
            acquire = this.f48680n.f48655b.acquire();
            if (acquire == null) {
                acquire = new q2.b(this.f48680n);
                f48665y++;
            } else {
                acquire.y();
            }
        }
        i.e();
        return acquire;
    }

    public i t() {
        if (this.f48677k + 1 >= this.f48672f) {
            y();
        }
        i a10 = a(i.a.SLACK, null);
        int i10 = this.f48668b + 1;
        this.f48668b = i10;
        this.f48677k++;
        a10.f48699y = i10;
        this.f48680n.f48657d[i10] = a10;
        return a10;
    }

    public final int u(a aVar) throws Exception {
        boolean z10;
        int i10 = 0;
        while (true) {
            if (i10 >= this.f48678l) {
                z10 = false;
                break;
            }
            q2.b[] bVarArr = this.f48673g;
            if (bVarArr[i10].f48648a.F != i.a.UNRESTRICTED && bVarArr[i10].f48649b < 0.0f) {
                z10 = true;
                break;
            }
            i10++;
        }
        if (z10) {
            boolean z11 = false;
            int i11 = 0;
            while (!z11) {
                i11++;
                float f10 = Float.MAX_VALUE;
                int i12 = -1;
                int i13 = -1;
                int i14 = 0;
                for (int i15 = 0; i15 < this.f48678l; i15++) {
                    q2.b bVar = this.f48673g[i15];
                    if (bVar.f48648a.F != i.a.UNRESTRICTED && !bVar.f48653f && bVar.f48649b < 0.0f) {
                        int i16 = 9;
                        if (f48661u) {
                            int h10 = bVar.f48652e.h();
                            int i17 = 0;
                            while (i17 < h10) {
                                i b10 = bVar.f48652e.b(i17);
                                float e10 = bVar.f48652e.e(b10);
                                if (e10 > 0.0f) {
                                    int i18 = 0;
                                    while (i18 < i16) {
                                        float f11 = b10.D[i18] / e10;
                                        if ((f11 < f10 && i18 == i14) || i18 > i14) {
                                            i13 = b10.f48699y;
                                            i14 = i18;
                                            i12 = i15;
                                            f10 = f11;
                                        }
                                        i18++;
                                        i16 = 9;
                                    }
                                }
                                i17++;
                                i16 = 9;
                            }
                        } else {
                            for (int i19 = 1; i19 < this.f48677k; i19++) {
                                i iVar = this.f48680n.f48657d[i19];
                                float e11 = bVar.f48652e.e(iVar);
                                if (e11 > 0.0f) {
                                    for (int i20 = 0; i20 < 9; i20++) {
                                        float f12 = iVar.D[i20] / e11;
                                        if ((f12 < f10 && i20 == i14) || i20 > i14) {
                                            i13 = i19;
                                            i12 = i15;
                                            i14 = i20;
                                            f10 = f12;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                if (i12 != -1) {
                    q2.b bVar2 = this.f48673g[i12];
                    bVar2.f48648a.f48700z = -1;
                    bVar2.x(this.f48680n.f48657d[i13]);
                    i iVar2 = bVar2.f48648a;
                    iVar2.f48700z = i12;
                    iVar2.n(this, bVar2);
                } else {
                    z11 = true;
                }
                if (i11 > this.f48677k / 2) {
                    z11 = true;
                }
            }
            return i11;
        }
        return 0;
    }

    public c v() {
        return this.f48680n;
    }

    public int x(Object obj) {
        i h10 = ((t2.d) obj).h();
        if (h10 != null) {
            return (int) (h10.B + 0.5f);
        }
        return 0;
    }

    public final void y() {
        int i10 = this.f48671e * 2;
        this.f48671e = i10;
        this.f48673g = (q2.b[]) Arrays.copyOf(this.f48673g, i10);
        c cVar = this.f48680n;
        cVar.f48657d = (i[]) Arrays.copyOf(cVar.f48657d, this.f48671e);
        int i11 = this.f48671e;
        this.f48676j = new boolean[i11];
        this.f48672f = i11;
        this.f48679m = i11;
    }

    public void z() throws Exception {
        if (this.f48670d.isEmpty()) {
            n();
        } else if (!this.f48674h && !this.f48675i) {
            A(this.f48670d);
        } else {
            boolean z10 = false;
            int i10 = 0;
            while (true) {
                if (i10 >= this.f48678l) {
                    z10 = true;
                    break;
                } else if (!this.f48673g[i10].f48653f) {
                    break;
                } else {
                    i10++;
                }
            }
            if (!z10) {
                A(this.f48670d);
            } else {
                n();
            }
        }
    }
}
