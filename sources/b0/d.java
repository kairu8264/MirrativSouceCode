package b0;

import b0.c;

/* loaded from: classes.dex */
public final class d {
    public static final <T> int b(m0.e<c.a<T>> eVar, int i10) {
        int p10 = eVar.p() - 1;
        int i11 = 0;
        while (i11 < p10) {
            int i12 = ((p10 - i11) / 2) + i11;
            int b10 = eVar.n()[i12].b();
            if (b10 == i10) {
                return i12;
            }
            if (b10 < i10) {
                i11 = i12 + 1;
                if (i10 < eVar.n()[i11].b()) {
                    return i12;
                }
            } else {
                p10 = i12 - 1;
            }
        }
        return i11;
    }
}
