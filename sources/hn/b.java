package hn;

/* loaded from: classes4.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    public static final byte[] f36133a = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};

    public static String a(String str) {
        if (str == null) {
            return null;
        }
        return b(t.d(str));
    }

    public static String b(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        int length = (((((bArr.length * 8) + 5) / 6) + 3) / 4) * 4;
        StringBuilder sb2 = new StringBuilder(length);
        int i10 = 0;
        while (true) {
            int c10 = c(bArr, i10);
            if (c10 < 0) {
                break;
            }
            sb2.append((char) f36133a[c10]);
            i10 += 6;
        }
        for (int length2 = sb2.length(); length2 < length; length2++) {
            sb2.append('=');
        }
        return sb2.toString();
    }

    public static int c(byte[] bArr, int i10) {
        int i11 = i10 / 8;
        if (bArr.length <= i11) {
            return -1;
        }
        byte b10 = bArr.length - 1 == i11 ? (byte) 0 : bArr[i11 + 1];
        int i12 = (i10 % 24) / 6;
        if (i12 != 0) {
            if (i12 != 1) {
                if (i12 != 2) {
                    if (i12 != 3) {
                        return 0;
                    }
                    return bArr[i11] & 63;
                }
                return ((bArr[i11] << 2) & 60) | ((b10 >> 6) & 3);
            }
            return ((bArr[i11] << 4) & 48) | ((b10 >> 4) & 15);
        }
        return (bArr[i11] >> 2) & 63;
    }
}
