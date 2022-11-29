package t;

import c1.c0;
import u.c1;
import u.e1;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a  reason: collision with root package name */
    public static final io.l<d1.c, c1<c1.c0, u.o>> f52940a = a.f52943w;

    /* renamed from: b  reason: collision with root package name */
    public static final float[] f52941b = {0.80405736f, 0.026893456f, 0.04586542f, 0.3188387f, 0.9319606f, 0.26299807f, -0.11419419f, 0.05105356f, 0.83999807f};

    /* renamed from: c  reason: collision with root package name */
    public static final float[] f52942c = {1.2485008f, -0.032856926f, -0.057883114f, -0.48331892f, 1.1044513f, -0.3194066f, 0.19910365f, -0.07159331f, 1.202023f};

    /* loaded from: classes.dex */
    public static final class a extends jo.q implements io.l<d1.c, c1<c1.c0, u.o>> {

        /* renamed from: w  reason: collision with root package name */
        public static final a f52943w = new a();

        /* renamed from: t.j$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0817a extends jo.q implements io.l<c1.c0, u.o> {

            /* renamed from: w  reason: collision with root package name */
            public static final C0817a f52944w = new C0817a();

            public C0817a() {
                super(1);
            }

            public final u.o a(long j10) {
                long i10 = c1.c0.i(j10, d1.e.f28963a.g());
                float r10 = c1.c0.r(i10);
                float q10 = c1.c0.q(i10);
                float o10 = c1.c0.o(i10);
                double d10 = 0.33333334f;
                return new u.o(c1.c0.n(j10), (float) Math.pow(j.e(0, r10, q10, o10, j.f52941b), d10), (float) Math.pow(j.e(1, r10, q10, o10, j.f52941b), d10), (float) Math.pow(j.e(2, r10, q10, o10, j.f52941b), d10));
            }

            @Override // io.l
            public /* bridge */ /* synthetic */ u.o invoke(c1.c0 c0Var) {
                return a(c0Var.u());
            }
        }

        /* loaded from: classes.dex */
        public static final class b extends jo.q implements io.l<u.o, c1.c0> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ d1.c f52945w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(d1.c cVar) {
                super(1);
                this.f52945w = cVar;
            }

            public final long a(u.o oVar) {
                jo.p.h(oVar, "it");
                double d10 = 3.0f;
                float pow = (float) Math.pow(oVar.g(), d10);
                float pow2 = (float) Math.pow(oVar.h(), d10);
                float pow3 = (float) Math.pow(oVar.i(), d10);
                return c1.c0.i(c1.e0.a(po.n.l(j.e(0, pow, pow2, pow3, j.f52942c), -2.0f, 2.0f), po.n.l(j.e(1, pow, pow2, pow3, j.f52942c), -2.0f, 2.0f), po.n.l(j.e(2, pow, pow2, pow3, j.f52942c), -2.0f, 2.0f), po.n.l(oVar.f(), 0.0f, 1.0f), d1.e.f28963a.g()), this.f52945w);
            }

            @Override // io.l
            public /* bridge */ /* synthetic */ c1.c0 invoke(u.o oVar) {
                return c1.c0.g(a(oVar));
            }
        }

        public a() {
            super(1);
        }

        @Override // io.l
        /* renamed from: a */
        public final c1<c1.c0, u.o> invoke(d1.c cVar) {
            jo.p.h(cVar, "colorSpace");
            return e1.a(C0817a.f52944w, new b(cVar));
        }
    }

    public static final io.l<d1.c, c1<c1.c0, u.o>> d(c0.a aVar) {
        jo.p.h(aVar, "<this>");
        return f52940a;
    }

    public static final float e(int i10, float f10, float f11, float f12, float[] fArr) {
        return (f10 * fArr[i10]) + (f11 * fArr[i10 + 3]) + (f12 * fArr[i10 + 6]);
    }
}
