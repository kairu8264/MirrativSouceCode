package u;

import ao.g;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import uo.d2;

/* loaded from: classes.dex */
public final class p0 {

    /* renamed from: a */
    public final AtomicReference<a> f54094a = new AtomicReference<>(null);

    /* renamed from: b */
    public final dp.c f54095b = dp.e.b(false, 1, null);

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        public final o0 f54096a;

        /* renamed from: b */
        public final d2 f54097b;

        public a(o0 o0Var, d2 d2Var) {
            jo.p.h(o0Var, "priority");
            jo.p.h(d2Var, "job");
            this.f54096a = o0Var;
            this.f54097b = d2Var;
        }

        public final boolean a(a aVar) {
            jo.p.h(aVar, "other");
            return this.f54096a.compareTo(aVar.f54096a) >= 0;
        }

        public final void b() {
            d2.a.a(this.f54097b, null, 1, null);
        }
    }

    @co.f(c = "androidx.compose.animation.core.MutatorMutex$mutate$2", f = "InternalMutatorMutex.kt", l = {171, 119}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class b extends co.l implements io.p<uo.q0, ao.d<? super R>, Object> {
        public /* synthetic */ Object A;
        public final /* synthetic */ o0 B;
        public final /* synthetic */ p0 C;
        public final /* synthetic */ io.l<ao.d<? super R>, Object> D;

        /* renamed from: w */
        public Object f54098w;

        /* renamed from: x */
        public Object f54099x;

        /* renamed from: y */
        public Object f54100y;

        /* renamed from: z */
        public int f54101z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(o0 o0Var, p0 p0Var, io.l<? super ao.d<? super R>, ? extends Object> lVar, ao.d<? super b> dVar) {
            super(2, dVar);
            this.B = o0Var;
            this.C = p0Var;
            this.D = lVar;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            b bVar = new b(this.B, this.C, this.D, dVar);
            bVar.A = obj;
            return bVar;
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super R> dVar) {
            return ((b) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [dp.c, int] */
        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            dp.c cVar;
            io.l lVar;
            a aVar;
            p0 p0Var;
            a aVar2;
            Throwable th2;
            p0 p0Var2;
            dp.c cVar2;
            Object c10 = bo.c.c();
            ?? r12 = this.f54101z;
            try {
                try {
                    if (r12 == 0) {
                        wn.m.b(obj);
                        o0 o0Var = this.B;
                        g.b bVar = ((uo.q0) this.A).getCoroutineContext().get(d2.f56001s);
                        jo.p.e(bVar);
                        a aVar3 = new a(o0Var, (d2) bVar);
                        this.C.f(aVar3);
                        cVar = this.C.f54095b;
                        io.l lVar2 = this.D;
                        p0 p0Var3 = this.C;
                        this.A = aVar3;
                        this.f54098w = cVar;
                        this.f54099x = lVar2;
                        this.f54100y = p0Var3;
                        this.f54101z = 1;
                        if (cVar.a(null, this) == c10) {
                            return c10;
                        }
                        lVar = lVar2;
                        aVar = aVar3;
                        p0Var = p0Var3;
                    } else if (r12 != 1) {
                        if (r12 == 2) {
                            p0Var2 = (p0) this.f54099x;
                            cVar2 = (dp.c) this.f54098w;
                            aVar2 = (a) this.A;
                            try {
                                wn.m.b(obj);
                                p0Var2.f54094a.compareAndSet(aVar2, null);
                                cVar2.c(null);
                                return obj;
                            } catch (Throwable th3) {
                                th2 = th3;
                                p0Var2.f54094a.compareAndSet(aVar2, null);
                                throw th2;
                            }
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        p0Var = (p0) this.f54100y;
                        lVar = (io.l) this.f54099x;
                        aVar = (a) this.A;
                        wn.m.b(obj);
                        cVar = (dp.c) this.f54098w;
                    }
                    this.A = aVar;
                    this.f54098w = cVar;
                    this.f54099x = p0Var;
                    this.f54100y = null;
                    this.f54101z = 2;
                    Object invoke = lVar.invoke(this);
                    if (invoke == c10) {
                        return c10;
                    }
                    p0Var2 = p0Var;
                    cVar2 = cVar;
                    obj = invoke;
                    aVar2 = aVar;
                    p0Var2.f54094a.compareAndSet(aVar2, null);
                    cVar2.c(null);
                    return obj;
                } catch (Throwable th4) {
                    aVar2 = aVar;
                    th2 = th4;
                    p0Var2 = p0Var;
                    p0Var2.f54094a.compareAndSet(aVar2, null);
                    throw th2;
                }
            } catch (Throwable th5) {
                r12.c(null);
                throw th5;
            }
        }
    }

    public static /* synthetic */ Object e(p0 p0Var, o0 o0Var, io.l lVar, ao.d dVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            o0Var = o0.Default;
        }
        return p0Var.d(o0Var, lVar, dVar);
    }

    public final <R> Object d(o0 o0Var, io.l<? super ao.d<? super R>, ? extends Object> lVar, ao.d<? super R> dVar) {
        return uo.r0.e(new b(o0Var, this, lVar, null), dVar);
    }

    public final void f(a aVar) {
        a aVar2;
        do {
            aVar2 = this.f54094a.get();
            if (aVar2 != null && !aVar.a(aVar2)) {
                throw new CancellationException("Current mutation had a higher priority");
            }
        } while (!this.f54094a.compareAndSet(aVar2, aVar));
        if (aVar2 == null) {
            return;
        }
        aVar2.b();
    }
}
