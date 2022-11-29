package androidx.emoji2.text;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextPaint;

/* loaded from: classes.dex */
public final class n extends h {
    public static Paint B;

    public n(f fVar) {
        super(fVar);
    }

    public static Paint c() {
        if (B == null) {
            TextPaint textPaint = new TextPaint();
            B = textPaint;
            textPaint.setColor(d.b().c());
            B.setStyle(Paint.Style.FILL);
        }
        return B;
    }

    @Override // android.text.style.ReplacementSpan
    public void draw(Canvas canvas, @SuppressLint({"UnknownNullness"}) CharSequence charSequence, int i10, int i11, float f10, int i12, int i13, int i14, Paint paint) {
        if (d.b().i()) {
            canvas.drawRect(f10, i12, f10 + b(), i14, c());
        }
        a().a(canvas, f10, i13, paint);
    }
}
