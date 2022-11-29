package rp;

import com.mirrativ.llstream.protocol.v1.tag.TagConstant;
import rp.f;

/* loaded from: classes4.dex */
public final class l0 {

    /* renamed from: a  reason: collision with root package name */
    public static final byte[] f51714a;

    /* renamed from: b  reason: collision with root package name */
    public static final byte[] f51715b;

    static {
        f.a aVar = f.f51677z;
        f51714a = aVar.d("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/").m();
        f51715b = aVar.d("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_").m();
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x00b7 A[LOOP:1: B:16:0x003d->B:63:0x00b7, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00b3 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final byte[] a(java.lang.String r17) {
        /*
            Method dump skipped, instructions count: 241
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: rp.l0.a(java.lang.String):byte[]");
    }

    public static final String b(byte[] bArr, byte[] bArr2) {
        jo.p.h(bArr, "<this>");
        jo.p.h(bArr2, "map");
        byte[] bArr3 = new byte[((bArr.length + 2) / 3) * 4];
        int length = bArr.length - (bArr.length % 3);
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            int i12 = i10 + 1;
            byte b10 = bArr[i10];
            int i13 = i12 + 1;
            byte b11 = bArr[i12];
            int i14 = i13 + 1;
            byte b12 = bArr[i13];
            int i15 = i11 + 1;
            bArr3[i11] = bArr2[(b10 & TagConstant.TAG_CAT_RESERVED) >> 2];
            int i16 = i15 + 1;
            bArr3[i15] = bArr2[((b10 & 3) << 4) | ((b11 & TagConstant.TAG_CAT_RESERVED) >> 4)];
            int i17 = i16 + 1;
            bArr3[i16] = bArr2[((b11 & 15) << 2) | ((b12 & TagConstant.TAG_CAT_RESERVED) >> 6)];
            i11 = i17 + 1;
            bArr3[i17] = bArr2[b12 & 63];
            i10 = i14;
        }
        int length2 = bArr.length - length;
        if (length2 == 1) {
            byte b13 = bArr[i10];
            int i18 = i11 + 1;
            bArr3[i11] = bArr2[(b13 & TagConstant.TAG_CAT_RESERVED) >> 2];
            int i19 = i18 + 1;
            bArr3[i18] = bArr2[(b13 & 3) << 4];
            byte b14 = (byte) 61;
            bArr3[i19] = b14;
            bArr3[i19 + 1] = b14;
        } else if (length2 == 2) {
            int i20 = i10 + 1;
            byte b15 = bArr[i10];
            byte b16 = bArr[i20];
            int i21 = i11 + 1;
            bArr3[i11] = bArr2[(b15 & TagConstant.TAG_CAT_RESERVED) >> 2];
            int i22 = i21 + 1;
            bArr3[i21] = bArr2[((b15 & 3) << 4) | ((b16 & TagConstant.TAG_CAT_RESERVED) >> 4)];
            bArr3[i22] = bArr2[(b16 & 15) << 2];
            bArr3[i22 + 1] = (byte) 61;
        }
        return m0.b(bArr3);
    }

    public static /* synthetic */ String c(byte[] bArr, byte[] bArr2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            bArr2 = f51714a;
        }
        return b(bArr, bArr2);
    }
}
