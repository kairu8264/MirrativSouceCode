package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import p3.c;

/* loaded from: classes.dex */
public class GridLayoutManager extends LinearLayoutManager {

    /* renamed from: e0  reason: collision with root package name */
    public boolean f15839e0;

    /* renamed from: f0  reason: collision with root package name */
    public int f15840f0;

    /* renamed from: g0  reason: collision with root package name */
    public int[] f15841g0;

    /* renamed from: h0  reason: collision with root package name */
    public View[] f15842h0;

    /* renamed from: i0  reason: collision with root package name */
    public final SparseIntArray f15843i0;

    /* renamed from: j0  reason: collision with root package name */
    public final SparseIntArray f15844j0;

    /* renamed from: k0  reason: collision with root package name */
    public c f15845k0;

    /* renamed from: l0  reason: collision with root package name */
    public final Rect f15846l0;

    /* renamed from: m0  reason: collision with root package name */
    public boolean f15847m0;

    /* loaded from: classes.dex */
    public static final class a extends c {
        @Override // androidx.recyclerview.widget.GridLayoutManager.c
        public int e(int i10, int i11) {
            return i10 % i11;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.c
        public int f(int i10) {
            return 1;
        }
    }

    /* loaded from: classes.dex */
    public static abstract class c {

        /* renamed from: a  reason: collision with root package name */
        public final SparseIntArray f15848a = new SparseIntArray();

        /* renamed from: b  reason: collision with root package name */
        public final SparseIntArray f15849b = new SparseIntArray();

        /* renamed from: c  reason: collision with root package name */
        public boolean f15850c = false;

        /* renamed from: d  reason: collision with root package name */
        public boolean f15851d = false;

        public static int a(SparseIntArray sparseIntArray, int i10) {
            int size = sparseIntArray.size() - 1;
            int i11 = 0;
            while (i11 <= size) {
                int i12 = (i11 + size) >>> 1;
                if (sparseIntArray.keyAt(i12) < i10) {
                    i11 = i12 + 1;
                } else {
                    size = i12 - 1;
                }
            }
            int i13 = i11 - 1;
            if (i13 < 0 || i13 >= sparseIntArray.size()) {
                return -1;
            }
            return sparseIntArray.keyAt(i13);
        }

        public int b(int i10, int i11) {
            if (!this.f15851d) {
                return d(i10, i11);
            }
            int i12 = this.f15849b.get(i10, -1);
            if (i12 != -1) {
                return i12;
            }
            int d10 = d(i10, i11);
            this.f15849b.put(i10, d10);
            return d10;
        }

        public int c(int i10, int i11) {
            if (!this.f15850c) {
                return e(i10, i11);
            }
            int i12 = this.f15848a.get(i10, -1);
            if (i12 != -1) {
                return i12;
            }
            int e10 = e(i10, i11);
            this.f15848a.put(i10, e10);
            return e10;
        }

