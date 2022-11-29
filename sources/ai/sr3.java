package ai;

import android.util.Pair;
import com.google.android.gms.internal.ads.zzaeg;

/* loaded from: classes3.dex */
public abstract class sr3 extends ur3 {

    /* renamed from: c  reason: collision with root package name */
    public rr3 f9934c;

    @Override // ai.ur3
    public final void a(Object obj) {
        this.f9934c = (rr3) obj;
    }

    @Override // ai.ur3
    public final wr3 b(v6[] v6VarArr, uz3 uz3Var, bp3 bp3Var, q7 q7Var) throws zzaeg {
        int[] iArr;
        int[] iArr2 = new int[3];
        sx3[][] sx3VarArr = new sx3[3];
        int[][][] iArr3 = new int[3][];
        int i10 = 0;
        for (int i11 = 0; i11 < 3; i11++) {
            int i12 = uz3Var.f10893a;
            sx3VarArr[i11] = new sx3[i12];
            iArr3[i11] = new int[i12];
        }
        int i13 = 2;
        int[] iArr4 = new int[2];
        for (int i14 = 0; i14 < 2; i14++) {
            iArr4[i14] = v6VarArr[i14].I();
        }
        int i15 = 0;
        while (i15 < uz3Var.f10893a) {
            sx3 a10 = uz3Var.a(i15);
            int f10 = ua.f(a10.a(i10).f10960l);
            int i16 = i13;
            int i17 = i10;
            int i18 = i17;
            boolean z10 = true;
            while (i17 < i13) {
                v6 v6Var = v6VarArr[i17];
                int i19 = i10;
                while (i10 <= 0) {
                    i19 = Math.max(i19, v6Var.K(a10.a(i10)) & 7);
                    i10++;
                }
                boolean z11 = iArr2[i17] == 0;
                if (i19 > i18) {
                    z10 = z11;
                    i18 = i19;
                    i16 = i17;
                } else if (i19 == i18 && f10 == 5 && !z10 && z11) {
                    i18 = i19;
                    i16 = i17;
                    z10 = true;
                }
                i17++;
                i13 = 2;
                i10 = 0;
            }
            if (i16 == i13) {
                iArr = new int[1];
            } else {
                v6 v6Var2 = v6VarArr[i16];
                int[] iArr5 = new int[1];
                for (int i20 = 0; i20 <= 0; i20++) {
                    iArr5[i20] = v6Var2.K(a10.a(i20));
                }
                iArr = iArr5;
            }
            int i21 = iArr2[i16];
            sx3VarArr[i16][i21] = a10;
            iArr3[i16][i21] = iArr;
            iArr2[i16] = i21 + 1;
            i15++;
            i13 = 2;
            i10 = 0;
        }
        uz3[] uz3VarArr = new uz3[i13];
        String[] strArr = new String[i13];
        int[] iArr6 = new int[i13];
        int i22 = 0;
        while (i22 < i13) {
            int i23 = iArr2[i22];
            uz3VarArr[i22] = new uz3((sx3[]) sb.K(sx3VarArr[i22], i23));
            iArr3[i22] = (int[][]) sb.K(iArr3[i22], i23);
            strArr[i22] = v6VarArr[i22].b();
            iArr6[i22] = v6VarArr[i22].U();
            i22++;
            i13 = 2;
        }
        int i24 = i13;
        rr3 rr3Var = new rr3(strArr, iArr6, uz3VarArr, iArr4, iArr3, new uz3((sx3[]) sb.K(sx3VarArr[i24], iArr2[i24])));
        Pair<w6[], br3[]> f11 = f(rr3Var, iArr3, iArr4, bp3Var, q7Var);
        return new wr3((w6[]) f11.first, (br3[]) f11.second, rr3Var, null);
    }

    public abstract Pair<w6[], br3[]> f(rr3 rr3Var, int[][][] iArr, int[] iArr2, bp3 bp3Var, q7 q7Var) throws zzaeg;
}
