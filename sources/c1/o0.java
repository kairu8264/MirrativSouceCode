package c1;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class o0 {

    /* renamed from: b  reason: collision with root package name */
    public static final a f18732b = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public final float[] f18733a;

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }
    }

    public /* synthetic */ o0(float[] fArr) {
        this.f18733a = fArr;
    }

    public static final /* synthetic */ o0 a(float[] fArr) {
        return new o0(fArr);
    }

    public static float[] b(float[] fArr) {
        jo.p.h(fArr, "values");
        return fArr;
    }

    public static /* synthetic */ float[] c(float[] fArr, int i10, jo.h hVar) {
        if ((i10 & 1) != 0) {
            fArr = new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};
        }
        return b(fArr);
    }

    public static boolean d(float[] fArr, Object obj) {
        return (obj instanceof o0) && jo.p.c(fArr, ((o0) obj).n());
    }

    public static int e(float[] fArr) {
        return Arrays.hashCode(fArr);
    }

    public static final long f(float[] fArr, long j10) {
        float m10 = b1.f.m(j10);
        float n10 = b1.f.n(j10);
        float f10 = 1 / (((fArr[3] * m10) + (fArr[7] * n10)) + fArr[15]);
        if (!((Float.isInfinite(f10) || Float.isNaN(f10)) ? false : true)) {
            f10 = 0.0f;
        }
        return b1.g.a(((fArr[0] * m10) + (fArr[4] * n10) + fArr[12]) * f10, f10 * ((fArr[1] * m10) + (fArr[5] * n10) + fArr[13]));
    }

    public static final void g(float[] fArr, b1.d dVar) {
        jo.p.h(dVar, "rect");
        long f10 = f(fArr, b1.g.a(dVar.b(), dVar.d()));
        long f11 = f(fArr, b1.g.a(dVar.b(), dVar.a()));
        long f12 = f(fArr, b1.g.a(dVar.c(), dVar.d()));
        long f13 = f(fArr, b1.g.a(dVar.c(), dVar.a()));
        dVar.i(Math.min(Math.min(b1.f.m(f10), b1.f.m(f11)), Math.min(b1.f.m(f12), b1.f.m(f13))));
        dVar.k(Math.min(Math.min(b1.f.n(f10), b1.f.n(f11)), Math.min(b1.f.n(f12), b1.f.n(f13))));
        dVar.j(Math.max(Math.max(b1.f.m(f10), b1.f.m(f11)), Math.max(b1.f.m(f12), b1.f.m(f13))));
        dVar.h(Math.max(Math.max(b1.f.n(f10), b1.f.n(f11)), Math.max(b1.f.n(f12), b1.f.n(f13))));
    }

    public static final void h(float[] fArr) {
        int i10 = 0;
        while (i10 < 4) {
            int i11 = 0;
            while (i11 < 4) {
                fArr[(i11 * 4) + i10] = i10 == i11 ? 1.0f : 0.0f;
                i11++;
            }
            i10++;
        }
    }

    public static final void i(float[] fArr, float f10) {
        double d10 = (f10 * 3.141592653589793d) / 180.0d;
        float cos = (float) Math.cos(d10);
        float sin = (float) Math.sin(d10);
        float f11 = fArr[0];
        float f12 = fArr[4];
        float f13 = -sin;
        float f14 = fArr[1];
        float f15 = fArr[5];
        float f16 = fArr[2];
        float f17 = fArr[6];
        float f18 = fArr[3];
        float f19 = fArr[7];
        fArr[0] = (cos * f11) + (sin * f12);
        fArr[1] = (cos * f14) + (sin * f15);
        fArr[2] = (cos * f16) + (sin * f17);
        fArr[3] = (cos * f18) + (sin * f19);
        fArr[4] = (f11 * f13) + (f12 * cos);
        fArr[5] = (f14 * f13) + (f15 * cos);
        fArr[6] = (f16 * f13) + (f17 * cos);
        fArr[7] = (f13 * f18) + (cos * f19);
    }

    public static final void j(float[] fArr, float f10, float f11, float f12) {
        fArr[0] = fArr[0] * f10;
        fArr[1] = fArr[1] * f10;
        fArr[2] = fArr[2] * f10;
        fArr[3] = fArr[3] * f10;
        fArr[4] = fArr[4] * f11;
        fArr[5] = fArr[5] * f11;
        fArr[6] = fArr[6] * f11;
        fArr[7] = fArr[7] * f11;
        fArr[8] = fArr[8] * f12;
        fArr[9] = fArr[9] * f12;
        fArr[10] = fArr[10] * f12;
        fArr[11] = fArr[11] * f12;
    }

    public static String k(float[] fArr) {
        return so.g.f("\n            |" + fArr[0] + ' ' + fArr[1] + ' ' + fArr[2] + ' ' + fArr[3] + "|\n            |" + fArr[4] + ' ' + fArr[5] + ' ' + fArr[6] + ' ' + fArr[7] + "|\n            |" + fArr[8] + ' ' + fArr[9] + ' ' + fArr[10] + ' ' + fArr[11] + "|\n            |" + fArr[12] + ' ' + fArr[13] + ' ' + fArr[14] + ' ' + fArr[15] + "|\n        ");
    }

    public static final void l(float[] fArr, float f10, float f11, float f12) {
        float f13 = (fArr[0] * f10) + (fArr[4] * f11) + (fArr[8] * f12) + fArr[12];
        float f14 = (fArr[1] * f10) + (fArr[5] * f11) + (fArr[9] * f12) + fArr[13];
        float f15 = (fArr[2] * f10) + (fArr[6] * f11) + (fArr[10] * f12) + fArr[14];
        fArr[12] = f13;
        fArr[13] = f14;
        fArr[14] = f15;
        fArr[15] = (fArr[3] * f10) + (fArr[7] * f11) + (fArr[11] * f12) + fArr[15];
    }

    public static /* synthetic */ void m(float[] fArr, float f10, float f11, float f12, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = 0.0f;
        }
        if ((i10 & 2) != 0) {
            f11 = 0.0f;
        }
        if ((i10 & 4) != 0) {
            f12 = 0.0f;
        }
        l(fArr, f10, f11, f12);
    }

    public boolean equals(Object obj) {
        return d(this.f18733a, obj);
    }

    public int hashCode() {
        return e(this.f18733a);
    }

    public final /* synthetic */ float[] n() {
        return this.f18733a;
    }

    public String toString() {
        return k(this.f18733a);
    }
}
