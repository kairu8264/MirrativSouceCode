package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.widget.TextView;
import o3.c0;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final Rect f27522a;

    /* renamed from: b  reason: collision with root package name */
    public final ColorStateList f27523b;

    /* renamed from: c  reason: collision with root package name */
    public final ColorStateList f27524c;

    /* renamed from: d  reason: collision with root package name */
    public final ColorStateList f27525d;

    /* renamed from: e  reason: collision with root package name */
    public final int f27526e;

    /* renamed from: f  reason: collision with root package name */
    public final tj.k f27527f;

    public b(ColorStateList colorStateList, ColorStateList colorStateList2, ColorStateList colorStateList3, int i10, tj.k kVar, Rect rect) {
        n3.h.d(rect.left);
        n3.h.d(rect.top);
        n3.h.d(rect.right);
        n3.h.d(rect.bottom);
        this.f27522a = rect;
        this.f27523b = colorStateList2;
        this.f27524c = colorStateList;
        this.f27525d = colorStateList3;
        this.f27526e = i10;
        this.f27527f = kVar;
    }

    public static b a(Context context, int i10) {
        n3.h.b(i10 != 0, "Cannot create a CalendarItemStyle with a styleResId of 0");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i10, wi.l.A3);
        Rect rect = new Rect(obtainStyledAttributes.getDimensionPixelOffset(wi.l.B3, 0), obtainStyledAttributes.getDimensionPixelOffset(wi.l.D3, 0), obtainStyledAttributes.getDimensionPixelOffset(wi.l.C3, 0), obtainStyledAttributes.getDimensionPixelOffset(wi.l.E3, 0));
        ColorStateList a10 = qj.c.a(context, obtainStyledAttributes, wi.l.F3);
        ColorStateList a11 = qj.c.a(context, obtainStyledAttributes, wi.l.K3);
        ColorStateList a12 = qj.c.a(context, obtainStyledAttributes, wi.l.I3);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(wi.l.J3, 0);
        tj.k m10 = tj.k.b(context, obtainStyledAttributes.getResourceId(wi.l.G3, 0), obtainStyledAttributes.getResourceId(wi.l.H3, 0)).m();
        obtainStyledAttributes.recycle();
        return new b(a10, a11, a12, dimensionPixelSize, m10, rect);
    }

    public int b() {
        return this.f27522a.bottom;
    }

    public int c() {
        return this.f27522a.top;
    }

    public void d(TextView textView) {
        tj.g gVar = new tj.g();
        tj.g gVar2 = new tj.g();
        gVar.setShapeAppearanceModel(this.f27527f);
        gVar2.setShapeAppearanceModel(this.f27527f);
        gVar.Y(this.f27524c);
        gVar.g0(this.f27526e, this.f27525d);
        textView.setTextColor(this.f27523b);
        Drawable rippleDrawable = Build.VERSION.SDK_INT >= 21 ? new RippleDrawable(this.f27523b.withAlpha(30), gVar, gVar2) : gVar;
        Rect rect = this.f27522a;
        c0.v0(textView, new InsetDrawable(rippleDrawable, rect.left, rect.top, rect.right, rect.bottom));
    }
}
