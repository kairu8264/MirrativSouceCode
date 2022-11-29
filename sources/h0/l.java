package h0;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a  reason: collision with root package name */
    public static final l f33968a = new l();

    /* renamed from: b  reason: collision with root package name */
    public static io.q<a1, l0.i, Integer, wn.v> f33969b = s0.c.c(996639038, false, a.f33970w);

    /* loaded from: classes.dex */
    public static final class a extends jo.q implements io.q<a1, l0.i, Integer, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public static final a f33970w = new a();

        public a() {
            super(3);
        }

        public final void a(a1 a1Var, l0.i iVar, int i10) {
            int i11;
            jo.p.h(a1Var, "it");
            if ((i10 & 14) == 0) {
                i11 = i10 | (iVar.P(a1Var) ? 4 : 2);
            } else {
                i11 = i10;
            }
            if ((i11 & 91) == 18 && iVar.j()) {
                iVar.I();
            } else {
                f1.d(a1Var, null, false, null, 0L, 0L, 0L, 0.0f, iVar, i11 & 14, 254);
            }
        }

        @Override // io.q
        public /* bridge */ /* synthetic */ wn.v s0(a1 a1Var, l0.i iVar, Integer num) {
            a(a1Var, iVar, num.intValue());
            return wn.v.f59242a;
        }
    }

    public final io.q<a1, l0.i, Integer, wn.v> a() {
        return f33969b;
    }
}
