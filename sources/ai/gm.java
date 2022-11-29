package ai;

import com.google.android.exoplayer2.C;
import com.mirrativ.llstream.protocol.v1.tag.TagConstant;
import java.nio.charset.Charset;
import java.security.MessageDigest;

/* loaded from: classes3.dex */
public final class gm extends xl {

    /* renamed from: c  reason: collision with root package name */
    public MessageDigest f4511c;

    /* renamed from: d  reason: collision with root package name */
    public final int f4512d;

    /* renamed from: e  reason: collision with root package name */
    public final int f4513e;

    public gm(int i10) {
        int i11 = i10 >> 3;
        this.f4512d = (i10 & 7) > 0 ? i11 + 1 : i11;
        this.f4513e = i10;
    }

    @Override // ai.xl
    public final byte[] a(String str) {
        synchronized (this.f11984a) {
            MessageDigest b10 = b();
            this.f4511c = b10;
            if (b10 == null) {
                return new byte[0];
            }
            b10.reset();
            this.f4511c.update(str.getBytes(Charset.forName(C.UTF8_NAME)));
            byte[] digest = this.f4511c.digest();
            int length = digest.length;
            int i10 = this.f4512d;
            if (length > i10) {
                length = i10;
            }
            byte[] bArr = new byte[length];
            System.arraycopy(digest, 0, bArr, 0, length);
            if ((this.f4513e & 7) > 0) {
                long j10 = 0;
                for (int i11 = 0; i11 < length; i11++) {
                    if (i11 > 0) {
                        j10 <<= 8;
                    }
                    j10 += bArr[i11] & TagConstant.TAG_CAT_RESERVED;
                }
                long j11 = j10 >>> (8 - (this.f4513e & 7));
                int i12 = this.f4512d;
                while (true) {
                    i12--;
                    if (i12 < 0) {
                        break;
                    }
                    bArr[i12] = (byte) (255 & j11);
                    j11 >>>= 8;
                }
            }
            return bArr;
        }
    }
}
