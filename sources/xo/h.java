package xo;

import uo.d2;
import uo.q0;

/* loaded from: classes4.dex */
public final /* synthetic */ class h {

    @co.f(c = "kotlinx.coroutines.flow.FlowKt__CollectKt$launchIn$1", f = "Collect.kt", l = {50}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class a extends co.l implements io.p<q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f60506w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ c<T> f60507x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(c<? extends T> cVar, ao.d<? super a> dVar) {
            super(2, dVar);
            this.f60507x = cVar;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new a(this.f60507x, dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((a) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f60506w;
            if (i10 == 0) {
                wn.m.b(obj);
                c<T> cVar = this.f60507x;
                this.f60506w = 1;
                if (e.f(cVar, this) == c10) {
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

    public static final Object a(c<?> cVar, ao.d<? super wn.v> dVar) {
        Object a10 = cVar.a(yo.p.f62128w, dVar);
        return a10 == bo.c.c() ? a10 : wn.v.f59242a;
    }

    public static final <T> Object b(c<? extends T> cVar, io.p<? super T, ? super ao.d<? super wn.v>, ? extends Object> pVar, ao.d<? super wn.v> dVar) {
        c b10;
        b10 = i.b(e.u(cVar, pVar), 0, null, 2, null);
        Object f10 = e.f(b10, dVar);
        return f10 == bo.c.c() ? f10 : wn.v.f59242a;
    }

    public static final <T> d2 c(c<? extends T> cVar, q0 q0Var) {
        d2 d10;
        d10 = uo.l.d(q0Var, null, null, new a(cVar, null), 3, null);
        return d10;
    }
}
