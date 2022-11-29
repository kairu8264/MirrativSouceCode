package o1;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final long f43802a;

    /* renamed from: b  reason: collision with root package name */
    public final long f43803b;

    public c(long j10, long j11) {
        this.f43802a = j10;
        this.f43803b = j11;
    }

    public /* synthetic */ c(long j10, long j11, jo.h hVar) {
        this(j10, j11);
    }

    public final long a() {
        return this.f43802a;
    }

    public final long b() {
        return this.f43803b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            return b1.f.j(this.f43802a, cVar.f43802a) && this.f43803b == cVar.f43803b;
        }
        return false;
    }

    public int hashCode() {
        return (b1.f.o(this.f43802a) * 31) + Long.hashCode(this.f43803b);
    }

    public String toString() {
        return "PointAtTime(point=" + ((Object) b1.f.t(this.f43802a)) + ", time=" + this.f43803b + ')';
    }
}
