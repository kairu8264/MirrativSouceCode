package com.google.android.flexbox;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.flexbox.a;
import java.util.ArrayList;
import java.util.List;
import o3.c0;
import qg.b;
import qg.c;
import qg.d;

/* loaded from: classes3.dex */
public class FlexboxLayout extends ViewGroup implements qg.a {
    public int A;
    public int B;
    public Drawable C;
    public Drawable D;
    public int E;
    public int F;
    public int G;
    public int H;
    public int[] I;
    public SparseIntArray J;
    public com.google.android.flexbox.a K;
    public List<c> L;
    public a.b M;

    /* renamed from: w  reason: collision with root package name */
    public int f27086w;

    /* renamed from: x  reason: collision with root package name */
    public int f27087x;

    /* renamed from: y  reason: collision with root package name */
    public int f27088y;

    /* renamed from: z  reason: collision with root package name */
    public int f27089z;

    public FlexboxLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final void A() {
        if (this.C == null && this.D == null) {
            setWillNotDraw(true);
        } else {
            setWillNotDraw(false);
        }
    }

    public final boolean a(int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.L.get(i11).c() > 0) {
                return false;
            }
        }
        return true;
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (this.J == null) {
            this.J = new SparseIntArray(getChildCount());
        }
        this.I = this.K.n(view, i10, layoutParams, this.J);
        super.addView(view, i10, layoutParams);
    }

    @Override // qg.a
    public int b(int i10, int i11, int i12) {
        return ViewGroup.getChildMeasureSpec(i10, i11, i12);
    }

    public final boolean c(int i10, int i11) {
        for (int i12 = 1; i12 <= i11; i12++) {
            View r10 = r(i10 - i12);
            if (r10 != null && r10.getVisibility() != 8) {
                return false;
            }
        }
        return true;
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof a;
    }

    @Override // qg.a
    public View d(int i10) {
        return getChildAt(i10);
    }

    @Override // qg.a
    public int e(int i10, int i11, int i12) {
        return ViewGroup.getChildMeasureSpec(i10, i11, i12);
    }

    @Override // qg.a
    public int f(View view) {
        return 0;
    }

    @Override // qg.a
    public void g(c cVar) {
        if (l()) {
            if ((this.F & 4) > 0) {
                int i10 = cVar.f49475e;
                int i11 = this.H;
                cVar.f49475e = i10 + i11;
                cVar.f49476f += i11;
            }
        } else if ((this.E & 4) > 0) {
            int i12 = cVar.f49475e;
            int i13 = this.G;
            cVar.f49475e = i12 + i13;
            cVar.f49476f += i13;
        }
    }

    @Override // qg.a
    public int getAlignContent() {
        return this.A;
    }

    @Override // qg.a
    public int getAlignItems() {
        return this.f27089z;
    }

    public Drawable getDividerDrawableHorizontal() {
        return this.C;
    }

    public Drawable getDividerDrawableVertical() {
        return this.D;
    }

    @Override // qg.a
    public int getFlexDirection() {
        return this.f27086w;
    }

    @Override // qg.a
    public int getFlexItemCount() {
        return getChildCount();
    }

    public List<c> getFlexLines() {
        ArrayList arrayList = new ArrayList(this.L.size());
        for (c cVar : this.L) {
            if (cVar.c() != 0) {
                arrayList.add(cVar);
            }
        }
        return arrayList;
    }

    @Override // qg.a
    public List<c> getFlexLinesInternal() {
        return this.L;
    }

    @Override // qg.a
    public int getFlexWrap() {
        return this.f27087x;
    }

    public int getJustifyContent() {
        return this.f27088y;
    }

    @Override // qg.a
    public int getLargestMainSize() {
        int i10 = Integer.MIN_VALUE;
        for (c cVar : this.L) {
            i10 = Math.max(i10, cVar.f49475e);
        }
        return i10;
    }

    @Override // qg.a
    public int getMaxLine() {
        return this.B;
    }

    public int getShowDividerHorizontal() {
        return this.E;
    }

    public int getShowDividerVertical() {
        return this.F;
    }

    @Override // qg.a
    public int getSumOfCrossSize() {
        int i10;
        int i11;
        int size = this.L.size();
        int i12 = 0;
        for (int i13 = 0; i13 < size; i13++) {
            c cVar = this.L.get(i13);
            if (t(i13)) {
                if (l()) {
                    i11 = this.G;
                } else {
                    i11 = this.H;
                }
                i12 += i11;
            }
            if (u(i13)) {
                if (l()) {
                    i10 = this.G;
                } else {
                    i10 = this.H;
                }
                i12 += i10;
            }
            i12 += cVar.f49477g;
        }
        return i12;
    }

    @Override // qg.a
    public View h(int i10) {
        return r(i10);
    }

    @Override // qg.a
    public void i(int i10, View view) {
    }

    @Override // qg.a
    public int j(View view, int i10, int i11) {
        int i12;
        int i13;
        if (l()) {
            i12 = s(i10, i11) ? 0 + this.H : 0;
            if ((this.F & 4) <= 0) {
                return i12;
            }
            i13 = this.H;
        } else {
            i12 = s(i10, i11) ? 0 + this.G : 0;
            if ((this.E & 4) <= 0) {
                return i12;
            }
            i13 = this.G;
        }
        return i12 + i13;
    }

    @Override // qg.a
    public void k(View view, int i10, int i11, c cVar) {
        if (s(i10, i11)) {
            if (l()) {
                int i12 = cVar.f49475e;
                int i13 = this.H;
                cVar.f49475e = i12 + i13;
                cVar.f49476f += i13;
                return;
            }
            int i14 = cVar.f49475e;
            int i15 = this.G;
            cVar.f49475e = i14 + i15;
            cVar.f49476f += i15;
        }
    }

    @Override // qg.a
    public boolean l() {
        int i10 = this.f27086w;
        return i10 == 0 || i10 == 1;
    }

    public final void m(Canvas canvas, boolean z10, boolean z11) {
        int i10;
        int i11;
        int right;
        int left;
        int paddingLeft = getPaddingLeft();
        int max = Math.max(0, (getWidth() - getPaddingRight()) - paddingLeft);
        int size = this.L.size();
        for (int i12 = 0; i12 < size; i12++) {
            c cVar = this.L.get(i12);
            for (int i13 = 0; i13 < cVar.f49478h; i13++) {
                int i14 = cVar.f49485o + i13;
                View r10 = r(i14);
                if (r10 != null && r10.getVisibility() != 8) {
                    a aVar = (a) r10.getLayoutParams();
                    if (s(i14, i13)) {
                        if (z10) {
                            left = r10.getRight() + ((ViewGroup.MarginLayoutParams) aVar).rightMargin;
                        } else {
                            left = (r10.getLeft() - ((ViewGroup.MarginLayoutParams) aVar).leftMargin) - this.H;
                        }
                        p(canvas, left, cVar.f49472b, cVar.f49477g);
                    }
                    if (i13 == cVar.f49478h - 1 && (this.F & 4) > 0) {
                        if (z10) {
                            right = (r10.getLeft() - ((ViewGroup.MarginLayoutParams) aVar).leftMargin) - this.H;
                        } else {
                            right = r10.getRight() + ((ViewGroup.MarginLayoutParams) aVar).rightMargin;
                        }
                        p(canvas, right, cVar.f49472b, cVar.f49477g);
                    }
                }
            }
            if (t(i12)) {
                if (z11) {
                    i11 = cVar.f49474d;
                } else {
                    i11 = cVar.f49472b - this.G;
                }
                o(canvas, paddingLeft, i11, max);
            }
            if (u(i12) && (this.E & 4) > 0) {
                if (z11) {
                    i10 = cVar.f49472b - this.G;
                } else {
                    i10 = cVar.f49474d;
                }
                o(canvas, paddingLeft, i10, max);
            }
        }
    }

    public final void n(Canvas canvas, boolean z10, boolean z11) {
        int i10;
        int i11;
        int bottom;
        int top;
        int paddingTop = getPaddingTop();
        int max = Math.max(0, (getHeight() - getPaddingBottom()) - paddingTop);
        int size = this.L.size();
        for (int i12 = 0; i12 < size; i12++) {
            c cVar = this.L.get(i12);
            for (int i13 = 0; i13 < cVar.f49478h; i13++) {
                int i14 = cVar.f49485o + i13;
                View r10 = r(i14);
                if (r10 != null && r10.getVisibility() != 8) {
                    a aVar = (a) r10.getLayoutParams();
                    if (s(i14, i13)) {
                        if (z11) {
                            top = r10.getBottom() + ((ViewGroup.MarginLayoutParams) aVar).bottomMargin;
                        } else {
                            top = (r10.getTop() - ((ViewGroup.MarginLayoutParams) aVar).topMargin) - this.G;
                        }
                        o(canvas, cVar.f49471a, top, cVar.f49477g);
                    }
                    if (i13 == cVar.f49478h - 1 && (this.E & 4) > 0) {
                        if (z11) {
                            bottom = (r10.getTop() - ((ViewGroup.MarginLayoutParams) aVar).topMargin) - this.G;
                        } else {
                            bottom = r10.getBottom() + ((ViewGroup.MarginLayoutParams) aVar).bottomMargin;
                        }
                        o(canvas, cVar.f49471a, bottom, cVar.f49477g);
                    }
                }
            }
            if (t(i12)) {
                if (z10) {
                    i11 = cVar.f49473c;
                } else {
                    i11 = cVar.f49471a - this.H;
                }
                p(canvas, i11, paddingTop, max);
            }
            if (u(i12) && (this.F & 4) > 0) {
                if (z10) {
                    i10 = cVar.f49471a - this.H;
                } else {
                    i10 = cVar.f49473c;
                }
                p(canvas, i10, paddingTop, max);
            }
        }
    }

    public final void o(Canvas canvas, int i10, int i11, int i12) {
        Drawable drawable = this.C;
        if (drawable == null) {
            return;
        }
        drawable.setBounds(i10, i11, i12 + i10, this.G + i11);
        this.C.draw(canvas);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (this.D == null && this.C == null) {
            return;
        }
        if (this.E == 0 && this.F == 0) {
            return;
        }
        int E = c0.E(this);
        int i10 = this.f27086w;
        if (i10 == 0) {
            m(canvas, E == 1, this.f27087x == 2);
        } else if (i10 == 1) {
            m(canvas, E != 1, this.f27087x == 2);
        } else if (i10 == 2) {
            boolean z10 = E == 1;
            if (this.f27087x == 2) {
                z10 = !z10;
            }
            n(canvas, z10, false);
        } else if (i10 != 3) {
        } else {
            boolean z11 = E == 1;
            if (this.f27087x == 2) {
                z11 = !z11;
            }
            n(canvas, z11, true);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        boolean z11;
        int E = c0.E(this);
        int i14 = this.f27086w;
        if (i14 == 0) {
            v(E == 1, i10, i11, i12, i13);
        } else if (i14 == 1) {
            v(E != 1, i10, i11, i12, i13);
        } else if (i14 == 2) {
            z11 = E == 1;
            w(this.f27087x == 2 ? !z11 : z11, false, i10, i11, i12, i13);
        } else if (i14 == 3) {
            z11 = E == 1;
            w(this.f27087x == 2 ? !z11 : z11, true, i10, i11, i12, i13);
        } else {
            throw new IllegalStateException("Invalid flex direction is set: " + this.f27086w);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        if (this.J == null) {
            this.J = new SparseIntArray(getChildCount());
        }
        if (this.K.O(this.J)) {
            this.I = this.K.m(this.J);
        }
        int i12 = this.f27086w;
        if (i12 == 0 || i12 == 1) {
            x(i10, i11);
        } else if (i12 != 2 && i12 != 3) {
            throw new IllegalStateException("Invalid value for the flex direction is set: " + this.f27086w);
        } else {
            y(i10, i11);
        }
    }

    public final void p(Canvas canvas, int i10, int i11, int i12) {
        Drawable drawable = this.D;
        if (drawable == null) {
            return;
        }
        drawable.setBounds(i10, i11, this.H + i10, i12 + i11);
        this.D.draw(canvas);
    }

    @Override // android.view.ViewGroup
    /* renamed from: q */
    public a generateLayoutParams(AttributeSet attributeSet) {
        return new a(getContext(), attributeSet);
    }

    public View r(int i10) {
        if (i10 >= 0) {
            int[] iArr = this.I;
            if (i10 >= iArr.length) {
                return null;
            }
            return getChildAt(iArr[i10]);
        }
        return null;
    }

    public final boolean s(int i10, int i11) {
        return c(i10, i11) ? l() ? (this.F & 1) != 0 : (this.E & 1) != 0 : l() ? (this.F & 2) != 0 : (this.E & 2) != 0;
    }

    public void setAlignContent(int i10) {
        if (this.A != i10) {
            this.A = i10;
            requestLayout();
        }
    }

    public void setAlignItems(int i10) {
        if (this.f27089z != i10) {
            this.f27089z = i10;
            requestLayout();
        }
    }

    public void setDividerDrawable(Drawable drawable) {
        setDividerDrawableHorizontal(drawable);
        setDividerDrawableVertical(drawable);
    }

    public void setDividerDrawableHorizontal(Drawable drawable) {
        if (drawable == this.C) {
            return;
        }
        this.C = drawable;
        if (drawable != null) {
            this.G = drawable.getIntrinsicHeight();
        } else {
            this.G = 0;
        }
        A();
        requestLayout();
    }

    public void setDividerDrawableVertical(Drawable drawable) {
        if (drawable == this.D) {
            return;
        }
        this.D = drawable;
        if (drawable != null) {
            this.H = drawable.getIntrinsicWidth();
        } else {
            this.H = 0;
        }
        A();
        requestLayout();
    }

    public void setFlexDirection(int i10) {
        if (this.f27086w != i10) {
            this.f27086w = i10;
            requestLayout();
        }
    }

    @Override // qg.a
    public void setFlexLines(List<c> list) {
        this.L = list;
    }

    public void setFlexWrap(int i10) {
        if (this.f27087x != i10) {
            this.f27087x = i10;
            requestLayout();
        }
    }

    public void setJustifyContent(int i10) {
        if (this.f27088y != i10) {
            this.f27088y = i10;
            requestLayout();
        }
    }

    public void setMaxLine(int i10) {
        if (this.B != i10) {
            this.B = i10;
            requestLayout();
        }
    }

    public void setShowDivider(int i10) {
        setShowDividerVertical(i10);
        setShowDividerHorizontal(i10);
    }

    public void setShowDividerHorizontal(int i10) {
        if (i10 != this.E) {
            this.E = i10;
            requestLayout();
        }
    }

    public void setShowDividerVertical(int i10) {
        if (i10 != this.F) {
            this.F = i10;
            requestLayout();
        }
    }

    public final boolean t(int i10) {
        if (i10 < 0 || i10 >= this.L.size()) {
            return false;
        }
        return a(i10) ? l() ? (this.E & 1) != 0 : (this.F & 1) != 0 : l() ? (this.E & 2) != 0 : (this.F & 2) != 0;
    }

    public final boolean u(int i10) {
        if (i10 < 0 || i10 >= this.L.size()) {
            return false;
        }
        for (int i11 = i10 + 1; i11 < this.L.size(); i11++) {
            if (this.L.get(i11).c() > 0) {
                return false;
            }
        }
        return l() ? (this.E & 4) != 0 : (this.F & 4) != 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01fd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void v(boolean r29, int r30, int r31, int r32, int r33) {
        /*
            Method dump skipped, instructions count: 557
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayout.v(boolean, int, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01f5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void w(boolean r30, boolean r31, int r32, int r33, int r34, int r35) {
        /*
            Method dump skipped, instructions count: 541
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayout.w(boolean, boolean, int, int, int, int):void");
    }

    public final void x(int i10, int i11) {
        this.L.clear();
        this.M.a();
        this.K.c(this.M, i10, i11);
        this.L = this.M.f27134a;
        this.K.p(i10, i11);
        if (this.f27089z == 3) {
            for (c cVar : this.L) {
                int i12 = Integer.MIN_VALUE;
                for (int i13 = 0; i13 < cVar.f49478h; i13++) {
                    View r10 = r(cVar.f49485o + i13);
                    if (r10 != null && r10.getVisibility() != 8) {
                        a aVar = (a) r10.getLayoutParams();
                        if (this.f27087x != 2) {
                            i12 = Math.max(i12, r10.getMeasuredHeight() + Math.max(cVar.f49482l - r10.getBaseline(), ((ViewGroup.MarginLayoutParams) aVar).topMargin) + ((ViewGroup.MarginLayoutParams) aVar).bottomMargin);
                        } else {
                            i12 = Math.max(i12, r10.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) aVar).topMargin + Math.max((cVar.f49482l - r10.getMeasuredHeight()) + r10.getBaseline(), ((ViewGroup.MarginLayoutParams) aVar).bottomMargin));
                        }
                    }
                }
                cVar.f49477g = i12;
            }
        }
        this.K.o(i10, i11, getPaddingTop() + getPaddingBottom());
        this.K.X();
        z(this.f27086w, i10, i11, this.M.f27135b);
    }

    public final void y(int i10, int i11) {
        this.L.clear();
        this.M.a();
        this.K.f(this.M, i10, i11);
        this.L = this.M.f27134a;
        this.K.p(i10, i11);
        this.K.o(i10, i11, getPaddingLeft() + getPaddingRight());
        this.K.X();
        z(this.f27086w, i10, i11, this.M.f27135b);
    }

    public final void z(int i10, int i11, int i12, int i13) {
        int sumOfCrossSize;
        int largestMainSize;
        int resolveSizeAndState;
        int resolveSizeAndState2;
        int mode = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i11);
        int mode2 = View.MeasureSpec.getMode(i12);
        int size2 = View.MeasureSpec.getSize(i12);
        if (i10 == 0 || i10 == 1) {
            sumOfCrossSize = getSumOfCrossSize() + getPaddingTop() + getPaddingBottom();
            largestMainSize = getLargestMainSize();
        } else if (i10 != 2 && i10 != 3) {
            throw new IllegalArgumentException("Invalid flex direction: " + i10);
        } else {
            sumOfCrossSize = getLargestMainSize();
            largestMainSize = getSumOfCrossSize() + getPaddingLeft() + getPaddingRight();
        }
        if (mode == Integer.MIN_VALUE) {
            if (size < largestMainSize) {
                i13 = View.combineMeasuredStates(i13, 16777216);
            } else {
                size = largestMainSize;
            }
            resolveSizeAndState = View.resolveSizeAndState(size, i11, i13);
        } else if (mode == 0) {
            resolveSizeAndState = View.resolveSizeAndState(largestMainSize, i11, i13);
        } else if (mode == 1073741824) {
            if (size < largestMainSize) {
                i13 = View.combineMeasuredStates(i13, 16777216);
            }
            resolveSizeAndState = View.resolveSizeAndState(size, i11, i13);
        } else {
            throw new IllegalStateException("Unknown width mode is set: " + mode);
        }
        if (mode2 == Integer.MIN_VALUE) {
            if (size2 < sumOfCrossSize) {
                i13 = View.combineMeasuredStates(i13, 256);
            } else {
                size2 = sumOfCrossSize;
            }
            resolveSizeAndState2 = View.resolveSizeAndState(size2, i12, i13);
        } else if (mode2 == 0) {
            resolveSizeAndState2 = View.resolveSizeAndState(sumOfCrossSize, i12, i13);
        } else if (mode2 == 1073741824) {
            if (size2 < sumOfCrossSize) {
                i13 = View.combineMeasuredStates(i13, 256);
            }
            resolveSizeAndState2 = View.resolveSizeAndState(size2, i12, i13);
        } else {
            throw new IllegalStateException("Unknown height mode is set: " + mode2);
        }
        setMeasuredDimension(resolveSizeAndState, resolveSizeAndState2);
    }

    public FlexboxLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.B = -1;
        this.K = new com.google.android.flexbox.a(this);
        this.L = new ArrayList();
        this.M = new a.b();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, d.f49490b, i10, 0);
        this.f27086w = obtainStyledAttributes.getInt(d.f49496h, 0);
        this.f27087x = obtainStyledAttributes.getInt(d.f49497i, 0);
        this.f27088y = obtainStyledAttributes.getInt(d.f49498j, 0);
        this.f27089z = obtainStyledAttributes.getInt(d.f49492d, 0);
        this.A = obtainStyledAttributes.getInt(d.f49491c, 0);
        this.B = obtainStyledAttributes.getInt(d.f49499k, -1);
        Drawable drawable = obtainStyledAttributes.getDrawable(d.f49493e);
        if (drawable != null) {
            setDividerDrawableHorizontal(drawable);
            setDividerDrawableVertical(drawable);
        }
        Drawable drawable2 = obtainStyledAttributes.getDrawable(d.f49494f);
        if (drawable2 != null) {
            setDividerDrawableHorizontal(drawable2);
        }
        Drawable drawable3 = obtainStyledAttributes.getDrawable(d.f49495g);
        if (drawable3 != null) {
            setDividerDrawableVertical(drawable3);
        }
        int i11 = obtainStyledAttributes.getInt(d.f49500l, 0);
        if (i11 != 0) {
            this.F = i11;
            this.E = i11;
        }
        int i12 = obtainStyledAttributes.getInt(d.f49502n, 0);
        if (i12 != 0) {
            this.F = i12;
        }
        int i13 = obtainStyledAttributes.getInt(d.f49501m, 0);
        if (i13 != 0) {
            this.E = i13;
        }
        obtainStyledAttributes.recycle();
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof a) {
            return new a((a) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new a((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new a(layoutParams);
    }

    /* loaded from: classes3.dex */
    public static class a extends ViewGroup.MarginLayoutParams implements b {
        public static final Parcelable.Creator<a> CREATOR = new C0234a();
        public float A;
        public int B;
        public int C;
        public int D;
        public int E;
        public boolean F;

        /* renamed from: w  reason: collision with root package name */
        public int f27090w;

        /* renamed from: x  reason: collision with root package name */
        public float f27091x;

        /* renamed from: y  reason: collision with root package name */
        public float f27092y;

        /* renamed from: z  reason: collision with root package name */
        public int f27093z;

        /* renamed from: com.google.android.flexbox.FlexboxLayout$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public class C0234a implements Parcelable.Creator<a> {
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

        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f27090w = 1;
            this.f27091x = 0.0f;
            this.f27092y = 1.0f;
            this.f27093z = -1;
            this.A = -1.0f;
            this.B = -1;
            this.C = -1;
            this.D = 16777215;
            this.E = 16777215;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, d.f49503o);
            this.f27090w = obtainStyledAttributes.getInt(d.f49512x, 1);
            this.f27091x = obtainStyledAttributes.getFloat(d.f49506r, 0.0f);
            this.f27092y = obtainStyledAttributes.getFloat(d.f49507s, 1.0f);
            this.f27093z = obtainStyledAttributes.getInt(d.f49504p, -1);
            this.A = obtainStyledAttributes.getFraction(d.f49505q, 1, 1, -1.0f);
            this.B = obtainStyledAttributes.getDimensionPixelSize(d.f49511w, -1);
            this.C = obtainStyledAttributes.getDimensionPixelSize(d.f49510v, -1);
            this.D = obtainStyledAttributes.getDimensionPixelSize(d.f49509u, 16777215);
            this.E = obtainStyledAttributes.getDimensionPixelSize(d.f49508t, 16777215);
            this.F = obtainStyledAttributes.getBoolean(d.f49513y, false);
            obtainStyledAttributes.recycle();
        }

        @Override // qg.b
        public boolean B0() {
            return this.F;
        }

        @Override // qg.b
        public int G1() {
            return ((ViewGroup.MarginLayoutParams) this).rightMargin;
        }

        @Override // qg.b
        public int I1() {
            return this.C;
        }

        @Override // qg.b
        public int K() {
            return this.f27093z;
        }

        @Override // qg.b
        public int K1() {
            return this.E;
        }

        @Override // qg.b
        public float L() {
            return this.f27092y;
        }

        @Override // qg.b
        public int M0() {
            return this.D;
        }

        @Override // qg.b
        public int N() {
            return this.B;
        }

        @Override // qg.b
        public int d0() {
            return ((ViewGroup.MarginLayoutParams) this).topMargin;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // qg.b
        public int getHeight() {
            return ((ViewGroup.MarginLayoutParams) this).height;
        }

        @Override // qg.b
        public int getOrder() {
            return this.f27090w;
        }

        @Override // qg.b
        public int getWidth() {
            return ((ViewGroup.MarginLayoutParams) this).width;
        }

        @Override // qg.b
        public void h0(int i10) {
            this.C = i10;
        }

        @Override // qg.b
        public float i0() {
            return this.f27091x;
        }

        @Override // qg.b
        public void i1(int i10) {
            this.B = i10;
        }

        @Override // qg.b
        public int j1() {
            return ((ViewGroup.MarginLayoutParams) this).bottomMargin;
        }

        @Override // qg.b
        public int m1() {
            return ((ViewGroup.MarginLayoutParams) this).leftMargin;
        }

        @Override // qg.b
        public float q0() {
            return this.A;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeInt(this.f27090w);
            parcel.writeFloat(this.f27091x);
            parcel.writeFloat(this.f27092y);
            parcel.writeInt(this.f27093z);
            parcel.writeFloat(this.A);
            parcel.writeInt(this.B);
            parcel.writeInt(this.C);
            parcel.writeInt(this.D);
            parcel.writeInt(this.E);
            parcel.writeByte(this.F ? (byte) 1 : (byte) 0);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).bottomMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).leftMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).rightMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).topMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).height);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).width);
        }

        public a(a aVar) {
            super((ViewGroup.MarginLayoutParams) aVar);
            this.f27090w = 1;
            this.f27091x = 0.0f;
            this.f27092y = 1.0f;
            this.f27093z = -1;
            this.A = -1.0f;
            this.B = -1;
            this.C = -1;
            this.D = 16777215;
            this.E = 16777215;
            this.f27090w = aVar.f27090w;
            this.f27091x = aVar.f27091x;
            this.f27092y = aVar.f27092y;
            this.f27093z = aVar.f27093z;
            this.A = aVar.A;
            this.B = aVar.B;
            this.C = aVar.C;
            this.D = aVar.D;
            this.E = aVar.E;
            this.F = aVar.F;
        }

        public a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f27090w = 1;
            this.f27091x = 0.0f;
            this.f27092y = 1.0f;
            this.f27093z = -1;
            this.A = -1.0f;
            this.B = -1;
            this.C = -1;
            this.D = 16777215;
            this.E = 16777215;
        }

        public a(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f27090w = 1;
            this.f27091x = 0.0f;
            this.f27092y = 1.0f;
            this.f27093z = -1;
            this.A = -1.0f;
            this.B = -1;
            this.C = -1;
            this.D = 16777215;
            this.E = 16777215;
        }

        public a(Parcel parcel) {
            super(0, 0);
            this.f27090w = 1;
            this.f27091x = 0.0f;
            this.f27092y = 1.0f;
            this.f27093z = -1;
            this.A = -1.0f;
            this.B = -1;
            this.C = -1;
            this.D = 16777215;
            this.E = 16777215;
            this.f27090w = parcel.readInt();
            this.f27091x = parcel.readFloat();
            this.f27092y = parcel.readFloat();
            this.f27093z = parcel.readInt();
            this.A = parcel.readFloat();
            this.B = parcel.readInt();
            this.C = parcel.readInt();
            this.D = parcel.readInt();
            this.E = parcel.readInt();
            this.F = parcel.readByte() != 0;
            ((ViewGroup.MarginLayoutParams) this).bottomMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).leftMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).rightMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).topMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).height = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).width = parcel.readInt();
        }
    }
}
