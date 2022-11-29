package com.google.android.material.textview;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import qj.b;
import qj.c;
import wi.l;
import yj.a;

/* loaded from: classes3.dex */
public class MaterialTextView extends AppCompatTextView {
    public MaterialTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842884);
    }

    public static boolean d(Context context) {
        return b.b(context, wi.b.J, true);
    }

    public static int f(Resources.Theme theme, AttributeSet attributeSet, int i10, int i11) {
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, l.f59007i4, i10, i11);
        int resourceId = obtainStyledAttributes.getResourceId(l.f59016j4, -1);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    public static int h(Context context, TypedArray typedArray, int... iArr) {
        int i10 = -1;
        for (int i11 = 0; i11 < iArr.length && i10 < 0; i11++) {
            i10 = c.c(context, typedArray, iArr[i11], -1);
        }
        return i10;
    }

    public static boolean k(Context context, Resources.Theme theme, AttributeSet attributeSet, int i10, int i11) {
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, l.f59007i4, i10, i11);
        int h10 = h(context, obtainStyledAttributes, l.f59025k4, l.f59034l4);
        obtainStyledAttributes.recycle();
        return h10 != -1;
    }

    public final void c(Resources.Theme theme, int i10) {
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(i10, l.f58971e4);
        int h10 = h(getContext(), obtainStyledAttributes, l.f58989g4, l.f58998h4);
        obtainStyledAttributes.recycle();
        if (h10 >= 0) {
            setLineHeight(h10);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView
    public void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        if (d(context)) {
            c(context.getTheme(), i10);
        }
    }

    public MaterialTextView(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public MaterialTextView(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(a.c(context, attributeSet, i10, i11), attributeSet, i10);
        int f10;
        Context context2 = getContext();
        if (d(context2)) {
            Resources.Theme theme = context2.getTheme();
            if (k(context2, theme, attributeSet, i10, i11) || (f10 = f(theme, attributeSet, i10, i11)) == -1) {
                return;
            }
            c(theme, f10);
        }
    }
}
