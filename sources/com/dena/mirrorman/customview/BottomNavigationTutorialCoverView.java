package com.dena.mirrorman.customview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import c3.a;
import de.n;
import jo.h;
import jo.p;
import nd.w0;

/* loaded from: classes2.dex */
public final class BottomNavigationTutorialCoverView extends View {
    public final int A;

    /* renamed from: w  reason: collision with root package name */
    public final Paint f25317w;

    /* renamed from: x  reason: collision with root package name */
    public final RectF f25318x;

    /* renamed from: y  reason: collision with root package name */
    public final PorterDuffXfermode f25319y;

    /* renamed from: z  reason: collision with root package name */
    public final int f25320z;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BottomNavigationTutorialCoverView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        p.h(context, "context");
    }

    public /* synthetic */ BottomNavigationTutorialCoverView(Context context, AttributeSet attributeSet, int i10, int i11, h hVar) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (canvas == null) {
            return;
        }
        float width = getWidth() / 2;
        this.f25317w.setXfermode(this.f25319y);
        this.f25317w.setColor(a.d(getContext(), w0.black));
        int i10 = this.A;
        float f10 = i10 / 2;
        this.f25318x.set(width - f10, 0.0f, width + f10, i10);
        canvas.drawArc(this.f25318x, 0.0f, 360.0f, false, this.f25317w);
        this.f25318x.set(0.0f, getHeight() - this.f25320z, getWidth(), getHeight());
        canvas.drawRect(this.f25318x, this.f25317w);
        super.onDraw(canvas);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BottomNavigationTutorialCoverView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        p.h(context, "context");
        this.f25317w = new Paint();
        this.f25318x = new RectF();
        this.f25319y = new PorterDuffXfermode(PorterDuff.Mode.SRC);
        this.f25320z = n.b(this, 56);
        this.A = n.b(this, 64);
    }
}
