package cl;

import cl.a0;
import java.util.Objects;

/* loaded from: classes4.dex */
public final class n extends a0.e.d.a.b.AbstractC0161a {

    /* renamed from: a  reason: collision with root package name */
    public final long f19922a;

    /* renamed from: b  reason: collision with root package name */
    public final long f19923b;

    /* renamed from: c  reason: collision with root package name */
    public final String f19924c;

    /* renamed from: d  reason: collision with root package name */
    public final String f19925d;

    /* loaded from: classes4.dex */
    public static final class b extends a0.e.d.a.b.AbstractC0161a.AbstractC0162a {

        /* renamed from: a  reason: collision with root package name */
        public Long f19926a;

        /* renamed from: b  reason: collision with root package name */
        public Long f19927b;

        /* renamed from: c  reason: collision with root package name */
        public String f19928c;

        /* renamed from: d  reason: collision with root package name */
        public String f19929d;

        @Override // cl.a0.e.d.a.b.AbstractC0161a.AbstractC0162a
        public a0.e.d.a.b.AbstractC0161a a() {
            String str = "";
            if (this.f19926a == null) {
                str = " baseAddress";
            }
            if (this.f19927b == null) {
                str = str + " size";
            }
            if (this.f19928c == null) {
                str = str + " name";
            }
            if (str.isEmpty()) {
                return new n(this.f19926a.longValue(), this.f19927b.longValue(), this.f19928c, this.f19929d);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // cl.a0.e.d.a.b.AbstractC0161a.AbstractC0162a
        public a0.e.d.a.b.AbstractC0161a.AbstractC0162a b(long j10) {
            this.f19926a = Long.valueOf(j10);
            return this;
        }

        @Override // cl.a0.e.d.a.b.AbstractC0161a.AbstractC0162a
        public a0.e.d.a.b.AbstractC0161a.AbstractC0162a c(String str) {
            Objects.requireNonNull(str, "Null name");
            this.f19928c = str;
            return this;
        }

        @Override // cl.a0.e.d.a.b.AbstractC0161a.AbstractC0162a
        public a0.e.d.a.b.AbstractC0161a.AbstractC0162a d(long j10) {
            this.f19927b = Long.valueOf(j10);
            return this;
        }

        @Override // cl.a0.e.d.a.b.AbstractC0161a.AbstractC0162a
        public a0.e.d.a.b.AbstractC0161a.AbstractC0162a e(String str) {
            this.f19929d = str;
            return this;
        }
    }

    @Override // cl.a0.e.d.a.b.AbstractC0161a
    public long b() {
        return this.f19922a;
    }

    @Override // cl.a0.e.d.a.b.AbstractC0161a
    public String c() {
        return this.f19924c;
    }

    @Override // cl.a0.e.d.a.b.AbstractC0161a
    public long d() {
        return this.f19923b;
    }

    @Override // cl.a0.e.d.a.b.AbstractC0161a
    public String e() {
        return this.f19925d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a0.e.d.a.b.AbstractC0161a) {
            a0.e.d.a.b.AbstractC0161a abstractC0161a = (a0.e.d.a.b.AbstractC0161a) obj;
            if (this.f19922a == abstractC0161a.b() && this.f19923b == abstractC0161a.d() && this.f19924c.equals(abstractC0161a.c())) {
                String str = this.f19925d;
                if (str == null) {
                    if (abstractC0161a.e() == null) {
                        return true;
                    }
                } else if (str.equals(abstractC0161a.e())) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        long j10 = this.f19922a;
        long j11 = this.f19923b;
        int hashCode = (((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003) ^ this.f19924c.hashCode()) * 1000003;
        String str = this.f19925d;
        return hashCode ^ (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "BinaryImage{baseAddress=" + this.f19922a + ", size=" + this.f19923b + ", name=" + this.f19924c + ", uuid=" + this.f19925d + "}";
    }

    public n(long j10, long j11, String str, String str2) {
        this.f19922a = j10;
        this.f19923b = j11;
        this.f19924c = str;
        this.f19925d = str2;
    }
}
