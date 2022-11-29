package d1;

import d1.b;
import java.util.Arrays;
import jo.p;

/* loaded from: classes.dex */
public class f {

    /* renamed from: g  reason: collision with root package name */
    public static final a f28989g = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public final c f28990a;

    /* renamed from: b  reason: collision with root package name */
    public final c f28991b;

    /* renamed from: c  reason: collision with root package name */
    public final c f28992c;

    /* renamed from: d  reason: collision with root package name */
    public final c f28993d;

    /* renamed from: e  reason: collision with root package name */
    public final int f28994e;

    /* renamed from: f  reason: collision with root package name */
    public final float[] f28995f;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: d1.f$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0268a extends f {
            public C0268a(c cVar, int i10) {
                super(cVar, cVar, i10, null);
            }

            @Override // d1.f
            public float[] a(float[] fArr) {
                p.h(fArr, "v");
                return fArr;
            }
        }

        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final float[] b(c cVar, c cVar2, int i10) {
            if (j.e(i10, j.f29016a.a())) {
                long f10 = cVar.f();
                b.a aVar = d1.b.f28954a;
                boolean e10 = d1.b.e(f10, aVar.b());
                boolean e11 = d1.b.e(cVar2.f(), aVar.b());
                if (e10 && e11) {
                    return null;
                }
                if (e10 || e11) {
                    if (!e10) {
                        cVar = cVar2;
                    }
                    k kVar = (k) cVar;
                    float[] c10 = e10 ? kVar.r().c() : g.f28999a.c();
                    float[] c11 = e11 ? kVar.r().c() : g.f28999a.c();
                    return new float[]{c10[0] / c11[0], c10[1] / c11[1], c10[2] / c11[2]};
                }
                return null;
            }
            return null;
        }

        public final f c(c cVar) {
            p.h(cVar, "source");
            return new C0268a(cVar, j.f29016a.c());
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends f {

        /* renamed from: h  reason: collision with root package name */
        public final k f28996h;

        /* renamed from: i  reason: collision with root package name */
        public final k f28997i;

        /* renamed from: j  reason: collision with root package name */
        public final float[] f28998j;

        public b(k kVar, k kVar2, int i10) {
            super(kVar, kVar2, kVar, kVar2, i10, null, null);
            this.f28996h = kVar;
            this.f28997i = kVar2;
            this.f28998j = b(kVar, kVar2, i10);
        }

        public /* synthetic */ b(k kVar, k kVar2, int i10, jo.h hVar) {
            this(kVar, kVar2, i10);
        }

        @Override // d1.f
        public float[] a(float[] fArr) {
            p.h(fArr, "v");
            fArr[0] = (float) this.f28996h.l().invoke(Double.valueOf(fArr[0])).doubleValue();
            fArr[1] = (float) this.f28996h.l().invoke(Double.valueOf(fArr[1])).doubleValue();
            fArr[2] = (float) this.f28996h.l().invoke(Double.valueOf(fArr[2])).doubleValue();
            d.m(this.f28998j, fArr);
            fArr[0] = (float) this.f28997i.o().invoke(Double.valueOf(fArr[0])).doubleValue();
            fArr[1] = (float) this.f28997i.o().invoke(Double.valueOf(fArr[1])).doubleValue();
            fArr[2] = (float) this.f28997i.o().invoke(Double.valueOf(fArr[2])).doubleValue();
            return fArr;
        }

        public final float[] b(k kVar, k kVar2, int i10) {
            if (d.f(kVar.r(), kVar2.r())) {
                return d.k(kVar2.n(), kVar.q());
            }
            float[] q10 = kVar.q();
            float[] n10 = kVar2.n();
            float[] c10 = kVar.r().c();
            float[] c11 = kVar2.r().c();
            m r10 = kVar.r();
            g gVar = g.f28999a;
            if (!d.f(r10, gVar.b())) {
                float[] b10 = d1.a.f28949b.a().b();
                float[] c12 = gVar.c();
                float[] copyOf = Arrays.copyOf(c12, c12.length);
                p.g(copyOf, "copyOf(this, size)");
                q10 = d.k(d.e(b10, c10, copyOf), kVar.q());
            }
            if (!d.f(kVar2.r(), gVar.b())) {
                float[] b11 = d1.a.f28949b.a().b();
                float[] c13 = gVar.c();
                float[] copyOf2 = Arrays.copyOf(c13, c13.length);
                p.g(copyOf2, "copyOf(this, size)");
                n10 = d.j(d.k(d.e(b11, c11, copyOf2), kVar2.q()));
            }
            if (j.e(i10, j.f29016a.a())) {
                q10 = d.l(new float[]{c10[0] / c11[0], c10[1] / c11[1], c10[2] / c11[2]}, q10);
            }
            return d.k(n10, q10);
        }
    }

    public /* synthetic */ f(c cVar, c cVar2, int i10, jo.h hVar) {
        this(cVar, cVar2, i10);
    }

    public f(c cVar, c cVar2, c cVar3, c cVar4, int i10, float[] fArr) {
        this.f28990a = cVar;
        this.f28991b = cVar2;
        this.f28992c = cVar3;
        this.f28993d = cVar4;
        this.f28994e = i10;
        this.f28995f = fArr;
    }

    public /* synthetic */ f(c cVar, c cVar2, c cVar3, c cVar4, int i10, float[] fArr, jo.h hVar) {
        this(cVar, cVar2, cVar3, cVar4, i10, fArr);
    }

    public float[] a(float[] fArr) {
        p.h(fArr, "v");
        float[] i10 = this.f28992c.i(fArr);
        float[] fArr2 = this.f28995f;
        if (fArr2 != null) {
            i10[0] = i10[0] * fArr2[0];
            i10[1] = i10[1] * fArr2[1];
            i10[2] = i10[2] * fArr2[2];
        }
        return this.f28993d.a(i10);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public f(d1.c r13, d1.c r14, int r15) {
        /*
            r12 = this;
            long r0 = r13.f()
            d1.b$a r2 = d1.b.f28954a
            long r3 = r2.b()
            boolean r0 = d1.b.e(r0, r3)
            r1 = 2
            r3 = 0
            if (r0 == 0) goto L1e
            d1.g r0 = d1.g.f28999a
            d1.m r0 = r0.b()
            d1.c r0 = d1.d.d(r13, r0, r3, r1, r3)
            r7 = r0
            goto L1f
        L1e:
            r7 = r13
        L1f:
            long r4 = r14.f()
            long r8 = r2.b()
            boolean r0 = d1.b.e(r4, r8)
            if (r0 == 0) goto L39
            d1.g r0 = d1.g.f28999a
            d1.m r0 = r0.b()
            d1.c r0 = d1.d.d(r14, r0, r3, r1, r3)
            r8 = r0
            goto L3a
        L39:
            r8 = r14
        L3a:
            d1.f$a r0 = d1.f.f28989g
            float[] r10 = d1.f.a.a(r0, r13, r14, r15)
            r11 = 0
            r4 = r12
            r5 = r13
            r6 = r14
            r9 = r15
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: d1.f.<init>(d1.c, d1.c, int):void");
    }
}
