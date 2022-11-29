package sp;

import com.mirrativ.llstream.protocol.v1.tag.TagConstant;
import jo.p;
import rp.c0;
import rp.m0;
import rp.w;

/* loaded from: classes4.dex */
public final class f {

    /* renamed from: a */
    public static final byte[] f52826a = m0.a("0123456789abcdef");

    public static final byte[] a() {
        return f52826a;
    }

    public static final boolean b(c0 c0Var, int i10, byte[] bArr, int i11, int i12) {
        p.h(c0Var, "segment");
        p.h(bArr, "bytes");
        int i13 = c0Var.f51667c;
        byte[] bArr2 = c0Var.f51665a;
        while (i11 < i12) {
            if (i10 == i13) {
                c0Var = c0Var.f51670f;
                p.e(c0Var);
                byte[] bArr3 = c0Var.f51665a;
                bArr2 = bArr3;
                i10 = c0Var.f51666b;
                i13 = c0Var.f51667c;
            }
            if (bArr2[i10] != bArr[i11]) {
                return false;
            }
            i10++;
            i11++;
        }
        return true;
    }

    public static final String c(rp.c cVar, long j10) {
        p.h(cVar, "<this>");
        if (j10 > 0) {
            long j11 = j10 - 1;
            if (cVar.n(j11) == ((byte) 13)) {
                String P0 = cVar.P0(j11);
                cVar.k(2L);
                return P0;
            }
        }
        String P02 = cVar.P0(j10);
        cVar.k(1L);
        return P02;
    }

    public static final int d(rp.c cVar, w wVar, boolean z10) {
        int i10;
        int i11;
        int i12;
        int i13;
        c0 c0Var;
        p.h(cVar, "<this>");
        p.h(wVar, "options");
        c0 c0Var2 = cVar.f51656w;
        if (c0Var2 == null) {
            return z10 ? -2 : -1;
        }
        byte[] bArr = c0Var2.f51665a;
        int i14 = c0Var2.f51666b;
        int i15 = c0Var2.f51667c;
        int[] k10 = wVar.k();
        c0 c0Var3 = c0Var2;
        int i16 = -1;
        int i17 = 0;
        loop0: while (true) {
            int i18 = i17 + 1;
            int i19 = k10[i17];
            int i20 = i18 + 1;
            int i21 = k10[i18];
            if (i21 != -1) {
                i16 = i21;
            }
            if (c0Var3 == null) {
                break;
            }
            if (i19 >= 0) {
                i10 = i14 + 1;
                int i22 = bArr[i14] & TagConstant.TAG_CAT_RESERVED;
                int i23 = i20 + i19;
                while (i20 != i23) {
                    if (i22 == k10[i20]) {
                        i11 = k10[i20 + i19];
                        if (i10 == i15) {
                            c0Var3 = c0Var3.f51670f;
                            p.e(c0Var3);
                            i10 = c0Var3.f51666b;
                            bArr = c0Var3.f51665a;
                            i15 = c0Var3.f51667c;
                            if (c0Var3 == c0Var2) {
                                c0Var3 = null;
                            }
                        }
                    } else {
                        i20++;
                    }
                }
                return i16;
            }
            int i24 = i20 + (i19 * (-1));
            while (true) {
                int i25 = i14 + 1;
                int i26 = i20 + 1;
                if ((bArr[i14] & TagConstant.TAG_CAT_RESERVED) != k10[i20]) {
                    return i16;
                }
                boolean z11 = i26 == i24;
                if (i25 == i15) {
                    p.e(c0Var3);
                    c0 c0Var4 = c0Var3.f51670f;
                    p.e(c0Var4);
                    i13 = c0Var4.f51666b;
                    byte[] bArr2 = c0Var4.f51665a;
                    i12 = c0Var4.f51667c;
                    if (c0Var4 != c0Var2) {
                        c0Var = c0Var4;
                        bArr = bArr2;
                    } else if (!z11) {
                        break loop0;
                    } else {
                        bArr = bArr2;
                        c0Var = null;
                    }
                } else {
                    c0 c0Var5 = c0Var3;
                    i12 = i15;
                    i13 = i25;
                    c0Var = c0Var5;
                }
                if (z11) {
                    i11 = k10[i26];
                    i10 = i13;
                    i15 = i12;
                    c0Var3 = c0Var;
                    break;
                }
                i14 = i13;
                i15 = i12;
                i20 = i26;
                c0Var3 = c0Var;
            }
            if (i11 >= 0) {
                return i11;
            }
            i17 = -i11;
            i14 = i10;
        }
        if (z10) {
            return -2;
        }
        return i16;
    }

    public static /* synthetic */ int e(rp.c cVar, w wVar, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return d(cVar, wVar, z10);
    }
}
