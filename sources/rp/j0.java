package rp;

/* loaded from: classes4.dex */
public final class j0 {
    public static final long a(String str, int i10, int i11) {
        int i12;
        jo.p.h(str, "<this>");
        if (i10 >= 0) {
            if (i11 >= i10) {
                if (!(i11 <= str.length())) {
                    throw new IllegalArgumentException(("endIndex > string.length: " + i11 + " > " + str.length()).toString());
                }
                long j10 = 0;
                while (i10 < i11) {
                    char charAt = str.charAt(i10);
                    if (charAt < 128) {
                        j10++;
                    } else {
                        if (charAt < 2048) {
                            i12 = 2;
                        } else if (charAt < 55296 || charAt > 57343) {
                            i12 = 3;
                        } else {
                            int i13 = i10 + 1;
                            char charAt2 = i13 < i11 ? str.charAt(i13) : (char) 0;
                            if (charAt > 56319 || charAt2 < 56320 || charAt2 > 57343) {
                                j10++;
                                i10 = i13;
                            } else {
                                j10 += 4;
                                i10 += 2;
                            }
                        }
                        j10 += i12;
                    }
                    i10++;
                }
                return j10;
            }
            throw new IllegalArgumentException(("endIndex < beginIndex: " + i11 + " < " + i10).toString());
        }
        throw new IllegalArgumentException(jo.p.o("beginIndex < 0: ", Integer.valueOf(i10)).toString());
    }

    public static /* synthetic */ long b(String str, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = str.length();
        }
        return a(str, i10, i11);
    }
}
