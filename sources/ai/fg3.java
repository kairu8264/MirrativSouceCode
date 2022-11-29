package ai;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import javax.crypto.Mac;

/* loaded from: classes3.dex */
public final class fg3 implements m93 {

    /* renamed from: a  reason: collision with root package name */
    public final ThreadLocal<Mac> f4022a;

    /* renamed from: b  reason: collision with root package name */
    public final String f4023b;

    /* renamed from: c  reason: collision with root package name */
    public final Key f4024c;

    /* renamed from: d  reason: collision with root package name */
    public final int f4025d;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public fg3(String str, Key key) throws GeneralSecurityException {
        char c10;
        int i10;
        eg3 eg3Var = new eg3(this);
        this.f4022a = eg3Var;
        if (e83.a(2)) {
            this.f4023b = str;
            this.f4024c = key;
            if (key.getEncoded().length >= 16) {
                switch (str.hashCode()) {
                    case -1823053428:
                        if (str.equals("HMACSHA1")) {
                            c10 = 0;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 392315023:
                        if (str.equals("HMACSHA224")) {
                            c10 = 1;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 392315118:
                        if (str.equals("HMACSHA256")) {
                            c10 = 2;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 392316170:
                        if (str.equals("HMACSHA384")) {
                            c10 = 3;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 392317873:
                        if (str.equals("HMACSHA512")) {
                            c10 = 4;
                            break;
                        }
                        c10 = 65535;
                        break;
                    default:
                        c10 = 65535;
                        break;
                }
                if (c10 == 0) {
                    i10 = 20;
                } else if (c10 == 1) {
                    i10 = 28;
                } else if (c10 == 2) {
                    i10 = 32;
                } else if (c10 != 3) {
                    if (c10 != 4) {
                        throw new NoSuchAlgorithmException(str.length() != 0 ? "unknown Hmac algorithm: ".concat(str) : new String("unknown Hmac algorithm: "));
                    }
                    this.f4025d = 64;
                    eg3Var.get();
                    return;
                } else {
                    i10 = 48;
                }
                this.f4025d = i10;
                eg3Var.get();
                return;
            }
            throw new InvalidAlgorithmParameterException("key size too small, need at least 16 bytes");
        }
        throw new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
    }

    @Override // ai.m93
    public final byte[] a(byte[] bArr, int i10) throws GeneralSecurityException {
        if (i10 <= this.f4025d) {
            this.f4022a.get().update(bArr);
            return Arrays.copyOf(this.f4022a.get().doFinal(), i10);
        }
        throw new InvalidAlgorithmParameterException("tag size too big");
    }
}
