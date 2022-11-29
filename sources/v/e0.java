package v;

import ao.g;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import uo.d2;

/*  JADX ERROR: JadxRuntimeException in pass: ClassModifier
    jadx.core.utils.exceptions.JadxRuntimeException: Not class type: T
    	at jadx.core.dex.info.ClassInfo.checkClassType(ClassInfo.java:53)
    	at jadx.core.dex.info.ClassInfo.fromType(ClassInfo.java:31)
    	at jadx.core.dex.visitors.ClassModifier.removeSyntheticFields(ClassModifier.java:83)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:61)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:55)
    */
/* loaded from: classes.dex */
public final class e0 {

    /* renamed from: a  reason: collision with root package name */
    public final AtomicReference<a> f56182a = new AtomicReference<>(null);

    /* renamed from: b  reason: collision with root package name */
    public final dp.c f56183b = dp.e.b(false, 1, null);

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final d0 f56184a;

        /* renamed from: b  reason: collision with root package name */
        public final d2 f56185b;

        public a(d0 d0Var, d2 d2Var) {
            jo.p.h(d0Var, "priority");
            jo.p.h(d2Var, "job");
            this.f56184a = d0Var;
            this.f56185b = d2Var;
        }

        public final boolean a(a aVar) {
            jo.p.h(aVar, "other");
            return this.f56184a.compareTo(aVar.f56184a) >= 0;
        }

