package ai;

import com.mirrativ.llstream.protocol.v1.tag.TagConstant;
import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
public final class g54 {
    public static long a(ByteBuffer byteBuffer) {
        long j10 = byteBuffer.getInt();
        return j10 < 0 ? j10 + 4294967296L : j10;
    }

    public static int b(ByteBuffer byteBuffer) {
        return (c(byteBuffer.get()) << 8) + c(byteBuffer.get());
    }

    public static int c(byte b10) {
        return b10 < 0 ? b10 + 256 : b10;
    }

    public static long d(ByteBuffer byteBuffer) {
        long a10 = a(byteBuffer) << 32;
        if (a10 >= 0) {
            return a10 + a(byteBuffer);
        }
        throw new RuntimeException("I don't know how to deal with UInt64! long is not sufficient and I don't want to use BigInt");
    }

    public static double e(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[4];
        byteBuffer.get(bArr);
        return (((((bArr[0] << 24) & (-16777216)) | ((bArr[1] << 16) & 16711680)) | ((bArr[2] << 8) & 65280)) | (bArr[3] & TagConstant.TAG_CAT_RESERVED)) / 65536.0d;
    }

    public static double f(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[4];
        byteBuffer.get(bArr);
        return (((((bArr[0] << 24) & (-16777216)) | ((bArr[1] << 16) & 16711680)) | ((bArr[2] << 8) & 65280)) | (bArr[3] & TagConstant.TAG_CAT_RESERVED)) / 1.073741824E9d;
    }
}
