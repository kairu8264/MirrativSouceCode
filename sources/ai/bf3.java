package ai;

import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.util.Arrays;
import java.util.Collection;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes3.dex */
public final class bf3 implements p53 {

    /* renamed from: c  reason: collision with root package name */
    public static final Collection<Integer> f2323c = Arrays.asList(64);

    /* renamed from: d  reason: collision with root package name */
    public static final byte[] f2324d = new byte[16];

    /* renamed from: a  reason: collision with root package name */
    public final dg3 f2325a;

    /* renamed from: b  reason: collision with root package name */
    public final byte[] f2326b;

    public bf3(byte[] bArr) throws GeneralSecurityException {
        if (e83.a(1)) {
            Collection<Integer> collection = f2323c;
            int length = bArr.length;
            if (collection.contains(Integer.valueOf(length))) {
                int i10 = length >> 1;
                byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, i10);
                this.f2326b = Arrays.copyOfRange(bArr, i10, length);
                this.f2325a = new dg3(copyOfRange);
                return;
            }
            StringBuilder sb2 = new StringBuilder(59);
            sb2.append("invalid key size: ");
            sb2.append(length);
            sb2.append(" bytes; key must have 64 bytes");
            throw new InvalidKeyException(sb2.toString());
        }
        throw new GeneralSecurityException("Can not use AES-SIV in FIPS-mode.");
    }

    @Override // ai.p53
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] d10;
        if (bArr.length <= 2147483631) {
            Cipher b10 = rf3.f9423e.b("AES/CTR/NoPadding");
            byte[][] bArr3 = {bArr2, bArr};
            byte[] a10 = this.f2325a.a(f2324d, 16);
            for (int i10 = 0; i10 <= 0; i10++) {
                byte[] bArr4 = bArr3[i10];
                if (bArr4 == null) {
                    bArr4 = new byte[0];
                }
                a10 = df3.d(cf3.a(a10), this.f2325a.a(bArr4, 16));
            }
            byte[] bArr5 = bArr3[1];
            int length = bArr5.length;
            if (length >= 16) {
                int length2 = a10.length;
                if (length >= length2) {
                    int i11 = length - length2;
                    d10 = Arrays.copyOf(bArr5, length);
                    for (int i12 = 0; i12 < a10.length; i12++) {
                        int i13 = i11 + i12;
                        d10[i13] = (byte) (d10[i13] ^ a10[i12]);
                    }
                } else {
                    throw new IllegalArgumentException("xorEnd requires a.length >= b.length");
                }
            } else {
                d10 = df3.d(cf3.b(bArr5), cf3.a(a10));
            }
            byte[] a11 = this.f2325a.a(d10, 16);
            byte[] bArr6 = (byte[]) a11.clone();
            bArr6[8] = (byte) (bArr6[8] & Byte.MAX_VALUE);
            bArr6[12] = (byte) (bArr6[12] & Byte.MAX_VALUE);
            b10.init(1, new SecretKeySpec(this.f2326b, "AES"), new IvParameterSpec(bArr6));
            return df3.a(a11, b10.doFinal(bArr));
        }
        throw new GeneralSecurityException("plaintext too long");
    }
}
