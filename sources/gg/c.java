package gg;

/* loaded from: classes3.dex */
public final class c {

    /* renamed from: c  reason: collision with root package name */
    public static final c f33561c = new a().a();

    /* renamed from: a  reason: collision with root package name */
    public final long f33562a;

    /* renamed from: b  reason: collision with root package name */
    public final b f33563b;

    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public long f33564a = 0;

        /* renamed from: b  reason: collision with root package name */
        public b f33565b = b.REASON_UNKNOWN;

        public c a() {
            return new c(this.f33564a, this.f33565b);
        }

        public a b(long j10) {
            this.f33564a = j10;
            return this;
        }

        public a c(b bVar) {
            this.f33565b = bVar;
            return this;
        }
    }

    /* loaded from: classes3.dex */
    public enum b implements tl.c {
        REASON_UNKNOWN(0),
        MESSAGE_TOO_OLD(1),
        CACHE_FULL(2),
        PAYLOAD_TOO_BIG(3),
        MAX_RETRIES_REACHED(4),
        INVALID_PAYLOD(5),
        SERVER_ERROR(6);
        
        private final int number_;

        b(int i10) {
            this.number_ = i10;
        }

        @Override // tl.c
        public int getNumber() {
            return this.number_;
        }
    }

    public c(long j10, b bVar) {
        this.f33562a = j10;
        this.f33563b = bVar;
    }

    public static a c() {
        return new a();
    }

    @tl.d(tag = 1)
    public long a() {
        return this.f33562a;
    }

    @tl.d(tag = 3)
    public b b() {
        return this.f33563b;
    }
}
