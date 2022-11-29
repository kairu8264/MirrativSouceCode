package cl;

import cl.a0;
import java.util.Objects;

/* loaded from: classes4.dex */
public final class b extends a0 {

    /* renamed from: b  reason: collision with root package name */
    public final String f19792b;

    /* renamed from: c  reason: collision with root package name */
    public final String f19793c;

    /* renamed from: d  reason: collision with root package name */
    public final int f19794d;

    /* renamed from: e  reason: collision with root package name */
    public final String f19795e;

    /* renamed from: f  reason: collision with root package name */
    public final String f19796f;

    /* renamed from: g  reason: collision with root package name */
    public final String f19797g;

    /* renamed from: h  reason: collision with root package name */
    public final a0.e f19798h;

    /* renamed from: i  reason: collision with root package name */
    public final a0.d f19799i;

    /* renamed from: cl.b$b  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0173b extends a0.b {

        /* renamed from: a  reason: collision with root package name */
        public String f19800a;

        /* renamed from: b  reason: collision with root package name */
        public String f19801b;

        /* renamed from: c  reason: collision with root package name */
        public Integer f19802c;

        /* renamed from: d  reason: collision with root package name */
        public String f19803d;

        /* renamed from: e  reason: collision with root package name */
        public String f19804e;

        /* renamed from: f  reason: collision with root package name */
        public String f19805f;

        /* renamed from: g  reason: collision with root package name */
        public a0.e f19806g;

        /* renamed from: h  reason: collision with root package name */
        public a0.d f19807h;

        @Override // cl.a0.b
        public a0 a() {
            String str = "";
            if (this.f19800a == null) {
                str = " sdkVersion";
            }
            if (this.f19801b == null) {
                str = str + " gmpAppId";
            }
            if (this.f19802c == null) {
                str = str + " platform";
            }
            if (this.f19803d == null) {
                str = str + " installationUuid";
            }
            if (this.f19804e == null) {
                str = str + " buildVersion";
            }
            if (this.f19805f == null) {
                str = str + " displayVersion";
            }
            if (str.isEmpty()) {
                return new b(this.f19800a, this.f19801b, this.f19802c.intValue(), this.f19803d, this.f19804e, this.f19805f, this.f19806g, this.f19807h);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // cl.a0.b
        public a0.b b(String str) {
            Objects.requireNonNull(str, "Null buildVersion");
            this.f19804e = str;
            return this;
        }

        @Override // cl.a0.b
        public a0.b c(String str) {
            Objects.requireNonNull(str, "Null displayVersion");
            this.f19805f = str;
            return this;
        }

        @Override // cl.a0.b
        public a0.b d(String str) {
            Objects.requireNonNull(str, "Null gmpAppId");
            this.f19801b = str;
            return this;
        }

        @Override // cl.a0.b
        public a0.b e(String str) {
            Objects.requireNonNull(str, "Null installationUuid");
            this.f19803d = str;
            return this;
        }

        @Override // cl.a0.b
        public a0.b f(a0.d dVar) {
            this.f19807h = dVar;
            return this;
        }

        @Override // cl.a0.b
        public a0.b g(int i10) {
            this.f19802c = Integer.valueOf(i10);
            return this;
        }

        @Override // cl.a0.b
        public a0.b h(String str) {
            Objects.requireNonNull(str, "Null sdkVersion");
            this.f19800a = str;
            return this;
        }

        @Override // cl.a0.b
        public a0.b i(a0.e eVar) {
            this.f19806g = eVar;
            return this;
        }

        public C0173b() {
        }

        public C0173b(a0 a0Var) {
            this.f19800a = a0Var.i();
            this.f19801b = a0Var.e();
            this.f19802c = Integer.valueOf(a0Var.h());
            this.f19803d = a0Var.f();
            this.f19804e = a0Var.c();
            this.f19805f = a0Var.d();
            this.f19806g = a0Var.j();
            this.f19807h = a0Var.g();
        }
    }

    @Override // cl.a0
    public String c() {
        return this.f19796f;
    }

    @Override // cl.a0
    public String d() {
        return this.f19797g;
    }

    @Override // cl.a0
    public String e() {
        return this.f19793c;
    }

    public boolean equals(Object obj) {
        a0.e eVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof a0) {
            a0 a0Var = (a0) obj;
            if (this.f19792b.equals(a0Var.i()) && this.f19793c.equals(a0Var.e()) && this.f19794d == a0Var.h() && this.f19795e.equals(a0Var.f()) && this.f19796f.equals(a0Var.c()) && this.f19797g.equals(a0Var.d()) && ((eVar = this.f19798h) != null ? eVar.equals(a0Var.j()) : a0Var.j() == null)) {
                a0.d dVar = this.f19799i;
                if (dVar == null) {
                    if (a0Var.g() == null) {
                        return true;
                    }
                } else if (dVar.equals(a0Var.g())) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    @Override // cl.a0
    public String f() {
        return this.f19795e;
    }

    @Override // cl.a0
    public a0.d g() {
        return this.f19799i;
    }

    @Override // cl.a0
    public int h() {
        return this.f19794d;
    }

    public int hashCode() {
        int hashCode = (((((((((((this.f19792b.hashCode() ^ 1000003) * 1000003) ^ this.f19793c.hashCode()) * 1000003) ^ this.f19794d) * 1000003) ^ this.f19795e.hashCode()) * 1000003) ^ this.f19796f.hashCode()) * 1000003) ^ this.f19797g.hashCode()) * 1000003;
        a0.e eVar = this.f19798h;
        int hashCode2 = (hashCode ^ (eVar == null ? 0 : eVar.hashCode())) * 1000003;
        a0.d dVar = this.f19799i;
        return hashCode2 ^ (dVar != null ? dVar.hashCode() : 0);
    }

    @Override // cl.a0
    public String i() {
        return this.f19792b;
    }

    @Override // cl.a0
    public a0.e j() {
        return this.f19798h;
    }

    @Override // cl.a0
    public a0.b k() {
        return new C0173b(this);
    }

    public String toString() {
        return "CrashlyticsReport{sdkVersion=" + this.f19792b + ", gmpAppId=" + this.f19793c + ", platform=" + this.f19794d + ", installationUuid=" + this.f19795e + ", buildVersion=" + this.f19796f + ", displayVersion=" + this.f19797g + ", session=" + this.f19798h + ", ndkPayload=" + this.f19799i + "}";
    }

    public b(String str, String str2, int i10, String str3, String str4, String str5, a0.e eVar, a0.d dVar) {
        this.f19792b = str;
        this.f19793c = str2;
        this.f19794d = i10;
        this.f19795e = str3;
        this.f19796f = str4;
        this.f19797g = str5;
        this.f19798h = eVar;
        this.f19799i = dVar;
    }
}
