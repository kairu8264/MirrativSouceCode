package vm;

/* loaded from: classes4.dex */
public class g {

    /* renamed from: a  reason: collision with root package name */
    public final long f57510a;

    /* renamed from: b  reason: collision with root package name */
    public final long f57511b;

    /* loaded from: classes4.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public long f57512a = 60;

        /* renamed from: b  reason: collision with root package name */
        public long f57513b = com.google.firebase.remoteconfig.internal.b.f28040j;

        public g c() {
            return new g(this);
        }

        public b d(long j10) throws IllegalArgumentException {
            if (j10 >= 0) {
                this.f57512a = j10;
                return this;
            }
            throw new IllegalArgumentException(String.format("Fetch connection timeout has to be a non-negative number. %d is an invalid argument", Long.valueOf(j10)));
        }

        public b e(long j10) {
            if (j10 >= 0) {
                this.f57513b = j10;
                return this;
            }
            throw new IllegalArgumentException("Minimum interval between fetches has to be a non-negative number. " + j10 + " is an invalid argument");
        }
    }

    public g(b bVar) {
        this.f57510a = bVar.f57512a;
        this.f57511b = bVar.f57513b;
    }
}
