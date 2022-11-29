package androidx.lifecycle;

import androidx.lifecycle.o;
import uo.d2;
import uo.g1;

/* loaded from: classes.dex */
public final class i0 {

    @co.f(c = "androidx.lifecycle.PausingDispatcherKt$whenStateAtLeast$2", f = "PausingDispatcher.kt", l = {162}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class a extends co.l implements io.p<uo.q0, ao.d<? super T>, Object> {
        public final /* synthetic */ io.p<uo.q0, ao.d<? super T>, Object> A;

        /* renamed from: w  reason: collision with root package name */
        public int f15548w;

        /* renamed from: x  reason: collision with root package name */
        public /* synthetic */ Object f15549x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ o f15550y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ o.c f15551z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(o oVar, o.c cVar, io.p<? super uo.q0, ? super ao.d<? super T>, ? extends Object> pVar, ao.d<? super a> dVar) {
            super(2, dVar);
            this.f15550y = oVar;
            this.f15551z = cVar;
            this.A = pVar;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            a aVar = new a(this.f15550y, this.f15551z, this.A, dVar);
            aVar.f15549x = obj;
            return aVar;
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super T> dVar) {
            return ((a) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            LifecycleController lifecycleController;
            Object c10 = bo.c.c();
            int i10 = this.f15548w;
            if (i10 == 0) {
                wn.m.b(obj);
                d2 d2Var = (d2) ((uo.q0) this.f15549x).getCoroutineContext().get(d2.f56001s);
                if (d2Var != null) {
                    h0 h0Var = new h0();
                    LifecycleController lifecycleController2 = new LifecycleController(this.f15550y, this.f15551z, h0Var.f15541x, d2Var);
                    try {
                        io.p<uo.q0, ao.d<? super T>, Object> pVar = this.A;
                        this.f15549x = lifecycleController2;
                        this.f15548w = 1;
                        obj = uo.j.f(h0Var, pVar, this);
                        if (obj == c10) {
                            return c10;
                        }
                        lifecycleController = lifecycleController2;
                    } catch (Throwable th2) {
                        th = th2;
                        lifecycleController = lifecycleController2;
                        lifecycleController.c();
                        throw th;
                    }
                } else {
                    throw new IllegalStateException("when[State] methods should have a parent job".toString());
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                lifecycleController = (LifecycleController) this.f15549x;
                try {
                    wn.m.b(obj);
                } catch (Throwable th3) {
                    th = th3;
                    lifecycleController.c();
                    throw th;
                }
            }
            lifecycleController.c();
            return obj;
        }
    }

    public static final <T> Object a(o oVar, io.p<? super uo.q0, ? super ao.d<? super T>, ? extends Object> pVar, ao.d<? super T> dVar) {
        return b(oVar, o.c.RESUMED, pVar, dVar);
    }

    public static final <T> Object b(o oVar, o.c cVar, io.p<? super uo.q0, ? super ao.d<? super T>, ? extends Object> pVar, ao.d<? super T> dVar) {
        return uo.j.f(g1.c().h0(), new a(oVar, cVar, pVar, null), dVar);
    }
}
