package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;

/* loaded from: classes.dex */
public class StaggeredGridLayoutManager extends RecyclerView.p implements RecyclerView.a0.b {
    public f[] P;
    public x Q;
    public x R;
    public int S;
    public int T;
    public final q U;
    public BitSet X;

    /* renamed from: c0  reason: collision with root package name */
    public boolean f16003c0;

    /* renamed from: d0  reason: collision with root package name */
    public boolean f16004d0;

    /* renamed from: e0  reason: collision with root package name */
    public e f16005e0;

    /* renamed from: f0  reason: collision with root package name */
    public int f16006f0;

    /* renamed from: k0  reason: collision with root package name */
    public int[] f16011k0;
    public int O = -1;
    public boolean V = false;
    public boolean W = false;
    public int Y = -1;
    public int Z = Integer.MIN_VALUE;

    /* renamed from: a0  reason: collision with root package name */
    public d f16001a0 = new d();

    /* renamed from: b0  reason: collision with root package name */
    public int f16002b0 = 2;

    /* renamed from: g0  reason: collision with root package name */
    public final Rect f16007g0 = new Rect();

    /* renamed from: h0  reason: collision with root package name */
    public final b f16008h0 = new b();

    /* renamed from: i0  reason: collision with root package name */
    public boolean f16009i0 = false;

    /* renamed from: j0  reason: collision with root package name */
    public boolean f16010j0 = true;

