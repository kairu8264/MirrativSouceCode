package l0;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    public static final g f39003a = new g();

    /* renamed from: b  reason: collision with root package name */
    public static io.p<i, Integer, wn.v> f39004b = s0.c.c(954879418, false, a.f39006w);

    /* renamed from: c  reason: collision with root package name */
    public static io.p<i, Integer, wn.v> f39005c = s0.c.c(1918065384, false, b.f39007w);

    /* loaded from: classes.dex */
    public static final class a extends jo.q implements io.p<i, Integer, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public static final a f39006w = new a();

        public a() {
            super(2);
        }

        public final void a(i iVar, int i10) {
            if ((i10 & 11) == 2 && iVar.j()) {
                iVar.I();
            }
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ wn.v invoke(i iVar, Integer num) {
            a(iVar, num.intValue());
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends jo.q implements io.p<i, Integer, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public static final b f39007w = new b();

        public b() {
            super(2);
        }

        public final void a(i iVar, int i10) {
            if ((i10 & 11) == 2 && iVar.j()) {
                iVar.I();
            }
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ wn.v invoke(i iVar, Integer num) {
            a(iVar, num.intValue());
            return wn.v.f59242a;
        }
    }

    public final io.p<i, Integer, wn.v> a() {
        return f39004b;
    }

    public final io.p<i, Integer, wn.v> b() {
        return f39005c;
    }
}
