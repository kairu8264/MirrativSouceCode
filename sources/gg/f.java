package gg;

/* loaded from: classes3.dex */
public final class f {

    /* renamed from: c  reason: collision with root package name */
    public static final f f33576c = new a().a();

    /* renamed from: a  reason: collision with root package name */
    public final long f33577a;

    /* renamed from: b  reason: collision with root package name */
    public final long f33578b;

    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public long f33579a = 0;

        /* renamed from: b  reason: collision with root package name */
        public long f33580b = 0;

        public f a() {
            return new f(this.f33579a, this.f33580b);
        }

        public a b(long j10) {
            this.f33580b = j10;
            return this;
        }

        public a c(long j10) {
            this.f33579a = j10;
            return this;
        }
    }

    public f(long j10, long j11) {
        this.f33577a = j10;
        this.f33578b = j11;
    }

    public static a c() {
        return new a();
    }

    @tl.d(tag = 2)
    public long a() {
        return this.f33578b;
    }

    @tl.d(tag = 1)
    public long b() {
        return this.f33577a;
    }
}
