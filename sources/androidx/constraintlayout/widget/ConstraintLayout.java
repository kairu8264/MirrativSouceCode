package androidx.constraintlayout.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import java.util.ArrayList;
import java.util.HashMap;
import t2.d;
import t2.e;
import t2.f;
import t2.g;
import t2.j;
import t2.k;
import u2.b;

/* loaded from: classes.dex */
public class ConstraintLayout extends ViewGroup {
    public static x2.e T;
    public int A;
    public int B;
    public int C;
    public boolean D;
    public int E;
    public androidx.constraintlayout.widget.c F;
    public x2.a G;
    public int H;
    public HashMap<String, Integer> I;
    public int J;
    public int K;
    public int L;
    public int M;
    public int N;
    public int O;
    public SparseArray<t2.e> P;
    public c Q;
    public int R;
    public int S;

    /* renamed from: w  reason: collision with root package name */
    public SparseArray<View> f14736w;

    /* renamed from: x  reason: collision with root package name */
    public ArrayList<androidx.constraintlayout.widget.b> f14737x;

    /* renamed from: y  reason: collision with root package name */
    public f f14738y;

    /* renamed from: z  reason: collision with root package name */
    public int f14739z;

    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f14740a;

        static {
            int[] iArr = new int[e.b.values().length];
            f14740a = iArr;
            try {
                iArr[e.b.FIXED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f14740a[e.b.WRAP_CONTENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f14740a[e.b.MATCH_PARENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f14740a[e.b.MATCH_CONSTRAINT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* loaded from: classes.dex */
    public class c implements b.InterfaceC0853b {

        /* renamed from: a  reason: collision with root package name */
        public ConstraintLayout f14790a;

        /* renamed from: b  reason: collision with root package name */
        public int f14791b;

        /* renamed from: c  reason: collision with root package name */
        public int f14792c;

        /* renamed from: d  reason: collision with root package name */
        public int f14793d;

        /* renamed from: e  reason: collision with root package name */
        public int f14794e;

        /* renamed from: f  reason: collision with root package name */
        public int f14795f;

        /* renamed from: g  reason: collision with root package name */
        public int f14796g;

        public c(ConstraintLayout constraintLayout) {
            this.f14790a = constraintLayout;
        }

        @Override // u2.b.InterfaceC0853b
        public final void a() {
            int childCount = this.f14790a.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = this.f14790a.getChildAt(i10);
                if (childAt instanceof e) {
                    ((e) childAt).a(this.f14790a);
                }
            }
            int size = this.f14790a.f14737x.size();
            if (size > 0) {
                for (int i11 = 0; i11 < size; i11++) {
                    ((androidx.constraintlayout.widget.b) this.f14790a.f14737x.get(i11)).p(this.f14790a);
                }
            }
        }

        @Override // u2.b.InterfaceC0853b
        @SuppressLint({"WrongCall"})
        public final void b(t2.e eVar, b.a aVar) {
            int makeMeasureSpec;
            int makeMeasureSpec2;
            int baseline;
            int max;
            int i10;
            int i11;
            int i12;
            if (eVar == null) {
                return;
            }
            if (eVar.Q() == 8 && !eVar.e0()) {
                aVar.f54286e = 0;
                aVar.f54287f = 0;
                aVar.f54288g = 0;
            } else if (eVar.I() == null) {
            } else {
                e.b bVar = aVar.f54282a;
                e.b bVar2 = aVar.f54283b;
                int i13 = aVar.f54284c;
                int i14 = aVar.f54285d;
                int i15 = this.f14791b + this.f14792c;
                int i16 = this.f14793d;
                View view = (View) eVar.q();
                int[] iArr = a.f14740a;
                int i17 = iArr[bVar.ordinal()];
                if (i17 == 1) {
                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i13, 1073741824);
                } else if (i17 == 2) {
                    makeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f14795f, i16, -2);
                } else if (i17 == 3) {
                    makeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f14795f, i16 + eVar.z(), -1);
                } else if (i17 != 4) {
                    makeMeasureSpec = 0;
                } else {
                    makeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f14795f, i16, -2);
                    boolean z10 = eVar.f53095v == 1;
                    int i18 = aVar.f54291j;
                    if (i18 == b.a.f54280l || i18 == b.a.f54281m) {
                        if (aVar.f54291j == b.a.f54281m || !z10 || (z10 && (view.getMeasuredHeight() == eVar.v())) || (view instanceof e) || eVar.i0()) {
                            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(eVar.R(), 1073741824);
                        }
                    }
                }
                int i19 = iArr[bVar2.ordinal()];
                if (i19 == 1) {
                    makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i14, 1073741824);
                } else if (i19 == 2) {
                    makeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f14796g, i15, -2);
                } else if (i19 == 3) {
                    makeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f14796g, i15 + eVar.P(), -1);
                } else if (i19 != 4) {
                    makeMeasureSpec2 = 0;
                } else {
                    makeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f14796g, i15, -2);
                    boolean z11 = eVar.f53097w == 1;
                    int i20 = aVar.f54291j;
                    if (i20 == b.a.f54280l || i20 == b.a.f54281m) {
                        if (aVar.f54291j == b.a.f54281m || !z11 || (z11 && (view.getMeasuredWidth() == eVar.R())) || (view instanceof e) || eVar.j0()) {
                            makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(eVar.v(), 1073741824);
                        }
                    }
                }
                f fVar = (f) eVar.I();
                if (fVar != null && j.b(ConstraintLayout.this.E, 256) && view.getMeasuredWidth() == eVar.R() && view.getMeasuredWidth() < fVar.R() && view.getMeasuredHeight() == eVar.v() && view.getMeasuredHeight() < fVar.v() && view.getBaseline() == eVar.n() && !eVar.h0()) {
                    if (d(eVar.A(), makeMeasureSpec, eVar.R()) && d(eVar.B(), makeMeasureSpec2, eVar.v())) {
                        aVar.f54286e = eVar.R();
                        aVar.f54287f = eVar.v();
                        aVar.f54288g = eVar.n();
                        return;
                    }
                }
                e.b bVar3 = e.b.MATCH_CONSTRAINT;
                boolean z12 = bVar == bVar3;
                boolean z13 = bVar2 == bVar3;
                e.b bVar4 = e.b.MATCH_PARENT;
                boolean z14 = bVar2 == bVar4 || bVar2 == e.b.FIXED;
                boolean z15 = bVar == bVar4 || bVar == e.b.FIXED;
                boolean z16 = z12 && eVar.f53058c0 > 0.0f;
                boolean z17 = z13 && eVar.f53058c0 > 0.0f;
                if (view == null) {
                    return;
                }
                b bVar5 = (b) view.getLayoutParams();
                int i21 = aVar.f54291j;
                if (i21 != b.a.f54280l && i21 != b.a.f54281m && z12 && eVar.f53095v == 0 && z13 && eVar.f53097w == 0) {
                    i12 = -1;
                    i11 = 0;
                    baseline = 0;
                    max = 0;
                } else {
                    if ((view instanceof x2.f) && (eVar instanceof k)) {
                        ((x2.f) view).t((k) eVar, makeMeasureSpec, makeMeasureSpec2);
                    } else {
                        view.measure(makeMeasureSpec, makeMeasureSpec2);
                    }
                    eVar.M0(makeMeasureSpec, makeMeasureSpec2);
                    int measuredWidth = view.getMeasuredWidth();
                    int measuredHeight = view.getMeasuredHeight();
                    baseline = view.getBaseline();
                    int i22 = eVar.f53101y;
                    max = i22 > 0 ? Math.max(i22, measuredWidth) : measuredWidth;
                    int i23 = eVar.f53103z;
                    if (i23 > 0) {
                        max = Math.min(i23, max);
                    }
                    int i24 = eVar.B;
                    if (i24 > 0) {
                        i11 = Math.max(i24, measuredHeight);
                        i10 = makeMeasureSpec;
                    } else {
                        i10 = makeMeasureSpec;
                        i11 = measuredHeight;
                    }
                    int i25 = eVar.C;
                    if (i25 > 0) {
                        i11 = Math.min(i25, i11);
                    }
                    if (!j.b(ConstraintLayout.this.E, 1)) {
                        if (z16 && z14) {
                            max = (int) ((i11 * eVar.f53058c0) + 0.5f);
                        } else if (z17 && z15) {
                            i11 = (int) ((max / eVar.f53058c0) + 0.5f);
                        }
                    }
                    if (measuredWidth != max || measuredHeight != i11) {
                        int makeMeasureSpec3 = measuredWidth != max ? View.MeasureSpec.makeMeasureSpec(max, 1073741824) : i10;
                        if (measuredHeight != i11) {
                            makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i11, 1073741824);
                        }
                        view.measure(makeMeasureSpec3, makeMeasureSpec2);
                        eVar.M0(makeMeasureSpec3, makeMeasureSpec2);
                        max = view.getMeasuredWidth();
                        i11 = view.getMeasuredHeight();
                        baseline = view.getBaseline();
                    }
                    i12 = -1;
                }
                boolean z18 = baseline != i12;
                aVar.f54290i = (max == aVar.f54284c && i11 == aVar.f54285d) ? false : true;
                if (bVar5.f14752f0) {
                    z18 = true;
                }
                if (z18 && baseline != -1 && eVar.n() != baseline) {
                    aVar.f54290i = true;
                }
                aVar.f54286e = max;
                aVar.f54287f = i11;
                aVar.f54289h = z18;
                aVar.f54288g = baseline;
            }
        }

        public void c(int i10, int i11, int i12, int i13, int i14, int i15) {
            this.f14791b = i12;
            this.f14792c = i13;
            this.f14793d = i14;
            this.f14794e = i15;
            this.f14795f = i10;
            this.f14796g = i11;
        }

        public final boolean d(int i10, int i11, int i12) {
            if (i10 == i11) {
                return true;
            }
            int mode = View.MeasureSpec.getMode(i10);
            View.MeasureSpec.getSize(i10);
            int mode2 = View.MeasureSpec.getMode(i11);
            int size = View.MeasureSpec.getSize(i11);
            if (mode2 == 1073741824) {
                return (mode == Integer.MIN_VALUE || mode == 0) && i12 == size;
            }
            return false;
        }
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f14736w = new SparseArray<>();
        this.f14737x = new ArrayList<>(4);
        this.f14738y = new f();
        this.f14739z = 0;
        this.A = 0;
        this.B = Integer.MAX_VALUE;
        this.C = Integer.MAX_VALUE;
        this.D = true;
        this.E = TsExtractor.TS_STREAM_TYPE_AIT;
        this.F = null;
        this.G = null;
        this.H = -1;
        this.I = new HashMap<>();
        this.J = -1;
        this.K = -1;
        this.L = -1;
        this.M = -1;
        this.N = 0;
        this.O = 0;
        this.P = new SparseArray<>();
        this.Q = new c(this);
        this.R = 0;
        this.S = 0;
        l(attributeSet, 0, 0);
    }

    private int getPaddingWidth() {
        int max = Math.max(0, getPaddingLeft()) + Math.max(0, getPaddingRight());
        int max2 = Build.VERSION.SDK_INT >= 17 ? Math.max(0, getPaddingEnd()) + Math.max(0, getPaddingStart()) : 0;
        return max2 > 0 ? max2 : max;
    }

    public static x2.e getSharedValues() {
        if (T == null) {
            T = new x2.e();
        }
        return T;
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof b;
    }

    public void d(boolean z10, View view, t2.e eVar, b bVar, SparseArray<t2.e> sparseArray) {
        int i10;
        float f10;
        int i11;
        int i12;
        t2.e eVar2;
        t2.e eVar3;
        t2.e eVar4;
        t2.e eVar5;
        int i13;
        bVar.a();
        bVar.f14784v0 = false;
        eVar.a1(view.getVisibility());
        if (bVar.f14758i0) {
            eVar.K0(true);
            eVar.a1(8);
        }
        eVar.s0(view);
        if (view instanceof androidx.constraintlayout.widget.b) {
            ((androidx.constraintlayout.widget.b) view).n(eVar, this.f14738y.F1());
        }
        if (bVar.f14754g0) {
            g gVar = (g) eVar;
            int i14 = bVar.f14776r0;
            int i15 = bVar.f14778s0;
            float f11 = bVar.f14780t0;
            if (Build.VERSION.SDK_INT < 17) {
                i14 = bVar.f14741a;
                i15 = bVar.f14743b;
                f11 = bVar.f14745c;
            }
            if (f11 != -1.0f) {
                gVar.q1(f11);
                return;
            } else if (i14 != -1) {
                gVar.o1(i14);
                return;
            } else if (i15 != -1) {
                gVar.p1(i15);
                return;
            } else {
                return;
            }
        }
        int i16 = bVar.f14762k0;
        int i17 = bVar.f14764l0;
        int i18 = bVar.f14766m0;
        int i19 = bVar.f14768n0;
        int i20 = bVar.f14770o0;
        int i21 = bVar.f14772p0;
        float f12 = bVar.f14774q0;
        if (Build.VERSION.SDK_INT < 17) {
            i16 = bVar.f14747d;
            int i22 = bVar.f14749e;
            int i23 = bVar.f14751f;
            int i24 = bVar.f14753g;
            int i25 = bVar.f14783v;
            int i26 = bVar.f14786x;
            float f13 = bVar.F;
            if (i16 == -1 && i22 == -1) {
                int i27 = bVar.f14777s;
                if (i27 != -1) {
                    i16 = i27;
                } else {
                    int i28 = bVar.f14775r;
                    if (i28 != -1) {
                        i22 = i28;
                    }
                }
            }
            if (i23 == -1 && i24 == -1) {
                i11 = bVar.f14779t;
                if (i11 == -1) {
                    int i29 = bVar.f14781u;
                    if (i29 != -1) {
                        i10 = i26;
                        f10 = f13;
                        i20 = i25;
                        i12 = i29;
                        i17 = i22;
                        i11 = i23;
                    }
                }
                i10 = i26;
                f10 = f13;
                i20 = i25;
                i12 = i24;
                i17 = i22;
            }
            i11 = i23;
            i10 = i26;
            f10 = f13;
            i20 = i25;
            i12 = i24;
            i17 = i22;
        } else {
            i10 = i21;
            f10 = f12;
            i11 = i18;
            i12 = i19;
        }
        int i30 = bVar.f14769o;
        if (i30 != -1) {
            t2.e eVar6 = sparseArray.get(i30);
            if (eVar6 != null) {
                eVar.j(eVar6, bVar.f14773q, bVar.f14771p);
            }
        } else {
            if (i16 != -1) {
                t2.e eVar7 = sparseArray.get(i16);
                if (eVar7 != null) {
                    d.b bVar2 = d.b.LEFT;
                    eVar.Z(bVar2, eVar7, bVar2, ((ViewGroup.MarginLayoutParams) bVar).leftMargin, i20);
                }
            } else if (i17 != -1 && (eVar2 = sparseArray.get(i17)) != null) {
                eVar.Z(d.b.LEFT, eVar2, d.b.RIGHT, ((ViewGroup.MarginLayoutParams) bVar).leftMargin, i20);
            }
            if (i11 != -1) {
                t2.e eVar8 = sparseArray.get(i11);
                if (eVar8 != null) {
                    eVar.Z(d.b.RIGHT, eVar8, d.b.LEFT, ((ViewGroup.MarginLayoutParams) bVar).rightMargin, i10);
                }
            } else if (i12 != -1 && (eVar3 = sparseArray.get(i12)) != null) {
                d.b bVar3 = d.b.RIGHT;
                eVar.Z(bVar3, eVar3, bVar3, ((ViewGroup.MarginLayoutParams) bVar).rightMargin, i10);
            }
            int i31 = bVar.f14755h;
            if (i31 != -1) {
                t2.e eVar9 = sparseArray.get(i31);
                if (eVar9 != null) {
                    d.b bVar4 = d.b.TOP;
                    eVar.Z(bVar4, eVar9, bVar4, ((ViewGroup.MarginLayoutParams) bVar).topMargin, bVar.f14785w);
                }
            } else {
                int i32 = bVar.f14757i;
                if (i32 != -1 && (eVar4 = sparseArray.get(i32)) != null) {
                    eVar.Z(d.b.TOP, eVar4, d.b.BOTTOM, ((ViewGroup.MarginLayoutParams) bVar).topMargin, bVar.f14785w);
                }
            }
            int i33 = bVar.f14759j;
            if (i33 != -1) {
                t2.e eVar10 = sparseArray.get(i33);
                if (eVar10 != null) {
                    eVar.Z(d.b.BOTTOM, eVar10, d.b.TOP, ((ViewGroup.MarginLayoutParams) bVar).bottomMargin, bVar.f14787y);
                }
            } else {
                int i34 = bVar.f14761k;
                if (i34 != -1 && (eVar5 = sparseArray.get(i34)) != null) {
                    d.b bVar5 = d.b.BOTTOM;
                    eVar.Z(bVar5, eVar5, bVar5, ((ViewGroup.MarginLayoutParams) bVar).bottomMargin, bVar.f14787y);
                }
            }
            int i35 = bVar.f14763l;
            if (i35 != -1) {
                u(eVar, bVar, sparseArray, i35, d.b.BASELINE);
            } else {
                int i36 = bVar.f14765m;
                if (i36 != -1) {
                    u(eVar, bVar, sparseArray, i36, d.b.TOP);
                } else {
                    int i37 = bVar.f14767n;
                    if (i37 != -1) {
                        u(eVar, bVar, sparseArray, i37, d.b.BOTTOM);
                    }
                }
            }
            if (f10 >= 0.0f) {
                eVar.D0(f10);
            }
            float f14 = bVar.G;
            if (f14 >= 0.0f) {
                eVar.U0(f14);
            }
        }
        if (z10 && ((i13 = bVar.W) != -1 || bVar.X != -1)) {
            eVar.S0(i13, bVar.X);
        }
        if (!bVar.f14748d0) {
            if (((ViewGroup.MarginLayoutParams) bVar).width == -1) {
                if (bVar.Z) {
                    eVar.G0(e.b.MATCH_CONSTRAINT);
                } else {
                    eVar.G0(e.b.MATCH_PARENT);
                }
                eVar.m(d.b.LEFT).f53049g = ((ViewGroup.MarginLayoutParams) bVar).leftMargin;
                eVar.m(d.b.RIGHT).f53049g = ((ViewGroup.MarginLayoutParams) bVar).rightMargin;
            } else {
                eVar.G0(e.b.MATCH_CONSTRAINT);
                eVar.b1(0);
            }
        } else {
            eVar.G0(e.b.FIXED);
            eVar.b1(((ViewGroup.MarginLayoutParams) bVar).width);
            if (((ViewGroup.MarginLayoutParams) bVar).width == -2) {
                eVar.G0(e.b.WRAP_CONTENT);
            }
        }
        if (!bVar.f14750e0) {
            if (((ViewGroup.MarginLayoutParams) bVar).height == -1) {
                if (bVar.f14742a0) {
                    eVar.X0(e.b.MATCH_CONSTRAINT);
                } else {
                    eVar.X0(e.b.MATCH_PARENT);
                }
                eVar.m(d.b.TOP).f53049g = ((ViewGroup.MarginLayoutParams) bVar).topMargin;
                eVar.m(d.b.BOTTOM).f53049g = ((ViewGroup.MarginLayoutParams) bVar).bottomMargin;
            } else {
                eVar.X0(e.b.MATCH_CONSTRAINT);
                eVar.C0(0);
            }
        } else {
            eVar.X0(e.b.FIXED);
            eVar.C0(((ViewGroup.MarginLayoutParams) bVar).height);
            if (((ViewGroup.MarginLayoutParams) bVar).height == -2) {
                eVar.X0(e.b.WRAP_CONTENT);
            }
        }
        eVar.u0(bVar.H);
        eVar.I0(bVar.K);
        eVar.Z0(bVar.L);
        eVar.E0(bVar.M);
        eVar.V0(bVar.N);
        eVar.c1(bVar.f14746c0);
        eVar.H0(bVar.O, bVar.Q, bVar.S, bVar.U);
        eVar.Y0(bVar.P, bVar.R, bVar.T, bVar.V);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList<androidx.constraintlayout.widget.b> arrayList = this.f14737x;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i10 = 0; i10 < size; i10++) {
                this.f14737x.get(i10).q(this);
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            float width = getWidth();
            float height = getHeight();
            int childCount = getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = getChildAt(i11);
                if (childAt.getVisibility() != 8 && (tag = childAt.getTag()) != null && (tag instanceof String)) {
                    String[] split = ((String) tag).split(",");
                    if (split.length == 4) {
                        int parseInt = Integer.parseInt(split[0]);
                        int parseInt2 = Integer.parseInt(split[1]);
                        int parseInt3 = Integer.parseInt(split[2]);
                        int i12 = (int) ((parseInt / 1080.0f) * width);
                        int i13 = (int) ((parseInt2 / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f10 = i12;
                        float f11 = i13;
                        float f12 = i12 + ((int) ((parseInt3 / 1080.0f) * width));
                        canvas.drawLine(f10, f11, f12, f11, paint);
                        float parseInt4 = i13 + ((int) ((Integer.parseInt(split[3]) / 1920.0f) * height));
                        canvas.drawLine(f12, f11, f12, parseInt4, paint);
                        canvas.drawLine(f12, parseInt4, f10, parseInt4, paint);
                        canvas.drawLine(f10, parseInt4, f10, f11, paint);
                        paint.setColor(-16711936);
                        canvas.drawLine(f10, f11, f12, parseInt4, paint);
                        canvas.drawLine(f10, parseInt4, f12, f11, paint);
                    }
                }
            }
        }
    }

    @Override // android.view.ViewGroup
    /* renamed from: f */
    public b generateDefaultLayoutParams() {
        return new b(-2, -2);
    }

    @Override // android.view.View
    public void forceLayout() {
        n();
        super.forceLayout();
    }

    @Override // android.view.ViewGroup
    /* renamed from: g */
    public b generateLayoutParams(AttributeSet attributeSet) {
        return new b(getContext(), attributeSet);
    }

    public int getMaxHeight() {
        return this.C;
    }

    public int getMaxWidth() {
        return this.B;
    }

    public int getMinHeight() {
        return this.A;
    }

    public int getMinWidth() {
        return this.f14739z;
    }

    public int getOptimizationLevel() {
        return this.f14738y.A1();
    }

    public Object h(int i10, Object obj) {
        if (i10 == 0 && (obj instanceof String)) {
            String str = (String) obj;
            HashMap<String, Integer> hashMap = this.I;
            if (hashMap == null || !hashMap.containsKey(str)) {
                return null;
            }
            return this.I.get(str);
        }
        return null;
    }

    public final t2.e i(int i10) {
        if (i10 == 0) {
            return this.f14738y;
        }
        View view = this.f14736w.get(i10);
        if (view == null && (view = findViewById(i10)) != null && view != this && view.getParent() == this) {
            onViewAdded(view);
        }
        if (view == this) {
            return this.f14738y;
        }
        if (view == null) {
            return null;
        }
        return ((b) view.getLayoutParams()).f14782u0;
    }

    public View j(int i10) {
        return this.f14736w.get(i10);
    }

    public final t2.e k(View view) {
        if (view == this) {
            return this.f14738y;
        }
        if (view != null) {
            if (view.getLayoutParams() instanceof b) {
                return ((b) view.getLayoutParams()).f14782u0;
            }
            view.setLayoutParams(generateLayoutParams(view.getLayoutParams()));
            if (view.getLayoutParams() instanceof b) {
                return ((b) view.getLayoutParams()).f14782u0;
            }
            return null;
        }
        return null;
    }

    public final void l(AttributeSet attributeSet, int i10, int i11) {
        this.f14738y.s0(this);
        this.f14738y.L1(this.Q);
        this.f14736w.put(getId(), this);
        this.F = null;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, x2.d.f59531m1, i10, i11);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i12 = 0; i12 < indexCount; i12++) {
                int index = obtainStyledAttributes.getIndex(i12);
                if (index == x2.d.f59576r1) {
                    this.f14739z = obtainStyledAttributes.getDimensionPixelOffset(index, this.f14739z);
                } else if (index == x2.d.f59585s1) {
                    this.A = obtainStyledAttributes.getDimensionPixelOffset(index, this.A);
                } else if (index == x2.d.f59558p1) {
                    this.B = obtainStyledAttributes.getDimensionPixelOffset(index, this.B);
                } else if (index == x2.d.f59567q1) {
                    this.C = obtainStyledAttributes.getDimensionPixelOffset(index, this.C);
                } else if (index == x2.d.F2) {
                    this.E = obtainStyledAttributes.getInt(index, this.E);
                } else if (index == x2.d.A1) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            o(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.G = null;
                        }
                    }
                } else if (index == x2.d.f59630x1) {
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, 0);
                    try {
                        androidx.constraintlayout.widget.c cVar = new androidx.constraintlayout.widget.c();
                        this.F = cVar;
                        cVar.s(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.F = null;
                    }
                    this.H = resourceId2;
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.f14738y.M1(this.E);
    }

    public boolean m() {
        if (Build.VERSION.SDK_INT >= 17) {
            return ((getContext().getApplicationInfo().flags & 4194304) != 0) && 1 == getLayoutDirection();
        }
        return false;
    }

    public final void n() {
        this.D = true;
        this.J = -1;
        this.K = -1;
        this.L = -1;
        this.M = -1;
        this.N = 0;
        this.O = 0;
    }

    public void o(int i10) {
        this.G = new x2.a(getContext(), this, i10);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        View content;
        int childCount = getChildCount();
        boolean isInEditMode = isInEditMode();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            b bVar = (b) childAt.getLayoutParams();
            t2.e eVar = bVar.f14782u0;
            if ((childAt.getVisibility() != 8 || bVar.f14754g0 || bVar.f14756h0 || bVar.f14760j0 || isInEditMode) && !bVar.f14758i0) {
                int S = eVar.S();
                int T2 = eVar.T();
                int R = eVar.R() + S;
                int v10 = eVar.v() + T2;
                childAt.layout(S, T2, R, v10);
                if ((childAt instanceof e) && (content = ((e) childAt).getContent()) != null) {
                    content.setVisibility(0);
                    content.layout(S, T2, R, v10);
                }
            }
        }
        int size = this.f14737x.size();
        if (size > 0) {
            for (int i15 = 0; i15 < size; i15++) {
                this.f14737x.get(i15).o(this);
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        if (this.R == i10) {
            int i12 = this.S;
        }
        if (!this.D) {
            int childCount = getChildCount();
            int i13 = 0;
            while (true) {
                if (i13 >= childCount) {
                    break;
                } else if (getChildAt(i13).isLayoutRequested()) {
                    this.D = true;
                    break;
                } else {
                    i13++;
                }
            }
        }
        boolean z10 = this.D;
        this.R = i10;
        this.S = i11;
        this.f14738y.O1(m());
        if (this.D) {
            this.D = false;
            if (v()) {
                this.f14738y.Q1();
            }
        }
        q(this.f14738y, this.E, i10, i11);
        p(i10, i11, this.f14738y.R(), this.f14738y.v(), this.f14738y.G1(), this.f14738y.E1());
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        super.onViewAdded(view);
        t2.e k10 = k(view);
        if ((view instanceof Guideline) && !(k10 instanceof g)) {
            b bVar = (b) view.getLayoutParams();
            g gVar = new g();
            bVar.f14782u0 = gVar;
            bVar.f14754g0 = true;
            gVar.r1(bVar.Y);
        }
        if (view instanceof androidx.constraintlayout.widget.b) {
            androidx.constraintlayout.widget.b bVar2 = (androidx.constraintlayout.widget.b) view;
            bVar2.s();
            ((b) view.getLayoutParams()).f14756h0 = true;
            if (!this.f14737x.contains(bVar2)) {
                this.f14737x.add(bVar2);
            }
        }
        this.f14736w.put(view.getId(), view);
        this.D = true;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.f14736w.remove(view.getId());
        this.f14738y.k1(k(view));
        this.f14737x.remove(view);
        this.D = true;
    }

    public void p(int i10, int i11, int i12, int i13, boolean z10, boolean z11) {
        c cVar = this.Q;
        int i14 = cVar.f14794e;
        int resolveSizeAndState = ViewGroup.resolveSizeAndState(i12 + cVar.f14793d, i10, 0);
        int min = Math.min(this.B, resolveSizeAndState & 16777215);
        int min2 = Math.min(this.C, ViewGroup.resolveSizeAndState(i13 + i14, i11, 0) & 16777215);
        if (z10) {
            min |= 16777216;
        }
        if (z11) {
            min2 |= 16777216;
        }
        setMeasuredDimension(min, min2);
        this.J = min;
        this.K = min2;
    }

    public void q(f fVar, int i10, int i11, int i12) {
        int max;
        int mode = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i11);
        int mode2 = View.MeasureSpec.getMode(i12);
        int size2 = View.MeasureSpec.getSize(i12);
        int max2 = Math.max(0, getPaddingTop());
        int max3 = Math.max(0, getPaddingBottom());
        int i13 = max2 + max3;
        int paddingWidth = getPaddingWidth();
        this.Q.c(i11, i12, max2, max3, paddingWidth, i13);
        if (Build.VERSION.SDK_INT >= 17) {
            int max4 = Math.max(0, getPaddingStart());
            int max5 = Math.max(0, getPaddingEnd());
            if (max4 <= 0 && max5 <= 0) {
                max4 = Math.max(0, getPaddingLeft());
            } else if (m()) {
                max4 = max5;
            }
            max = max4;
        } else {
            max = Math.max(0, getPaddingLeft());
        }
        int i14 = size - paddingWidth;
        int i15 = size2 - i13;
        t(fVar, mode, i14, mode2, i15);
        fVar.H1(i10, mode, i14, mode2, i15, this.J, this.K, max, max2);
    }

    public final void r() {
        boolean isInEditMode = isInEditMode();
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            t2.e k10 = k(getChildAt(i10));
            if (k10 != null) {
                k10.o0();
            }
        }
        if (isInEditMode) {
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = getChildAt(i11);
                try {
                    String resourceName = getResources().getResourceName(childAt.getId());
                    s(0, resourceName, Integer.valueOf(childAt.getId()));
                    int indexOf = resourceName.indexOf(47);
                    if (indexOf != -1) {
                        resourceName = resourceName.substring(indexOf + 1);
                    }
                    i(childAt.getId()).t0(resourceName);
                } catch (Resources.NotFoundException unused) {
                }
            }
        }
        if (this.H != -1) {
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt2 = getChildAt(i12);
                if (childAt2.getId() == this.H && (childAt2 instanceof d)) {
                    this.F = ((d) childAt2).getConstraintSet();
                }
            }
        }
        androidx.constraintlayout.widget.c cVar = this.F;
        if (cVar != null) {
            cVar.d(this, true);
        }
        this.f14738y.l1();
        int size = this.f14737x.size();
        if (size > 0) {
            for (int i13 = 0; i13 < size; i13++) {
                this.f14737x.get(i13).r(this);
            }
        }
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt3 = getChildAt(i14);
            if (childAt3 instanceof e) {
                ((e) childAt3).b(this);
            }
        }
        this.P.clear();
        this.P.put(0, this.f14738y);
        this.P.put(getId(), this.f14738y);
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt4 = getChildAt(i15);
            this.P.put(childAt4.getId(), k(childAt4));
        }
        for (int i16 = 0; i16 < childCount; i16++) {
            View childAt5 = getChildAt(i16);
            t2.e k11 = k(childAt5);
            if (k11 != null) {
                b bVar = (b) childAt5.getLayoutParams();
                this.f14738y.b(k11);
                d(isInEditMode, childAt5, k11, bVar, this.P);
            }
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        n();
        super.requestLayout();
    }

    public void s(int i10, Object obj, Object obj2) {
        if (i10 == 0 && (obj instanceof String) && (obj2 instanceof Integer)) {
            if (this.I == null) {
                this.I = new HashMap<>();
            }
            String str = (String) obj;
            int indexOf = str.indexOf("/");
            if (indexOf != -1) {
                str = str.substring(indexOf + 1);
            }
            this.I.put(str, Integer.valueOf(((Integer) obj2).intValue()));
        }
    }

    public void setConstraintSet(androidx.constraintlayout.widget.c cVar) {
        this.F = cVar;
    }

    @Override // android.view.View
    public void setId(int i10) {
        this.f14736w.remove(getId());
        super.setId(i10);
        this.f14736w.put(getId(), this);
    }

    public void setMaxHeight(int i10) {
        if (i10 == this.C) {
            return;
        }
        this.C = i10;
        requestLayout();
    }

    public void setMaxWidth(int i10) {
        if (i10 == this.B) {
            return;
        }
        this.B = i10;
        requestLayout();
    }

    public void setMinHeight(int i10) {
        if (i10 == this.A) {
            return;
        }
        this.A = i10;
        requestLayout();
    }

    public void setMinWidth(int i10) {
        if (i10 == this.f14739z) {
            return;
        }
        this.f14739z = i10;
        requestLayout();
    }

    public void setOnConstraintsChanged(x2.b bVar) {
        x2.a aVar = this.G;
        if (aVar != null) {
            aVar.c(bVar);
        }
    }

    public void setOptimizationLevel(int i10) {
        this.E = i10;
        this.f14738y.M1(i10);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public void t(f fVar, int i10, int i11, int i12, int i13) {
        e.b bVar;
        c cVar = this.Q;
        int i14 = cVar.f14794e;
        int i15 = cVar.f14793d;
        e.b bVar2 = e.b.FIXED;
        int childCount = getChildCount();
        if (i10 == Integer.MIN_VALUE) {
            bVar = e.b.WRAP_CONTENT;
            if (childCount == 0) {
                i11 = Math.max(0, this.f14739z);
            }
        } else if (i10 == 0) {
            bVar = e.b.WRAP_CONTENT;
            if (childCount == 0) {
                i11 = Math.max(0, this.f14739z);
            }
            i11 = 0;
        } else if (i10 != 1073741824) {
            bVar = bVar2;
            i11 = 0;
        } else {
            i11 = Math.min(this.B - i15, i11);
            bVar = bVar2;
        }
        if (i12 == Integer.MIN_VALUE) {
            bVar2 = e.b.WRAP_CONTENT;
            if (childCount == 0) {
                i13 = Math.max(0, this.A);
            }
        } else if (i12 != 0) {
            if (i12 == 1073741824) {
                i13 = Math.min(this.C - i14, i13);
            }
            i13 = 0;
        } else {
            bVar2 = e.b.WRAP_CONTENT;
            if (childCount == 0) {
                i13 = Math.max(0, this.A);
            }
            i13 = 0;
        }
        if (i11 != fVar.R() || i13 != fVar.v()) {
            fVar.D1();
        }
        fVar.d1(0);
        fVar.e1(0);
        fVar.O0(this.B - i15);
        fVar.N0(this.C - i14);
        fVar.R0(0);
        fVar.Q0(0);
        fVar.G0(bVar);
        fVar.b1(i11);
        fVar.X0(bVar2);
        fVar.C0(i13);
        fVar.R0(this.f14739z - i15);
        fVar.Q0(this.A - i14);
    }

    public final void u(t2.e eVar, b bVar, SparseArray<t2.e> sparseArray, int i10, d.b bVar2) {
        View view = this.f14736w.get(i10);
        t2.e eVar2 = sparseArray.get(i10);
        if (eVar2 == null || view == null || !(view.getLayoutParams() instanceof b)) {
            return;
        }
        bVar.f14752f0 = true;
        d.b bVar3 = d.b.BASELINE;
        if (bVar2 == bVar3) {
            b bVar4 = (b) view.getLayoutParams();
            bVar4.f14752f0 = true;
            bVar4.f14782u0.B0(true);
        }
        eVar.m(bVar3).a(eVar2.m(bVar2), bVar.C, bVar.B, true);
        eVar.B0(true);
        eVar.m(d.b.TOP).p();
        eVar.m(d.b.BOTTOM).p();
    }

    public final boolean v() {
        int childCount = getChildCount();
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            if (i10 >= childCount) {
                break;
            } else if (getChildAt(i10).isLayoutRequested()) {
                z10 = true;
                break;
            } else {
                i10++;
            }
        }
        if (z10) {
            r();
        }
        return z10;
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new b(layoutParams);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f14736w = new SparseArray<>();
        this.f14737x = new ArrayList<>(4);
        this.f14738y = new f();
        this.f14739z = 0;
        this.A = 0;
        this.B = Integer.MAX_VALUE;
        this.C = Integer.MAX_VALUE;
        this.D = true;
        this.E = TsExtractor.TS_STREAM_TYPE_AIT;
        this.F = null;
        this.G = null;
        this.H = -1;
        this.I = new HashMap<>();
        this.J = -1;
        this.K = -1;
        this.L = -1;
        this.M = -1;
        this.N = 0;
        this.O = 0;
        this.P = new SparseArray<>();
        this.Q = new c(this);
        this.R = 0;
        this.S = 0;
        l(attributeSet, i10, 0);
    }

    /* loaded from: classes.dex */
    public static class b extends ViewGroup.MarginLayoutParams {
        public int A;
        public int B;
        public int C;
        public boolean D;
        public boolean E;
        public float F;
        public float G;
        public String H;
        public float I;
        public int J;
        public float K;
        public float L;
        public int M;
        public int N;
        public int O;
        public int P;
        public int Q;
        public int R;
        public int S;
        public int T;
        public float U;
        public float V;
        public int W;
        public int X;
        public int Y;
        public boolean Z;

        /* renamed from: a  reason: collision with root package name */
        public int f14741a;

        /* renamed from: a0  reason: collision with root package name */
        public boolean f14742a0;

        /* renamed from: b  reason: collision with root package name */
        public int f14743b;

        /* renamed from: b0  reason: collision with root package name */
        public String f14744b0;

        /* renamed from: c  reason: collision with root package name */
        public float f14745c;

        /* renamed from: c0  reason: collision with root package name */
        public int f14746c0;

        /* renamed from: d  reason: collision with root package name */
        public int f14747d;

        /* renamed from: d0  reason: collision with root package name */
        public boolean f14748d0;

        /* renamed from: e  reason: collision with root package name */
        public int f14749e;

        /* renamed from: e0  reason: collision with root package name */
        public boolean f14750e0;

        /* renamed from: f  reason: collision with root package name */
        public int f14751f;

        /* renamed from: f0  reason: collision with root package name */
        public boolean f14752f0;

        /* renamed from: g  reason: collision with root package name */
        public int f14753g;

        /* renamed from: g0  reason: collision with root package name */
        public boolean f14754g0;

        /* renamed from: h  reason: collision with root package name */
        public int f14755h;

        /* renamed from: h0  reason: collision with root package name */
        public boolean f14756h0;

        /* renamed from: i  reason: collision with root package name */
        public int f14757i;

        /* renamed from: i0  reason: collision with root package name */
        public boolean f14758i0;

        /* renamed from: j  reason: collision with root package name */
        public int f14759j;

        /* renamed from: j0  reason: collision with root package name */
        public boolean f14760j0;

        /* renamed from: k  reason: collision with root package name */
        public int f14761k;

        /* renamed from: k0  reason: collision with root package name */
        public int f14762k0;

        /* renamed from: l  reason: collision with root package name */
        public int f14763l;

        /* renamed from: l0  reason: collision with root package name */
        public int f14764l0;

        /* renamed from: m  reason: collision with root package name */
        public int f14765m;

        /* renamed from: m0  reason: collision with root package name */
        public int f14766m0;

        /* renamed from: n  reason: collision with root package name */
        public int f14767n;

        /* renamed from: n0  reason: collision with root package name */
        public int f14768n0;

        /* renamed from: o  reason: collision with root package name */
        public int f14769o;

        /* renamed from: o0  reason: collision with root package name */
        public int f14770o0;

        /* renamed from: p  reason: collision with root package name */
        public int f14771p;

        /* renamed from: p0  reason: collision with root package name */
        public int f14772p0;

        /* renamed from: q  reason: collision with root package name */
        public float f14773q;

        /* renamed from: q0  reason: collision with root package name */
        public float f14774q0;

        /* renamed from: r  reason: collision with root package name */
        public int f14775r;

        /* renamed from: r0  reason: collision with root package name */
        public int f14776r0;

        /* renamed from: s  reason: collision with root package name */
        public int f14777s;

        /* renamed from: s0  reason: collision with root package name */
        public int f14778s0;

        /* renamed from: t  reason: collision with root package name */
        public int f14779t;

        /* renamed from: t0  reason: collision with root package name */
        public float f14780t0;

        /* renamed from: u  reason: collision with root package name */
        public int f14781u;

        /* renamed from: u0  reason: collision with root package name */
        public t2.e f14782u0;

        /* renamed from: v  reason: collision with root package name */
        public int f14783v;

        /* renamed from: v0  reason: collision with root package name */
        public boolean f14784v0;

        /* renamed from: w  reason: collision with root package name */
        public int f14785w;

        /* renamed from: x  reason: collision with root package name */
        public int f14786x;

        /* renamed from: y  reason: collision with root package name */
        public int f14787y;

        /* renamed from: z  reason: collision with root package name */
        public int f14788z;

        /* loaded from: classes.dex */
        public static class a {

            /* renamed from: a  reason: collision with root package name */
            public static final SparseIntArray f14789a;

            static {
                SparseIntArray sparseIntArray = new SparseIntArray();
                f14789a = sparseIntArray;
                sparseIntArray.append(x2.d.f59568q2, 64);
                sparseIntArray.append(x2.d.T1, 65);
                sparseIntArray.append(x2.d.f59442c2, 8);
                sparseIntArray.append(x2.d.f59451d2, 9);
                sparseIntArray.append(x2.d.f59469f2, 10);
                sparseIntArray.append(x2.d.f59478g2, 11);
                sparseIntArray.append(x2.d.f59532m2, 12);
                sparseIntArray.append(x2.d.f59523l2, 13);
                sparseIntArray.append(x2.d.J1, 14);
                sparseIntArray.append(x2.d.I1, 15);
                sparseIntArray.append(x2.d.E1, 16);
                sparseIntArray.append(x2.d.G1, 52);
                sparseIntArray.append(x2.d.F1, 53);
                sparseIntArray.append(x2.d.K1, 2);
                sparseIntArray.append(x2.d.M1, 3);
                sparseIntArray.append(x2.d.L1, 4);
                sparseIntArray.append(x2.d.f59613v2, 49);
                sparseIntArray.append(x2.d.f59622w2, 50);
                sparseIntArray.append(x2.d.Q1, 5);
                sparseIntArray.append(x2.d.R1, 6);
                sparseIntArray.append(x2.d.S1, 7);
                sparseIntArray.append(x2.d.f59540n1, 1);
                sparseIntArray.append(x2.d.f59487h2, 17);
                sparseIntArray.append(x2.d.f59496i2, 18);
                sparseIntArray.append(x2.d.P1, 19);
                sparseIntArray.append(x2.d.O1, 20);
                sparseIntArray.append(x2.d.A2, 21);
                sparseIntArray.append(x2.d.D2, 22);
                sparseIntArray.append(x2.d.B2, 23);
                sparseIntArray.append(x2.d.f59640y2, 24);
                sparseIntArray.append(x2.d.C2, 25);
                sparseIntArray.append(x2.d.f59649z2, 26);
                sparseIntArray.append(x2.d.f59631x2, 55);
                sparseIntArray.append(x2.d.E2, 54);
                sparseIntArray.append(x2.d.Y1, 29);
                sparseIntArray.append(x2.d.f59541n2, 30);
                sparseIntArray.append(x2.d.N1, 44);
                sparseIntArray.append(x2.d.f59424a2, 45);
                sparseIntArray.append(x2.d.f59559p2, 46);
                sparseIntArray.append(x2.d.Z1, 47);
                sparseIntArray.append(x2.d.f59550o2, 48);
                sparseIntArray.append(x2.d.C1, 27);
                sparseIntArray.append(x2.d.B1, 28);
                sparseIntArray.append(x2.d.f59577r2, 31);
                sparseIntArray.append(x2.d.U1, 32);
                sparseIntArray.append(x2.d.f59595t2, 33);
                sparseIntArray.append(x2.d.f59586s2, 34);
                sparseIntArray.append(x2.d.f59604u2, 35);
                sparseIntArray.append(x2.d.W1, 36);
                sparseIntArray.append(x2.d.V1, 37);
                sparseIntArray.append(x2.d.X1, 38);
                sparseIntArray.append(x2.d.f59433b2, 39);
                sparseIntArray.append(x2.d.f59514k2, 40);
                sparseIntArray.append(x2.d.f59460e2, 41);
                sparseIntArray.append(x2.d.H1, 42);
                sparseIntArray.append(x2.d.D1, 43);
                sparseIntArray.append(x2.d.f59505j2, 51);
                sparseIntArray.append(x2.d.G2, 66);
            }
        }

        public b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f14741a = -1;
            this.f14743b = -1;
            this.f14745c = -1.0f;
            this.f14747d = -1;
            this.f14749e = -1;
            this.f14751f = -1;
            this.f14753g = -1;
            this.f14755h = -1;
            this.f14757i = -1;
            this.f14759j = -1;
            this.f14761k = -1;
            this.f14763l = -1;
            this.f14765m = -1;
            this.f14767n = -1;
            this.f14769o = -1;
            this.f14771p = 0;
            this.f14773q = 0.0f;
            this.f14775r = -1;
            this.f14777s = -1;
            this.f14779t = -1;
            this.f14781u = -1;
            this.f14783v = Integer.MIN_VALUE;
            this.f14785w = Integer.MIN_VALUE;
            this.f14786x = Integer.MIN_VALUE;
            this.f14787y = Integer.MIN_VALUE;
            this.f14788z = Integer.MIN_VALUE;
            this.A = Integer.MIN_VALUE;
            this.B = Integer.MIN_VALUE;
            this.C = 0;
            this.D = true;
            this.E = true;
            this.F = 0.5f;
            this.G = 0.5f;
            this.H = null;
            this.I = 0.0f;
            this.J = 1;
            this.K = -1.0f;
            this.L = -1.0f;
            this.M = 0;
            this.N = 0;
            this.O = 0;
            this.P = 0;
            this.Q = 0;
            this.R = 0;
            this.S = 0;
            this.T = 0;
            this.U = 1.0f;
            this.V = 1.0f;
            this.W = -1;
            this.X = -1;
            this.Y = -1;
            this.Z = false;
            this.f14742a0 = false;
            this.f14744b0 = null;
            this.f14746c0 = 0;
            this.f14748d0 = true;
            this.f14750e0 = true;
            this.f14752f0 = false;
            this.f14754g0 = false;
            this.f14756h0 = false;
            this.f14758i0 = false;
            this.f14760j0 = false;
            this.f14762k0 = -1;
            this.f14764l0 = -1;
            this.f14766m0 = -1;
            this.f14768n0 = -1;
            this.f14770o0 = Integer.MIN_VALUE;
            this.f14772p0 = Integer.MIN_VALUE;
            this.f14774q0 = 0.5f;
            this.f14782u0 = new t2.e();
            this.f14784v0 = false;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, x2.d.f59531m1);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                int i11 = a.f14789a.get(index);
                switch (i11) {
                    case 1:
                        this.Y = obtainStyledAttributes.getInt(index, this.Y);
                        break;
                    case 2:
                        int resourceId = obtainStyledAttributes.getResourceId(index, this.f14769o);
                        this.f14769o = resourceId;
                        if (resourceId == -1) {
                            this.f14769o = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 3:
                        this.f14771p = obtainStyledAttributes.getDimensionPixelSize(index, this.f14771p);
                        break;
                    case 4:
                        float f10 = obtainStyledAttributes.getFloat(index, this.f14773q) % 360.0f;
                        this.f14773q = f10;
                        if (f10 < 0.0f) {
                            this.f14773q = (360.0f - f10) % 360.0f;
                            break;
                        } else {
                            break;
                        }
                    case 5:
                        this.f14741a = obtainStyledAttributes.getDimensionPixelOffset(index, this.f14741a);
                        break;
                    case 6:
                        this.f14743b = obtainStyledAttributes.getDimensionPixelOffset(index, this.f14743b);
                        break;
                    case 7:
                        this.f14745c = obtainStyledAttributes.getFloat(index, this.f14745c);
                        break;
                    case 8:
                        int resourceId2 = obtainStyledAttributes.getResourceId(index, this.f14747d);
                        this.f14747d = resourceId2;
                        if (resourceId2 == -1) {
                            this.f14747d = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 9:
                        int resourceId3 = obtainStyledAttributes.getResourceId(index, this.f14749e);
                        this.f14749e = resourceId3;
                        if (resourceId3 == -1) {
                            this.f14749e = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 10:
                        int resourceId4 = obtainStyledAttributes.getResourceId(index, this.f14751f);
                        this.f14751f = resourceId4;
                        if (resourceId4 == -1) {
                            this.f14751f = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 11:
                        int resourceId5 = obtainStyledAttributes.getResourceId(index, this.f14753g);
                        this.f14753g = resourceId5;
                        if (resourceId5 == -1) {
                            this.f14753g = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 12:
                        int resourceId6 = obtainStyledAttributes.getResourceId(index, this.f14755h);
                        this.f14755h = resourceId6;
                        if (resourceId6 == -1) {
                            this.f14755h = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 13:
                        int resourceId7 = obtainStyledAttributes.getResourceId(index, this.f14757i);
                        this.f14757i = resourceId7;
                        if (resourceId7 == -1) {
                            this.f14757i = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 14:
                        int resourceId8 = obtainStyledAttributes.getResourceId(index, this.f14759j);
                        this.f14759j = resourceId8;
                        if (resourceId8 == -1) {
                            this.f14759j = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 15:
                        int resourceId9 = obtainStyledAttributes.getResourceId(index, this.f14761k);
                        this.f14761k = resourceId9;
                        if (resourceId9 == -1) {
                            this.f14761k = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 16:
                        int resourceId10 = obtainStyledAttributes.getResourceId(index, this.f14763l);
                        this.f14763l = resourceId10;
                        if (resourceId10 == -1) {
                            this.f14763l = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 17:
                        int resourceId11 = obtainStyledAttributes.getResourceId(index, this.f14775r);
                        this.f14775r = resourceId11;
                        if (resourceId11 == -1) {
                            this.f14775r = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 18:
                        int resourceId12 = obtainStyledAttributes.getResourceId(index, this.f14777s);
                        this.f14777s = resourceId12;
                        if (resourceId12 == -1) {
                            this.f14777s = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 19:
                        int resourceId13 = obtainStyledAttributes.getResourceId(index, this.f14779t);
                        this.f14779t = resourceId13;
                        if (resourceId13 == -1) {
                            this.f14779t = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 20:
                        int resourceId14 = obtainStyledAttributes.getResourceId(index, this.f14781u);
                        this.f14781u = resourceId14;
                        if (resourceId14 == -1) {
                            this.f14781u = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 21:
                        this.f14783v = obtainStyledAttributes.getDimensionPixelSize(index, this.f14783v);
                        break;
                    case 22:
                        this.f14785w = obtainStyledAttributes.getDimensionPixelSize(index, this.f14785w);
                        break;
                    case 23:
                        this.f14786x = obtainStyledAttributes.getDimensionPixelSize(index, this.f14786x);
                        break;
                    case 24:
                        this.f14787y = obtainStyledAttributes.getDimensionPixelSize(index, this.f14787y);
                        break;
                    case 25:
                        this.f14788z = obtainStyledAttributes.getDimensionPixelSize(index, this.f14788z);
                        break;
                    case 26:
                        this.A = obtainStyledAttributes.getDimensionPixelSize(index, this.A);
                        break;
                    case 27:
                        this.Z = obtainStyledAttributes.getBoolean(index, this.Z);
                        break;
                    case 28:
                        this.f14742a0 = obtainStyledAttributes.getBoolean(index, this.f14742a0);
                        break;
                    case 29:
                        this.F = obtainStyledAttributes.getFloat(index, this.F);
                        break;
                    case 30:
                        this.G = obtainStyledAttributes.getFloat(index, this.G);
                        break;
                    case 31:
                        int i12 = obtainStyledAttributes.getInt(index, 0);
                        this.O = i12;
                        if (i12 == 1) {
                            Log.e("ConstraintLayout", "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.");
                            break;
                        } else {
                            break;
                        }
                    case 32:
                        int i13 = obtainStyledAttributes.getInt(index, 0);
                        this.P = i13;
                        if (i13 == 1) {
                            Log.e("ConstraintLayout", "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.");
                            break;
                        } else {
                            break;
                        }
                    case 33:
                        try {
                            this.Q = obtainStyledAttributes.getDimensionPixelSize(index, this.Q);
                            break;
                        } catch (Exception unused) {
                            if (obtainStyledAttributes.getInt(index, this.Q) == -2) {
                                this.Q = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 34:
                        try {
                            this.S = obtainStyledAttributes.getDimensionPixelSize(index, this.S);
                            break;
                        } catch (Exception unused2) {
                            if (obtainStyledAttributes.getInt(index, this.S) == -2) {
                                this.S = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 35:
                        this.U = Math.max(0.0f, obtainStyledAttributes.getFloat(index, this.U));
                        this.O = 2;
                        break;
                    case 36:
                        try {
                            this.R = obtainStyledAttributes.getDimensionPixelSize(index, this.R);
                            break;
                        } catch (Exception unused3) {
                            if (obtainStyledAttributes.getInt(index, this.R) == -2) {
                                this.R = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 37:
                        try {
                            this.T = obtainStyledAttributes.getDimensionPixelSize(index, this.T);
                            break;
                        } catch (Exception unused4) {
                            if (obtainStyledAttributes.getInt(index, this.T) == -2) {
                                this.T = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 38:
                        this.V = Math.max(0.0f, obtainStyledAttributes.getFloat(index, this.V));
                        this.P = 2;
                        break;
                    default:
                        switch (i11) {
                            case 44:
                                androidx.constraintlayout.widget.c.x(this, obtainStyledAttributes.getString(index));
                                continue;
                            case 45:
                                this.K = obtainStyledAttributes.getFloat(index, this.K);
                                continue;
                            case 46:
                                this.L = obtainStyledAttributes.getFloat(index, this.L);
                                continue;
                            case 47:
                                this.M = obtainStyledAttributes.getInt(index, 0);
                                continue;
                            case 48:
                                this.N = obtainStyledAttributes.getInt(index, 0);
                                continue;
                            case 49:
                                this.W = obtainStyledAttributes.getDimensionPixelOffset(index, this.W);
                                continue;
                            case 50:
                                this.X = obtainStyledAttributes.getDimensionPixelOffset(index, this.X);
                                continue;
                            case 51:
                                this.f14744b0 = obtainStyledAttributes.getString(index);
                                continue;
                            case 52:
                                int resourceId15 = obtainStyledAttributes.getResourceId(index, this.f14765m);
                                this.f14765m = resourceId15;
                                if (resourceId15 == -1) {
                                    this.f14765m = obtainStyledAttributes.getInt(index, -1);
                                    break;
                                } else {
                                    continue;
                                }
                            case 53:
                                int resourceId16 = obtainStyledAttributes.getResourceId(index, this.f14767n);
                                this.f14767n = resourceId16;
                                if (resourceId16 == -1) {
                                    this.f14767n = obtainStyledAttributes.getInt(index, -1);
                                    break;
                                } else {
                                    continue;
                                }
                            case 54:
                                this.C = obtainStyledAttributes.getDimensionPixelSize(index, this.C);
                                continue;
                            case 55:
                                this.B = obtainStyledAttributes.getDimensionPixelSize(index, this.B);
                                continue;
                            default:
                                switch (i11) {
                                    case 64:
                                        androidx.constraintlayout.widget.c.v(this, obtainStyledAttributes, index, 0);
                                        this.D = true;
                                        continue;
                                    case 65:
                                        androidx.constraintlayout.widget.c.v(this, obtainStyledAttributes, index, 1);
                                        this.E = true;
                                        continue;
                                    case 66:
                                        this.f14746c0 = obtainStyledAttributes.getInt(index, this.f14746c0);
                                        continue;
                                        continue;
                                }
                        }
                }
            }
            obtainStyledAttributes.recycle();
            a();
        }

        public void a() {
            this.f14754g0 = false;
            this.f14748d0 = true;
            this.f14750e0 = true;
            int i10 = ((ViewGroup.MarginLayoutParams) this).width;
            if (i10 == -2 && this.Z) {
                this.f14748d0 = false;
                if (this.O == 0) {
                    this.O = 1;
                }
            }
            int i11 = ((ViewGroup.MarginLayoutParams) this).height;
            if (i11 == -2 && this.f14742a0) {
                this.f14750e0 = false;
                if (this.P == 0) {
                    this.P = 1;
                }
            }
            if (i10 == 0 || i10 == -1) {
                this.f14748d0 = false;
                if (i10 == 0 && this.O == 1) {
                    ((ViewGroup.MarginLayoutParams) this).width = -2;
                    this.Z = true;
                }
            }
            if (i11 == 0 || i11 == -1) {
                this.f14750e0 = false;
                if (i11 == 0 && this.P == 1) {
                    ((ViewGroup.MarginLayoutParams) this).height = -2;
                    this.f14742a0 = true;
                }
            }
            if (this.f14745c == -1.0f && this.f14741a == -1 && this.f14743b == -1) {
                return;
            }
            this.f14754g0 = true;
            this.f14748d0 = true;
            this.f14750e0 = true;
            if (!(this.f14782u0 instanceof g)) {
                this.f14782u0 = new g();
            }
            ((g) this.f14782u0).r1(this.Y);
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0041  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0054  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x005b  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0062  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0068  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x006e  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x0080  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x0088  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x009a  */
        @Override // android.view.ViewGroup.MarginLayoutParams, android.view.ViewGroup.LayoutParams
        @android.annotation.TargetApi(17)
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void resolveLayoutDirection(int r11) {
            /*
                Method dump skipped, instructions count: 265
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.b.resolveLayoutDirection(int):void");
        }

        public b(int i10, int i11) {
            super(i10, i11);
            this.f14741a = -1;
            this.f14743b = -1;
            this.f14745c = -1.0f;
            this.f14747d = -1;
            this.f14749e = -1;
            this.f14751f = -1;
            this.f14753g = -1;
            this.f14755h = -1;
            this.f14757i = -1;
            this.f14759j = -1;
            this.f14761k = -1;
            this.f14763l = -1;
            this.f14765m = -1;
            this.f14767n = -1;
            this.f14769o = -1;
            this.f14771p = 0;
            this.f14773q = 0.0f;
            this.f14775r = -1;
            this.f14777s = -1;
            this.f14779t = -1;
            this.f14781u = -1;
            this.f14783v = Integer.MIN_VALUE;
            this.f14785w = Integer.MIN_VALUE;
            this.f14786x = Integer.MIN_VALUE;
            this.f14787y = Integer.MIN_VALUE;
            this.f14788z = Integer.MIN_VALUE;
            this.A = Integer.MIN_VALUE;
            this.B = Integer.MIN_VALUE;
            this.C = 0;
            this.D = true;
            this.E = true;
            this.F = 0.5f;
            this.G = 0.5f;
            this.H = null;
            this.I = 0.0f;
            this.J = 1;
            this.K = -1.0f;
            this.L = -1.0f;
            this.M = 0;
            this.N = 0;
            this.O = 0;
            this.P = 0;
            this.Q = 0;
            this.R = 0;
            this.S = 0;
            this.T = 0;
            this.U = 1.0f;
            this.V = 1.0f;
            this.W = -1;
            this.X = -1;
            this.Y = -1;
            this.Z = false;
            this.f14742a0 = false;
            this.f14744b0 = null;
            this.f14746c0 = 0;
            this.f14748d0 = true;
            this.f14750e0 = true;
            this.f14752f0 = false;
            this.f14754g0 = false;
            this.f14756h0 = false;
            this.f14758i0 = false;
            this.f14760j0 = false;
            this.f14762k0 = -1;
            this.f14764l0 = -1;
            this.f14766m0 = -1;
            this.f14768n0 = -1;
            this.f14770o0 = Integer.MIN_VALUE;
            this.f14772p0 = Integer.MIN_VALUE;
            this.f14774q0 = 0.5f;
            this.f14782u0 = new t2.e();
            this.f14784v0 = false;
        }

        public b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f14741a = -1;
            this.f14743b = -1;
            this.f14745c = -1.0f;
            this.f14747d = -1;
            this.f14749e = -1;
            this.f14751f = -1;
            this.f14753g = -1;
            this.f14755h = -1;
            this.f14757i = -1;
            this.f14759j = -1;
            this.f14761k = -1;
            this.f14763l = -1;
            this.f14765m = -1;
            this.f14767n = -1;
            this.f14769o = -1;
            this.f14771p = 0;
            this.f14773q = 0.0f;
            this.f14775r = -1;
            this.f14777s = -1;
            this.f14779t = -1;
            this.f14781u = -1;
            this.f14783v = Integer.MIN_VALUE;
            this.f14785w = Integer.MIN_VALUE;
            this.f14786x = Integer.MIN_VALUE;
            this.f14787y = Integer.MIN_VALUE;
            this.f14788z = Integer.MIN_VALUE;
            this.A = Integer.MIN_VALUE;
            this.B = Integer.MIN_VALUE;
            this.C = 0;
            this.D = true;
            this.E = true;
            this.F = 0.5f;
            this.G = 0.5f;
            this.H = null;
            this.I = 0.0f;
            this.J = 1;
            this.K = -1.0f;
            this.L = -1.0f;
            this.M = 0;
            this.N = 0;
            this.O = 0;
            this.P = 0;
            this.Q = 0;
            this.R = 0;
            this.S = 0;
            this.T = 0;
            this.U = 1.0f;
            this.V = 1.0f;
            this.W = -1;
            this.X = -1;
            this.Y = -1;
            this.Z = false;
            this.f14742a0 = false;
            this.f14744b0 = null;
            this.f14746c0 = 0;
            this.f14748d0 = true;
            this.f14750e0 = true;
            this.f14752f0 = false;
            this.f14754g0 = false;
            this.f14756h0 = false;
            this.f14758i0 = false;
            this.f14760j0 = false;
            this.f14762k0 = -1;
            this.f14764l0 = -1;
            this.f14766m0 = -1;
            this.f14768n0 = -1;
            this.f14770o0 = Integer.MIN_VALUE;
            this.f14772p0 = Integer.MIN_VALUE;
            this.f14774q0 = 0.5f;
            this.f14782u0 = new t2.e();
            this.f14784v0 = false;
        }
    }
}
