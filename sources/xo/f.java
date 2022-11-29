package xo;

/* loaded from: classes4.dex */
public final /* synthetic */ class f {

    /* loaded from: classes4.dex */
    public static final class a implements c<T> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ Object f60492w;

        public a(Object obj) {
            this.f60492w = obj;
        }

        @Override // xo.c
        public Object a(d<? super T> dVar, ao.d<? super wn.v> dVar2) {
            Object emit = dVar.emit(this.f60492w, dVar2);
            return emit == bo.c.c() ? emit : wn.v.f59242a;
        }
    }

    public static final <T> c<T> a(io.p<? super d<? super T>, ? super ao.d<? super wn.v>, ? extends Object> pVar) {
        return new v(pVar);
    }

    public static final <T> c<T> b(T t10) {
        return new a(t10);
    }
}
