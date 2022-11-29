package dg;

import dg.g;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class b extends g {

    /* renamed from: a  reason: collision with root package name */
    public final g.a f29613a;

    /* renamed from: b  reason: collision with root package name */
    public final long f29614b;

    public b(g.a aVar, long j10) {
        Objects.requireNonNull(aVar, "Null status");
        this.f29613a = aVar;
        this.f29614b = j10;
    }

    @Override // dg.g
    public long b() {
        return this.f29614b;
    }

    @Override // dg.g
    public g.a c() {
        return this.f29613a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof g) {
            g gVar = (g) obj;
            return this.f29613a.equals(gVar.c()) && this.f29614b == gVar.b();
        }
        return false;
    }

    public int hashCode() {
        long j10 = this.f29614b;
        return ((this.f29613a.hashCode() ^ 1000003) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public String toString() {
        return "BackendResponse{status=" + this.f29613a + ", nextRequestWaitMillis=" + this.f29614b + "}";
    }
}
