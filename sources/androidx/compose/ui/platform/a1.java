package androidx.compose.ui.platform;

/* loaded from: classes.dex */
public final class a1 {

    /* renamed from: a  reason: collision with root package name */
    public static final io.l<c1, wn.v> f14376a = a.f14378w;

    /* renamed from: b  reason: collision with root package name */
    public static boolean f14377b;

    /* loaded from: classes.dex */
    public static final class a extends jo.q implements io.l<c1, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public static final a f14378w = new a();

        public a() {
            super(1);
        }

        public final void a(c1 c1Var) {
            jo.p.h(c1Var, "$this$null");
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(c1 c1Var) {
            a(c1Var);
            return wn.v.f59242a;
        }
    }

    public static final io.l<c1, wn.v> a() {
        return f14376a;
    }

    public static final x0.f b(x0.f fVar, io.l<? super c1, wn.v> lVar, x0.f fVar2) {
        jo.p.h(fVar, "<this>");
        jo.p.h(lVar, "inspectorInfo");
        jo.p.h(fVar2, "wrapped");
        z0 z0Var = new z0(lVar);
        return fVar.L(z0Var).L(fVar2).L(z0Var.b());
    }

    public static final boolean c() {
        return f14377b;
    }
}
