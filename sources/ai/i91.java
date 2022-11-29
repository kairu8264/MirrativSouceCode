package ai;

/* loaded from: classes3.dex */
public final class i91 extends qt2 implements v41, or, xb, h71, p51, v61, xg.q, l51, nc1 {
    public ik2 A;

    /* renamed from: w */
    public final f91 f5140w = new f91(this, null);

    /* renamed from: x */
    public b62 f5141x;

    /* renamed from: y */
    public f62 f5142y;

    /* renamed from: z */
    public yg2 f5143z;

    public static /* synthetic */ yg2 A(i91 i91Var, yg2 yg2Var) {
        i91Var.f5143z = yg2Var;
        return yg2Var;
    }

    public static /* synthetic */ ik2 K(i91 i91Var, ik2 ik2Var) {
        i91Var.A = ik2Var;
        return ik2Var;
    }

    public static <T> void N(T t10, g91<T> g91Var) {
        if (t10 != null) {
            g91Var.a(t10);
        }
    }

    public static /* synthetic */ b62 u(i91 i91Var, b62 b62Var) {
        i91Var.f5141x = b62Var;
        return b62Var;
    }

    public static /* synthetic */ f62 y(i91 i91Var, f62 f62Var) {
        i91Var.f5142y = f62Var;
        return f62Var;
    }

    @Override // ai.v41
    public final void B(ye0 ye0Var, String str, String str2) {
        N(this.f5141x, new g91(ye0Var, str, str2) { // from class: ai.d91

            /* renamed from: a  reason: collision with root package name */
            public final ye0 f3180a;

            /* renamed from: b  reason: collision with root package name */
            public final String f3181b;

            /* renamed from: c  reason: collision with root package name */
            public final String f3182c;

            {
                this.f3180a = ye0Var;
                this.f3181b = str;
                this.f3182c = str2;
            }

            @Override // ai.g91
            public final void a(Object obj) {
                b62 b62Var = (b62) obj;
            }
        });
        N(this.A, new g91(ye0Var, str, str2) { // from class: ai.e91

            /* renamed from: a  reason: collision with root package name */
            public final ye0 f3588a;

            /* renamed from: b  reason: collision with root package name */
            public final String f3589b;

            /* renamed from: c  reason: collision with root package name */
            public final String f3590c;

            {
                this.f3588a = ye0Var;
                this.f3589b = str;
                this.f3590c = str2;
            }

            @Override // ai.g91
            public final void a(Object obj) {
                ((ik2) obj).B(this.f3588a, this.f3589b, this.f3590c);
            }
        });
    }

    @Override // xg.q
    public final void B4() {
        N(this.f5143z, x81.f11884a);
    }

    @Override // xg.q
    public final void D5(int i10) {
        N(this.f5143z, new g91(i10) { // from class: ai.r81

            /* renamed from: a  reason: collision with root package name */
            public final int f9372a;

            {
                this.f9372a = i10;
            }

            @Override // ai.g91
            public final void a(Object obj) {
                ((yg2) obj).D5(this.f9372a);
            }
        });
    }

    public final f91 M() {
        return this.f5140w;
    }

    @Override // xg.q
    public final void c() {
        N(this.f5143z, u81.f10654a);
    }

    @Override // xg.q
    public final void d() {
        N(this.f5143z, s81.f9756a);
    }

    @Override // ai.v41
    public final void e() {
        N(this.f5141x, x71.f11880a);
        N(this.A, i81.f5134a);
    }

    @Override // ai.p51
    public final void f() {
        N(this.f5141x, l81.f6495a);
    }

    @Override // xg.q
    public final void f4() {
        N(this.f5143z, w81.f11510a);
    }

    @Override // ai.v41
    public final void g() {
        N(this.f5141x, z81.f12909a);
        N(this.A, a91.f1789a);
    }

    @Override // ai.v41
    public final void h() {
        N(this.f5141x, t81.f10197a);
        N(this.A, y81.f12480a);
    }

    @Override // ai.v61
    public final void i0() {
        N(this.f5143z, m81.f6834a);
    }

    @Override // ai.v41
    public final void j() {
        N(this.f5141x, b91.f2271a);
        N(this.A, c91.f2759a);
    }

    @Override // ai.v41
    public final void k() {
        N(this.f5141x, y71.f12477a);
        N(this.A, z71.f12908a);
    }

    @Override // ai.l51
    public final void n(sr srVar) {
        N(this.A, new g91(srVar) { // from class: ai.o81

            /* renamed from: a  reason: collision with root package name */
            public final sr f7684a;

            {
                this.f7684a = srVar;
            }

            @Override // ai.g91
            public final void a(Object obj) {
                ((ik2) obj).n(this.f7684a);
            }
        });
        N(this.f5141x, new g91(srVar) { // from class: ai.p81

            /* renamed from: a  reason: collision with root package name */
            public final sr f8348a;

            {
                this.f8348a = srVar;
            }

            @Override // ai.g91
            public final void a(Object obj) {
                ((b62) obj).n(this.f8348a);
            }
        });
    }

    @Override // ai.or
    public final void onAdClicked() {
        N(this.f5141x, a81.f1780a);
        N(this.f5142y, b81.f2269a);
    }

    @Override // ai.h71
    public final void p(hs hsVar) {
        N(this.f5141x, new g91(hsVar) { // from class: ai.h81

            /* renamed from: a  reason: collision with root package name */
            public final hs f4778a;

            {
                this.f4778a = hsVar;
            }

            @Override // ai.g91
            public final void a(Object obj) {
                ((b62) obj).p(this.f4778a);
            }
        });
        N(this.A, new g91(hsVar) { // from class: ai.j81

            /* renamed from: a  reason: collision with root package name */
            public final hs f5662a;

            {
                this.f5662a = hsVar;
            }

            @Override // ai.g91
            public final void a(Object obj) {
                ((ik2) obj).p(this.f5662a);
            }
        });
        N(this.f5143z, new g91(hsVar) { // from class: ai.k81

            /* renamed from: a  reason: collision with root package name */
            public final hs f6122a;

            {
                this.f6122a = hsVar;
            }

            @Override // ai.g91
            public final void a(Object obj) {
                ((yg2) obj).p(this.f6122a);
            }
        });
    }

    @Override // xg.q
    public final void s0() {
        N(this.f5143z, q81.f8849a);
    }

    @Override // ai.qt2
    public final void t() {
        N(this.A, n81.f7235a);
    }

    @Override // ai.xb
    public final void v(String str, String str2) {
        N(this.f5141x, new g91(str, str2) { // from class: ai.g81

            /* renamed from: a  reason: collision with root package name */
            public final String f4363a;

            /* renamed from: b  reason: collision with root package name */
            public final String f4364b;

            {
                this.f4363a = str;
                this.f4364b = str2;
            }

            @Override // ai.g91
            public final void a(Object obj) {
                ((b62) obj).v(this.f4363a, this.f4364b);
            }
        });
    }

    @Override // ai.nc1
    public final void zzb() {
        N(this.f5141x, c81.f2751a);
        N(this.f5142y, d81.f3174a);
        N(this.A, e81.f3581a);
        N(this.f5143z, f81.f3965a);
    }
}
