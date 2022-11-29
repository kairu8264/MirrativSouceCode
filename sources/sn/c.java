package sn;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import java.security.MessageDigest;
import m7.e;

/* loaded from: classes4.dex */
public class c extends sn.a {

    /* renamed from: b  reason: collision with root package name */
    public final int f52766b;

    /* renamed from: c  reason: collision with root package name */
    public final int f52767c;

    /* renamed from: d  reason: collision with root package name */
    public final int f52768d;

    /* renamed from: e  reason: collision with root package name */
    public final b f52769e;

    /* loaded from: classes4.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f52770a;

        static {
            int[] iArr = new int[b.values().length];
            f52770a = iArr;
            try {
                iArr[b.ALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f52770a[b.TOP_LEFT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f52770a[b.TOP_RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f52770a[b.BOTTOM_LEFT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f52770a[b.BOTTOM_RIGHT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f52770a[b.TOP.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f52770a[b.BOTTOM.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f52770a[b.LEFT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f52770a[b.RIGHT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f52770a[b.OTHER_TOP_LEFT.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f52770a[b.OTHER_TOP_RIGHT.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f52770a[b.OTHER_BOTTOM_LEFT.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f52770a[b.OTHER_BOTTOM_RIGHT.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f52770a[b.DIAGONAL_FROM_TOP_LEFT.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f52770a[b.DIAGONAL_FROM_TOP_RIGHT.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
        }
    }

    /* loaded from: classes4.dex */
    public enum b {
        ALL,
        TOP_LEFT,
        TOP_RIGHT,
        BOTTOM_LEFT,
        BOTTOM_RIGHT,
        TOP,
        BOTTOM,
        LEFT,
        RIGHT,
        OTHER_TOP_LEFT,
        OTHER_TOP_RIGHT,
        OTHER_BOTTOM_LEFT,
        OTHER_BOTTOM_RIGHT,
        DIAGONAL_FROM_TOP_LEFT,
        DIAGONAL_FROM_TOP_RIGHT
    }

    public c(int i10, int i11) {
        this(i10, i11, b.ALL);
    }

    @Override // m7.e
    public void a(MessageDigest messageDigest) {
        messageDigest.update(("jp.wasabeef.glide.transformations.RoundedCornersTransformation.1" + this.f52766b + this.f52767c + this.f52768d + this.f52769e).getBytes(e.f40610a));
    }

