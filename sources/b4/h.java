package b4;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextPaint;

/* loaded from: classes.dex */
public final class h extends d {
    public static Paint B;

    public h(b bVar) {
        super(bVar);
    }

    public static Paint c() {
        if (B == null) {
            TextPaint textPaint = new TextPaint();
            B = textPaint;
            textPaint.setColor(a.a().b());
            B.setStyle(Paint.Style.FILL);
        }
        return B;
    }

    @Override // android.text.style.ReplacementSpan
    public void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f10, int i12, int i13, int i14, Paint paint) {
        if (a.a().g()) {
            canvas.drawRect(f10, i12, f10 + b(), i14, c());
        }
        a().a(canvas, f10, i13, paint);
    }
}
