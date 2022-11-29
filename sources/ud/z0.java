package ud;

import ud.a;

/* loaded from: classes2.dex */
public final class z0 implements a {

    /* renamed from: w  reason: collision with root package name */
    public final int f55797w;

    /* renamed from: x  reason: collision with root package name */
    public final boolean f55798x;

    /* renamed from: y  reason: collision with root package name */
    public final a.EnumC0862a f55799y;

    public z0(int i10, boolean z10, a.EnumC0862a enumC0862a) {
        jo.p.h(enumC0862a, "type");
        this.f55797w = i10;
        this.f55798x = z10;
        this.f55799y = enumC0862a;
    }

    public final boolean a() {
        return this.f55798x;
    }

    public final int b() {
        return this.f55797w;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof z0) {
            z0 z0Var = (z0) obj;
            return this.f55797w == z0Var.f55797w && this.f55798x == z0Var.f55798x && getType() == z0Var.getType();
        }
        return false;
    }

    @Override // ud.a
    public a.EnumC0862a getType() {
        return this.f55799y;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = Integer.hashCode(this.f55797w) * 31;
        boolean z10 = this.f55798x;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        return ((hashCode + i10) * 31) + getType().hashCode();
    }

    public String toString() {
        return "GiftPanelEmptySpaceBindModel(indexInPanel=" + this.f55797w + ", hasWidth=" + this.f55798x + ", type=" + getType() + ')';
    }

    public /* synthetic */ z0(int i10, boolean z10, a.EnumC0862a enumC0862a, int i11, jo.h hVar) {
        this(i10, z10, (i11 & 4) != 0 ? a.EnumC0862a.GIFT_PANEL_EMPTY : enumC0862a);
    }
}
