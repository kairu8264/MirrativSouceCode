package e2;

/* loaded from: classes.dex */
public final class h {
    public static final long a(long j10, long j11) {
        int j12;
        int l10 = y1.b0.l(j10);
        int k10 = y1.b0.k(j10);
        if (y1.b0.p(j11, j10)) {
            if (y1.b0.d(j11, j10)) {
                l10 = y1.b0.l(j11);
                k10 = l10;
            } else {
                if (y1.b0.d(j10, j11)) {
                    j12 = y1.b0.j(j11);
                } else if (y1.b0.e(j11, l10)) {
                    l10 = y1.b0.l(j11);
                    j12 = y1.b0.j(j11);
                } else {
                    k10 = y1.b0.l(j11);
                }
                k10 -= j12;
            }
        } else if (k10 > y1.b0.l(j11)) {
            l10 -= y1.b0.j(j11);
            j12 = y1.b0.j(j11);
            k10 -= j12;
        }
        return y1.c0.b(l10, k10);
    }
}
