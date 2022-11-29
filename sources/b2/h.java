package b2;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import jo.p;

/* loaded from: classes.dex */
public final class h extends ReplacementSpan {
    public static final a G = new a(null);
    public final float A;
    public final int B;
    public Paint.FontMetricsInt C;
    public int D;
    public int E;
    public boolean F;

    /* renamed from: w  reason: collision with root package name */
    public final float f16755w;

    /* renamed from: x  reason: collision with root package name */
    public final int f16756x;

    /* renamed from: y  reason: collision with root package name */
    public final float f16757y;

    /* renamed from: z  reason: collision with root package name */
    public final int f16758z;

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }
    }

    public h(float f10, int i10, float f11, int i11, float f12, int i12) {
        this.f16755w = f10;
        this.f16756x = i10;
        this.f16757y = f11;
        this.f16758z = i11;
        this.A = f12;
        this.B = i12;
    }

    public final Paint.FontMetricsInt a() {
        Paint.FontMetricsInt fontMetricsInt = this.C;
        if (fontMetricsInt != null) {
            return fontMetricsInt;
        }
        p.v("fontMetrics");
        return null;
    }

    public final int b() {
        if (this.F) {
            return this.E;
        }
        throw new IllegalStateException("PlaceholderSpan is not laid out yet.".toString());
    }

    public final int c() {
        return this.B;
    }

    public final int d() {
        if (this.F) {
            return this.D;
        }
        throw new IllegalStateException("PlaceholderSpan is not laid out yet.".toString());
    }

    @Override // android.text.style.ReplacementSpan
    public void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f10, int i12, int i13, int i14, Paint paint) {
        p.h(canvas, "canvas");
        p.h(paint, "paint");
    }

    @Override // android.text.style.ReplacementSpan
    @SuppressLint({"DocumentExceptions"})
    public int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        float f10;
        int a10;
        p.h(paint, "paint");
        this.F = true;
        float textSize = paint.getTextSize();
        Paint.FontMetricsInt fontMetricsInt2 = paint.getFontMetricsInt();
        p.g(fontMetricsInt2, "paint.fontMetricsInt");
        this.C = fontMetricsInt2;
        if (a().descent > a().ascent) {
            int i12 = this.f16756x;
            if (i12 == 0) {
                f10 = this.f16755w * this.A;
            } else if (i12 == 1) {
                f10 = this.f16755w * textSize;
            } else {
                throw new IllegalArgumentException("Unsupported unit.");
            }
            this.D = i.a(f10);
            int i13 = this.f16758z;
            if (i13 == 0) {
                a10 = i.a(this.f16757y * this.A);
            } else if (i13 == 1) {
                a10 = i.a(this.f16757y * textSize);
            } else {
                throw new IllegalArgumentException("Unsupported unit.");
            }
            this.E = a10;
            if (fontMetricsInt != null) {
                fontMetricsInt.ascent = a().ascent;
                fontMetricsInt.descent = a().descent;
                fontMetricsInt.leading = a().leading;
                switch (this.B) {
                    case 0:
                        if (fontMetricsInt.ascent > (-b())) {
                            fontMetricsInt.ascent = -b();
                            break;
                        }
                        break;
                    case 1:
                    case 4:
                        if (fontMetricsInt.ascent + b() > fontMetricsInt.descent) {
                            fontMetricsInt.descent = fontMetricsInt.ascent + b();
                            break;
                        }
                        break;
                    case 2:
                    case 5:
                        if (fontMetricsInt.ascent > fontMetricsInt.descent - b()) {
                            fontMetricsInt.ascent = fontMetricsInt.descent - b();
                            break;
                        }
                        break;
                    case 3:
                    case 6:
                        if (fontMetricsInt.descent - fontMetricsInt.ascent < b()) {
                            int b10 = fontMetricsInt.ascent - ((b() - (fontMetricsInt.descent - fontMetricsInt.ascent)) / 2);
                            fontMetricsInt.ascent = b10;
                            fontMetricsInt.descent = b10 + b();
                            break;
                        }
                        break;
                    default:
                        throw new IllegalArgumentException("Unknown verticalAlign.");
                }
                fontMetricsInt.top = Math.min(a().top, fontMetricsInt.ascent);
                fontMetricsInt.bottom = Math.max(a().bottom, fontMetricsInt.descent);
            }
            return d();
        }
        throw new IllegalArgumentException("Invalid fontMetrics: line height can not be negative.".toString());
    }
}
