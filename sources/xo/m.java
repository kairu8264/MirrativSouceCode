package xo;

/* loaded from: classes4.dex */
public final /* synthetic */ class m {

    /* renamed from: a  reason: collision with root package name */
    public static final int f60564a = zo.l0.b("kotlinx.coroutines.flow.defaultConcurrency", 16, 1, Integer.MAX_VALUE);

    @co.f(c = "kotlinx.coroutines.flow.FlowKt__MergeKt$mapLatest$1", f = "Merge.kt", l = {214, 214}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class a extends co.l implements io.q<d<? super R>, T, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f60565w;

        /* renamed from: x  reason: collision with root package name */
        public /* synthetic */ Object f60566x;

        /* renamed from: y  reason: collision with root package name */
        public /* synthetic */ Object f60567y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ io.p<T, ao.d<? super R>, Object> f60568z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(io.p<? super T, ? super ao.d<? super R>, ? extends Object> pVar, ao.d<? super a> dVar) {
            super(3, dVar);
            this.f60568z = pVar;
        }

        @Override // io.q
        /* renamed from: a */
        public final Object s0(d<? super R> dVar, T t10, ao.d<? super wn.v> dVar2) {
            a aVar = new a(this.f60568z, dVar2);
            aVar.f60566x = dVar;
            aVar.f60567y = t10;
            return aVar.invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            d dVar;
            Object c10 = bo.c.c();
            int i10 = this.f60565w;
            if (i10 == 0) {
                wn.m.b(obj);
                dVar = (d) this.f60566x;
                Object obj2 = this.f60567y;
                io.p<T, ao.d<? super R>, Object> pVar = this.f60568z;
                this.f60566x = dVar;
                this.f60565w = 1;
                obj = pVar.invoke(obj2, this);
                if (obj == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                if (i10 == 2) {
                    wn.m.b(obj);
                    return wn.v.f59242a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                dVar = (d) this.f60566x;
                wn.m.b(obj);
            }
            this.f60566x = null;
            this.f60565w = 2;
            if (dVar.emit(obj, this) == c10) {
                return c10;
            }
            return wn.v.f59242a;
        }
    }

    public static final <T, R> c<R> a(c<? extends T> cVar, io.p<? super T, ? super ao.d<? super R>, ? extends Object> pVar) {
        return e.z(cVar, new a(pVar, null));
    }

    public static final <T, R> c<R> b(c<? extends T> cVar, io.q<? super d<? super R>, ? super T, ? super ao.d<? super wn.v>, ? extends Object> qVar) {
        return new yo.h(qVar, cVar, null, 0, null, 28, null);
    }
}
