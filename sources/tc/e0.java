package tc;

/* loaded from: classes2.dex */
public final class e0 {

    /* renamed from: a  reason: collision with root package name */
    public static final e0 f53490a = new e0();

    /* renamed from: b  reason: collision with root package name */
    public static io.p<l0.i, Integer, wn.v> f53491b = s0.c.c(-2079200446, false, a.f53492w);

    /* loaded from: classes2.dex */
    public static final class a extends jo.q implements io.p<l0.i, Integer, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public static final a f53492w = new a();

        public a() {
            super(2);
        }

        public final void a(l0.i iVar, int i10) {
            if ((i10 & 11) == 2 && iVar.j()) {
                iVar.I();
            } else {
                r1.a(iVar, 0);
            }
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ wn.v invoke(l0.i iVar, Integer num) {
            a(iVar, num.intValue());
            return wn.v.f59242a;
        }
    }

    public final io.p<l0.i, Integer, wn.v> a() {
        return f53491b;
    }
}
