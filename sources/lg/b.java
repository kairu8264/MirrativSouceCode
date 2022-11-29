package lg;

import java.util.Objects;

/* loaded from: classes3.dex */
public final class b extends k {

    /* renamed from: a  reason: collision with root package name */
    public final long f40145a;

    /* renamed from: b  reason: collision with root package name */
    public final cg.o f40146b;

    /* renamed from: c  reason: collision with root package name */
    public final cg.i f40147c;

    public b(long j10, cg.o oVar, cg.i iVar) {
        this.f40145a = j10;
        Objects.requireNonNull(oVar, "Null transportContext");
        this.f40146b = oVar;
        Objects.requireNonNull(iVar, "Null event");
        this.f40147c = iVar;
    }

    @Override // lg.k
    public cg.i b() {
        return this.f40147c;
    }

    @Override // lg.k
    public long c() {
        return this.f40145a;
    }

    @Override // lg.k
    public cg.o d() {
        return this.f40146b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof k) {
            k kVar = (k) obj;
            return this.f40145a == kVar.c() && this.f40146b.equals(kVar.d()) && this.f40147c.equals(kVar.b());
        }
        return false;
    }

    public int hashCode() {
        long j10 = this.f40145a;
        return ((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ this.f40146b.hashCode()) * 1000003) ^ this.f40147c.hashCode();
    }

    public String toString() {
        return "PersistedEvent{id=" + this.f40145a + ", transportContext=" + this.f40146b + ", event=" + this.f40147c + "}";
    }
}
