package androidx.compose.ui.platform;

/* loaded from: classes.dex */
public final class y0 {

    @co.f(c = "androidx.compose.ui.platform.InfiniteAnimationPolicyKt$withInfiniteAnimationFrameNanos$2", f = "InfiniteAnimationPolicy.kt", l = {65}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class a extends co.l implements io.l<ao.d<? super R>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f14684w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ io.l<Long, R> f14685x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(io.l<? super Long, ? extends R> lVar, ao.d<? super a> dVar) {
            super(1, dVar);
            this.f14685x = lVar;
        }

        @Override // io.l
        /* renamed from: a */
        public final Object invoke(ao.d<? super R> dVar) {
            return ((a) create(dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final ao.d<wn.v> create(ao.d<?> dVar) {
            return new a(this.f14685x, dVar);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f14684w;
            if (i10 == 0) {
                wn.m.b(obj);
                io.l<Long, R> lVar = this.f14685x;
                this.f14684w = 1;
                obj = l0.o0.b(lVar, this);
                if (obj == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                wn.m.b(obj);
            }
            return obj;
        }
    }

    public static final <R> Object a(io.l<? super Long, ? extends R> lVar, ao.d<? super R> dVar) {
        x0 x0Var = (x0) dVar.getContext().get(x0.f14680b);
        if (x0Var == null) {
            return l0.o0.b(lVar, dVar);
        }
        return x0Var.P(new a(lVar, null), dVar);
    }
}
