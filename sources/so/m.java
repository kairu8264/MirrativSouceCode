package so;

import com.google.android.exoplayer2.C;

/* loaded from: classes4.dex */
public class m extends l {
    public static final Integer i(String str) {
        jo.p.h(str, "<this>");
        return j(str, 10);
    }

    public static final Integer j(String str, int i10) {
        boolean z10;
        int i11;
        jo.p.h(str, "<this>");
        a.a(i10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i12 = 0;
        char charAt = str.charAt(0);
        int i13 = -2147483647;
        int i14 = 1;
        if (jo.p.j(charAt, 48) >= 0) {
            z10 = false;
            i14 = 0;
        } else if (length == 1) {
            return null;
        } else {
            if (charAt == '-') {
                i13 = Integer.MIN_VALUE;
                z10 = true;
            } else if (charAt != '+') {
                return null;
            } else {
                z10 = false;
            }
        }
        int i15 = -59652323;
        while (i14 < length) {
            int b10 = a.b(str.charAt(i14), i10);
            if (b10 < 0) {
                return null;
            }
            if ((i12 < i15 && (i15 != -59652323 || i12 < (i15 = i13 / i10))) || (i11 = i12 * i10) < i13 + b10) {
                return null;
            }
            i12 = i11 - b10;
            i14++;
        }
        return z10 ? Integer.valueOf(i12) : Integer.valueOf(-i12);
    }

    public static final Long k(String str) {
        jo.p.h(str, "<this>");
        return l(str, 10);
    }

    public static final Long l(String str, int i10) {
        jo.p.h(str, "<this>");
        a.a(i10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i11 = 0;
        char charAt = str.charAt(0);
        int j10 = jo.p.j(charAt, 48);
        long j11 = C.TIME_UNSET;
        boolean z10 = true;
        if (j10 >= 0) {
            z10 = false;
        } else if (length == 1) {
            return null;
        } else {
            if (charAt == '-') {
                j11 = Long.MIN_VALUE;
                i11 = 1;
            } else if (charAt != '+') {
                return null;
            } else {
                z10 = false;
                i11 = 1;
            }
        }
        long j12 = -256204778801521550L;
        long j13 = 0;
        long j14 = -256204778801521550L;
        while (i11 < length) {
            int b10 = a.b(str.charAt(i11), i10);
            if (b10 < 0) {
                return null;
            }
            if (j13 < j14) {
                if (j14 == j12) {
                    j14 = j11 / i10;
                    if (j13 < j14) {
                    }
                }
                return null;
            }
            long j15 = j13 * i10;
            long j16 = b10;
            if (j15 < j11 + j16) {
                return null;
            }
            j13 = j15 - j16;
            i11++;
            j12 = -256204778801521550L;
        }
        return z10 ? Long.valueOf(j13) : Long.valueOf(-j13);
    }
}
