package yo;

import zo.o0;

/* loaded from: classes4.dex */
public final class x<T> implements xo.d<T> {

    /* renamed from: w  reason: collision with root package name */
    public final ao.g f62142w;

    /* renamed from: x  reason: collision with root package name */
    public final Object f62143x;

    /* renamed from: y  reason: collision with root package name */
    public final io.p<T, ao.d<? super wn.v>, Object> f62144y;

    @co.f(c = "kotlinx.coroutines.flow.internal.UndispatchedContextCollector$emitRef$1", f = "ChannelFlow.kt", l = {212}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class a extends co.l implements io.p<T, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f62145w;

        /* renamed from: x  reason: collision with root package name */
        public /* synthetic */ Object f62146x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ xo.d<T> f62147y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(xo.d<? super T> dVar, ao.d<? super a> dVar2) {
            super(2, dVar2);
            this.f62147y = dVar;
        }

        @Override // io.p
        /* renamed from: a */
        public final Object invoke(T t10, ao.d<? super wn.v> dVar) {
            return ((a) create(t10, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            a aVar = new a(this.f62147y, dVar);
            aVar.f62146x = obj;
            return aVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f62145w;
            if (i10 == 0) {
                wn.m.b(obj);
                Object obj2 = this.f62146x;
                this.f62145w = 1;
                if (this.f62147y.emit(obj2, this) == c10) {
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

    public x(xo.d<? super T> dVar, ao.g gVar) {
        this.f62142w = gVar;
        this.f62143x = o0.b(gVar);
        this.f62144y = new a(dVar, null);
    }

    @Override // xo.d
    public Object emit(T t10, ao.d<? super wn.v> dVar) {
        Object b10 = e.b(this.f62142w, t10, this.f62143x, this.f62144y, dVar);
        return b10 == bo.c.c() ? b10 : wn.v.f59242a;
    }
}
