package cl;

import cl.a0;
import java.util.Objects;

/* loaded from: classes4.dex */
public final class g extends a0.e {

    /* renamed from: a  reason: collision with root package name */
    public final String f19837a;

    /* renamed from: b  reason: collision with root package name */
    public final String f19838b;

    /* renamed from: c  reason: collision with root package name */
    public final long f19839c;

    /* renamed from: d  reason: collision with root package name */
    public final Long f19840d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f19841e;

    /* renamed from: f  reason: collision with root package name */
    public final a0.e.a f19842f;

    /* renamed from: g  reason: collision with root package name */
    public final a0.e.f f19843g;

    /* renamed from: h  reason: collision with root package name */
    public final a0.e.AbstractC0172e f19844h;

    /* renamed from: i  reason: collision with root package name */
    public final a0.e.c f19845i;

    /* renamed from: j  reason: collision with root package name */
    public final b0<a0.e.d> f19846j;

    /* renamed from: k  reason: collision with root package name */
    public final int f19847k;

    /* loaded from: classes4.dex */
    public static final class b extends a0.e.b {

        /* renamed from: a  reason: collision with root package name */
        public String f19848a;

        /* renamed from: b  reason: collision with root package name */
        public String f19849b;

        /* renamed from: c  reason: collision with root package name */
        public Long f19850c;

        /* renamed from: d  reason: collision with root package name */
        public Long f19851d;

        /* renamed from: e  reason: collision with root package name */
        public Boolean f19852e;

        /* renamed from: f  reason: collision with root package name */
        public a0.e.a f19853f;

        /* renamed from: g  reason: collision with root package name */
        public a0.e.f f19854g;

        /* renamed from: h  reason: collision with root package name */
        public a0.e.AbstractC0172e f19855h;

        /* renamed from: i  reason: collision with root package name */
        public a0.e.c f19856i;

        /* renamed from: j  reason: collision with root package name */
        public b0<a0.e.d> f19857j;

        /* renamed from: k  reason: collision with root package name */
        public Integer f19858k;

