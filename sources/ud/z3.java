package ud;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import ud.a;

/* loaded from: classes2.dex */
public final class z3 implements a {
    public final a.EnumC0862a A;

    /* renamed from: w  reason: collision with root package name */
    public final String f55822w;

    /* renamed from: x  reason: collision with root package name */
    public final int f55823x;

    /* renamed from: y  reason: collision with root package name */
    public final Integer f55824y;

    /* renamed from: z  reason: collision with root package name */
    public final boolean f55825z;

    public z3(String str, int i10, Integer num, boolean z10, a.EnumC0862a enumC0862a) {
        jo.p.h(str, TtmlNode.ATTR_ID);
        jo.p.h(enumC0862a, "type");
        this.f55822w = str;
        this.f55823x = i10;
        this.f55824y = num;
        this.f55825z = z10;
        this.A = enumC0862a;
    }

    public final String a() {
        return this.f55822w;
    }

    public final int b() {
        return this.f55823x;
    }

    public final Integer c() {
        return this.f55824y;
    }

    public final boolean d() {
        return this.f55825z;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof z3) {
            z3 z3Var = (z3) obj;
            return jo.p.c(this.f55822w, z3Var.f55822w) && this.f55823x == z3Var.f55823x && jo.p.c(this.f55824y, z3Var.f55824y) && this.f55825z == z3Var.f55825z && getType() == z3Var.getType();
        }
        return false;
    }

    @Override // ud.a
    public a.EnumC0862a getType() {
        return this.A;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((this.f55822w.hashCode() * 31) + Integer.hashCode(this.f55823x)) * 31;
        Integer num = this.f55824y;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        boolean z10 = this.f55825z;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        return ((hashCode2 + i10) * 31) + getType().hashCode();
    }

    public String toString() {
        return "StampGiftColorPaletteBindModel(id=" + this.f55822w + ", mainColor=" + this.f55823x + ", strokeColor=" + this.f55824y + ", isSelected=" + this.f55825z + ", type=" + getType() + ')';
    }

    public /* synthetic */ z3(String str, int i10, Integer num, boolean z10, a.EnumC0862a enumC0862a, int i11, jo.h hVar) {
        this(str, i10, num, (i11 & 8) != 0 ? false : z10, (i11 & 16) != 0 ? a.EnumC0862a.STAMP_GIFT_COLOR_PALETTE : enumC0862a);
    }
}
