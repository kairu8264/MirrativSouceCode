package y;

/* loaded from: classes.dex */
public final class n0 {

    /* loaded from: classes.dex */
    public static final class a extends jo.q implements io.l<androidx.compose.ui.platform.c1, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.l f60853w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(io.l lVar) {
            super(1);
            this.f60853w = lVar;
        }

        public final void a(androidx.compose.ui.platform.c1 c1Var) {
            jo.p.h(c1Var, "$this$null");
            c1Var.b("offset");
            c1Var.a().b("offset", this.f60853w);
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(androidx.compose.ui.platform.c1 c1Var) {
            a(c1Var);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends jo.q implements io.l<androidx.compose.ui.platform.c1, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ float f60854w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ float f60855x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(float f10, float f11) {
            super(1);
            this.f60854w = f10;
            this.f60855x = f11;
        }

        public final void a(androidx.compose.ui.platform.c1 c1Var) {
            jo.p.h(c1Var, "$this$null");
            c1Var.b("offset");
            c1Var.a().b("x", m2.g.e(this.f60854w));
            c1Var.a().b("y", m2.g.e(this.f60855x));
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(androidx.compose.ui.platform.c1 c1Var) {
            a(c1Var);
            return wn.v.f59242a;
        }
    }

    public static final x0.f a(x0.f fVar, io.l<? super m2.d, m2.k> lVar) {
        jo.p.h(fVar, "<this>");
        jo.p.h(lVar, "offset");
        return fVar.L(new p0(lVar, true, androidx.compose.ui.platform.a1.c() ? new a(lVar) : androidx.compose.ui.platform.a1.a()));
    }

    public static final x0.f b(x0.f fVar, float f10, float f11) {
        jo.p.h(fVar, "$this$offset");
        return fVar.L(new o0(f10, f11, true, androidx.compose.ui.platform.a1.c() ? new b(f10, f11) : androidx.compose.ui.platform.a1.a(), null));
    }

    public static /* synthetic */ x0.f c(x0.f fVar, float f10, float f11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = m2.g.l(0);
        }
        if ((i10 & 2) != 0) {
            f11 = m2.g.l(0);
        }
        return b(fVar, f10, f11);
    }
}
