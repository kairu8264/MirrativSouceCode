package ai;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import com.google.android.gms.internal.ads.zzamy;
import java.util.Arrays;
import java.util.Map;

/* loaded from: classes3.dex */
public abstract class li extends pi {

    /* renamed from: b  reason: collision with root package name */
    public final SparseArray<Map<ci, ki>> f6568b = new SparseArray<>();

    /* renamed from: c  reason: collision with root package name */
    public final SparseBooleanArray f6569c = new SparseBooleanArray();

    /* renamed from: d  reason: collision with root package name */
    public ji f6570d;

    @Override // ai.pi
    public final qi a(sc[] scVarArr, ci ciVar) throws zzamy {
        int[] iArr;
        int[] iArr2 = new int[3];
        bi[][] biVarArr = new bi[3];
        int[][][] iArr3 = new int[3][];
        for (int i10 = 0; i10 < 3; i10++) {
            int i11 = ciVar.f2835a;
            biVarArr[i10] = new bi[i11];
            iArr3[i10] = new int[i11];
        }
        int i12 = 2;
        int[] iArr4 = new int[2];
        for (int i13 = 0; i13 < 2; i13++) {
            scVarArr[i13].l();
            iArr4[i13] = 4;
        }
        int i14 = 0;
        while (i14 < ciVar.f2835a) {
            bi a10 = ciVar.a(i14);
            int i15 = i12;
            int i16 = 0;
            int i17 = 0;
            while (true) {
                if (i16 >= i12) {
                    i16 = i15;
                    break;
                }
                sc scVar = scVarArr[i16];
                int i18 = 0;
                while (true) {
                    int i19 = a10.f2352a;
                    if (i18 <= 0) {
                        int m10 = scVar.m(a10.a(i18)) & 3;
                        if (m10 > i17) {
                            if (m10 == 3) {
                                break;
                            }
                            i15 = i16;
                            i17 = m10;
                        }
                        i18++;
                    }
                }
                i16++;
                i12 = 2;
            }
            if (i16 == 2) {
                int i20 = a10.f2352a;
                iArr = new int[1];
            } else {
                sc scVar2 = scVarArr[i16];
                int i21 = a10.f2352a;
                int[] iArr5 = new int[1];
                for (int i22 = 0; i22 <= 0; i22++) {
                    iArr5[i22] = scVar2.m(a10.a(i22));
                }
                iArr = iArr5;
            }
            int i23 = iArr2[i16];
            biVarArr[i16][i23] = a10;
            iArr3[i16][i23] = iArr;
            iArr2[i16] = i23 + 1;
            i14++;
            i12 = 2;
        }
        int i24 = i12;
        ci[] ciVarArr = new ci[i24];
        int[] iArr6 = new int[i24];
        int i25 = 0;
        while (i25 < i24) {
            int i26 = iArr2[i25];
            ciVarArr[i25] = new ci((bi[]) Arrays.copyOf(biVarArr[i25], i26));
            iArr3[i25] = (int[][]) Arrays.copyOf(iArr3[i25], i26);
            iArr6[i25] = scVarArr[i25].zza();
            i25++;
            i24 = 2;
        }
        int i27 = i24;
        ci ciVar2 = new ci((bi[]) Arrays.copyOf(biVarArr[i27], iArr2[i27]));
        fi[] e10 = e(scVarArr, ciVarArr, iArr3);
        int i28 = 0;
        while (i28 < i27) {
            if (this.f6569c.get(i28)) {
                e10[i28] = null;
            } else {
                ci ciVar3 = ciVarArr[i28];
                Map<ci, ki> map = this.f6568b.get(i28);
                if ((map == null ? null : map.get(ciVar3)) != null) {
                    throw null;
                }
            }
            i28++;
            i27 = 2;
        }
        ji jiVar = new ji(iArr6, ciVarArr, iArr4, iArr3, ciVar2);
        tc[] tcVarArr = new tc[2];
        for (int i29 = 0; i29 < 2; i29++) {
            tcVarArr[i29] = e10[i29] != null ? tc.f10231b : null;
        }
        return new qi(ciVar, new ni(e10, null), jiVar, tcVarArr);
    }

    @Override // ai.pi
    public final void b(Object obj) {
        this.f6570d = (ji) obj;
    }

    public abstract fi[] e(sc[] scVarArr, ci[] ciVarArr, int[][][] iArr) throws zzamy;

    public final void f(int i10, boolean z10) {
        if (this.f6569c.get(i10) == z10) {
            return;
        }
        this.f6569c.put(i10, z10);
        d();
    }
}
