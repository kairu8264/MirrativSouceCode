package cg;

import java.util.Set;

/* loaded from: classes3.dex */
public final class p implements zf.g {

    /* renamed from: a  reason: collision with root package name */
    public final Set<zf.b> f19621a;

    /* renamed from: b  reason: collision with root package name */
    public final o f19622b;

    /* renamed from: c  reason: collision with root package name */
    public final s f19623c;

    public p(Set<zf.b> set, o oVar, s sVar) {
        this.f19621a = set;
        this.f19622b = oVar;
        this.f19623c = sVar;
    }

    @Override // zf.g
    public <T> zf.f<T> a(String str, Class<T> cls, zf.b bVar, zf.e<T, byte[]> eVar) {
        if (this.f19621a.contains(bVar)) {
            return new r(this.f19622b, str, bVar, eVar, this.f19623c);
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", bVar, this.f19621a));
    }
}
