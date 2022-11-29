package com.dena.mirrorman.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.webkit.WebView;
import de.n;
import jo.p;

/* loaded from: classes3.dex */
public final class LeftRoundedWebView extends WebView {

    /* renamed from: w  reason: collision with root package name */
    public RectF f26362w;

    /* renamed from: x  reason: collision with root package name */
    public final float f26363x;

    /* renamed from: y  reason: collision with root package name */
    public final Path f26364y;

    /* renamed from: z  reason: collision with root package name */
    public final Paint f26365z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LeftRoundedWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        p.h(context, "context");
        this.f26363x = n.b(this, 8);
        Path path = new Path();
        path.setFillType(Path.FillType.INVERSE_WINDING);
        this.f26364y = path;
        Paint paint = new Paint();
        paint.setColor(0);
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        this.f26365z = paint;
    }

    @Override // android.webkit.WebView, android.view.View
    public void onDraw(Canvas canvas) {
        p.h(canvas, "canvas");
        super.onDraw(canvas);
        RectF rectF = this.f26362w;
        if (rectF != null) {
            this.f26364y.reset();
            Path path = this.f26364y;
            float f10 = this.f26363x;
            path.addRoundRect(rectF, new float[]{f10, f10, 0.0f, 0.0f, 0.0f, 0.0f, f10, f10}, Path.Direction.CW);
            canvas.drawPath(this.f26364y, this.f26365z);
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.f26362w = new RectF(0.0f, 0.0f, i10, i11);
    }
}
