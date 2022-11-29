package bm;

import bm.d;

/* loaded from: classes4.dex */
public final class a extends d {

    /* renamed from: a  reason: collision with root package name */
    public final String f18521a;

    /* renamed from: b  reason: collision with root package name */
    public final String f18522b;

    /* renamed from: c  reason: collision with root package name */
    public final String f18523c;

    /* renamed from: d  reason: collision with root package name */
    public final f f18524d;

    /* renamed from: e  reason: collision with root package name */
    public final d.b f18525e;

    /* loaded from: classes4.dex */
    public static final class b extends d.a {

        /* renamed from: a  reason: collision with root package name */
        public String f18526a;

        /* renamed from: b  reason: collision with root package name */
        public String f18527b;

        /* renamed from: c  reason: collision with root package name */
        public String f18528c;

        /* renamed from: d  reason: collision with root package name */
        public f f18529d;

        /* renamed from: e  reason: collision with root package name */
        public d.b f18530e;

        @Override // bm.d.a
        public d a() {
            return new a(this.f18526a, this.f18527b, this.f18528c, this.f18529d, this.f18530e);
        }

        @Override // bm.d.a
        public d.a b(f fVar) {
            this.f18529d = fVar;
            return this;
        }

        @Override // bm.d.a
        public d.a c(String str) {
            this.f18527b = str;
            return this;
        }

        @Override // bm.d.a
        public d.a d(String str) {
            this.f18528c = str;
            return this;
        }

        @Override // bm.d.a
        public d.a e(d.b bVar) {
            this.f18530e = bVar;
            return this;
        }

        @Override // bm.d.a
        public d.a f(String str) {
            this.f18526a = str;
            return this;
        }
    }

    @Override // bm.d
    public f b() {
        return this.f18524d;
    }

    @Override // bm.d
    public String c() {
        return this.f18522b;
    }

    @Override // bm.d
    public String d() {
        return this.f18523c;
    }

    @Override // bm.d
    public d.b e() {
        return this.f18525e;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            String str = this.f18521a;
            if (str != null ? str.equals(dVar.f()) : dVar.f() == null) {
                String str2 = this.f18522b;
                if (str2 != null ? str2.equals(dVar.c()) : dVar.c() == null) {
                    String str3 = this.f18523c;
                    if (str3 != null ? str3.equals(dVar.d()) : dVar.d() == null) {
                        f fVar = this.f18524d;
                        if (fVar != null ? fVar.equals(dVar.b()) : dVar.b() == null) {
                            d.b bVar = this.f18525e;
                            if (bVar == null) {
                                if (dVar.e() == null) {
                                    return true;
                                }
                            } else if (bVar.equals(dVar.e())) {
                                return true;
                            }
                        }
                    }
                }
            }
            return false;
        }
        return false;
    }

    @Override // bm.d
    public String f() {
        return this.f18521a;
    }

    public int hashCode() {
        String str = this.f18521a;
        int hashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.f18522b;
        int hashCode2 = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f18523c;
        int hashCode3 = (hashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        f fVar = this.f18524d;
        int hashCode4 = (hashCode3 ^ (fVar == null ? 0 : fVar.hashCode())) * 1000003;
        d.b bVar = this.f18525e;
        return hashCode4 ^ (bVar != null ? bVar.hashCode() : 0);
    }

    public String toString() {
        return "InstallationResponse{uri=" + this.f18521a + ", fid=" + this.f18522b + ", refreshToken=" + this.f18523c + ", authToken=" + this.f18524d + ", responseCode=" + this.f18525e + "}";
    }

    public a(String str, String str2, String str3, f fVar, d.b bVar) {
        this.f18521a = str;
        this.f18522b = str2;
        this.f18523c = str3;
        this.f18524d = fVar;
        this.f18525e = bVar;
    }
}
