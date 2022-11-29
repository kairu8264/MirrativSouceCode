package b2;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import jo.p;

/* loaded from: classes.dex */
public final class b extends MetricAffectingSpan {

    /* renamed from: w  reason: collision with root package name */
    public final String f16747w;

    public b(String str) {
        p.h(str, "fontFeatureSettings");
        this.f16747w = str;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        p.h(textPaint, "textPaint");
        textPaint.setFontFeatureSettings(this.f16747w);
    }

    @Override // android.text.style.MetricAffectingSpan
    public void updateMeasureState(TextPaint textPaint) {
        p.h(textPaint, "textPaint");
        textPaint.setFontFeatureSettings(this.f16747w);
    }
}
