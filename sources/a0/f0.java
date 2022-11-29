package a0;

/* loaded from: classes.dex */
public final class f0 {

    /* loaded from: classes.dex */
    public static final class a extends jo.q implements io.a<e0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ int f90w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ int f91x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i10, int i11) {
            super(0);
            this.f90w = i10;
            this.f91x = i11;
        }

        @Override // io.a
        /* renamed from: a */
        public final e0 invoke() {
            return new e0(this.f90w, this.f91x);
        }
    }

    public static final e0 a(int i10, int i11, l0.i iVar, int i12, int i13) {
        iVar.x(29186956);
        if ((i13 & 1) != 0) {
            i10 = 0;
        }
        if ((i13 & 2) != 0) {
            i11 = 0;
        }
        e0 e0Var = (e0) u0.b.b(new Object[0], e0.f49v.a(), null, new a(i10, i11), iVar, 72, 4);
        iVar.O();
        return e0Var;
    }
}
