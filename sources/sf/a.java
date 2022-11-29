package sf;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import jo.p;

/* loaded from: classes3.dex */
public abstract class a extends ClickableSpan {

    /* renamed from: w  reason: collision with root package name */
    public final int f52688w;

    public a(int i10) {
        this.f52688w = i10;
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        p.h(textPaint, "ds");
        super.updateDrawState(textPaint);
        textPaint.setColor(this.f52688w);
        textPaint.bgColor = 0;
        textPaint.setUnderlineText(true);
    }
}
