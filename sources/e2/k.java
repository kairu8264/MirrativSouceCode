package e2;

/* loaded from: classes.dex */
public final class k {
    public static final void b(String str, char[] cArr, int i10, int i11, int i12) {
        for (int i13 = i11; i13 < i12; i13++) {
            cArr[(i10 + i13) - i11] = str.charAt(i13);
        }
    }

    public static /* synthetic */ void c(String str, char[] cArr, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i10 = 0;
        }
        if ((i13 & 4) != 0) {
            i11 = 0;
        }
        if ((i13 & 8) != 0) {
            i12 = str.length();
        }
        b(str, cArr, i10, i11, i12);
    }
}
