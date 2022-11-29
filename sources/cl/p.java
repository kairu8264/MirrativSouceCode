package cl;

import cl.a0;
import java.util.Objects;

/* loaded from: classes4.dex */
public final class p extends a0.e.d.a.b.AbstractC0165d {

    /* renamed from: a  reason: collision with root package name */
    public final String f19940a;

    /* renamed from: b  reason: collision with root package name */
    public final String f19941b;

    /* renamed from: c  reason: collision with root package name */
    public final long f19942c;

    /* loaded from: classes4.dex */
    public static final class b extends a0.e.d.a.b.AbstractC0165d.AbstractC0166a {

        /* renamed from: a  reason: collision with root package name */
        public String f19943a;

        /* renamed from: b  reason: collision with root package name */
        public String f19944b;

        /* renamed from: c  reason: collision with root package name */
        public Long f19945c;

        @Override // cl.a0.e.d.a.b.AbstractC0165d.AbstractC0166a
        public a0.e.d.a.b.AbstractC0165d a() {
            String str = "";
            if (this.f19943a == null) {
                str = " name";
            }
            if (this.f19944b == null) {
                str = str + " code";
            }
            if (this.f19945c == null) {
                str = str + " address";
            }
            if (str.isEmpty()) {
                return new p(this.f19943a, this.f19944b, this.f19945c.longValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // cl.a0.e.d.a.b.AbstractC0165d.AbstractC0166a
        public a0.e.d.a.b.AbstractC0165d.AbstractC0166a b(long j10) {
            this.f19945c = Long.valueOf(j10);
            return this;
        }

        @Override // cl.a0.e.d.a.b.AbstractC0165d.AbstractC0166a
        public a0.e.d.a.b.AbstractC0165d.AbstractC0166a c(String str) {
            Objects.requireNonNull(str, "Null code");
            this.f19944b = str;
            return this;
        }

        @Override // cl.a0.e.d.a.b.AbstractC0165d.AbstractC0166a
        public a0.e.d.a.b.AbstractC0165d.AbstractC0166a d(String str) {
            Objects.requireNonNull(str, "Null name");
            this.f19943a = str;
            return this;
        }
    }

    @Override // cl.a0.e.d.a.b.AbstractC0165d
    public long b() {
        return this.f19942c;
    }

    @Override // cl.a0.e.d.a.b.AbstractC0165d
    public String c() {
        return this.f19941b;
    }

    @Override // cl.a0.e.d.a.b.AbstractC0165d
    public String d() {
        return this.f19940a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a0.e.d.a.b.AbstractC0165d) {
            a0.e.d.a.b.AbstractC0165d abstractC0165d = (a0.e.d.a.b.AbstractC0165d) obj;
            return this.f19940a.equals(abstractC0165d.d()) && this.f19941b.equals(abstractC0165d.c()) && this.f19942c == abstractC0165d.b();
        }
        return false;
    }

    public int hashCode() {
        long j10 = this.f19942c;
        return ((((this.f19940a.hashCode() ^ 1000003) * 1000003) ^ this.f19941b.hashCode()) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public String toString() {
        return "Signal{name=" + this.f19940a + ", code=" + this.f19941b + ", address=" + this.f19942c + "}";
    }

    public p(String str, String str2, long j10) {
        this.f19940a = str;
        this.f19941b = str2;
        this.f19942c = j10;
    }
}
