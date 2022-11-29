package d1;

import com.mirrativ.llstream.protocol.v1.topic.TopicConstant;
import d1.b;
import d1.f;
import jo.p;

/* loaded from: classes.dex */
public final class d {
    public static final double a(double d10, double d11, double d12, double d13, double d14, double d15) {
        return Math.copySign(n(d10 < 0.0d ? -d10 : d10, d11, d12, d13, d14, d15), d10);
    }

    public static final double b(double d10, double d11, double d12, double d13, double d14, double d15) {
        return Math.copySign(p(d10 < 0.0d ? -d10 : d10, d11, d12, d13, d14, d15), d10);
    }

    public static final c c(c cVar, m mVar, a aVar) {
        p.h(cVar, "<this>");
        p.h(mVar, "whitePoint");
        p.h(aVar, "adaptation");
        if (b.e(cVar.f(), b.f28954a.b())) {
            k kVar = (k) cVar;
            if (f(kVar.r(), mVar)) {
                return cVar;
            }
            return new k(kVar, k(e(aVar.b(), kVar.r().c(), mVar.c()), kVar.q()), mVar);
        }
        return cVar;
    }

    public static /* synthetic */ c d(c cVar, m mVar, a aVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            aVar = a.f28949b.a();
        }
        return c(cVar, mVar, aVar);
    }

    public static final float[] e(float[] fArr, float[] fArr2, float[] fArr3) {
        p.h(fArr, "matrix");
        p.h(fArr2, "srcWhitePoint");
        p.h(fArr3, "dstWhitePoint");
        float[] m10 = m(fArr, fArr2);
        float[] m11 = m(fArr, fArr3);
        return k(j(fArr), l(new float[]{m11[0] / m10[0], m11[1] / m10[1], m11[2] / m10[2]}, fArr));
    }

    public static final boolean f(m mVar, m mVar2) {
        p.h(mVar, TopicConstant.EXTEND_LIPMETA_A);
        p.h(mVar2, "b");
        if (mVar == mVar2) {
            return true;
        }
        return Math.abs(mVar.a() - mVar2.a()) < 0.001f && Math.abs(mVar.b() - mVar2.b()) < 0.001f;
    }

    public static final boolean g(float[] fArr, float[] fArr2) {
        p.h(fArr, TopicConstant.EXTEND_LIPMETA_A);
        p.h(fArr2, "b");
        if (fArr == fArr2) {
            return true;
        }
        int length = fArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (Float.compare(fArr[i10], fArr2[i10]) != 0 && Math.abs(fArr[i10] - fArr2[i10]) > 0.001f) {
                return false;
            }
        }
        return true;
    }

    public static final f h(c cVar, c cVar2, int i10) {
        p.h(cVar, "$this$connect");
        p.h(cVar2, "destination");
        if (cVar == cVar2) {
            return f.f28989g.c(cVar);
        }
        long f10 = cVar.f();
        b.a aVar = b.f28954a;
        if (b.e(f10, aVar.b()) && b.e(cVar2.f(), aVar.b())) {
            return new f.b((k) cVar, (k) cVar2, i10, null);
        }
        return new f(cVar, cVar2, i10, null);
    }

    public static /* synthetic */ f i(c cVar, c cVar2, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            cVar2 = e.f28963a.r();
        }
        if ((i11 & 2) != 0) {
            i10 = j.f29016a.b();
        }
        return h(cVar, cVar2, i10);
    }

    public static final float[] j(float[] fArr) {
        p.h(fArr, TopicConstant.PACKET_TYPE_META);
        float f10 = fArr[0];
        float f11 = fArr[3];
        float f12 = fArr[6];
        float f13 = fArr[1];
        float f14 = fArr[4];
        float f15 = fArr[7];
        float f16 = fArr[2];
        float f17 = fArr[5];
        float f18 = fArr[8];
        float f19 = (f14 * f18) - (f15 * f17);
        float f20 = (f15 * f16) - (f13 * f18);
        float f21 = (f13 * f17) - (f14 * f16);
        float f22 = (f10 * f19) + (f11 * f20) + (f12 * f21);
        float[] fArr2 = new float[fArr.length];
        fArr2[0] = f19 / f22;
        fArr2[1] = f20 / f22;
        fArr2[2] = f21 / f22;
        fArr2[3] = ((f12 * f17) - (f11 * f18)) / f22;
        fArr2[4] = ((f18 * f10) - (f12 * f16)) / f22;
        fArr2[5] = ((f16 * f11) - (f17 * f10)) / f22;
        fArr2[6] = ((f11 * f15) - (f12 * f14)) / f22;
        fArr2[7] = ((f12 * f13) - (f15 * f10)) / f22;
        fArr2[8] = ((f10 * f14) - (f11 * f13)) / f22;
        return fArr2;
    }

    public static final float[] k(float[] fArr, float[] fArr2) {
        p.h(fArr, "lhs");
        p.h(fArr2, "rhs");
        return new float[]{(fArr[0] * fArr2[0]) + (fArr[3] * fArr2[1]) + (fArr[6] * fArr2[2]), (fArr[1] * fArr2[0]) + (fArr[4] * fArr2[1]) + (fArr[7] * fArr2[2]), (fArr[2] * fArr2[0]) + (fArr[5] * fArr2[1]) + (fArr[8] * fArr2[2]), (fArr[0] * fArr2[3]) + (fArr[3] * fArr2[4]) + (fArr[6] * fArr2[5]), (fArr[1] * fArr2[3]) + (fArr[4] * fArr2[4]) + (fArr[7] * fArr2[5]), (fArr[2] * fArr2[3]) + (fArr[5] * fArr2[4]) + (fArr[8] * fArr2[5]), (fArr[0] * fArr2[6]) + (fArr[3] * fArr2[7]) + (fArr[6] * fArr2[8]), (fArr[1] * fArr2[6]) + (fArr[4] * fArr2[7]) + (fArr[7] * fArr2[8]), (fArr[2] * fArr2[6]) + (fArr[5] * fArr2[7]) + (fArr[8] * fArr2[8])};
    }

    public static final float[] l(float[] fArr, float[] fArr2) {
        p.h(fArr, "lhs");
        p.h(fArr2, "rhs");
        return new float[]{fArr[0] * fArr2[0], fArr[1] * fArr2[1], fArr[2] * fArr2[2], fArr[0] * fArr2[3], fArr[1] * fArr2[4], fArr[2] * fArr2[5], fArr[0] * fArr2[6], fArr[1] * fArr2[7], fArr[2] * fArr2[8]};
    }

    public static final float[] m(float[] fArr, float[] fArr2) {
        p.h(fArr, "lhs");
        p.h(fArr2, "rhs");
        float f10 = fArr2[0];
        float f11 = fArr2[1];
        float f12 = fArr2[2];
        fArr2[0] = (fArr[0] * f10) + (fArr[3] * f11) + (fArr[6] * f12);
        fArr2[1] = (fArr[1] * f10) + (fArr[4] * f11) + (fArr[7] * f12);
        fArr2[2] = (fArr[2] * f10) + (fArr[5] * f11) + (fArr[8] * f12);
        return fArr2;
    }

    public static final double n(double d10, double d11, double d12, double d13, double d14, double d15) {
        return d10 >= d14 * d13 ? (Math.pow(d10, 1.0d / d15) - d12) / d11 : d10 / d13;
    }

    public static final double o(double d10, double d11, double d12, double d13, double d14, double d15, double d16, double d17) {
        return d10 >= d14 * d13 ? (Math.pow(d10 - d15, 1.0d / d17) - d12) / d11 : (d10 - d16) / d13;
    }

    public static final double p(double d10, double d11, double d12, double d13, double d14, double d15) {
        return d10 >= d14 ? Math.pow((d11 * d10) + d12, d15) : d10 * d13;
    }

    public static final double q(double d10, double d11, double d12, double d13, double d14, double d15, double d16, double d17) {
        return d10 >= d14 ? Math.pow((d11 * d10) + d12, d17) + d15 : (d13 * d10) + d16;
    }
}
