package xo;

/* loaded from: classes4.dex */
public final /* synthetic */ class j {

    /* renamed from: a  reason: collision with root package name */
    public static final io.l<Object, Object> f60514a = b.f60517w;

    /* renamed from: b  reason: collision with root package name */
    public static final io.p<Object, Object, Boolean> f60515b = a.f60516w;

    /* loaded from: classes4.dex */
    public static final class a extends jo.q implements io.p<Object, Object, Boolean> {

        /* renamed from: w  reason: collision with root package name */
        public static final a f60516w = new a();

        public a() {
            super(2);
        }

        @Override // io.p
        /* renamed from: a */
        public final Boolean invoke(Object obj, Object obj2) {
            return Boolean.valueOf(jo.p.c(obj, obj2));
        }
    }

    /* loaded from: classes4.dex */
    public static final class b extends jo.q implements io.l<Object, Object> {

        /* renamed from: w  reason: collision with root package name */
        public static final b f60517w = new b();

        public b() {
            super(1);
        }

        @Override // io.l
        public final Object invoke(Object obj) {
            return obj;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> c<T> a(c<? extends T> cVar) {
        return cVar instanceof g0 ? cVar : b(cVar, f60514a, f60515b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> c<T> b(c<? extends T> cVar, io.l<? super T, ? extends Object> lVar, io.p<Object, Object, Boolean> pVar) {
        if (cVar instanceof xo.b) {
            xo.b bVar = (xo.b) cVar;
            if (bVar.f60468x == lVar && bVar.f60469y == pVar) {
                return cVar;
            }
        }
        return new xo.b(cVar, lVar, pVar);
    }
}
