package androidx.lifecycle;

import uo.g1;

/*  JADX ERROR: JadxRuntimeException in pass: ClassModifier
    jadx.core.utils.exceptions.JadxRuntimeException: Not class type: T
    	at jadx.core.dex.info.ClassInfo.checkClassType(ClassInfo.java:53)
    	at jadx.core.dex.info.ClassInfo.fromType(ClassInfo.java:31)
    	at jadx.core.dex.visitors.ClassModifier.removeSyntheticFields(ClassModifier.java:83)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:61)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:55)
    */
/* loaded from: classes.dex */
public final class b0<T> implements a0<T> {

    /* renamed from: a  reason: collision with root package name */
    public f<T> f15504a;

    /* renamed from: b  reason: collision with root package name */
    public final ao.g f15505b;

    @co.f(c = "androidx.lifecycle.LiveDataScopeImpl$emit$2", f = "CoroutineLiveData.kt", l = {98}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class a extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f15506w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ b0<T> f15507x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ T f15508y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(b0<T> b0Var, T t10, ao.d<? super a> dVar) {
            super(2, dVar);
            this.f15507x = b0Var;
            this.f15508y = t10;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new a(this.f15507x, this.f15508y, dVar);
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return invoke2(q0Var, dVar);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final Object invoke2(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((a) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f15506w;
            if (i10 == 0) {
                wn.m.b(obj);
                f<T> a10 = this.f15507x.a();
                this.f15506w = 1;
                if (a10.s(this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                wn.m.b(obj);
            }
            this.f15507x.a().p(this.f15508y);
            return wn.v.f59242a;
        }
    }

    public b0(f<T> fVar, ao.g gVar) {
        jo.p.h(fVar, "target");
        jo.p.h(gVar, "context");
        this.f15504a = fVar;
        this.f15505b = gVar.plus(g1.c().h0());
    }

    public final f<T> a() {
        return this.f15504a;
    }

    @Override // androidx.lifecycle.a0
    public Object emit(T t10, ao.d<? super wn.v> dVar) {
        Object f10 = uo.j.f(this.f15505b, new a(this, t10, null), dVar);
        return f10 == bo.c.c() ? f10 : wn.v.f59242a;
    }
}
