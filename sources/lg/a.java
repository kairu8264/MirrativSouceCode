package lg;

import lg.e;

/* loaded from: classes3.dex */
public final class a extends e {

    /* renamed from: b  reason: collision with root package name */
    public final long f40134b;

    /* renamed from: c  reason: collision with root package name */
    public final int f40135c;

    /* renamed from: d  reason: collision with root package name */
    public final int f40136d;

    /* renamed from: e  reason: collision with root package name */
    public final long f40137e;

    /* renamed from: f  reason: collision with root package name */
    public final int f40138f;

    /* loaded from: classes3.dex */
    public static final class b extends e.a {

        /* renamed from: a  reason: collision with root package name */
        public Long f40139a;

        /* renamed from: b  reason: collision with root package name */
        public Integer f40140b;

        /* renamed from: c  reason: collision with root package name */
        public Integer f40141c;

        /* renamed from: d  reason: collision with root package name */
        public Long f40142d;

        /* renamed from: e  reason: collision with root package name */
        public Integer f40143e;

        @Override // lg.e.a
        public e a() {
            String str = "";
            if (this.f40139a == null) {
                str = " maxStorageSizeInBytes";
            }
            if (this.f40140b == null) {
                str = str + " loadBatchSize";
            }
            if (this.f40141c == null) {
                str = str + " criticalSectionEnterTimeoutMs";
            }
            if (this.f40142d == null) {
                str = str + " eventCleanUpAge";
            }
            if (this.f40143e == null) {
                str = str + " maxBlobByteSizePerRow";
            }
            if (str.isEmpty()) {
                return new a(this.f40139a.longValue(), this.f40140b.intValue(), this.f40141c.intValue(), this.f40142d.longValue(), this.f40143e.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // lg.e.a
        public e.a b(int i10) {
            this.f40141c = Integer.valueOf(i10);
            return this;
        }

        @Override // lg.e.a
        public e.a c(long j10) {
            this.f40142d = Long.valueOf(j10);
            return this;
        }

        @Override // lg.e.a
        public e.a d(int i10) {
            this.f40140b = Integer.valueOf(i10);
            return this;
        }

        @Override // lg.e.a
        public e.a e(int i10) {
            this.f40143e = Integer.valueOf(i10);
            return this;
        }

        @Override // lg.e.a
        public e.a f(long j10) {
            this.f40139a = Long.valueOf(j10);
            return this;
        }
    }

    @Override // lg.e
    public int b() {
        return this.f40136d;
    }

    @Override // lg.e
    public long c() {
        return this.f40137e;
    }

    @Override // lg.e
    public int d() {
        return this.f40135c;
    }

    @Override // lg.e
    public int e() {
        return this.f40138f;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof e) {
            e eVar = (e) obj;
            return this.f40134b == eVar.f() && this.f40135c == eVar.d() && this.f40136d == eVar.b() && this.f40137e == eVar.c() && this.f40138f == eVar.e();
        }
        return false;
    }

    @Override // lg.e
    public long f() {
        return this.f40134b;
    }

    public int hashCode() {
        long j10 = this.f40134b;
        long j11 = this.f40137e;
        return ((((((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ this.f40135c) * 1000003) ^ this.f40136d) * 1000003) ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003) ^ this.f40138f;
    }

    public String toString() {
        return "EventStoreConfig{maxStorageSizeInBytes=" + this.f40134b + ", loadBatchSize=" + this.f40135c + ", criticalSectionEnterTimeoutMs=" + this.f40136d + ", eventCleanUpAge=" + this.f40137e + ", maxBlobByteSizePerRow=" + this.f40138f + "}";
    }

    public a(long j10, int i10, int i11, long j11, int i12) {
        this.f40134b = j10;
        this.f40135c = i10;
        this.f40136d = i11;
        this.f40137e = j11;
        this.f40138f = i12;
    }
}
