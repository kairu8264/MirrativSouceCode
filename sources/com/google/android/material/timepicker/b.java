package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import o3.c0;
import tj.g;
import tj.i;
import wi.f;
import wi.h;
import wi.l;

/* loaded from: classes3.dex */
public class b extends ConstraintLayout {
    public final Runnable U;
    public int V;
    public g W;

    /* loaded from: classes3.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            b.this.A();
        }
    }

    public b(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public static boolean z(View view) {
        return "skip".equals(view.getTag());
    }

    public void A() {
        int childCount = getChildCount();
        int i10 = 1;
        for (int i11 = 0; i11 < childCount; i11++) {
            if (z(getChildAt(i11))) {
                i10++;
            }
        }
        androidx.constraintlayout.widget.c cVar = new androidx.constraintlayout.widget.c();
        cVar.g(this);
        float f10 = 0.0f;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            int id2 = childAt.getId();
            int i13 = f.f58836b;
            if (id2 != i13 && !z(childAt)) {
                cVar.k(childAt.getId(), i13, this.V, f10);
                f10 += 360.0f / (childCount - i10);
            }
        }
        cVar.c(this);
    }

    public final void B() {
        Handler handler = getHandler();
        if (handler != null) {
            handler.removeCallbacks(this.U);
            handler.post(this.U);
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i10, layoutParams);
        if (view.getId() == -1) {
            view.setId(c0.m());
        }
        B();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        A();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        B();
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        this.W.Y(ColorStateList.valueOf(i10));
    }

    public final Drawable w() {
        g gVar = new g();
        this.W = gVar;
        gVar.W(new i(0.5f));
        this.W.Y(ColorStateList.valueOf(-1));
        return this.W;
    }

    public int x() {
        return this.V;
    }

    public void y(int i10) {
        this.V = i10;
        A();
    }

    public b(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        LayoutInflater.from(context).inflate(h.f58871i, this);
        c0.v0(this, w());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, l.I4, i10, 0);
        this.V = obtainStyledAttributes.getDimensionPixelSize(l.J4, 0);
        this.U = new a();
        obtainStyledAttributes.recycle();
    }
}
