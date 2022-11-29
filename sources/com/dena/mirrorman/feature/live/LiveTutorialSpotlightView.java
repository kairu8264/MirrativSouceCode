package com.dena.mirrorman.feature.live;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import e3.h;
import jo.p;
import nd.w0;
import of.t;

/* loaded from: classes2.dex */
public final class LiveTutorialSpotlightView extends View {
    public float A;

    /* renamed from: w  reason: collision with root package name */
    public final Paint f25862w;

    /* renamed from: x  reason: collision with root package name */
    public final Path f25863x;

    /* renamed from: y  reason: collision with root package name */
    public int f25864y;

    /* renamed from: z  reason: collision with root package name */
    public RectF f25865z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LiveTutorialSpotlightView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        p.h(context, "context");
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColor(h.d(getResources(), w0.f42233h, getContext().getTheme()));
        paint.setStyle(Paint.Style.FILL);
        this.f25862w = paint;
        this.f25863x = new Path();
        Context context2 = getContext();
        p.g(context2, "context");
        this.f25864y = t.b(context2, 4);
        this.f25865z = new RectF();
    }

    private final void setSpotlightPadding(int i10) {
        this.f25864y = i10;
        invalidate();
    }

    public final float getCornerRadius() {
        return this.A;
    }

    public final RectF getSpotlightRect() {
        return this.f25865z;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f25863x.reset();
        this.f25863x.addRect(0.0f, 0.0f, getWidth(), getHeight(), Path.Direction.CW);
        Path path = this.f25863x;
        RectF rectF = this.f25865z;
        float f10 = rectF.left;
        int i10 = this.f25864y;
        float f11 = this.A;
        path.addRoundRect(f10 - i10, rectF.top - i10, rectF.right + i10, rectF.bottom + i10, f11, f11, Path.Direction.CCW);
        if (canvas != null) {
            canvas.drawPath(this.f25863x, this.f25862w);
        }
    }

    public final void setCornerRadius(float f10) {
        this.A = f10;
        invalidate();
    }

    public final void setSpotlightRect(RectF rectF) {
        p.h(rectF, "value");
        this.f25865z = rectF;
        invalidate();
    }
}
