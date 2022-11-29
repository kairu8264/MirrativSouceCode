package w1;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: d  reason: collision with root package name */
    public static final a f57890d = new a(null);

    /* renamed from: e  reason: collision with root package name */
    public static final g f57891e = new g(0.0f, po.m.b(0.0f, 0.0f), 0, 4, null);

    /* renamed from: a  reason: collision with root package name */
    public final float f57892a;

    /* renamed from: b  reason: collision with root package name */
    public final po.e<Float> f57893b;

    /* renamed from: c  reason: collision with root package name */
    public final int f57894c;

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final g a() {
            return g.f57891e;
        }
    }

    public g(float f10, po.e<Float> eVar, int i10) {
        jo.p.h(eVar, "range");
        this.f57892a = f10;
        this.f57893b = eVar;
        this.f57894c = i10;
    }

    public final float b() {
        return this.f57892a;
    }

    public final po.e<Float> c() {
        return this.f57893b;
    }

    public final int d() {
        return this.f57894c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof g) {
            g gVar = (g) obj;
            return ((this.f57892a > gVar.f57892a ? 1 : (this.f57892a == gVar.f57892a ? 0 : -1)) == 0) && jo.p.c(this.f57893b, gVar.f57893b) && this.f57894c == gVar.f57894c;
        }
        return false;
    }

    public int hashCode() {
        return (((Float.hashCode(this.f57892a) * 31) + this.f57893b.hashCode()) * 31) + this.f57894c;
    }

    public String toString() {
        return "ProgressBarRangeInfo(current=" + this.f57892a + ", range=" + this.f57893b + ", steps=" + this.f57894c + ')';
    }

    public /* synthetic */ g(float f10, po.e eVar, int i10, int i11, jo.h hVar) {
        this(f10, eVar, (i11 & 4) != 0 ? 0 : i10);
    }
}
