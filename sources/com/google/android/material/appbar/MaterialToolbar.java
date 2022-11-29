package com.google.android.material.appbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import g3.a;
import o3.c0;
import tj.g;
import tj.h;
import wi.b;
import wi.k;

/* loaded from: classes3.dex */
public class MaterialToolbar extends Toolbar {

    /* renamed from: z  reason: collision with root package name */
    public static final int f27340z = k.A;

    /* renamed from: w  reason: collision with root package name */
    public Integer f27341w;

    /* renamed from: x  reason: collision with root package name */
    public boolean f27342x;

    /* renamed from: y  reason: collision with root package name */
    public boolean f27343y;

    public MaterialToolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, b.M);
    }

    public final Pair<Integer, Integer> a(TextView textView, TextView textView2) {
        int measuredWidth = getMeasuredWidth();
        int i10 = measuredWidth / 2;
        int paddingLeft = getPaddingLeft();
        int paddingRight = measuredWidth - getPaddingRight();
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() != 8 && childAt != textView && childAt != textView2) {
                if (childAt.getRight() < i10 && childAt.getRight() > paddingLeft) {
                    paddingLeft = childAt.getRight();
                }
                if (childAt.getLeft() > i10 && childAt.getLeft() < paddingRight) {
                    paddingRight = childAt.getLeft();
                }
            }
        }
        return new Pair<>(Integer.valueOf(paddingLeft), Integer.valueOf(paddingRight));
    }

    public final void b(Context context) {
        Drawable background = getBackground();
        if (background == null || (background instanceof ColorDrawable)) {
            g gVar = new g();
            gVar.Y(ColorStateList.valueOf(background != null ? ((ColorDrawable) background).getColor() : 0));
            gVar.N(context);
            gVar.X(c0.y(this));
            c0.v0(this, gVar);
        }
    }

    public final void c(View view, Pair<Integer, Integer> pair) {
        int measuredWidth = getMeasuredWidth();
        int measuredWidth2 = view.getMeasuredWidth();
        int i10 = (measuredWidth / 2) - (measuredWidth2 / 2);
        int i11 = measuredWidth2 + i10;
        int max = Math.max(Math.max(((Integer) pair.first).intValue() - i10, 0), Math.max(i11 - ((Integer) pair.second).intValue(), 0));
        if (max > 0) {
            i10 += max;
            i11 -= max;
            view.measure(View.MeasureSpec.makeMeasureSpec(i11 - i10, 1073741824), view.getMeasuredHeightAndState());
        }
        view.layout(i10, view.getTop(), i11, view.getBottom());
    }

    public final void d() {
        if (this.f27342x || this.f27343y) {
            TextView c10 = nj.k.c(this);
            TextView a10 = nj.k.a(this);
            if (c10 == null && a10 == null) {
                return;
            }
            Pair<Integer, Integer> a11 = a(c10, a10);
            if (this.f27342x && c10 != null) {
                c(c10, a11);
            }
            if (!this.f27343y || a10 == null) {
                return;
            }
            c(a10, a11);
        }
    }

    public final Drawable e(Drawable drawable) {
        if (drawable == null || this.f27341w == null) {
            return drawable;
        }
        Drawable r10 = a.r(drawable);
        a.n(r10, this.f27341w.intValue());
        return r10;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        h.e(this);
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        d();
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        h.d(this, f10);
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(Drawable drawable) {
        super.setNavigationIcon(e(drawable));
    }

    public void setNavigationIconTint(int i10) {
        this.f27341w = Integer.valueOf(i10);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    public void setSubtitleCentered(boolean z10) {
        if (this.f27343y != z10) {
            this.f27343y = z10;
            requestLayout();
        }
    }

    public void setTitleCentered(boolean z10) {
        if (this.f27342x != z10) {
            this.f27342x = z10;
            requestLayout();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public MaterialToolbar(android.content.Context r8, android.util.AttributeSet r9, int r10) {
        /*
            r7 = this;
            int r4 = com.google.android.material.appbar.MaterialToolbar.f27340z
            android.content.Context r8 = yj.a.c(r8, r9, r10, r4)
            r7.<init>(r8, r9, r10)
            android.content.Context r8 = r7.getContext()
            int[] r2 = wi.l.f59052n4
            r6 = 0
            int[] r5 = new int[r6]
            r0 = r8
            r1 = r9
            r3 = r10
            android.content.res.TypedArray r9 = nj.j.h(r0, r1, r2, r3, r4, r5)
            int r10 = wi.l.f59061o4
            boolean r0 = r9.hasValue(r10)
            if (r0 == 0) goto L29
            r0 = -1
            int r10 = r9.getColor(r10, r0)
            r7.setNavigationIconTint(r10)
        L29:
            int r10 = wi.l.f59079q4
            boolean r10 = r9.getBoolean(r10, r6)
            r7.f27342x = r10
            int r10 = wi.l.f59070p4
            boolean r10 = r9.getBoolean(r10, r6)
            r7.f27343y = r10
            r9.recycle()
            r7.b(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.MaterialToolbar.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
