package o7;

import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* loaded from: classes.dex */
public final class w implements m7.e {

    /* renamed from: j  reason: collision with root package name */
    public static final i8.g<Class<?>, byte[]> f44254j = new i8.g<>(50);

    /* renamed from: b  reason: collision with root package name */
    public final p7.b f44255b;

    /* renamed from: c  reason: collision with root package name */
    public final m7.e f44256c;

    /* renamed from: d  reason: collision with root package name */
    public final m7.e f44257d;

    /* renamed from: e  reason: collision with root package name */
    public final int f44258e;

    /* renamed from: f  reason: collision with root package name */
    public final int f44259f;

    /* renamed from: g  reason: collision with root package name */
    public final Class<?> f44260g;

    /* renamed from: h  reason: collision with root package name */
    public final m7.h f44261h;

    /* renamed from: i  reason: collision with root package name */
    public final m7.l<?> f44262i;

    public w(p7.b bVar, m7.e eVar, m7.e eVar2, int i10, int i11, m7.l<?> lVar, Class<?> cls, m7.h hVar) {
        this.f44255b = bVar;
        this.f44256c = eVar;
        this.f44257d = eVar2;
        this.f44258e = i10;
        this.f44259f = i11;
        this.f44262i = lVar;
        this.f44260g = cls;
        this.f44261h = hVar;
    }

    @Override // m7.e
    public void a(MessageDigest messageDigest) {
        byte[] bArr = (byte[]) this.f44255b.d(8, byte[].class);
        ByteBuffer.wrap(bArr).putInt(this.f44258e).putInt(this.f44259f).array();
        this.f44257d.a(messageDigest);
        this.f44256c.a(messageDigest);
        messageDigest.update(bArr);
        m7.l<?> lVar = this.f44262i;
        if (lVar != null) {
            lVar.a(messageDigest);
        }
        this.f44261h.a(messageDigest);
        messageDigest.update(c());
        this.f44255b.e(bArr);
    }

    public final byte[] c() {
        i8.g<Class<?>, byte[]> gVar = f44254j;
        byte[] g10 = gVar.g(this.f44260g);
        if (g10 == null) {
            byte[] bytes = this.f44260g.getName().getBytes(m7.e.f40610a);
            gVar.k(this.f44260g, bytes);
            return bytes;
        }
        return g10;
    }

    @Override // m7.e
    public boolean equals(Object obj) {
        if (obj instanceof w) {
            w wVar = (w) obj;
            return this.f44259f == wVar.f44259f && this.f44258e == wVar.f44258e && i8.k.d(this.f44262i, wVar.f44262i) && this.f44260g.equals(wVar.f44260g) && this.f44256c.equals(wVar.f44256c) && this.f44257d.equals(wVar.f44257d) && this.f44261h.equals(wVar.f44261h);
        }
        return false;
    }

    @Override // m7.e
    public int hashCode() {
        int hashCode = (((((this.f44256c.hashCode() * 31) + this.f44257d.hashCode()) * 31) + this.f44258e) * 31) + this.f44259f;
        m7.l<?> lVar = this.f44262i;
        if (lVar != null) {
            hashCode = (hashCode * 31) + lVar.hashCode();
        }
        return (((hashCode * 31) + this.f44260g.hashCode()) * 31) + this.f44261h.hashCode();
    }

    public String toString() {
        return "ResourceCacheKey{sourceKey=" + this.f44256c + ", signature=" + this.f44257d + ", width=" + this.f44258e + ", height=" + this.f44259f + ", decodedResourceClass=" + this.f44260g + ", transformation='" + this.f44262i + "', options=" + this.f44261h + '}';
    }
}
