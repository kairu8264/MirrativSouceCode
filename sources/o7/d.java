package o7;

import java.security.MessageDigest;

/* loaded from: classes.dex */
public final class d implements m7.e {

    /* renamed from: b  reason: collision with root package name */
    public final m7.e f44140b;

    /* renamed from: c  reason: collision with root package name */
    public final m7.e f44141c;

    public d(m7.e eVar, m7.e eVar2) {
        this.f44140b = eVar;
        this.f44141c = eVar2;
    }

    @Override // m7.e
    public void a(MessageDigest messageDigest) {
        this.f44140b.a(messageDigest);
        this.f44141c.a(messageDigest);
    }

    @Override // m7.e
    public boolean equals(Object obj) {
        if (obj instanceof d) {
            d dVar = (d) obj;
            return this.f44140b.equals(dVar.f44140b) && this.f44141c.equals(dVar.f44141c);
        }
        return false;
    }

    @Override // m7.e
    public int hashCode() {
        return (this.f44140b.hashCode() * 31) + this.f44141c.hashCode();
    }

    public String toString() {
        return "DataCacheKey{sourceKey=" + this.f44140b + ", signature=" + this.f44141c + '}';
    }
}
