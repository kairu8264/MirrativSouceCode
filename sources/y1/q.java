package y1;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: a  reason: collision with root package name */
    public static final a f61109a = new a(null);

    /* renamed from: b  reason: collision with root package name */
    public static final int f61110b = h(1);

    /* renamed from: c  reason: collision with root package name */
    public static final int f61111c = h(2);

    /* renamed from: d  reason: collision with root package name */
    public static final int f61112d = h(3);

    /* renamed from: e  reason: collision with root package name */
    public static final int f61113e = h(4);

    /* renamed from: f  reason: collision with root package name */
    public static final int f61114f = h(5);

    /* renamed from: g  reason: collision with root package name */
    public static final int f61115g = h(6);

    /* renamed from: h  reason: collision with root package name */
    public static final int f61116h = h(7);

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final int a() {
            return q.f61110b;
        }

        public final int b() {
            return q.f61112d;
        }

        public final int c() {
            return q.f61113e;
        }

        public final int d() {
            return q.f61115g;
        }

        public final int e() {
            return q.f61116h;
        }

        public final int f() {
            return q.f61114f;
        }

        public final int g() {
            return q.f61111c;
        }
    }

    public static int h(int i10) {
        return i10;
    }

    public static final boolean i(int i10, int i11) {
        return i10 == i11;
    }

    public static int j(int i10) {
        return Integer.hashCode(i10);
    }

    public static String k(int i10) {
        return i(i10, f61110b) ? "AboveBaseline" : i(i10, f61111c) ? "Top" : i(i10, f61112d) ? "Bottom" : i(i10, f61113e) ? "Center" : i(i10, f61114f) ? "TextTop" : i(i10, f61115g) ? "TextBottom" : i(i10, f61116h) ? "TextCenter" : "Invalid";
    }
}
