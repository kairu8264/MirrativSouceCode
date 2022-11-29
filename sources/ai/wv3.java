package ai;

import java.io.IOException;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class wv3 {
    public static v7 a(nv3 nv3Var, boolean z10) throws IOException {
        v7 a10 = new dw3().a(nv3Var, z10 ? null : x8.f11883a);
        if (a10 == null || a10.a() == 0) {
            return null;
        }
        return a10;
    }

    public static yv3 b(hb hbVar) {
        hbVar.s(1);
        int z10 = hbVar.z();
        long o10 = hbVar.o() + z10;
        int i10 = z10 / 18;
        long[] jArr = new long[i10];
        long[] jArr2 = new long[i10];
        int i11 = 0;
        while (true) {
            if (i11 >= i10) {
                break;
            }
            long F = hbVar.F();
            if (F == -1) {
                jArr = Arrays.copyOf(jArr, i11);
                jArr2 = Arrays.copyOf(jArr2, i11);
                break;
            }
            jArr[i11] = F;
            jArr2[i11] = hbVar.F();
            hbVar.s(2);
            i11++;
        }
        hbVar.s((int) (o10 - hbVar.o()));
        return new yv3(jArr, jArr2);
    }
}
