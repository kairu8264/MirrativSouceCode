package jf;

/* loaded from: classes2.dex */
public final class n0 {

    /* renamed from: a  reason: collision with root package name */
    public final m0 f37948a;

    /* renamed from: b  reason: collision with root package name */
    public final int f37949b;

    /* renamed from: c  reason: collision with root package name */
    public final int f37950c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f37951d;

    public n0(m0 m0Var, int i10, int i11, boolean z10) {
        jo.p.h(m0Var, "partsLargeCategory");
        this.f37948a = m0Var;
        this.f37949b = i10;
        this.f37950c = i11;
        this.f37951d = z10;
    }

    public final boolean a() {
        return this.f37951d;
    }

    public final int b() {
        return this.f37949b;
    }

    public final m0 c() {
        return this.f37948a;
    }

    public final int d() {
        return this.f37950c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof n0) {
            n0 n0Var = (n0) obj;
            return this.f37948a == n0Var.f37948a && this.f37949b == n0Var.f37949b && this.f37950c == n0Var.f37950c && this.f37951d == n0Var.f37951d;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((this.f37948a.hashCode() * 31) + Integer.hashCode(this.f37949b)) * 31) + Integer.hashCode(this.f37950c)) * 31;
        boolean z10 = this.f37951d;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        return hashCode + i10;
    }

    public String toString() {
        return "PartsLargeCategoryBindModel(partsLargeCategory=" + this.f37948a + ", imageResource=" + this.f37949b + ", textResource=" + this.f37950c + ", displayBadge=" + this.f37951d + ')';
    }
}
