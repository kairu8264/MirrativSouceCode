package b2;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import jo.p;

/* loaded from: classes.dex */
public final class l extends CharacterStyle {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f16764a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f16765b;

    public l(boolean z10, boolean z11) {
        this.f16764a = z10;
        this.f16765b = z11;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        p.h(textPaint, "textPaint");
        textPaint.setUnderlineText(this.f16764a);
        textPaint.setStrikeThruText(this.f16765b);
    }
}
