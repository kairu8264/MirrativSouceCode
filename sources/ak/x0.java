package ak;

import com.mirrativ.llstream.protocol.v1.tag.TagConstant;

/* loaded from: classes3.dex */
public final class x0 {
    public static int a(byte[] bArr, int i10) {
        return ((bArr[i10 + 1] & TagConstant.TAG_CAT_RESERVED) << 8) | (bArr[i10] & TagConstant.TAG_CAT_RESERVED);
    }

    public static long b(byte[] bArr, int i10) {
        return ((a(bArr, i10 + 2) << 16) | a(bArr, i10)) & 4294967295L;
    }
}
