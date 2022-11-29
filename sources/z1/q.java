package z1;

import android.text.Layout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: a  reason: collision with root package name */
    public final CharSequence f62462a;

    /* renamed from: b  reason: collision with root package name */
    public final int f62463b;

    /* renamed from: c  reason: collision with root package name */
    public final int f62464c;

    /* renamed from: d  reason: collision with root package name */
    public final TextPaint f62465d;

    /* renamed from: e  reason: collision with root package name */
    public final int f62466e;

    /* renamed from: f  reason: collision with root package name */
    public final TextDirectionHeuristic f62467f;

    /* renamed from: g  reason: collision with root package name */
    public final Layout.Alignment f62468g;

    /* renamed from: h  reason: collision with root package name */
    public final int f62469h;

    /* renamed from: i  reason: collision with root package name */
    public final TextUtils.TruncateAt f62470i;

    /* renamed from: j  reason: collision with root package name */
    public final int f62471j;

    /* renamed from: k  reason: collision with root package name */
    public final float f62472k;

    /* renamed from: l  reason: collision with root package name */
    public final float f62473l;

    /* renamed from: m  reason: collision with root package name */
    public final int f62474m;

    /* renamed from: n  reason: collision with root package name */
    public final boolean f62475n;

    /* renamed from: o  reason: collision with root package name */
    public final boolean f62476o;

    /* renamed from: p  reason: collision with root package name */
    public final int f62477p;

    /* renamed from: q  reason: collision with root package name */
    public final int f62478q;

    /* renamed from: r  reason: collision with root package name */
    public final int[] f62479r;

    /* renamed from: s  reason: collision with root package name */
    public final int[] f62480s;

    public q(CharSequence charSequence, int i10, int i11, TextPaint textPaint, int i12, TextDirectionHeuristic textDirectionHeuristic, Layout.Alignment alignment, int i13, TextUtils.TruncateAt truncateAt, int i14, float f10, float f11, int i15, boolean z10, boolean z11, int i16, int i17, int[] iArr, int[] iArr2) {
        jo.p.h(charSequence, "text");
        jo.p.h(textPaint, "paint");
        jo.p.h(textDirectionHeuristic, "textDir");
        jo.p.h(alignment, "alignment");
        this.f62462a = charSequence;
        this.f62463b = i10;
        this.f62464c = i11;
        this.f62465d = textPaint;
        this.f62466e = i12;
        this.f62467f = textDirectionHeuristic;
        this.f62468g = alignment;
        this.f62469h = i13;
        this.f62470i = truncateAt;
        this.f62471j = i14;
        this.f62472k = f10;
        this.f62473l = f11;
        this.f62474m = i15;
        this.f62475n = z10;
        this.f62476o = z11;
        this.f62477p = i16;
        this.f62478q = i17;
        this.f62479r = iArr;
        this.f62480s = iArr2;
        if (!(i10 >= 0 && i10 <= i11)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (!(i11 >= 0 && i11 <= charSequence.length())) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (!(i13 >= 0)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (!(i12 >= 0)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (!(i14 >= 0)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (!(f10 >= 0.0f)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
    }

    public final Layout.Alignment a() {
        return this.f62468g;
    }

    public final int b() {
        return this.f62477p;
    }

    public final TextUtils.TruncateAt c() {
        return this.f62470i;
    }

    public final int d() {
        return this.f62471j;
    }

    public final int e() {
        return this.f62464c;
    }

    public final int f() {
        return this.f62478q;
    }

    public final boolean g() {
        return this.f62475n;
    }

    public final int h() {
        return this.f62474m;
    }

    public final int[] i() {
        return this.f62479r;
    }

    public final float j() {
        return this.f62473l;
    }

    public final float k() {
        return this.f62472k;
    }

    public final int l() {
        return this.f62469h;
    }

    public final TextPaint m() {
        return this.f62465d;
    }

    public final int[] n() {
        return this.f62480s;
    }

    public final int o() {
        return this.f62463b;
    }

    public final CharSequence p() {
        return this.f62462a;
    }

    public final TextDirectionHeuristic q() {
        return this.f62467f;
    }

    public final boolean r() {
        return this.f62476o;
    }

    public final int s() {
        return this.f62466e;
    }
}
