package hi;

import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class h implements q {

    /* renamed from: w  reason: collision with root package name */
    public final q f35795w;

    /* renamed from: x  reason: collision with root package name */
    public final String f35796x;

    public h() {
        throw null;
    }

    public h(String str) {
        this.f35795w = q.f35921f;
        this.f35796x = str;
    }

    public h(String str, q qVar) {
        this.f35795w = qVar;
        this.f35796x = str;
    }

    public final q a() {
        return this.f35795w;
    }

    public final String b() {
        return this.f35796x;
    }

    @Override // hi.q
    public final q d() {
        return new h(this.f35796x, this.f35795w.d());
    }

    @Override // hi.q
    public final Double e() {
        throw new IllegalStateException("Control is not a double");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            return this.f35796x.equals(hVar.f35796x) && this.f35795w.equals(hVar.f35795w);
        }
        return false;
    }

    @Override // hi.q
    public final Boolean f() {
        throw new IllegalStateException("Control is not a boolean");
    }

    @Override // hi.q
    public final String h() {
        throw new IllegalStateException("Control is not a String");
    }

    public final int hashCode() {
        return (this.f35796x.hashCode() * 31) + this.f35795w.hashCode();
    }

    @Override // hi.q
    public final Iterator<q> j() {
        return null;
    }

    @Override // hi.q
    public final q l(String str, u4 u4Var, List<q> list) {
        throw new IllegalStateException("Control does not have functions");
    }
}
