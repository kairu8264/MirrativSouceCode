package m7;

import java.security.MessageDigest;

/* loaded from: classes.dex */
public final class g<T> {

    /* renamed from: e  reason: collision with root package name */
    public static final b<Object> f40612e = new a();

    /* renamed from: a  reason: collision with root package name */
    public final T f40613a;

    /* renamed from: b  reason: collision with root package name */
    public final b<T> f40614b;

    /* renamed from: c  reason: collision with root package name */
    public final String f40615c;

    /* renamed from: d  reason: collision with root package name */
    public volatile byte[] f40616d;

    /* loaded from: classes.dex */
    public class a implements b<Object> {
        @Override // m7.g.b
        public void a(byte[] bArr, Object obj, MessageDigest messageDigest) {
        }
    }

    /* loaded from: classes.dex */
    public interface b<T> {
        void a(byte[] bArr, T t10, MessageDigest messageDigest);
    }

    public g(String str, T t10, b<T> bVar) {
        this.f40615c = i8.j.b(str);
        this.f40613a = t10;
        this.f40614b = (b) i8.j.d(bVar);
    }

    public static <T> g<T> a(String str, T t10, b<T> bVar) {
        return new g<>(str, t10, bVar);
    }

    public static <T> b<T> b() {
        return (b<T>) f40612e;
    }

    public static <T> g<T> e(String str) {
        return new g<>(str, null, b());
    }

    public static <T> g<T> f(String str, T t10) {
        return new g<>(str, t10, b());
    }

    public T c() {
        return this.f40613a;
    }

    public final byte[] d() {
        if (this.f40616d == null) {
            this.f40616d = this.f40615c.getBytes(e.f40610a);
        }
        return this.f40616d;
    }

    public boolean equals(Object obj) {
        if (obj instanceof g) {
            return this.f40615c.equals(((g) obj).f40615c);
        }
        return false;
    }

    public void g(T t10, MessageDigest messageDigest) {
        this.f40614b.a(d(), t10, messageDigest);
    }

    public int hashCode() {
        return this.f40615c.hashCode();
    }

    public String toString() {
        return "Option{key='" + this.f40615c + "'}";
    }
}
