package com.dena.mirrorman.customview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import jo.h;
import jo.p;
import nd.w0;

/* loaded from: classes2.dex */
public final class SpotlightView extends View {

    /* renamed from: w  reason: collision with root package name */
    public final Paint f25599w;

    /* renamed from: x  reason: collision with root package name */
    public final Path f25600x;

    /* renamed from: y  reason: collision with root package name */
    public int f25601y;

    /* renamed from: z  reason: collision with root package name */
    public RectF f25602z;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SpotlightView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        p.h(context, "context");
    }

    public /* synthetic */ SpotlightView(Context context, AttributeSet attributeSet, int i10, int i11, h hVar) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    public final int getSpotlightPadding() {
        return this.f25601y;
    }

    public final RectF getSpotlightRect() {
        return this.f25602z;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f25600x.reset();
        this.f25600x.addRect(0.0f, 0.0f, getWidth(), getHeight(), Path.Direction.CW);
        this.f25600x.addCircle(this.f25602z.centerX(), this.f25602z.centerY(), (Math.max(this.f25602z.width(), this.f25602z.height()) / 2.0f) + this.f25601y, Path.Direction.CCW);
        if (canvas != null) {
            canvas.drawPath(this.f25600x, this.f25599w);
        }
    }

    public final void setSpotlightPadding(int i10) {
        this.f25601y = i10;
        invalidate();
    }

    public final void setSpotlightRect(RectF rectF) {
        p.h(rectF, "value");
        this.f25602z = rectF;
        invalidate();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpotlightView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        p.h(context, "context");
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColor(e3.h.d(getResources(), w0.f42232g, context.getTheme()));
        paint.setStyle(Paint.Style.FILL);
        this.f25599w = paint;
        this.f25600x = new Path();
        this.f25602z = new RectF();
    }
}
