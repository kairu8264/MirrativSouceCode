package y;

/* loaded from: classes.dex */
public final class m {

    /* loaded from: classes.dex */
    public static final class a extends jo.q implements io.p<q1.z0, m2.b, q1.d0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ q1.c0 f60841w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ io.q<n, l0.i, Integer, wn.v> f60842x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ int f60843y;

        /* renamed from: y.m$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C1031a extends jo.q implements io.p<l0.i, Integer, wn.v> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ io.q<n, l0.i, Integer, wn.v> f60844w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ o f60845x;

            /* renamed from: y  reason: collision with root package name */
            public final /* synthetic */ int f60846y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C1031a(io.q<? super n, ? super l0.i, ? super Integer, wn.v> qVar, o oVar, int i10) {
                super(2);
                this.f60844w = qVar;
                this.f60845x = oVar;
                this.f60846y = i10;
            }

            public final void a(l0.i iVar, int i10) {
                if ((i10 & 11) == 2 && iVar.j()) {
                    iVar.I();
                } else {
                    this.f60844w.s0(this.f60845x, iVar, Integer.valueOf((this.f60846y >> 6) & 112));
                }
            }

            @Override // io.p
            public /* bridge */ /* synthetic */ wn.v invoke(l0.i iVar, Integer num) {
                a(iVar, num.intValue());
                return wn.v.f59242a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(q1.c0 c0Var, io.q<? super n, ? super l0.i, ? super Integer, wn.v> qVar, int i10) {
            super(2);
            this.f60841w = c0Var;
            this.f60842x = qVar;
            this.f60843y = i10;
        }

        public final q1.d0 a(q1.z0 z0Var, long j10) {
            jo.p.h(z0Var, "$this$SubcomposeLayout");
            return this.f60841w.c(z0Var, z0Var.V(wn.v.f59242a, s0.c.c(-1945019079, true, new C1031a(this.f60842x, new o(z0Var, j10, null), this.f60843y))), j10);
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ q1.d0 invoke(q1.z0 z0Var, m2.b bVar) {
            return a(z0Var, bVar.t());
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends jo.q implements io.p<l0.i, Integer, wn.v> {
        public final /* synthetic */ int A;
        public final /* synthetic */ int B;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ x0.f f60847w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ x0.a f60848x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ boolean f60849y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ io.q<n, l0.i, Integer, wn.v> f60850z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(x0.f fVar, x0.a aVar, boolean z10, io.q<? super n, ? super l0.i, ? super Integer, wn.v> qVar, int i10, int i11) {
            super(2);
            this.f60847w = fVar;
            this.f60848x = aVar;
            this.f60849y = z10;
            this.f60850z = qVar;
            this.A = i10;
            this.B = i11;
        }

        public final void a(l0.i iVar, int i10) {
            m.a(this.f60847w, this.f60848x, this.f60849y, this.f60850z, iVar, this.A | 1, this.B);
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ wn.v invoke(l0.i iVar, Integer num) {
            a(iVar, num.intValue());
            return wn.v.f59242a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:72:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(x0.f r12, x0.a r13, boolean r14, io.q<? super y.n, ? super l0.i, ? super java.lang.Integer, wn.v> r15, l0.i r16, int r17, int r18) {
        /*
            Method dump skipped, instructions count: 240
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: y.m.a(x0.f, x0.a, boolean, io.q, l0.i, int, int):void");
    }
}
