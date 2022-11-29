package a1;

/* loaded from: classes.dex */
public final class f implements r1.d<f>, r1.b {

    /* renamed from: w  reason: collision with root package name */
    public final io.l<x, wn.v> f308w;

    /* renamed from: x  reason: collision with root package name */
    public f f309x;

    /* renamed from: y  reason: collision with root package name */
    public final m0.e<f> f310y;

    /* renamed from: z  reason: collision with root package name */
    public final m0.e<j> f311z;

    /* loaded from: classes.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f312a;

        static {
            int[] iArr = new int[y.values().length];
            iArr[y.Active.ordinal()] = 1;
            iArr[y.ActiveParent.ordinal()] = 2;
            iArr[y.Captured.ordinal()] = 3;
            iArr[y.DeactivatedParent.ordinal()] = 4;
            iArr[y.Deactivated.ordinal()] = 5;
            iArr[y.Inactive.ordinal()] = 6;
            f312a = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public f(io.l<? super x, wn.v> lVar) {
        jo.p.h(lVar, "onFocusEvent");
        this.f308w = lVar;
        this.f310y = new m0.e<>(new f[16], 0);
        this.f311z = new m0.e<>(new j[16], 0);
    }

    public final void a(j jVar) {
        jo.p.h(jVar, "focusModifier");
        this.f311z.c(jVar);
        f fVar = this.f309x;
        if (fVar != null) {
            fVar.a(jVar);
        }
    }

    public final void b(m0.e<j> eVar) {
        m0.e<j> eVar2 = this.f311z;
        eVar2.e(eVar2.p(), eVar);
        f fVar = this.f309x;
        if (fVar != null) {
            fVar.b(eVar);
        }
    }

    @Override // r1.d
    /* renamed from: c */
    public f getValue() {
        return this;
    }

    public final void f() {
        if (this.f311z.r()) {
            this.f308w.invoke(y.Inactive);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.lang.Boolean] */
    public final void g() {
        y yVar;
        j jVar;
        j jVar2;
        int p10 = this.f311z.p();
        if (p10 != 0) {
            int i10 = 0;
            if (p10 != 1) {
                m0.e<j> eVar = this.f311z;
                int p11 = eVar.p();
                j jVar3 = null;
                if (p11 > 0) {
                    j[] n10 = eVar.n();
                    j jVar4 = null;
                    do {
                        j jVar5 = n10[i10];
                        jVar2 = jVar3;
                        jVar2 = jVar3;
                        switch (a.f312a[jVar5.l().ordinal()]) {
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                                jVar4 = jVar5;
                                jVar2 = Boolean.FALSE;
                                break;
                            case 5:
                                if (jVar3 == null) {
                                    jVar2 = Boolean.TRUE;
                                    break;
                                }
                                break;
                            case 6:
                                jVar2 = Boolean.FALSE;
                                break;
                        }
                        i10++;
                        jVar3 = jVar2;
                    } while (i10 < p11);
                    jVar = jVar2;
                    jVar3 = jVar4;
                } else {
                    jVar = null;
                }
                if (jVar3 == null || (yVar = jVar3.l()) == null) {
                    if (jo.p.c(jVar, Boolean.TRUE)) {
                        yVar = y.Deactivated;
                    } else {
                        yVar = y.Inactive;
                    }
                }
            } else {
                yVar = this.f311z.n()[0].l();
            }
        } else {
            yVar = y.Inactive;
        }
        this.f308w.invoke(yVar);
        f fVar = this.f309x;
        if (fVar != null) {
            fVar.g();
        }
    }

    @Override // r1.d
    public r1.f<f> getKey() {
        return e.a();
    }

    public final void i(j jVar) {
        jo.p.h(jVar, "focusModifier");
        this.f311z.u(jVar);
        f fVar = this.f309x;
        if (fVar != null) {
            fVar.i(jVar);
        }
    }

    public final void j(m0.e<j> eVar) {
        this.f311z.x(eVar);
        f fVar = this.f309x;
        if (fVar != null) {
            fVar.j(eVar);
        }
    }

    @Override // r1.b
    public void j0(r1.e eVar) {
        jo.p.h(eVar, "scope");
        f fVar = (f) eVar.a(e.a());
        if (!jo.p.c(fVar, this.f309x)) {
            f fVar2 = this.f309x;
            if (fVar2 != null) {
                fVar2.f310y.u(this);
                fVar2.j(this.f311z);
            }
            this.f309x = fVar;
            if (fVar != null) {
                fVar.f310y.c(this);
                fVar.b(this.f311z);
            }
        }
        this.f309x = (f) eVar.a(e.a());
    }
}
