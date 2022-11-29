package g1;

/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f32406a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f32407b;

    /* loaded from: classes.dex */
    public static final class a extends f {

        /* renamed from: c  reason: collision with root package name */
        public final float f32408c;

        /* renamed from: d  reason: collision with root package name */
        public final float f32409d;

        /* renamed from: e  reason: collision with root package name */
        public final float f32410e;

        /* renamed from: f  reason: collision with root package name */
        public final boolean f32411f;

        /* renamed from: g  reason: collision with root package name */
        public final boolean f32412g;

        /* renamed from: h  reason: collision with root package name */
        public final float f32413h;

        /* renamed from: i  reason: collision with root package name */
        public final float f32414i;

        public a(float f10, float f11, float f12, boolean z10, boolean z11, float f13, float f14) {
            super(false, false, 3, null);
            this.f32408c = f10;
            this.f32409d = f11;
            this.f32410e = f12;
            this.f32411f = z10;
            this.f32412g = z11;
            this.f32413h = f13;
            this.f32414i = f14;
        }

        public final float c() {
            return this.f32413h;
        }

        public final float d() {
            return this.f32414i;
        }

        public final float e() {
            return this.f32408c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                return jo.p.c(Float.valueOf(this.f32408c), Float.valueOf(aVar.f32408c)) && jo.p.c(Float.valueOf(this.f32409d), Float.valueOf(aVar.f32409d)) && jo.p.c(Float.valueOf(this.f32410e), Float.valueOf(aVar.f32410e)) && this.f32411f == aVar.f32411f && this.f32412g == aVar.f32412g && jo.p.c(Float.valueOf(this.f32413h), Float.valueOf(aVar.f32413h)) && jo.p.c(Float.valueOf(this.f32414i), Float.valueOf(aVar.f32414i));
            }
            return false;
        }

        public final float f() {
            return this.f32410e;
        }

        public final float g() {
            return this.f32409d;
        }

        public final boolean h() {
            return this.f32411f;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int hashCode = ((((Float.hashCode(this.f32408c) * 31) + Float.hashCode(this.f32409d)) * 31) + Float.hashCode(this.f32410e)) * 31;
            boolean z10 = this.f32411f;
            int i10 = z10;
            if (z10 != 0) {
                i10 = 1;
            }
            int i11 = (hashCode + i10) * 31;
            boolean z11 = this.f32412g;
            return ((((i11 + (z11 ? 1 : z11 ? 1 : 0)) * 31) + Float.hashCode(this.f32413h)) * 31) + Float.hashCode(this.f32414i);
        }

        public final boolean i() {
            return this.f32412g;
        }

        public String toString() {
            return "ArcTo(horizontalEllipseRadius=" + this.f32408c + ", verticalEllipseRadius=" + this.f32409d + ", theta=" + this.f32410e + ", isMoreThanHalf=" + this.f32411f + ", isPositiveArc=" + this.f32412g + ", arcStartX=" + this.f32413h + ", arcStartY=" + this.f32414i + ')';
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends f {

        /* renamed from: c  reason: collision with root package name */
        public static final b f32415c = new b();

        public b() {
            super(false, false, 3, null);
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends f {

        /* renamed from: c  reason: collision with root package name */
        public final float f32416c;

        /* renamed from: d  reason: collision with root package name */
        public final float f32417d;

        /* renamed from: e  reason: collision with root package name */
        public final float f32418e;

        /* renamed from: f  reason: collision with root package name */
        public final float f32419f;

        /* renamed from: g  reason: collision with root package name */
        public final float f32420g;

        /* renamed from: h  reason: collision with root package name */
        public final float f32421h;

        public c(float f10, float f11, float f12, float f13, float f14, float f15) {
            super(true, false, 2, null);
            this.f32416c = f10;
            this.f32417d = f11;
            this.f32418e = f12;
            this.f32419f = f13;
            this.f32420g = f14;
            this.f32421h = f15;
        }

        public final float c() {
            return this.f32416c;
        }

        public final float d() {
            return this.f32418e;
        }

        public final float e() {
            return this.f32420g;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof c) {
                c cVar = (c) obj;
                return jo.p.c(Float.valueOf(this.f32416c), Float.valueOf(cVar.f32416c)) && jo.p.c(Float.valueOf(this.f32417d), Float.valueOf(cVar.f32417d)) && jo.p.c(Float.valueOf(this.f32418e), Float.valueOf(cVar.f32418e)) && jo.p.c(Float.valueOf(this.f32419f), Float.valueOf(cVar.f32419f)) && jo.p.c(Float.valueOf(this.f32420g), Float.valueOf(cVar.f32420g)) && jo.p.c(Float.valueOf(this.f32421h), Float.valueOf(cVar.f32421h));
            }
            return false;
        }

        public final float f() {
            return this.f32417d;
        }

        public final float g() {
            return this.f32419f;
        }

        public final float h() {
            return this.f32421h;
        }

        public int hashCode() {
            return (((((((((Float.hashCode(this.f32416c) * 31) + Float.hashCode(this.f32417d)) * 31) + Float.hashCode(this.f32418e)) * 31) + Float.hashCode(this.f32419f)) * 31) + Float.hashCode(this.f32420g)) * 31) + Float.hashCode(this.f32421h);
        }

        public String toString() {
            return "CurveTo(x1=" + this.f32416c + ", y1=" + this.f32417d + ", x2=" + this.f32418e + ", y2=" + this.f32419f + ", x3=" + this.f32420g + ", y3=" + this.f32421h + ')';
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends f {

        /* renamed from: c  reason: collision with root package name */
        public final float f32422c;

        public d(float f10) {
            super(false, false, 3, null);
            this.f32422c = f10;
        }

        public final float c() {
            return this.f32422c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && jo.p.c(Float.valueOf(this.f32422c), Float.valueOf(((d) obj).f32422c));
        }

        public int hashCode() {
            return Float.hashCode(this.f32422c);
        }

        public String toString() {
            return "HorizontalTo(x=" + this.f32422c + ')';
        }
    }

    /* loaded from: classes.dex */
    public static final class e extends f {

        /* renamed from: c  reason: collision with root package name */
        public final float f32423c;

        /* renamed from: d  reason: collision with root package name */
        public final float f32424d;

        public e(float f10, float f11) {
            super(false, false, 3, null);
            this.f32423c = f10;
            this.f32424d = f11;
        }

        public final float c() {
            return this.f32423c;
        }

        public final float d() {
            return this.f32424d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof e) {
                e eVar = (e) obj;
                return jo.p.c(Float.valueOf(this.f32423c), Float.valueOf(eVar.f32423c)) && jo.p.c(Float.valueOf(this.f32424d), Float.valueOf(eVar.f32424d));
            }
            return false;
        }

        public int hashCode() {
            return (Float.hashCode(this.f32423c) * 31) + Float.hashCode(this.f32424d);
        }

        public String toString() {
            return "LineTo(x=" + this.f32423c + ", y=" + this.f32424d + ')';
        }
    }

    /* renamed from: g1.f$f  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0374f extends f {

        /* renamed from: c  reason: collision with root package name */
        public final float f32425c;

        /* renamed from: d  reason: collision with root package name */
        public final float f32426d;

        public C0374f(float f10, float f11) {
            super(false, false, 3, null);
            this.f32425c = f10;
            this.f32426d = f11;
        }

        public final float c() {
            return this.f32425c;
        }

        public final float d() {
            return this.f32426d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C0374f) {
                C0374f c0374f = (C0374f) obj;
                return jo.p.c(Float.valueOf(this.f32425c), Float.valueOf(c0374f.f32425c)) && jo.p.c(Float.valueOf(this.f32426d), Float.valueOf(c0374f.f32426d));
            }
            return false;
        }

        public int hashCode() {
            return (Float.hashCode(this.f32425c) * 31) + Float.hashCode(this.f32426d);
        }

        public String toString() {
            return "MoveTo(x=" + this.f32425c + ", y=" + this.f32426d + ')';
        }
    }

    /* loaded from: classes.dex */
    public static final class g extends f {

        /* renamed from: c  reason: collision with root package name */
        public final float f32427c;

        /* renamed from: d  reason: collision with root package name */
        public final float f32428d;

        /* renamed from: e  reason: collision with root package name */
        public final float f32429e;

        /* renamed from: f  reason: collision with root package name */
        public final float f32430f;

        public g(float f10, float f11, float f12, float f13) {
            super(false, true, 1, null);
            this.f32427c = f10;
            this.f32428d = f11;
            this.f32429e = f12;
            this.f32430f = f13;
        }

        public final float c() {
            return this.f32427c;
        }

        public final float d() {
            return this.f32429e;
        }

        public final float e() {
            return this.f32428d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof g) {
                g gVar = (g) obj;
                return jo.p.c(Float.valueOf(this.f32427c), Float.valueOf(gVar.f32427c)) && jo.p.c(Float.valueOf(this.f32428d), Float.valueOf(gVar.f32428d)) && jo.p.c(Float.valueOf(this.f32429e), Float.valueOf(gVar.f32429e)) && jo.p.c(Float.valueOf(this.f32430f), Float.valueOf(gVar.f32430f));
            }
            return false;
        }

        public final float f() {
            return this.f32430f;
        }

        public int hashCode() {
            return (((((Float.hashCode(this.f32427c) * 31) + Float.hashCode(this.f32428d)) * 31) + Float.hashCode(this.f32429e)) * 31) + Float.hashCode(this.f32430f);
        }

        public String toString() {
            return "QuadTo(x1=" + this.f32427c + ", y1=" + this.f32428d + ", x2=" + this.f32429e + ", y2=" + this.f32430f + ')';
        }
    }

    /* loaded from: classes.dex */
    public static final class h extends f {

        /* renamed from: c  reason: collision with root package name */
        public final float f32431c;

        /* renamed from: d  reason: collision with root package name */
        public final float f32432d;

        /* renamed from: e  reason: collision with root package name */
        public final float f32433e;

        /* renamed from: f  reason: collision with root package name */
        public final float f32434f;

        public h(float f10, float f11, float f12, float f13) {
            super(true, false, 2, null);
            this.f32431c = f10;
            this.f32432d = f11;
            this.f32433e = f12;
            this.f32434f = f13;
        }

        public final float c() {
            return this.f32431c;
        }

        public final float d() {
            return this.f32433e;
        }

        public final float e() {
            return this.f32432d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof h) {
                h hVar = (h) obj;
                return jo.p.c(Float.valueOf(this.f32431c), Float.valueOf(hVar.f32431c)) && jo.p.c(Float.valueOf(this.f32432d), Float.valueOf(hVar.f32432d)) && jo.p.c(Float.valueOf(this.f32433e), Float.valueOf(hVar.f32433e)) && jo.p.c(Float.valueOf(this.f32434f), Float.valueOf(hVar.f32434f));
            }
            return false;
        }

        public final float f() {
            return this.f32434f;
        }

        public int hashCode() {
            return (((((Float.hashCode(this.f32431c) * 31) + Float.hashCode(this.f32432d)) * 31) + Float.hashCode(this.f32433e)) * 31) + Float.hashCode(this.f32434f);
        }

        public String toString() {
            return "ReflectiveCurveTo(x1=" + this.f32431c + ", y1=" + this.f32432d + ", x2=" + this.f32433e + ", y2=" + this.f32434f + ')';
        }
    }

    /* loaded from: classes.dex */
    public static final class i extends f {

        /* renamed from: c  reason: collision with root package name */
        public final float f32435c;

        /* renamed from: d  reason: collision with root package name */
        public final float f32436d;

        public i(float f10, float f11) {
            super(false, true, 1, null);
            this.f32435c = f10;
            this.f32436d = f11;
        }

        public final float c() {
            return this.f32435c;
        }

        public final float d() {
            return this.f32436d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof i) {
                i iVar = (i) obj;
                return jo.p.c(Float.valueOf(this.f32435c), Float.valueOf(iVar.f32435c)) && jo.p.c(Float.valueOf(this.f32436d), Float.valueOf(iVar.f32436d));
            }
            return false;
        }

        public int hashCode() {
            return (Float.hashCode(this.f32435c) * 31) + Float.hashCode(this.f32436d);
        }

        public String toString() {
            return "ReflectiveQuadTo(x=" + this.f32435c + ", y=" + this.f32436d + ')';
        }
    }

    /* loaded from: classes.dex */
    public static final class j extends f {

        /* renamed from: c  reason: collision with root package name */
        public final float f32437c;

        /* renamed from: d  reason: collision with root package name */
        public final float f32438d;

        /* renamed from: e  reason: collision with root package name */
        public final float f32439e;

        /* renamed from: f  reason: collision with root package name */
        public final boolean f32440f;

        /* renamed from: g  reason: collision with root package name */
        public final boolean f32441g;

        /* renamed from: h  reason: collision with root package name */
        public final float f32442h;

        /* renamed from: i  reason: collision with root package name */
        public final float f32443i;

        public j(float f10, float f11, float f12, boolean z10, boolean z11, float f13, float f14) {
            super(false, false, 3, null);
            this.f32437c = f10;
            this.f32438d = f11;
            this.f32439e = f12;
            this.f32440f = z10;
            this.f32441g = z11;
            this.f32442h = f13;
            this.f32443i = f14;
        }

        public final float c() {
            return this.f32442h;
        }

        public final float d() {
            return this.f32443i;
        }

        public final float e() {
            return this.f32437c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof j) {
                j jVar = (j) obj;
                return jo.p.c(Float.valueOf(this.f32437c), Float.valueOf(jVar.f32437c)) && jo.p.c(Float.valueOf(this.f32438d), Float.valueOf(jVar.f32438d)) && jo.p.c(Float.valueOf(this.f32439e), Float.valueOf(jVar.f32439e)) && this.f32440f == jVar.f32440f && this.f32441g == jVar.f32441g && jo.p.c(Float.valueOf(this.f32442h), Float.valueOf(jVar.f32442h)) && jo.p.c(Float.valueOf(this.f32443i), Float.valueOf(jVar.f32443i));
            }
            return false;
        }

        public final float f() {
            return this.f32439e;
        }

        public final float g() {
            return this.f32438d;
        }

        public final boolean h() {
            return this.f32440f;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int hashCode = ((((Float.hashCode(this.f32437c) * 31) + Float.hashCode(this.f32438d)) * 31) + Float.hashCode(this.f32439e)) * 31;
            boolean z10 = this.f32440f;
            int i10 = z10;
            if (z10 != 0) {
                i10 = 1;
            }
            int i11 = (hashCode + i10) * 31;
            boolean z11 = this.f32441g;
            return ((((i11 + (z11 ? 1 : z11 ? 1 : 0)) * 31) + Float.hashCode(this.f32442h)) * 31) + Float.hashCode(this.f32443i);
        }

        public final boolean i() {
            return this.f32441g;
        }

        public String toString() {
            return "RelativeArcTo(horizontalEllipseRadius=" + this.f32437c + ", verticalEllipseRadius=" + this.f32438d + ", theta=" + this.f32439e + ", isMoreThanHalf=" + this.f32440f + ", isPositiveArc=" + this.f32441g + ", arcStartDx=" + this.f32442h + ", arcStartDy=" + this.f32443i + ')';
        }
    }

    /* loaded from: classes.dex */
    public static final class k extends f {

        /* renamed from: c  reason: collision with root package name */
        public final float f32444c;

        /* renamed from: d  reason: collision with root package name */
        public final float f32445d;

        /* renamed from: e  reason: collision with root package name */
        public final float f32446e;

        /* renamed from: f  reason: collision with root package name */
        public final float f32447f;

        /* renamed from: g  reason: collision with root package name */
        public final float f32448g;

        /* renamed from: h  reason: collision with root package name */
        public final float f32449h;

        public k(float f10, float f11, float f12, float f13, float f14, float f15) {
            super(true, false, 2, null);
            this.f32444c = f10;
            this.f32445d = f11;
            this.f32446e = f12;
            this.f32447f = f13;
            this.f32448g = f14;
            this.f32449h = f15;
        }

        public final float c() {
            return this.f32444c;
        }

        public final float d() {
            return this.f32446e;
        }

        public final float e() {
            return this.f32448g;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof k) {
                k kVar = (k) obj;
                return jo.p.c(Float.valueOf(this.f32444c), Float.valueOf(kVar.f32444c)) && jo.p.c(Float.valueOf(this.f32445d), Float.valueOf(kVar.f32445d)) && jo.p.c(Float.valueOf(this.f32446e), Float.valueOf(kVar.f32446e)) && jo.p.c(Float.valueOf(this.f32447f), Float.valueOf(kVar.f32447f)) && jo.p.c(Float.valueOf(this.f32448g), Float.valueOf(kVar.f32448g)) && jo.p.c(Float.valueOf(this.f32449h), Float.valueOf(kVar.f32449h));
            }
            return false;
        }

        public final float f() {
            return this.f32445d;
        }

        public final float g() {
            return this.f32447f;
        }

        public final float h() {
            return this.f32449h;
        }

        public int hashCode() {
            return (((((((((Float.hashCode(this.f32444c) * 31) + Float.hashCode(this.f32445d)) * 31) + Float.hashCode(this.f32446e)) * 31) + Float.hashCode(this.f32447f)) * 31) + Float.hashCode(this.f32448g)) * 31) + Float.hashCode(this.f32449h);
        }

        public String toString() {
            return "RelativeCurveTo(dx1=" + this.f32444c + ", dy1=" + this.f32445d + ", dx2=" + this.f32446e + ", dy2=" + this.f32447f + ", dx3=" + this.f32448g + ", dy3=" + this.f32449h + ')';
        }
    }

    /* loaded from: classes.dex */
    public static final class l extends f {

        /* renamed from: c  reason: collision with root package name */
        public final float f32450c;

        public l(float f10) {
            super(false, false, 3, null);
            this.f32450c = f10;
        }

        public final float c() {
            return this.f32450c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof l) && jo.p.c(Float.valueOf(this.f32450c), Float.valueOf(((l) obj).f32450c));
        }

        public int hashCode() {
            return Float.hashCode(this.f32450c);
        }

        public String toString() {
            return "RelativeHorizontalTo(dx=" + this.f32450c + ')';
        }
    }

    /* loaded from: classes.dex */
    public static final class m extends f {

        /* renamed from: c  reason: collision with root package name */
        public final float f32451c;

        /* renamed from: d  reason: collision with root package name */
        public final float f32452d;

        public m(float f10, float f11) {
            super(false, false, 3, null);
            this.f32451c = f10;
            this.f32452d = f11;
        }

        public final float c() {
            return this.f32451c;
        }

        public final float d() {
            return this.f32452d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof m) {
                m mVar = (m) obj;
                return jo.p.c(Float.valueOf(this.f32451c), Float.valueOf(mVar.f32451c)) && jo.p.c(Float.valueOf(this.f32452d), Float.valueOf(mVar.f32452d));
            }
            return false;
        }

        public int hashCode() {
            return (Float.hashCode(this.f32451c) * 31) + Float.hashCode(this.f32452d);
        }

        public String toString() {
            return "RelativeLineTo(dx=" + this.f32451c + ", dy=" + this.f32452d + ')';
        }
    }

    /* loaded from: classes.dex */
    public static final class n extends f {

        /* renamed from: c  reason: collision with root package name */
        public final float f32453c;

        /* renamed from: d  reason: collision with root package name */
        public final float f32454d;

        public n(float f10, float f11) {
            super(false, false, 3, null);
            this.f32453c = f10;
            this.f32454d = f11;
        }

        public final float c() {
            return this.f32453c;
        }

        public final float d() {
            return this.f32454d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof n) {
                n nVar = (n) obj;
                return jo.p.c(Float.valueOf(this.f32453c), Float.valueOf(nVar.f32453c)) && jo.p.c(Float.valueOf(this.f32454d), Float.valueOf(nVar.f32454d));
            }
            return false;
        }

        public int hashCode() {
            return (Float.hashCode(this.f32453c) * 31) + Float.hashCode(this.f32454d);
        }

        public String toString() {
            return "RelativeMoveTo(dx=" + this.f32453c + ", dy=" + this.f32454d + ')';
        }
    }

    /* loaded from: classes.dex */
    public static final class o extends f {

        /* renamed from: c  reason: collision with root package name */
        public final float f32455c;

        /* renamed from: d  reason: collision with root package name */
        public final float f32456d;

        /* renamed from: e  reason: collision with root package name */
        public final float f32457e;

        /* renamed from: f  reason: collision with root package name */
        public final float f32458f;

        public o(float f10, float f11, float f12, float f13) {
            super(false, true, 1, null);
            this.f32455c = f10;
            this.f32456d = f11;
            this.f32457e = f12;
            this.f32458f = f13;
        }

        public final float c() {
            return this.f32455c;
        }

        public final float d() {
            return this.f32457e;
        }

        public final float e() {
            return this.f32456d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof o) {
                o oVar = (o) obj;
                return jo.p.c(Float.valueOf(this.f32455c), Float.valueOf(oVar.f32455c)) && jo.p.c(Float.valueOf(this.f32456d), Float.valueOf(oVar.f32456d)) && jo.p.c(Float.valueOf(this.f32457e), Float.valueOf(oVar.f32457e)) && jo.p.c(Float.valueOf(this.f32458f), Float.valueOf(oVar.f32458f));
            }
            return false;
        }

        public final float f() {
            return this.f32458f;
        }

        public int hashCode() {
            return (((((Float.hashCode(this.f32455c) * 31) + Float.hashCode(this.f32456d)) * 31) + Float.hashCode(this.f32457e)) * 31) + Float.hashCode(this.f32458f);
        }

        public String toString() {
            return "RelativeQuadTo(dx1=" + this.f32455c + ", dy1=" + this.f32456d + ", dx2=" + this.f32457e + ", dy2=" + this.f32458f + ')';
        }
    }

    /* loaded from: classes.dex */
    public static final class p extends f {

        /* renamed from: c  reason: collision with root package name */
        public final float f32459c;

        /* renamed from: d  reason: collision with root package name */
        public final float f32460d;

        /* renamed from: e  reason: collision with root package name */
        public final float f32461e;

        /* renamed from: f  reason: collision with root package name */
        public final float f32462f;

        public p(float f10, float f11, float f12, float f13) {
            super(true, false, 2, null);
            this.f32459c = f10;
            this.f32460d = f11;
            this.f32461e = f12;
            this.f32462f = f13;
        }

        public final float c() {
            return this.f32459c;
        }

        public final float d() {
            return this.f32461e;
        }

        public final float e() {
            return this.f32460d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof p) {
                p pVar = (p) obj;
                return jo.p.c(Float.valueOf(this.f32459c), Float.valueOf(pVar.f32459c)) && jo.p.c(Float.valueOf(this.f32460d), Float.valueOf(pVar.f32460d)) && jo.p.c(Float.valueOf(this.f32461e), Float.valueOf(pVar.f32461e)) && jo.p.c(Float.valueOf(this.f32462f), Float.valueOf(pVar.f32462f));
            }
            return false;
        }

        public final float f() {
            return this.f32462f;
        }

        public int hashCode() {
            return (((((Float.hashCode(this.f32459c) * 31) + Float.hashCode(this.f32460d)) * 31) + Float.hashCode(this.f32461e)) * 31) + Float.hashCode(this.f32462f);
        }

        public String toString() {
            return "RelativeReflectiveCurveTo(dx1=" + this.f32459c + ", dy1=" + this.f32460d + ", dx2=" + this.f32461e + ", dy2=" + this.f32462f + ')';
        }
    }

    /* loaded from: classes.dex */
    public static final class q extends f {

        /* renamed from: c  reason: collision with root package name */
        public final float f32463c;

        /* renamed from: d  reason: collision with root package name */
        public final float f32464d;

        public q(float f10, float f11) {
            super(false, true, 1, null);
            this.f32463c = f10;
            this.f32464d = f11;
        }

        public final float c() {
            return this.f32463c;
        }

        public final float d() {
            return this.f32464d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof q) {
                q qVar = (q) obj;
                return jo.p.c(Float.valueOf(this.f32463c), Float.valueOf(qVar.f32463c)) && jo.p.c(Float.valueOf(this.f32464d), Float.valueOf(qVar.f32464d));
            }
            return false;
        }

        public int hashCode() {
            return (Float.hashCode(this.f32463c) * 31) + Float.hashCode(this.f32464d);
        }

        public String toString() {
            return "RelativeReflectiveQuadTo(dx=" + this.f32463c + ", dy=" + this.f32464d + ')';
        }
    }

    /* loaded from: classes.dex */
    public static final class r extends f {

        /* renamed from: c  reason: collision with root package name */
        public final float f32465c;

        public r(float f10) {
            super(false, false, 3, null);
            this.f32465c = f10;
        }

        public final float c() {
            return this.f32465c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof r) && jo.p.c(Float.valueOf(this.f32465c), Float.valueOf(((r) obj).f32465c));
        }

        public int hashCode() {
            return Float.hashCode(this.f32465c);
        }

        public String toString() {
            return "RelativeVerticalTo(dy=" + this.f32465c + ')';
        }
    }

    /* loaded from: classes.dex */
    public static final class s extends f {

        /* renamed from: c  reason: collision with root package name */
        public final float f32466c;

        public s(float f10) {
            super(false, false, 3, null);
            this.f32466c = f10;
        }

        public final float c() {
            return this.f32466c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof s) && jo.p.c(Float.valueOf(this.f32466c), Float.valueOf(((s) obj).f32466c));
        }

        public int hashCode() {
            return Float.hashCode(this.f32466c);
        }

        public String toString() {
            return "VerticalTo(y=" + this.f32466c + ')';
        }
    }

    public f(boolean z10, boolean z11) {
        this.f32406a = z10;
        this.f32407b = z11;
    }

    public /* synthetic */ f(boolean z10, boolean z11, jo.h hVar) {
        this(z10, z11);
    }

    public final boolean a() {
        return this.f32406a;
    }

    public final boolean b() {
        return this.f32407b;
    }

    public /* synthetic */ f(boolean z10, boolean z11, int i10, jo.h hVar) {
        this((i10 & 1) != 0 ? false : z10, (i10 & 2) != 0 ? false : z11, null);
    }
}
