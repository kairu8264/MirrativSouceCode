package androidx.lifecycle;

import uo.d2;

/* loaded from: classes.dex */
public abstract class p implements uo.q0 {

    @co.f(c = "androidx.lifecycle.LifecycleCoroutineScope$launchWhenResumed$1", f = "Lifecycle.kt", l = {114}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class a extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f15602w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.p<uo.q0, ao.d<? super wn.v>, Object> f15604y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(io.p<? super uo.q0, ? super ao.d<? super wn.v>, ? extends Object> pVar, ao.d<? super a> dVar) {
            super(2, dVar);
            this.f15604y = pVar;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new a(this.f15604y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((a) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f15602w;
            if (i10 == 0) {
                wn.m.b(obj);
                o a10 = p.this.a();
                io.p<uo.q0, ao.d<? super wn.v>, Object> pVar = this.f15604y;
                this.f15602w = 1;
                if (i0.a(a10, pVar, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                wn.m.b(obj);
            }
            return wn.v.f59242a;
        }
    }

    public abstract o a();

    public final d2 e(io.p<? super uo.q0, ? super ao.d<? super wn.v>, ? extends Object> pVar) {
        d2 d10;
        jo.p.h(pVar, "block");
        d10 = uo.l.d(this, null, null, new a(pVar, null), 3, null);
        return d10;
    }
}
