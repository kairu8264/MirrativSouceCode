package ai;

import com.google.android.exoplayer2.C;
import com.mirrativ.llstream.protocol.v1.tag.TagConstant;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.Locale;

/* loaded from: classes3.dex */
public final class x8 {

    /* renamed from: a  reason: collision with root package name */
    public static final v8 f11883a = u8.f10645a;

    /* JADX WARN: Removed duplicated region for block: B:38:0x00bd A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00be  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final ai.v7 a(byte[] r11, int r12, ai.v8 r13, ai.x7 r14) {
        /*
            Method dump skipped, instructions count: 300
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.x8.a(byte[], int, ai.v8, ai.x7):ai.v7");
    }

    public static boolean b(hb hbVar, int i10, int i11, boolean z10) {
        int z11;
        long z12;
        int i12;
        int i13;
        int o10 = hbVar.o();
        while (true) {
            try {
                if (hbVar.l() < i11) {
                    return true;
                }
                if (i10 >= 3) {
                    z11 = hbVar.D();
                    z12 = hbVar.B();
                    i12 = hbVar.w();
                } else {
                    z11 = hbVar.z();
                    z12 = hbVar.z();
                    i12 = 0;
                }
                if (z11 == 0 && z12 == 0 && i12 == 0) {
                    return true;
                }
                if (i10 == 4 && !z10) {
                    if ((8421504 & z12) != 0) {
                        return false;
                    }
                    z12 = ((z12 >> 24) << 21) | ((255 & (z12 >> 16)) << 14) | (z12 & 255) | (((z12 >> 8) & 255) << 7);
                }
                if (i10 == 4) {
                    r4 = i12 & 1;
                    i13 = (i12 & 64) == 0 ? 0 : 1;
                } else if (i10 == 3) {
                    i13 = (i12 & 32) != 0 ? 1 : 0;
                    if ((i12 & 128) == 0) {
                        r4 = 0;
                    }
                } else {
                    i13 = 0;
                    r4 = 0;
                }
                if (r4 != 0) {
                    i13 += 4;
                }
                if (z12 < i13) {
                    return false;
                }
                if (hbVar.l() < z12) {
                    return false;
                }
                hbVar.s((int) z12);
            } finally {
                hbVar.p(o10);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:142:0x0273, code lost:
        if (r9 == 67) goto L123;
     */
    /* JADX WARN: Not initialized variable reg: 22, insn: 0x0565: MOVE  (r2 I:??[OBJECT, ARRAY]) = (r22 I:??[OBJECT, ARRAY]), block:B:249:0x0563 */
    /* JADX WARN: Removed duplicated region for block: B:132:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x049f  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x050d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static ai.y8 c(int r34, ai.hb r35, boolean r36, int r37, ai.v8 r38) {
        /*
            Method dump skipped, instructions count: 1413
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.x8.c(int, ai.hb, boolean, int, ai.v8):ai.y8");
    }

    public static int d(hb hbVar, int i10) {
        byte[] q10 = hbVar.q();
        int o10 = hbVar.o();
        int i11 = o10;
        while (true) {
            int i12 = i11 + 1;
            if (i12 >= o10 + i10) {
                return i10;
            }
            if ((q10[i11] & TagConstant.TAG_CAT_RESERVED) == 255 && q10[i12] == 0) {
                System.arraycopy(q10, i11 + 2, q10, i12, (i10 - (i11 - o10)) - 2);
                i10--;
            }
            i11 = i12;
        }
    }

    public static String e(int i10) {
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? C.ISO88591_NAME : C.UTF8_NAME : "UTF-16BE" : C.UTF16_NAME;
    }

    public static String f(int i10, int i11, int i12, int i13, int i14) {
        return i10 == 2 ? String.format(Locale.US, "%c%c%c", Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13)) : String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13), Integer.valueOf(i14));
    }

    public static int g(byte[] bArr, int i10, int i11) {
        int h10 = h(bArr, i10);
        if (i11 == 0 || i11 == 3) {
            return h10;
        }
        while (true) {
            int length = bArr.length;
            if (h10 >= length - 1) {
                return length;
            }
            if ((h10 - i10) % 2 == 0 && bArr[h10 + 1] == 0) {
                return h10;
            }
            h10 = h(bArr, h10 + 1);
        }
    }

    public static int h(byte[] bArr, int i10) {
        while (true) {
            int length = bArr.length;
            if (i10 >= length) {
                return length;
            }
            if (bArr[i10] == 0) {
                return i10;
            }
            i10++;
        }
    }

    public static int i(int i10) {
        return (i10 == 0 || i10 == 3) ? 1 : 2;
    }

    public static byte[] j(byte[] bArr, int i10, int i11) {
        if (i11 <= i10) {
            return sb.f9783f;
        }
        return Arrays.copyOfRange(bArr, i10, i11);
    }

    public static String k(byte[] bArr, int i10, int i11, String str) throws UnsupportedEncodingException {
        return (i11 <= i10 || i11 > bArr.length) ? "" : new String(bArr, i10, i11 - i10, str);
    }
}
