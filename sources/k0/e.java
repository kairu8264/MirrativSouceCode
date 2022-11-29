package k0;

import c1.c0;
import l0.c2;
import l0.u1;
import uo.q0;
import v.x;
import v.y;
import wn.v;

/* loaded from: classes.dex */
public abstract class e implements x {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f38283a;

    /* renamed from: b  reason: collision with root package name */
    public final float f38284b;

    /* renamed from: c  reason: collision with root package name */
    public final c2<c0> f38285c;

    @co.f(c = "androidx.compose.material.ripple.Ripple$rememberUpdatedInstance$1", f = "Ripple.kt", l = {356}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class a extends co.l implements io.p<q0, ao.d<? super v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f38286w;

        /* renamed from: x  reason: collision with root package name */
        public /* synthetic */ Object f38287x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ x.k f38288y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ m f38289z;

        /* renamed from: k0.e$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0532a implements xo.d<x.j> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ m f38290w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ q0 f38291x;

            public C0532a(m mVar, q0 q0Var) {
                this.f38290w = mVar;
                this.f38291x = q0Var;
            }

            @Override // xo.d
            public Object emit(x.j jVar, ao.d<? super v> dVar) {
                x.j jVar2 = jVar;
                if (jVar2 instanceof x.p) {
                    this.f38290w.e((x.p) jVar2, this.f38291x);
                } else if (jVar2 instanceof x.q) {
                    this.f38290w.g(((x.q) jVar2).a());
                } else if (jVar2 instanceof x.o) {
                    this.f38290w.g(((x.o) jVar2).a());
                } else {
                    this.f38290w.h(jVar2, this.f38291x);
                }
                return v.f59242a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(x.k kVar, m mVar, ao.d<? super a> dVar) {
            super(2, dVar);
            this.f38288y = kVar;
            this.f38289z = mVar;
        }

        @Override // co.a
        public final ao.d<v> create(Object obj, ao.d<?> dVar) {
            a aVar = new a(this.f38288y, this.f38289z, dVar);
            aVar.f38287x = obj;
            return aVar;
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super v> dVar) {
            return ((a) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f38286w;
            if (i10 == 0) {
                wn.m.b(obj);
                xo.c<x.j> c11 = this.f38288y.c();
                C0532a c0532a = new C0532a(this.f38289z, (q0) this.f38287x);
                this.f38286w = 1;
                if (c11.a(c0532a, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                wn.m.b(obj);
            }
            return v.f59242a;
        }
    }

    public e(boolean z10, float f10, c2<c0> c2Var) {
        this.f38283a = z10;
        this.f38284b = f10;
        this.f38285c = c2Var;
    }

    public /* synthetic */ e(boolean z10, float f10, c2 c2Var, jo.h hVar) {
        this(z10, f10, c2Var);
    }

    @Override // v.x
    public final y a(x.k kVar, l0.i iVar, int i10) {
        long a10;
        jo.p.h(kVar, "interactionSource");
        iVar.x(988743187);
        o oVar = (o) iVar.G(p.d());
        iVar.x(-1524341038);
        if (this.f38285c.getValue().u() != c0.f18634b.e()) {
            a10 = this.f38285c.getValue().u();
        } else {
            a10 = oVar.a(iVar, 0);
        }
        iVar.O();
        m b10 = b(kVar, this.f38283a, this.f38284b, u1.l(c0.g(a10), iVar, 0), u1.l(oVar.b(iVar, 0), iVar, 0), iVar, (i10 & 14) | (458752 & (i10 << 12)));
        l0.c0.d(b10, kVar, new a(kVar, b10, null), iVar, ((i10 << 3) & 112) | 8);
        iVar.O();
        return b10;
    }

    public abstract m b(x.k kVar, boolean z10, float f10, c2<c0> c2Var, c2<f> c2Var2, l0.i iVar, int i10);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof e) {
            e eVar = (e) obj;
            return this.f38283a == eVar.f38283a && m2.g.n(this.f38284b, eVar.f38284b) && jo.p.c(this.f38285c, eVar.f38285c);
        }
        return false;
    }

    public int hashCode() {
        return (((Boolean.hashCode(this.f38283a) * 31) + m2.g.o(this.f38284b)) * 31) + this.f38285c.hashCode();
    }
}
