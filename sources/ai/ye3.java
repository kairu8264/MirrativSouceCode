package ai;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.mirrativ.llstream.protocol.v1.tag.TagConstant;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes3.dex */
public final class ye3 implements m53 {

    /* renamed from: e  reason: collision with root package name */
    public static final ThreadLocal<Cipher> f12568e = new we3();

    /* renamed from: f  reason: collision with root package name */
    public static final ThreadLocal<Cipher> f12569f = new xe3();

    /* renamed from: a  reason: collision with root package name */
    public final byte[] f12570a;

    /* renamed from: b  reason: collision with root package name */
    public final byte[] f12571b;

    /* renamed from: c  reason: collision with root package name */
    public final SecretKeySpec f12572c;

    /* renamed from: d  reason: collision with root package name */
    public final int f12573d;

    public ye3(byte[] bArr, int i10) throws GeneralSecurityException {
        if (!e83.a(1)) {
            throw new GeneralSecurityException("Can not use AES-EAX in FIPS-mode.");
        }
        if (i10 != 12 && i10 != 16) {
            throw new IllegalArgumentException("IV size should be either 12 or 16 bytes");
        }
        this.f12573d = i10;
        kg3.a(bArr.length);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        this.f12572c = secretKeySpec;
        Cipher cipher = f12568e.get();
        cipher.init(1, secretKeySpec);
        byte[] c10 = c(cipher.doFinal(new byte[16]));
        this.f12570a = c10;
        this.f12571b = c(c10);
    }

    public static byte[] b(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        byte[] bArr3 = new byte[length];
        for (int i10 = 0; i10 < length; i10++) {
            bArr3[i10] = (byte) (bArr[i10] ^ bArr2[i10]);
        }
        return bArr3;
    }

    public static byte[] c(byte[] bArr) {
        byte[] bArr2 = new byte[16];
        int i10 = 0;
        while (i10 < 15) {
            byte b10 = bArr[i10];
            int i11 = i10 + 1;
            bArr2[i10] = (byte) (((b10 + b10) ^ ((bArr[i11] & TagConstant.TAG_CAT_RESERVED) >>> 7)) & 255);
            i10 = i11;
        }
        byte b11 = bArr[15];
        bArr2[15] = (byte) (((bArr[0] >> 7) & TsExtractor.TS_STREAM_TYPE_E_AC3) ^ (b11 + b11));
        return bArr2;
    }

    @Override // ai.m53
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        int i10 = this.f12573d;
        if (length <= (Integer.MAX_VALUE - i10) - 16) {
            byte[] bArr3 = new byte[i10 + length + 16];
            byte[] a10 = ig3.a(i10);
            System.arraycopy(a10, 0, bArr3, 0, this.f12573d);
            Cipher cipher = f12568e.get();
            cipher.init(1, this.f12572c);
            byte[] d10 = d(cipher, 0, a10, 0, a10.length);
            byte[] d11 = d(cipher, 1, bArr2, 0, 0);
            Cipher cipher2 = f12569f.get();
            cipher2.init(1, this.f12572c, new IvParameterSpec(d10));
            cipher2.doFinal(bArr, 0, length, bArr3, this.f12573d);
            byte[] d12 = d(cipher, 2, bArr3, this.f12573d, length);
            int i11 = length + this.f12573d;
            for (int i12 = 0; i12 < 16; i12++) {
                bArr3[i11 + i12] = (byte) ((d11[i12] ^ d10[i12]) ^ d12[i12]);
            }
            return bArr3;
        }
        throw new GeneralSecurityException("plaintext too long");
    }

    public final byte[] d(Cipher cipher, int i10, byte[] bArr, int i11, int i12) throws IllegalBlockSizeException, BadPaddingException {
        int length;
        byte[] bArr2;
        byte[] bArr3 = new byte[16];
        bArr3[15] = (byte) i10;
        if (i12 == 0) {
            return cipher.doFinal(b(bArr3, this.f12570a));
        }
        byte[] doFinal = cipher.doFinal(bArr3);
        int i13 = 0;
        int i14 = 0;
        while (i12 - i14 > 16) {
            for (int i15 = 0; i15 < 16; i15++) {
                doFinal[i15] = (byte) (doFinal[i15] ^ bArr[(i11 + i14) + i15]);
            }
            doFinal = cipher.doFinal(doFinal);
            i14 += 16;
        }
        byte[] copyOfRange = Arrays.copyOfRange(bArr, i14 + i11, i11 + i12);
        if (copyOfRange.length == 16) {
            bArr2 = b(copyOfRange, this.f12570a);
        } else {
            byte[] copyOf = Arrays.copyOf(this.f12571b, 16);
            while (true) {
                length = copyOfRange.length;
                if (i13 >= length) {
                    break;
                }
                copyOf[i13] = (byte) (copyOf[i13] ^ copyOfRange[i13]);
                i13++;
            }
            copyOf[length] = (byte) (copyOf[length] ^ 128);
            bArr2 = copyOf;
        }
        return cipher.doFinal(b(doFinal, bArr2));
    }
}