    /* renamed from: l0  reason: collision with root package name */
    public final Runnable f16012l0 = new a();

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            StaggeredGridLayoutManager.this.b2();
        }
    }

    /* loaded from: classes.dex */
    public class b {

        /* renamed from: a  reason: collision with root package name */
        public int f16014a;

        /* renamed from: b  reason: collision with root package name */
        public int f16015b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f16016c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f16017d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f16018e;

        /* renamed from: f  reason: collision with root package name */
        public int[] f16019f;

        public b() {
            c();
        }

        public void a() {
            this.f16015b = this.f16016c ? StaggeredGridLayoutManager.this.Q.i() : StaggeredGridLayoutManager.this.Q.m();
        }

        public void b(int i10) {
            if (this.f16016c) {
                this.f16015b = StaggeredGridLayoutManager.this.Q.i() - i10;
            } else {
                this.f16015b = StaggeredGridLayoutManager.this.Q.m() + i10;
            }
        }

        public void c() {
            this.f16014a = -1;
            this.f16015b = Integer.MIN_VALUE;
            this.f16016c = false;
            this.f16017d = false;
            this.f16018e = false;
            int[] iArr = this.f16019f;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
        }

        public void d(f[] fVarArr) {
            int length = fVarArr.length;
            int[] iArr = this.f16019f;
            if (iArr == null || iArr.length < length) {
                this.f16019f = new int[StaggeredGridLayoutManager.this.P.length];
            }
            for (int i10 = 0; i10 < length; i10++) {
                this.f16019f[i10] = fVarArr[i10].p(Integer.MIN_VALUE);
            }
        }
    }

    /* loaded from: classes.dex */
    public static class c extends RecyclerView.q {
        public f A;
        public boolean B;

        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public boolean e() {
            return this.B;
        }

        public c(int i10, int i11) {
            super(i10, i11);
        }

        public c(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    /* loaded from: classes.dex */
    public static class e implements Parcelable {
        public static final Parcelable.Creator<e> CREATOR = new a();
        public int A;
        public int[] B;
        public List<d.a> C;
        public boolean D;
        public boolean E;
        public boolean F;

        /* renamed from: w  reason: collision with root package name */
        public int f16027w;

        /* renamed from: x  reason: collision with root package name */
        public int f16028x;

        /* renamed from: y  reason: collision with root package name */
        public int f16029y;

        /* renamed from: z  reason: collision with root package name */
        public int[] f16030z;

        /* loaded from: classes.dex */
        public class a implements Parcelable.Creator<e> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public e createFromParcel(Parcel parcel) {
                return new e(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public e[] newArray(int i10) {
                return new e[i10];
            }
        }

        public e() {
        }

        public void a() {
            this.f16030z = null;
            this.f16029y = 0;
            this.f16027w = -1;
            this.f16028x = -1;
        }

        public void b() {
            this.f16030z = null;
            this.f16029y = 0;
            this.A = 0;
            this.B = null;
            this.C = null;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeInt(this.f16027w);
            parcel.writeInt(this.f16028x);
            parcel.writeInt(this.f16029y);
            if (this.f16029y > 0) {
                parcel.writeIntArray(this.f16030z);
            }
            parcel.writeInt(this.A);
            if (this.A > 0) {
                parcel.writeIntArray(this.B);
            }
            parcel.writeInt(this.D ? 1 : 0);
            parcel.writeInt(this.E ? 1 : 0);
            parcel.writeInt(this.F ? 1 : 0);
            parcel.writeList(this.C);
        }

        public e(Parcel parcel) {
            this.f16027w = parcel.readInt();
            this.f16028x = parcel.readInt();
            int readInt = parcel.readInt();
            this.f16029y = readInt;
            if (readInt > 0) {
                int[] iArr = new int[readInt];
                this.f16030z = iArr;
                parcel.readIntArray(iArr);
            }
            int readInt2 = parcel.readInt();
            this.A = readInt2;
            if (readInt2 > 0) {
                int[] iArr2 = new int[readInt2];
                this.B = iArr2;
                parcel.readIntArray(iArr2);
            }
            this.D = parcel.readInt() == 1;
            this.E = parcel.readInt() == 1;
            this.F = parcel.readInt() == 1;
            this.C = parcel.readArrayList(d.a.class.getClassLoader());
        }

        public e(e eVar) {
            this.f16029y = eVar.f16029y;
            this.f16027w = eVar.f16027w;
            this.f16028x = eVar.f16028x;
            this.f16030z = eVar.f16030z;
            this.A = eVar.A;
            this.B = eVar.B;
            this.D = eVar.D;
            this.E = eVar.E;
            this.F = eVar.F;
            this.C = eVar.C;
        }
    }

    /* loaded from: classes.dex */
    public class f {

        /* renamed from: a  reason: collision with root package name */
        public ArrayList<View> f16031a = new ArrayList<>();

        /* renamed from: b  reason: collision with root package name */
        public int f16032b = Integer.MIN_VALUE;

        /* renamed from: c  reason: collision with root package name */
        public int f16033c = Integer.MIN_VALUE;

        /* renamed from: d  reason: collision with root package name */
        public int f16034d = 0;

        /* renamed from: e  reason: collision with root package name */
        public final int f16035e;

        public f(int i10) {
            this.f16035e = i10;
        }

        public void a(View view) {
            c n10 = n(view);
            n10.A = this;
            this.f16031a.add(view);
            this.f16033c = Integer.MIN_VALUE;
            if (this.f16031a.size() == 1) {
                this.f16032b = Integer.MIN_VALUE;
            }
            if (n10.c() || n10.b()) {
                this.f16034d += StaggeredGridLayoutManager.this.Q.e(view);
            }
        }

        public void b(boolean z10, int i10) {
            int p10;
            if (z10) {
                p10 = l(Integer.MIN_VALUE);
            } else {
                p10 = p(Integer.MIN_VALUE);
            }
            e();
            if (p10 == Integer.MIN_VALUE) {
                return;
            }
            if (!z10 || p10 >= StaggeredGridLayoutManager.this.Q.i()) {
                if (z10 || p10 <= StaggeredGridLayoutManager.this.Q.m()) {
                    if (i10 != Integer.MIN_VALUE) {
                        p10 += i10;
                    }
                    this.f16033c = p10;
                    this.f16032b = p10;
                }
            }
        }

        public void c() {
            d.a f10;
            ArrayList<View> arrayList = this.f16031a;
            View view = arrayList.get(arrayList.size() - 1);
            c n10 = n(view);
            this.f16033c = StaggeredGridLayoutManager.this.Q.d(view);
            if (n10.B && (f10 = StaggeredGridLayoutManager.this.f16001a0.f(n10.a())) != null && f10.f16024x == 1) {
                this.f16033c += f10.a(this.f16035e);
            }
        }

        public void d() {
            d.a f10;
            View view = this.f16031a.get(0);
            c n10 = n(view);
            this.f16032b = StaggeredGridLayoutManager.this.Q.g(view);
            if (n10.B && (f10 = StaggeredGridLayoutManager.this.f16001a0.f(n10.a())) != null && f10.f16024x == -1) {
                this.f16032b -= f10.a(this.f16035e);
            }
        }

        public void e() {
            this.f16031a.clear();
            q();
            this.f16034d = 0;
        }

        public int f() {
            if (StaggeredGridLayoutManager.this.V) {
                return i(this.f16031a.size() - 1, -1, true);
            }
            return i(0, this.f16031a.size(), true);
        }

        public int g() {
            if (StaggeredGridLayoutManager.this.V) {
                return i(0, this.f16031a.size(), true);
            }
            return i(this.f16031a.size() - 1, -1, true);
        }

        public int h(int i10, int i11, boolean z10, boolean z11, boolean z12) {
            int m10 = StaggeredGridLayoutManager.this.Q.m();
            int i12 = StaggeredGridLayoutManager.this.Q.i();
            int i13 = i11 > i10 ? 1 : -1;
            while (i10 != i11) {
                View view = this.f16031a.get(i10);
                int g10 = StaggeredGridLayoutManager.this.Q.g(view);
                int d10 = StaggeredGridLayoutManager.this.Q.d(view);
                boolean z13 = false;
                boolean z14 = !z12 ? g10 >= i12 : g10 > i12;
                if (!z12 ? d10 > m10 : d10 >= m10) {
                    z13 = true;
                }
                if (z14 && z13) {
                    if (z10 && z11) {
                        if (g10 >= m10 && d10 <= i12) {
                            return StaggeredGridLayoutManager.this.o0(view);
                        }
                    } else if (z11) {
                        return StaggeredGridLayoutManager.this.o0(view);
                    } else {
                        if (g10 < m10 || d10 > i12) {
                            return StaggeredGridLayoutManager.this.o0(view);
                        }
                    }
                }
                i10 += i13;
            }
            return -1;
        }

        public int i(int i10, int i11, boolean z10) {
            return h(i10, i11, false, false, z10);
        }

        public int j() {
            return this.f16034d;
        }

        public int k() {
            int i10 = this.f16033c;
            if (i10 != Integer.MIN_VALUE) {
                return i10;
            }
            c();
            return this.f16033c;
        }

        public int l(int i10) {
            int i11 = this.f16033c;
            if (i11 != Integer.MIN_VALUE) {
                return i11;
            }
            if (this.f16031a.size() == 0) {
                return i10;
            }
            c();
            return this.f16033c;
        }

        public View m(int i10, int i11) {
            View view = null;
            if (i11 == -1) {
                int size = this.f16031a.size();
                int i12 = 0;
                while (i12 < size) {
                    View view2 = this.f16031a.get(i12);
                    StaggeredGridLayoutManager staggeredGridLayoutManager = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager.V && staggeredGridLayoutManager.o0(view2) <= i10) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager2 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager2.V && staggeredGridLayoutManager2.o0(view2) >= i10) || !view2.hasFocusable()) {
                        break;
                    }
                    i12++;
                    view = view2;
                }
            } else {
                int size2 = this.f16031a.size() - 1;
                while (size2 >= 0) {
                    View view3 = this.f16031a.get(size2);
                    StaggeredGridLayoutManager staggeredGridLayoutManager3 = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager3.V && staggeredGridLayoutManager3.o0(view3) >= i10) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager4 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager4.V && staggeredGridLayoutManager4.o0(view3) <= i10) || !view3.hasFocusable()) {
                        break;
                    }
                    size2--;
                    view = view3;
                }
            }
            return view;
        }

        public c n(View view) {
            return (c) view.getLayoutParams();
        }

        public int o() {
            int i10 = this.f16032b;
            if (i10 != Integer.MIN_VALUE) {
                return i10;
            }
            d();
            return this.f16032b;
        }

        public int p(int i10) {
            int i11 = this.f16032b;
            if (i11 != Integer.MIN_VALUE) {
                return i11;
            }
            if (this.f16031a.size() == 0) {
                return i10;
            }
            d();
            return this.f16032b;
        }

        public void q() {
            this.f16032b = Integer.MIN_VALUE;
            this.f16033c = Integer.MIN_VALUE;
        }

        public void r(int i10) {
            int i11 = this.f16032b;
            if (i11 != Integer.MIN_VALUE) {
                this.f16032b = i11 + i10;
            }
            int i12 = this.f16033c;
            if (i12 != Integer.MIN_VALUE) {
                this.f16033c = i12 + i10;
            }
        }

        public void s() {
            int size = this.f16031a.size();
            View remove = this.f16031a.remove(size - 1);
            c n10 = n(remove);
            n10.A = null;
            if (n10.c() || n10.b()) {
                this.f16034d -= StaggeredGridLayoutManager.this.Q.e(remove);
            }
            if (size == 1) {
                this.f16032b = Integer.MIN_VALUE;
            }
            this.f16033c = Integer.MIN_VALUE;
        }

        public void t() {
            View remove = this.f16031a.remove(0);
            c n10 = n(remove);
            n10.A = null;
            if (this.f16031a.size() == 0) {
                this.f16033c = Integer.MIN_VALUE;
            }
            if (n10.c() || n10.b()) {
                this.f16034d -= StaggeredGridLayoutManager.this.Q.e(remove);
            }
            this.f16032b = Integer.MIN_VALUE;
        }

        public void u(View view) {
            c n10 = n(view);
            n10.A = this;
            this.f16031a.add(0, view);
            this.f16032b = Integer.MIN_VALUE;
            if (this.f16031a.size() == 1) {
                this.f16033c = Integer.MIN_VALUE;
            }
            if (n10.c() || n10.b()) {
                this.f16034d += StaggeredGridLayoutManager.this.Q.e(view);
            }
        }

        public void v(int i10) {
            this.f16032b = i10;
            this.f16033c = i10;
        }
    }

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i10, int i11) {
        RecyclerView.p.d p02 = RecyclerView.p.p0(context, attributeSet, i10, i11);
        Q2(p02.f15977a);
        S2(p02.f15978b);
        R2(p02.f15979c);
        this.U = new q();
        j2();
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0074, code lost:
        if (r10 == r11) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0086, code lost:
        if (r10 == r11) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0088, code lost:
        r10 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x008a, code lost:
        r10 = false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.view.View A2() {
        /*
            r12 = this;
            int r0 = r12.U()
            r1 = 1
            int r0 = r0 - r1
            java.util.BitSet r2 = new java.util.BitSet
            int r3 = r12.O
            r2.<init>(r3)
            int r3 = r12.O
            r4 = 0
            r2.set(r4, r3, r1)
            int r3 = r12.S
            r5 = -1
            if (r3 != r1) goto L20
            boolean r3 = r12.C2()
            if (r3 == 0) goto L20
            r3 = r1
            goto L21
        L20:
            r3 = r5
        L21:
            boolean r6 = r12.W
            if (r6 == 0) goto L27
            r6 = r5
            goto L2b
        L27:
            int r0 = r0 + 1
            r6 = r0
            r0 = r4
        L2b:
            if (r0 >= r6) goto L2e
            r5 = r1
        L2e:
            if (r0 == r6) goto Lab
            android.view.View r7 = r12.T(r0)
            android.view.ViewGroup$LayoutParams r8 = r7.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r8 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.c) r8
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r9 = r8.A
            int r9 = r9.f16035e
            boolean r9 = r2.get(r9)
            if (r9 == 0) goto L54
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r9 = r8.A
            boolean r9 = r12.c2(r9)
            if (r9 == 0) goto L4d
            return r7
        L4d:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r9 = r8.A
            int r9 = r9.f16035e
            r2.clear(r9)
        L54:
            boolean r9 = r8.B
            if (r9 == 0) goto L59
            goto La9
        L59:
            int r9 = r0 + r5
            if (r9 == r6) goto La9
            android.view.View r9 = r12.T(r9)
            boolean r10 = r12.W
            if (r10 == 0) goto L77
            androidx.recyclerview.widget.x r10 = r12.Q
            int r10 = r10.d(r7)
            androidx.recyclerview.widget.x r11 = r12.Q
            int r11 = r11.d(r9)
            if (r10 >= r11) goto L74
            return r7
        L74:
            if (r10 != r11) goto L8a
            goto L88
        L77:
            androidx.recyclerview.widget.x r10 = r12.Q
            int r10 = r10.g(r7)
            androidx.recyclerview.widget.x r11 = r12.Q
            int r11 = r11.g(r9)
            if (r10 <= r11) goto L86
            return r7
        L86:
            if (r10 != r11) goto L8a
        L88:
            r10 = r1
            goto L8b
        L8a:
            r10 = r4
        L8b:
            if (r10 == 0) goto La9
            android.view.ViewGroup$LayoutParams r9 = r9.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r9 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.c) r9
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r8 = r8.A
            int r8 = r8.f16035e
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r9 = r9.A
            int r9 = r9.f16035e
            int r8 = r8 - r9
            if (r8 >= 0) goto La0
            r8 = r1
            goto La1
        La0:
            r8 = r4
        La1:
            if (r3 >= 0) goto La5
            r9 = r1
            goto La6
        La5:
            r9 = r4
        La6:
            if (r8 == r9) goto La9
            return r7
        La9:
            int r0 = r0 + r5
            goto L2e
        Lab:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.A2():android.view.View");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int B(RecyclerView.b0 b0Var) {
        return d2(b0Var);
    }

    public void B2() {
        this.f16001a0.b();
        C1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int C(RecyclerView.b0 b0Var) {
        return e2(b0Var);
    }

    public boolean C2() {
        return k0() == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int D(RecyclerView.b0 b0Var) {
        return f2(b0Var);
    }

    public final void D2(View view, int i10, int i11, boolean z10) {
        boolean O1;
        u(view, this.f16007g0);
        c cVar = (c) view.getLayoutParams();
        int i12 = ((ViewGroup.MarginLayoutParams) cVar).leftMargin;
        Rect rect = this.f16007g0;
        int a32 = a3(i10, i12 + rect.left, ((ViewGroup.MarginLayoutParams) cVar).rightMargin + rect.right);
        int i13 = ((ViewGroup.MarginLayoutParams) cVar).topMargin;
        Rect rect2 = this.f16007g0;
        int a33 = a3(i11, i13 + rect2.top, ((ViewGroup.MarginLayoutParams) cVar).bottomMargin + rect2.bottom);
        if (z10) {
            O1 = Q1(view, a32, a33, cVar);
        } else {
            O1 = O1(view, a32, a33, cVar);
        }
        if (O1) {
            view.measure(a32, a33);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int E(RecyclerView.b0 b0Var) {
        return d2(b0Var);
    }

    public final void E2(View view, c cVar, boolean z10) {
        if (cVar.B) {
            if (this.S == 1) {
                D2(view, this.f16006f0, RecyclerView.p.V(h0(), i0(), getPaddingTop() + getPaddingBottom(), ((ViewGroup.MarginLayoutParams) cVar).height, true), z10);
            } else {
                D2(view, RecyclerView.p.V(v0(), w0(), getPaddingLeft() + getPaddingRight(), ((ViewGroup.MarginLayoutParams) cVar).width, true), this.f16006f0, z10);
            }
        } else if (this.S == 1) {
            D2(view, RecyclerView.p.V(this.T, w0(), 0, ((ViewGroup.MarginLayoutParams) cVar).width, false), RecyclerView.p.V(h0(), i0(), getPaddingTop() + getPaddingBottom(), ((ViewGroup.MarginLayoutParams) cVar).height, true), z10);
        } else {
            D2(view, RecyclerView.p.V(v0(), w0(), getPaddingLeft() + getPaddingRight(), ((ViewGroup.MarginLayoutParams) cVar).width, true), RecyclerView.p.V(this.T, i0(), 0, ((ViewGroup.MarginLayoutParams) cVar).height, false), z10);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int F(RecyclerView.b0 b0Var) {
        return e2(b0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int F1(int i10, RecyclerView.w wVar, RecyclerView.b0 b0Var) {
        return O2(i10, wVar, b0Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:87:0x0157, code lost:
        if (b2() != false) goto L83;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void F2(androidx.recyclerview.widget.RecyclerView.w r9, androidx.recyclerview.widget.RecyclerView.b0 r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 379
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.F2(androidx.recyclerview.widget.RecyclerView$w, androidx.recyclerview.widget.RecyclerView$b0, boolean):void");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int G(RecyclerView.b0 b0Var) {
        return f2(b0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void G1(int i10) {
        e eVar = this.f16005e0;
        if (eVar != null && eVar.f16027w != i10) {
            eVar.a();
        }
        this.Y = i10;
        this.Z = Integer.MIN_VALUE;
        C1();
    }

    public final boolean G2(int i10) {
        if (this.S == 0) {
            return (i10 == -1) != this.W;
        }
        return ((i10 == -1) == this.W) == C2();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int H1(int i10, RecyclerView.w wVar, RecyclerView.b0 b0Var) {
        return O2(i10, wVar, b0Var);
    }

    public void H2(int i10, RecyclerView.b0 b0Var) {
        int i11;
        int s22;
        if (i10 > 0) {
            s22 = t2();
            i11 = 1;
        } else {
            i11 = -1;
            s22 = s2();
        }
        this.U.f16317a = true;
        X2(s22, b0Var);
        P2(i11);
        q qVar = this.U;
        qVar.f16319c = s22 + qVar.f16320d;
        qVar.f16318b = Math.abs(i10);
    }

    public final void I2(View view) {
        for (int i10 = this.O - 1; i10 >= 0; i10--) {
            this.P[i10].u(view);
        }
    }

    public final void J2(RecyclerView.w wVar, q qVar) {
        int min;
        int min2;
        if (!qVar.f16317a || qVar.f16325i) {
            return;
        }
        if (qVar.f16318b == 0) {
            if (qVar.f16321e == -1) {
                K2(wVar, qVar.f16323g);
            } else {
                L2(wVar, qVar.f16322f);
            }
        } else if (qVar.f16321e == -1) {
            int i10 = qVar.f16322f;
            int v22 = i10 - v2(i10);
            if (v22 < 0) {
                min2 = qVar.f16323g;
            } else {
                min2 = qVar.f16323g - Math.min(v22, qVar.f16318b);
            }
            K2(wVar, min2);
        } else {
            int w22 = w2(qVar.f16323g) - qVar.f16323g;
            if (w22 < 0) {
                min = qVar.f16322f;
            } else {
                min = Math.min(w22, qVar.f16318b) + qVar.f16322f;
            }
            L2(wVar, min);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void K0(int i10) {
        super.K0(i10);
        for (int i11 = 0; i11 < this.O; i11++) {
            this.P[i11].r(i10);
        }
    }

    public final void K2(RecyclerView.w wVar, int i10) {
        for (int U = U() - 1; U >= 0; U--) {
            View T = T(U);
            if (this.Q.g(T) < i10 || this.Q.q(T) < i10) {
                return;
            }
            c cVar = (c) T.getLayoutParams();
            if (cVar.B) {
                for (int i11 = 0; i11 < this.O; i11++) {
                    if (this.P[i11].f16031a.size() == 1) {
                        return;
                    }
                }
                for (int i12 = 0; i12 < this.O; i12++) {
                    this.P[i12].s();
                }
            } else if (cVar.A.f16031a.size() == 1) {
                return;
            } else {
                cVar.A.s();
            }
            v1(T, wVar);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void L0(int i10) {
        super.L0(i10);
        for (int i11 = 0; i11 < this.O; i11++) {
            this.P[i11].r(i10);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void L1(Rect rect, int i10, int i11) {
        int y10;
        int y11;
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        if (this.S == 1) {
            y11 = RecyclerView.p.y(i11, rect.height() + paddingTop, m0());
            y10 = RecyclerView.p.y(i10, (this.T * this.O) + paddingLeft, n0());
        } else {
            y10 = RecyclerView.p.y(i10, rect.width() + paddingLeft, n0());
            y11 = RecyclerView.p.y(i11, (this.T * this.O) + paddingTop, m0());
        }
        K1(y10, y11);
    }

    public final void L2(RecyclerView.w wVar, int i10) {
        while (U() > 0) {
            View T = T(0);
            if (this.Q.d(T) > i10 || this.Q.p(T) > i10) {
                return;
            }
            c cVar = (c) T.getLayoutParams();
            if (cVar.B) {
                for (int i11 = 0; i11 < this.O; i11++) {
                    if (this.P[i11].f16031a.size() == 1) {
                        return;
                    }
                }
                for (int i12 = 0; i12 < this.O; i12++) {
                    this.P[i12].t();
                }
            } else if (cVar.A.f16031a.size() == 1) {
                return;
            } else {
                cVar.A.t();
            }
            v1(T, wVar);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void M0(RecyclerView.h hVar, RecyclerView.h hVar2) {
        this.f16001a0.b();
        for (int i10 = 0; i10 < this.O; i10++) {
            this.P[i10].e();
        }
    }

    public final void M2() {
        if (this.R.k() == 1073741824) {
            return;
        }
        float f10 = 0.0f;
        int U = U();
        for (int i10 = 0; i10 < U; i10++) {
            View T = T(i10);
            float e10 = this.R.e(T);
            if (e10 >= f10) {
                if (((c) T.getLayoutParams()).e()) {
                    e10 = (e10 * 1.0f) / this.O;
                }
                f10 = Math.max(f10, e10);
            }
        }
        int i11 = this.T;
        int round = Math.round(f10 * this.O);
        if (this.R.k() == Integer.MIN_VALUE) {
            round = Math.min(round, this.R.n());
        }
        Y2(round);
        if (this.T == i11) {
            return;
        }
        for (int i12 = 0; i12 < U; i12++) {
            View T2 = T(i12);
            c cVar = (c) T2.getLayoutParams();
            if (!cVar.B) {
                if (C2() && this.S == 1) {
                    int i13 = this.O;
                    int i14 = cVar.A.f16035e;
                    T2.offsetLeftAndRight(((-((i13 - 1) - i14)) * this.T) - ((-((i13 - 1) - i14)) * i11));
                } else {
                    int i15 = cVar.A.f16035e;
                    int i16 = this.T * i15;
                    int i17 = i15 * i11;
                    if (this.S == 1) {
                        T2.offsetLeftAndRight(i16 - i17);
                    } else {
                        T2.offsetTopAndBottom(i16 - i17);
                    }
                }
            }
        }
    }

    public final void N2() {
        if (this.S != 1 && C2()) {
            this.W = !this.V;
        } else {
            this.W = this.V;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public RecyclerView.q O() {
        if (this.S == 0) {
            return new c(-2, -1);
        }
        return new c(-1, -2);
    }

    public int O2(int i10, RecyclerView.w wVar, RecyclerView.b0 b0Var) {
        if (U() == 0 || i10 == 0) {
            return 0;
        }
        H2(i10, b0Var);
        int k22 = k2(wVar, this.U, b0Var);
        if (this.U.f16318b >= k22) {
            i10 = i10 < 0 ? -k22 : k22;
        }
        this.Q.r(-i10);
        this.f16003c0 = this.W;
        q qVar = this.U;
        qVar.f16318b = 0;
        J2(wVar, qVar);
        return i10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public RecyclerView.q P(Context context, AttributeSet attributeSet) {
        return new c(context, attributeSet);
    }

    public final void P2(int i10) {
        q qVar = this.U;
        qVar.f16321e = i10;
        qVar.f16320d = this.W != (i10 == -1) ? -1 : 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public RecyclerView.q Q(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new c((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new c(layoutParams);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void Q0(RecyclerView recyclerView, RecyclerView.w wVar) {
        super.Q0(recyclerView, wVar);
        x1(this.f16012l0);
        for (int i10 = 0; i10 < this.O; i10++) {
            this.P[i10].e();
        }
        recyclerView.requestLayout();
    }

    public void Q2(int i10) {
        if (i10 != 0 && i10 != 1) {
            throw new IllegalArgumentException("invalid orientation.");
        }
        r(null);
        if (i10 == this.S) {
            return;
        }
        this.S = i10;
        x xVar = this.Q;
        this.Q = this.R;
        this.R = xVar;
        C1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public View R0(View view, int i10, RecyclerView.w wVar, RecyclerView.b0 b0Var) {
        View M;
        int s22;
        int g10;
        int g11;
        int g12;
        View m10;
        if (U() == 0 || (M = M(view)) == null) {
            return null;
        }
        N2();
        int g22 = g2(i10);
        if (g22 == Integer.MIN_VALUE) {
            return null;
        }
        c cVar = (c) M.getLayoutParams();
        boolean z10 = cVar.B;
        f fVar = cVar.A;
        if (g22 == 1) {
            s22 = t2();
        } else {
            s22 = s2();
        }
        X2(s22, b0Var);
        P2(g22);
        q qVar = this.U;
        qVar.f16319c = qVar.f16320d + s22;
        qVar.f16318b = (int) (this.Q.n() * 0.33333334f);
        q qVar2 = this.U;
        qVar2.f16324h = true;
        qVar2.f16317a = false;
        k2(wVar, qVar2, b0Var);
        this.f16003c0 = this.W;
        if (z10 || (m10 = fVar.m(s22, g22)) == null || m10 == M) {
            if (G2(g22)) {
                for (int i11 = this.O - 1; i11 >= 0; i11--) {
                    View m11 = this.P[i11].m(s22, g22);
                    if (m11 != null && m11 != M) {
                        return m11;
                    }
                }
            } else {
                for (int i12 = 0; i12 < this.O; i12++) {
                    View m12 = this.P[i12].m(s22, g22);
                    if (m12 != null && m12 != M) {
                        return m12;
                    }
                }
            }
            boolean z11 = (this.V ^ true) == (g22 == -1);
            if (!z10) {
                if (z11) {
                    g12 = fVar.f();
                } else {
                    g12 = fVar.g();
                }
                View N = N(g12);
                if (N != null && N != M) {
                    return N;
                }
            }
            if (G2(g22)) {
                for (int i13 = this.O - 1; i13 >= 0; i13--) {
                    if (i13 != fVar.f16035e) {
                        if (z11) {
                            g11 = this.P[i13].f();
                        } else {
                            g11 = this.P[i13].g();
                        }
                        View N2 = N(g11);
                        if (N2 != null && N2 != M) {
                            return N2;
                        }
                    }
                }
            } else {
                for (int i14 = 0; i14 < this.O; i14++) {
                    if (z11) {
                        g10 = this.P[i14].f();
                    } else {
                        g10 = this.P[i14].g();
                    }
                    View N3 = N(g10);
                    if (N3 != null && N3 != M) {
                        return N3;
                    }
                }
            }
            return null;
        }
        return m10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void R1(RecyclerView recyclerView, RecyclerView.b0 b0Var, int i10) {
        r rVar = new r(recyclerView.getContext());
        rVar.p(i10);
        S1(rVar);
    }

    public void R2(boolean z10) {
        r(null);
        e eVar = this.f16005e0;
        if (eVar != null && eVar.D != z10) {
            eVar.D = z10;
        }
        this.V = z10;
        C1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void S0(AccessibilityEvent accessibilityEvent) {
        super.S0(accessibilityEvent);
        if (U() > 0) {
            View n22 = n2(false);
            View m22 = m2(false);
            if (n22 == null || m22 == null) {
                return;
            }
            int o02 = o0(n22);
            int o03 = o0(m22);
            if (o02 < o03) {
                accessibilityEvent.setFromIndex(o02);
                accessibilityEvent.setToIndex(o03);
                return;
            }
            accessibilityEvent.setFromIndex(o03);
            accessibilityEvent.setToIndex(o02);
        }
    }

    public void S2(int i10) {
        r(null);
        if (i10 != this.O) {
            B2();
            this.O = i10;
            this.X = new BitSet(this.O);
            this.P = new f[this.O];
            for (int i11 = 0; i11 < this.O; i11++) {
                this.P[i11] = new f(i11);
            }
            C1();
        }
    }

    public final void T2(int i10, int i11) {
        for (int i12 = 0; i12 < this.O; i12++) {
            if (!this.P[i12].f16031a.isEmpty()) {
                Z2(this.P[i12], i10, i11);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean U1() {
        return this.f16005e0 == null;
    }

    public final boolean U2(RecyclerView.b0 b0Var, b bVar) {
        int l22;
        if (this.f16003c0) {
            l22 = p2(b0Var.b());
        } else {
            l22 = l2(b0Var.b());
        }
        bVar.f16014a = l22;
        bVar.f16015b = Integer.MIN_VALUE;
        return true;
    }

    public final void V1(View view) {
        for (int i10 = this.O - 1; i10 >= 0; i10--) {
            this.P[i10].a(view);
        }
    }

    public boolean V2(RecyclerView.b0 b0Var, b bVar) {
        int i10;
        int m10;
        if (!b0Var.e() && (i10 = this.Y) != -1) {
            if (i10 >= 0 && i10 < b0Var.b()) {
                e eVar = this.f16005e0;
                if (eVar != null && eVar.f16027w != -1 && eVar.f16029y >= 1) {
                    bVar.f16015b = Integer.MIN_VALUE;
                    bVar.f16014a = this.Y;
                } else {
                    View N = N(this.Y);
                    if (N != null) {
                        bVar.f16014a = this.W ? t2() : s2();
                        if (this.Z != Integer.MIN_VALUE) {
                            if (bVar.f16016c) {
                                bVar.f16015b = (this.Q.i() - this.Z) - this.Q.d(N);
                            } else {
                                bVar.f16015b = (this.Q.m() + this.Z) - this.Q.g(N);
                            }
                            return true;
                        } else if (this.Q.e(N) > this.Q.n()) {
                            if (bVar.f16016c) {
                                m10 = this.Q.i();
                            } else {
                                m10 = this.Q.m();
                            }
                            bVar.f16015b = m10;
                            return true;
                        } else {
                            int g10 = this.Q.g(N) - this.Q.m();
                            if (g10 < 0) {
                                bVar.f16015b = -g10;
                                return true;
                            }
                            int i11 = this.Q.i() - this.Q.d(N);
                            if (i11 < 0) {
                                bVar.f16015b = i11;
                                return true;
                            }
                            bVar.f16015b = Integer.MIN_VALUE;
                        }
                    } else {
                        int i12 = this.Y;
                        bVar.f16014a = i12;
                        int i13 = this.Z;
                        if (i13 == Integer.MIN_VALUE) {
                            bVar.f16016c = a2(i12) == 1;
                            bVar.a();
                        } else {
                            bVar.b(i13);
                        }
                        bVar.f16017d = true;
                    }
                }
                return true;
            }
            this.Y = -1;
            this.Z = Integer.MIN_VALUE;
        }
        return false;
    }

    public final void W1(b bVar) {
        int m10;
        e eVar = this.f16005e0;
        int i10 = eVar.f16029y;
        if (i10 > 0) {
            if (i10 == this.O) {
                for (int i11 = 0; i11 < this.O; i11++) {
                    this.P[i11].e();
                    e eVar2 = this.f16005e0;
                    int i12 = eVar2.f16030z[i11];
                    if (i12 != Integer.MIN_VALUE) {
                        if (eVar2.E) {
                            m10 = this.Q.i();
                        } else {
                            m10 = this.Q.m();
                        }
                        i12 += m10;
                    }
                    this.P[i11].v(i12);
                }
            } else {
                eVar.b();
                e eVar3 = this.f16005e0;
                eVar3.f16027w = eVar3.f16028x;
            }
        }
        e eVar4 = this.f16005e0;
        this.f16004d0 = eVar4.F;
        R2(eVar4.D);
        N2();
        e eVar5 = this.f16005e0;
        int i13 = eVar5.f16027w;
        if (i13 != -1) {
            this.Y = i13;
            bVar.f16016c = eVar5.E;
        } else {
            bVar.f16016c = this.W;
        }
        if (eVar5.A > 1) {
            d dVar = this.f16001a0;
            dVar.f16021a = eVar5.B;
            dVar.f16022b = eVar5.C;
        }
    }

    public void W2(RecyclerView.b0 b0Var, b bVar) {
        if (V2(b0Var, bVar) || U2(b0Var, bVar)) {
            return;
        }
        bVar.a();
        bVar.f16014a = 0;
    }

    public boolean X1() {
        int l10 = this.P[0].l(Integer.MIN_VALUE);
        for (int i10 = 1; i10 < this.O; i10++) {
            if (this.P[i10].l(Integer.MIN_VALUE) != l10) {
                return false;
            }
        }
        return true;
    }

    public final void X2(int i10, RecyclerView.b0 b0Var) {
        int i11;
        int i12;
        int c10;
        q qVar = this.U;
        boolean z10 = false;
        qVar.f16318b = 0;
        qVar.f16319c = i10;
        if (!F0() || (c10 = b0Var.c()) == -1) {
            i11 = 0;
            i12 = 0;
        } else {
            if (this.W == (c10 < i10)) {
                i11 = this.Q.n();
                i12 = 0;
            } else {
                i12 = this.Q.n();
                i11 = 0;
            }
        }
        if (X()) {
            this.U.f16322f = this.Q.m() - i12;
            this.U.f16323g = this.Q.i() + i11;
        } else {
            this.U.f16323g = this.Q.h() + i11;
            this.U.f16322f = -i12;
        }
        q qVar2 = this.U;
        qVar2.f16324h = false;
        qVar2.f16317a = true;
        if (this.Q.k() == 0 && this.Q.h() == 0) {
            z10 = true;
        }
        qVar2.f16325i = z10;
    }

    public boolean Y1() {
        int p10 = this.P[0].p(Integer.MIN_VALUE);
        for (int i10 = 1; i10 < this.O; i10++) {
            if (this.P[i10].p(Integer.MIN_VALUE) != p10) {
                return false;
            }
        }
        return true;
    }

    public void Y2(int i10) {
        this.T = i10 / this.O;
        this.f16006f0 = View.MeasureSpec.makeMeasureSpec(i10, this.R.k());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void Z0(RecyclerView recyclerView, int i10, int i11) {
        z2(i10, i11, 1);
    }

    public final void Z1(View view, c cVar, q qVar) {
        if (qVar.f16321e == 1) {
            if (cVar.B) {
                V1(view);
            } else {
                cVar.A.a(view);
            }
        } else if (cVar.B) {
            I2(view);
        } else {
            cVar.A.u(view);
        }
    }

    public final void Z2(f fVar, int i10, int i11) {
        int j10 = fVar.j();
        if (i10 == -1) {
            if (fVar.o() + j10 <= i11) {
                this.X.set(fVar.f16035e, false);
            }
        } else if (fVar.k() - j10 >= i11) {
            this.X.set(fVar.f16035e, false);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a0.b
    public PointF a(int i10) {
        int a22 = a2(i10);
        PointF pointF = new PointF();
        if (a22 == 0) {
            return null;
        }
        if (this.S == 0) {
            pointF.x = a22;
            pointF.y = 0.0f;
        } else {
            pointF.x = 0.0f;
            pointF.y = a22;
        }
        return pointF;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void a1(RecyclerView recyclerView) {
        this.f16001a0.b();
        C1();
    }

    public final int a2(int i10) {
        if (U() == 0) {
            return this.W ? 1 : -1;
        }
        return (i10 < s2()) != this.W ? -1 : 1;
    }

    public final int a3(int i10, int i11, int i12) {
        if (i11 == 0 && i12 == 0) {
            return i10;
        }
        int mode = View.MeasureSpec.getMode(i10);
        return (mode == Integer.MIN_VALUE || mode == 1073741824) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i10) - i11) - i12), mode) : i10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void b1(RecyclerView recyclerView, int i10, int i11, int i12) {
        z2(i10, i11, 8);
    }

    public boolean b2() {
        int s22;
        int t22;
        if (U() == 0 || this.f16002b0 == 0 || !y0()) {
            return false;
        }
        if (this.W) {
            s22 = t2();
            t22 = s2();
        } else {
            s22 = s2();
            t22 = t2();
        }
        if (s22 == 0 && A2() != null) {
            this.f16001a0.b();
            D1();
            C1();
            return true;
        } else if (this.f16009i0) {
            int i10 = this.W ? -1 : 1;
            int i11 = t22 + 1;
            d.a e10 = this.f16001a0.e(s22, i11, i10, true);
            if (e10 == null) {
                this.f16009i0 = false;
                this.f16001a0.d(i11);
                return false;
            }
            d.a e11 = this.f16001a0.e(s22, e10.f16023w, i10 * (-1), true);
            if (e11 == null) {
                this.f16001a0.d(e10.f16023w);
            } else {
                this.f16001a0.d(e11.f16023w + 1);
            }
            D1();
            C1();
            return true;
        } else {
            return false;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void c1(RecyclerView recyclerView, int i10, int i11) {
        z2(i10, i11, 2);
    }

    public final boolean c2(f fVar) {
        if (this.W) {
            if (fVar.k() < this.Q.i()) {
                ArrayList<View> arrayList = fVar.f16031a;
                return !fVar.n(arrayList.get(arrayList.size() - 1)).B;
            }
        } else if (fVar.o() > this.Q.m()) {
            return !fVar.n(fVar.f16031a.get(0)).B;
        }
        return false;
    }

    public final int d2(RecyclerView.b0 b0Var) {
        if (U() == 0) {
            return 0;
        }
        return a0.a(b0Var, this.Q, n2(!this.f16010j0), m2(!this.f16010j0), this, this.f16010j0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void e1(RecyclerView recyclerView, int i10, int i11, Object obj) {
        z2(i10, i11, 4);
    }

    public final int e2(RecyclerView.b0 b0Var) {
        if (U() == 0) {
            return 0;
        }
        return a0.b(b0Var, this.Q, n2(!this.f16010j0), m2(!this.f16010j0), this, this.f16010j0, this.W);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void f1(RecyclerView.w wVar, RecyclerView.b0 b0Var) {
        F2(wVar, b0Var, true);
    }

    public final int f2(RecyclerView.b0 b0Var) {
        if (U() == 0) {
            return 0;
        }
        return a0.c(b0Var, this.Q, n2(!this.f16010j0), m2(!this.f16010j0), this, this.f16010j0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void g1(RecyclerView.b0 b0Var) {
        super.g1(b0Var);
        this.Y = -1;
        this.Z = Integer.MIN_VALUE;
        this.f16005e0 = null;
        this.f16008h0.c();
    }

    public final int g2(int i10) {
        return i10 != 1 ? i10 != 2 ? i10 != 17 ? i10 != 33 ? i10 != 66 ? (i10 == 130 && this.S == 1) ? 1 : Integer.MIN_VALUE : this.S == 0 ? 1 : Integer.MIN_VALUE : this.S == 1 ? -1 : Integer.MIN_VALUE : this.S == 0 ? -1 : Integer.MIN_VALUE : (this.S != 1 && C2()) ? -1 : 1 : (this.S != 1 && C2()) ? 1 : -1;
    }

    public final d.a h2(int i10) {
        d.a aVar = new d.a();
        aVar.f16025y = new int[this.O];
        for (int i11 = 0; i11 < this.O; i11++) {
            aVar.f16025y[i11] = i10 - this.P[i11].l(i10);
        }
        return aVar;
    }

    public final d.a i2(int i10) {
        d.a aVar = new d.a();
        aVar.f16025y = new int[this.O];
        for (int i11 = 0; i11 < this.O; i11++) {
            aVar.f16025y[i11] = this.P[i11].p(i10) - i10;
        }
        return aVar;
    }

    public final void j2() {
        this.Q = x.b(this, this.S);
        this.R = x.b(this, 1 - this.S);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void k1(Parcelable parcelable) {
        if (parcelable instanceof e) {
            e eVar = (e) parcelable;
            this.f16005e0 = eVar;
            if (this.Y != -1) {
                eVar.a();
                this.f16005e0.b();
            }
            C1();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r9v7 */
    public final int k2(RecyclerView.w wVar, q qVar, RecyclerView.b0 b0Var) {
        int i10;
        int m10;
        int u22;
        f fVar;
        int e10;
        int i11;
        int i12;
        int e11;
        boolean z10;
        boolean Y1;
        ?? r92 = 0;
        this.X.set(0, this.O, true);
        if (this.U.f16325i) {
            i10 = qVar.f16321e == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        } else if (qVar.f16321e == 1) {
            i10 = qVar.f16323g + qVar.f16318b;
        } else {
            i10 = qVar.f16322f - qVar.f16318b;
        }
        int i13 = i10;
        T2(qVar.f16321e, i13);
        if (this.W) {
            m10 = this.Q.i();
        } else {
            m10 = this.Q.m();
        }
        int i14 = m10;
        boolean z11 = false;
        while (qVar.a(b0Var) && (this.U.f16325i || !this.X.isEmpty())) {
            View b10 = qVar.b(wVar);
            c cVar = (c) b10.getLayoutParams();
            int a10 = cVar.a();
            int g10 = this.f16001a0.g(a10);
            boolean z12 = g10 == -1 ? true : r92;
            if (z12) {
                fVar = cVar.B ? this.P[r92] : y2(qVar);
                this.f16001a0.n(a10, fVar);
            } else {
                fVar = this.P[g10];
            }
            f fVar2 = fVar;
            cVar.A = fVar2;
            if (qVar.f16321e == 1) {
                o(b10);
            } else {
                p(b10, r92);
            }
            E2(b10, cVar, r92);
            if (qVar.f16321e == 1) {
                int u23 = cVar.B ? u2(i14) : fVar2.l(i14);
                int e12 = this.Q.e(b10) + u23;
                if (z12 && cVar.B) {
                    d.a h22 = h2(u23);
                    h22.f16024x = -1;
                    h22.f16023w = a10;
                    this.f16001a0.a(h22);
                }
                i11 = e12;
                e10 = u23;
            } else {
                int x22 = cVar.B ? x2(i14) : fVar2.p(i14);
                e10 = x22 - this.Q.e(b10);
                if (z12 && cVar.B) {
                    d.a i22 = i2(x22);
                    i22.f16024x = 1;
                    i22.f16023w = a10;
                    this.f16001a0.a(i22);
                }
                i11 = x22;
            }
            if (cVar.B && qVar.f16320d == -1) {
                if (z12) {
                    this.f16009i0 = true;
                } else {
                    if (qVar.f16321e == 1) {
                        Y1 = X1();
                    } else {
                        Y1 = Y1();
                    }
                    if (!Y1) {
                        d.a f10 = this.f16001a0.f(a10);
                        if (f10 != null) {
                            f10.f16026z = true;
                        }
                        this.f16009i0 = true;
                    }
                }
            }
            Z1(b10, cVar, qVar);
            if (C2() && this.S == 1) {
                int i15 = cVar.B ? this.R.i() : this.R.i() - (((this.O - 1) - fVar2.f16035e) * this.T);
                e11 = i15;
                i12 = i15 - this.R.e(b10);
            } else {
                int m11 = cVar.B ? this.R.m() : (fVar2.f16035e * this.T) + this.R.m();
                i12 = m11;
                e11 = this.R.e(b10) + m11;
            }
            if (this.S == 1) {
                H0(b10, i12, e10, e11, i11);
            } else {
                H0(b10, e10, i12, i11, e11);
            }
            if (cVar.B) {
                T2(this.U.f16321e, i13);
            } else {
                Z2(fVar2, this.U.f16321e, i13);
            }
            J2(wVar, this.U);
            if (this.U.f16324h && b10.hasFocusable()) {
                if (cVar.B) {
                    this.X.clear();
                } else {
                    z10 = false;
                    this.X.set(fVar2.f16035e, false);
                    r92 = z10;
                    z11 = true;
                }
            }
            z10 = false;
            r92 = z10;
            z11 = true;
        }
        int i16 = r92;
        if (!z11) {
            J2(wVar, this.U);
        }
        if (this.U.f16321e == -1) {
            u22 = this.Q.m() - x2(this.Q.m());
        } else {
            u22 = u2(this.Q.i()) - this.Q.i();
        }
        return u22 > 0 ? Math.min(qVar.f16318b, u22) : i16;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public Parcelable l1() {
        int p10;
        int m10;
        int[] iArr;
        if (this.f16005e0 != null) {
            return new e(this.f16005e0);
        }
        e eVar = new e();
        eVar.D = this.V;
        eVar.E = this.f16003c0;
        eVar.F = this.f16004d0;
        d dVar = this.f16001a0;
        if (dVar != null && (iArr = dVar.f16021a) != null) {
            eVar.B = iArr;
            eVar.A = iArr.length;
            eVar.C = dVar.f16022b;
        } else {
            eVar.A = 0;
        }
        if (U() > 0) {
            eVar.f16027w = this.f16003c0 ? t2() : s2();
            eVar.f16028x = o2();
            int i10 = this.O;
            eVar.f16029y = i10;
            eVar.f16030z = new int[i10];
            for (int i11 = 0; i11 < this.O; i11++) {
                if (this.f16003c0) {
                    p10 = this.P[i11].l(Integer.MIN_VALUE);
                    if (p10 != Integer.MIN_VALUE) {
                        m10 = this.Q.i();
                        p10 -= m10;
                        eVar.f16030z[i11] = p10;
                    } else {
                        eVar.f16030z[i11] = p10;
                    }
                } else {
                    p10 = this.P[i11].p(Integer.MIN_VALUE);
                    if (p10 != Integer.MIN_VALUE) {
                        m10 = this.Q.m();
                        p10 -= m10;
                        eVar.f16030z[i11] = p10;
                    } else {
                        eVar.f16030z[i11] = p10;
                    }
                }
            }
        } else {
            eVar.f16027w = -1;
            eVar.f16028x = -1;
            eVar.f16029y = 0;
        }
        return eVar;
    }

    public final int l2(int i10) {
        int U = U();
        for (int i11 = 0; i11 < U; i11++) {
            int o02 = o0(T(i11));
            if (o02 >= 0 && o02 < i10) {
                return o02;
            }
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void m1(int i10) {
        if (i10 == 0) {
            b2();
        }
    }

    public View m2(boolean z10) {
        int m10 = this.Q.m();
        int i10 = this.Q.i();
        View view = null;
        for (int U = U() - 1; U >= 0; U--) {
            View T = T(U);
            int g10 = this.Q.g(T);
            int d10 = this.Q.d(T);
            if (d10 > m10 && g10 < i10) {
                if (d10 <= i10 || !z10) {
                    return T;
                }
                if (view == null) {
                    view = T;
                }
            }
        }
        return view;
    }

    public View n2(boolean z10) {
        int m10 = this.Q.m();
        int i10 = this.Q.i();
        int U = U();
        View view = null;
        for (int i11 = 0; i11 < U; i11++) {
            View T = T(i11);
            int g10 = this.Q.g(T);
            if (this.Q.d(T) > m10 && g10 < i10) {
                if (g10 >= m10 || !z10) {
                    return T;
                }
                if (view == null) {
                    view = T;
                }
            }
        }
        return view;
    }

    public int o2() {
        View m22 = this.W ? m2(true) : n2(true);
        if (m22 == null) {
            return -1;
        }
        return o0(m22);
    }

    public final int p2(int i10) {
        for (int U = U() - 1; U >= 0; U--) {
            int o02 = o0(T(U));
            if (o02 >= 0 && o02 < i10) {
                return o02;
            }
        }
        return 0;
    }

    public final void q2(RecyclerView.w wVar, RecyclerView.b0 b0Var, boolean z10) {
        int i10;
        int u22 = u2(Integer.MIN_VALUE);
        if (u22 != Integer.MIN_VALUE && (i10 = this.Q.i() - u22) > 0) {
            int i11 = i10 - (-O2(-i10, wVar, b0Var));
            if (!z10 || i11 <= 0) {
                return;
            }
            this.Q.r(i11);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void r(String str) {
        if (this.f16005e0 == null) {
            super.r(str);
        }
    }

    public final void r2(RecyclerView.w wVar, RecyclerView.b0 b0Var, boolean z10) {
        int m10;
        int x22 = x2(Integer.MAX_VALUE);
        if (x22 != Integer.MAX_VALUE && (m10 = x22 - this.Q.m()) > 0) {
            int O2 = m10 - O2(m10, wVar, b0Var);
            if (!z10 || O2 <= 0) {
                return;
            }
            this.Q.r(-O2);
        }
    }

    public int s2() {
        if (U() == 0) {
            return 0;
        }
        return o0(T(0));
    }

    public int t2() {
        int U = U();
        if (U == 0) {
            return 0;
        }
        return o0(T(U - 1));
    }

    public final int u2(int i10) {
        int l10 = this.P[0].l(i10);
        for (int i11 = 1; i11 < this.O; i11++) {
            int l11 = this.P[i11].l(i10);
            if (l11 > l10) {
                l10 = l11;
            }
        }
        return l10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean v() {
        return this.S == 0;
    }

    public final int v2(int i10) {
        int p10 = this.P[0].p(i10);
        for (int i11 = 1; i11 < this.O; i11++) {
            int p11 = this.P[i11].p(i10);
            if (p11 > p10) {
                p10 = p11;
            }
        }
        return p10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean w() {
        return this.S == 1;
    }

    public final int w2(int i10) {
        int l10 = this.P[0].l(i10);
        for (int i11 = 1; i11 < this.O; i11++) {
            int l11 = this.P[i11].l(i10);
            if (l11 < l10) {
                l10 = l11;
            }
        }
        return l10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean x(RecyclerView.q qVar) {
        return qVar instanceof c;
    }

    public final int x2(int i10) {
        int p10 = this.P[0].p(i10);
        for (int i11 = 1; i11 < this.O; i11++) {
            int p11 = this.P[i11].p(i10);
            if (p11 < p10) {
                p10 = p11;
            }
        }
        return p10;
    }

    public final f y2(q qVar) {
        int i10;
        int i11;
        int i12 = -1;
        if (G2(qVar.f16321e)) {
            i10 = this.O - 1;
            i11 = -1;
        } else {
            i10 = 0;
            i12 = this.O;
            i11 = 1;
        }
        f fVar = null;
        if (qVar.f16321e == 1) {
            int i13 = Integer.MAX_VALUE;
            int m10 = this.Q.m();
            while (i10 != i12) {
                f fVar2 = this.P[i10];
                int l10 = fVar2.l(m10);
                if (l10 < i13) {
                    fVar = fVar2;
                    i13 = l10;
                }
                i10 += i11;
            }
            return fVar;
        }
        int i14 = Integer.MIN_VALUE;
        int i15 = this.Q.i();
        while (i10 != i12) {
            f fVar3 = this.P[i10];
            int p10 = fVar3.p(i15);
            if (p10 > i14) {
                fVar = fVar3;
                i14 = p10;
            }
            i10 += i11;
        }
        return fVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void z(int i10, int i11, RecyclerView.b0 b0Var, RecyclerView.p.c cVar) {
        int l10;
        int i12;
        if (this.S != 0) {
            i10 = i11;
        }
        if (U() == 0 || i10 == 0) {
            return;
        }
        H2(i10, b0Var);
        int[] iArr = this.f16011k0;
        if (iArr == null || iArr.length < this.O) {
            this.f16011k0 = new int[this.O];
        }
        int i13 = 0;
        for (int i14 = 0; i14 < this.O; i14++) {
            q qVar = this.U;
            if (qVar.f16320d == -1) {
                l10 = qVar.f16322f;
                i12 = this.P[i14].p(l10);
            } else {
                l10 = this.P[i14].l(qVar.f16323g);
                i12 = this.U.f16323g;
            }
            int i15 = l10 - i12;
            if (i15 >= 0) {
                this.f16011k0[i13] = i15;
                i13++;
            }
        }
        Arrays.sort(this.f16011k0, 0, i13);
        for (int i16 = 0; i16 < i13 && this.U.a(b0Var); i16++) {
            cVar.a(this.U.f16319c, this.f16011k0[i16]);
            q qVar2 = this.U;
            qVar2.f16319c += qVar2.f16320d;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean z0() {
        return this.f16002b0 != 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0043 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void z2(int r7, int r8, int r9) {
        /*
            r6 = this;
            boolean r0 = r6.W
            if (r0 == 0) goto L9
            int r0 = r6.t2()
            goto Ld
        L9:
            int r0 = r6.s2()
        Ld:
            r1 = 8
            if (r9 != r1) goto L1a
            if (r7 >= r8) goto L16
            int r2 = r8 + 1
            goto L1c
        L16:
            int r2 = r7 + 1
            r3 = r8
            goto L1d
        L1a:
            int r2 = r7 + r8
        L1c:
            r3 = r7
        L1d:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r4 = r6.f16001a0
            r4.h(r3)
            r4 = 1
            if (r9 == r4) goto L3c
            r5 = 2
            if (r9 == r5) goto L36
            if (r9 == r1) goto L2b
            goto L41
        L2b:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r6.f16001a0
            r9.k(r7, r4)
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r7 = r6.f16001a0
            r7.j(r8, r4)
            goto L41
        L36:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r6.f16001a0
            r9.k(r7, r8)
            goto L41
        L3c:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r6.f16001a0
            r9.j(r7, r8)
        L41:
            if (r2 > r0) goto L44
            return
        L44:
            boolean r7 = r6.W
            if (r7 == 0) goto L4d
            int r7 = r6.s2()
            goto L51
        L4d:
            int r7 = r6.t2()
        L51:
            if (r3 > r7) goto L56
            r6.C1()
        L56:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.z2(int, int, int):void");
    }

    /* loaded from: classes.dex */
    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public int[] f16021a;

        /* renamed from: b  reason: collision with root package name */
        public List<a> f16022b;

        public void a(a aVar) {
            if (this.f16022b == null) {
                this.f16022b = new ArrayList();
            }
            int size = this.f16022b.size();
            for (int i10 = 0; i10 < size; i10++) {
                a aVar2 = this.f16022b.get(i10);
                if (aVar2.f16023w == aVar.f16023w) {
                    this.f16022b.remove(i10);
                }
                if (aVar2.f16023w >= aVar.f16023w) {
                    this.f16022b.add(i10, aVar);
                    return;
                }
            }
            this.f16022b.add(aVar);
        }

        public void b() {
            int[] iArr = this.f16021a;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f16022b = null;
        }

        public void c(int i10) {
            int[] iArr = this.f16021a;
            if (iArr == null) {
                int[] iArr2 = new int[Math.max(i10, 10) + 1];
                this.f16021a = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i10 >= iArr.length) {
                int[] iArr3 = new int[o(i10)];
                this.f16021a = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                int[] iArr4 = this.f16021a;
                Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
            }
        }

        public int d(int i10) {
            List<a> list = this.f16022b;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    if (this.f16022b.get(size).f16023w >= i10) {
                        this.f16022b.remove(size);
                    }
                }
            }
            return h(i10);
        }

        public a e(int i10, int i11, int i12, boolean z10) {
            List<a> list = this.f16022b;
            if (list == null) {
                return null;
            }
            int size = list.size();
            for (int i13 = 0; i13 < size; i13++) {
                a aVar = this.f16022b.get(i13);
                int i14 = aVar.f16023w;
                if (i14 >= i11) {
                    return null;
                }
                if (i14 >= i10 && (i12 == 0 || aVar.f16024x == i12 || (z10 && aVar.f16026z))) {
                    return aVar;
                }
            }
            return null;
        }

        public a f(int i10) {
            List<a> list = this.f16022b;
            if (list == null) {
                return null;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                a aVar = this.f16022b.get(size);
                if (aVar.f16023w == i10) {
                    return aVar;
                }
            }
            return null;
        }

        public int g(int i10) {
            int[] iArr = this.f16021a;
            if (iArr == null || i10 >= iArr.length) {
                return -1;
            }
            return iArr[i10];
        }

        public int h(int i10) {
            int[] iArr = this.f16021a;
            if (iArr != null && i10 < iArr.length) {
                int i11 = i(i10);
                if (i11 == -1) {
                    int[] iArr2 = this.f16021a;
                    Arrays.fill(iArr2, i10, iArr2.length, -1);
                    return this.f16021a.length;
                }
                int min = Math.min(i11 + 1, this.f16021a.length);
                Arrays.fill(this.f16021a, i10, min, -1);
                return min;
            }
            return -1;
        }

        public final int i(int i10) {
            if (this.f16022b == null) {
                return -1;
            }
            a f10 = f(i10);
            if (f10 != null) {
                this.f16022b.remove(f10);
            }
            int size = this.f16022b.size();
            int i11 = 0;
            while (true) {
                if (i11 >= size) {
                    i11 = -1;
                    break;
                } else if (this.f16022b.get(i11).f16023w >= i10) {
                    break;
                } else {
                    i11++;
                }
            }
            if (i11 != -1) {
                this.f16022b.remove(i11);
                return this.f16022b.get(i11).f16023w;
            }
            return -1;
        }

        public void j(int i10, int i11) {
            int[] iArr = this.f16021a;
            if (iArr == null || i10 >= iArr.length) {
                return;
            }
            int i12 = i10 + i11;
            c(i12);
            int[] iArr2 = this.f16021a;
            System.arraycopy(iArr2, i10, iArr2, i12, (iArr2.length - i10) - i11);
            Arrays.fill(this.f16021a, i10, i12, -1);
            l(i10, i11);
        }

        public void k(int i10, int i11) {
            int[] iArr = this.f16021a;
            if (iArr == null || i10 >= iArr.length) {
                return;
            }
            int i12 = i10 + i11;
            c(i12);
            int[] iArr2 = this.f16021a;
            System.arraycopy(iArr2, i12, iArr2, i10, (iArr2.length - i10) - i11);
            int[] iArr3 = this.f16021a;
            Arrays.fill(iArr3, iArr3.length - i11, iArr3.length, -1);
            m(i10, i11);
        }

        public final void l(int i10, int i11) {
            List<a> list = this.f16022b;
            if (list == null) {
                return;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                a aVar = this.f16022b.get(size);
                int i12 = aVar.f16023w;
                if (i12 >= i10) {
                    aVar.f16023w = i12 + i11;
                }
            }
        }

        public final void m(int i10, int i11) {
            List<a> list = this.f16022b;
            if (list == null) {
                return;
            }
            int i12 = i10 + i11;
            for (int size = list.size() - 1; size >= 0; size--) {
                a aVar = this.f16022b.get(size);
                int i13 = aVar.f16023w;
                if (i13 >= i10) {
                    if (i13 < i12) {
                        this.f16022b.remove(size);
                    } else {
                        aVar.f16023w = i13 - i11;
                    }
                }
            }
        }

        public void n(int i10, f fVar) {
            c(i10);
            this.f16021a[i10] = fVar.f16035e;
        }

        public int o(int i10) {
            int length = this.f16021a.length;
            while (length <= i10) {
                length *= 2;
            }
            return length;
        }

        @SuppressLint({"BanParcelableUsage"})
        /* loaded from: classes.dex */
        public static class a implements Parcelable {
            public static final Parcelable.Creator<a> CREATOR = new C0070a();

            /* renamed from: w  reason: collision with root package name */
            public int f16023w;

            /* renamed from: x  reason: collision with root package name */
            public int f16024x;

            /* renamed from: y  reason: collision with root package name */
            public int[] f16025y;

            /* renamed from: z  reason: collision with root package name */
            public boolean f16026z;

            /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public class C0070a implements Parcelable.Creator<a> {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a */
                public a createFromParcel(Parcel parcel) {
                    return new a(parcel);
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b */
                public a[] newArray(int i10) {
                    return new a[i10];
                }
            }

            public a(Parcel parcel) {
                this.f16023w = parcel.readInt();
                this.f16024x = parcel.readInt();
                this.f16026z = parcel.readInt() == 1;
                int readInt = parcel.readInt();
                if (readInt > 0) {
                    int[] iArr = new int[readInt];
                    this.f16025y = iArr;
                    parcel.readIntArray(iArr);
                }
            }

            public int a(int i10) {
                int[] iArr = this.f16025y;
                if (iArr == null) {
                    return 0;
                }
                return iArr[i10];
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public String toString() {
                return "FullSpanItem{mPosition=" + this.f16023w + ", mGapDir=" + this.f16024x + ", mHasUnwantedGapAfter=" + this.f16026z + ", mGapPerSpan=" + Arrays.toString(this.f16025y) + '}';
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int i10) {
                parcel.writeInt(this.f16023w);
                parcel.writeInt(this.f16024x);
                parcel.writeInt(this.f16026z ? 1 : 0);
                int[] iArr = this.f16025y;
                if (iArr != null && iArr.length > 0) {
                    parcel.writeInt(iArr.length);
                    parcel.writeIntArray(this.f16025y);
                    return;
                }
                parcel.writeInt(0);
            }

            public a() {
            }
        }
    }
}
