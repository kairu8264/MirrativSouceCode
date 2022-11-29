package f0;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final e f31379a = new e();

    /* renamed from: b  reason: collision with root package name */
    public static io.p<l0.i, Integer, wn.v> f31380b = s0.c.c(1699492330, false, a.f31381w);

    /* loaded from: classes.dex */
    public static final class a extends jo.q implements io.p<l0.i, Integer, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public static final a f31381w = new a();

        public a() {
            super(2);
        }

        public final void a(l0.i iVar, int i10) {
            if ((i10 & 11) == 2 && iVar.j()) {
                iVar.I();
            }
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ wn.v invoke(l0.i iVar, Integer num) {
            a(iVar, num.intValue());
            return wn.v.f59242a;
        }
    }

    public final io.p<l0.i, Integer, wn.v> a() {
        return f31380b;
    }
}
