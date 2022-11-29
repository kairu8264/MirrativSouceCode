package l0;

/* loaded from: classes.dex */
public final /* synthetic */ class w1 {

    @co.f(c = "androidx.compose.runtime.SnapshotStateKt__ProduceStateKt$produceState$3", f = "ProduceState.kt", l = {153}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class a extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f39299w;

        /* renamed from: x  reason: collision with root package name */
        public /* synthetic */ Object f39300x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.p<a1<T>, ao.d<? super wn.v>, Object> f39301y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ s0<T> f39302z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(io.p<? super a1<T>, ? super ao.d<? super wn.v>, ? extends Object> pVar, s0<T> s0Var, ao.d<? super a> dVar) {
            super(2, dVar);
            this.f39301y = pVar;
            this.f39302z = s0Var;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            a aVar = new a(this.f39301y, this.f39302z, dVar);
            aVar.f39300x = obj;
            return aVar;
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((a) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f39299w;
            if (i10 == 0) {
                wn.m.b(obj);
                io.p<a1<T>, ao.d<? super wn.v>, Object> pVar = this.f39301y;
                b1 b1Var = new b1(this.f39302z, ((uo.q0) this.f39300x).getCoroutineContext());
                this.f39299w = 1;
                if (pVar.invoke(b1Var, this) == c10) {
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

    public static final <T> c2<T> a(T t10, Object obj, Object obj2, io.p<? super a1<T>, ? super ao.d<? super wn.v>, ? extends Object> pVar, i iVar, int i10) {
        jo.p.h(pVar, "producer");
        iVar.x(-1703169085);
        iVar.x(-492369756);
        Object y10 = iVar.y();
        if (y10 == i.f39065a.a()) {
            y10 = z1.e(t10, null, 2, null);
            iVar.q(y10);
        }
        iVar.O();
        s0 s0Var = (s0) y10;
        c0.d(obj, obj2, new a(pVar, s0Var, null), iVar, 72);
        iVar.O();
        return s0Var;
    }
}
