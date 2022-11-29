package ud;

import kotlin.NoWhenBranchMatchedException;
import ud.a;

/* loaded from: classes2.dex */
public final class a4 implements ud.a {

    /* renamed from: w  reason: collision with root package name */
    public final a f54750w;

    /* renamed from: x  reason: collision with root package name */
    public final boolean f54751x;

    /* renamed from: y  reason: collision with root package name */
    public final a.EnumC0862a f54752y;

    /* loaded from: classes2.dex */
    public enum a {
        TOP,
        LEFT,
        RIGHT,
        BOTTOM
    }

    /* loaded from: classes2.dex */
    public /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f54753a;

        static {
            int[] iArr = new int[a.values().length];
            iArr[a.TOP.ordinal()] = 1;
            iArr[a.LEFT.ordinal()] = 2;
            iArr[a.RIGHT.ordinal()] = 3;
            iArr[a.BOTTOM.ordinal()] = 4;
            f54753a = iArr;
        }
    }

    public a4() {
        this(null, false, null, 7, null);
    }

    public a4(a aVar, boolean z10, a.EnumC0862a enumC0862a) {
        jo.p.h(aVar, "textAlignType");
        jo.p.h(enumC0862a, "type");
        this.f54750w = aVar;
        this.f54751x = z10;
        this.f54752y = enumC0862a;
    }

    public final int a() {
        int i10 = b.f54753a[this.f54750w.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 == 4) {
                        return nd.y0.ic_text_align_bottom;
                    }
                    throw new NoWhenBranchMatchedException();
                }
                return nd.y0.ic_text_align_right;
            }
            return nd.y0.ic_text_align_left;
        }
        return nd.y0.ic_text_align_top;
    }

    public final a b() {
        return this.f54750w;
    }

    public final boolean c() {
        return this.f54751x;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a4) {
            a4 a4Var = (a4) obj;
            return this.f54750w == a4Var.f54750w && this.f54751x == a4Var.f54751x && getType() == a4Var.getType();
        }
        return false;
    }

    @Override // ud.a
    public a.EnumC0862a getType() {
        return this.f54752y;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = this.f54750w.hashCode() * 31;
        boolean z10 = this.f54751x;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        return ((hashCode + i10) * 31) + getType().hashCode();
    }

    public String toString() {
        return "StampGiftTextAlignBindModel(textAlignType=" + this.f54750w + ", isSelected=" + this.f54751x + ", type=" + getType() + ')';
    }

    public /* synthetic */ a4(a aVar, boolean z10, a.EnumC0862a enumC0862a, int i10, jo.h hVar) {
        this((i10 & 1) != 0 ? a.TOP : aVar, (i10 & 2) != 0 ? false : z10, (i10 & 4) != 0 ? a.EnumC0862a.STAMP_GIFT_TEXT_ALIGN : enumC0862a);
    }
}
