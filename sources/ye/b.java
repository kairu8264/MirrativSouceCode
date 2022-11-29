package ye;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final int f61813a;

    /* renamed from: b  reason: collision with root package name */
    public final int f61814b;

    /* renamed from: c  reason: collision with root package name */
    public final int f61815c;

    public b(int i10, int i11, int i12) {
        this.f61813a = i10;
        this.f61814b = i11;
        this.f61815c = i12;
    }

    public final int a() {
        return this.f61815c;
    }

    public final int b() {
        return this.f61813a;
    }

    public final int c() {
        return this.f61814b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            return this.f61813a == bVar.f61813a && this.f61814b == bVar.f61814b && this.f61815c == bVar.f61815c;
        }
        return false;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.f61813a) * 31) + Integer.hashCode(this.f61814b)) * 31) + Integer.hashCode(this.f61815c);
    }

    public String toString() {
        return "NetworkBenchmark(encoderBitrate=" + this.f61813a + ", networkBitrate=" + this.f61814b + ", bufferingSize=" + this.f61815c + ')';
    }
}
