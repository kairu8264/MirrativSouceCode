package b2;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import jo.p;

/* loaded from: classes.dex */
public final class c extends MetricAffectingSpan {

    /* renamed from: w  reason: collision with root package name */
    public final float f16748w;

    public c(float f10) {
        this.f16748w = f10;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        p.h(textPaint, "textPaint");
        textPaint.setLetterSpacing(this.f16748w);
    }

    @Override // android.text.style.MetricAffectingSpan
    public void updateMeasureState(TextPaint textPaint) {
        p.h(textPaint, "textPaint");
        textPaint.setLetterSpacing(this.f16748w);
    }
}
