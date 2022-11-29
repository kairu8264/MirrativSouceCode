package h0;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a  reason: collision with root package name */
    public static final j f33920a = new j();

    /* renamed from: b  reason: collision with root package name */
    public static io.q<y.z0, l0.i, Integer, wn.v> f33921b = s0.c.c(-771938130, false, a.f33922w);

    /* loaded from: classes.dex */
    public static final class a extends jo.q implements io.q<y.z0, l0.i, Integer, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public static final a f33922w = new a();

        public a() {
            super(3);
        }

        public final void a(y.z0 z0Var, l0.i iVar, int i10) {
            jo.p.h(z0Var, "$this$null");
            if ((i10 & 81) == 16 && iVar.j()) {
                iVar.I();
            }
        }

        @Override // io.q
        public /* bridge */ /* synthetic */ wn.v s0(y.z0 z0Var, l0.i iVar, Integer num) {
            a(z0Var, iVar, num.intValue());
            return wn.v.f59242a;
        }
    }

    public final io.q<y.z0, l0.i, Integer, wn.v> a() {
        return f33921b;
    }
}
