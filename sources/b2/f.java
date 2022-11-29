package b2;

import android.graphics.Paint;
import android.text.style.LineHeightSpan;
import jo.p;

/* loaded from: classes.dex */
public final class f implements LineHeightSpan {
    public final boolean A;
    public final int B;
    public int C;
    public int D;
    public int E;
    public int F;
    public int G;
    public int H;

    /* renamed from: w  reason: collision with root package name */
    public final float f16751w;

    /* renamed from: x  reason: collision with root package name */
    public final int f16752x;

    /* renamed from: y  reason: collision with root package name */
    public final int f16753y;

    /* renamed from: z  reason: collision with root package name */
    public final boolean f16754z;

    public f(float f10, int i10, int i11, boolean z10, boolean z11, int i12) {
        this.f16751w = f10;
        this.f16752x = i10;
        this.f16753y = i11;
        this.f16754z = z10;
        this.A = z11;
        this.B = i12;
        boolean z12 = true;
        if (!(i12 >= 0 && i12 < 101) && i12 != -1) {
            z12 = false;
        }
        if (!z12) {
            throw new IllegalStateException("topRatio should be in [0..100] range or -1".toString());
        }
    }

    public final void a(Paint.FontMetricsInt fontMetricsInt) {
        double ceil;
        int a10 = g.a(fontMetricsInt);
        int ceil2 = (int) Math.ceil(this.f16751w);
        int i10 = ceil2 - a10;
        int i11 = this.B;
        if (i11 == -1) {
            i11 = (int) ((Math.abs(fontMetricsInt.ascent) / g.a(fontMetricsInt)) * 100.0f);
        }
        if (i10 <= 0) {
            ceil = Math.ceil((i10 * i11) / 100.0f);
        } else {
            ceil = Math.ceil((i10 * (100 - i11)) / 100.0f);
        }
        int i12 = fontMetricsInt.descent;
        int i13 = ((int) ceil) + i12;
        this.E = i13;
        int i14 = i13 - ceil2;
        this.D = i14;
        if (this.f16754z) {
            i14 = fontMetricsInt.ascent;
        }
        this.C = i14;
        if (this.A) {
            i13 = i12;
        }
        this.F = i13;
        this.G = fontMetricsInt.ascent - i14;
        this.H = i13 - i12;
    }

    public final int b() {
        return this.G;
    }

    public final int c() {
        return this.H;
    }

    @Override // android.text.style.LineHeightSpan
    public void chooseHeight(CharSequence charSequence, int i10, int i11, int i12, int i13, Paint.FontMetricsInt fontMetricsInt) {
        p.h(charSequence, "text");
        p.h(fontMetricsInt, "fontMetricsInt");
        if (g.a(fontMetricsInt) <= 0) {
            return;
        }
        boolean z10 = i10 == this.f16752x;
        boolean z11 = i11 == this.f16753y;
        if (z10 && z11 && this.f16754z && this.A) {
            return;
        }
        if (z10) {
            a(fontMetricsInt);
        }
        fontMetricsInt.ascent = z10 ? this.C : this.D;
        fontMetricsInt.descent = z11 ? this.F : this.E;
    }
}
