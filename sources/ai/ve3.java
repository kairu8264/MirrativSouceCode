package ai;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes3.dex */
public final class ve3 implements bg3 {

    /* renamed from: d  reason: collision with root package name */
    public static final ThreadLocal<Cipher> f11045d = new ue3();

    /* renamed from: a  reason: collision with root package name */
    public final SecretKeySpec f11046a;

    /* renamed from: b  reason: collision with root package name */
    public final int f11047b;

    /* renamed from: c  reason: collision with root package name */
    public final int f11048c;

    public ve3(byte[] bArr, int i10) throws GeneralSecurityException {
        if (e83.a(2)) {
            kg3.a(bArr.length);
            this.f11046a = new SecretKeySpec(bArr, "AES");
            int blockSize = f11045d.get().getBlockSize();
            this.f11048c = blockSize;
            if (i10 < 12 || i10 > blockSize) {
                throw new GeneralSecurityException("invalid IV size");
            }
            this.f11047b = i10;
            return;
        }
        throw new GeneralSecurityException("Can not use AES-CTR in FIPS-mode, as BoringCrypto module is not available.");
    }

    @Override // ai.bg3
    public final byte[] a(byte[] bArr) throws GeneralSecurityException {
        int length = bArr.length;
        int i10 = this.f11047b;
        int i11 = Integer.MAX_VALUE - i10;
        if (length <= i11) {
            byte[] bArr2 = new byte[i10 + length];
            byte[] a10 = ig3.a(i10);
            System.arraycopy(a10, 0, bArr2, 0, this.f11047b);
            int i12 = this.f11047b;
            Cipher cipher = f11045d.get();
            byte[] bArr3 = new byte[this.f11048c];
            System.arraycopy(a10, 0, bArr3, 0, this.f11047b);
            cipher.init(1, this.f11046a, new IvParameterSpec(bArr3));
            if (cipher.doFinal(bArr, 0, length, bArr2, i12) == length) {
                return bArr2;
            }
            throw new GeneralSecurityException("stored output's length does not match input's length");
        }
        StringBuilder sb2 = new StringBuilder(43);
        sb2.append("plaintext length can not exceed ");
        sb2.append(i11);
        throw new GeneralSecurityException(sb2.toString());
    }
}
