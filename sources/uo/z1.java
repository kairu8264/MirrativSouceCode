package uo;

import java.util.concurrent.CancellationException;

/* loaded from: classes4.dex */
public final class z1 {

    @co.f(c = "kotlinx.coroutines.InterruptibleKt$runInterruptible$2", f = "Interruptible.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class a extends co.l implements io.p<q0, ao.d<? super T>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f56100w;

        /* renamed from: x  reason: collision with root package name */
        public /* synthetic */ Object f56101x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a<T> f56102y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(io.a<? extends T> aVar, ao.d<? super a> dVar) {
            super(2, dVar);
            this.f56102y = aVar;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            a aVar = new a(this.f56102y, dVar);
            aVar.f56101x = obj;
            return aVar;
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super T> dVar) {
            return ((a) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            bo.c.c();
            if (this.f56100w == 0) {
                wn.m.b(obj);
                return z1.d(((q0) this.f56101x).getCoroutineContext(), this.f56102y);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public static final <T> Object b(ao.g gVar, io.a<? extends T> aVar, ao.d<? super T> dVar) {
        return j.f(gVar, new a(aVar, null), dVar);
    }

    public static /* synthetic */ Object c(ao.g gVar, io.a aVar, ao.d dVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            gVar = ao.h.f16651w;
        }
        return b(gVar, aVar, dVar);
    }

    public static final <T> T d(ao.g gVar, io.a<? extends T> aVar) {
        try {
            e3 e3Var = new e3(g2.l(gVar));
            e3Var.d();
            T invoke = aVar.invoke();
            e3Var.a();
            return invoke;
        } catch (InterruptedException e10) {
            throw new CancellationException("Blocking call was interrupted due to parent cancellation").initCause(e10);
        }
    }
}
