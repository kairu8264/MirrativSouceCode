package b0;

import java.util.LinkedHashMap;
import java.util.Map;
import l0.a0;
import l0.c0;
import l0.s0;
import l0.z;
import l0.z1;
import wn.v;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final u0.c f16668a;

    /* renamed from: b  reason: collision with root package name */
    public final io.a<f> f16669b;

    /* renamed from: c  reason: collision with root package name */
    public final Map<Object, a> f16670c;

    /* renamed from: d  reason: collision with root package name */
    public m2.d f16671d;

    /* renamed from: e  reason: collision with root package name */
    public long f16672e;

    /* loaded from: classes.dex */
    public final class a {

        /* renamed from: a  reason: collision with root package name */
        public final Object f16673a;

        /* renamed from: b  reason: collision with root package name */
        public final Object f16674b;

        /* renamed from: c  reason: collision with root package name */
        public final s0 f16675c;

        /* renamed from: d  reason: collision with root package name */
        public io.p<? super l0.i, ? super Integer, v> f16676d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ e f16677e;

        /* renamed from: b0.e$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0090a extends jo.q implements io.p<l0.i, Integer, v> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ e f16678w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ a f16679x;

            /* renamed from: b0.e$a$a$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C0091a extends jo.q implements io.p<l0.i, Integer, v> {

                /* renamed from: w  reason: collision with root package name */
                public final /* synthetic */ f f16680w;

                /* renamed from: x  reason: collision with root package name */
                public final /* synthetic */ int f16681x;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0091a(f fVar, int i10) {
                    super(2);
                    this.f16680w = fVar;
                    this.f16681x = i10;
                }

                public final void a(l0.i iVar, int i10) {
                    if ((i10 & 11) == 2 && iVar.j()) {
                        iVar.I();
                    } else {
                        this.f16680w.g(this.f16681x, iVar, 0);
                    }
                }

                @Override // io.p
                public /* bridge */ /* synthetic */ v invoke(l0.i iVar, Integer num) {
                    a(iVar, num.intValue());
                    return v.f59242a;
                }
            }

            /* renamed from: b0.e$a$a$b */
            /* loaded from: classes.dex */
            public static final class b extends jo.q implements io.l<a0, z> {

                /* renamed from: w  reason: collision with root package name */
                public final /* synthetic */ a f16682w;

                /* renamed from: b0.e$a$a$b$a  reason: collision with other inner class name */
                /* loaded from: classes.dex */
                public static final class C0092a implements z {

                    /* renamed from: a  reason: collision with root package name */
                    public final /* synthetic */ a f16683a;

                    public C0092a(a aVar) {
                        this.f16683a = aVar;
                    }

                    @Override // l0.z
                    public void dispose() {
                        this.f16683a.f16676d = null;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(a aVar) {
                    super(1);
                    this.f16682w = aVar;
                }

                @Override // io.l
                /* renamed from: a */
                public final z invoke(a0 a0Var) {
                    jo.p.h(a0Var, "$this$DisposableEffect");
                    return new C0092a(this.f16682w);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0090a(e eVar, a aVar) {
                super(2);
                this.f16678w = eVar;
                this.f16679x = aVar;
            }

            public final void a(l0.i iVar, int i10) {
                int f10;
                if ((i10 & 11) == 2 && iVar.j()) {
                    iVar.I();
                    return;
                }
                f invoke = this.f16678w.d().invoke();
                Integer num = invoke.c().get(this.f16679x.e());
                if (num != null) {
                    this.f16679x.h(num.intValue());
                    f10 = num.intValue();
                } else {
                    f10 = this.f16679x.f();
                }
                iVar.x(-715769699);
                if (f10 < invoke.d()) {
                    Object e10 = invoke.e(f10);
                    if (jo.p.c(e10, this.f16679x.e())) {
                        this.f16678w.f16668a.a(e10, s0.c.b(iVar, -1238863364, true, new C0091a(invoke, f10)), iVar, 568);
                    }
                }
                iVar.O();
                c0.a(this.f16679x.e(), new b(this.f16679x), iVar, 8);
            }

            @Override // io.p
            public /* bridge */ /* synthetic */ v invoke(l0.i iVar, Integer num) {
                a(iVar, num.intValue());
                return v.f59242a;
            }
        }

        public a(e eVar, int i10, Object obj, Object obj2) {
            s0 e10;
            jo.p.h(obj, "key");
            this.f16677e = eVar;
            this.f16673a = obj;
            this.f16674b = obj2;
            e10 = z1.e(Integer.valueOf(i10), null, 2, null);
            this.f16675c = e10;
        }

        public final io.p<l0.i, Integer, v> c() {
            return s0.c.c(1403994769, true, new C0090a(this.f16677e, this));
        }

        public final io.p<l0.i, Integer, v> d() {
            io.p pVar = this.f16676d;
            if (pVar == null) {
                io.p<l0.i, Integer, v> c10 = c();
                this.f16676d = c10;
                return c10;
            }
            return pVar;
        }

        public final Object e() {
            return this.f16673a;
        }

        public final int f() {
            return ((Number) this.f16675c.getValue()).intValue();
        }

        public final Object g() {
            return this.f16674b;
        }

        public final void h(int i10) {
            this.f16675c.setValue(Integer.valueOf(i10));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public e(u0.c cVar, io.a<? extends f> aVar) {
        jo.p.h(cVar, "saveableStateHolder");
        jo.p.h(aVar, "itemProvider");
        this.f16668a = cVar;
        this.f16669b = aVar;
        this.f16670c = new LinkedHashMap();
        this.f16671d = m2.f.a(0.0f, 0.0f);
        this.f16672e = m2.c.b(0, 0, 0, 0, 15, null);
    }

    public final io.p<l0.i, Integer, v> b(int i10, Object obj) {
        jo.p.h(obj, "key");
        a aVar = this.f16670c.get(obj);
        Object a10 = this.f16669b.invoke().a(i10);
        if (aVar != null && aVar.f() == i10 && jo.p.c(aVar.g(), a10)) {
            return aVar.d();
        }
        a aVar2 = new a(this, i10, obj, a10);
        this.f16670c.put(obj, aVar2);
        return aVar2.d();
    }

    public final Object c(Object obj) {
        a aVar = this.f16670c.get(obj);
        if (aVar != null) {
            return aVar.g();
        }
        f invoke = this.f16669b.invoke();
        Integer num = invoke.c().get(obj);
        if (num != null) {
            return invoke.a(num.intValue());
        }
        return null;
    }

    public final io.a<f> d() {
        return this.f16669b;
    }

    public final void e(m2.d dVar, long j10) {
        jo.p.h(dVar, "density");
        if (jo.p.c(dVar, this.f16671d) && m2.b.g(j10, this.f16672e)) {
            return;
        }
        this.f16671d = dVar;
        this.f16672e = j10;
        this.f16670c.clear();
    }
}