        @Override // cl.a0.e.b
        public a0.e a() {
            String str = "";
            if (this.f19848a == null) {
                str = " generator";
            }
            if (this.f19849b == null) {
                str = str + " identifier";
            }
            if (this.f19850c == null) {
                str = str + " startedAt";
            }
            if (this.f19852e == null) {
                str = str + " crashed";
            }
            if (this.f19853f == null) {
                str = str + " app";
            }
            if (this.f19858k == null) {
                str = str + " generatorType";
            }
            if (str.isEmpty()) {
                return new g(this.f19848a, this.f19849b, this.f19850c.longValue(), this.f19851d, this.f19852e.booleanValue(), this.f19853f, this.f19854g, this.f19855h, this.f19856i, this.f19857j, this.f19858k.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // cl.a0.e.b
        public a0.e.b b(a0.e.a aVar) {
            Objects.requireNonNull(aVar, "Null app");
            this.f19853f = aVar;
            return this;
        }

        @Override // cl.a0.e.b
        public a0.e.b c(boolean z10) {
            this.f19852e = Boolean.valueOf(z10);
            return this;
        }

        @Override // cl.a0.e.b
        public a0.e.b d(a0.e.c cVar) {
            this.f19856i = cVar;
            return this;
        }

        @Override // cl.a0.e.b
        public a0.e.b e(Long l10) {
            this.f19851d = l10;
            return this;
        }

        @Override // cl.a0.e.b
        public a0.e.b f(b0<a0.e.d> b0Var) {
            this.f19857j = b0Var;
            return this;
        }

        @Override // cl.a0.e.b
        public a0.e.b g(String str) {
            Objects.requireNonNull(str, "Null generator");
            this.f19848a = str;
            return this;
        }

        @Override // cl.a0.e.b
        public a0.e.b h(int i10) {
            this.f19858k = Integer.valueOf(i10);
            return this;
        }

        @Override // cl.a0.e.b
        public a0.e.b i(String str) {
            Objects.requireNonNull(str, "Null identifier");
            this.f19849b = str;
            return this;
        }

        @Override // cl.a0.e.b
        public a0.e.b k(a0.e.AbstractC0172e abstractC0172e) {
            this.f19855h = abstractC0172e;
            return this;
        }

        @Override // cl.a0.e.b
        public a0.e.b l(long j10) {
            this.f19850c = Long.valueOf(j10);
            return this;
        }

        @Override // cl.a0.e.b
        public a0.e.b m(a0.e.f fVar) {
            this.f19854g = fVar;
            return this;
        }

        public b() {
        }

        public b(a0.e eVar) {
            this.f19848a = eVar.f();
            this.f19849b = eVar.h();
            this.f19850c = Long.valueOf(eVar.k());
            this.f19851d = eVar.d();
            this.f19852e = Boolean.valueOf(eVar.m());
            this.f19853f = eVar.b();
            this.f19854g = eVar.l();
            this.f19855h = eVar.j();
            this.f19856i = eVar.c();
            this.f19857j = eVar.e();
            this.f19858k = Integer.valueOf(eVar.g());
        }
    }

    @Override // cl.a0.e
    public a0.e.a b() {
        return this.f19842f;
    }

    @Override // cl.a0.e
    public a0.e.c c() {
        return this.f19845i;
    }

    @Override // cl.a0.e
    public Long d() {
        return this.f19840d;
    }

    @Override // cl.a0.e
    public b0<a0.e.d> e() {
        return this.f19846j;
    }

    public boolean equals(Object obj) {
        Long l10;
        a0.e.f fVar;
        a0.e.AbstractC0172e abstractC0172e;
        a0.e.c cVar;
        b0<a0.e.d> b0Var;
        if (obj == this) {
            return true;
        }
        if (obj instanceof a0.e) {
            a0.e eVar = (a0.e) obj;
            return this.f19837a.equals(eVar.f()) && this.f19838b.equals(eVar.h()) && this.f19839c == eVar.k() && ((l10 = this.f19840d) != null ? l10.equals(eVar.d()) : eVar.d() == null) && this.f19841e == eVar.m() && this.f19842f.equals(eVar.b()) && ((fVar = this.f19843g) != null ? fVar.equals(eVar.l()) : eVar.l() == null) && ((abstractC0172e = this.f19844h) != null ? abstractC0172e.equals(eVar.j()) : eVar.j() == null) && ((cVar = this.f19845i) != null ? cVar.equals(eVar.c()) : eVar.c() == null) && ((b0Var = this.f19846j) != null ? b0Var.equals(eVar.e()) : eVar.e() == null) && this.f19847k == eVar.g();
        }
        return false;
    }

    @Override // cl.a0.e
    public String f() {
        return this.f19837a;
    }

    @Override // cl.a0.e
    public int g() {
        return this.f19847k;
    }

    @Override // cl.a0.e
    public String h() {
        return this.f19838b;
    }

    public int hashCode() {
        long j10 = this.f19839c;
        int hashCode = (((((this.f19837a.hashCode() ^ 1000003) * 1000003) ^ this.f19838b.hashCode()) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        Long l10 = this.f19840d;
        int hashCode2 = (((((hashCode ^ (l10 == null ? 0 : l10.hashCode())) * 1000003) ^ (this.f19841e ? 1231 : 1237)) * 1000003) ^ this.f19842f.hashCode()) * 1000003;
        a0.e.f fVar = this.f19843g;
        int hashCode3 = (hashCode2 ^ (fVar == null ? 0 : fVar.hashCode())) * 1000003;
        a0.e.AbstractC0172e abstractC0172e = this.f19844h;
        int hashCode4 = (hashCode3 ^ (abstractC0172e == null ? 0 : abstractC0172e.hashCode())) * 1000003;
        a0.e.c cVar = this.f19845i;
        int hashCode5 = (hashCode4 ^ (cVar == null ? 0 : cVar.hashCode())) * 1000003;
        b0<a0.e.d> b0Var = this.f19846j;
        return ((hashCode5 ^ (b0Var != null ? b0Var.hashCode() : 0)) * 1000003) ^ this.f19847k;
    }

    @Override // cl.a0.e
    public a0.e.AbstractC0172e j() {
        return this.f19844h;
    }

    @Override // cl.a0.e
    public long k() {
        return this.f19839c;
    }

    @Override // cl.a0.e
    public a0.e.f l() {
        return this.f19843g;
    }

    @Override // cl.a0.e
    public boolean m() {
        return this.f19841e;
    }

    @Override // cl.a0.e
    public a0.e.b n() {
        return new b(this);
    }

    public String toString() {
        return "Session{generator=" + this.f19837a + ", identifier=" + this.f19838b + ", startedAt=" + this.f19839c + ", endedAt=" + this.f19840d + ", crashed=" + this.f19841e + ", app=" + this.f19842f + ", user=" + this.f19843g + ", os=" + this.f19844h + ", device=" + this.f19845i + ", events=" + this.f19846j + ", generatorType=" + this.f19847k + "}";
    }

    public g(String str, String str2, long j10, Long l10, boolean z10, a0.e.a aVar, a0.e.f fVar, a0.e.AbstractC0172e abstractC0172e, a0.e.c cVar, b0<a0.e.d> b0Var, int i10) {
        this.f19837a = str;
        this.f19838b = str2;
        this.f19839c = j10;
        this.f19840d = l10;
        this.f19841e = z10;
        this.f19842f = aVar;
        this.f19843g = fVar;
        this.f19844h = abstractC0172e;
        this.f19845i = cVar;
        this.f19846j = b0Var;
        this.f19847k = i10;
    }
}
