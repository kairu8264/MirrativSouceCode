package cl;

import cl.a0;
import java.util.Objects;

/* loaded from: classes4.dex */
public final class h extends a0.e.a {

    /* renamed from: a  reason: collision with root package name */
    public final String f19859a;

    /* renamed from: b  reason: collision with root package name */
    public final String f19860b;

    /* renamed from: c  reason: collision with root package name */
    public final String f19861c;

    /* renamed from: d  reason: collision with root package name */
    public final a0.e.a.b f19862d;

    /* renamed from: e  reason: collision with root package name */
    public final String f19863e;

    /* renamed from: f  reason: collision with root package name */
    public final String f19864f;

    /* renamed from: g  reason: collision with root package name */
    public final String f19865g;

    /* loaded from: classes4.dex */
    public static final class b extends a0.e.a.AbstractC0159a {

        /* renamed from: a  reason: collision with root package name */
        public String f19866a;

        /* renamed from: b  reason: collision with root package name */
        public String f19867b;

        /* renamed from: c  reason: collision with root package name */
        public String f19868c;

        /* renamed from: d  reason: collision with root package name */
        public a0.e.a.b f19869d;

        /* renamed from: e  reason: collision with root package name */
        public String f19870e;

        /* renamed from: f  reason: collision with root package name */
        public String f19871f;

        /* renamed from: g  reason: collision with root package name */
        public String f19872g;

        @Override // cl.a0.e.a.AbstractC0159a
        public a0.e.a a() {
            String str = "";
            if (this.f19866a == null) {
                str = " identifier";
            }
            if (this.f19867b == null) {
                str = str + " version";
            }
            if (str.isEmpty()) {
                return new h(this.f19866a, this.f19867b, this.f19868c, this.f19869d, this.f19870e, this.f19871f, this.f19872g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // cl.a0.e.a.AbstractC0159a
        public a0.e.a.AbstractC0159a b(String str) {
            this.f19871f = str;
            return this;
        }

        @Override // cl.a0.e.a.AbstractC0159a
        public a0.e.a.AbstractC0159a c(String str) {
            this.f19872g = str;
            return this;
        }

        @Override // cl.a0.e.a.AbstractC0159a
        public a0.e.a.AbstractC0159a d(String str) {
            this.f19868c = str;
            return this;
        }

        @Override // cl.a0.e.a.AbstractC0159a
        public a0.e.a.AbstractC0159a e(String str) {
            Objects.requireNonNull(str, "Null identifier");
            this.f19866a = str;
            return this;
        }

        @Override // cl.a0.e.a.AbstractC0159a
        public a0.e.a.AbstractC0159a f(String str) {
            this.f19870e = str;
            return this;
        }

        @Override // cl.a0.e.a.AbstractC0159a
        public a0.e.a.AbstractC0159a g(String str) {
            Objects.requireNonNull(str, "Null version");
            this.f19867b = str;
            return this;
        }
    }

    @Override // cl.a0.e.a
    public String b() {
        return this.f19864f;
    }

    @Override // cl.a0.e.a
    public String c() {
        return this.f19865g;
    }

    @Override // cl.a0.e.a
    public String d() {
        return this.f19861c;
    }

    @Override // cl.a0.e.a
    public String e() {
        return this.f19859a;
    }

    public boolean equals(Object obj) {
        String str;
        a0.e.a.b bVar;
        String str2;
        String str3;
        if (obj == this) {
            return true;
        }
        if (obj instanceof a0.e.a) {
            a0.e.a aVar = (a0.e.a) obj;
            if (this.f19859a.equals(aVar.e()) && this.f19860b.equals(aVar.h()) && ((str = this.f19861c) != null ? str.equals(aVar.d()) : aVar.d() == null) && ((bVar = this.f19862d) != null ? bVar.equals(aVar.g()) : aVar.g() == null) && ((str2 = this.f19863e) != null ? str2.equals(aVar.f()) : aVar.f() == null) && ((str3 = this.f19864f) != null ? str3.equals(aVar.b()) : aVar.b() == null)) {
                String str4 = this.f19865g;
                if (str4 == null) {
                    if (aVar.c() == null) {
                        return true;
                    }
                } else if (str4.equals(aVar.c())) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    @Override // cl.a0.e.a
    public String f() {
        return this.f19863e;
    }

    @Override // cl.a0.e.a
    public a0.e.a.b g() {
        return this.f19862d;
    }

    @Override // cl.a0.e.a
    public String h() {
        return this.f19860b;
    }

    public int hashCode() {
        int hashCode = (((this.f19859a.hashCode() ^ 1000003) * 1000003) ^ this.f19860b.hashCode()) * 1000003;
        String str = this.f19861c;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        a0.e.a.b bVar = this.f19862d;
        int hashCode3 = (hashCode2 ^ (bVar == null ? 0 : bVar.hashCode())) * 1000003;
        String str2 = this.f19863e;
        int hashCode4 = (hashCode3 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f19864f;
        int hashCode5 = (hashCode4 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.f19865g;
        return hashCode5 ^ (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        return "Application{identifier=" + this.f19859a + ", version=" + this.f19860b + ", displayVersion=" + this.f19861c + ", organization=" + this.f19862d + ", installationUuid=" + this.f19863e + ", developmentPlatform=" + this.f19864f + ", developmentPlatformVersion=" + this.f19865g + "}";
    }

    public h(String str, String str2, String str3, a0.e.a.b bVar, String str4, String str5, String str6) {
        this.f19859a = str;
        this.f19860b = str2;
        this.f19861c = str3;
        this.f19862d = bVar;
        this.f19863e = str4;
        this.f19864f = str5;
        this.f19865g = str6;
    }
}
