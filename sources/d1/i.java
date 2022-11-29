package d1;

import jo.p;

/* loaded from: classes.dex */
public final class i extends c {

    /* renamed from: e  reason: collision with root package name */
    public static final a f29011e = new a(null);

    /* renamed from: f  reason: collision with root package name */
    public static final float[] f29012f;

    /* renamed from: g  reason: collision with root package name */
    public static final float[] f29013g;

    /* renamed from: h  reason: collision with root package name */
    public static final float[] f29014h;

    /* renamed from: i  reason: collision with root package name */
    public static final float[] f29015i;

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }
    }

    static {
        float[] b10 = d1.a.f28949b.a().b();
        g gVar = g.f28999a;
        float[] k10 = d.k(new float[]{0.818933f, 0.032984544f, 0.0482003f, 0.36186674f, 0.9293119f, 0.26436627f, -0.12885971f, 0.03614564f, 0.6338517f}, d.e(b10, gVar.b().c(), gVar.e().c()));
        f29012f = k10;
        float[] fArr = {0.21045426f, 1.9779985f, 0.025904037f, 0.7936178f, -2.4285922f, 0.78277177f, -0.004072047f, 0.4505937f, -0.80867577f};
        f29013g = fArr;
        f29014h = d.j(k10);
        f29015i = d.j(fArr);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(String str, int i10) {
        super(str, b.f28954a.a(), i10, null);
        p.h(str, "name");
    }

    @Override // d1.c
    public float[] a(float[] fArr) {
        p.h(fArr, "v");
        d.m(f29012f, fArr);
        double d10 = 0.33333334f;
        fArr[0] = Math.signum(fArr[0]) * ((float) Math.pow(Math.abs(fArr[0]), d10));
        fArr[1] = Math.signum(fArr[1]) * ((float) Math.pow(Math.abs(fArr[1]), d10));
        fArr[2] = Math.signum(fArr[2]) * ((float) Math.pow(Math.abs(fArr[2]), d10));
        d.m(f29013g, fArr);
        return fArr;
    }

    @Override // d1.c
    public float d(int i10) {
        return i10 == 0 ? 1.0f : 0.5f;
    }

    @Override // d1.c
    public float e(int i10) {
        return i10 == 0 ? 0.0f : -0.5f;
    }

    @Override // d1.c
    public float[] i(float[] fArr) {
        p.h(fArr, "v");
        fArr[0] = po.n.l(fArr[0], 0.0f, 1.0f);
        fArr[1] = po.n.l(fArr[1], -0.5f, 0.5f);
        fArr[2] = po.n.l(fArr[2], -0.5f, 0.5f);
        d.m(f29015i, fArr);
        fArr[0] = fArr[0] * fArr[0] * fArr[0];
        fArr[1] = fArr[1] * fArr[1] * fArr[1];
        fArr[2] = fArr[2] * fArr[2] * fArr[2];
        d.m(f29014h, fArr);
        return fArr;
    }
}
