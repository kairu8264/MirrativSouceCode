package z1;

import android.graphics.Canvas;
import android.graphics.Path;
import android.os.Build;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.Spanned;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f62484a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f62485b;

    /* renamed from: c  reason: collision with root package name */
    public final e f62486c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f62487d;

    /* renamed from: e  reason: collision with root package name */
    public final Layout f62488e;

    /* renamed from: f  reason: collision with root package name */
    public final int f62489f;

    /* renamed from: g  reason: collision with root package name */
    public final int f62490g;

    /* renamed from: h  reason: collision with root package name */
    public final int f62491h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f62492i;

    /* renamed from: j  reason: collision with root package name */
    public final wn.f f62493j;

    /* loaded from: classes.dex */
    public static final class a extends jo.q implements io.a<d> {
        public a() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final d invoke() {
            return new d(s.this.d());
        }
    }

    public s(CharSequence charSequence, float f10, TextPaint textPaint, int i10, TextUtils.TruncateAt truncateAt, int i11, float f11, float f12, boolean z10, boolean z11, int i12, int i13, int i14, int i15, int[] iArr, int[] iArr2, e eVar) {
        boolean z12;
        boolean z13;
        Layout a10;
        wn.k f13;
        wn.k c10;
        jo.p.h(charSequence, "charSequence");
        jo.p.h(textPaint, "textPaint");
        jo.p.h(eVar, "layoutIntrinsics");
        this.f62484a = z10;
        this.f62485b = z11;
        this.f62486c = eVar;
        int length = charSequence.length();
        TextDirectionHeuristic e10 = t.e(i11);
        Layout.Alignment a11 = r.f62481a.a(i10);
        boolean z14 = (charSequence instanceof Spanned) && ((Spanned) charSequence).nextSpanTransition(-1, length, b2.a.class) < length;
        BoringLayout.Metrics a12 = eVar.a();
        double d10 = f10;
        int ceil = (int) Math.ceil(d10);
        if (a12 != null && eVar.b() <= f10 && !z14) {
            this.f62492i = true;
            a10 = z1.a.f62428a.a(charSequence, textPaint, ceil, a12, a11, z10, truncateAt, ceil);
            z13 = true;
            z12 = false;
        } else {
            this.f62492i = false;
            z12 = false;
            z13 = true;
            a10 = n.f62457a.a(charSequence, 0, charSequence.length(), textPaint, ceil, e10, a11, i12, truncateAt, (int) Math.ceil(d10), f11, f12, i15, z10, z11, i13, i14, iArr, iArr2);
        }
        this.f62488e = a10;
        int min = Math.min(a10.getLineCount(), i12);
        this.f62489f = min;
        this.f62487d = (min >= i12 && (a10.getEllipsisCount(min + (-1)) > 0 || a10.getLineEnd(min + (-1)) != charSequence.length())) ? z13 : z12;
        f13 = t.f(this);
        c10 = t.c(this);
        this.f62490g = Math.max(((Number) f13.c()).intValue(), ((Number) c10.c()).intValue());
        this.f62491h = Math.max(((Number) f13.d()).intValue(), ((Number) c10.d()).intValue());
        this.f62493j = wn.g.b(wn.i.NONE, new a());
    }

    public static /* synthetic */ float v(s sVar, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z10 = false;
        }
        return sVar.u(i10, z10);
    }

    public static /* synthetic */ float x(s sVar, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z10 = false;
        }
        return sVar.w(i10, z10);
    }

    public final boolean A() {
        return this.f62485b && !this.f62492i && Build.VERSION.SDK_INT >= 28;
    }

    public final boolean B(int i10) {
        return this.f62488e.isRtlCharAt(i10);
    }

    public final void C(Canvas canvas) {
        jo.p.h(canvas, "canvas");
        int i10 = this.f62490g;
        if (i10 != 0) {
            canvas.translate(0.0f, i10);
        }
        this.f62488e.draw(canvas);
        int i11 = this.f62490g;
        if (i11 != 0) {
            canvas.translate(0.0f, (-1) * i11);
        }
    }

    public final boolean a() {
        return this.f62487d;
    }

    public final int b() {
        int height;
        if (this.f62487d) {
            height = this.f62488e.getLineBottom(this.f62489f - 1);
        } else {
            height = this.f62488e.getHeight();
        }
        return height + this.f62490g + this.f62491h;
    }

    public final boolean c() {
        return this.f62484a;
    }

    public final Layout d() {
        return this.f62488e;
    }

    public final d e() {
        return (d) this.f62493j.getValue();
    }

    public final float f(int i10) {
        return this.f62490g + this.f62488e.getLineBaseline(i10);
    }

    public final float g(int i10) {
        return this.f62490g + this.f62488e.getLineBottom(i10) + (i10 == this.f62489f + (-1) ? this.f62491h : 0);
    }

    public final int h() {
        return this.f62489f;
    }

    public final int i(int i10) {
        return this.f62488e.getEllipsisCount(i10);
    }

    public final int j(int i10) {
        return this.f62488e.getEllipsisStart(i10);
    }

    public final int k(int i10) {
        if (this.f62488e.getEllipsisStart(i10) == 0) {
            return this.f62488e.getLineEnd(i10);
        }
        return this.f62488e.getText().length();
    }

    public final int l(int i10) {
        return this.f62488e.getLineForOffset(i10);
    }

    public final int m(int i10) {
        return this.f62488e.getLineForVertical(this.f62490g + i10);
    }

    public final float n(int i10) {
        return this.f62488e.getLineLeft(i10);
    }

    public final float o(int i10) {
        return this.f62488e.getLineRight(i10);
    }

    public final int p(int i10) {
        return this.f62488e.getLineStart(i10);
    }

    public final float q(int i10) {
        return this.f62488e.getLineTop(i10) + (i10 == 0 ? 0 : this.f62490g);
    }

    public final int r(int i10) {
        if (this.f62488e.getEllipsisStart(i10) == 0) {
            return this.f62488e.getLineVisibleEnd(i10);
        }
        return this.f62488e.getEllipsisStart(i10) + this.f62488e.getLineStart(i10);
    }

    public final int s(int i10, float f10) {
        return this.f62488e.getOffsetForHorizontal(i10, f10);
    }

    public final int t(int i10) {
        return this.f62488e.getParagraphDirection(i10);
    }

    public final float u(int i10, boolean z10) {
        return e().c(i10, true, z10);
    }

    public final float w(int i10, boolean z10) {
        return e().c(i10, false, z10);
    }

    public final void y(int i10, int i11, Path path) {
        jo.p.h(path, "dest");
        this.f62488e.getSelectionPath(i10, i11, path);
        if (this.f62490g == 0 || path.isEmpty()) {
            return;
        }
        path.offset(0.0f, this.f62490g);
    }

    public final CharSequence z() {
        CharSequence text = this.f62488e.getText();
        jo.p.g(text, "layout.text");
        return text;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ s(java.lang.CharSequence r22, float r23, android.text.TextPaint r24, int r25, android.text.TextUtils.TruncateAt r26, int r27, float r28, float r29, boolean r30, boolean r31, int r32, int r33, int r34, int r35, int[] r36, int[] r37, z1.e r38, int r39, jo.h r40) {
        /*
            r21 = this;
            r0 = r39
            r1 = r0 & 2
            r2 = 0
            if (r1 == 0) goto L9
            r5 = r2
            goto Lb
        L9:
            r5 = r23
        Lb:
            r1 = r0 & 8
            r3 = 0
            if (r1 == 0) goto L12
            r7 = r3
            goto L14
        L12:
            r7 = r25
        L14:
            r1 = r0 & 16
            r4 = 0
            if (r1 == 0) goto L1b
            r8 = r4
            goto L1d
        L1b:
            r8 = r26
        L1d:
            r1 = r0 & 32
            if (r1 == 0) goto L24
            r1 = 2
            r9 = r1
            goto L26
        L24:
            r9 = r27
        L26:
            r1 = r0 & 64
            if (r1 == 0) goto L2e
            r1 = 1065353216(0x3f800000, float:1.0)
            r10 = r1
            goto L30
        L2e:
            r10 = r28
        L30:
            r1 = r0 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L36
            r11 = r2
            goto L38
        L36:
            r11 = r29
        L38:
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L3e
            r12 = r3
            goto L40
        L3e:
            r12 = r30
        L40:
            r1 = r0 & 512(0x200, float:7.175E-43)
            if (r1 == 0) goto L47
            r1 = 1
            r13 = r1
            goto L49
        L47:
            r13 = r31
        L49:
            r1 = r0 & 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L52
            r1 = 2147483647(0x7fffffff, float:NaN)
            r14 = r1
            goto L54
        L52:
            r14 = r32
        L54:
            r1 = r0 & 2048(0x800, float:2.87E-42)
            if (r1 == 0) goto L5a
            r15 = r3
            goto L5c
        L5a:
            r15 = r33
        L5c:
            r1 = r0 & 4096(0x1000, float:5.74E-42)
            if (r1 == 0) goto L63
            r16 = r3
            goto L65
        L63:
            r16 = r34
        L65:
            r1 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r1 == 0) goto L6c
            r17 = r3
            goto L6e
        L6c:
            r17 = r35
        L6e:
            r1 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r1 == 0) goto L75
            r18 = r4
            goto L77
        L75:
            r18 = r36
        L77:
            r1 = 32768(0x8000, float:4.5918E-41)
            r1 = r1 & r0
            if (r1 == 0) goto L80
            r19 = r4
            goto L82
        L80:
            r19 = r37
        L82:
            r1 = 65536(0x10000, float:9.18355E-41)
            r0 = r0 & r1
            if (r0 == 0) goto L93
            z1.e r0 = new z1.e
            r1 = r22
            r2 = r24
            r0.<init>(r1, r2, r9)
            r20 = r0
            goto L99
        L93:
            r1 = r22
            r2 = r24
            r20 = r38
        L99:
            r3 = r21
            r4 = r22
            r6 = r24
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: z1.s.<init>(java.lang.CharSequence, float, android.text.TextPaint, int, android.text.TextUtils$TruncateAt, int, float, float, boolean, boolean, int, int, int, int, int[], int[], z1.e, int, jo.h):void");
    }
}
