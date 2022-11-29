package jd;

import java.util.List;
import ud.h3;

/* loaded from: classes2.dex */
public final class o {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f37631a;

    /* renamed from: b  reason: collision with root package name */
    public final List<h3> f37632b;

    public o() {
        this(false, null, 3, null);
    }

    public o(boolean z10, List<h3> list) {
        jo.p.h(list, "ribbons");
        this.f37631a = z10;
        this.f37632b = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ o b(o oVar, boolean z10, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = oVar.f37631a;
        }
        if ((i10 & 2) != 0) {
            list = oVar.f37632b;
        }
        return oVar.a(z10, list);
    }

    public final o a(boolean z10, List<h3> list) {
        jo.p.h(list, "ribbons");
        return new o(z10, list);
    }

    public final boolean c() {
        return this.f37631a;
    }

    public final List<h3> d() {
        return this.f37632b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof o) {
            o oVar = (o) obj;
            return this.f37631a == oVar.f37631a && jo.p.c(this.f37632b, oVar.f37632b);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    public int hashCode() {
        boolean z10 = this.f37631a;
        ?? r02 = z10;
        if (z10) {
            r02 = 1;
        }
        return (r02 * 31) + this.f37632b.hashCode();
    }

    public String toString() {
        return "ProfileEditBindModel(loading=" + this.f37631a + ", ribbons=" + this.f37632b + ')';
    }

    public /* synthetic */ o(boolean z10, List list, int i10, jo.h hVar) {
        this((i10 & 1) != 0 ? false : z10, (i10 & 2) != 0 ? xn.s.k() : list);
    }
}
