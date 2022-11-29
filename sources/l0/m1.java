package l0;

import ao.g;
import l0.n0;

/* loaded from: classes.dex */
public final class m1 implements n0 {

    /* renamed from: w  reason: collision with root package name */
    public static final m1 f39203w = new m1();

    @co.f(c = "androidx.compose.runtime.SdkStubsFallbackFrameClock$withFrameNanos$2", f = "ActualAndroid.android.kt", l = {51}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class a extends co.l implements io.p<uo.q0, ao.d<? super R>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f39204w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ io.l<Long, R> f39205x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(io.l<? super Long, ? extends R> lVar, ao.d<? super a> dVar) {
            super(2, dVar);
            this.f39205x = lVar;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new a(this.f39205x, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super R> dVar) {
            return ((a) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f39204w;
            if (i10 == 0) {
                wn.m.b(obj);
                this.f39204w = 1;
                if (uo.b1.a(16L, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                wn.m.b(obj);
            }
            return this.f39205x.invoke(co.b.e(System.nanoTime()));
        }
    }

    @Override // l0.n0
    public <R> Object L(io.l<? super Long, ? extends R> lVar, ao.d<? super R> dVar) {
        return uo.j.f(uo.g1.c(), new a(lVar, null), dVar);
    }

    @Override // ao.g
    public <R> R fold(R r10, io.p<? super R, ? super g.b, ? extends R> pVar) {
        return (R) n0.a.a(this, r10, pVar);
    }

    @Override // ao.g.b, ao.g
    public <E extends g.b> E get(g.c<E> cVar) {
        return (E) n0.a.b(this, cVar);
    }

    @Override // ao.g
    public ao.g minusKey(g.c<?> cVar) {
        return n0.a.c(this, cVar);
    }

    @Override // ao.g
    public ao.g plus(ao.g gVar) {
        return n0.a.d(this, gVar);
    }
}
