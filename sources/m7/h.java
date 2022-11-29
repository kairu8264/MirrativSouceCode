package m7;

import java.security.MessageDigest;

/* loaded from: classes.dex */
public final class h implements e {

    /* renamed from: b  reason: collision with root package name */
    public final s.a<g<?>, Object> f40617b = new i8.b();

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> void f(g<T> gVar, Object obj, MessageDigest messageDigest) {
        gVar.g(obj, messageDigest);
    }

    @Override // m7.e
    public void a(MessageDigest messageDigest) {
        for (int i10 = 0; i10 < this.f40617b.size(); i10++) {
            f(this.f40617b.m(i10), this.f40617b.r(i10), messageDigest);
        }
    }

    public <T> T c(g<T> gVar) {
        return this.f40617b.containsKey(gVar) ? (T) this.f40617b.get(gVar) : gVar.c();
    }

    public void d(h hVar) {
        this.f40617b.o(hVar.f40617b);
    }

    public <T> h e(g<T> gVar, T t10) {
        this.f40617b.put(gVar, t10);
        return this;
    }

    @Override // m7.e
    public boolean equals(Object obj) {
        if (obj instanceof h) {
            return this.f40617b.equals(((h) obj).f40617b);
        }
        return false;
    }

    @Override // m7.e
    public int hashCode() {
        return this.f40617b.hashCode();
    }

    public String toString() {
        return "Options{values=" + this.f40617b + '}';
    }
}
