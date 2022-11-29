package jf;

import java.io.Serializable;
import java.util.List;

/* loaded from: classes2.dex */
public final class f implements Serializable {

    /* renamed from: w  reason: collision with root package name */
    public final int f37925w;

    /* renamed from: x  reason: collision with root package name */
    public final int f37926x;

    public f(int i10, int i11) {
        this.f37925w = i10;
        this.f37926x = i11;
    }

    public final f a(List<q> list) {
        jo.p.h(list, "gifts");
        f fVar = this;
        for (q qVar : list) {
            fVar = fVar.b(qVar.s(), qVar.e() * qVar.p());
        }
        return fVar;
    }

    public final f b(boolean z10, int i10) {
        int i11;
        if (z10) {
            return new f(this.f37925w, this.f37926x - i10);
        }
        int i12 = this.f37925w - i10;
        int d10 = po.n.d(0, i12);
        if (i12 > 0) {
            i11 = this.f37926x;
        } else {
            i11 = i12 + this.f37926x;
        }
        return new f(d10, i11);
    }

    public final int c() {
        return this.f37925w;
    }

    public final int d() {
        return this.f37926x;
    }

    public final int e() {
        return this.f37925w + this.f37926x;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            return this.f37925w == fVar.f37925w && this.f37926x == fVar.f37926x;
        }
        return false;
    }

    public final boolean f(boolean z10, int i10) {
        return z10 ? i10 <= this.f37926x : i10 <= e();
    }

    public int hashCode() {
        return (Integer.hashCode(this.f37925w) * 31) + Integer.hashCode(this.f37926x);
    }

    public String toString() {
        return "Coin(free=" + this.f37925w + ", paid=" + this.f37926x + ')';
    }
}
