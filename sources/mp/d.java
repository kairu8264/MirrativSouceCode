package mp;

import com.dena.mirrorman.net.bcsvr.BcsvrCommand;
import jo.p;
import so.n;

/* loaded from: classes4.dex */
public final class d {

    /* renamed from: d  reason: collision with root package name */
    public static final String[] f41260d;

    /* renamed from: e  reason: collision with root package name */
    public static final d f41261e = new d();

    /* renamed from: a  reason: collision with root package name */
    public static final rp.f f41257a = rp.f.f51677z.d("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");

    /* renamed from: b  reason: collision with root package name */
    public static final String[] f41258b = {"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};

    /* renamed from: c  reason: collision with root package name */
    public static final String[] f41259c = new String[64];

    static {
        String[] strArr = new String[256];
        for (int i10 = 0; i10 < 256; i10++) {
            String binaryString = Integer.toBinaryString(i10);
            p.g(binaryString, "Integer.toBinaryString(it)");
            strArr[i10] = n.x(fp.b.q("%8s", binaryString), ' ', '0', false, 4, null);
        }
        f41260d = strArr;
        String[] strArr2 = f41259c;
        strArr2[0] = "";
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        for (int i11 = 0; i11 < 1; i11++) {
            int i12 = iArr[i11];
            String[] strArr3 = f41259c;
            strArr3[i12 | 8] = p.o(strArr3[i12], "|PADDED");
        }
        String[] strArr4 = f41259c;
        strArr4[4] = "END_HEADERS";
        strArr4[32] = "PRIORITY";
        strArr4[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        for (int i13 = 0; i13 < 3; i13++) {
            int i14 = iArr2[i13];
            for (int i15 = 0; i15 < 1; i15++) {
                int i16 = iArr[i15];
                String[] strArr5 = f41259c;
                int i17 = i16 | i14;
                strArr5[i17] = strArr5[i16] + "|" + strArr5[i14];
                strArr5[i17 | 8] = strArr5[i16] + "|" + strArr5[i14] + "|PADDED";
            }
        }
        int length = f41259c.length;
        for (int i18 = 0; i18 < length; i18++) {
            String[] strArr6 = f41259c;
            if (strArr6[i18] == null) {
                strArr6[i18] = f41260d[i18];
            }
        }
    }

    public final String a(int i10, int i11) {
        String str;
        if (i11 == 0) {
            return "";
        }
        if (i10 != 2 && i10 != 3) {
            if (i10 == 4 || i10 == 6) {
                return i11 == 1 ? BcsvrCommand.ACK : f41260d[i11];
            } else if (i10 != 7 && i10 != 8) {
                String[] strArr = f41259c;
                if (i11 < strArr.length) {
                    str = strArr[i11];
                    p.e(str);
                } else {
                    str = f41260d[i11];
                }
                String str2 = str;
                if (i10 != 5 || (i11 & 4) == 0) {
                    return (i10 != 0 || (i11 & 32) == 0) ? str2 : n.y(str2, "PRIORITY", "COMPRESSED", false, 4, null);
                }
                return n.y(str2, "HEADERS", "PUSH_PROMISE", false, 4, null);
            }
        }
        return f41260d[i11];
    }

    public final String b(int i10) {
        String[] strArr = f41258b;
        return i10 < strArr.length ? strArr[i10] : fp.b.q("0x%02x", Integer.valueOf(i10));
    }

    public final String c(boolean z10, int i10, int i11, int i12, int i13) {
        return fp.b.q("%s 0x%08x %5d %-13s %s", z10 ? "<<" : ">>", Integer.valueOf(i10), Integer.valueOf(i11), b(i12), a(i12, i13));
    }
}
