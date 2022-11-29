package gg;

/* loaded from: classes3.dex */
public final class e {

    /* renamed from: c  reason: collision with root package name */
    public static final e f33571c = new a().a();

    /* renamed from: a  reason: collision with root package name */
    public final long f33572a;

    /* renamed from: b  reason: collision with root package name */
    public final long f33573b;

    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public long f33574a = 0;

        /* renamed from: b  reason: collision with root package name */
        public long f33575b = 0;

        public e a() {
            return new e(this.f33574a, this.f33575b);
        }

        public a b(long j10) {
            this.f33574a = j10;
            return this;
        }

        public a c(long j10) {
            this.f33575b = j10;
            return this;
        }
    }

    public e(long j10, long j11) {
        this.f33572a = j10;
        this.f33573b = j11;
    }

    public static a c() {
        return new a();
    }

    @tl.d(tag = 1)
    public long a() {
        return this.f33572a;
    }

    @tl.d(tag = 2)
    public long b() {
        return this.f33573b;
    }
}
