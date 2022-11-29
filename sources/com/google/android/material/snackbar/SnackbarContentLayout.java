package com.google.android.material.snackbar;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import o3.c0;
import wi.f;
import wi.l;

/* loaded from: classes3.dex */
public class SnackbarContentLayout extends LinearLayout {

    /* renamed from: w  reason: collision with root package name */
    public TextView f27683w;

    /* renamed from: x  reason: collision with root package name */
    public Button f27684x;

    /* renamed from: y  reason: collision with root package name */
    public int f27685y;

    /* renamed from: z  reason: collision with root package name */
    public int f27686z;

    public SnackbarContentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, l.f58981f5);
        this.f27685y = obtainStyledAttributes.getDimensionPixelSize(l.f58990g5, -1);
        this.f27686z = obtainStyledAttributes.getDimensionPixelSize(l.f59053n5, -1);
        obtainStyledAttributes.recycle();
    }

    public static void a(View view, int i10, int i11) {
        if (c0.X(view)) {
            c0.G0(view, c0.J(view), i10, c0.I(view), i11);
        } else {
            view.setPadding(view.getPaddingLeft(), i10, view.getPaddingRight(), i11);
        }
    }

    public final boolean b(int i10, int i11, int i12) {
        boolean z10;
        if (i10 != getOrientation()) {
            setOrientation(i10);
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f27683w.getPaddingTop() == i11 && this.f27683w.getPaddingBottom() == i12) {
            return z10;
        }
        a(this.f27683w, i11, i12);
        return true;
    }

    public Button getActionView() {
        return this.f27684x;
    }

    public TextView getMessageView() {
        return this.f27683w;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f27683w = (TextView) findViewById(f.L);
        this.f27684x = (Button) findViewById(f.K);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0053, code lost:
        if (b(1, r0, r0 - r1) != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005e, code lost:
        if (b(0, r0, r0) != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0060, code lost:
        r3 = true;
     */
    @Override // android.widget.LinearLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onMeasure(int r8, int r9) {
        /*
            r7 = this;
            super.onMeasure(r8, r9)
            int r0 = r7.f27685y
            if (r0 <= 0) goto L18
            int r0 = r7.getMeasuredWidth()
            int r1 = r7.f27685y
            if (r0 <= r1) goto L18
            r8 = 1073741824(0x40000000, float:2.0)
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r8)
            super.onMeasure(r8, r9)
        L18:
            android.content.res.Resources r0 = r7.getResources()
            int r1 = wi.d.f58808g
            int r0 = r0.getDimensionPixelSize(r1)
            android.content.res.Resources r1 = r7.getResources()
            int r2 = wi.d.f58807f
            int r1 = r1.getDimensionPixelSize(r2)
            android.widget.TextView r2 = r7.f27683w
            android.text.Layout r2 = r2.getLayout()
            int r2 = r2.getLineCount()
            r3 = 0
            r4 = 1
            if (r2 <= r4) goto L3c
            r2 = r4
            goto L3d
        L3c:
            r2 = r3
        L3d:
            if (r2 == 0) goto L56
            int r5 = r7.f27686z
            if (r5 <= 0) goto L56
            android.widget.Button r5 = r7.f27684x
            int r5 = r5.getMeasuredWidth()
            int r6 = r7.f27686z
            if (r5 <= r6) goto L56
            int r1 = r0 - r1
            boolean r0 = r7.b(r4, r0, r1)
            if (r0 == 0) goto L61
            goto L60
        L56:
            if (r2 == 0) goto L59
            goto L5a
        L59:
            r0 = r1
        L5a:
            boolean r0 = r7.b(r3, r0, r0)
            if (r0 == 0) goto L61
        L60:
            r3 = r4
        L61:
            if (r3 == 0) goto L66
            super.onMeasure(r8, r9)
        L66:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.snackbar.SnackbarContentLayout.onMeasure(int, int):void");
    }

    public void setMaxInlineActionWidth(int i10) {
        this.f27686z = i10;
    }
}
