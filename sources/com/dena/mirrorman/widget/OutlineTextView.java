package com.dena.mirrorman.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import jo.p;
import nd.h1;

/* loaded from: classes3.dex */
public final class OutlineTextView extends AppCompatTextView {

    /* renamed from: w  reason: collision with root package name */
    public int f26369w;

    /* renamed from: x  reason: collision with root package name */
    public int f26370x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OutlineTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        p.h(context, "context");
        c(context, attributeSet);
    }

    public final void c(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, h1.B2, 0, 0);
        p.g(obtainStyledAttributes, "context.theme.obtainStyl…,\n            0\n        )");
        try {
            this.f26369w = obtainStyledAttributes.getDimensionPixelSize(h1.D2, 0);
            this.f26370x = obtainStyledAttributes.getColor(h1.C2, 0);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        p.h(canvas, "canvas");
        if (this.f26369w == 0) {
            super.draw(canvas);
            return;
        }
        canvas.drawColor(0, PorterDuff.Mode.SRC_OVER);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setTextSize(getTextSize());
        paint.setStrokeWidth(this.f26369w);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setColor(this.f26370x);
        paint.setStyle(Paint.Style.STROKE);
        String obj = getText().toString();
        Rect rect = new Rect();
        paint.getTextBounds(obj, 0, obj.length(), rect);
        float width = (getWidth() / 2.0f) - (rect.width() / 2.0f);
        float height = ((getHeight() / 2) + (rect.height() / 2)) - rect.bottom;
        canvas.drawText(obj, width, height, paint);
        paint.setStrokeWidth(0.0f);
        paint.setColor(getCurrentTextColor());
        paint.setStyle(Paint.Style.FILL);
        canvas.drawText(obj, width, height, paint);
    }
}
