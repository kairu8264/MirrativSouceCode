package androidx.compose.ui.platform;

/* loaded from: classes.dex */
public final class n0 {

    /* renamed from: a  reason: collision with root package name */
    public static final n0 f14530a = new n0();

    /* renamed from: b  reason: collision with root package name */
    public static io.p<l0.i, Integer, wn.v> f14531b = s0.c.c(-1759434350, false, a.f14532w);

    /* loaded from: classes.dex */
    public static final class a extends jo.q implements io.p<l0.i, Integer, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public static final a f14532w = new a();

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
        return f14531b;
    }
}
