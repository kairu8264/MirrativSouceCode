package e2;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: f  reason: collision with root package name */
    public static final a f30122f = new a(null);

    /* renamed from: g  reason: collision with root package name */
    public static final m f30123g = new m(false, 0, false, 0, 0, 31, null);

    /* renamed from: a  reason: collision with root package name */
    public final boolean f30124a;

    /* renamed from: b  reason: collision with root package name */
    public final int f30125b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f30126c;

    /* renamed from: d  reason: collision with root package name */
    public final int f30127d;

    /* renamed from: e  reason: collision with root package name */
    public final int f30128e;

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final m a() {
            return m.f30123g;
        }
    }

    public m(boolean z10, int i10, boolean z11, int i11, int i12) {
        this.f30124a = z10;
        this.f30125b = i10;
        this.f30126c = z11;
        this.f30127d = i11;
        this.f30128e = i12;
    }

    public /* synthetic */ m(boolean z10, int i10, boolean z11, int i11, int i12, jo.h hVar) {
        this(z10, i10, z11, i11, i12);
    }

    public final boolean b() {
        return this.f30126c;
    }

    public final int c() {
        return this.f30125b;
    }

    public final int d() {
        return this.f30128e;
    }

    public final int e() {
        return this.f30127d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof m) {
            m mVar = (m) obj;
            return this.f30124a == mVar.f30124a && r.f(this.f30125b, mVar.f30125b) && this.f30126c == mVar.f30126c && s.k(this.f30127d, mVar.f30127d) && l.l(this.f30128e, mVar.f30128e);
        }
        return false;
    }

    public final boolean f() {
        return this.f30124a;
    }

    public int hashCode() {
        return (((((((Boolean.hashCode(this.f30124a) * 31) + r.g(this.f30125b)) * 31) + Boolean.hashCode(this.f30126c)) * 31) + s.l(this.f30127d)) * 31) + l.m(this.f30128e);
    }

    public String toString() {
        return "ImeOptions(singleLine=" + this.f30124a + ", capitalization=" + ((Object) r.h(this.f30125b)) + ", autoCorrect=" + this.f30126c + ", keyboardType=" + ((Object) s.m(this.f30127d)) + ", imeAction=" + ((Object) l.n(this.f30128e)) + ')';
    }

    public /* synthetic */ m(boolean z10, int i10, boolean z11, int i11, int i12, int i13, jo.h hVar) {
        this((i13 & 1) != 0 ? false : z10, (i13 & 2) != 0 ? r.f30131a.b() : i10, (i13 & 4) != 0 ? true : z11, (i13 & 8) != 0 ? s.f30136a.h() : i11, (i13 & 16) != 0 ? l.f30112b.a() : i12, null);
    }
}
