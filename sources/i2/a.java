package i2;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
import b1.l;
import c1.d1;
import jo.p;

/* loaded from: classes.dex */
public final class a extends CharacterStyle implements UpdateAppearance {

    /* renamed from: w  reason: collision with root package name */
    public final d1 f36318w;

    /* renamed from: x  reason: collision with root package name */
    public l f36319x;

    public a(d1 d1Var) {
        p.h(d1Var, "shaderBrush");
        this.f36318w = d1Var;
    }

    public final void a(l lVar) {
        this.f36319x = lVar;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        l lVar;
        if (textPaint == null || (lVar = this.f36319x) == null) {
            return;
        }
        textPaint.setShader(this.f36318w.b(lVar.m()));
    }
}
