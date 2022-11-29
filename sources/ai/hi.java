package ai;

import com.google.android.gms.internal.ads.zzamy;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class hi extends li {

    /* renamed from: e  reason: collision with root package name */
    public final AtomicReference<gi> f4855e = new AtomicReference<>(new gi());

    public hi(mi miVar) {
    }

    public static boolean g(int i10, boolean z10) {
        int i11 = i10 & 3;
        return i11 == 3 || (z10 && i11 == 2);
    }

    public static int h(int i10, int i11) {
        if (i10 == -1) {
            return i11 != -1 ? -1 : 0;
        } else if (i11 == -1) {
            return 1;
        } else {
            return i10 - i11;
        }
    }

    @Override // ai.li
    public final fi[] e(sc[] scVarArr, ci[] ciVarArr, int[][][] iArr) throws zzamy {
        ii iiVar;
        boolean z10;
        bi biVar;
        int[] iArr2;
        ArrayList arrayList;
        boolean z11;
        boolean z12;
        int i10;
        int h10;
        int i11 = 2;
        fi[] fiVarArr = new fi[2];
        gi giVar = this.f4855e.get();
        int i12 = 0;
        boolean z13 = false;
        while (true) {
            int i13 = -1;
            int i14 = 1;
            if (i12 >= i11) {
                break;
            }
            if (scVarArr[i12].zza() == i11) {
                if (!z13) {
                    sc scVar = scVarArr[i12];
                    ci ciVar = ciVarArr[i12];
                    int[][] iArr3 = iArr[i12];
                    int i15 = giVar.f4453d;
                    int i16 = -1;
                    int i17 = 0;
                    bi biVar2 = null;
                    int i18 = 0;
                    int i19 = 0;
                    while (i17 < ciVar.f2835a) {
                        bi a10 = ciVar.a(i17);
                        int i20 = a10.f2352a;
                        ArrayList arrayList2 = new ArrayList(i14);
                        for (int i21 = 0; i21 <= 0; i21++) {
                            arrayList2.add(Integer.valueOf(i21));
                        }
                        int[] iArr4 = iArr3[i17];
                        int i22 = 0;
                        while (i22 <= 0) {
                            ci ciVar2 = ciVar;
                            if (g(iArr4[i22], true)) {
                                oc a11 = a10.a(i22);
                                if (arrayList2.contains(Integer.valueOf(i22))) {
                                    int i23 = a11.F;
                                    biVar = a10;
                                    z11 = true;
                                    z12 = true;
                                } else {
                                    biVar = a10;
                                    z11 = true;
                                    z12 = false;
                                }
                                if (z11 != z12) {
                                    arrayList = arrayList2;
                                    i10 = 1;
                                } else {
                                    arrayList = arrayList2;
                                    i10 = 2;
                                }
                                iArr2 = iArr4;
                                boolean g10 = g(iArr4[i22], false);
                                if (g10) {
                                    i10 += 1000;
                                }
                                boolean z14 = i10 > i19;
                                if (i10 == i19) {
                                    if (a11.k() != i16) {
                                        h10 = h(a11.k(), i16);
                                    } else {
                                        h10 = h(a11.f7712x, i13);
                                    }
                                    z14 = !(g10 && z12) ? h10 >= 0 : h10 <= 0;
                                }
                                if (z14) {
                                    i13 = a11.f7712x;
                                    i16 = a11.k();
                                    i19 = i10;
                                    i18 = i22;
                                    biVar2 = biVar;
                                }
                            } else {
                                biVar = a10;
                                iArr2 = iArr4;
                                arrayList = arrayList2;
                            }
                            i22++;
                            ciVar = ciVar2;
                            a10 = biVar;
                            arrayList2 = arrayList;
                            iArr4 = iArr2;
                        }
                        i17++;
                        i14 = 1;
                    }
                    ii iiVar2 = biVar2 == null ? null : new ii(biVar2, i18, 0, null);
                    fiVarArr[i12] = iiVar2;
                    z13 = iiVar2 != null;
                }
                int i24 = ciVarArr[i12].f2835a;
            }
            i12++;
            i11 = 2;
        }
        int i25 = 0;
        boolean z15 = false;
        while (i25 < i11) {
            if (scVarArr[i25].zza() == 1 && !z15) {
                ci ciVar3 = ciVarArr[i25];
                int[][] iArr5 = iArr[i25];
                String str = giVar.f4450a;
                int i26 = -1;
                int i27 = -1;
                int i28 = 0;
                int i29 = 0;
                while (i28 < ciVar3.f2835a) {
                    bi a12 = ciVar3.a(i28);
                    int[] iArr6 = iArr5[i28];
                    int i30 = i27;
                    int i31 = i26;
                    int i32 = i29;
                    int i33 = 0;
                    while (true) {
                        int i34 = a12.f2352a;
                        if (i33 <= 0) {
                            if (g(iArr6[i33], true)) {
                                oc a13 = a12.a(i33);
                                int i35 = iArr6[i33];
                                int i36 = 1 != (a13.T & 1) ? 1 : 2;
                                if (g(i35, false)) {
                                    i36 += 1000;
                                }
                                if (i36 > i32) {
                                    i31 = i28;
                                    i30 = i33;
                                    i32 = i36;
                                }
                            }
                            i33++;
                        }
                    }
                    i28++;
                    i29 = i32;
                    i26 = i31;
                    i27 = i30;
                }
                if (i26 == -1) {
                    iiVar = null;
                    z10 = false;
                } else {
                    z10 = false;
                    iiVar = new ii(ciVar3.a(i26), i27, 0, null);
                }
                fiVarArr[i25] = iiVar;
                z15 = iiVar != null ? true : z10;
            }
            i25++;
            i11 = 2;
        }
        return fiVarArr;
    }
}
