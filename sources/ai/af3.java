package ai;

import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes3.dex */
public final class af3 implements m53 {

    /* renamed from: b  reason: collision with root package name */
    public static final ThreadLocal<Cipher> f1842b = new ze3();

    /* renamed from: a  reason: collision with root package name */
    public final SecretKey f1843a;

    public af3(byte[] bArr) throws GeneralSecurityException {
        if (e83.a(2)) {
            kg3.a(bArr.length);
            this.f1843a = new SecretKeySpec(bArr, "AES");
            return;
        }
        throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
    }

    @Override // ai.m53
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        AlgorithmParameterSpec gCMParameterSpec;
        int length = bArr.length;
        if (length <= 2147483619) {
            byte[] bArr3 = new byte[length + 28];
            byte[] a10 = ig3.a(12);
            System.arraycopy(a10, 0, bArr3, 0, 12);
            int length2 = a10.length;
            if (jg3.a() && jg3.b() <= 19) {
                gCMParameterSpec = new IvParameterSpec(a10, 0, length2);
            } else {
                gCMParameterSpec = new GCMParameterSpec(128, a10, 0, length2);
            }
            ThreadLocal<Cipher> threadLocal = f1842b;
            threadLocal.get().init(1, this.f1843a, gCMParameterSpec);
            int doFinal = threadLocal.get().doFinal(bArr, 0, length, bArr3, 12);
            if (doFinal == length + 16) {
                return bArr3;
            }
            throw new GeneralSecurityException(String.format("encryption failed; GCM tag must be %s bytes, but got only %s bytes", 16, Integer.valueOf(doFinal - length)));
        }
        throw new GeneralSecurityException("plaintext too long");
    }
}
