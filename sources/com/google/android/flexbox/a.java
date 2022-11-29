package com.google.android.flexbox;

import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import o3.i;
import s3.d;

/* loaded from: classes3.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    public final qg.a f27129a;

    /* renamed from: b  reason: collision with root package name */
    public boolean[] f27130b;

    /* renamed from: c  reason: collision with root package name */
    public int[] f27131c;

    /* renamed from: d  reason: collision with root package name */
    public long[] f27132d;

    /* renamed from: e  reason: collision with root package name */
    public long[] f27133e;

    /* loaded from: classes3.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public List<qg.c> f27134a;

        /* renamed from: b  reason: collision with root package name */
        public int f27135b;

        public void a() {
            this.f27134a = null;
            this.f27135b = 0;
        }
    }

    /* loaded from: classes3.dex */
    public static class c implements Comparable<c> {

        /* renamed from: w  reason: collision with root package name */
        public int f27136w;

        /* renamed from: x  reason: collision with root package name */
        public int f27137x;

        public c() {
        }

        @Override // java.lang.Comparable
        /* renamed from: a */
        public int compareTo(c cVar) {
            int i10 = this.f27137x;
            int i11 = cVar.f27137x;
            return i10 != i11 ? i10 - i11 : this.f27136w - cVar.f27136w;
        }

        public String toString() {
            return "Order{order=" + this.f27137x + ", index=" + this.f27136w + '}';
        }
    }

    public a(qg.a aVar) {
        this.f27129a = aVar;
    }

    public final int A(int i10, qg.b bVar, int i11) {
        qg.a aVar = this.f27129a;
        int b10 = aVar.b(i10, aVar.getPaddingLeft() + this.f27129a.getPaddingRight() + bVar.m1() + bVar.G1() + i11, bVar.getWidth());
        int size = View.MeasureSpec.getSize(b10);
        if (size > bVar.M0()) {
            return View.MeasureSpec.makeMeasureSpec(bVar.M0(), View.MeasureSpec.getMode(b10));
        }
        return size < bVar.N() ? View.MeasureSpec.makeMeasureSpec(bVar.N(), View.MeasureSpec.getMode(b10)) : b10;
    }

    public final int B(qg.b bVar, boolean z10) {
        if (z10) {
            return bVar.j1();
        }
        return bVar.G1();
    }

    public final int C(qg.b bVar, boolean z10) {
        if (z10) {
            return bVar.G1();
        }
        return bVar.j1();
    }

    public final int D(qg.b bVar, boolean z10) {
        if (z10) {
            return bVar.d0();
        }
        return bVar.m1();
    }

    public final int E(qg.b bVar, boolean z10) {
        if (z10) {
            return bVar.m1();
        }
        return bVar.d0();
    }

    public final int F(qg.b bVar, boolean z10) {
        if (z10) {
            return bVar.getHeight();
        }
        return bVar.getWidth();
    }

    public final int G(qg.b bVar, boolean z10) {
        if (z10) {
            return bVar.getWidth();
        }
        return bVar.getHeight();
    }

    public final int H(boolean z10) {
        if (z10) {
            return this.f27129a.getPaddingBottom();
        }
        return this.f27129a.getPaddingEnd();
    }

    public final int I(boolean z10) {
        if (z10) {
            return this.f27129a.getPaddingEnd();
        }
        return this.f27129a.getPaddingBottom();
    }

    public final int J(boolean z10) {
        if (z10) {
            return this.f27129a.getPaddingTop();
        }
        return this.f27129a.getPaddingStart();
    }

    public final int K(boolean z10) {
        if (z10) {
            return this.f27129a.getPaddingStart();
        }
        return this.f27129a.getPaddingTop();
    }

    public final int L(View view, boolean z10) {
        if (z10) {
            return view.getMeasuredHeight();
        }
        return view.getMeasuredWidth();
    }

    public final int M(View view, boolean z10) {
        if (z10) {
            return view.getMeasuredWidth();
        }
        return view.getMeasuredHeight();
    }

    public final boolean N(int i10, int i11, qg.c cVar) {
        return i10 == i11 - 1 && cVar.c() != 0;
    }

    public boolean O(SparseIntArray sparseIntArray) {
        int flexItemCount = this.f27129a.getFlexItemCount();
        if (sparseIntArray.size() != flexItemCount) {
            return true;
        }
        for (int i10 = 0; i10 < flexItemCount; i10++) {
            View d10 = this.f27129a.d(i10);
            if (d10 != null && ((qg.b) d10.getLayoutParams()).getOrder() != sparseIntArray.get(i10)) {
                return true;
            }
        }
        return false;
    }

    public final boolean P(View view, int i10, int i11, int i12, int i13, qg.b bVar, int i14, int i15, int i16) {
        if (this.f27129a.getFlexWrap() == 0) {
            return false;
        }
        if (bVar.B0()) {
            return true;
        }
        if (i10 == 0) {
            return false;
        }
        int maxLine = this.f27129a.getMaxLine();
        if (maxLine == -1 || maxLine > i16 + 1) {
            int j10 = this.f27129a.j(view, i14, i15);
            if (j10 > 0) {
                i13 += j10;
            }
            return i11 < i12 + i13;
        }
        return false;
    }

    public void Q(View view, qg.c cVar, int i10, int i11, int i12, int i13) {
        qg.b bVar = (qg.b) view.getLayoutParams();
        int alignItems = this.f27129a.getAlignItems();
        if (bVar.K() != -1) {
            alignItems = bVar.K();
        }
        int i14 = cVar.f49477g;
        if (alignItems != 0) {
            if (alignItems == 1) {
                if (this.f27129a.getFlexWrap() != 2) {
                    int i15 = i11 + i14;
                    view.layout(i10, (i15 - view.getMeasuredHeight()) - bVar.j1(), i12, i15 - bVar.j1());
                    return;
                }
                view.layout(i10, (i11 - i14) + view.getMeasuredHeight() + bVar.d0(), i12, (i13 - i14) + view.getMeasuredHeight() + bVar.d0());
                return;
            } else if (alignItems == 2) {
                int measuredHeight = (((i14 - view.getMeasuredHeight()) + bVar.d0()) - bVar.j1()) / 2;
                if (this.f27129a.getFlexWrap() != 2) {
                    int i16 = i11 + measuredHeight;
                    view.layout(i10, i16, i12, view.getMeasuredHeight() + i16);
                    return;
                }
                int i17 = i11 - measuredHeight;
                view.layout(i10, i17, i12, view.getMeasuredHeight() + i17);
                return;
            } else if (alignItems == 3) {
                if (this.f27129a.getFlexWrap() != 2) {
                    int max = Math.max(cVar.f49482l - view.getBaseline(), bVar.d0());
                    view.layout(i10, i11 + max, i12, i13 + max);
                    return;
                }
                int max2 = Math.max((cVar.f49482l - view.getMeasuredHeight()) + view.getBaseline(), bVar.j1());
                view.layout(i10, i11 - max2, i12, i13 - max2);
                return;
            } else if (alignItems != 4) {
                return;
            }
        }
        if (this.f27129a.getFlexWrap() != 2) {
            view.layout(i10, i11 + bVar.d0(), i12, i13 + bVar.d0());
        } else {
            view.layout(i10, i11 - bVar.j1(), i12, i13 - bVar.j1());
        }
    }

    public void R(View view, qg.c cVar, boolean z10, int i10, int i11, int i12, int i13) {
        qg.b bVar = (qg.b) view.getLayoutParams();
        int alignItems = this.f27129a.getAlignItems();
        if (bVar.K() != -1) {
            alignItems = bVar.K();
        }
        int i14 = cVar.f49477g;
        if (alignItems != 0) {
            if (alignItems == 1) {
                if (!z10) {
                    view.layout(((i10 + i14) - view.getMeasuredWidth()) - bVar.G1(), i11, ((i12 + i14) - view.getMeasuredWidth()) - bVar.G1(), i13);
                    return;
                } else {
                    view.layout((i10 - i14) + view.getMeasuredWidth() + bVar.m1(), i11, (i12 - i14) + view.getMeasuredWidth() + bVar.m1(), i13);
                    return;
                }
            } else if (alignItems == 2) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                int measuredWidth = (((i14 - view.getMeasuredWidth()) + i.b(marginLayoutParams)) - i.a(marginLayoutParams)) / 2;
                if (!z10) {
                    view.layout(i10 + measuredWidth, i11, i12 + measuredWidth, i13);
                    return;
                } else {
                    view.layout(i10 - measuredWidth, i11, i12 - measuredWidth, i13);
                    return;
                }
            } else if (alignItems != 3 && alignItems != 4) {
                return;
            }
        }
        if (!z10) {
            view.layout(i10 + bVar.m1(), i11, i12 + bVar.m1(), i13);
        } else {
            view.layout(i10 - bVar.G1(), i11, i12 - bVar.G1(), i13);
        }
    }

    public long S(int i10, int i11) {
        return (i10 & 4294967295L) | (i11 << 32);
    }

    public final void T(int i10, int i11, qg.c cVar, int i12, int i13, boolean z10) {
        int i14;
        int i15;
        int i16;
        int i17 = cVar.f49475e;
        float f10 = cVar.f49481k;
        float f11 = 0.0f;
        if (f10 <= 0.0f || i12 > i17) {
            return;
        }
        float f12 = (i17 - i12) / f10;
        cVar.f49475e = i13 + cVar.f49476f;
        if (!z10) {
            cVar.f49477g = Integer.MIN_VALUE;
        }
        int i18 = 0;
        boolean z11 = false;
        int i19 = 0;
        float f13 = 0.0f;
        while (i18 < cVar.f49478h) {
            int i20 = cVar.f49485o + i18;
            View h10 = this.f27129a.h(i20);
            if (h10 == null || h10.getVisibility() == 8) {
                i14 = i17;
                i15 = i18;
            } else {
                qg.b bVar = (qg.b) h10.getLayoutParams();
                int flexDirection = this.f27129a.getFlexDirection();
                if (flexDirection != 0 && flexDirection != 1) {
                    int measuredHeight = h10.getMeasuredHeight();
                    long[] jArr = this.f27133e;
                    if (jArr != null) {
                        measuredHeight = x(jArr[i20]);
                    }
                    int measuredWidth = h10.getMeasuredWidth();
                    long[] jArr2 = this.f27133e;
                    if (jArr2 != null) {
                        measuredWidth = y(jArr2[i20]);
                    }
                    if (this.f27130b[i20] || bVar.L() <= f11) {
                        i14 = i17;
                        i15 = i18;
                    } else {
                        float L = measuredHeight - (bVar.L() * f12);
                        if (i18 == cVar.f49478h - 1) {
                            L += f13;
                            f13 = f11;
                        }
                        int round = Math.round(L);
                        if (round < bVar.I1()) {
                            round = bVar.I1();
                            this.f27130b[i20] = true;
                            cVar.f49481k -= bVar.L();
                            i14 = i17;
                            i15 = i18;
                            z11 = true;
                        } else {
                            f13 += L - round;
                            i14 = i17;
                            i15 = i18;
                            double d10 = f13;
                            if (d10 > 1.0d) {
                                round++;
                                f13 -= 1.0f;
                            } else if (d10 < -1.0d) {
                                round--;
                                f13 += 1.0f;
                            }
                        }
                        int A = A(i10, bVar, cVar.f49483m);
                        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(round, 1073741824);
                        h10.measure(A, makeMeasureSpec);
                        measuredWidth = h10.getMeasuredWidth();
                        int measuredHeight2 = h10.getMeasuredHeight();
                        Z(i20, A, makeMeasureSpec, h10);
                        this.f27129a.i(i20, h10);
                        measuredHeight = measuredHeight2;
                    }
                    i16 = Math.max(i19, measuredWidth + bVar.m1() + bVar.G1() + this.f27129a.f(h10));
                    cVar.f49475e += measuredHeight + bVar.d0() + bVar.j1();
                } else {
                    i14 = i17;
                    int i21 = i18;
                    int measuredWidth2 = h10.getMeasuredWidth();
                    long[] jArr3 = this.f27133e;
                    if (jArr3 != null) {
                        measuredWidth2 = y(jArr3[i20]);
                    }
                    int measuredHeight3 = h10.getMeasuredHeight();
                    long[] jArr4 = this.f27133e;
                    if (jArr4 != null) {
                        measuredHeight3 = x(jArr4[i20]);
                    }
                    if (this.f27130b[i20] || bVar.L() <= 0.0f) {
                        i15 = i21;
                    } else {
                        float L2 = measuredWidth2 - (bVar.L() * f12);
                        i15 = i21;
                        if (i15 == cVar.f49478h - 1) {
                            L2 += f13;
                            f13 = 0.0f;
                        }
                        int round2 = Math.round(L2);
                        if (round2 < bVar.N()) {
                            round2 = bVar.N();
                            this.f27130b[i20] = true;
                            cVar.f49481k -= bVar.L();
                            z11 = true;
                        } else {
                            f13 += L2 - round2;
                            double d11 = f13;
                            if (d11 > 1.0d) {
                                round2++;
                                f13 -= 1.0f;
                            } else if (d11 < -1.0d) {
                                round2--;
                                f13 += 1.0f;
                            }
                        }
                        int z12 = z(i11, bVar, cVar.f49483m);
                        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(round2, 1073741824);
                        h10.measure(makeMeasureSpec2, z12);
                        int measuredWidth3 = h10.getMeasuredWidth();
                        int measuredHeight4 = h10.getMeasuredHeight();
                        Z(i20, makeMeasureSpec2, z12, h10);
                        this.f27129a.i(i20, h10);
                        measuredWidth2 = measuredWidth3;
                        measuredHeight3 = measuredHeight4;
                    }
                    int max = Math.max(i19, measuredHeight3 + bVar.d0() + bVar.j1() + this.f27129a.f(h10));
                    cVar.f49475e += measuredWidth2 + bVar.m1() + bVar.G1();
                    i16 = max;
                }
                cVar.f49477g = Math.max(cVar.f49477g, i16);
                i19 = i16;
            }
            i18 = i15 + 1;
            i17 = i14;
            f11 = 0.0f;
        }
        int i22 = i17;
        if (!z11 || i22 == cVar.f49475e) {
            return;
        }
        T(i10, i11, cVar, i12, i13, true);
    }

    public final int[] U(int i10, List<c> list, SparseIntArray sparseIntArray) {
        Collections.sort(list);
        sparseIntArray.clear();
        int[] iArr = new int[i10];
        int i11 = 0;
        for (c cVar : list) {
            int i12 = cVar.f27136w;
            iArr[i11] = i12;
            sparseIntArray.append(i12, cVar.f27137x);
            i11++;
        }
        return iArr;
    }

    public final void V(View view, int i10, int i11) {
        int measuredHeight;
        qg.b bVar = (qg.b) view.getLayoutParams();
        int min = Math.min(Math.max(((i10 - bVar.m1()) - bVar.G1()) - this.f27129a.f(view), bVar.N()), bVar.M0());
        long[] jArr = this.f27133e;
        if (jArr != null) {
            measuredHeight = x(jArr[i11]);
        } else {
            measuredHeight = view.getMeasuredHeight();
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(min, 1073741824);
        view.measure(makeMeasureSpec2, makeMeasureSpec);
        Z(i11, makeMeasureSpec2, makeMeasureSpec, view);
        this.f27129a.i(i11, view);
    }

    public final void W(View view, int i10, int i11) {
        int measuredWidth;
        qg.b bVar = (qg.b) view.getLayoutParams();
        int min = Math.min(Math.max(((i10 - bVar.d0()) - bVar.j1()) - this.f27129a.f(view), bVar.I1()), bVar.K1());
        long[] jArr = this.f27133e;
        if (jArr != null) {
            measuredWidth = y(jArr[i11]);
        } else {
            measuredWidth = view.getMeasuredWidth();
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(min, 1073741824);
        view.measure(makeMeasureSpec, makeMeasureSpec2);
        Z(i11, makeMeasureSpec, makeMeasureSpec2, view);
        this.f27129a.i(i11, view);
    }

    public void X() {
        Y(0);
    }

    public void Y(int i10) {
        View h10;
        if (i10 >= this.f27129a.getFlexItemCount()) {
            return;
        }
        int flexDirection = this.f27129a.getFlexDirection();
        if (this.f27129a.getAlignItems() == 4) {
            int[] iArr = this.f27131c;
            List<qg.c> flexLinesInternal = this.f27129a.getFlexLinesInternal();
            int size = flexLinesInternal.size();
            for (int i11 = iArr != null ? iArr[i10] : 0; i11 < size; i11++) {
                qg.c cVar = flexLinesInternal.get(i11);
                int i12 = cVar.f49478h;
                for (int i13 = 0; i13 < i12; i13++) {
                    int i14 = cVar.f49485o + i13;
                    if (i13 < this.f27129a.getFlexItemCount() && (h10 = this.f27129a.h(i14)) != null && h10.getVisibility() != 8) {
                        qg.b bVar = (qg.b) h10.getLayoutParams();
                        if (bVar.K() == -1 || bVar.K() == 4) {
                            if (flexDirection == 0 || flexDirection == 1) {
                                W(h10, cVar.f49477g, i14);
                            } else if (flexDirection != 2 && flexDirection != 3) {
                                throw new IllegalArgumentException("Invalid flex direction: " + flexDirection);
                            } else {
                                V(h10, cVar.f49477g, i14);
                            }
                        }
                    }
                }
            }
            return;
        }
        for (qg.c cVar2 : this.f27129a.getFlexLinesInternal()) {
            for (Integer num : cVar2.f49484n) {
                View h11 = this.f27129a.h(num.intValue());
                if (flexDirection == 0 || flexDirection == 1) {
                    W(h11, cVar2.f49477g, num.intValue());
                } else if (flexDirection != 2 && flexDirection != 3) {
                    throw new IllegalArgumentException("Invalid flex direction: " + flexDirection);
                } else {
                    V(h11, cVar2.f49477g, num.intValue());
                }
            }
        }
    }

    public final void Z(int i10, int i11, int i12, View view) {
        long[] jArr = this.f27132d;
        if (jArr != null) {
            jArr[i10] = S(i11, i12);
        }
        long[] jArr2 = this.f27133e;
        if (jArr2 != null) {
            jArr2[i10] = S(view.getMeasuredWidth(), view.getMeasuredHeight());
        }
    }

    public final void a(List<qg.c> list, qg.c cVar, int i10, int i11) {
        cVar.f49483m = i11;
        this.f27129a.g(cVar);
        cVar.f49486p = i10;
        list.add(cVar);
    }

    public void b(b bVar, int i10, int i11, int i12, int i13, int i14, List<qg.c> list) {
        int i15;
        b bVar2;
        int i16;
        int i17;
        int i18;
        List<qg.c> list2;
        int i19;
        View view;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26 = i10;
        int i27 = i11;
        int i28 = i14;
        boolean l10 = this.f27129a.l();
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        ArrayList arrayList = list == null ? new ArrayList() : list;
        bVar.f27134a = arrayList;
        boolean z10 = i28 == -1;
        int K = K(l10);
        int I = I(l10);
        int J = J(l10);
        int H = H(l10);
        qg.c cVar = new qg.c();
        int i29 = i13;
        cVar.f49485o = i29;
        int i30 = I + K;
        cVar.f49475e = i30;
        int flexItemCount = this.f27129a.getFlexItemCount();
        boolean z11 = z10;
        int i31 = Integer.MIN_VALUE;
        int i32 = 0;
        int i33 = 0;
        int i34 = 0;
        while (true) {
            if (i29 >= flexItemCount) {
                i15 = i33;
                bVar2 = bVar;
                break;
            }
            View h10 = this.f27129a.h(i29);
            if (h10 == null) {
                if (N(i29, flexItemCount, cVar)) {
                    a(arrayList, cVar, i29, i32);
                }
            } else if (h10.getVisibility() == 8) {
                cVar.f49479i++;
                cVar.f49478h++;
                if (N(i29, flexItemCount, cVar)) {
                    a(arrayList, cVar, i29, i32);
                }
            } else {
                if (h10 instanceof CompoundButton) {
                    v((CompoundButton) h10);
                }
                qg.b bVar3 = (qg.b) h10.getLayoutParams();
                int i35 = flexItemCount;
                if (bVar3.K() == 4) {
                    cVar.f49484n.add(Integer.valueOf(i29));
                }
                int G = G(bVar3, l10);
                if (bVar3.q0() != -1.0f && mode == 1073741824) {
                    G = Math.round(size * bVar3.q0());
                }
                if (l10) {
                    int b10 = this.f27129a.b(i26, i30 + E(bVar3, true) + C(bVar3, true), G);
                    i16 = size;
                    i17 = mode;
                    int e10 = this.f27129a.e(i27, J + H + D(bVar3, true) + B(bVar3, true) + i32, F(bVar3, true));
                    h10.measure(b10, e10);
                    Z(i29, b10, e10, h10);
                    i18 = b10;
                } else {
                    i16 = size;
                    i17 = mode;
                    int b11 = this.f27129a.b(i27, J + H + D(bVar3, false) + B(bVar3, false) + i32, F(bVar3, false));
                    int e11 = this.f27129a.e(i26, E(bVar3, false) + i30 + C(bVar3, false), G);
                    h10.measure(b11, e11);
                    Z(i29, b11, e11, h10);
                    i18 = e11;
                }
                this.f27129a.i(i29, h10);
                i(h10, i29);
                i33 = View.combineMeasuredStates(i33, h10.getMeasuredState());
                int i36 = i32;
                int i37 = i30;
                qg.c cVar2 = cVar;
                int i38 = i29;
                list2 = arrayList;
                int i39 = i18;
                if (P(h10, i17, i16, cVar.f49475e, C(bVar3, l10) + M(h10, l10) + E(bVar3, l10), bVar3, i38, i34, arrayList.size())) {
                    if (cVar2.c() > 0) {
                        a(list2, cVar2, i38 > 0 ? i38 - 1 : 0, i36);
                        i32 = cVar2.f49477g + i36;
                    } else {
                        i32 = i36;
                    }
                    if (l10) {
                        if (bVar3.getHeight() == -1) {
                            qg.a aVar = this.f27129a;
                            i19 = i11;
                            i29 = i38;
                            view = h10;
                            view.measure(i39, aVar.e(i19, aVar.getPaddingTop() + this.f27129a.getPaddingBottom() + bVar3.d0() + bVar3.j1() + i32, bVar3.getHeight()));
                            i(view, i29);
                        } else {
                            i19 = i11;
                            view = h10;
                            i29 = i38;
                        }
                    } else {
                        i19 = i11;
                        view = h10;
                        i29 = i38;
                        if (bVar3.getWidth() == -1) {
                            qg.a aVar2 = this.f27129a;
                            view.measure(aVar2.b(i19, aVar2.getPaddingLeft() + this.f27129a.getPaddingRight() + bVar3.m1() + bVar3.G1() + i32, bVar3.getWidth()), i39);
                            i(view, i29);
                        }
                    }
                    cVar = new qg.c();
                    cVar.f49478h = 1;
                    i20 = i37;
                    cVar.f49475e = i20;
                    cVar.f49485o = i29;
                    i22 = Integer.MIN_VALUE;
                    i21 = 0;
                } else {
                    i19 = i11;
                    view = h10;
                    i29 = i38;
                    cVar = cVar2;
                    i20 = i37;
                    cVar.f49478h++;
                    i21 = i34 + 1;
                    i32 = i36;
                    i22 = i31;
                }
                cVar.f49487q |= bVar3.i0() != 0.0f;
                cVar.f49488r |= bVar3.L() != 0.0f;
                int[] iArr = this.f27131c;
                if (iArr != null) {
                    iArr[i29] = list2.size();
                }
                cVar.f49475e += M(view, l10) + E(bVar3, l10) + C(bVar3, l10);
                cVar.f49480j += bVar3.i0();
                cVar.f49481k += bVar3.L();
                this.f27129a.k(view, i29, i21, cVar);
                int max = Math.max(i22, L(view, l10) + D(bVar3, l10) + B(bVar3, l10) + this.f27129a.f(view));
                cVar.f49477g = Math.max(cVar.f49477g, max);
                if (l10) {
                    if (this.f27129a.getFlexWrap() != 2) {
                        cVar.f49482l = Math.max(cVar.f49482l, view.getBaseline() + bVar3.d0());
                    } else {
                        cVar.f49482l = Math.max(cVar.f49482l, (view.getMeasuredHeight() - view.getBaseline()) + bVar3.j1());
                    }
                }
                i23 = i35;
                if (N(i29, i23, cVar)) {
                    a(list2, cVar, i29, i32);
                    i32 += cVar.f49477g;
                }
                i24 = i14;
                if (i24 != -1 && list2.size() > 0) {
                    if (list2.get(list2.size() - 1).f49486p >= i24 && i29 >= i24 && !z11) {
                        i32 = -cVar.a();
                        i25 = i12;
                        z11 = true;
                        if (i32 <= i25 && z11) {
                            bVar2 = bVar;
                            i15 = i33;
                            break;
                        }
                        i34 = i21;
                        i31 = max;
                        i29++;
                        i26 = i10;
                        flexItemCount = i23;
                        i27 = i19;
                        i30 = i20;
                        arrayList = list2;
                        mode = i17;
                        i28 = i24;
                        size = i16;
                    }
                }
                i25 = i12;
                if (i32 <= i25) {
                }
                i34 = i21;
                i31 = max;
                i29++;
                i26 = i10;
                flexItemCount = i23;
                i27 = i19;
                i30 = i20;
                arrayList = list2;
                mode = i17;
                i28 = i24;
                size = i16;
            }
            i16 = size;
            i17 = mode;
            i19 = i27;
            i24 = i28;
            list2 = arrayList;
            i20 = i30;
            i23 = flexItemCount;
            i29++;
            i26 = i10;
            flexItemCount = i23;
            i27 = i19;
            i30 = i20;
            arrayList = list2;
            mode = i17;
            i28 = i24;
            size = i16;
        }
        bVar2.f27135b = i15;
    }

    public void c(b bVar, int i10, int i11) {
        b(bVar, i10, i11, Integer.MAX_VALUE, 0, -1, null);
    }

    public void d(b bVar, int i10, int i11, int i12, int i13, List<qg.c> list) {
        b(bVar, i10, i11, i12, i13, -1, list);
    }

    public void e(b bVar, int i10, int i11, int i12, int i13, List<qg.c> list) {
        b(bVar, i10, i11, i12, 0, i13, list);
    }

    public void f(b bVar, int i10, int i11) {
        b(bVar, i11, i10, Integer.MAX_VALUE, 0, -1, null);
    }

    public void g(b bVar, int i10, int i11, int i12, int i13, List<qg.c> list) {
        b(bVar, i11, i10, i12, i13, -1, list);
    }

    public void h(b bVar, int i10, int i11, int i12, int i13, List<qg.c> list) {
        b(bVar, i11, i10, i12, 0, i13, list);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void i(android.view.View r7, int r8) {
        /*
            r6 = this;
            android.view.ViewGroup$LayoutParams r0 = r7.getLayoutParams()
            qg.b r0 = (qg.b) r0
            int r1 = r7.getMeasuredWidth()
            int r2 = r7.getMeasuredHeight()
            int r3 = r0.N()
            r4 = 1
            if (r1 >= r3) goto L1b
            int r1 = r0.N()
        L19:
            r3 = r4
            goto L27
        L1b:
            int r3 = r0.M0()
            if (r1 <= r3) goto L26
            int r1 = r0.M0()
            goto L19
        L26:
            r3 = 0
        L27:
            int r5 = r0.I1()
            if (r2 >= r5) goto L32
            int r2 = r0.I1()
            goto L3e
        L32:
            int r5 = r0.K1()
            if (r2 <= r5) goto L3d
            int r2 = r0.K1()
            goto L3e
        L3d:
            r4 = r3
        L3e:
            if (r4 == 0) goto L55
            r0 = 1073741824(0x40000000, float:2.0)
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r0)
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r0)
            r7.measure(r1, r0)
            r6.Z(r8, r1, r0, r7)
            qg.a r0 = r6.f27129a
            r0.i(r8, r7)
        L55:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.a.i(android.view.View, int):void");
    }

    public void j(List<qg.c> list, int i10) {
        int i11 = this.f27131c[i10];
        if (i11 == -1) {
            i11 = 0;
        }
        if (list.size() > i11) {
            list.subList(i11, list.size()).clear();
        }
        int[] iArr = this.f27131c;
        int length = iArr.length - 1;
        if (i10 > length) {
            Arrays.fill(iArr, -1);
        } else {
            Arrays.fill(iArr, i10, length, -1);
        }
        long[] jArr = this.f27132d;
        int length2 = jArr.length - 1;
        if (i10 > length2) {
            Arrays.fill(jArr, 0L);
        } else {
            Arrays.fill(jArr, i10, length2, 0L);
        }
    }

    public final List<qg.c> k(List<qg.c> list, int i10, int i11) {
        ArrayList arrayList = new ArrayList();
        qg.c cVar = new qg.c();
        cVar.f49477g = (i10 - i11) / 2;
        int size = list.size();
        for (int i12 = 0; i12 < size; i12++) {
            if (i12 == 0) {
                arrayList.add(cVar);
            }
            arrayList.add(list.get(i12));
            if (i12 == list.size() - 1) {
                arrayList.add(cVar);
            }
        }
        return arrayList;
    }

    public final List<c> l(int i10) {
        ArrayList arrayList = new ArrayList(i10);
        for (int i11 = 0; i11 < i10; i11++) {
            c cVar = new c();
            cVar.f27137x = ((qg.b) this.f27129a.d(i11).getLayoutParams()).getOrder();
            cVar.f27136w = i11;
            arrayList.add(cVar);
        }
        return arrayList;
    }

    public int[] m(SparseIntArray sparseIntArray) {
        int flexItemCount = this.f27129a.getFlexItemCount();
        return U(flexItemCount, l(flexItemCount), sparseIntArray);
    }

    public int[] n(View view, int i10, ViewGroup.LayoutParams layoutParams, SparseIntArray sparseIntArray) {
        int flexItemCount = this.f27129a.getFlexItemCount();
        List<c> l10 = l(flexItemCount);
        c cVar = new c();
        if (view != null && (layoutParams instanceof qg.b)) {
            cVar.f27137x = ((qg.b) layoutParams).getOrder();
        } else {
            cVar.f27137x = 1;
        }
        if (i10 != -1 && i10 != flexItemCount) {
            if (i10 < this.f27129a.getFlexItemCount()) {
                cVar.f27136w = i10;
                while (i10 < flexItemCount) {
                    l10.get(i10).f27136w++;
                    i10++;
                }
            } else {
                cVar.f27136w = flexItemCount;
            }
        } else {
            cVar.f27136w = flexItemCount;
        }
        l10.add(cVar);
        return U(flexItemCount + 1, l10, sparseIntArray);
    }

    public void o(int i10, int i11, int i12) {
        int i13;
        int i14;
        int flexDirection = this.f27129a.getFlexDirection();
        if (flexDirection == 0 || flexDirection == 1) {
            int mode = View.MeasureSpec.getMode(i11);
            int size = View.MeasureSpec.getSize(i11);
            i13 = mode;
            i14 = size;
        } else if (flexDirection != 2 && flexDirection != 3) {
            throw new IllegalArgumentException("Invalid flex direction: " + flexDirection);
        } else {
            i13 = View.MeasureSpec.getMode(i10);
            i14 = View.MeasureSpec.getSize(i10);
        }
        List<qg.c> flexLinesInternal = this.f27129a.getFlexLinesInternal();
        if (i13 == 1073741824) {
            int sumOfCrossSize = this.f27129a.getSumOfCrossSize() + i12;
            int i15 = 0;
            if (flexLinesInternal.size() == 1) {
                flexLinesInternal.get(0).f49477g = i14 - i12;
            } else if (flexLinesInternal.size() >= 2) {
                int alignContent = this.f27129a.getAlignContent();
                if (alignContent == 1) {
                    int i16 = i14 - sumOfCrossSize;
                    qg.c cVar = new qg.c();
                    cVar.f49477g = i16;
                    flexLinesInternal.add(0, cVar);
                } else if (alignContent == 2) {
                    this.f27129a.setFlexLines(k(flexLinesInternal, i14, sumOfCrossSize));
                } else if (alignContent == 3) {
                    if (sumOfCrossSize >= i14) {
                        return;
                    }
                    float size2 = (i14 - sumOfCrossSize) / (flexLinesInternal.size() - 1);
                    ArrayList arrayList = new ArrayList();
                    int size3 = flexLinesInternal.size();
                    float f10 = 0.0f;
                    while (i15 < size3) {
                        arrayList.add(flexLinesInternal.get(i15));
                        if (i15 != flexLinesInternal.size() - 1) {
                            qg.c cVar2 = new qg.c();
                            if (i15 == flexLinesInternal.size() - 2) {
                                cVar2.f49477g = Math.round(f10 + size2);
                                f10 = 0.0f;
                            } else {
                                cVar2.f49477g = Math.round(size2);
                            }
                            int i17 = cVar2.f49477g;
                            f10 += size2 - i17;
                            if (f10 > 1.0f) {
                                cVar2.f49477g = i17 + 1;
                                f10 -= 1.0f;
                            } else if (f10 < -1.0f) {
                                cVar2.f49477g = i17 - 1;
                                f10 += 1.0f;
                            }
                            arrayList.add(cVar2);
                        }
                        i15++;
                    }
                    this.f27129a.setFlexLines(arrayList);
                } else if (alignContent == 4) {
                    if (sumOfCrossSize >= i14) {
                        this.f27129a.setFlexLines(k(flexLinesInternal, i14, sumOfCrossSize));
                        return;
                    }
                    int size4 = (i14 - sumOfCrossSize) / (flexLinesInternal.size() * 2);
                    ArrayList arrayList2 = new ArrayList();
                    qg.c cVar3 = new qg.c();
                    cVar3.f49477g = size4;
                    for (qg.c cVar4 : flexLinesInternal) {
                        arrayList2.add(cVar3);
                        arrayList2.add(cVar4);
                        arrayList2.add(cVar3);
                    }
                    this.f27129a.setFlexLines(arrayList2);
                } else if (alignContent == 5 && sumOfCrossSize < i14) {
                    float size5 = (i14 - sumOfCrossSize) / flexLinesInternal.size();
                    int size6 = flexLinesInternal.size();
                    float f11 = 0.0f;
                    while (i15 < size6) {
                        qg.c cVar5 = flexLinesInternal.get(i15);
                        float f12 = cVar5.f49477g + size5;
                        if (i15 == flexLinesInternal.size() - 1) {
                            f12 += f11;
                            f11 = 0.0f;
                        }
                        int round = Math.round(f12);
                        f11 += f12 - round;
                        if (f11 > 1.0f) {
                            round++;
                            f11 -= 1.0f;
                        } else if (f11 < -1.0f) {
                            round--;
                            f11 += 1.0f;
                        }
                        cVar5.f49477g = round;
                        i15++;
                    }
                }
            }
        }
    }

    public void p(int i10, int i11) {
        q(i10, i11, 0);
    }

    public void q(int i10, int i11, int i12) {
        int size;
        int paddingLeft;
        int paddingRight;
        r(this.f27129a.getFlexItemCount());
        if (i12 >= this.f27129a.getFlexItemCount()) {
            return;
        }
        int flexDirection = this.f27129a.getFlexDirection();
        int flexDirection2 = this.f27129a.getFlexDirection();
        if (flexDirection2 == 0 || flexDirection2 == 1) {
            int mode = View.MeasureSpec.getMode(i10);
            size = View.MeasureSpec.getSize(i10);
            int largestMainSize = this.f27129a.getLargestMainSize();
            if (mode != 1073741824) {
                size = Math.min(largestMainSize, size);
            }
            paddingLeft = this.f27129a.getPaddingLeft();
            paddingRight = this.f27129a.getPaddingRight();
        } else if (flexDirection2 != 2 && flexDirection2 != 3) {
            throw new IllegalArgumentException("Invalid flex direction: " + flexDirection);
        } else {
            int mode2 = View.MeasureSpec.getMode(i11);
            size = View.MeasureSpec.getSize(i11);
            if (mode2 != 1073741824) {
                size = this.f27129a.getLargestMainSize();
            }
            paddingLeft = this.f27129a.getPaddingTop();
            paddingRight = this.f27129a.getPaddingBottom();
        }
        int i13 = paddingLeft + paddingRight;
        int[] iArr = this.f27131c;
        int i14 = iArr != null ? iArr[i12] : 0;
        List<qg.c> flexLinesInternal = this.f27129a.getFlexLinesInternal();
        int size2 = flexLinesInternal.size();
        for (int i15 = i14; i15 < size2; i15++) {
            qg.c cVar = flexLinesInternal.get(i15);
            int i16 = cVar.f49475e;
            if (i16 < size && cVar.f49487q) {
                w(i10, i11, cVar, size, i13, false);
            } else if (i16 > size && cVar.f49488r) {
                T(i10, i11, cVar, size, i13, false);
            }
        }
    }

    public final void r(int i10) {
        boolean[] zArr = this.f27130b;
        if (zArr == null) {
            this.f27130b = new boolean[Math.max(i10, 10)];
        } else if (zArr.length < i10) {
            this.f27130b = new boolean[Math.max(zArr.length * 2, i10)];
        } else {
            Arrays.fill(zArr, false);
        }
    }

    public void s(int i10) {
        int[] iArr = this.f27131c;
        if (iArr == null) {
            this.f27131c = new int[Math.max(i10, 10)];
        } else if (iArr.length < i10) {
            this.f27131c = Arrays.copyOf(this.f27131c, Math.max(iArr.length * 2, i10));
        }
    }

    public void t(int i10) {
        long[] jArr = this.f27132d;
        if (jArr == null) {
            this.f27132d = new long[Math.max(i10, 10)];
        } else if (jArr.length < i10) {
            this.f27132d = Arrays.copyOf(this.f27132d, Math.max(jArr.length * 2, i10));
        }
    }

    public void u(int i10) {
        long[] jArr = this.f27133e;
        if (jArr == null) {
            this.f27133e = new long[Math.max(i10, 10)];
        } else if (jArr.length < i10) {
            this.f27133e = Arrays.copyOf(this.f27133e, Math.max(jArr.length * 2, i10));
        }
    }

    public final void v(CompoundButton compoundButton) {
        qg.b bVar = (qg.b) compoundButton.getLayoutParams();
        int N = bVar.N();
        int I1 = bVar.I1();
        Drawable a10 = d.a(compoundButton);
        int minimumWidth = a10 == null ? 0 : a10.getMinimumWidth();
        int minimumHeight = a10 != null ? a10.getMinimumHeight() : 0;
        if (N == -1) {
            N = minimumWidth;
        }
        bVar.i1(N);
        if (I1 == -1) {
            I1 = minimumHeight;
        }
        bVar.h0(I1);
    }

    public final void w(int i10, int i11, qg.c cVar, int i12, int i13, boolean z10) {
        int i14;
        int i15;
        int i16;
        double d10;
        int i17;
        double d11;
        float f10 = cVar.f49480j;
        float f11 = 0.0f;
        if (f10 <= 0.0f || i12 < (i14 = cVar.f49475e)) {
            return;
        }
        float f12 = (i12 - i14) / f10;
        cVar.f49475e = i13 + cVar.f49476f;
        if (!z10) {
            cVar.f49477g = Integer.MIN_VALUE;
        }
        int i18 = 0;
        boolean z11 = false;
        int i19 = 0;
        float f13 = 0.0f;
        while (i18 < cVar.f49478h) {
            int i20 = cVar.f49485o + i18;
            View h10 = this.f27129a.h(i20);
            if (h10 == null || h10.getVisibility() == 8) {
                i15 = i14;
            } else {
                qg.b bVar = (qg.b) h10.getLayoutParams();
                int flexDirection = this.f27129a.getFlexDirection();
                if (flexDirection != 0 && flexDirection != 1) {
                    int measuredHeight = h10.getMeasuredHeight();
                    long[] jArr = this.f27133e;
                    if (jArr != null) {
                        measuredHeight = x(jArr[i20]);
                    }
                    int measuredWidth = h10.getMeasuredWidth();
                    long[] jArr2 = this.f27133e;
                    if (jArr2 != null) {
                        measuredWidth = y(jArr2[i20]);
                    }
                    if (this.f27130b[i20] || bVar.i0() <= f11) {
                        i17 = i14;
                    } else {
                        float i02 = measuredHeight + (bVar.i0() * f12);
                        if (i18 == cVar.f49478h - 1) {
                            i02 += f13;
                            f13 = f11;
                        }
                        int round = Math.round(i02);
                        if (round > bVar.K1()) {
                            round = bVar.K1();
                            this.f27130b[i20] = true;
                            cVar.f49480j -= bVar.i0();
                            i17 = i14;
                            z11 = true;
                        } else {
                            f13 += i02 - round;
                            i17 = i14;
                            double d12 = f13;
                            if (d12 > 1.0d) {
                                round++;
                                d11 = d12 - 1.0d;
                            } else if (d12 < -1.0d) {
                                round--;
                                d11 = d12 + 1.0d;
                            }
                            f13 = (float) d11;
                        }
                        int A = A(i10, bVar, cVar.f49483m);
                        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(round, 1073741824);
                        h10.measure(A, makeMeasureSpec);
                        measuredWidth = h10.getMeasuredWidth();
                        int measuredHeight2 = h10.getMeasuredHeight();
                        Z(i20, A, makeMeasureSpec, h10);
                        this.f27129a.i(i20, h10);
                        measuredHeight = measuredHeight2;
                    }
                    i16 = Math.max(i19, measuredWidth + bVar.m1() + bVar.G1() + this.f27129a.f(h10));
                    cVar.f49475e += measuredHeight + bVar.d0() + bVar.j1();
                    i15 = i17;
                } else {
                    int i21 = i14;
                    int measuredWidth2 = h10.getMeasuredWidth();
                    long[] jArr3 = this.f27133e;
                    if (jArr3 != null) {
                        measuredWidth2 = y(jArr3[i20]);
                    }
                    int measuredHeight3 = h10.getMeasuredHeight();
                    long[] jArr4 = this.f27133e;
                    i15 = i21;
                    if (jArr4 != null) {
                        measuredHeight3 = x(jArr4[i20]);
                    }
                    if (!this.f27130b[i20] && bVar.i0() > 0.0f) {
                        float i03 = measuredWidth2 + (bVar.i0() * f12);
                        if (i18 == cVar.f49478h - 1) {
                            i03 += f13;
                            f13 = 0.0f;
                        }
                        int round2 = Math.round(i03);
                        if (round2 > bVar.M0()) {
                            round2 = bVar.M0();
                            this.f27130b[i20] = true;
                            cVar.f49480j -= bVar.i0();
                            z11 = true;
                        } else {
                            f13 += i03 - round2;
                            double d13 = f13;
                            if (d13 > 1.0d) {
                                round2++;
                                d10 = d13 - 1.0d;
                            } else if (d13 < -1.0d) {
                                round2--;
                                d10 = d13 + 1.0d;
                            }
                            f13 = (float) d10;
                        }
                        int z12 = z(i11, bVar, cVar.f49483m);
                        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(round2, 1073741824);
                        h10.measure(makeMeasureSpec2, z12);
                        int measuredWidth3 = h10.getMeasuredWidth();
                        int measuredHeight4 = h10.getMeasuredHeight();
                        Z(i20, makeMeasureSpec2, z12, h10);
                        this.f27129a.i(i20, h10);
                        measuredWidth2 = measuredWidth3;
                        measuredHeight3 = measuredHeight4;
                    }
                    int max = Math.max(i19, measuredHeight3 + bVar.d0() + bVar.j1() + this.f27129a.f(h10));
                    cVar.f49475e += measuredWidth2 + bVar.m1() + bVar.G1();
                    i16 = max;
                }
                cVar.f49477g = Math.max(cVar.f49477g, i16);
                i19 = i16;
            }
            i18++;
            i14 = i15;
            f11 = 0.0f;
        }
        int i22 = i14;
        if (!z11 || i22 == cVar.f49475e) {
            return;
        }
        w(i10, i11, cVar, i12, i13, true);
    }

    public int x(long j10) {
        return (int) (j10 >> 32);
    }

    public int y(long j10) {
        return (int) j10;
    }

    public final int z(int i10, qg.b bVar, int i11) {
        qg.a aVar = this.f27129a;
        int e10 = aVar.e(i10, aVar.getPaddingTop() + this.f27129a.getPaddingBottom() + bVar.d0() + bVar.j1() + i11, bVar.getHeight());
        int size = View.MeasureSpec.getSize(e10);
        if (size > bVar.K1()) {
            return View.MeasureSpec.makeMeasureSpec(bVar.K1(), View.MeasureSpec.getMode(e10));
        }
        return size < bVar.I1() ? View.MeasureSpec.makeMeasureSpec(bVar.I1(), View.MeasureSpec.getMode(e10)) : e10;
    }
}
