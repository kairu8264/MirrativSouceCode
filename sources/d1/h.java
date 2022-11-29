package d1;

import jo.p;

/* loaded from: classes.dex */
public final class h extends c {

    /* renamed from: e  reason: collision with root package name */
    public static final a f29010e = new a(null);

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(String str, int i10) {
        super(str, b.f28954a.a(), i10, null);
        p.h(str, "name");
    }

    @Override // d1.c
    public float[] a(float[] fArr) {
        p.h(fArr, "v");
        float f10 = fArr[0];
        g gVar = g.f28999a;
        float f11 = f10 / gVar.c()[0];
        float f12 = fArr[1] / gVar.c()[1];
        float f13 = fArr[2] / gVar.c()[2];
        float pow = f11 > 0.008856452f ? (float) Math.pow(f11, 0.33333334f) : (f11 * 7.787037f) + 0.13793103f;
        float pow2 = f12 > 0.008856452f ? (float) Math.pow(f12, 0.33333334f) : (f12 * 7.787037f) + 0.13793103f;
        float pow3 = f13 > 0.008856452f ? (float) Math.pow(f13, 0.33333334f) : (f13 * 7.787037f) + 0.13793103f;
        fArr[0] = po.n.l((116.0f * pow2) - 16.0f, 0.0f, 100.0f);
        fArr[1] = po.n.l((pow - pow2) * 500.0f, -128.0f, 128.0f);
        fArr[2] = po.n.l((pow2 - pow3) * 200.0f, -128.0f, 128.0f);
        return fArr;
    }

    @Override // d1.c
    public float d(int i10) {
        return i10 == 0 ? 100.0f : 128.0f;
    }

    @Override // d1.c
    public float e(int i10) {
        return i10 == 0 ? 0.0f : -128.0f;
    }

    @Override // d1.c
    public float[] i(float[] fArr) {
        p.h(fArr, "v");
        fArr[0] = po.n.l(fArr[0], 0.0f, 100.0f);
        fArr[1] = po.n.l(fArr[1], -128.0f, 128.0f);
        fArr[2] = po.n.l(fArr[2], -128.0f, 128.0f);
        float f10 = (fArr[0] + 16.0f) / 116.0f;
        float f11 = (fArr[1] * 0.002f) + f10;
        float f12 = f10 - (fArr[2] * 0.005f);
        float f13 = f11 > 0.20689656f ? f11 * f11 * f11 : (f11 - 0.13793103f) * 0.12841855f;
        float f14 = f10 > 0.20689656f ? f10 * f10 * f10 : (f10 - 0.13793103f) * 0.12841855f;
        float f15 = f12 > 0.20689656f ? f12 * f12 * f12 : (f12 - 0.13793103f) * 0.12841855f;
        g gVar = g.f28999a;
        fArr[0] = f13 * gVar.c()[0];
        fArr[1] = f14 * gVar.c()[1];
        fArr[2] = f15 * gVar.c()[2];
        return fArr;
    }
}
