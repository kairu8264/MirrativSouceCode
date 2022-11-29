package kg;

import java.util.Objects;
import java.util.Set;
import kg.g;

/* loaded from: classes3.dex */
public final class d extends g.b {

    /* renamed from: a  reason: collision with root package name */
    public final long f38747a;

    /* renamed from: b  reason: collision with root package name */
    public final long f38748b;

    /* renamed from: c  reason: collision with root package name */
    public final Set<g.c> f38749c;

    /* loaded from: classes3.dex */
    public static final class b extends g.b.a {

        /* renamed from: a  reason: collision with root package name */
        public Long f38750a;

        /* renamed from: b  reason: collision with root package name */
        public Long f38751b;

        /* renamed from: c  reason: collision with root package name */
        public Set<g.c> f38752c;

        @Override // kg.g.b.a
        public g.b a() {
            String str = "";
            if (this.f38750a == null) {
                str = " delta";
            }
            if (this.f38751b == null) {
                str = str + " maxAllowedDelay";
            }
            if (this.f38752c == null) {
                str = str + " flags";
            }
            if (str.isEmpty()) {
                return new d(this.f38750a.longValue(), this.f38751b.longValue(), this.f38752c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // kg.g.b.a
        public g.b.a b(long j10) {
            this.f38750a = Long.valueOf(j10);
            return this;
        }

        @Override // kg.g.b.a
        public g.b.a c(Set<g.c> set) {
            Objects.requireNonNull(set, "Null flags");
            this.f38752c = set;
            return this;
        }

        @Override // kg.g.b.a
        public g.b.a d(long j10) {
            this.f38751b = Long.valueOf(j10);
            return this;
        }
    }

    @Override // kg.g.b
    public long b() {
        return this.f38747a;
    }

    @Override // kg.g.b
    public Set<g.c> c() {
        return this.f38749c;
    }

    @Override // kg.g.b
    public long d() {
        return this.f38748b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof g.b) {
            g.b bVar = (g.b) obj;
            return this.f38747a == bVar.b() && this.f38748b == bVar.d() && this.f38749c.equals(bVar.c());
        }
        return false;
    }

    public int hashCode() {
        long j10 = this.f38747a;
        long j11 = this.f38748b;
        return ((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003) ^ this.f38749c.hashCode();
    }

    public String toString() {
        return "ConfigValue{delta=" + this.f38747a + ", maxAllowedDelay=" + this.f38748b + ", flags=" + this.f38749c + "}";
    }

    public d(long j10, long j11, Set<g.c> set) {
        this.f38747a = j10;
        this.f38748b = j11;
        this.f38749c = set;
    }
}
