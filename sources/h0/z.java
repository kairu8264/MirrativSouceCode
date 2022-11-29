package h0;

import l0.c2;

/* loaded from: classes.dex */
public final class z {

    /* renamed from: b  reason: collision with root package name */
    public static final a f34376b = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public final l1<a0> f34377a;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: h0.z$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0432a extends jo.q implements io.p<u0.k, z, a0> {

            /* renamed from: w  reason: collision with root package name */
            public static final C0432a f34378w = new C0432a();

            public C0432a() {
                super(2);
            }

            @Override // io.p
            /* renamed from: a */
            public final a0 invoke(u0.k kVar, z zVar) {
                jo.p.h(kVar, "$this$Saver");
                jo.p.h(zVar, "it");
                return zVar.c();
            }
        }

        /* loaded from: classes.dex */
        public static final class b extends jo.q implements io.l<a0, z> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ io.l<a0, Boolean> f34379w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public b(io.l<? super a0, Boolean> lVar) {
                super(1);
                this.f34379w = lVar;
            }

            @Override // io.l
            /* renamed from: a */
            public final z invoke(a0 a0Var) {
                jo.p.h(a0Var, "it");
                return new z(a0Var, this.f34379w);
            }
        }

        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final u0.i<z, a0> a(io.l<? super a0, Boolean> lVar) {
            jo.p.h(lVar, "confirmStateChange");
            return u0.j.a(C0432a.f34378w, new b(lVar));
        }
    }

    public z(a0 a0Var, io.l<? super a0, Boolean> lVar) {
        u.b1 b1Var;
        jo.p.h(a0Var, "initialValue");
        jo.p.h(lVar, "confirmStateChange");
        b1Var = y.f34326c;
        this.f34377a = new l1<>(a0Var, b1Var, lVar);
    }

    public final Object a(a0 a0Var, u.i<Float> iVar, ao.d<? super wn.v> dVar) {
        Object i10 = this.f34377a.i(a0Var, iVar, dVar);
        return i10 == bo.c.c() ? i10 : wn.v.f59242a;
    }

    public final Object b(ao.d<? super wn.v> dVar) {
        u.b1 b1Var;
        a0 a0Var = a0.Closed;
        b1Var = y.f34326c;
        Object a10 = a(a0Var, b1Var, dVar);
        return a10 == bo.c.c() ? a10 : wn.v.f59242a;
    }

    public final a0 c() {
        return this.f34377a.o();
    }

    public final c2<Float> d() {
        return this.f34377a.s();
    }

    public final l1<a0> e() {
        return this.f34377a;
    }

    public final boolean f() {
        return c() == a0.Open;
    }
}
