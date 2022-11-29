package f0;

/* loaded from: classes.dex */
public final class z {
    public static final int a(CharSequence charSequence, int i10) {
        jo.p.h(charSequence, "<this>");
        int length = charSequence.length();
        for (int i11 = i10 + 1; i11 < length; i11++) {
            if (charSequence.charAt(i11) == '\n') {
                return i11;
            }
        }
        return charSequence.length();
    }

    public static final int b(CharSequence charSequence, int i10) {
        jo.p.h(charSequence, "<this>");
        for (int i11 = i10 - 1; i11 > 0; i11--) {
            if (charSequence.charAt(i11 - 1) == '\n') {
                return i11;
            }
        }
        return 0;
    }

    public static final long c(CharSequence charSequence, int i10) {
        jo.p.h(charSequence, "<this>");
        return y1.c0.b(b(charSequence, i10), a(charSequence, i10));
    }
}
