package b2;

import android.graphics.Paint;
import android.text.style.LineHeightSpan;
import jo.p;

/* loaded from: classes.dex */
public final class e implements LineHeightSpan {

    /* renamed from: w  reason: collision with root package name */
    public final float f16750w;

    public e(float f10) {
        this.f16750w = f10;
    }

    @Override // android.text.style.LineHeightSpan
    public void chooseHeight(CharSequence charSequence, int i10, int i11, int i12, int i13, Paint.FontMetricsInt fontMetricsInt) {
        p.h(charSequence, "text");
        p.h(fontMetricsInt, "fontMetricsInt");
        int a10 = g.a(fontMetricsInt);
        if (a10 <= 0) {
            return;
        }
        int ceil = (int) Math.ceil(this.f16750w);
        int ceil2 = (int) Math.ceil(fontMetricsInt.descent * ((ceil * 1.0f) / a10));
        fontMetricsInt.descent = ceil2;
        fontMetricsInt.ascent = ceil2 - ceil;
    }
}
