package w1;

/* loaded from: classes.dex */
public final class x<T> {

    /* renamed from: a  reason: collision with root package name */
    public final String f58003a;

    /* renamed from: b  reason: collision with root package name */
    public final io.p<T, T, T> f58004b;

    /* loaded from: classes.dex */
    public static final class a extends jo.q implements io.p<T, T, T> {

        /* renamed from: w  reason: collision with root package name */
        public static final a f58005w = new a();

        public a() {
            super(2);
        }

        @Override // io.p
        public final T invoke(T t10, T t11) {
            return t10 == null ? t11 : t10;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public x(String str, io.p<? super T, ? super T, ? extends T> pVar) {
        jo.p.h(str, "name");
        jo.p.h(pVar, "mergePolicy");
        this.f58003a = str;
        this.f58004b = pVar;
    }

    public final String a() {
        return this.f58003a;
    }

    public final T b(T t10, T t11) {
        return this.f58004b.invoke(t10, t11);
    }

    public final void c(y yVar, qo.h<?> hVar, T t10) {
        jo.p.h(yVar, "thisRef");
        jo.p.h(hVar, "property");
        yVar.d(this, t10);
    }

    public String toString() {
        return "SemanticsPropertyKey: " + this.f58003a;
    }

    public /* synthetic */ x(String str, io.p pVar, int i10, jo.h hVar) {
        this(str, (i10 & 2) != 0 ? a.f58005w : pVar);
    }
}
