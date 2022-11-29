package b2;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import jo.p;

/* loaded from: classes.dex */
public class k extends MetricAffectingSpan {

    /* renamed from: w  reason: collision with root package name */
    public final float f16763w;

    public k(float f10) {
        this.f16763w = f10;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        p.h(textPaint, "textPaint");
        textPaint.setTextSkewX(this.f16763w + textPaint.getTextSkewX());
    }

    @Override // android.text.style.MetricAffectingSpan
    public void updateMeasureState(TextPaint textPaint) {
        p.h(textPaint, "textPaint");
        textPaint.setTextSkewX(this.f16763w + textPaint.getTextSkewX());
    }
}
