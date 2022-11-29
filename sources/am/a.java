package am;

import am.c;
import am.d;
import java.util.Objects;

/* loaded from: classes4.dex */
public final class a extends d {

    /* renamed from: b  reason: collision with root package name */
    public final String f13904b;

    /* renamed from: c  reason: collision with root package name */
    public final c.a f13905c;

    /* renamed from: d  reason: collision with root package name */
    public final String f13906d;

    /* renamed from: e  reason: collision with root package name */
    public final String f13907e;

    /* renamed from: f  reason: collision with root package name */
    public final long f13908f;

    /* renamed from: g  reason: collision with root package name */
    public final long f13909g;

    /* renamed from: h  reason: collision with root package name */
    public final String f13910h;

    /* loaded from: classes4.dex */
    public static final class b extends d.a {

        /* renamed from: a  reason: collision with root package name */
        public String f13911a;

        /* renamed from: b  reason: collision with root package name */
        public c.a f13912b;

        /* renamed from: c  reason: collision with root package name */
        public String f13913c;

        /* renamed from: d  reason: collision with root package name */
        public String f13914d;

        /* renamed from: e  reason: collision with root package name */
        public Long f13915e;

        /* renamed from: f  reason: collision with root package name */
        public Long f13916f;

        /* renamed from: g  reason: collision with root package name */
        public String f13917g;

        @Override // am.d.a
        public d a() {
            String str = "";
            if (this.f13912b == null) {
                str = " registrationStatus";
            }
            if (this.f13915e == null) {
                str = str + " expiresInSecs";
            }
            if (this.f13916f == null) {
                str = str + " tokenCreationEpochInSecs";
            }
            if (str.isEmpty()) {
                return new a(this.f13911a, this.f13912b, this.f13913c, this.f13914d, this.f13915e.longValue(), this.f13916f.longValue(), this.f13917g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // am.d.a
        public d.a b(String str) {
            this.f13913c = str;
            return this;
        }

        @Override // am.d.a
        public d.a c(long j10) {
            this.f13915e = Long.valueOf(j10);
            return this;
        }

        @Override // am.d.a
        public d.a d(String str) {
            this.f13911a = str;
            return this;
        }

        @Override // am.d.a
        public d.a e(String str) {
            this.f13917g = str;
            return this;
        }

        @Override // am.d.a
        public d.a f(String str) {
            this.f13914d = str;
            return this;
        }

        @Override // am.d.a
        public d.a g(c.a aVar) {
            Objects.requireNonNull(aVar, "Null registrationStatus");
            this.f13912b = aVar;
            return this;
        }

        @Override // am.d.a
        public d.a h(long j10) {
            this.f13916f = Long.valueOf(j10);
            return this;
        }

        public b() {
        }

        public b(d dVar) {
            this.f13911a = dVar.d();
            this.f13912b = dVar.g();
            this.f13913c = dVar.b();
            this.f13914d = dVar.f();
            this.f13915e = Long.valueOf(dVar.c());
            this.f13916f = Long.valueOf(dVar.h());
            this.f13917g = dVar.e();
        }
    }

    @Override // am.d
    public String b() {
        return this.f13906d;
    }

    @Override // am.d
    public long c() {
        return this.f13908f;
    }

    @Override // am.d
    public String d() {
        return this.f13904b;
    }

    @Override // am.d
    public String e() {
        return this.f13910h;
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            String str3 = this.f13904b;
            if (str3 != null ? str3.equals(dVar.d()) : dVar.d() == null) {
                if (this.f13905c.equals(dVar.g()) && ((str = this.f13906d) != null ? str.equals(dVar.b()) : dVar.b() == null) && ((str2 = this.f13907e) != null ? str2.equals(dVar.f()) : dVar.f() == null) && this.f13908f == dVar.c() && this.f13909g == dVar.h()) {
                    String str4 = this.f13910h;
                    if (str4 == null) {
                        if (dVar.e() == null) {
                            return true;
                        }
                    } else if (str4.equals(dVar.e())) {
                        return true;
                    }
                }
            }
            return false;
        }
        return false;
    }

    @Override // am.d
    public String f() {
        return this.f13907e;
    }

    @Override // am.d
    public c.a g() {
        return this.f13905c;
    }

    @Override // am.d
    public long h() {
        return this.f13909g;
    }

    public int hashCode() {
        String str = this.f13904b;
        int hashCode = ((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.f13905c.hashCode()) * 1000003;
        String str2 = this.f13906d;
        int hashCode2 = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f13907e;
        int hashCode3 = str3 == null ? 0 : str3.hashCode();
        long j10 = this.f13908f;
        long j11 = this.f13909g;
        int i10 = (((((hashCode2 ^ hashCode3) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003;
        String str4 = this.f13910h;
        return i10 ^ (str4 != null ? str4.hashCode() : 0);
    }

    @Override // am.d
    public d.a n() {
        return new b(this);
    }

    public String toString() {
        return "PersistedInstallationEntry{firebaseInstallationId=" + this.f13904b + ", registrationStatus=" + this.f13905c + ", authToken=" + this.f13906d + ", refreshToken=" + this.f13907e + ", expiresInSecs=" + this.f13908f + ", tokenCreationEpochInSecs=" + this.f13909g + ", fisError=" + this.f13910h + "}";
    }

    public a(String str, c.a aVar, String str2, String str3, long j10, long j11, String str4) {
        this.f13904b = str;
        this.f13905c = aVar;
        this.f13906d = str2;
        this.f13907e = str3;
        this.f13908f = j10;
        this.f13909g = j11;
        this.f13910h = str4;
    }
}
