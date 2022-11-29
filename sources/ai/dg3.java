package ai;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes3.dex */
public final class dg3 implements m93 {

    /* renamed from: a  reason: collision with root package name */
    public final SecretKey f3284a;

    /* renamed from: b  reason: collision with root package name */
    public final byte[] f3285b;

    /* renamed from: c  reason: collision with root package name */
    public final byte[] f3286c;

    public dg3(byte[] bArr) throws GeneralSecurityException {
        kg3.a(bArr.length);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        this.f3284a = secretKeySpec;
        Cipher b10 = b();
        b10.init(1, secretKeySpec);
        byte[] a10 = cf3.a(b10.doFinal(new byte[16]));
        this.f3285b = a10;
        this.f3286c = cf3.a(a10);
    }

    public static Cipher b() throws GeneralSecurityException {
        if (e83.a(1)) {
            return rf3.f9423e.b("AES/ECB/NoPadding");
        }
        throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
    }

    @Override // ai.m93
    public final byte[] a(byte[] bArr, int i10) throws GeneralSecurityException {
        byte[] d10;
        if (i10 <= 16) {
            Cipher b10 = b();
            b10.init(1, this.f3284a);
            int length = bArr.length;
            int max = Math.max(1, (int) Math.ceil(length / 16.0d));
            if (max * 16 == length) {
                d10 = df3.b(bArr, (max - 1) * 16, this.f3285b, 0, 16);
            } else {
                d10 = df3.d(cf3.b(Arrays.copyOfRange(bArr, (max - 1) * 16, length)), this.f3286c);
            }
            byte[] bArr2 = new byte[16];
            for (int i11 = 0; i11 < max - 1; i11++) {
                bArr2 = b10.doFinal(df3.b(bArr2, 0, bArr, i11 * 16, 16));
            }
            return Arrays.copyOf(b10.doFinal(df3.d(d10, bArr2)), i10);
        }
        throw new InvalidAlgorithmParameterException("outputLength too large, max is 16 bytes");
    }
}
