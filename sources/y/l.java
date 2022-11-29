package y;

/* loaded from: classes.dex */
public final class l implements k {

    /* renamed from: a  reason: collision with root package name */
    public static final l f60836a = new l();

    /* loaded from: classes.dex */
    public static final class a extends jo.q implements io.l<androidx.compose.ui.platform.c1, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ x0.a f60837w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(x0.a aVar) {
            super(1);
            this.f60837w = aVar;
        }

        public final void a(androidx.compose.ui.platform.c1 c1Var) {
            jo.p.h(c1Var, "$this$null");
            c1Var.b("align");
            c1Var.c(this.f60837w);
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(androidx.compose.ui.platform.c1 c1Var) {
            a(c1Var);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends jo.q implements io.l<androidx.compose.ui.platform.c1, wn.v> {
        public b() {
            super(1);
        }

        public final void a(androidx.compose.ui.platform.c1 c1Var) {
            jo.p.h(c1Var, "$this$null");
            c1Var.b("matchParentSize");
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(androidx.compose.ui.platform.c1 c1Var) {
            a(c1Var);
            return wn.v.f59242a;
        }
    }

    @Override // y.k
    public x0.f a(x0.f fVar, x0.a aVar) {
        jo.p.h(fVar, "<this>");
        jo.p.h(aVar, "alignment");
        return fVar.L(new i(aVar, false, androidx.compose.ui.platform.a1.c() ? new a(aVar) : androidx.compose.ui.platform.a1.a()));
    }

    @Override // y.k
    public x0.f c(x0.f fVar) {
        jo.p.h(fVar, "<this>");
        return fVar.L(new i(x0.a.f59327a.e(), true, androidx.compose.ui.platform.a1.c() ? new b() : androidx.compose.ui.platform.a1.a()));
    }
}
