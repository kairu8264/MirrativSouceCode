package com.dena.mirrativ.customview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import c3.a;
import h9.b;
import jo.h;
import jo.p;

/* loaded from: classes.dex */
public final class MirraClassSeasonRatingExpOutLineTextView extends AppCompatTextView {

    /* renamed from: w  reason: collision with root package name */
    public int f20784w;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MirraClassSeasonRatingExpOutLineTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        p.h(context, "context");
    }

    public /* synthetic */ MirraClassSeasonRatingExpOutLineTextView(Context context, AttributeSet attributeSet, int i10, int i11, h hVar) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    public final int c(View view, int i10) {
        return (int) (view.getContext().getResources().getDisplayMetrics().density * i10);
    }

    public final void d(int i10) {
        this.f20784w = a.d(getContext(), i10);
        invalidate();
    }

    public final int getExpTextColor() {
        return this.f20784w;
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        setTextColor(-1);
        getPaint().setStyle(Paint.Style.FILL_AND_STROKE);
        getPaint().setStrokeWidth(c(this, 2));
        super.onDraw(canvas);
        setTextColor(this.f20784w);
        getPaint().setStyle(Paint.Style.FILL);
        getPaint().setStrokeWidth(0.0f);
        super.onDraw(canvas);
    }

    public final void setExpTextColor(int i10) {
        this.f20784w = i10;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MirraClassSeasonRatingExpOutLineTextView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        p.h(context, "context");
        this.f20784w = a.d(context, b.f34605c);
    }
}
