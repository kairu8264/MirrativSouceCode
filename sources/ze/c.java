package ze;

import android.util.Size;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final c f63116a = new c();

    public final d a() {
        return new d();
    }

    public final int b(int i10, int i11, int i12, int i13) {
        return Math.max(i10, i11);
    }

    public final Size c(int i10, int i11, int i12, int i13) {
        boolean z10 = Math.max(i10, i11) == i11;
        double min = Math.min(i11, z10 ? i13 * 2 : i12 * 2);
        double min2 = z10 ? Math.min(i10, i12 * 2) : Math.min(i10, i13 * 2);
        if ((z10 && i10 < 648) || (!z10 && i11 < 648)) {
            return new Size((int) min2, (int) min);
        }
        double d10 = 648.0d;
        if (z10 && min2 < 648.0d) {
            min *= 648.0d / min2;
            min2 = 648.0d;
        }
        if (z10 || min >= 648.0d) {
            d10 = min;
        } else {
            min2 *= 648.0d / min;
        }
        return new Size((int) min2, (int) d10);
    }
}
