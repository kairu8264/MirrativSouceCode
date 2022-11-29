package jf;

/* loaded from: classes2.dex */
public final class l0 {

    /* renamed from: a  reason: collision with root package name */
    public final k0 f37937a;

    /* renamed from: b  reason: collision with root package name */
    public final int f37938b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f37939c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f37940d;

    public l0(k0 k0Var, int i10, boolean z10, boolean z11) {
        jo.p.h(k0Var, "partsCategory");
        this.f37937a = k0Var;
        this.f37938b = i10;
        this.f37939c = z10;
        this.f37940d = z11;
    }

    public final boolean a() {
        return this.f37939c;
    }

    public final int b() {
        return this.f37938b;
    }

    public final k0 c() {
        return this.f37937a;
    }

    public final boolean d() {
        return this.f37940d;
    }

    public final void e(boolean z10) {
        this.f37940d = z10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof l0) {
            l0 l0Var = (l0) obj;
            return this.f37937a == l0Var.f37937a && this.f37938b == l0Var.f37938b && this.f37939c == l0Var.f37939c && this.f37940d == l0Var.f37940d;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((this.f37937a.hashCode() * 31) + Integer.hashCode(this.f37938b)) * 31;
        boolean z10 = this.f37939c;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        int i11 = (hashCode + i10) * 31;
        boolean z11 = this.f37940d;
        return i11 + (z11 ? 1 : z11 ? 1 : 0);
    }

    public String toString() {
        return "PartsCategoryBindModel(partsCategory=" + this.f37937a + ", imageResource=" + this.f37938b + ", displayBadge=" + this.f37939c + ", selected=" + this.f37940d + ')';
    }

    public /* synthetic */ l0(k0 k0Var, int i10, boolean z10, boolean z11, int i11, jo.h hVar) {
        this(k0Var, i10, z10, (i11 & 8) != 0 ? false : z11);
    }
}