    @Override // sn.a
    public Bitmap d(Context context, p7.e eVar, Bitmap bitmap, int i10, int i11) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Bitmap d10 = eVar.d(width, height, Bitmap.Config.ARGB_8888);
        d10.setHasAlpha(true);
        c(bitmap, d10);
        Canvas canvas = new Canvas(d10);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        paint.setShader(new BitmapShader(bitmap, tileMode, tileMode));
        p(canvas, paint, width, height);
        return d10;
    }

    public final void e(Canvas canvas, Paint paint, float f10, float f11) {
        int i10 = this.f52768d;
        int i11 = this.f52767c;
        RectF rectF = new RectF(i10, f11 - i11, i10 + i11, f11);
        int i12 = this.f52766b;
        canvas.drawRoundRect(rectF, i12, i12, paint);
        int i13 = this.f52768d;
        canvas.drawRect(new RectF(i13, i13, i13 + this.f52767c, f11 - this.f52766b), paint);
        int i14 = this.f52768d;
        canvas.drawRect(new RectF(this.f52766b + i14, i14, f10, f11), paint);
    }

    @Override // m7.e
    public boolean equals(Object obj) {
        if (obj instanceof c) {
            c cVar = (c) obj;
            if (cVar.f52766b == this.f52766b && cVar.f52767c == this.f52767c && cVar.f52768d == this.f52768d && cVar.f52769e == this.f52769e) {
                return true;
            }
        }
        return false;
    }

    public final void f(Canvas canvas, Paint paint, float f10, float f11) {
        int i10 = this.f52767c;
        RectF rectF = new RectF(f10 - i10, f11 - i10, f10, f11);
        int i11 = this.f52766b;
        canvas.drawRoundRect(rectF, i11, i11, paint);
        int i12 = this.f52768d;
        canvas.drawRect(new RectF(i12, i12, f10 - this.f52766b, f11), paint);
        int i13 = this.f52766b;
        canvas.drawRect(new RectF(f10 - i13, this.f52768d, f10, f11 - i13), paint);
    }

    public final void g(Canvas canvas, Paint paint, float f10, float f11) {
        RectF rectF = new RectF(this.f52768d, f11 - this.f52767c, f10, f11);
        int i10 = this.f52766b;
        canvas.drawRoundRect(rectF, i10, i10, paint);
        int i11 = this.f52768d;
        canvas.drawRect(new RectF(i11, i11, f10, f11 - this.f52766b), paint);
    }

    public final void h(Canvas canvas, Paint paint, float f10, float f11) {
        int i10 = this.f52768d;
        int i11 = this.f52767c;
        RectF rectF = new RectF(i10, i10, i10 + i11, i10 + i11);
        int i12 = this.f52766b;
        canvas.drawRoundRect(rectF, i12, i12, paint);
        int i13 = this.f52767c;
        RectF rectF2 = new RectF(f10 - i13, f11 - i13, f10, f11);
        int i14 = this.f52766b;
        canvas.drawRoundRect(rectF2, i14, i14, paint);
        int i15 = this.f52768d;
        int i16 = this.f52766b;
        canvas.drawRect(new RectF(i15, i15 + i16, f10 - i16, f11), paint);
        int i17 = this.f52768d;
        int i18 = this.f52766b;
        canvas.drawRect(new RectF(i17 + i18, i17, f10, f11 - i18), paint);
    }

    @Override // m7.e
    public int hashCode() {
        return 425235636 + (this.f52766b * 10000) + (this.f52767c * 1000) + (this.f52768d * 100) + (this.f52769e.ordinal() * 10);
    }

    public final void i(Canvas canvas, Paint paint, float f10, float f11) {
        int i10 = this.f52767c;
        int i11 = this.f52768d;
        RectF rectF = new RectF(f10 - i10, i11, f10, i11 + i10);
        int i12 = this.f52766b;
        canvas.drawRoundRect(rectF, i12, i12, paint);
        int i13 = this.f52768d;
        int i14 = this.f52767c;
        RectF rectF2 = new RectF(i13, f11 - i14, i13 + i14, f11);
        int i15 = this.f52766b;
        canvas.drawRoundRect(rectF2, i15, i15, paint);
        int i16 = this.f52768d;
        int i17 = this.f52766b;
        canvas.drawRect(new RectF(i16, i16, f10 - i17, f11 - i17), paint);
        int i18 = this.f52768d;
        int i19 = this.f52766b;
        canvas.drawRect(new RectF(i18 + i19, i18 + i19, f10, f11), paint);
    }

    public final void j(Canvas canvas, Paint paint, float f10, float f11) {
        int i10 = this.f52768d;
        RectF rectF = new RectF(i10, i10, i10 + this.f52767c, f11);
        int i11 = this.f52766b;
        canvas.drawRoundRect(rectF, i11, i11, paint);
        int i12 = this.f52768d;
        canvas.drawRect(new RectF(this.f52766b + i12, i12, f10, f11), paint);
    }

    public final void k(Canvas canvas, Paint paint, float f10, float f11) {
        int i10 = this.f52768d;
        RectF rectF = new RectF(i10, i10, f10, i10 + this.f52767c);
        int i11 = this.f52766b;
        canvas.drawRoundRect(rectF, i11, i11, paint);
        RectF rectF2 = new RectF(f10 - this.f52767c, this.f52768d, f10, f11);
        int i12 = this.f52766b;
        canvas.drawRoundRect(rectF2, i12, i12, paint);
        int i13 = this.f52768d;
        int i14 = this.f52766b;
        canvas.drawRect(new RectF(i13, i13 + i14, f10 - i14, f11), paint);
    }

    public final void l(Canvas canvas, Paint paint, float f10, float f11) {
        int i10 = this.f52768d;
        RectF rectF = new RectF(i10, i10, f10, i10 + this.f52767c);
        int i11 = this.f52766b;
        canvas.drawRoundRect(rectF, i11, i11, paint);
        int i12 = this.f52768d;
        RectF rectF2 = new RectF(i12, i12, i12 + this.f52767c, f11);
        int i13 = this.f52766b;
        canvas.drawRoundRect(rectF2, i13, i13, paint);
        int i14 = this.f52768d;
        int i15 = this.f52766b;
        canvas.drawRect(new RectF(i14 + i15, i14 + i15, f10, f11), paint);
    }

    public final void m(Canvas canvas, Paint paint, float f10, float f11) {
        RectF rectF = new RectF(this.f52768d, f11 - this.f52767c, f10, f11);
        int i10 = this.f52766b;
        canvas.drawRoundRect(rectF, i10, i10, paint);
        RectF rectF2 = new RectF(f10 - this.f52767c, this.f52768d, f10, f11);
        int i11 = this.f52766b;
        canvas.drawRoundRect(rectF2, i11, i11, paint);
        int i12 = this.f52768d;
        int i13 = this.f52766b;
        canvas.drawRect(new RectF(i12, i12, f10 - i13, f11 - i13), paint);
    }

    public final void n(Canvas canvas, Paint paint, float f10, float f11) {
        int i10 = this.f52768d;
        RectF rectF = new RectF(i10, i10, i10 + this.f52767c, f11);
        int i11 = this.f52766b;
        canvas.drawRoundRect(rectF, i11, i11, paint);
        RectF rectF2 = new RectF(this.f52768d, f11 - this.f52767c, f10, f11);
        int i12 = this.f52766b;
        canvas.drawRoundRect(rectF2, i12, i12, paint);
        int i13 = this.f52768d;
        int i14 = this.f52766b;
        canvas.drawRect(new RectF(i13 + i14, i13, f10, f11 - i14), paint);
    }

    public final void o(Canvas canvas, Paint paint, float f10, float f11) {
        RectF rectF = new RectF(f10 - this.f52767c, this.f52768d, f10, f11);
        int i10 = this.f52766b;
        canvas.drawRoundRect(rectF, i10, i10, paint);
        int i11 = this.f52768d;
        canvas.drawRect(new RectF(i11, i11, f10 - this.f52766b, f11), paint);
    }

    public final void p(Canvas canvas, Paint paint, float f10, float f11) {
        int i10 = this.f52768d;
        float f12 = f10 - i10;
        float f13 = f11 - i10;
        switch (a.f52770a[this.f52769e.ordinal()]) {
            case 1:
                int i11 = this.f52768d;
                RectF rectF = new RectF(i11, i11, f12, f13);
                int i12 = this.f52766b;
                canvas.drawRoundRect(rectF, i12, i12, paint);
                return;
            case 2:
                q(canvas, paint, f12, f13);
                return;
            case 3:
                r(canvas, paint, f12, f13);
                return;
            case 4:
                e(canvas, paint, f12, f13);
                return;
            case 5:
                f(canvas, paint, f12, f13);
                return;
            case 6:
                s(canvas, paint, f12, f13);
                return;
            case 7:
                g(canvas, paint, f12, f13);
                return;
            case 8:
                j(canvas, paint, f12, f13);
                return;
            case 9:
                o(canvas, paint, f12, f13);
                return;
            case 10:
                m(canvas, paint, f12, f13);
                return;
            case 11:
                n(canvas, paint, f12, f13);
                return;
            case 12:
                k(canvas, paint, f12, f13);
                return;
            case 13:
                l(canvas, paint, f12, f13);
                return;
            case 14:
                h(canvas, paint, f12, f13);
                return;
            case 15:
                i(canvas, paint, f12, f13);
                return;
            default:
                int i13 = this.f52768d;
                RectF rectF2 = new RectF(i13, i13, f12, f13);
                int i14 = this.f52766b;
                canvas.drawRoundRect(rectF2, i14, i14, paint);
                return;
        }
    }

    public final void q(Canvas canvas, Paint paint, float f10, float f11) {
        int i10 = this.f52768d;
        int i11 = this.f52767c;
        RectF rectF = new RectF(i10, i10, i10 + i11, i10 + i11);
        int i12 = this.f52766b;
        canvas.drawRoundRect(rectF, i12, i12, paint);
        int i13 = this.f52768d;
        int i14 = this.f52766b;
        canvas.drawRect(new RectF(i13, i13 + i14, i13 + i14, f11), paint);
        int i15 = this.f52768d;
        canvas.drawRect(new RectF(this.f52766b + i15, i15, f10, f11), paint);
    }

    public final void r(Canvas canvas, Paint paint, float f10, float f11) {
        int i10 = this.f52767c;
        int i11 = this.f52768d;
        RectF rectF = new RectF(f10 - i10, i11, f10, i11 + i10);
        int i12 = this.f52766b;
        canvas.drawRoundRect(rectF, i12, i12, paint);
        int i13 = this.f52768d;
        canvas.drawRect(new RectF(i13, i13, f10 - this.f52766b, f11), paint);
        int i14 = this.f52766b;
        canvas.drawRect(new RectF(f10 - i14, this.f52768d + i14, f10, f11), paint);
    }

    public final void s(Canvas canvas, Paint paint, float f10, float f11) {
        int i10 = this.f52768d;
        RectF rectF = new RectF(i10, i10, f10, i10 + this.f52767c);
        int i11 = this.f52766b;
        canvas.drawRoundRect(rectF, i11, i11, paint);
        int i12 = this.f52768d;
        canvas.drawRect(new RectF(i12, i12 + this.f52766b, f10, f11), paint);
    }

    public String toString() {
        return "RoundedTransformation(radius=" + this.f52766b + ", margin=" + this.f52768d + ", diameter=" + this.f52767c + ", cornerType=" + this.f52769e.name() + ")";
    }

    public c(int i10, int i11, b bVar) {
        this.f52766b = i10;
        this.f52767c = i10 * 2;
        this.f52768d = i11;
        this.f52769e = bVar;
    }
}
