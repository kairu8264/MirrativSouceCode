package b4;

import android.graphics.Paint;
import android.text.style.ReplacementSpan;

/* loaded from: classes.dex */
public abstract class d extends ReplacementSpan {

    /* renamed from: x  reason: collision with root package name */
    public final b f16946x;

    /* renamed from: w  reason: collision with root package name */
    public final Paint.FontMetricsInt f16945w = new Paint.FontMetricsInt();

    /* renamed from: y  reason: collision with root package name */
    public short f16947y = -1;

    /* renamed from: z  reason: collision with root package name */
    public short f16948z = -1;
    public float A = 1.0f;

    public d(b bVar) {
        n3.h.h(bVar, "metadata cannot be null");
        this.f16946x = bVar;
    }

    public final b a() {
        return this.f16946x;
    }

    public final int b() {
        return this.f16947y;
    }

    @Override // android.text.style.ReplacementSpan
    public int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        paint.getFontMetricsInt(this.f16945w);
        Paint.FontMetricsInt fontMetricsInt2 = this.f16945w;
        this.A = (Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent) * 1.0f) / this.f16946x.e();
        this.f16948z = (short) (this.f16946x.e() * this.A);
        short i12 = (short) (this.f16946x.i() * this.A);
        this.f16947y = i12;
        if (fontMetricsInt != null) {
            Paint.FontMetricsInt fontMetricsInt3 = this.f16945w;
            fontMetricsInt.ascent = fontMetricsInt3.ascent;
            fontMetricsInt.descent = fontMetricsInt3.descent;
            fontMetricsInt.top = fontMetricsInt3.top;
            fontMetricsInt.bottom = fontMetricsInt3.bottom;
        }
        return i12;
    }
}
