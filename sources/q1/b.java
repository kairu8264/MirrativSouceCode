package q1;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final k f48549a = new k(a.F);

    /* renamed from: b  reason: collision with root package name */
    public static final k f48550b = new k(C0730b.F);

    /* loaded from: classes.dex */
    public /* synthetic */ class a extends jo.m implements io.p<Integer, Integer, Integer> {
        public static final a F = new a();

        public a() {
            super(2, lo.a.class, "min", "min(II)I", 1);
        }

        public final Integer i(int i10, int i11) {
            return Integer.valueOf(Math.min(i10, i11));
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ Integer invoke(Integer num, Integer num2) {
            return i(num.intValue(), num2.intValue());
        }
    }

    /* renamed from: q1.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public /* synthetic */ class C0730b extends jo.m implements io.p<Integer, Integer, Integer> {
        public static final C0730b F = new C0730b();

        public C0730b() {
            super(2, lo.a.class, "max", "max(II)I", 1);
        }

        public final Integer i(int i10, int i11) {
            return Integer.valueOf(Math.max(i10, i11));
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ Integer invoke(Integer num, Integer num2) {
            return i(num.intValue(), num2.intValue());
        }
    }

    public static final k a() {
        return f48549a;
    }

    public static final k b() {
        return f48550b;
    }

    public static final int c(q1.a aVar, int i10, int i11) {
        jo.p.h(aVar, "<this>");
        return aVar.a().invoke(Integer.valueOf(i10), Integer.valueOf(i11)).intValue();
    }
}
