package bm;

import bm.f;

/* loaded from: classes4.dex */
public final class b extends f {

    /* renamed from: a  reason: collision with root package name */
    public final String f18531a;

    /* renamed from: b  reason: collision with root package name */
    public final long f18532b;

    /* renamed from: c  reason: collision with root package name */
    public final f.b f18533c;

    /* renamed from: bm.b$b  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0131b extends f.a {

        /* renamed from: a  reason: collision with root package name */
        public String f18534a;

        /* renamed from: b  reason: collision with root package name */
        public Long f18535b;

        /* renamed from: c  reason: collision with root package name */
        public f.b f18536c;

        @Override // bm.f.a
        public f a() {
            String str = "";
            if (this.f18535b == null) {
                str = " tokenExpirationTimestamp";
            }
            if (str.isEmpty()) {
                return new b(this.f18534a, this.f18535b.longValue(), this.f18536c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // bm.f.a
        public f.a b(f.b bVar) {
            this.f18536c = bVar;
            return this;
        }

        @Override // bm.f.a
        public f.a c(String str) {
            this.f18534a = str;
            return this;
        }

        @Override // bm.f.a
        public f.a d(long j10) {
            this.f18535b = Long.valueOf(j10);
            return this;
        }
    }

    @Override // bm.f
    public f.b b() {
        return this.f18533c;
    }

    @Override // bm.f
    public String c() {
        return this.f18531a;
    }

    @Override // bm.f
    public long d() {
        return this.f18532b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            String str = this.f18531a;
            if (str != null ? str.equals(fVar.c()) : fVar.c() == null) {
                if (this.f18532b == fVar.d()) {
                    f.b bVar = this.f18533c;
                    if (bVar == null) {
                        if (fVar.b() == null) {
                            return true;
                        }
                    } else if (bVar.equals(fVar.b())) {
                        return true;
                    }
                }
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        String str = this.f18531a;
        int hashCode = str == null ? 0 : str.hashCode();
        long j10 = this.f18532b;
        int i10 = (((hashCode ^ 1000003) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        f.b bVar = this.f18533c;
        return i10 ^ (bVar != null ? bVar.hashCode() : 0);
    }

    public String toString() {
        return "TokenResult{token=" + this.f18531a + ", tokenExpirationTimestamp=" + this.f18532b + ", responseCode=" + this.f18533c + "}";
    }

    public b(String str, long j10, f.b bVar) {
        this.f18531a = str;
        this.f18532b = j10;
        this.f18533c = bVar;
    }
}
