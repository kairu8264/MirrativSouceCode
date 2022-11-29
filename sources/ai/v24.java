package ai;

import android.util.Log;
import java.io.IOException;

/* loaded from: classes3.dex */
public final class v24 {
    public static t24 a(nv3 nv3Var) throws IOException {
        byte[] bArr;
        hb hbVar = new hb(16);
        if (u24.a(nv3Var, hbVar).f10585a != 1380533830) {
            return null;
        }
        hv3 hv3Var = (hv3) nv3Var;
        hv3Var.c(hbVar.q(), 0, 4, false);
        hbVar.p(0);
        int D = hbVar.D();
        if (D != 1463899717) {
            StringBuilder sb2 = new StringBuilder(36);
            sb2.append("Unsupported RIFF format: ");
            sb2.append(D);
            Log.e("WavHeaderReader", sb2.toString());
            return null;
        }
        u24 a10 = u24.a(nv3Var, hbVar);
        while (a10.f10585a != 1718449184) {
            hv3Var.r((int) a10.f10586b, false);
            a10 = u24.a(nv3Var, hbVar);
        }
        u9.d(a10.f10586b >= 16);
        hv3Var.c(hbVar.q(), 0, 16, false);
        hbVar.p(0);
        int x10 = hbVar.x();
        int x11 = hbVar.x();
        int c10 = hbVar.c();
        int c11 = hbVar.c();
        int x12 = hbVar.x();
        int x13 = hbVar.x();
        int i10 = ((int) a10.f10586b) - 16;
        if (i10 > 0) {
            byte[] bArr2 = new byte[i10];
            hv3Var.c(bArr2, 0, i10, false);
            bArr = bArr2;
        } else {
            bArr = sb.f9783f;
        }
        return new t24(x10, x11, c10, c11, x12, x13, bArr);
    }
}