        public final void b() {
            d2.a.a(this.f56185b, null, 1, null);
        }
    }

    @co.f(c = "androidx.compose.foundation.MutatorMutex$mutate$2", f = "MutatorMutex.kt", l = {173, 119}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class b extends co.l implements io.p<uo.q0, ao.d<? super R>, Object> {
        public /* synthetic */ Object A;
        public final /* synthetic */ d0 B;
        public final /* synthetic */ e0 C;
        public final /* synthetic */ io.l<ao.d<? super R>, Object> D;

        /* renamed from: w  reason: collision with root package name */
        public Object f56186w;

        /* renamed from: x  reason: collision with root package name */
        public Object f56187x;

        /* renamed from: y  reason: collision with root package name */
        public Object f56188y;

        /* renamed from: z  reason: collision with root package name */
        public int f56189z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(d0 d0Var, e0 e0Var, io.l<? super ao.d<? super R>, ? extends Object> lVar, ao.d<? super b> dVar) {
            super(2, dVar);
            this.B = d0Var;
            this.C = e0Var;
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
            e0 e0Var;
            a aVar2;
            Throwable th2;
            e0 e0Var2;
            dp.c cVar2;
            Object c10 = bo.c.c();
            ?? r12 = this.f56189z;
            try {
                try {
                    if (r12 == 0) {
                        wn.m.b(obj);
                        d0 d0Var = this.B;
                        g.b bVar = ((uo.q0) this.A).getCoroutineContext().get(d2.f56001s);
                        jo.p.e(bVar);
                        a aVar3 = new a(d0Var, (d2) bVar);
                        this.C.g(aVar3);
                        cVar = this.C.f56183b;
                        io.l lVar2 = this.D;
                        e0 e0Var3 = this.C;
                        this.A = aVar3;
                        this.f56186w = cVar;
                        this.f56187x = lVar2;
                        this.f56188y = e0Var3;
                        this.f56189z = 1;
                        if (cVar.a(null, this) == c10) {
                            return c10;
                        }
                        lVar = lVar2;
                        aVar = aVar3;
                        e0Var = e0Var3;
                    } else if (r12 != 1) {
                        if (r12 == 2) {
                            e0Var2 = (e0) this.f56187x;
                            cVar2 = (dp.c) this.f56186w;
                            aVar2 = (a) this.A;
                            try {
                                wn.m.b(obj);
                                e0Var2.f56182a.compareAndSet(aVar2, null);
                                cVar2.c(null);
                                return obj;
                            } catch (Throwable th3) {
                                th2 = th3;
                                e0Var2.f56182a.compareAndSet(aVar2, null);
                                throw th2;
                            }
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        e0Var = (e0) this.f56188y;
                        lVar = (io.l) this.f56187x;
                        aVar = (a) this.A;
                        wn.m.b(obj);
                        cVar = (dp.c) this.f56186w;
                    }
                    this.A = aVar;
                    this.f56186w = cVar;
                    this.f56187x = e0Var;
                    this.f56188y = null;
                    this.f56189z = 2;
                    Object invoke = lVar.invoke(this);
                    if (invoke == c10) {
                        return c10;
                    }
                    e0Var2 = e0Var;
                    cVar2 = cVar;
                    obj = invoke;
                    aVar2 = aVar;
                    e0Var2.f56182a.compareAndSet(aVar2, null);
                    cVar2.c(null);
                    return obj;
                } catch (Throwable th4) {
                    aVar2 = aVar;
                    th2 = th4;
                    e0Var2 = e0Var;
                    e0Var2.f56182a.compareAndSet(aVar2, null);
                    throw th2;
                }
            } catch (Throwable th5) {
                r12.c(null);
                throw th5;
            }
        }
    }

    @co.f(c = "androidx.compose.foundation.MutatorMutex$mutateWith$2", f = "MutatorMutex.kt", l = {173, 160}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class c extends co.l implements io.p<uo.q0, ao.d<? super R>, Object> {
        public int A;
        public /* synthetic */ Object B;
        public final /* synthetic */ d0 C;
        public final /* synthetic */ e0 D;
        public final /* synthetic */ io.p<T, ao.d<? super R>, Object> E;
        public final /* synthetic */ T F;

        /* renamed from: w  reason: collision with root package name */
        public Object f56190w;

        /* renamed from: x  reason: collision with root package name */
        public Object f56191x;

        /* renamed from: y  reason: collision with root package name */
        public Object f56192y;

        /* renamed from: z  reason: collision with root package name */
        public Object f56193z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(d0 d0Var, e0 e0Var, io.p<? super T, ? super ao.d<? super R>, ? extends Object> pVar, T t10, ao.d<? super c> dVar) {
            super(2, dVar);
            this.C = d0Var;
            this.D = e0Var;
            this.E = pVar;
            this.F = t10;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            c cVar = new c(this.C, this.D, this.E, this.F, dVar);
            cVar.B = obj;
            return cVar;
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ Object invoke(uo.q0 q0Var, Object obj) {
            return invoke(q0Var, (ao.d) obj);
        }

        public final Object invoke(uo.q0 q0Var, ao.d<? super R> dVar) {
            return ((c) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [dp.c, int] */
        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            dp.c cVar;
            io.p pVar;
            Object obj2;
            a aVar;
            e0 e0Var;
            a aVar2;
            Throwable th2;
            e0 e0Var2;
            dp.c cVar2;
            Object c10 = bo.c.c();
            ?? r12 = this.A;
            try {
                try {
                    if (r12 == 0) {
                        wn.m.b(obj);
                        d0 d0Var = this.C;
                        g.b bVar = ((uo.q0) this.B).getCoroutineContext().get(d2.f56001s);
                        jo.p.e(bVar);
                        a aVar3 = new a(d0Var, (d2) bVar);
                        this.D.g(aVar3);
                        cVar = this.D.f56183b;
                        pVar = this.E;
                        Object obj3 = this.F;
                        e0 e0Var3 = this.D;
                        this.B = aVar3;
                        this.f56190w = cVar;
                        this.f56191x = pVar;
                        this.f56192y = obj3;
                        this.f56193z = e0Var3;
                        this.A = 1;
                        if (cVar.a(null, this) == c10) {
                            return c10;
                        }
                        obj2 = obj3;
                        aVar = aVar3;
                        e0Var = e0Var3;
                    } else if (r12 != 1) {
                        if (r12 == 2) {
                            e0Var2 = (e0) this.f56191x;
                            cVar2 = (dp.c) this.f56190w;
                            aVar2 = (a) this.B;
                            try {
                                wn.m.b(obj);
                                e0Var2.f56182a.compareAndSet(aVar2, null);
                                cVar2.c(null);
                                return obj;
                            } catch (Throwable th3) {
                                th2 = th3;
                                e0Var2.f56182a.compareAndSet(aVar2, null);
                                throw th2;
                            }
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        e0Var = (e0) this.f56193z;
                        obj2 = this.f56192y;
                        pVar = (io.p) this.f56191x;
                        aVar = (a) this.B;
                        wn.m.b(obj);
                        cVar = (dp.c) this.f56190w;
                    }
                    this.B = aVar;
                    this.f56190w = cVar;
                    this.f56191x = e0Var;
                    this.f56192y = null;
                    this.f56193z = null;
                    this.A = 2;
                    Object invoke = pVar.invoke(obj2, this);
                    if (invoke == c10) {
                        return c10;
                    }
                    e0Var2 = e0Var;
                    cVar2 = cVar;
                    obj = invoke;
                    aVar2 = aVar;
                    e0Var2.f56182a.compareAndSet(aVar2, null);
                    cVar2.c(null);
                    return obj;
                } catch (Throwable th4) {
                    aVar2 = aVar;
                    th2 = th4;
                    e0Var2 = e0Var;
                    e0Var2.f56182a.compareAndSet(aVar2, null);
                    throw th2;
                }
            } catch (Throwable th5) {
                r12.c(null);
                throw th5;
            }
        }
    }

    public e0() {
    }

    public static /* synthetic */ Object e(e0 e0Var, d0 d0Var, io.l lVar, ao.d dVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            d0Var = d0.Default;
        }
        return e0Var.d(d0Var, lVar, dVar);
    }

    public final <R> Object d(d0 d0Var, io.l<? super ao.d<? super R>, ? extends Object> lVar, ao.d<? super R> dVar) {
        return uo.r0.e(new b(d0Var, this, lVar, null), dVar);
    }

    public final <T, R> Object f(T t10, d0 d0Var, io.p<? super T, ? super ao.d<? super R>, ? extends Object> pVar, ao.d<? super R> dVar) {
        return uo.r0.e(new c(d0Var, this, pVar, t10, null), dVar);
    }

    public final void g(a aVar) {
        a aVar2;
        do {
            aVar2 = this.f56182a.get();
            if (aVar2 != null && !aVar.a(aVar2)) {
                throw new CancellationException("Current mutation had a higher priority");
            }
        } while (!this.f56182a.compareAndSet(aVar2, aVar));
        if (aVar2 != null) {
            aVar2.b();
        }
    }
}
