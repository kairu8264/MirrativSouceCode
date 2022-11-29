package f0;

/* loaded from: classes.dex */
public final class v {

    /* renamed from: e  reason: collision with root package name */
    public static final a f31621e = new a(null);

    /* renamed from: f  reason: collision with root package name */
    public static final v f31622f = new v(0, false, 0, 0, 15, null);

    /* renamed from: a  reason: collision with root package name */
    public final int f31623a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f31624b;

    /* renamed from: c  reason: collision with root package name */
    public final int f31625c;

    /* renamed from: d  reason: collision with root package name */
    public final int f31626d;

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final v a() {
            return v.f31622f;
        }
    }

    public v(int i10, boolean z10, int i11, int i12) {
        this.f31623a = i10;
        this.f31624b = z10;
        this.f31625c = i11;
        this.f31626d = i12;
    }

    public /* synthetic */ v(int i10, boolean z10, int i11, int i12, jo.h hVar) {
        this(i10, z10, i11, i12);
    }

    public final e2.m b(boolean z10) {
        return new e2.m(z10, this.f31623a, this.f31624b, this.f31625c, this.f31626d, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof v) {
            v vVar = (v) obj;
            return e2.r.f(this.f31623a, vVar.f31623a) && this.f31624b == vVar.f31624b && e2.s.k(this.f31625c, vVar.f31625c) && e2.l.l(this.f31626d, vVar.f31626d);
        }
        return false;
    }

    public int hashCode() {
        return (((((e2.r.g(this.f31623a) * 31) + Boolean.hashCode(this.f31624b)) * 31) + e2.s.l(this.f31625c)) * 31) + e2.l.m(this.f31626d);
    }

    public String toString() {
        return "KeyboardOptions(capitalization=" + ((Object) e2.r.h(this.f31623a)) + ", autoCorrect=" + this.f31624b + ", keyboardType=" + ((Object) e2.s.m(this.f31625c)) + ", imeAction=" + ((Object) e2.l.n(this.f31626d)) + ')';
    }

    public /* synthetic */ v(int i10, boolean z10, int i11, int i12, int i13, jo.h hVar) {
        this((i13 & 1) != 0 ? e2.r.f30131a.b() : i10, (i13 & 2) != 0 ? true : z10, (i13 & 4) != 0 ? e2.s.f30136a.h() : i11, (i13 & 8) != 0 ? e2.l.f30112b.a() : i12, null);
    }
}
