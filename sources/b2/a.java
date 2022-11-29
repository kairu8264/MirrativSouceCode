package b2;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import jo.p;

/* loaded from: classes.dex */
public class a extends MetricAffectingSpan {

    /* renamed from: w  reason: collision with root package name */
    public final float f16746w;

    public a(float f10) {
        this.f16746w = f10;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        p.h(textPaint, "textPaint");
        textPaint.baselineShift += (int) Math.ceil(textPaint.ascent() * this.f16746w);
    }

    @Override // android.text.style.MetricAffectingSpan
    public void updateMeasureState(TextPaint textPaint) {
        p.h(textPaint, "textPaint");
        textPaint.baselineShift += (int) Math.ceil(textPaint.ascent() * this.f16746w);
    }
}
