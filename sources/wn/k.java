package wn;

import java.io.Serializable;

/* loaded from: classes4.dex */
public final class k<A, B> implements Serializable {

    /* renamed from: w  reason: collision with root package name */
    public final A f59222w;

    /* renamed from: x  reason: collision with root package name */
    public final B f59223x;

    public k(A a10, B b10) {
        this.f59222w = a10;
        this.f59223x = b10;
    }

    public final A a() {
        return this.f59222w;
    }

    public final B b() {
        return this.f59223x;
    }

    public final A c() {
        return this.f59222w;
    }

    public final B d() {
        return this.f59223x;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof k) {
            k kVar = (k) obj;
            return jo.p.c(this.f59222w, kVar.f59222w) && jo.p.c(this.f59223x, kVar.f59223x);
        }
        return false;
    }

    public int hashCode() {
        A a10 = this.f59222w;
        int hashCode = (a10 == null ? 0 : a10.hashCode()) * 31;
        B b10 = this.f59223x;
        return hashCode + (b10 != null ? b10.hashCode() : 0);
    }

    public String toString() {
        return '(' + this.f59222w + ", " + this.f59223x + ')';
    }
}
