package c1;

/* loaded from: classes.dex */
public final class h0 {

    /* loaded from: classes.dex */
    public static final class a extends jo.q implements io.l<androidx.compose.ui.platform.c1, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.l f18677w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(io.l lVar) {
            super(1);
            this.f18677w = lVar;
        }

        public final void a(androidx.compose.ui.platform.c1 c1Var) {
            jo.p.h(c1Var, "$this$null");
            c1Var.b("graphicsLayer");
            c1Var.a().b("block", this.f18677w);
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(androidx.compose.ui.platform.c1 c1Var) {
            a(c1Var);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends jo.q implements io.l<androidx.compose.ui.platform.c1, wn.v> {
        public final /* synthetic */ float A;
        public final /* synthetic */ float B;
        public final /* synthetic */ float C;
        public final /* synthetic */ float D;
        public final /* synthetic */ float E;
        public final /* synthetic */ float F;
        public final /* synthetic */ long G;
        public final /* synthetic */ g1 H;
        public final /* synthetic */ boolean I;
        public final /* synthetic */ b1 J;
        public final /* synthetic */ long K;
        public final /* synthetic */ long L;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ float f18678w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ float f18679x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ float f18680y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ float f18681z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, long j10, g1 g1Var, boolean z10, b1 b1Var, long j11, long j12) {
            super(1);
            this.f18678w = f10;
            this.f18679x = f11;
            this.f18680y = f12;
            this.f18681z = f13;
            this.A = f14;
            this.B = f15;
            this.C = f16;
            this.D = f17;
            this.E = f18;
            this.F = f19;
            this.G = j10;
            this.H = g1Var;
            this.I = z10;
            this.K = j11;
            this.L = j12;
        }

        public final void a(androidx.compose.ui.platform.c1 c1Var) {
            jo.p.h(c1Var, "$this$null");
            c1Var.b("graphicsLayer");
            c1Var.a().b("scaleX", Float.valueOf(this.f18678w));
            c1Var.a().b("scaleY", Float.valueOf(this.f18679x));
            c1Var.a().b("alpha", Float.valueOf(this.f18680y));
            c1Var.a().b("translationX", Float.valueOf(this.f18681z));
            c1Var.a().b("translationY", Float.valueOf(this.A));
            c1Var.a().b("shadowElevation", Float.valueOf(this.B));
            c1Var.a().b("rotationX", Float.valueOf(this.C));
            c1Var.a().b("rotationY", Float.valueOf(this.D));
            c1Var.a().b("rotationZ", Float.valueOf(this.E));
            c1Var.a().b("cameraDistance", Float.valueOf(this.F));
            c1Var.a().b("transformOrigin", n1.b(this.G));
            c1Var.a().b("shape", this.H);
            c1Var.a().b("clip", Boolean.valueOf(this.I));
            c1Var.a().b("renderEffect", this.J);
            c1Var.a().b("ambientShadowColor", c0.g(this.K));
            c1Var.a().b("spotShadowColor", c0.g(this.L));
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(androidx.compose.ui.platform.c1 c1Var) {
            a(c1Var);
            return wn.v.f59242a;
        }
    }

    public static final x0.f a(x0.f fVar, io.l<? super i0, wn.v> lVar) {
        jo.p.h(fVar, "<this>");
        jo.p.h(lVar, "block");
        return fVar.L(new t(lVar, androidx.compose.ui.platform.a1.c() ? new a(lVar) : androidx.compose.ui.platform.a1.a()));
    }

    public static final x0.f b(x0.f fVar, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, long j10, g1 g1Var, boolean z10, b1 b1Var, long j11, long j12) {
        jo.p.h(fVar, "$this$graphicsLayer");
        jo.p.h(g1Var, "shape");
        return fVar.L(new h1(f10, f11, f12, f13, f14, f15, f16, f17, f18, f19, j10, g1Var, z10, b1Var, j11, j12, androidx.compose.ui.platform.a1.c() ? new b(f10, f11, f12, f13, f14, f15, f16, f17, f18, f19, j10, g1Var, z10, b1Var, j11, j12) : androidx.compose.ui.platform.a1.a(), null));
    }

    public static /* synthetic */ x0.f c(x0.f fVar, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, long j10, g1 g1Var, boolean z10, b1 b1Var, long j11, long j12, int i10, Object obj) {
        return b(fVar, (i10 & 1) != 0 ? 1.0f : f10, (i10 & 2) != 0 ? 1.0f : f11, (i10 & 4) == 0 ? f12 : 1.0f, (i10 & 8) != 0 ? 0.0f : f13, (i10 & 16) != 0 ? 0.0f : f14, (i10 & 32) != 0 ? 0.0f : f15, (i10 & 64) != 0 ? 0.0f : f16, (i10 & 128) != 0 ? 0.0f : f17, (i10 & 256) == 0 ? f18 : 0.0f, (i10 & 512) != 0 ? 8.0f : f19, (i10 & 1024) != 0 ? n1.f18729b.a() : j10, (i10 & 2048) != 0 ? a1.a() : g1Var, (i10 & 4096) != 0 ? false : z10, (i10 & 8192) != 0 ? null : b1Var, (i10 & 16384) != 0 ? j0.a() : j11, (i10 & 32768) != 0 ? j0.a() : j12);
    }

    public static final x0.f d(x0.f fVar) {
        jo.p.h(fVar, "<this>");
        return androidx.compose.ui.platform.a1.c() ? fVar.L(c(x0.f.f59359u, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, null, 0L, 0L, 65535, null)) : fVar;
    }
}
