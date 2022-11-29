package androidx.lifecycle;

import androidx.lifecycle.o;
import uo.g1;
import uo.i2;

/* loaded from: classes.dex */
public final class LifecycleCoroutineScopeImpl extends p implements r {

    /* renamed from: w  reason: collision with root package name */
    public final o f15447w;

    /* renamed from: x  reason: collision with root package name */
    public final ao.g f15448x;

    @co.f(c = "androidx.lifecycle.LifecycleCoroutineScopeImpl$register$1", f = "Lifecycle.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class a extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f15449w;

        /* renamed from: x  reason: collision with root package name */
        public /* synthetic */ Object f15450x;

        public a(ao.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            a aVar = new a(dVar);
            aVar.f15450x = obj;
            return aVar;
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((a) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            bo.c.c();
            if (this.f15449w == 0) {
                wn.m.b(obj);
                uo.q0 q0Var = (uo.q0) this.f15450x;
                if (LifecycleCoroutineScopeImpl.this.a().b().compareTo(o.c.INITIALIZED) < 0) {
                    i2.e(q0Var.getCoroutineContext(), null, 1, null);
                } else {
                    LifecycleCoroutineScopeImpl.this.a().a(LifecycleCoroutineScopeImpl.this);
                }
                return wn.v.f59242a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public LifecycleCoroutineScopeImpl(o oVar, ao.g gVar) {
        jo.p.h(oVar, "lifecycle");
        jo.p.h(gVar, "coroutineContext");
        this.f15447w = oVar;
        this.f15448x = gVar;
        if (a().b() == o.c.DESTROYED) {
            i2.e(getCoroutineContext(), null, 1, null);
        }
    }

    @Override // androidx.lifecycle.p
    public o a() {
        return this.f15447w;
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.f15448x;
    }

    @Override // androidx.lifecycle.r
    public void i(u uVar, o.b bVar) {
        jo.p.h(uVar, "source");
        jo.p.h(bVar, "event");
        if (a().b().compareTo(o.c.DESTROYED) <= 0) {
            a().c(this);
            i2.e(getCoroutineContext(), null, 1, null);
        }
    }

    public final void j() {
        uo.l.d(this, g1.c().h0(), null, new a(null), 2, null);
    }
}
