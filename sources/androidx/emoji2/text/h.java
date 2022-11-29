package androidx.emoji2.text;

import android.annotation.SuppressLint;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;

/* loaded from: classes.dex */
public abstract class h extends ReplacementSpan {

    /* renamed from: x  reason: collision with root package name */
    public final f f15097x;

    /* renamed from: w  reason: collision with root package name */
    public final Paint.FontMetricsInt f15096w = new Paint.FontMetricsInt();

    /* renamed from: y  reason: collision with root package name */
    public short f15098y = -1;

    /* renamed from: z  reason: collision with root package name */
    public short f15099z = -1;
    public float A = 1.0f;

    public h(f fVar) {
        n3.h.h(fVar, "metadata cannot be null");
        this.f15097x = fVar;
    }

    public final f a() {
        return this.f15097x;
    }

    public final int b() {
        return this.f15098y;
    }

    @Override // android.text.style.ReplacementSpan
    public int getSize(Paint paint, @SuppressLint({"UnknownNullness"}) CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        paint.getFontMetricsInt(this.f15096w);
        Paint.FontMetricsInt fontMetricsInt2 = this.f15096w;
        this.A = (Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent) * 1.0f) / this.f15097x.e();
        this.f15099z = (short) (this.f15097x.e() * this.A);
        short i12 = (short) (this.f15097x.i() * this.A);
        this.f15098y = i12;
        if (fontMetricsInt != null) {
            Paint.FontMetricsInt fontMetricsInt3 = this.f15096w;
            fontMetricsInt.ascent = fontMetricsInt3.ascent;
            fontMetricsInt.descent = fontMetricsInt3.descent;
            fontMetricsInt.top = fontMetricsInt3.top;
            fontMetricsInt.bottom = fontMetricsInt3.bottom;
        }
        return i12;
    }
}
