package b2;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import jo.p;

/* loaded from: classes.dex */
public final class j extends CharacterStyle {

    /* renamed from: a  reason: collision with root package name */
    public final int f16759a;

    /* renamed from: b  reason: collision with root package name */
    public final float f16760b;

    /* renamed from: c  reason: collision with root package name */
    public final float f16761c;

    /* renamed from: d  reason: collision with root package name */
    public final float f16762d;

    public j(int i10, float f10, float f11, float f12) {
        this.f16759a = i10;
        this.f16760b = f10;
        this.f16761c = f11;
        this.f16762d = f12;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        p.h(textPaint, "tp");
        textPaint.setShadowLayer(this.f16762d, this.f16760b, this.f16761c, this.f16759a);
    }
}
