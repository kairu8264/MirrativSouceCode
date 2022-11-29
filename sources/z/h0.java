package z;

/* loaded from: classes.dex */
public final class h0 {

    /* loaded from: classes.dex */
    public static final class a extends jo.q implements io.a<g0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ int f62248w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ int f62249x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i10, int i11) {
            super(0);
            this.f62248w = i10;
            this.f62249x = i11;
        }

        @Override // io.a
        /* renamed from: a */
        public final g0 invoke() {
            return new g0(this.f62248w, this.f62249x);
        }
    }

    public static final g0 a(int i10, int i11, l0.i iVar, int i12, int i13) {
        iVar.x(1470655220);
        if ((i13 & 1) != 0) {
            i10 = 0;
        }
        if ((i13 & 2) != 0) {
            i11 = 0;
        }
        g0 g0Var = (g0) u0.b.b(new Object[0], g0.f62215t.a(), null, new a(i10, i11), iVar, 72, 4);
        iVar.O();
        return g0Var;
    }
}
