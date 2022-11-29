package ud;

import ud.r3;

/* loaded from: classes2.dex */
public final class t3 implements r3 {

    /* renamed from: b  reason: collision with root package name */
    public final jf.m0 f55530b;

    /* renamed from: c  reason: collision with root package name */
    public final jf.k0 f55531c;

    /* renamed from: d  reason: collision with root package name */
    public final int f55532d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f55533e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f55534f;

    /* renamed from: g  reason: collision with root package name */
    public final r3.b f55535g;

    public t3(jf.m0 m0Var, jf.k0 k0Var, int i10, boolean z10, boolean z11, r3.b bVar) {
        jo.p.h(m0Var, "partsLargeCategory");
        jo.p.h(k0Var, "partsCategory");
        jo.p.h(bVar, "type");
        this.f55530b = m0Var;
        this.f55531c = k0Var;
        this.f55532d = i10;
        this.f55533e = z10;
        this.f55534f = z11;
        this.f55535g = bVar;
    }

    public final boolean a() {
        return this.f55533e;
    }

    public final int b() {
        return this.f55532d;
    }

    public final jf.k0 c() {
        return this.f55531c;
    }

    public final jf.m0 d() {
        return this.f55530b;
    }

    public final boolean e() {
        return this.f55534f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof t3) {
            t3 t3Var = (t3) obj;
            return this.f55530b == t3Var.f55530b && this.f55531c == t3Var.f55531c && this.f55532d == t3Var.f55532d && this.f55533e == t3Var.f55533e && this.f55534f == t3Var.f55534f && getType() == t3Var.getType();
        }
        return false;
    }

    @Override // ud.r3
    public r3.b getType() {
        return this.f55535g;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((this.f55530b.hashCode() * 31) + this.f55531c.hashCode()) * 31) + Integer.hashCode(this.f55532d)) * 31;
        boolean z10 = this.f55533e;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        int i11 = (hashCode + i10) * 31;
        boolean z11 = this.f55534f;
        return ((i11 + (z11 ? 1 : z11 ? 1 : 0)) * 31) + getType().hashCode();
    }

    public String toString() {
        return "ShooterPartsCategoryItemBindModel(partsLargeCategory=" + this.f55530b + ", partsCategory=" + this.f55531c + ", imageResource=" + this.f55532d + ", displayBadge=" + this.f55533e + ", isSelected=" + this.f55534f + ", type=" + getType() + ')';
    }

    public /* synthetic */ t3(jf.m0 m0Var, jf.k0 k0Var, int i10, boolean z10, boolean z11, r3.b bVar, int i11, jo.h hVar) {
        this(m0Var, k0Var, i10, z10, (i11 & 16) != 0 ? false : z11, (i11 & 32) != 0 ? r3.b.CATEGORY : bVar);
    }
}
