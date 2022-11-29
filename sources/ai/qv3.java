package ai;

import com.google.android.gms.internal.ads.zzaha;
import java.io.EOFException;
import java.io.IOException;
import org.checkerframework.dataflow.qual.Pure;

/* loaded from: classes3.dex */
public final class qv3 {
    @Pure
    public static void a(boolean z10, String str) throws zzaha {
        if (!z10) {
            throw zzaha.b(str, null);
        }
    }

    public static int b(nv3 nv3Var, byte[] bArr, int i10, int i11) throws IOException {
        int i12 = 0;
        while (i12 < i11) {
            int p10 = nv3Var.p(bArr, i10 + i12, i11 - i12);
            if (p10 == -1) {
                break;
            }
            i12 += p10;
        }
        return i12;
    }

    public static boolean c(nv3 nv3Var, byte[] bArr, int i10, int i11) throws IOException {
        try {
            ((hv3) nv3Var).f(bArr, i10, i11, false);
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    public static boolean d(nv3 nv3Var, int i10) throws IOException {
        try {
            ((hv3) nv3Var).q(i10, false);
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    public static boolean e(nv3 nv3Var, byte[] bArr, int i10, int i11, boolean z10) throws IOException {
        try {
            return nv3Var.c(bArr, 0, i11, z10);
        } catch (EOFException e10) {
            if (z10) {
                return false;
            }
            throw e10;
        }
    }
}
