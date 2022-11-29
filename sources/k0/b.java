package k0;

import c1.c0;
import java.util.Map;
import l0.c2;
import l0.k1;
import l0.u1;
import uo.q0;
import v0.u;
import wn.v;

/* loaded from: classes.dex */
public final class b extends m implements k1 {
    public final c2<f> A;
    public final u<x.p, g> B;

    /* renamed from: x  reason: collision with root package name */
    public final boolean f38275x;

    /* renamed from: y  reason: collision with root package name */
    public final float f38276y;

    /* renamed from: z  reason: collision with root package name */
    public final c2<c0> f38277z;

    @co.f(c = "androidx.compose.material.ripple.CommonRippleIndicationInstance$addRipple$2", f = "CommonRipple.kt", l = {87}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class a extends co.l implements io.p<q0, ao.d<? super v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f38278w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ g f38279x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ b f38280y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ x.p f38281z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(g gVar, b bVar, x.p pVar, ao.d<? super a> dVar) {
            super(2, dVar);
            this.f38279x = gVar;
            this.f38280y = bVar;
            this.f38281z = pVar;
        }

        @Override // co.a
        public final ao.d<v> create(Object obj, ao.d<?> dVar) {
            return new a(this.f38279x, this.f38280y, this.f38281z, dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super v> dVar) {
            return ((a) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f38278w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    g gVar = this.f38279x;
                    this.f38278w = 1;
                    if (gVar.d(this) == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                this.f38280y.B.remove(this.f38281z);
                return v.f59242a;
            } catch (Throwable th2) {
                this.f38280y.B.remove(this.f38281z);
                throw th2;
            }
        }
    }

    public b(boolean z10, float f10, c2<c0> c2Var, c2<f> c2Var2) {
        super(z10, c2Var2);
        this.f38275x = z10;
        this.f38276y = f10;
        this.f38277z = c2Var;
        this.A = c2Var2;
        this.B = u1.e();
    }

    public /* synthetic */ b(boolean z10, float f10, c2 c2Var, c2 c2Var2, jo.h hVar) {
        this(z10, f10, c2Var, c2Var2);
    }

    @Override // l0.k1
    public void a() {
    }

    @Override // l0.k1
    public void b() {
        this.B.clear();
    }

    @Override // l0.k1
    public void c() {
        this.B.clear();
    }

    @Override // v.y
    public void d(e1.c cVar) {
        jo.p.h(cVar, "<this>");
        long u10 = this.f38277z.getValue().u();
        cVar.c1();
        f(cVar, this.f38276y, u10);
        j(cVar, u10);
    }

    @Override // k0.m
    public void e(x.p pVar, q0 q0Var) {
        jo.p.h(pVar, "interaction");
        jo.p.h(q0Var, "scope");
        for (Map.Entry<x.p, g> entry : this.B.entrySet()) {
            entry.getValue().h();
        }
        g gVar = new g(this.f38275x ? b1.f.d(pVar.a()) : null, this.f38276y, this.f38275x, null);
        this.B.put(pVar, gVar);
        uo.l.d(q0Var, null, null, new a(gVar, this, pVar, null), 3, null);
    }

    @Override // k0.m
    public void g(x.p pVar) {
        jo.p.h(pVar, "interaction");
        g gVar = this.B.get(pVar);
        if (gVar != null) {
            gVar.h();
        }
    }

    public final void j(e1.e eVar, long j10) {
        for (Map.Entry<x.p, g> entry : this.B.entrySet()) {
            g value = entry.getValue();
            float d10 = this.A.getValue().d();
            if (!(d10 == 0.0f)) {
                value.e(eVar, c0.k(j10, d10, 0.0f, 0.0f, 0.0f, 14, null));
            }
        }
    }
}
