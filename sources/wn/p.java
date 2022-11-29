package wn;

import java.io.Serializable;

/* loaded from: classes4.dex */
public final class p<A, B, C> implements Serializable {

    /* renamed from: w  reason: collision with root package name */
    public final A f59233w;

    /* renamed from: x  reason: collision with root package name */
    public final B f59234x;

    /* renamed from: y  reason: collision with root package name */
    public final C f59235y;

    public p(A a10, B b10, C c10) {
        this.f59233w = a10;
        this.f59234x = b10;
        this.f59235y = c10;
    }

    public final A a() {
        return this.f59233w;
    }

    public final B b() {
        return this.f59234x;
    }

    public final C c() {
        return this.f59235y;
    }

    public final A d() {
        return this.f59233w;
    }

    public final B e() {
        return this.f59234x;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof p) {
            p pVar = (p) obj;
            return jo.p.c(this.f59233w, pVar.f59233w) && jo.p.c(this.f59234x, pVar.f59234x) && jo.p.c(this.f59235y, pVar.f59235y);
        }
        return false;
    }

    public final C f() {
        return this.f59235y;
    }

    public int hashCode() {
        A a10 = this.f59233w;
        int hashCode = (a10 == null ? 0 : a10.hashCode()) * 31;
        B b10 = this.f59234x;
        int hashCode2 = (hashCode + (b10 == null ? 0 : b10.hashCode())) * 31;
        C c10 = this.f59235y;
        return hashCode2 + (c10 != null ? c10.hashCode() : 0);
    }

    public String toString() {
        return '(' + this.f59233w + ", " + this.f59234x + ", " + this.f59235y + ')';
    }
}
