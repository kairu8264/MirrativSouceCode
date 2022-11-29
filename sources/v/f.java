package v;

import c1.u0;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public c1.k0 f56194a;

    /* renamed from: b  reason: collision with root package name */
    public c1.w f56195b;

    /* renamed from: c  reason: collision with root package name */
    public e1.a f56196c;

    /* renamed from: d  reason: collision with root package name */
    public u0 f56197d;

    public f() {
        this(null, null, null, null, 15, null);
    }

    public f(c1.k0 k0Var, c1.w wVar, e1.a aVar, u0 u0Var) {
        this.f56194a = k0Var;
        this.f56195b = wVar;
        this.f56196c = aVar;
        this.f56197d = u0Var;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            return jo.p.c(this.f56194a, fVar.f56194a) && jo.p.c(this.f56195b, fVar.f56195b) && jo.p.c(this.f56196c, fVar.f56196c) && jo.p.c(this.f56197d, fVar.f56197d);
        }
        return false;
    }

    public final u0 g() {
        u0 u0Var = this.f56197d;
        if (u0Var == null) {
            u0 a10 = c1.n.a();
            this.f56197d = a10;
            return a10;
        }
        return u0Var;
    }

    public int hashCode() {
        c1.k0 k0Var = this.f56194a;
        int hashCode = (k0Var == null ? 0 : k0Var.hashCode()) * 31;
        c1.w wVar = this.f56195b;
        int hashCode2 = (hashCode + (wVar == null ? 0 : wVar.hashCode())) * 31;
        e1.a aVar = this.f56196c;
        int hashCode3 = (hashCode2 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        u0 u0Var = this.f56197d;
        return hashCode3 + (u0Var != null ? u0Var.hashCode() : 0);
    }

    public String toString() {
        return "BorderCache(imageBitmap=" + this.f56194a + ", canvas=" + this.f56195b + ", canvasDrawScope=" + this.f56196c + ", borderPath=" + this.f56197d + ')';
    }

    public /* synthetic */ f(c1.k0 k0Var, c1.w wVar, e1.a aVar, u0 u0Var, int i10, jo.h hVar) {
        this((i10 & 1) != 0 ? null : k0Var, (i10 & 2) != 0 ? null : wVar, (i10 & 4) != 0 ? null : aVar, (i10 & 8) != 0 ? null : u0Var);
    }
}
