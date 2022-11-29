package g0;

/* loaded from: classes.dex */
public final class l {
    public static final long a(int i10, int i11, boolean z10, boolean z11) {
        if (i11 == 0) {
            return y1.c0.b(i10, i10);
        }
        if (i10 == 0) {
            if (z10) {
                return y1.c0.b(1, 0);
            }
            return y1.c0.b(0, 1);
        } else if (i10 == i11) {
            if (z10) {
                return y1.c0.b(i11 - 1, i11);
            }
            return y1.c0.b(i11, i11 - 1);
        } else if (z10) {
            if (!z11) {
                return y1.c0.b(i10 - 1, i10);
            }
            return y1.c0.b(i10 + 1, i10);
        } else if (!z11) {
            return y1.c0.b(i10, i10 + 1);
        } else {
            return y1.c0.b(i10, i10 - 1);
        }
    }
}
