package a0;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.util.ArrayList;
import java.util.List;
import q1.q0;
import y.f;

/* loaded from: classes.dex */
public final class u {

    /* loaded from: classes.dex */
    public static final class a extends jo.q implements io.l<q0.a, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public static final a f235w = new a();

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
        public final /* synthetic */ List<x> f236w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(List<x> list) {
            super(1);
            this.f236w = list;
        }

        public final void a(q0.a aVar) {
            jo.p.h(aVar, "$this$invoke");
            List<x> list = this.f236w;
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                list.get(i10).r(aVar);
            }
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(q0.a aVar) {
            a(aVar);
            return wn.v.f59242a;
        }
    }

    public static final List<x> a(List<i0> list, int i10, int i11, int i12, int i13, int i14, boolean z10, f.l lVar, f.d dVar, boolean z11, m2.d dVar2) {
        int i15 = z10 ? i11 : i10;
        boolean z12 = i12 < Math.min(i15, i13);
        if (z12) {
            if (!(i14 == 0)) {
                throw new IllegalStateException("Check failed.".toString());
            }
        }
        int size = list.size();
        int i16 = 0;
        for (int i17 = 0; i17 < size; i17++) {
            i16 += list.get(i17).b().length;
        }
        ArrayList arrayList = new ArrayList(i16);
        if (z12) {
            int size2 = list.size();
            int[] iArr = new int[size2];
            for (int i18 = 0; i18 < size2; i18++) {
                iArr[i18] = list.get(b(i18, z11, size2)).c();
            }
            int[] iArr2 = new int[size2];
            for (int i19 = 0; i19 < size2; i19++) {
                iArr2[i19] = 0;
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
                    int i20 = iArr2[k10];
                    i0 i0Var = list.get(b(k10, z11, size2));
                    if (z11) {
                        i20 = (i15 - i20) - i0Var.c();
                    }
                    arrayList.addAll(i0Var.f(i20, i10, i11));
                    if (k10 == m10) {
                        break;
                    }
                    k10 += p10;
                }
            }
        } else {
            int size3 = list.size();
            int i21 = i14;
            for (int i22 = 0; i22 < size3; i22++) {
                i0 i0Var2 = list.get(i22);
                arrayList.addAll(i0Var2.f(i21, i10, i11));
                i21 += i0Var2.d();
            }
        }
        return arrayList;
    }

    public static final int b(int i10, boolean z10, int i11) {
        return !z10 ? i10 : (i11 - i10) - 1;
    }

    public static final v c(int i10, j0 j0Var, h0 h0Var, int i11, int i12, int i13, int i14, int i15, int i16, float f10, long j10, boolean z10, f.l lVar, f.d dVar, boolean z11, m2.d dVar2, j jVar, io.q<? super Integer, ? super Integer, ? super io.l<? super q0.a, wn.v>, ? extends q1.d0> qVar) {
        int i17;
        int i18;
        int i19;
        i0 i0Var;
        int g10;
        int m10;
        j0 j0Var2 = j0Var;
        jo.p.h(j0Var2, "measuredLineProvider");
        jo.p.h(h0Var, "measuredItemProvider");
        jo.p.h(dVar2, "density");
        jo.p.h(jVar, "placementAnimator");
        jo.p.h(qVar, TtmlNode.TAG_LAYOUT);
        if (i13 >= 0) {
            if (i14 >= 0) {
                if (i10 <= 0) {
                    return new v(null, 0, false, 0.0f, qVar.s0(Integer.valueOf(m2.b.p(j10)), Integer.valueOf(m2.b.o(j10)), a.f235w), xn.s.k(), -i13, i11 + i14, 0, z11, z10 ? w.q.Vertical : w.q.Horizontal, i14);
                }
                int c10 = lo.c.c(f10);
                int i20 = i16 - c10;
                int i21 = i15;
                if (l0.d(i21, l0.b(0)) && i20 < 0) {
                    c10 += i20;
                    i20 = 0;
                }
                ArrayList arrayList = new ArrayList();
                int i22 = i20 - i13;
                int i23 = -i13;
                while (i22 < 0 && i21 - l0.b(0) > 0) {
                    i21 = l0.b(i21 - 1);
                    i0 b10 = j0Var2.b(i21);
                    arrayList.add(0, b10);
                    i22 += b10.d();
                }
                if (i22 < i23) {
                    c10 += i22;
                    i22 = i23;
                }
                int i24 = i22 + i13;
                int i25 = i11 + i14;
                int i26 = i21;
                int d10 = po.n.d(i25, 0);
                int i27 = -i24;
                int size = arrayList.size();
                int i28 = i26;
                int i29 = i25;
                for (int i30 = 0; i30 < size; i30++) {
                    i28 = l0.b(i28 + 1);
                    i27 += ((i0) arrayList.get(i30)).d();
                }
                int i31 = i24;
                int i32 = i28;
                while (true) {
                    if (i27 > d10 && !arrayList.isEmpty()) {
                        break;
                    }
                    int i33 = d10;
                    i0 b11 = j0Var2.b(i32);
                    if (b11.e()) {
                        l0.b(i32 - 1);
                        break;
                    }
                    int i34 = i23;
                    int i35 = i29;
                    i27 += b11.d();
                    if (i27 <= i34 && ((g0) xn.o.R(b11.b())).b() != i10 - 1) {
                        i17 = l0.b(i32 + 1);
                        i31 -= b11.d();
                    } else {
                        arrayList.add(b11);
                        i17 = i26;
                    }
                    i32 = l0.b(i32 + 1);
                    d10 = i33;
                    i26 = i17;
                    i23 = i34;
                    i29 = i35;
                    j0Var2 = j0Var;
                }
                if (i27 < i11) {
                    int i36 = i11 - i27;
                    i31 -= i36;
                    i27 += i36;
                    int i37 = i26;
                    while (true) {
                        if (i31 >= i13) {
                            i18 = i23;
                            i19 = 0;
                            break;
                        } else if (i37 - l0.b(0) <= 0) {
                            i19 = 0;
                            i18 = i23;
                            break;
                        } else {
                            i37 = l0.b(i37 - 1);
                            int i38 = i23;
                            i0 b12 = j0Var2.b(i37);
                            arrayList.add(0, b12);
                            i31 += b12.d();
                            i23 = i38;
                        }
                    }
                    c10 += i36;
                    if (i31 < 0) {
                        c10 += i31;
                        i27 += i31;
                        i31 = i19;
                    }
                } else {
                    i18 = i23;
                    i19 = 0;
                }
                float f11 = (lo.c.a(lo.c.c(f10)) != lo.c.a(c10) || Math.abs(lo.c.c(f10)) < Math.abs(c10)) ? f10 : c10;
                int i39 = -i31;
                i0 i0Var2 = (i0) xn.a0.X(arrayList);
                if (i13 > 0) {
                    int size2 = arrayList.size();
                    i0 i0Var3 = i0Var2;
                    int i40 = i19;
                    while (i40 < size2) {
                        int d11 = ((i0) arrayList.get(i40)).d();
                        if (i31 == 0 || d11 > i31 || i40 == xn.s.l(arrayList)) {
                            break;
                        }
                        i31 -= d11;
                        i40++;
                        i0Var3 = (i0) arrayList.get(i40);
                    }
                    i0Var = i0Var3;
                } else {
                    i0Var = i0Var2;
                }
                int i41 = i31;
                if (z10) {
                    g10 = m2.b.n(j10);
                } else {
                    g10 = m2.c.g(j10, i27);
                }
                int i42 = g10;
                if (z10) {
                    m10 = m2.c.f(j10, i27);
                } else {
                    m10 = m2.b.m(j10);
                }
                int i43 = m10;
                int i44 = i29;
                float f12 = f11;
                int i45 = i18;
                List<x> a10 = a(arrayList, i42, i43, i27, i11, i39, z10, lVar, dVar, z11, dVar2);
                int i46 = i27;
                jVar.e((int) f12, i42, i43, i12, z11, a10, h0Var);
                return new v(i0Var, i41, i46 > i11, f12, qVar.s0(Integer.valueOf(i42), Integer.valueOf(i43), new b(a10)), a10, i45, i44, i10, z11, z10 ? w.q.Vertical : w.q.Horizontal, i14);
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }
}
