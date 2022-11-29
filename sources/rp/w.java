package rp;

import com.mirrativ.llstream.protocol.v1.tag.TagConstant;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes4.dex */
public final class w extends xn.c<f> implements RandomAccess {

    /* renamed from: z  reason: collision with root package name */
    public static final a f51731z = new a(null);

    /* renamed from: x  reason: collision with root package name */
    public final f[] f51732x;

    /* renamed from: y  reason: collision with root package name */
    public final int[] f51733y;

    /* loaded from: classes4.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public static /* synthetic */ void b(a aVar, long j10, c cVar, int i10, List list, int i11, int i12, List list2, int i13, Object obj) {
            aVar.a((i13 & 1) != 0 ? 0L : j10, cVar, (i13 & 4) != 0 ? 0 : i10, list, (i13 & 16) != 0 ? 0 : i11, (i13 & 32) != 0 ? list.size() : i12, list2);
        }

        public final void a(long j10, c cVar, int i10, List<? extends f> list, int i11, int i12, List<Integer> list2) {
            int i13;
            int i14;
            int i15;
            int i16;
            int i17;
            c cVar2;
            int i18 = i10;
            if (i11 < i12) {
                if (i11 < i12) {
                    int i19 = i11;
                    while (true) {
                        int i20 = i19 + 1;
                        if (!(list.get(i19).G() >= i18)) {
                            throw new IllegalArgumentException("Failed requirement.".toString());
                        }
                        if (i20 >= i12) {
                            break;
                        }
                        i19 = i20;
                    }
                }
                f fVar = list.get(i11);
                f fVar2 = list.get(i12 - 1);
                int i21 = -1;
                if (i18 == fVar.G()) {
                    int i22 = i11 + 1;
                    i13 = i22;
                    i14 = list2.get(i11).intValue();
                    fVar = list.get(i22);
                } else {
                    i13 = i11;
                    i14 = -1;
                }
                if (fVar.l(i18) != fVar2.l(i18)) {
                    int i23 = i13 + 1;
                    int i24 = 1;
                    if (i23 < i12) {
                        while (true) {
                            int i25 = i23 + 1;
                            if (list.get(i23 - 1).l(i18) != list.get(i23).l(i18)) {
                                i24++;
                            }
                            if (i25 >= i12) {
                                break;
                            }
                            i23 = i25;
                        }
                    }
                    long c10 = j10 + c(cVar) + 2 + (i24 * 2);
                    cVar.H(i24);
                    cVar.H(i14);
                    if (i13 < i12) {
                        int i26 = i13;
                        while (true) {
                            int i27 = i26 + 1;
                            byte l10 = list.get(i26).l(i18);
                            if (i26 == i13 || l10 != list.get(i26 - 1).l(i18)) {
                                cVar.H(l10 & TagConstant.TAG_CAT_RESERVED);
                            }
                            if (i27 >= i12) {
                                break;
                            }
                            i26 = i27;
                        }
                    }
                    c cVar3 = new c();
                    while (i13 < i12) {
                        byte l11 = list.get(i13).l(i18);
                        int i28 = i13 + 1;
                        if (i28 < i12) {
                            int i29 = i28;
                            while (true) {
                                int i30 = i29 + 1;
                                if (l11 != list.get(i29).l(i18)) {
                                    i16 = i29;
                                    break;
                                } else if (i30 >= i12) {
                                    break;
                                } else {
                                    i29 = i30;
                                }
                            }
                        }
                        i16 = i12;
                        if (i28 == i16 && i18 + 1 == list.get(i13).G()) {
                            cVar.H(list2.get(i13).intValue());
                            i17 = i16;
                            cVar2 = cVar3;
                        } else {
                            cVar.H(((int) (c10 + c(cVar3))) * i21);
                            i17 = i16;
                            cVar2 = cVar3;
                            a(c10, cVar3, i18 + 1, list, i13, i16, list2);
                        }
                        cVar3 = cVar2;
                        i13 = i17;
                        i21 = -1;
                    }
                    cVar.H0(cVar3);
                    return;
                }
                int min = Math.min(fVar.G(), fVar2.G());
                if (i18 < min) {
                    int i31 = i18;
                    i15 = 0;
                    while (true) {
                        int i32 = i31 + 1;
                        if (fVar.l(i31) != fVar2.l(i31)) {
                            break;
                        }
                        i15++;
                        if (i32 >= min) {
                            break;
                        }
                        i31 = i32;
                    }
                } else {
                    i15 = 0;
                }
                long c11 = j10 + c(cVar) + 2 + i15 + 1;
                cVar.H(-i15);
                cVar.H(i14);
                int i33 = i18 + i15;
                if (i18 < i33) {
                    while (true) {
                        int i34 = i18 + 1;
                        cVar.H(fVar.l(i18) & TagConstant.TAG_CAT_RESERVED);
                        if (i34 >= i33) {
                            break;
                        }
                        i18 = i34;
                    }
                }
                if (i13 + 1 == i12) {
                    if (i33 == list.get(i13).G()) {
                        cVar.H(list2.get(i13).intValue());
                        return;
                    }
                    throw new IllegalStateException("Check failed.".toString());
                }
                c cVar4 = new c();
                cVar.H(((int) (c(cVar4) + c11)) * (-1));
                a(c11, cVar4, i33, list, i13, i12, list2);
                cVar.H0(cVar4);
                return;
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }

        public final long c(c cVar) {
            return cVar.X() / 4;
        }

        /* JADX WARN: Code restructure failed: missing block: B:55:0x00e4, code lost:
            continue;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final rp.w d(rp.f... r17) {
            /*
                Method dump skipped, instructions count: 316
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: rp.w.a.d(rp.f[]):rp.w");
        }
    }

    public w(f[] fVarArr, int[] iArr) {
        this.f51732x = fVarArr;
        this.f51733y = iArr;
    }

    public /* synthetic */ w(f[] fVarArr, int[] iArr, jo.h hVar) {
        this(fVarArr, iArr);
    }

    public static final w r(f... fVarArr) {
        return f51731z.d(fVarArr);
    }

    @Override // xn.a, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof f) {
            return f((f) obj);
        }
        return false;
    }

    @Override // xn.a
    public int d() {
        return this.f51732x.length;
    }

    public /* bridge */ boolean f(f fVar) {
        return super.contains(fVar);
    }

    @Override // xn.c, java.util.List
    /* renamed from: g */
    public f get(int i10) {
        return this.f51732x[i10];
    }

    @Override // xn.c, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof f) {
            return m((f) obj);
        }
        return -1;
    }

    public final f[] j() {
        return this.f51732x;
    }

    public final int[] k() {
        return this.f51733y;
    }

    @Override // xn.c, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof f) {
            return p((f) obj);
        }
        return -1;
    }

    public /* bridge */ int m(f fVar) {
        return super.indexOf(fVar);
    }

    public /* bridge */ int p(f fVar) {
        return super.lastIndexOf(fVar);
    }
}
