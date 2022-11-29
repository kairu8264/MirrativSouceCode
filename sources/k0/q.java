package k0;

import c1.b0;
import c1.c0;
import java.util.ArrayList;
import java.util.List;
import l0.c2;
import uo.q0;
import wn.v;
import xn.a0;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f38347a;

    /* renamed from: b  reason: collision with root package name */
    public final c2<f> f38348b;

    /* renamed from: c  reason: collision with root package name */
    public final u.a<Float, u.m> f38349c;

    /* renamed from: d  reason: collision with root package name */
    public final List<x.j> f38350d;

    /* renamed from: e  reason: collision with root package name */
    public x.j f38351e;

    @co.f(c = "androidx.compose.material.ripple.StateLayer$handleInteraction$1", f = "Ripple.kt", l = {290}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class a extends co.l implements io.p<q0, ao.d<? super v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f38352w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ float f38354y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ u.i<Float> f38355z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(float f10, u.i<Float> iVar, ao.d<? super a> dVar) {
            super(2, dVar);
            this.f38354y = f10;
            this.f38355z = iVar;
        }

        @Override // co.a
        public final ao.d<v> create(Object obj, ao.d<?> dVar) {
            return new a(this.f38354y, this.f38355z, dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super v> dVar) {
            return ((a) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f38352w;
            if (i10 == 0) {
                wn.m.b(obj);
                u.a aVar = q.this.f38349c;
                Float c11 = co.b.c(this.f38354y);
                u.i<Float> iVar = this.f38355z;
                this.f38352w = 1;
                if (u.a.f(aVar, c11, iVar, null, null, this, 12, null) == c10) {
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

    @co.f(c = "androidx.compose.material.ripple.StateLayer$handleInteraction$2", f = "Ripple.kt", l = {296}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class b extends co.l implements io.p<q0, ao.d<? super v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f38356w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ u.i<Float> f38358y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(u.i<Float> iVar, ao.d<? super b> dVar) {
            super(2, dVar);
            this.f38358y = iVar;
        }

        @Override // co.a
        public final ao.d<v> create(Object obj, ao.d<?> dVar) {
            return new b(this.f38358y, dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super v> dVar) {
            return ((b) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f38356w;
            if (i10 == 0) {
                wn.m.b(obj);
                u.a aVar = q.this.f38349c;
                Float c11 = co.b.c(0.0f);
                u.i<Float> iVar = this.f38358y;
                this.f38356w = 1;
                if (u.a.f(aVar, c11, iVar, null, null, this, 12, null) == c10) {
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

    public q(boolean z10, c2<f> c2Var) {
        jo.p.h(c2Var, "rippleAlpha");
        this.f38347a = z10;
        this.f38348b = c2Var;
        this.f38349c = u.b.b(0.0f, 0.0f, 2, null);
        this.f38350d = new ArrayList();
    }

    public final void b(e1.e eVar, float f10, long j10) {
        float I0;
        jo.p.h(eVar, "$this$drawStateLayer");
        if (Float.isNaN(f10)) {
            I0 = h.a(eVar, this.f38347a, eVar.c());
        } else {
            I0 = eVar.I0(f10);
        }
        float f11 = I0;
        float floatValue = this.f38349c.o().floatValue();
        if (floatValue > 0.0f) {
            long k10 = c0.k(j10, floatValue, 0.0f, 0.0f, 0.0f, 14, null);
            if (!this.f38347a) {
                e1.e.D(eVar, k10, f11, 0L, 0.0f, null, null, 0, 124, null);
                return;
            }
            float i10 = b1.l.i(eVar.c());
            float g10 = b1.l.g(eVar.c());
            int b10 = b0.f18630a.b();
            e1.d M0 = eVar.M0();
            long c10 = M0.c();
            M0.e().p();
            M0.d().a(0.0f, 0.0f, i10, g10, b10);
            e1.e.D(eVar, k10, f11, 0L, 0.0f, null, null, 0, 124, null);
            M0.e().k();
            M0.f(c10);
        }
    }

    public final void c(x.j jVar, q0 q0Var) {
        u.i d10;
        float a10;
        u.i c10;
        jo.p.h(jVar, "interaction");
        jo.p.h(q0Var, "scope");
        boolean z10 = jVar instanceof x.g;
        if (z10) {
            this.f38350d.add(jVar);
        } else if (jVar instanceof x.h) {
            this.f38350d.remove(((x.h) jVar).a());
        } else if (jVar instanceof x.d) {
            this.f38350d.add(jVar);
        } else if (jVar instanceof x.e) {
            this.f38350d.remove(((x.e) jVar).a());
        } else if (jVar instanceof x.b) {
            this.f38350d.add(jVar);
        } else if (jVar instanceof x.c) {
            this.f38350d.remove(((x.c) jVar).a());
        } else if (!(jVar instanceof x.a)) {
            return;
        } else {
            this.f38350d.remove(((x.a) jVar).a());
        }
        x.j jVar2 = (x.j) a0.j0(this.f38350d);
        if (jo.p.c(this.f38351e, jVar2)) {
            return;
        }
        if (jVar2 != null) {
            if (z10) {
                a10 = this.f38348b.getValue().c();
            } else if (jVar instanceof x.d) {
                a10 = this.f38348b.getValue().b();
            } else {
                a10 = jVar instanceof x.b ? this.f38348b.getValue().a() : 0.0f;
            }
            c10 = n.c(jVar2);
            uo.l.d(q0Var, null, null, new a(a10, c10, null), 3, null);
        } else {
            d10 = n.d(this.f38351e);
            uo.l.d(q0Var, null, null, new b(d10, null), 3, null);
        }
        this.f38351e = jVar2;
    }
}
