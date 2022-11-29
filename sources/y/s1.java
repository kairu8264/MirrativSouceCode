package y;

/* loaded from: classes.dex */
public final class s1 {

    /* renamed from: a  reason: collision with root package name */
    public static final r1.f<n1> f60973a = r1.c.a(a.f60974w);

    /* loaded from: classes.dex */
    public static final class a extends jo.q implements io.a<n1> {

        /* renamed from: w  reason: collision with root package name */
        public static final a f60974w = new a();

        public a() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final n1 invoke() {
            return q1.a(0, 0, 0, 0);
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends jo.q implements io.l<androidx.compose.ui.platform.c1, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ n1 f60975w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(n1 n1Var) {
            super(1);
            this.f60975w = n1Var;
        }

        public final void a(androidx.compose.ui.platform.c1 c1Var) {
            jo.p.h(c1Var, "$this$null");
            c1Var.b("windowInsetsPadding");
            c1Var.a().b("insets", this.f60975w);
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(androidx.compose.ui.platform.c1 c1Var) {
            a(c1Var);
            return wn.v.f59242a;
        }
    }

    public static final r1.f<n1> a() {
        return f60973a;
    }

    public static final x0.f b(x0.f fVar, n1 n1Var) {
        jo.p.h(fVar, "<this>");
        jo.p.h(n1Var, "insets");
        return fVar.L(new a0(n1Var, androidx.compose.ui.platform.a1.c() ? new b(n1Var) : androidx.compose.ui.platform.a1.a()));
    }
}
