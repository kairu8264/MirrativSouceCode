package y;

/* loaded from: classes.dex */
public final class g {

    /* loaded from: classes.dex */
    public static final class a extends jo.q implements io.l<androidx.compose.ui.platform.c1, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ float f60798w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ boolean f60799x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(float f10, boolean z10) {
            super(1);
            this.f60798w = f10;
            this.f60799x = z10;
        }

        public final void a(androidx.compose.ui.platform.c1 c1Var) {
            jo.p.h(c1Var, "$this$null");
            c1Var.b("aspectRatio");
            c1Var.a().b("ratio", Float.valueOf(this.f60798w));
            c1Var.a().b("matchHeightConstraintsFirst", Boolean.valueOf(this.f60799x));
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(androidx.compose.ui.platform.c1 c1Var) {
            a(c1Var);
            return wn.v.f59242a;
        }
    }

    public static final x0.f a(x0.f fVar, float f10, boolean z10) {
        jo.p.h(fVar, "<this>");
        return fVar.L(new h(f10, z10, androidx.compose.ui.platform.a1.c() ? new a(f10, z10) : androidx.compose.ui.platform.a1.a()));
    }

    public static /* synthetic */ x0.f b(x0.f fVar, float f10, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return a(fVar, f10, z10);
    }
}
