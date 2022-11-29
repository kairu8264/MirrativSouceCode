package sp;

import jo.p;

/* loaded from: classes4.dex */
public final class g {

    /* renamed from: a */
    public static final char[] f52827a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* JADX WARN: Removed duplicated region for block: B:554:0x0047 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:557:0x0083 A[EDGE_INSN: B:557:0x0083->B:350:0x0083 ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:559:0x0220 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:566:0x0173 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:578:0x00df A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final int c(byte[] r19, int r20) {
        /*
            Method dump skipped, instructions count: 565
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: sp.g.c(byte[], int):int");
    }

    public static final void d(rp.f fVar, rp.c cVar, int i10, int i11) {
        p.h(fVar, "<this>");
        p.h(cVar, "buffer");
        cVar.write(fVar.m(), i10, i11);
    }

    public static final int e(char c10) {
        boolean z10 = true;
        if ('0' <= c10 && c10 <= '9') {
            return c10 - '0';
        }
        char c11 = 'a';
        if (!('a' <= c10 && c10 <= 'f')) {
            c11 = 'A';
            if ('A' > c10 || c10 > 'F') {
                z10 = false;
            }
            if (!z10) {
                throw new IllegalArgumentException(p.o("Unexpected hex digit: ", Character.valueOf(c10)));
            }
        }
        return (c10 - c11) + 10;
    }

    public static final char[] f() {
        return f52827a;
    }
}
