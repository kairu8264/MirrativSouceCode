package ai;

import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;

/* loaded from: classes3.dex */
public final class y83 {
    public static void a(dc3 dc3Var) throws GeneralSecurityException {
        of3.d(c(dc3Var.B().G()));
        b(dc3Var.B().H());
        if (dc3Var.I() != 2) {
            t63.g(dc3Var.C().B());
            return;
        }
        throw new GeneralSecurityException("unknown EC point format");
    }

    public static String b(int i10) throws NoSuchAlgorithmException {
        int i11 = i10 - 2;
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 != 4) {
                        if (i11 == 5) {
                            return "HmacSha224";
                        }
                        throw new NoSuchAlgorithmException("hash unsupported for HMAC: ".concat(Integer.toString(sc3.a(i10))));
                    }
                    return "HmacSha512";
                }
                return "HmacSha256";
            }
            return "HmacSha384";
        }
        return "HmacSha1";
    }

    public static int c(int i10) throws GeneralSecurityException {
        int i11 = i10 - 2;
        if (i11 != 2) {
            if (i11 != 3) {
                if (i11 == 4) {
                    return 3;
                }
                throw new GeneralSecurityException("unknown curve type: ".concat(Integer.toString(qc3.a(i10))));
            }
            return 2;
        }
        return 1;
    }

    public static int d(int i10) throws GeneralSecurityException {
        int i11 = i10 - 2;
        int i12 = 1;
        if (i11 != 1) {
            i12 = 2;
            if (i11 != 2) {
                if (i11 == 3) {
                    return 3;
                }
                throw new GeneralSecurityException("unknown point format: ".concat(Integer.toString(ub3.a(i10))));
            }
        }
        return i12;
    }
}
