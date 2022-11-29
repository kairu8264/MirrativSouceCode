package com.dena.mirrativ.customview;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import h9.g;
import jo.p;

/* loaded from: classes.dex */
public class StrokeDecorationTextView extends AppCompatTextView {

    /* renamed from: w  reason: collision with root package name */
    public final float f20794w;

    /* renamed from: x  reason: collision with root package name */
    public int f20795x;

    /* renamed from: y  reason: collision with root package name */
    public Integer f20796y;

    /* renamed from: z  reason: collision with root package name */
    public int f20797z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StrokeDecorationTextView(Context context) {
        super(context);
        p.h(context, "context");
        float f10 = getResources().getDisplayMetrics().density * 12;
        this.f20794w = f10;
        this.f20795x = (int) f10;
        this.f20796y = -1;
        this.f20797z = getCurrentTextColor();
    }

    private final void setup(AttributeSet attributeSet) {
        setShadowLayer(this.f20794w, 0.0f, 0.0f, 0);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(attributeSet, g.f34681w1, 0, 0);
            this.f20795x = obtainStyledAttributes.getDimensionPixelSize(g.f34687y1, this.f20795x);
            int i10 = g.f34684x1;
            Integer num = this.f20796y;
            this.f20796y = Integer.valueOf(obtainStyledAttributes.getColor(i10, num != null ? num.intValue() : -1));
            obtainStyledAttributes.recycle();
        }
    }

    public final void c() {
        getPaint().setStyle(Paint.Style.STROKE);
        getPaint().setStrokeWidth(this.f20795x);
        Integer num = this.f20796y;
        super.setTextColor(num != null ? num.intValue() : 0);
    }

    public final void d() {
        getPaint().setStyle(Paint.Style.FILL);
        getPaint().setStrokeWidth(0.0f);
        super.setTextColor(this.f20797z);
    }

    public final Integer getOutlineColor() {
        return this.f20796y;
    }

    public final int getOutlineWidth() {
        return this.f20795x;
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        c();
        super.onDraw(canvas);
        d();
        super.onDraw(canvas);
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public void onMeasure(int i10, int i11) {
        c();
        super.onMeasure(i10, i11);
    }

    public final void setOutlineColor(Integer num) {
        this.f20796y = num;
    }

    public final void setOutlineWidth(int i10) {
        this.f20795x = i10;
    }

    @Override // android.widget.TextView
    public void setTextColor(int i10) {
        super.setTextColor(i10);
        this.f20797z = i10;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StrokeDecorationTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        p.h(context, "context");
        float f10 = getResources().getDisplayMetrics().density * 12;
        this.f20794w = f10;
        this.f20795x = (int) f10;
        this.f20796y = -1;
        this.f20797z = getCurrentTextColor();
        setup(attributeSet);
    }
}
