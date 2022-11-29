package com.dena.mirrorman.customview;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import jo.h;
import jo.p;
import nd.h1;
import nd.w0;

/* loaded from: classes2.dex */
public final class TriangleView extends View {

    /* renamed from: w  reason: collision with root package name */
    public final Paint f25617w;

    /* renamed from: x  reason: collision with root package name */
    public final Path f25618x;

    /* renamed from: y  reason: collision with root package name */
    public String f25619y;

    /* renamed from: z  reason: collision with root package name */
    public int f25620z;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TriangleView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        p.h(context, "context");
    }

    public /* synthetic */ TriangleView(Context context, AttributeSet attributeSet, int i10, int i11, h hVar) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    public final int getColor() {
        return this.f25620z;
    }

    public final String getDirection() {
        return this.f25619y;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f25618x.reset();
        String str = this.f25619y;
        switch (str.hashCode()) {
            case -1383228885:
                if (str.equals("bottom")) {
                    this.f25618x.moveTo(0.0f, 0.0f);
                    this.f25618x.lineTo(getWidth() / 4.0f, getHeight() / 2.0f);
                    this.f25618x.cubicTo(getWidth() / 4.0f, getHeight() / 2.0f, getWidth() / 2.0f, getHeight(), (getWidth() * 3.0f) / 4.0f, getHeight() / 2.0f);
                    this.f25618x.lineTo((getWidth() * 3.0f) / 4.0f, getHeight() / 2.0f);
                    this.f25618x.lineTo(getWidth(), 0.0f);
                    break;
                }
                break;
            case 115029:
                if (str.equals("top")) {
                    this.f25618x.moveTo(0.0f, getHeight());
                    this.f25618x.lineTo(getWidth() / 4.0f, getHeight() / 2.0f);
                    this.f25618x.cubicTo(getWidth() / 4.0f, getHeight() / 2.0f, getWidth() / 2.0f, 0.0f, (getWidth() * 3.0f) / 4.0f, getHeight() / 2.0f);
                    this.f25618x.lineTo((getWidth() * 3.0f) / 4.0f, getHeight() / 2.0f);
                    this.f25618x.lineTo(getWidth(), getHeight());
                    break;
                }
                break;
            case 3317767:
                if (str.equals(TtmlNode.LEFT)) {
                    this.f25618x.moveTo(getWidth(), 0.0f);
                    this.f25618x.lineTo(getWidth() / 2.0f, getHeight() / 4.0f);
                    this.f25618x.cubicTo(getWidth() / 2.0f, getHeight() / 4.0f, 0.0f, getHeight() / 2.0f, getWidth() / 2.0f, (getHeight() * 3.0f) / 4.0f);
                    this.f25618x.lineTo(getWidth() / 2.0f, (getHeight() * 3.0f) / 4.0f);
                    this.f25618x.lineTo(0.0f, getHeight());
                    break;
                }
                break;
            case 108511772:
                if (str.equals(TtmlNode.RIGHT)) {
                    this.f25618x.moveTo(0.0f, 0.0f);
                    this.f25618x.lineTo(getWidth() / 2.0f, getHeight() / 4.0f);
                    this.f25618x.cubicTo(getWidth() / 2.0f, getHeight() / 4.0f, getWidth(), getHeight() / 2.0f, (getWidth() * 3.0f) / 2.0f, getHeight() / 4.0f);
                    this.f25618x.lineTo((getWidth() * 3.0f) / 2.0f, getHeight() / 4.0f);
                    this.f25618x.lineTo(0.0f, getHeight());
                    break;
                }
                break;
        }
        if (canvas != null) {
            canvas.drawPath(this.f25618x, this.f25617w);
        }
    }

    public final void setColor(int i10) {
        this.f25620z = i10;
        this.f25617w.setColor(i10);
        invalidate();
    }

    public final void setDirection(String str) {
        p.h(str, "value");
        this.f25619y = str;
        invalidate();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TriangleView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        p.h(context, "context");
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        this.f25617w = paint;
        this.f25618x = new Path();
        String str = "top";
        this.f25619y = "top";
        this.f25620z = -1;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{16843173}, 0, 0);
            paint.setColor(obtainStyledAttributes.getColor(h1.f42151w4, e3.h.d(obtainStyledAttributes.getResources(), w0.U0, context.getTheme())));
            obtainStyledAttributes.recycle();
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, h1.f42145v4, 0, 0);
            String string = obtainStyledAttributes2.getString(h1.f42157x4);
            if (string != null) {
                p.g(string, "getString(R.styleable.Tr…leViewDirection) ?: \"top\"");
                str = string;
            }
            setDirection(str);
            obtainStyledAttributes2.recycle();
        }
    }
}
