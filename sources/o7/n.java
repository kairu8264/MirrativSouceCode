package o7;

import java.security.MessageDigest;
import java.util.Map;

/* loaded from: classes.dex */
public class n implements m7.e {

    /* renamed from: b  reason: collision with root package name */
    public final Object f44227b;

    /* renamed from: c  reason: collision with root package name */
    public final int f44228c;

    /* renamed from: d  reason: collision with root package name */
    public final int f44229d;

    /* renamed from: e  reason: collision with root package name */
    public final Class<?> f44230e;

    /* renamed from: f  reason: collision with root package name */
    public final Class<?> f44231f;

    /* renamed from: g  reason: collision with root package name */
    public final m7.e f44232g;

    /* renamed from: h  reason: collision with root package name */
    public final Map<Class<?>, m7.l<?>> f44233h;

    /* renamed from: i  reason: collision with root package name */
    public final m7.h f44234i;

    /* renamed from: j  reason: collision with root package name */
    public int f44235j;

    public n(Object obj, m7.e eVar, int i10, int i11, Map<Class<?>, m7.l<?>> map, Class<?> cls, Class<?> cls2, m7.h hVar) {
        this.f44227b = i8.j.d(obj);
        this.f44232g = (m7.e) i8.j.e(eVar, "Signature must not be null");
        this.f44228c = i10;
        this.f44229d = i11;
        this.f44233h = (Map) i8.j.d(map);
        this.f44230e = (Class) i8.j.e(cls, "Resource class must not be null");
        this.f44231f = (Class) i8.j.e(cls2, "Transcode class must not be null");
        this.f44234i = (m7.h) i8.j.d(hVar);
    }

    @Override // m7.e
    public void a(MessageDigest messageDigest) {
        throw new UnsupportedOperationException();
    }

    @Override // m7.e
    public boolean equals(Object obj) {
        if (obj instanceof n) {
            n nVar = (n) obj;
            return this.f44227b.equals(nVar.f44227b) && this.f44232g.equals(nVar.f44232g) && this.f44229d == nVar.f44229d && this.f44228c == nVar.f44228c && this.f44233h.equals(nVar.f44233h) && this.f44230e.equals(nVar.f44230e) && this.f44231f.equals(nVar.f44231f) && this.f44234i.equals(nVar.f44234i);
        }
        return false;
    }

    @Override // m7.e
    public int hashCode() {
        if (this.f44235j == 0) {
            int hashCode = this.f44227b.hashCode();
            this.f44235j = hashCode;
            int hashCode2 = (hashCode * 31) + this.f44232g.hashCode();
            this.f44235j = hashCode2;
            int i10 = (hashCode2 * 31) + this.f44228c;
            this.f44235j = i10;
            int i11 = (i10 * 31) + this.f44229d;
            this.f44235j = i11;
            int hashCode3 = (i11 * 31) + this.f44233h.hashCode();
            this.f44235j = hashCode3;
            int hashCode4 = (hashCode3 * 31) + this.f44230e.hashCode();
            this.f44235j = hashCode4;
            int hashCode5 = (hashCode4 * 31) + this.f44231f.hashCode();
            this.f44235j = hashCode5;
            this.f44235j = (hashCode5 * 31) + this.f44234i.hashCode();
        }
        return this.f44235j;
    }

    public String toString() {
        return "EngineKey{model=" + this.f44227b + ", width=" + this.f44228c + ", height=" + this.f44229d + ", resourceClass=" + this.f44230e + ", transcodeClass=" + this.f44231f + ", signature=" + this.f44232g + ", hashCode=" + this.f44235j + ", transformations=" + this.f44233h + ", options=" + this.f44234i + '}';
    }
}
