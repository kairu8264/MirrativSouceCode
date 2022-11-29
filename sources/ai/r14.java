package ai;

import com.mirrativ.llstream.protocol.v1.tag.TagConstant;

/* loaded from: classes3.dex */
public final class r14 extends dv3 {
    public r14(pb pbVar, long j10, long j11) {
        super(new yu3(), new q14(pbVar, null), j10, 0L, j10 + 1, 0L, j11, 188L, 1000);
    }

    public static /* synthetic */ int h(byte[] bArr, int i10) {
        return (bArr[i10 + 3] & TagConstant.TAG_CAT_RESERVED) | ((bArr[i10] & TagConstant.TAG_CAT_RESERVED) << 24) | ((bArr[i10 + 1] & TagConstant.TAG_CAT_RESERVED) << 16) | ((bArr[i10 + 2] & TagConstant.TAG_CAT_RESERVED) << 8);
    }
}
