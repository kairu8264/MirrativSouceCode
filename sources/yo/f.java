package yo;

import ao.e;

/* loaded from: classes4.dex */
public abstract class f<S, T> extends d<T> {

    /* renamed from: z  reason: collision with root package name */
    public final xo.c<S> f62091z;

    @co.f(c = "kotlinx.coroutines.flow.internal.ChannelFlowOperator$collectWithContextUndispatched$2", f = "ChannelFlow.kt", l = {152}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class a extends co.l implements io.p<xo.d<? super T>, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f62092w;

        /* renamed from: x  reason: collision with root package name */
        public /* synthetic */ Object f62093x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ f<S, T> f62094y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(f<S, T> fVar, ao.d<? super a> dVar) {
            super(2, dVar);
            this.f62094y = fVar;
        }

        @Override // io.p
        /* renamed from: a */
        public final Object invoke(xo.d<? super T> dVar, ao.d<? super wn.v> dVar2) {
            return ((a) create(dVar, dVar2)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            a aVar = new a(this.f62094y, dVar);
            aVar.f62093x = obj;
            return aVar;
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f62092w;
            if (i10 == 0) {
                wn.m.b(obj);
                f<S, T> fVar = this.f62094y;
                this.f62092w = 1;
                if (fVar.r((xo.d) this.f62093x, this) == c10) {
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

    /* JADX WARN: Multi-variable type inference failed */
    public f(xo.c<? extends S> cVar, ao.g gVar, int i10, wo.h hVar) {
        super(gVar, i10, hVar);
        this.f62091z = cVar;
    }

    public static /* synthetic */ Object o(f fVar, xo.d dVar, ao.d dVar2) {
        if (fVar.f62082x == -3) {
            ao.g context = dVar2.getContext();
            ao.g plus = context.plus(fVar.f62081w);
            if (jo.p.c(plus, context)) {
                Object r10 = fVar.r(dVar, dVar2);
                return r10 == bo.c.c() ? r10 : wn.v.f59242a;
            }
            e.b bVar = ao.e.f16648d;
            if (jo.p.c(plus.get(bVar), context.get(bVar))) {
                Object q10 = fVar.q(dVar, plus, dVar2);
                return q10 == bo.c.c() ? q10 : wn.v.f59242a;
            }
        }
        Object a10 = super.a(dVar, dVar2);
        return a10 == bo.c.c() ? a10 : wn.v.f59242a;
    }

    public static /* synthetic */ Object p(f fVar, wo.v vVar, ao.d dVar) {
        Object r10 = fVar.r(new u(vVar), dVar);
        return r10 == bo.c.c() ? r10 : wn.v.f59242a;
    }

    @Override // yo.d, xo.c
    public Object a(xo.d<? super T> dVar, ao.d<? super wn.v> dVar2) {
        return o(this, dVar, dVar2);
    }

    @Override // yo.d
    public Object i(wo.v<? super T> vVar, ao.d<? super wn.v> dVar) {
        return p(this, vVar, dVar);
    }

    public final Object q(xo.d<? super T> dVar, ao.g gVar, ao.d<? super wn.v> dVar2) {
        Object c10 = e.c(gVar, e.a(dVar, dVar2.getContext()), null, new a(this, null), dVar2, 4, null);
        return c10 == bo.c.c() ? c10 : wn.v.f59242a;
    }

    public abstract Object r(xo.d<? super T> dVar, ao.d<? super wn.v> dVar2);

    @Override // yo.d
    public String toString() {
        return this.f62091z + " -> " + super.toString();
    }
}
