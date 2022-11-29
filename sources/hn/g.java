package hn;

import com.mirrativ.llstream.protocol.v1.tag.TagConstant;

/* loaded from: classes4.dex */
public class g {
    public static void a(c cVar, int i10, c cVar2) throws n {
        do {
        } while (d(cVar, new int[]{i10 * 8}, cVar2));
    }

    public static void b(c cVar, c cVar2) throws n {
        a(cVar, 0, cVar2);
    }

    public static void c(int i10, int i11, c cVar) {
        int h10 = cVar.h();
        byte[] bArr = new byte[i10];
        int i12 = h10 - i11;
        int i13 = 0;
        int i14 = i12;
        while (i13 < i10) {
            if (h10 <= i14) {
                i14 = i12;
            }
            bArr[i13] = cVar.d(i14);
            i13++;
            i14++;
        }
        cVar.k(bArr);
    }

    public static boolean d(c cVar, int[] iArr, c cVar2) throws n {
        boolean m10 = cVar.m(iArr);
        int n10 = cVar.n(iArr, 2);
        if (n10 == 0) {
            h(cVar, iArr, cVar2);
        } else if (n10 == 1) {
            g(cVar, iArr, cVar2);
        } else if (n10 == 2) {
            f(cVar, iArr, cVar2);
        } else {
            throw new n(String.format("[%s] Bad compression type '11' at the bit index '%d'.", g.class.getSimpleName(), Integer.valueOf(iArr[0])));
        }
        if (cVar.h() <= iArr[0] / 8) {
            m10 = true;
        }
        return !m10;
    }

    public static void e(c cVar, int[] iArr, c cVar2, q qVar, q qVar2) throws n {
        while (true) {
            int e10 = qVar.e(cVar, iArr);
            if (e10 == 256) {
                return;
            }
            if (e10 >= 0 && e10 <= 255) {
                cVar2.i(e10);
            } else {
                c(h.e(cVar, iArr, e10), h.c(cVar, iArr, qVar2), cVar2);
            }
        }
    }

    public static void f(c cVar, int[] iArr, c cVar2) throws n {
        q[] qVarArr = new q[2];
        h.d(cVar, iArr, qVarArr);
        e(cVar, iArr, cVar2, qVarArr[0], qVarArr[1]);
    }

    public static void g(c cVar, int[] iArr, c cVar2) throws n {
        e(cVar, iArr, cVar2, m.g(), l.g());
    }

    public static void h(c cVar, int[] iArr, c cVar2) {
        int i10 = ((iArr[0] + 7) & (-8)) / 8;
        int d10 = (cVar.d(i10) & TagConstant.TAG_CAT_RESERVED) + ((cVar.d(i10 + 1) & TagConstant.TAG_CAT_RESERVED) * 256);
        int i11 = i10 + 4;
        cVar2.j(cVar, i11, d10);
        iArr[0] = (i11 + d10) * 8;
    }
}
