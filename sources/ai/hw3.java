package ai;

import com.google.android.exoplayer2.C;
import com.mirrativ.llstream.protocol.v1.tag.TagConstant;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class hw3 {
    public static List<byte[]> a(byte[] bArr) {
        byte b10 = bArr[11];
        byte b11 = bArr[10];
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(bArr);
        arrayList.add(b(c(((b10 & TagConstant.TAG_CAT_RESERVED) << 8) | (b11 & TagConstant.TAG_CAT_RESERVED))));
        arrayList.add(b(c(3840L)));
        return arrayList;
    }

    public static byte[] b(long j10) {
        return ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(j10).array();
    }

    public static long c(long j10) {
        return (j10 * C.NANOS_PER_SECOND) / 48000;
    }
}
