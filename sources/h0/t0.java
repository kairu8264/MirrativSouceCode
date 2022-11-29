package h0;

import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import l0.c2;
import u.l0;

/* loaded from: classes.dex */
public final class t0 {

    /* renamed from: a  reason: collision with root package name */
    public static final float f34208a = s0.f34171a.a();

    /* renamed from: b  reason: collision with root package name */
    public static final float f34209b = m2.g.l((float) PsExtractor.VIDEO_STREAM_MASK);

    /* renamed from: c  reason: collision with root package name */
    public static final float f34210c = m2.g.l(40);

    /* renamed from: d  reason: collision with root package name */
    public static final u.u f34211d = new u.u(0.2f, 0.0f, 0.8f, 1.0f);

    /* renamed from: e  reason: collision with root package name */
    public static final u.u f34212e = new u.u(0.4f, 0.0f, 1.0f, 1.0f);

    /* renamed from: f  reason: collision with root package name */
    public static final u.u f34213f = new u.u(0.0f, 0.0f, 0.65f, 1.0f);

    /* renamed from: g  reason: collision with root package name */
    public static final u.u f34214g = new u.u(0.1f, 0.0f, 0.45f, 1.0f);

    /* renamed from: h  reason: collision with root package name */
    public static final u.u f34215h = new u.u(0.4f, 0.0f, 0.2f, 1.0f);

    /* loaded from: classes.dex */
    public static final class a extends jo.q implements io.l<e1.e, wn.v> {
        public final /* synthetic */ c2<Float> A;
        public final /* synthetic */ c2<Float> B;
        public final /* synthetic */ c2<Float> C;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ float f34216w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ long f34217x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ e1.j f34218y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ c2<Integer> f34219z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(float f10, long j10, e1.j jVar, c2<Integer> c2Var, c2<Float> c2Var2, c2<Float> c2Var3, c2<Float> c2Var4) {
            super(1);
            this.f34216w = f10;
            this.f34217x = j10;
            this.f34218y = jVar;
            this.f34219z = c2Var;
            this.A = c2Var2;
            this.B = c2Var3;
            this.C = c2Var4;
        }

        public final void a(e1.e eVar) {
            jo.p.h(eVar, "$this$Canvas");
            t0.m(eVar, t0.c(this.B) + (((t0.d(this.f34219z) * 216.0f) % 360.0f) - 90.0f) + t0.e(this.C), this.f34216w, Math.abs(t0.b(this.A) - t0.c(this.B)), this.f34217x, this.f34218y);
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(e1.e eVar) {
            a(eVar);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends jo.q implements io.p<l0.i, Integer, wn.v> {
        public final /* synthetic */ int A;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ x0.f f34220w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ long f34221x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ float f34222y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ int f34223z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(x0.f fVar, long j10, float f10, int i10, int i11) {
            super(2);
            this.f34220w = fVar;
            this.f34221x = j10;
            this.f34222y = f10;
            this.f34223z = i10;
            this.A = i11;
        }

        public final void a(l0.i iVar, int i10) {
            t0.a(this.f34220w, this.f34221x, this.f34222y, iVar, this.f34223z | 1, this.A);
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ wn.v invoke(l0.i iVar, Integer num) {
            a(iVar, num.intValue());
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends jo.q implements io.l<l0.b<Float>, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public static final c f34224w = new c();

        public c() {
            super(1);
        }

        public final void a(l0.b<Float> bVar) {
            jo.p.h(bVar, "$this$keyframes");
            bVar.f(1332);
            bVar.g(bVar.a(Float.valueOf(0.0f), 0), t0.f34215h);
            bVar.a(Float.valueOf(290.0f), 666);
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(l0.b<Float> bVar) {
            a(bVar);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends jo.q implements io.l<l0.b<Float>, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public static final d f34225w = new d();

        public d() {
            super(1);
        }

        public final void a(l0.b<Float> bVar) {
            jo.p.h(bVar, "$this$keyframes");
            bVar.f(1332);
            bVar.g(bVar.a(Float.valueOf(0.0f), 666), t0.f34215h);
            bVar.a(Float.valueOf(290.0f), bVar.c());
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(l0.b<Float> bVar) {
            a(bVar);
            return wn.v.f59242a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(x0.f r30, long r31, float r33, l0.i r34, int r35, int r36) {
        /*
            Method dump skipped, instructions count: 429
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: h0.t0.a(x0.f, long, float, l0.i, int, int):void");
    }

    public static final float b(c2<Float> c2Var) {
        return c2Var.getValue().floatValue();
    }

    public static final float c(c2<Float> c2Var) {
        return c2Var.getValue().floatValue();
    }

    public static final int d(c2<Integer> c2Var) {
        return c2Var.getValue().intValue();
    }

    public static final float e(c2<Float> c2Var) {
        return c2Var.getValue().floatValue();
    }

    public static final void l(e1.e eVar, float f10, float f11, long j10, e1.j jVar) {
        float f12 = 2;
        float f13 = jVar.f() / f12;
        float i10 = b1.l.i(eVar.c()) - (f12 * f13);
        e1.e.K(eVar, j10, f10, f11, false, b1.g.a(f13, f13), b1.m.a(i10, i10), 0.0f, jVar, null, 0, 832, null);
    }

    public static final void m(e1.e eVar, float f10, float f11, float f12, long j10, e1.j jVar) {
        l(eVar, f10 + (((f11 / m2.g.l(f34210c / 2)) * 57.29578f) / 2.0f), Math.max(f12, 0.1f), j10, jVar);
    }
}
