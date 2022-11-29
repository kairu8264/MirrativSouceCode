package ai;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.MessageDigest;

/* loaded from: classes3.dex */
public final class cm extends xl {

    /* renamed from: c  reason: collision with root package name */
    public MessageDigest f2866c;

    @Override // ai.xl
    public final byte[] a(String str) {
        byte[] bArr;
        byte[] bArr2;
        String[] split = str.split(" ");
        int length = split.length;
        int i10 = 4;
        if (length == 1) {
            int a10 = bm.a(split[0]);
            ByteBuffer allocate = ByteBuffer.allocate(4);
            allocate.order(ByteOrder.LITTLE_ENDIAN);
            allocate.putInt(a10);
            bArr2 = allocate.array();
        } else {
            if (length < 5) {
                bArr = new byte[length + length];
                for (int i11 = 0; i11 < split.length; i11++) {
                    int a11 = bm.a(split[i11]);
                    int i12 = (a11 >> 16) ^ ((char) a11);
                    byte[] bArr3 = {(byte) i12, (byte) (i12 >> 8)};
                    int i13 = i11 + i11;
                    bArr[i13] = bArr3[0];
                    bArr[i13 + 1] = bArr3[1];
                }
            } else {
                bArr = new byte[length];
                for (int i14 = 0; i14 < split.length; i14++) {
                    int a12 = bm.a(split[i14]);
                    bArr[i14] = (byte) ((a12 >> 24) ^ (((a12 & 255) ^ ((a12 >> 8) & 255)) ^ ((a12 >> 16) & 255)));
                }
            }
            bArr2 = bArr;
        }
        this.f2866c = b();
        synchronized (this.f11984a) {
            MessageDigest messageDigest = this.f2866c;
            if (messageDigest == null) {
                return new byte[0];
            }
            messageDigest.reset();
            this.f2866c.update(bArr2);
            byte[] digest = this.f2866c.digest();
            int length2 = digest.length;
            if (length2 <= 4) {
                i10 = length2;
            }
            byte[] bArr4 = new byte[i10];
            System.arraycopy(digest, 0, bArr4, 0, i10);
            return bArr4;
        }
    }
}
