package so;

import java.util.Collection;
import java.util.Iterator;
import xn.i0;

/* loaded from: classes4.dex */
public class n extends m {
    public static final boolean A(String str, String str2, boolean z10) {
        jo.p.h(str, "<this>");
        jo.p.h(str2, "prefix");
        if (!z10) {
            return str.startsWith(str2);
        }
        return s(str, 0, str2, 0, str2.length(), z10);
    }

    public static /* synthetic */ boolean B(String str, String str2, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return z(str, str2, i10, z10);
    }

    public static /* synthetic */ boolean C(String str, String str2, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return A(str, str2, z10);
    }

    public static final String m(char[] cArr) {
        jo.p.h(cArr, "<this>");
        return new String(cArr);
    }

    public static final String n(char[] cArr, int i10, int i11) {
        jo.p.h(cArr, "<this>");
        xn.c.f60430w.a(i10, i11, cArr.length);
        return new String(cArr, i10, i11 - i10);
    }

    public static final boolean o(String str, String str2, boolean z10) {
        jo.p.h(str, "<this>");
        jo.p.h(str2, "suffix");
        if (!z10) {
            return str.endsWith(str2);
        }
        return s(str, str.length() - str2.length(), str2, 0, str2.length(), true);
    }

    public static /* synthetic */ boolean p(String str, String str2, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return o(str, str2, z10);
    }

    public static final boolean q(String str, String str2, boolean z10) {
        if (str == null) {
            return str2 == null;
        } else if (!z10) {
            return str.equals(str2);
        } else {
            return str.equalsIgnoreCase(str2);
        }
    }

    public static final boolean r(CharSequence charSequence) {
        boolean z10;
        jo.p.h(charSequence, "<this>");
        if (charSequence.length() != 0) {
            po.i N = o.N(charSequence);
            if (!(N instanceof Collection) || !((Collection) N).isEmpty()) {
                Iterator<Integer> it = N.iterator();
                while (it.hasNext()) {
                    if (!a.c(charSequence.charAt(((i0) it).b()))) {
                        z10 = false;
                        break;
                    }
                }
            }
            z10 = true;
            if (!z10) {
                return false;
            }
        }
        return true;
    }

    public static final boolean s(String str, int i10, String str2, int i11, int i12, boolean z10) {
        jo.p.h(str, "<this>");
        jo.p.h(str2, "other");
        if (!z10) {
            return str.regionMatches(i10, str2, i11, i12);
        }
        return str.regionMatches(z10, i10, str2, i11, i12);
    }

    public static /* synthetic */ boolean t(String str, int i10, String str2, int i11, int i12, boolean z10, int i13, Object obj) {
        if ((i13 & 16) != 0) {
            z10 = false;
        }
        return s(str, i10, str2, i11, i12, z10);
    }

    public static final String u(CharSequence charSequence, int i10) {
        jo.p.h(charSequence, "<this>");
        if (!(i10 >= 0)) {
            throw new IllegalArgumentException(("Count 'n' must be non-negative, but was " + i10 + '.').toString());
        } else if (i10 != 0) {
            if (i10 != 1) {
                int length = charSequence.length();
                if (length != 0) {
                    if (length != 1) {
                        StringBuilder sb2 = new StringBuilder(charSequence.length() * i10);
                        i0 it = new po.i(1, i10).iterator();
                        while (it.hasNext()) {
                            it.b();
                            sb2.append(charSequence);
                        }
                        String sb3 = sb2.toString();
                        jo.p.g(sb3, "{\n                    va…tring()\n                }");
                        return sb3;
                    }
                    char charAt = charSequence.charAt(0);
                    char[] cArr = new char[i10];
                    for (int i11 = 0; i11 < i10; i11++) {
                        cArr[i11] = charAt;
                    }
                    return new String(cArr);
                }
                return "";
            }
            return charSequence.toString();
        } else {
            return "";
        }
    }

    public static final String v(String str, char c10, char c11, boolean z10) {
        jo.p.h(str, "<this>");
        if (!z10) {
            String replace = str.replace(c10, c11);
            jo.p.g(replace, "this as java.lang.String…replace(oldChar, newChar)");
            return replace;
        }
        StringBuilder sb2 = new StringBuilder(str.length());
        for (int i10 = 0; i10 < str.length(); i10++) {
            char charAt = str.charAt(i10);
            if (b.d(charAt, c10, z10)) {
                charAt = c11;
            }
            sb2.append(charAt);
        }
        String sb3 = sb2.toString();
        jo.p.g(sb3, "StringBuilder(capacity).…builderAction).toString()");
        return sb3;
    }

    public static final String w(String str, String str2, String str3, boolean z10) {
        jo.p.h(str, "<this>");
        jo.p.h(str2, "oldValue");
        jo.p.h(str3, "newValue");
        int i10 = 0;
        int Q = o.Q(str, str2, 0, z10);
        if (Q < 0) {
            return str;
        }
        int length = str2.length();
        int d10 = po.n.d(length, 1);
        int length2 = (str.length() - length) + str3.length();
        if (length2 >= 0) {
            StringBuilder sb2 = new StringBuilder(length2);
            do {
                sb2.append((CharSequence) str, i10, Q);
                sb2.append(str3);
                i10 = Q + length;
                if (Q >= str.length()) {
                    break;
                }
                Q = o.Q(str, str2, Q + d10, z10);
            } while (Q > 0);
            sb2.append((CharSequence) str, i10, str.length());
            String sb3 = sb2.toString();
            jo.p.g(sb3, "stringBuilder.append(this, i, length).toString()");
            return sb3;
        }
        throw new OutOfMemoryError();
    }

    public static /* synthetic */ String x(String str, char c10, char c11, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        return v(str, c10, c11, z10);
    }

    public static /* synthetic */ String y(String str, String str2, String str3, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        return w(str, str2, str3, z10);
    }

    public static final boolean z(String str, String str2, int i10, boolean z10) {
        jo.p.h(str, "<this>");
        jo.p.h(str2, "prefix");
        if (!z10) {
            return str.startsWith(str2, i10);
        }
        return s(str, i10, str2, 0, str2.length(), z10);
    }
}
