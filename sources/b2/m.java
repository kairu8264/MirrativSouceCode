package b2;

import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import jo.p;

/* loaded from: classes.dex */
public final class m extends MetricAffectingSpan {

    /* renamed from: w  reason: collision with root package name */
    public final Typeface f16766w;

    public m(Typeface typeface) {
        p.h(typeface, "typeface");
        this.f16766w = typeface;
    }

    public final void a(Paint paint) {
        paint.setTypeface(this.f16766w);
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        p.h(textPaint, "ds");
        a(textPaint);
    }

    @Override // android.text.style.MetricAffectingSpan
    public void updateMeasureState(TextPaint textPaint) {
        p.h(textPaint, "paint");
        a(textPaint);
    }
}