        public int d(int i10, int i11) {
            int i12;
            int i13;
            int i14;
            int a10;
            if (!this.f15851d || (a10 = a(this.f15849b, i10)) == -1) {
                i12 = 0;
                i13 = 0;
                i14 = 0;
            } else {
                i12 = this.f15849b.get(a10);
                i13 = a10 + 1;
                i14 = c(a10, i11) + f(a10);
                if (i14 == i11) {
                    i12++;
                    i14 = 0;
                }
            }
            int f10 = f(i10);
            while (i13 < i10) {
                int f11 = f(i13);
                i14 += f11;
                if (i14 == i11) {
                    i12++;
                    i14 = 0;
                } else if (i14 > i11) {
                    i12++;
                    i14 = f11;
                }
                i13++;
            }
            return i14 + f10 > i11 ? i12 + 1 : i12;
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0024  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x002b -> B:17:0x0030). Please submit an issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x002d -> B:17:0x0030). Please submit an issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x002f -> B:17:0x0030). Please submit an issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public int e(int r6, int r7) {
            /*
                r5 = this;
                int r0 = r5.f(r6)
                r1 = 0
                if (r0 != r7) goto L8
                return r1
            L8:
                boolean r2 = r5.f15850c
                if (r2 == 0) goto L20
                android.util.SparseIntArray r2 = r5.f15848a
                int r2 = a(r2, r6)
                if (r2 < 0) goto L20
                android.util.SparseIntArray r3 = r5.f15848a
                int r3 = r3.get(r2)
                int r4 = r5.f(r2)
                int r3 = r3 + r4
                goto L30
            L20:
                r2 = r1
                r3 = r2
            L22:
                if (r2 >= r6) goto L33
                int r4 = r5.f(r2)
                int r3 = r3 + r4
                if (r3 != r7) goto L2d
                r3 = r1
                goto L30
            L2d:
                if (r3 <= r7) goto L30
                r3 = r4
            L30:
                int r2 = r2 + 1
                goto L22
            L33:
                int r0 = r0 + r3
                if (r0 > r7) goto L37
                return r3
            L37:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.c.e(int, int):int");
        }

        public abstract int f(int i10);

        public void g() {
            this.f15849b.clear();
        }

        public void h() {
            this.f15848a.clear();
        }
    }

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.f15839e0 = false;
        this.f15840f0 = -1;
        this.f15843i0 = new SparseIntArray();
        this.f15844j0 = new SparseIntArray();
        this.f15845k0 = new a();
        this.f15846l0 = new Rect();
        n3(RecyclerView.p.p0(context, attributeSet, i10, i11).f15978b);
    }

    public static int[] Y2(int[] iArr, int i10, int i11) {
        int i12;
        if (iArr == null || iArr.length != i10 + 1 || iArr[iArr.length - 1] != i11) {
            iArr = new int[i10 + 1];
        }
        int i13 = 0;
        iArr[0] = 0;
        int i14 = i11 / i10;
        int i15 = i11 % i10;
        int i16 = 0;
        for (int i17 = 1; i17 <= i10; i17++) {
            i13 += i15;
            if (i13 <= 0 || i10 - i13 >= i15) {
                i12 = i14;
            } else {
                i12 = i14 + 1;
                i13 -= i10;
            }
            i16 += i12;
            iArr[i17] = i16;
        }
        return iArr;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void B2(RecyclerView.w wVar, RecyclerView.b0 b0Var, LinearLayoutManager.a aVar, int i10) {
        super.B2(wVar, b0Var, aVar, i10);
        p3();
        if (b0Var.b() > 0 && !b0Var.e()) {
            c3(wVar, b0Var, aVar, i10);
        }
        d3();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public int C(RecyclerView.b0 b0Var) {
        if (this.f15847m0) {
            return a3(b0Var);
        }
        return super.C(b0Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public int D(RecyclerView.b0 b0Var) {
        if (this.f15847m0) {
            return b3(b0Var);
        }
        return super.D(b0Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public int F(RecyclerView.b0 b0Var) {
        if (this.f15847m0) {
            return a3(b0Var);
        }
        return super.F(b0Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public int F1(int i10, RecyclerView.w wVar, RecyclerView.b0 b0Var) {
        p3();
        d3();
        return super.F1(i10, wVar, b0Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public int G(RecyclerView.b0 b0Var) {
        if (this.f15847m0) {
            return b3(b0Var);
        }
        return super.G(b0Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public int H1(int i10, RecyclerView.w wVar, RecyclerView.b0 b0Var) {
        p3();
        d3();
        return super.H1(i10, wVar, b0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void L1(Rect rect, int i10, int i11) {
        int y10;
        int y11;
        if (this.f15841g0 == null) {
            super.L1(rect, i10, i11);
        }
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        if (this.O == 1) {
            y11 = RecyclerView.p.y(i11, rect.height() + paddingTop, m0());
            int[] iArr = this.f15841g0;
            y10 = RecyclerView.p.y(i10, iArr[iArr.length - 1] + paddingLeft, n0());
        } else {
            y10 = RecyclerView.p.y(i10, rect.width() + paddingLeft, n0());
            int[] iArr2 = this.f15841g0;
            y11 = RecyclerView.p.y(i11, iArr2[iArr2.length - 1] + paddingTop, m0());
        }
        K1(y10, y11);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void M2(boolean z10) {
        if (!z10) {
            super.M2(false);
            return;
        }
        throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public RecyclerView.q O() {
        if (this.O == 0) {
            return new b(-2, -1);
        }
        return new b(-1, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public RecyclerView.q P(Context context, AttributeSet attributeSet) {
        return new b(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public RecyclerView.q Q(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new b((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new b(layoutParams);
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x00d6, code lost:
        if (r13 == (r2 > r15)) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00f6, code lost:
        if (r13 == (r2 > r7)) goto L51;
     */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0107  */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.view.View R0(android.view.View r24, int r25, androidx.recyclerview.widget.RecyclerView.w r26, androidx.recyclerview.widget.RecyclerView.b0 r27) {
        /*
            Method dump skipped, instructions count: 337
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.R0(android.view.View, int, androidx.recyclerview.widget.RecyclerView$w, androidx.recyclerview.widget.RecyclerView$b0):android.view.View");
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public boolean U1() {
        return this.Z == null && !this.f15839e0;
    }

    public final void V2(RecyclerView.w wVar, RecyclerView.b0 b0Var, int i10, boolean z10) {
        int i11;
        int i12;
        int i13 = 0;
        int i14 = -1;
        if (z10) {
            i12 = 1;
            i14 = i10;
            i11 = 0;
        } else {
            i11 = i10 - 1;
            i12 = -1;
        }
        while (i11 != i14) {
            View view = this.f15842h0[i11];
            b bVar = (b) view.getLayoutParams();
            int i32 = i3(wVar, b0Var, o0(view));
            bVar.B = i32;
            bVar.A = i13;
            i13 += i32;
            i11 += i12;
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void W1(RecyclerView.b0 b0Var, LinearLayoutManager.c cVar, RecyclerView.p.c cVar2) {
        int i10 = this.f15840f0;
        for (int i11 = 0; i11 < this.f15840f0 && cVar.c(b0Var) && i10 > 0; i11++) {
            int i12 = cVar.f15868d;
            cVar2.a(i12, Math.max(0, cVar.f15871g));
            i10 -= this.f15845k0.f(i12);
            cVar.f15868d += cVar.f15869e;
        }
    }

    public final void W2() {
        int U = U();
        for (int i10 = 0; i10 < U; i10++) {
            b bVar = (b) T(i10).getLayoutParams();
            int a10 = bVar.a();
            this.f15843i0.put(a10, bVar.f());
            this.f15844j0.put(a10, bVar.e());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void X0(RecyclerView.w wVar, RecyclerView.b0 b0Var, View view, p3.c cVar) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof b)) {
            super.W0(view, cVar);
            return;
        }
        b bVar = (b) layoutParams;
        int g32 = g3(wVar, b0Var, bVar.a());
        if (this.O == 0) {
            cVar.e0(c.C0699c.a(bVar.e(), bVar.f(), g32, 1, false, false));
        } else {
            cVar.e0(c.C0699c.a(g32, 1, bVar.e(), bVar.f(), false, false));
        }
    }

    public final void X2(int i10) {
        this.f15841g0 = Y2(this.f15841g0, this.f15840f0, i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int Y(RecyclerView.w wVar, RecyclerView.b0 b0Var) {
        if (this.O == 1) {
            return this.f15840f0;
        }
        if (b0Var.b() < 1) {
            return 0;
        }
        return g3(wVar, b0Var, b0Var.b() - 1) + 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void Z0(RecyclerView recyclerView, int i10, int i11) {
        this.f15845k0.h();
        this.f15845k0.g();
    }

    public final void Z2() {
        this.f15843i0.clear();
        this.f15844j0.clear();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void a1(RecyclerView recyclerView) {
        this.f15845k0.h();
        this.f15845k0.g();
    }

    public final int a3(RecyclerView.b0 b0Var) {
        int max;
        if (U() != 0 && b0Var.b() != 0) {
            c2();
            boolean y22 = y2();
            View h22 = h2(!y22, true);
            View g22 = g2(!y22, true);
            if (h22 != null && g22 != null) {
                int b10 = this.f15845k0.b(o0(h22), this.f15840f0);
                int b11 = this.f15845k0.b(o0(g22), this.f15840f0);
                int min = Math.min(b10, b11);
                int max2 = Math.max(b10, b11);
                int b12 = this.f15845k0.b(b0Var.b() - 1, this.f15840f0) + 1;
                if (this.T) {
                    max = Math.max(0, (b12 - max2) - 1);
                } else {
                    max = Math.max(0, min);
                }
                if (y22) {
                    return Math.round((max * (Math.abs(this.Q.d(g22) - this.Q.g(h22)) / ((this.f15845k0.b(o0(g22), this.f15840f0) - this.f15845k0.b(o0(h22), this.f15840f0)) + 1))) + (this.Q.m() - this.Q.g(h22)));
                }
                return max;
            }
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void b1(RecyclerView recyclerView, int i10, int i11, int i12) {
        this.f15845k0.h();
        this.f15845k0.g();
    }

    public final int b3(RecyclerView.b0 b0Var) {
        if (U() != 0 && b0Var.b() != 0) {
            c2();
            View h22 = h2(!y2(), true);
            View g22 = g2(!y2(), true);
            if (h22 != null && g22 != null) {
                if (!y2()) {
                    return this.f15845k0.b(b0Var.b() - 1, this.f15840f0) + 1;
                }
                int d10 = this.Q.d(g22) - this.Q.g(h22);
                int b10 = this.f15845k0.b(o0(h22), this.f15840f0);
                return (int) ((d10 / ((this.f15845k0.b(o0(g22), this.f15840f0) - b10) + 1)) * (this.f15845k0.b(b0Var.b() - 1, this.f15840f0) + 1));
            }
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void c1(RecyclerView recyclerView, int i10, int i11) {
        this.f15845k0.h();
        this.f15845k0.g();
    }

    public final void c3(RecyclerView.w wVar, RecyclerView.b0 b0Var, LinearLayoutManager.a aVar, int i10) {
        boolean z10 = i10 == 1;
        int h32 = h3(wVar, b0Var, aVar.f15857b);
        if (z10) {
            while (h32 > 0) {
                int i11 = aVar.f15857b;
                if (i11 <= 0) {
                    return;
                }
                int i12 = i11 - 1;
                aVar.f15857b = i12;
                h32 = h3(wVar, b0Var, i12);
            }
            return;
        }
        int b10 = b0Var.b() - 1;
        int i13 = aVar.f15857b;
        while (i13 < b10) {
            int i14 = i13 + 1;
            int h33 = h3(wVar, b0Var, i14);
            if (h33 <= h32) {
                break;
            }
            i13 = i14;
            h32 = h33;
        }
        aVar.f15857b = i13;
    }

    public final void d3() {
        View[] viewArr = this.f15842h0;
        if (viewArr == null || viewArr.length != this.f15840f0) {
            this.f15842h0 = new View[this.f15840f0];
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void e1(RecyclerView recyclerView, int i10, int i11, Object obj) {
        this.f15845k0.h();
        this.f15845k0.g();
    }

    public int e3(int i10, int i11) {
        if (this.O == 1 && x2()) {
            int[] iArr = this.f15841g0;
            int i12 = this.f15840f0;
            return iArr[i12 - i10] - iArr[(i12 - i10) - i11];
        }
        int[] iArr2 = this.f15841g0;
        return iArr2[i11 + i10] - iArr2[i10];
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public void f1(RecyclerView.w wVar, RecyclerView.b0 b0Var) {
        if (b0Var.e()) {
            W2();
        }
        super.f1(wVar, b0Var);
        Z2();
    }

    public int f3() {
        return this.f15840f0;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public void g1(RecyclerView.b0 b0Var) {
        super.g1(b0Var);
        this.f15839e0 = false;
    }

    public final int g3(RecyclerView.w wVar, RecyclerView.b0 b0Var, int i10) {
        if (!b0Var.e()) {
            return this.f15845k0.b(i10, this.f15840f0);
        }
        int f10 = wVar.f(i10);
        if (f10 == -1) {
            Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + i10);
            return 0;
        }
        return this.f15845k0.b(f10, this.f15840f0);
    }

    public final int h3(RecyclerView.w wVar, RecyclerView.b0 b0Var, int i10) {
        if (!b0Var.e()) {
            return this.f15845k0.c(i10, this.f15840f0);
        }
        int i11 = this.f15844j0.get(i10, -1);
        if (i11 != -1) {
            return i11;
        }
        int f10 = wVar.f(i10);
        if (f10 == -1) {
            Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i10);
            return 0;
        }
        return this.f15845k0.c(f10, this.f15840f0);
    }

    public final int i3(RecyclerView.w wVar, RecyclerView.b0 b0Var, int i10) {
        if (!b0Var.e()) {
            return this.f15845k0.f(i10);
        }
        int i11 = this.f15843i0.get(i10, -1);
        if (i11 != -1) {
            return i11;
        }
        int f10 = wVar.f(i10);
        if (f10 == -1) {
            Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i10);
            return 1;
        }
        return this.f15845k0.f(f10);
    }

    public c j3() {
        return this.f15845k0;
    }

    public final void k3(float f10, int i10) {
        X2(Math.max(Math.round(f10 * this.f15840f0), i10));
    }

    public final void l3(View view, int i10, boolean z10) {
        int i11;
        int i12;
        b bVar = (b) view.getLayoutParams();
        Rect rect = bVar.f15982x;
        int i13 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) bVar).topMargin + ((ViewGroup.MarginLayoutParams) bVar).bottomMargin;
        int i14 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) bVar).leftMargin + ((ViewGroup.MarginLayoutParams) bVar).rightMargin;
        int e32 = e3(bVar.A, bVar.B);
        if (this.O == 1) {
            i12 = RecyclerView.p.V(e32, i10, i14, ((ViewGroup.MarginLayoutParams) bVar).width, false);
            i11 = RecyclerView.p.V(this.Q.n(), i0(), i13, ((ViewGroup.MarginLayoutParams) bVar).height, true);
        } else {
            int V = RecyclerView.p.V(e32, i10, i13, ((ViewGroup.MarginLayoutParams) bVar).height, false);
            int V2 = RecyclerView.p.V(this.Q.n(), w0(), i14, ((ViewGroup.MarginLayoutParams) bVar).width, true);
            i11 = V;
            i12 = V2;
        }
        m3(view, i12, i11, z10);
    }

    public final void m3(View view, int i10, int i11, boolean z10) {
        boolean O1;
        RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
        if (z10) {
            O1 = Q1(view, i10, i11, qVar);
        } else {
            O1 = O1(view, i10, i11, qVar);
        }
        if (O1) {
            view.measure(i10, i11);
        }
    }

    public void n3(int i10) {
        if (i10 == this.f15840f0) {
            return;
        }
        this.f15839e0 = true;
        if (i10 >= 1) {
            this.f15840f0 = i10;
            this.f15845k0.h();
            C1();
            return;
        }
        throw new IllegalArgumentException("Span count should be at least 1. Provided " + i10);
    }

    public void o3(c cVar) {
        this.f15845k0 = cVar;
    }

    public final void p3() {
        int h02;
        int paddingTop;
        if (w2() == 1) {
            h02 = v0() - getPaddingRight();
            paddingTop = getPaddingLeft();
        } else {
            h02 = h0() - getPaddingBottom();
            paddingTop = getPaddingTop();
        }
        X2(h02 - paddingTop);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public View q2(RecyclerView.w wVar, RecyclerView.b0 b0Var, boolean z10, boolean z11) {
        int i10;
        int U = U();
        int i11 = -1;
        int i12 = 1;
        if (z11) {
            i10 = U() - 1;
            i12 = -1;
        } else {
            i11 = U;
            i10 = 0;
        }
        int b10 = b0Var.b();
        c2();
        int m10 = this.Q.m();
        int i13 = this.Q.i();
        View view = null;
        View view2 = null;
        while (i10 != i11) {
            View T = T(i10);
            int o02 = o0(T);
            if (o02 >= 0 && o02 < b10 && h3(wVar, b0Var, o02) == 0) {
                if (((RecyclerView.q) T.getLayoutParams()).c()) {
                    if (view2 == null) {
                        view2 = T;
                    }
                } else if (this.Q.g(T) < i13 && this.Q.d(T) >= m10) {
                    return T;
                } else {
                    if (view == null) {
                        view = T;
                    }
                }
            }
            i10 += i12;
        }
        return view != null ? view : view2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int r0(RecyclerView.w wVar, RecyclerView.b0 b0Var) {
        if (this.O == 0) {
            return this.f15840f0;
        }
        if (b0Var.b() < 1) {
            return 0;
        }
        return g3(wVar, b0Var, b0Var.b() - 1) + 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean x(RecyclerView.q qVar) {
        return qVar instanceof b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x009f, code lost:
        r21.f15862b = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00a1, code lost:
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r5v19 */
    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void z2(androidx.recyclerview.widget.RecyclerView.w r18, androidx.recyclerview.widget.RecyclerView.b0 r19, androidx.recyclerview.widget.LinearLayoutManager.c r20, androidx.recyclerview.widget.LinearLayoutManager.b r21) {
        /*
            Method dump skipped, instructions count: 563
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.z2(androidx.recyclerview.widget.RecyclerView$w, androidx.recyclerview.widget.RecyclerView$b0, androidx.recyclerview.widget.LinearLayoutManager$c, androidx.recyclerview.widget.LinearLayoutManager$b):void");
    }

    /* loaded from: classes.dex */
    public static class b extends RecyclerView.q {
        public int A;
        public int B;

        public b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.A = -1;
            this.B = 0;
        }

        public int e() {
            return this.A;
        }

        public int f() {
            return this.B;
        }

        public b(int i10, int i11) {
            super(i10, i11);
            this.A = -1;
            this.B = 0;
        }

        public b(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.A = -1;
            this.B = 0;
        }

        public b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.A = -1;
            this.B = 0;
        }
    }

    public GridLayoutManager(Context context, int i10) {
        super(context);
        this.f15839e0 = false;
        this.f15840f0 = -1;
        this.f15843i0 = new SparseIntArray();
        this.f15844j0 = new SparseIntArray();
        this.f15845k0 = new a();
        this.f15846l0 = new Rect();
        n3(i10);
    }

    public GridLayoutManager(Context context, int i10, int i11, boolean z10) {
        super(context, i11, z10);
        this.f15839e0 = false;
        this.f15840f0 = -1;
        this.f15843i0 = new SparseIntArray();
        this.f15844j0 = new SparseIntArray();
        this.f15845k0 = new a();
        this.f15846l0 = new Rect();
        n3(i10);
    }
}
