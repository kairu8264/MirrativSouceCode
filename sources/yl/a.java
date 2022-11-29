package yl;

import java.util.Objects;
import yl.j;

/* loaded from: classes4.dex */
public final class a extends j {

    /* renamed from: a  reason: collision with root package name */
    public final String f62046a;

    /* renamed from: b  reason: collision with root package name */
    public final long f62047b;

    /* renamed from: c  reason: collision with root package name */
    public final long f62048c;

    /* loaded from: classes4.dex */
    public static final class b extends j.a {

        /* renamed from: a  reason: collision with root package name */
        public String f62049a;

        /* renamed from: b  reason: collision with root package name */
        public Long f62050b;

        /* renamed from: c  reason: collision with root package name */
        public Long f62051c;

        @Override // yl.j.a
        public j a() {
            String str = "";
            if (this.f62049a == null) {
                str = " token";
            }
            if (this.f62050b == null) {
                str = str + " tokenExpirationTimestamp";
            }
            if (this.f62051c == null) {
                str = str + " tokenCreationTimestamp";
            }
            if (str.isEmpty()) {
                return new a(this.f62049a, this.f62050b.longValue(), this.f62051c.longValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // yl.j.a
        public j.a b(String str) {
            Objects.requireNonNull(str, "Null token");
            this.f62049a = str;
            return this;
        }

        @Override // yl.j.a
        public j.a c(long j10) {
            this.f62051c = Long.valueOf(j10);
            return this;
        }

        @Override // yl.j.a
        public j.a d(long j10) {
            this.f62050b = Long.valueOf(j10);
            return this;
        }
    }

    @Override // yl.j
    public String b() {
        return this.f62046a;
    }

    @Override // yl.j
    public long c() {
        return this.f62048c;
    }

    @Override // yl.j
    public long d() {
        return this.f62047b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof j) {
            j jVar = (j) obj;
            return this.f62046a.equals(jVar.b()) && this.f62047b == jVar.d() && this.f62048c == jVar.c();
        }
        return false;
    }

    public int hashCode() {
        long j10 = this.f62047b;
        long j11 = this.f62048c;
        return ((((this.f62046a.hashCode() ^ 1000003) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)));
    }

    public String toString() {
        return "InstallationTokenResult{token=" + this.f62046a + ", tokenExpirationTimestamp=" + this.f62047b + ", tokenCreationTimestamp=" + this.f62048c + "}";
    }

    public a(String str, long j10, long j11) {
        this.f62046a = str;
        this.f62047b = j10;
        this.f62048c = j11;
    }
}
