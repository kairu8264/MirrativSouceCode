package bg;

/* loaded from: classes3.dex */
public final class h extends n {

    /* renamed from: a  reason: collision with root package name */
    public final long f18454a;

    public h(long j10) {
        this.f18454a = j10;
    }

    @Override // bg.n
    public long c() {
        return this.f18454a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof n) && this.f18454a == ((n) obj).c();
    }

    public int hashCode() {
        long j10 = this.f18454a;
        return ((int) (j10 ^ (j10 >>> 32))) ^ 1000003;
    }

    public String toString() {
        return "LogResponse{nextRequestWaitMillis=" + this.f18454a + "}";
    }
}
