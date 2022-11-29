package m2;

/* loaded from: classes.dex */
public final class g implements Comparable<g> {

    /* renamed from: w  reason: collision with root package name */
    public final float f40519w;

    /* renamed from: x  reason: collision with root package name */
    public static final a f40516x = new a(null);

    /* renamed from: y  reason: collision with root package name */
    public static final float f40517y = l(0.0f);

    /* renamed from: z  reason: collision with root package name */
    public static final float f40518z = l(Float.POSITIVE_INFINITY);
    public static final float A = l(Float.NaN);

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final float a() {
            return g.f40517y;
        }

        public final float b() {
            return g.A;
        }
    }

    public /* synthetic */ g(float f10) {
        this.f40519w = f10;
    }

    public static final /* synthetic */ g e(float f10) {
        return new g(f10);
    }

    public static int i(float f10, float f11) {
        return Float.compare(f10, f11);
    }

    public static float l(float f10) {
        return f10;
    }

    public static boolean m(float f10, Object obj) {
        if (obj instanceof g) {
            return jo.p.c(Float.valueOf(f10), Float.valueOf(((g) obj).q()));
        }
        return false;
    }

    public static final boolean n(float f10, float f11) {
        return jo.p.c(Float.valueOf(f10), Float.valueOf(f11));
    }

    public static int o(float f10) {
        return Float.hashCode(f10);
    }

    public static String p(float f10) {
        if (Float.isNaN(f10)) {
            return "Dp.Unspecified";
        }
        return f10 + ".dp";
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(g gVar) {
        return h(gVar.q());
    }

    public boolean equals(Object obj) {
        return m(this.f40519w, obj);
    }

    public int h(float f10) {
        return i(this.f40519w, f10);
    }

    public int hashCode() {
        return o(this.f40519w);
    }

    public final /* synthetic */ float q() {
        return this.f40519w;
    }

    public String toString() {
        return p(this.f40519w);
    }
}
