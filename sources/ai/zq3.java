package ai;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes3.dex */
public final class zq3 extends br3 {

    /* renamed from: f  reason: collision with root package name */
    public final ds3 f13073f;

    /* renamed from: g  reason: collision with root package name */
    public final zz2<xq3> f13074g;

    /* renamed from: h  reason: collision with root package name */
    public final v9 f13075h;

    public zq3(sx3 sx3Var, int[] iArr, int i10, ds3 ds3Var, long j10, long j11, long j12, float f10, float f11, List<xq3> list, v9 v9Var) {
        super(sx3Var, iArr, 0);
        this.f13073f = ds3Var;
        this.f13074g = zz2.A(list);
        this.f13075h = v9Var;
    }

    public static /* synthetic */ zz2<zz2<xq3>> e(pr3[] pr3VarArr) {
        int i10;
        int i11;
        int[] iArr;
        ArrayList arrayList = new ArrayList();
        int i12 = 0;
        int i13 = 0;
        while (true) {
            i10 = 2;
            i11 = 1;
            if (i13 >= 2) {
                break;
            }
            pr3 pr3Var = pr3VarArr[i13];
            if (pr3Var != null && pr3Var.f8539b.length > 1) {
                wz2 K = zz2.K();
                K.f(new xq3(0L, 0L));
                arrayList.add(K);
            } else {
                arrayList.add(null);
            }
            i13++;
        }
        long[][] jArr = new long[2];
        for (int i14 = 0; i14 < 2; i14++) {
            pr3 pr3Var2 = pr3VarArr[i14];
            if (pr3Var2 == null) {
                jArr[i14] = new long[0];
            } else {
                jArr[i14] = new long[pr3Var2.f8539b.length];
                int i15 = 0;
                while (true) {
                    if (i15 >= pr3Var2.f8539b.length) {
                        break;
                    }
                    jArr[i14][i15] = pr3Var2.f8538a.a(iArr[i15]).f10956h;
                    i15++;
                }
                Arrays.sort(jArr[i14]);
            }
        }
        int[] iArr2 = new int[2];
        long[] jArr2 = new long[2];
        for (int i16 = 0; i16 < 2; i16++) {
            long[] jArr3 = jArr[i16];
            jArr2[i16] = jArr3.length == 0 ? 0L : jArr3[0];
        }
        f(arrayList, jArr2);
        o03 c10 = g13.b(l13.b()).b(2).c();
        int i17 = 0;
        while (i17 < i10) {
            int length = jArr[i17].length;
            if (length > i11) {
                double[] dArr = new double[length];
                int i18 = i12;
                while (true) {
                    long[] jArr4 = jArr[i17];
                    double d10 = 0.0d;
                    if (i18 >= jArr4.length) {
                        break;
                    }
                    long j10 = jArr4[i18];
                    if (j10 != -1) {
                        d10 = Math.log(j10);
                    }
                    dArr[i18] = d10;
                    i18++;
                }
                int i19 = length - 1;
                double d11 = dArr[i19] - dArr[i12];
                int i20 = i12;
                while (i20 < i19) {
                    int i21 = i20 + 1;
                    c10.a(Double.valueOf(d11 == 0.0d ? 1.0d : (((dArr[i20] + dArr[i21]) * 0.5d) - dArr[i12]) / d11), Integer.valueOf(i17));
                    i20 = i21;
                    i12 = 0;
                }
            }
            i17++;
            i12 = 0;
            i10 = 2;
            i11 = 1;
        }
        zz2 A = zz2.A(c10.m());
        for (int i22 = 0; i22 < A.size(); i22++) {
            int intValue = ((Integer) A.get(i22)).intValue();
            int i23 = iArr2[intValue] + 1;
            iArr2[intValue] = i23;
            jArr2[intValue] = jArr[intValue][i23];
            f(arrayList, jArr2);
        }
        for (int i24 = 0; i24 < 2; i24++) {
            if (arrayList.get(i24) != null) {
                long j11 = jArr2[i24];
                jArr2[i24] = j11 + j11;
            }
        }
        f(arrayList, jArr2);
        wz2 K2 = zz2.K();
        for (int i25 = 0; i25 < arrayList.size(); i25++) {
            wz2 wz2Var = (wz2) arrayList.get(i25);
            K2.f(wz2Var == null ? zz2.r() : wz2Var.g());
        }
        return K2.g();
    }

    public static void f(List<wz2<xq3>> list, long[] jArr) {
        long j10 = 0;
        for (int i10 = 0; i10 < 2; i10++) {
            j10 += jArr[i10];
        }
        for (int i11 = 0; i11 < list.size(); i11++) {
            wz2<xq3> wz2Var = list.get(i11);
            if (wz2Var != null) {
                wz2Var.f(new xq3(j10, jArr[i11]));
            }
        }
    }
}
