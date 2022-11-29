package ai;

import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes3.dex */
public final class d83 implements m53 {

    /* renamed from: b  reason: collision with root package name */
    public static final ThreadLocal<Cipher> f3178b = new c83();

    /* renamed from: a  reason: collision with root package name */
    public final SecretKey f3179a;

    public d83(byte[] bArr) throws GeneralSecurityException {
        kg3.a(bArr.length);
        this.f3179a = new SecretKeySpec(bArr, "AES");
    }

    @Override // ai.m53
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        AlgorithmParameterSpec ivParameterSpec;
        int length = bArr.length;
        if (length <= 2147483619) {
            byte[] bArr3 = new byte[length + 28];
            byte[] a10 = ig3.a(12);
            System.arraycopy(a10, 0, bArr3, 0, 12);
            int length2 = a10.length;
            try {
                Class.forName("javax.crypto.spec.GCMParameterSpec");
                ivParameterSpec = new GCMParameterSpec(128, a10, 0, length2);
            } catch (ClassNotFoundException unused) {
                if (jg3.a()) {
                    ivParameterSpec = new IvParameterSpec(a10, 0, length2);
                } else {
                    throw new GeneralSecurityException("cannot use AES-GCM: javax.crypto.spec.GCMParameterSpec not found");
                }
            }
            ThreadLocal<Cipher> threadLocal = f3178b;
            threadLocal.get().init(1, this.f3179a, ivParameterSpec);
            int doFinal = threadLocal.get().doFinal(bArr, 0, length, bArr3, 12);
            if (doFinal == length + 16) {
                return bArr3;
            }
            throw new GeneralSecurityException(String.format("encryption failed; GCM tag must be %s bytes, but got only %s bytes", 16, Integer.valueOf(doFinal - length)));
        }
        throw new GeneralSecurityException("plaintext too long");
    }
}
