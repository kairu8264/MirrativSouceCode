package f0;

/* loaded from: classes.dex */
public final class b {

    /* loaded from: classes.dex */
    public static final class a extends jo.q implements io.l<y1.z, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public static final a f31303w = new a();

        public a() {
            super(1);
        }

        public final void a(y1.z zVar) {
            jo.p.h(zVar, "it");
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(y1.z zVar) {
            a(zVar);
            return wn.v.f59242a;
        }
    }

    /* renamed from: f0.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0322b extends jo.q implements io.l<e2.a0, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.l<String, wn.v> f31304w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ l0.s0<e2.a0> f31305x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ l0.s0<String> f31306y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C0322b(io.l<? super String, wn.v> lVar, l0.s0<e2.a0> s0Var, l0.s0<String> s0Var2) {
            super(1);
            this.f31304w = lVar;
            this.f31305x = s0Var;
            this.f31306y = s0Var2;
        }

        public final void a(e2.a0 a0Var) {
            jo.p.h(a0Var, "newTextFieldValueState");
            b.c(this.f31305x, a0Var);
            boolean z10 = !jo.p.c(b.d(this.f31306y), a0Var.h());
            b.e(this.f31306y, a0Var.h());
            if (z10) {
                this.f31304w.invoke(a0Var.h());
            }
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(e2.a0 a0Var) {
            a(a0Var);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends jo.q implements io.p<l0.i, Integer, wn.v> {
        public final /* synthetic */ boolean A;
        public final /* synthetic */ y1.d0 B;
        public final /* synthetic */ v C;
        public final /* synthetic */ u D;
        public final /* synthetic */ boolean E;
        public final /* synthetic */ int F;
        public final /* synthetic */ e2.i0 G;
        public final /* synthetic */ io.l<y1.z, wn.v> H;
        public final /* synthetic */ x.m I;
        public final /* synthetic */ c1.u J;
        public final /* synthetic */ io.q<io.p<? super l0.i, ? super Integer, wn.v>, l0.i, Integer, wn.v> K;
        public final /* synthetic */ int L;
        public final /* synthetic */ int M;
        public final /* synthetic */ int N;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ String f31307w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ io.l<String, wn.v> f31308x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ x0.f f31309y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ boolean f31310z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(String str, io.l<? super String, wn.v> lVar, x0.f fVar, boolean z10, boolean z11, y1.d0 d0Var, v vVar, u uVar, boolean z12, int i10, e2.i0 i0Var, io.l<? super y1.z, wn.v> lVar2, x.m mVar, c1.u uVar2, io.q<? super io.p<? super l0.i, ? super Integer, wn.v>, ? super l0.i, ? super Integer, wn.v> qVar, int i11, int i12, int i13) {
            super(2);
            this.f31307w = str;
            this.f31308x = lVar;
            this.f31309y = fVar;
            this.f31310z = z10;
            this.A = z11;
            this.B = d0Var;
            this.C = vVar;
            this.D = uVar;
            this.E = z12;
            this.F = i10;
            this.G = i0Var;
            this.H = lVar2;
            this.I = mVar;
            this.J = uVar2;
            this.K = qVar;
            this.L = i11;
            this.M = i12;
            this.N = i13;
        }

        public final void a(l0.i iVar, int i10) {
            b.a(this.f31307w, this.f31308x, this.f31309y, this.f31310z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.J, this.K, iVar, this.L | 1, this.M, this.N);
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ wn.v invoke(l0.i iVar, Integer num) {
            a(iVar, num.intValue());
            return wn.v.f59242a;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:142:0x01b1, code lost:
        if (r0.P(r51) == false) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:107:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0371  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x038d  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0390  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x03b4  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0427  */
    /* JADX WARN: Removed duplicated region for block: B:242:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0136  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(java.lang.String r38, io.l<? super java.lang.String, wn.v> r39, x0.f r40, boolean r41, boolean r42, y1.d0 r43, f0.v r44, f0.u r45, boolean r46, int r47, e2.i0 r48, io.l<? super y1.z, wn.v> r49, x.m r50, c1.u r51, io.q<? super io.p<? super l0.i, ? super java.lang.Integer, wn.v>, ? super l0.i, ? super java.lang.Integer, wn.v> r52, l0.i r53, int r54, int r55, int r56) {
        /*
            Method dump skipped, instructions count: 1102
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: f0.b.a(java.lang.String, io.l, x0.f, boolean, boolean, y1.d0, f0.v, f0.u, boolean, int, e2.i0, io.l, x.m, c1.u, io.q, l0.i, int, int, int):void");
    }

    public static final e2.a0 b(l0.s0<e2.a0> s0Var) {
        return s0Var.getValue();
    }

    public static final void c(l0.s0<e2.a0> s0Var, e2.a0 a0Var) {
        s0Var.setValue(a0Var);
    }

    public static final String d(l0.s0<String> s0Var) {
        return s0Var.getValue();
    }

    public static final void e(l0.s0<String> s0Var, String str) {
        s0Var.setValue(str);
    }
}
