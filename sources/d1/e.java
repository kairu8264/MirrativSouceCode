package d1;

import jo.q;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final e f28963a = new e();

    /* renamed from: b  reason: collision with root package name */
    public static final float[] f28964b;

    /* renamed from: c  reason: collision with root package name */
    public static final float[] f28965c;

    /* renamed from: d  reason: collision with root package name */
    public static final l f28966d;

    /* renamed from: e  reason: collision with root package name */
    public static final l f28967e;

    /* renamed from: f  reason: collision with root package name */
    public static final k f28968f;

    /* renamed from: g  reason: collision with root package name */
    public static final k f28969g;

    /* renamed from: h  reason: collision with root package name */
    public static final k f28970h;

    /* renamed from: i  reason: collision with root package name */
    public static final k f28971i;

    /* renamed from: j  reason: collision with root package name */
    public static final k f28972j;

    /* renamed from: k  reason: collision with root package name */
    public static final k f28973k;

    /* renamed from: l  reason: collision with root package name */
    public static final k f28974l;

    /* renamed from: m  reason: collision with root package name */
    public static final k f28975m;

    /* renamed from: n  reason: collision with root package name */
    public static final k f28976n;

    /* renamed from: o  reason: collision with root package name */
    public static final k f28977o;

    /* renamed from: p  reason: collision with root package name */
    public static final k f28978p;

    /* renamed from: q  reason: collision with root package name */
    public static final k f28979q;

    /* renamed from: r  reason: collision with root package name */
    public static final k f28980r;

    /* renamed from: s  reason: collision with root package name */
    public static final k f28981s;

    /* renamed from: t  reason: collision with root package name */
    public static final c f28982t;

    /* renamed from: u  reason: collision with root package name */
    public static final c f28983u;

    /* renamed from: v  reason: collision with root package name */
    public static final k f28984v;

    /* renamed from: w  reason: collision with root package name */
    public static final c f28985w;

    /* renamed from: x  reason: collision with root package name */
    public static final c[] f28986x;

    /* loaded from: classes.dex */
    public static final class a extends q implements io.l<Double, Double> {

        /* renamed from: w  reason: collision with root package name */
        public static final a f28987w = new a();

        public a() {
            super(1);
        }

        public final Double a(double d10) {
            return Double.valueOf(d.a(d10, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d, 2.4d));
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ Double invoke(Double d10) {
            return a(d10.doubleValue());
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends q implements io.l<Double, Double> {

        /* renamed from: w  reason: collision with root package name */
        public static final b f28988w = new b();

        public b() {
            super(1);
        }

        public final Double a(double d10) {
            return Double.valueOf(d.b(d10, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d, 2.4d));
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ Double invoke(Double d10) {
            return a(d10.doubleValue());
        }
    }

    static {
        float[] fArr = {0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f};
        f28964b = fArr;
        float[] fArr2 = {0.67f, 0.33f, 0.21f, 0.71f, 0.14f, 0.08f};
        f28965c = fArr2;
        l lVar = new l(2.4d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d, 0.0d, 0.0d, 96, null);
        f28966d = lVar;
        l lVar2 = new l(2.2d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d, 0.0d, 0.0d, 96, null);
        f28967e = lVar2;
        g gVar = g.f28999a;
        k kVar = new k("sRGB IEC61966-2.1", fArr, gVar.e(), lVar, 0);
        f28968f = kVar;
        k kVar2 = new k("sRGB IEC61966-2.1 (Linear)", fArr, gVar.e(), 1.0d, 0.0f, 1.0f, 1);
        f28969g = kVar2;
        k kVar3 = new k("scRGB-nl IEC 61966-2-2:2003", fArr, gVar.e(), null, a.f28987w, b.f28988w, -0.799f, 2.399f, lVar, 2);
        f28970h = kVar3;
        k kVar4 = new k("scRGB IEC 61966-2-2:2003", fArr, gVar.e(), 1.0d, -0.5f, 7.499f, 3);
        f28971i = kVar4;
        k kVar5 = new k("Rec. ITU-R BT.709-5", new float[]{0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f}, gVar.e(), new l(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d, 0.0d, 0.0d, 96, null), 4);
        f28972j = kVar5;
        k kVar6 = new k("Rec. ITU-R BT.2020-1", new float[]{0.708f, 0.292f, 0.17f, 0.797f, 0.131f, 0.046f}, gVar.e(), new l(2.2222222222222223d, 0.9096697898662786d, 0.09033021013372146d, 0.2222222222222222d, 0.08145d, 0.0d, 0.0d, 96, null), 5);
        f28973k = kVar6;
        k kVar7 = new k("SMPTE RP 431-2-2007 DCI (P3)", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, new m(0.314f, 0.351f), 2.6d, 0.0f, 1.0f, 6);
        f28974l = kVar7;
        k kVar8 = new k("Display P3", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, gVar.e(), lVar, 7);
        f28975m = kVar8;
        k kVar9 = new k("NTSC (1953)", fArr2, gVar.a(), new l(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d, 0.0d, 0.0d, 96, null), 8);
        f28976n = kVar9;
        k kVar10 = new k("SMPTE-C RGB", new float[]{0.63f, 0.34f, 0.31f, 0.595f, 0.155f, 0.07f}, gVar.e(), new l(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d, 0.0d, 0.0d, 96, null), 9);
        f28977o = kVar10;
        k kVar11 = new k("Adobe RGB (1998)", new float[]{0.64f, 0.33f, 0.21f, 0.71f, 0.15f, 0.06f}, gVar.e(), 2.2d, 0.0f, 1.0f, 10);
        f28978p = kVar11;
        k kVar12 = new k("ROMM RGB ISO 22028-2:2013", new float[]{0.7347f, 0.2653f, 0.1596f, 0.8404f, 0.0366f, 1.0E-4f}, gVar.b(), new l(1.8d, 1.0d, 0.0d, 0.0625d, 0.031248d, 0.0d, 0.0d, 96, null), 11);
        f28979q = kVar12;
        k kVar13 = new k("SMPTE ST 2065-1:2012 ACES", new float[]{0.7347f, 0.2653f, 0.0f, 1.0f, 1.0E-4f, -0.077f}, gVar.d(), 1.0d, -65504.0f, 65504.0f, 12);
        f28980r = kVar13;
        k kVar14 = new k("Academy S-2014-004 ACEScg", new float[]{0.713f, 0.293f, 0.165f, 0.83f, 0.128f, 0.044f}, gVar.d(), 1.0d, -65504.0f, 65504.0f, 13);
        f28981s = kVar14;
        n nVar = new n("Generic XYZ", 14);
        f28982t = nVar;
        h hVar = new h("Generic L*a*b*", 15);
        f28983u = hVar;
        k kVar15 = new k("None", fArr, gVar.e(), lVar2, 16);
        f28984v = kVar15;
        i iVar = new i("Oklab", 17);
        f28985w = iVar;
        f28986x = new c[]{kVar, kVar2, kVar3, kVar4, kVar5, kVar6, kVar7, kVar8, kVar9, kVar10, kVar11, kVar12, kVar13, kVar14, nVar, hVar, kVar15, iVar};
    }

    public final k a() {
        return f28980r;
    }

    public final k b() {
        return f28981s;
    }

    public final k c() {
        return f28978p;
    }

    public final k d() {
        return f28973k;
    }

    public final k e() {
        return f28972j;
    }

    public final c f() {
        return f28983u;
    }

    public final c g() {
        return f28982t;
    }

    public final c[] h() {
        return f28986x;
    }

    public final k i() {
        return f28974l;
    }

    public final k j() {
        return f28975m;
    }

    public final k k() {
        return f28970h;
    }

    public final k l() {
        return f28971i;
    }

    public final k m() {
        return f28969g;
    }

    public final k n() {
        return f28976n;
    }

    public final float[] o() {
        return f28965c;
    }

    public final k p() {
        return f28979q;
    }

    public final k q() {
        return f28977o;
    }

    public final k r() {
        return f28968f;
    }

    public final float[] s() {
        return f28964b;
    }

    public final k t() {
        return f28984v;
    }
}
