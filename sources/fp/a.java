package fp;

import java.net.IDN;
import java.net.InetAddress;
import java.util.Locale;
import jo.p;
import rp.c;
import so.n;
import so.o;

/* loaded from: classes4.dex */
public final class a {
    public static final boolean a(String str) {
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            char charAt = str.charAt(i10);
            if (p.j(charAt, 31) <= 0 || p.j(charAt, 127) >= 0 || o.T(" #%/:?@[\\]", charAt, 0, false, 6, null) != -1) {
                return true;
            }
        }
        return false;
    }

    public static final boolean b(String str, int i10, int i11, byte[] bArr, int i12) {
        int i13 = i12;
        while (i10 < i11) {
            if (i13 == bArr.length) {
                return false;
            }
            if (i13 != i12) {
                if (str.charAt(i10) != '.') {
                    return false;
                }
                i10++;
            }
            int i14 = i10;
            int i15 = 0;
            while (i14 < i11) {
                char charAt = str.charAt(i14);
                if (p.j(charAt, 48) < 0 || p.j(charAt, 57) > 0) {
                    break;
                } else if ((i15 == 0 && i10 != i14) || (i15 = ((i15 * 10) + charAt) - 48) > 255) {
                    return false;
                } else {
                    i14++;
                }
            }
            if (i14 - i10 == 0) {
                return false;
            }
            bArr[i13] = (byte) i15;
            i13++;
            i10 = i14;
        }
        return i13 == i12 + 4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0097, code lost:
        if (r13 == 16) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0099, code lost:
        if (r14 != (-1)) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x009b, code lost:
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x009c, code lost:
        r0 = r13 - r14;
        java.lang.System.arraycopy(r9, r14, r9, 16 - r0, r0);
        java.util.Arrays.fill(r9, r14, (16 - r13) + r14, (byte) 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00ae, code lost:
        return java.net.InetAddress.getByAddress(r9);
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.net.InetAddress c(java.lang.String r18, int r19, int r20) {
        /*
            Method dump skipped, instructions count: 175
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: fp.a.c(java.lang.String, int, int):java.net.InetAddress");
    }

    public static final String d(byte[] bArr) {
        int i10 = 0;
        int i11 = -1;
        int i12 = 0;
        int i13 = 0;
        while (i12 < bArr.length) {
            int i14 = i12;
            while (i14 < 16 && bArr[i14] == 0 && bArr[i14 + 1] == 0) {
                i14 += 2;
            }
            int i15 = i14 - i12;
            if (i15 > i13 && i15 >= 4) {
                i11 = i12;
                i13 = i15;
            }
            i12 = i14 + 2;
        }
        c cVar = new c();
        while (i10 < bArr.length) {
            if (i10 == i11) {
                cVar.b1(58);
                i10 += i13;
                if (i10 == 16) {
                    cVar.b1(58);
                }
            } else {
                if (i10 > 0) {
                    cVar.b1(58);
                }
                cVar.t1((b.b(bArr[i10], 255) << 8) | b.b(bArr[i10 + 1], 255));
                i10 += 2;
            }
        }
        return cVar.N();
    }

    public static final String e(String str) {
        InetAddress c10;
        p.h(str, "$this$toCanonicalHost");
        if (o.H(str, ":", false, 2, null)) {
            if (n.C(str, "[", false, 2, null) && n.p(str, "]", false, 2, null)) {
                c10 = c(str, 1, str.length() - 1);
            } else {
                c10 = c(str, 0, str.length());
            }
            if (c10 != null) {
                byte[] address = c10.getAddress();
                if (address.length == 16) {
                    p.g(address, "address");
                    return d(address);
                } else if (address.length == 4) {
                    return c10.getHostAddress();
                } else {
                    throw new AssertionError("Invalid IPv6 address: '" + str + '\'');
                }
            }
            return null;
        }
        try {
            String ascii = IDN.toASCII(str);
            p.g(ascii, "IDN.toASCII(host)");
            Locale locale = Locale.US;
            p.g(locale, "Locale.US");
            if (ascii != null) {
                String lowerCase = ascii.toLowerCase(locale);
                p.g(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
                if (!(lowerCase.length() == 0) && !a(lowerCase)) {
                    return lowerCase;
                }
                return null;
            }
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }
}
