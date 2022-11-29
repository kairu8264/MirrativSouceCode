package ad;

/* loaded from: classes2.dex */
public final class n0 {

    /* renamed from: a  reason: collision with root package name */
    public static final n0 f1216a = new n0();

    /* renamed from: b  reason: collision with root package name */
    public static io.q<y.z0, l0.i, Integer, wn.v> f1217b = s0.c.c(1988899281, false, a.f1218w);

    /* loaded from: classes2.dex */
    public static final class a extends jo.q implements io.q<y.z0, l0.i, Integer, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public static final a f1218w = new a();

        public a() {
            super(3);
        }

        public final void a(y.z0 z0Var, l0.i iVar, int i10) {
            jo.p.h(z0Var, "$this$Button");
            if ((i10 & 81) == 16 && iVar.j()) {
                iVar.I();
            } else {
                h0.w1.c(v1.f.b(nc.i.text_recommend_identifcation_button_title, iVar, 0), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, o9.b.f44283a.b().b().C(new y1.d0(v1.b.a(nc.b.F, iVar, 0), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, 0L, null, 262142, null)), iVar, 0, 0, 32766);
            }
        }

        @Override // io.q
        public /* bridge */ /* synthetic */ wn.v s0(y.z0 z0Var, l0.i iVar, Integer num) {
            a(z0Var, iVar, num.intValue());
            return wn.v.f59242a;
        }
    }

    public final io.q<y.z0, l0.i, Integer, wn.v> a() {
        return f1217b;
    }
}
