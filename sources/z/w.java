package z;

import java.util.ArrayList;
import java.util.List;
import q1.q0;
import y.f;

/* loaded from: classes.dex */
public final class w {

    /* loaded from: classes.dex */
    public static final class a extends jo.q implements io.l<q0.a, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public static final a f62374w = new a();

        public a() {
            super(1);
        }

        public final void a(q0.a aVar) {
            jo.p.h(aVar, "$this$invoke");
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(q0.a aVar) {
            a(aVar);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends jo.q implements io.l<q0.a, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ List<b0> f62375w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ b0 f62376x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(List<b0> list, b0 b0Var) {
            super(1);
            this.f62375w = list;
            this.f62376x = b0Var;
        }

        public final void a(q0.a aVar) {
            jo.p.h(aVar, "$this$invoke");
            List<b0> list = this.f62375w;
            b0 b0Var = this.f62376x;
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                b0 b0Var2 = list.get(i10);
                if (b0Var2 != b0Var) {
                    b0Var2.k(aVar);
                }
            }
            b0 b0Var3 = this.f62376x;
            if (b0Var3 != null) {
                b0Var3.k(aVar);
            }
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(q0.a aVar) {
            a(aVar);
            return wn.v.f59242a;
        }
    }

    public static final List<b0> a(List<i0> list, List<i0> list2, List<i0> list3, int i10, int i11, int i12, int i13, int i14, boolean z10, f.l lVar, f.d dVar, boolean z11, m2.d dVar2) {
        int i15 = z10 ? i11 : i10;
        boolean z12 = true;
        boolean z13 = i12 < Math.min(i15, i13);
        if (z13) {
            if (!(i14 == 0)) {
                throw new IllegalStateException("Check failed.".toString());
            }
        }
        ArrayList arrayList = new ArrayList(list.size() + list2.size() + list3.size());
        if (z13) {
            if ((list2.isEmpty() && list3.isEmpty()) ? false : false) {
                int size = list.size();
                int[] iArr = new int[size];
                for (int i16 = 0; i16 < size; i16++) {
                    iArr[i16] = list.get(b(i16, z11, size)).d();
                }
                int[] iArr2 = new int[size];
                for (int i17 = 0; i17 < size; i17++) {
                    iArr2[i17] = 0;
                }
                if (z10) {
                    if (lVar != null) {
                        lVar.c(dVar2, i15, iArr, iArr2);
                    } else {
                        throw new IllegalArgumentException("Required value was null.".toString());
                    }
                } else if (dVar != null) {
                    dVar.b(dVar2, i15, iArr, m2.q.Ltr, iArr2);
                } else {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
                po.g H = xn.o.H(iArr2);
                if (z11) {
                    H = po.n.r(H);
                }
                int k10 = H.k();
                int m10 = H.m();
                int p10 = H.p();
                if ((p10 > 0 && k10 <= m10) || (p10 < 0 && m10 <= k10)) {
                    while (true) {
                        int i18 = iArr2[k10];
                        i0 i0Var = list.get(b(k10, z11, size));
                        if (z11) {
                            i18 = (i15 - i18) - i0Var.d();
                        }
                        arrayList.add(i0Var.f(i18, i10, i11));
                        if (k10 == m10) {
                            break;
                        }
                        k10 += p10;
                    }
                }
            } else {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
        } else {
            int size2 = list2.size();
            int i19 = i14;
            for (int i20 = 0; i20 < size2; i20++) {
                i0 i0Var2 = list2.get(i20);
                i19 -= i0Var2.e();
                arrayList.add(i0Var2.f(i19, i10, i11));
            }
            int size3 = list.size();
            int i21 = i14;
            for (int i22 = 0; i22 < size3; i22++) {
                i0 i0Var3 = list.get(i22);
                arrayList.add(i0Var3.f(i21, i10, i11));
                i21 += i0Var3.e();
            }
            int size4 = list3.size();
            for (int i23 = 0; i23 < size4; i23++) {
                i0 i0Var4 = list3.get(i23);
                arrayList.add(i0Var4.f(i21, i10, i11));
                i21 += i0Var4.e();
            }
        }
        return arrayList;
    }

    public static final int b(int i10, boolean z10, int i11) {
        return !z10 ? i10 : (i11 - i10) - 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x030e  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0329  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0371  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0374  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01ff  */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r4v24, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final z.x c(int r31, z.j0 r32, int r33, int r34, int r35, int r36, int r37, float r38, long r39, boolean r41, java.util.List<java.lang.Integer> r42, y.f.l r43, y.f.d r44, boolean r45, m2.d r46, z.o r47, z.j r48, io.q<? super java.lang.Integer, ? super java.lang.Integer, ? super io.l<? super q1.q0.a, wn.v>, ? extends q1.d0> r49) {
        /*
            Method dump skipped, instructions count: 927
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: z.w.c(int, z.j0, int, int, int, int, int, float, long, boolean, java.util.List, y.f$l, y.f$d, boolean, m2.d, z.o, z.j, io.q):z.x");
    }

    public static final int d(j jVar, int i10) {
        return Math.min(jVar.b(), i10 - 1);
    }

    public static final int e(j jVar, int i10) {
        return Math.min(jVar.c(), i10 - 1);
    }
}
